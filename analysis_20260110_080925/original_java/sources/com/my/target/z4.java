package com.my.target;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.media3.exoplayer.RendererCapabilities;
import com.my.target.d;
import com.my.target.k5;
import com.my.target.m6;
import com.my.target.z4$;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class z4 implements k5, m6.a {
    public final e1 a;
    public final q6 b;
    public final m6 c;
    public final WeakReference d;
    public final Context e;
    public final Handler f;
    public final c g;
    public final i h;
    public String i;
    public Integer j;
    public f k;
    public r6 l;
    public k5.a m;
    public i4 n;
    public boolean o;
    public long p;
    public long q;
    public boolean r;
    public boolean s;
    public o6 t;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            z4.this.f();
        }
    }

    public class b implements d.a {
        public final /* synthetic */ com.my.target.b a;

        public b(com.my.target.b bVar) {
            this.a = bVar;
        }

        @Override // com.my.target.d.a
        public void a(Context context) {
            k5.a aVar = z4.this.m;
            if (aVar != null) {
                aVar.a(this.a, context);
            }
        }
    }

    public static class c implements Runnable {
        public final e1 a;

        public c(e1 e1Var) {
            this.a = e1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            fb.a("InterstitialMraidPresenter$ShowCloseButtonRunnable: Banner became just closeable");
            this.a.setCloseVisible(true);
        }
    }

    public z4(Context context) {
        this(m6.b("interstitial"), new Handler(Looper.getMainLooper()), new e1(context), context);
    }

    private boolean h() {
        r6 r6Var;
        Activity activity = (Activity) this.d.get();
        if (activity == null || (r6Var = this.l) == null) {
            return false;
        }
        return hb.a(activity, r6Var);
    }

    private void k() {
        DisplayMetrics displayMetrics = this.e.getResources().getDisplayMetrics();
        this.b.a(displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.b.b(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.b.a(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.b.c(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public final boolean a(int i, int i2) {
        return (i & i2) != 0;
    }

    public void b(String str) {
        r6 r6Var = new r6(this.e);
        this.l = r6Var;
        this.c.a(r6Var);
        this.a.addView(this.l, new FrameLayout.LayoutParams(-1, -1));
        this.c.f(str);
    }

    public void c() {
        this.r = true;
    }

    public boolean d() {
        fb.a("InterstitialMraidPresenter: Resize method not used with interstitials");
        return false;
    }

    public void destroy() {
        a(0);
    }

    public boolean e() {
        if (!"none".equals(this.t.toString())) {
            return b(this.t.a());
        }
        if (this.s) {
            i();
            return true;
        }
        Activity activity = (Activity) this.d.get();
        if (activity != null) {
            return b(hb.a(activity));
        }
        this.c.a("setOrientationProperties", "Unable to set MRAID expand orientation to 'none'; expected passed in Activity Context.");
        return false;
    }

    public void f() {
        com.my.target.c cVarA;
        i4 i4Var = this.n;
        if (i4Var == null || (cVarA = i4Var.a()) == null) {
            return;
        }
        f fVar = this.k;
        if (fVar == null || !fVar.b()) {
            Activity activity = (Activity) this.d.get();
            if (fVar == null || activity == null) {
                x3.a(cVarA.b(), this.e);
            } else {
                fVar.a(activity);
            }
        }
    }

    public void g() {
        if (this.l == null || "loading".equals(this.i) || "hidden".equals(this.i)) {
            return;
        }
        i();
        if ("default".equals(this.i)) {
            this.a.setVisibility(4);
            c("hidden");
        }
    }

    public View getCloseButton() {
        return null;
    }

    public void i() {
        Integer num;
        Activity activity = (Activity) this.d.get();
        if (activity != null && (num = this.j) != null) {
            activity.setRequestedOrientation(num.intValue());
        }
        this.j = null;
    }

    public View j() {
        return this.a;
    }

    public void pause() {
        this.o = true;
        r6 r6Var = this.l;
        if (r6Var != null) {
            r6Var.a(false);
        }
        this.f.removeCallbacks(this.g);
        if (this.q > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.q;
            if (jCurrentTimeMillis > 0) {
                long j = this.p;
                if (jCurrentTimeMillis < j) {
                    this.p = j - jCurrentTimeMillis;
                    return;
                }
            }
            this.p = 0L;
        }
    }

    public void resume() {
        this.o = false;
        r6 r6Var = this.l;
        if (r6Var != null) {
            r6Var.e();
        }
        long j = this.p;
        if (j > 0) {
            a(j);
        }
    }

    public void stop() {
        this.o = true;
        r6 r6Var = this.l;
        if (r6Var != null) {
            r6Var.a(false);
        }
    }

    public z4(m6 m6Var, Handler handler, e1 e1Var, Context context) {
        this.s = true;
        this.t = o6.b();
        this.c = m6Var;
        this.e = context.getApplicationContext();
        this.f = handler;
        this.a = e1Var;
        this.d = context instanceof Activity ? new WeakReference((Activity) context) : new WeakReference(null);
        this.i = "loading";
        this.b = q6.e();
        e1Var.setOnCloseListener(new z4$.ExternalSyntheticLambda0(this));
        this.g = new c(e1Var);
        this.h = new i(context);
        m6Var.a(this);
    }

    private void c(String str) {
        i4 i4Var;
        fb.a("InterstitialMraidPresenter: MRAID state set to " + str);
        this.i = str;
        this.c.e(str);
        if ("hidden".equals(str)) {
            fb.a("InterstitialMraidPresenter: Mraid on close");
            k5.a aVar = this.m;
            if (aVar == null || (i4Var = this.n) == null) {
                return;
            }
            aVar.b(i4Var, this.e);
        }
    }

    public void a(int i) {
        r6 r6Var;
        this.f.removeCallbacks(this.g);
        if (!this.o) {
            this.o = true;
            if (i <= 0 && (r6Var = this.l) != null) {
                r6Var.a(true);
            }
        }
        ViewParent parent = this.a.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.a);
        }
        this.c.a();
        r6 r6Var2 = this.l;
        if (r6Var2 != null) {
            r6Var2.a(i);
            this.l = null;
        }
        this.a.removeAllViews();
    }

    public boolean b(int i) {
        Activity activity = (Activity) this.d.get();
        if (activity == null || !a(this.t)) {
            this.c.a("setOrientationProperties", "Attempted to lock orientation to unsupported value: " + this.t.toString());
            return false;
        }
        if (this.j == null) {
            this.j = Integer.valueOf(activity.getRequestedOrientation());
        }
        activity.setRequestedOrientation(i);
        return true;
    }

    private void a(com.my.target.b bVar) {
        com.my.target.c cVarA = bVar.a();
        if (cVarA == null) {
            this.h.setVisibility(8);
            return;
        }
        if (this.h.getParent() != null) {
            return;
        }
        int iA = hb.a(10, this.e);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(iA, iA, iA, iA);
        this.a.addView(this.h, layoutParams);
        this.h.setImageBitmap(cVarA.c().getBitmap());
        this.h.setOnClickListener(new a());
        List listA = cVarA.a();
        if (listA == null) {
            return;
        }
        f fVarA = f.a(listA, new p1());
        this.k = fVarA;
        fVarA.a(new b(bVar));
    }

    public void b() {
        g();
    }

    public static z4 a(Context context) {
        return new z4(context);
    }

    public boolean b(Uri uri) {
        fb.a("InterstitialMraidPresenter: Expand method not used with interstitials");
        return false;
    }

    public boolean a(ConsoleMessage consoleMessage, m6 m6Var) {
        fb.a("InterstitialMraidPresenter: Console message - " + consoleMessage.message());
        return true;
    }

    public boolean a(String str, JsResult jsResult) {
        fb.a("InterstitialMraidPresenter: JS Alert - " + str);
        jsResult.confirm();
        return true;
    }

    public void a(Uri uri) {
        k5.a aVar = this.m;
        if (aVar != null) {
            aVar.a(this.n, uri.toString(), 1, this.a.getContext());
        }
    }

    public void a() {
        k();
    }

    public void a(m6 m6Var, WebView webView) {
        i4 i4Var;
        this.i = "default";
        k();
        ArrayList arrayList = new ArrayList();
        if (h()) {
            arrayList.add("'inlineVideo'");
        }
        arrayList.add("'vpaid'");
        m6Var.a(arrayList);
        m6Var.d("interstitial");
        m6Var.a(m6Var.c());
        c("default");
        m6Var.d();
        m6Var.a(this.b);
        k5.a aVar = this.m;
        if (aVar == null || (i4Var = this.n) == null) {
            return;
        }
        aVar.a(i4Var, this.a);
        this.m.a(webView);
    }

    public boolean a(float f, float f2) {
        k5.a aVar;
        i4 i4Var;
        if (!this.r) {
            this.c.a("playheadEvent", "Calling VPAID command before VPAID init");
            return false;
        }
        if (f < 0.0f || f2 < 0.0f || (aVar = this.m) == null || (i4Var = this.n) == null) {
            return true;
        }
        aVar.a(i4Var, f, f2, this.e);
        return true;
    }

    public boolean a(int i, int i2, int i3, int i4, boolean z, int i5) {
        fb.a("InterstitialMraidPresenter: SetResizeProperties method not used with interstitials");
        return false;
    }

    public boolean a(boolean z, o6 o6Var) {
        if (!a(o6Var)) {
            this.c.a("setOrientationProperties", "Unable to force orientation to " + o6Var);
            return false;
        }
        this.s = z;
        this.t = o6Var;
        return e();
    }

    public void a(boolean z) {
        this.c.a(z);
    }

    public boolean a(String str) {
        if (!this.r) {
            this.c.a("vpaidEvent", "Calling VPAID command before VPAID init");
            return false;
        }
        k5.a aVar = this.m;
        boolean z = aVar != null;
        i4 i4Var = this.n;
        if ((i4Var != null) & z) {
            aVar.a(i4Var, str, this.e);
        }
        return true;
    }

    public void a(s4 s4Var, i4 i4Var) {
        this.n = i4Var;
        long jL = (long) (i4Var.L() * 1000.0f);
        this.p = jL;
        if (jL > 0) {
            this.a.setCloseVisible(false);
            fb.a("InterstitialMraidPresenter: Banner will be allowed to close in " + this.p + " millis");
            a(this.p);
        } else {
            fb.a("InterstitialMraidPresenter: Banner is allowed to close");
            this.a.setCloseVisible(true);
        }
        String strQ = i4Var.Q();
        if (strQ != null) {
            b(strQ);
        }
        a((com.my.target.b) i4Var);
    }

    public void a(k5.a aVar) {
        this.m = aVar;
    }

    public boolean a(o6 o6Var) {
        if ("none".equals(o6Var.toString())) {
            return true;
        }
        Activity activity = (Activity) this.d.get();
        if (activity == null) {
            return false;
        }
        try {
            ActivityInfo activityInfo = activity.getPackageManager().getActivityInfo(new ComponentName(activity, activity.getClass()), 0);
            int i = activityInfo.screenOrientation;
            return i != -1 ? i == o6Var.a() : a(activityInfo.configChanges, RendererCapabilities.DECODER_SUPPORT_PRIMARY) && a(activityInfo.configChanges, RendererCapabilities.AUDIO_OFFLOAD_GAPLESS_SUPPORTED);
        } catch (Throwable unused) {
            return false;
        }
    }

    private void a(long j) {
        this.f.removeCallbacks(this.g);
        this.q = System.currentTimeMillis();
        this.f.postDelayed(this.g, j);
    }
}
