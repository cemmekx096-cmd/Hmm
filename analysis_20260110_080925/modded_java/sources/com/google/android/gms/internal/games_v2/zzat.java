package com.google.android.gms.internal.games_v2;

import android.app.Activity;
import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-games-v2@@21.0.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
final class zzat {
    static final zzat zza = new zzat();
    private boolean zzb;
    private boolean zzc;

    zzat() {
    }

    final boolean zza(Activity activity) throws PackageManager.NameNotFoundException {
        Bundle bundle;
        ApplicationInfo applicationInfo;
        if (this.zzc) {
            return this.zzb;
        }
        ActivityInfo activityInfo = null;
        try {
            applicationInfo = Wrappers.packageManager(activity).getApplicationInfo(activity.getPackageName(), RendererCapabilities.DECODER_SUPPORT_PRIMARY);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Bundle bundle2 = applicationInfo == null ? null : applicationInfo.metaData;
        boolean zEquals = false;
        if (bundle2 != null && bundle2.getString("com.epicgames.unreal.GameActivity.EngineVersion", BuildConfig.FLAVOR).startsWith("5.")) {
            try {
                activityInfo = activity.getPackageManager().getActivityInfo(new ComponentName(activity, "com.epicgames.unreal.GameActivity"), RendererCapabilities.DECODER_SUPPORT_PRIMARY);
            } catch (PackageManager.NameNotFoundException unused2) {
            }
            if (activityInfo != null && (bundle = activityInfo.metaData) != null) {
                zEquals = Objects.equals(bundle.getString("android.app.lib_name", BuildConfig.FLAVOR), "Unreal");
            }
        }
        this.zzb = zEquals;
        this.zzc = true;
        return zEquals;
    }
}
