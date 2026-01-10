package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public abstract class ee {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f393 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f394 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f395 = 16001;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f396 = 10835;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f397 = 20394;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f398 = 34640;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private dm f399;

    /* renamed from: ｋ */
    public abstract du mo735(dr drVar, cp cpVar);

    public ee(dm dmVar) {
        this.f399 = dmVar;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final du m769(dr drVar, cp cpVar) {
        du duVarMo735;
        ee eeVar = this;
        while (true) {
            duVarMo735 = eeVar.mo735(drVar, cpVar);
            if (duVarMo735 == null) {
                break;
            }
            int i = f393 + 9;
            f394 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (i % 2 != 0) {
                boolean z = duVarMo735.m728() instanceof ee;
                Object obj = null;
                super.hashCode();
                throw null;
            }
            if (!(duVarMo735.m728() instanceof ee)) {
                break;
            }
            eeVar = (ee) duVarMo735.m728();
        }
        int i2 = f393 + 7;
        f394 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        return duVarMo735;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static String m767(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        int length = objArr.length;
        int i = f394 + 23;
        f393 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        int i3 = 0;
        boolean z = true;
        while (i3 < length) {
            int i4 = f393 + 59;
            f394 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i5 = i4 % 2;
            Object obj = objArr[i3];
            if (!z) {
                sb.append(m766("\u07b9\ueb43", 2 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR)).intern());
            }
            if ((obj instanceof String ? (char) 26 : '$') != '$') {
                sb.append(m766("歘\uee84", -MotionEvent.axisFromString(BuildConfig.FLAVOR)).intern());
                sb.append(obj);
                sb.append(m766("歘\uee84", -Process.getGidForName(BuildConfig.FLAVOR)).intern());
            } else {
                sb.append(obj);
                int i6 = f394 + 25;
                f393 = i6 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i7 = i6 % 2;
            }
            i3++;
            z = false;
        }
        return sb.toString();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final int m770() {
        int i = f393 + 99;
        f394 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 == 0) {
            dm dmVar = this.f399;
            if (dmVar == null) {
                return -1;
            }
            int iM680 = dmVar.m680();
            int i2 = f394 + 107;
            f393 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (i2 % 2 != 0) {
                return iM680;
            }
            int i3 = 37 / 0;
            return iM680;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String m768() {
        int i = f394 + 95;
        f393 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        if (this.f399 == null) {
            return BuildConfig.FLAVOR;
        }
        String string = new StringBuilder().append(m766("肕愹᱅䀷䘩짖Ḥ뚔矦ꢕ頜都", 10 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0)).intern()).append(this.f399).toString();
        int i3 = f393 + 63;
        f394 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return string;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m766(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f397)) ^ ((c2 >>> 5) + f396)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f398) ^ ((c3 + i2) ^ ((c3 << 4) + f395))));
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
