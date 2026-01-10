package com.google.common.collect;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
abstract class AbstractSortedSetMultimap<K, V> extends AbstractSetMultimap<K, V> implements SortedSetMultimap<K, V> {
    private static final long serialVersionUID = 430848587173315748L;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: createCollection, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract SortedSet<V> m123createCollection();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.SortedSetMultimap
    public /* bridge */ /* synthetic */ Collection get(@ParametricNullness Object obj) {
        return mo128get((AbstractSortedSetMultimap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.SortedSetMultimap
    /* renamed from: get, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Set mo127get(@ParametricNullness Object obj) {
        return mo128get((AbstractSortedSetMultimap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.SortedSetMultimap
    public /* bridge */ /* synthetic */ Collection replaceValues(@ParametricNullness Object obj, Iterable iterable) {
        return mo132replaceValues((AbstractSortedSetMultimap<K, V>) obj, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.SortedSetMultimap
    /* renamed from: replaceValues, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Set mo131replaceValues(@ParametricNullness Object obj, Iterable iterable) {
        return mo132replaceValues((AbstractSortedSetMultimap<K, V>) obj, iterable);
    }

    protected AbstractSortedSetMultimap(Map<K, Collection<V>> map) {
        super(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: createUnmodifiableEmptyCollection, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SortedSet<V> m125createUnmodifiableEmptyCollection() {
        return (SortedSet<V>) unmodifiableCollectionSubclass((Collection) m123createCollection());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <E> SortedSet<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        if (collection instanceof NavigableSet) {
            return Sets.unmodifiableNavigableSet((NavigableSet) collection);
        }
        return Collections.unmodifiableSortedSet((SortedSet) collection);
    }

    Collection<V> wrapCollection(@ParametricNullness K k, Collection<V> collection) {
        if (collection instanceof NavigableSet) {
            return new AbstractMapBasedMultimap.WrappedNavigableSet(this, k, (NavigableSet) collection, (AbstractMapBasedMultimap.WrappedCollection) null);
        }
        return new AbstractMapBasedMultimap.WrappedSortedSet(this, k, (SortedSet) collection, (AbstractMapBasedMultimap.WrappedCollection) null);
    }

    @Override // com.google.common.collect.SortedSetMultimap
    /* renamed from: get, reason: collision with other method in class */
    public SortedSet<V> mo128get(@ParametricNullness K k) {
        return (SortedSet) super.get(k);
    }

    @Override // com.google.common.collect.SortedSetMultimap
    /* renamed from: removeAll, reason: collision with other method in class and merged with bridge method [inline-methods] */
    public SortedSet<V> mo129removeAll(@CheckForNull Object obj) {
        return (SortedSet) super.removeAll(obj);
    }

    @Override // com.google.common.collect.SortedSetMultimap
    /* renamed from: replaceValues, reason: collision with other method in class */
    public SortedSet<V> mo132replaceValues(@ParametricNullness K k, Iterable<? extends V> iterable) {
        return (SortedSet) super.replaceValues(k, iterable);
    }

    @Override // com.google.common.collect.SortedSetMultimap
    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    public Collection<V> values() {
        return super.values();
    }
}
