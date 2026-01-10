package com.ironsource.adqualitysdk.sdk.i;

import androidx.media3.exoplayer.RendererCapabilities;
import com.ironsource.adqualitysdk.sdk.R;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class cz {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f152 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f153;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f154 = {16, '1', 'R', 'g', 'n', 'n', 'q', 'J', 'A', 'b', 'j', GMTDateParser.SECONDS, 227, 232, 148, 148};

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static <T> T m528(List<Object> list, int i, Class<T> cls) {
        int i2 = f153 + 39;
        f152 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        T t = (T) list.get(i);
        if (t != null) {
            int i4 = f152 + 37;
            f153 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i5 = i4 % 2;
            if (!(cls.isAssignableFrom(t.getClass()))) {
                throw new ClassCastException(new StringBuilder().append(m526(false, new int[]{0, 12, 0, 1}, "\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001").intern()).append(t.getClass().getName()).append(m526(true, new int[]{12, 4, R.styleable.AppCompatTheme_viewInflaterClass, 3}, (String) null).intern()).append(cls.getName()).toString());
            }
        }
        int i6 = f153 + 59;
        f152 = i6 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i6 % 2 != 0) {
            return t;
        }
        int i7 = 24 / 0;
        return t;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    protected static <T> boolean m527(List<Object> list, int i, Class<T> cls) {
        int i2 = f153 + 31;
        f152 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        Object obj = list.get(i);
        if ((obj != null ? (char) 27 : '\n') != '\n') {
            int i4 = f153 + 109;
            f152 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            boolean z = i4 % 2 == 0;
            Class<?> cls2 = obj.getClass();
            if (z) {
                cls.isAssignableFrom(cls2);
                Object obj2 = null;
                super.hashCode();
                throw null;
            }
            if (!cls.isAssignableFrom(cls2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    protected static List<Object> m529(List<Object> list, int i) {
        List<Object> list2;
        ArrayList arrayList = new ArrayList();
        if (!(list.size() > i)) {
            return arrayList;
        }
        int i2 = f153 + 75;
        f152 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i2 % 2 != 0)) {
            int i3 = 39 / 0;
            if (!m527(list, i, List.class)) {
                return arrayList;
            }
        } else if (!m527(list, i, List.class)) {
            return arrayList;
        }
        int i4 = f152 + 81;
        f153 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i4 % 2 == 0)) {
            list2 = (List) m528(list, i, List.class);
            int i5 = 67 / 0;
        } else {
            list2 = (List) m528(list, i, List.class);
        }
        return list2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m526(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
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
            System.arraycopy(f154, i, cArr, 0, i2);
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
