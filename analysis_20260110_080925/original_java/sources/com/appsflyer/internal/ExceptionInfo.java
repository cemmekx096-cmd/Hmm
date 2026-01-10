package com.appsflyer.internal;

import android.util.Base64;
import com.crashlytics.android.BuildConfig;
import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00068\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018"}, d2 = {"Lcom/appsflyer/internal/AFc1cSDK;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "p0", "p1", "p2", BuildConfig.FLAVOR, "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lorg/json/JSONObject;", "getRevenue", "()Lorg/json/JSONObject;", "AFAdRevenueData", "()Ljava/lang/String;", "toString", "getMediationNetwork", "I", "getMonetizationNetwork", "Ljava/lang/String;", "getCurrencyIso4217Code", "AFa1ySDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: com.appsflyer.internal.AFc1cSDK, reason: from toString */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final /* data */ class ExceptionInfo {

    /* renamed from: AFa1ySDK, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata and from toString */
    public String stackTrace;

    /* renamed from: getMediationNetwork, reason: from kotlin metadata and from toString */
    int counter;

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata and from toString */
    final String hashName;

    /* renamed from: getRevenue, reason: from kotlin metadata and from toString */
    public String label;

    public ExceptionInfo(String str, String str2, String str3, int i) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
        this.label = str;
        this.hashName = str2;
        this.stackTrace = str3;
        this.counter = i;
    }

    public /* synthetic */ ExceptionInfo(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i2 & 8) != 0 ? 1 : i);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\r\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000f"}, d2 = {"Lcom/appsflyer/internal/AFc1cSDK$AFa1ySDK;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "p0", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "p1", BuildConfig.FLAVOR, "getMediationNetwork", "(Ljava/lang/Integer;[Ljava/lang/String;)Z", "Lcom/appsflyer/internal/AFc1cSDK;", "getRevenue", "(Ljava/lang/String;)Lcom/appsflyer/internal/AFc1cSDK;", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFc1cSDK$AFa1ySDK, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static ExceptionInfo getRevenue(String p0) {
            Intrinsics.checkNotNullParameter(p0, BuildConfig.FLAVOR);
            List<String> listSplit$default = StringsKt.split$default(p0, new String[]{"\n"}, false, 0, 6, (Object) null);
            if (listSplit$default.size() != 4) {
                return null;
            }
            String revenue = null;
            String revenue2 = null;
            String revenue3 = null;
            Integer numValueOf = null;
            for (String str : listSplit$default) {
                if (StringsKt.startsWith$default(str, "label=", false, 2, (Object) null)) {
                    revenue = getRevenue(str, "label=");
                } else if (StringsKt.startsWith$default(str, "hashName=", false, 2, (Object) null)) {
                    revenue2 = getRevenue(str, "hashName=");
                } else if (StringsKt.startsWith$default(str, "stackTrace=", false, 2, (Object) null)) {
                    revenue3 = getRevenue(str, "stackTrace=");
                } else {
                    if (!StringsKt.startsWith$default(str, "c=", false, 2, (Object) null)) {
                        break;
                    }
                    String strSubstring = str.substring(2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, BuildConfig.FLAVOR);
                    numValueOf = Integer.valueOf(Integer.parseInt(StringsKt.trim(strSubstring).toString()));
                }
            }
            if (getMediationNetwork(numValueOf, revenue, revenue2, revenue3)) {
                return null;
            }
            Intrinsics.checkNotNull(revenue);
            Intrinsics.checkNotNull(revenue2);
            Intrinsics.checkNotNull(revenue3);
            Intrinsics.checkNotNull(numValueOf);
            return new ExceptionInfo(revenue, revenue2, revenue3, numValueOf.intValue());
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static boolean getMediationNetwork(java.lang.Integer r4, java.lang.String... r5) {
            /*
                r0 = 1
                r1 = 0
                if (r4 != 0) goto L6
                r4 = r0
                goto L7
            L6:
                r4 = r1
            L7:
                int r2 = r5.length
                r2 = r1
            L9:
                r3 = 3
                if (r2 >= r3) goto L27
                r3 = r5[r2]
                if (r4 != 0) goto L23
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                if (r3 == 0) goto L1d
                int r4 = r3.length()
                if (r4 != 0) goto L1b
                goto L1d
            L1b:
                r4 = r1
                goto L1e
            L1d:
                r4 = r0
            L1e:
                if (r4 == 0) goto L21
                goto L23
            L21:
                r4 = r1
                goto L24
            L23:
                r4 = r0
            L24:
                int r2 = r2 + 1
                goto L9
            L27:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.ExceptionInfo.Companion.getMediationNetwork(java.lang.Integer, java.lang.String[]):boolean");
        }

        private static String getRevenue(String str, String str2) {
            String strSubstring = str.substring(str2.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, BuildConfig.FLAVOR);
            String string = StringsKt.trim(strSubstring).toString();
            Intrinsics.checkNotNullParameter(string, BuildConfig.FLAVOR);
            byte[] bytes = string.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(bytes, BuildConfig.FLAVOR);
            byte[] bArrDecode = Base64.decode(bytes, 2);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, BuildConfig.FLAVOR);
            return new String(bArrDecode, Charsets.UTF_8);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String AFAdRevenueData() {
        String str = this.label;
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, BuildConfig.FLAVOR);
        String strEncodeToString = Base64.encodeToString(bytes, 2);
        String str2 = this.hashName;
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        byte[] bytes2 = str2.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes2, BuildConfig.FLAVOR);
        String strEncodeToString2 = Base64.encodeToString(bytes2, 2);
        String str3 = this.stackTrace;
        Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
        byte[] bytes3 = str3.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes3, BuildConfig.FLAVOR);
        return "label=" + strEncodeToString + "\nhashName=" + strEncodeToString2 + "\nstackTrace=" + Base64.encodeToString(bytes3, 2) + "\nc=" + this.counter;
    }

    public final JSONObject getRevenue() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.ScionAnalytics.PARAM_LABEL, this.label);
        jSONObject.put("hash_name", this.hashName);
        jSONObject.put("st", this.stackTrace);
        jSONObject.put("c", String.valueOf(this.counter));
        return jSONObject;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ExceptionInfo)) {
            return false;
        }
        ExceptionInfo exceptionInfo = (ExceptionInfo) p0;
        return Intrinsics.areEqual(this.label, exceptionInfo.label) && Intrinsics.areEqual(this.hashName, exceptionInfo.hashName) && Intrinsics.areEqual(this.stackTrace, exceptionInfo.stackTrace) && this.counter == exceptionInfo.counter;
    }

    public final int hashCode() {
        return (((((this.label.hashCode() * 31) + this.hashName.hashCode()) * 31) + this.stackTrace.hashCode()) * 31) + Integer.hashCode(this.counter);
    }

    public final String toString() {
        return "ExceptionInfo(label=" + this.label + ", hashName=" + this.hashName + ", stackTrace=" + this.stackTrace + ", counter=" + this.counter + ")";
    }
}
