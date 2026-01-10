package com.applovin.impl.sdk.nativeAd;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.a2;
import com.applovin.impl.l4;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.w4;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class a extends w4 {
    private final AppLovinNativeAdImpl g;
    private final InterfaceC0004a h;

    /* renamed from: com.applovin.impl.sdk.nativeAd.a$a, reason: collision with other inner class name */
    public interface InterfaceC0004a {
        void a(AppLovinNativeAdImpl appLovinNativeAdImpl);
    }

    public a(AppLovinNativeAdImpl appLovinNativeAdImpl, k kVar, InterfaceC0004a interfaceC0004a) {
        super("TaskCacheNativeAd", kVar);
        this.g = appLovinNativeAdImpl;
        this.h = interfaceC0004a;
    }

    private float a(Uri uri) throws IOException {
        FileInputStream fileInputStream;
        int i;
        int i2;
        File file = new File(uri.getPath());
        if (!file.exists()) {
            return -1.0f;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(fileInputStream, null, options);
                i = options.outWidth;
                i2 = options.outHeight;
            } finally {
            }
        } catch (IOException e) {
            if (o.a()) {
                ((w4) this).c.a(((w4) this).b, "Failed to calculate aspect ratio", e);
            }
        }
        if (i <= 0 || i2 <= 0) {
            fileInputStream.close();
            return -1.0f;
        }
        float f = i / i2;
        fileInputStream.close();
        return f;
    }

    private Uri b(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (o.a()) {
            ((w4) this).c.a(((w4) this).b, "Attempting to cache resource: " + uri);
        }
        String strA = ((w4) this).a.H().a(a(), uri.toString(), this.g.getCachePrefix(), Collections.emptyList(), false, false, 1, (String) ((w4) this).a.a(l4.k4), a2.a(this.g));
        if (TextUtils.isEmpty(strA)) {
            if (o.a()) {
                ((w4) this).c.b(((w4) this).b, "Unable to cache resource for uri: " + uri);
            }
            return null;
        }
        File fileA = ((w4) this).a.H().a(strA, a());
        if (fileA == null) {
            if (o.a()) {
                ((w4) this).c.b(((w4) this).b, "Unable to retrieve File from cached image filename = " + strA);
            }
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileA);
        if (uriFromFile != null) {
            return uriFromFile;
        }
        if (o.a()) {
            ((w4) this).c.b(((w4) this).b, "Unable to extract Uri from image file");
        }
        return null;
    }

    public void run() throws IOException {
        if (o.a()) {
            ((w4) this).c.a(((w4) this).b, "Begin caching ad #" + this.g.getAdIdNumber() + "...");
        }
        Uri uriB = b(this.g.getIconUri());
        if (uriB != null) {
            this.g.setIconUri(uriB);
        }
        Uri uriB2 = b(this.g.getMainImageUri());
        if (uriB2 != null) {
            this.g.setMainImageUri(uriB2);
            float fA = a(uriB2);
            if (fA > 0.0f) {
                this.g.setMainImageAspectRatio(fA);
            }
        }
        Uri uriB3 = b(this.g.getPrivacyIconUri());
        if (uriB3 != null) {
            this.g.setPrivacyIconUri(uriB3);
        }
        if (o.a()) {
            ((w4) this).c.a(((w4) this).b, "Finished caching ad #" + this.g.getAdIdNumber());
        }
        this.h.a(this.g);
    }
}
