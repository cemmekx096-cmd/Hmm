package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzaa;
import com.google.android.gms.ads.internal.overlay.zzad;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzeet implements zzede {
    private final Context zza;
    private final zzdfy zzb;
    private final Executor zzc;
    private final zzfbs zzd;
    private final zzdsc zze;

    public zzeet(Context context, Executor executor, zzdfy zzdfyVar, zzfbs zzfbsVar, zzdsc zzdscVar) {
        this.zza = context;
        this.zzb = zzdfyVar;
        this.zzc = executor;
        this.zzd = zzfbsVar;
        this.zze = zzdscVar;
    }

    public static /* synthetic */ ListenableFuture zzd(zzeet zzeetVar, Uri uri, zzfcf zzfcfVar, zzfbt zzfbtVar, zzfbw zzfbwVar, Object obj) {
        try {
            CustomTabsIntent customTabsIntentBuild = new CustomTabsIntent.Builder().build();
            customTabsIntentBuild.intent.setData(uri);
            zzc zzcVar = new zzc(customTabsIntentBuild.intent, (zzaa) null);
            zzcai zzcaiVar = new zzcai();
            zzdev zzdevVarZzd = zzeetVar.zzb.zzd(new zzcrl(zzfcfVar, zzfbtVar, (String) null), new zzdey(new zzees(zzeetVar, zzcaiVar, zzfbtVar), (zzcfe) null));
            zzcaiVar.zzc(new AdOverlayInfoParcel(zzcVar, (zza) null, zzdevVarZzd.zza(), (zzad) null, new VersionInfoParcel(0, 0, false), (zzcfe) null, (zzddw) null, zzfbwVar.zzb));
            zzeetVar.zzd.zza();
            return zzgdb.zzh(zzdevVarZzd.zzg());
        } catch (Throwable th) {
            int i = zze.zza;
            zzo.zzh("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }

    private static String zze(zzfbt zzfbtVar) {
        try {
            return zzfbtVar.zzv.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final ListenableFuture zza(final zzfcf zzfcfVar, final zzfbt zzfbtVar) {
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zznl)).booleanValue()) {
            zzdsb zzdsbVarZza = this.zze.zza();
            zzdsbVarZza.zzb("action", "cstm_tbs_rndr");
            zzdsbVarZza.zzj();
        }
        String strZze = zze(zzfbtVar);
        final Uri uri = strZze != null ? Uri.parse(strZze) : null;
        final zzfbw zzfbwVar = zzfcfVar.zzb.zzb;
        return zzgdb.zzn(zzgdb.zzh((Object) null), new zzgci() { // from class: com.google.android.gms.internal.ads.zzeer
            public final ListenableFuture zza(Object obj) {
                return zzeet.zzd(this.zza, uri, zzfcfVar, zzfbtVar, zzfbwVar, obj);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final boolean zzb(zzfcf zzfcfVar, zzfbt zzfbtVar) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbed.zzg(context) && !TextUtils.isEmpty(zze(zzfbtVar));
    }
}
