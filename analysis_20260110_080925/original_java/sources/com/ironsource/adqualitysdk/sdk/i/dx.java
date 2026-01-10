package com.ironsource.adqualitysdk.sdk.i;

import androidx.media3.exoplayer.RendererCapabilities;
import com.ironsource.adqualitysdk.sdk.R;
import java.io.UnsupportedEncodingException;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class dx extends ee {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f338 = {16, ' ', '.'};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f339 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f340 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private el f341;

    /* renamed from: ｋ, reason: contains not printable characters */
    private ee f342;

    public dx(el elVar, ee eeVar, dm dmVar) {
        super(dmVar);
        this.f341 = elVar;
        this.f342 = eeVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ee
    /* renamed from: ｋ */
    public final du mo735(dr drVar, cp cpVar) {
        int i = f340 + 35;
        f339 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        du duVarM769 = this.f342.m769(drVar, cpVar);
        drVar.m714(this.f341.m786(), duVarM769.m728());
        int i3 = f340 + R.styleable.AppCompatTheme_toolbarStyle;
        f339 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return duVarM769;
    }

    public final String toString() {
        String string = new StringBuilder().append(this.f341).append(m737(true, new int[]{0, 3, 0, 1}, "\u0000\u0000\u0001").intern()).append(this.f342).toString();
        int i = f339 + 37;
        f340 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 != 0) {
            return string;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        if ((r5.f341 != null ? '0' : 'T') != 'T') goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.dx.f339
            int r1 = r0 + 115
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.dx.f340 = r2
            int r1 = r1 % 2
            r1 = 1
            r2 = 0
            if (r4 != r5) goto L22
            int r0 = r0 + 43
            int r5 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.dx.f340 = r5
            int r0 = r0 % 2
            r5 = 52
            if (r0 != 0) goto L1d
            r0 = 24
            goto L1e
        L1d:
            r0 = r5
        L1e:
            if (r0 == r5) goto L21
            return r2
        L21:
            return r1
        L22:
            if (r5 == 0) goto L7e
            java.lang.Class r0 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r0 == r3) goto L30
            r0 = r2
            goto L31
        L30:
            r0 = r1
        L31:
            if (r0 == 0) goto L7e
            com.ironsource.adqualitysdk.sdk.i.dx r5 = (com.ironsource.adqualitysdk.sdk.i.dx) r5
            com.ironsource.adqualitysdk.sdk.i.el r0 = r4.f341
            if (r0 == 0) goto L4c
            com.ironsource.adqualitysdk.sdk.i.el r3 = r5.f341
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L59
            int r5 = com.ironsource.adqualitysdk.sdk.i.dx.f340
            int r5 = r5 + 77
            int r0 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.dx.f339 = r0
            int r5 = r5 % 2
            goto L58
        L4c:
            com.ironsource.adqualitysdk.sdk.i.el r0 = r5.f341
            r3 = 84
            if (r0 == 0) goto L55
            r0 = 48
            goto L56
        L55:
            r0 = r3
        L56:
            if (r0 == r3) goto L59
        L58:
            return r2
        L59:
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r4.f342
            if (r0 == 0) goto L5f
            r3 = r2
            goto L60
        L5f:
            r3 = r1
        L60:
            if (r3 == r1) goto L73
            int r1 = com.ironsource.adqualitysdk.sdk.i.dx.f340
            int r1 = r1 + 29
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.dx.f339 = r2
            int r1 = r1 % 2
            com.ironsource.adqualitysdk.sdk.i.ee r5 = r5.f342
            boolean r5 = r0.equals(r5)
            return r5
        L73:
            com.ironsource.adqualitysdk.sdk.i.ee r5 = r5.f342
            if (r5 != 0) goto L79
            r5 = r2
            goto L7a
        L79:
            r5 = r1
        L7a:
            if (r5 == 0) goto L7d
            return r2
        L7d:
            return r1
        L7e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dx.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        el elVar = this.f341;
        int iHashCode = 0;
        int iHashCode2 = (elVar != null ? elVar.hashCode() : 0) * 31;
        ee eeVar = this.f342;
        if (eeVar != null) {
            int i = f339 + 43;
            f340 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if ((i % 2 == 0 ? 'W' : (char) 22) != 22) {
                int i2 = 58 / 0;
                iHashCode = eeVar.hashCode();
            } else {
                iHashCode = eeVar.hashCode();
            }
        } else {
            int i3 = f340 + 11;
            f339 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i4 = i3 % 2;
        }
        return iHashCode2 + iHashCode;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final el m738() {
        int i = f340 + 15;
        f339 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 == 0) {
            return this.f341;
        }
        int i2 = 41 / 0;
        return this.f341;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m737(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
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
            System.arraycopy(f338, i, cArr, 0, i2);
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
