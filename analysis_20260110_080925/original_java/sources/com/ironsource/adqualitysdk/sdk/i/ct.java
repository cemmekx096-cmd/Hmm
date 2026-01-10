package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import androidx.media3.exoplayer.RendererCapabilities;
import com.ironsource.adqualitysdk.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class ct extends cz {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f146 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f147 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f148 = 7942923157040349202L;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if ((m527(r11, 2, com.ironsource.adqualitysdk.sdk.i.cp.class) ? false : true) != false) goto L18;
     */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m509(com.ironsource.adqualitysdk.sdk.i.cp r10, java.util.List<java.lang.Object> r11) {
        /*
            r9 = this;
            java.lang.Class<java.util.List> r0 = java.util.List.class
            r1 = 0
            java.lang.Object r0 = m528(r11, r1, r0)
            java.util.List r0 = (java.util.List) r0
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.dt> r2 = com.ironsource.adqualitysdk.sdk.i.dt.class
            r3 = 1
            java.lang.Object r2 = m528(r11, r3, r2)     // Catch: java.lang.Exception -> L91
            com.ironsource.adqualitysdk.sdk.i.dt r2 = (com.ironsource.adqualitysdk.sdk.i.dt) r2     // Catch: java.lang.Exception -> L91
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> L91
            r4.<init>()     // Catch: java.lang.Exception -> L91
            int r5 = r11.size()     // Catch: java.lang.Exception -> L91
            r6 = 94
            r7 = 2
            if (r5 <= r7) goto L23
            r5 = 14
            goto L24
        L23:
            r5 = r6
        L24:
            if (r5 == r6) goto L5e
            int r5 = com.ironsource.adqualitysdk.sdk.i.ct.f146
            int r5 = r5 + 23
            int r6 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.ct.f147 = r6
            int r5 = r5 % r7
            r6 = 3
            if (r5 != 0) goto L3b
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.cp> r3 = com.ironsource.adqualitysdk.sdk.i.cp.class
            boolean r3 = m527(r11, r6, r3)     // Catch: java.lang.Exception -> L91
            if (r3 == 0) goto L46
            goto L4b
        L3b:
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.cp> r5 = com.ironsource.adqualitysdk.sdk.i.cp.class
            boolean r5 = m527(r11, r7, r5)     // Catch: java.lang.Exception -> L91
            if (r5 == 0) goto L44
            r3 = r1
        L44:
            if (r3 == 0) goto L4b
        L46:
            java.util.List r4 = m529(r11, r7)     // Catch: java.lang.Exception -> L91
            goto L5e
        L4b:
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.cp> r3 = com.ironsource.adqualitysdk.sdk.i.cp.class
            java.lang.Object r3 = m528(r11, r7, r3)     // Catch: java.lang.Exception -> L91
            com.ironsource.adqualitysdk.sdk.i.cp r3 = (com.ironsource.adqualitysdk.sdk.i.cp) r3     // Catch: java.lang.Exception -> L91
            int r5 = r11.size()     // Catch: java.lang.Exception -> L91
            if (r5 <= r6) goto L5f
            java.util.List r4 = m529(r11, r6)     // Catch: java.lang.Exception -> L91
            goto L5f
        L5e:
            r3 = r10
        L5f:
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Exception -> L91
            r11.<init>()     // Catch: java.lang.Exception -> L91
            r5 = r1
        L65:
            int r6 = r0.size()     // Catch: java.lang.Exception -> L91
            if (r5 >= r6) goto L90
            int r6 = com.ironsource.adqualitysdk.sdk.i.ct.f147
            int r6 = r6 + 11
            int r8 = r6 % 128
            com.ironsource.adqualitysdk.sdk.i.ct.f146 = r8
            int r6 = r6 % r7
            java.lang.Object r6 = r0.get(r5)     // Catch: java.lang.Exception -> L91
            r4.add(r1, r6)     // Catch: java.lang.Exception -> L91
            com.ironsource.adqualitysdk.sdk.i.dr r6 = r3.ﱟ()     // Catch: java.lang.Exception -> L91
            com.ironsource.adqualitysdk.sdk.i.du r6 = r2.m721(r6, r3, r4)     // Catch: java.lang.Exception -> L91
            java.lang.Object r6 = r6.m728()     // Catch: java.lang.Exception -> L91
            r11.add(r6)     // Catch: java.lang.Exception -> L91
            r4.remove(r1)     // Catch: java.lang.Exception -> L91
            int r5 = r5 + 1
            goto L65
        L90:
            return r11
        L91:
            r11 = move-exception
            java.lang.String r10 = r10.ﺙ()
            r2 = 65146(0xfe7a, float:9.1289E-41)
            long r3 = android.widget.ExpandableListView.getPackedPositionForChild(r1, r1)
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            int r2 = r2 - r1
            java.lang.String r1 = "䁗븛벖묌릌롕뚂딺뎤눯낵꼵궱갍\uaac5ꥆ\ua7d2ꘖꓒꍜꇼꁀ黡鵼鯲騱頃隅镆鎑鈑還輆"
            java.lang.String r1 = m506(r1, r2)
            java.lang.String r1 = r1.intern()
            com.ironsource.adqualitysdk.sdk.i.cq.m464(r10, r1, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ct.m509(com.ironsource.adqualitysdk.sdk.i.cp, java.util.List):java.lang.Object");
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final Object m507(cp cpVar, List<Object> list) {
        int i = f146 + 29;
        f147 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        m509(cpVar, list);
        int i3 = f146 + 33;
        f147 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Object m508(cp cpVar, List<Object> list) {
        cp cpVar2;
        List list2 = (List) m528(list, 0, List.class);
        try {
            dt dtVar = (dt) m528(list, 1, dt.class);
            List<Object> arrayList = new ArrayList<>();
            if (list.size() <= 2) {
                cpVar2 = cpVar;
            } else {
                if (m527(list, 2, cp.class)) {
                    int i = f147 + R.styleable.AppCompatTheme_windowMinWidthMinor;
                    f146 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                    if ((i % 2 != 0 ? 'W' : '0') != 'W') {
                        cpVar2 = (cp) m528(list, 2, cp.class);
                        if (list.size() > 3) {
                            int i2 = f147 + 37;
                            f146 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                            int i3 = i2 % 2;
                            arrayList = m529(list, 3);
                        }
                    } else {
                        cpVar2 = (cp) m528(list, 5, cp.class);
                        if (list.size() > 2) {
                            int i22 = f147 + 37;
                            f146 = i22 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                            int i32 = i22 % 2;
                            arrayList = m529(list, 3);
                        }
                    }
                } else {
                    arrayList = m529(list, 2);
                    cpVar2 = cpVar;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int i4 = 0;
            while (true) {
                if ((i4 < list2.size() ? ':' : 'J') == 'J') {
                    return arrayList2;
                }
                int i5 = f146 + 93;
                f147 = i5 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i6 = i5 % 2;
                arrayList.add(0, list2.get(i4));
                if (!(!dtVar.m721(cpVar2.ﱟ(), cpVar2, arrayList).m732())) {
                    arrayList2.add(list2.get(i4));
                }
                arrayList.remove(0);
                i4++;
            }
        } catch (Exception e) {
            cq.m464(cpVar.ﺙ(), m506("䁗㓻\ua956ᶬ鈌ܵ﯂灚\ue4a4夏칵䋕㜱꯭\u200e镮ৎ︭犑\ue7e1尮탊䔮㧟껶⍘韟ి", 29851 - (Process.myPid() >> 22)).intern(), e);
            return list2;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m506(String str, int i) {
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
                cArr2[g.ｋ] = (char) ((cArr[g.ｋ] ^ (g.ｋ * g.ﾒ)) ^ f148);
                g.ｋ++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
