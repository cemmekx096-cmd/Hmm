package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import com.ironsource.adqualitysdk.sdk.R;
import io.ktor.util.date.GMTDateParser;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class dq {

    /* renamed from: 爫, reason: contains not printable characters */
    private static int f290 = 1;

    /* renamed from: ﬤ, reason: contains not printable characters */
    private static char f291;

    /* renamed from: טּ, reason: contains not printable characters */
    private static int f292;

    /* renamed from: סּ, reason: contains not printable characters */
    private static char f293;

    /* renamed from: ףּ, reason: contains not printable characters */
    private static char f294;

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static char f295;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static short[] f296;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static byte[] f297;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f298;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static int f299;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f300;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static final Pattern f301;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static final Pattern f302;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static final List<String> f303;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static final Pattern f304;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static final Pattern f305;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static final Pattern f306;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static final Pattern f307;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static final Pattern f308;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static final Pattern f309;

    /* renamed from: ﾇ, reason: contains not printable characters */
    static void m709() {
        f300 = -1779841669;
        f299 = R.styleable.AppCompatTheme_tooltipForegroundColor;
        f298 = -1185008034;
        f297 = new byte[]{-90, 122, -49, -45, -125, -39, -24, 43, -5, 26, -23, -64, 57, -6, -49, 89, -38, 16, -24, -24, 43, -36, 57, -6, -49, 89, -38, 16, -23, 14, -72, -48, -33, 7, -81, 2, -93, 14, -72, -48, -33, 7, -33, -3, 19, 59, -20, 4, -20, -47, -29, 68, -40, 4, 35, 3, 28, -2, 30, 10, 58, -35, 76, 39, -4, 61, 22, -100, 29, -41, 79, 79, 10, 27, -4, 61, 22, -100, 29, -41, 76, -100, 84, 104, 118, 11, 11, 77, -38, 74, 21, 20, 104, 102, 26, -59, -99, -113, -58, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        f293 = (char) 7150;
        f291 = (char) 7725;
        f294 = (char) 38058;
        f295 = (char) 27504;
    }

    static {
        m709();
        f309 = Pattern.compile(m708((byte) (23 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (short) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 89, Color.alpha(0) + 1779841674, 1185008128 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern());
        f305 = Pattern.compile(m706("⼋㵿䮺嘪쓁㖧㘍온ᵶ鵞⼋㵿ꥺ픯ߡ戮", 15 - Process.getGidForName(BuildConfig.FLAVOR)).intern());
        f306 = Pattern.compile(m706("ۛ霍䮺嘪쓁㖧뀥ऻᵶ鵞ۛ霍ꥺ픯财\u0f6e", (ViewConfiguration.getScrollBarSize() >> 8) + 16).intern());
        f308 = Pattern.compile(m708((byte) ((-5) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (short) (39 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR)), View.resolveSizeAndState(0, 0, 0) - 99, 1779841697 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1185008128).intern());
        f307 = Pattern.compile(m708((byte) (View.resolveSizeAndState(0, 0, 0) + 32), (short) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 15), 65477 - AndroidCharacter.getMirror('0'), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1779841712, 1185008127 - Process.getGidForName(BuildConfig.FLAVOR)).intern());
        f301 = Pattern.compile(m708((byte) (MotionEvent.axisFromString(BuildConfig.FLAVOR) - 62), (short) ((-16) - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (-81) - Gravity.getAbsoluteGravity(0, 0), 1779841717 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'), 1185008129 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern());
        f302 = Pattern.compile(m708((byte) ((-120) - ExpandableListView.getPackedPositionType(0L)), (short) ((-20) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (-111) - (ViewConfiguration.getJumpTapTimeout() >> 16), 1779841750 - View.MeasureSpec.getMode(0), 1185008128 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
        f304 = Pattern.compile(m706("થᤸ\ue26d㎦平Ĳ", 5 - (KeyEvent.getMaxKeyCode() >> 16)).intern());
        f303 = Arrays.asList(m708((byte) (63 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0')), (short) (85 - (ViewConfiguration.getJumpTapTimeout() >> 16)), KeyEvent.getDeadChar(0, 0) - 112, (ViewConfiguration.getLongPressTimeout() >> 16) + 1779841752, (ViewConfiguration.getFadingEdgeLength() >> 16) + 1185008139).intern(), m708((byte) ((-62) - View.MeasureSpec.getSize(0)), (short) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) - 70), (ViewConfiguration.getPressedStateDuration() >> 16) - 110, (KeyEvent.getMaxKeyCode() >> 16) + 1779841753, 1185008135 - Color.red(0)).intern(), m708((byte) ((-75) - KeyEvent.getDeadChar(0, 0)), (short) (104 - View.resolveSize(0, 0)), (-110) - Color.blue(0), 1779841756 - View.resolveSizeAndState(0, 0, 0), 1185008144 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), m708((byte) (40 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0')), (short) ((Process.myPid() >> 22) - 64), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 108, View.MeasureSpec.getMode(0) + 1779841759, 1185008148 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), m708((byte) (Gravity.getAbsoluteGravity(0, 0) + 26), (short) (TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 82), ExpandableListView.getPackedPositionType(0L) - 109, 1779841765 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1185008148 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), m706("ຍᧀㄚ糭", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3).intern(), m706("﨣벷礠꧟㿀\uf640", 4 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0')).intern());
        int i = f290 + 39;
        f292 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 != 0 ? 'W' : '/') != 'W') {
        } else {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x03a7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0364 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0126 A[PHI: r8 r10
      0x0126: PHI (r8v37 com.ironsource.adqualitysdk.sdk.i.dy$e) = (r8v36 com.ironsource.adqualitysdk.sdk.i.dy$e), (r8v62 com.ironsource.adqualitysdk.sdk.i.dy$e) binds: [B:34:0x0080, B:39:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x0126: PHI (r10v10 java.lang.String) = (r10v9 java.lang.String), (r10v22 java.lang.String) binds: [B:34:0x0080, B:39:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<com.ironsource.adqualitysdk.sdk.i.dy> m707(java.lang.String r21, java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 1052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dq.m707(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m710(String str) {
        int i = f292 + 35;
        f290 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strSubstring = str.substring(1, str.length() - 1);
        int i3 = f292 + R.styleable.AppCompatTheme_windowActionModeOverlay;
        f290 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i3 % 2 == 0 ? 'I' : GMTDateParser.ANY) != 'I') {
            return strSubstring;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m711(Pattern pattern, String str) {
        int i = f290 + 95;
        f292 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        String strSubstring = str.substring(matcher.start(), matcher.end());
        int i3 = f292 + 35;
        f290 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return strSubstring;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m708(byte b, short s, int i, int i2, int i3) {
        String string;
        synchronized (k.ﮐ) {
            StringBuilder sb = new StringBuilder();
            int i4 = f299;
            int i5 = i + i4;
            boolean z = i5 == -1;
            if (z) {
                byte[] bArr = f297;
                if (bArr != null) {
                    i5 = (byte) (bArr[f300 + i2] + i4);
                } else {
                    i5 = (short) (f296[f300 + i2] + i4);
                }
            }
            if (i5 > 0) {
                k.ｋ = ((i2 + i5) - 2) + f300 + (z ? 1 : 0);
                k.ﻐ = b;
                k.ﾇ = (char) (i3 + f298);
                sb.append(k.ﾇ);
                k.ﻛ = k.ﾇ;
                k.ﾒ = 1;
                while (k.ﾒ < i5) {
                    byte[] bArr2 = f297;
                    if (bArr2 != null) {
                        int i6 = k.ｋ;
                        k.ｋ = i6 - 1;
                        k.ﾇ = (char) (k.ﻛ + (((byte) (bArr2[i6] + s)) ^ k.ﻐ));
                    } else {
                        short[] sArr = f296;
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

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m706(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (m.ﾒ) {
            char[] cArr2 = new char[cArr.length];
            m.ﾇ = 0;
            char[] cArr3 = new char[2];
            while (m.ﾇ < cArr.length) {
                cArr3[0] = cArr[m.ﾇ];
                cArr3[1] = cArr[m.ﾇ + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr3[1];
                    char c2 = cArr3[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f293)) ^ ((c2 >>> 5) + f294)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f291) ^ ((c3 + i2) ^ ((c3 << 4) + f295))));
                    i2 -= 40503;
                }
                cArr2[m.ﾇ] = cArr3[0];
                cArr2[m.ﾇ + 1] = cArr3[1];
                m.ﾇ += 2;
            }
            str2 = new String(cArr2, 0, i);
        }
        return str2;
    }
}
