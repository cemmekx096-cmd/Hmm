package com.ironsource;

import android.content.Context;
import com.crashlytics.android.BuildConfig;
import com.google.firebase.messaging.Constants;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class fh implements z2 {
    private static final String b = "fh";
    private static fh c;
    private final Map<String, zh> a = Collections.synchronizedMap(new HashMap());

    class a implements Runnable {
        final /* synthetic */ eh a;
        final /* synthetic */ Context b;
        final /* synthetic */ String c;

        a(eh ehVar, Context context, String str) {
            this.a = ehVar;
            this.b = context;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            fh.this.a.put(this.c, new zg(this.a, this.b));
        }
    }

    public static synchronized fh a() {
        if (c == null) {
            c = new fh();
        }
        return c;
    }

    private xg a(JSONObject jSONObject) {
        try {
            JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(jSONObject.getString("adSize"));
            String string = jSONObjectJsonObjectInit.get(SettingsJsonConstants.ICON_HEIGHT_KEY).toString();
            String string2 = jSONObjectJsonObjectInit.get(SettingsJsonConstants.ICON_WIDTH_KEY).toString();
            return new xg(Integer.parseInt(string2), Integer.parseInt(string), jSONObjectJsonObjectInit.get(Constants.ScionAnalytics.PARAM_LABEL).toString());
        } catch (Exception e) {
            n9.d().a(e);
            return new xg();
        }
    }

    private xg b(JSONObject jSONObject) {
        xg xgVar = new xg();
        try {
            return a(jSONObject);
        } catch (Exception e) {
            n9.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return xgVar;
        }
    }

    private boolean d(JSONObject jSONObject) {
        return jSONObject.optBoolean("shouldCreateContainer");
    }

    public zh a(String str) {
        if (str.isEmpty() || !this.a.containsKey(str)) {
            return null;
        }
        return this.a.get(str);
    }

    public void a(ah ahVar, JSONObject jSONObject, Context context, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(b, "loadWithUrl fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        xg xgVarB = b(jSONObject);
        if (this.a.containsKey(string)) {
            Logger.i(b, "sendMessageToAd fail - collection already contain adViewId");
            throw new Exception("collection already contain adViewId");
        }
        eh ehVar = new eh(ahVar, context, string, xgVarB);
        ehVar.e(IronSourceStorageUtils.getNetworkStorageDir(context));
        ehVar.b(jSONObject, str, str2);
        if (d(jSONObject)) {
            lg.a.d(new a(ehVar, context, string));
        } else {
            this.a.put(string, ehVar);
        }
    }

    public void a(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(b, "removeAdView fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.a.containsKey(string)) {
            Logger.i(b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        zh zhVar = this.a.get(string);
        if (zhVar != null) {
            zhVar.a(jSONObject, str, str2);
        }
    }

    public void b(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(b, "performWebViewAction fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.a.containsKey(string)) {
            Logger.i(b, "performWebViewAction fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        zh zhVar = this.a.get(string);
        String string2 = jSONObject.getString("actionName");
        if (zhVar != null) {
            zhVar.a(string2, str, str2);
        }
    }

    public String c(JSONObject jSONObject) throws JSONException {
        return (jSONObject == null || !jSONObject.has("adViewId")) ? (jSONObject == null || !jSONObject.has("params")) ? BuildConfig.FLAVOR : IronSourceNetworkBridge.jsonObjectInit(jSONObject.getString("params")).getString("adViewId") : jSONObject.getString("adViewId");
    }

    public void c(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(b, "removeAdView fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.a.containsKey(string)) {
            Logger.i(b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        zh zhVar = this.a.get(string);
        this.a.remove(string);
        if (zhVar != null) {
            zhVar.a(str, str2);
        }
    }

    public void d(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = IronSourceNetworkBridge.jsonObjectInit(jSONObject.getString("params")).getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(b, "sendMessageToAd fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.a.containsKey(string)) {
            Logger.i(b, "sendMessageToAd fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        zh zhVar = this.a.get(string);
        if (zhVar != null) {
            zhVar.c(jSONObject, str, str2);
        }
    }
}
