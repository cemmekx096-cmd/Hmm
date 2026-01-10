package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.os.SystemClock;
import com.bytedance.sdk.component.lEW.lEW;
import com.bytedance.sdk.component.utils.MY;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.IlO.EO.MY;
import com.bytedance.sdk.openadsdk.activity.TTAdActivity;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTInterstitialActivity;
import com.bytedance.sdk.openadsdk.activity.TTInterstitialExpressActivity;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.cl.tV;
import com.bytedance.sdk.openadsdk.component.reward.MY.DmF;
import com.bytedance.sdk.openadsdk.core.cl;
import com.bytedance.sdk.openadsdk.core.model.IlO;
import com.bytedance.sdk.openadsdk.core.model.oeT;
import com.bytedance.sdk.openadsdk.core.settings.hp;
import com.bytedance.sdk.openadsdk.multipro.aidl.IlO.Cc;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.tV.EO;
import com.bytedance.sdk.openadsdk.utils.mmj;
import com.bytedance.sdk.openadsdk.utils.pP;
import com.bytedance.sdk.openadsdk.utils.vSq;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
class vCE extends PAGInterstitialAd {
    private boolean DmF;
    private MY EO;
    private final Context IlO;
    private final IlO MY;
    private boolean lEW;
    private final AtomicBoolean Cc = new AtomicBoolean(false);
    private boolean vCE = false;
    private boolean tV = false;
    private final String Bc = pP.IlO();

    vCE(Context context, IlO ilO) {
        this.IlO = context;
        this.MY = ilO;
    }

    public void IlO(boolean z) {
        this.vCE = z;
    }

    public void IlO() {
        if (this.Cc.get()) {
            return;
        }
        this.tV = true;
    }

    public void setAdInteractionListener(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener) {
        this.EO = new com.bytedance.sdk.openadsdk.component.EO.IlO(pAGInterstitialAdInteractionListener);
        IlO(1);
    }

    public void setAdInteractionCallback(PAGInterstitialAdInteractionCallback pAGInterstitialAdInteractionCallback) {
        this.EO = new com.bytedance.sdk.openadsdk.component.EO.IlO(pAGInterstitialAdInteractionCallback);
        IlO(1);
    }

    private static boolean IlO(oeT oet) {
        if (oet == null) {
            return false;
        }
        int iVAh = oet.vAh();
        return (oet.oc() != 2 || iVAh == 5 || iVAh == 33 || iVAh == 6 || iVAh == 19 || iVAh == 12) ? false : true;
    }

    public void show(Activity activity) {
        Intent intent;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        IlO ilO = this.MY;
        if (ilO == null || !ilO.Cc()) {
            return;
        }
        boolean zBc = this.MY.Bc();
        final oeT oetVCE = this.MY.vCE();
        if (!com.bykv.vk.openvk.IlO.IlO.MY.MY.IlO.IlO()) {
            EO.IlO(oetVCE, "fullscreen_interstitial_ad", "showFullScreenVideoAd error2: not main looper");
            throw new IllegalStateException("Cannot be called in a child thread —— TTFullScreenVideoAd.showFullScreenVideoAd");
        }
        List listTV = this.MY.tV();
        if (listTV != null) {
            Iterator it = listTV.iterator();
            while (it.hasNext()) {
                IPMiBroadcastReceiver.IlO(this.IlO, (oeT) it.next());
            }
        }
        if (this.Cc.get()) {
            return;
        }
        this.Cc.set(true);
        if (oetVCE == null || (oetVCE.fdM() == null && oetVCE.Hg() == null)) {
            EO.IlO(oetVCE, "fullscreen_interstitial_ad", "materialMeta error ");
            return;
        }
        Context contextIlO = activity == null ? this.IlO : activity;
        if (contextIlO == null) {
            contextIlO = cl.IlO();
        }
        if (hp.aP().tU() && lEW.IlO(this.MY)) {
            intent = new Intent(contextIlO, (Class<?>) TTAdActivity.class);
        } else if (zBc) {
            intent = new Intent(contextIlO, (Class<?>) TTFullScreenExpressVideoActivity.class);
        } else if (IlO(oetVCE)) {
            if (DmF.IlO(oetVCE)) {
                intent = new Intent(contextIlO, (Class<?>) TTInterstitialExpressActivity.class);
            } else {
                intent = new Intent(contextIlO, (Class<?>) TTFullScreenExpressVideoActivity.class);
            }
        } else if (DmF.IlO(oetVCE)) {
            intent = new Intent(contextIlO, (Class<?>) TTInterstitialActivity.class);
        } else {
            intent = new Intent(contextIlO, (Class<?>) TTFullScreenVideoActivity.class);
        }
        Intent intent2 = intent;
        intent2.putExtra("start_show_time", SystemClock.elapsedRealtime());
        com.bytedance.sdk.openadsdk.component.reward.IlO.MY.IlO(intent2, activity, this.tV, this.MY, this.Bc);
        intent2.putExtra("is_verity_playable", this.vCE);
        if (!com.bytedance.sdk.openadsdk.multipro.MY.EO()) {
            com.bytedance.sdk.openadsdk.core.pP.IlO().IlO(this.EO);
            this.EO = null;
        }
        final boolean z = com.bytedance.sdk.openadsdk.AXM.IlO.IlO("start_activity_async", 0) == 1;
        if (z) {
            com.bytedance.sdk.openadsdk.cl.EO.IlO(new tV() { // from class: com.bytedance.sdk.openadsdk.component.reward.vCE.1
                public com.bytedance.sdk.openadsdk.cl.MY.IlO generatorModel() {
                    com.bytedance.sdk.openadsdk.cl.MY.IlO ilO2 = new com.bytedance.sdk.openadsdk.cl.MY.IlO();
                    ilO2.MY("start_activity");
                    ilO2.tV("fullscreen_interstitial_ad");
                    return ilO2;
                }
            });
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.component.utils.MY.IlO(contextIlO, intent2, new MY.MY() { // from class: com.bytedance.sdk.openadsdk.component.reward.vCE.2
            public void IlO() {
                if (vCE.this.vCE) {
                    try {
                        com.bytedance.sdk.openadsdk.ea.EO.IlO().IlO(oetVCE.fdM().rp());
                    } catch (Throwable unused) {
                    }
                }
                if (z) {
                    com.bytedance.sdk.openadsdk.cl.EO.MY(new tV() { // from class: com.bytedance.sdk.openadsdk.component.reward.vCE.2.1
                        public com.bytedance.sdk.openadsdk.cl.MY.IlO generatorModel() {
                            com.bytedance.sdk.openadsdk.cl.MY.IlO ilO2 = new com.bytedance.sdk.openadsdk.cl.MY.IlO();
                            ilO2.MY("start_activity");
                            ilO2.tV("fullscreen_interstitial_ad");
                            return ilO2;
                        }
                    });
                    final long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    com.bytedance.sdk.openadsdk.ea.EO.IlO("start_activity_action", false, new com.bytedance.sdk.openadsdk.ea.MY() { // from class: com.bytedance.sdk.openadsdk.component.reward.vCE.2.2
                        public com.bytedance.sdk.openadsdk.ea.IlO.EO getLogStats() throws Exception {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("duration", jElapsedRealtime2);
                            return com.bytedance.sdk.openadsdk.ea.IlO.tV.MY().IlO("start_activity_action").MY(jSONObject.toString());
                        }
                    });
                }
            }

            public void IlO(Throwable th) {
                if (vCE.this.vCE) {
                    try {
                        com.bytedance.sdk.openadsdk.ea.EO.IlO().IlO(oetVCE.fdM().rp(), -1, th != null ? th.getMessage() : "playable tool error open");
                    } catch (Throwable unused) {
                    }
                }
                EO.IlO(oetVCE, "fullscreen_interstitial_ad", "activity start  fail ");
                if (z) {
                    com.bytedance.sdk.openadsdk.cl.EO.EO(new tV() { // from class: com.bytedance.sdk.openadsdk.component.reward.vCE.2.3
                        public com.bytedance.sdk.openadsdk.cl.MY.IlO generatorModel() {
                            com.bytedance.sdk.openadsdk.cl.MY.IlO ilO2 = new com.bytedance.sdk.openadsdk.cl.MY.IlO();
                            ilO2.MY("start_activity");
                            ilO2.tV("fullscreen_interstitial_ad");
                            return ilO2;
                        }
                    });
                }
            }
        }, true);
        if (zBc) {
            return;
        }
        IlO.IlO(this.MY.vCE(), this.tV, false);
    }

    public Map<String, Object> getMediaExtraInfo() {
        IlO ilO = this.MY;
        if (ilO == null || ilO.vCE() == null) {
            return null;
        }
        return this.MY.vCE().tN();
    }

    public Object getExtraInfo(String str) {
        IlO ilO = this.MY;
        if (ilO == null || ilO.vCE() == null || this.MY.vCE().tN() == null) {
            return null;
        }
        try {
            return this.MY.vCE().tN().get(str);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.oeT.EO("TTFullScreenVideoAdImpl", th.getMessage());
            return null;
        }
    }

    private void IlO(final int i) {
        if (com.bytedance.sdk.openadsdk.multipro.MY.EO()) {
            mmj.EO(new lEW("FullScreen_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.reward.vCE.3
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.IlO IlO = com.bytedance.sdk.openadsdk.multipro.aidl.IlO.IlO();
                    if (i != 1 || vCE.this.EO == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.multipro.aidl.MY.EO eo = new com.bytedance.sdk.openadsdk.multipro.aidl.MY.EO(vCE.this.EO);
                    IListenerManager iListenerManagerAsInterface = Cc.asInterface(IlO.IlO(1));
                    if (iListenerManagerAsInterface != null) {
                        try {
                            iListenerManagerAsInterface.registerFullVideoListener(vCE.this.Bc, eo);
                        } catch (RemoteException e) {
                            com.bytedance.sdk.component.utils.oeT.EO("TTFullScreenVideoAdImpl", e.getMessage());
                        }
                    }
                }
            }, 5);
        }
    }

    public void win(Double d) {
        if (this.lEW) {
            return;
        }
        vSq.IlO(this.MY.vCE(), d);
        this.lEW = true;
    }

    public void loss(Double d, String str, String str2) {
        if (this.DmF) {
            return;
        }
        vSq.IlO(this.MY.vCE(), d, str, str2);
        this.DmF = true;
    }
}
