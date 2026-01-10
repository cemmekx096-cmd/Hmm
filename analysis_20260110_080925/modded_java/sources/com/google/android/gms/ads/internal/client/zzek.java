package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.internal.ads.zzfns;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzek {
    private final String zza;
    private final List zzb;
    private final Set zzc;
    private final Bundle zzd;
    private final String zze;
    private final String zzf;
    private final int zzg;
    private final Set zzh;
    private final Bundle zzi;
    private final Set zzj;
    private final boolean zzk;
    private final String zzl;
    private final int zzm;
    private long zzn = 0;

    public zzek(zzej zzejVar, zzfns zzfnsVar) {
        this.zza = zzejVar.zzg;
        this.zzb = zzejVar.zzh;
        this.zzc = Collections.unmodifiableSet(zzejVar.zza);
        this.zzd = zzejVar.zzb;
        Collections.unmodifiableMap(zzejVar.zzc);
        this.zze = zzejVar.zzi;
        this.zzf = zzejVar.zzj;
        this.zzg = zzejVar.zzk;
        this.zzh = Collections.unmodifiableSet(zzejVar.zzd);
        this.zzi = zzejVar.zze;
        this.zzj = Collections.unmodifiableSet(zzejVar.zzf);
        this.zzk = zzejVar.zzl;
        this.zzl = zzejVar.zzm;
        this.zzm = zzejVar.zzn;
    }

    public final int zza() {
        return this.zzm;
    }

    public final int zzb() {
        return this.zzg;
    }

    public final long zzc() {
        return this.zzn;
    }

    public final Bundle zzd(Class cls) {
        Bundle bundle = this.zzd.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    public final Bundle zze() {
        return this.zzi;
    }

    public final Bundle zzf(Class cls) {
        return this.zzd.getBundle(cls.getName());
    }

    public final Bundle zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzl;
    }

    public final String zzi() {
        return this.zza;
    }

    public final String zzj() {
        return this.zze;
    }

    public final String zzk() {
        return this.zzf;
    }

    public final List zzl() {
        return new ArrayList(this.zzb);
    }

    public final Set zzm() {
        return this.zzj;
    }

    public final Set zzn() {
        return this.zzc;
    }

    public final void zzo(long j) {
        this.zzn = j;
    }

    @Deprecated
    public final boolean zzp() {
        return this.zzk;
    }

    public final boolean zzq(Context context) {
        RequestConfiguration requestConfigurationZzc = zzey.zzf().zzc();
        zzbb.zzb();
        Set set = this.zzh;
        String strZzD = zzf.zzD(context);
        return set.contains(strZzD) || requestConfigurationZzc.getTestDeviceIds().contains(strZzD);
    }
}
