package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzej;
import com.ironsource.adqualitysdk.sdk.R;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
final class zzby implements zzej {
    final /* synthetic */ Consumer zza;
    final /* synthetic */ Runnable zzb;
    final /* synthetic */ zzcc zzc;
    final /* synthetic */ int zzd;

    zzby(zzcc zzccVar, int i, Consumer consumer, Runnable runnable) {
        this.zzd = i;
        this.zza = consumer;
        this.zzb = runnable;
        this.zzc = zzccVar;
    }

    public final void zza(Throwable th) {
        if (th instanceof TimeoutException) {
            this.zzc.zzaS(R.styleable.AppCompatTheme_tooltipForegroundColor, 28, zzcj.zzG);
            zze.zzm("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            this.zzc.zzaS(107, 28, zzcj.zzG);
            zze.zzm("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        this.zzb.run();
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        zzcc zzccVar = this.zzc;
        if (!zzcc.zzaP(iIntValue)) {
            this.zzb.run();
        } else {
            this.zza.accept(zzccVar.zzaQ(this.zzd, num.intValue()));
        }
    }
}
