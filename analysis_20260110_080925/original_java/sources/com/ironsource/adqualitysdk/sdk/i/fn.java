package com.ironsource.adqualitysdk.sdk.i;

import android.widget.ExpandableListView;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import com.ironsource.adqualitysdk.sdk.R;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class fn extends ee {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f510 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f511 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f512;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static fn f513;

    /* renamed from: ﻐ, reason: contains not printable characters */
    static void m808() {
        f512 = 2426085221878215170L;
    }

    static {
        m808();
        f513 = new fn();
        int i = f511 + 105;
        f510 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
    }

    public fn() {
        super(dm.m678(BuildConfig.FLAVOR, -1));
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static synchronized fn m809() {
        int i = f510;
        int i2 = i + R.styleable.AppCompatTheme_toolbarStyle;
        f511 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        fn fnVar = f513;
        int i4 = i + 43;
        f511 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i4 % 2 == 0)) {
            return fnVar;
        }
        int i5 = 10 / 0;
        return fnVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ee
    /* renamed from: ｋ */
    public final du mo735(dr drVar, cp cpVar) {
        du duVar = new du(null);
        int i = f511 + 41;
        f510 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        return duVar;
    }

    public final String toString() {
        int i = f511 + 37;
        f510 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strIntern = m810("㉬\ud83a\ue6f4貉", ExpandableListView.getPackedPositionGroup(0L) + 59981).intern();
        int i3 = f511 + 5;
        f510 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i3 % 2 != 0)) {
            return strIntern;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m810(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (g.ﾇ) {
            g.ﾒ = i;
            char[] cArr2 = new char[cArr.length];
            g.ｋ = 0;
            while (g.ｋ < cArr.length) {
                cArr2[g.ｋ] = (char) ((cArr[g.ｋ] ^ (g.ｋ * g.ﾒ)) ^ f512);
                g.ｋ++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
