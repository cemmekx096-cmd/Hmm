package com.my.target;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.mbridge.msdk.playercommon.VideoFeedsPlayer;
import com.my.target.common.models.VideoData;
import com.my.target.i3$;
import com.my.target.instreamads.InstreamAdPlayer;
import com.my.target.k8;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class i3 implements InstreamAdPlayer.AdPlayerListener {
    public zb e;
    public k8 f;
    public InstreamAdPlayer g;
    public a h;
    public r5 i;
    public int n;
    public float o;
    public yb d = null;
    public int j = 0;
    public int k = 10;
    public float l = 1.0f;
    public float m = 1.0f;
    public final t9 a = t9.a(ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION);
    public final p8 b = p8.b();
    public final Runnable c = new i3$.ExternalSyntheticLambda1(this);

    public interface a {
        void a(float f, float f2, r5 r5Var);

        void a(r5 r5Var);

        void a(String str, r5 r5Var);

        void b(r5 r5Var);

        void c(r5 r5Var);

        void d(r5 r5Var);

        void e(r5 r5Var);
    }

    public static i3 i() {
        return new i3();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(int r6) {
        /*
            r5 = this;
            int r0 = r5.j
            r1 = 0
            r2 = 1
            if (r6 == r0) goto L25
            r3 = 3
            r4 = 2
            switch(r6) {
                case 0: goto L25;
                case 1: goto L24;
                case 2: goto L20;
                case 3: goto L1b;
                case 4: goto L13;
                case 5: goto Lc;
                case 6: goto L24;
                default: goto Lb;
            }
        Lb:
            goto L25
        Lc:
            if (r0 == r2) goto L24
            if (r0 == r4) goto L24
            if (r0 != r3) goto L25
            goto L24
        L13:
            if (r0 == r2) goto L24
            if (r0 == r4) goto L24
            r3 = 5
            if (r0 != r3) goto L25
            goto L24
        L1b:
            if (r0 == r2) goto L24
            if (r0 != r4) goto L25
            goto L24
        L20:
            if (r0 == r2) goto L24
            if (r0 != r3) goto L25
        L24:
            r1 = r2
        L25:
            java.lang.String r0 = " to "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            if (r1 == 0) goto L4c
            r2.<init>()
            java.lang.String r3 = "InstreamAdVideoController: state has been changed from "
            java.lang.StringBuilder r2 = r2.append(r3)
            int r3 = r5.j
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.my.target.fb.a(r0)
            r5.j = r6
            goto L6a
        L4c:
            r2.<init>()
            java.lang.String r3 = "InstreamAdVideoController: wrong state transition from "
            java.lang.StringBuilder r2 = r2.append(r3)
            int r3 = r5.j
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r6 = r6.toString()
            com.my.target.fb.a(r6)
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.i3.a(int):boolean");
    }

    public r5 b() {
        r5 r5Var = this.i;
        this.i = null;
        zb zbVar = this.e;
        if (zbVar != null) {
            zbVar.a();
            this.e = null;
        }
        yb ybVar = this.d;
        if (ybVar != null) {
            ybVar.e();
            this.d = null;
        }
        k8 k8Var = this.f;
        if (k8Var != null) {
            k8Var.a();
        }
        return r5Var;
    }

    public void c() {
        this.a.close();
        InstreamAdPlayer instreamAdPlayer = this.g;
        if (instreamAdPlayer != null) {
            instreamAdPlayer.destroy();
            this.g = null;
        }
        b();
    }

    public Context d() {
        InstreamAdPlayer instreamAdPlayer = this.g;
        if (instreamAdPlayer == null) {
            return null;
        }
        return instreamAdPlayer.getView().getContext();
    }

    public InstreamAdPlayer e() {
        return this.g;
    }

    public float f() {
        return this.l;
    }

    public void g() {
        r5 r5Var;
        fb.a("InstreamAdVideoController: Video freeze more then " + this.k + " seconds, stopping");
        InstreamAdPlayer instreamAdPlayer = this.g;
        if (instreamAdPlayer != null) {
            instreamAdPlayer.stopAdVideo();
        }
        this.a.b(this.c);
        this.b.h();
        a aVar = this.h;
        if (aVar != null && (r5Var = this.i) != null) {
            aVar.a("Timeout", r5Var);
        }
        b();
    }

    public final /* synthetic */ void h() {
        k8 k8Var;
        InstreamAdPlayer instreamAdPlayer = this.g;
        if (instreamAdPlayer == null || (k8Var = this.f) == null) {
            return;
        }
        k8Var.a(instreamAdPlayer.getView(), new k8.b[0]);
        this.f.c();
    }

    public void j() {
        InstreamAdPlayer instreamAdPlayer = this.g;
        if (instreamAdPlayer != null) {
            instreamAdPlayer.pauseAdVideo();
        }
    }

    public void k() {
        InstreamAdPlayer instreamAdPlayer = this.g;
        if (instreamAdPlayer != null) {
            instreamAdPlayer.resumeAdVideo();
        }
    }

    public void l() {
        InstreamAdPlayer instreamAdPlayer = this.g;
        if (instreamAdPlayer != null) {
            instreamAdPlayer.stopAdVideo();
        }
        onAdVideoStopped();
    }

    public void m() {
        k8 k8Var = this.f;
        if (k8Var != null) {
            k8Var.a(2);
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer.AdPlayerListener
    public void onAdVideoCompleted() {
        if (a(4)) {
            a();
            this.a.b(this.c);
            yb ybVar = this.d;
            if (ybVar != null) {
                ybVar.e();
            }
            r5 r5VarB = b();
            if (r5VarB != null) {
                float fO = r5VarB.o();
                this.b.a(fO, fO);
                zb zbVar = this.e;
                if (zbVar != null) {
                    zbVar.a(fO, fO);
                }
                if (this.h != null) {
                    this.b.e();
                    this.h.d(r5VarB);
                }
            }
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer.AdPlayerListener
    public void onAdVideoError(String str) {
        a aVar;
        if (a(6)) {
            InstreamAdPlayer instreamAdPlayer = this.g;
            if (instreamAdPlayer != null) {
                instreamAdPlayer.stopAdVideo();
            }
            this.b.g();
            yb ybVar = this.d;
            if (ybVar != null) {
                ybVar.e();
            }
            this.a.b(this.c);
            r5 r5VarB = b();
            if (r5VarB == null || (aVar = this.h) == null) {
                return;
            }
            aVar.a(str, r5VarB);
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer.AdPlayerListener
    public void onAdVideoPaused() {
        a aVar;
        if (a(3)) {
            this.b.f();
            this.a.b(this.c);
            r5 r5Var = this.i;
            if (r5Var == null || (aVar = this.h) == null) {
                return;
            }
            aVar.b(r5Var);
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer.AdPlayerListener
    public void onAdVideoResumed() {
        a aVar;
        if (a(2)) {
            this.b.i();
            this.a.a(this.c);
            r5 r5Var = this.i;
            if (r5Var == null || (aVar = this.h) == null) {
                return;
            }
            aVar.a(r5Var);
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer.AdPlayerListener
    public void onAdVideoStarted() {
        if (a(2)) {
            this.a.a(this.c);
            r5 r5Var = this.i;
            if (r5Var == null) {
                return;
            }
            a aVar = this.h;
            if (aVar != null) {
                aVar.c(r5Var);
            }
            if (this.g == null) {
                return;
            }
            yb ybVar = this.d;
            if (ybVar != null && !ybVar.c()) {
                this.d.c(this.g.getView());
            }
            r5 r5Var2 = this.i;
            if (r5Var2 != null) {
                float fO = r5Var2.o();
                a(fO, 0.0f, fO);
            }
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer.AdPlayerListener
    public void onAdVideoStopped() {
        a aVar;
        if (a(5)) {
            this.b.j();
            yb ybVar = this.d;
            if (ybVar != null) {
                ybVar.e();
            }
            this.a.b(this.c);
            r5 r5VarB = b();
            if (r5VarB == null || (aVar = this.h) == null) {
                return;
            }
            aVar.e(r5VarB);
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer.AdPlayerListener
    public void onVolumeChanged(float f) {
        this.b.b(this.m, f);
        this.m = f;
    }

    public void a() {
        float adVideoDuration;
        float adVideoPosition;
        float f;
        InstreamAdPlayer instreamAdPlayer;
        r5 r5Var = this.i;
        if (r5Var == null) {
            this.a.b(this.c);
            return;
        }
        float fO = r5Var.o();
        boolean z = this.j == 2;
        if (!z || (instreamAdPlayer = this.g) == null) {
            adVideoDuration = 0.0f;
            adVideoPosition = 0.0f;
            f = 0.0f;
        } else {
            adVideoDuration = instreamAdPlayer.getAdVideoDuration();
            adVideoPosition = this.g.getAdVideoPosition();
            f = fO - adVideoPosition;
        }
        if (!z || this.o == adVideoPosition || adVideoDuration <= 0.0f) {
            this.n++;
        } else {
            a(f, adVideoPosition, fO);
        }
        if (this.n >= (this.k * VideoFeedsPlayer.INTERVAL_TIME_PLAY_TIME_CD_THREAD) / ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION) {
            g();
        }
    }

    public void b(int i) {
        this.k = i;
    }

    public void a(float f, float f2, float f3) {
        r5 r5Var;
        this.n = 0;
        this.o = f2;
        if (f2 >= f3) {
            a(f3);
            return;
        }
        this.b.a(f2, f3);
        zb zbVar = this.e;
        if (zbVar != null) {
            zbVar.a(f2, f3);
        }
        a aVar = this.h;
        if (aVar == null || (r5Var = this.i) == null) {
            return;
        }
        aVar.a(f, f3, r5Var);
    }

    public void b(float f) {
        InstreamAdPlayer instreamAdPlayer = this.g;
        if (instreamAdPlayer != null) {
            instreamAdPlayer.setVolume(f);
        }
        this.l = f;
    }

    public void a(float f) {
        if (a(4)) {
            this.b.a(f, f);
            this.o = f;
            this.a.b(this.c);
            zb zbVar = this.e;
            if (zbVar != null) {
                zbVar.a(f, f);
            }
            r5 r5VarB = b();
            if (r5VarB == null) {
                return;
            }
            a aVar = this.h;
            if (aVar != null) {
                aVar.a(0.0f, f, r5VarB);
            }
            if (this.h != null) {
                this.b.e();
                this.h.d(r5VarB);
            }
        }
    }

    public void b(InstreamAdPlayer instreamAdPlayer) {
        VideoData videoDataK0;
        InstreamAdPlayer instreamAdPlayer2 = this.g;
        if (instreamAdPlayer2 != null) {
            instreamAdPlayer2.setAdPlayerListener(null);
            this.g.stopAdVideo();
        }
        this.g = instreamAdPlayer;
        zb zbVar = this.e;
        if (instreamAdPlayer != null) {
            if (zbVar != null) {
                zbVar.a(instreamAdPlayer.getView());
            }
            yb ybVar = this.d;
            if (ybVar != null) {
                ybVar.b(instreamAdPlayer.getView());
            }
            instreamAdPlayer.setAdPlayerListener(this);
            this.b.a(instreamAdPlayer.getView().getContext());
            k8 k8Var = this.f;
            if (k8Var != null) {
                k8Var.a(instreamAdPlayer.getView());
            }
        } else {
            if (zbVar != null) {
                zbVar.a((View) null);
            }
            yb ybVar2 = this.d;
            if (ybVar2 != null) {
                ybVar2.e();
            }
            this.b.a((Context) null);
        }
        r5 r5Var = this.i;
        if (r5Var == null || (videoDataK0 = r5Var.k0()) == null || instreamAdPlayer == null) {
            return;
        }
        Uri uri = Uri.parse(videoDataK0.getUrl());
        instreamAdPlayer.setVolume(this.l);
        instreamAdPlayer.playAdVideo(uri, videoDataK0.getWidth(), videoDataK0.getHeight(), this.o);
    }

    public void a(r5 r5Var) {
        a(r5Var, false);
    }

    public void a(r5 r5Var, boolean z) {
        InstreamAdPlayer instreamAdPlayer;
        if (a(1)) {
            this.o = 0.0f;
            this.i = r5Var;
            this.b.a(r5Var);
            this.e = zb.a(r5Var.x());
            k8 k8Var = this.f;
            if (k8Var != null) {
                k8Var.a();
            }
            yb ybVar = this.d;
            if (ybVar != null) {
                ybVar.e();
                this.d = null;
            }
            InstreamAdPlayer instreamAdPlayer2 = this.g;
            if (instreamAdPlayer2 != null) {
                View view = instreamAdPlayer2.getView();
                this.e.a(view);
                if (!z) {
                    this.f = k8.a(r5Var, 3, this.i, view.getContext());
                    this.d = yb.b(r5Var.E(), r5Var.x());
                }
            }
            this.b.a(this.f);
            this.b.a(new i3$.ExternalSyntheticLambda0(this));
            VideoData videoDataK0 = r5Var.k0();
            if (videoDataK0 == null || (instreamAdPlayer = this.g) == null) {
                return;
            }
            instreamAdPlayer.setVolume(this.l);
            this.g.playAdVideo(Uri.parse(videoDataK0.getUrl()), videoDataK0.getWidth(), videoDataK0.getHeight());
        }
    }

    public void a(a aVar) {
        this.h = aVar;
    }

    public void a(InstreamAdPlayer instreamAdPlayer) {
        InstreamAdPlayer instreamAdPlayer2 = this.g;
        if (instreamAdPlayer2 != null) {
            instreamAdPlayer2.setAdPlayerListener(null);
        }
        this.g = instreamAdPlayer;
        if (instreamAdPlayer == null) {
            zb zbVar = this.e;
            if (zbVar != null) {
                zbVar.a((View) null);
            }
            yb ybVar = this.d;
            if (ybVar != null) {
                ybVar.e();
            }
            this.b.a((Context) null);
            return;
        }
        View view = instreamAdPlayer.getView();
        zb zbVar2 = this.e;
        if (zbVar2 != null) {
            zbVar2.a(view);
        }
        yb ybVar2 = this.d;
        if (ybVar2 != null) {
            ybVar2.b(view);
        }
        instreamAdPlayer.setAdPlayerListener(this);
        this.b.a(view.getContext());
        k8 k8Var = this.f;
        if (k8Var != null) {
            k8Var.a(instreamAdPlayer.getView());
        }
    }
}
