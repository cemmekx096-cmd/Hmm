package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzjx;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzke;
import com.google.android.gms.internal.play_billing.zzki;
import com.google.android.gms.internal.play_billing.zzkl;
import com.google.android.gms.internal.play_billing.zzlu;
import com.ironsource.adqualitysdk.sdk.R;
import java.util.concurrent.Callable;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
final class zzba implements ServiceConnection {
    final /* synthetic */ BillingClientImpl zza;
    private final BillingClientStateListener zzb;

    /* synthetic */ zzba(BillingClientImpl billingClientImpl, BillingClientStateListener billingClientStateListener, zzbl zzblVar) {
        this.zza = billingClientImpl;
        this.zzb = billingClientStateListener;
    }

    private final void zzc(BillingResult billingResult) {
        synchronized (BillingClientImpl.zzr(this.zza)) {
            if (BillingClientImpl.zza(this.zza) == 3) {
                return;
            }
            this.zzb.onBillingSetupFinished(billingResult);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        zze.zzl("BillingClient", "Billing service died.");
        try {
            if (BillingClientImpl.zzaq(this.zza)) {
                zzch zzchVarZzj = BillingClientImpl.zzj(this.zza);
                zzjx zzjxVarZzc = zzjz.zzc();
                zzjxVarZzc.zzn(6);
                zzke zzkeVarZzc = zzki.zzc();
                zzkeVarZzc.zzo(R.styleable.AppCompatTheme_windowFixedWidthMajor);
                zzjxVarZzc.zza(zzkeVarZzc);
                zzchVarZzj.zza(zzjxVarZzc.zzf());
            } else {
                BillingClientImpl.zzj(this.zza).zze(zzkl.zzB());
            }
        } catch (Throwable th) {
            zze.zzm("BillingClient", "Unable to log.", th);
        }
        synchronized (BillingClientImpl.zzr(this.zza)) {
            if (BillingClientImpl.zza(this.zza) != 3 && BillingClientImpl.zza(this.zza) != 0) {
                BillingClientImpl.zzZ(this.zza, 0);
                BillingClientImpl.zzaa(this.zza);
                this.zzb.onBillingServiceDisconnected();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zze.zzk("BillingClient", "Billing service connected.");
        synchronized (BillingClientImpl.zzr(this.zza)) {
            if (BillingClientImpl.zza(this.zza) == 3) {
                return;
            }
            BillingClientImpl.zzV(this.zza, com.google.android.gms.internal.play_billing.zzam.zzu(iBinder));
            BillingClientImpl billingClientImpl = this.zza;
            if (BillingClientImpl.zzD(billingClientImpl, new Callable() { // from class: com.android.billingclient.api.zzay
                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    this.zza.zza();
                    return null;
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzaz
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzb();
                }
            }, BillingClientImpl.zzf(billingClientImpl)) == null) {
                BillingClientImpl billingClientImpl2 = this.zza;
                BillingResult billingResultZzl = BillingClientImpl.zzl(billingClientImpl2);
                BillingClientImpl.zzau(billingClientImpl2, 25, 6, billingResultZzl);
                zzc(billingResultZzl);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zze.zzl("BillingClient", "Billing service disconnected.");
        try {
            if (BillingClientImpl.zzaq(this.zza)) {
                zzch zzchVarZzj = BillingClientImpl.zzj(this.zza);
                zzjx zzjxVarZzc = zzjz.zzc();
                zzjxVarZzc.zzn(6);
                zzke zzkeVarZzc = zzki.zzc();
                zzkeVarZzc.zzo(R.styleable.AppCompatTheme_windowFixedHeightMinor);
                zzjxVarZzc.zza(zzkeVarZzc);
                zzchVarZzj.zza(zzjxVarZzc.zzf());
            } else {
                BillingClientImpl.zzj(this.zza).zzg(zzlu.zzB());
            }
        } catch (Throwable th) {
            zze.zzm("BillingClient", "Unable to log.", th);
        }
        synchronized (BillingClientImpl.zzr(this.zza)) {
            if (BillingClientImpl.zza(this.zza) == 3) {
                return;
            }
            BillingClientImpl.zzZ(this.zza, 0);
            this.zzb.onBillingServiceDisconnected();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ java.lang.Object zza() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 771
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.zzba.zza():java.lang.Object");
    }

    final /* synthetic */ void zzb() {
        BillingClientImpl.zzZ(this.zza, 0);
        BillingClientImpl.zzau(this.zza, 24, 6, zzcj.zzn);
        zzc(zzcj.zzn);
    }
}
