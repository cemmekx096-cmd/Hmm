package com.google.android.gms.internal.instantapps;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.ironsource.adqualitysdk.sdk.R;
import javax.annotation.Nullable;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzag extends GmsClient<zzs> {
    public zzag(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, R.styleable.AppCompatTheme_windowFixedHeightMinor, ClientSettings.createDefault(context), connectionCallbacks, onConnectionFailedListener);
    }

    @Nullable
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        zzs zzsVarQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.instantapps.internal.IInstantAppsService");
        return zzsVarQueryLocalInterface instanceof zzs ? zzsVarQueryLocalInterface : new zzt(iBinder);
    }

    public final int getMinApkVersion() {
        return 12451000;
    }

    protected final String getServiceDescriptor() {
        return "com.google.android.gms.instantapps.internal.IInstantAppsService";
    }

    protected final String getStartServiceAction() {
        return "com.google.android.gms.instantapps.START";
    }
}
