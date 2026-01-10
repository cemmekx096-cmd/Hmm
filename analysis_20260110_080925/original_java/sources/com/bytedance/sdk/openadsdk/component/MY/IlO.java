package com.bytedance.sdk.openadsdk.component.MY;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.IlO.IlO.IlO.Cc.IlO;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.common.vCE;
import com.bytedance.sdk.openadsdk.core.cl;
import com.bytedance.sdk.openadsdk.core.lEW;
import com.bytedance.sdk.openadsdk.core.model.EO;
import com.bytedance.sdk.openadsdk.core.model.oeT;
import com.bytedance.sdk.openadsdk.core.model.pP;
import com.bytedance.sdk.openadsdk.core.rp.IlO.MY;
import com.bytedance.sdk.openadsdk.core.xF;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.DM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class IlO {
    private static volatile IlO IlO;
    private final xF MY = cl.EO();

    public static IlO IlO() {
        if (IlO == null) {
            synchronized (IlO.class) {
                if (IlO == null) {
                    IlO = new IlO();
                }
            }
        }
        return IlO;
    }

    private IlO() {
    }

    public void IlO(final Context context, final AdSlot adSlot, final vCE vce) {
        final DM dmMY = DM.MY();
        this.MY.IlO(adSlot, new pP(), 5, new xF.IlO() { // from class: com.bytedance.sdk.openadsdk.component.MY.IlO.1
            public void IlO(int i, String str) {
                vce.onError(i, str);
            }

            public void IlO(com.bytedance.sdk.openadsdk.core.model.IlO ilO, EO eo) {
                if (ilO.tV() != null && !ilO.tV().isEmpty()) {
                    List listTV = ilO.tV();
                    ArrayList arrayList = new ArrayList(listTV.size());
                    Iterator it = listTV.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        oeT oet = (oeT) it.next();
                        if (oeT.Cc(oet) || (oet != null && oet.Aw())) {
                            PAGNativeAd pAGNativeAdIlO = IlO(context, oet, adSlot);
                            if (vce instanceof PAGNativeAdLoadListener) {
                                arrayList.add(pAGNativeAdIlO);
                            }
                        }
                        if (oeT.Cc(oet) && oet.fdM() != null && oet.fdM().EV() != null) {
                            if (cl.tV().tV(String.valueOf(oet.hFV())) && cl.tV().Ea()) {
                                if (oet.fdM() != null) {
                                    oet.fdM().vCE(1);
                                }
                                if (oet.Pbh() != null) {
                                    oet.Pbh().vCE(1);
                                }
                                MY myIlO = oeT.IlO(CacheDirFactory.getICacheDir(oet.hHv()).EO(), oet);
                                myIlO.IlO("material_meta", oet);
                                myIlO.IlO("ad_slot", adSlot);
                                com.bytedance.sdk.openadsdk.core.rp.Cc.IlO.IlO(myIlO, (IlO.IlO) null);
                            }
                            IPMiBroadcastReceiver.IlO(context, oet);
                        }
                    }
                    if ((vce instanceof PAGNativeAdLoadListener) && !arrayList.isEmpty()) {
                        AdSlot adSlot2 = adSlot;
                        if (adSlot2 != null && !TextUtils.isEmpty(adSlot2.getBidAdm())) {
                            com.bytedance.sdk.openadsdk.ea.EO.IlO((oeT) listTV.get(0), dmMY.tV());
                        }
                        PAGNativeAdLoadListener pAGNativeAdLoadListener = vce;
                        if (pAGNativeAdLoadListener instanceof PAGNativeAdLoadListener) {
                            pAGNativeAdLoadListener.onAdLoaded(arrayList.get(0));
                        }
                        if (eo.Cc() == null || eo.Cc().isEmpty()) {
                            return;
                        }
                        EO.IlO(eo);
                        return;
                    }
                    vce.onError(-4, lEW.IlO(-4));
                    eo.IlO(-4);
                    EO.IlO(eo);
                    return;
                }
                vce.onError(-3, lEW.IlO(-3));
                eo.IlO(-3);
                EO.IlO(eo);
            }

            private PAGNativeAd IlO(Context context2, oeT oet, AdSlot adSlot2) {
                if (oet.oc() == 2) {
                    if (oet.fdM() != null) {
                        return new com.bytedance.sdk.openadsdk.IlO.MY.IlO.MY(context2, oet, adSlot2);
                    }
                    return new com.bytedance.sdk.openadsdk.IlO.MY.IlO.EO(context2, oet, adSlot2);
                }
                return new com.bytedance.sdk.openadsdk.IlO.MY.MY(context2, oet, 5, adSlot2);
            }
        });
    }
}
