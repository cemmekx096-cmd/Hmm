package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.media3.exoplayer.offline.DownloadService;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzeno implements zzetu {
    final Context zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzcsl zze;
    private final zzfdv zzf;
    private final zzfco zzg;
    private final zzg zzh = zzv.zzp().zzi();
    private final zzdrw zzi;
    private final zzcsz zzj;

    public zzeno(Context context, String str, String str2, zzcsl zzcslVar, zzfdv zzfdvVar, zzfco zzfcoVar, zzdrw zzdrwVar, zzcsz zzcszVar, long j) {
        this.zza = context;
        this.zzb = str;
        this.zzc = str2;
        this.zze = zzcslVar;
        this.zzf = zzfdvVar;
        this.zzg = zzfcoVar;
        this.zzi = zzdrwVar;
        this.zzj = zzcszVar;
        this.zzd = j;
    }

    public final int zza() {
        return 12;
    }

    public final ListenableFuture zzb() {
        Bundle bundle = new Bundle();
        zzdrw zzdrwVar = this.zzi;
        Map mapZzb = zzdrwVar.zzb();
        String str = this.zzb;
        mapZzb.put("seq_num", str);
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzco)).booleanValue()) {
            zzdrwVar.zzd("tsacc", String.valueOf(zzv.zzD().currentTimeMillis() - this.zzd));
            zzv.zzr();
            zzdrwVar.zzd(DownloadService.KEY_FOREGROUND, true != zzs.zzH(this.zza) ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
        }
        zzcsl zzcslVar = this.zze;
        zzfco zzfcoVar = this.zzg;
        zzcslVar.zzk(zzfcoVar.zzd);
        bundle.putAll(this.zzf.zzb());
        return zzgdb.zzh(new zzenp(this.zza, bundle, str, this.zzc, this.zzh, zzfcoVar.zzf, this.zzj));
    }
}
