package com.google.android.gms.internal.instantapps;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.instantapps.zzd;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
final class zzac implements zzd {
    private final /* synthetic */ Status zzax;
    private final /* synthetic */ ParcelFileDescriptor zzaz;

    zzac(zzab zzabVar, ParcelFileDescriptor parcelFileDescriptor, Status status) {
        this.zzaz = parcelFileDescriptor;
        this.zzax = status;
    }

    public final Status getStatus() {
        return this.zzax;
    }

    public final ParcelFileDescriptor zza() {
        return this.zzaz;
    }
}
