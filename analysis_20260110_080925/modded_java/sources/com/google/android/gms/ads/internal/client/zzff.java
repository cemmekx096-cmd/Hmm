package com.google.android.gms.ads.internal.client;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.crashlytics.android.BuildConfig;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbgk;
import com.google.android.gms.internal.ads.zzbhh;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzff implements MediaContent {
    private final zzbgk zza;
    private final VideoController zzb = new VideoController();
    private final zzbhh zzc;

    public zzff(zzbgk zzbgkVar, zzbhh zzbhhVar) {
        this.zza = zzbgkVar;
        this.zzc = zzbhhVar;
    }

    public final float getAspectRatio() {
        try {
            return this.zza.zze();
        } catch (RemoteException e) {
            zzo.zzh(BuildConfig.FLAVOR, e);
            return 0.0f;
        }
    }

    public final float getCurrentTime() {
        try {
            return this.zza.zzf();
        } catch (RemoteException e) {
            zzo.zzh(BuildConfig.FLAVOR, e);
            return 0.0f;
        }
    }

    public final float getDuration() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e) {
            zzo.zzh(BuildConfig.FLAVOR, e);
            return 0.0f;
        }
    }

    public final Drawable getMainImage() {
        try {
            IObjectWrapper iObjectWrapperZzi = this.zza.zzi();
            if (iObjectWrapperZzi != null) {
                return (Drawable) ObjectWrapper.unwrap(iObjectWrapperZzi);
            }
            return null;
        } catch (RemoteException e) {
            zzo.zzh(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            zzbgk zzbgkVar = this.zza;
            if (zzbgkVar.zzh() != null) {
                this.zzb.zzb(zzbgkVar.zzh());
            }
        } catch (RemoteException e) {
            zzo.zzh("Exception occurred while getting video controller", e);
        }
        return this.zzb;
    }

    public final boolean hasVideoContent() {
        try {
            return this.zza.zzl();
        } catch (RemoteException e) {
            zzo.zzh(BuildConfig.FLAVOR, e);
            return false;
        }
    }

    public final void setMainImage(Drawable drawable) {
        try {
            this.zza.zzj(ObjectWrapper.wrap(drawable));
        } catch (RemoteException e) {
            zzo.zzh(BuildConfig.FLAVOR, e);
        }
    }

    public final zzbhh zza() {
        return this.zzc;
    }

    public final boolean zzb() {
        try {
            return this.zza.zzk();
        } catch (RemoteException e) {
            zzo.zzh(BuildConfig.FLAVOR, e);
            return false;
        }
    }

    public final zzbgk zzc() {
        return this.zza;
    }
}
