package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public abstract class ForwardingMultiset<E> extends ForwardingCollection<E> implements Multiset<E> {
    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: delegate, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract Multiset<E> m147delegate();

    protected ForwardingMultiset() {
    }

    public int count(@CheckForNull Object obj) {
        return m147delegate().count(obj);
    }

    public int add(@ParametricNullness E e, int i) {
        return m147delegate().add(e, i);
    }

    public int remove(@CheckForNull Object obj, int i) {
        return m147delegate().remove(obj, i);
    }

    public Set<E> elementSet() {
        return m147delegate().elementSet();
    }

    public Set<Multiset.Entry<E>> entrySet() {
        return m147delegate().entrySet();
    }

    public boolean equals(@CheckForNull Object obj) {
        return obj == this || m147delegate().equals(obj);
    }

    public int hashCode() {
        return m147delegate().hashCode();
    }

    public int setCount(@ParametricNullness E e, int i) {
        return m147delegate().setCount(e, i);
    }

    public boolean setCount(@ParametricNullness E e, int i, int i2) {
        return m147delegate().setCount(e, i, i2);
    }

    protected boolean standardContains(@CheckForNull Object obj) {
        return count(obj) > 0;
    }

    protected void standardClear() {
        Iterators.clear(entrySet().iterator());
    }

    protected int standardCount(@CheckForNull Object obj) {
        for (Multiset.Entry<E> entry : entrySet()) {
            if (Objects.equal(entry.getElement(), obj)) {
                return entry.getCount();
            }
        }
        return 0;
    }

    protected boolean standardAdd(@ParametricNullness E e) {
        add(e, 1);
        return true;
    }

    protected boolean standardAddAll(Collection<? extends E> collection) {
        return Multisets.addAllImpl(this, collection);
    }

    protected boolean standardRemove(@CheckForNull Object obj) {
        return remove(obj, 1) > 0;
    }

    protected boolean standardRemoveAll(Collection<?> collection) {
        return Multisets.removeAllImpl(this, collection);
    }

    protected boolean standardRetainAll(Collection<?> collection) {
        return Multisets.retainAllImpl(this, collection);
    }

    protected int standardSetCount(@ParametricNullness E e, int i) {
        return Multisets.setCountImpl(this, e, i);
    }

    protected boolean standardSetCount(@ParametricNullness E e, int i, int i2) {
        return Multisets.setCountImpl(this, e, i, i2);
    }

    protected class StandardElementSet extends Multisets.ElementSet<E> {
        public StandardElementSet() {
        }

        Multiset<E> multiset() {
            return ForwardingMultiset.this;
        }

        public Iterator<E> iterator() {
            return Multisets.elementIterator(multiset().entrySet().iterator());
        }
    }

    protected Iterator<E> standardIterator() {
        return Multisets.iteratorImpl(this);
    }

    protected int standardSize() {
        return Multisets.linearTimeSizeImpl(this);
    }

    protected boolean standardEquals(@CheckForNull Object obj) {
        return Multisets.equalsImpl(this, obj);
    }

    protected int standardHashCode() {
        return entrySet().hashCode();
    }

    protected String standardToString() {
        return entrySet().toString();
    }
}
