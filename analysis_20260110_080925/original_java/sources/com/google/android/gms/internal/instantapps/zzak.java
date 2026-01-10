package com.google.android.gms.internal.instantapps;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.instantapps.InstantAppIntentData;
import com.google.android.gms.instantapps.InstantApps;
import com.google.android.gms.instantapps.LaunchData;
import com.google.android.gms.instantapps.Launcher;
import com.google.android.gms.tasks.Task;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzak implements Launcher {
    private static zzak zzbg;
    private final Context zzbh;
    private final zzw zzbi = new zzw();

    private zzak(Context context) {
        this.zzbh = context;
    }

    public static synchronized zzak zzf(Context context) {
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        zzak zzakVar = zzbg;
        if (zzakVar == null || zzakVar.zzbh != applicationContext) {
            zzbg = new zzak(applicationContext);
        }
        return zzbg;
    }

    public final InstantAppIntentData getInstantAppIntentData(String str, Intent intent) {
        return zzah.zza(this.zzbh, str, intent, new zzas(), Bundle.EMPTY);
    }

    public final Task<LaunchData> getInstantAppLaunchData(String str) {
        return InstantApps.getInstantAppsClient(this.zzbh).getInstantAppLaunchData(str);
    }

    public final boolean initializeIntentClient() {
        return zzah.zzc(this.zzbh);
    }
}
