package com.inmobi.media;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class K8 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ L8 a;

    public K8(L8 l8) {
        this.a = l8;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(surfaceTexture, "texture");
        this.a.b = new Surface(surfaceTexture);
        this.a.e();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Intrinsics.checkNotNullParameter(surfaceTexture, "texture");
        Surface surface = this.a.b;
        if (surface != null) {
            surface.release();
        }
        L8 l8 = this.a;
        l8.b = null;
        E8 e8 = l8.n;
        if (e8 != null) {
            e8.c();
        }
        this.a.g();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) throws IllegalStateException {
        g8 g8Var;
        Intrinsics.checkNotNullParameter(surfaceTexture, "surface");
        g8 mediaPlayer = this.a.getMediaPlayer();
        boolean z = mediaPlayer != null && mediaPlayer.b == 3;
        boolean z2 = i > 0 && i2 > 0;
        if (z && z2) {
            Object tag = this.a.getTag();
            if (tag instanceof C8) {
                Object obj = ((D7) ((C8) tag)).t.get("seekPosition");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue != 0) {
                    L8 l8 = this.a;
                    if (l8.a() && (g8Var = l8.c) != null) {
                        g8Var.seekTo(iIntValue);
                    }
                }
            }
            this.a.start();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Intrinsics.checkNotNullParameter(surfaceTexture, "texture");
    }
}
