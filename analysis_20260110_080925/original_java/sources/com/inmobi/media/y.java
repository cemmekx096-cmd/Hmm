package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class y {
    public final AdEvents a;
    public final MediaEvents b;

    public y(AdSession adSession, String str) {
        Intrinsics.checkNotNullParameter(adSession, "adSession");
        if (!Intrinsics.areEqual(str, "native_video_ad")) {
            this.a = AdEvents.createAdEvents(adSession);
        } else {
            this.b = MediaEvents.createMediaEvents(adSession);
            this.a = AdEvents.createAdEvents(adSession);
        }
    }
}
