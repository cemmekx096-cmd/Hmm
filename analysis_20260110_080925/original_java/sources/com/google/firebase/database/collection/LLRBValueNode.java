package com.google.firebase.database.collection;

import com.google.firebase.database.collection.LLRBNode;
import java.util.Comparator;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public abstract class LLRBValueNode<K, V> implements LLRBNode<K, V> {
    private final K key;
    private LLRBNode<K, V> left;
    private final LLRBNode<K, V> right;
    private final V value;

    protected abstract LLRBValueNode<K, V> copy(K k, V v, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2);

    protected abstract LLRBNode.Color getColor();

    public boolean isEmpty() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ LLRBNode copy(Object obj, Object obj2, LLRBNode.Color color, LLRBNode lLRBNode, LLRBNode lLRBNode2) {
        return m222copy((LLRBValueNode<K, V>) obj, obj2, color, (LLRBNode<LLRBValueNode<K, V>, Object>) lLRBNode, (LLRBNode<LLRBValueNode<K, V>, Object>) lLRBNode2);
    }

    private static LLRBNode.Color oppositeColor(LLRBNode lLRBNode) {
        return lLRBNode.isRed() ? LLRBNode.Color.BLACK : LLRBNode.Color.RED;
    }

    LLRBValueNode(K k, V v, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2) {
        this.key = k;
        this.value = v;
        this.left = lLRBNode == null ? LLRBEmptyNode.getInstance() : lLRBNode;
        this.right = lLRBNode2 == null ? LLRBEmptyNode.getInstance() : lLRBNode2;
    }

    public LLRBNode<K, V> getLeft() {
        return this.left;
    }

    public LLRBNode<K, V> getRight() {
        return this.right;
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    /* renamed from: copy, reason: collision with other method in class */
    public LLRBValueNode<K, V> m222copy(K k, V v, LLRBNode.Color color, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2) {
        if (k == null) {
            k = this.key;
        }
        if (v == null) {
            v = this.value;
        }
        if (lLRBNode == null) {
            lLRBNode = this.left;
        }
        if (lLRBNode2 == null) {
            lLRBNode2 = this.right;
        }
        if (color == LLRBNode.Color.RED) {
            return new LLRBRedValueNode(k, v, lLRBNode, lLRBNode2);
        }
        return new LLRBBlackValueNode(k, v, lLRBNode, lLRBNode2);
    }

    public LLRBNode<K, V> insert(K k, V v, Comparator<K> comparator) {
        LLRBValueNode<K, V> lLRBValueNodeCopy;
        int iCompare = comparator.compare(k, this.key);
        if (iCompare < 0) {
            lLRBValueNodeCopy = copy(null, null, this.left.insert(k, v, comparator), null);
        } else if (iCompare == 0) {
            lLRBValueNodeCopy = copy(k, v, null, null);
        } else {
            lLRBValueNodeCopy = copy(null, null, null, this.right.insert(k, v, comparator));
        }
        return lLRBValueNodeCopy.fixUp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LLRBNode<K, V> remove(K k, Comparator<K> comparator) {
        LLRBValueNode<K, V> lLRBValueNodeCopy;
        if (comparator.compare(k, this.key) < 0) {
            LLRBValueNode<K, V> lLRBValueNodeMoveRedLeft = (this.left.isEmpty() || this.left.isRed() || ((LLRBValueNode) this.left).left.isRed()) ? this : moveRedLeft();
            lLRBValueNodeCopy = lLRBValueNodeMoveRedLeft.copy(null, null, lLRBValueNodeMoveRedLeft.left.remove(k, comparator), null);
        } else {
            LLRBValueNode lLRBValueNodeRotateRight = this.left.isRed() ? rotateRight() : this;
            boolean zIsEmpty = lLRBValueNodeRotateRight.right.isEmpty();
            LLRBValueNode lLRBValueNodeMoveRedRight = lLRBValueNodeRotateRight;
            if (!zIsEmpty) {
                boolean zIsRed = lLRBValueNodeRotateRight.right.isRed();
                lLRBValueNodeMoveRedRight = lLRBValueNodeRotateRight;
                if (!zIsRed) {
                    boolean zIsRed2 = ((LLRBValueNode) lLRBValueNodeRotateRight.right).left.isRed();
                    lLRBValueNodeMoveRedRight = lLRBValueNodeRotateRight;
                    if (!zIsRed2) {
                        lLRBValueNodeMoveRedRight = lLRBValueNodeRotateRight.moveRedRight();
                    }
                }
            }
            int iCompare = comparator.compare(k, lLRBValueNodeMoveRedRight.key);
            LLRBValueNode lLRBValueNodeCopy2 = lLRBValueNodeMoveRedRight;
            if (iCompare == 0) {
                if (lLRBValueNodeMoveRedRight.right.isEmpty()) {
                    return LLRBEmptyNode.getInstance();
                }
                LLRBNode min = lLRBValueNodeMoveRedRight.right.getMin();
                lLRBValueNodeCopy2 = lLRBValueNodeMoveRedRight.copy(min.getKey(), min.getValue(), null, ((LLRBValueNode) lLRBValueNodeMoveRedRight.right).removeMin());
            }
            lLRBValueNodeCopy = lLRBValueNodeCopy2.copy(null, null, null, lLRBValueNodeCopy2.right.remove(k, comparator));
        }
        return lLRBValueNodeCopy.fixUp();
    }

    public LLRBNode<K, V> getMin() {
        return this.left.isEmpty() ? this : this.left.getMin();
    }

    public LLRBNode<K, V> getMax() {
        return this.right.isEmpty() ? this : this.right.getMax();
    }

    public void inOrderTraversal(LLRBNode.NodeVisitor<K, V> nodeVisitor) {
        this.left.inOrderTraversal(nodeVisitor);
        nodeVisitor.visitEntry(this.key, this.value);
        this.right.inOrderTraversal(nodeVisitor);
    }

    public boolean shortCircuitingInOrderTraversal(LLRBNode.ShortCircuitingNodeVisitor<K, V> shortCircuitingNodeVisitor) {
        if (this.left.shortCircuitingInOrderTraversal(shortCircuitingNodeVisitor) && shortCircuitingNodeVisitor.shouldContinue(this.key, this.value)) {
            return this.right.shortCircuitingInOrderTraversal(shortCircuitingNodeVisitor);
        }
        return false;
    }

    public boolean shortCircuitingReverseOrderTraversal(LLRBNode.ShortCircuitingNodeVisitor<K, V> shortCircuitingNodeVisitor) {
        if (this.right.shortCircuitingReverseOrderTraversal(shortCircuitingNodeVisitor) && shortCircuitingNodeVisitor.shouldContinue(this.key, this.value)) {
            return this.left.shortCircuitingReverseOrderTraversal(shortCircuitingNodeVisitor);
        }
        return false;
    }

    void setLeft(LLRBNode<K, V> lLRBNode) {
        this.left = lLRBNode;
    }

    private LLRBNode<K, V> removeMin() {
        if (this.left.isEmpty()) {
            return LLRBEmptyNode.getInstance();
        }
        LLRBValueNode<K, V> lLRBValueNodeMoveRedLeft = (getLeft().isRed() || getLeft().getLeft().isRed()) ? this : moveRedLeft();
        return lLRBValueNodeMoveRedLeft.copy(null, null, ((LLRBValueNode) lLRBValueNodeMoveRedLeft.left).removeMin(), null).fixUp();
    }

    private LLRBValueNode<K, V> moveRedLeft() {
        LLRBValueNode<K, V> lLRBValueNodeColorFlip = colorFlip();
        return lLRBValueNodeColorFlip.getRight().getLeft().isRed() ? lLRBValueNodeColorFlip.copy(null, null, null, ((LLRBValueNode) lLRBValueNodeColorFlip.getRight()).rotateRight()).rotateLeft().colorFlip() : lLRBValueNodeColorFlip;
    }

    private LLRBValueNode<K, V> moveRedRight() {
        LLRBValueNode<K, V> lLRBValueNodeColorFlip = colorFlip();
        return lLRBValueNodeColorFlip.getLeft().getLeft().isRed() ? lLRBValueNodeColorFlip.rotateRight().colorFlip() : lLRBValueNodeColorFlip;
    }

    private LLRBValueNode<K, V> fixUp() {
        LLRBValueNode<K, V> lLRBValueNodeRotateLeft = (!this.right.isRed() || this.left.isRed()) ? this : rotateLeft();
        if (lLRBValueNodeRotateLeft.left.isRed() && ((LLRBValueNode) lLRBValueNodeRotateLeft.left).left.isRed()) {
            lLRBValueNodeRotateLeft = lLRBValueNodeRotateLeft.rotateRight();
        }
        return (lLRBValueNodeRotateLeft.left.isRed() && lLRBValueNodeRotateLeft.right.isRed()) ? lLRBValueNodeRotateLeft.colorFlip() : lLRBValueNodeRotateLeft;
    }

    private LLRBValueNode<K, V> rotateLeft() {
        return (LLRBValueNode) this.right.copy((Object) null, (Object) null, getColor(), m222copy((LLRBValueNode<K, V>) null, (K) null, LLRBNode.Color.RED, (LLRBNode<LLRBValueNode<K, V>, K>) null, (LLRBNode<LLRBValueNode<K, V>, K>) ((LLRBValueNode) this.right).left), (LLRBNode) null);
    }

    private LLRBValueNode<K, V> rotateRight() {
        return (LLRBValueNode) this.left.copy((Object) null, (Object) null, getColor(), (LLRBNode) null, m222copy((LLRBValueNode<K, V>) null, (K) null, LLRBNode.Color.RED, (LLRBNode<LLRBValueNode<K, V>, K>) ((LLRBValueNode) this.left).right, (LLRBNode<LLRBValueNode<K, V>, K>) null));
    }

    private LLRBValueNode<K, V> colorFlip() {
        LLRBNode<K, V> lLRBNode = this.left;
        LLRBNode<K, V> lLRBNodeCopy = lLRBNode.copy((Object) null, (Object) null, oppositeColor(lLRBNode), (LLRBNode) null, (LLRBNode) null);
        LLRBNode<K, V> lLRBNode2 = this.right;
        return m222copy((LLRBValueNode<K, V>) null, (K) null, oppositeColor(this), (LLRBNode<LLRBValueNode<K, V>, K>) lLRBNodeCopy, (LLRBNode<LLRBValueNode<K, V>, K>) lLRBNode2.copy((Object) null, (Object) null, oppositeColor(lLRBNode2), (LLRBNode) null, (LLRBNode) null));
    }
}
