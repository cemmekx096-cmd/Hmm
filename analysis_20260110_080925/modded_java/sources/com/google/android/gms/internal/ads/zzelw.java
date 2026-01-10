package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzm;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzelw implements zzett {
    final zzfco zza;
    private final long zzb;

    public zzelw(zzfco zzfcoVar, long j) {
        this.zza = zzfcoVar;
        this.zzb = j;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcut) obj).zzb;
        zzfco zzfcoVar = this.zza;
        bundle.putString("slotname", zzfcoVar.zzf);
        zzm zzmVar = zzfcoVar.zzd;
        if (zzmVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        int i = zzmVar.zzg;
        zzfdc.zze(bundle, "tag_for_child_directed_treatment", i, i != -1);
        if (zzmVar.zza >= 8) {
            int i2 = zzmVar.zzt;
            zzfdc.zze(bundle, "tag_for_under_age_of_consent", i2, i2 != -1);
        }
        zzfdc.zzc(bundle, "url", zzmVar.zzl);
        zzfdc.zzd(bundle, "neighboring_content_urls", zzmVar.zzv);
        Bundle bundle2 = zzmVar.zzc;
        Bundle bundle3 = (Bundle) bundle2.clone();
        HashSet hashSet = new HashSet(Arrays.asList(((String) zzbd.zzc().zzb(zzbdc.zzhJ)).split(",", -1)));
        for (String str : bundle2.keySet()) {
            if (!hashSet.contains(str)) {
                bundle3.remove(str);
            }
        }
        zzfdc.zzb(bundle, "extras", bundle3);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcut) obj).zza;
        zzfco zzfcoVar = this.zza;
        zzm zzmVar = zzfcoVar.zzd;
        bundle.putInt("http_timeout_millis", zzmVar.zzw);
        bundle.putString("slotname", zzfcoVar.zzf);
        int i = zzfcoVar.zzo.zza;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i2 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        bundle.putLong("start_signals_timestamp", this.zzb);
        zzfdc.zzg(bundle, "is_sdk_preload", true, zzmVar.zzc());
        zzfdc.zzf(bundle, "prefetch_type", "zenith_v2", zzmVar.zzd());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
        long j = zzmVar.zzb;
        zzfdc.zzf(bundle, "cust_age", simpleDateFormat.format(new Date(j)), j != -1);
        zzfdc.zzb(bundle, "extras", zzmVar.zzc);
        int i3 = zzmVar.zzd;
        zzfdc.zze(bundle, "cust_gender", i3, i3 != -1);
        zzfdc.zzd(bundle, "kw", zzmVar.zze);
        int i4 = zzmVar.zzg;
        zzfdc.zze(bundle, "tag_for_child_directed_treatment", i4, i4 != -1);
        if (zzmVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", zzmVar.zzy);
        int i5 = zzmVar.zza;
        zzfdc.zze(bundle, "d_imp_hdr", 1, i5 >= 2 && zzmVar.zzh);
        String str = zzmVar.zzi;
        zzfdc.zzf(bundle, "ppid", str, i5 >= 2 && !TextUtils.isEmpty(str));
        Location location = zzmVar.zzk;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = 1.0E7d * location.getLongitude();
            Bundle bundle2 = new Bundle();
            bundle2.putFloat("radius", accuracy);
            bundle2.putLong("lat", (long) latitude);
            bundle2.putLong("long", (long) longitude);
            bundle2.putLong("time", time);
            bundle.putBundle("uule", bundle2);
        }
        zzfdc.zzc(bundle, "url", zzmVar.zzl);
        zzfdc.zzd(bundle, "neighboring_content_urls", zzmVar.zzv);
        zzfdc.zzb(bundle, "custom_targeting", zzmVar.zzn);
        zzfdc.zzd(bundle, "category_exclusions", zzmVar.zzo);
        zzfdc.zzc(bundle, "request_agent", zzmVar.zzp);
        zzfdc.zzc(bundle, "request_pkg", zzmVar.zzq);
        zzfdc.zzg(bundle, "is_designed_for_families", zzmVar.zzr, i5 >= 7);
        if (i5 >= 8) {
            int i6 = zzmVar.zzt;
            zzfdc.zze(bundle, "tag_for_under_age_of_consent", i6, i6 != -1);
            zzfdc.zzc(bundle, "max_ad_content_rating", zzmVar.zzu);
        }
    }
}
