package com.google.android.gms.internal.ads;

import androidx.media3.extractor.metadata.icy.IcyHeaders;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzelp implements zzett {
    private final boolean zza;

    public zzelp(boolean z) {
        this.zza = z;
    }

    public final /* synthetic */ void zza(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzcut) obj).zza.putString("adid_p", true != this.zza ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
    }
}
