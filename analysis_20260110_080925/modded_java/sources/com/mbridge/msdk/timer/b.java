package com.mbridge.msdk.timer;

import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.playercommon.VideoFeedsPlayer;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;

/* compiled from: TimerController.java */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class b {

    /* compiled from: TimerController.java */
    /* renamed from: com.mbridge.msdk.timer.b$b, reason: collision with other inner class name */
    static class C0047b {
        static b a = new b();
    }

    public static b getInstance() {
        return C0047b.a;
    }

    public void addInterstitialList(String str, String str2) {
        try {
            com.mbridge.msdk.timer.a.a().a(str, str2);
        } catch (Exception e) {
            o0.b("TimerController", "addInterstitialList error:" + e.getMessage());
        }
    }

    public void addRewardList(String str, String str2) {
        try {
            com.mbridge.msdk.timer.a.a().b(str, str2);
        } catch (Exception e) {
            o0.b("TimerController", "addRewardList error:" + e.getMessage());
        }
    }

    public void start() {
        g gVarD = h.b().d(c.m().b());
        if (gVarD == null) {
            gVarD = h.b().a();
        }
        if (gVarD.h() > 0) {
            com.mbridge.msdk.timer.a.a().b(r0 * VideoFeedsPlayer.INTERVAL_TIME_PLAY_TIME_CD_THREAD);
        }
    }

    private b() {
    }
}
