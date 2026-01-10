package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import androidx.media3.exoplayer.RendererCapabilities;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public abstract class ef extends ee {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f400 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f401;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int[] f402 = {1978848276, -1772754001, 1135313326, 1227918279, 2061939814, -1246222404, -469958609, -695790088, 812985192, 1537411016, -136664330, -205113409, -115843049, 1692977033, -2046416064, 529317177, 1491226857, -707705953};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private ee f403;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private ee f404;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public abstract String mo772();

    public ef(ee eeVar, ee eeVar2, dm dmVar) {
        super(dmVar);
        this.f404 = eeVar;
        this.f403 = eeVar2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final ee m774() {
        int i = f400;
        int i2 = i + 1;
        f401 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        ee eeVar = this.f404;
        int i4 = i + 93;
        f401 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i4 % 2 != 0)) {
            return eeVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final ee m773() {
        int i = f401;
        int i2 = i + 91;
        f400 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        ee eeVar = this.f403;
        int i4 = i + 95;
        f400 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i4 % 2 == 0 ? '.' : 'B') != '.') {
            return eeVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public String toString() {
        String string = new StringBuilder().append(this.f404).append(m771(new int[]{-63842335, -2109043621}, 1 - (ViewConfiguration.getTapTimeout() >> 16)).intern()).append(mo772()).append(m771(new int[]{-63842335, -2109043621}, 1 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern()).append(this.f403).toString();
        int i = f400 + 1;
        f401 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if ((r6.f404 != null ? 28 : '7') != 28) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        if (r2.equals(r6.f404) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        r2 = r5.f403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        if (r2 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        r4 = '5';
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        r4 = '\\';
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        r6 = r6.f403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
    
        if (r4 == '\\') goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        return r2.equals(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        if (r6 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
    
        r6 = com.ironsource.adqualitysdk.sdk.i.ef.f400 + 65;
        com.ironsource.adqualitysdk.sdk.i.ef.f401 = r6 % androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0069, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r5 != r6) goto Le
            int r6 = com.ironsource.adqualitysdk.sdk.i.ef.f400
            int r6 = r6 + 109
            int r1 = r6 % 128
            com.ironsource.adqualitysdk.sdk.i.ef.f401 = r1
            int r6 = r6 % 2
            return r0
        Le:
            r1 = 0
            if (r6 == 0) goto L6a
            int r2 = com.ironsource.adqualitysdk.sdk.i.ef.f400
            int r2 = r2 + 115
            int r3 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.ef.f401 = r3
            int r2 = r2 % 2
            java.lang.Class r2 = r5.getClass()
            java.lang.Class r3 = r6.getClass()
            if (r2 == r3) goto L26
            goto L6a
        L26:
            com.ironsource.adqualitysdk.sdk.i.ef r6 = (com.ironsource.adqualitysdk.sdk.i.ef) r6
            com.ironsource.adqualitysdk.sdk.i.ee r2 = r5.f404
            r3 = 50
            if (r2 == 0) goto L30
            r4 = r3
            goto L32
        L30:
            r4 = 72
        L32:
            if (r4 == r3) goto L41
            com.ironsource.adqualitysdk.sdk.i.ee r2 = r6.f404
            r3 = 28
            if (r2 == 0) goto L3c
            r2 = r3
            goto L3e
        L3c:
            r2 = 55
        L3e:
            if (r2 == r3) goto L49
            goto L4a
        L41:
            com.ironsource.adqualitysdk.sdk.i.ee r3 = r6.f404
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4a
        L49:
            return r1
        L4a:
            com.ironsource.adqualitysdk.sdk.i.ee r2 = r5.f403
            r3 = 92
            if (r2 == 0) goto L53
            r4 = 53
            goto L54
        L53:
            r4 = r3
        L54:
            com.ironsource.adqualitysdk.sdk.i.ee r6 = r6.f403
            if (r4 == r3) goto L5d
            boolean r6 = r2.equals(r6)
            return r6
        L5d:
            if (r6 != 0) goto L6a
            int r6 = com.ironsource.adqualitysdk.sdk.i.ef.f400
            int r6 = r6 + 65
            int r1 = r6 % 128
            com.ironsource.adqualitysdk.sdk.i.ef.f401 = r1
            int r6 = r6 % 2
            return r0
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ef.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r6 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.ef.f400
            int r0 = r0 + 45
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ef.f401 = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            if (r0 == 0) goto L22
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r6.f404
            r3 = 80
            int r3 = r3 / r2
            if (r0 == 0) goto L1c
            r0 = r1
            goto L1d
        L1c:
            r0 = r2
        L1d:
            if (r0 == r1) goto L26
            goto L2d
        L20:
            r0 = move-exception
            throw r0
        L22:
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r6.f404
            if (r0 == 0) goto L2d
        L26:
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r6.f404
            int r0 = r0.hashCode()
            goto L2e
        L2d:
            r0 = r2
        L2e:
            int r0 = r0 * 31
            com.ironsource.adqualitysdk.sdk.i.ee r3 = r6.f403
            if (r3 == 0) goto L50
            int r4 = com.ironsource.adqualitysdk.sdk.i.ef.f401
            int r4 = r4 + 105
            int r5 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.ef.f400 = r5
            int r4 = r4 % 2
            if (r4 != 0) goto L41
            goto L42
        L41:
            r2 = r1
        L42:
            if (r2 != r1) goto L49
            int r2 = r3.hashCode()
            goto L5a
        L49:
            r3.hashCode()
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L4e
        L4e:
            r0 = move-exception
            throw r0
        L50:
            int r1 = com.ironsource.adqualitysdk.sdk.i.ef.f400
            int r1 = r1 + 43
            int r3 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.ef.f401 = r3
            int r1 = r1 % 2
        L5a:
            int r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ef.hashCode():int");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m771(int[] iArr, int i) {
        String str;
        synchronized (d.ﾇ) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f402.clone();
            d.ﻛ = 0;
            while (d.ﻛ < iArr.length) {
                cArr[0] = (char) (iArr[d.ﻛ] >> 16);
                cArr[1] = (char) iArr[d.ﻛ];
                cArr[2] = (char) (iArr[d.ﻛ + 1] >> 16);
                cArr[3] = (char) iArr[d.ﻛ + 1];
                d.ﾒ = (cArr[0] << 16) + cArr[1];
                d.ｋ = (cArr[2] << 16) + cArr[3];
                d.ﾒ(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = d.ﾒ ^ iArr2[i2];
                    d.ﾒ = i3;
                    d.ｋ = d.ｋ(i3) ^ d.ｋ;
                    int i4 = d.ﾒ;
                    d.ﾒ = d.ｋ;
                    d.ｋ = i4;
                }
                int i5 = d.ﾒ;
                d.ﾒ = d.ｋ;
                d.ｋ = i5;
                d.ｋ = i5 ^ iArr2[16];
                d.ﾒ ^= iArr2[17];
                int i6 = d.ﾒ;
                int i7 = d.ｋ;
                cArr[0] = (char) (d.ﾒ >>> 16);
                cArr[1] = (char) d.ﾒ;
                cArr[2] = (char) (d.ｋ >>> 16);
                cArr[3] = (char) d.ｋ;
                d.ﾒ(iArr2);
                cArr2[d.ﻛ << 1] = cArr[0];
                cArr2[(d.ﻛ << 1) + 1] = cArr[1];
                cArr2[(d.ﻛ << 1) + 2] = cArr[2];
                cArr2[(d.ﻛ << 1) + 3] = cArr[3];
                d.ﻛ += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
