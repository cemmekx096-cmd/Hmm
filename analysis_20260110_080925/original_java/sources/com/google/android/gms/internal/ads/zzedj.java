package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.crashlytics.android.BuildConfig;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzedj {
    private final String zzc;
    private zzfbw zzd = null;
    private zzfbt zze = null;
    private zzv zzf = null;
    private final Map zzb = Collections.synchronizedMap(new HashMap());
    private final List zza = Collections.synchronizedList(new ArrayList());

    public zzedj(String str) {
        this.zzc = str;
    }

    private static String zzj(zzfbt zzfbtVar) {
        return ((Boolean) zzbd.zzc().zzb(zzbdc.zzdP)).booleanValue() ? zzfbtVar.zzap : zzfbtVar.zzw;
    }

    private final synchronized void zzk(zzfbt zzfbtVar, int i) {
        Map map = this.zzb;
        String strZzj = zzj(zzfbtVar);
        if (map.containsKey(strZzj)) {
            return;
        }
        Bundle bundle = new Bundle();
        JSONObject jSONObject = zzfbtVar.zzv;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, jSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        zzv zzvVar = new zzv(zzfbtVar.zzE, 0L, (zze) null, bundle, zzfbtVar.zzF, zzfbtVar.zzG, zzfbtVar.zzH, zzfbtVar.zzI);
        try {
            this.zza.add(i, zzvVar);
        } catch (IndexOutOfBoundsException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.zzb.put(strZzj, zzvVar);
    }

    private final void zzl(zzfbt zzfbtVar, long j, zze zzeVar, boolean z) {
        Map map = this.zzb;
        String strZzj = zzj(zzfbtVar);
        if (map.containsKey(strZzj)) {
            if (this.zze == null) {
                this.zze = zzfbtVar;
            }
            zzv zzvVar = (zzv) map.get(strZzj);
            zzvVar.zzb = j;
            zzvVar.zzc = zzeVar;
            if (((Boolean) zzbd.zzc().zzb(zzbdc.zzgS)).booleanValue() && z) {
                this.zzf = zzvVar;
            }
        }
    }

    public final zzv zza() {
        return this.zzf;
    }

    public final zzcvk zzb() {
        return new zzcvk(this.zze, BuildConfig.FLAVOR, this, this.zzd, this.zzc);
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zzfbt zzfbtVar) {
        zzk(zzfbtVar, this.zza.size());
    }

    public final void zze(zzfbt zzfbtVar) {
        Map map = this.zzb;
        Object obj = map.get(zzj(zzfbtVar));
        List list = this.zza;
        int iIndexOf = list.indexOf(obj);
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            iIndexOf = list.indexOf(this.zzf);
        }
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            return;
        }
        this.zzf = (zzv) list.get(iIndexOf);
        while (true) {
            iIndexOf++;
            if (iIndexOf >= list.size()) {
                return;
            }
            zzv zzvVar = (zzv) list.get(iIndexOf);
            zzvVar.zzb = 0L;
            zzvVar.zzc = null;
        }
    }

    public final void zzf(zzfbt zzfbtVar, long j, zze zzeVar) {
        zzl(zzfbtVar, j, zzeVar, false);
    }

    public final void zzg(zzfbt zzfbtVar, long j, zze zzeVar) {
        zzl(zzfbtVar, j, null, true);
    }

    public final synchronized void zzh(String str, List list) {
        Map map = this.zzb;
        if (map.containsKey(str)) {
            zzv zzvVar = (zzv) map.get(str);
            List list2 = this.zza;
            int iIndexOf = list2.indexOf(zzvVar);
            try {
                list2.remove(iIndexOf);
            } catch (IndexOutOfBoundsException e) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.zzb.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzk((zzfbt) it.next(), iIndexOf);
                iIndexOf++;
            }
        }
    }

    public final void zzi(zzfbw zzfbwVar) {
        this.zzd = zzfbwVar;
    }
}
