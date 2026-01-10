package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import com.ironsource.adqualitysdk.sdk.R;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class fu extends fq {

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f550 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f551 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f552 = 175;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private fq f553;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private ee f554;

    public fu(ee eeVar, fq fqVar) {
        this.f554 = eeVar;
        this.f553 = fqVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fq
    /* renamed from: ｋ */
    public final du mo804(dr drVar, cp cpVar) {
        du duVarMo804;
        do {
            if ((this.f554.m769(drVar, cpVar).m732() ? (char) 28 : '6') != '6') {
                int i = f551 + 85;
                f550 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i2 = i % 2;
                duVarMo804 = this.f553.mo804(drVar, cpVar);
                if (!duVarMo804.m729()) {
                    int i3 = f551 + 111;
                    f550 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                    int i4 = i3 % 2;
                }
            }
            return new du(null);
        } while (!duVarMo804.m731());
        return duVarMo804;
    }

    public final String toString() {
        String string = new StringBuilder().append(m818((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3, TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 8, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 262, "\u0012\u0011 \uffd1\uffc9\u000e\u0015", true).intern()).append(this.f554).append(m818((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, 2 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), KeyEvent.getDeadChar(0, 0) + 211, "\u0005￼", true).intern()).append(this.f553).toString();
        int i = f550 + 83;
        f551 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i % 2 != 0)) {
            return string;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r1.equals(r5.f554) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
    
        if ((r5.f554 != null ? 'Q' : '^') != 'Q') goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        r1 = r4.f553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
    
        if (r1 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0045, code lost:
    
        if (r3 == true) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0049, code lost:
    
        if (r5.f553 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004d, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.i.fu.f551 + 15;
        com.ironsource.adqualitysdk.sdk.i.fu.f550 = r0 % androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        r0 = r0 % 2;
        r5 = r5.f553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0059, code lost:
    
        if (r0 == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005f, code lost:
    
        return r1.equals(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0060, code lost:
    
        r1.equals(r5);
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0064, code lost:
    
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0067, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 36
            if (r4 != r5) goto L6
            r1 = r0
            goto L8
        L6:
            r1 = 44
        L8:
            r2 = 1
            if (r1 == r0) goto L6b
            r0 = 0
            if (r5 == 0) goto L6a
            int r1 = com.ironsource.adqualitysdk.sdk.i.fu.f550
            int r1 = r1 + 27
            int r3 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.fu.f551 = r3
            int r1 = r1 % 2
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r1 == r3) goto L23
            goto L6a
        L23:
            com.ironsource.adqualitysdk.sdk.i.fu r5 = (com.ironsource.adqualitysdk.sdk.i.fu) r5
            com.ironsource.adqualitysdk.sdk.i.ee r1 = r4.f554
            if (r1 == 0) goto L32
            com.ironsource.adqualitysdk.sdk.i.ee r3 = r5.f554
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L3e
            goto L6a
        L32:
            com.ironsource.adqualitysdk.sdk.i.ee r1 = r5.f554
            r3 = 81
            if (r1 == 0) goto L3a
            r1 = r3
            goto L3c
        L3a:
            r1 = 94
        L3c:
            if (r1 == r3) goto L6a
        L3e:
            com.ironsource.adqualitysdk.sdk.i.fq r1 = r4.f553
            if (r1 == 0) goto L44
            r3 = r2
            goto L45
        L44:
            r3 = r0
        L45:
            if (r3 == r2) goto L4d
            com.ironsource.adqualitysdk.sdk.i.fq r5 = r5.f553
            if (r5 != 0) goto L4c
            return r2
        L4c:
            return r0
        L4d:
            int r0 = com.ironsource.adqualitysdk.sdk.i.fu.f551
            int r0 = r0 + 15
            int r2 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.fu.f550 = r2
            int r0 = r0 % 2
            com.ironsource.adqualitysdk.sdk.i.fq r5 = r5.f553
            if (r0 == 0) goto L60
            boolean r5 = r1.equals(r5)
            return r5
        L60:
            r1.equals(r5)
            r5 = 0
            super.hashCode()     // Catch: java.lang.Throwable -> L68
            throw r5     // Catch: java.lang.Throwable -> L68
        L68:
            r5 = move-exception
            throw r5
        L6a:
            return r0
        L6b:
            int r5 = com.ironsource.adqualitysdk.sdk.i.fu.f550
            int r5 = r5 + 51
            int r0 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.fu.f551 = r0
            int r5 = r5 % 2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.fu.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode;
        ee eeVar = this.f554;
        if ((eeVar != null ? 'G' : '\"') != 'G') {
            iHashCode = 0;
        } else {
            int i = f550 + 61;
            f551 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
            iHashCode = eeVar.hashCode();
            int i3 = f550 + R.styleable.AppCompatTheme_windowActionModeOverlay;
            f551 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i4 = i3 % 2;
        }
        int i5 = iHashCode * 31;
        fq fqVar = this.f553;
        return i5 + ((fqVar != null ? (char) 16 : '\b') != '\b' ? fqVar.hashCode() : 0);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m818(int i, int i2, int i3, String str, boolean z) {
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
                cArr2[i4] = (char) (cArr2[i4] - f552);
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
