package com.inmobi.media;

import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class V0 implements v4 {
    public final AnimatedImageDrawable a;

    public V0(String str) throws IOException {
        Intrinsics.checkNotNullParameter(str, "filePath");
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(new File(str)));
        Intrinsics.checkNotNull(drawableDecodeDrawable, "null cannot be cast to non-null type android.graphics.drawable.AnimatedImageDrawable");
        this.a = (AnimatedImageDrawable) drawableDecodeDrawable;
    }

    public final void a(x4 x4Var) {
    }

    public final void a(boolean z) {
    }

    public final void b() {
    }

    public final boolean c() {
        return this.a.isRunning();
    }

    public final int d() {
        return this.a.getIntrinsicWidth();
    }

    public final void e() {
        this.a.start();
    }

    public final void start() {
        this.a.registerAnimationCallback(new U0(this));
        this.a.start();
    }

    public final int a() {
        return this.a.getIntrinsicHeight();
    }

    public final void a(Canvas canvas, float f, float f2) {
        Intrinsics.checkNotNull(canvas);
        canvas.translate(f, f2);
        this.a.draw(canvas);
    }
}
