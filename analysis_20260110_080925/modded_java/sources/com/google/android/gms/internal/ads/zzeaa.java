package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.crashlytics.android.BuildConfig;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzeaa implements zzffw {
    private static final Pattern zza = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zzb;
    private final zzfhb zzc;
    private final zzfhm zzd;

    public zzeaa(String str, zzfhm zzfhmVar, zzfhb zzfhbVar) {
        this.zzb = str;
        this.zzd = zzfhmVar;
        this.zzc = zzfhbVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.ads.zzdwe */
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        zzdwe zzdweVar;
        JSONObject jSONObjectZzb;
        String strConcat;
        zzdzz zzdzzVar = (zzdzz) obj;
        int iOptInt = zzdzz.zzb(zzdzzVar).optInt("http_timeout_millis", 60000);
        zzbvq zzbvqVarZza = zzdzz.zza(zzdzzVar);
        int iZza = zzbvqVarZza.zza();
        String strJoin = BuildConfig.FLAVOR;
        if (iZza != -2) {
            if (zzbvqVarZza.zza() == 1) {
                if (zzbvqVarZza.zzh() != null) {
                    strJoin = TextUtils.join(", ", zzbvqVarZza.zzh());
                    int i = zze.zza;
                    zzo.zzg(strJoin);
                }
                zzdweVar = new zzdwe(2, "Error building request URL: ".concat(String.valueOf(strJoin)));
            } else {
                zzdweVar = new zzdwe(1);
            }
            zzfhm zzfhmVar = this.zzd;
            zzfhb zzfhbVar = this.zzc;
            zzfhbVar.zzh(zzdweVar);
            zzfhbVar.zzg(false);
            zzfhmVar.zza(zzfhbVar);
            throw zzdweVar;
        }
        HashMap map = new HashMap();
        if (zzdzz.zza(zzdzzVar).zzj()) {
            String str = this.zzb;
            if (!TextUtils.isEmpty(str)) {
                if (((Boolean) zzbd.zzc().zzb(zzbdc.zzbb)).booleanValue()) {
                    if (TextUtils.isEmpty(str)) {
                        strConcat = BuildConfig.FLAVOR;
                    } else {
                        Matcher matcher = zza.matcher(str);
                        strConcat = BuildConfig.FLAVOR;
                        while (matcher.find()) {
                            String strGroup = matcher.group(1);
                            if (strGroup != null && (strGroup.toLowerCase(Locale.ROOT).startsWith("id=") || strGroup.toLowerCase(Locale.ROOT).startsWith("ide="))) {
                                if (!TextUtils.isEmpty(strConcat)) {
                                    strConcat = strConcat.concat("; ");
                                }
                                strConcat = strConcat.concat(strGroup);
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(strConcat)) {
                        map.put("Cookie", strConcat);
                    }
                } else {
                    map.put("Cookie", str);
                }
            }
        }
        if (zzdzz.zza(zzdzzVar).zzk() && (jSONObjectZzb = zzdzz.zzb(zzdzzVar)) != null) {
            JSONObject jSONObjectOptJSONObject = jSONObjectZzb.optJSONObject("pii");
            if (jSONObjectOptJSONObject != null) {
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos", BuildConfig.FLAVOR))) {
                    map.put("x-afma-drt-cookie", jSONObjectOptJSONObject.optString("doritos", BuildConfig.FLAVOR));
                }
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos_v2", BuildConfig.FLAVOR))) {
                    map.put("x-afma-drt-v2-cookie", jSONObjectOptJSONObject.optString("doritos_v2", BuildConfig.FLAVOR));
                }
            } else {
                zze.zza("DSID signal does not exist.");
            }
        }
        if (zzdzz.zza(zzdzzVar) != null && !TextUtils.isEmpty(zzdzz.zza(zzdzzVar).zzf())) {
            strJoin = zzdzz.zza(zzdzzVar).zzf();
        }
        zzfhm zzfhmVar2 = this.zzd;
        zzfhb zzfhbVar2 = this.zzc;
        zzfhbVar2.zzg(true);
        zzfhmVar2.zza(zzfhbVar2);
        return new zzdzv(zzdzz.zza(zzdzzVar).zzg(), iOptInt, map, strJoin.getBytes(StandardCharsets.UTF_8), BuildConfig.FLAVOR, zzdzz.zza(zzdzzVar).zzk());
    }
}
