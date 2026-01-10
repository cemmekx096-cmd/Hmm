package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import io.fabric.sdk.android.services.events.EventsFilesManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzegt {
    private final Clock zza;
    private final zzegv zzb;
    private final zzfjq zzc;
    private final LinkedHashMap zzd = new LinkedHashMap();
    private final boolean zze = ((Boolean) zzbd.zzc().zzb(zzbdc.zzgV)).booleanValue();
    private final zzedj zzf;
    private boolean zzg;
    private long zzh;
    private long zzi;

    public zzegt(Clock clock, zzegv zzegvVar, zzedj zzedjVar, zzfjq zzfjqVar) {
        this.zza = clock;
        this.zzb = zzegvVar;
        this.zzf = zzedjVar;
        this.zzc = zzfjqVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized boolean zzq(zzfbt zzfbtVar) {
        zzegs zzegsVar = (zzegs) this.zzd.get(zzfbtVar);
        if (zzegsVar == null) {
            return false;
        }
        return zzegsVar.zzc == 8;
    }

    public final synchronized long zza() {
        return this.zzh;
    }

    final synchronized ListenableFuture zzf(zzfcf zzfcfVar, zzfbt zzfbtVar, ListenableFuture listenableFuture, zzfjm zzfjmVar) {
        zzfbw zzfbwVar = zzfcfVar.zzb.zzb;
        long jElapsedRealtime = this.zza.elapsedRealtime();
        String str = zzfbtVar.zzw;
        if (str != null) {
            this.zzd.put(zzfbtVar, new zzegs(str, zzfbtVar.zzaf, 9, 0L, null));
            zzgdb.zzr(listenableFuture, new zzegr(this, jElapsedRealtime, zzfbwVar, zzfbtVar, str, zzfjmVar, zzfcfVar), zzcad.zzg);
        }
        return listenableFuture;
    }

    public final synchronized String zzg() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.zzd.entrySet().iterator();
        while (it.hasNext()) {
            zzegs zzegsVar = (zzegs) ((Map.Entry) it.next()).getValue();
            if (zzegsVar.zzc != Integer.MAX_VALUE) {
                arrayList.add(zzegsVar.toString());
            }
        }
        return TextUtils.join(EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR, arrayList);
    }

    public final synchronized void zzi(zzfbt zzfbtVar) {
        this.zzh = this.zza.elapsedRealtime() - this.zzi;
        if (zzfbtVar != null) {
            this.zzf.zze(zzfbtVar);
        }
        this.zzg = true;
    }

    public final synchronized void zzj() {
        this.zzh = this.zza.elapsedRealtime() - this.zzi;
    }

    public final synchronized void zzk(List list) {
        this.zzi = this.zza.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfbt zzfbtVar = (zzfbt) it.next();
            String str = zzfbtVar.zzw;
            if (!TextUtils.isEmpty(str)) {
                this.zzd.put(zzfbtVar, new zzegs(str, zzfbtVar.zzaf, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void zzl() {
        this.zzi = this.zza.elapsedRealtime();
    }

    public final synchronized void zzm(zzfbt zzfbtVar) {
        zzegs zzegsVar = (zzegs) this.zzd.get(zzfbtVar);
        if (zzegsVar == null || this.zzg) {
            return;
        }
        zzegsVar.zzc = 8;
    }
}
