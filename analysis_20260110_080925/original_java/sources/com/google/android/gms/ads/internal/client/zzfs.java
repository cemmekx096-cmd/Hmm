package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.RemoteException;
import com.crashlytics.android.BuildConfig;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbwq;
import com.google.android.gms.internal.ads.zzbws;
import com.google.android.gms.internal.ads.zzbww;
import com.google.android.gms.internal.ads.zzbxa;
import com.google.android.gms.internal.ads.zzbxb;
import com.google.android.gms.internal.ads.zzbxh;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzfs extends zzbws {
    private static void zzs(final zzbxa zzbxaVar) {
        zzo.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfr
            @Override // java.lang.Runnable
            public final void run() {
                zzbxa zzbxaVar2 = zzbxaVar;
                if (zzbxaVar2 != null) {
                    try {
                        zzbxaVar2.zze(1);
                    } catch (RemoteException e) {
                        zzo.zzl("#007 Could not call remote method.", e);
                    }
                }
            }
        });
    }

    public final Bundle zzb() throws RemoteException {
        return new Bundle();
    }

    public final zzea zzc() {
        return null;
    }

    public final zzbwq zzd() {
        return null;
    }

    public final String zze() {
        return null;
    }

    public final String zzf() throws RemoteException {
        return BuildConfig.FLAVOR;
    }

    public final void zzg(zzm zzmVar, zzbxa zzbxaVar) throws RemoteException {
        zzs(zzbxaVar);
    }

    public final void zzh(zzm zzmVar, zzbxa zzbxaVar) throws RemoteException {
        zzs(zzbxaVar);
    }

    public final void zzi(boolean z) {
    }

    public final void zzj(zzdq zzdqVar) throws RemoteException {
    }

    public final void zzk(zzdt zzdtVar) {
    }

    public final void zzl(zzbww zzbwwVar) throws RemoteException {
    }

    public final void zzm(zzbxh zzbxhVar) {
    }

    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final void zzo(IObjectWrapper iObjectWrapper, boolean z) {
    }

    public final boolean zzp() throws RemoteException {
        return false;
    }

    public final void zzq(zzbxb zzbxbVar) throws RemoteException {
    }
}
