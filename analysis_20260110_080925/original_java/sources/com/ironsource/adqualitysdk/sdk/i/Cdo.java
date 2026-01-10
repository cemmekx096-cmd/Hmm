package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.media3.exoplayer.RendererCapabilities;
import com.ironsource.adqualitysdk.sdk.R;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.do, reason: invalid class name */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class Cdo {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char f271 = 27371;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f272 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f273;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f274;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f275;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private boolean f276;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private boolean f277;

    /* renamed from: ｋ, reason: contains not printable characters */
    private String f278;

    public Cdo(JSONObject jSONObject) {
        this.f277 = jSONObject.optBoolean(m688(View.MeasureSpec.getSize(0), (char) Color.alpha(0), "ꣻऀꮖ齆", "말\uf888䰹䶱炕ۑ\uded6溼䬨씩", "\u0000\u0000\u0000\u0000").intern());
        this.f276 = jSONObject.optBoolean(m688((-369488159) - Color.green(0), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), "\ue114﨎ᗩ쁮", "\ue3dd没\ud953Ӥ돵\ueadd쌊▵떻", "\u0000\u0000\u0000\u0000").intern());
        this.f278 = dw.m736(jSONObject.optString(m688(ViewConfiguration.getMinimumFlingVelocity() >> 16, (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 54390), "諟閁癁棔", "壆ꅈ묆了뺜筗", "\u0000\u0000\u0000\u0000").intern()));
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m689() {
        int i = f273 + 9;
        f272 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i % 2 == 0)) {
            return this.f277;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final boolean m690() {
        int i = f272 + 85;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f273 = i2;
        int i3 = i % 2;
        boolean z = this.f276;
        int i4 = i2 + 107;
        f272 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i5 = i4 % 2;
        return z;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m691() {
        String str;
        int i = f272 + 57;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f273 = i2;
        if ((i % 2 != 0 ? 'b' : '\n') != '\n') {
            str = this.f278;
            int i3 = 50 / 0;
        } else {
            str = this.f278;
        }
        int i4 = i2 + R.styleable.AppCompatTheme_windowFixedHeightMinor;
        f272 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i4 % 2 == 0 ? (char) 21 : 'P') == 'P') {
            return str;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m688(int i, char c, String str, String str2, String str3) {
        String str4;
        char[] charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = charArray;
        char[] charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = charArray2;
        char[] charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = charArray3;
        synchronized (j.ﾒ) {
            char[] cArr4 = (char[]) cArr3.clone();
            char[] cArr5 = (char[]) cArr.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr2.length;
            char[] cArr6 = new char[length];
            j.ﻐ = 0;
            while (j.ﻐ < length) {
                int i2 = (j.ﻐ + 2) % 4;
                int i3 = (j.ﻐ + 3) % 4;
                j.ｋ = (char) (((cArr4[j.ﻐ % 4] * 32718) + cArr5[i2]) % 65535);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                cArr4[i3] = j.ｋ;
                cArr6[j.ﻐ] = (char) ((((cArr4[i3] ^ cArr2[j.ﻐ]) ^ f274) ^ f275) ^ f271);
                j.ﻐ++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
