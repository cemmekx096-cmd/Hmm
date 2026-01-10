package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayr;
import com.google.android.gms.internal.ads.zzayt;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzdy extends zzayr implements zzea {
    zzdy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final Bundle zze() throws RemoteException {
        Parcel parcelZzda = zzda(5, zza());
        Bundle bundle = (Bundle) zzayt.zza(parcelZzda, Bundle.CREATOR);
        parcelZzda.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final zzv zzf() throws RemoteException {
        Parcel parcelZzda = zzda(4, zza());
        zzv zzvVarZza = zzayt.zza(parcelZzda, zzv.CREATOR);
        parcelZzda.recycle();
        return zzvVarZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final String zzg() throws RemoteException {
        Parcel parcelZzda = zzda(1, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final String zzh() throws RemoteException {
        Parcel parcelZzda = zzda(6, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final String zzi() throws RemoteException {
        Parcel parcelZzda = zzda(2, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final List zzj() throws RemoteException {
        Parcel parcelZzda = zzda(3, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzda.createTypedArrayList(zzv.CREATOR);
        parcelZzda.recycle();
        return arrayListCreateTypedArrayList;
    }
}
