package com.google.android.gms.internal.p000firebaseauthapi;

import com.crashlytics.android.BuildConfig;
import com.google.android.gms.internal.p000firebaseauthapi.zzakg;

/* compiled from: com.google.firebase:firebase-auth@@23.2.0 */
@Deprecated
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzxc extends zzakg<zzxc, zza> implements zzalp {
    private static final zzxc zzc;
    private static volatile zzalw<zzxc> zzd;
    private String zze = BuildConfig.FLAVOR;
    private zzakn<zzwi> zzf = zzp();

    /* compiled from: com.google.firebase:firebase-auth@@23.2.0 */
    public static final class zza extends zzakg.zzb<zzxc, zza> implements zzalp {
        private zza() {
            super(zzxc.zzc);
        }

        /* synthetic */ zza(zzxg zzxgVar) {
            this();
        }
    }

    public static zzxc zzb() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzakg
    protected final Object zza(int i, Object obj, Object obj2) {
        zzxg zzxgVar = null;
        switch (zzxe.zza[i - 1]) {
            case 1:
                return new zzxc();
            case 2:
                return new zza(zzxgVar);
            case 3:
                return zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", zzwi.class});
            case 4:
                return zzc;
            case 5:
                zzalw<zzxc> zzaVar = zzd;
                if (zzaVar == null) {
                    synchronized (zzxc.class) {
                        zzaVar = zzd;
                        if (zzaVar == null) {
                            zzaVar = new zzakg.zza<>(zzc);
                            zzd = zzaVar;
                        }
                    }
                }
                return zzaVar;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }

    static {
        zzxc zzxcVar = new zzxc();
        zzc = zzxcVar;
        zzakg.zza((Class<zzxc>) zzxc.class, zzxcVar);
    }

    private zzxc() {
    }
}
