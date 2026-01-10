package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import com.ironsource.adqualitysdk.sdk.R;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class eg extends ej {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f405 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f406 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int[] f407 = {-405170401, 90346153, -500461674, -1283309533, -2011764121, -1886511268, 536288967, -1998981079, -1265893219, -1573804769, -1515868198, -168166575, 117959913, -968067837, 393849155, 669992311, -1830006624, 45022515};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private ee f408;

    public eg(ee eeVar, ee eeVar2, ee eeVar3, dm dmVar) {
        super(eeVar, eeVar2, dmVar);
        this.f408 = eeVar3;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ee
    /* renamed from: ｋ */
    public final du mo735(dr drVar, cp cpVar) throws JSONException {
        int i = f405 + R.styleable.AppCompatTheme_tooltipFrameBackground;
        f406 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        du duVarM769 = m780().m769(drVar, cpVar);
        du duVarM7692 = m776().m769(drVar, cpVar);
        try {
            Object objM728 = m781().m769(drVar, cpVar).m728();
            if ((objM728 instanceof JSONObject ? 'E' : '_') != '_') {
                ((JSONObject) objM728).put((String) duVarM769.m728(), duVarM7692.m728());
            } else {
                if (objM728 instanceof JSONArray) {
                    ((JSONArray) objM728).put(duVarM769.m733().intValue(), duVarM7692.m728());
                } else {
                    Object obj = null;
                    if (objM728 instanceof Map) {
                        int i3 = f406 + 53;
                        f405 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                        if (i3 % 2 != 0) {
                            ((Map) objM728).put(duVarM769.m728(), duVarM7692.m728());
                            super.hashCode();
                            throw null;
                        }
                        ((Map) objM728).put(duVarM769.m728(), duVarM7692.m728());
                    } else {
                        if (objM728 instanceof List) {
                            ((List) objM728).set(duVarM769.m733().intValue(), duVarM7692.m728());
                        } else if (objM728.getClass().isArray()) {
                            ((Object[]) objM728)[duVarM769.m733().intValue()] = duVarM7692.m728();
                            int i4 = f406 + R.styleable.AppCompatTheme_windowFixedWidthMinor;
                            f405 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                            int i5 = i4 % 2;
                        } else {
                            cq.m464(cpVar.ﺙ(), new StringBuilder().append(m775(new int[]{-1663869227, -10748094, -484951422, -2076391795, 399102204, -7247341, 2146948538, -622712800, -418522293, -1931587187, -1694235183, -806785779, 1778035557, -729110223, 835476238, -1688099229, -136523524, -241334155, 1564979787, 1844983954, -733406461, 1853471376}, 41 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0)).intern()).append(this).append(m768()).append(m775(new int[]{386129766, 245734933, 1167976963, 2015217694, 1530180641, -520103584, 1063949491, -936832285, 1453749157, 1084501516, 1072069617, -305005421, 269882778, 2065630678, -1817936495, -1752843798, 1637611197, 313505183, -613815350, -1358209972, -1412307754, 700152628}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 41).intern()).append(objM728).toString(), null);
                        }
                    }
                }
            }
        } catch (Exception e) {
            cq.m464(cpVar.ﺙ(), new StringBuilder().append(m775(new int[]{-1663869227, -10748094, -484951422, -2076391795, 399102204, -7247341, 2146948538, -622712800, -418522293, -1931587187, -1694235183, -806785779, 1778035557, -729110223, 835476238, -1688099229, -136523524, -241334155, 1564979787, 1844983954, -733406461, 1853471376}, TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 42).intern()).append(this).append(m768()).toString(), e);
        }
        int i6 = f406 + 73;
        f405 = i6 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i6 % 2 == 0) {
            return duVarM7692;
        }
        int i7 = 84 / 0;
        return duVarM7692;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private ee m776() {
        int i = f405;
        int i2 = i + 67;
        f406 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        ee eeVar = this.f408;
        int i4 = i + 83;
        f406 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i5 = i4 % 2;
        return eeVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ej
    public final String toString() {
        String string = new StringBuilder().append(super.toString()).append(m775(new int[]{-2133606961, 677274057}, 3 - KeyEvent.getDeadChar(0, 0)).intern()).append(m776().toString()).toString();
        int i = f405 + 105;
        f406 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        return string;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ej
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj == null) || getClass() != obj.getClass()) {
            return false;
        }
        if (super.equals(obj)) {
            eg egVar = (eg) obj;
            ee eeVar = this.f408;
            if (eeVar == null) {
                return egVar.f408 == null;
            }
            int i = f406 + 27;
            f405 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            boolean z = i % 2 != 0;
            ee eeVar2 = egVar.f408;
            if (!z) {
                return eeVar.equals(eeVar2);
            }
            eeVar.equals(eeVar2);
            throw null;
        }
        int i2 = f406 + 19;
        f405 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ej
    public final int hashCode() {
        int i = f405 + 107;
        f406 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        int iHashCode = super.hashCode() * 31;
        ee eeVar = this.f408;
        int iHashCode2 = iHashCode + (eeVar == null ? 0 : eeVar.hashCode());
        int i3 = f406 + 17;
        f405 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i3 % 2 == 0) {
            return iHashCode2;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m775(int[] iArr, int i) {
        String str;
        synchronized (d.ﾇ) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f407.clone();
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
