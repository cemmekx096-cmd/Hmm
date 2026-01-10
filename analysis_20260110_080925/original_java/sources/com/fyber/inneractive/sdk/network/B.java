package com.fyber.inneractive.sdk.network;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.response.e;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Calendar;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class B {
    public SharedPreferences a = null;

    public static void a(Context context, String str, String str2, x xVar) throws JSONException {
        int i;
        if (context == null || str == null || xVar.c() == null) {
            IAlog.a("Invalid report request parameters!", new Object[0]);
            return;
        }
        B b = A.a;
        if (b.a == null) {
            b.a = context.getSharedPreferences("AutoWebActionPrefs", 0);
        }
        IAlog.e("IAautoWebActionReporter: reporting action: %s", new Object[]{str});
        IAlog.e("IAautoWebActionReporter: url: %s", new Object[]{str2});
        IAConfigManager iAConfigManager = IAConfigManager.O;
        if (!iAConfigManager.i.c) {
            IAlog.a("IAautoWebActionReporter: Report of Non user web actions disabled!", new Object[0]);
            return;
        }
        t tVar = t.MRAID_AUTO_ACTION_DETECTED;
        InneractiveAdRequest inneractiveAdRequest = xVar.a;
        e eVarC = xVar.c();
        JSONArray jSONArrayB = xVar.c.b();
        w wVar = new w(eVarC);
        wVar.b = tVar;
        wVar.a = inneractiveAdRequest;
        wVar.d = jSONArrayB;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", new Object[]{"action", str});
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject.put("url", str2);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", new Object[]{"url", str2});
            }
        }
        long j = b.a.getLong("lastReportTS", 0L);
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        Calendar calendar = Calendar.getInstance(timeZone);
        Calendar calendar2 = Calendar.getInstance(timeZone);
        calendar2.setTimeInMillis(j);
        if (j <= 0 || calendar.get(6) != calendar2.get(6)) {
            i = 0;
        } else {
            IAlog.e("IAautoWebActionReporter: encountered same date", new Object[0]);
            i = b.a.getInt("numReportsToday", 0);
        }
        int i2 = iAConfigManager.i.d;
        int i3 = i + 1;
        IAlog.e("IAautoWebActionReporter: day counter: %d max: %d", new Object[]{Integer.valueOf(i3), Integer.valueOf(i2)});
        if (i < i2) {
            IAlog.e("IAautoWebActionReporter: adding ad data", new Object[0]);
            wVar.g = true;
        } else {
            IAlog.e("IAautoWebActionReporter: not adding ad data", new Object[0]);
        }
        Integer numValueOf = Integer.valueOf(i3);
        try {
            jSONObject.put("daily_count", numValueOf);
        } catch (Exception unused3) {
            IAlog.f("Got exception adding param to json object: %s, %s", new Object[]{"daily_count", numValueOf});
        }
        wVar.f.put(jSONObject);
        wVar.a((String) null);
        SharedPreferences.Editor editorEdit = b.a.edit();
        editorEdit.putLong("lastReportTS", calendar.getTimeInMillis());
        editorEdit.putInt("numReportsToday", i3);
        editorEdit.apply();
    }
}
