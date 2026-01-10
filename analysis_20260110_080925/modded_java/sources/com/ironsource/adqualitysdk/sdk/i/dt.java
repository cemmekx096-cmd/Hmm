package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import com.ironsource.adqualitysdk.sdk.R;
import com.ironsource.adqualitysdk.sdk.i.kc;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class dt {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static boolean f317 = true;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f318 = 0;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static boolean f319 = true;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f320 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f321 = {377, 394, 383, 395, 378, 391, 380, 401, 349, 312, 392, 385, 390, 389, 381, 396, 384, 357, 397, 388, 400, 379, 398};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f322 = 280;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String[] f323;

    /* renamed from: ｋ, reason: contains not printable characters */
    private String f324;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private fq f325;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m722() {
        int i = f320;
        int i2 = i + 25;
        f318 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i2 % 2 == 0)) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String str = this.f324;
        int i3 = i + 95;
        f318 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return str;
    }

    public dt(String str, String str2, JSONObject jSONObject) {
        this.f324 = dw.m736(str2);
        List list = kc.ｋ(jSONObject.optJSONArray(m719(null, null, Color.alpha(0) + 127, "\u0084\u0083\u0082\u0081").intern()), new kc.b<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dt.1
            /* renamed from: ｋ, reason: contains not printable characters */
            public final /* synthetic */ Object m723(JSONArray jSONArray, int i) {
                return dw.m736(jSONArray.optString(i));
            }
        });
        String[] strArr = new String[list.size()];
        this.f323 = strArr;
        list.toArray(strArr);
        try {
            this.f325 = new ds(str, str2).ｋ(dq.m707(str, str2, jSONObject.optString(m719(null, null, 128 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "\u0088\u0087\u0086\u0085").intern())));
        } catch (Throwable th) {
            cq.m464(str, new StringBuilder().append(m719(null, null, View.MeasureSpec.getMode(0) + 127, "\u008a\u0087\u0086\u0091\u0090\u008f\u008e\u008a\u0083\u008d\u008c\u0084\u0082\u0081\u008b\u008a\u0082\u0086\u0082\u0082\u0089").intern()).append(this.f324).toString(), th);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final du m721(dr drVar, cp cpVar, List<Object> list) {
        dr drVar2 = new dr(m720(cpVar, list, Arrays.asList(this.f323)), drVar.m716());
        fq fqVar = this.f325;
        if (!(fqVar != null)) {
            cq.m464(cpVar.ﺙ(), new StringBuilder().append(m719(null, null, (ViewConfiguration.getLongPressTimeout() >> 16) + 127, "\u008a\u0087\u0086\u0091\u0090\u008f\u0092").intern()).append(this.f324).append(m719(null, null, MotionEvent.axisFromString(BuildConfig.FLAVOR) + RendererCapabilities.DECODER_SUPPORT_PRIMARY, "\u0088\u0087\u0086\u0085\u008a\u0094\u0094\u0093\u008d\u008a\u0084\u0081\u0091\u008a").intern()).toString(), null);
            return null;
        }
        int i = f318 + 39;
        f320 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        du duVarMo804 = fqVar.mo804(drVar2, cpVar);
        int i3 = f320 + 57;
        f318 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return duVarMo804;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private Map<String, Object> m720(cp cpVar, List<Object> list, List<String> list2) {
        if (list.size() != list2.size()) {
            cq.m464(cpVar.ﺙ(), new StringBuilder().append(this.f324).append(m719(null, null, KeyEvent.getDeadChar(0, 0) + 127, "\u008a\u0087\u008f\u0090\u0096\u008f\u008b\u0095\u008f\u008a\u0087\u0086\u0091\u0090\u008f\u008e\u008a").intern()).append(list2.size()).append(m719(null, null, 127 - View.MeasureSpec.getSize(0), "\u008a\u0087\u008f\u0097\u008c\u008f\u0096\u008f\u0082\u008a\u0090\u0093\u0085\u008a\u0084\u0090\u008d\u008f\u008e\u0093\u0083\u0082\u0081\u008a").intern()).append(list.size()).toString(), null);
            return null;
        }
        HashMap map = new HashMap();
        int i = f320 + 81;
        f318 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        int i3 = 0;
        while (true) {
            if (i3 >= list.size()) {
                return map;
            }
            int i4 = f320 + R.styleable.AppCompatTheme_windowFixedWidthMinor;
            f318 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i5 = i4 % 2;
            map.put(list2.get(i3), list.get(i3));
            i3++;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m719(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f321;
            int i2 = f322;
            if (f319) {
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
            if (f317) {
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
