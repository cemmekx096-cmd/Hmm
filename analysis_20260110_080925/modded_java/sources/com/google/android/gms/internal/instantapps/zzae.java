package com.google.android.gms.internal.instantapps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.instantapps.InstantApps;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
abstract class zzae<R extends Result> extends BaseImplementation.ApiMethodImpl<R, zzag> {
    zzae(GoogleApiClient googleApiClient) {
        super(InstantApps.API, googleApiClient);
    }

    protected /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        zzag zzagVar = (zzag) anyClient;
        zza(zzagVar.getContext(), zzagVar.getService());
    }

    protected abstract void zza(Context context, zzs zzsVar) throws RemoteException;
}
