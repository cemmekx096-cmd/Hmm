package com.my.target.instreamads.postview.models;

import com.my.target.common.models.ImageData;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class PostViewData {
    public final ImageData a;
    public final String b;
    public final double c;
    public final Integer d;

    public PostViewData(ImageData imageData, String str, double d, Integer num) {
        this.a = imageData;
        this.b = str;
        this.c = d;
        this.d = num;
    }

    public static PostViewData a(ImageData imageData, String str, double d, Integer num) {
        return new PostViewData(imageData, str, d, num);
    }

    public ImageData getBackgroundImage() {
        return this.a;
    }

    public double getDuration() {
        return this.c;
    }

    public Integer getOverlay() {
        return this.d;
    }

    public String getText() {
        return this.b;
    }
}
