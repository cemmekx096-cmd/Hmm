package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import com.ironsource.adqualitysdk.sdk.R;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class cq {

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f131 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f132 = 20953;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f133 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f134 = 17357;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f135 = 47066;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f136 = 10150;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m466(String str, String str2) {
        n.ﾇ(new StringBuilder().append(m465("ꏹ娮\ue0de〭", TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 4).intern()).append(str).toString(), str2);
        int i = f133 + 7;
        f131 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m464(String str, String str2, Throwable th) {
        int i = f131 + 3;
        f133 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        m467(str, str2, th);
        int i3 = f133 + 57;
        f131 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i3 % 2 == 0)) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m467(String str, String str2, Throwable th) {
        kb.ﻛ(new StringBuilder().append(m465("ꏹ娮龈ꢺ", TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 4).intern()).append(str).toString(), str2, Integer.toHexString(str2.hashCode()), th, (JSONObject) null, false);
        int i = f133 + R.styleable.AppCompatTheme_windowFixedWidthMinor;
        f131 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 != 0) {
        } else {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m465(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (m.ﾒ) {
            char[] cArr2 = new char[cArr.length];
            m.ﾇ = 0;
            char[] cArr3 = new char[2];
            while (m.ﾇ < cArr.length) {
                cArr3[0] = cArr[m.ﾇ];
                cArr3[1] = cArr[m.ﾇ + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr3[1];
                    char c2 = cArr3[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f136)) ^ ((c2 >>> 5) + f132)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f135) ^ ((c3 + i2) ^ ((c3 << 4) + f134))));
                    i2 -= 40503;
                }
                cArr2[m.ﾇ] = cArr3[0];
                cArr2[m.ﾇ + 1] = cArr3[1];
                m.ﾇ += 2;
            }
            str2 = new String(cArr2, 0, i);
        }
        return str2;
    }
}
