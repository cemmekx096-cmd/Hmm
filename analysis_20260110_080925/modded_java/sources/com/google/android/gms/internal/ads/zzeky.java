package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzbw;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcv;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.ads.internal.client.zzgc;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzeky extends zzbw {
    private final zzr zza;
    private final Context zzb;
    private final zzezw zzc;
    private final String zzd;
    private final VersionInfoParcel zze;
    private final zzekq zzf;
    private final zzfaw zzg;
    private final zzavs zzh;
    private final zzdsc zzi;
    private zzdeu zzj;
    private boolean zzk = ((Boolean) zzbd.zzc().zzb(zzbdc.zzaQ)).booleanValue();

    public zzeky(Context context, zzr zzrVar, String str, zzezw zzezwVar, zzekq zzekqVar, zzfaw zzfawVar, VersionInfoParcel versionInfoParcel, zzavs zzavsVar, zzdsc zzdscVar) {
        this.zza = zzrVar;
        this.zzd = str;
        this.zzb = context;
        this.zzc = zzezwVar;
        this.zzf = zzekqVar;
        this.zzg = zzfawVar;
        this.zze = versionInfoParcel;
        this.zzh = zzavsVar;
        this.zzi = zzdscVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized boolean zze() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzdeu r0 = r1.zzj     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Le
            boolean r0 = r0.zza()     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto Le
            r0 = 1
        Lc:
            monitor-exit(r1)
            return r0
        Le:
            r0 = 0
            goto Lc
        L10:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeky.zze():boolean");
    }

    public final void zzA() {
    }

    public final synchronized void zzB() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        zzdeu zzdeuVar = this.zzj;
        if (zzdeuVar != null) {
            zzdeuVar.zzm().zzc((Context) null);
        }
    }

    public final void zzC(zzbh zzbhVar) {
    }

    public final void zzD(zzbk zzbkVar) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzf.zzj(zzbkVar);
    }

    public final void zzE(zzcb zzcbVar) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    public final void zzF(zzr zzrVar) {
    }

    public final void zzG(zzco zzcoVar) {
        Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.zzf.zzm(zzcoVar);
    }

    public final void zzH(zzbax zzbaxVar) {
    }

    public final void zzI(zzx zzxVar) {
    }

    public final void zzJ(zzcv zzcvVar) {
        this.zzf.zzn(zzcvVar);
    }

    public final void zzK(zzeh zzehVar) {
    }

    public final synchronized void zzL(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzk = z;
    }

    public final void zzM(zzbtx zzbtxVar) {
    }

    public final void zzN(boolean z) {
    }

    public final synchronized void zzO(zzbdx zzbdxVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzc.zzi(zzbdxVar);
    }

    public final void zzP(zzdt zzdtVar) {
        Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdtVar.zzf()) {
                this.zzi.zze();
            }
        } catch (RemoteException e) {
            int i = zze.zza;
            zzo.zzf("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzf.zzl(zzdtVar);
    }

    public final void zzQ(zzbua zzbuaVar, String str) {
    }

    public final void zzR(String str) {
    }

    public final void zzS(zzbwg zzbwgVar) {
        this.zzg.zzm(zzbwgVar);
    }

    public final void zzT(String str) {
    }

    public final void zzU(zzgc zzgcVar) {
    }

    public final synchronized void zzW(IObjectWrapper iObjectWrapper) {
        if (this.zzj == null) {
            int i = zze.zza;
            zzo.zzj("Interstitial can not be shown before loaded.");
            this.zzf.zzr(zzfdp.zzd(9, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
        } else {
            if (((Boolean) zzbd.zzc().zzb(zzbdc.zzdb)).booleanValue()) {
                this.zzh.zzc().zzn(new Throwable().getStackTrace());
            }
            this.zzj.zzc(this.zzk, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    public final synchronized void zzX() {
        Preconditions.checkMainThread("showInterstitial must be called on the main UI thread.");
        if (this.zzj == null) {
            int i = zze.zza;
            zzo.zzj("Interstitial can not be shown before loaded.");
            this.zzf.zzr(zzfdp.zzd(9, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
        } else {
            if (((Boolean) zzbd.zzc().zzb(zzbdc.zzdb)).booleanValue()) {
                this.zzh.zzc().zzn(new Throwable().getStackTrace());
            }
            this.zzj.zzc(this.zzk, (Activity) null);
        }
    }

    public final synchronized boolean zzY() {
        return false;
    }

    public final synchronized boolean zzZ() {
        return this.zzc.zza();
    }

    public final synchronized boolean zzaa() {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zze();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean zzab(com.google.android.gms.ads.internal.client.zzm r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r6.zzb()     // Catch: java.lang.Throwable -> L92
            r1 = 0
            if (r0 == 0) goto L9
            goto L49
        L9:
            com.google.android.gms.internal.ads.zzbem r0 = com.google.android.gms.internal.ads.zzbfa.zzi     // Catch: java.lang.Throwable -> L92
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L92
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L92
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L92
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.internal.ads.zzbdc.zzlu     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.internal.ads.zzbda r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L92
            java.lang.Object r0 = r2.zzb(r0)     // Catch: java.lang.Throwable -> L92
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L92
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L92
            if (r0 == 0) goto L2b
            r0 = 1
            goto L2c
        L2b:
            r0 = r1
        L2c:
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = r5.zze     // Catch: java.lang.Throwable -> L92
            int r2 = r2.clientJarVersion     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.internal.ads.zzbdc.zzlv     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.internal.ads.zzbda r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L92
            java.lang.Object r3 = r4.zzb(r3)     // Catch: java.lang.Throwable -> L92
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L92
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L92
            if (r2 < r3) goto L44
            if (r0 != 0) goto L49
        L44:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L92
        L49:
            com.google.android.gms.ads.internal.zzv.zzr()     // Catch: java.lang.Throwable -> L92
            android.content.Context r0 = r5.zzb     // Catch: java.lang.Throwable -> L92
            boolean r2 = com.google.android.gms.ads.internal.util.zzs.zzI(r0)     // Catch: java.lang.Throwable -> L92
            r3 = 0
            if (r2 == 0) goto L6d
            com.google.android.gms.ads.internal.client.zzc r2 = r6.zzs     // Catch: java.lang.Throwable -> L92
            if (r2 != 0) goto L6d
            int r6 = com.google.android.gms.ads.internal.util.zze.zza     // Catch: java.lang.Throwable -> L92
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.ads.internal.util.client.zzo.zzg(r6)     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.internal.ads.zzekq r6 = r5.zzf     // Catch: java.lang.Throwable -> L92
            if (r6 == 0) goto L90
            r0 = 4
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfdp.zzd(r0, r3, r3)     // Catch: java.lang.Throwable -> L92
            r6.zzdD(r0)     // Catch: java.lang.Throwable -> L92
            goto L90
        L6d:
            boolean r2 = r5.zze()     // Catch: java.lang.Throwable -> L92
            if (r2 != 0) goto L90
            boolean r1 = r6.zzf     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.internal.ads.zzfdl.zza(r0, r1)     // Catch: java.lang.Throwable -> L92
            r5.zzj = r3     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.internal.ads.zzezw r0 = r5.zzc     // Catch: java.lang.Throwable -> L92
            java.lang.String r1 = r5.zzd     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.ads.internal.client.zzr r2 = r5.zza     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.internal.ads.zzezp r3 = new com.google.android.gms.internal.ads.zzezp     // Catch: java.lang.Throwable -> L92
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.internal.ads.zzekx r2 = new com.google.android.gms.internal.ads.zzekx     // Catch: java.lang.Throwable -> L92
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L92
            boolean r6 = r0.zzb(r6, r1, r3, r2)     // Catch: java.lang.Throwable -> L92
            monitor-exit(r5)
            return r6
        L90:
            monitor-exit(r5)
            return r1
        L92:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeky.zzab(com.google.android.gms.ads.internal.client.zzm):boolean");
    }

    public final void zzac(zzcs zzcsVar) {
    }

    public final Bundle zzd() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    public final zzr zzg() {
        return null;
    }

    public final zzbk zzi() {
        return this.zzf.zzg();
    }

    public final zzco zzj() {
        return this.zzf.zzi();
    }

    public final synchronized zzea zzk() {
        zzdeu zzdeuVar;
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzgR)).booleanValue() && (zzdeuVar = this.zzj) != null) {
            return zzdeuVar.zzl();
        }
        return null;
    }

    public final zzed zzl() {
        return null;
    }

    public final IObjectWrapper zzn() {
        return null;
    }

    public final synchronized String zzr() {
        return this.zzd;
    }

    public final synchronized String zzs() {
        zzdeu zzdeuVar = this.zzj;
        if (zzdeuVar == null || zzdeuVar.zzl() == null) {
            return null;
        }
        return zzdeuVar.zzl().zzg();
    }

    public final synchronized String zzt() {
        zzdeu zzdeuVar = this.zzj;
        if (zzdeuVar == null || zzdeuVar.zzl() == null) {
            return null;
        }
        return zzdeuVar.zzl().zzg();
    }

    public final synchronized void zzx() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzdeu zzdeuVar = this.zzj;
        if (zzdeuVar != null) {
            zzdeuVar.zzm().zza((Context) null);
        }
    }

    public final void zzy(zzm zzmVar, zzbn zzbnVar) {
        this.zzf.zzk(zzbnVar);
        zzab(zzmVar);
    }

    public final synchronized void zzz() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        zzdeu zzdeuVar = this.zzj;
        if (zzdeuVar != null) {
            zzdeuVar.zzm().zzb((Context) null);
        }
    }
}
