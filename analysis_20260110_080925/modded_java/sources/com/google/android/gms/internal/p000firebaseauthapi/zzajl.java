package com.google.android.gms.internal.p000firebaseauthapi;

import com.crashlytics.android.BuildConfig;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-auth@@23.2.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
final class zzajl extends zzaji {
    private final byte[] zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    private final byte zzy() throws IOException {
        int i = this.zzg;
        if (i == this.zze) {
            throw zzakm.zzj();
        }
        byte[] bArr = this.zzd;
        this.zzg = i + 1;
        return bArr[i];
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaji
    public final double zza() throws IOException {
        return Double.longBitsToDouble(zzab());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaji
    public final float zzb() throws IOException {
        return Float.intBitsToFloat(zzz());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaji
    public final int zzc() {
        return this.zzg - this.zzh;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaji
    public final int zzb(int i) throws zzakm {
        if (i < 0) {
            throw zzakm.zzf();
        }
        int iZzc = i + zzc();
        if (iZzc < 0) {
            throw zzakm.zzg();
        }
        int i2 = this.zzj;
        if (iZzc > i2) {
            throw zzakm.zzj();
        }
        this.zzj = iZzc;
        zzad();
        return i2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaji
    public final int zzd() throws IOException {
        return zzaa();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaji
    public final int zze() throws IOException {
        return zzz();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaji
    public final int zzf() throws IOException {
        return zzaa();
    }

    private final int zzz() throws IOException {
        int i = this.zzg;
        if (this.zze - i < 4) {
            throw zzakm.zzj();
        }
        byte[] bArr = this.zzd;
        this.zzg = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        if (r2[r3] >= 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzaa() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.zzg
            int r1 = r5.zze
            if (r1 == r0) goto L6b
            byte[] r2 = r5.zzd
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L11
            r5.zzg = r3
            return r0
        L11:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6b
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L22
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L68
        L22:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L2f
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2d:
            r1 = r3
            goto L68
        L2f:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3d
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L68
        L3d:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6b
        L68:
            r5.zzg = r1
            return r0
        L6b:
            long r0 = r5.zzm()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.zzajl.zzaa():int");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaji
    public final int zzg() throws IOException {
        return zzz();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaji
    public final int zzh() throws IOException {
        return zza(zzaa());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaji
    public final int zzi() throws IOException {
        if (zzw()) {
            this.zzi = 0;
            return 0;
        }
        int iZzaa = zzaa();
        this.zzi = iZzaa;
        if ((iZzaa >>> 3) != 0) {
            return iZzaa;
        }
        throw zzakm.zzc();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaji
    public final int zzj() throws IOException {
        return zzaa();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaji
    public final long zzk() throws IOException {
        return zzab();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaji
    public final long zzl() throws IOException {
        return zzac();
    }

    private final long zzab() throws IOException {
        int i = this.zzg;
        if (this.zze - i < 8) {
            throw zzakm.zzj();
        }
        byte[] bArr = this.zzd;
        this.zzg = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b0, code lost:
    
        if (r2[r0] >= 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long zzac() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.zzajl.zzac():long");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaji
    final long zzm() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & 127) << i;
            if ((zzy() & 128) == 0) {
                return j;
            }
        }
        throw zzakm.zze();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaji
    public final long zzn() throws IOException {
        return zzab();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaji
    public final long zzo() throws IOException {
        return zza(zzac());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaji
    public final long zzp() throws IOException {
        return zzac();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaji
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.p000firebaseauthapi.zzaiw zzq() throws java.io.IOException {
        /*
            r3 = this;
            int r0 = r3.zzaa()
            if (r0 <= 0) goto L19
            int r1 = r3.zze
            int r2 = r3.zzg
            int r1 = r1 - r2
            if (r0 > r1) goto L19
            byte[] r1 = r3.zzd
            com.google.android.gms.internal.firebase-auth-api.zzaiw r1 = com.google.android.gms.internal.p000firebaseauthapi.zzaiw.zza(r1, r2, r0)
            int r2 = r3.zzg
            int r2 = r2 + r0
            r3.zzg = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            com.google.android.gms.internal.firebase-auth-api.zzaiw r0 = com.google.android.gms.internal.p000firebaseauthapi.zzaiw.zza
            return r0
        L1e:
            if (r0 <= 0) goto L31
            int r1 = r3.zze
            int r2 = r3.zzg
            int r1 = r1 - r2
            if (r0 > r1) goto L31
            int r0 = r0 + r2
            r3.zzg = r0
            byte[] r1 = r3.zzd
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r2, r0)
            goto L37
        L31:
            if (r0 > 0) goto L41
            if (r0 != 0) goto L3c
            byte[] r0 = com.google.android.gms.internal.p000firebaseauthapi.zzaki.zzb
        L37:
            com.google.android.gms.internal.firebase-auth-api.zzaiw r0 = com.google.android.gms.internal.p000firebaseauthapi.zzaiw.zzb(r0)
            return r0
        L3c:
            com.google.android.gms.internal.firebase-auth-api.zzakm r0 = com.google.android.gms.internal.p000firebaseauthapi.zzakm.zzf()
            throw r0
        L41:
            com.google.android.gms.internal.firebase-auth-api.zzakm r0 = com.google.android.gms.internal.p000firebaseauthapi.zzakm.zzj()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.zzajl.zzq():com.google.android.gms.internal.firebase-auth-api.zzaiw");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaji
    public final String zzr() throws IOException {
        int iZzaa = zzaa();
        if (iZzaa > 0 && iZzaa <= this.zze - this.zzg) {
            String str = new String(this.zzd, this.zzg, iZzaa, zzaki.zza);
            this.zzg += iZzaa;
            return str;
        }
        if (iZzaa == 0) {
            return BuildConfig.FLAVOR;
        }
        if (iZzaa < 0) {
            throw zzakm.zzf();
        }
        throw zzakm.zzj();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaji
    public final String zzs() throws IOException {
        int iZzaa = zzaa();
        if (iZzaa > 0) {
            int i = this.zze;
            int i2 = this.zzg;
            if (iZzaa <= i - i2) {
                String strZzb = zzanb.zzb(this.zzd, i2, iZzaa);
                this.zzg += iZzaa;
                return strZzb;
            }
        }
        if (iZzaa == 0) {
            return BuildConfig.FLAVOR;
        }
        if (iZzaa <= 0) {
            throw zzakm.zzf();
        }
        throw zzakm.zzj();
    }

    private zzajl(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zzj = Integer.MAX_VALUE;
        this.zzd = bArr;
        this.zze = i2 + i;
        this.zzg = i;
        this.zzh = i;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaji
    public final void zzc(int i) throws zzakm {
        if (this.zzi != i) {
            throw zzakm.zzb();
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaji
    public final void zzd(int i) {
        this.zzj = i;
        zzad();
    }

    private final void zzad() {
        int i = this.zze + this.zzf;
        this.zze = i;
        int i2 = i - this.zzh;
        int i3 = this.zzj;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.zzf = i4;
            this.zze = i - i4;
            return;
        }
        this.zzf = 0;
    }

    private final void zzf(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.zze;
            int i3 = this.zzg;
            if (i <= i2 - i3) {
                this.zzg = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw zzakm.zzf();
        }
        throw zzakm.zzj();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaji
    public final boolean zzw() throws IOException {
        return this.zzg == this.zze;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaji
    public final boolean zzx() throws IOException {
        return zzac() != 0;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaji
    public final boolean zze(int i) throws IOException {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.zze - this.zzg >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.zzd;
                    int i4 = this.zzg;
                    this.zzg = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw zzakm.zze();
            }
            while (i3 < 10) {
                if (zzy() < 0) {
                    i3++;
                }
            }
            throw zzakm.zze();
            return true;
        }
        if (i2 == 1) {
            zzf(8);
            return true;
        }
        if (i2 == 2) {
            zzf(zzaa());
            return true;
        }
        if (i2 == 3) {
            zzv();
            zzc(((i >>> 3) << 3) | 4);
            return true;
        }
        if (i2 == 4) {
            zzu();
            return false;
        }
        if (i2 == 5) {
            zzf(4);
            return true;
        }
        throw zzakm.zza();
    }
}
