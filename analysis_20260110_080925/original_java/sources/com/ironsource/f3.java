package com.ironsource;

import com.crashlytics.android.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\u000e\u0010\u0006\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ironsource/f3;", "Lcom/ironsource/lt;", "Lorg/json/JSONArray;", BuildConfig.FLAVOR, "Lcom/ironsource/e3;", "b", "a", "event", BuildConfig.FLAVOR, "Lcom/ironsource/kt;", "mode", BuildConfig.FLAVOR, "Ljava/util/List;", "records", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class f3 implements lt<JSONArray> {

    /* renamed from: a, reason: from kotlin metadata */
    private final List<e3> records = new ArrayList();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[kt.values().length];
            try {
                iArr[kt.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kt.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    private final List<e3> a() {
        List<e3> list = this.records;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            e3 e3Var = (e3) next;
            if ((e3Var.e() == ht.b || e3Var.e() == ht.f) ? false : true) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((e3) it2.next()).a());
        }
        Set set = CollectionsKt.toSet(arrayList2);
        List<e3> list2 = this.records;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list2) {
            e3 e3Var2 = (e3) obj;
            if (e3Var2.e() == ht.b && !set.contains(e3Var2.a())) {
                arrayList3.add(obj);
            }
        }
        return arrayList3;
    }

    private final List<e3> b() {
        List<e3> list = this.records;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((e3) obj).e() != ht.f) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void a(e3 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.records.add(event);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONArray a(kt mode) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(mode, "mode");
        int i = a.a[mode.ordinal()];
        if (i == 1) {
            List<e3> listB = b();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listB, 10));
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(((e3) it.next()).d());
            }
            return new JSONArray((Collection) arrayList);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        List<e3> listA = a();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listA, 10));
        Iterator<T> it2 = listA.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((e3) it2.next()).c());
        }
        return new JSONArray((Collection) arrayList2);
    }
}
