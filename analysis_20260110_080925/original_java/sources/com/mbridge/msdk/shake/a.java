package com.mbridge.msdk.shake;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.o0;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import org.json.JSONObject;

/* compiled from: NativeShakeManager.java */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class a {
    private SensorManager a;

    /* compiled from: NativeShakeManager.java */
    private static class b {
        static a a = new a();
    }

    public static a a() {
        return b.a;
    }

    public void b(SensorEventListener sensorEventListener) {
        SensorManager sensorManager = this.a;
        if (sensorManager != null) {
            try {
                sensorManager.unregisterListener(sensorEventListener);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private a() {
    }

    public void a(SensorEventListener sensorEventListener) {
        a(sensorEventListener, null, 2);
    }

    public void a(SensorEventListener sensorEventListener, Sensor sensor, int i) {
        Context contextD = c.m().d();
        if (contextD != null) {
            try {
                if (this.a == null) {
                    this.a = (SensorManager) contextD.getSystemService("sensor");
                }
                if (sensor == null) {
                    sensor = this.a.getDefaultSensor(1);
                }
                this.a.registerListener(sensorEventListener, sensor, i);
            } catch (Exception e) {
                e.printStackTrace();
                a(contextD, e.getMessage());
            }
        }
    }

    private static void a(Context context, String str) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", "2000106");
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V)) {
                    jSONObject.put("b", com.mbridge.msdk.foundation.same.a.V);
                }
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.g)) {
                    jSONObject.put("c", com.mbridge.msdk.foundation.same.a.g);
                }
                jSONObject.put(AdOperationMetric.REASON, str);
                d.b().a(jSONObject);
            } catch (Throwable th) {
                o0.b("NativeShakeManager", th.getMessage());
            }
        }
    }
}
