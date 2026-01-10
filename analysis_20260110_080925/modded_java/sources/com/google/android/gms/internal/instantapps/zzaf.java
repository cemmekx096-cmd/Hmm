package com.google.android.gms.internal.instantapps;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.instantapps.LaunchData;
import com.google.android.gms.instantapps.zze;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
final class zzaf implements zze {
    private final Status zzba;
    private final LaunchData zzbb;

    zzaf(Status status, LaunchData launchData) {
        this.zzba = status;
        this.zzbb = launchData;
    }

    public final Status getStatus() {
        return this.zzba;
    }

    public final LaunchData zzb() {
        return this.zzbb;
    }
}
