package com.ironsource;

import android.app.Activity;
import com.ironsource.ih;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.v;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class t5 {
    public static t5 a;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ih.a.values().length];
            a = iArr;
            try {
                iArr[ih.a.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ih.a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ih.a.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static t5 a() {
        t5 t5Var = a;
        return t5Var == null ? new t5() : t5Var;
    }

    public boolean a(Activity activity) {
        if (a.a[lk.e().b().ordinal()] != 3) {
            return false;
        }
        try {
            v vVarJ = zj.b(activity).a().j();
            if (vVarJ == null) {
                return true;
            }
            vVarJ.k("back");
            return true;
        } catch (Exception e) {
            n9.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }
}
