package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.R;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class fy extends gi {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f567 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f568;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f566 = {'c', 61908, 58139, 54559, 50821, 47317, 43533, 40051, 36267, 32764, 28987, 25467, 21671, 17946, 14356, 10644, 7124, 3354, 65363, 61568, 58096, 54334, 50790, 47028, 43515, 39719, 35989, 32407, 28679, 25163, 21377, 17803, 14121, 10601, 6841, 3327, 65055, 61544, 57783, 54031, 50523, 46742, 43247, 39437, 35957, 32170, 28667, 24889, 21369, 17599, 14079, 17900, 46162, 42634, 37071, 33545, 64843, 61341, 55797, 51249, 14964, 13488};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f569 = -6121103182133792325L;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m831() {
        int i = f567 + R.styleable.AppCompatTheme_windowFixedHeightMinor;
        f568 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strIntern = m830((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 51, Color.green(0), (char) ((-1) - ImageFormat.getBitsPerPixel(0))).intern();
        int i3 = f568 + 65;
        f567 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return strIntern;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Class m833() {
        int i = f567;
        int i2 = i + 47;
        f568 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        int i4 = i + 25;
        f568 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i4 % 2 != 0)) {
            return IronSourceAdQuality.class;
        }
        int i5 = 45 / 0;
        return IronSourceAdQuality.class;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final bg m834() {
        be beVar = new be(ﻛ());
        int i = f567 + 45;
        f568 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 == 0) {
            return beVar;
        }
        int i2 = 88 / 0;
        return beVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m832() {
        int i = f568 + 101;
        f567 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strIntern = m830(TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 12, 50 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 17804)).intern();
        int i3 = f568 + 81;
        f567 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return strIntern;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m830(int i, int i2, char c) {
        String str;
        synchronized (a.ﻛ) {
            char[] cArr = new char[i];
            a.ｋ = 0;
            while (a.ｋ < i) {
                cArr[a.ｋ] = (char) ((f566[a.ｋ + i2] ^ (a.ｋ * f569)) ^ c);
                a.ｋ++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
