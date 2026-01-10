package com.mbridge.msdk.foundation.same.net.utils;

import android.text.TextUtils;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.crashlytics.android.BuildConfig;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.playercommon.VideoFeedsPlayer;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import io.fabric.sdk.android.services.events.EventsFilesManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: RequestControlUtil.java */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class c {
    private final String a;
    private int b;
    private ConcurrentHashMap<String, b> c;
    private ArrayList<Integer> d;

    /* compiled from: RequestControlUtil.java */
    private static class b {
        public int a;
        public String b;
        public long c;

        public b(long j, int i, String str) {
            this.c = j;
            this.a = i;
            this.b = str;
        }
    }

    /* compiled from: RequestControlUtil.java */
    /* renamed from: com.mbridge.msdk.foundation.same.net.utils.c$c, reason: collision with other inner class name */
    private static class C0041c {
        private static final c a = new c();
    }

    private List<Integer> a() {
        return Arrays.asList(-1, -10, -1201, -1202, -1203, -1205, -1206, -1208, -1301, -1302, -1305, -1306, -1307, -1915, 10602, 10603, 10604, 10609, 10610, 10616);
    }

    public static c b() {
        return C0041c.a;
    }

    private c() {
        this.a = "IDErrorUtil";
        this.c = new ConcurrentHashMap<>();
        this.d = new ArrayList<>();
        g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.m().b());
        gVarD = gVarD == null ? h.b().a() : gVarD;
        this.b = gVarD.t() * VideoFeedsPlayer.INTERVAL_TIME_PLAY_TIME_CD_THREAD;
        if (gVarD.x() == null || gVarD.x().size() <= 0) {
            o0.b("IDErrorUtil", "Setting ercd is EMPTY and use default code list.");
            this.d.addAll(a());
        } else {
            o0.b("IDErrorUtil", "Setting ercd not EMPTY will use setting.");
            this.d.addAll(gVarD.x());
        }
    }

    public synchronized void a(String str, int i, String str2, long j) {
        if (this.c.containsKey(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.d.contains(Integer.valueOf(i))) {
            o0.b("IDErrorUtil", "addErrorInfo : " + str + " " + str2);
            this.c.put(str, new b(j, i, str2));
        }
    }

    public e a(com.mbridge.msdk.foundation.same.net.wrapper.e eVar) {
        String str = (String) eVar.a().get("app_id");
        String str2 = (String) eVar.a().get("placement_id");
        String str3 = TextUtils.isEmpty(str2) ? BuildConfig.FLAVOR : str2;
        String strReplace = (String) eVar.a().get("unit_id");
        if (TextUtils.isEmpty(strReplace)) {
            strReplace = (String) eVar.a().get("unit_ids");
            if (!TextUtils.isEmpty(strReplace)) {
                strReplace = strReplace.replace("[", BuildConfig.FLAVOR).replace("]", BuildConfig.FLAVOR);
            }
        }
        String str4 = strReplace;
        String str5 = (String) eVar.a().get("ad_type");
        if (TextUtils.isEmpty(str5)) {
            str5 = "0";
        }
        return a(str, str4, str3, (String) eVar.a().get("token"), str5);
    }

    private e a(String str, String str2, String str3, String str4, String str5) {
        int i;
        String str6 = str + EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR + str3 + EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR + str2 + EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR + str5;
        b bVarA = a(str6);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.mbridge.msdk.tracker.network.g("data_res_type", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE));
        if (bVarA != null && !TextUtils.isEmpty(bVarA.b)) {
            try {
                if (bVarA.a != -1) {
                    return e.a(MintegralNetworkBridge.jsonObjectInit(bVarA.b), new com.mbridge.msdk.foundation.same.net.toolbox.a(ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION, bVarA.b.getBytes(), arrayList));
                }
                if (!TextUtils.isEmpty(str4)) {
                    return null;
                }
                if (str5 != null && !TextUtils.isEmpty(str5) && (i = Integer.parseInt(str5)) != 287 && i != 94) {
                    if (System.currentTimeMillis() < (h.b().c(str, str2).u() * VideoFeedsPlayer.INTERVAL_TIME_PLAY_TIME_CD_THREAD) + bVarA.c) {
                        return e.a(MintegralNetworkBridge.jsonObjectInit(bVarA.b), new com.mbridge.msdk.foundation.same.net.toolbox.a(ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION, bVarA.b.getBytes(), arrayList));
                    }
                    this.c.remove(str6);
                    return null;
                }
            } catch (Exception e) {
                o0.b("IDErrorUtil", e.getMessage());
            }
        }
        o0.b("IDErrorUtil", "getErrorInfo RETURN NULL");
        return null;
    }

    private synchronized b a(String str) {
        b bVar;
        o0.b("IDErrorUtil", "getErrorInfo : " + str);
        if (!this.c.containsKey(str) || (bVar = this.c.get(str)) == null) {
            return null;
        }
        if (bVar.a == -1) {
            return bVar;
        }
        if (System.currentTimeMillis() > bVar.c + this.b) {
            this.c.remove(str);
            if (this.c.size() > 0) {
                for (Map.Entry<String, b> entry : this.c.entrySet()) {
                    o0.b("IDErrorUtil", "getErrorInfo : delete timeout entry");
                    if (System.currentTimeMillis() - entry.getValue().c > this.b) {
                        this.c.remove(entry.getKey());
                    }
                }
            }
            return null;
        }
        o0.b("IDErrorUtil", "getErrorInfo : " + bVar.b);
        return bVar;
    }
}
