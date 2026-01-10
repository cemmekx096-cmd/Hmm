package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public abstract class ej extends ee {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f422 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f423;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f424 = {44050, 35978};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f425 = 2205675406622319337L;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private ee f426;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private ee f427;

    ej(ee eeVar, ee eeVar2, dm dmVar) {
        super(dmVar);
        this.f426 = eeVar;
        this.f427 = eeVar2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    final ee m781() {
        int i = f423 + 51;
        f422 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 == 0 ? (char) 20 : '$') == '$') {
            return this.f426;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    final ee m780() {
        int i = f422 + 63;
        f423 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 == 0) {
            return this.f427;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public String toString() {
        String string = new StringBuilder().append(m781().toString()).append(m779(Color.alpha(0) + 1, 1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (44105 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).intern()).append(m780().toString()).append(m779(1 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 1, (char) (Color.red(0) + 36055)).intern()).toString();
        int i = f422 + 3;
        f423 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 != 0 ? '_' : 'J') == 'J') {
            return string;
        }
        int i2 = 45 / 0;
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r1.equals(r7.f426) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        if ((r7.f426 == null) != true) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0061, code lost:
    
        r1 = r6.f427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
    
        if (r1 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.i.ej.f423 + 15;
        com.ironsource.adqualitysdk.sdk.i.ej.f422 = r0 % androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        r0 = r0 % 2;
        r7 = r7.f427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:
    
        if (r0 == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0077, code lost:
    
        return r1.equals(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0078, code lost:
    
        r1.equals(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007b, code lost:
    
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0085, code lost:
    
        if (r7.f427 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
    
        r7 = 19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008a, code lost:
    
        r7 = 27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008b, code lost:
    
        if (r7 == 27) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
    
        r7 = com.ironsource.adqualitysdk.sdk.i.ej.f422 + 99;
        com.ironsource.adqualitysdk.sdk.i.ej.f423 = r7 % androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_PRIMARY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0098, code lost:
    
        if ((r7 % 2) != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x009b, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.ej.f423
            int r0 = r0 + 55
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ej.f422 = r1
            int r0 = r0 % 2
            r2 = 60
            if (r0 != 0) goto L11
            r0 = 63
            goto L12
        L11:
            r0 = r2
        L12:
            r3 = 0
            if (r0 != r2) goto La0
            r0 = 0
            r2 = 1
            if (r6 != r7) goto L1b
            r4 = r0
            goto L1c
        L1b:
            r4 = r2
        L1c:
            if (r4 == 0) goto L9f
            if (r7 == 0) goto L9e
            int r1 = r1 + 53
            int r4 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.ej.f423 = r4
            int r1 = r1 % 2
            java.lang.Class r1 = r6.getClass()
            java.lang.Class r4 = r7.getClass()
            if (r1 == r4) goto L34
            goto L9e
        L34:
            com.ironsource.adqualitysdk.sdk.i.ej r7 = (com.ironsource.adqualitysdk.sdk.i.ej) r7
            com.ironsource.adqualitysdk.sdk.i.ee r1 = r6.f426
            if (r1 == 0) goto L57
            int r4 = com.ironsource.adqualitysdk.sdk.i.ej.f422
            int r4 = r4 + 7
            int r5 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.ej.f423 = r5
            int r4 = r4 % 2
            if (r4 != 0) goto L4f
            com.ironsource.adqualitysdk.sdk.i.ee r4 = r7.f426
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L61
            goto L60
        L4f:
            com.ironsource.adqualitysdk.sdk.i.ee r7 = r7.f426
            r1.equals(r7)
            throw r3     // Catch: java.lang.Throwable -> L55
        L55:
            r7 = move-exception
            throw r7
        L57:
            com.ironsource.adqualitysdk.sdk.i.ee r1 = r7.f426
            if (r1 == 0) goto L5d
            r1 = r0
            goto L5e
        L5d:
            r1 = r2
        L5e:
            if (r1 == r2) goto L61
        L60:
            return r0
        L61:
            com.ironsource.adqualitysdk.sdk.i.ee r1 = r6.f427
            if (r1 == 0) goto L81
            int r0 = com.ironsource.adqualitysdk.sdk.i.ej.f423
            int r0 = r0 + 15
            int r2 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ej.f422 = r2
            int r0 = r0 % 2
            com.ironsource.adqualitysdk.sdk.i.ee r7 = r7.f427
            if (r0 == 0) goto L78
            boolean r7 = r1.equals(r7)
            return r7
        L78:
            r1.equals(r7)
            super.hashCode()     // Catch: java.lang.Throwable -> L7f
            throw r3     // Catch: java.lang.Throwable -> L7f
        L7f:
            r7 = move-exception
            throw r7
        L81:
            com.ironsource.adqualitysdk.sdk.i.ee r7 = r7.f427
            r1 = 27
            if (r7 != 0) goto L8a
            r7 = 19
            goto L8b
        L8a:
            r7 = r1
        L8b:
            if (r7 == r1) goto L8e
            return r2
        L8e:
            int r7 = com.ironsource.adqualitysdk.sdk.i.ej.f422
            int r7 = r7 + 99
            int r1 = r7 % 128
            com.ironsource.adqualitysdk.sdk.i.ej.f423 = r1
            int r7 = r7 % 2
            if (r7 != 0) goto L9b
            return r0
        L9b:
            throw r3     // Catch: java.lang.Throwable -> L9c
        L9c:
            r7 = move-exception
            throw r7
        L9e:
            return r0
        L9f:
            return r2
        La0:
            throw r3     // Catch: java.lang.Throwable -> La1
        La1:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ej.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = f423 + 53;
        f422 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        ee eeVar = this.f426;
        int iHashCode = 0;
        int iHashCode2 = (!(eeVar != null) ? 0 : eeVar.hashCode()) * 31;
        ee eeVar2 = this.f427;
        if ((eeVar2 != null ? '^' : (char) 16) != '^') {
            int i3 = f422 + 67;
            f423 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i4 = i3 % 2;
        } else {
            iHashCode = eeVar2.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m779(int i, int i2, char c) {
        String str;
        synchronized (a.ﻛ) {
            char[] cArr = new char[i];
            a.ｋ = 0;
            while (a.ｋ < i) {
                cArr[a.ｋ] = (char) ((f424[a.ｋ + i2] ^ (a.ｋ * f425)) ^ c);
                a.ｋ++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
