package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class ed extends eb {

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f386 = 0;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f387 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f388 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f389 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f390 = -1891578488;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private ee[] f391;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private ee f392;

    public ed(ee eeVar, String str, List<ee> list, List<ee> list2, dm dmVar) {
        super(str, list2, dmVar);
        this.f392 = eeVar;
        if (list != null) {
            ee[] eeVarArr = new ee[list.size()];
            this.f391 = eeVarArr;
            list.toArray(eeVarArr);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eb, com.ironsource.adqualitysdk.sdk.i.ee
    /* renamed from: ｋ */
    public final du mo735(dr drVar, cp cpVar) {
        Method methodM944;
        List<Object> list = m758(drVar, cpVar);
        ee eeVar = this.f392;
        if ((eeVar instanceof el) && ((el) eeVar).m786().equals(m765(View.resolveSize(0, 0) + 579516372, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 53322), "퐆誷䨢\ue3d0", "⻚틂慻\u17df垷", "\u0000\u0000\u0000\u0000").intern())) {
            return cpVar.ﾒ().ﻛ().ｋ(m760()).m721(drVar, cpVar, list).m730(false);
        }
        Object objM728 = this.f392.m769(drVar, cpVar).m728();
        if (objM728 instanceof ck) {
            return new du(((ck) objM728).mo418(m760(), list, cpVar.ﱡ()));
        }
        if (objM728 instanceof cl) {
            String str = m760();
            cpVar.ﱡ();
            return new du(((cl) objM728).mo419(cpVar, str, list, drVar));
        }
        if (objM728 instanceof cp) {
            synchronized (objM728) {
                cp cpVar2 = (cp) objM728;
                dt dtVar = cpVar2.ｋ(m760());
                if (dtVar != null) {
                    return dtVar.m721(cpVar2.ﱟ(), cpVar2, list).m730(false);
                }
                cq.m464(cpVar.ﺙ(), new StringBuilder().append(m765(Color.blue(0) + 270451464, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), "ࢧểȐ쯐", "孱㻼參␄컕ﺴ爯ﲗ弽₅쇭㆛\ue256㧖\ue581膲譮譨༮㶠컞몛挎", "\u0000\u0000\u0000\u0000").intern()).append(m760()).toString(), new NoSuchMethodException());
            }
        }
        try {
            ee[] eeVarArr = this.f391;
            if (eeVarArr != null) {
                methodM944 = jz.m940(objM728, m760(), m763(eeVarArr, drVar, cpVar));
            } else {
                methodM944 = jz.m944(objM728, m760(), list);
            }
            if (methodM944 == null) {
                list.add(0, objM728);
                de deVar = cpVar.ﮐ();
                String str2 = m760();
                cpVar.ﱡ();
                return new du(deVar.mo419(cpVar, str2, list, drVar));
            }
            return new du(methodM944.invoke(objM728, list.toArray()));
        } catch (IllegalAccessException e) {
            cq.m464(cpVar.ﺙ(), new StringBuilder().append(m765(270451464 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "ࢧểȐ쯐", "孱㻼參␄컕ﺴ爯ﲗ弽₅쇭㆛\ue256㧖\ue581膲譮譨༮㶠컞몛挎", "\u0000\u0000\u0000\u0000").intern()).append(this).toString(), e);
            return null;
        } catch (IllegalArgumentException e2) {
            cq.m464(cpVar.ﺙ(), new StringBuilder().append(m765(270451464 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR), (char) KeyEvent.getDeadChar(0, 0), "ࢧểȐ쯐", "孱㻼參␄컕ﺴ爯ﲗ弽₅쇭㆛\ue256㧖\ue581膲譮譨༮㶠컞몛挎", "\u0000\u0000\u0000\u0000").intern()).append(this).toString(), e2);
            return null;
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static List<Class> m763(ee[] eeVarArr, dr drVar, cp cpVar) {
        ArrayList arrayList = new ArrayList();
        int length = eeVarArr.length;
        int i = 0;
        while (true) {
            if (!(i < length)) {
                break;
            }
            int i2 = f387 + 41;
            f386 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i3 = i2 % 2;
            arrayList.add((Class) eeVarArr[i].m769(drVar, cpVar).m728());
            i++;
            int i4 = f387 + 111;
            f386 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i5 = i4 % 2;
        }
        int i6 = f386 + 29;
        f387 = i6 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i6 % 2 == 0 ? (char) 30 : 'W') == 'W') {
            return arrayList;
        }
        int i7 = 75 / 0;
        return arrayList;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eb
    public final String toString() {
        int i = f386 + 31;
        f387 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String strMo761 = mo761(m759());
        int i3 = f386 + 71;
        f387 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return strMo761;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eb
    /* renamed from: ｋ */
    final String mo761(Object[] objArr) {
        String string = new StringBuilder().append(this.f392).append(m765(ImageFormat.getBitsPerPixel(0) + 464346693, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 36009), "䒙굞ꤛ첌", "敳", "\u0000\u0000\u0000\u0000").intern()).append(m760()).append(m764()).append(m765(Color.blue(0) - 957114864, (char) (48544 - ExpandableListView.getPackedPositionType(0L)), "ဧ\uf396ꃆ溽", "䗴", "\u0000\u0000\u0000\u0000").intern()).append(m767(objArr)).append(m765((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 360654155, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 62094), "䬶缥踕磲", "\uf1b2", "\u0000\u0000\u0000\u0000").intern()).toString();
        int i = f386 + 103;
        f387 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 == 0 ? '0' : (char) 1) == 1) {
            return string;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String m764() {
        if (this.f391 == null) {
            int i = f387 + 49;
            f386 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
            return BuildConfig.FLAVOR;
        }
        String string = new StringBuilder().append(m765(View.MeasureSpec.getMode(0) - 112945020, (char) (22203 - AndroidCharacter.getMirror('0')), "萟䒘诹\ue056", "ⴉ", "\u0000\u0000\u0000\u0000").intern()).append(m767(this.f391)).append(m765((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 682783218, (char) (20749 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), "ྏ䶎\u0cd7ꙑ", "ਞ", "\u0000\u0000\u0000\u0000").intern()).toString();
        int i3 = f386 + 31;
        f387 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return string;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eb
    public final boolean equals(Object obj) {
        if (this == obj) {
            int i = f386 + 77;
            f387 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
            return true;
        }
        if (obj != null) {
            if ((getClass() != obj.getClass() ? (char) 17 : ';') != 17) {
                if ((!super.equals(obj) ? '[' : '^') != '^') {
                    return false;
                }
                ed edVar = (ed) obj;
                ee eeVar = this.f392;
                if (!(eeVar == null) ? eeVar.equals(edVar.f392) : edVar.f392 == null) {
                    return false;
                }
                ee[] eeVarArr = this.f391;
                if ((eeVarArr != null ? (char) 2 : (char) 6) != 2) {
                    return edVar.f391 == null;
                }
                int i3 = f387 + 17;
                f386 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i4 = i3 % 2;
                ee[] eeVarArr2 = edVar.f391;
                if (i4 == 0) {
                    return eeVarArr.equals(eeVarArr2);
                }
                int i5 = 26 / 0;
                return eeVarArr.equals(eeVarArr2);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035 A[PHI: r0
      0x0035: PHI (r0v12 int) = (r0v6 int), (r0v17 int) binds: [B:17:0x0033, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054 A[PHI: r0
      0x0054: PHI (r0v7 int) = (r0v6 int), (r0v17 int) binds: [B:17:0x0033, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ironsource.adqualitysdk.sdk.i.eb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r5 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.ed.f386
            int r0 = r0 + 55
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ed.f387 = r1
            int r0 = r0 % 2
            r1 = 33
            if (r0 != 0) goto L10
            r0 = r1
            goto L12
        L10:
            r0 = 86
        L12:
            r2 = 46
            r3 = 0
            if (r0 == r1) goto L27
            int r0 = super.hashCode()
            int r0 = r0 * 31
            com.ironsource.adqualitysdk.sdk.i.ee r1 = r5.f392
            r4 = 92
            if (r1 == 0) goto L24
            r2 = r4
        L24:
            if (r2 == r4) goto L35
            goto L54
        L27:
            int r0 = super.hashCode()
            int r0 = r0 - r2
            com.ironsource.adqualitysdk.sdk.i.ee r1 = r5.f392
            if (r1 == 0) goto L32
            r1 = 1
            goto L33
        L32:
            r1 = r3
        L33:
            if (r1 == 0) goto L54
        L35:
            int r1 = com.ironsource.adqualitysdk.sdk.i.ed.f387
            int r1 = r1 + 125
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.ed.f386 = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L48
            com.ironsource.adqualitysdk.sdk.i.ee r1 = r5.f392
            int r1 = r1.hashCode()
            goto L55
        L48:
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r5.f392
            r0.hashCode()
            r0 = 0
            super.hashCode()     // Catch: java.lang.Throwable -> L52
            throw r0     // Catch: java.lang.Throwable -> L52
        L52:
            r0 = move-exception
            throw r0
        L54:
            r1 = r3
        L55:
            int r0 = r0 + r1
            int r0 = r0 * 31
            com.ironsource.adqualitysdk.sdk.i.ee[] r1 = r5.f391
            if (r1 == 0) goto L60
            int r3 = r1.hashCode()
        L60:
            int r0 = r0 + r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ed.hashCode():int");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m765(int i, char c, String str, String str2, String str3) {
        String str4;
        char[] charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = charArray;
        char[] charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = charArray2;
        char[] charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = charArray3;
        synchronized (j.ﾒ) {
            char[] cArr4 = (char[]) cArr3.clone();
            char[] cArr5 = (char[]) cArr.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr2.length;
            char[] cArr6 = new char[length];
            j.ﻐ = 0;
            while (j.ﻐ < length) {
                int i2 = (j.ﻐ + 2) % 4;
                int i3 = (j.ﻐ + 3) % 4;
                j.ｋ = (char) (((cArr4[j.ﻐ % 4] * 32718) + cArr5[i2]) % 65535);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                cArr4[i3] = j.ｋ;
                cArr6[j.ﻐ] = (char) ((((cArr4[i3] ^ cArr2[j.ﻐ]) ^ f389) ^ f390) ^ f388);
                j.ﻐ++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
