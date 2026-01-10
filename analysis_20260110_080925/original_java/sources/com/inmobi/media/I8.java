package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class I8 extends Handler {
    public final WeakReference a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I8(L8 l8) {
        super(Looper.getMainLooper());
        Intrinsics.checkNotNullParameter(l8, "videoView");
        this.a = new WeakReference(l8);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        a8 playbackEventListener;
        Intrinsics.checkNotNullParameter(message, "msg");
        L8 l8 = (L8) this.a.get();
        if (l8 != null && message.what == 1) {
            int duration = l8.getDuration();
            int currentPosition = l8.getCurrentPosition();
            if (duration != -1 && currentPosition != 0) {
                Object tag = l8.getTag();
                C8 c8 = tag instanceof C8 ? (C8) tag : null;
                if (c8 != null) {
                    Object obj = ((D7) c8).t.get("didCompleteQ1");
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
                    if (!((Boolean) obj).booleanValue() && (currentPosition * 4) - duration >= 0) {
                        ((D7) c8).t.put("didCompleteQ1", Boolean.TRUE);
                        Z7 quartileCompletedListener = l8.getQuartileCompletedListener();
                        Intrinsics.checkNotNull(quartileCompletedListener);
                        quartileCompletedListener.a((byte) 0);
                    }
                    Object obj2 = ((D7) c8).t.get("didCompleteQ2");
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                    if (!((Boolean) obj2).booleanValue() && (currentPosition * 2) - duration >= 0) {
                        ((D7) c8).t.put("didCompleteQ2", Boolean.TRUE);
                        Z7 quartileCompletedListener2 = l8.getQuartileCompletedListener();
                        if (quartileCompletedListener2 != null) {
                            quartileCompletedListener2.a((byte) 1);
                        }
                    }
                    Object obj3 = ((D7) c8).t.get("didCompleteQ3");
                    Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                    if (!((Boolean) obj3).booleanValue() && (currentPosition * 4) - (duration * 3) >= 0) {
                        ((D7) c8).t.put("didCompleteQ3", Boolean.TRUE);
                        Z7 quartileCompletedListener3 = l8.getQuartileCompletedListener();
                        if (quartileCompletedListener3 != null) {
                            quartileCompletedListener3.a((byte) 2);
                        }
                    }
                    if ((currentPosition / duration) * 100 > c8.D) {
                        Object obj4 = ((D7) c8).t.get("didQ4Fire");
                        Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                        if (!((Boolean) obj4).booleanValue() && (playbackEventListener = l8.getPlaybackEventListener()) != null) {
                            playbackEventListener.a((byte) 5);
                        }
                    }
                }
            }
            sendEmptyMessageDelayed(1, 1000L);
        }
        super.handleMessage(message);
    }
}
