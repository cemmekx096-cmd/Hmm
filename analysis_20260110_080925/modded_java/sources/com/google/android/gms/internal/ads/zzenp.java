package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzenp implements zzett {
    private final Context zza;
    private final Bundle zzb;
    private final String zzc;
    private final String zzd;
    private final zzg zze;
    private final String zzf;
    private final zzcsz zzg;

    public zzenp(Context context, Bundle bundle, String str, String str2, zzg zzgVar, String str3, zzcsz zzcszVar) {
        this.zza = context;
        this.zzb = bundle;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzgVar;
        this.zzf = str3;
        this.zzg = zzcszVar;
    }

    private final void zzc(Bundle bundle) {
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzfP)).booleanValue()) {
            try {
                zzv.zzr();
                bundle.putString("_app_id", zzs.zzq(this.zza));
            } catch (RemoteException | RuntimeException e) {
                zzv.zzp().zzw(e, "AppStatsSignal_AppId");
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcut) obj).zzb;
        bundle.putBundle("quality_signals", this.zzb);
        zzc(bundle);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcut) obj).zza;
        bundle.putBundle("quality_signals", this.zzb);
        bundle.putString("seq_num", this.zzc);
        if (!this.zze.zzN()) {
            bundle.putString("session_id", this.zzd);
        }
        bundle.putBoolean("client_purpose_one", !r0.zzN());
        zzc(bundle);
        String str = this.zzf;
        if (str != null) {
            Bundle bundle2 = new Bundle();
            zzcsz zzcszVar = this.zzg;
            bundle2.putLong("dload", zzcszVar.zzb(str));
            bundle2.putInt("pcc", zzcszVar.zza(str));
            bundle.putBundle("ad_unit_quality_signals", bundle2);
        }
        if (!((Boolean) zzbd.zzc().zzb(zzbdc.zzjX)).booleanValue() || zzv.zzp().zza() <= 0) {
            return;
        }
        bundle.putInt("nrwv", zzv.zzp().zza());
    }
}
