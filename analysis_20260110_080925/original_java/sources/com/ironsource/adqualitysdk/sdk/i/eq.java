package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import com.ironsource.adqualitysdk.sdk.R;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class eq extends eo {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f442 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f443 = {797656759, 1562401224, 1784676952, 735941736, 1706411476, -182344892, 1896746434, -1455156712, 1431824416, 1593043335, 3458233, 674547778, 776961446, -327616408, 1079281396, 1927882278, 1075014869, -1975634407};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f444;

    public eq(ee eeVar, ee eeVar2, dm dmVar) {
        super(eeVar, eeVar2, dmVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
    
        if ((r5 >= 0 ? '1' : 'K') != '1') goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0023, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
    
        r1 = r1 + 17;
        com.ironsource.adqualitysdk.sdk.i.eq.f442 = r1 % androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r5 >= 0) goto L17;
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
            int r0 = com.ironsource.adqualitysdk.sdk.i.eq.f442
            int r0 = r0 + 53
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.eq.f444 = r1
            int r0 = r0 % 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L10
            r0 = r3
            goto L11
        L10:
            r0 = r2
        L11:
            if (r0 == 0) goto L16
            if (r5 < 0) goto L23
            goto L24
        L16:
            r0 = 25
            int r0 = r0 / r3
            r0 = 49
            if (r5 < 0) goto L1f
            r5 = r0
            goto L21
        L1f:
            r5 = 75
        L21:
            if (r5 == r0) goto L24
        L23:
            return r3
        L24:
            int r1 = r1 + 17
            int r5 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.eq.f442 = r5
            int r1 = r1 % 2
            return r2
        L2d:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.eq.mo782(int):boolean");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﻐ */
    public final String mo772() {
        int i = f442 + 87;
        f444 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strIntern = m791(new int[]{242588460, 632900173}, TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 3).intern();
        int i3 = f444 + R.styleable.AppCompatTheme_toolbarStyle;
        f442 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return strIntern;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m791(int[] iArr, int i) {
        String str;
        synchronized (d.ﾇ) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f443.clone();
            d.ﻛ = 0;
            while (d.ﻛ < iArr.length) {
                cArr[0] = (char) (iArr[d.ﻛ] >> 16);
                cArr[1] = (char) iArr[d.ﻛ];
                cArr[2] = (char) (iArr[d.ﻛ + 1] >> 16);
                cArr[3] = (char) iArr[d.ﻛ + 1];
                d.ﾒ = (cArr[0] << 16) + cArr[1];
                d.ｋ = (cArr[2] << 16) + cArr[3];
                d.ﾒ(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = d.ﾒ ^ iArr2[i2];
                    d.ﾒ = i3;
                    d.ｋ = d.ｋ(i3) ^ d.ｋ;
                    int i4 = d.ﾒ;
                    d.ﾒ = d.ｋ;
                    d.ｋ = i4;
                }
                int i5 = d.ﾒ;
                d.ﾒ = d.ｋ;
                d.ｋ = i5;
                d.ｋ = i5 ^ iArr2[16];
                d.ﾒ ^= iArr2[17];
                int i6 = d.ﾒ;
                int i7 = d.ｋ;
                cArr[0] = (char) (d.ﾒ >>> 16);
                cArr[1] = (char) d.ﾒ;
                cArr[2] = (char) (d.ｋ >>> 16);
                cArr[3] = (char) d.ｋ;
                d.ﾒ(iArr2);
                cArr2[d.ﻛ << 1] = cArr[0];
                cArr2[(d.ﻛ << 1) + 1] = cArr[1];
                cArr2[(d.ﻛ << 1) + 2] = cArr[2];
                cArr2[(d.ﻛ << 1) + 3] = cArr[3];
                d.ﻛ += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
