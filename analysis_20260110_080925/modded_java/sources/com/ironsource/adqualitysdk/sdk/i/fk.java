package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.View;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import com.crashlytics.android.BuildConfig;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class fk extends fq {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f497 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f498 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f499 = {'{', '\n', ' ', '}'};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f500 = 2;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private fq[] f501;

    public fk(List<fq> list) {
        fq[] fqVarArr = new fq[list.size()];
        this.f501 = fqVarArr;
        list.toArray(fqVarArr);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fq
    /* renamed from: ｋ */
    public final du mo804(dr drVar, cp cpVar) {
        du duVar = new du(null);
        dr drVar2 = new dr(drVar);
        fq[] fqVarArr = this.f501;
        int length = fqVarArr.length;
        int i = 0;
        while (i < length) {
            duVar = fqVarArr[i].mo804(drVar2, cpVar);
            if (duVar.m731()) {
                break;
            }
            int i2 = f498 + 9;
            f497 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i3 = i2 % 2;
            if (!(!duVar.m729())) {
                break;
            }
            int i4 = f498 + 47;
            f497 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i5 = i4 % 2;
            if (duVar.m725()) {
                break;
            }
            i++;
            int i6 = f497 + 89;
            f498 = i6 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i7 = i6 % 2;
        }
        return duVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m805((byte) (42 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), "\u0001\u0000", 2 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0)).intern());
        fq[] fqVarArr = this.f501;
        int length = fqVarArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                int i2 = f497 + 73;
                f498 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i3 = i2 % 2;
                fq fqVar = fqVarArr[i];
                sb.append(m805((byte) (13 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR)), InternalFrame.ID, 4 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0)).intern());
                sb.append(fqVar.toString());
                sb.append(m805((byte) (75 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), "T", View.resolveSizeAndState(0, 0, 0) + 1).intern());
                i++;
            } else {
                sb.append(m805((byte) (View.resolveSizeAndState(0, 0, 0) + 38), "£", -TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0')).intern());
                String string = sb.toString();
                int i4 = f497 + 21;
                f498 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i5 = i4 % 2;
                return string;
            }
        }
    }

    public final boolean equals(Object obj) {
        if ((this == obj ? (char) 19 : '8') == 19) {
            return true;
        }
        if (!(obj == null)) {
            int i = f497 + 71;
            f498 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (i % 2 != 0) {
                obj.getClass();
                throw null;
            }
            if (getClass() == obj.getClass()) {
                fq[] fqVarArr = this.f501;
                fq[] fqVarArr2 = ((fk) obj).f501;
                if (fqVarArr != null) {
                    return fqVarArr.equals(fqVarArr2);
                }
                if (fqVarArr2 != null) {
                    return false;
                }
                int i2 = f497 + 13;
                f498 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i3 = i2 % 2;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        if ((r4.f501 != null ? '\b' : 'Q') != 'Q') goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        if (r4.f501 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        r1 = r1 + 47;
        com.ironsource.adqualitysdk.sdk.i.fk.f497 = r1 % androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        return r4.f501.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r4 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.fk.f497
            int r0 = r0 + 119
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.fk.f498 = r1
            int r0 = r0 % 2
            r2 = 0
            if (r0 == 0) goto Lf
            r0 = r2
            goto L10
        Lf:
            r0 = 1
        L10:
            if (r0 == 0) goto L1f
            com.ironsource.adqualitysdk.sdk.i.fq[] r0 = r4.f501
            r3 = 81
            if (r0 == 0) goto L1b
            r0 = 8
            goto L1c
        L1b:
            r0 = r3
        L1c:
            if (r0 == r3) goto L35
            goto L26
        L1f:
            com.ironsource.adqualitysdk.sdk.i.fq[] r0 = r4.f501
            r3 = 32
            int r3 = r3 / r2
            if (r0 == 0) goto L35
        L26:
            int r1 = r1 + 47
            int r0 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.fk.f497 = r0
            int r1 = r1 % 2
            com.ironsource.adqualitysdk.sdk.i.fq[] r0 = r4.f501
            int r0 = r0.hashCode()
            return r0
        L35:
            return r2
        L36:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.fk.hashCode():int");
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m805(byte b, String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (i.ﻏ) {
            char[] cArr2 = f499;
            char c = f500;
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr3[i] = (char) (cArr[i] - b);
            }
            if (i > 1) {
                i.ﾒ = 0;
                while (i.ﾒ < i) {
                    i.ﾇ = cArr[i.ﾒ];
                    i.ﻛ = cArr[i.ﾒ + 1];
                    if (i.ﾇ == i.ﻛ) {
                        cArr3[i.ﾒ] = (char) (i.ﾇ - b);
                        cArr3[i.ﾒ + 1] = (char) (i.ﻛ - b);
                    } else {
                        i.ｋ = i.ﾇ / c;
                        i.ﱟ = i.ﾇ % c;
                        i.ﻐ = i.ﻛ / c;
                        i.ﮐ = i.ﻛ % c;
                        if (i.ﱟ == i.ﮐ) {
                            i.ｋ = ((i.ｋ + c) - 1) % c;
                            i.ﻐ = ((i.ﻐ + c) - 1) % c;
                            int i2 = (i.ｋ * c) + i.ﱟ;
                            int i3 = (i.ﻐ * c) + i.ﮐ;
                            cArr3[i.ﾒ] = cArr2[i2];
                            cArr3[i.ﾒ + 1] = cArr2[i3];
                        } else if (i.ｋ == i.ﻐ) {
                            i.ﱟ = ((i.ﱟ + c) - 1) % c;
                            i.ﮐ = ((i.ﮐ + c) - 1) % c;
                            int i4 = (i.ｋ * c) + i.ﱟ;
                            int i5 = (i.ﻐ * c) + i.ﮐ;
                            cArr3[i.ﾒ] = cArr2[i4];
                            cArr3[i.ﾒ + 1] = cArr2[i5];
                        } else {
                            int i6 = (i.ｋ * c) + i.ﮐ;
                            int i7 = (i.ﻐ * c) + i.ﱟ;
                            cArr3[i.ﾒ] = cArr2[i6];
                            cArr3[i.ﾒ + 1] = cArr2[i7];
                        }
                    }
                    i.ﾒ += 2;
                }
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
