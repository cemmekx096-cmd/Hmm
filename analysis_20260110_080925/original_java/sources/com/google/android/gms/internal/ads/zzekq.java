package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzcv;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.client.zzt;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzekq implements AppEventListener, zzcyt, zzcxf, zzcvu, zzcwl, zza, zzcvr, zzcyd, zzcwh, zzddw {
    final zzdsc zza;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicBoolean zzh = new AtomicBoolean(true);
    private final AtomicBoolean zzi = new AtomicBoolean(false);
    private final AtomicBoolean zzj = new AtomicBoolean(false);
    final BlockingQueue zzb = new ArrayBlockingQueue(((Integer) zzbd.zzc().zzb(zzbdc.zzjd)).intValue());

    public zzekq(zzdsc zzdscVar) {
        this.zza = zzdscVar;
    }

    private final void zzo() {
        if (this.zzi.get() && this.zzj.get()) {
            BlockingQueue<Pair> blockingQueue = this.zzb;
            for (final Pair pair : blockingQueue) {
                zzeyy.zza(this.zzd, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzekb
                    public final void zza(Object obj) {
                        Pair pair2 = pair;
                        ((zzco) obj).zzc((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            blockingQueue.clear();
            this.zzh.set(false);
        }
    }

    public final void onAdClicked() {
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzkY)).booleanValue()) {
            return;
        }
        zzeyy.zza(this.zzc, new zzeko());
    }

    public final synchronized void onAppEvent(final String str, final String str2) {
        if (!this.zzh.get()) {
            zzeyy.zza(this.zzd, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzeki
                public final void zza(Object obj) {
                    ((zzco) obj).zzc(str, str2);
                }
            });
            return;
        }
        if (!this.zzb.offer(new Pair(str, str2))) {
            int i = zze.zza;
            zzo.zze("The queue for app events is full, dropping the new event.");
            zzdsc zzdscVar = this.zza;
            if (zzdscVar != null) {
                zzdsb zzdsbVarZza = zzdscVar.zza();
                zzdsbVarZza.zzb("action", "dae_action");
                zzdsbVarZza.zzb("dae_name", str);
                zzdsbVarZza.zzb("dae_data", str2);
                zzdsbVarZza.zzj();
            }
        }
    }

    public final void zza() {
        zzeyy.zza(this.zzc, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzejy
            public final void zza(Object obj) {
                ((zzbk) obj).zzd();
            }
        });
        zzeyy.zza(this.zzg, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzejz
            public final void zza(Object obj) {
                ((zzcv) obj).zzc();
            }
        });
    }

    public final void zzb() {
        zzeyy.zza(this.zzc, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzekj
            public final void zza(Object obj) {
                ((zzbk) obj).zzh();
            }
        });
    }

    public final void zzc() {
        zzeyy.zza(this.zzc, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzekl
            public final void zza(Object obj) {
                ((zzbk) obj).zzj();
            }
        });
        zzeyx zzeyxVar = new zzeyx() { // from class: com.google.android.gms.internal.ads.zzekm
            public final void zza(Object obj) {
                ((zzcv) obj).zzf();
            }
        };
        AtomicReference atomicReference = this.zzg;
        zzeyy.zza(atomicReference, zzeyxVar);
        zzeyy.zza(atomicReference, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzekn
            public final void zza(Object obj) {
                ((zzcv) obj).zze();
            }
        });
    }

    public final void zzdD(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzeyx zzeyxVar = new zzeyx() { // from class: com.google.android.gms.internal.ads.zzekc
            public final void zza(Object obj) {
                ((zzbk) obj).zzf(zzeVar);
            }
        };
        AtomicReference atomicReference = this.zzc;
        zzeyy.zza(atomicReference, zzeyxVar);
        zzeyy.zza(atomicReference, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzekd
            public final void zza(Object obj) {
                ((zzbk) obj).zze(zzeVar.zza);
            }
        });
        zzeyy.zza(this.zzf, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzeke
            public final void zza(Object obj) {
                ((zzbn) obj).zzb(zzeVar);
            }
        });
        this.zzh.set(false);
        this.zzb.clear();
    }

    public final void zzdf() {
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzkY)).booleanValue()) {
            zzeyy.zza(this.zzc, new zzeko());
        }
        zzeyy.zza(this.zzg, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzeka
            public final void zza(Object obj) {
                ((zzcv) obj).zzb();
            }
        });
    }

    public final void zzdn(zzbvo zzbvoVar) {
    }

    public final void zzdo(zzfcf zzfcfVar) {
        this.zzh.set(true);
        this.zzj.set(false);
    }

    public final void zzdu(zzbwa zzbwaVar, String str, String str2) {
    }

    public final void zze() {
    }

    public final void zzf() {
    }

    public final synchronized zzbk zzg() {
        return (zzbk) this.zzc.get();
    }

    public final void zzh(final zzt zztVar) {
        zzeyy.zza(this.zze, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzekp
            public final void zza(Object obj) throws RemoteException {
                ((zzdt) obj).zze(zztVar);
            }
        });
    }

    public final synchronized zzco zzi() {
        return (zzco) this.zzd.get();
    }

    public final void zzj(zzbk zzbkVar) {
        this.zzc.set(zzbkVar);
    }

    public final void zzk(zzbn zzbnVar) {
        this.zzf.set(zzbnVar);
    }

    public final void zzl(zzdt zzdtVar) {
        this.zze.set(zzdtVar);
    }

    public final void zzm(zzco zzcoVar) {
        this.zzd.set(zzcoVar);
        this.zzi.set(true);
        zzo();
    }

    public final void zzn(zzcv zzcvVar) {
        this.zzg.set(zzcvVar);
    }

    public final void zzr(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzeyy.zza(this.zzg, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzekh
            public final void zza(Object obj) {
                ((zzcv) obj).zzd(zzeVar);
            }
        });
    }

    public final void zzs() {
        zzeyy.zza(this.zzc, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzejx
            public final void zza(Object obj) {
                ((zzbk) obj).zzg();
            }
        });
    }

    public final synchronized void zzt() {
        zzeyy.zza(this.zzc, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzekf
            public final void zza(Object obj) {
                ((zzbk) obj).zzi();
            }
        });
        zzeyy.zza(this.zzf, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzekg
            public final void zza(Object obj) {
                ((zzbn) obj).zzc();
            }
        });
        this.zzj.set(true);
        zzo();
    }

    public final void zzu() {
        zzeyy.zza(this.zzc, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzekk
            public final void zza(Object obj) {
                ((zzbk) obj).zzk();
            }
        });
    }
}
