package com.google.android.gms.internal.instantapps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import javax.annotation.Nullable;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzax> CREATOR = new zzay();
    private String packageName;

    @Nullable
    private BitmapTeleporter zzcg;
    private String zzch;
    private String zzci;
    private String zzcj;
    private ArrayList<String> zzck;

    @Nullable
    private zzk zzcl;

    public zzax(@Nullable BitmapTeleporter bitmapTeleporter, String str, String str2, String str3, String str4, Collection<String> collection, @Nullable zzk zzkVar) {
        this.zzcg = bitmapTeleporter;
        this.zzch = str;
        this.zzci = str2;
        this.zzcj = str3;
        this.packageName = str4;
        ArrayList<String> arrayList = new ArrayList<>(collection == null ? 0 : collection.size());
        this.zzck = arrayList;
        if (collection != null) {
            arrayList.addAll(collection);
        }
        this.zzcl = zzkVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzcg, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzch, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzci, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzcj, false);
        SafeParcelWriter.writeString(parcel, 6, this.packageName, false);
        SafeParcelWriter.writeStringList(parcel, 7, Collections.unmodifiableList(this.zzck), false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzcl, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
