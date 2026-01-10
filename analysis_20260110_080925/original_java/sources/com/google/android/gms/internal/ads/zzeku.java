package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzeku implements zza, zzddw {
    private zzbh zza;

    public final synchronized void onAdClicked() {
        zzbh zzbhVar = this.zza;
        if (zzbhVar != null) {
            try {
                zzbhVar.zzb();
            } catch (RemoteException e) {
                int i = zze.zza;
                zzo.zzk("Remote Exception at onAdClicked.", e);
            }
        }
    }

    public final synchronized void zza(zzbh zzbhVar) {
        this.zza = zzbhVar;
    }

    public final synchronized void zzdf() {
        zzbh zzbhVar = this.zza;
        if (zzbhVar != null) {
            try {
                zzbhVar.zzb();
            } catch (RemoteException e) {
                int i = zze.zza;
                zzo.zzk("Remote Exception at onPhysicalClick.", e);
            }
        }
    }

    public final synchronized void zzu() {
    }
}
