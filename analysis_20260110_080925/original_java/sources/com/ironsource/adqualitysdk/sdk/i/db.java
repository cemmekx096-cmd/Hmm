package com.ironsource.adqualitysdk.sdk.i;

import androidx.media3.exoplayer.RendererCapabilities;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class db extends cz {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f158 = {'\"', '[', 'r', 'p', 'p', 'I', 'A', 'j', 'k', 'c', 'j', 'n', 'k', 'j', 'C', 'F', 'i', 'l', 'n', 'k', 'i', 'B', 'I', GMTDateParser.SECONDS, 'q', 'n', 'g', 'a', 'g', GMTDateParser.HOURS};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f159 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f160 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final it m540(final cp cpVar, List<Object> list, final dr drVar) {
        final List<Object> list2;
        try {
            if ((m527(list, 0, it.class) ? '(' : (char) 17) != 17) {
                it itVar = (it) m528(list, 0, it.class);
                int i = f159 + 59;
                f160 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i2 = i % 2;
                return itVar;
            }
            final dt dtVar = (dt) m528(list, 0, dt.class);
            if (!(list.size() > 2)) {
                list2 = m529(list, 1);
            } else {
                int i3 = f159 + 9;
                f160 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i4 = i3 % 2;
                list2 = m529(list, 2);
            }
            return new it() { // from class: com.ironsource.adqualitysdk.sdk.i.db.2
                /* renamed from: ﾒ, reason: contains not printable characters */
                public final void m544() {
                    list2.add(0, this);
                    dtVar.m721(drVar, cpVar, list2);
                    list2.remove(0);
                }
            };
        } catch (Exception e) {
            cq.m464(cpVar.ﺙ(), m535(false, new int[]{0, 30, 0, 0}, "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001").intern(), e);
            return null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final Object m539(cp cpVar, List<Object> list, dr drVar) {
        int i = f160 + 5;
        f159 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i % 2 == 0)) {
            s.ｋ(m540(cpVar, list, drVar));
            int i2 = 58 / 0;
        } else {
            s.ｋ(m540(cpVar, list, drVar));
        }
        int i3 = f160 + 59;
        f159 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i3 % 2 == 0 ? (char) 3 : ';') == 3) {
            return null;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Object m543(cp cpVar, List<Object> list, dr drVar) {
        int i = f159 + 93;
        f160 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        Object obj = null;
        if ((i % 2 == 0 ? 'A' : GMTDateParser.ANY) != 'A') {
            s.ﾇ(m540(cpVar, list, drVar));
            int i2 = f159 + 31;
            f160 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (i2 % 2 != 0) {
                return null;
            }
            super.hashCode();
            throw null;
        }
        s.ﾇ(m540(cpVar, list, drVar));
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final Object m542(cp cpVar, List<Object> list, dr drVar) {
        int i = f159 + 81;
        f160 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        s.ﻐ(m540(cpVar, list, drVar), m536(list));
        int i3 = f160 + 67;
        f159 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Object m541(cp cpVar, List<Object> list, dr drVar) {
        int i = f160 + 59;
        f159 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 != 0 ? 'c' : '0') != 'c') {
            s.ﻐ(m540(cpVar, list, drVar));
            int i2 = f160 + 77;
            f159 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i3 = i2 % 2;
            return null;
        }
        s.ﻐ(m540(cpVar, list, drVar));
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final Object m538(cp cpVar, List<Object> list, dr drVar) {
        int i = f159 + 17;
        f160 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        s.ﾒ(m540(cpVar, list, drVar));
        int i3 = f159 + 11;
        f160 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i3 % 2 == 0)) {
            return null;
        }
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final Object m537(cp cpVar, List<Object> list, dr drVar) {
        int i = f159 + 13;
        f160 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 == 0 ? '=' : '9') != '=') {
            s.ﻛ(m540(cpVar, list, drVar), m536(list));
            return null;
        }
        s.ﻛ(m540(cpVar, list, drVar), m536(list));
        int i2 = 53 / 0;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long m536(java.util.List<java.lang.Object> r7) {
        /*
            r0 = 0
            int r2 = r7.size()
            r3 = 82
            r4 = 1
            if (r2 <= r4) goto Le
            r2 = 52
            goto Lf
        Le:
            r2 = r3
        Lf:
            r5 = 0
            r6 = 2
            if (r2 == r3) goto L2f
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            boolean r2 = m527(r7, r4, r2)
            if (r2 == 0) goto L1d
            r2 = r4
            goto L1e
        L1d:
            r2 = r5
        L1e:
            if (r2 == r4) goto L21
            goto L2f
        L21:
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            java.lang.Object r7 = m528(r7, r4, r0)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
        L2d:
            long r0 = (long) r7
            goto L4f
        L2f:
            int r2 = r7.size()
            if (r2 <= r6) goto L36
            goto L37
        L36:
            r4 = r5
        L37:
            if (r4 == 0) goto L4f
            int r0 = com.ironsource.adqualitysdk.sdk.i.db.f160
            int r0 = r0 + 43
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.db.f159 = r1
            int r0 = r0 % r6
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            java.lang.Object r7 = m528(r7, r6, r0)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            goto L2d
        L4f:
            int r7 = com.ironsource.adqualitysdk.sdk.i.db.f159
            int r7 = r7 + 95
            int r2 = r7 % 128
            com.ironsource.adqualitysdk.sdk.i.db.f160 = r2
            int r7 = r7 % r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.db.m536(java.util.List):long");
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m535(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
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
            System.arraycopy(f158, i, cArr, 0, i2);
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
