package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzegv {
    private final zzfdg zza;
    private final zzdpp zzb;
    private final zzdsc zzc;

    public zzegv(zzfdg zzfdgVar, zzdpp zzdppVar, zzdsc zzdscVar) {
        this.zza = zzfdgVar;
        this.zzb = zzdppVar;
        this.zzc = zzdscVar;
    }

    public final void zza(zzfbw zzfbwVar, zzfbt zzfbtVar, int i, @Nullable zzedi zzediVar, long j) {
        zzdpo zzdpoVarZza;
        zzdsb zzdsbVarZza = this.zzc.zza();
        zzdsbVarZza.zzd(zzfbwVar);
        zzdsbVarZza.zzc(zzfbtVar);
        zzdsbVarZza.zzb("action", "adapter_status");
        zzdsbVarZza.zzb("adapter_l", String.valueOf(j));
        zzdsbVarZza.zzb("sc", Integer.toString(i));
        if (zzediVar != null) {
            zzdsbVarZza.zzb("arec", Integer.toString(zzediVar.zzb().zza));
            String strZza = this.zza.zza(zzediVar.getMessage());
            if (strZza != null) {
                zzdsbVarZza.zzb("areec", strZza);
            }
        }
        zzdpp zzdppVar = this.zzb;
        Iterator it = zzfbtVar.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzdpoVarZza = null;
                break;
            } else {
                zzdpoVarZza = zzdppVar.zza((String) it.next());
                if (zzdpoVarZza != null) {
                    break;
                }
            }
        }
        if (zzdpoVarZza != null) {
            zzdsbVarZza.zzb("ancn", zzdpoVarZza.zza);
            zzbsc zzbscVar = zzdpoVarZza.zzb;
            if (zzbscVar != null) {
                zzdsbVarZza.zzb("adapter_v", zzbscVar.toString());
            }
            zzbsc zzbscVar2 = zzdpoVarZza.zzc;
            if (zzbscVar2 != null) {
                zzdsbVarZza.zzb("adapter_sv", zzbscVar2.toString());
            }
        }
        zzdsbVarZza.zzj();
    }
}
