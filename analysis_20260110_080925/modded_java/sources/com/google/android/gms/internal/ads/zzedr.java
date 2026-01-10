package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
final class zzedr implements zzdgg {
    private final VersionInfoParcel zza;
    private final ListenableFuture zzb;
    private final zzfbt zzc;
    private final zzcfe zzd;
    private final zzfco zze;
    private final zzbkg zzf;
    private final boolean zzg;
    private final zzecd zzh;
    private final zzdsc zzi;

    zzedr(VersionInfoParcel versionInfoParcel, ListenableFuture listenableFuture, zzfbt zzfbtVar, zzcfe zzcfeVar, zzfco zzfcoVar, boolean z, zzbkg zzbkgVar, zzecd zzecdVar, zzdsc zzdscVar) {
        this.zza = versionInfoParcel;
        this.zzb = listenableFuture;
        this.zzc = zzfbtVar;
        this.zzd = zzcfeVar;
        this.zze = zzfcoVar;
        this.zzg = z;
        this.zzf = zzbkgVar;
        this.zzh = zzecdVar;
        this.zzi = zzdscVar;
    }

    public final zzfbt zza() {
        return this.zzc;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(boolean r27, android.content.Context r28, com.google.android.gms.internal.ads.zzcwe r29) {
        /*
            r26 = this;
            r0 = r26
            com.google.common.util.concurrent.ListenableFuture r1 = r0.zzb
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzgdb.zzq(r1)
            com.google.android.gms.internal.ads.zzcny r1 = (com.google.android.gms.internal.ads.zzcny) r1
            com.google.android.gms.internal.ads.zzcfe r6 = r0.zzd
            r15 = 1
            r6.zzaq(r15)
            com.google.android.gms.ads.internal.zzl r10 = new com.google.android.gms.ads.internal.zzl
            boolean r2 = r0.zzg
            if (r2 == 0) goto L1f
            com.google.android.gms.internal.ads.zzbkg r3 = r0.zzf
            boolean r3 = r3.zze(r15)
            r17 = r3
            goto L21
        L1f:
            r17 = r15
        L21:
            r3 = 0
            if (r2 == 0) goto L2f
            com.google.android.gms.internal.ads.zzbkg r4 = r0.zzf
            boolean r4 = r4.zzd()
            if (r4 == 0) goto L2f
            r19 = r15
            goto L31
        L2f:
            r19 = r3
        L31:
            if (r2 == 0) goto L3a
            com.google.android.gms.internal.ads.zzbkg r2 = r0.zzf
            float r2 = r2.zza()
            goto L3b
        L3a:
            r2 = 0
        L3b:
            r20 = r2
            com.google.android.gms.internal.ads.zzfbt r2 = r0.zzc
            r18 = 1
            r21 = -1
            boolean r3 = r2.zzO
            r24 = 0
            r16 = r10
            r22 = r27
            r23 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            if (r29 == 0) goto L55
            r29.zzf()
        L55:
            com.google.android.gms.ads.internal.zzv.zzj()
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r14 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            com.google.android.gms.internal.ads.zzdfv r4 = r1.zzg()
            int r1 = r2.zzQ
            r3 = -1
            if (r1 == r3) goto L64
            goto L7c
        L64:
            com.google.android.gms.internal.ads.zzfco r3 = r0.zze
            com.google.android.gms.ads.internal.client.zzx r3 = r3.zzj
            if (r3 == 0) goto L75
            int r3 = r3.zza
            if (r3 != r15) goto L70
            r1 = 7
            goto L7c
        L70:
            r5 = 2
            if (r3 != r5) goto L75
            r1 = 6
            goto L7c
        L75:
            int r3 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r3 = "Error setting app open orientation; no targeting orientation available."
            com.google.android.gms.ads.internal.util.client.zzo.zze(r3)
        L7c:
            r7 = r1
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r8 = r0.zza
            java.lang.String r9 = r2.zzB
            com.google.android.gms.internal.ads.zzfby r1 = r2.zzs
            java.lang.String r11 = r1.zzb
            java.lang.String r12 = r1.zza
            com.google.android.gms.internal.ads.zzfco r1 = r0.zze
            boolean r2 = r2.zzb()
            if (r2 == 0) goto L92
            com.google.android.gms.internal.ads.zzecd r2 = r0.zzh
            goto L93
        L92:
            r2 = 0
        L93:
            r16 = r2
            r3 = 0
            r5 = 0
            java.lang.String r13 = r1.zzf
            java.lang.String r1 = r6.zzr()
            r2 = r14
            r25 = r14
            r14 = r29
            r15 = r16
            r16 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.google.android.gms.internal.ads.zzdsc r1 = r0.zzi
            r2 = r28
            r3 = r25
            r4 = 1
            com.google.android.gms.ads.internal.overlay.zzn.zza(r2, r3, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzedr.zzb(boolean, android.content.Context, com.google.android.gms.internal.ads.zzcwe):void");
    }
}
