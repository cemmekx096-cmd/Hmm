package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import com.bytedance.sdk.component.Cc.EV;
import com.bytedance.sdk.component.Cc.zPa;
import java.lang.ref.WeakReference;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class wPn implements zPa {
    private final WeakReference<ImageView> IlO;

    public wPn(ImageView imageView) {
        this.IlO = new WeakReference<>(imageView);
    }

    public void IlO(EV ev) {
        ImageView imageView = this.IlO.get();
        if (imageView == null) {
            return;
        }
        try {
            Object objMY = ev.MY();
            if (objMY instanceof Bitmap) {
                imageView.setImageBitmap((Bitmap) objMY);
                return;
            }
            if (objMY instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && (objMY instanceof AnimatedImageDrawable)) {
                    ((AnimatedImageDrawable) objMY).start();
                }
                imageView.setImageDrawable((Drawable) objMY);
                return;
            }
            imageView.setVisibility(8);
        } catch (Throwable unused) {
            imageView.setVisibility(8);
        }
    }

    public void IlO(int i, String str, Throwable th) {
        ImageView imageView = this.IlO.get();
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
    }
}
