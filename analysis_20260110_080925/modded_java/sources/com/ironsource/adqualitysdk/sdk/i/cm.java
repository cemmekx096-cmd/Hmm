package com.ironsource.adqualitysdk.sdk.i;

import androidx.media3.exoplayer.RendererCapabilities;
import com.ironsource.adqualitysdk.sdk.i.co;
import com.ironsource.adqualitysdk.sdk.i.hz;
import io.ktor.util.date.GMTDateParser;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class cm {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private co f102;

    /* renamed from: ｋ, reason: contains not printable characters */
    private int f103;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private List<String> f104;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private hz.d f105;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final hz m426(hy hyVar) {
        return this.f105.ﾒ(hyVar, this.f104, this.f103);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final co m425() {
        return this.f102;
    }

    public static class a extends cz implements ck {

        /* renamed from: ﮐ, reason: contains not printable characters */
        private static int f106 = 1;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static int f107;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static char[] f108 = {GMTDateParser.SECONDS, 31182, 62242, 27980, 59077, 24633, 55878, 21448, 52520, 18295, 49350, 14879, 46187, 11741, 42777, 8557, 39637, 5176, 36461, GMTDateParser.SECONDS, 31182, 62242, 27986, 59081, 24630, 55920, 21454, 52528, 18256, 49371, 14889, 46177, 11741, 42777, 8553, 39633, 5160, 36469, 2004, 33071, GMTDateParser.SECONDS, 31182, 62242, 27980, 59077, 24633, 55878, 21448, 52520, 18295, 49350, 14879, 46187, 11741, 42775, 8548, 39616, 5160, 17430, 15787, 46919, 10551, 41644, 9299, 40469, 6059, 35157, 815, 33957, 32369, 61440, 27066, 58188, GMTDateParser.SECONDS, 31182, 62242, 27980, 59077, 24633, 55878, 21448, 52520, 18295, 49350, 14879, 46187, 11741, 42777, 8554, 39644, 5175, 36451, 2002, 33064, 64366, 29917, 60979, 26747, 59298, 40479, 5363, 35459, 280, 34791, 15777, 46111, 10977, 41115, 10001, 56779, 21434, 51730, 16615, 50865, 32002, 62462, 27070, 57359, 26339, 7333, 'c', 31198, 62245, 28021, 59075, 24634, 55873, 21445, 52541, 18272, 49349, 14868, 46177, 11739, 42802, 8554, 39636};

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static long f109 = 3178654271887669675L;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static long f110 = 9036385983134046093L;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private co.b f111;

        /* renamed from: ｋ, reason: contains not printable characters */
        private cm f112;

        public a(List<String> list, int i) {
            cm cmVar = new cm();
            this.f112 = cmVar;
            cmVar.f105 = new hz.d();
            this.f112.f104 = list;
            this.f112.f103 = i;
            this.f111 = new co.b();
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private cm m429() {
            int i = f107 + 5;
            f106 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
            this.f112.f102 = this.f111.m459();
            cm cmVar = this.f112;
            int i3 = f107 + 77;
            f106 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i4 = i3 % 2;
            return cmVar;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0266  */
        @Override // com.ironsource.adqualitysdk.sdk.i.ck
        /* renamed from: ﾇ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object mo418(java.lang.String r17, java.util.List<java.lang.Object> r18, com.ironsource.adqualitysdk.sdk.i.ch r19) {
            /*
                Method dump skipped, instructions count: 1044
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cm.a.mo418(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static String m428(int i, int i2, char c) {
            String str;
            synchronized (com.ironsource.adqualitysdk.sdk.i.a.ﻛ) {
                char[] cArr = new char[i];
                com.ironsource.adqualitysdk.sdk.i.a.ｋ = 0;
                while (com.ironsource.adqualitysdk.sdk.i.a.ｋ < i) {
                    cArr[com.ironsource.adqualitysdk.sdk.i.a.ｋ] = (char) ((f108[com.ironsource.adqualitysdk.sdk.i.a.ｋ + i2] ^ (com.ironsource.adqualitysdk.sdk.i.a.ｋ * f109)) ^ c);
                    com.ironsource.adqualitysdk.sdk.i.a.ｋ++;
                }
                str = new String(cArr);
            }
            return str;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static String m427(String str, int i) {
            String str2;
            char[] charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = charArray;
            synchronized (f.ﾒ) {
                char[] cArr2 = f.ﾒ(f110, cArr, i);
                f.ﾇ = 4;
                while (f.ﾇ < cArr2.length) {
                    f.ﻛ = f.ﾇ - 4;
                    cArr2[f.ﾇ] = (char) ((cArr2[f.ﾇ] ^ cArr2[f.ﾇ % 4]) ^ (f.ﻛ * f110));
                    f.ﾇ++;
                }
                str2 = new String(cArr2, 4, cArr2.length - 4);
            }
            return str2;
        }
    }
}
