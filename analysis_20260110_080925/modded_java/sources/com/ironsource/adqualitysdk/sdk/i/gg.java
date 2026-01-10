package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.view.ViewConfiguration;
import androidx.media3.exoplayer.RendererCapabilities;
import com.ironsource.adqualitysdk.sdk.R;
import io.bidmachine.BidMachine;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class gg extends gi {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int[] f594 = {1580033455, -1826060177, 1303643798, -1204573656, -59520090, 596212055, 540757174, 817319823, -206749844, 1933460606, -876767580, -1671368541, 255193907, 2047951978, 2003472233, 808431614, -1053883232, 1015266156};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f595 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f596;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m866() {
        int i = f595 + R.styleable.AppCompatTheme_toolbarStyle;
        f596 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        return ((i % 2 != 0 ? (char) 28 : (char) 25) != 28 ? m865(new int[]{-2033005804, -564609164, -760683524, -1479076214, -1879828469, -351045342, 283195529, 523624329, -1639578310, 1924544090, 1272289186, 842186065}, (Process.myTid() >> 22) + 24) : m865(new int[]{-2033005804, -564609164, -760683524, -1479076214, -1879828469, -351045342, 283195529, 523624329, -1639578310, 1924544090, 1272289186, 842186065}, (Process.myTid() / 58) * 80)).intern();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Class m868() {
        int i = f595 + 73;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f596 = i2;
        if ((i % 2 != 0 ? 'D' : 'a') != 'a') {
            Object obj = null;
            super/*java.lang.Object*/.hashCode();
            throw null;
        }
        int i3 = i2 + 29;
        f595 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return BidMachine.class;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final bg m869() {
        bl blVar = new bl(ﻛ());
        int i = f595 + 75;
        f596 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i % 2 != 0)) {
            return blVar;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m867() {
        int i = f595 + 65;
        f596 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        return (i % 2 != 0 ? m865(new int[]{-1470622330, -1172998804, -1957802814, 659705156, 1763368839, -381090811}, (ViewConfiguration.getTapTimeout() - 66) * 7) : m865(new int[]{-1470622330, -1172998804, -1957802814, 659705156, 1763368839, -381090811}, (ViewConfiguration.getTapTimeout() >> 16) + 10)).intern();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m865(int[] iArr, int i) {
        String str;
        synchronized (d.ﾇ) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f594.clone();
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
