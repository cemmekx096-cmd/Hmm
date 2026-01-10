package com.ironsource.adqualitysdk.sdk.i;

import android.widget.ExpandableListView;
import androidx.media3.exoplayer.RendererCapabilities;
import com.ironsource.adqualitysdk.sdk.R;
import java.io.UnsupportedEncodingException;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class ev extends eo {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f456 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f457 = {337};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f458 = true;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f459 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f460 = true;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f461 = 277;

    public ev(ee eeVar, ee eeVar2, dm dmVar) {
        super(eeVar, eeVar2, dmVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ek
    /* renamed from: ﻛ */
    final boolean mo782(int i) {
        int i2 = f456;
        int i3 = i2 + R.styleable.AppCompatTheme_windowActionModeOverlay;
        f459 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        if (!(i < 0)) {
            return false;
        }
        int i5 = i2 + 19;
        f459 = i5 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i6 = i5 % 2;
        int i7 = i2 + 11;
        f459 = i7 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i8 = i7 % 2;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﻐ */
    public final String mo772() {
        int i = f459 + 21;
        f456 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        return m795(null, null, (i % 2 == 0 ? ']' : (char) 27) != 27 ? (ExpandableListView.getPackedPositionForChild(1, 1) > 1L ? 1 : (ExpandableListView.getPackedPositionForChild(1, 1) == 1L ? 0 : -1)) * 41 : 126 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "\u0081").intern();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m795(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
        byte[] bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (o.ｋ) {
            char[] cArr2 = f457;
            int i2 = f461;
            if (f458) {
                int length = bArr.length;
                o.ﾇ = length;
                char[] cArr3 = new char[length];
                o.ﾒ = 0;
                while (o.ﾒ < o.ﾇ) {
                    cArr3[o.ﾒ] = (char) (cArr2[bArr[(o.ﾇ - 1) - o.ﾒ] + i] - i2);
                    o.ﾒ++;
                }
                return new String(cArr3);
            }
            if (f460) {
                int length2 = cArr.length;
                o.ﾇ = length2;
                char[] cArr4 = new char[length2];
                o.ﾒ = 0;
                while (o.ﾒ < o.ﾇ) {
                    cArr4[o.ﾒ] = (char) (cArr2[cArr[(o.ﾇ - 1) - o.ﾒ] - i] - i2);
                    o.ﾒ++;
                }
                return new String(cArr4);
            }
            int length3 = iArr.length;
            o.ﾇ = length3;
            char[] cArr5 = new char[length3];
            o.ﾒ = 0;
            while (o.ﾒ < o.ﾇ) {
                cArr5[o.ﾒ] = (char) (cArr2[iArr[(o.ﾇ - 1) - o.ﾒ] - i] - i2);
                o.ﾒ++;
            }
            return new String(cArr5);
        }
    }
}
