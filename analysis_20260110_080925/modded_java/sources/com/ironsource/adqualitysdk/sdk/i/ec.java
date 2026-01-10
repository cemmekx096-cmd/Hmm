package com.ironsource.adqualitysdk.sdk.i;

import androidx.media3.exoplayer.RendererCapabilities;
import com.ironsource.adqualitysdk.sdk.R;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class ec extends ee {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f382 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f383 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f384 = {'A', 128, 128, GMTDateParser.YEAR, GMTDateParser.YEAR, '|', '|', 132, '~', '{', GMTDateParser.ZONE, 'S', 'U', '~', 129, '~', 'W', '[', '{', 'v', 128, '}', 'R', 'B', 'k', 'o', 16, '&', 'i', 16, '-', '-', '!', GMTDateParser.ZONE};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private Map<String, ee> f385;

    public ec(Map<String, ee> map, dm dmVar) {
        super(dmVar);
        this.f385 = new HashMap();
        for (String str : map.keySet()) {
            this.f385.put(dw.m736(str), map.get(str));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ee
    /* renamed from: ｋ */
    public final du mo735(dr drVar, cp cpVar) throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        Iterator<String> it = this.f385.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int i = f382 + 11;
            f383 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
            String next = it.next();
            try {
                jSONObjectJsonObjectInit.put(next, this.f385.get(next).m769(drVar, cpVar).m728());
            } catch (JSONException e) {
                cq.m464(cpVar.ﺙ(), new StringBuilder().append(m762(false, new int[]{0, 25, 16, 23}, "\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001").intern()).append(m768()).toString(), e);
            }
        }
        du duVar = new du(jSONObjectJsonObjectInit);
        int i3 = f382 + 49;
        f383 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i3 % 2 != 0) {
            return duVar;
        }
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m762(false, new int[]{25, 1, 100, 0}, "\u0001").intern());
        Iterator<String> it = this.f385.keySet().iterator();
        boolean z = true;
        while (true) {
            if ((it.hasNext() ? GMTDateParser.YEAR : (char) 22) != 22) {
                String next = it.next();
                if ((!z ? 'c' : (char) 11) == 'c') {
                    int i = f383 + 57;
                    f382 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                    int i2 = i % 2;
                    sb.append(m762(false, new int[]{26, 2, 0, 1}, "\u0000\u0000").intern());
                    int i3 = f382 + 69;
                    f383 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                    int i4 = i3 % 2;
                }
                sb.append(m762(true, new int[]{28, 1, 176, 0}, "\u0000").intern());
                sb.append(next);
                sb.append(m762(true, new int[]{29, 4, 0, 4}, "\u0000\u0000\u0000\u0000").intern());
                sb.append(this.f385.get(next));
                z = false;
            } else {
                sb.append(m762(true, new int[]{33, 1, R.styleable.AppCompatTheme_windowActionModeOverlay, 0}, "\u0000").intern());
                return sb.toString();
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                ec ecVar = (ec) obj;
                Map<String, ee> map = this.f385;
                char c = map != null ? (char) 3 : '$';
                Map<String, ee> map2 = ecVar.f385;
                if (c != '$') {
                    return map.equals(map2);
                }
                if (map2 == null) {
                    int i = f382 + 85;
                    int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                    f383 = i2;
                    int i3 = i % 2;
                    int i4 = i2 + 7;
                    f382 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                    int i5 = i4 % 2;
                    return true;
                }
            }
            return false;
        }
        int i6 = f382 + 107;
        f383 = i6 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i7 = i6 % 2;
        return true;
    }

    public final int hashCode() {
        int i = f383 + 101;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f382 = i2;
        int i3 = i % 2;
        Map<String, ee> map = this.f385;
        if ((map != null ? (char) 30 : (char) 24) != 30) {
            return 0;
        }
        int i4 = i2 + 25;
        f383 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i5 = i4 % 2;
        return map.hashCode();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m762(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        synchronized (h.ﾒ) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(f384, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                h.ﾇ = 0;
                char c = 0;
                while (h.ﾇ < i2) {
                    if (bArr[h.ﾇ] == 1) {
                        cArr2[h.ﾇ] = (char) (((cArr[h.ﾇ] << 1) + 1) - c);
                    } else {
                        cArr2[h.ﾇ] = (char) ((cArr[h.ﾇ] << 1) - c);
                    }
                    c = cArr2[h.ﾇ];
                    h.ﾇ++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                h.ﾇ = 0;
                while (h.ﾇ < i2) {
                    cArr4[h.ﾇ] = cArr[(i2 - h.ﾇ) - 1];
                    h.ﾇ++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                h.ﾇ = 0;
                while (h.ﾇ < i2) {
                    cArr[h.ﾇ] = (char) (cArr[h.ﾇ] - iArr[2]);
                    h.ﾇ++;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }
}
