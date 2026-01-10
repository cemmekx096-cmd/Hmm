package com.applovin.impl;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.applovin.impl.b0$;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class b0 {
    private final SensorManager a = (SensorManager) com.applovin.impl.sdk.k.o().getSystemService("sensor");
    private Handler b;
    private final boolean c;

    public b0(com.applovin.impl.sdk.k kVar) {
        boolean zBooleanValue = ((Boolean) kVar.a(l4.Y)).booleanValue();
        this.c = zBooleanValue;
        if (zBooleanValue) {
            HandlerThread handlerThread = new HandlerThread("AppLovinSdk:background_sensor_manager");
            handlerThread.start();
            this.b = new Handler(handlerThread.getLooper());
        }
    }

    public Sensor a(int i) {
        return this.a.getDefaultSensor(i);
    }

    public void b(SensorEventListener sensorEventListener, Sensor sensor, int i) {
        if (this.c) {
            this.b.post(new b0$.ExternalSyntheticLambda1(this, sensorEventListener, sensor, i));
        } else {
            this.a.registerListener(sensorEventListener, sensor, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SensorEventListener sensorEventListener, Sensor sensor, int i) {
        this.a.registerListener(sensorEventListener, sensor, i, this.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SensorEventListener sensorEventListener) {
        this.a.unregisterListener(sensorEventListener);
    }

    public void b(SensorEventListener sensorEventListener) {
        if (this.c) {
            this.b.post(new b0$.ExternalSyntheticLambda0(this, sensorEventListener));
        } else {
            this.a.unregisterListener(sensorEventListener);
        }
    }
}
