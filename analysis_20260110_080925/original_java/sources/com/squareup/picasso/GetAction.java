package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
class GetAction extends Action<Void> {
    void complete(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
    }

    public void error(Exception exc) {
    }

    GetAction(Picasso picasso, Request request, int i, int i2, Object obj, String str) {
        super(picasso, (Object) null, request, i, i2, 0, (Drawable) null, str, obj, false);
    }
}
