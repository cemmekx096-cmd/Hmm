package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class da extends cz {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f155 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f156 = -5546091287408753775L;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f157;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static Object m530(cp cpVar, List<Object> list) {
        List list2;
        Class cls = (Class) m528(list, 0, Class.class);
        List arrayList = new ArrayList();
        if (list.size() > 1) {
            int i = f155 + 75;
            f157 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
            arrayList = (List) m528(list, 1, List.class);
        }
        Object obj = null;
        if (list.size() > 2) {
            int i3 = f155 + 19;
            f157 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i4 = i3 % 2;
            list2 = (List) m528(list, 2, List.class);
        } else {
            list2 = null;
        }
        try {
            if ((list2 != null ? 'Z' : (char) 29) != 'Z') {
                Object objM939 = jz.m939(cls, arrayList);
                int i5 = f155 + 53;
                f157 = i5 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                if (!(i5 % 2 != 0)) {
                    return objM939;
                }
                super.hashCode();
                throw null;
            }
            int i6 = f155 + 89;
            f157 = i6 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if ((i6 % 2 != 0 ? '4' : '1') != '4') {
                Class[] clsArr = new Class[list2.size()];
                list2.toArray(clsArr);
                return jz.m947(cls, arrayList, clsArr);
            }
            Class[] clsArr2 = new Class[list2.size()];
            list2.toArray(clsArr2);
            jz.m947(cls, arrayList, clsArr2);
            super.hashCode();
            throw null;
        } catch (Exception e) {
            String strM452 = cpVar.ﻐ().m452();
            StringBuilder sbAppend = new StringBuilder().append(m533("臤膡撒쐢ꝱㅭ迒䍲箱的홷⌴鴉䜉\ue0ac᳣ꭆ䥋\uf2bcຠ뢑宧荠", 1 - ((Process.getThreadPriority(0) + 20) >> 6)).intern()).append(cls.getName());
            String string = BuildConfig.FLAVOR;
            StringBuilder sbAppend2 = sbAppend.append(m533("魾魞歬䖉ꢊ끉镒싂搜祿埅ꈋ螑䣠慈", -TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0')).intern()).append(arrayList);
            if (list2 != null) {
                string = new StringBuilder().append(m533("쒞쒾䅋\ue592芻ኲ쫺拞塥匍\uf7d4ó\ud865拑섑㼭\uee72", KeyEvent.normalizeMetaState(0) + 1).intern()).append(list2).toString();
            }
            cq.m464(strM452, sbAppend2.append(string).toString(), e);
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static char m534(List<Object> list) {
        int i = f155 + 31;
        f157 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 != 0) {
        }
        char cIntValue = (char) ((Number) m528(list, 0, Number.class)).intValue();
        int i2 = f155 + 39;
        f157 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        return cIntValue;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static Class m532(List<Object> list) {
        int i = f155 + 101;
        f157 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        Class<?> cls = Array.newInstance((Class<?>) m528(list, 0, Class.class), 0).getClass();
        int i3 = f155 + 7;
        f157 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i3 % 2 == 0) {
            return cls;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if ((com.ironsource.adqualitysdk.sdk.i.jz.m944(m528(r7, 0, java.lang.Object.class), (java.lang.String) m528(r7, 1, java.lang.String.class), (java.util.List) m528(r7, 2, java.util.List.class)) == null) != true) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        r7 = com.ironsource.adqualitysdk.sdk.i.da.f155 + 83;
        com.ironsource.adqualitysdk.sdk.i.da.f157 = r7 % androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_PRIMARY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if ((r7 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        r7 = 'R';
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        r7 = '/';
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        if (r7 == 'R') goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if ((com.ironsource.adqualitysdk.sdk.i.jz.m944(m528(r7, 1, java.lang.Object.class), (java.lang.String) m528(r7, 0, java.lang.String.class), (java.util.List) m528(r7, 5, java.util.List.class)) != null ? '>' : 31) != '>') goto L16;
     */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m531(java.util.List<java.lang.Object> r7) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.da.f155
            int r0 = r0 + 65
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.da.f157 = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L34
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Object r0 = m528(r7, r3, r0)
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            java.lang.Object r4 = m528(r7, r2, r4)
            java.lang.String r4 = (java.lang.String) r4
            r5 = 5
            java.lang.Class<java.util.List> r6 = java.util.List.class
            java.lang.Object r7 = m528(r7, r5, r6)
            java.util.List r7 = (java.util.List) r7
            java.lang.reflect.Method r7 = com.ironsource.adqualitysdk.sdk.i.jz.m944(r0, r4, r7)
            r0 = 62
            if (r7 == 0) goto L2f
            r7 = r0
            goto L31
        L2f:
            r7 = 31
        L31:
            if (r7 == r0) goto L55
            goto L56
        L34:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Object r0 = m528(r7, r2, r0)
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            java.lang.Object r4 = m528(r7, r3, r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Class<java.util.List> r5 = java.util.List.class
            java.lang.Object r7 = m528(r7, r1, r5)
            java.util.List r7 = (java.util.List) r7
            java.lang.reflect.Method r7 = com.ironsource.adqualitysdk.sdk.i.jz.m944(r0, r4, r7)
            if (r7 == 0) goto L52
            r7 = r2
            goto L53
        L52:
            r7 = r3
        L53:
            if (r7 == r3) goto L56
        L55:
            return r3
        L56:
            int r7 = com.ironsource.adqualitysdk.sdk.i.da.f155
            int r7 = r7 + 83
            int r0 = r7 % 128
            com.ironsource.adqualitysdk.sdk.i.da.f157 = r0
            int r7 = r7 % r1
            r0 = 82
            if (r7 == 0) goto L65
            r7 = r0
            goto L67
        L65:
            r7 = 47
        L67:
            if (r7 == r0) goto L6a
            return r2
        L6a:
            r7 = 0
            throw r7     // Catch: java.lang.Throwable -> L6c
        L6c:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.da.m531(java.util.List):boolean");
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m533(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (f.ﾒ) {
            char[] cArr2 = f.ﾒ(f156, cArr, i);
            f.ﾇ = 4;
            while (f.ﾇ < cArr2.length) {
                f.ﻛ = f.ﾇ - 4;
                cArr2[f.ﾇ] = (char) ((cArr2[f.ﾇ] ^ cArr2[f.ﾇ % 4]) ^ (f.ﻛ * f156));
                f.ﾇ++;
            }
            str2 = new String(cArr2, 4, cArr2.length - 4);
        }
        return str2;
    }
}
