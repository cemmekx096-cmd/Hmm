package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.crashlytics.android.BuildConfig;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public abstract class zzegi implements zzede {
    private static Bundle zzd(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final ListenableFuture zza(zzfcf zzfcfVar, zzfbt zzfbtVar) {
        JSONObject jSONObject = zzfbtVar.zzv;
        String strOptString = jSONObject.optString("pubid", BuildConfig.FLAVOR);
        zzfco zzfcoVar = zzfcfVar.zza.zza;
        zzfcm zzfcmVar = new zzfcm();
        zzfcmVar.zzq(zzfcoVar);
        zzfcmVar.zzt(strOptString);
        zzm zzmVar = zzfcoVar.zzd;
        Bundle bundleZzd = zzd(zzmVar.zzm);
        Bundle bundleZzd2 = zzd(bundleZzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        bundleZzd2.putInt("gw", 1);
        String strOptString2 = jSONObject.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundleZzd2.putString("mad_hac", strOptString2);
        }
        String strOptString3 = jSONObject.optString("adJson", null);
        if (strOptString3 != null) {
            bundleZzd2.putString("_ad", strOptString3);
        }
        bundleZzd2.putBoolean("_noRefresh", true);
        JSONObject jSONObject2 = zzfbtVar.zzD;
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = jSONObject2.optString(next, null);
            if (next != null) {
                bundleZzd2.putString(next, strOptString4);
            }
        }
        bundleZzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundleZzd2);
        zzfcmVar.zzH(new zzm(zzmVar.zza, zzmVar.zzb, bundleZzd2, zzmVar.zzd, zzmVar.zze, zzmVar.zzf, zzmVar.zzg, zzmVar.zzh, zzmVar.zzi, zzmVar.zzj, zzmVar.zzk, zzmVar.zzl, bundleZzd, zzmVar.zzn, zzmVar.zzo, zzmVar.zzp, zzmVar.zzq, zzmVar.zzr, zzmVar.zzs, zzmVar.zzt, zzmVar.zzu, zzmVar.zzv, zzmVar.zzw, zzmVar.zzx, zzmVar.zzy, zzmVar.zzz));
        zzfco zzfcoVarZzJ = zzfcmVar.zzJ();
        Bundle bundle = new Bundle();
        zzfbw zzfbwVar = zzfcfVar.zzb.zzb;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(zzfbwVar.zza));
        bundle2.putInt("refresh_interval", zzfbwVar.zzc);
        bundle2.putString("gws_query_id", zzfbwVar.zzb);
        bundle.putBundle("parent_common_config", bundle2);
        String str = zzfcoVar.zzf;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        bundle3.putString("allocation_id", zzfbtVar.zzw);
        bundle3.putString("ad_source_name", zzfbtVar.zzF);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(zzfbtVar.zzc));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(zzfbtVar.zzd));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzfbtVar.zzp));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(zzfbtVar.zzm));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(zzfbtVar.zzg));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(zzfbtVar.zzh));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(zzfbtVar.zzi));
        bundle3.putString("transaction_id", zzfbtVar.zzj);
        bundle3.putString("valid_from_timestamp", zzfbtVar.zzk);
        bundle3.putBoolean("is_closable_area_disabled", zzfbtVar.zzP);
        bundle3.putString("recursive_server_response_data", zzfbtVar.zzao);
        bundle3.putBoolean("is_analytics_logging_enabled", zzfbtVar.zzW);
        zzbwm zzbwmVar = zzfbtVar.zzl;
        if (zzbwmVar != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzbwmVar.zzb);
            bundle4.putString("rb_type", zzbwmVar.zza);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return zzc(zzfcoVarZzJ, bundle, zzfbtVar, zzfcfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final boolean zzb(zzfcf zzfcfVar, zzfbt zzfbtVar) {
        return !TextUtils.isEmpty(zzfbtVar.zzv.optString("pubid", BuildConfig.FLAVOR));
    }

    protected abstract ListenableFuture zzc(zzfco zzfcoVar, Bundle bundle, zzfbt zzfbtVar, zzfcf zzfcfVar);
}
