package com.google.android.gms.internal.instantapps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzau extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzau> CREATOR = new zzav();
    private final String packageName;
    private final int versionCode;
    private final byte[] zzaa;
    private final String zzce;
    private final long zzcf;
    private final String zzw;

    public zzau(String str, int i, String str2, String str3, long j, byte[] bArr) {
        this.packageName = str;
        this.versionCode = i;
        this.zzce = str2;
        this.zzw = str3;
        this.zzcf = j;
        this.zzaa = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.packageName, false);
        SafeParcelWriter.writeInt(parcel, 2, this.versionCode);
        SafeParcelWriter.writeString(parcel, 3, this.zzce, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzw, false);
        SafeParcelWriter.writeLong(parcel, 5, this.zzcf);
        SafeParcelWriter.writeByteArray(parcel, 6, this.zzaa, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
