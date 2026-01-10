package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.io.UnsupportedEncodingException;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@23.2.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzagy {
    public static long zza(String str) {
        zzagx zzagxVarZzb = zzb(str);
        return zzagxVarZzb.zza().longValue() - zzagxVarZzb.zzb().longValue();
    }

    private static zzagx zzb(String str) {
        Preconditions.checkNotEmpty(str);
        List listZza = zzv.zza('.').zza(str);
        if (listZza.size() < 2) {
            throw new RuntimeException("Invalid idToken " + str);
        }
        try {
            return zzagx.zza(new String(Base64Utils.decodeUrlSafeNoPadding((String) listZza.get(1)), HttpRequest.CHARSET_UTF8));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Unable to decode token", e);
        }
    }
}
