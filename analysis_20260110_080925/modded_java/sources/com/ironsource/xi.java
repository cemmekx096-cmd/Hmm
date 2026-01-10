package com.ironsource;

import com.crashlytics.android.BuildConfig;
import com.google.firebase.messaging.Constants;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.qs;
import com.unity3d.ironsourceads.IronSourceAds;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0005\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eJ\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013J\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¨\u0006\u0017"}, d2 = {"Lcom/ironsource/xi;", BuildConfig.FLAVOR, "Ljava/lang/Runnable;", "runnable", BuildConfig.FLAVOR, "a", "callback", "b", BuildConfig.FLAVOR, "Lcom/unity3d/ironsourceads/IronSourceAds$AdFormat;", "adFormats", BuildConfig.FLAVOR, "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "(Ljava/util/List;)[Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "Lcom/ironsource/qr;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/ironsource/mediationsdk/logger/IronSourceError;", BuildConfig.FLAVOR, "duration", "Lcom/ironsource/qs$a;", "responseOrigin", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class xi {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IronSourceAds.AdFormat.values().length];
            try {
                iArr[IronSourceAds.AdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSourceAds.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSourceAds.AdFormat.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public final IronSourceError a(qr error) {
        Intrinsics.checkNotNullParameter(error, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        return (error.c() == 2070 || error.c() == 2110) ? tb.a.b() : (error.c() == 2080 || error.c() == 2100) ? tb.a.c() : error.c() == 2090 ? tb.a.a() : new IronSourceError(510, error.d());
    }

    public final void a(long duration, qs.a responseOrigin) throws JSONException {
        Intrinsics.checkNotNullParameter(responseOrigin, "responseOrigin");
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(true);
        try {
            mediationAdditionalData.put("isMultipleAdObjects", 1);
            mediationAdditionalData.put("duration", duration);
            mediationAdditionalData.put("ext1", responseOrigin.a());
        } catch (Exception e) {
            n9.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        er.i().a(new wb(516, mediationAdditionalData));
    }

    public final void a(qr error, long duration) throws JSONException {
        Intrinsics.checkNotNullParameter(error, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(true);
        try {
            mediationAdditionalData.put("errorCode", error.c());
            mediationAdditionalData.put(AdOperationMetric.REASON, error.d());
            mediationAdditionalData.put("duration", duration);
            mediationAdditionalData.put("isMultipleAdObjects", 1);
        } catch (Exception e) {
            n9.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        er.i().a(new wb(515, mediationAdditionalData));
    }

    public final void a(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        lg.a(lg.a, runnable, 0L, 2, (Object) null);
    }

    public final IronSource.AD_UNIT[] a(List<? extends IronSourceAds.AdFormat> adFormats) {
        IronSource.AD_UNIT ad_unit;
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends IronSourceAds.AdFormat> it = adFormats.iterator();
        while (it.hasNext()) {
            int i = a.a[it.next().ordinal()];
            if (i == 1) {
                ad_unit = IronSource.AD_UNIT.BANNER;
            } else if (i == 2) {
                ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
            } else if (i == 3) {
                ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
            }
            arrayList.add(ad_unit);
        }
        return (IronSource.AD_UNIT[]) arrayList.toArray(new IronSource.AD_UNIT[0]);
    }

    public final void b(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        lg.a.a(callback);
    }
}
