package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.applovin.impl.c2$;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class c2 {
    private final com.applovin.impl.sdk.k a;
    private final Activity b;
    private AlertDialog c;
    private a d;

    public interface a {
        void a();

        void b();
    }

    public c2(Activity activity, com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.b = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(DialogInterface dialogInterface, int i) {
        this.d.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        AlertDialog alertDialog = this.c;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.c = new AlertDialog.Builder(this.b).setTitle((CharSequence) this.a.a(l4.c1)).setMessage((CharSequence) this.a.a(l4.d1)).setCancelable(false).setPositiveButton((CharSequence) this.a.a(l4.f1), (DialogInterface.OnClickListener) new c2$.ExternalSyntheticLambda0(this)).setNegativeButton((CharSequence) this.a.a(l4.e1), (DialogInterface.OnClickListener) new c2$.ExternalSyntheticLambda1(this)).show();
    }

    public void a(a aVar) {
        this.d = aVar;
    }

    public void e() {
        this.b.runOnUiThread(new c2$.ExternalSyntheticLambda2(this));
    }

    public void a() {
        this.b.runOnUiThread(new c2$.ExternalSyntheticLambda3(this));
    }

    public boolean b() {
        AlertDialog alertDialog = this.c;
        if (alertDialog != null) {
            return alertDialog.isShowing();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        this.d.b();
    }
}
