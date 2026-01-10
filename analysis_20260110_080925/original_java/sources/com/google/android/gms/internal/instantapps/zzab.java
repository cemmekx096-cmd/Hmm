package com.google.android.gms.internal.instantapps;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
final class zzab extends zzad {
    private final /* synthetic */ zzz zzay;

    zzab(zzz zzzVar) {
        this.zzay = zzzVar;
    }

    @Override // com.google.android.gms.internal.instantapps.zzad
    public final void zza(Status status, ParcelFileDescriptor parcelFileDescriptor) {
        this.zzay.setResult(new zzac(this, parcelFileDescriptor, status));
    }
}
