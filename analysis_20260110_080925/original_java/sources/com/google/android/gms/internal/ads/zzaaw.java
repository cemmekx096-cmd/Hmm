package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
final class zzaaw implements zzacl {
    final /* synthetic */ zztf zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzaba zzd;

    zzaaw(zzaba zzabaVar, zztf zztfVar, int i, long j) {
        this.zza = zztfVar;
        this.zzb = i;
        this.zzc = j;
        this.zzd = zzabaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacl
    public final void zza(long j) {
        this.zzd.zzaj(this.zza, this.zzb, this.zzc, j);
    }

    @Override // com.google.android.gms.internal.ads.zzacl
    public final void zzb() {
        this.zzd.zzap(this.zza, this.zzb, this.zzc);
    }
}
