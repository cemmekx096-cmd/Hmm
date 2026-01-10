package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public interface SortedSetMultimap<K, V> extends SetMultimap<K, V> {
    Map<K, Collection<V>> asMap();

    /* renamed from: get */
    SortedSet<V> mo128get(@ParametricNullness K k);

    @Override // 
    SortedSet<V> mo129removeAll(@CheckForNull Object obj);

    /* renamed from: replaceValues */
    SortedSet<V> mo132replaceValues(@ParametricNullness K k, Iterable<? extends V> iterable);

    @CheckForNull
    Comparator<? super V> valueComparator();

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default Collection get(@ParametricNullness Object obj) {
        return mo128get((SortedSetMultimap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: get */
    /* bridge */ /* synthetic */ default Set mo127get(@ParametricNullness Object obj) {
        return mo128get((SortedSetMultimap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default Collection replaceValues(@ParametricNullness Object obj, Iterable iterable) {
        return mo132replaceValues((SortedSetMultimap<K, V>) obj, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: replaceValues */
    /* bridge */ /* synthetic */ default Set mo131replaceValues(@ParametricNullness Object obj, Iterable iterable) {
        return mo132replaceValues((SortedSetMultimap<K, V>) obj, iterable);
    }
}
