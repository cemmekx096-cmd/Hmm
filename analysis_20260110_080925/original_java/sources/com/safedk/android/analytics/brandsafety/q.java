package com.safedk.android.analytics.brandsafety;

import android.app.Activity;
import android.os.Bundle;
import com.mbridge.msdk.playercommon.VideoFeedsPlayer;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BannerFinder;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.l;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class q extends BannerFinder {
    public q(int i) {
        super(BrandSafetyUtils.AdType.b, Arrays.asList("MREC"), "MrecFinder", i);
    }

    protected c a(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        return new r(str, str2, str3, screenShotOrientation, str4, str5);
    }

    protected e a(Activity activity, String str, int i, String str2, Bundle bundle, String str3) {
        r rVar = new r(a(com.safedk.android.internal.b.getInstance().getForegroundActivity()), str, i, str2, bundle, str3);
        rVar.af = new WeakReference<>(activity);
        return rVar;
    }

    protected boolean f(String str, String str2) {
        boolean zA = CreativeInfoManager.a(str2, AdNetworkConfiguration.n, false);
        String strA = CreativeInfoManager.a(str2, AdNetworkConfiguration.I, (String) null);
        Logger.d(this.a, "sdk " + str2 + ": config item SUPPORTS_MREC_IMPRESSION_TRACKING is " + zA + ", config item AD_NETWORK_TO_IGNORE is " + strA + ", isOnUiThread = " + com.safedk.android.utils.n.c());
        if (zA && !str.equals(strA)) {
            return true;
        }
        Logger.d(this.a, "MREC tracking is not supported for this ad network (" + str + ")");
        return false;
    }

    protected boolean a(e eVar, long j) {
        if (eVar == null || com.safedk.android.utils.e.a(eVar)) {
            Logger.d(this.a, "_MEMORY_LOAD_ don't take screenshot, ad info: " + eVar + ", low memory");
            return false;
        }
        int iA = ((int) CreativeInfoManager.a(eVar.c(), AdNetworkConfiguration.aA, 0L)) / SafeDK.getInstance().Z();
        Logger.d(this.a, "should take screenshot started for " + eVar.c() + ", iterationDelay = " + iA + ",  timerIterationCounter = " + j);
        if (iA > 0 && j <= iA) {
            Logger.d(this.a, "_AD_CAPTURE_ don't take screenshot, delay interval for sdk " + eVar.c() + " not reached, current iteration : " + j + ", skipping");
            BannerFinder.a aVar = eVar.am;
            aVar.c = aVar.c - 1;
            return false;
        }
        if (!SafeDK.getInstance().I()) {
            AdNetworkDiscovery adNetworkDiscoveryI = CreativeInfoManager.i(eVar.c());
            if (!eVar.i().l && adNetworkDiscoveryI != null && adNetworkDiscoveryI.a(eVar)) {
                eVar.i().l = true;
                Logger.d(this.a, "_AD_CAPTURE_ don't take screenshot - found a media player");
            }
            CreativeInfo creativeInfoJ = eVar.j();
            if (creativeInfoJ == null) {
                Logger.d(this.a, "_AD_CAPTURE_ don't take screenshot, no creative info yet");
                return false;
            }
            if ("MREC".equals(creativeInfoJ.K())) {
                boolean zA = CreativeInfoManager.a(eVar.v, AdNetworkConfiguration.P, false);
                if (creativeInfoJ.al() && !zA) {
                    Logger.d(this.a, "_AD_CAPTURE_ don't take screenshot, multi ad, sdk: " + eVar.v);
                    return false;
                }
                if (m(eVar.c())) {
                    if (!eVar.i().l) {
                        Logger.d(this.a, "_AD_CAPTURE_ take screenshot, MREC ad is not a video ad");
                        return true;
                    }
                    if (eVar.i().k) {
                        Logger.d(this.a, "_AD_CAPTURE_ take screenshot, MREC video ad finished playing or sdk configured to take screenshots throughout the impression. ");
                        return true;
                    }
                    Logger.d(this.a, "_AD_CAPTURE_ don't take screenshot, MREC video hasn't finished playing yet, waiting for video completed event");
                    return false;
                }
                Logger.d(this.a, "_AD_CAPTURE_ take screenshot, sdk " + eVar.c() + " Mrec EoV is not supported");
                return true;
            }
            Logger.d(this.a, "_AD_CAPTURE_ take screenshot, MREC ad");
            return true;
        }
        Logger.d(this.a, "_AD_CAPTURE_ take screenshot, SafeDK Config item 'AlwaysTakeScreenshot' is true");
        return true;
    }

    protected boolean m(String str) {
        boolean zA = CreativeInfoManager.a(str, AdNetworkConfiguration.R, false);
        if (!zA) {
            Logger.d(this.a, "_AD_CAPTURE_ take screenshot, MREC EoV is not supported for this SDK: " + str);
        }
        return zA;
    }

    public boolean a(String str, String str2, boolean z, String str3) {
        c cVarD;
        String strK;
        synchronized (J) {
            String str4 = this.a;
            StringBuilder sb = new StringBuilder();
            sb.append("_AD_CAPTURE_ on video ");
            sb.append(z ? "completed" : "start");
            sb.append(", keys : ");
            sb.append(J.keySet());
            sb.append(", isOnUiThread = ");
            sb.append(com.safedk.android.utils.n.c());
            Logger.d(str4, sb.toString());
        }
        if (str2 == null) {
            cVarD = null;
        } else {
            cVarD = b(str2);
        }
        if (cVarD == null) {
            List<c> listQ = q(str);
            if (z) {
                cVarD = d(listQ);
            } else if (listQ.size() != 1) {
                cVarD = null;
            } else {
                cVarD = listQ.get(0);
            }
        }
        Logger.d(this.a, "set on video - ad info is: " + cVarD);
        if (cVarD == null || cVarD.p != BrandSafetyUtils.AdType.b) {
            return false;
        }
        Logger.d(this.a, "set on video info is with event id: " + cVarD.L + " is eov triggered: " + cVarD.i().k + " is video: " + cVarD.i().l);
        r rVar = (r) cVarD;
        if (z && !rVar.i().k) {
            rVar.b("vie", new l.a("org", str3));
        } else if (!z && (!rVar.i().l || rVar.i().k)) {
            rVar.b("vib", new l.a("org", str3));
        }
        CreativeInfo creativeInfoJ = rVar.j();
        String str5 = this.a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("_AD_CAPTURE_ on video ");
        sb2.append(z ? "completed" : "start");
        sb2.append(", view address: ");
        sb2.append(str2);
        sb2.append(", ad format: ");
        if (creativeInfoJ == null) {
            strK = null;
        } else {
            strK = creativeInfoJ.K();
        }
        sb2.append(strK);
        sb2.append(", current value: ");
        sb2.append(rVar.i().k);
        Logger.d(str5, sb2.toString());
        if (creativeInfoJ != null) {
            Logger.d(this.a, "on mrec video event triggered, setting ci ad as video ad.");
            creativeInfoJ.f(true);
            if (creativeInfoJ.K() == null) {
                String str6 = this.a;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("on video ");
                sb3.append(z ? "completed" : "start");
                sb3.append(", setting CI ad format, based on view address match");
                Logger.d(str6, sb3.toString());
                creativeInfoJ.a(BrandSafetyEvent.AdFormatType.e);
            }
            if (!rVar.i().k && z) {
                a(rVar);
                if (!creativeInfoJ.v()) {
                    Logger.d(this.a, "on video completed, setting CI as video ad");
                    creativeInfoJ.f(true);
                }
                Logger.d(this.a, "on video completed, setting to: " + z);
                rVar.i().k = true;
                if (m(rVar.c())) {
                    if (rVar.am != null) {
                        Logger.d(this.a, "on video completed, impressionHandlerTask = " + rVar.am + ", taskFuture = " + rVar.am.d);
                        if (rVar.am.d != null) {
                            Logger.d(this.a, "_AD_CAPTURE_ on video completed, cancelling existing taskFuture " + rVar.am.d);
                            rVar.am.d.cancel(false);
                            rVar.am.d = null;
                        }
                        int iZ = SafeDK.getInstance().Z() * VideoFeedsPlayer.INTERVAL_TIME_PLAY_TIME_CD_THREAD;
                        String str7 = this.a;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("on video completed, start taking screenshots for view: ");
                        sb4.append((rVar.am.b == null || rVar.am.b.get() == null) ? "null" : rVar.am.b.get());
                        sb4.append(", samplingInterval = ");
                        sb4.append(iZ);
                        Logger.d(str7, sb4.toString());
                        rVar.am = new BannerFinder.a(this, rVar, rVar.am.b, this.e, rVar.av);
                        rVar.am.d = this.E.scheduleWithFixedDelay(rVar.am, 500L, iZ, TimeUnit.MILLISECONDS);
                    }
                } else {
                    Logger.d(this.a, "on video completed, Info impressionHandlerTask is null : " + rVar);
                }
            } else if (!z) {
                a(rVar);
                rVar.i().k = false;
            }
        }
        return true;
    }

    private List<c> q(String str) {
        Logger.d(this.a, "get items by sdk package started, sdk: " + str);
        ArrayList arrayList = new ArrayList();
        synchronized (J) {
            for (e eVar : J.values()) {
                Logger.d(this.a, "get MREC infos By sdk package, mrec info: " + eVar);
                if ((eVar instanceof r) && !eVar.U && eVar.aa && eVar.c() != null && eVar.c().equals(str)) {
                    Logger.d(this.a, "get MREC infos By sdk package, adding " + eVar);
                    arrayList.add(eVar);
                }
            }
        }
        return arrayList;
    }

    private c d(List<c> list) {
        c cVar = null;
        for (c cVar2 : list) {
            if (cVar2 != null && cVar2.i() != null && cVar2.i().l) {
                if (cVar != null) {
                    Logger.d(this.a, "found more than one video mrec info - not returning");
                    return null;
                }
                cVar = cVar2;
            }
        }
        return cVar;
    }
}
