package com.ironsource.sdk;

import android.app.Activity;
import com.ironsource.kr;
import com.ironsource.zj;

@Deprecated
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class SSAFactory {
    public static kr getPublisherInstance(Activity activity) throws Exception {
        return zj.b(activity);
    }

    public static kr getPublisherTestInstance(Activity activity, int i) throws Exception {
        return zj.a(activity, i);
    }
}
