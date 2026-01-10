package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.util.Pair;
import android.widget.VideoView;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class cu extends cz {
    /* renamed from: ｋ, reason: contains not printable characters */
    public static Object m513(List<Object> list) {
        return am.ﾒ((Context) m528(list, 0, Context.class));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Object m516(List<Object> list) {
        Context context = (Context) m528(list, 0, Context.class);
        am.ﾇ(am.ﾒ(context), (BroadcastReceiver) m528(list, 1, BroadcastReceiver.class), (IntentFilter) m528(list, 2, IntentFilter.class));
        return null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static Object m514(List<Object> list) {
        Context context = (Context) m528(list, 0, Context.class);
        am.ﾒ(am.ﾒ(context), (BroadcastReceiver) m528(list, 1, BroadcastReceiver.class));
        return null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static Object m512(List<Object> list) {
        return ((Pair) m528(list, 0, Pair.class)).first;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static Object m511(List<Object> list) {
        return ((Pair) m528(list, 0, Pair.class)).second;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static Object m510(List<Object> list) {
        return jx.ﻐ((VideoView) m528(list, 0, VideoView.class));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static long m515() {
        return ju.ｋ();
    }
}
