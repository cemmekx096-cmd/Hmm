package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import com.ironsource.adqualitysdk.sdk.R;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class fp extends fq {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f520 = -157868112;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static byte[] f521 = {-31, -102, 76, -113, -34, -34, -34, -31, -69, -48, -48};

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f522 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f523 = 0;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static short[] f524 = null;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f525 = -523179864;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f526 = 35;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private fq f527;

    /* renamed from: ｋ, reason: contains not printable characters */
    private fq f528;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private ee f529;

    public fp(ee eeVar, fq fqVar, fq fqVar2) {
        this.f529 = eeVar;
        this.f528 = fqVar;
        this.f527 = fqVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if ((r3.f529.m769(r4, r5).m732() ? 6 : 23) != 23) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        return r3.f528.mo804(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        r0 = r3.f527;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r0 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        return r0.mo804(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        r4 = new com.ironsource.adqualitysdk.sdk.i.du(java.lang.Boolean.FALSE);
        r5 = com.ironsource.adqualitysdk.sdk.i.fp.f523 + 89;
        com.ironsource.adqualitysdk.sdk.i.fp.f522 = r5 % androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r3.f529.m769(r4, r5).m732() != false) goto L17;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.fq
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ironsource.adqualitysdk.sdk.i.du mo804(com.ironsource.adqualitysdk.sdk.i.dr r4, com.ironsource.adqualitysdk.sdk.i.cp r5) {
        /*
            r3 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.fp.f522
            int r0 = r0 + 19
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.fp.f523 = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto Lf
            r0 = r1
            goto L10
        Lf:
            r0 = 1
        L10:
            if (r0 == 0) goto L1f
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r3.f529
            com.ironsource.adqualitysdk.sdk.i.du r0 = r0.m769(r4, r5)
            boolean r0 = r0.m732()
            if (r0 == 0) goto L3c
            goto L35
        L1f:
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r3.f529
            com.ironsource.adqualitysdk.sdk.i.du r0 = r0.m769(r4, r5)
            boolean r0 = r0.m732()
            r2 = 34
            int r2 = r2 / r1
            r1 = 23
            if (r0 == 0) goto L32
            r0 = 6
            goto L33
        L32:
            r0 = r1
        L33:
            if (r0 == r1) goto L3c
        L35:
            com.ironsource.adqualitysdk.sdk.i.fq r0 = r3.f528
            com.ironsource.adqualitysdk.sdk.i.du r4 = r0.mo804(r4, r5)
            return r4
        L3c:
            com.ironsource.adqualitysdk.sdk.i.fq r0 = r3.f527
            if (r0 == 0) goto L45
            com.ironsource.adqualitysdk.sdk.i.du r4 = r0.mo804(r4, r5)
            return r4
        L45:
            com.ironsource.adqualitysdk.sdk.i.du r4 = new com.ironsource.adqualitysdk.sdk.i.du
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r4.<init>(r5)
            int r5 = com.ironsource.adqualitysdk.sdk.i.fp.f523
            int r5 = r5 + 89
            int r0 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.fp.f522 = r0
            int r5 = r5 % 2
            return r4
        L57:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.fp.mo804(com.ironsource.adqualitysdk.sdk.i.dr, com.ironsource.adqualitysdk.sdk.i.cp):com.ironsource.adqualitysdk.sdk.i.du");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m812((byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (short) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 109), ((Process.getThreadPriority(0) + 20) >> 6) - 36, 523179864 - (ViewConfiguration.getScrollBarSize() >> 8), 157868217 - KeyEvent.normalizeMetaState(0)).intern());
        sb.append(this.f529);
        sb.append(m812((byte) View.MeasureSpec.getMode(0), (short) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 16), (-36) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 523179869, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 157868152).intern());
        if (this.f528 instanceof fk) {
            sb.append(m812((byte) (ViewConfiguration.getScrollBarSize() >> 8), (short) ((Process.myPid() >> 22) - 57), (-35) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 523179870, 157868143 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0)).intern());
            int i = f522 + R.styleable.AppCompatTheme_windowMinWidthMinor;
            f523 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
        } else {
            sb.append(m812((byte) (ViewConfiguration.getTouchSlop() >> 8), (short) ((ViewConfiguration.getTouchSlop() >> 8) - 29), View.resolveSizeAndState(0, 0, 0) - 36, TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 523179870, 157868122 - View.resolveSizeAndState(0, 0, 0)).intern());
        }
        sb.append(this.f528);
        fq fqVar = this.f527;
        if (fqVar != null) {
            int i3 = f523;
            int i4 = i3 + R.styleable.AppCompatTheme_windowActionBar;
            f522 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (i4 % 2 == 0) {
                boolean z = fqVar instanceof fk;
                throw null;
            }
            if ((fqVar instanceof fk ? 'Y' : 'N') != 'Y') {
                sb.append(m812((byte) KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), (short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 30), (-16777252) - Color.rgb(0, 0, 0), 523179870 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), 157868122 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern());
            } else {
                int i5 = i3 + 93;
                f522 = i5 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i6 = i5 % 2;
                sb.append(m812((byte) TextUtils.getTrimmedLength(BuildConfig.FLAVOR), (short) (ExpandableListView.getPackedPositionChild(0L) - 56), (-36) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 523179869 - (ViewConfiguration.getJumpTapTimeout() >> 16), 157868144 - KeyEvent.normalizeMetaState(0)).intern());
            }
            sb.append(m812((byte) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 1), (short) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 55), (-35) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 523179871 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), 157868212 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0)).intern());
            if (this.f527 instanceof fk) {
                sb.append(m812((byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (short) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) - 57), (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 36, 523179869 - View.getDefaultSize(0, 0), 157868144 - View.combineMeasuredStates(0, 0)).intern());
            } else {
                sb.append(m812((byte) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (short) ((-29) - (ViewConfiguration.getWindowTouchSlop() >> 8)), Color.blue(0) - 36, 523179871 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 157868122).intern());
            }
            sb.append(this.f527);
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (r0.equals(r6.f529) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if ((r6.f529 != null) != true) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        r0 = r5.f528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        r4 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        r4 = 'T';
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
    
        if (r4 == 'T') goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
    
        if (r0.equals(r6.f528) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
    
        if (r6.f528 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0065, code lost:
    
        r0 = r5.f527;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0067, code lost:
    
        if (r0 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0069, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.i.fp.f523 + 55;
        com.ironsource.adqualitysdk.sdk.i.fp.f522 = r1 % androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0079, code lost:
    
        return r0.equals(r6.f527);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007c, code lost:
    
        if (r6.f527 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0080, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0081, code lost:
    
        if (r6 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0083, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0084, code lost:
    
        r6 = com.ironsource.adqualitysdk.sdk.i.fp.f523 + 39;
        com.ironsource.adqualitysdk.sdk.i.fp.f522 = r6 % androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_PRIMARY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008e, code lost:
    
        if ((r6 % 2) != 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0090, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0091, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.fp.f522
            int r1 = r0 + 121
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.fp.f523 = r2
            int r1 = r1 % 2
            r1 = 1
            if (r5 != r6) goto L16
            int r0 = r0 + 33
            int r6 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.fp.f523 = r6
            int r0 = r0 % 2
            return r1
        L16:
            r2 = 0
            if (r6 == 0) goto L92
            int r0 = r0 + 37
            int r3 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.fp.f523 = r3
            int r0 = r0 % 2
            java.lang.Class r0 = r5.getClass()
            java.lang.Class r3 = r6.getClass()
            r4 = 73
            if (r0 == r3) goto L2f
            r0 = r4
            goto L31
        L2f:
            r0 = 31
        L31:
            if (r0 == r4) goto L92
            com.ironsource.adqualitysdk.sdk.i.fp r6 = (com.ironsource.adqualitysdk.sdk.i.fp) r6
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r5.f529
            if (r0 == 0) goto L42
            com.ironsource.adqualitysdk.sdk.i.ee r3 = r6.f529
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L4b
            goto L92
        L42:
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r6.f529
            if (r0 == 0) goto L48
            r0 = r1
            goto L49
        L48:
            r0 = r2
        L49:
            if (r0 == r1) goto L92
        L4b:
            com.ironsource.adqualitysdk.sdk.i.fq r0 = r5.f528
            r3 = 84
            if (r0 == 0) goto L54
            r4 = 8
            goto L55
        L54:
            r4 = r3
        L55:
            if (r4 == r3) goto L60
            com.ironsource.adqualitysdk.sdk.i.fq r3 = r6.f528
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L65
            goto L64
        L60:
            com.ironsource.adqualitysdk.sdk.i.fq r0 = r6.f528
            if (r0 == 0) goto L65
        L64:
            return r2
        L65:
            com.ironsource.adqualitysdk.sdk.i.fq r0 = r5.f527
            if (r0 == 0) goto L7a
            int r1 = com.ironsource.adqualitysdk.sdk.i.fp.f523
            int r1 = r1 + 55
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.fp.f522 = r2
            int r1 = r1 % 2
            com.ironsource.adqualitysdk.sdk.i.fq r6 = r6.f527
            boolean r6 = r0.equals(r6)
            return r6
        L7a:
            com.ironsource.adqualitysdk.sdk.i.fq r6 = r6.f527
            if (r6 != 0) goto L80
            r6 = r2
            goto L81
        L80:
            r6 = r1
        L81:
            if (r6 == 0) goto L84
            return r2
        L84:
            int r6 = com.ironsource.adqualitysdk.sdk.i.fp.f523
            int r6 = r6 + 39
            int r0 = r6 % 128
            com.ironsource.adqualitysdk.sdk.i.fp.f522 = r0
            int r6 = r6 % 2
            if (r6 != 0) goto L91
            return r2
        L91:
            return r1
        L92:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.fp.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        ee eeVar = this.f529;
        int iHashCode2 = 0;
        if (eeVar != null) {
            int i2 = f523 + 5;
            f522 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i3 = i2 % 2;
            iHashCode = eeVar.hashCode();
            int i4 = f523 + 51;
            f522 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i5 = i4 % 2;
        } else {
            iHashCode = 0;
        }
        int i6 = iHashCode * 31;
        fq fqVar = this.f528;
        int iHashCode3 = (i6 + ((fqVar != null ? 'H' : '\r') != '\r' ? fqVar.hashCode() : 0)) * 31;
        fq fqVar2 = this.f527;
        if (fqVar2 == null) {
            i = f522 + 89;
        } else {
            int i7 = f522 + 85;
            f523 = i7 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i8 = i7 % 2;
            iHashCode2 = fqVar2.hashCode();
            i = f522 + 53;
        }
        f523 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i9 = i % 2;
        return iHashCode3 + iHashCode2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m812(byte b, short s, int i, int i2, int i3) {
        String string;
        synchronized (k.ﮐ) {
            StringBuilder sb = new StringBuilder();
            int i4 = f526;
            int i5 = i + i4;
            boolean z = i5 == -1;
            if (z) {
                byte[] bArr = f521;
                if (bArr != null) {
                    i5 = (byte) (bArr[f525 + i2] + i4);
                } else {
                    i5 = (short) (f524[f525 + i2] + i4);
                }
            }
            if (i5 > 0) {
                k.ｋ = ((i2 + i5) - 2) + f525 + (z ? 1 : 0);
                k.ﻐ = b;
                k.ﾇ = (char) (i3 + f520);
                sb.append(k.ﾇ);
                k.ﻛ = k.ﾇ;
                k.ﾒ = 1;
                while (k.ﾒ < i5) {
                    byte[] bArr2 = f521;
                    if (bArr2 != null) {
                        int i6 = k.ｋ;
                        k.ｋ = i6 - 1;
                        k.ﾇ = (char) (k.ﻛ + (((byte) (bArr2[i6] + s)) ^ k.ﻐ));
                    } else {
                        short[] sArr = f524;
                        int i7 = k.ｋ;
                        k.ｋ = i7 - 1;
                        k.ﾇ = (char) (k.ﻛ + (((short) (sArr[i7] + s)) ^ k.ﻐ));
                    }
                    sb.append(k.ﾇ);
                    k.ﻛ = k.ﾇ;
                    k.ﾒ++;
                }
            }
            string = sb.toString();
        }
        return string;
    }
}
