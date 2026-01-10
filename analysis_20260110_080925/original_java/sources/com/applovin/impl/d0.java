package com.applovin.impl;

import android.app.Activity;
import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.View;
import com.applovin.impl.d0$;
import com.applovin.impl.sdk.o;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class d0 {
    private final com.applovin.impl.sdk.k a;
    private final o b;
    private final long c;
    private final long d;
    private final int e;
    private final int f;
    private final int g;
    private Handler k;
    private HandlerThread l;
    private c n;
    private WeakReference h = new WeakReference(null);
    private int i = 0;
    private Integer j = null;
    private final Runnable m = new d0$.ExternalSyntheticLambda2(this);

    class b implements PixelCopy.OnPixelCopyFinishedListener {
        final /* synthetic */ d a;
        final /* synthetic */ Bitmap b;

        b(d dVar, Bitmap bitmap) {
            this.a = dVar;
            this.b = bitmap;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public void onPixelCopyFinished(int i) {
            if (i == 0) {
                this.a.a(this.b);
                return;
            }
            o unused = d0.this.b;
            if (o.a()) {
                d0.this.b.b("BlackViewDetector", "Failed to capture screenshot with error code: " + i);
            }
            this.a.a(true);
        }
    }

    public interface c {
        void a(View view);
    }

    private interface d {
        void a(Bitmap bitmap);

        void a(boolean z);
    }

    public d0(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.b = kVar.O();
        this.c = ((Long) kVar.a(l4.H5)).longValue();
        this.d = ((Long) kVar.a(l4.G5)).longValue();
        this.e = ((Integer) kVar.a(l4.I5)).intValue();
        this.f = ((Integer) kVar.a(l4.J5)).intValue();
        this.g = ((Integer) kVar.a(l4.K5)).intValue();
    }

    static /* synthetic */ int e(d0 d0Var) {
        int i = d0Var.i;
        d0Var.i = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.n = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        long j = this.c;
        if (j <= 0) {
            if (this.i == 1) {
                e();
            }
            g();
        } else {
            if (this.i > 1) {
                e();
                g();
                return;
            }
            Handler handler = this.k;
            if (handler != null) {
                handler.postDelayed(this.m, j);
                return;
            }
            if (o.a()) {
                this.b.k("BlackViewDetector", "Monitoring handler was unexpectedly null");
            }
            g();
        }
    }

    private void e() {
        View view = (View) this.h.get();
        if (o.a()) {
            this.b.k("BlackViewDetector", "Detected black view: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new d0$.ExternalSyntheticLambda1(this, view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.i = 0;
        this.j = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.h.get() != null) {
            if (o.a()) {
                this.b.a("BlackViewDetector", "Stopped monitoring view: " + this.h.get());
            }
            this.h.clear();
        }
        Handler handler = this.k;
        if (handler != null) {
            handler.removeCallbacks(this.m);
            this.k = null;
        }
        if (this.n != null) {
            AppLovinSdkUtils.runOnUiThread(new d0$.ExternalSyntheticLambda0(this));
        }
    }

    public void b() {
        g();
        HandlerThread handlerThread = this.l;
        if (handlerThread != null) {
            handlerThread.quit();
            this.l = null;
        }
    }

    public void a(View view, c cVar) {
        if (((Boolean) this.a.a(l4.F5)).booleanValue()) {
            View view2 = (View) this.h.get();
            if (view2 != null) {
                if (o.a()) {
                    this.b.k("BlackViewDetector", "Monitoring is already in progress for a view: " + view2);
                    return;
                }
                return;
            }
            if (o.a()) {
                this.b.a("BlackViewDetector", "Started monitoring view: " + view);
            }
            try {
                if (this.l == null) {
                    HandlerThread handlerThread = new HandlerThread("AppLovinSdk:black_view_detector");
                    this.l = handlerThread;
                    handlerThread.start();
                } else {
                    this.a.E().a(y1.q0, "BlackViewDetector:maybeStartMonitoring() unexpectedly called multiple times");
                    g();
                }
                this.n = cVar;
                this.h = new WeakReference(view);
                f();
                Handler handler = new Handler(this.l.getLooper());
                this.k = handler;
                handler.postDelayed(this.m, this.d);
            } catch (Throwable th) {
                g();
                this.a.E().a("BlackViewDetector", "maybeStartMonitoring", th);
            }
        }
    }

    class a implements d {
        a() {
        }

        @Override // com.applovin.impl.d0.d
        public void a(Bitmap bitmap) {
            try {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i = width / d0.this.e;
                int i2 = height / d0.this.e;
                int i3 = i / 2;
                for (int i4 = i2 / 2; i4 < height; i4 += i2) {
                    for (int i5 = i3; i5 < width; i5 += i) {
                        int pixel = bitmap.getPixel(i5, i4);
                        if (d0.this.a(pixel)) {
                            bitmap.recycle();
                            d0.this.f();
                            d0.this.d();
                            return;
                        }
                        if (d0.this.j == null) {
                            d0.this.j = Integer.valueOf(pixel);
                        }
                    }
                }
                d0.e(d0.this);
                bitmap.recycle();
                d0.this.d();
            } catch (Exception e) {
                d0.this.a.E().a("BlackViewDetector", "onScreenshotCaptured", e);
                d0.this.g();
            }
        }

        @Override // com.applovin.impl.d0.d
        public void a(boolean z) {
            if (z) {
                d0.this.g();
            } else {
                d0.this.d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ActivityManager.MemoryInfo memoryInfoA;
        View view = (View) this.h.get();
        if (view == null) {
            if (o.a()) {
                this.b.k("BlackViewDetector", "Monitored view no longer exists.");
            }
            g();
            return;
        }
        Long l = (Long) this.a.a(l4.O5);
        if (l.longValue() > 0 && (memoryInfoA = a7.a((ActivityManager) com.applovin.impl.sdk.k.o().getSystemService("activity"))) != null && memoryInfoA.availMem < l.longValue()) {
            if (o.a()) {
                this.b.k("BlackViewDetector", "Cancelling black view detection due to low memory");
                return;
            }
            return;
        }
        if (o.a()) {
            this.b.a("BlackViewDetector", "Checking for black view: " + view);
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth != 0 && measuredHeight != 0) {
            a(view, new a());
            return;
        }
        if (o.a()) {
            this.b.k("BlackViewDetector", "Monitored view is not visible due to dimensions (width = " + measuredWidth + ", height = " + measuredHeight + ")");
        }
        f();
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        c cVar = this.n;
        if (cVar != null) {
            cVar.a(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(int r9) {
        /*
            r8 = this;
            int r0 = android.graphics.Color.red(r9)
            int r1 = android.graphics.Color.green(r9)
            int r9 = android.graphics.Color.blue(r9)
            java.lang.Integer r2 = r8.j
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L4e
            int r2 = r2.intValue()
            int r2 = android.graphics.Color.red(r2)
            java.lang.Integer r5 = r8.j
            int r5 = r5.intValue()
            int r5 = android.graphics.Color.green(r5)
            java.lang.Integer r6 = r8.j
            int r6 = r6.intValue()
            int r6 = android.graphics.Color.blue(r6)
            int r2 = r0 - r2
            int r2 = java.lang.Math.abs(r2)
            int r7 = r8.g
            if (r2 > r7) goto L4c
            int r2 = r1 - r5
            int r2 = java.lang.Math.abs(r2)
            int r5 = r8.g
            if (r2 > r5) goto L4c
            int r2 = r9 - r6
            int r2 = java.lang.Math.abs(r2)
            int r5 = r8.g
            if (r2 <= r5) goto L4e
        L4c:
            r2 = r3
            goto L4f
        L4e:
            r2 = r4
        L4f:
            int r5 = r8.f
            if (r0 > r5) goto L5b
            if (r1 > r5) goto L5b
            if (r9 > r5) goto L5b
            if (r2 == 0) goto L5a
            goto L5b
        L5a:
            r3 = r4
        L5b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.d0.a(int):boolean");
    }

    private void a(View view, d dVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            Activity activityA = this.a.e().a();
            if (activityA == null) {
                if (o.a()) {
                    this.b.b("BlackViewDetector", "Failed to capture screenshot due to no active activity");
                }
                dVar.a(false);
                return;
            }
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            Rect rect = new Rect(i, i2, i + measuredWidth, i2 + measuredHeight);
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                PixelCopy.request(activityA.getWindow(), rect, bitmapCreateBitmap, new b(dVar, bitmapCreateBitmap), new Handler());
                return;
            } catch (Throwable th) {
                if (o.a()) {
                    this.b.b("BlackViewDetector", "Failed to capture screenshot due to exception: " + th);
                }
                dVar.a(true);
                return;
            }
        }
        if (o.a()) {
            this.b.k("BlackViewDetector", "Unable to capture screenshots on views below API 26");
        }
        dVar.a(true);
    }
}
