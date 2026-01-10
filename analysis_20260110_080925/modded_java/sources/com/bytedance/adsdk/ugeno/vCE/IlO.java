package com.bytedance.adsdk.ugeno.vCE;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.Scroller;
import androidx.media3.exoplayer.RendererCapabilities;
import com.bytedance.adsdk.ugeno.lEW.EO;
import com.bytedance.adsdk.ugeno.vCE.IlO.MY;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public abstract class IlO<T> extends FrameLayout implements EO.tV {
    private static final Interpolator OOq = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.vCE.IlO.1
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private int AXM;
    private int Bc;
    private int Cc;
    private int DmF;
    protected Context EO;
    private float EV;
    protected List<T> IlO;
    protected com.bytedance.adsdk.ugeno.lEW.EO MY;
    private String NV;
    private boolean bWL;
    private int cL;
    private boolean cl;
    private boolean ea;
    private int es;
    private boolean hp;
    private C0012IlO kBB;
    private int lEW;
    private final Runnable oc;
    private FrameLayout oeT;
    private com.bytedance.adsdk.ugeno.vCE.EO pP;
    private boolean rp;
    private int tV;
    private Scroller tl;
    private com.bytedance.adsdk.ugeno.vCE.IlO.IlO vAh;
    private int vCE;
    private final Runnable wPn;
    private int xF;
    private boolean zPa;

    public abstract View NV(int i);

    public IlO(Context context) {
        super(context);
        this.IlO = new CopyOnWriteArrayList();
        this.tV = 2000;
        this.Cc = 500;
        this.vCE = 500;
        this.Bc = 0;
        this.lEW = -1;
        this.DmF = -1;
        this.NV = "normal";
        this.EV = 1.0f;
        this.rp = true;
        this.hp = true;
        this.bWL = true;
        this.ea = true;
        this.cL = 0;
        this.es = 0;
        this.xF = 0;
        this.AXM = 0;
        this.wPn = new Runnable() { // from class: com.bytedance.adsdk.ugeno.vCE.IlO.2
            @Override // java.lang.Runnable
            public void run() {
                int currentItem = IlO.this.MY.getCurrentItem() + 1;
                if (IlO.this.bWL) {
                    if (currentItem >= 1024) {
                        IlO.this.MY.IlO(RendererCapabilities.AUDIO_OFFLOAD_SUPPORTED, false);
                        return;
                    } else {
                        IlO.this.MY.IlO(currentItem, true);
                        return;
                    }
                }
                com.bytedance.adsdk.ugeno.lEW.MY adapter = IlO.this.MY.getAdapter();
                if (adapter != null) {
                    if (currentItem >= adapter.IlO()) {
                        IlO.this.MY.IlO(0, false);
                    } else {
                        IlO.this.MY.IlO(currentItem, true);
                    }
                }
            }
        };
        this.oc = new Runnable() { // from class: com.bytedance.adsdk.ugeno.vCE.IlO.3
            @Override // java.lang.Runnable
            public void run() {
                if (IlO.this.hp) {
                    int currentItem = IlO.this.MY.getCurrentItem() + 1;
                    if (IlO.this.bWL) {
                        if (currentItem >= 1024) {
                            IlO.this.MY.IlO(RendererCapabilities.AUDIO_OFFLOAD_SUPPORTED, false);
                        } else {
                            IlO.this.MY.IlO(currentItem, true);
                        }
                        IlO ilO = IlO.this;
                        ilO.postDelayed(ilO.oc, IlO.this.tV);
                        return;
                    }
                    com.bytedance.adsdk.ugeno.lEW.MY adapter = IlO.this.MY.getAdapter();
                    if (adapter != null) {
                        if (currentItem >= adapter.IlO()) {
                            IlO.this.MY.IlO(0, false);
                            IlO ilO2 = IlO.this;
                            ilO2.postDelayed(ilO2.oc, IlO.this.tV);
                        } else {
                            IlO.this.MY.IlO(currentItem, true);
                            IlO ilO3 = IlO.this;
                            ilO3.postDelayed(ilO3.oc, IlO.this.tV);
                        }
                    }
                }
            }
        };
        this.EO = context;
        this.oeT = new FrameLayout(context);
        this.MY = IlO();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.oeT.addView((View) this.MY, (ViewGroup.LayoutParams) layoutParams);
        addView(this.oeT);
    }

    public com.bytedance.adsdk.ugeno.lEW.EO IlO() {
        return new EO(getContext());
    }

    public IlO IlO(String str) {
        if (TextUtils.equals(str, "rectangle")) {
            this.vAh = new com.bytedance.adsdk.ugeno.vCE.IlO.EO(this.EO);
        } else {
            this.vAh = new MY(this.EO);
        }
        addView((View) this.vAh, (ViewGroup.LayoutParams) new FrameLayout.LayoutParams(-2, -2));
        return this;
    }

    public IlO IlO(float f) {
        this.vAh.setIndicatorWidth((int) f);
        return this;
    }

    public IlO MY(float f) {
        this.vAh.setIndicatorHeight((int) f);
        return this;
    }

    public IlO EO(float f) {
        this.vAh.setIndicatorX(f);
        return this;
    }

    public IlO tV(float f) {
        this.vAh.setIndicatorY(f);
        return this;
    }

    public IlO MY() {
        this.vAh.IlO();
        return this;
    }

    public IlO MY(String str) {
        this.vAh.setIndicatorDirection(str);
        return this;
    }

    public IlO IlO(int i) {
        this.AXM = i;
        return this;
    }

    public IlO IlO(boolean z) {
        this.hp = z;
        Cc();
        return this;
    }

    public IlO MY(int i) {
        this.Cc = i;
        return this;
    }

    public IlO EO(int i) {
        this.vCE = i;
        if (this.tl == null) {
            this.tl = new MY(this.EO, OOq);
        }
        this.MY.setScroller(this.tl);
        return this;
    }

    public IlO tV(int i) {
        this.tV = i;
        Cc();
        return this;
    }

    public IlO MY(boolean z) {
        this.ea = z;
        return this;
    }

    public IlO EO(boolean z) {
        this.rp = z;
        return this;
    }

    public IlO Cc(int i) {
        this.vAh.setSelectedColor(i);
        return this;
    }

    public IlO vCE(int i) {
        this.vAh.setUnSelectedColor(i);
        return this;
    }

    public IlO tV(boolean z) {
        this.vAh.setLoop(z);
        if (this.bWL != z) {
            int iIlO = tV.IlO(z, this.MY.getCurrentItem(), this.IlO.size());
            this.bWL = z;
            C0012IlO c0012IlO = this.kBB;
            if (c0012IlO != null) {
                c0012IlO.EO();
                this.MY.setCurrentItem(iIlO);
            }
        }
        return this;
    }

    public IlO Cc(float f) {
        this.EV = f;
        return this;
    }

    public IlO EO(String str) {
        this.NV = str;
        IlO(str, this.Bc, this.lEW, this.DmF, true);
        return this;
    }

    public IlO Bc(int i) {
        this.Bc = i;
        IlO(this.NV, i, this.lEW, this.DmF, true);
        return this;
    }

    public IlO<T> lEW(int i) {
        this.lEW = i;
        IlO(this.NV, this.Bc, i, this.DmF, true);
        return this;
    }

    public IlO DmF(int i) {
        this.DmF = i;
        IlO(this.NV, this.Bc, this.lEW, i, true);
        return this;
    }

    public IlO Cc(boolean z) {
        this.zPa = z;
        return this;
    }

    public void IlO(String str, int i, int i2, int i3, boolean z) {
        C0012IlO c0012IlO = this.kBB;
        if (c0012IlO != null) {
            c0012IlO.EO();
        }
        this.MY.setPageMargin(i);
        if (i2 > 0 || i3 > 0) {
            if (this.AXM == 1) {
                this.MY.setPadding(0, i2 + i, 0, i3 + i);
            } else {
                this.MY.setPadding(i2 + i, 0, i3 + i, 0);
            }
            this.oeT.setClipChildren(false);
            this.MY.setClipChildren(false);
            this.MY.setClipToPadding(false);
        }
        if (this.AXM == 1) {
            com.bytedance.adsdk.ugeno.vCE.MY.EO eo = new com.bytedance.adsdk.ugeno.vCE.MY.EO();
            eo.IlO(str);
            this.MY.IlO(true, eo);
            this.MY.setOverScrollMode(2);
        } else if (TextUtils.equals(str, "linear")) {
            this.MY.IlO(false, new com.bytedance.adsdk.ugeno.vCE.MY.MY());
        } else if (TextUtils.equals(str, "cube")) {
            this.MY.IlO(false, new com.bytedance.adsdk.ugeno.vCE.MY.IlO());
        } else {
            this.MY.IlO(false, (EO.Cc) null);
        }
        this.MY.setOffscreenPageLimit((int) this.EV);
    }

    public void EO() {
        int i;
        IlO(this.NV, this.Bc, this.lEW, this.DmF, true);
        if (this.kBB == null) {
            this.kBB = new C0012IlO();
            this.MY.IlO(this);
            this.MY.setAdapter(this.kBB);
        }
        int i2 = this.cL;
        if (i2 < 0 || i2 >= this.IlO.size()) {
            this.cL = 0;
        }
        if (this.bWL) {
            i = this.cL + RendererCapabilities.AUDIO_OFFLOAD_SUPPORTED;
        } else {
            i = this.cL;
        }
        this.MY.IlO(i, true);
        if (!this.bWL) {
            EV(i);
        }
        if (this.hp) {
            Cc();
        }
    }

    public void setTwoItems(boolean z) {
        this.cl = z;
    }

    public void tV() {
        vCE();
        if (this.kBB != null) {
            this.MY.MY(this);
            this.MY.setAdapter((com.bytedance.adsdk.ugeno.lEW.MY) null);
            this.kBB = null;
            this.MY.removeAllViews();
            this.IlO.clear();
            this.vAh.EO();
        }
    }

    public View IlO(int i, int i2) {
        if (this.IlO.size() == 0) {
            return new View(getContext());
        }
        View viewNV = NV(i2);
        FrameLayout frameLayout = new FrameLayout(getContext());
        if (viewNV instanceof ViewGroup) {
            frameLayout.setClipChildren(true);
        }
        if (Bc()) {
            viewNV.setTag("two_items_tag");
        }
        if (viewNV.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewNV.getParent()).removeView(viewNV);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView(viewNV, layoutParams);
        frameLayout.addView(new View(getContext()), new FrameLayout.LayoutParams(-1, -1));
        if (Bc()) {
            frameLayout.setTag(Integer.valueOf(i));
        }
        return frameLayout;
    }

    public IlO<T> IlO(T t) {
        if (t != null) {
            this.IlO.add(t);
            if (this.rp) {
                this.vAh.MY();
            }
        }
        C0012IlO c0012IlO = this.kBB;
        if (c0012IlO != null) {
            c0012IlO.EO();
            this.vAh.IlO(this.cL, this.MY.getCurrentItem());
        }
        return this;
    }

    public void IlO(int i, float f, int i2) {
        com.bytedance.adsdk.ugeno.vCE.EO eo = this.pP;
        if (eo != null) {
            boolean z = this.bWL;
            eo.IlO(z, tV.IlO(z, i, this.IlO.size()), f, i2);
        }
        if (Bc()) {
            IlO(i, findViewWithTag(Integer.valueOf(i)));
            if (f > 0.0f) {
                int i3 = i + 1;
                IlO(i3, findViewWithTag(Integer.valueOf(i3)));
            }
        }
    }

    public void EV(int i) {
        if (this.pP != null) {
            int iIlO = tV.IlO(this.bWL, i, this.IlO.size());
            this.pP.IlO(this.bWL, iIlO, i, iIlO == 0, iIlO == this.IlO.size() - 1);
        }
        if (this.rp) {
            this.vAh.IlO(i);
        }
    }

    public void rp(int i) {
        if (i == 1 && this.zPa) {
            vCE();
        }
        com.bytedance.adsdk.ugeno.vCE.EO eo = this.pP;
        if (eo != null) {
            eo.IlO(this.bWL, i);
        }
    }

    /* renamed from: com.bytedance.adsdk.ugeno.vCE.IlO$IlO, reason: collision with other inner class name */
    class C0012IlO extends com.bytedance.adsdk.ugeno.lEW.MY {
        public int IlO(Object obj) {
            return -2;
        }

        public boolean IlO(View view, Object obj) {
            return view == obj;
        }

        C0012IlO() {
        }

        public int IlO() {
            return IlO.this.bWL ? RendererCapabilities.AUDIO_OFFLOAD_GAPLESS_SUPPORTED : IlO.this.IlO.size();
        }

        public Object IlO(ViewGroup viewGroup, int i) {
            View viewIlO = IlO.this.IlO(i, tV.IlO(IlO.this.bWL, i, IlO.this.IlO.size()));
            viewGroup.addView(viewIlO);
            return viewIlO;
        }

        public void IlO(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        public float IlO(int i) {
            if (IlO.this.EV <= 0.0f) {
                return 1.0f;
            }
            return 1.0f / IlO.this.EV;
        }
    }

    public void Cc() {
        removeCallbacks(this.oc);
        postDelayed(this.oc, this.tV);
    }

    public void vCE() {
        removeCallbacks(this.oc);
    }

    public void hp(int i) {
        IlO(this.NV, this.Bc, this.lEW, this.DmF, true);
        if (this.kBB == null) {
            this.kBB = new C0012IlO();
            this.MY.IlO(this);
            this.MY.setAdapter(this.kBB);
        }
        if (this.bWL) {
            if (i >= 1024) {
                this.MY.IlO(RendererCapabilities.AUDIO_OFFLOAD_SUPPORTED, false);
                return;
            } else {
                this.MY.IlO(i, true);
                return;
            }
        }
        if (i < 0 || i >= this.IlO.size()) {
            return;
        }
        this.MY.IlO(i, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.hp) {
            int action = motionEvent.getAction();
            if (action == 1 || action == 3 || action == 4) {
                if (!this.zPa) {
                    Cc();
                }
            } else if (action == 0) {
                vCE();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getCurrentItem() {
        return this.MY.getCurrentItem();
    }

    public com.bytedance.adsdk.ugeno.lEW.MY getAdapter() {
        return this.MY.getAdapter();
    }

    public com.bytedance.adsdk.ugeno.lEW.EO getViewPager() {
        return this.MY;
    }

    public void setOnPageChangeListener(com.bytedance.adsdk.ugeno.vCE.EO eo) {
        this.pP = eo;
    }

    public class EO extends com.bytedance.adsdk.ugeno.lEW.EO {
        public EO(Context context) {
            super(context);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (!IlO.this.ea) {
                return false;
            }
            try {
                if (IlO.this.AXM == 1) {
                    boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(IlO(motionEvent));
                    IlO(motionEvent);
                    return zOnInterceptTouchEvent;
                }
                return super.onInterceptTouchEvent(motionEvent);
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (!IlO.this.ea) {
                return false;
            }
            try {
                if (IlO.this.AXM == 1) {
                    return super.onTouchEvent(IlO(motionEvent));
                }
                return super.onTouchEvent(motionEvent);
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }

        private MotionEvent IlO(MotionEvent motionEvent) {
            float width = getWidth();
            float height = getHeight();
            motionEvent.setLocation((motionEvent.getY() / height) * width, (motionEvent.getX() / width) * height);
            return motionEvent;
        }
    }

    private class MY extends Scroller {
        public MY(Context context, Interpolator interpolator) {
            super(context, interpolator);
        }

        @Override // android.widget.Scroller
        public void startScroll(int i, int i2, int i3, int i4, int i5) {
            super.startScroll(i, i2, i3, i4, IlO.this.vCE);
        }

        @Override // android.widget.Scroller
        public void startScroll(int i, int i2, int i3, int i4) {
            super.startScroll(i, i2, i3, i4, IlO.this.vCE);
        }
    }

    private void IlO(int i, View view) {
        View viewFindViewWithTag;
        if ((view instanceof ViewGroup) && (viewFindViewWithTag = view.findViewWithTag("two_items_tag")) == null) {
            T t = this.IlO.get(tV.IlO(true, i, this.IlO.size()));
            if (t == null) {
                return;
            }
            if (t instanceof com.bytedance.adsdk.ugeno.MY.EO) {
                viewFindViewWithTag = ((com.bytedance.adsdk.ugeno.MY.EO) t).EV();
            } else if (t instanceof View) {
                viewFindViewWithTag = (View) t;
            }
            if (viewFindViewWithTag == null) {
                return;
            }
            if (viewFindViewWithTag.getParent() instanceof ViewGroup) {
                ((ViewGroup) viewFindViewWithTag.getParent()).removeView(viewFindViewWithTag);
            }
            ((ViewGroup) view).addView(viewFindViewWithTag);
        }
    }

    private boolean Bc() {
        return this.IlO.size() <= 2 && this.bWL;
    }
}
