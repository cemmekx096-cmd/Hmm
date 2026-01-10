package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.media3.exoplayer.RendererCapabilities;
import com.ironsource.adqualitysdk.sdk.R;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class ea extends ee {

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f368 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f369 = -4155701035263706019L;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f370 = {'.'};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f371;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private ee f372;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String f373;

    public ea(ee eeVar, String str, dm dmVar) {
        super(dmVar);
        this.f372 = eeVar;
        this.f373 = str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ee
    /* renamed from: ｋ */
    public final du mo735(dr drVar, cp cpVar) {
        int i = f368 + 39;
        f371 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i % 2 != 0)) {
            Object objM728 = this.f372.m769(drVar, cpVar).m728();
            if (objM728 instanceof cp) {
                return new du(((cp) objM728).ｋ(this.f373));
            }
            try {
                du duVar = new du(objM728.getClass().getDeclaredField(this.f373).get(objM728));
                int i2 = f368 + 67;
                f371 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                if ((i2 % 2 != 0 ? '0' : 'V') == 'V') {
                    return duVar;
                }
                throw null;
            } catch (Exception unused) {
                return new du(null);
            }
        }
        boolean z = this.f372.m769(drVar, cpVar).m728() instanceof cp;
        throw null;
    }

    public final String toString() {
        String string = new StringBuilder().append(this.f372.toString()).append(m756((ViewConfiguration.getScrollBarSize() >> 8) + 1, View.MeasureSpec.makeMeasureSpec(0, 0), (char) KeyEvent.normalizeMetaState(0)).intern()).append(this.f373).toString();
        int i = f371 + 105;
        f368 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 == 0 ? '&' : 'H') == 'H') {
            return string;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r0.equals(r6.f372) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        if (r6.f372 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        r0 = r5.f373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
    
        if (r0 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        r4 = 'Y';
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        r4 = '2';
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
    
        r6 = r6.f373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r4 == 'Y') goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        if (r6 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
    
        r6 = com.ironsource.adqualitysdk.sdk.i.ea.f368 + 19;
        com.ironsource.adqualitysdk.sdk.i.ea.f371 = r6 % androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:
    
        return r0.equals(r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 33
            if (r5 != r6) goto L7
            r1 = 88
            goto L8
        L7:
            r1 = r0
        L8:
            r2 = 1
            r3 = 0
            if (r1 == r0) goto L1a
            int r6 = com.ironsource.adqualitysdk.sdk.i.ea.f368
            int r6 = r6 + 27
            int r0 = r6 % 128
            com.ironsource.adqualitysdk.sdk.i.ea.f371 = r0
            int r6 = r6 % 2
            if (r6 == 0) goto L19
            return r3
        L19:
            return r2
        L1a:
            if (r6 == 0) goto L79
            int r0 = com.ironsource.adqualitysdk.sdk.i.ea.f371
            int r0 = r0 + 5
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ea.f368 = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L72
            java.lang.Class r0 = r5.getClass()
            java.lang.Class r1 = r6.getClass()
            if (r0 == r1) goto L33
            goto L79
        L33:
            com.ironsource.adqualitysdk.sdk.i.ea r6 = (com.ironsource.adqualitysdk.sdk.i.ea) r6
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r5.f372
            if (r0 == 0) goto L4c
            int r1 = com.ironsource.adqualitysdk.sdk.i.ea.f368
            int r1 = r1 + 35
            int r4 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.ea.f371 = r4
            int r1 = r1 % 2
            com.ironsource.adqualitysdk.sdk.i.ee r1 = r6.f372
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L51
            goto L50
        L4c:
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r6.f372
            if (r0 == 0) goto L51
        L50:
            return r3
        L51:
            java.lang.String r0 = r5.f373
            r1 = 89
            if (r0 == 0) goto L59
            r4 = r1
            goto L5b
        L59:
            r4 = 50
        L5b:
            java.lang.String r6 = r6.f373
            if (r4 == r1) goto L6d
            if (r6 != 0) goto L6c
            int r6 = com.ironsource.adqualitysdk.sdk.i.ea.f368
            int r6 = r6 + 19
            int r0 = r6 % 128
            com.ironsource.adqualitysdk.sdk.i.ea.f371 = r0
            int r6 = r6 % 2
            return r2
        L6c:
            return r3
        L6d:
            boolean r6 = r0.equals(r6)
            return r6
        L72:
            r6.getClass()
            r6 = 0
            throw r6     // Catch: java.lang.Throwable -> L77
        L77:
            r6 = move-exception
            throw r6
        L79:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ea.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode;
        ee eeVar = this.f372;
        int iHashCode2 = 0;
        if (eeVar == null) {
            iHashCode = 0;
        } else {
            int i = f368 + 51;
            f371 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
            iHashCode = eeVar.hashCode();
        }
        int i3 = iHashCode * 31;
        String str = this.f373;
        if (str != null) {
            int i4 = f371 + R.styleable.AppCompatTheme_windowActionModeOverlay;
            f368 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (i4 % 2 == 0) {
                str.hashCode();
                throw null;
            }
            iHashCode2 = str.hashCode();
        } else {
            int i5 = f368 + R.styleable.AppCompatTheme_windowMinWidthMinor;
            f371 = i5 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i6 = i5 % 2;
        }
        return i3 + iHashCode2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m756(int i, int i2, char c) {
        String str;
        synchronized (a.ﻛ) {
            char[] cArr = new char[i];
            a.ｋ = 0;
            while (a.ｋ < i) {
                cArr[a.ｋ] = (char) ((f370[a.ｋ + i2] ^ (a.ｋ * f369)) ^ c);
                a.ｋ++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
