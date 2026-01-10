package com.my.target;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.e1;
import com.my.target.k;
import com.my.target.m6;
import com.my.target.p6$d$;
import com.my.target.p6$e$;
import com.my.target.va;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class p6 implements va, k.a {
    public final l1 a;
    public final Context b;
    public final q6 c;
    public final e1.a d;
    public final a e;
    public final m6.a f;
    public final m6 g;
    public final WeakReference h;
    public String i;
    public m6 j;
    public r6 k;
    public va.a l;
    public c m;
    public ma n;
    public boolean o;
    public e1 p;
    public k q;
    public ViewGroup r;
    public f s;
    public r6 t;
    public Uri u;
    public e v;

    public final class a implements View.OnLayoutChangeListener {
        public final m6 a;

        public a(m6 m6Var) {
            this.a = m6Var;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            p6 p6Var = p6.this;
            p6Var.s = null;
            p6Var.b();
            this.a.a(p6.this.c);
        }
    }

    public final class b implements e1.a {
        public b() {
        }

        public void b() {
            k kVar = p6.this.q;
            if (kVar != null) {
                kVar.dismiss();
            }
        }
    }

    public interface c {
        void a();

        void a(float f, float f2, ma maVar, Context context);

        void a(IAdLoadingError iAdLoadingError);

        void a(String str, ma maVar, Context context);

        void b();

        void d();
    }

    public static final class d implements Runnable {
        public final m6 a;
        public final ma b;
        public final Context c;
        public final k d;
        public final Uri e;

        public d(ma maVar, k kVar, Uri uri, m6 m6Var, Context context) {
            this.b = maVar;
            this.c = context.getApplicationContext();
            this.d = kVar;
            this.e = uri;
            this.a = m6Var;
        }

        public final /* synthetic */ void a(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.a.f(str);
            } else {
                this.a.a("expand", "Failed to handling mraid");
                this.d.dismiss();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            f0.f(new p6$d$.ExternalSyntheticLambda0(this, f1.a(this.b.L(), (String) j2.a().a(this.e.toString(), (String) null, this.c).c())));
        }
    }

    public final class e implements m6.a {
        public final m6 a;
        public final String b;

        public e(m6 m6Var, String str) {
            this.a = m6Var;
            this.b = str;
        }

        public void a() {
        }

        public boolean a(ConsoleMessage consoleMessage, m6 m6Var) {
            fb.a("MraidPresenter$MyMraidBridgeListener: Console message: from " + (m6Var == p6.this.j ? " second " : " primary ") + "webview: " + consoleMessage.message());
            return true;
        }

        public void b() {
            k kVar = p6.this.q;
            if (kVar != null) {
                kVar.dismiss();
            }
        }

        public void c() {
            p6.this.o = true;
        }

        public boolean d() {
            r6 r6Var;
            if (!p6.this.i.equals("default")) {
                fb.a("MraidPresenter$MyMraidBridgeListener: Unable to resize - wrong state for resize - " + p6.this.i);
                this.a.a("resize", "wrong state for resize " + p6.this.i);
                return false;
            }
            p6 p6Var = p6.this;
            f fVar = p6Var.s;
            if (fVar == null) {
                fb.a("MraidPresenter$MyMraidBridgeListener: Unable to resize - resize properties not set");
                this.a.a("resize", "resize properties not set");
                return false;
            }
            ViewGroup viewGroup = p6Var.r;
            if (viewGroup == null || (r6Var = p6Var.k) == null) {
                fb.a("MraidPresenter$MyMraidBridgeListener: Unable to resize - views not initialized");
                this.a.a("resize", "views not initialized");
                return false;
            }
            if (!fVar.a(viewGroup, r6Var)) {
                fb.a("MraidPresenter$MyMraidBridgeListener: Unable to resize - views not visible");
                this.a.a("resize", "views not visible");
                return false;
            }
            p6.this.p = new e1(p6.this.b);
            p6 p6Var2 = p6.this;
            p6Var2.s.a(p6Var2.p);
            p6 p6Var3 = p6.this;
            if (!p6Var3.s.b(p6Var3.p)) {
                fb.a("MraidPresenter$MyMraidBridgeListener: Unable to resize - close button is out of visible range");
                this.a.a("resize", "close button is out of visible range");
                p6.this.p = null;
                return false;
            }
            ViewGroup viewGroup2 = (ViewGroup) p6.this.k.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(p6.this.k);
            }
            p6 p6Var4 = p6.this;
            p6Var4.p.addView(p6Var4.k, new FrameLayout.LayoutParams(-1, -1));
            p6.this.p.setOnCloseListener(new p6$e$.ExternalSyntheticLambda0(this));
            p6 p6Var5 = p6.this;
            p6Var5.r.addView(p6Var5.p);
            p6.this.a("resized");
            c cVar = p6.this.m;
            if (cVar == null) {
                return true;
            }
            cVar.b();
            return true;
        }

        public void e() {
            p6 p6Var = p6.this;
            e1 e1Var = p6Var.p;
            if (e1Var == null || p6Var.k == null) {
                return;
            }
            if (e1Var.getParent() != null) {
                ((ViewGroup) p6.this.p.getParent()).removeView(p6.this.p);
                p6.this.p.removeAllViews();
                p6.this.p.setOnCloseListener((e1.a) null);
                p6 p6Var2 = p6.this;
                p6Var2.p = null;
                p6Var2.a(p6Var2.k);
                p6.this.a("default");
            }
            c cVar = p6.this.m;
            if (cVar != null) {
                cVar.d();
            }
        }

        public boolean a(String str, JsResult jsResult) {
            fb.a("MraidPresenter$MyMraidBridgeListener: JS Alert - " + str);
            jsResult.confirm();
            return true;
        }

        public boolean b(Uri uri) {
            return p6.this.a(uri);
        }

        public void a(Uri uri) {
            ma maVar;
            p6 p6Var = p6.this;
            va.a aVar = p6Var.l;
            if (aVar == null || (maVar = p6Var.n) == null) {
                return;
            }
            aVar.a(maVar, uri.toString());
        }

        public void a(m6 m6Var, WebView webView) {
            p6 p6Var;
            String str;
            fb.a("MraidPresenter$MyMraidBridgeListener: onPageLoaded callback from " + (m6Var == p6.this.j ? " second " : " primary ") + "webview");
            ArrayList arrayList = new ArrayList();
            if (p6.this.a()) {
                arrayList.add("'inlineVideo'");
            }
            arrayList.add("'vpaid'");
            m6Var.a(arrayList);
            m6Var.d(this.b);
            m6Var.a(m6Var.c());
            k kVar = p6.this.q;
            if (kVar == null || !kVar.isShowing()) {
                p6Var = p6.this;
                str = "default";
            } else {
                p6Var = p6.this;
                str = "expanded";
            }
            p6Var.a(str);
            m6Var.d();
            p6 p6Var2 = p6.this;
            if (m6Var != p6Var2.j) {
                c cVar = p6Var2.m;
                if (cVar != null) {
                    cVar.a();
                }
                va.a aVar = p6.this.l;
                if (aVar != null) {
                    aVar.a(webView);
                }
            }
        }

        public boolean a(float f, float f2) {
            c cVar;
            ma maVar;
            p6 p6Var = p6.this;
            if (!p6Var.o) {
                this.a.a("playheadEvent", "Calling VPAID command before VPAID init");
                return false;
            }
            if (f < 0.0f || f2 < 0.0f || (cVar = p6Var.m) == null || (maVar = p6Var.n) == null) {
                return true;
            }
            cVar.a(f, f2, maVar, p6Var.b);
            return true;
        }

        public boolean a(int i, int i2, int i3, int i4, boolean z, int i5) {
            m6 m6Var;
            String str;
            p6.this.s = new f();
            p6 p6Var = p6.this;
            if (p6Var.r == null) {
                fb.a("MraidPresenter$MyMraidBridgeListener: Unable to set resize properties: container view for resize is not defined");
                m6Var = this.a;
                str = "container view for resize is not defined";
            } else if (i < 50 || i2 < 50) {
                fb.a("MraidPresenter$MyMraidBridgeListener: Unable to set resize properties: properties cannot be less than closeable container");
                m6Var = this.a;
                str = "properties cannot be less than closeable container";
            } else {
                hb hbVarE = hb.e(p6Var.b);
                p6.this.s.a(z);
                p6.this.s.a(hbVarE.b(i), hbVarE.b(i2), hbVarE.b(i3), hbVarE.b(i4), i5);
                if (z) {
                    return true;
                }
                Rect rect = new Rect();
                p6.this.r.getGlobalVisibleRect(rect);
                if (p6.this.s.a(rect)) {
                    return true;
                }
                fb.a("MraidPresenter$MyMraidBridgeListener: Unable to set resize properties: allowOffscreen is false, maxSize is (" + rect.width() + "," + rect.height() + ") resize properties: (" + p6.this.s.b() + "," + p6.this.s.a() + ")");
                m6Var = this.a;
                str = "resize properties with allowOffscreen false out of viewport";
            }
            m6Var.a("setResizeProperties", str);
            p6.this.s = null;
            return false;
        }

        public boolean a(boolean z, o6 o6Var) {
            fb.a("MraidPresenter$MyMraidBridgeListener: Orientation properties isn't supported in standard banners");
            return false;
        }

        public void a(boolean z) {
            if (!z || p6.this.q == null) {
                this.a.a(z);
            }
        }

        public boolean a(String str) {
            ma maVar;
            p6 p6Var = p6.this;
            if (!p6Var.o) {
                this.a.a("vpaidEvent", "Calling VPAID command before VPAID init");
                return false;
            }
            c cVar = p6Var.m;
            if (cVar == null || (maVar = p6Var.n) == null) {
                return true;
            }
            cVar.a(str, maVar, p6Var.b);
            return true;
        }
    }

    public static final class f {
        public boolean a = true;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public Rect i;
        public Rect j;

        public void a(e1 e1Var) {
            Rect rect;
            Rect rect2 = this.j;
            if (rect2 == null || (rect = this.i) == null) {
                fb.a("MraidPresenter$ResizeHelper: Setup views before resizing");
                return;
            }
            int i = (rect2.top - rect.top) + this.c;
            this.g = i;
            this.h = (rect2.left - rect.left) + this.b;
            if (!this.a) {
                if (i + this.e > rect.height()) {
                    fb.a("MraidPresenter$ResizeHelper: Try to reposition creative vertically because of resize allowOffscreen:false and out of max size properties");
                    this.g = this.i.height() - this.e;
                }
                if (this.h + this.d > this.i.width()) {
                    fb.a("MraidPresenter$ResizeHelper: Try to reposition creative horizontally because of resize allowOffscreen:false and out of max size properties");
                    this.h = this.i.width() - this.d;
                }
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.d, this.e);
            layoutParams.topMargin = this.g;
            layoutParams.leftMargin = this.h;
            e1Var.setLayoutParams(layoutParams);
            e1Var.setCloseGravity(this.f);
        }

        public boolean b(e1 e1Var) {
            if (this.i == null) {
                return false;
            }
            int i = this.h;
            int i2 = this.g;
            Rect rect = this.i;
            Rect rect2 = new Rect(i, i2, rect.right, rect.bottom);
            int i3 = this.h;
            int i4 = this.g;
            Rect rect3 = new Rect(i3, i4, this.d + i3, this.e + i4);
            Rect rect4 = new Rect();
            e1Var.b(this.f, rect3, rect4);
            return rect2.contains(rect4);
        }

        public boolean a(Rect rect) {
            return this.d <= rect.width() && this.e <= rect.height();
        }

        public int b() {
            return this.d;
        }

        public int a() {
            return this.e;
        }

        public void a(boolean z) {
            this.a = z;
        }

        public void a(int i, int i2, int i3, int i4, int i5) {
            this.d = i;
            this.e = i2;
            this.b = i3;
            this.c = i4;
            this.f = i5;
        }

        public boolean a(ViewGroup viewGroup, r6 r6Var) {
            this.i = new Rect();
            this.j = new Rect();
            return viewGroup.getGlobalVisibleRect(this.i) && r6Var.getGlobalVisibleRect(this.j);
        }
    }

    public p6(ViewGroup viewGroup) {
        this(m6.b("inline"), new r6(viewGroup.getContext()), new l1(viewGroup.getContext()), viewGroup);
    }

    public void a(r6 r6Var) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 1;
        this.a.addView(r6Var, 0);
        r6Var.setLayoutParams(layoutParams);
    }

    public void b(boolean z) {
        m6 m6Var = this.j;
        if (m6Var == null) {
            m6Var = this.g;
        }
        m6Var.a(z);
        r6 r6Var = this.t;
        if (r6Var == null) {
            return;
        }
        if (z) {
            r6Var.e();
        } else {
            r6Var.a(false);
        }
    }

    public l1 getView() {
        return this.a;
    }

    public void pause() {
        r6 r6Var;
        if ((this.q == null || this.j != null) && (r6Var = this.k) != null) {
            r6Var.a(false);
        }
    }

    public void r() {
        this.a.setVisibility(0);
        if (this.u != null) {
            this.u = null;
            m6 m6Var = this.j;
            if (m6Var != null) {
                m6Var.a(false);
                this.j.e("hidden");
                this.j.a();
                this.j = null;
                this.g.a(true);
            }
            r6 r6Var = this.t;
            if (r6Var != null) {
                r6Var.a(true);
                if (this.t.getParent() != null) {
                    ((ViewGroup) this.t.getParent()).removeView(this.t);
                }
                this.t.a(0);
                this.t = null;
            }
        } else {
            r6 r6Var2 = this.k;
            if (r6Var2 != null) {
                if (r6Var2.getParent() != null) {
                    ((ViewGroup) this.k.getParent()).removeView(this.k);
                }
                a(this.k);
            }
        }
        e1 e1Var = this.p;
        if (e1Var != null && e1Var.getParent() != null) {
            ((ViewGroup) this.p.getParent()).removeView(this.p);
        }
        this.p = null;
        a("default");
        c cVar = this.m;
        if (cVar != null) {
            cVar.d();
        }
        b();
        this.g.a(this.c);
        r6 r6Var3 = this.k;
        if (r6Var3 != null) {
            r6Var3.e();
        }
    }

    public void resume() {
        r6 r6Var;
        if ((this.q == null || this.j != null) && (r6Var = this.k) != null) {
            r6Var.e();
        }
    }

    public void start() {
        ma maVar;
        va.a aVar = this.l;
        if (aVar == null || (maVar = this.n) == null) {
            return;
        }
        aVar.a(maVar);
    }

    public p6(m6 m6Var, r6 r6Var, l1 l1Var, ViewGroup viewGroup) {
        View rootView;
        this.d = new b();
        this.g = m6Var;
        this.k = r6Var;
        this.a = l1Var;
        Context context = viewGroup.getContext();
        this.b = context;
        if (!(context instanceof Activity)) {
            this.h = new WeakReference(null);
            rootView = viewGroup.getRootView();
            if (rootView != null) {
                ViewGroup viewGroup2 = (ViewGroup) rootView.findViewById(R.id.content);
                this.r = viewGroup2;
                if (viewGroup2 == null) {
                }
            }
            this.i = "loading";
            this.c = q6.e();
            e eVar = new e(m6Var, "inline");
            this.f = eVar;
            m6Var.a(eVar);
            a aVar = new a(m6Var);
            this.e = aVar;
            this.k.addOnLayoutChangeListener(aVar);
            a(r6Var);
        }
        Activity activity = (Activity) context;
        this.h = new WeakReference(activity);
        rootView = activity.getWindow().getDecorView().findViewById(R.id.content);
        this.r = (ViewGroup) rootView;
        this.i = "loading";
        this.c = q6.e();
        e eVar2 = new e(m6Var, "inline");
        this.f = eVar2;
        m6Var.a(eVar2);
        a aVar2 = new a(m6Var);
        this.e = aVar2;
        this.k.addOnLayoutChangeListener(aVar2);
        a(r6Var);
    }

    public final void a(IAdLoadingError iAdLoadingError) {
        c cVar = this.m;
        if (cVar != null) {
            cVar.a(iAdLoadingError);
        }
    }

    public void b() {
        q6 q6Var;
        int i;
        int i2;
        int measuredWidth;
        int i3;
        r6 r6Var;
        int[] iArr = new int[2];
        DisplayMetrics displayMetrics = this.b.getResources().getDisplayMetrics();
        this.c.a(displayMetrics.widthPixels, displayMetrics.heightPixels);
        ViewGroup viewGroup = this.r;
        if (viewGroup != null) {
            viewGroup.getLocationOnScreen(iArr);
            q6 q6Var2 = this.c;
            int i4 = iArr[0];
            q6Var2.c(i4, iArr[1], this.r.getMeasuredWidth() + i4, iArr[1] + this.r.getMeasuredHeight());
        }
        if (!this.i.equals("expanded") && !this.i.equals("resized")) {
            this.a.getLocationOnScreen(iArr);
            q6 q6Var3 = this.c;
            int i5 = iArr[0];
            q6Var3.b(i5, iArr[1], this.a.getMeasuredWidth() + i5, iArr[1] + this.a.getMeasuredHeight());
        }
        r6 r6Var2 = this.t;
        if (r6Var2 != null) {
            r6Var2.getLocationOnScreen(iArr);
            q6Var = this.c;
            i = iArr[0];
            i2 = iArr[1];
            measuredWidth = this.t.getMeasuredWidth() + i;
            i3 = iArr[1];
            r6Var = this.t;
        } else {
            r6 r6Var3 = this.k;
            if (r6Var3 == null) {
                return;
            }
            r6Var3.getLocationOnScreen(iArr);
            q6Var = this.c;
            i = iArr[0];
            i2 = iArr[1];
            measuredWidth = this.k.getMeasuredWidth() + i;
            i3 = iArr[1];
            r6Var = this.k;
        }
        q6Var.a(i, i2, measuredWidth, i3 + r6Var.getMeasuredHeight());
    }

    public void a(int i) {
        a("hidden");
        a((c) null);
        a((va.a) null);
        this.g.a();
        e1 e1Var = this.p;
        if (e1Var != null) {
            e1Var.removeAllViews();
            this.p.setOnCloseListener((e1.a) null);
            ViewParent parent = this.p.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this.p);
            }
            this.p = null;
        }
        r6 r6Var = this.k;
        if (r6Var != null) {
            if (i <= 0) {
                r6Var.a(true);
            }
            if (this.k.getParent() != null) {
                ((ViewGroup) this.k.getParent()).removeView(this.k);
            }
            this.k.a(i);
            this.k = null;
        }
        m6 m6Var = this.j;
        if (m6Var != null) {
            m6Var.a();
            this.j = null;
        }
        r6 r6Var2 = this.t;
        if (r6Var2 != null) {
            r6Var2.a(true);
            if (this.t.getParent() != null) {
                ((ViewGroup) this.t.getParent()).removeView(this.t);
            }
            this.t.a(0);
            this.t = null;
        }
    }

    public void a(e1 e1Var, FrameLayout frameLayout) {
        this.a.setVisibility(8);
        frameLayout.addView((View) e1Var, new ViewGroup.LayoutParams(-1, -1));
        if (this.u != null) {
            this.j = m6.b("inline");
            r6 r6Var = new r6(this.b);
            this.t = r6Var;
            a(this.j, r6Var, e1Var);
        } else {
            r6 r6Var2 = this.k;
            if (r6Var2 != null && r6Var2.getParent() != null) {
                ((ViewGroup) this.k.getParent()).removeView(this.k);
                e1Var.addView(this.k, new ViewGroup.LayoutParams(-1, -1));
                a("expanded");
            }
        }
        e1Var.setCloseVisible(true);
        e1Var.setOnCloseListener(this.d);
        c cVar = this.m;
        if (cVar != null && this.u == null) {
            cVar.b();
        }
        fb.a("MraidPresenter: MRAID dialog create");
    }

    public void a(m6 m6Var, r6 r6Var, e1 e1Var) {
        Uri uri;
        e eVar = new e(m6Var, "inline");
        this.v = eVar;
        m6Var.a(eVar);
        e1Var.addView(r6Var, new ViewGroup.LayoutParams(-1, -1));
        m6Var.a(r6Var);
        k kVar = this.q;
        if (kVar == null) {
            return;
        }
        ma maVar = this.n;
        if (maVar == null || (uri = this.u) == null) {
            kVar.dismiss();
        } else {
            f0.b(new d(maVar, kVar, uri, m6Var, this.b));
        }
    }

    public boolean a(Uri uri) {
        if (this.k == null) {
            fb.a("MraidPresenter: Cannot expand - webview destroyed");
            return false;
        }
        if (!this.i.equals("default") && !this.i.equals("resized")) {
            return false;
        }
        this.u = uri;
        k.a(this, this.b).show();
        return true;
    }

    public boolean a() {
        r6 r6Var;
        Activity activity = (Activity) this.h.get();
        if (activity == null || (r6Var = this.k) == null) {
            return false;
        }
        return hb.a(activity, r6Var);
    }

    public static p6 a(ViewGroup viewGroup) {
        return new p6(viewGroup);
    }

    public void a(k kVar, FrameLayout frameLayout) {
        this.q = kVar;
        e1 e1Var = this.p;
        if (e1Var != null && e1Var.getParent() != null) {
            ((ViewGroup) this.p.getParent()).removeView(this.p);
        }
        e1 e1Var2 = new e1(this.b);
        this.p = e1Var2;
        a(e1Var2, frameLayout);
    }

    public void a(ma maVar) {
        r6 r6Var;
        this.n = maVar;
        String strM = maVar.M();
        if (strM == null || (r6Var = this.k) == null) {
            a((IAdLoadingError) m.q);
        } else {
            this.g.a(r6Var);
            this.g.f(strM);
        }
    }

    public void a(va.a aVar) {
        this.l = aVar;
    }

    public void a(c cVar) {
        this.m = cVar;
    }

    public void a(String str) {
        fb.a("MraidPresenter: MRAID state set to " + str);
        this.i = str;
        this.g.e(str);
        m6 m6Var = this.j;
        if (m6Var != null) {
            m6Var.e(str);
        }
        if ("hidden".equals(str)) {
            fb.a("MraidPresenter: Mraid on close");
        }
    }

    public void a(boolean z) {
        r6 r6Var;
        if ((this.q == null || this.j != null) && (r6Var = this.k) != null) {
            r6Var.a(z);
        }
    }
}
