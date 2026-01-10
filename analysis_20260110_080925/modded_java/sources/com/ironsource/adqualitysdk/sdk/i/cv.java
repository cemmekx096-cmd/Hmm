package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class cv extends cz {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f149 = 97;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f150 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f151 = 1;

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dc  */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m517(com.ironsource.adqualitysdk.sdk.i.cp r10, java.util.List<java.lang.Object> r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cv.m517(com.ironsource.adqualitysdk.sdk.i.cp, java.util.List):java.lang.Object");
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m518(int i, int i2, int i3, String str, boolean z) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (b.ﻛ) {
            char[] cArr2 = new char[i2];
            b.ｋ = 0;
            while (b.ｋ < i2) {
                b.ﻐ = cArr[b.ｋ];
                cArr2[b.ｋ] = (char) (b.ﻐ + i3);
                int i4 = b.ｋ;
                cArr2[i4] = (char) (cArr2[i4] - f149);
                b.ｋ++;
            }
            if (i > 0) {
                b.ﾇ = i;
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                System.arraycopy(cArr3, 0, cArr2, i2 - b.ﾇ, b.ﾇ);
                System.arraycopy(cArr3, b.ﾇ, cArr2, 0, i2 - b.ﾇ);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                b.ｋ = 0;
                while (b.ｋ < i2) {
                    cArr4[b.ｋ] = cArr2[(i2 - b.ｋ) - 1];
                    b.ｋ++;
                }
                cArr2 = cArr4;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
