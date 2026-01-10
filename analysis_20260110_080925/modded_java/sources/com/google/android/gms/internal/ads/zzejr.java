package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzejr extends zzbw {
    private final Context zza;
    private final zzbk zzb;
    private final zzfco zzc;
    private final zzcon zzd;
    private final ViewGroup zze;
    private final zzdsc zzf;

    public zzejr(Context context, zzbk zzbkVar, zzfco zzfcoVar, zzcon zzconVar, zzdsc zzdscVar) {
        this.zza = context;
        this.zzb = zzbkVar;
        this.zzc = zzfcoVar;
        this.zzd = zzconVar;
        this.zzf = zzdscVar;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View viewZzd = zzconVar.zzd();
        zzv.zzr();
        frameLayout.addView(viewZzd, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(zzg().zzc);
        frameLayout.setMinimumWidth(zzg().zzf);
        this.zze = frameLayout;
    }

    public final void zzA() throws RemoteException {
        this.zzd.zzh();
    }

    public final void zzB() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzm().zzc((Context) null);
    }

    public final void zzC(zzbh zzbhVar) throws RemoteException {
        int i = zze.zza;
        zzo.zzi("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzD(zzbk zzbkVar) throws RemoteException {
        int i = zze.zza;
        zzo.zzi("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzE(zzcb zzcbVar) throws RemoteException {
        int i = zze.zza;
        zzo.zzi("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzF(zzr zzrVar) throws RemoteException {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        zzcon zzconVar = this.zzd;
        if (zzconVar != null) {
            zzconVar.zzi(this.zze, zzrVar);
        }
    }

    public final void zzG(zzco zzcoVar) throws RemoteException {
        zzekq zzekqVar = this.zzc.zzc;
        if (zzekqVar != null) {
            zzekqVar.zzm(zzcoVar);
        }
    }

    public final void zzH(zzbax zzbaxVar) throws RemoteException {
    }

    public final void zzI(zzx zzxVar) throws RemoteException {
    }

    public final void zzJ(zzcv zzcvVar) {
    }

    public final void zzK(zzeh zzehVar) throws RemoteException {
    }

    public final void zzL(boolean z) throws RemoteException {
    }

    public final void zzM(zzbtx zzbtxVar) throws RemoteException {
    }

    public final void zzN(boolean z) throws RemoteException {
        int i = zze.zza;
        zzo.zzi("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzO(zzbdx zzbdxVar) throws RemoteException {
        int i = zze.zza;
        zzo.zzi("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzP(zzdt zzdtVar) {
        if (!((Boolean) zzbd.zzc().zzb(zzbdc.zzlN)).booleanValue()) {
            int i = zze.zza;
            zzo.zzi("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        zzekq zzekqVar = this.zzc.zzc;
        if (zzekqVar != null) {
            try {
                if (!zzdtVar.zzf()) {
                    this.zzf.zze();
                }
            } catch (RemoteException e) {
                int i2 = zze.zza;
                zzo.zzf("Error in making CSI ping for reporting paid event callback", e);
            }
            zzekqVar.zzl(zzdtVar);
        }
    }

    public final void zzQ(zzbua zzbuaVar, String str) throws RemoteException {
    }

    public final void zzR(String str) throws RemoteException {
    }

    public final void zzS(zzbwg zzbwgVar) throws RemoteException {
    }

    public final void zzT(String str) throws RemoteException {
    }

    public final void zzU(zzgc zzgcVar) throws RemoteException {
        int i = zze.zza;
        zzo.zzi("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    public final void zzX() throws RemoteException {
    }

    public final boolean zzY() throws RemoteException {
        zzcon zzconVar = this.zzd;
        return zzconVar != null && zzconVar.zzr();
    }

    public final boolean zzZ() throws RemoteException {
        return false;
    }

    public final boolean zzaa() throws RemoteException {
        return false;
    }

    public final boolean zzab(zzm zzmVar) throws RemoteException {
        int i = zze.zza;
        zzo.zzi("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    public final void zzac(zzcs zzcsVar) throws RemoteException {
        int i = zze.zza;
        zzo.zzi("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final Bundle zzd() throws RemoteException {
        int i = zze.zza;
        zzo.zzi("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    public final zzr zzg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        return zzfcu.zza(this.zza, Collections.singletonList(this.zzd.zzf()));
    }

    public final zzbk zzi() throws RemoteException {
        return this.zzb;
    }

    public final zzco zzj() throws RemoteException {
        return this.zzc.zzn;
    }

    public final zzea zzk() {
        return this.zzd.zzl();
    }

    public final zzed zzl() throws RemoteException {
        return this.zzd.zze();
    }

    public final IObjectWrapper zzn() throws RemoteException {
        return ObjectWrapper.wrap(this.zze);
    }

    public final String zzr() throws RemoteException {
        return this.zzc.zzf;
    }

    public final String zzs() throws RemoteException {
        zzcon zzconVar = this.zzd;
        if (zzconVar.zzl() != null) {
            return zzconVar.zzl().zzg();
        }
        return null;
    }

    public final String zzt() throws RemoteException {
        zzcon zzconVar = this.zzd;
        if (zzconVar.zzl() != null) {
            return zzconVar.zzl().zzg();
        }
        return null;
    }

    public final void zzx() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzb();
    }

    public final void zzy(zzm zzmVar, zzbn zzbnVar) {
    }

    public final void zzz() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzm().zzb((Context) null);
    }
}
