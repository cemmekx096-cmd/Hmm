package com.google.android.gms.internal.instantapps;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzal> CREATOR = new zzam();
    private final int zzag;
    private final String zzak;

    @Deprecated
    private final Account[] zzbj;
    private final boolean zzbk;

    zzal(int i, String str, Account[] accountArr, boolean z) {
        this.zzag = i;
        this.zzak = str;
        this.zzbj = accountArr;
        this.zzbk = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zzag);
        SafeParcelWriter.writeString(parcel, 3, this.zzak, false);
        SafeParcelWriter.writeTypedArray(parcel, 4, this.zzbj, i, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzbk);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
