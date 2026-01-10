package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import androidx.media3.exoplayer.RendererCapabilities;
import com.ironsource.adqualitysdk.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class cn {

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static char f113 = 12561;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static int f114 = 0;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f115 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static char f116 = 30183;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char f117 = 57924;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char f118 = 280;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private dl f119;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private List<cp> f120 = new ArrayList();

    /* renamed from: ﻐ, reason: contains not printable characters */
    private de f121;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private bg f122;

    /* renamed from: ｋ, reason: contains not printable characters */
    private dj f123;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private Context f124;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private az f125;

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ List m437(cn cnVar) {
        int i = f114 + 23;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f115 = i2;
        char c = i % 2 == 0 ? 'C' : 'D';
        List<cp> list = cnVar.f120;
        if (c == 'C') {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i3 = i2 + 25;
        f114 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return list;
    }

    public cn(Context context, dj djVar, az azVar, de deVar, bg bgVar) {
        this.f123 = djVar;
        this.f125 = azVar;
        this.f121 = deVar;
        this.f122 = bgVar;
        this.f124 = context.getApplicationContext();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m450() {
        int i = f115 + 109;
        f114 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i % 2 == 0)) {
            this.f120.iterator();
            throw null;
        }
        Iterator<cp> it = this.f120.iterator();
        int i2 = f115 + 31;
        f114 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        while (true) {
            if ((it.hasNext() ? '=' : (char) 3) == 3) {
                s.ｋ(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.cn.5
                    /* renamed from: ﾒ, reason: contains not printable characters */
                    public final void m453() {
                        cn.m437(cn.this).clear();
                    }
                });
                return;
            }
            it.next().ﭖ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0020 A[Catch: all -> 0x002c, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:18:0x0020, B:13:0x0019, B:7:0x0011), top: B:26:0x0001, inners: #0 }] */
    /* renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void m432(com.ironsource.adqualitysdk.sdk.i.dl r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = com.ironsource.adqualitysdk.sdk.i.cn.f114     // Catch: java.lang.Throwable -> L2c
            int r0 = r0 + 19
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.cn.f115 = r1     // Catch: java.lang.Throwable -> L2c
            int r0 = r0 % 2
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L1a
            r0 = 49
            int r0 = r0 / r3
            if (r5 == 0) goto L15
            r2 = r3
        L15:
            if (r2 == 0) goto L20
            goto L2a
        L18:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L2c
        L1a:
            if (r5 == 0) goto L1d
            goto L1e
        L1d:
            r2 = r3
        L1e:
            if (r2 == 0) goto L2a
        L20:
            int r1 = r1 + 93
            int r0 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.cn.f114 = r0     // Catch: java.lang.Throwable -> L2c
            int r1 = r1 % 2
            r4.f119 = r5     // Catch: java.lang.Throwable -> L2c
        L2a:
            monitor-exit(r4)
            return
        L2c:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cn.m432(com.ironsource.adqualitysdk.sdk.i.dl):void");
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    private synchronized List<cp> m430() {
        int i = f115 + 99;
        f114 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        if (this.f120 == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(this.f120);
        int i3 = f115 + 35;
        f114 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return arrayList;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m451() {
        int i = f115 + 93;
        f114 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        Object obj = null;
        if (i % 2 != 0) {
            this.f123.ﺙ();
            throw null;
        }
        dl dlVar = this.f123.ﺙ();
        if (dlVar != null) {
            m435(dlVar);
            if (this.f122.ﻏ()) {
                jp.ｋ(dlVar);
            }
        }
        this.f123.ﻏ().m714(m433("⬖╾貮࠲쭚䧷饊ꊡ㝟\uee38⡦혆", 13 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), this.f122);
        Iterator it = this.f123.ﮐ().keySet().iterator();
        int i2 = f115 + 93;
        f114 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        while (true) {
            if ((it.hasNext() ? (char) 2 : '1') == '1') {
                m434(this.f123, this.f122);
                return;
            }
            int i4 = f115 + R.styleable.AppCompatTheme_windowFixedHeightMinor;
            f114 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (i4 % 2 != 0) {
                ((dp) this.f123.ﮐ().get((String) it.next())).m701();
                super.hashCode();
                throw null;
            }
            dp dpVar = (dp) this.f123.ﮐ().get((String) it.next());
            if (!dpVar.m701()) {
                m431(new cp(this, this.f121, this.f122, m436(dpVar), this.f123.ﻏ()));
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private hs m436(dp dpVar) {
        int i = f114 + 95;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f115 = i2;
        int i3 = i % 2;
        if (dpVar != null) {
            return new hs(dpVar, m436((dp) this.f123.ﮐ().get(dpVar.m698())));
        }
        int i4 = i2 + 83;
        f114 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i4 % 2 != 0 ? '6' : ':') != '6') {
            return null;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m452() {
        int i = f115 + 11;
        f114 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        String str = this.f123.ﾒ();
        int i3 = f114 + R.styleable.AppCompatTheme_windowFixedWidthMinor;
        f115 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return str;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m448() {
        String str;
        int i = f114 + 101;
        f115 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 == 0 ? 'X' : ']') != ']') {
            str = this.f123.ﻛ();
            int i2 = 57 / 0;
        } else {
            str = this.f123.ﻛ();
        }
        int i3 = f115 + 67;
        f114 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i3 % 2 != 0 ? (char) 14 : '_') == '_') {
            return str;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m447() {
        int i = f114 + 63;
        f115 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 == 0) {
            this.f123.ｋ();
            throw null;
        }
        String str = this.f123.ｋ();
        int i2 = f115 + 111;
        f114 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i2 % 2 != 0 ? 'a' : 'J') != 'a') {
            return str;
        }
        throw null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final String m442() {
        int i = f114 + 43;
        f115 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 == 0 ? '%' : 'J') == 'J') {
            return this.f122.ﻐ();
        }
        this.f122.ﻐ();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final String m445() {
        int i = f114 + 79;
        f115 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        Object obj = null;
        if ((i % 2 == 0 ? 'M' : '&') == 'M') {
            this.f122.ﾇ();
            super.hashCode();
            throw null;
        }
        String str = this.f122.ﾇ();
        int i2 = f114 + 7;
        f115 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i2 % 2 == 0) {
            throw null;
        }
        return str;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final String m446() {
        String strM442 = m442();
        if (TextUtils.isEmpty(strM442)) {
            return null;
        }
        int i = f114 + 61;
        f115 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        if ((!m433("Ⴎ胓誶垓䴑씱陘奆", '7' - AndroidCharacter.getMirror('0')).intern().equals(strM442) ? 'G' : (char) 24) == 24) {
            return null;
        }
        int i3 = f114 + 101;
        f115 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i3 % 2 == 0)) {
            if (m433("ᦹ磏\udea9⯛궺눯籓̡", 9 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern().equals(strM442)) {
                return null;
            }
        } else if (m433("ᦹ磏\udea9⯛궺눯籓̡", 107 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern().equals(strM442)) {
            return null;
        }
        return this.f123.ｋ(m442());
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final String m444() {
        int i = f114 + 95;
        f115 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 == 0 ? '\n' : (char) 20) != '\n') {
            return this.f123.ﾇ();
        }
        this.f123.ﾇ();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final String m443() {
        int i = f115 + 91;
        f114 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 != 0 ? (char) 5 : '*') == '*') {
            return this.f123.ﻐ();
        }
        this.f123.ﻐ();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m449(String str, List<Object> list) {
        int i = f115 + 97;
        f114 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 != 0) {
            m430().iterator();
            throw null;
        }
        Iterator<cp> it = m430().iterator();
        int i2 = f114 + 3;
        f115 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        while (true) {
            int i3 = i2 % 2;
            if ((it.hasNext() ? '6' : '+') != '6') {
                return;
            }
            int i4 = f115 + 23;
            f114 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (!(i4 % 2 == 0)) {
                it.next().ﻛ(str, list);
                throw null;
            }
            it.next().ﻛ(str, list);
            i2 = f114 + 95;
            f115 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        }
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    public final Context m438() {
        int i = f114 + 49;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f115 = i2;
        int i3 = i % 2;
        Context context = this.f124;
        int i4 = i2 + 31;
        f114 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i5 = i4 % 2;
        return context;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m431(cp cpVar) {
        int i = f115 + 39;
        f114 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        this.f120.add(cpVar);
        int i3 = f114 + 93;
        f115 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m435(dl dlVar) {
        int i = f114 + 59;
        f115 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        m432(dlVar);
        int i3 = f115 + 45;
        f114 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    protected final synchronized dl m439() {
        dl dlVar;
        int i = f114;
        int i2 = i + 89;
        f115 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        dlVar = this.f119;
        int i4 = i + 23;
        f115 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i4 % 2 == 0 ? 'B' : '.') == 'B') {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        return dlVar;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    public final az m441() {
        int i = f114 + 49;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f115 = i2;
        if ((i % 2 == 0 ? 'C' : 'T') != 'T') {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        az azVar = this.f125;
        int i3 = i2 + R.styleable.AppCompatTheme_windowFixedHeightMinor;
        f114 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i3 % 2 != 0 ? (char) 29 : '<') == '<') {
            return azVar;
        }
        int i4 = 94 / 0;
        return azVar;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private synchronized void m434(dj djVar, bg bgVar) {
        int i = f115 + 89;
        f114 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 != 0 ? ',' : '3') == ',') {
            bgVar.ﱟ();
            throw null;
        }
        if (bgVar.ﱟ()) {
            Iterator<cp> it = m430().iterator();
            while (it.hasNext()) {
                int i2 = f115 + 51;
                f114 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                if (!(i2 % 2 != 0)) {
                    cp next = it.next();
                    djVar.ﻏ().m718().m714(next.ﾒ().ﾒ(), next);
                } else {
                    cp next2 = it.next();
                    djVar.ﻏ().m718().m714(next2.ﾒ().ﾒ(), next2);
                    int i3 = 79 / 0;
                }
                int i4 = f114 + 15;
                f115 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i5 = i4 % 2;
            }
        }
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    public final synchronized boolean m440() {
        boolean z;
        int i = f114 + 9;
        f115 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        z = this.f122.ﱟ();
        int i3 = f115 + 89;
        f114 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return z;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m433(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f117)) ^ ((c2 >>> 5) + f113)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f116) ^ ((c3 + i2) ^ ((c3 << 4) + f118))));
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
