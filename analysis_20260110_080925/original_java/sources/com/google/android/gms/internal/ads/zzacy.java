package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class zzacy {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final float zzk;
    public final String zzl;

    private zzacy(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = i5;
        this.zzg = i6;
        this.zzh = i7;
        this.zzi = i8;
        this.zzj = i9;
        this.zzk = f;
        this.zzl = str;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.ads.zzaz */
    public static zzacy zza(zzen zzenVar) throws zzaz {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        String strZzc;
        float f;
        try {
            zzenVar.zzM(4);
            int iZzm = (zzenVar.zzm() & 3) + 1;
            if (iZzm == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iZzm2 = zzenVar.zzm() & 31;
            for (int i9 = 0; i9 < iZzm2; i9++) {
                arrayList.add(zzb(zzenVar));
            }
            int iZzm3 = zzenVar.zzm();
            for (int i10 = 0; i10 < iZzm3; i10++) {
                arrayList.add(zzb(zzenVar));
            }
            if (iZzm2 > 0) {
                byte[] bArr = (byte[]) arrayList.get(0);
                byte[] bArr2 = (byte[]) arrayList.get(0);
                byte[] bArr3 = zzfv.zza;
                zzfu zzfuVarZzg = zzfv.zzg(bArr2, 5, bArr.length);
                int i11 = zzfuVarZzg.zze;
                int i12 = zzfuVarZzg.zzf;
                int i13 = zzfuVarZzg.zzh + 8;
                int i14 = zzfuVarZzg.zzi + 8;
                int i15 = zzfuVarZzg.zzj;
                int i16 = zzfuVarZzg.zzk;
                int i17 = zzfuVarZzg.zzl;
                int i18 = zzfuVarZzg.zzm;
                float f2 = zzfuVarZzg.zzg;
                strZzc = zzdk.zzc(zzfuVarZzg.zza, zzfuVarZzg.zzb, zzfuVarZzg.zzc);
                i7 = i17;
                i8 = i18;
                f = f2;
                i4 = i14;
                i5 = i15;
                i6 = i16;
                i = i11;
                i2 = i12;
                i3 = i13;
            } else {
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                i7 = -1;
                i8 = 16;
                strZzc = null;
                f = 1.0f;
            }
            return new zzacy(arrayList, iZzm, i, i2, i3, i4, i5, i6, i7, i8, f, strZzc);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzaz.zza("Error parsing AVC config", e);
        }
    }

    private static byte[] zzb(zzen zzenVar) {
        int iZzq = zzenVar.zzq();
        int iZzc = zzenVar.zzc();
        zzenVar.zzM(iZzq);
        return zzdk.zze(zzenVar.zzN(), iZzc, iZzq);
    }
}
