package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class dn {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f262 = 154;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f263 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f264;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private String f265;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f266;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private ISAdQualityAdType f267;

    /* renamed from: ｋ, reason: contains not printable characters */
    private List<String> f268;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private JSONObject f269;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String f270;

    public dn(JSONObject jSONObject) {
        this.f267 = ISAdQualityAdType.UNKNOWN;
        this.f266 = dw.m736(jSONObject.optString(m681(-TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0), 4 - View.MeasureSpec.makeMeasureSpec(0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 266, "\ufff5\u0004\t\u0000", false).intern()));
        String strM736 = dw.m736(jSONObject.optString(m681(ExpandableListView.getPackedPositionGroup(0L) + 2, (Process.myPid() >> 22) + 6, 255 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0), "\ufffe\ufffb\uffff\n\u0013￮", true).intern()));
        if (!TextUtils.isEmpty(strM736)) {
            this.f267 = ISAdQualityAdType.fromInt(Integer.parseInt(strM736));
        }
        this.f269 = jSONObject.optJSONObject(m681(6 - Gravity.getAbsoluteGravity(0, 0), ExpandableListView.getPackedPositionGroup(0L) + 6, Color.argb(0, 0, 0, 0) + 261, "\b\u0002\ufff6\u0007\ufff6\u0005", true).intern());
        this.f268 = kc.ﻛ(jSONObject, m681(3 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), Gravity.getAbsoluteGravity(0, 0) + 10, TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 261, "\t\ufff8\ufff6\b\ufffa\ufffe\t\ufffe\u000b\ufffe", true).intern(), new ArrayList());
        this.f270 = dw.m736(jSONObject.optString(m681(View.resolveSize(0, 0) + 1, 11 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 259, "\t\r\u0000￼\u000e\uffdd\u0000\u0003\u000b￼", false).intern()));
        this.f265 = dw.m736(jSONObject.optString(m681(1 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 14 - Color.alpha(0), 258 - View.getDefaultSize(0, 0), "\n\u000f�\ufffa￮\u0001�\u000f\u000b\uffdf�\f\f�", false).intern()));
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m684() {
        int i = f264;
        int i2 = i + 85;
        f263 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        String str = this.f266;
        int i4 = i + 15;
        f263 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i5 = i4 % 2;
        return str;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final ISAdQualityAdType m683() {
        int i = f264;
        int i2 = i + 83;
        f263 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        ISAdQualityAdType iSAdQualityAdType = this.f267;
        int i4 = i + 97;
        f263 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i4 % 2 == 0)) {
            return iSAdQualityAdType;
        }
        int i5 = 27 / 0;
        return iSAdQualityAdType;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject m687() {
        int i = f263 + 29;
        f264 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 != 0 ? '9' : '$') != '9') {
            return this.f269;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final List<String> m686() {
        List<String> list;
        int i = f263;
        int i2 = i + 53;
        f264 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i2 % 2 == 0)) {
            list = this.f268;
            int i3 = 39 / 0;
        } else {
            list = this.f268;
        }
        int i4 = i + 51;
        f264 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i5 = i4 % 2;
        return list;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String m685() {
        int i = f263 + 31;
        f264 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 != 0 ? '\\' : '-') == '-') {
            return this.f270;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final String m682() {
        int i = f263 + 91;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f264 = i2;
        if (!(i % 2 == 0)) {
            throw null;
        }
        String str = this.f265;
        int i3 = i2 + 55;
        f263 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return str;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m681(int i, int i2, int i3, String str, boolean z) {
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
                cArr2[i4] = (char) (cArr2[i4] - f262);
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
