package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Comparator;

/* compiled from: com.google.firebase:firebase-auth@@23.2.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
final class zzaiy implements Comparator<zzaiw> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzaiw zzaiwVar, zzaiw zzaiwVar2) {
        zzaiw zzaiwVar3 = zzaiwVar;
        zzaiw zzaiwVar4 = zzaiwVar2;
        zzajc zzajcVar = (zzajc) zzaiwVar3.iterator();
        zzajc zzajcVar2 = (zzajc) zzaiwVar4.iterator();
        while (zzajcVar.hasNext() && zzajcVar2.hasNext()) {
            int iCompare = Integer.compare(zzaiw.zza(zzajcVar.zza()), zzaiw.zza(zzajcVar2.zza()));
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return Integer.compare(zzaiwVar3.zzb(), zzaiwVar4.zzb());
    }

    zzaiy() {
    }
}
