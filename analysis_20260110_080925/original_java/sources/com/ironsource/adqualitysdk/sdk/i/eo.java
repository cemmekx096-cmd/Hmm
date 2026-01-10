package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.crashlytics.android.BuildConfig;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public abstract class eo extends ek {

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f438 = -3355755856841908672L;

    public eo(ee eeVar, ee eeVar2, dm dmVar) {
        super(eeVar, eeVar2, dmVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ek
    /* renamed from: ﾇ */
    final boolean mo784(String str, String str2) {
        throw new RuntimeException(new StringBuilder().append(m789("布뼄鱤﵁\udabb㮍ᢾ瘠圇둠镂\uf2b6펎ツ\u0e66", 57636 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0')).intern()).append(str).append(m789("幠મ\uf730ꎉ\u0c5c", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21646).intern()).append(str2).toString());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ek
    /* renamed from: ﻛ */
    final boolean mo783(Object obj, Object obj2) {
        throw new RuntimeException(new StringBuilder().append(m789("布뼄鱤﵁\udabb㮍ᢾ瘠圇둠镂\uf2b6펎ツ\u0e66", 57637 - ((Process.getThreadPriority(0) + 20) >> 6)).intern()).append(obj).append(m789("幠મ\uf730ꎉ\u0c5c", 21646 - ((byte) KeyEvent.getModifierMetaStateMask())).intern()).append(obj2).toString());
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m789(String str, int i) {
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
                cArr2[g.ｋ] = (char) ((cArr[g.ｋ] ^ (g.ｋ * g.ﾒ)) ^ f438);
                g.ｋ++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
