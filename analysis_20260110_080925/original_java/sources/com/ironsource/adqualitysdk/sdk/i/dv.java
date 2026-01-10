package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.view.ViewConfiguration;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class dv extends ee {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f333 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int[] f334 = {1887979786, -1335051371, 661157473, -1453609702, -2060153849, 507214364, 1040902610, -300864089, -1772527112, 1737736699, -1795836688, 1715385225, 2030379516, 612648369, -407088790, -1163277759, 188810067, -620259010};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f335;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private ee[] f336;

    public dv(List<ee> list, dm dmVar) {
        super(dmVar);
        ee[] eeVarArr = new ee[list.size()];
        this.f336 = eeVarArr;
        list.toArray(eeVarArr);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ee
    /* renamed from: ｋ, reason: contains not printable characters */
    public final du mo735(dr drVar, cp cpVar) {
        ArrayList arrayList = new ArrayList();
        ee[] eeVarArr = this.f336;
        int length = eeVarArr.length;
        int i = 0;
        while (true) {
            if ((i < length ? (char) 3 : 'H') == 'H') {
                return new du(arrayList);
            }
            int i2 = f335 + 29;
            f333 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (i2 % 2 == 0) {
                arrayList.add(eeVarArr[i].m769(drVar, cpVar).m728());
                i += 81;
            } else {
                arrayList.add(eeVarArr[i].m769(drVar, cpVar).m728());
                i++;
            }
            int i3 = f333 + 51;
            f335 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i4 = i3 % 2;
        }
    }

    public final String toString() {
        String string = new StringBuilder().append(m734(new int[]{1622603482, 2026269840}, (ViewConfiguration.getLongPressTimeout() >> 16) + 1).intern()).append(m767(this.f336)).append(m734(new int[]{-1123341230, -382096324}, -Process.getGidForName(BuildConfig.FLAVOR)).intern()).toString();
        int i = f333 + 63;
        f335 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i % 2 != 0)) {
            return string;
        }
        int i2 = 68 / 0;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = f335;
        int i2 = i + 19;
        int i3 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f333 = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 109;
            f335 = i5 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i6 = i5 % 2;
            return true;
        }
        if (obj == null) {
            return false;
        }
        int i7 = i + 65;
        f333 = i7 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i8 = i7 % 2;
        if ((getClass() != obj.getClass() ? (char) 3 : (char) 28) != 3) {
            return Arrays.equals(this.f336, ((dv) obj).f336);
        }
        return false;
    }

    public final int hashCode() {
        int i = f335 + 77;
        f333 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        int iHashCode = Arrays.hashCode(this.f336);
        int i3 = f335 + 5;
        f333 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return iHashCode;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m734(int[] iArr, int i) {
        String str;
        synchronized (d.ﾇ) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f334.clone();
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
