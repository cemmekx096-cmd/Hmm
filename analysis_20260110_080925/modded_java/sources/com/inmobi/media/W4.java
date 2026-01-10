package com.inmobi.media;

import android.os.Build;
import android.view.ViewTreeObserver;
import com.inmobi.ads.InMobiAudio;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class W4 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ InMobiAudio a;

    public W4(InMobiAudio inMobiAudio) {
        this.a = inMobiAudio;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        try {
            InMobiAudio.access$setMViewWidthInDp$p(this.a, y2.b(r0.getMeasuredWidth() / N3.b()));
            InMobiAudio.access$setMViewHeightInDp$p(this.a, y2.b(r0.getMeasuredHeight() / N3.b()));
            if (InMobiAudio.access$hasValidSize(this.a)) {
                if (Build.VERSION.SDK_INT >= 16) {
                    this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                } else {
                    this.a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
            }
        } catch (Exception unused) {
            I6.a((byte) 1, "InMobiAudio", "InMobiAudio$1.onGlobalLayout() handler threw unexpected error");
        }
    }
}
