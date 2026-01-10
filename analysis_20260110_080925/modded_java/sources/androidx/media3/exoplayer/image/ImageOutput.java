package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public interface ImageOutput {
    void onDisabled();

    void onImageAvailable(long j, Bitmap bitmap);
}
