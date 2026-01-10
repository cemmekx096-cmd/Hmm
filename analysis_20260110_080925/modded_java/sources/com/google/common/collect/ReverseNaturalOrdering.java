package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
final class ReverseNaturalOrdering extends Ordering<Comparable<?>> implements Serializable {
    static final ReverseNaturalOrdering INSTANCE = new ReverseNaturalOrdering();
    private static final long serialVersionUID = 0;

    public String toString() {
        return "Ordering.natural().reverse()";
    }

    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        Preconditions.checkNotNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public <S extends Comparable<?>> Ordering<S> reverse() {
        return Ordering.natural();
    }

    public <E extends Comparable<?>> E min(E e, E e2) {
        return (E) NaturalOrdering.INSTANCE.max(e, e2);
    }

    public <E extends Comparable<?>> E min(E e, E e2, E e3, E... eArr) {
        return (E) NaturalOrdering.INSTANCE.max(e, e2, e3, eArr);
    }

    /* renamed from: min, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E m202min(Iterator<E> it) {
        return (E) NaturalOrdering.INSTANCE.max(it);
    }

    /* renamed from: min, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E m201min(Iterable<E> iterable) {
        return (E) NaturalOrdering.INSTANCE.max(iterable);
    }

    public <E extends Comparable<?>> E max(E e, E e2) {
        return (E) NaturalOrdering.INSTANCE.min(e, e2);
    }

    public <E extends Comparable<?>> E max(E e, E e2, E e3, E... eArr) {
        return (E) NaturalOrdering.INSTANCE.min(e, e2, e3, eArr);
    }

    /* renamed from: max, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E m200max(Iterator<E> it) {
        return (E) NaturalOrdering.INSTANCE.min(it);
    }

    /* renamed from: max, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E m199max(Iterable<E> iterable) {
        return (E) NaturalOrdering.INSTANCE.min(iterable);
    }

    private Object readResolve() {
        return INSTANCE;
    }

    private ReverseNaturalOrdering() {
    }
}
