package com.ironsource.adqualitysdk.sdk.i;

import androidx.media3.exoplayer.RendererCapabilities;
import java.io.UnsupportedEncodingException;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class fr extends fq {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f530 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f531;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f532 = {'i', 215, 221, 182, 145, 'w', 225, 20, '$'};

    /* renamed from: ﻐ, reason: contains not printable characters */
    private ee f533;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private fq f534;

    /* renamed from: ｋ, reason: contains not printable characters */
    private ee f535;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private ee f536;

    public fr(ee eeVar, ee eeVar2, ee eeVar3, fq fqVar) {
        this.f533 = eeVar;
        this.f535 = eeVar2;
        this.f536 = eeVar3;
        this.f534 = fqVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
    
        return new com.ironsource.adqualitysdk.sdk.i.du(null);
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.fq
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ironsource.adqualitysdk.sdk.i.du mo804(com.ironsource.adqualitysdk.sdk.i.dr r5, com.ironsource.adqualitysdk.sdk.i.cp r6) {
        /*
            r4 = this;
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r4.f533
            m813(r0, r5, r6)
        L5:
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r4.f535
            com.ironsource.adqualitysdk.sdk.i.du r0 = r0.m769(r5, r6)
            boolean r0 = r0.m732()
            r1 = 1
            if (r0 == 0) goto L14
            r0 = r1
            goto L15
        L14:
            r0 = 0
        L15:
            r2 = 0
            if (r0 == r1) goto L19
            goto L61
        L19:
            com.ironsource.adqualitysdk.sdk.i.fq r0 = r4.f534
            com.ironsource.adqualitysdk.sdk.i.du r0 = r0.mo804(r5, r6)
            boolean r1 = r0.m729()
            r3 = 39
            if (r1 != 0) goto L2a
            r1 = 83
            goto L2b
        L2a:
            r1 = r3
        L2b:
            if (r1 == r3) goto L61
            int r1 = com.ironsource.adqualitysdk.sdk.i.fr.f531
            int r1 = r1 + 45
            int r3 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.fr.f530 = r3
            int r1 = r1 % 2
            r3 = 93
            if (r1 != 0) goto L3d
            r1 = r3
            goto L3f
        L3d:
            r1 = 21
        L3f:
            if (r1 == r3) goto L58
            boolean r1 = r0.m731()
            if (r1 == 0) goto L48
            return r0
        L48:
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r4.f536
            m813(r0, r5, r6)
            int r0 = com.ironsource.adqualitysdk.sdk.i.fr.f530
            int r0 = r0 + 95
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.fr.f531 = r1
            int r0 = r0 % 2
            goto L5
        L58:
            r0.m731()
            super.hashCode()     // Catch: java.lang.Throwable -> L5f
            throw r2     // Catch: java.lang.Throwable -> L5f
        L5f:
            r5 = move-exception
            throw r5
        L61:
            com.ironsource.adqualitysdk.sdk.i.du r5 = new com.ironsource.adqualitysdk.sdk.i.du
            r5.<init>(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.fr.mo804(com.ironsource.adqualitysdk.sdk.i.dr, com.ironsource.adqualitysdk.sdk.i.cp):com.ironsource.adqualitysdk.sdk.i.du");
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static du m813(ee eeVar, dr drVar, cp cpVar) {
        int i = f530 + 79;
        f531 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        Object obj = null;
        if (i % 2 != 0) {
            super.hashCode();
            throw null;
        }
        if (!(eeVar != null)) {
            du duVar = new du(null);
            int i2 = f530 + 73;
            f531 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i3 = i2 % 2;
            return duVar;
        }
        return eeVar.m769(drVar, cpVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m814(false, new int[]{0, 5, 109, 0}, "\u0001\u0001\u0001\u0000\u0000").intern());
        ee eeVar = this.f533;
        if ((eeVar != null ? 'a' : (char) 14) == 'a') {
            sb.append(eeVar);
            int i = f530 + 67;
            f531 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
        }
        sb.append(m814(false, new int[]{5, 2, 180, 0}, "\u0001\u0001").intern());
        sb.append(this.f535);
        sb.append(m814(false, new int[]{5, 2, 180, 0}, "\u0001\u0001").intern());
        ee eeVar2 = this.f536;
        if (eeVar2 != null) {
            int i3 = f531 + 63;
            f530 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i4 = i3 % 2;
            sb.append(eeVar2);
        }
        sb.append(m814(false, new int[]{7, 2, 0, 2}, "\u0001\u0001").intern());
        sb.append(this.f534);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            int i = f531 + 3;
            f530 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
            if ((getClass() != obj.getClass() ? (char) 29 : '<') != 29) {
                fr frVar = (fr) obj;
                ee eeVar = this.f533;
                if (eeVar == null ? frVar.f533 != null : !eeVar.equals(frVar.f533)) {
                    return false;
                }
                ee eeVar2 = this.f535;
                if ((eeVar2 != null ? (char) 15 : 'T') == 15 ? !eeVar2.equals(frVar.f535) : frVar.f535 != null) {
                    return false;
                }
                ee eeVar3 = this.f536;
                if (!(eeVar3 == null) ? eeVar3.equals(frVar.f536) : frVar.f536 == null) {
                    return false;
                }
                fq fqVar = this.f534;
                if (fqVar != null) {
                    int i3 = f530 + 67;
                    f531 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                    int i4 = i3 % 2;
                    return fqVar.equals(frVar.f534);
                }
                if (frVar.f534 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        ee eeVar = this.f533;
        int iHashCode3 = 0;
        if (eeVar != null) {
            int i = f531 + 13;
            f530 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
            iHashCode = eeVar.hashCode();
        } else {
            iHashCode = 0;
        }
        int i3 = iHashCode * 31;
        ee eeVar2 = this.f535;
        if ((eeVar2 != null ? (char) 28 : '1') != '1') {
            iHashCode2 = eeVar2.hashCode();
        } else {
            int i4 = f530 + 17;
            f531 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        }
        int i6 = (i3 + iHashCode2) * 31;
        ee eeVar3 = this.f536;
        int iHashCode4 = (i6 + (!(eeVar3 != null) ? 0 : eeVar3.hashCode())) * 31;
        fq fqVar = this.f534;
        if (fqVar != null) {
            int i7 = f530 + 91;
            f531 = i7 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i8 = i7 % 2;
            iHashCode3 = fqVar.hashCode();
        }
        return iHashCode4 + iHashCode3;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m814(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        synchronized (h.ﾒ) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(f532, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                h.ﾇ = 0;
                char c = 0;
                while (h.ﾇ < i2) {
                    if (bArr[h.ﾇ] == 1) {
                        cArr2[h.ﾇ] = (char) (((cArr[h.ﾇ] << 1) + 1) - c);
                    } else {
                        cArr2[h.ﾇ] = (char) ((cArr[h.ﾇ] << 1) - c);
                    }
                    c = cArr2[h.ﾇ];
                    h.ﾇ++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                h.ﾇ = 0;
                while (h.ﾇ < i2) {
                    cArr4[h.ﾇ] = cArr[(i2 - h.ﾇ) - 1];
                    h.ﾇ++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                h.ﾇ = 0;
                while (h.ﾇ < i2) {
                    cArr[h.ﾇ] = (char) (cArr[h.ﾇ] - iArr[2]);
                    h.ﾇ++;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }
}
