package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzfg extends RemoteCreator {
    public zzfg() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        zzdc zzdcVarQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return zzdcVarQueryLocalInterface instanceof zzdc ? zzdcVarQueryLocalInterface : new zzdc(iBinder);
    }

    public final zzdb zza(Context context) {
        try {
            IBinder iBinderZze = ((zzdc) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), 252130000);
            if (iBinderZze == null) {
                return null;
            }
            zzdb zzdbVarQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return zzdbVarQueryLocalInterface instanceof zzdb ? zzdbVarQueryLocalInterface : new zzcz(iBinderZze);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzo.zzk("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }
}
