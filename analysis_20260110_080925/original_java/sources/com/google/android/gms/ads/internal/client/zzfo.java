package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.crashlytics.android.BuildConfig;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbmi;
import com.google.android.gms.internal.ads.zzbpo;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzfo extends zzda {
    private zzbmi zza;

    public static /* synthetic */ void zzb(zzfo zzfoVar) {
        zzbmi zzbmiVar = zzfoVar.zza;
        if (zzbmiVar != null) {
            try {
                zzbmiVar.zzb(Collections.emptyList());
            } catch (RemoteException e) {
                zzo.zzk("Could not notify onComplete event.", e);
            }
        }
    }

    public final float zze() throws RemoteException {
        return 1.0f;
    }

    public final String zzf() {
        return BuildConfig.FLAVOR;
    }

    public final List zzg() throws RemoteException {
        return Collections.emptyList();
    }

    public final void zzh(String str) throws RemoteException {
    }

    public final void zzi() {
    }

    public final void zzj(boolean z) throws RemoteException {
    }

    public final void zzk() throws RemoteException {
        zzo.zzg("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfn
            @Override // java.lang.Runnable
            public final void run() {
                zzfo.zzb(this.zza);
            }
        });
    }

    public final void zzl(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final void zzm(zzdn zzdnVar) {
    }

    public final void zzn(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
    }

    public final void zzo(zzbpo zzbpoVar) throws RemoteException {
    }

    public final void zzp(boolean z) throws RemoteException {
    }

    public final void zzq(float f) throws RemoteException {
    }

    public final void zzr(String str) throws RemoteException {
    }

    public final void zzs(zzbmi zzbmiVar) throws RemoteException {
        this.zza = zzbmiVar;
    }

    public final void zzt(String str) {
    }

    public final void zzu(zzfx zzfxVar) throws RemoteException {
    }

    public final boolean zzv() throws RemoteException {
        return false;
    }
}
