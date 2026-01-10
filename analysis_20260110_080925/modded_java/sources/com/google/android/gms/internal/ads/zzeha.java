package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzeha implements zzgci {
    private final zzfgs zza;
    private final zzcvt zzb;
    private final zzfjm zzc;
    private final zzfjq zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcqy zzg;
    private final zzegt zzh;
    private final zzedj zzi;
    private final Context zzj;
    private final zzfhm zzk;
    private final zzegd zzl;
    private final zzdrw zzm;

    zzeha(Context context, zzfgs zzfgsVar, zzegt zzegtVar, zzcvt zzcvtVar, zzfjm zzfjmVar, zzfjq zzfjqVar, zzcqy zzcqyVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzedj zzedjVar, zzfhm zzfhmVar, zzegd zzegdVar, zzdrw zzdrwVar) {
        this.zzj = context;
        this.zza = zzfgsVar;
        this.zzh = zzegtVar;
        this.zzb = zzcvtVar;
        this.zzc = zzfjmVar;
        this.zzd = zzfjqVar;
        this.zzg = zzcqyVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzedjVar;
        this.zzk = zzfhmVar;
        this.zzl = zzegdVar;
        this.zzm = zzdrwVar;
    }

    public static /* synthetic */ ListenableFuture zzb(zzeha zzehaVar, zzfbt zzfbtVar, zzfcf zzfcfVar, zzede zzedeVar, Throwable th) {
        zzfhb zzfhbVarZza = zzfha.zza(zzehaVar.zzj, 12);
        zzfhbVarZza.zzd(zzfbtVar.zzE);
        zzfhbVarZza.zzi();
        ListenableFuture listenableFutureZzo = zzgdb.zzo(zzedeVar.zza(zzfcfVar, zzfbtVar), zzfbtVar.zzR, TimeUnit.MILLISECONDS, zzehaVar.zzf);
        zzehaVar.zzh.zzf(zzfcfVar, zzfbtVar, listenableFutureZzo, zzehaVar.zzc);
        zzfhl.zza(listenableFutureZzo, zzehaVar.zzk, zzfhbVarZza);
        return listenableFutureZzo;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.String zzc(com.google.android.gms.internal.ads.zzfcf r5) {
        /*
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.internal.ads.zzbdc.zzfL
            com.google.android.gms.internal.ads.zzbda r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "No fill."
            r2 = 1
            if (r2 == r0) goto L18
            java.lang.String r0 = "No ad config."
            goto L19
        L18:
            r0 = r1
        L19:
            com.google.android.gms.internal.ads.zzfce r5 = r5.zzb
            com.google.android.gms.internal.ads.zzfbw r5 = r5.zzb
            int r2 = r5.zzf
            if (r2 == 0) goto L57
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 300(0x12c, float:4.2E-43)
            if (r2 < r3) goto L3c
            if (r2 >= r4) goto L3c
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.internal.ads.zzbdc.zzfK
            com.google.android.gms.internal.ads.zzbda r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r3.zzb(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L57
            goto L58
        L3c:
            if (r2 < r4) goto L45
            r0 = 400(0x190, float:5.6E-43)
            if (r2 >= r0) goto L45
            java.lang.String r1 = "No location header to follow redirect or too many redirects."
            goto L58
        L45:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Received error HTTP response code: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            goto L58
        L57:
            r1 = r0
        L58:
            com.google.android.gms.internal.ads.zzfbv r5 = r5.zzj
            if (r5 == 0) goto L61
            java.lang.String r5 = r5.zza()
            return r5
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeha.zzc(com.google.android.gms.internal.ads.zzfcf):java.lang.String");
    }

    public final /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        int i;
        Bundle bundle;
        final zzfcf zzfcfVar = (zzfcf) obj;
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzco)).booleanValue() && (bundle = zzfcfVar.zzb.zzd) != null) {
            this.zzm.zza().putAll(bundle);
        }
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzcp)).booleanValue()) {
            this.zzm.zza().putLong(zzdrk.zzu.zza(), zzv.zzD().currentTimeMillis());
        }
        String strZzc = zzc(zzfcfVar);
        zzedj zzedjVar = this.zzi;
        zzfce zzfceVar = zzfcfVar.zzb;
        zzfbw zzfbwVar = zzfceVar.zzb;
        zzedjVar.zzi(zzfbwVar);
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zziA)).booleanValue() && (i = zzfbwVar.zzf) != 0 && (i < 200 || i >= 300)) {
            return zzgdb.zzg(new zzegx(3, strZzc));
        }
        String str = zzfbwVar.zzq;
        if (!((Boolean) zzbd.zzc().zzb(zzbdc.zzdP)).booleanValue() || TextUtils.isEmpty(str)) {
            for (zzfbt zzfbtVar : zzfceVar.zza) {
                zzedjVar.zzd(zzfbtVar);
                Iterator it = zzfbtVar.zza.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zzedjVar.zzf(zzfbtVar, 0L, zzfdp.zzd(1, (String) null, (zze) null));
                        break;
                    }
                    zzede zzedeVarZza = this.zzg.zza(zzfbtVar.zzb, (String) it.next());
                    if (zzedeVarZza == null || !zzedeVarZza.zzb(zzfcfVar, zzfbtVar)) {
                    }
                }
            }
        } else {
            zzedjVar.zzh(str, zzfceVar.zza);
        }
        zzcvt zzcvtVar = this.zzb;
        zzcmp zzcmpVar = new zzcmp(zzfcfVar, this.zzd, this.zzc);
        Executor executor = this.zze;
        zzcvtVar.zzo(zzcmpVar, executor);
        if (zzfbwVar.zzr > 1) {
            return this.zzl.zzb(zzfcfVar);
        }
        String strZzc2 = zzc(zzfcfVar);
        zzfgs zzfgsVar = this.zza;
        int i2 = 0;
        zzffy zzffyVarZza = zzfgc.zzc(zzgdb.zzg(new zzegx(3, strZzc2)), zzfgm.zzn, zzfgsVar).zza();
        final zzegt zzegtVar = this.zzh;
        zzegtVar.zzl();
        for (final zzfbt zzfbtVar2 : zzfceVar.zza) {
            Iterator it2 = zzfbtVar2.zza.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String str2 = (String) it2.next();
                final zzede zzedeVarZza2 = this.zzg.zza(zzfbtVar2.zzb, str2);
                if (zzedeVarZza2 != null && zzedeVarZza2.zzb(zzfcfVar, zzfbtVar2)) {
                    zzffyVarZza = zzfgsVar.zzb(zzfgm.zzo, zzffyVarZza).zzh("render-config-" + i2 + "-" + str2).zzc(Throwable.class, new zzgci() { // from class: com.google.android.gms.internal.ads.zzegy
                        public final ListenableFuture zza(Object obj2) {
                            return zzeha.zzb(this.zza, zzfbtVar2, zzfcfVar, zzedeVarZza2, (Throwable) obj2);
                        }
                    }).zza();
                    break;
                }
            }
            i2++;
        }
        Objects.requireNonNull(zzegtVar);
        zzffyVarZza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegz
            @Override // java.lang.Runnable
            public final void run() {
                zzegtVar.zzj();
            }
        }, executor);
        return zzffyVarZza;
    }
}
