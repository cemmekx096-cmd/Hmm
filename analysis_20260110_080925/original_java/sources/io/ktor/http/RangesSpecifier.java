package io.ktor.http;

import com.crashlytics.android.BuildConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.LongRange;
import kotlin.ranges.RangesKt;

/* compiled from: RangesSpecifier.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\bHÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\b2\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u001c\u0010\u0016\u001a\u00020\u00122\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u0018J\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00052\u0006\u0010\u001b\u001a\u00020\u001cJ\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00052\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u0015J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001f\u001a\u00020\bH\u0016J\u001f\u0010 \u001a\b\u0012\u0004\u0012\u0002H!0\u0005\"\u0004\b\u0000\u0010!*\u0004\u0018\u0001H!H\u0002¢\u0006\u0002\u0010\"R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006#"}, d2 = {"Lio/ktor/http/RangesSpecifier;", BuildConfig.FLAVOR, "unit", "Lio/ktor/http/RangeUnits;", "ranges", BuildConfig.FLAVOR, "Lio/ktor/http/ContentRange;", "(Lio/ktor/http/RangeUnits;Ljava/util/List;)V", BuildConfig.FLAVOR, "(Ljava/lang/String;Ljava/util/List;)V", "getRanges", "()Ljava/util/List;", "getUnit", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "isValid", "rangeUnitPredicate", "Lkotlin/Function1;", "merge", "Lkotlin/ranges/LongRange;", "length", BuildConfig.FLAVOR, "maxRangeCount", "mergeToSingle", "toString", "toList", "T", "(Ljava/lang/Object;)Ljava/util/List;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final /* data */ class RangesSpecifier {
    private final List<ContentRange> ranges;
    private final String unit;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RangesSpecifier copy$default(RangesSpecifier rangesSpecifier, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rangesSpecifier.unit;
        }
        if ((i & 2) != 0) {
            list = rangesSpecifier.ranges;
        }
        return rangesSpecifier.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    public final List<ContentRange> component2() {
        return this.ranges;
    }

    public final RangesSpecifier copy(String unit, List<? extends ContentRange> ranges) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(ranges, "ranges");
        return new RangesSpecifier(unit, ranges);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RangesSpecifier)) {
            return false;
        }
        RangesSpecifier rangesSpecifier = (RangesSpecifier) other;
        return Intrinsics.areEqual(this.unit, rangesSpecifier.unit) && Intrinsics.areEqual(this.ranges, rangesSpecifier.ranges);
    }

    public int hashCode() {
        return (this.unit.hashCode() * 31) + this.ranges.hashCode();
    }

    public RangesSpecifier(String str, List<? extends ContentRange> list) {
        Intrinsics.checkNotNullParameter(str, "unit");
        Intrinsics.checkNotNullParameter(list, "ranges");
        this.unit = str;
        this.ranges = list;
        if (!(!list.isEmpty())) {
            throw new IllegalArgumentException("It should be at least one range".toString());
        }
    }

    public /* synthetic */ RangesSpecifier(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? RangeUnits.Bytes.getUnitToken() : str, (List<? extends ContentRange>) list);
    }

    public final List<ContentRange> getRanges() {
        return this.ranges;
    }

    public final String getUnit() {
        return this.unit;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RangesSpecifier(RangeUnits rangeUnits, List<? extends ContentRange> list) {
        this(rangeUnits.getUnitToken(), list);
        Intrinsics.checkNotNullParameter(rangeUnits, "unit");
        Intrinsics.checkNotNullParameter(list, "ranges");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean isValid$default(RangesSpecifier rangesSpecifier, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<String, Boolean>() { // from class: io.ktor.http.RangesSpecifier.isValid.1
                public final Boolean invoke(String str) {
                    Intrinsics.checkNotNullParameter(str, "it");
                    return Boolean.valueOf(Intrinsics.areEqual(str, RangeUnits.Bytes.getUnitToken()));
                }
            };
        }
        return rangesSpecifier.isValid(function1);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isValid(kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> r9) throws kotlin.NoWhenBranchMatchedException {
        /*
            r8 = this;
            java.lang.String r0 = "rangeUnitPredicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = r8.unit
            java.lang.Object r9 = r9.invoke(r0)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r0 = 0
            r1 = 1
            if (r9 == 0) goto L83
            java.util.List<io.ktor.http.ContentRange> r9 = r8.ranges
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            boolean r2 = r9 instanceof java.util.Collection
            if (r2 == 0) goto L28
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L28
        L26:
            r9 = r1
            goto L80
        L28:
            java.util.Iterator r9 = r9.iterator()
        L2c:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r9.next()
            io.ktor.http.ContentRange r2 = (io.ktor.http.ContentRange) r2
            boolean r3 = r2 instanceof io.ktor.http.ContentRange.Bounded
            r4 = 0
            if (r3 == 0) goto L56
            io.ktor.http.ContentRange$Bounded r2 = (io.ktor.http.ContentRange.Bounded) r2
            long r6 = r2.getFrom()
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 < 0) goto L54
            long r3 = r2.getTo()
            long r5 = r2.getFrom()
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 >= 0) goto L65
        L54:
            r2 = r1
            goto L76
        L56:
            boolean r3 = r2 instanceof io.ktor.http.ContentRange.TailFrom
            if (r3 == 0) goto L67
            io.ktor.http.ContentRange$TailFrom r2 = (io.ktor.http.ContentRange.TailFrom) r2
            long r2 = r2.getFrom()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L65
            goto L54
        L65:
            r2 = r0
            goto L76
        L67:
            boolean r3 = r2 instanceof io.ktor.http.ContentRange.Suffix
            if (r3 == 0) goto L7a
            io.ktor.http.ContentRange$Suffix r2 = (io.ktor.http.ContentRange.Suffix) r2
            long r2 = r2.getLastCount()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L65
            goto L54
        L76:
            if (r2 == 0) goto L2c
            r9 = r0
            goto L80
        L7a:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L80:
            if (r9 == 0) goto L83
            r0 = r1
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.RangesSpecifier.isValid(kotlin.jvm.functions.Function1):boolean");
    }

    public static /* synthetic */ List merge$default(RangesSpecifier rangesSpecifier, long j, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 50;
        }
        return rangesSpecifier.merge(j, i);
    }

    public final List<LongRange> merge(long length, int maxRangeCount) {
        if (this.ranges.size() > maxRangeCount) {
            return toList(mergeToSingle(length));
        }
        return merge(length);
    }

    public final List<LongRange> merge(long length) {
        return RangesKt.mergeRangesKeepOrder(RangesKt.toLongRanges(this.ranges, length));
    }

    public final LongRange mergeToSingle(long length) {
        Object next;
        List longRanges = RangesKt.toLongRanges(this.ranges, length);
        Object next2 = null;
        if (longRanges.isEmpty()) {
            return null;
        }
        List list = longRanges;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                long jLongValue = ((LongRange) next).getStart().longValue();
                do {
                    Object next3 = it.next();
                    long jLongValue2 = ((LongRange) next3).getStart().longValue();
                    if (jLongValue > jLongValue2) {
                        next = next3;
                        jLongValue = jLongValue2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Intrinsics.checkNotNull(next);
        long jLongValue3 = ((LongRange) next).getStart().longValue();
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                long jLongValue4 = ((LongRange) next2).getEndInclusive().longValue();
                do {
                    Object next4 = it2.next();
                    long jLongValue5 = ((LongRange) next4).getEndInclusive().longValue();
                    if (jLongValue4 < jLongValue5) {
                        next2 = next4;
                        jLongValue4 = jLongValue5;
                    }
                } while (it2.hasNext());
            }
        }
        Intrinsics.checkNotNull(next2);
        return new LongRange(jLongValue3, RangesKt.coerceAtMost(((LongRange) next2).getEndInclusive().longValue(), length - 1));
    }

    public String toString() {
        return CollectionsKt.joinToString$default(this.ranges, ",", this.unit + '=', (CharSequence) null, 0, (CharSequence) null, (Function1) null, 60, (Object) null);
    }

    private final <T> List<T> toList(T t) {
        return t == null ? CollectionsKt.emptyList() : CollectionsKt.listOf(t);
    }
}
