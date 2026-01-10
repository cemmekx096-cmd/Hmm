package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.VideoView;
import com.crashlytics.android.BuildConfig;
import com.inmobi.media.V6$;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.InMobiVideoBridge;
import com.safedk.android.utils.Logger;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class V6 extends VideoView implements MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, Application.ActivityLifecycleCallbacks {
    public final f5 a;
    public T6 b;
    public ViewGroup c;
    public U6 d;
    public boolean e;
    public final WeakReference f;
    public int g;
    public String h;
    public String i;
    public int j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V6(Activity activity, f5 f5Var) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a = f5Var;
        setZOrderOnTop(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT < 28) {
            setDrawingCacheEnabled(true);
        }
        this.g = 100;
        this.j = -1;
        this.k = 0;
        this.f = new WeakReference(activity);
        Kb.a(activity, this);
    }

    public static final void a(V6 v6, MediaPlayer mediaPlayer, int i, int i2) {
        Intrinsics.checkNotNullParameter(v6, "this$0");
        g5 g5Var = v6.a;
        if (g5Var != null) {
            g5Var.a("MediaRenderView", ">>> onVideoSizeChanged");
        }
        if (v6.b == null) {
            T6 t6 = new T6(v6.getContext());
            v6.b = t6;
            t6.setAnchorView(v6);
            v6.setMediaController(v6.b);
            v6.requestLayout();
            v6.requestFocus();
        }
    }

    private void safedk_videoview_V6_VideoViewPlay_1cd25093e0b187dede2869d94281a264() {
        Logger.d("InMobiVideo|SafeDK: Partial-Video> Lcom/inmobi/media/V6;->safedk_videoview_V6_VideoViewPlay_1cd25093e0b187dede2869d94281a264()V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "VideoViewPlay: player " + this + ", isOnUiThread = " + com.safedk.android.utils.n.c());
                CreativeInfoManager.a("com.inmobi", (Object) this);
                CreativeInfoManager.a("com.inmobi", BrandSafetyUtils.a(this), false, "video-view");
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in VideoViewPlay: " + e.getMessage());
            }
        }
        super.start();
    }

    public final void b() {
        g5 g5Var = this.a;
        if (g5Var != null) {
            g5Var.a("MediaRenderView", "Release the media render view");
        }
        InMobiVideoBridge.VideoViewStop(this);
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            ViewParent parent = viewGroup.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.c);
            }
            ViewParent parent2 = getParent();
            ViewGroup viewGroup3 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup3 != null) {
                viewGroup3.removeView(this);
            }
            setBackgroundColor(0);
            this.c = null;
        }
        setMediaController(null);
        this.b = null;
        e7 e7Var = this.d;
        if (e7Var != null) {
            Intrinsics.checkNotNullParameter(this, "mp");
            g5 g5Var2 = e7Var.a.b;
            if (g5Var2 != null) {
                g5Var2.a("MraidMediaProcessor", ">>> onPlayerCompleted");
            }
            ViewGroup viewContainer = getViewContainer();
            if (viewContainer != null) {
                ViewParent parent3 = viewContainer.getParent();
                ViewGroup viewGroup4 = parent3 instanceof ViewGroup ? (ViewGroup) parent3 : null;
                if (viewGroup4 != null) {
                    viewGroup4.removeView(viewContainer);
                }
            }
            setViewContainer(null);
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("com.inmobi", this, me);
        return super.dispatchTouchEvent(me);
    }

    public final int getCurrentAudioVolume() {
        return this.g;
    }

    @Override // android.view.View
    public final String getId() {
        return this.h;
    }

    public final U6 getListener() {
        return this.d;
    }

    public final int getMCurrentPosition() {
        return this.k;
    }

    public final String getPlaybackUrl() {
        return this.i;
    }

    public final int getPreviousPosition() {
        return this.j;
    }

    public final ViewGroup getViewContainer() {
        return this.c;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f.get() == null || !Intrinsics.areEqual(this.f.get(), activity)) {
            return;
        }
        this.e = false;
        start();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Activity activity2 = (Activity) this.f.get();
        if (activity2 == null || !Intrinsics.areEqual(activity2, activity)) {
            return;
        }
        this.e = true;
        if (getCurrentPosition() != 0) {
            this.k = getCurrentPosition();
        }
        pause();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/V6;->onCompletion(Landroid/media/MediaPlayer;)V");
        CreativeInfoManager.onVideoCompleted("com.inmobi", mediaPlayer, "media-player");
        safedk_V6_onCompletion_c5377e63b4d73655f9c3782a922d449a(mediaPlayer);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Intrinsics.checkNotNullParameter(mediaPlayer, "mp");
        g5 g5Var = this.a;
        if (g5Var != null) {
            g5Var.b("MediaRenderView", ">>> onError (" + i + ", " + i2 + ')');
        }
        b();
        return false;
    }

    @Override // android.widget.VideoView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getHolder().setSizeFromLayout();
    }

    @Override // android.widget.VideoView, android.view.SurfaceView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        Intrinsics.checkNotNullParameter(mediaPlayer, "mp");
        g5 g5Var = this.a;
        if (g5Var != null) {
            g5Var.a("MediaRenderView", ">>> onPrepared");
        }
        mediaPlayer.setOnVideoSizeChangedListener(new V6$.ExternalSyntheticLambda0(this));
        int i = this.k;
        if (i < getDuration()) {
            this.k = i;
            seekTo(i);
        }
        e7 e7Var = this.d;
        if (e7Var != null) {
            Intrinsics.checkNotNullParameter(this, "mp");
            g5 g5Var2 = e7Var.a.b;
            if (g5Var2 != null) {
                g5Var2.a("MraidMediaProcessor", ">>> onPlayerPrepared");
            }
        }
        start();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onVisibilityChanged(view, i);
        g5 g5Var = this.a;
        if (g5Var != null) {
            g5Var.a("MediaRenderView", ">>> onVisibilityChanged (" + i + ')');
        }
        if (i == 0) {
            if (Build.VERSION.SDK_INT < 16) {
                setBackgroundDrawable(new BitmapDrawable((Bitmap) null));
                return;
            }
            Context contextD = Kb.d();
            if (contextD != null) {
                setBackground(new BitmapDrawable(contextD.getResources(), (Bitmap) null));
            }
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        g5 g5Var = this.a;
        if (g5Var != null) {
            g5Var.a("MediaRenderView", ">>> onWindowVisibilityChanged (" + i + ')');
        }
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        g5 g5Var = this.a;
        if (g5Var != null) {
            g5Var.a("MediaRenderView", "Pause media playback");
        }
        super.pause();
    }

    public void safedk_V6_onCompletion_c5377e63b4d73655f9c3782a922d449a(MediaPlayer p0) {
        Intrinsics.checkNotNullParameter(p0, "mp");
        g5 g5Var = this.a;
        if (g5Var != null) {
            g5Var.a("MediaRenderView", ">>> onCompletion");
        }
    }

    public final void setAudioMuted(boolean z) {
    }

    public final void setCurrentAudioVolume(int i) {
        this.g = i;
    }

    public final void setId(String str) {
        this.h = str;
    }

    public final void setListener(U6 u6) {
        this.d = u6;
    }

    public final void setMCurrentPosition(int i) {
        this.k = i;
    }

    public final void setPlaybackUrl(String str) {
        this.i = str;
    }

    public final void setPlayerPrepared(boolean z) {
    }

    public final void setPreviousPosition(int i) {
        this.j = i;
    }

    public final void setViewContainer(ViewGroup viewGroup) {
        this.c = viewGroup;
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public final void start() {
        if (this.e) {
            return;
        }
        g5 g5Var = this.a;
        if (g5Var != null) {
            g5Var.a("MediaRenderView", "Start media playback");
        }
        safedk_videoview_V6_VideoViewPlay_1cd25093e0b187dede2869d94281a264();
    }

    public final void setPlaybackData(String str) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "url");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            if (((byte) (b & (-128))) > 0) {
                StringBuilder sbAppend = sb.append("%");
                char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', GMTDateParser.DAY_OF_MONTH, 'e', 'f'};
                sbAppend.append(new String(new char[]{cArr[(b >> 4) & 15], cArr[(byte) (b & 15)]}));
            } else {
                sb.append((char) b);
            }
        }
        try {
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            byte[] bytes2 = string.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
            str2 = new String(bytes2, Charsets.ISO_8859_1);
        } catch (UnsupportedEncodingException unused) {
            str2 = BuildConfig.FLAVOR;
        }
        this.i = str2;
        this.h = "anonymous";
    }

    public final void a() {
        InMobiVideoBridge.VideoViewSetVideoPath(this, this.i);
        setOnCompletionListener(this);
        setOnPreparedListener(this);
        setOnErrorListener(this);
        if (this.b != null || Build.VERSION.SDK_INT < 19) {
            return;
        }
        T6 t6 = new T6(getContext());
        this.b = t6;
        t6.setAnchorView(this);
        setMediaController(this.b);
    }
}
