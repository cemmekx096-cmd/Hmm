package com.google.android.gms.internal.instantapps;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtilLight;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzai {
    private static zzai zzbe;
    private final Context mContext;

    private zzai(Context context) {
        this.mContext = context;
    }

    private final Bundle zza(String str, Bundle bundle) throws RemoteException {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            Bundle bundleCall = this.mContext.getContentResolver().call(zzaj.zzbf, str, (String) null, bundle);
            if (bundleCall != null) {
                return bundleCall;
            }
            throw new RemoteException();
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public static synchronized zzai zze(Context context) {
        ProviderInfo providerInfoResolveContentProvider;
        Context contextZza = zzm.zza(context);
        zzai zzaiVar = zzbe;
        if (zzaiVar == null || zzaiVar.mContext != contextZza) {
            zzai zzaiVar2 = null;
            if ((Build.VERSION.SDK_INT >= 16) && zzaw.zzg(contextZza) && (providerInfoResolveContentProvider = contextZza.getPackageManager().resolveContentProvider(zzaj.zzbf.getAuthority(), 0)) != null) {
                if (providerInfoResolveContentProvider.packageName.equals(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_PACKAGE)) {
                    zzaiVar2 = new zzai(contextZza);
                } else {
                    String str = providerInfoResolveContentProvider.packageName;
                    Log.e("IAMetadataClient", new StringBuilder(String.valueOf(str).length() + 85).append("Package ").append(str).append(" is invalid for instant apps content provider; instant apps will be disabled.").toString());
                }
            }
            zzbe = zzaiVar2;
        }
        return zzbe;
    }

    public final ApplicationInfo getApplicationInfo(String str, int i) throws RemoteException {
        Bundle bundle = new Bundle();
        bundle.putString("packageName", str);
        bundle.putInt("flags", i);
        return (ApplicationInfo) zza("getWHApplicationInfo", bundle).getParcelable("result");
    }

    public final int getInstantAppCookieMaxSize() throws RemoteException {
        return zza("getInstantAppCookieMaxSize", new Bundle()).getInt("result");
    }

    public final PackageInfo getPackageInfo(String str, int i) throws RemoteException {
        Bundle bundle = new Bundle();
        bundle.putString("packageName", str);
        bundle.putInt("flags", i);
        return (PackageInfo) zza("getWHPackageInfo", bundle).getParcelable("result");
    }

    public final boolean isInstantApp(String str) throws RemoteException {
        Bundle bundle = new Bundle();
        bundle.putString("packageName", str);
        return zza("isInstantApp", bundle).getBoolean("result");
    }

    public final int zza(String str) throws RemoteException {
        Bundle bundle = new Bundle();
        bundle.putString("packageName", str);
        return zza("getUidForPackage", bundle).getInt("result");
    }

    public final boolean zza(int i, byte[] bArr) throws RemoteException {
        Bundle bundle = new Bundle();
        bundle.putInt("uid", i);
        bundle.putByteArray("cookie", bArr);
        return zza("setInstantAppCookie", bundle).getBoolean("result");
    }

    public final String zzb(String str) throws RemoteException {
        Bundle bundle = new Bundle();
        bundle.putString("packageName", str);
        return zza("getApplicationLabel", bundle).getString("result");
    }

    public final ComponentName zzc(String str) throws RemoteException {
        Bundle bundle = new Bundle();
        bundle.putString("shadowActivity", str);
        return (ComponentName) zza("getCallingActivity", bundle).getParcelable("result");
    }

    public final String zzc(int i) throws RemoteException {
        Bundle bundle = new Bundle();
        bundle.putInt("uid", i);
        return zza("getAppPackageForUid", bundle).getString("result");
    }

    public final byte[] zzd(int i) throws RemoteException {
        Bundle bundle = new Bundle();
        bundle.putInt("uid", i);
        return zza("getInstantAppCookie", bundle).getByteArray("result");
    }
}
