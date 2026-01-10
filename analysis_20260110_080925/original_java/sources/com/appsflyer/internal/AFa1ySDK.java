package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFe1lSDK.AnonymousClass5;
import com.crashlytics.android.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class AFa1ySDK implements Runnable {
    private final String AFAdRevenueData;
    private final String areAllFieldsValid;
    private final Map<String, String> component1;
    private final String component3;
    final String getCurrencyIso4217Code;
    final String getMediationNetwork;
    private final WeakReference<Context> getMonetizationNetwork;
    final String getRevenue;

    AFa1ySDK(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.getMonetizationNetwork = new WeakReference<>(context);
        this.AFAdRevenueData = str;
        this.component3 = str2;
        this.getMediationNetwork = str4;
        this.getCurrencyIso4217Code = str5;
        this.getRevenue = str6;
        this.component1 = map;
        this.areAllFieldsValid = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.AFAdRevenueData;
        if (str == null || str.length() == 0 || AppsFlyerLib.getInstance().isStopped()) {
            return;
        }
        try {
            Context context = this.getMonetizationNetwork.get();
            if (context == null) {
                return;
            }
            HashMap map = new HashMap();
            map.put("public-key", this.component3);
            map.put("sig-data", this.getMediationNetwork);
            map.put("signature", this.areAllFieldsValid);
            HashMap map2 = new HashMap(map);
            Map<String, String> map3 = this.component1;
            String strAFAdRevenueData = ((AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).AFAdRevenueData().component2().AFAdRevenueData("referrer", BuildConfig.FLAVOR);
            AFi1zSDK aFi1zSDK = new AFi1zSDK();
            ((AFh1rSDK) aFi1zSDK).component3 = strAFAdRevenueData;
            AFa1tSDK aFa1tSDK = (AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis());
            Map mediationNetwork = aFa1tSDK.getMediationNetwork(aFi1zSDK);
            mediationNetwork.put("price", this.getCurrencyIso4217Code);
            mediationNetwork.put("currency", this.getRevenue);
            mediationNetwork.put("receipt_data", map2);
            if (map3 != null) {
                mediationNetwork.put("extra_prms", map3);
            }
            mediationNetwork.putAll(aFa1tSDK.AFAdRevenueData().registerClient().getCurrencyIso4217Code());
            aFi1zSDK.getMediationNetwork(mediationNetwork);
            getRevenue(context, aFi1zSDK);
            map.put("dev_key", this.AFAdRevenueData);
            map.put("app_id", context.getPackageName());
            map.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
            AFh1oSDK aFh1oSDK = ((AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).AFAdRevenueData().getRevenue().getCurrencyIso4217Code.component3;
            AFb1mSDK aFb1mSDK = aFh1oSDK != null ? new AFb1mSDK(aFh1oSDK.AFAdRevenueData, aFh1oSDK.getRevenue) : null;
            String str2 = aFb1mSDK != null ? aFb1mSDK.getMonetizationNetwork : null;
            if (str2 != null) {
                map.put("advertiserId", str2);
            }
            AFh1gSDK mediationNetwork2 = new AFh1gSDK().getMediationNetwork(map);
            final AFf1rSDK revenue = getRevenue(context, mediationNetwork2);
            ((AFh1rSDK) mediationNetwork2).getCurrencyIso4217Code = new AppsFlyerRequestListener() { // from class: com.appsflyer.internal.AFa1ySDK.5
                public final void onSuccess() {
                    try {
                        JSONObject jSONObject = new JSONObject((String) ((AFe1dSDK) revenue).component1.getBody());
                        AFLogger.afInfoLog("Validate response ok: ".concat(String.valueOf(jSONObject)));
                        AFa1ySDK.getMediationNetwork(jSONObject.optBoolean("result"), AFa1ySDK.this.getMediationNetwork, AFa1ySDK.this.getCurrencyIso4217Code, AFa1ySDK.this.getRevenue, jSONObject.toString());
                    } catch (Exception e) {
                        AFLogger.afErrorLog("Failed Validate request: ".concat(String.valueOf(e)), e);
                        AFa1ySDK.getMediationNetwork(false, AFa1ySDK.this.getMediationNetwork, AFa1ySDK.this.getCurrencyIso4217Code, AFa1ySDK.this.getRevenue, e.getMessage());
                    }
                }

                public final void onError(int i, String str3) {
                    AFd1aSDK aFd1aSDK;
                    if (i == 50 && (aFd1aSDK = ((AFe1dSDK) revenue).component1) != null) {
                        str3 = aFd1aSDK.toString();
                    }
                    AFa1ySDK.getMediationNetwork(false, AFa1ySDK.this.getMediationNetwork, AFa1ySDK.this.getCurrencyIso4217Code, AFa1ySDK.this.getRevenue, str3);
                }
            };
        } catch (Throwable th) {
            if (AFa1tSDK.AFAdRevenueData != null) {
                AFLogger.afErrorLog("Failed Validate request + ex", th);
                getMediationNetwork(false, this.getMediationNetwork, this.getCurrencyIso4217Code, this.getRevenue, th.getMessage());
            }
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }

    private static AFf1rSDK getRevenue(Context context, AFh1hSDK aFh1hSDK) {
        ((AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).getMediationNetwork(context);
        AFc1dSDK aFc1dSDKAFAdRevenueData = ((AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).AFAdRevenueData();
        aFh1hSDK.AFAdRevenueData(aFc1dSDKAFAdRevenueData.getRevenue().getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0));
        AFf1rSDK aFf1rSDK = new AFf1rSDK(aFh1hSDK, aFc1dSDKAFAdRevenueData);
        AFe1lSDK aFe1lSDKCopydefault = aFc1dSDKAFAdRevenueData.copydefault();
        aFe1lSDKCopydefault.getRevenue.execute(aFe1lSDKCopydefault.new AnonymousClass5(aFf1rSDK));
        return aFf1rSDK;
    }

    static void getMediationNetwork(boolean z, String str, String str2, String str3, String str4) {
        if (AFa1tSDK.AFAdRevenueData != null) {
            AFLogger.afDebugLog(new StringBuilder("Validate callback parameters: ").append(str).append(" ").append(str2).append(" ").append(str3).toString());
            if (z) {
                AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf(str4)));
                AFa1tSDK.AFAdRevenueData.onValidateInApp();
                return;
            }
            AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFa1tSDK.AFAdRevenueData;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }
}
