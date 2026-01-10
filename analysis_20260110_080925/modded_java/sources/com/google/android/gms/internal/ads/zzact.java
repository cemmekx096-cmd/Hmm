package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;
import androidx.media3.exoplayer.RendererCapabilities;
import com.ironsource.adqualitysdk.sdk.R;
import com.mbridge.msdk.playercommon.VideoFeedsPlayer;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzact {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, RendererCapabilities.DECODER_SUPPORT_PRIMARY, 160, 192, 224, 256, 320, RendererCapabilities.DECODER_SUPPORT_MASK, 448, RendererCapabilities.AUDIO_OFFLOAD_SUPPORTED, 576, 640};
    private static final int[] zzg = {69, 87, 104, R.styleable.AppCompatTheme_windowFixedHeightMinor, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int zza(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return zzb[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static int zzb(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b = bArr[4];
            return zzf((b & 192) >> 6, b & 63);
        }
        int i = bArr[2] & 7;
        int i2 = ((bArr[3] & 255) | (i << 8)) + 1;
        return i2 + i2;
    }

    public static zzz zzc(zzen zzenVar, String str, String str2, zzs zzsVar) {
        zzem zzemVar = new zzem();
        zzemVar.zzj(zzenVar);
        int i = zzc[zzemVar.zzd(2)];
        zzemVar.zzn(8);
        int i2 = zze[zzemVar.zzd(3)];
        if (zzemVar.zzd(1) != 0) {
            i2++;
        }
        int i3 = zzf[zzemVar.zzd(5)] * VideoFeedsPlayer.INTERVAL_TIME_PLAY_TIME_CD_THREAD;
        zzemVar.zzf();
        zzenVar.zzL(zzemVar.zzb());
        zzx zzxVar = new zzx();
        zzxVar.zzS(str);
        zzxVar.zzah(MimeTypes.AUDIO_AC3);
        zzxVar.zzD(i2);
        zzxVar.zzai(i);
        zzxVar.zzL(zzsVar);
        zzxVar.zzW(str2);
        zzxVar.zzC(i3);
        zzxVar.zzac(i3);
        return zzxVar.zzan();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzz zzd(com.google.android.gms.internal.ads.zzen r7, java.lang.String r8, java.lang.String r9, com.google.android.gms.internal.ads.zzs r10) {
        /*
            com.google.android.gms.internal.ads.zzem r0 = new com.google.android.gms.internal.ads.zzem
            r0.<init>()
            r0.zzj(r7)
            r1 = 13
            int r1 = r0.zzd(r1)
            int r1 = r1 * 1000
            r2 = 3
            r0.zzn(r2)
            r3 = 2
            int r3 = r0.zzd(r3)
            int[] r4 = com.google.android.gms.internal.ads.zzact.zzc
            r3 = r4[r3]
            r4 = 10
            r0.zzn(r4)
            int[] r4 = com.google.android.gms.internal.ads.zzact.zze
            int r5 = r0.zzd(r2)
            r4 = r4[r5]
            r5 = 1
            int r6 = r0.zzd(r5)
            if (r6 == 0) goto L33
            int r4 = r4 + 1
        L33:
            r0.zzn(r2)
            r2 = 4
            int r2 = r0.zzd(r2)
            r0.zzn(r5)
            if (r2 <= 0) goto L4f
            r2 = 6
            r0.zzn(r2)
            int r2 = r0.zzd(r5)
            if (r2 == 0) goto L4c
            int r4 = r4 + 2
        L4c:
            r0.zzn(r5)
        L4f:
            int r2 = r0.zza()
            r6 = 7
            if (r2 <= r6) goto L62
            r0.zzn(r6)
            int r2 = r0.zzd(r5)
            if (r2 == 0) goto L62
            java.lang.String r2 = "audio/eac3-joc"
            goto L64
        L62:
            java.lang.String r2 = "audio/eac3"
        L64:
            r0.zzf()
            int r0 = r0.zzb()
            r7.zzL(r0)
            com.google.android.gms.internal.ads.zzx r7 = new com.google.android.gms.internal.ads.zzx
            r7.<init>()
            r7.zzS(r8)
            r7.zzah(r2)
            r7.zzD(r4)
            r7.zzai(r3)
            r7.zzL(r10)
            r7.zzW(r9)
            r7.zzac(r1)
            com.google.android.gms.internal.ads.zzz r7 = r7.zzan()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzact.zzd(com.google.android.gms.internal.ads.zzen, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.zzs):com.google.android.gms.internal.ads.zzz");
    }

    public static zzacr zze(zzem zzemVar) {
        int i;
        String str;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int iZzc = zzemVar.zzc();
        zzemVar.zzn(40);
        int iZzd = zzemVar.zzd(5);
        zzemVar.zzl(iZzc);
        int i12 = -1;
        if (iZzd > 10) {
            zzemVar.zzn(16);
            int iZzd2 = zzemVar.zzd(2);
            if (iZzd2 == 0) {
                i12 = 0;
            } else if (iZzd2 == 1) {
                i12 = 1;
            } else if (iZzd2 == 2) {
                i12 = 2;
            }
            zzemVar.zzn(3);
            int iZzd3 = zzemVar.zzd(11) + 1;
            int iZzd4 = zzemVar.zzd(2);
            if (iZzd4 == 3) {
                i8 = zzd[zzemVar.zzd(2)];
                i9 = 6;
                i7 = 3;
            } else {
                int iZzd5 = zzemVar.zzd(2);
                int i13 = zzb[iZzd5];
                i7 = iZzd5;
                i8 = zzc[iZzd4];
                i9 = i13;
            }
            int i14 = iZzd3 + iZzd3;
            int i15 = (i14 * i8) / (i9 * 32);
            int iZzd6 = zzemVar.zzd(3);
            boolean zZzp = zzemVar.zzp();
            i = zze[iZzd6] + (zZzp ? 1 : 0);
            zzemVar.zzn(10);
            if (zzemVar.zzp()) {
                zzemVar.zzn(8);
            }
            if (iZzd6 == 0) {
                zzemVar.zzn(5);
                if (zzemVar.zzp()) {
                    zzemVar.zzn(8);
                }
                i10 = 0;
                iZzd6 = 0;
            } else {
                i10 = iZzd6;
            }
            if (i12 == 1) {
                if (zzemVar.zzp()) {
                    zzemVar.zzn(16);
                }
                i11 = 1;
            } else {
                i11 = i12;
            }
            if (zzemVar.zzp()) {
                if (i10 > 2) {
                    zzemVar.zzn(2);
                }
                if ((i10 & 1) != 0 && i10 > 2) {
                    zzemVar.zzn(6);
                }
                if ((i10 & 4) != 0) {
                    zzemVar.zzn(6);
                }
                if (zZzp && zzemVar.zzp()) {
                    zzemVar.zzn(5);
                }
                if (i11 == 0) {
                    if (zzemVar.zzp()) {
                        zzemVar.zzn(6);
                    }
                    if (i10 == 0 && zzemVar.zzp()) {
                        zzemVar.zzn(6);
                    }
                    if (zzemVar.zzp()) {
                        zzemVar.zzn(6);
                    }
                    int iZzd7 = zzemVar.zzd(2);
                    if (iZzd7 == 1) {
                        zzemVar.zzn(5);
                    } else if (iZzd7 == 2) {
                        zzemVar.zzn(12);
                    } else if (iZzd7 == 3) {
                        int iZzd8 = zzemVar.zzd(5);
                        if (zzemVar.zzp()) {
                            zzemVar.zzn(5);
                            if (zzemVar.zzp()) {
                                zzemVar.zzn(4);
                            }
                            if (zzemVar.zzp()) {
                                zzemVar.zzn(4);
                            }
                            if (zzemVar.zzp()) {
                                zzemVar.zzn(4);
                            }
                            if (zzemVar.zzp()) {
                                zzemVar.zzn(4);
                            }
                            if (zzemVar.zzp()) {
                                zzemVar.zzn(4);
                            }
                            if (zzemVar.zzp()) {
                                zzemVar.zzn(4);
                            }
                            if (zzemVar.zzp()) {
                                zzemVar.zzn(4);
                            }
                            if (zzemVar.zzp()) {
                                if (zzemVar.zzp()) {
                                    zzemVar.zzn(4);
                                }
                                if (zzemVar.zzp()) {
                                    zzemVar.zzn(4);
                                }
                            }
                        }
                        if (zzemVar.zzp()) {
                            zzemVar.zzn(5);
                            if (zzemVar.zzp()) {
                                zzemVar.zzn(7);
                                if (zzemVar.zzp()) {
                                    zzemVar.zzn(8);
                                }
                            }
                        }
                        zzemVar.zzn((iZzd8 + 2) * 8);
                        zzemVar.zzf();
                    }
                    if (i10 < 2) {
                        if (zzemVar.zzp()) {
                            zzemVar.zzn(14);
                        }
                        if (iZzd6 == 0 && zzemVar.zzp()) {
                            zzemVar.zzn(14);
                        }
                    }
                    if (!zzemVar.zzp()) {
                        i11 = 0;
                    } else if (i7 == 0) {
                        zzemVar.zzn(5);
                        i11 = 0;
                        i7 = 0;
                    } else {
                        for (int i16 = 0; i16 < i9; i16++) {
                            if (zzemVar.zzp()) {
                                zzemVar.zzn(5);
                            }
                        }
                        i11 = 0;
                    }
                }
            }
            if (zzemVar.zzp()) {
                zzemVar.zzn(5);
                if (i10 == 2) {
                    zzemVar.zzn(4);
                    i10 = 2;
                }
                if (i10 >= 6) {
                    zzemVar.zzn(2);
                }
                if (zzemVar.zzp()) {
                    zzemVar.zzn(8);
                }
                if (i10 == 0 && zzemVar.zzp()) {
                    zzemVar.zzn(8);
                }
                if (iZzd4 < 3) {
                    zzemVar.zzm();
                }
            }
            if (i11 == 0 && i7 != 3) {
                zzemVar.zzm();
            }
            if (i11 == 2 && (i7 == 3 || zzemVar.zzp())) {
                zzemVar.zzn(6);
            }
            str = (zzemVar.zzp() && zzemVar.zzd(6) == 1 && zzemVar.zzd(8) == 1) ? MimeTypes.AUDIO_E_AC3_JOC : MimeTypes.AUDIO_E_AC3;
            i2 = i12;
            i4 = i14;
            i5 = i8;
            i6 = i9 * 256;
            i3 = i15;
        } else {
            zzemVar.zzn(32);
            int iZzd9 = zzemVar.zzd(2);
            String str2 = iZzd9 == 3 ? null : MimeTypes.AUDIO_AC3;
            int iZzd10 = zzemVar.zzd(6);
            int i17 = zzf[iZzd10 / 2] * VideoFeedsPlayer.INTERVAL_TIME_PLAY_TIME_CD_THREAD;
            int iZzf = zzf(iZzd9, iZzd10);
            zzemVar.zzn(8);
            int iZzd11 = zzemVar.zzd(3);
            if ((iZzd11 & 1) != 0 && iZzd11 != 1) {
                zzemVar.zzn(2);
            }
            if ((iZzd11 & 4) != 0) {
                zzemVar.zzn(2);
            }
            if (iZzd11 == 2) {
                zzemVar.zzn(2);
            }
            int i18 = iZzd9 < 3 ? zzc[iZzd9] : -1;
            i = zze[iZzd11] + (zzemVar.zzp() ? 1 : 0);
            str = str2;
            i2 = -1;
            i3 = i17;
            i4 = iZzf;
            i5 = i18;
            i6 = 1536;
        }
        return new zzacr(str, i2, i, i5, i4, i6, i3, null);
    }

    private static int zzf(int i, int i2) {
        int i3;
        if (i < 0 || i >= 3 || i2 < 0 || (i3 = i2 >> 1) >= 19) {
            return -1;
        }
        int i4 = zzc[i];
        if (i4 == 44100) {
            int i5 = zzg[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = zzf[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }
}
