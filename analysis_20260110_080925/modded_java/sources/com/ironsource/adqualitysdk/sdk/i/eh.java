package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import com.ironsource.adqualitysdk.sdk.R;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class eh extends ej {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f409 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f410 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f411 = -684344474;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static short[] f412 = null;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static byte[] f413 = {37, 79, -100, -93, -109, -99, -85, -112, -97, -107, -80, -30, 73, -84, -101, -28, 73, -95, -92, -108, -84, -115, -82, -118, -97, -16, 86, -106, -94, -110, -80, -119, -90, -88, -120, -82, -30, 75, -96, -102, -99, -54, 36, -55, 46, 27, 24, 37, 16, 108, -39, 28, 14, 31, 32, 28, 29, 24, 31, 34, 22, 114, -49, 28, 108, -32, 31, 88, -40, 15, 27, 114, -50, 24, 113, -42, 22, 34, 13, 36, 27, 113, 3};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f414 = 5;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f415 = -1158122413;

    public eh(ee eeVar, ee eeVar2, dm dmVar) {
        super(eeVar, eeVar2, dmVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ee
    /* renamed from: ｋ */
    public final du mo735(dr drVar, cp cpVar) {
        Object objM728;
        du duVarM769 = m780().m769(drVar, cpVar);
        Object obj = null;
        try {
            objM728 = m781().m769(drVar, cpVar).m728();
        } catch (Exception e) {
            cq.m464(cpVar.ﺙ(), new StringBuilder().append(m777((byte) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (short) (99 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (-5) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 684344474, 1158122483 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern()).append(this).append(m768()).toString(), e);
        }
        if (objM728 instanceof JSONObject) {
            return new du(((JSONObject) objM728).opt((String) duVarM769.m728()));
        }
        if (objM728 instanceof JSONArray) {
            return new du(((JSONArray) objM728).opt(duVarM769.m733().intValue()));
        }
        if (objM728 instanceof Map) {
            return new du(((Map) objM728).get(duVarM769.m728()));
        }
        if (objM728 instanceof List) {
            return new du(((List) objM728).get(duVarM769.m733().intValue()));
        }
        if (objM728.getClass().isArray()) {
            du duVar = new du(((Object[]) objM728)[duVarM769.m733().intValue()]);
            int i = f410 + R.styleable.AppCompatTheme_windowFixedWidthMinor;
            f409 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if ((i % 2 == 0 ? '6' : '!') != '6') {
                return duVar;
            }
            super.hashCode();
            throw null;
        }
        cq.m464(cpVar.ﺙ(), new StringBuilder().append(m777((byte) TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), (short) (99 - View.resolveSizeAndState(0, 0, 0)), (-6) - (ViewConfiguration.getEdgeSlop() >> 16), View.resolveSize(0, 0) + 684344474, 1158122482 - ExpandableListView.getPackedPositionGroup(0L)).intern()).append(this).append(m768()).append(m777((byte) Color.red(0), (short) ((ViewConfiguration.getFadingEdgeLength() >> 16) - 29), TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) - 6, 684344516 - (ViewConfiguration.getTapTimeout() >> 16), 1158122471 - Color.green(0)).intern()).append(objM728).toString(), null);
        du duVar2 = new du(null);
        int i2 = f409 + 81;
        f410 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i2 % 2 != 0 ? (char) 22 : 'G') != 22) {
            return duVar2;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m777(byte b, short s, int i, int i2, int i3) {
        String string;
        synchronized (k.ﮐ) {
            StringBuilder sb = new StringBuilder();
            int i4 = f414;
            int i5 = i + i4;
            boolean z = i5 == -1;
            if (z) {
                byte[] bArr = f413;
                if (bArr != null) {
                    i5 = (byte) (bArr[f411 + i2] + i4);
                } else {
                    i5 = (short) (f412[f411 + i2] + i4);
                }
            }
            if (i5 > 0) {
                k.ｋ = ((i2 + i5) - 2) + f411 + (z ? 1 : 0);
                k.ﻐ = b;
                k.ﾇ = (char) (i3 + f415);
                sb.append(k.ﾇ);
                k.ﻛ = k.ﾇ;
                k.ﾒ = 1;
                while (k.ﾒ < i5) {
                    byte[] bArr2 = f413;
                    if (bArr2 != null) {
                        int i6 = k.ｋ;
                        k.ｋ = i6 - 1;
                        k.ﾇ = (char) (k.ﻛ + (((byte) (bArr2[i6] + s)) ^ k.ﻐ));
                    } else {
                        short[] sArr = f412;
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
