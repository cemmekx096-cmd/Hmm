package com.google.android.gms.internal.instantapps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.Nullable;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzaq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaq> CREATOR = new zzar();
    private final int port;
    private final String zzbr;

    @Nullable
    private final String zzbs;

    @Nullable
    private final String zzbt;

    @Nullable
    private final String zzbu;

    @Nullable
    private final String zzbv;
    private final String zzbw;
    private final String zzv;

    public zzaq(String str, int i, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, String str6, String str7) {
        this.zzbr = Preconditions.checkNotEmpty(str);
        this.port = i;
        this.zzbs = str2;
        this.zzbt = str3;
        this.zzbu = str4;
        this.zzbv = str5;
        this.zzv = str6;
        this.zzbw = str7;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzbr, false);
        SafeParcelWriter.writeInt(parcel, 3, this.port);
        SafeParcelWriter.writeString(parcel, 4, this.zzbs, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzbt, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzbu, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzv, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzbw, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzbu, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
