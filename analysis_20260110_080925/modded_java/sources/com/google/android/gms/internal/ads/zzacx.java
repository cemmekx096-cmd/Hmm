package com.google.android.gms.internal.ads;

import androidx.media3.exoplayer.RendererCapabilities;
import com.ironsource.rj;
import com.mbridge.msdk.playercommon.VideoFeedsPlayer;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzacx {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {rj.b.INSTANCE_LOAD, 2000, 1920, 1601, 1600, 1001, VideoFeedsPlayer.INTERVAL_TIME_PLAY_TIME_CD_THREAD, 960, 800, 800, 480, 400, 400, RendererCapabilities.AUDIO_OFFLOAD_SPEED_CHANGE_SUPPORTED};

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.ads.zzaz */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8 A[PHI: r15
      0x00c8: PHI (r15v14 int) = (r15v6 int), (r15v2 int) binds: [B:136:0x01e8, B:42:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzz zza(com.google.android.gms.internal.ads.zzen r18, java.lang.String r19, java.lang.String r20, com.google.android.gms.internal.ads.zzs r21) throws com.google.android.gms.internal.ads.zzaz {
        /*
            Method dump skipped, instructions count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacx.zza(com.google.android.gms.internal.ads.zzen, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.zzs):com.google.android.gms.internal.ads.zzz");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzacv zzb(com.google.android.gms.internal.ads.zzem r11) {
        /*
            r0 = 16
            int r1 = r11.zzd(r0)
            int r0 = r11.zzd(r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L18
            r0 = 24
            int r0 = r11.zzd(r0)
            r3 = 7
            goto L19
        L18:
            r3 = r2
        L19:
            int r0 = r0 + r3
            r3 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r3) goto L21
            int r0 = r0 + 2
        L21:
            r7 = r0
            r0 = 2
            int r1 = r11.zzd(r0)
            r3 = 0
            r4 = 3
            if (r1 != r4) goto L3d
            r1 = r3
        L2c:
            int r5 = r11.zzd(r0)
            int r1 = r1 + r5
            boolean r5 = r11.zzp()
            if (r5 != 0) goto L39
            int r1 = r1 + r4
            goto L3d
        L39:
            int r1 = r1 + 1
            int r1 = r1 << r0
            goto L2c
        L3d:
            r5 = 10
            int r5 = r11.zzd(r5)
            boolean r6 = r11.zzp()
            if (r6 == 0) goto L52
            int r6 = r11.zzd(r4)
            if (r6 <= 0) goto L52
            r11.zzn(r0)
        L52:
            boolean r6 = r11.zzp()
            r8 = 44100(0xac44, float:6.1797E-41)
            r9 = 48000(0xbb80, float:6.7262E-41)
            r10 = 1
            if (r10 == r6) goto L61
            r6 = r8
            goto L62
        L61:
            r6 = r9
        L62:
            int r11 = r11.zzd(r2)
            if (r6 != r8) goto L72
            r8 = 13
            if (r11 != r8) goto L72
            int[] r11 = com.google.android.gms.internal.ads.zzacx.zzb
            r11 = r11[r8]
            r8 = r11
            goto L9e
        L72:
            if (r6 != r9) goto L9d
            r8 = 14
            if (r11 >= r8) goto L9d
            int[] r3 = com.google.android.gms.internal.ads.zzacx.zzb
            r3 = r3[r11]
            int r5 = r5 % 5
            r8 = 8
            if (r5 == r10) goto L97
            r9 = 11
            if (r5 == r0) goto L92
            if (r5 == r4) goto L97
            if (r5 == r2) goto L8b
            goto L9d
        L8b:
            if (r11 == r4) goto L9b
            if (r11 == r8) goto L9b
            if (r11 != r9) goto L9d
            goto L9b
        L92:
            if (r11 == r8) goto L9b
            if (r11 != r9) goto L9d
            goto L9b
        L97:
            if (r11 == r4) goto L9b
            if (r11 != r8) goto L9d
        L9b:
            int r3 = r3 + 1
        L9d:
            r8 = r3
        L9e:
            com.google.android.gms.internal.ads.zzacv r11 = new com.google.android.gms.internal.ads.zzacv
            r5 = 2
            r9 = 0
            r3 = r11
            r4 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacx.zzb(com.google.android.gms.internal.ads.zzem):com.google.android.gms.internal.ads.zzacv");
    }

    public static void zzc(int i, zzen zzenVar) {
        zzenVar.zzI(7);
        byte[] bArrZzN = zzenVar.zzN();
        bArrZzN[0] = -84;
        bArrZzN[1] = 64;
        bArrZzN[2] = -1;
        bArrZzN[3] = -1;
        bArrZzN[4] = (byte) ((i >> 16) & 255);
        bArrZzN[5] = (byte) ((i >> 8) & 255);
        bArrZzN[6] = (byte) (i & 255);
    }

    private static void zzd(zzem zzemVar, zzacu zzacuVar) throws zzaz {
        int iZzd = zzemVar.zzd(5);
        zzemVar.zzn(2);
        if (zzemVar.zzp()) {
            zzemVar.zzn(5);
        }
        if (iZzd >= 7 && iZzd <= 10) {
            zzemVar.zzm();
        }
        if (zzemVar.zzp()) {
            int iZzd2 = zzemVar.zzd(3);
            if (zzacuVar.zzb == -1 && iZzd >= 0 && iZzd <= 15 && (iZzd2 == 0 || iZzd2 == 1)) {
                zzacuVar.zzb = iZzd;
            }
            if (zzemVar.zzp()) {
                zzf(zzemVar);
            }
        }
    }

    private static void zze(zzem zzemVar, zzacu zzacuVar) throws zzaz {
        zzemVar.zzn(2);
        boolean zZzp = zzemVar.zzp();
        int iZzd = zzemVar.zzd(8);
        for (int i = 0; i < iZzd; i++) {
            zzemVar.zzn(2);
            if (zzemVar.zzp()) {
                zzemVar.zzn(5);
            }
            if (zZzp) {
                zzemVar.zzn(24);
            } else {
                if (zzemVar.zzp()) {
                    if (!zzemVar.zzp()) {
                        zzemVar.zzn(4);
                    }
                    zzacuVar.zzc = zzemVar.zzd(6) + 1;
                }
                zzemVar.zzn(4);
            }
        }
        if (zzemVar.zzp()) {
            zzemVar.zzn(3);
            if (zzemVar.zzp()) {
                zzf(zzemVar);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.ads.zzaz */
    private static void zzf(zzem zzemVar) throws zzaz {
        int iZzd = zzemVar.zzd(6);
        if (iZzd < 2 || iZzd > 42) {
            throw zzaz.zzc(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iZzd)));
        }
        zzemVar.zzn(iZzd * 8);
    }

    private static boolean zzg(zzem zzemVar) {
        if (zzemVar.zza() < 66) {
            return false;
        }
        zzemVar.zzn(66);
        return true;
    }
}
