package com.google.android.gms.internal.instantapps;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.instantapps.PackageManagerCompat;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzan implements PackageManagerCompat {
    private static zzan zzbl;
    private final Context zzbh;
    private final boolean zzbm = true;

    private zzan(Context context, boolean z) {
        this.zzbh = context;
    }

    public static synchronized zzan zza(Context context, boolean z) {
        Context contextZza = zzm.zza(context);
        zzan zzanVar = zzbl;
        if (zzanVar == null || zzanVar.zzbh != contextZza || !zzanVar.zzbm) {
            zzbl = new zzan(contextZza, true);
        }
        return zzbl;
    }

    public final ApplicationInfo getApplicationInfo(String str, int i) throws PackageManager.NameNotFoundException {
        if (this.zzbm) {
            try {
                return this.zzbh.getPackageManager().getApplicationInfo(str, i);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        zzai zzaiVarZze = zzai.zze(this.zzbh);
        if (zzaiVarZze != null) {
            try {
                ApplicationInfo applicationInfo = zzaiVarZze.getApplicationInfo(str, i);
                if (applicationInfo != null) {
                    return applicationInfo;
                }
            } catch (RemoteException e) {
                Log.e("InstantAppsPMW", "Error getting application info", e);
            }
        }
        throw new PackageManager.NameNotFoundException();
    }

    public final CharSequence getApplicationLabel(ApplicationInfo applicationInfo) {
        if (this.zzbm && this.zzbh.getPackageManager().getPackagesForUid(applicationInfo.uid) != null) {
            return this.zzbh.getPackageManager().getApplicationLabel(applicationInfo);
        }
        zzai zzaiVarZze = zzai.zze(this.zzbh);
        if (zzaiVarZze == null) {
            return null;
        }
        try {
            return zzaiVarZze.zzb(applicationInfo.packageName);
        } catch (RemoteException e) {
            Log.e("InstantAppsPMW", "Error getting application label", e);
            return null;
        }
    }

    public final String getInstallerPackageName(String str) {
        if (this.zzbm) {
            try {
                return this.zzbh.getPackageManager().getInstallerPackageName(str);
            } catch (IllegalArgumentException e) {
                e = e;
            }
        } else {
            e = null;
        }
        zzai zzaiVarZze = zzai.zze(this.zzbh);
        if (zzaiVarZze != null) {
            try {
                if (zzaiVarZze.zza(str) != 0) {
                    return GooglePlayServicesUtilLight.GOOGLE_PLAY_STORE_PACKAGE;
                }
            } catch (RemoteException e2) {
                Log.e("InstantAppsPMW", "Error getting UID for app package", e2);
            }
        }
        if (e == null) {
            throw new IllegalArgumentException();
        }
        throw e;
    }

    public final byte[] getInstantAppCookie() {
        zzai zzaiVarZze = zzai.zze(this.zzbh);
        if (zzaiVarZze == null) {
            return null;
        }
        try {
            return zzaiVarZze.zzd(Process.myUid());
        } catch (RemoteException e) {
            Log.e("InstantAppsPMW", "Error setting cookie", e);
            return null;
        }
    }

    public final int getInstantAppCookieMaxSize() {
        zzai zzaiVarZze = zzai.zze(this.zzbh);
        if (zzaiVarZze == null) {
            return 0;
        }
        try {
            return zzaiVarZze.getInstantAppCookieMaxSize();
        } catch (RemoteException e) {
            Log.e("InstantAppsPMW", "Error fetching max cookie size", e);
            return 0;
        }
    }

    public final PackageInfo getPackageInfo(String str, int i) throws PackageManager.NameNotFoundException {
        if (this.zzbm) {
            try {
                return this.zzbh.getPackageManager().getPackageInfo(str, i);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        zzai zzaiVarZze = zzai.zze(this.zzbh);
        if (zzaiVarZze != null) {
            try {
                PackageInfo packageInfo = zzaiVarZze.getPackageInfo(str, i);
                if (packageInfo != null) {
                    return packageInfo;
                }
            } catch (RemoteException e) {
                Log.e("InstantAppsPMW", "Error getting package info", e);
            }
        }
        throw new PackageManager.NameNotFoundException();
    }

    public final String[] getPackagesForUid(int i) {
        String[] packagesForUid;
        if (this.zzbm && (packagesForUid = this.zzbh.getPackageManager().getPackagesForUid(i)) != null) {
            return packagesForUid;
        }
        zzai zzaiVarZze = zzai.zze(this.zzbh);
        if (zzaiVarZze != null) {
            try {
                String strZzc = zzaiVarZze.zzc(i);
                if (strZzc == null) {
                    return null;
                }
                return new String[]{strZzc};
            } catch (RemoteException e) {
                Log.e("InstantAppsPMW", "Error getting app package for UID", e);
            }
        }
        return null;
    }

    public final boolean isInstantApp() {
        return isInstantApp(this.zzbh.getPackageName());
    }

    public final boolean isInstantApp(String str) {
        zzai zzaiVarZze = zzai.zze(this.zzbh);
        if (zzaiVarZze == null) {
            return false;
        }
        try {
            return zzaiVarZze.isInstantApp(str);
        } catch (RemoteException e) {
            Log.e("InstantAppsPMW", "Error checking if app is instant app", e);
            return false;
        }
    }

    public final boolean setInstantAppCookie(byte[] bArr) {
        zzai zzaiVarZze = zzai.zze(this.zzbh);
        if (zzaiVarZze == null) {
            return false;
        }
        try {
            return zzaiVarZze.zza(Process.myUid(), bArr);
        } catch (RemoteException e) {
            Log.e("InstantAppsPMW", "Error setting cookie", e);
            return false;
        }
    }
}
