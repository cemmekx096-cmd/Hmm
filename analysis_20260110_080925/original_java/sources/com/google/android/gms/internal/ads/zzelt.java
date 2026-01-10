package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.zzv;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import io.ktor.http.ContentDisposition;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzelt implements zzett {
    public final Context zza;
    public final zzr zzb;
    public final List zzc;

    public zzelt(Context context, zzr zzrVar, List list) {
        this.zza = context;
        this.zzb = zzrVar;
        this.zzc = list;
    }

    public final /* synthetic */ void zza(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        zzcut zzcutVar = (zzcut) obj;
        if (((Boolean) zzbff.zza.zze()).booleanValue()) {
            Bundle bundle = new Bundle();
            zzv.zzr();
            String className = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.zza.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && runningTaskInfo.topActivity != null) {
                    className = runningTaskInfo.topActivity.getClassName();
                }
            } catch (Exception unused) {
            }
            bundle.putString("activity", className);
            Bundle bundle2 = new Bundle();
            zzr zzrVar = this.zzb;
            bundle2.putInt(SettingsJsonConstants.ICON_WIDTH_KEY, zzrVar.zze);
            bundle2.putInt(SettingsJsonConstants.ICON_HEIGHT_KEY, zzrVar.zzb);
            bundle.putBundle(ContentDisposition.Parameters.Size, bundle2);
            List list = this.zzc;
            if (!list.isEmpty()) {
                bundle.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            zzcutVar.zza.putBundle("view_hierarchy", bundle);
        }
    }
}
