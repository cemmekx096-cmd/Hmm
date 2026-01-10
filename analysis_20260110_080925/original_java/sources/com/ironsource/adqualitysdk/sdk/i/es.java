package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.util.TypedValue;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import com.ironsource.adqualitysdk.sdk.R;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class es extends ek {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f446 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f447 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f448 = {'='};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f449 = 1;

    public es(ee eeVar, ee eeVar2, dm dmVar) {
        super(eeVar, eeVar2, dmVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if ((r5 == 0) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        r1 = r1 + 87;
        com.ironsource.adqualitysdk.sdk.i.es.f449 = r1 % androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r5 == 0) goto L15;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.ek
    /* renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean mo782(int r5) {
        /*
            r4 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.es.f449
            int r0 = r0 + 125
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.es.f447 = r1
            int r0 = r0 % 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r3
        L11:
            if (r0 == r2) goto L16
            if (r5 != 0) goto L29
            goto L20
        L16:
            r0 = 50
            int r0 = r0 / r3
            if (r5 != 0) goto L1d
            r5 = r2
            goto L1e
        L1d:
            r5 = r3
        L1e:
            if (r5 == 0) goto L29
        L20:
            int r1 = r1 + 87
            int r5 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.es.f449 = r5
            int r1 = r1 % 2
            return r2
        L29:
            return r3
        L2a:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.es.mo782(int):boolean");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ek
    /* renamed from: ﾇ */
    final boolean mo784(String str, String str2) {
        int i = f449 + R.styleable.AppCompatTheme_toolbarStyle;
        f447 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i % 2 == 0)) {
            str.equals(str2);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        boolean zEquals = str.equals(str2);
        int i2 = f447 + 103;
        f449 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        return zEquals;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ek
    /* renamed from: ﻛ */
    final boolean mo783(Object obj, Object obj2) {
        int i = f449;
        int i2 = i + 39;
        f447 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        if (obj == obj2) {
            int i4 = i + 83;
            f447 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = i + 1;
        f447 = i6 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i7 = i6 % 2;
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﻐ */
    public final String mo772() {
        byte offsetBefore;
        int i;
        int i2 = f447 + 13;
        f449 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i2 % 2 != 0)) {
            offsetBefore = (byte) (R.styleable.AppCompatTheme_windowFixedHeightMinor >> TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 1));
            i = 5 % (TypedValue.complexToFraction(1, 2.0f, 0.0f) > 1.0f ? 1 : (TypedValue.complexToFraction(1, 2.0f, 0.0f) == 1.0f ? 0 : -1));
        } else {
            offsetBefore = (byte) (TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 67);
            i = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2;
        }
        String strIntern = m792(offsetBefore, "\u0080\u0080", i).intern();
        int i3 = f447 + 57;
        f449 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return strIntern;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m792(byte b, String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (i.ﻏ) {
            char[] cArr2 = f448;
            char c = f446;
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
