package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
final class zzet extends zzcd {
    final /* synthetic */ PreloadCallback zza;

    zzet(zzey zzeyVar, PreloadCallback preloadCallback) {
        this.zza = preloadCallback;
    }

    public final void zze(zzfv zzfvVar) {
        PreloadConfiguration preloadConfigurationZzh = zzf.zzh(zzfvVar);
        if (preloadConfigurationZzh != null) {
            this.zza.onAdsAvailable(preloadConfigurationZzh);
        }
    }

    public final void zzf(zzfv zzfvVar) {
        PreloadConfiguration preloadConfigurationZzh = zzf.zzh(zzfvVar);
        if (preloadConfigurationZzh != null) {
            this.zza.onAdsExhausted(preloadConfigurationZzh);
        }
    }
}
