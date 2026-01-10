package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzeil implements zzede {
    private final zzedg zza;
    private final zzedk zzb;
    private final zzfgs zzc;
    private final zzgdm zzd;

    public zzeil(zzfgs zzfgsVar, zzgdm zzgdmVar, zzedg zzedgVar, zzedk zzedkVar) {
        this.zzc = zzfgsVar;
        this.zzd = zzgdmVar;
        this.zzb = zzedkVar;
        this.zza = zzedgVar;
    }

    static final String zze(String str, int i) {
        return "Error from: " + str + ", code: " + i;
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final ListenableFuture zza(final zzfcf zzfcfVar, final zzfbt zzfbtVar) {
        final zzedh zzedhVarZza;
        Iterator it = zzfbtVar.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzedhVarZza = null;
                break;
            }
            try {
                zzedhVarZza = this.zza.zza((String) it.next(), zzfbtVar.zzv);
                break;
            } catch (zzfcv unused) {
            }
        }
        if (zzedhVarZza == null) {
            return zzgdb.zzg(new zzegb("Unable to instantiate mediation adapter class."));
        }
        zzcai zzcaiVar = new zzcai();
        zzedhVarZza.zzc.zza(new zzeik(this, zzedhVarZza, zzcaiVar));
        if (zzfbtVar.zzM) {
            Bundle bundle = zzfcfVar.zza.zza.zzd.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfgs zzfgsVar = this.zzc;
        return zzfgc.zzd(new zzffx() { // from class: com.google.android.gms.internal.ads.zzeii
            public final void zza() throws zzfcv {
                this.zza.zzb.zzb(zzfcfVar, zzfbtVar, zzedhVarZza);
            }
        }, this.zzd, zzfgm.zzq, zzfgsVar).zzb(zzfgm.zzr).zzd(zzcaiVar).zzb(zzfgm.zzs).zze(new zzffw() { // from class: com.google.android.gms.internal.ads.zzeij
            public final Object zza(Object obj) {
                return this.zza.zzb.zza(zzfcfVar, zzfbtVar, zzedhVarZza);
            }
        }).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final boolean zzb(zzfcf zzfcfVar, zzfbt zzfbtVar) {
        return !zzfbtVar.zzt.isEmpty();
    }
}
