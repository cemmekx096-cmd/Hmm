package com.google.android.gms.internal.instantapps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.Nullable;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzas extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzas> CREATOR = new zzat();
    private boolean zzbx;

    @Nullable
    private String zzby;
    private boolean zzbz;
    private boolean zzca;
    private boolean zzcb;
    private boolean zzcc;
    private boolean zzcd;

    public zzas() {
    }

    zzas(boolean z, @Nullable String str, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.zzbx = z;
        this.zzby = str;
        this.zzbz = z2;
        this.zzca = z3;
        this.zzcb = z4;
        this.zzcc = z5;
        this.zzcd = z6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zzbx);
        SafeParcelWriter.writeString(parcel, 2, this.zzby, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzbz);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzca);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzcb);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzcc);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzcd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
