package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.ProgressBar;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import com.crashlytics.android.BuildConfig;
import com.inmobi.media.L8$;
import com.mbridge.msdk.playercommon.VideoFeedsPlayer;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.InMobiVideoBridge;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class L8 extends TextureView implements MediaController.MediaPlayerControl {
    public static final String C = "L8";
    public final MediaPlayer.OnErrorListener A;
    public final K8 B;
    public Uri a;
    public Surface b;
    public g8 c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public H8 i;
    public G8 j;
    public F8 k;
    public boolean l;
    public I8 m;
    public E8 n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public Handler s;
    public boolean t;
    public final F7 u;
    public MediaPlayer.OnVideoSizeChangedListener v;
    public final J8 w;
    public final MediaPlayer.OnCompletionListener x;
    public final MediaPlayer.OnInfoListener y;
    public final MediaPlayer.OnBufferingUpdateListener z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L8(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.h = ExoMediaDrm.KeyRequest.REQUEST_TYPE_UNKNOWN;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.u = new F7(context2, this);
        requestLayout();
        invalidate();
        this.v = new L8$.ExternalSyntheticLambda1(this);
        this.w = new J8(this);
        this.x = new L8$.ExternalSyntheticLambda2(this);
        this.y = new L8$.ExternalSyntheticLambda3(this);
        this.z = new L8$.ExternalSyntheticLambda4(this);
        this.A = new L8$.ExternalSyntheticLambda5(this);
        this.B = new K8(this);
    }

    public static final void a(L8 l8, MediaPlayer mediaPlayer) {
        Intrinsics.checkNotNullParameter(l8, "this$0");
        try {
            l8.d();
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue(C, "TAG");
            w5 w5Var = w5.a;
            w5.d.a(c5.a(e, "event"));
        }
    }

    public static final boolean b(L8 l8, MediaPlayer mediaPlayer, int i, int i2) {
        Intrinsics.checkNotNullParameter(l8, "this$0");
        if (Build.VERSION.SDK_INT < 17 || 3 != i) {
            return true;
        }
        l8.a(8, 8);
        return true;
    }

    public static final void c(L8 l8, MediaPlayer mediaPlayer, int i, int i2) {
        Intrinsics.checkNotNullParameter(l8, "this$0");
        l8.e = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        l8.f = videoHeight;
        if (l8.e == 0 || videoHeight == 0) {
            return;
        }
        l8.requestLayout();
    }

    private final void setVideoPath(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        setVideoURI(Uri.parse(str));
    }

    private final void setVideoURI(Uri uri) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        this.a = uri;
        e();
        requestLayout();
        invalidate();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return this.p;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return this.q;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return this.r;
    }

    public final void d() throws IllegalStateException {
        g8 g8Var = this.c;
        if (g8Var != null) {
            g8Var.a = 5;
        }
        if (g8Var != null) {
            g8Var.b = 5;
        }
        E8 e8 = this.n;
        if (e8 != null) {
            e8.c();
        }
        I8 i8 = this.m;
        if (i8 != null) {
            i8.removeMessages(1);
        }
        Object tag = getTag();
        if (tag instanceof C8) {
            C8 c8 = (C8) tag;
            Object obj = ((D7) c8).t.get("didCompleteQ4");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
            if (!((Boolean) obj).booleanValue()) {
                ((D7) c8).t.put("didCompleteQ4", Boolean.TRUE);
                Z7 z7 = this.i;
                if (z7 != null) {
                    z7.a((byte) 3);
                }
            }
            ((D7) c8).t.put("didSignalVideoCompleted", Boolean.TRUE);
            HashMap map = ((D7) c8).t;
            if (map != null) {
                Boolean bool = Boolean.FALSE;
                map.put("didCompleteQ1", bool);
                map.put("didCompleteQ2", bool);
                map.put("didCompleteQ3", bool);
                map.put("didPause", bool);
                map.put("didStartPlaying", bool);
                map.put("didQ4Fire", bool);
            }
            if (c8.B) {
                start();
                return;
            }
            this.u.a();
            Object obj2 = ((D7) c8).t.get("isFullScreen");
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            if (((Boolean) obj2).booleanValue()) {
                a(8, 0);
            }
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("com.inmobi", this, me);
        return super.dispatchTouchEvent(me);
    }

    public final void e() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        g8 g8Var;
        E8 mediaController;
        byte bByteValue;
        g8 g8VarA;
        if (this.a == null || this.b == null) {
            return;
        }
        if (this.c == null) {
            Object tag = getTag();
            C8 c8 = tag instanceof C8 ? (C8) tag : null;
            if (c8 != null) {
                Object obj = ((D7) c8).t.get("placementType");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Byte");
                bByteValue = ((Byte) obj).byteValue();
            } else {
                bByteValue = 1;
            }
            if (1 == bByteValue) {
                g8VarA = new g8();
            } else {
                Object obj2 = g8.d;
                g8VarA = f8.a();
            }
            this.c = g8VarA;
            int i = this.d;
            if (i != 0) {
                g8VarA.setAudioSessionId(i);
            } else {
                this.d = g8VarA.getAudioSessionId();
            }
            try {
                g8 g8Var2 = this.c;
                if (g8Var2 != null) {
                    Context applicationContext = getContext().getApplicationContext();
                    Uri uri = this.a;
                    Intrinsics.checkNotNull(uri);
                    g8Var2.setDataSource(applicationContext, uri, null);
                }
            } catch (IOException unused) {
                g8 g8Var3 = this.c;
                if (g8Var3 != null) {
                    g8Var3.a = -1;
                }
                if (g8Var3 == null) {
                    return;
                }
                g8Var3.b = -1;
                return;
            }
        }
        try {
            g8 g8Var4 = this.c;
            if (g8Var4 != null) {
                g8Var4.setOnPreparedListener(this.w);
                g8Var4.setOnVideoSizeChangedListener(this.v);
                g8Var4.setOnCompletionListener(this.x);
                g8Var4.setOnErrorListener(this.A);
                g8Var4.setOnInfoListener(this.y);
                g8Var4.setOnBufferingUpdateListener(this.z);
                InMobiVideoBridge.MediaPlayerSetSurface(g8Var4, this.b);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                g8 g8Var5 = this.c;
                if (g8Var5 != null) {
                    g8Var5.setAudioAttributes(this.u.e);
                }
            } else {
                g8 g8Var6 = this.c;
                if (g8Var6 != null) {
                    g8Var6.setAudioStreamType(3);
                }
            }
            g8 g8Var7 = this.c;
            if (g8Var7 != null) {
                g8Var7.prepareAsync();
            }
            this.o = 0;
            g8 g8Var8 = this.c;
            if (g8Var8 != null) {
                g8Var8.a = 1;
            }
            if (g8Var8 != null && (mediaController = getMediaController()) != null) {
                mediaController.setMediaPlayer(this);
                mediaController.setEnabled(a());
                mediaController.d();
            }
            Object tag2 = getTag();
            if (tag2 instanceof C8) {
                Object obj3 = ((D7) ((C8) tag2)).t.get("shouldAutoPlay");
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                if (((Boolean) obj3).booleanValue() && (g8Var = this.c) != null) {
                    g8Var.b = 3;
                }
                Object obj4 = ((D7) ((C8) tag2)).t.get("didCompleteQ4");
                Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                if (((Boolean) obj4).booleanValue()) {
                    a(8, 0);
                    return;
                }
            }
            a(0, 0);
        } catch (Exception e) {
            MediaPlayer mediaPlayer = this.c;
            if (mediaPlayer != null) {
                ((g8) mediaPlayer).a = -1;
            }
            if (mediaPlayer != null) {
                ((g8) mediaPlayer).b = -1;
            }
            this.A.onError(mediaPlayer, 1, 0);
            w5 w5Var = w5.a;
            w5.d.a(c5.a(e, "event"));
        }
    }

    public final void f() {
        Surface surface = this.b;
        if (surface != null) {
            surface.release();
        }
        this.b = null;
        g();
    }

    public final void g() {
        g8 g8Var;
        I8 i8 = this.m;
        if (i8 != null) {
            i8.removeMessages(1);
        }
        F7 f7 = this.u;
        f7.a();
        if (Build.VERSION.SDK_INT >= 26) {
            f7.f = null;
        }
        f7.g = null;
        Object tag = getTag();
        boolean z = tag instanceof C8;
        if (z) {
            ((D7) ((C8) tag)).t.put("seekPosition", Integer.valueOf(getCurrentPosition()));
        }
        g8 g8Var2 = this.c;
        if (g8Var2 != null) {
            g8Var2.a = 0;
        }
        if (g8Var2 != null) {
            g8Var2.b = 0;
        }
        if (g8Var2 != null) {
            try {
                g8Var2.reset();
            } catch (Exception e) {
                w5 w5Var = w5.a;
                w5.d.a(c5.a(e, "event"));
            }
        }
        g8 g8Var3 = this.c;
        if (g8Var3 != null) {
            g8Var3.setOnPreparedListener(null);
            g8Var3.setOnVideoSizeChangedListener(null);
            g8Var3.setOnCompletionListener(null);
            g8Var3.setOnErrorListener(null);
            g8Var3.setOnInfoListener(null);
            g8Var3.setOnBufferingUpdateListener(null);
        }
        if (z) {
            Object obj = ((D7) ((C8) tag)).t.get("placementType");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Byte");
            if (((Byte) obj).byteValue() == 0 && (g8Var = this.c) != null) {
                g8Var.a();
            }
        } else {
            g8 g8Var4 = this.c;
            if (g8Var4 != null) {
                g8Var4.a();
            }
        }
        Intrinsics.checkNotNullExpressionValue(C, "TAG");
        this.c = null;
    }

    public final F7 getAudioFocusManager$media_release() {
        return this.u;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        if (this.d == 0) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.d = mediaPlayer.getAudioSessionId();
            InMobiVideoBridge.MediaPlayerRelease(mediaPlayer);
        }
        return this.d;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.c != null) {
            return this.o;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        g8 g8Var = this.c;
        if (g8Var == null || !a()) {
            return 0;
        }
        return g8Var.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        g8 g8Var = this.c;
        if (g8Var == null || !a()) {
            return -1;
        }
        return g8Var.getDuration();
    }

    public final int getLastVolume() {
        return this.h;
    }

    public final MediaPlayer.OnVideoSizeChangedListener getMSizeChangedListener() {
        return this.v;
    }

    public final E8 getMediaController() {
        return this.n;
    }

    public final g8 getMediaPlayer() {
        return this.c;
    }

    public final boolean getPauseScheduled() {
        return this.t;
    }

    public final G8 getPlaybackEventListener() {
        return this.j;
    }

    public final H8 getQuartileCompletedListener() {
        return this.i;
    }

    public final int getState() {
        g8 g8Var = this.c;
        if (g8Var != null) {
            return g8Var.a;
        }
        return 0;
    }

    public final int getVideoVolume() {
        if (isPlaying()) {
            return this.g;
        }
        return -1;
    }

    public final int getVolume() {
        if (a()) {
            return this.g;
        }
        return -1;
    }

    public final void h() {
        g8 g8Var = this.c;
        if (g8Var != null) {
            this.g = 0;
            if (g8Var != null) {
                g8Var.setVolume(0.0f, 0.0f);
            }
            Object tag = getTag();
            if (tag instanceof C8) {
                ((D7) ((C8) tag)).t.put("currentMediaVolume", 0);
            }
        }
    }

    public final void i() {
        g8 g8Var = this.c;
        if (g8Var != null) {
            this.g = 1;
            if (g8Var != null) {
                g8Var.setVolume(1.0f, 1.0f);
            }
            Object tag = getTag();
            if (tag instanceof C8) {
                ((D7) ((C8) tag)).t.put("currentMediaVolume", 15);
            }
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        g8 g8Var;
        return a() && (g8Var = this.c) != null && g8Var.isPlaying();
    }

    public final void j() throws IllegalStateException {
        g8 g8Var;
        if (a() && (g8Var = this.c) != null && g8Var.isPlaying()) {
            g8 g8Var2 = this.c;
            if (g8Var2 != null) {
                InMobiVideoBridge.MediaPlayerPause(g8Var2);
            }
            g8 g8Var3 = this.c;
            if (g8Var3 != null) {
                g8Var3.seekTo(0);
            }
            this.u.a();
            Object tag = getTag();
            if (tag instanceof C8) {
                C8 c8 = (C8) tag;
                HashMap map = ((D7) c8).t;
                Boolean bool = Boolean.TRUE;
                map.put("didPause", bool);
                ((D7) c8).t.put("seekPosition", 0);
                ((D7) c8).t.put("didCompleteQ4", bool);
            }
            g8 g8Var4 = this.c;
            if (g8Var4 != null) {
                g8Var4.a = 4;
            }
            a8 a8Var = this.j;
            if (a8Var != null) {
                a8Var.a((byte) 4);
            }
        }
        g8 g8Var5 = this.c;
        if (g8Var5 == null) {
            return;
        }
        g8Var5.b = 4;
    }

    public final void k() {
        if (this.c != null) {
            if (isPlaying()) {
                this.u.c();
            } else {
                i();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (r1 > r6) goto L26;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.e     // Catch: java.lang.Exception -> L79
            int r0 = android.view.TextureView.getDefaultSize(r0, r6)     // Catch: java.lang.Exception -> L79
            int r1 = r5.f     // Catch: java.lang.Exception -> L79
            int r1 = android.view.TextureView.getDefaultSize(r1, r7)     // Catch: java.lang.Exception -> L79
            int r2 = r5.e     // Catch: java.lang.Exception -> L79
            if (r2 <= 0) goto L75
            int r2 = r5.f     // Catch: java.lang.Exception -> L79
            if (r2 <= 0) goto L75
            int r0 = android.view.View.MeasureSpec.getMode(r6)     // Catch: java.lang.Exception -> L79
            int r6 = android.view.View.MeasureSpec.getSize(r6)     // Catch: java.lang.Exception -> L79
            int r1 = android.view.View.MeasureSpec.getMode(r7)     // Catch: java.lang.Exception -> L79
            int r7 = android.view.View.MeasureSpec.getSize(r7)     // Catch: java.lang.Exception -> L79
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L3b
            if (r1 != r2) goto L3b
            int r0 = r5.e     // Catch: java.lang.Exception -> L79
            int r1 = r0 * r7
            int r2 = r5.f     // Catch: java.lang.Exception -> L79
            int r3 = r6 * r2
            if (r1 >= r3) goto L36
            int r3 = r3 / r0
            goto L73
        L36:
            if (r1 <= r3) goto L59
            int r0 = r1 / r2
            goto L5c
        L3b:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L4d
            int r0 = r5.f     // Catch: java.lang.Exception -> L79
            int r0 = r0 * r6
            int r2 = r5.e     // Catch: java.lang.Exception -> L79
            int r0 = r0 / r2
            if (r1 != r3) goto L4a
            if (r0 <= r7) goto L4a
            goto L59
        L4a:
            r1 = r0
        L4b:
            r0 = r6
            goto L75
        L4d:
            if (r1 != r2) goto L5e
            int r1 = r5.e     // Catch: java.lang.Exception -> L79
            int r1 = r1 * r7
            int r2 = r5.f     // Catch: java.lang.Exception -> L79
            int r1 = r1 / r2
            if (r0 != r3) goto L5b
            if (r1 <= r6) goto L5b
        L59:
            r1 = r7
            goto L4b
        L5b:
            r0 = r1
        L5c:
            r1 = r7
            goto L75
        L5e:
            int r2 = r5.e     // Catch: java.lang.Exception -> L79
            int r4 = r5.f     // Catch: java.lang.Exception -> L79
            if (r1 != r3) goto L6a
            if (r4 <= r7) goto L6a
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L6c
        L6a:
            r1 = r2
            r7 = r4
        L6c:
            if (r0 != r3) goto L5b
            if (r1 <= r6) goto L5b
            int r4 = r4 * r6
            int r3 = r4 / r2
        L73:
            r1 = r3
            goto L4b
        L75:
            r5.setMeasuredDimension(r0, r1)     // Catch: java.lang.Exception -> L79
            goto L80
        L79:
            java.lang.String r6 = com.inmobi.media.L8.C
            java.lang.String r7 = "TAG"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.L8.onMeasure(int, int):void");
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        g8 g8Var;
        if (a() && (g8Var = this.c) != null && g8Var.isPlaying()) {
            g8 g8Var2 = this.c;
            if (g8Var2 != null) {
                InMobiVideoBridge.MediaPlayerPause(g8Var2);
            }
            g8 g8Var3 = this.c;
            if (g8Var3 != null) {
                g8Var3.a = 4;
            }
            this.u.a();
            Object tag = getTag();
            if (tag instanceof C8) {
                C8 c8 = (C8) tag;
                ((D7) c8).t.put("didPause", Boolean.TRUE);
                ((D7) c8).t.put("seekPosition", Integer.valueOf(getCurrentPosition()));
            }
            a8 a8Var = this.j;
            if (a8Var != null) {
                a8Var.a((byte) 2);
            }
        }
        g8 g8Var4 = this.c;
        if (g8Var4 != null) {
            g8Var4.b = 4;
        }
        this.t = false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i) {
    }

    public final void setIsLockScreen(boolean z) {
        this.l = z;
    }

    public final void setLastVolume(int i) {
        this.h = i;
    }

    public final void setMSizeChangedListener(MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        Intrinsics.checkNotNullParameter(onVideoSizeChangedListener, "<set-?>");
        this.v = onVideoSizeChangedListener;
    }

    public final void setMediaController(E8 e8) {
        E8 mediaController;
        if (e8 != null) {
            this.n = e8;
            if (this.c == null || (mediaController = getMediaController()) == null) {
                return;
            }
            mediaController.setMediaPlayer(this);
            mediaController.setEnabled(a());
            mediaController.d();
        }
    }

    public final void setMediaErrorListener(F8 f8) {
        this.k = f8;
    }

    public final void setPlaybackEventListener(G8 g8) {
        this.j = g8;
    }

    public final void setQuartileCompletedListener(H8 h8) {
        this.i = h8;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
    @Override // android.widget.MediaController.MediaPlayerControl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void start() throws java.lang.IllegalStateException {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.L8.start():void");
    }

    public final void b() {
        try {
            if (this.a != null) {
                Kb.a((Runnable) new L8$.ExternalSyntheticLambda0(this));
            }
        } catch (Exception unused) {
            Intrinsics.checkNotNullExpressionValue(C, "TAG");
        }
    }

    public final void c() {
        if (this.c != null) {
            this.u.a();
            h();
        }
    }

    public static final void a(L8 l8, MediaPlayer mediaPlayer, int i) {
        Intrinsics.checkNotNullParameter(l8, "this$0");
        l8.o = i;
    }

    public static final boolean a(L8 l8, MediaPlayer mediaPlayer, int i, int i2) {
        Intrinsics.checkNotNullParameter(l8, "this$0");
        Intrinsics.checkNotNullExpressionValue(C, "TAG");
        b8 b8Var = l8.k;
        if (b8Var != null) {
            b8 b8Var2 = b8Var;
            A8 a8 = b8Var2.a.b;
            if (!((t7) a8).t && (a8 instanceof A8)) {
                try {
                    a8.a(b8Var2.b, i);
                } catch (Exception e) {
                    d8 d8Var = b8Var2.a;
                    g5 g5Var = d8Var.f;
                    if (g5Var != null) {
                        String str = d8Var.g;
                        g5Var.b(str, Ed.a(e, j6.a(str, "access$getTAG$p(...)", "SDK encountered unexpected error in handling the onVideoError event; ")));
                    }
                }
            }
        }
        g8 g8Var = l8.c;
        if (g8Var != null) {
            g8Var.a = -1;
        }
        if (g8Var != null) {
            g8Var.b = -1;
        }
        E8 e8 = l8.n;
        if (e8 != null) {
            e8.c();
        }
        l8.b();
        return true;
    }

    public static final void b(L8 l8) {
        Intrinsics.checkNotNullParameter(l8, "this$0");
        l8.pause();
    }

    public static final void a(L8 l8) {
        Intrinsics.checkNotNullParameter(l8, "this$0");
        String strValueOf = String.valueOf(l8.a);
        k1 k1VarA = Db.a();
        k1VarA.getClass();
        Intrinsics.checkNotNullParameter(strValueOf, "diskUrl");
        ArrayList arrayListA = R1.a(k1VarA, "disk_uri=? ", new String[]{strValueOf}, null, null, "created_ts DESC ", 1, 12);
        j jVar = arrayListA.isEmpty() ? null : (j) arrayListA.get(0);
        int iNextInt = Integer.MAX_VALUE & new Random().nextInt();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (jVar != null) {
            String str = jVar.b;
            Intrinsics.checkNotNullParameter(str, "url");
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            Db.a().a(new j(iNextInt, str, (String) null, 0, jCurrentTimeMillis, jCurrentTimeMillis2, jCurrentTimeMillis3, 0L));
        }
    }

    public final boolean a() {
        g8 g8Var = this.c;
        if (g8Var == null) {
            return true;
        }
        int i = g8Var.a;
        return (i == -1 || i == 0 || i == 1) ? false : true;
    }

    public final void a(int i) {
        if (this.t || 4 == getState()) {
            return;
        }
        if (this.s == null) {
            this.s = new Handler(Looper.getMainLooper());
        }
        if (i > 0) {
            this.t = true;
            c();
            Handler handler = this.s;
            if (handler != null) {
                handler.postDelayed(new L8$.ExternalSyntheticLambda6(this), i * VideoFeedsPlayer.INTERVAL_TIME_PLAY_TIME_CD_THREAD);
                return;
            }
            return;
        }
        pause();
    }

    public final void a(int i, int i2) {
        if (this.c != null) {
            ViewParent parent = getParent();
            M8 m8 = parent instanceof M8 ? (M8) parent : null;
            ProgressBar progressBar = m8 != null ? m8.getProgressBar() : null;
            if (progressBar != null) {
                progressBar.setVisibility(i);
            }
            ViewParent parent2 = getParent();
            M8 m82 = parent2 instanceof M8 ? (M8) parent2 : null;
            ImageView posterImage = m82 != null ? m82.getPosterImage() : null;
            if (posterImage == null) {
                return;
            }
            posterImage.setVisibility(i2);
        }
    }
}
