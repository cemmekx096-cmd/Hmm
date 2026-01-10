package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzecx {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzfbt zzc;
    private final zzcfe zzd;
    private final zzdsc zze;
    private zzflo zzf;

    zzecx(Context context, VersionInfoParcel versionInfoParcel, zzfbt zzfbtVar, zzcfe zzcfeVar, zzdsc zzdscVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzfbtVar;
        this.zzd = zzcfeVar;
        this.zze = zzdscVar;
    }

    public final synchronized void zza(View view) {
        zzflo zzfloVar = this.zzf;
        if (zzfloVar != null) {
            zzv.zzC().zzh(zzfloVar, view);
        }
    }

    public final synchronized void zzb() {
        zzcfe zzcfeVar;
        if (this.zzf == null || (zzcfeVar = this.zzd) == null) {
            return;
        }
        zzcfeVar.zzd("onSdkImpression", zzfyi.zzd());
    }

    public final synchronized void zzc() {
        zzcfe zzcfeVar;
        zzflo zzfloVar = this.zzf;
        if (zzfloVar == null || (zzcfeVar = this.zzd) == null) {
            return;
        }
        Iterator it = zzcfeVar.zzV().iterator();
        while (it.hasNext()) {
            zzv.zzC().zzh(zzfloVar, (View) it.next());
        }
        zzcfeVar.zzd("onSdkLoaded", zzfyi.zzd());
    }

    public final synchronized boolean zzd() {
        return this.zzf != null;
    }

    public final synchronized boolean zze(boolean z) {
        zzcfe zzcfeVar;
        zzfbt zzfbtVar = this.zzc;
        if (zzfbtVar.zzT) {
            if (((Boolean) zzbd.zzc().zzb(zzbdc.zzfu)).booleanValue()) {
                if (((Boolean) zzbd.zzc().zzb(zzbdc.zzfx)).booleanValue() && (zzcfeVar = this.zzd) != null) {
                    if (this.zzf != null) {
                        int i = zze.zza;
                        zzo.zzj("Omid javascript session service already started for ad.");
                        return false;
                    }
                    if (!zzv.zzC().zzl(this.zza)) {
                        int i2 = zze.zza;
                        zzo.zzj("Unable to initialize omid.");
                        return false;
                    }
                    if (zzfbtVar.zzV.zzb()) {
                        zzflo zzfloVarZze = zzv.zzC().zze(this.zzb, zzcfeVar.zzG(), true);
                        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzfy)).booleanValue()) {
                            zzdsc zzdscVar = this.zze;
                            String str = zzfloVarZze != null ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0";
                            zzdsb zzdsbVarZza = zzdscVar.zza();
                            zzdsbVarZza.zzb("omid_js_session_success", str);
                            zzdsbVarZza.zzj();
                        }
                        if (zzfloVarZze == null) {
                            int i3 = zze.zza;
                            zzo.zzj("Unable to create javascript session service.");
                            return false;
                        }
                        int i4 = zze.zza;
                        zzo.zzi("Created omid javascript session service.");
                        this.zzf = zzfloVarZze;
                        zzcfeVar.zzas(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized void zzf(zzcfv zzcfvVar) {
        zzcfe zzcfeVar;
        zzflo zzfloVar = this.zzf;
        if (zzfloVar == null || (zzcfeVar = this.zzd) == null) {
            return;
        }
        zzv.zzC().zzm(zzfloVar, zzcfvVar);
        this.zzf = null;
        zzcfeVar.zzas((zzecx) null);
    }
}
