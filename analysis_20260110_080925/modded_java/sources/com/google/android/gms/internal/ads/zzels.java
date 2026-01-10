package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzels implements zzetu {
    private final zzgdm zza;
    private final Context zzb;
    private final zzfco zzc;
    private final View zzd;

    public zzels(zzgdm zzgdmVar, Context context, zzfco zzfcoVar, ViewGroup viewGroup) {
        this.zza = zzgdmVar;
        this.zzb = context;
        this.zzc = zzfcoVar;
        this.zzd = viewGroup;
    }

    public static /* synthetic */ zzelt zzc(zzels zzelsVar) {
        ArrayList arrayList = new ArrayList();
        View view = zzelsVar.zzd;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int iIndexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", iIndexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new zzelt(zzelsVar.zzb, zzelsVar.zzc.zze, arrayList);
    }

    public final int zza() {
        return 3;
    }

    public final ListenableFuture zzb() {
        zzbdc.zza(this.zzb);
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzelr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzels.zzc(this.zza);
            }
        });
    }
}
