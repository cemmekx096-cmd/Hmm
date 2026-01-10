package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import com.ironsource.adqualitysdk.sdk.R;
import com.ironsource.adqualitysdk.sdk.i.kc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class dp {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f279 = 0;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static long f280 = 5895669425122557311L;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f281 = 1;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private Map<String, dt> f282;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private Map<String, Cdo> f283;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private List<dn> f284;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private boolean f285;

    /* renamed from: ｋ, reason: contains not printable characters */
    private String f286;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private List<String> f287;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String f288;

    public dp(final String str, String str2, JSONObject jSONObject) {
        this.f288 = dw.m736(str2);
        this.f286 = dw.m736(jSONObject.optString(m692("봌菫샍ƹ䚉", 16097 - ExpandableListView.getPackedPositionGroup(0L)).intern()));
        this.f285 = jSONObject.optBoolean(m692("봞䙐䮖䳬倹喟廒成", 64333 - ExpandableListView.getPackedPositionType(0L)).intern());
        this.f287 = m693(kc.ｋ(jSONObject.optJSONArray(m692("봒妵瑌ጐ⾦쩦\ue116", 58543 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR)).intern()), new kc.b<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dp.5
            /* renamed from: ｋ, reason: contains not printable characters */
            public final /* synthetic */ Object m705(JSONArray jSONArray, int i) {
                return dw.m736(jSONArray.optString(i));
            }
        }));
        this.f284 = m693(kc.ｋ(jSONObject.optJSONArray(m692("봌ս췅鐿岓", TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 47208).intern()), new kc.b<dn>() { // from class: com.ironsource.adqualitysdk.sdk.i.dp.3
            /* renamed from: ｋ, reason: contains not printable characters */
            public final /* synthetic */ Object m704(JSONArray jSONArray, int i) {
                return new dn(jSONArray.optJSONObject(i));
            }
        }));
        this.f283 = m694(kc.ｋ(jSONObject.optJSONObject(m692("봚\ue166ׄꡜ첷猧", View.MeasureSpec.makeMeasureSpec(0, 0) + 23663).intern()), new kc.c<Cdo>() { // from class: com.ironsource.adqualitysdk.sdk.i.dp.1
            /* renamed from: ﻛ, reason: contains not printable characters */
            public final /* synthetic */ Object m702(JSONObject jSONObject2, String str3) {
                return new Cdo(jSONObject2.optJSONObject(str3));
            }
        }));
        this.f282 = m694(kc.ｋ(jSONObject.optJSONObject(m692("봒樻ፉ㡴\ue194躾럊", TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 55074).intern()), new kc.c<dt>() { // from class: com.ironsource.adqualitysdk.sdk.i.dp.2
            /* renamed from: ﻛ, reason: contains not printable characters */
            public final /* synthetic */ Object m703(JSONObject jSONObject2, String str3) {
                return new dt(str, str3, jSONObject2.optJSONObject(str3));
            }
        }));
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static <T> List<T> m693(List<T> list) {
        if ((list != null ? 'G' : '>') == 'G') {
            int i = f279 + 33;
            f281 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
            return list;
        }
        ArrayList arrayList = new ArrayList();
        int i3 = f281 + 7;
        f279 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i3 % 2 != 0 ? '/' : '4') != '/') {
            return arrayList;
        }
        int i4 = 34 / 0;
        return arrayList;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static <K, V> Map<K, V> m694(Map<K, V> map) {
        int i = f279 + 31;
        f281 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i % 2 != 0)) {
            int i2 = 22 / 0;
            if (!(map == null)) {
                return map;
            }
        } else if (map != null) {
            return map;
        }
        HashMap map2 = new HashMap();
        int i3 = f281 + 25;
        f279 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return map2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String m699() {
        String str;
        int i = f281;
        int i2 = i + 93;
        f279 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i2 % 2 == 0) {
            str = this.f288;
        } else {
            str = this.f288;
            int i3 = 78 / 0;
        }
        int i4 = i + 33;
        f279 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i5 = i4 % 2;
        return str;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m698() {
        int i = f279 + 101;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f281 = i2;
        if (i % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String str = this.f286;
        int i3 = i2 + 49;
        f279 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m701() {
        int i = f279 + 19;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f281 = i2;
        int i3 = i % 2;
        boolean z = this.f285;
        int i4 = i2 + 111;
        f279 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i4 % 2 != 0 ? '\b' : (char) 30) == 30) {
            return z;
        }
        int i5 = 9 / 0;
        return z;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final List<String> m697() {
        int i = f281 + 111;
        f279 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 == 0) {
            return this.f287;
        }
        int i2 = 58 / 0;
        return this.f287;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final Map<String, dt> m700() {
        Map<String, dt> map;
        int i = f281;
        int i2 = i + R.styleable.AppCompatTheme_windowActionBar;
        f279 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i2 % 2 != 0)) {
            map = this.f282;
        } else {
            map = this.f282;
            int i3 = 4 / 0;
        }
        int i4 = i + 33;
        f279 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i5 = i4 % 2;
        return map;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final List<dn> m695() {
        int i = f279 + 101;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f281 = i2;
        int i3 = i % 2;
        List<dn> list = this.f284;
        int i4 = i2 + 95;
        f279 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i4 % 2 != 0 ? '6' : ' ') == ' ') {
            return list;
        }
        int i5 = 94 / 0;
        return list;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final Map<String, Cdo> m696() {
        int i = f281 + R.styleable.AppCompatTheme_windowMinWidthMinor;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f279 = i2;
        int i3 = i % 2;
        Map<String, Cdo> map = this.f283;
        int i4 = i2 + 77;
        f281 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i5 = i4 % 2;
        return map;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m692(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (g.ﾇ) {
            g.ﾒ = i;
            char[] cArr2 = new char[cArr.length];
            g.ｋ = 0;
            while (g.ｋ < cArr.length) {
                cArr2[g.ｋ] = (char) ((cArr[g.ｋ] ^ (g.ｋ * g.ﾒ)) ^ f280);
                g.ｋ++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
