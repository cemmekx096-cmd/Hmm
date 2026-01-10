package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@23.2.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
final class zzalt<T> implements zzamc<T> {
    private final zzaln zza;
    private final zzamv<?, ?> zzb;
    private final boolean zzc;
    private final zzajx<?> zzd;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzamc
    public final int zza(T t) {
        zzamv<?, ?> zzamvVar = this.zzb;
        int iZzb = zzamvVar.zzb(zzamvVar.zzd(t)) + 0;
        return this.zzc ? iZzb + this.zzd.zza(t).zza() : iZzb;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzamc
    public final int zzb(T t) {
        int iHashCode = this.zzb.zzd(t).hashCode();
        return this.zzc ? (iHashCode * 53) + this.zzd.zza(t).hashCode() : iHashCode;
    }

    static <T> zzalt<T> zza(zzamv<?, ?> zzamvVar, zzajx<?> zzajxVar, zzaln zzalnVar) {
        return new zzalt<>(zzamvVar, zzajxVar, zzalnVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzamc
    public final T zza() {
        zzaln zzalnVar = this.zza;
        if (zzalnVar instanceof zzakg) {
            return (T) ((zzakg) zzalnVar).zzo();
        }
        return (T) zzalnVar.zzq().zzf();
    }

    private zzalt(zzamv<?, ?> zzamvVar, zzajx<?> zzajxVar, zzaln zzalnVar) {
        this.zzb = zzamvVar;
        this.zzc = zzajxVar.zza(zzalnVar);
        this.zzd = zzajxVar;
        this.zza = zzalnVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzamc
    public final void zzd(T t) {
        this.zzb.zzf(t);
        this.zzd.zzc(t);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzamc
    public final void zza(T t, T t2) {
        zzame.zza(this.zzb, t, t2);
        if (this.zzc) {
            zzame.zza(this.zzd, t, t2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[LOOP:0: B:46:0x000c->B:54:?, LOOP_END, SYNTHETIC] */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzamc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r12, com.google.android.gms.internal.p000firebaseauthapi.zzamd r13, com.google.android.gms.internal.p000firebaseauthapi.zzajv r14) throws java.io.IOException {
        /*
            r11 = this;
            com.google.android.gms.internal.firebase-auth-api.zzamv<?, ?> r0 = r11.zzb
            com.google.android.gms.internal.firebase-auth-api.zzajx<?> r1 = r11.zzd
            java.lang.Object r2 = r0.zzc(r12)
            com.google.android.gms.internal.firebase-auth-api.zzajy r3 = r1.zzb(r12)
        Lc:
            int r4 = r13.zzc()     // Catch: java.lang.Throwable -> L90
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r5) goto L19
            r0.zzb(r12, r2)
            return
        L19:
            int r4 = r13.zzd()     // Catch: java.lang.Throwable -> L90
            r6 = 11
            r7 = 0
            if (r4 == r6) goto L3f
            r5 = r4 & 7
            r6 = 2
            if (r5 != r6) goto L3a
            com.google.android.gms.internal.firebase-auth-api.zzaln r5 = r11.zza     // Catch: java.lang.Throwable -> L90
            int r4 = r4 >>> 3
            java.lang.Object r4 = r1.zza(r14, r5, r4)     // Catch: java.lang.Throwable -> L90
            if (r4 == 0) goto L35
            r1.zza(r13, r4, r14, r3)     // Catch: java.lang.Throwable -> L90
            goto L84
        L35:
            boolean r4 = r0.zza(r2, r13, r7)     // Catch: java.lang.Throwable -> L90
            goto L85
        L3a:
            boolean r4 = r13.zzt()     // Catch: java.lang.Throwable -> L90
            goto L85
        L3f:
            r4 = 0
            r6 = r4
        L41:
            int r8 = r13.zzc()     // Catch: java.lang.Throwable -> L90
            r9 = 12
            if (r8 == r5) goto L73
            int r8 = r13.zzd()     // Catch: java.lang.Throwable -> L90
            r10 = 16
            if (r8 != r10) goto L5c
            int r7 = r13.zzj()     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.firebase-auth-api.zzaln r4 = r11.zza     // Catch: java.lang.Throwable -> L90
            java.lang.Object r4 = r1.zza(r14, r4, r7)     // Catch: java.lang.Throwable -> L90
            goto L41
        L5c:
            r10 = 26
            if (r8 != r10) goto L6b
            if (r4 == 0) goto L66
            r1.zza(r13, r4, r14, r3)     // Catch: java.lang.Throwable -> L90
            goto L41
        L66:
            com.google.android.gms.internal.firebase-auth-api.zzaiw r6 = r13.zzp()     // Catch: java.lang.Throwable -> L90
            goto L41
        L6b:
            if (r8 == r9) goto L73
            boolean r8 = r13.zzt()     // Catch: java.lang.Throwable -> L90
            if (r8 != 0) goto L41
        L73:
            int r5 = r13.zzd()     // Catch: java.lang.Throwable -> L90
            if (r5 != r9) goto L8b
            if (r6 == 0) goto L84
            if (r4 == 0) goto L81
            r1.zza(r6, r4, r14, r3)     // Catch: java.lang.Throwable -> L90
            goto L84
        L81:
            r0.zza(r2, r7, r6)     // Catch: java.lang.Throwable -> L90
        L84:
            r4 = 1
        L85:
            if (r4 != 0) goto Lc
            r0.zzb(r12, r2)
            return
        L8b:
            com.google.android.gms.internal.firebase-auth-api.zzakm r13 = com.google.android.gms.internal.p000firebaseauthapi.zzakm.zzb()     // Catch: java.lang.Throwable -> L90
            throw r13     // Catch: java.lang.Throwable -> L90
        L90:
            r13 = move-exception
            r0.zzb(r12, r2)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.zzalt.zza(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzamd, com.google.android.gms.internal.firebase-auth-api.zzajv):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099 A[EDGE_INSN: B:56:0x0099->B:34:0x0099 BREAK  A[LOOP:1: B:18:0x0053->B:61:0x0053], SYNTHETIC] */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzamc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.p000firebaseauthapi.zzaiv r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.firebase-auth-api.zzakg r0 = (com.google.android.gms.internal.p000firebaseauthapi.zzakg) r0
            com.google.android.gms.internal.firebase-auth-api.zzamy r1 = r0.zzb
            com.google.android.gms.internal.firebase-auth-api.zzamy r2 = com.google.android.gms.internal.p000firebaseauthapi.zzamy.zzc()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.firebase-auth-api.zzamy r1 = com.google.android.gms.internal.p000firebaseauthapi.zzamy.zzd()
            r0.zzb = r1
        L11:
            com.google.android.gms.internal.firebase-auth-api.zzakg$zzd r10 = (com.google.android.gms.internal.firebase-auth-api.zzakg.zzd) r10
            r10.zza()
            r10 = 0
            r0 = r10
        L18:
            if (r12 >= r13) goto La4
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.zzais.zzc(r11, r12, r14)
            int r2 = r14.zza
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L51
            r12 = r2 & 7
            if (r12 != r3) goto L4c
            com.google.android.gms.internal.firebase-auth-api.zzajx<?> r12 = r9.zzd
            com.google.android.gms.internal.firebase-auth-api.zzajv r0 = r14.zzd
            com.google.android.gms.internal.firebase-auth-api.zzaln r3 = r9.zza
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.zza(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.firebase-auth-api.zzakg$zzf r0 = (com.google.android.gms.internal.firebase-auth-api.zzakg.zzf) r0
            if (r0 != 0) goto L43
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.p000firebaseauthapi.zzais.zza(r2, r3, r4, r5, r6, r7)
            goto L18
        L43:
            com.google.android.gms.internal.p000firebaseauthapi.zzaly.zza()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L4c:
            int r12 = com.google.android.gms.internal.p000firebaseauthapi.zzais.zza(r2, r11, r4, r13, r14)
            goto L18
        L51:
            r12 = 0
            r2 = r10
        L53:
            if (r4 >= r13) goto L99
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.zzais.zzc(r11, r4, r14)
            int r5 = r14.zza
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L7b
            r8 = 3
            if (r6 == r8) goto L65
            goto L90
        L65:
            if (r0 != 0) goto L72
            if (r7 != r3) goto L90
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.zzais.zza(r11, r4, r14)
            java.lang.Object r2 = r14.zzc
            com.google.android.gms.internal.firebase-auth-api.zzaiw r2 = (com.google.android.gms.internal.p000firebaseauthapi.zzaiw) r2
            goto L53
        L72:
            com.google.android.gms.internal.p000firebaseauthapi.zzaly.zza()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L7b:
            if (r7 != 0) goto L90
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.zzais.zzc(r11, r4, r14)
            int r12 = r14.zza
            com.google.android.gms.internal.firebase-auth-api.zzajx<?> r0 = r9.zzd
            com.google.android.gms.internal.firebase-auth-api.zzajv r5 = r14.zzd
            com.google.android.gms.internal.firebase-auth-api.zzaln r6 = r9.zza
            java.lang.Object r0 = r0.zza(r5, r6, r12)
            com.google.android.gms.internal.firebase-auth-api.zzakg$zzf r0 = (com.google.android.gms.internal.firebase-auth-api.zzakg.zzf) r0
            goto L53
        L90:
            r6 = 12
            if (r5 == r6) goto L99
            int r4 = com.google.android.gms.internal.p000firebaseauthapi.zzais.zza(r5, r11, r4, r13, r14)
            goto L53
        L99:
            if (r2 == 0) goto La1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.zza(r12, r2)
        La1:
            r12 = r4
            goto L18
        La4:
            if (r12 != r13) goto La7
            return
        La7:
            com.google.android.gms.internal.firebase-auth-api.zzakm r10 = com.google.android.gms.internal.p000firebaseauthapi.zzakm.zzg()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.zzalt.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.firebase-auth-api.zzaiv):void");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzamc
    public final void zza(T t, zzanm zzanmVar) throws IOException {
        Iterator itZzd = this.zzd.zza(t).zzd();
        while (itZzd.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzd.next();
            zzaka zzakaVar = (zzaka) entry.getKey();
            if (zzakaVar.zzc() != zzank.zzi || zzakaVar.zze() || zzakaVar.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof zzakq) {
                zzanmVar.zza(zzakaVar.zza(), ((zzakq) entry).zza().zzb());
            } else {
                zzanmVar.zza(zzakaVar.zza(), entry.getValue());
            }
        }
        zzamv<?, ?> zzamvVar = this.zzb;
        zzamvVar.zza((zzamv<?, ?>) zzamvVar.zzd(t), zzanmVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzamc
    public final boolean zzb(T t, T t2) {
        if (!this.zzb.zzd(t).equals(this.zzb.zzd(t2))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zza(t).equals(this.zzd.zza(t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzamc
    public final boolean zze(T t) {
        return this.zzd.zza(t).zzg();
    }
}
