package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class dl {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f249 = 1;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static long f250 = 4877835772717127964L;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f251;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f252;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String f253;

    /* renamed from: ｋ, reason: contains not printable characters */
    private boolean f254;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f255;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String f256;

    public dl(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f252 = jSONObject.optString(m672("奫精ᾛ댵풠框跜", 41843 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern());
            this.f255 = jSONObject.optString(m672("奿竔ḿ㎄ퟯ\ueb31", (ViewConfiguration.getLongPressTimeout() >> 16) + 9127).intern());
            this.f256 = jSONObject.optString(m672("她粓ኆ⢋캡", 9719 - Color.red(0)).intern());
            this.f253 = jSONObject.optString(m672("奫ხ쩐薯缩㚊\ue0e1", 18839 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern());
            this.f254 = jSONObject.optBoolean(m672("奩ᤲ\ud9c3顎堐ᢹ\udb40鯶宾ᨪ", 16477 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR)).intern());
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m673() {
        String str;
        int i = f249 + 5;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f251 = i2;
        if ((i % 2 != 0 ? '\r' : ':') != ':') {
            str = this.f252;
            int i3 = 43 / 0;
        } else {
            str = this.f252;
        }
        int i4 = i2 + 67;
        f249 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i5 = i4 % 2;
        return str;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String m675() {
        int i = f249 + 71;
        f251 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 != 0 ? 'N' : '\n') != 'N') {
            return this.f255;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m674() {
        String str;
        int i = f249 + 43;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f251 = i2;
        if (!(i % 2 != 0)) {
            str = this.f256;
        } else {
            str = this.f256;
            int i3 = 7 / 0;
        }
        int i4 = i2 + 41;
        f249 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i5 = i4 % 2;
        return str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m677() {
        int i = f251 + 1;
        f249 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 == 0) {
            throw null;
        }
        return this.f253;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m676() {
        int i = f251 + 71;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f249 = i2;
        Object obj = null;
        if ((i % 2 == 0 ? '4' : (char) 17) != 17) {
            super.hashCode();
            throw null;
        }
        boolean z = this.f254;
        int i3 = i2 + 77;
        f251 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i3 % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m672(String str, int i) {
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
                cArr2[g.ｋ] = (char) ((cArr[g.ｋ] ^ (g.ｋ * g.ﾒ)) ^ f250);
                g.ｋ++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
