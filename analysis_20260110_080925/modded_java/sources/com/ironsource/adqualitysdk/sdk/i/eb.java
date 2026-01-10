package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class eb extends ee {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f374 = 1;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f375 = 0;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static boolean f376 = true;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean f377 = true;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f378 = {400, 403, 395, 375, 374, 368, 339, 332, 333};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f379 = 292;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f380;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private ee[] f381;

    public eb(String str, List<ee> list, dm dmVar) {
        super(dmVar);
        this.f380 = dw.m736(str);
        ee[] eeVarArr = new ee[list.size()];
        this.f381 = eeVarArr;
        list.toArray(eeVarArr);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    final String m760() {
        int i = f375;
        int i2 = i + 15;
        f374 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.f380;
        int i3 = i + 65;
        f374 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return str;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    final ee[] m759() {
        int i = f375 + 35;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        f374 = i2;
        int i3 = i % 2;
        ee[] eeVarArr = this.f381;
        int i4 = i2 + 103;
        f375 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i5 = i4 % 2;
        return eeVarArr;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ee
    /* renamed from: ｋ */
    public du mo735(dr drVar, cp cpVar) {
        int i = f374 + 61;
        f375 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        List<Object> listM758 = m758(drVar, cpVar);
        Object obj = null;
        if (m760().equals(m757(null, null, ExpandableListView.getPackedPositionGroup(0L) + 127, "\u0083\u0082\u0081").intern())) {
            n.ｋ(new StringBuilder().append(m757(null, null, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, "\u0087\u0086\u0085\u0084").intern()).append(cpVar.ﺙ()).toString(), new StringBuilder().append(listM758.get(0)).toString());
            du duVar = new du(null);
            int i3 = f375 + 5;
            f374 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (i3 % 2 == 0) {
                throw null;
            }
            return duVar;
        }
        try {
            return new du(((dt) drVar.m717(m760())).m721(drVar, cpVar, listM758));
        } catch (Exception unused) {
            if (cpVar.ﾒ().ｋ(m760()) != null) {
                return cpVar.ﾒ().ｋ(m760()).m721(drVar, cpVar, listM758).m730(false);
            }
            de deVar = cpVar.ﮐ();
            String strM760 = m760();
            cpVar.ﱡ();
            du duVar2 = new du(deVar.mo419(cpVar, strM760, listM758, drVar));
            int i4 = f375 + 5;
            f374 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if ((i4 % 2 == 0 ? 'C' : 'A') != 'C') {
                return duVar2;
            }
            super.hashCode();
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    final List<Object> m758(dr drVar, cp cpVar) {
        ArrayList arrayList = new ArrayList();
        ee[] eeVarArr = this.f381;
        int length = eeVarArr.length;
        int i = 0;
        while (true) {
            if (!(i < length)) {
                break;
            }
            int i2 = f374 + 79;
            f375 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i3 = i2 % 2;
            arrayList.add(eeVarArr[i].m769(drVar, cpVar).m728());
            i++;
        }
        int i4 = f375 + 1;
        f374 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i4 % 2 == 0 ? (char) 3 : 'J') != 3) {
            return arrayList;
        }
        throw null;
    }

    public String toString() {
        int i = f375 + 101;
        f374 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        Object obj = null;
        if ((i % 2 == 0 ? 'P' : 'D') != 'D') {
            mo761(this.f381);
            super.hashCode();
            throw null;
        }
        String strMo761 = mo761(this.f381);
        int i2 = f375 + 19;
        f374 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i2 % 2 == 0 ? 'K' : 'B') == 'B') {
            return strMo761;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    String mo761(Object[] objArr) {
        String string = new StringBuilder().append(this.f380).append(m757(null, null, TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 127, "\u0088").intern()).append(m767(objArr)).append(m757(null, null, View.MeasureSpec.getSize(0) + 127, "\u0089").intern()).toString();
        int i = f375 + 39;
        f374 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 != 0) {
            return string;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
    
        if (getClass() != r5.getClass()) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
    
        if (getClass() != r5.getClass()) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0039, code lost:
    
        r5 = (com.ironsource.adqualitysdk.sdk.i.eb) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        if (r4.f380.equals(r5.f380) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
    
        r1 = 'T';
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
    
        r1 = '7';
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
    
        if (r1 == '7') goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
    
        r5 = java.util.Arrays.equals(r4.f381, r5.f381);
        r0 = com.ironsource.adqualitysdk.sdk.i.eb.f375 + 87;
        com.ironsource.adqualitysdk.sdk.i.eb.f374 = r0 % androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_PRIMARY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
    
        if ((r0 % 2) == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0064, code lost:
    
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0067, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 85
            if (r4 != r5) goto L6
            r1 = r0
            goto L8
        L6:
            r1 = 86
        L8:
            r2 = 1
            if (r1 == r0) goto L6b
            r0 = 0
            if (r5 == 0) goto L10
            r1 = r0
            goto L11
        L10:
            r1 = r2
        L11:
            if (r1 == r2) goto L6a
            int r1 = com.ironsource.adqualitysdk.sdk.i.eb.f375
            int r1 = r1 + 115
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.eb.f374 = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L2e
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r2 = r5.getClass()
            r3 = 6
            int r3 = r3 / r0
            if (r1 == r2) goto L39
            goto L6a
        L2c:
            r5 = move-exception
            throw r5
        L2e:
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r2 = r5.getClass()
            if (r1 == r2) goto L39
            goto L6a
        L39:
            com.ironsource.adqualitysdk.sdk.i.eb r5 = (com.ironsource.adqualitysdk.sdk.i.eb) r5
            java.lang.String r1 = r4.f380
            java.lang.String r2 = r5.f380
            boolean r1 = r1.equals(r2)
            r2 = 55
            if (r1 != 0) goto L4a
            r1 = 84
            goto L4b
        L4a:
            r1 = r2
        L4b:
            if (r1 == r2) goto L4e
            return r0
        L4e:
            com.ironsource.adqualitysdk.sdk.i.ee[] r0 = r4.f381
            com.ironsource.adqualitysdk.sdk.i.ee[] r5 = r5.f381
            boolean r5 = java.util.Arrays.equals(r0, r5)
            int r0 = com.ironsource.adqualitysdk.sdk.i.eb.f375
            int r0 = r0 + 87
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.eb.f374 = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L63
            return r5
        L63:
            r5 = 0
            super.hashCode()     // Catch: java.lang.Throwable -> L68
            throw r5     // Catch: java.lang.Throwable -> L68
        L68:
            r5 = move-exception
            throw r5
        L6a:
            return r0
        L6b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.eb.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = f374;
        int i2 = i + 85;
        f375 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        String str = this.f380;
        int iHashCode = 0;
        if (!(str == null)) {
            int i4 = i + 27;
            f375 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i5 = i4 % 2;
            iHashCode = str.hashCode();
        }
        int iHashCode2 = (iHashCode * 31) + Arrays.hashCode(this.f381);
        int i6 = f375 + 111;
        f374 = i6 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i6 % 2 == 0 ? '4' : (char) 11) == 11) {
            return iHashCode2;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m757(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
        byte[] bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (o.ｋ) {
            char[] cArr2 = f378;
            int i2 = f379;
            if (f376) {
                int length = bArr.length;
                o.ﾇ = length;
                char[] cArr3 = new char[length];
                o.ﾒ = 0;
                while (o.ﾒ < o.ﾇ) {
                    cArr3[o.ﾒ] = (char) (cArr2[bArr[(o.ﾇ - 1) - o.ﾒ] + i] - i2);
                    o.ﾒ++;
                }
                return new String(cArr3);
            }
            if (f377) {
                int length2 = cArr.length;
                o.ﾇ = length2;
                char[] cArr4 = new char[length2];
                o.ﾒ = 0;
                while (o.ﾒ < o.ﾇ) {
                    cArr4[o.ﾒ] = (char) (cArr2[cArr[(o.ﾇ - 1) - o.ﾒ] - i] - i2);
                    o.ﾒ++;
                }
                return new String(cArr4);
            }
            int length3 = iArr.length;
            o.ﾇ = length3;
            char[] cArr5 = new char[length3];
            o.ﾒ = 0;
            while (o.ﾒ < o.ﾇ) {
                cArr5[o.ﾒ] = (char) (cArr2[iArr[(o.ﾇ - 1) - o.ﾒ] - i] - i2);
                o.ﾒ++;
            }
            return new String(cArr5);
        }
    }
}
