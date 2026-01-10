package com.google.android.gms.internal.instantapps;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.instantapps.InstantAppIntentData;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzah {
    private static Boolean zzbc;
    private static ContentProviderClient zzbd;

    private static synchronized void reset() {
        ContentProviderClient contentProviderClient = zzbd;
        if (contentProviderClient != null) {
            contentProviderClient.release();
            zzbd = null;
        }
        zzbc = null;
    }

    private static synchronized Bundle zza(Context context, String str, String str2, Bundle bundle) throws RemoteException {
        if (zzbd == null) {
            return context.getContentResolver().call(zzj.zzac, str, str2, bundle);
        }
        return zza(str, str2, bundle);
    }

    private static synchronized Bundle zza(String str, String str2, Bundle bundle) throws RemoteException {
        return zzbd.call(str, str2, bundle);
    }

    static InstantAppIntentData zza(Context context, String str, Intent intent, zzas zzasVar, Bundle bundle) {
        return zza(context, str, intent, true, zzasVar, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static InstantAppIntentData zza(Context context, String str, Parcelable parcelable, boolean z, zzas zzasVar, Bundle bundle) {
        byte[] byteArray;
        while (context != null && str != null) {
            zzba zzbaVarZza = zzp.zza(1401);
            if (!zzc(context)) {
                return InstantAppIntentData.zze;
            }
            Bundle bundle2 = new Bundle();
            if (parcelable != null) {
                bundle2.putParcelable("key_fallbackIntent", parcelable);
            }
            if (zzasVar != 0) {
                bundle2.putByteArray("key_routingOptions", SafeParcelableSerializer.serializeToBytes(zzasVar));
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            try {
                Bundle bundleZza = zza(context, "method_getInstantAppIntentData", str, bundle2);
                if (bundleZza != null && (byteArray = bundleZza.getByteArray("key_instantAppIntentData")) != null) {
                    InstantAppIntentData instantAppIntentDataDeserializeFromBytes = SafeParcelableSerializer.deserializeFromBytes(byteArray, InstantAppIntentData.CREATOR);
                    if (instantAppIntentDataDeserializeFromBytes != null && instantAppIntentDataDeserializeFromBytes.getIntent() != null && instantAppIntentDataDeserializeFromBytes.getIntent().hasExtra("key_eventListProtoBytes")) {
                        Intent intent = instantAppIntentDataDeserializeFromBytes.getIntent();
                        zzba zzbaVarZza2 = zzp.zza(1402);
                        byte[] byteArrayExtra = intent.getByteArrayExtra("key_eventListProtoBytes");
                        zzaz zzazVarZzb = null;
                        if (byteArrayExtra != null) {
                            try {
                                zzazVarZzb = zzbk.zzb(new zzaz(), byteArrayExtra, 0, byteArrayExtra.length);
                            } catch (zzbj e) {
                                Log.e("EventLogHelper", "Could not read event list proto", e);
                            }
                        }
                        if (zzazVarZzb == null) {
                            zzazVarZzb = new zzaz();
                            zzazVarZzb.zzcm = new zzba[]{zzbaVarZza, zzbaVarZza2};
                        } else {
                            int length = zzazVarZzb.zzcm.length + 2;
                            ArrayList arrayList = new ArrayList(length);
                            arrayList.add(zzbaVarZza);
                            Collections.addAll(arrayList, zzazVarZzb.zzcm);
                            arrayList.add(zzbaVarZza2);
                            zzazVarZzb.zzcm = (zzba[]) arrayList.toArray(new zzba[length]);
                        }
                        int iZzp = zzazVarZzb.zzp();
                        byte[] bArr = new byte[iZzp];
                        zzbk.zza(zzazVarZzb, bArr, 0, iZzp);
                        intent.putExtra("key_eventListProtoBytes", bArr);
                    }
                    return instantAppIntentDataDeserializeFromBytes;
                }
                return InstantAppIntentData.zze;
            } catch (DeadObjectException e2) {
                Log.e("InstantAppsApi", String.format("While calling %s %s:\n", zzj.zzac, "method_getInstantAppIntentData"), e2);
                reset();
                if (!z) {
                    return InstantAppIntentData.zze;
                }
                z = false;
            } catch (RemoteException e3) {
                e = e3;
                Log.e("InstantAppsApi", String.format("While calling %s %s:\n", zzj.zzac, "method_getInstantAppIntentData"), e);
                return InstantAppIntentData.zze;
            } catch (IllegalArgumentException e4) {
                e = e4;
                Log.e("InstantAppsApi", String.format("While calling %s %s:\n", zzj.zzac, "method_getInstantAppIntentData"), e);
                return InstantAppIntentData.zze;
            }
        }
        throw new IllegalArgumentException("Parameter is null");
    }

    private static synchronized boolean zzb(Context context) {
        if (zzbd == null) {
            zzbd = context.getApplicationContext().getContentResolver().acquireUnstableContentProviderClient(zzj.zzac);
        }
        return zzbd != null;
    }

    static synchronized boolean zzc(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Parameter is null");
        }
        Boolean bool = zzbc;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean boolValueOf = Boolean.valueOf(zzd(context));
        zzbc = boolValueOf;
        return boolValueOf.booleanValue();
    }

    private static synchronized boolean zzd(Context context) {
        if (!zzaw.zzg(context)) {
            return false;
        }
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(zzj.zzac.getAuthority(), 0);
        if (providerInfoResolveContentProvider == null) {
            return false;
        }
        if (providerInfoResolveContentProvider.packageName.equals(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_PACKAGE)) {
            return Build.VERSION.SDK_INT < 17 || zzb(context);
        }
        String strValueOf = String.valueOf(providerInfoResolveContentProvider.packageName);
        Log.e("InstantAppsApi", strValueOf.length() != 0 ? "Incorrect package name for instant apps content provider: ".concat(strValueOf) : new String("Incorrect package name for instant apps content provider: "));
        return false;
    }
}
