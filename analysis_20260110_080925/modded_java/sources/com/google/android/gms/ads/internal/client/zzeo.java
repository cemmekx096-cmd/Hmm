package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.preload.zzb;
import com.google.android.gms.internal.ads.zzbaq;
import com.google.android.gms.internal.ads.zzbau;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzeo extends zzb {
    public zzeo(Context context) {
        super(context, AdFormat.APP_OPEN_AD);
    }

    public final AppOpenAd zza(String str) {
        zzbau zzbauVarZzg;
        try {
            zzbauVarZzg = this.zza.zzg(str);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            zzbauVarZzg = null;
        }
        if (zzbauVarZzg == null) {
            return null;
        }
        return new zzbaq(zzbauVarZzg);
    }
}
