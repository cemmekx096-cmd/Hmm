package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import com.ironsource.adqualitysdk.sdk.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class iz extends BroadcastReceiver {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f612 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f613;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int[] f614;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String f615;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private Context f617;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private boolean f618 = false;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private Set<ir> f616 = new HashSet();

    /* renamed from: ﺙ, reason: contains not printable characters */
    static void m901() {
        f614 = new int[]{2122278966, -1028962310, -1551100526, 1750173566, -367908708, 1556435544, -1104251555, 1576056311, -877537701, 831993725, 889648699, 1487514202, -1075654584, -264053196, -1240711573, -1145202918, 145654545, -1923854875};
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m903() {
        int i = f613 + 59;
        f612 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 != 0) {
            return f615;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m905(iz izVar, boolean z) {
        int i = f613 + 41;
        f612 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        izVar.m907(z);
        int i3 = f613 + 79;
        f612 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ boolean m906(iz izVar, Context context) {
        int i = f613 + 81;
        f612 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i % 2 == 0)) {
            return m902(context);
        }
        m902(context);
        throw null;
    }

    static {
        m901();
        f615 = m904(new int[]{1629707547, 657328492, 1858167539, -1219310141, -1651965719, 1346697530, -1156818960, -1995905252, -1348457785, 1815394219}, 20 - (Process.myPid() >> 22)).intern();
        int i = f613 + 67;
        f612 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 != 0) {
        } else {
            throw null;
        }
    }

    public iz(Context context) {
        this.f617 = context.getApplicationContext();
        n.ﱡ(f615, m904(new int[]{1895305721, 1332865827, -1545500110, 243575598, -1149866182, -1645084613, 2145995328, -1912767410, -44128612, -1034827097, -1985035452, -1897914413, 1968464475, -1872792716, 1595739492, 1366971894}, (Process.myTid() >> 22) + 30).intern());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(m904(new int[]{-1072575139, -379969675, 1534352560, -567546495, -8009819, -1266244966, 702640470, -1164157678, -164169340, 1142584323, -1029995911, 2130581777, 2059563727, 183758623, 637897614, -1002058098, 180745230, 920622199}, 36 - (Process.myTid() >> 22)).intern());
        this.f617.registerReceiver(this, intentFilter);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m911() {
        int i = f612 + 89;
        f613 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        this.f617.unregisterReceiver(this);
        int i3 = f613 + 81;
        f612 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m910(ir irVar) {
        int i = f613 + R.styleable.AppCompatTheme_windowFixedWidthMinor;
        f612 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i % 2 != 0)) {
            this.f616.add(irVar);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        this.f616.add(irVar);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m913(ir irVar) {
        int i = f613 + 103;
        f612 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        this.f616.remove(irVar);
        int i3 = f613 + 89;
        f612 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private synchronized Set<ir> m900() {
        HashSet hashSet = new HashSet(this.f616);
        int i = f613 + 89;
        f612 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 == 0 ? (char) 21 : 'a') != 21) {
            return hashSet;
        }
        int i2 = 68 / 0;
        return hashSet;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m912() {
        Iterator<ir> it = m900().iterator();
        while (true) {
            if (!(it.hasNext())) {
                int i = f612 + 61;
                f613 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i2 = i % 2;
                return;
            } else {
                it.next().ｋ();
                int i3 = f613 + 57;
                f612 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i4 = i3 % 2;
            }
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m909() {
        int i = f612 + 111;
        f613 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        Iterator<ir> it = m900().iterator();
        int i3 = f613 + 87;
        f612 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        while (true) {
            if (!(it.hasNext())) {
                return;
            }
            int i5 = f613 + 5;
            f612 = i5 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i6 = i5 % 2;
            it.next();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        s.ﾒ(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.iz.2

            /* renamed from: ﱟ, reason: contains not printable characters */
            private static int f619 = 1;

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static int[] f620 = {2005493371, -841400590, 148556833, -27146506, -979854212, -204338742, -634901745, -435974402, -1622115050, 1237570580, 1516339807, 1823527510, -623880020, 292068933, -1174726423, -1703220422, -24503458, -804044852};

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static int f621;

            /* renamed from: ﾒ, reason: contains not printable characters */
            public final void m916() {
                int i = f621 + 63;
                f619 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                try {
                    if (i % 2 == 0) {
                        if (!intent.getAction().equals(m915(new int[]{-99749323, 1845556534, 1803633288, 1179482042, -1184329417, -567585717, -133392581, 103764985, -2133062953, -1239390194, -2034173888, 1398933603, -33327527, 955762279, -1190007795, -752253118, -133220279, 1932281308}, 74 / (ViewConfiguration.getPressedStateDuration() >> 107)).intern())) {
                            return;
                        }
                    } else {
                        if (!intent.getAction().equals(m915(new int[]{-99749323, 1845556534, 1803633288, 1179482042, -1184329417, -567585717, -133392581, 103764985, -2133062953, -1239390194, -2034173888, 1398933603, -33327527, 955762279, -1190007795, -752253118, -133220279, 1932281308}, (ViewConfiguration.getPressedStateDuration() >> 16) + 36).intern())) {
                            return;
                        }
                    }
                    n.ﾒ(iz.m903(), m915(new int[]{-525164393, 744399271, 261125374, -2132164689, -133392581, 103764985, -945656816, -1195558763, 957672357, -354227765, -1152515314, -1011681112, 1755163892, -1620884688}, Color.green(0) + 27).intern());
                    if (intent.getBooleanExtra(m915(new int[]{-2016248418, -731969610, 1737838229, -700703233, -161254375, -556305078, -2135494626, -1708897537}, 14 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), false)) {
                        n.ﾒ(iz.m903(), m915(new int[]{1299578726, -1743615335, 1864001520, -1117432411, 959356649, -144690878, 191461418, -661585442, 1132738218, 1886173234, 1952749992, 1394423201, -1818828902, -844891427, 2045928282, 315570959}, ImageFormat.getBitsPerPixel(0) + 32).intern());
                        s.ｋ(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.iz.2.5
                            /* renamed from: ﾒ, reason: contains not printable characters */
                            public final void m919() {
                                iz.this.m909();
                                iz.m905(iz.this, false);
                            }
                        });
                        int i2 = f619 + 85;
                        f621 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                        if (i2 % 2 != 0) {
                            int i3 = 52 / 0;
                            return;
                        }
                        return;
                    }
                    if (iz.m906(iz.this, context)) {
                        s.ｋ(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.iz.2.4
                            /* renamed from: ﾒ, reason: contains not printable characters */
                            public final void m918() {
                                iz.m905(iz.this, true);
                                iz.this.m912();
                            }
                        });
                    } else {
                        s.ｋ(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.iz.2.1
                            /* renamed from: ﾒ, reason: contains not printable characters */
                            public final void m917() {
                                iz.m905(iz.this, false);
                                iz.this.m909();
                            }
                        });
                    }
                } catch (Exception e) {
                    kb.ﾇ(iz.m903(), m915(new int[]{-972276052, 1405703199, -1817963556, 341685493, 716079971, 617782936, 382410257, 1806188021, 1407827197, -843576403}, 18 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), e, false);
                }
            }

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static String m915(int[] iArr, int i) {
                String str;
                synchronized (d.ﾇ) {
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length << 1];
                    int[] iArr2 = (int[]) f620.clone();
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
        });
        int i = f613 + 75;
        f612 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized boolean m914() {
        boolean z;
        int i = f612;
        int i2 = i + 19;
        f613 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i2 % 2 != 0 ? (char) 23 : 'I') != 'I') {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        z = this.f618;
        int i3 = i + 13;
        f613 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return z;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private synchronized void m907(boolean z) {
        int i = f613;
        int i2 = i + 71;
        f612 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        this.f618 = z;
        int i4 = i + 59;
        f612 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i5 = i4 % 2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m902(Context context) {
        int i = f613 + 97;
        f612 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        NetworkInfo networkInfoM908 = m908(context);
        Object obj = null;
        if (networkInfoM908 != null) {
            int i3 = f613 + 73;
            f612 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (i3 % 2 != 0) {
                if (networkInfoM908.isConnected()) {
                    n.ﾒ(f615, new StringBuilder().append(m904(new int[]{1629707547, 657328492, 1474289885, 1342520013}, TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 9).intern()).append(networkInfoM908.getTypeName()).append(m904(new int[]{2124198339, 179647037, 1262350957, -1871878628, 686545111, -1211493575}, (ViewConfiguration.getScrollBarSize() >> 8) + 11).intern()).toString());
                    return true;
                }
            } else {
                networkInfoM908.isConnected();
                super.hashCode();
                throw null;
            }
        }
        int i4 = f612 + 13;
        f613 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i4 % 2 != 0 ? '!' : '@') == '@') {
            return false;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static NetworkInfo m908(Context context) {
        int i = f613 + 53;
        f612 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        if (!(context != null)) {
            return null;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(m904(new int[]{702640470, -1164157678, -1392051323, -1684407193, -376239105, -269561256}, Drawable.resolveOpacity(0, 0) + 12).intern())).getActiveNetworkInfo();
        int i3 = f613 + 23;
        f612 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return activeNetworkInfo;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m904(int[] iArr, int i) {
        String str;
        synchronized (d.ﾇ) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f614.clone();
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
