package com.inmobi.media;

import android.media.MediaPlayer;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class J8 implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ L8 a;

    public J8(L8 l8) {
        this.a = l8;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) throws IllegalStateException {
        HashMap map;
        E8 e8;
        HashMap map2;
        HashMap map3;
        Intrinsics.checkNotNullParameter(mediaPlayer, "mp");
        if (this.a.getMediaPlayer() == null) {
            return;
        }
        g8 mediaPlayer2 = this.a.getMediaPlayer();
        if (mediaPlayer2 != null) {
            mediaPlayer2.a = 2;
        }
        L8 l8 = this.a;
        l8.r = true;
        l8.q = true;
        l8.p = true;
        E8 e82 = l8.n;
        if (e82 != null) {
            e82.setEnabled(true);
        }
        this.a.e = mediaPlayer.getVideoWidth();
        this.a.f = mediaPlayer.getVideoHeight();
        Object tag = this.a.getTag();
        C8 c8 = tag instanceof C8 ? (C8) tag : null;
        int iIntValue = 0;
        if (c8 != null) {
            Object obj = ((D7) c8).t.get("didCompleteQ4");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
            if (((Boolean) obj).booleanValue()) {
                this.a.a(8, 0);
                Object obj2 = ((D7) c8).t.get("placementType");
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Byte");
                if (((Byte) obj2).byteValue() == 1) {
                    return;
                }
            }
        }
        a8 playbackEventListener = this.a.getPlaybackEventListener();
        if (playbackEventListener != null) {
            playbackEventListener.a((byte) 0);
        }
        Object obj3 = (c8 == null || (map3 = ((D7) c8).t) == null) ? null : map3.get("didCompleteQ4");
        if (Intrinsics.areEqual(obj3 instanceof Boolean ? (Boolean) obj3 : null, Boolean.FALSE)) {
            Object obj4 = ((D7) c8).t.get("seekPosition");
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Int");
            iIntValue = ((Integer) obj4).intValue();
        }
        L8 l82 = this.a;
        if (l82.e == 0 || l82.f == 0) {
            g8 mediaPlayer3 = l82.getMediaPlayer();
            if (mediaPlayer3 == null || 3 != mediaPlayer3.b) {
                return;
            }
            Object obj5 = (c8 == null || (map = ((D7) c8).t) == null) ? null : map.get("isFullScreen");
            if (Intrinsics.areEqual(obj5 instanceof Boolean ? (Boolean) obj5 : null, Boolean.TRUE)) {
                this.a.start();
                return;
            }
            return;
        }
        g8 mediaPlayer4 = l82.getMediaPlayer();
        if (mediaPlayer4 == null || 3 != mediaPlayer4.b) {
            if (this.a.isPlaying()) {
                return;
            }
            if ((iIntValue != 0 || this.a.getCurrentPosition() > 0) && (e8 = this.a.n) != null) {
                e8.d();
                return;
            }
            return;
        }
        Object obj6 = (c8 == null || (map2 = ((D7) c8).t) == null) ? null : map2.get("isFullScreen");
        if (Intrinsics.areEqual(obj6 instanceof Boolean ? (Boolean) obj6 : null, Boolean.TRUE)) {
            this.a.start();
        }
        E8 e83 = this.a.n;
        if (e83 != null) {
            e83.d();
        }
    }
}
