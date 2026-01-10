package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.widget.ExpandableListView;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinSdk;
import com.ironsource.adqualitysdk.sdk.R;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class fz extends gi {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f570 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f571;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int[] f572 = {876899140, 1146927188, -1953054979, -719796811, -388021839, -1976701550, -1063637205, 1057734438, -1403009777, -1848047982, -1721802586, -713304591, -63562722, 259654117, -1477532573, 1953018498, -200411879, -189040390};

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m836() {
        int i = f571 + 71;
        f570 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        return (i % 2 == 0 ? m835(new int[]{79751219, 1750554455, -1503082718, 277275941, 402294054, 132018325, 973782822, -769394259, 2043948706, -756067783, 1939264458, 1943427811, -1706348852, -1451493715}, 13 >> ExpandableListView.getPackedPositionGroup(1L)) : m835(new int[]{79751219, 1750554455, -1503082718, 277275941, 402294054, 132018325, 973782822, -769394259, 2043948706, -756067783, 1939264458, 1943427811, -1706348852, -1451493715}, ExpandableListView.getPackedPositionGroup(0L) + 28)).intern();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Class m838() {
        int i = f570;
        int i2 = i + R.styleable.AppCompatTheme_windowFixedHeightMinor;
        f571 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        int i4 = i + 95;
        f571 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i4 % 2 != 0 ? '_' : '@') != '_') {
            return AppLovinSdk.class;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final bg m839() {
        bi biVar = new bi(ﻛ());
        int i = f570 + 43;
        f571 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 != 0 ? '\f' : (char) 19) != '\f') {
            return biVar;
        }
        int i2 = 94 / 0;
        return biVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m837() {
        int i = f571 + 95;
        f570 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        return (i % 2 != 0 ? m835(new int[]{-1503082718, 277275941, 402294054, 132018325}, Color.rgb(0, 0, 0) + 16777224) : m835(new int[]{-1503082718, 277275941, 402294054, 132018325}, 16777224 >> Color.rgb(0, 1, 0))).intern();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m835(int[] iArr, int i) {
        String str;
        synchronized (d.ﾇ) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f572.clone();
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
