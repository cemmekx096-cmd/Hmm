package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.crashlytics.android.BuildConfig;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class zzein extends zzbpt {
    private final zzcvp zza;
    private final zzddu zzb;
    private final zzcwj zzc;
    private final zzcwy zzd;
    private final zzcxd zze;
    private final zzdas zzf;
    private final zzcxx zzg;
    private final zzder zzh;
    private final zzdao zzi;
    private final zzcwe zzj;

    public zzein(zzcvp zzcvpVar, zzddu zzdduVar, zzcwj zzcwjVar, zzcwy zzcwyVar, zzcxd zzcxdVar, zzdas zzdasVar, zzcxx zzcxxVar, zzder zzderVar, zzdao zzdaoVar, zzcwe zzcweVar) {
        this.zza = zzcvpVar;
        this.zzb = zzdduVar;
        this.zzc = zzcwjVar;
        this.zzd = zzcwyVar;
        this.zze = zzcxdVar;
        this.zzf = zzdasVar;
        this.zzg = zzcxxVar;
        this.zzh = zzderVar;
        this.zzi = zzdaoVar;
        this.zzj = zzcweVar;
    }

    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzdf();
    }

    public final void zzf() {
        this.zzg.zzdw(4);
    }

    public final void zzg(int i) {
    }

    public final void zzh(zze zzeVar) {
    }

    public final void zzi(int i, String str) {
    }

    @Deprecated
    public final void zzj(int i) throws RemoteException {
        zzk(new zze(i, BuildConfig.FLAVOR, "undefined", (zze) null, (IBinder) null));
    }

    public final void zzk(zze zzeVar) {
        this.zzj.zzc(zzfdp.zzc(8, zzeVar));
    }

    public final void zzl(String str) {
        zzk(new zze(0, str, "undefined", (zze) null, (IBinder) null));
    }

    public void zzm() {
        this.zzc.zza();
        this.zzi.zzb();
    }

    public final void zzn() {
        this.zzd.zzb();
    }

    public final void zzo() {
        this.zze.zzt();
    }

    public final void zzp() {
        this.zzg.zzdt();
        this.zzi.zza();
    }

    public final void zzq(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    public final void zzr(zzbhh zzbhhVar, String str) {
    }

    public void zzs(zzbwm zzbwmVar) {
    }

    public void zzt(zzbwq zzbwqVar) throws RemoteException {
    }

    public void zzu() throws RemoteException {
    }

    public void zzv() throws RemoteException {
    }

    public void zzw() {
        this.zzh.zza();
    }

    public final void zzx() {
        this.zzh.zzb();
    }

    public final void zzy() throws RemoteException {
        this.zzh.zzc();
    }

    public void zzz() {
        this.zzh.zzd();
    }
}
