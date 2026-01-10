package com.google.android.gms.internal.p000firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@23.2.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class zzahg implements zzaea<zzahg> {
    private static final String zza = "zzahg";
    private String zzb;
    private String zzc;
    private String zzd;
    private zzagz zze;

    public final zzagz zza() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.firebase-auth-api.zzabr */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.p000firebaseauthapi.zzahg zza(java.lang.String r17) throws com.google.android.gms.internal.firebase-auth-api.zzabr {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            java.lang.String r0 = "mfaInfo"
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            r3.<init>(r2)     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            java.lang.String r4 = "email"
            java.lang.String r4 = r3.optString(r4)     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            java.lang.String r4 = com.google.android.gms.common.util.Strings.emptyToNull(r4)     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            r1.zzb = r4     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            java.lang.String r4 = "newEmail"
            java.lang.String r4 = r3.optString(r4)     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            java.lang.String r4 = com.google.android.gms.common.util.Strings.emptyToNull(r4)     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            r1.zzc = r4     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            java.lang.String r4 = "reqType"
            int r4 = r3.optInt(r4)     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            java.lang.String r5 = "REVERT_SECOND_FACTOR_ADDITION"
            java.lang.String r6 = "VERIFY_AND_CHANGE_EMAIL"
            java.lang.String r7 = "EMAIL_SIGNIN"
            java.lang.String r8 = "RECOVER_EMAIL"
            java.lang.String r9 = "VERIFY_EMAIL"
            java.lang.String r11 = "PASSWORD_RESET"
            r12 = 1
            if (r4 == r12) goto L47
            switch(r4) {
                case 4: goto L45;
                case 5: goto L43;
                case 6: goto L41;
                case 7: goto L3f;
                case 8: goto L3d;
                default: goto L3b;
            }
        L3b:
            r4 = 0
            goto L48
        L3d:
            r4 = r5
            goto L48
        L3f:
            r4 = r6
            goto L48
        L41:
            r4 = r7
            goto L48
        L43:
            r4 = r8
            goto L48
        L45:
            r4 = r9
            goto L48
        L47:
            r4 = r11
        L48:
            r1.zzd = r4     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            if (r4 == 0) goto La4
            java.lang.String r4 = "requestType"
            java.lang.String r4 = r3.optString(r4)     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            int r14 = r4.hashCode()     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            r10 = 4
            r13 = 3
            r15 = 2
            switch(r14) {
                case -1874510116: goto L89;
                case -1452371317: goto L81;
                case -1341836234: goto L79;
                case -1099157829: goto L71;
                case 870738373: goto L69;
                case 970484929: goto L61;
                default: goto L60;
            }     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
        L60:
            goto L91
        L61:
            boolean r5 = r4.equals(r8)     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            if (r5 == 0) goto L91
            r5 = r10
            goto L92
        L69:
            boolean r5 = r4.equals(r7)     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            if (r5 == 0) goto L91
            r5 = r15
            goto L92
        L71:
            boolean r5 = r4.equals(r6)     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            if (r5 == 0) goto L91
            r5 = r13
            goto L92
        L79:
            boolean r5 = r4.equals(r9)     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            if (r5 == 0) goto L91
            r5 = 0
            goto L92
        L81:
            boolean r5 = r4.equals(r11)     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            if (r5 == 0) goto L91
            r5 = r12
            goto L92
        L89:
            boolean r5 = r4.equals(r5)     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            if (r5 == 0) goto L91
            r5 = 5
            goto L92
        L91:
            r5 = -1
        L92:
            if (r5 == 0) goto La1
            if (r5 == r12) goto La1
            if (r5 == r15) goto La1
            if (r5 == r13) goto La1
            if (r5 == r10) goto La1
            r6 = 5
            if (r5 == r6) goto La1
            r10 = 0
            goto La2
        La1:
            r10 = r4
        La2:
            r1.zzd = r10     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
        La4:
            boolean r4 = r3.has(r0)     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            if (r4 == 0) goto Lb4
            org.json.JSONObject r0 = r3.optJSONObject(r0)     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            com.google.android.gms.internal.firebase-auth-api.zzagz r0 = com.google.android.gms.internal.p000firebaseauthapi.zzagz.zza(r0)     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
            r1.zze = r0     // Catch: java.lang.NullPointerException -> Lb5 org.json.JSONException -> Lb7
        Lb4:
            return r1
        Lb5:
            r0 = move-exception
            goto Lb8
        Lb7:
            r0 = move-exception
        Lb8:
            java.lang.String r3 = com.google.android.gms.internal.p000firebaseauthapi.zzahg.zza
            com.google.android.gms.internal.firebase-auth-api.zzabr r0 = com.google.android.gms.internal.p000firebaseauthapi.zzail.zza(r0, r3, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.zzahg.zza(java.lang.String):com.google.android.gms.internal.firebase-auth-api.zzahg");
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }

    public final boolean zze() {
        return this.zzb != null;
    }

    public final boolean zzf() {
        return this.zze != null;
    }

    public final boolean zzg() {
        return this.zzc != null;
    }

    public final boolean zzh() {
        return this.zzd != null;
    }
}
