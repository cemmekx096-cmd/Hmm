package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.crashlytics.android.BuildConfig;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzect implements zzecu {
    static /* synthetic */ zzecz zzc(String str, String str2, String str3, zzecv zzecvVar, String str4, WebView webView, String str5, String str6, zzecw zzecwVar) {
        zzflq zzflqVarZza = zzflq.zza("Google", str2);
        zzflp zzflpVarZzp = zzp("javascript");
        zzfli zzfliVarZzn = zzn(zzecvVar.toString());
        zzflp zzflpVar = zzflp.zzc;
        if (zzflpVarZzp == zzflpVar) {
            int i = zze.zza;
            zzo.zzj("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfliVarZzn == null) {
            String strValueOf = String.valueOf(String.valueOf(zzecvVar));
            int i2 = zze.zza;
            zzo.zzj("Omid html session error; Unable to parse creative type: ".concat(strValueOf));
            return null;
        }
        zzflp zzflpVarZzp2 = zzp(str4);
        if (zzfliVarZzn != zzfli.zzd || zzflpVarZzp2 != zzflpVar) {
            zzflf zzflfVarZzb = zzflf.zzb(zzflqVarZza, webView, str5, BuildConfig.FLAVOR);
            return new zzecz(zzfld.zza(zzfle.zza(zzfliVarZzn, zzo(zzecwVar.toString()), zzflpVarZzp, zzflpVarZzp2, true), zzflfVarZzb), zzflfVarZzb);
        }
        String strValueOf2 = String.valueOf(str4);
        int i3 = zze.zza;
        zzo.zzj("Omid html session error; Video events owner unknown for video creative: ".concat(strValueOf2));
        return null;
    }

    static /* synthetic */ zzecz zzd(String str, String str2, String str3, String str4, zzecv zzecvVar, WebView webView, String str5, String str6, zzecw zzecwVar) {
        zzflq zzflqVarZza = zzflq.zza(str, str2);
        zzflp zzflpVarZzp = zzp("javascript");
        zzflp zzflpVarZzp2 = zzp(str4);
        zzfli zzfliVarZzn = zzn(zzecvVar.toString());
        zzflp zzflpVar = zzflp.zzc;
        if (zzflpVarZzp == zzflpVar) {
            int i = zze.zza;
            zzo.zzj("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfliVarZzn == null) {
            String strValueOf = String.valueOf(String.valueOf(zzecvVar));
            int i2 = zze.zza;
            zzo.zzj("Omid js session error; Unable to parse creative type: ".concat(strValueOf));
            return null;
        }
        if (zzfliVarZzn != zzfli.zzd || zzflpVarZzp2 != zzflpVar) {
            zzflf zzflfVarZzc = zzflf.zzc(zzflqVarZza, webView, str5, BuildConfig.FLAVOR);
            return new zzecz(zzfld.zza(zzfle.zza(zzfliVarZzn, zzo(zzecwVar.toString()), zzflpVarZzp, zzflpVarZzp2, true), zzflfVarZzc), zzflfVarZzc);
        }
        String strValueOf2 = String.valueOf(str4);
        int i3 = zze.zza;
        zzo.zzj("Omid js session error; Video events owner unknown for video creative: ".concat(strValueOf2));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzfli zzn(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -382745961(0xffffffffe92fc297, float:-1.3280059E25)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L2a
            r1 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r0 == r1) goto L20
            r1 = 714893483(0x2a9c68ab, float:2.7783795E-13)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "nativeDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r3
            goto L35
        L20:
            java.lang.String r0 = "video"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r2
            goto L35
        L2a:
            java.lang.String r0 = "htmlDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L43
            if (r4 == r3) goto L40
            if (r4 == r2) goto L3d
            r4 = 0
            return r4
        L3d:
            com.google.android.gms.internal.ads.zzfli r4 = com.google.android.gms.internal.ads.zzfli.zzd
            return r4
        L40:
            com.google.android.gms.internal.ads.zzfli r4 = com.google.android.gms.internal.ads.zzfli.zzc
            return r4
        L43:
            com.google.android.gms.internal.ads.zzfli r4 = com.google.android.gms.internal.ads.zzfli.zzb
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzect.zzn(java.lang.String):com.google.android.gms.internal.ads.zzfli");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzfll zzo(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1104128070(0xffffffffbe3057ba, float:-0.17220965)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L2a
            r1 = 1318088141(0x4e906dcd, float:1.2115575E9)
            if (r0 == r1) goto L20
            r1 = 1988248512(0x768243c0, float:1.3210405E33)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "onePixel"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r2
            goto L35
        L20:
            java.lang.String r0 = "definedByJavascript"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r3
            goto L35
        L2a:
            java.lang.String r0 = "beginToRender"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L44
            if (r4 == r3) goto L41
            if (r4 == r2) goto L3e
            com.google.android.gms.internal.ads.zzfll r4 = com.google.android.gms.internal.ads.zzfll.zzb
            goto L46
        L3e:
            com.google.android.gms.internal.ads.zzfll r4 = com.google.android.gms.internal.ads.zzfll.zze
            goto L46
        L41:
            com.google.android.gms.internal.ads.zzfll r4 = com.google.android.gms.internal.ads.zzfll.zza
            goto L46
        L44:
            com.google.android.gms.internal.ads.zzfll r4 = com.google.android.gms.internal.ads.zzfll.zzd
        L46:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzect.zzo(java.lang.String):com.google.android.gms.internal.ads.zzfll");
    }

    private static zzflp zzp(String str) {
        return "native".equals(str) ? zzflp.zza : "javascript".equals(str) ? zzflp.zzb : zzflp.zzc;
    }

    private static final Object zzq(zzecs zzecsVar) {
        try {
            return zzecsVar.zza();
        } catch (RuntimeException e) {
            zzv.zzp().zzv(e, "omid exception");
            return null;
        }
    }

    private static final void zzr(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            zzv.zzp().zzv(e, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzecu
    public final zzecz zza(String str, WebView webView, String str2, String str3, String str4, zzecw zzecwVar, zzecv zzecvVar, String str5) {
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzfu)).booleanValue() && zzflb.zzb()) {
            return (zzecz) zzq(new zzeci("Google", str, "javascript", zzecvVar, str4, webView, str5, BuildConfig.FLAVOR, zzecwVar));
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzecu
    public final zzecz zzb(String str, WebView webView, String str2, String str3, String str4, String str5, zzecw zzecwVar, zzecv zzecvVar, String str6) {
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzfu)).booleanValue() && zzflb.zzb()) {
            return (zzecz) zzq(new zzecl(str5, str, "javascript", str4, zzecvVar, webView, str6, BuildConfig.FLAVOR, zzecwVar));
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzecu
    public final zzflo zze(final VersionInfoParcel versionInfoParcel, final WebView webView, boolean z) {
        final boolean z2 = true;
        return (zzflo) zzq(new zzecs(versionInfoParcel, webView, z2) { // from class: com.google.android.gms.internal.ads.zzecq
            public final /* synthetic */ VersionInfoParcel zza;
            public final /* synthetic */ WebView zzb;

            @Override // com.google.android.gms.internal.ads.zzecs
            public final Object zza() {
                VersionInfoParcel versionInfoParcel2 = this.zza;
                return zzflo.zzb(zzflq.zza("Google", versionInfoParcel2.buddyApkVersion + "." + versionInfoParcel2.clientJarVersion), this.zzb, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzecu
    public final String zzf(Context context) {
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzfu)).booleanValue()) {
            return (String) zzq(new zzecs() { // from class: com.google.android.gms.internal.ads.zzeco
                @Override // com.google.android.gms.internal.ads.zzecs
                public final Object zza() {
                    return "a.1.5.2-google_20241009";
                }
            });
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzecu
    public final void zzg(zzfld zzfldVar, View view) {
        zzr(new zzech(zzfldVar, view));
    }

    @Override // com.google.android.gms.internal.ads.zzecu
    public final void zzh(final zzflo zzfloVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecn
            @Override // java.lang.Runnable
            public final void run() {
                zzfloVar.zzf(view, zzflk.zzc, "Ad overlay");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzecu
    public final void zzi(final zzfld zzfldVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecr
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) zzbd.zzc().zzb(zzbdc.zzfu)).booleanValue() && zzflb.zzb()) {
                    zzfldVar.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzecu
    public final void zzj(zzfld zzfldVar, View view) {
        zzr(new zzecj(zzfldVar, view));
    }

    @Override // com.google.android.gms.internal.ads.zzecu
    public final void zzk(zzfld zzfldVar) {
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzfu)).booleanValue() && zzflb.zzb()) {
            Objects.requireNonNull(zzfldVar);
            zzr(new zzeck(zzfldVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzecu
    public final boolean zzl(Context context) {
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzfu)).booleanValue()) {
            Boolean bool = (Boolean) zzq(new zzecm(context));
            return bool != null && bool.booleanValue();
        }
        int i = zze.zza;
        zzo.zzj("Omid flag is disabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzecu
    public final void zzm(final zzflo zzfloVar, final zzcfv zzcfvVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecp
            @Override // java.lang.Runnable
            public final void run() {
                zzfloVar.zzg(zzcfvVar);
            }
        });
    }
}
