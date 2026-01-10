package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzepd implements zzhfy {
    public static zzepd zza() {
        return zzepc.zza;
    }

    public final /* synthetic */ Object zzb() {
        List arrayList = new ArrayList();
        zzbct zzbctVar = zzbdc.zzlX;
        if (!((String) zzbd.zzc().zzb(zzbctVar)).isEmpty()) {
            arrayList = Arrays.asList(((String) zzbd.zzc().zzb(zzbctVar)).split(","));
        }
        zzhgg.zzb(arrayList);
        return arrayList;
    }
}
