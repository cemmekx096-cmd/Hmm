package com.mbridge.msdk.mbnative.service.net;

import com.devtodev.analytics.internal.backend.repository.json.JsonParser;
import com.google.firebase.messaging.Constants;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.c;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.g;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import java.util.List;
import org.json.JSONObject;

/* compiled from: NativeResponseHandler.java */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public abstract class b extends c<JSONObject> {
    private int a;
    private String b;

    /* compiled from: NativeResponseHandler.java */
    class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ JSONObject b;
        final /* synthetic */ List c;
        final /* synthetic */ int d;

        /* compiled from: NativeResponseHandler.java */
        /* renamed from: com.mbridge.msdk.mbnative.service.net.b$a$a, reason: collision with other inner class name */
        class RunnableC0043a implements Runnable {
            final /* synthetic */ CampaignUnit a;

            RunnableC0043a(CampaignUnit campaignUnit) {
                this.a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.a;
                if (campaignUnit == null || campaignUnit.getAds() == null || this.a.getAds().size() <= 0) {
                    a aVar = a.this;
                    b.this.a(aVar.d, aVar.b.optString("msg"));
                } else {
                    a aVar2 = a.this;
                    b.this.a(aVar2.c, this.a);
                    b.this.saveRequestTime(this.a.getAds().size());
                }
            }
        }

        a(String str, JSONObject jSONObject, List list, int i) {
            this.a = str;
            this.b = jSONObject;
            this.c = list;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0043a("v5".equals(this.a) ? com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(this.b.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) : com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(this.b.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE))));
        }
    }

    private void a(List<g> list, JSONObject jSONObject) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbnative/service/net/b;->a(Ljava/util/List;Lorg/json/JSONObject;)V");
        BrandSafetyUtils.onMintegralNativeController(this, jSONObject);
        safedk_b_a_2fdb1bea85f44b445bbad20b72619ad3(list, jSONObject);
    }

    private void b(List<g> list, JSONObject jSONObject) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbnative/service/net/b;->b(Ljava/util/List;Lorg/json/JSONObject;)V");
        BrandSafetyUtils.onMintegralNativeController(this, jSONObject);
        safedk_b_b_89595a4281019aa9433291627d9c3c28(list, jSONObject);
    }

    public abstract void a(int i, String str);

    public void a(String str) {
        this.b = str;
    }

    public abstract void a(List<Frame> list);

    public abstract void a(List<g> list, CampaignUnit campaignUnit);

    public String b() {
        return this.b;
    }

    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        a(aVar.a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
    }

    public void onPreExecute() {
        super.onPreExecute();
    }

    public void onSuccess(e<JSONObject> eVar) {
        com.mbridge.msdk.foundation.same.net.toolbox.a aVar;
        super.onSuccess(eVar);
        if (eVar == null || (aVar = eVar.b) == null) {
            return;
        }
        int i = this.a;
        if (i == 0) {
            b(aVar.b, (JSONObject) eVar.c);
        } else if (i == 1) {
            a(aVar.b, (JSONObject) eVar.c);
        }
    }

    private void safedk_b_b_89595a4281019aa9433291627d9c3c28(List<g> list, JSONObject p1) {
        int iOptInt = p1.optInt(SettingsJsonConstants.APP_STATUS_KEY);
        if (1 != iOptInt) {
            a(iOptInt, p1.optString("msg"));
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(p1.optString(JsonParser.EXCLUDE_VERSION), p1, list, iOptInt));
    }

    public void a(int i) {
        this.a = i;
    }

    public int a() {
        return this.a;
    }

    private void safedk_b_a_2fdb1bea85f44b445bbad20b72619ad3(List<g> list, JSONObject p1) {
        CampaignUnit campaignUnit;
        int iOptInt = p1.optInt(SettingsJsonConstants.APP_STATUS_KEY);
        if (1 == iOptInt) {
            calcRequestTime(System.currentTimeMillis());
            if ("v5".equals(p1.optString(JsonParser.EXCLUDE_VERSION))) {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(p1.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE));
            } else {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(p1.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE));
            }
            if (campaignUnit != null && campaignUnit.getListFrames() != null && campaignUnit.getListFrames().size() > 0) {
                List p0 = campaignUnit.getListFrames();
                a((List<Frame>) p0);
                List p02 = campaignUnit.getListFrames();
                saveRequestTime(p02.size());
                return;
            }
            a(iOptInt, p1.optString("msg"));
            return;
        }
        a(iOptInt, p1.optString("msg"));
    }
}
