package com.google.android.gms.internal.instantapps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzao> CREATOR = new zzap();
    private final String[] zzbn;
    private final String[] zzbo;
    private final String[] zzbp;
    private final String[] zzbq;

    public zzao(String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
        this.zzbn = strArr;
        this.zzbo = strArr2;
        this.zzbq = strArr3;
        this.zzbp = strArr4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, this.zzbn, false);
        SafeParcelWriter.writeStringArray(parcel, 2, this.zzbo, false);
        SafeParcelWriter.writeStringArray(parcel, 3, this.zzbp, false);
        SafeParcelWriter.writeStringArray(parcel, 4, this.zzbq, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
