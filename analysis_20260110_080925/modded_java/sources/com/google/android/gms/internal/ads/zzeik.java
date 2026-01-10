package com.google.android.gms.internal.ads;

import android.os.IBinder;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
final class zzeik implements zzcxa {
    boolean zza = false;
    final /* synthetic */ zzedh zzb;
    final /* synthetic */ zzcai zzc;

    zzeik(zzeil zzeilVar, zzedh zzedhVar, zzcai zzcaiVar) {
        this.zzb = zzedhVar;
        this.zzc = zzcaiVar;
    }

    private final synchronized void zze(zze zzeVar) {
        int i = 1;
        if (true == ((Boolean) zzbd.zzc().zzb(zzbdc.zzfJ)).booleanValue()) {
            i = 3;
        }
        this.zzc.zzd(new zzedi(i, zzeVar));
    }

    public final synchronized void zza(int i) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new zze(i, zzeil.zze(this.zzb.zza, i), "undefined", (zze) null, (IBinder) null));
    }

    public final synchronized void zzb(zze zzeVar) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(zzeVar);
    }

    public final synchronized void zzc(int i, String str) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        if (str == null) {
            str = zzeil.zze(this.zzb.zza, i);
        }
        zze(new zze(i, str, "undefined", (zze) null, (IBinder) null));
    }

    public final synchronized void zzd() {
        this.zzc.zzc((Object) null);
    }
}
