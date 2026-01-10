package com.google.android.gms.internal.games_v2;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.ClientSettings;

/* compiled from: com.google.android.gms:play-services-games-v2@@21.0.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzf extends GoogleApi {
    private static final Api.AbstractClientBuilder zza;
    private static final Api.ClientKey zzb;
    private static final Api zzc;

    static {
        zzd zzdVar = new zzd();
        zza = zzdVar;
        Api.ClientKey clientKey = new Api.ClientKey();
        zzb = clientKey;
        zzc = new Api("Games.API", zzdVar, clientKey);
    }

    public zzf(Context context, com.google.android.gms.games.zzi zziVar) {
        super(context, zzc, zziVar, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public final ClientSettings.Builder createClientSettingsBuilder() {
        ClientSettings.Builder builderCreateClientSettingsBuilder = super.createClientSettingsBuilder();
        if (getApiOptions() != null) {
            String str = getApiOptions().zzk;
        }
        return builderCreateClientSettingsBuilder;
    }
}
