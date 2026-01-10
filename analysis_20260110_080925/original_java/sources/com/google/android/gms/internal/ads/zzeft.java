package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.qs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzeft implements zzefn {
    private final zzdgu zza;
    private final zzgdm zzb;
    private final zzdlg zzc;
    private final zzfdn zzd;
    private final zzdnx zze;
    private final zzdrw zzf;
    private final VersionInfoParcel zzg;
    private final Context zzh;
    private final zzbxu zzi;

    public zzeft(zzdgu zzdguVar, zzgdm zzgdmVar, zzdlg zzdlgVar, zzfdn zzfdnVar, zzdnx zzdnxVar, zzdrw zzdrwVar, VersionInfoParcel versionInfoParcel, Context context, zzbxu zzbxuVar) {
        this.zzg = versionInfoParcel;
        this.zzh = context;
        this.zzi = zzbxuVar;
        this.zza = zzdguVar;
        this.zzb = zzgdmVar;
        this.zzc = zzdlgVar;
        this.zzd = zzfdnVar;
        this.zze = zzdnxVar;
        this.zzf = zzdrwVar;
    }

    public static /* synthetic */ zzdih zzc(zzeft zzeftVar, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzfcf zzfcfVar, zzfbt zzfbtVar, JSONObject jSONObject, zzb zzbVar, zzbxy zzbxyVar) {
        zzdim zzdimVar = (zzdim) listenableFuture.get();
        zzdnr zzdnrVar = (zzdnr) listenableFuture2.get();
        zzbct zzbctVar = zzbdc.zzcr;
        if (((Boolean) zzbd.zzc().zzb(zzbctVar)).booleanValue()) {
            zzeftVar.zzf.zza().putLong(zzdrk.zzC.zza(), zzv.zzD().currentTimeMillis());
        }
        zzdin zzdinVarZzd = zzeftVar.zza.zzd(new zzcrl(zzfcfVar, zzfbtVar, (String) null), new zzdiy(zzdimVar), new zzdhi(jSONObject, zzdnrVar, zzbVar, zzbxyVar));
        if (((Boolean) zzbd.zzc().zzb(zzbctVar)).booleanValue()) {
            long jCurrentTimeMillis = zzv.zzD().currentTimeMillis();
            zzdrw zzdrwVar = zzeftVar.zzf;
            zzdrwVar.zza().putLong(zzdrk.zzD.zza(), jCurrentTimeMillis);
            zzdrwVar.zza().putLong(zzdrk.zzE.zza(), jCurrentTimeMillis);
        }
        zzdinVarZzd.zzh().zzb();
        zzdinVarZzd.zzi().zza(zzdnrVar);
        zzdinVarZzd.zzg().zzc(zzdimVar.zzs());
        zzdinVarZzd.zzl().zza(zzeftVar.zze, zzdimVar.zzq());
        if (((Boolean) zzbd.zzc().zzb(zzbctVar)).booleanValue()) {
            zzeftVar.zzf.zza().putLong(zzdrk.zzF.zza(), zzv.zzD().currentTimeMillis());
        }
        return zzdinVarZzd.zza();
    }

    public static /* synthetic */ ListenableFuture zzd(zzeft zzeftVar, zzfcf zzfcfVar, zzfbt zzfbtVar, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return zzgdb.zzg(new zzdwe(3));
        }
        int i = zzfcfVar.zza.zza.zzk;
        if (i <= 1) {
            return zzgdb.zzm(zzeftVar.zzg(zzfcfVar, zzfbtVar, jSONArray.getJSONObject(0)), new zzfut() { // from class: com.google.android.gms.internal.ads.zzefs
                public final Object apply(Object obj) {
                    return Collections.singletonList(zzgdb.zzh((zzdih) obj));
                }
            }, zzeftVar.zzb);
        }
        int length = jSONArray.length();
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzcs)).booleanValue()) {
            zzeftVar.zzf.zzd("nsl", String.valueOf(length));
        }
        zzeftVar.zzd.zzc(Math.min(length, i));
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < length) {
                arrayList.add(zzeftVar.zzg(zzfcfVar, zzfbtVar, jSONArray.getJSONObject(i2)));
            } else {
                arrayList.add(zzgdb.zzg(new zzdwe(3)));
            }
        }
        return zzgdb.zzh(arrayList);
    }

    public static /* synthetic */ ListenableFuture zze(final zzeft zzeftVar, zzfbt zzfbtVar, final zzdnr zzdnrVar) throws JSONException {
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzcq)).booleanValue()) {
            zzeftVar.zzf.zza().putLong(zzdrk.zzx.zza(), zzv.zzD().currentTimeMillis());
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zziT)).booleanValue() && PlatformVersion.isAtLeastR()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(qs.n, zzfbtVar.zzs.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzgdb.zzn(zzdnrVar.zzg("google.afma.nativeAds.preProcessJson", jSONObject2), new zzgci() { // from class: com.google.android.gms.internal.ads.zzefp
            public final ListenableFuture zza(Object obj) {
                return zzeft.zzf(this.zza, zzdnrVar, (JSONObject) obj);
            }
        }, zzeftVar.zzb);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.ads.zzboj */
    public static /* synthetic */ ListenableFuture zzf(zzeft zzeftVar, zzdnr zzdnrVar, JSONObject jSONObject) throws zzboj {
        zzeftVar.zzd.zzb(zzgdb.zzh(zzdnrVar));
        if (!jSONObject.optBoolean("success")) {
            throw new zzboj("process json failed");
        }
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzcq)).booleanValue()) {
            zzeftVar.zzf.zza().putLong(zzdrk.zzy.zza(), zzv.zzD().currentTimeMillis());
        }
        return zzgdb.zzh(jSONObject.getJSONObject("json").getJSONArray("ads"));
    }

    private final ListenableFuture zzg(final zzfcf zzfcfVar, final zzfbt zzfbtVar, final JSONObject jSONObject) {
        final zzbxy zzbxyVar;
        final zzb zzbVar;
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzcr)).booleanValue()) {
            this.zzf.zza().putLong(zzdrk.zzB.zza(), zzv.zzD().currentTimeMillis());
        }
        final ListenableFuture listenableFutureZza = this.zzd.zza();
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zznE)).booleanValue()) {
            Context context = this.zzh;
            zzbxy zzbxyVarZza = zzcvm.zza(context, this.zzg, zzfbtVar, this.zzi);
            zzbxyVar = zzbxyVarZza;
            zzbVar = new zzb(context, zzbxyVarZza, (zzbuw) null);
        } else {
            zzbxyVar = null;
            zzbVar = new zzb(this.zzh, (zzbxy) null, (zzbuw) null);
        }
        final ListenableFuture listenableFutureZzd = this.zzc.zzd(zzfcfVar, zzfbtVar, jSONObject, zzbVar, zzbxyVar);
        return zzgdb.zzc(new ListenableFuture[]{listenableFutureZza, listenableFutureZzd}).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzefo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeft.zzc(this.zza, listenableFutureZzd, listenableFutureZza, zzfcfVar, zzfbtVar, jSONObject, zzbVar, zzbxyVar);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final ListenableFuture zza(final zzfcf zzfcfVar, final zzfbt zzfbtVar) {
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzcq)).booleanValue()) {
            this.zzf.zza().putLong(zzdrk.zzw.zza(), zzv.zzD().currentTimeMillis());
        }
        ListenableFuture listenableFutureZza = this.zzd.zza();
        zzgci zzgciVar = new zzgci() { // from class: com.google.android.gms.internal.ads.zzefq
            public final ListenableFuture zza(Object obj) {
                return zzeft.zze(this.zza, zzfbtVar, (zzdnr) obj);
            }
        };
        zzgdm zzgdmVar = this.zzb;
        return zzgdb.zzn(zzgdb.zzn(listenableFutureZza, zzgciVar, zzgdmVar), new zzgci() { // from class: com.google.android.gms.internal.ads.zzefr
            public final ListenableFuture zza(Object obj) {
                return zzeft.zzd(this.zza, zzfcfVar, zzfbtVar, (JSONArray) obj);
            }
        }, zzgdmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final boolean zzb(zzfcf zzfcfVar, zzfbt zzfbtVar) {
        zzfby zzfbyVar = zzfbtVar.zzs;
        return (zzfbyVar == null || zzfbyVar.zzc == null) ? false : true;
    }
}
