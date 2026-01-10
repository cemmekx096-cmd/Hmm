package com.mbridge.msdk.splash.signal;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.crashlytics.android.BuildConfig;
import com.google.firebase.messaging.Constants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.db.m;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.l;
import com.mbridge.msdk.foundation.same.buffer.b;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SplashSignalUtils.java */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class c {
    private static String a = "SplashSignalUtils";
    private static int b = 0;
    private static int c = 1;

    /* compiled from: SplashSignalUtils.java */
    class a implements Runnable {
        final /* synthetic */ CampaignEx a;

        a(CampaignEx campaignEx) {
            this.a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j jVarA = j.a(g.a(com.mbridge.msdk.foundation.controller.c.m().d()));
                if (jVarA != null) {
                    if (jVarA.a(this.a.getId())) {
                        jVarA.b(this.a.getId());
                    } else {
                        com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                        gVar.a(this.a.getId());
                        gVar.b(this.a.getFca());
                        gVar.c(this.a.getFcb());
                        gVar.a(0);
                        gVar.d(1);
                        gVar.a(System.currentTimeMillis());
                        jVarA.b(gVar);
                    }
                }
                c.b(this.a.getCampaignUnitId(), this.a);
            } catch (Throwable th) {
                o0.b(c.a, th.getMessage(), th);
            }
        }
    }

    public static void b(Object obj, JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (jSONObjectOptJSONObject == null) {
                a(obj, "data is empty");
                return;
            }
            CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONObjectOptJSONObject);
            if (campaignWithBackData == null) {
                a(obj, "data camapign is empty");
            } else {
                a(campaignWithBackData);
                b(obj, BuildConfig.FLAVOR);
            }
        } catch (Throwable th) {
            a(obj, th.getMessage());
        }
    }

    public static void a(Object obj, JSONObject jSONObject) throws JSONException {
        String str;
        JSONArray jSONArray;
        String str2;
        String str3;
        JSONArray jSONArray2;
        int i;
        boolean z;
        String str4;
        File file;
        String str5 = BuildConfig.FLAVOR;
        JSONObject jSONObject2 = new JSONObject();
        String str6 = SettingsJsonConstants.PROMPT_MESSAGE_KEY;
        int i2 = 1;
        if (jSONObject == null) {
            try {
                jSONObject2.put("code", 1);
                jSONObject2.put(SettingsJsonConstants.PROMPT_MESSAGE_KEY, "params is null");
                f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (JSONException e) {
                o0.a(a, e.getMessage());
                return;
            }
        }
        try {
            jSONObject2.put("code", 0);
            jSONObject2.put(SettingsJsonConstants.PROMPT_MESSAGE_KEY, BuildConfig.FLAVOR);
            jSONArray = jSONObject.getJSONArray("resource");
        } catch (Throwable th) {
            th = th;
            str = str6;
        }
        try {
            if (jSONArray != null && jSONArray.length() > 0) {
                JSONArray jSONArray3 = new JSONArray();
                int length = jSONArray.length();
                int i3 = 0;
                while (i3 < length) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i3);
                    String strOptString = jSONObject3.optString("ref", str5);
                    int i4 = jSONObject3.getInt("type");
                    JSONObject jSONObject4 = new JSONObject();
                    if (i4 == i2 && !TextUtils.isEmpty(strOptString)) {
                        JSONObject jSONObject5 = new JSONObject();
                        l lVarB = m.a(g.a(com.mbridge.msdk.foundation.controller.c.m().d())).b(strOptString);
                        if (lVarB != null) {
                            jSONArray2 = jSONArray;
                            i = length;
                            o0.a(a, "VideoBean not null");
                            jSONObject5.put("type", 1);
                            jSONObject5.put("videoDataLength", lVarB.d());
                            String strE = lVarB.e();
                            str3 = str6;
                            if (TextUtils.isEmpty(strE)) {
                                o0.a(a, "VideoPath null");
                                jSONObject5.put("path", str5);
                                jSONObject5.put("path4Web", str5);
                                str2 = str5;
                            } else {
                                str2 = str5;
                                o0.a(a, "VideoPath not null");
                                jSONObject5.put("path", strE);
                                jSONObject5.put("path4Web", strE);
                            }
                            if (lVarB.b() == 5) {
                                jSONObject5.put("downloaded", 1);
                                z = false;
                            } else {
                                z = false;
                                jSONObject5.put("downloaded", 0);
                            }
                            jSONObject4.put(strOptString, jSONObject5);
                            jSONArray3.put(jSONObject4);
                        } else {
                            str2 = str5;
                            str3 = str6;
                            jSONArray2 = jSONArray;
                            i = length;
                            z = false;
                            o0.a(a, "VideoBean null");
                        }
                    } else {
                        str2 = str5;
                        str3 = str6;
                        jSONArray2 = jSONArray;
                        i = length;
                        z = false;
                        if (i4 == 2 && !TextUtils.isEmpty(strOptString)) {
                            JSONObject jSONObject6 = new JSONObject();
                            jSONObject6.put("type", 2);
                            jSONObject6.put("path", H5DownLoadManager.getInstance().getH5ResAddress(strOptString) == null ? str2 : H5DownLoadManager.getInstance().getH5ResAddress(strOptString));
                            jSONObject4.put(strOptString, jSONObject6);
                            jSONArray3.put(jSONObject4);
                        } else if (i4 == 3 && !TextUtils.isEmpty(strOptString)) {
                            try {
                                file = new File(strOptString);
                            } catch (Throwable th2) {
                                if (MBridgeConstans.DEBUG) {
                                    th2.printStackTrace();
                                }
                            }
                            if (file.exists() && file.isFile() && file.canRead()) {
                                o0.a(a, "getFileInfo Mraid file " + strOptString);
                                str4 = "file:////" + strOptString;
                            } else {
                                str4 = str2;
                            }
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("type", 3);
                            jSONObject7.put("path", str4);
                            jSONObject4.put(strOptString, jSONObject7);
                            jSONArray3.put(jSONObject4);
                        } else if (i4 == 4 && !TextUtils.isEmpty(strOptString)) {
                            JSONObject jSONObject8 = new JSONObject();
                            jSONObject8.put("type", 4);
                            jSONObject8.put("path", s0.a(strOptString) == null ? str2 : s0.a(strOptString));
                            jSONObject4.put(strOptString, jSONObject8);
                            jSONArray3.put(jSONObject4);
                        }
                    }
                    i3++;
                    jSONArray = jSONArray2;
                    length = i;
                    str6 = str3;
                    str5 = str2;
                    i2 = 1;
                }
                jSONObject2.put("resource", jSONArray3);
                f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            }
            try {
                jSONObject2.put("code", 1);
                str = SettingsJsonConstants.PROMPT_MESSAGE_KEY;
                try {
                    try {
                        jSONObject2.put(str, "resource is null");
                        f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                    } catch (JSONException e2) {
                        e = e2;
                        o0.a(a, e.getMessage());
                    }
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        jSONObject2.put("code", 1);
                        jSONObject2.put(str, th.getLocalizedMessage());
                        f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                    } catch (JSONException e3) {
                        o0.a(a, e3.getMessage());
                    }
                }
            } catch (JSONException e4) {
                e = e4;
                str = SettingsJsonConstants.PROMPT_MESSAGE_KEY;
            }
        } catch (Throwable th4) {
            th = th4;
            str = str3;
            jSONObject2.put("code", 1);
            jSONObject2.put(str, th.getLocalizedMessage());
            f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        }
    }

    public static void b(Object obj, String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject2);
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            a(obj, e.getMessage());
            o0.a(a, e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, CampaignEx campaignEx) {
        if (b.m == null || TextUtils.isEmpty(campaignEx.getId())) {
            return;
        }
        b.a(str, campaignEx, "splash");
    }

    public static String a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String string = jSONObject.toString();
            if (!TextUtils.isEmpty(string)) {
                return Base64.encodeToString(string.getBytes(), 2);
            }
        } catch (Throwable unused) {
            o0.b(a, "code to string is error");
        }
        return BuildConfig.FLAVOR;
    }

    public static void a(Object obj, String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", c);
            jSONObject.put(SettingsJsonConstants.PROMPT_MESSAGE_KEY, str);
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, new JSONObject());
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            o0.a(a, e.getMessage());
        }
    }

    public static void a(CampaignEx campaignEx) {
        new Thread(new a(campaignEx)).start();
    }

    public static void a(WebView webView, String str, String str2) {
        f.a().a(webView, str, str2);
    }

    public static void a(WebView webView) {
        o0.b(a, "fireOnSignalCommunication");
        f.a().a(webView);
    }
}
