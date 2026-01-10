package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.sdk.component.utils.oeT;
import com.bytedance.sdk.openadsdk.core.settings.hp;
import com.mbridge.msdk.playercommon.VideoFeedsPlayer;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class DmF implements bWL, Runnable {
    private final IlO Bc;
    private long Cc;
    private final AtomicBoolean DmF = new AtomicBoolean(false);
    private final Handler EO = new Handler(Looper.getMainLooper());
    private View IlO = tV();
    private final Activity MY;
    private boolean lEW;
    private long tV;
    private boolean vCE;

    public interface IlO {
        View IlO();

        void MY();
    }

    public static bWL IlO(Activity activity, IlO ilO) {
        int iTN = hp.aP().tN();
        if (iTN < 0) {
            return new bWL() { // from class: com.bytedance.sdk.openadsdk.utils.DmF.1
                public void EO() {
                }

                public void IlO() {
                }

                public void IlO(long j) {
                }

                public void MY() {
                }
            };
        }
        return new DmF(activity, Math.min(iTN, 50) * VideoFeedsPlayer.INTERVAL_TIME_PLAY_TIME_CD_THREAD, ilO);
    }

    private DmF(Activity activity, int i, IlO ilO) {
        this.Bc = ilO;
        this.MY = activity;
        this.tV = i;
    }

    private View tV() {
        IlO ilO = this.Bc;
        if (ilO != null) {
            return ilO.IlO();
        }
        return null;
    }

    public void IlO(long j) {
        if (this.DmF.compareAndSet(false, true)) {
            if (j < 0) {
                j = 0;
            }
            this.tV += j;
            Cc();
        }
    }

    public void IlO() {
        if (this.Cc == 0 || !this.lEW) {
            return;
        }
        Cc();
    }

    private void Cc() {
        this.lEW = false;
        this.Cc = SystemClock.elapsedRealtime();
        Handler handler = this.EO;
        if (handler != null) {
            handler.postDelayed(this, this.tV);
        }
    }

    public void MY() {
        if (this.Cc <= 0 || this.vCE) {
            return;
        }
        if (!this.lEW) {
            this.tV -= SystemClock.elapsedRealtime() - this.Cc;
        }
        this.lEW = true;
        if (this.tV <= 0) {
            vCE();
            return;
        }
        Handler handler = this.EO;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th) {
                oeT.EO(th.getMessage(), new Object[0]);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        vCE();
    }

    private void vCE() {
        Activity activity;
        View childAt;
        if (this.vCE || (activity = this.MY) == null || activity.isFinishing()) {
            return;
        }
        if (Build.VERSION.SDK_INT < 17 || !this.MY.isDestroyed()) {
            if (this.IlO == null) {
                this.IlO = tV();
            }
            View view = this.IlO;
            if (view != null) {
                if (MY(view)) {
                    IlO(this.IlO);
                    View view2 = this.IlO;
                    if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0 && (childAt = ((ViewGroup) this.IlO).getChildAt(0)) != null && MY(childAt)) {
                        IlO(childAt);
                    }
                    IlO ilO = this.Bc;
                    if (ilO != null) {
                        ilO.MY();
                    }
                }
                Bc();
            }
            this.vCE = true;
        }
    }

    private void Bc() {
        ViewParent parent = this.IlO.getParent();
        if (parent instanceof ViewGroup) {
            if (((ViewGroup) parent).indexOfChild(this.IlO) != r0.getChildCount() - 1) {
                this.IlO.bringToFront();
            }
        }
    }

    private void IlO(View view) {
        view.setVisibility(0);
        view.setAlpha(1.0f);
    }

    private boolean MY(View view) {
        if (view == null) {
            return true;
        }
        return !view.isShown() || ((double) view.getAlpha()) <= 0.9d;
    }

    public void EO() {
        if (this.vCE) {
            return;
        }
        this.vCE = true;
        Handler handler = this.EO;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th) {
                oeT.EO(th.getMessage(), new Object[0]);
            }
        }
    }
}
