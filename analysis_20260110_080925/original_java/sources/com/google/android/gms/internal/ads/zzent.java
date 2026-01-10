package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ext.SdkExtensions;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzent implements zzett {

    @Nullable
    private final Integer zza;

    private zzent(@Nullable Integer num) {
        this.zza = num;
    }

    static /* bridge */ /* synthetic */ zzent zzc(VersionInfoParcel versionInfoParcel) {
        if (!((Boolean) zzbd.zzc().zzb(zzbdc.zzkn)).booleanValue()) {
            return new zzent(null);
        }
        zzv.zzr();
        int extensionVersion = 0;
        try {
            if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
                if (((Boolean) zzbd.zzc().zzb(zzbdc.zzkq)).booleanValue()) {
                    if (versionInfoParcel.clientJarVersion >= ((Integer) zzbd.zzc().zzb(zzbdc.zzkp)).intValue() && Build.VERSION.SDK_INT >= 31 && SdkExtensions.getExtensionVersion(31) >= 9) {
                        extensionVersion = SdkExtensions.getExtensionVersion(31);
                    }
                }
            } else {
                extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            }
        } catch (Exception e) {
            zzv.zzp().zzw(e, "AdUtil.getAdServicesExtensionVersion");
        }
        return new zzent(Integer.valueOf(extensionVersion));
    }

    public final /* synthetic */ void zza(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Integer num = this.zza;
        zzcut zzcutVar = (zzcut) obj;
        if (num != null) {
            zzcutVar.zza.putInt("aos", num.intValue());
        }
    }
}
