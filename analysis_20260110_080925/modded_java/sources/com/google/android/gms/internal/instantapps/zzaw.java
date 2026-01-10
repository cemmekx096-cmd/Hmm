package com.google.android.gms.internal.instantapps;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
final class zzaw {
    static boolean zzg(Context context) throws PackageManager.NameNotFoundException {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_PACKAGE, 64);
            if (GoogleSignatureVerifier.getInstance(context).isGooglePublicSignedPackage(packageInfo)) {
                return true;
            }
            String strValueOf = String.valueOf(packageInfo.packageName);
            Log.e("InstantAppsApi", strValueOf.length() != 0 ? "Incorrect signature for package ".concat(strValueOf) : new String("Incorrect signature for package "));
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
