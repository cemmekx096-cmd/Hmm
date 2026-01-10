package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.k;
import com.fyber.inneractive.sdk.network.X;
import com.fyber.inneractive.sdk.network.c;
import com.fyber.inneractive.sdk.network.e;
import com.fyber.inneractive.sdk.network.f;
import com.mbridge.msdk.playercommon.VideoFeedsPlayer;
import java.lang.ref.WeakReference;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class d0 extends Handler {
    public final WeakReference a;

    public d0(Looper looper, f fVar) {
        super(looper);
        this.a = new WeakReference(fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v20, types: [org.json.JSONObject] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String string;
        super.handleMessage(message);
        f fVar = (e0) t.a(this.a);
        if (fVar != null) {
            f fVar2 = fVar;
            int i = message.what;
            if (i == 12312329 || i == 20150330) {
                if (fVar2.f && fVar2.a.size() > 0) {
                    while (true) {
                        string = null;
                        if (fVar2.a.size() <= 0) {
                            break;
                        }
                        try {
                            string = (JSONObject) fVar2.a.poll();
                        } catch (Throwable unused) {
                        }
                        if (string != null) {
                            fVar2.b.put(string);
                        }
                    }
                    if (fVar2.b.length() > 0) {
                        JSONArray jSONArray = fVar2.b;
                        int i2 = k.a;
                        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
                        String str = TextUtils.isEmpty(property) ? "https://" + IAConfigManager.O.i.f : Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$").matcher(property).matches() ? "https://" + property + "/simpleM2M/Event" : "https://" + property + ".inner-active.mobi/simpleM2M/Event";
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        try {
                            string = jSONArray.toString();
                        } catch (Throwable unused2) {
                        }
                        if (string != null) {
                            IAConfigManager.O.s.b(new X(new e(str, jSONArray, jCurrentTimeMillis), str, string));
                        }
                        fVar2.b = new JSONArray();
                    }
                }
                d0 d0Var = fVar2.d;
                if (d0Var != null) {
                    d0Var.removeMessages(12312329);
                    long j = fVar2.e * VideoFeedsPlayer.INTERVAL_TIME_PLAY_TIME_CD_THREAD;
                    d0 d0Var2 = fVar2.d;
                    if (d0Var2 != null) {
                        d0Var2.post(new c(fVar2, 12312329, j));
                    }
                }
            }
        }
    }
}
