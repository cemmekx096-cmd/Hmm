package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class dd extends cz {
    /* renamed from: ﾒ, reason: contains not printable characters */
    public static WebView m554(List<Object> list) {
        int iIntValue;
        Activity activity = (Activity) m528(list, 0, Activity.class);
        List arrayList = new ArrayList();
        String str = null;
        if (list.size() > 1) {
            iIntValue = ((Integer) m528(list, 1, Integer.class)).intValue();
            if (list.size() > 2) {
                str = (String) m528(list, 2, String.class);
                if (list.size() > 3) {
                    arrayList = (List) m528(list, 3, List.class);
                }
            }
        } else {
            iIntValue = -1;
        }
        return (WebView) ke.ﻛ(activity, WebView.class, iIntValue, arrayList, str);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static boolean m552(List<Object> list) {
        return ke.ﻛ((View) m528(list, 0, View.class));
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static <E extends View> E m553(List<Object> list) {
        return (E) ke.ﻛ((View) m528(list, 0, View.class), (Class) m528(list, 1, Class.class), ((Boolean) m528(list, 2, Boolean.class)).booleanValue());
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static View m551(List<Object> list) {
        return ke.ﾇ((Activity) m528(list, 0, Activity.class));
    }
}
