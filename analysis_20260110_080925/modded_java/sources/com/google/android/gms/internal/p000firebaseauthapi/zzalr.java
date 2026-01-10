package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: com.google.firebase:firebase-auth@@23.2.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
final class zzalr<T> implements zzamc<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzana.zzb();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzaln zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzalv zzn;
    private final zzakx zzo;
    private final zzamv<?, ?> zzp;
    private final zzajx<?> zzq;
    private final zzalg zzr;

    private static <T> double zza(T t, long j) {
        return ((Double) zzana.zze(t, j)).doubleValue();
    }

    private static boolean zzg(int i) {
        return (i & 536870912) != 0;
    }

    private static <T> float zzb(T t, long j) {
        return ((Float) zzana.zze(t, j)).floatValue();
    }

    private static int zza(byte[] bArr, int i, int i2, zzanh zzanhVar, Class<?> cls, zzaiv zzaivVar) throws IOException {
        switch (zzalq.zza[zzanhVar.ordinal()]) {
            case 1:
                int iZzd = zzais.zzd(bArr, i, zzaivVar);
                zzaivVar.zzc = Boolean.valueOf(zzaivVar.zzb != 0);
                return iZzd;
            case 2:
                return zzais.zza(bArr, i, zzaivVar);
            case 3:
                zzaivVar.zzc = Double.valueOf(zzais.zza(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzaivVar.zzc = Integer.valueOf(zzais.zzc(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzaivVar.zzc = Long.valueOf(zzais.zzd(bArr, i));
                return i + 8;
            case 8:
                zzaivVar.zzc = Float.valueOf(zzais.zzb(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int iZzc = zzais.zzc(bArr, i, zzaivVar);
                zzaivVar.zzc = Integer.valueOf(zzaivVar.zza);
                return iZzc;
            case 12:
            case 13:
                int iZzd2 = zzais.zzd(bArr, i, zzaivVar);
                zzaivVar.zzc = Long.valueOf(zzaivVar.zzb);
                return iZzd2;
            case 14:
                return zzais.zza(zzaly.zza().zza((Class) cls), bArr, i, i2, zzaivVar);
            case 15:
                int iZzc2 = zzais.zzc(bArr, i, zzaivVar);
                zzaivVar.zzc = Integer.valueOf(zzaji.zza(zzaivVar.zza));
                return iZzc2;
            case 16:
                int iZzd3 = zzais.zzd(bArr, i, zzaivVar);
                zzaivVar.zzc = Long.valueOf(zzaji.zza(zzaivVar.zzb));
                return iZzd3;
            case 17:
                return zzais.zzb(bArr, i, zzaivVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v5 */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzamc
    public final int zza(T t) {
        int i;
        int i2;
        int i3;
        boolean z;
        int iZza;
        int iZza2;
        int iZzd;
        int iZzd2;
        int iZzg;
        int iZzh;
        Unsafe unsafe = zzb;
        int i4 = 1048575;
        ?? r10 = 0;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int iZzd3 = 0;
        while (i7 < this.zzc.length) {
            int iZzc = zzc(i7);
            int i8 = (267386880 & iZzc) >>> 20;
            int[] iArr = this.zzc;
            int i9 = iArr[i7];
            int i10 = iArr[i7 + 2];
            int i11 = i10 & i4;
            if (i8 <= 17) {
                if (i11 != i5) {
                    i6 = i11 == i4 ? r10 : unsafe.getInt(t, i11);
                    i5 = i11;
                }
                i = i5;
                i2 = i6;
                i3 = 1 << (i10 >>> 20);
            } else {
                i = i5;
                i2 = i6;
                i3 = r10;
            }
            long j = iZzc & i4;
            if (i8 >= zzakd.DOUBLE_LIST_PACKED.zza()) {
                zzakd.SINT64_LIST_PACKED.zza();
            }
            int i12 = i3;
            switch (i8) {
                case 0:
                    z = r10;
                    if (zza((zzalr<T>) t, i7, i, i2, i12)) {
                        iZza = zzajo.zza(i9, 0.0d);
                        iZzd3 += iZza;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    z = r10;
                    if (zza((zzalr<T>) t, i7, i, i2, i12)) {
                        iZza = zzajo.zza(i9, 0.0f);
                        iZzd3 += iZza;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    z = r10;
                    if (zza((zzalr<T>) t, i7, i, i2, i12)) {
                        iZza = zzajo.zzb(i9, unsafe.getLong(t, j));
                        iZzd3 += iZza;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    z = r10;
                    if (zza((zzalr<T>) t, i7, i, i2, i12)) {
                        iZza = zzajo.zze(i9, unsafe.getLong(t, j));
                        iZzd3 += iZza;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    z = r10;
                    if (zza((zzalr<T>) t, i7, i, i2, i12)) {
                        iZza = zzajo.zzc(i9, unsafe.getInt(t, j));
                        iZzd3 += iZza;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    z = r10;
                    if (zza((zzalr<T>) t, i7, i, i2, i12)) {
                        iZza = zzajo.zza(i9, 0L);
                        iZzd3 += iZza;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zza((zzalr<T>) t, i7, i, i2, i12)) {
                        z = false;
                        iZza = zzajo.zzb(i9, 0);
                        iZzd3 += iZza;
                        break;
                    }
                    z = false;
                    break;
                case 7:
                    if (zza((zzalr<T>) t, i7, i, i2, i12)) {
                        iZza2 = zzajo.zza(i9, true);
                        iZzd3 += iZza2;
                    }
                    z = false;
                    break;
                case 8:
                    if (zza((zzalr<T>) t, i7, i, i2, i12)) {
                        Object object = unsafe.getObject(t, j);
                        if (object instanceof zzaiw) {
                            iZza2 = zzajo.zza(i9, (zzaiw) object);
                        } else {
                            iZza2 = zzajo.zza(i9, (String) object);
                        }
                        iZzd3 += iZza2;
                    }
                    z = false;
                    break;
                case 9:
                    if (zza((zzalr<T>) t, i7, i, i2, i12)) {
                        iZza2 = zzame.zza(i9, unsafe.getObject(t, j), (zzamc<?>) zze(i7));
                        iZzd3 += iZza2;
                    }
                    z = false;
                    break;
                case 10:
                    if (zza((zzalr<T>) t, i7, i, i2, i12)) {
                        iZza2 = zzajo.zza(i9, (zzaiw) unsafe.getObject(t, j));
                        iZzd3 += iZza2;
                    }
                    z = false;
                    break;
                case 11:
                    if (zza((zzalr<T>) t, i7, i, i2, i12)) {
                        iZza2 = zzajo.zzf(i9, unsafe.getInt(t, j));
                        iZzd3 += iZza2;
                    }
                    z = false;
                    break;
                case 12:
                    if (zza((zzalr<T>) t, i7, i, i2, i12)) {
                        iZza2 = zzajo.zza(i9, unsafe.getInt(t, j));
                        iZzd3 += iZza2;
                    }
                    z = false;
                    break;
                case 13:
                    if (zza((zzalr<T>) t, i7, i, i2, i12)) {
                        iZzd3 += zzajo.zzd(i9, 0);
                    }
                    z = false;
                    break;
                case 14:
                    if (zza((zzalr<T>) t, i7, i, i2, i12)) {
                        iZza2 = zzajo.zzc(i9, 0L);
                        iZzd3 += iZza2;
                    }
                    z = false;
                    break;
                case 15:
                    if (zza((zzalr<T>) t, i7, i, i2, i12)) {
                        iZza2 = zzajo.zze(i9, unsafe.getInt(t, j));
                        iZzd3 += iZza2;
                    }
                    z = false;
                    break;
                case 16:
                    if (zza((zzalr<T>) t, i7, i, i2, i12)) {
                        iZza2 = zzajo.zzd(i9, unsafe.getLong(t, j));
                        iZzd3 += iZza2;
                    }
                    z = false;
                    break;
                case 17:
                    if (zza((zzalr<T>) t, i7, i, i2, i12)) {
                        iZza2 = zzajo.zza(i9, (zzaln) unsafe.getObject(t, j), zze(i7));
                        iZzd3 += iZza2;
                    }
                    z = false;
                    break;
                case 18:
                    iZzd = zzame.zzd(i9, (List) unsafe.getObject(t, j), r10);
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 19:
                    iZzd = zzame.zzc(i9, (List) unsafe.getObject(t, j), r10);
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 20:
                    iZzd = zzame.zzf(i9, (List) unsafe.getObject(t, j), r10);
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 21:
                    iZzd = zzame.zzj(i9, (List) unsafe.getObject(t, j), r10);
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 22:
                    iZzd = zzame.zze(i9, (List) unsafe.getObject(t, j), r10);
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 23:
                    iZzd = zzame.zzd(i9, (List) unsafe.getObject(t, j), r10);
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 24:
                    iZzd = zzame.zzc(i9, (List) unsafe.getObject(t, j), r10);
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 25:
                    iZzd = zzame.zza(i9, (List<?>) unsafe.getObject(t, j), (boolean) r10);
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 26:
                    iZzd = zzame.zzb(i9, (List) unsafe.getObject(t, j));
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 27:
                    iZzd = zzame.zzb(i9, (List<?>) unsafe.getObject(t, j), (zzamc<?>) zze(i7));
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 28:
                    iZzd = zzame.zza(i9, (List<zzaiw>) unsafe.getObject(t, j));
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 29:
                    iZzd = zzame.zzi(i9, (List) unsafe.getObject(t, j), r10);
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 30:
                    iZzd = zzame.zzb(i9, (List<Integer>) unsafe.getObject(t, j), (boolean) r10);
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 31:
                    iZzd = zzame.zzc(i9, (List) unsafe.getObject(t, j), r10);
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 32:
                    iZzd = zzame.zzd(i9, (List) unsafe.getObject(t, j), r10);
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 33:
                    iZzd = zzame.zzg(i9, (List) unsafe.getObject(t, j), r10);
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 34:
                    iZzd = zzame.zzh(i9, (List) unsafe.getObject(t, j), r10);
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 35:
                    iZzd2 = zzame.zzd((List) unsafe.getObject(t, j));
                    if (iZzd2 > 0) {
                        iZzg = zzajo.zzg(i9);
                        iZzh = zzajo.zzh(iZzd2);
                        iZzd3 += iZzg + iZzh + iZzd2;
                    }
                    z = r10;
                    break;
                case 36:
                    iZzd2 = zzame.zzc((List) unsafe.getObject(t, j));
                    if (iZzd2 > 0) {
                        iZzg = zzajo.zzg(i9);
                        iZzh = zzajo.zzh(iZzd2);
                        iZzd3 += iZzg + iZzh + iZzd2;
                    }
                    z = r10;
                    break;
                case 37:
                    iZzd2 = zzame.zzf((List) unsafe.getObject(t, j));
                    if (iZzd2 > 0) {
                        iZzg = zzajo.zzg(i9);
                        iZzh = zzajo.zzh(iZzd2);
                        iZzd3 += iZzg + iZzh + iZzd2;
                    }
                    z = r10;
                    break;
                case 38:
                    iZzd2 = zzame.zzj((List) unsafe.getObject(t, j));
                    if (iZzd2 > 0) {
                        iZzg = zzajo.zzg(i9);
                        iZzh = zzajo.zzh(iZzd2);
                        iZzd3 += iZzg + iZzh + iZzd2;
                    }
                    z = r10;
                    break;
                case 39:
                    iZzd2 = zzame.zze((List) unsafe.getObject(t, j));
                    if (iZzd2 > 0) {
                        iZzg = zzajo.zzg(i9);
                        iZzh = zzajo.zzh(iZzd2);
                        iZzd3 += iZzg + iZzh + iZzd2;
                    }
                    z = r10;
                    break;
                case 40:
                    iZzd2 = zzame.zzd((List) unsafe.getObject(t, j));
                    if (iZzd2 > 0) {
                        iZzg = zzajo.zzg(i9);
                        iZzh = zzajo.zzh(iZzd2);
                        iZzd3 += iZzg + iZzh + iZzd2;
                    }
                    z = r10;
                    break;
                case 41:
                    iZzd2 = zzame.zzc((List) unsafe.getObject(t, j));
                    if (iZzd2 > 0) {
                        iZzg = zzajo.zzg(i9);
                        iZzh = zzajo.zzh(iZzd2);
                        iZzd3 += iZzg + iZzh + iZzd2;
                    }
                    z = r10;
                    break;
                case 42:
                    iZzd2 = zzame.zza((List<?>) unsafe.getObject(t, j));
                    if (iZzd2 > 0) {
                        iZzg = zzajo.zzg(i9);
                        iZzh = zzajo.zzh(iZzd2);
                        iZzd3 += iZzg + iZzh + iZzd2;
                    }
                    z = r10;
                    break;
                case 43:
                    iZzd2 = zzame.zzi((List) unsafe.getObject(t, j));
                    if (iZzd2 > 0) {
                        iZzg = zzajo.zzg(i9);
                        iZzh = zzajo.zzh(iZzd2);
                        iZzd3 += iZzg + iZzh + iZzd2;
                    }
                    z = r10;
                    break;
                case 44:
                    iZzd2 = zzame.zzb((List) unsafe.getObject(t, j));
                    if (iZzd2 > 0) {
                        iZzg = zzajo.zzg(i9);
                        iZzh = zzajo.zzh(iZzd2);
                        iZzd3 += iZzg + iZzh + iZzd2;
                    }
                    z = r10;
                    break;
                case 45:
                    iZzd2 = zzame.zzc((List) unsafe.getObject(t, j));
                    if (iZzd2 > 0) {
                        iZzg = zzajo.zzg(i9);
                        iZzh = zzajo.zzh(iZzd2);
                        iZzd3 += iZzg + iZzh + iZzd2;
                    }
                    z = r10;
                    break;
                case 46:
                    iZzd2 = zzame.zzd((List) unsafe.getObject(t, j));
                    if (iZzd2 > 0) {
                        iZzg = zzajo.zzg(i9);
                        iZzh = zzajo.zzh(iZzd2);
                        iZzd3 += iZzg + iZzh + iZzd2;
                    }
                    z = r10;
                    break;
                case 47:
                    iZzd2 = zzame.zzg((List) unsafe.getObject(t, j));
                    if (iZzd2 > 0) {
                        iZzg = zzajo.zzg(i9);
                        iZzh = zzajo.zzh(iZzd2);
                        iZzd3 += iZzg + iZzh + iZzd2;
                    }
                    z = r10;
                    break;
                case 48:
                    iZzd2 = zzame.zzh((List) unsafe.getObject(t, j));
                    if (iZzd2 > 0) {
                        iZzg = zzajo.zzg(i9);
                        iZzh = zzajo.zzh(iZzd2);
                        iZzd3 += iZzg + iZzh + iZzd2;
                    }
                    z = r10;
                    break;
                case 49:
                    iZzd = zzame.zza(i9, (List<zzaln>) unsafe.getObject(t, j), (zzamc<?>) zze(i7));
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 50:
                    iZzd = this.zzr.zza(i9, unsafe.getObject(t, j), zzf(i7));
                    iZzd3 += iZzd;
                    z = r10;
                    break;
                case 51:
                    if (zzc((zzalr<T>) t, i9, i7)) {
                        iZzd = zzajo.zza(i9, 0.0d);
                        iZzd3 += iZzd;
                    }
                    z = r10;
                    break;
                case 52:
                    if (zzc((zzalr<T>) t, i9, i7)) {
                        iZzd = zzajo.zza(i9, 0.0f);
                        iZzd3 += iZzd;
                    }
                    z = r10;
                    break;
                case 53:
                    if (zzc((zzalr<T>) t, i9, i7)) {
                        iZzd = zzajo.zzb(i9, zzd(t, j));
                        iZzd3 += iZzd;
                    }
                    z = r10;
                    break;
                case 54:
                    if (zzc((zzalr<T>) t, i9, i7)) {
                        iZzd = zzajo.zze(i9, zzd(t, j));
                        iZzd3 += iZzd;
                    }
                    z = r10;
                    break;
                case 55:
                    if (zzc((zzalr<T>) t, i9, i7)) {
                        iZzd = zzajo.zzc(i9, zzc(t, j));
                        iZzd3 += iZzd;
                    }
                    z = r10;
                    break;
                case 56:
                    if (zzc((zzalr<T>) t, i9, i7)) {
                        iZzd = zzajo.zza(i9, 0L);
                        iZzd3 += iZzd;
                    }
                    z = r10;
                    break;
                case 57:
                    if (zzc((zzalr<T>) t, i9, i7)) {
                        iZzd = zzajo.zzb(i9, (int) r10);
                        iZzd3 += iZzd;
                    }
                    z = r10;
                    break;
                case 58:
                    if (zzc((zzalr<T>) t, i9, i7)) {
                        iZzd = zzajo.zza(i9, true);
                        iZzd3 += iZzd;
                    }
                    z = r10;
                    break;
                case 59:
                    if (zzc((zzalr<T>) t, i9, i7)) {
                        Object object2 = unsafe.getObject(t, j);
                        if (object2 instanceof zzaiw) {
                            iZzd = zzajo.zza(i9, (zzaiw) object2);
                        } else {
                            iZzd = zzajo.zza(i9, (String) object2);
                        }
                        iZzd3 += iZzd;
                    }
                    z = r10;
                    break;
                case 60:
                    if (zzc((zzalr<T>) t, i9, i7)) {
                        iZzd = zzame.zza(i9, unsafe.getObject(t, j), (zzamc<?>) zze(i7));
                        iZzd3 += iZzd;
                    }
                    z = r10;
                    break;
                case 61:
                    if (zzc((zzalr<T>) t, i9, i7)) {
                        iZzd = zzajo.zza(i9, (zzaiw) unsafe.getObject(t, j));
                        iZzd3 += iZzd;
                    }
                    z = r10;
                    break;
                case 62:
                    if (zzc((zzalr<T>) t, i9, i7)) {
                        iZzd = zzajo.zzf(i9, zzc(t, j));
                        iZzd3 += iZzd;
                    }
                    z = r10;
                    break;
                case 63:
                    if (zzc((zzalr<T>) t, i9, i7)) {
                        iZzd = zzajo.zza(i9, zzc(t, j));
                        iZzd3 += iZzd;
                    }
                    z = r10;
                    break;
                case 64:
                    if (zzc((zzalr<T>) t, i9, i7)) {
                        iZzd = zzajo.zzd(i9, (int) r10);
                        iZzd3 += iZzd;
                    }
                    z = r10;
                    break;
                case 65:
                    if (zzc((zzalr<T>) t, i9, i7)) {
                        iZzd = zzajo.zzc(i9, 0L);
                        iZzd3 += iZzd;
                    }
                    z = r10;
                    break;
                case 66:
                    if (zzc((zzalr<T>) t, i9, i7)) {
                        iZzd = zzajo.zze(i9, zzc(t, j));
                        iZzd3 += iZzd;
                    }
                    z = r10;
                    break;
                case 67:
                    if (zzc((zzalr<T>) t, i9, i7)) {
                        iZzd = zzajo.zzd(i9, zzd(t, j));
                        iZzd3 += iZzd;
                    }
                    z = r10;
                    break;
                case 68:
                    if (zzc((zzalr<T>) t, i9, i7)) {
                        iZzd = zzajo.zza(i9, (zzaln) unsafe.getObject(t, j), zze(i7));
                        iZzd3 += iZzd;
                    }
                    z = r10;
                    break;
                default:
                    z = r10;
                    break;
            }
            i7 += 3;
            i5 = i;
            r10 = z;
            i6 = i2;
            i4 = 1048575;
        }
        int iZza3 = r10;
        zzamv<?, ?> zzamvVar = this.zzp;
        int iZza4 = iZzd3 + zzamvVar.zza((zzamv<?, ?>) zzamvVar.zzd(t));
        if (!this.zzh) {
            return iZza4;
        }
        zzajy<T> zzajyVarZza = this.zzq.zza(t);
        int iZzb = zzajyVarZza.zza.zzb();
        for (int i13 = iZza3; i13 < iZzb; i13++) {
            Map.Entry entryZza = zzajyVarZza.zza.zza(i13);
            iZza3 += zzajy.zza((zzaka<?>) entryZza.getKey(), entryZza.getValue());
        }
        for (Map.Entry entry : zzajyVarZza.zza.zzc()) {
            iZza3 += zzajy.zza((zzaka<?>) entry.getKey(), entry.getValue());
        }
        return iZza4 + iZza3;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzamc
    public final int zzb(T t) {
        int i;
        int iZza;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iZzc = zzc(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & iZzc;
            int iHashCode = 37;
            switch ((iZzc & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    iZza = zzaki.zza(Double.doubleToLongBits(zzana.zza(t, j)));
                    i2 = i + iZza;
                    break;
                case 1:
                    i = i2 * 53;
                    iZza = Float.floatToIntBits(zzana.zzb(t, j));
                    i2 = i + iZza;
                    break;
                case 2:
                    i = i2 * 53;
                    iZza = zzaki.zza(zzana.zzd(t, j));
                    i2 = i + iZza;
                    break;
                case 3:
                    i = i2 * 53;
                    iZza = zzaki.zza(zzana.zzd(t, j));
                    i2 = i + iZza;
                    break;
                case 4:
                    i = i2 * 53;
                    iZza = zzana.zzc(t, j);
                    i2 = i + iZza;
                    break;
                case 5:
                    i = i2 * 53;
                    iZza = zzaki.zza(zzana.zzd(t, j));
                    i2 = i + iZza;
                    break;
                case 6:
                    i = i2 * 53;
                    iZza = zzana.zzc(t, j);
                    i2 = i + iZza;
                    break;
                case 7:
                    i = i2 * 53;
                    iZza = zzaki.zza(zzana.zzh(t, j));
                    i2 = i + iZza;
                    break;
                case 8:
                    i = i2 * 53;
                    iZza = ((String) zzana.zze(t, j)).hashCode();
                    i2 = i + iZza;
                    break;
                case 9:
                    Object objZze = zzana.zze(t, j);
                    if (objZze != null) {
                        iHashCode = objZze.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iZza = zzana.zze(t, j).hashCode();
                    i2 = i + iZza;
                    break;
                case 11:
                    i = i2 * 53;
                    iZza = zzana.zzc(t, j);
                    i2 = i + iZza;
                    break;
                case 12:
                    i = i2 * 53;
                    iZza = zzana.zzc(t, j);
                    i2 = i + iZza;
                    break;
                case 13:
                    i = i2 * 53;
                    iZza = zzana.zzc(t, j);
                    i2 = i + iZza;
                    break;
                case 14:
                    i = i2 * 53;
                    iZza = zzaki.zza(zzana.zzd(t, j));
                    i2 = i + iZza;
                    break;
                case 15:
                    i = i2 * 53;
                    iZza = zzana.zzc(t, j);
                    i2 = i + iZza;
                    break;
                case 16:
                    i = i2 * 53;
                    iZza = zzaki.zza(zzana.zzd(t, j));
                    i2 = i + iZza;
                    break;
                case 17:
                    Object objZze2 = zzana.zze(t, j);
                    if (objZze2 != null) {
                        iHashCode = objZze2.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    iZza = zzana.zze(t, j).hashCode();
                    i2 = i + iZza;
                    break;
                case 50:
                    i = i2 * 53;
                    iZza = zzana.zze(t, j).hashCode();
                    i2 = i + iZza;
                    break;
                case 51:
                    if (zzc((zzalr<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzaki.zza(Double.doubleToLongBits(zza(t, j)));
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzc((zzalr<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = Float.floatToIntBits(zzb(t, j));
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzc((zzalr<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzaki.zza(zzd(t, j));
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzc((zzalr<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzaki.zza(zzd(t, j));
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzc((zzalr<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzc(t, j);
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzc((zzalr<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzaki.zza(zzd(t, j));
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzc((zzalr<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzc(t, j);
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzc((zzalr<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzaki.zza(zze(t, j));
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzc((zzalr<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = ((String) zzana.zze(t, j)).hashCode();
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzc((zzalr<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzana.zze(t, j).hashCode();
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzc((zzalr<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzana.zze(t, j).hashCode();
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzc((zzalr<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzc(t, j);
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzc((zzalr<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzc(t, j);
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzc((zzalr<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzc(t, j);
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzc((zzalr<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzaki.zza(zzd(t, j));
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzc((zzalr<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzc(t, j);
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzc((zzalr<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzaki.zza(zzd(t, j));
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzc((zzalr<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzana.zze(t, j).hashCode();
                        i2 = i + iZza;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i2 * 53) + this.zzp.zzd(t).hashCode();
        return this.zzh ? (iHashCode2 * 53) + this.zzq.zza(t).hashCode() : iHashCode2;
    }

    private static <T> int zzc(T t, long j) {
        return ((Integer) zzana.zze(t, j)).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:435:0x0a70, code lost:
    
        throw com.google.android.gms.internal.p000firebaseauthapi.zzakm.zzj();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0920 A[PHI: r7 r8 r9 r10 r11 r13 r15
      0x0920: PHI (r7v112 int) = (r7v45 int), (r7v46 int), (r7v47 int), (r7v76 int), (r7v93 int), (r7v113 int) binds: [B:383:0x08ff, B:363:0x089f, B:343:0x083e, B:209:0x05fd, B:259:0x06c4, B:132:0x042f] A[DONT_GENERATE, DONT_INLINE]
      0x0920: PHI (r8v90 int) = (r8v45 int), (r8v46 int), (r8v47 int), (r8v67 int), (r8v77 int), (r8v91 int) binds: [B:383:0x08ff, B:363:0x089f, B:343:0x083e, B:209:0x05fd, B:259:0x06c4, B:132:0x042f] A[DONT_GENERATE, DONT_INLINE]
      0x0920: PHI (r9v69 int) = (r9v34 int), (r9v35 int), (r9v36 int), (r9v51 int), (r9v59 int), (r9v70 int) binds: [B:383:0x08ff, B:363:0x089f, B:343:0x083e, B:209:0x05fd, B:259:0x06c4, B:132:0x042f] A[DONT_GENERATE, DONT_INLINE]
      0x0920: PHI (r10v51 com.google.android.gms.internal.firebase-auth-api.zzaiv) = 
      (r10v22 com.google.android.gms.internal.firebase-auth-api.zzaiv)
      (r10v23 com.google.android.gms.internal.firebase-auth-api.zzaiv)
      (r10v24 com.google.android.gms.internal.firebase-auth-api.zzaiv)
      (r10v35 com.google.android.gms.internal.firebase-auth-api.zzaiv)
      (r10v42 com.google.android.gms.internal.firebase-auth-api.zzaiv)
      (r10v52 com.google.android.gms.internal.firebase-auth-api.zzaiv)
     binds: [B:383:0x08ff, B:363:0x089f, B:343:0x083e, B:209:0x05fd, B:259:0x06c4, B:132:0x042f] A[DONT_GENERATE, DONT_INLINE]
      0x0920: PHI (r11v67 int) = (r11v37 int), (r11v38 int), (r11v39 int), (r11v50 int), (r11v57 int), (r11v68 int) binds: [B:383:0x08ff, B:363:0x089f, B:343:0x083e, B:209:0x05fd, B:259:0x06c4, B:132:0x042f] A[DONT_GENERATE, DONT_INLINE]
      0x0920: PHI (r13v67 sun.misc.Unsafe) = 
      (r13v40 sun.misc.Unsafe)
      (r13v41 sun.misc.Unsafe)
      (r13v42 sun.misc.Unsafe)
      (r13v50 sun.misc.Unsafe)
      (r13v56 sun.misc.Unsafe)
      (r13v68 sun.misc.Unsafe)
     binds: [B:383:0x08ff, B:363:0x089f, B:343:0x083e, B:209:0x05fd, B:259:0x06c4, B:132:0x042f] A[DONT_GENERATE, DONT_INLINE]
      0x0920: PHI (r15v35 int) = (r15v7 int), (r15v8 int), (r15v9 int), (r15v18 int), (r15v25 int), (r15v36 int) binds: [B:383:0x08ff, B:363:0x089f, B:343:0x083e, B:209:0x05fd, B:259:0x06c4, B:132:0x042f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0d12 A[PHI: r3 r4 r7 r10 r11 r18 r19
      0x0d12: PHI (r3v83 int) = 
      (r3v53 int)
      (r3v54 int)
      (r3v55 int)
      (r3v56 int)
      (r3v57 int)
      (r3v58 int)
      (r3v59 int)
      (r3v60 int)
      (r3v66 int)
      (r3v73 int)
      (r3v84 int)
     binds: [B:511:0x0cff, B:508:0x0cdf, B:505:0x0cbf, B:502:0x0c9f, B:499:0x0c7f, B:496:0x0c5e, B:489:0x0c34, B:475:0x0bf7, B:468:0x0b9f, B:473:0x0be6, B:441:0x0aa0] A[DONT_GENERATE, DONT_INLINE]
      0x0d12: PHI (r4v90 int) = 
      (r4v64 int)
      (r4v65 int)
      (r4v66 int)
      (r4v67 int)
      (r4v68 int)
      (r4v69 int)
      (r4v70 int)
      (r4v71 int)
      (r4v76 int)
      (r4v82 int)
      (r4v91 int)
     binds: [B:511:0x0cff, B:508:0x0cdf, B:505:0x0cbf, B:502:0x0c9f, B:499:0x0c7f, B:496:0x0c5e, B:489:0x0c34, B:475:0x0bf7, B:468:0x0b9f, B:473:0x0be6, B:441:0x0aa0] A[DONT_GENERATE, DONT_INLINE]
      0x0d12: PHI (r7v138 com.google.android.gms.internal.firebase-auth-api.zzaiv) = 
      (r7v115 com.google.android.gms.internal.firebase-auth-api.zzaiv)
      (r7v116 com.google.android.gms.internal.firebase-auth-api.zzaiv)
      (r7v117 com.google.android.gms.internal.firebase-auth-api.zzaiv)
      (r7v118 com.google.android.gms.internal.firebase-auth-api.zzaiv)
      (r7v119 com.google.android.gms.internal.firebase-auth-api.zzaiv)
      (r7v120 com.google.android.gms.internal.firebase-auth-api.zzaiv)
      (r7v121 com.google.android.gms.internal.firebase-auth-api.zzaiv)
      (r7v122 com.google.android.gms.internal.firebase-auth-api.zzaiv)
      (r7v125 com.google.android.gms.internal.firebase-auth-api.zzaiv)
      (r7v130 com.google.android.gms.internal.firebase-auth-api.zzaiv)
      (r7v139 com.google.android.gms.internal.firebase-auth-api.zzaiv)
     binds: [B:511:0x0cff, B:508:0x0cdf, B:505:0x0cbf, B:502:0x0c9f, B:499:0x0c7f, B:496:0x0c5e, B:489:0x0c34, B:475:0x0bf7, B:468:0x0b9f, B:473:0x0be6, B:441:0x0aa0] A[DONT_GENERATE, DONT_INLINE]
      0x0d12: PHI (r10v74 int) = 
      (r10v55 int)
      (r10v56 int)
      (r10v57 int)
      (r10v58 int)
      (r10v59 int)
      (r10v60 int)
      (r10v61 int)
      (r10v62 int)
      (r10v64 int)
      (r10v69 int)
      (r10v75 int)
     binds: [B:511:0x0cff, B:508:0x0cdf, B:505:0x0cbf, B:502:0x0c9f, B:499:0x0c7f, B:496:0x0c5e, B:489:0x0c34, B:475:0x0bf7, B:468:0x0b9f, B:473:0x0be6, B:441:0x0aa0] A[DONT_GENERATE, DONT_INLINE]
      0x0d12: PHI (r11v95 com.google.android.gms.internal.firebase-auth-api.zzalr<T>) = 
      (r11v71 com.google.android.gms.internal.firebase-auth-api.zzalr<T>)
      (r11v72 com.google.android.gms.internal.firebase-auth-api.zzalr<T>)
      (r11v73 com.google.android.gms.internal.firebase-auth-api.zzalr<T>)
      (r11v74 com.google.android.gms.internal.firebase-auth-api.zzalr<T>)
      (r11v75 com.google.android.gms.internal.firebase-auth-api.zzalr<T>)
      (r11v76 com.google.android.gms.internal.firebase-auth-api.zzalr<T>)
      (r11v77 com.google.android.gms.internal.firebase-auth-api.zzalr<T>)
      (r11v78 com.google.android.gms.internal.firebase-auth-api.zzalr<T>)
      (r11v83 com.google.android.gms.internal.firebase-auth-api.zzalr<T>)
      (r11v89 com.google.android.gms.internal.firebase-auth-api.zzalr<T>)
      (r11v96 com.google.android.gms.internal.firebase-auth-api.zzalr<T>)
     binds: [B:511:0x0cff, B:508:0x0cdf, B:505:0x0cbf, B:502:0x0c9f, B:499:0x0c7f, B:496:0x0c5e, B:489:0x0c34, B:475:0x0bf7, B:468:0x0b9f, B:473:0x0be6, B:441:0x0aa0] A[DONT_GENERATE, DONT_INLINE]
      0x0d12: PHI (r18v53 int) = 
      (r18v31 int)
      (r18v32 int)
      (r18v33 int)
      (r18v34 int)
      (r18v35 int)
      (r18v36 int)
      (r18v37 int)
      (r18v38 int)
      (r18v41 int)
      (r18v46 int)
      (r18v54 int)
     binds: [B:511:0x0cff, B:508:0x0cdf, B:505:0x0cbf, B:502:0x0c9f, B:499:0x0c7f, B:496:0x0c5e, B:489:0x0c34, B:475:0x0bf7, B:468:0x0b9f, B:473:0x0be6, B:441:0x0aa0] A[DONT_GENERATE, DONT_INLINE]
      0x0d12: PHI (r19v30 int) = 
      (r19v12 int)
      (r19v13 int)
      (r19v14 int)
      (r19v15 int)
      (r19v16 int)
      (r19v17 int)
      (r19v18 int)
      (r19v19 int)
      (r19v22 int)
      (r19v25 int)
      (r19v31 int)
     binds: [B:511:0x0cff, B:508:0x0cdf, B:505:0x0cbf, B:502:0x0c9f, B:499:0x0c7f, B:496:0x0c5e, B:489:0x0c34, B:475:0x0bf7, B:468:0x0b9f, B:473:0x0be6, B:441:0x0aa0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0d15  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0936 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0d87 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:637:0x0923 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v122, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int zza(T r31, byte[] r32, int r33, int r34, int r35, com.google.android.gms.internal.p000firebaseauthapi.zzaiv r36) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.zzalr.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.firebase-auth-api.zzaiv):int");
    }

    private final int zza(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zza(i, 0);
    }

    private final int zzb(int i) {
        return this.zzc[i + 2];
    }

    private final int zza(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private final int zzc(int i) {
        return this.zzc[i + 1];
    }

    private static <T> long zzd(T t, long j) {
        return ((Long) zzana.zze(t, j)).longValue();
    }

    private final zzakk zzd(int i) {
        return (zzakk) this.zzd[((i / 3) << 1) + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x038f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <T> com.google.android.gms.internal.p000firebaseauthapi.zzalr<T> zza(java.lang.Class<T> r33, com.google.android.gms.internal.p000firebaseauthapi.zzall r34, com.google.android.gms.internal.p000firebaseauthapi.zzalv r35, com.google.android.gms.internal.p000firebaseauthapi.zzakx r36, com.google.android.gms.internal.p000firebaseauthapi.zzamv<?, ?> r37, com.google.android.gms.internal.p000firebaseauthapi.zzajx<?> r38, com.google.android.gms.internal.p000firebaseauthapi.zzalg r39) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.zzalr.zza(java.lang.Class, com.google.android.gms.internal.firebase-auth-api.zzall, com.google.android.gms.internal.firebase-auth-api.zzalv, com.google.android.gms.internal.firebase-auth-api.zzakx, com.google.android.gms.internal.firebase-auth-api.zzamv, com.google.android.gms.internal.firebase-auth-api.zzajx, com.google.android.gms.internal.firebase-auth-api.zzalg):com.google.android.gms.internal.firebase-auth-api.zzalr");
    }

    private final zzamc zze(int i) {
        int i2 = (i / 3) << 1;
        zzamc zzamcVar = (zzamc) this.zzd[i2];
        if (zzamcVar != null) {
            return zzamcVar;
        }
        zzamc<T> zzamcVarZza = zzaly.zza().zza((Class) this.zzd[i2 + 1]);
        this.zzd[i2] = zzamcVarZza;
        return zzamcVarZza;
    }

    static zzamy zzc(Object obj) {
        zzakg zzakgVar = (zzakg) obj;
        zzamy zzamyVar = zzakgVar.zzb;
        if (zzamyVar != zzamy.zzc()) {
            return zzamyVar;
        }
        zzamy zzamyVarZzd = zzamy.zzd();
        zzakgVar.zzb = zzamyVarZzd;
        return zzamyVarZzd;
    }

    private final <UT, UB> UB zza(Object obj, int i, UB ub, zzamv<UT, UB> zzamvVar, Object obj2) {
        zzakk zzakkVarZzd;
        int i2 = this.zzc[i];
        Object objZze = zzana.zze(obj, zzc(i) & 1048575);
        return (objZze == null || (zzakkVarZzd = zzd(i)) == null) ? ub : (UB) zza(i, i2, this.zzr.zze(objZze), zzakkVarZzd, (zzakk) ub, (zzamv<UT, zzakk>) zzamvVar, obj2);
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzakk zzakkVar, UB ub, zzamv<UT, UB> zzamvVar, Object obj) {
        zzale<?, ?> zzaleVarZza = this.zzr.zza(zzf(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzakkVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzamvVar.zzc(obj);
                }
                zzajf zzajfVarZzc = zzaiw.zzc(zzalf.zza(zzaleVarZza, next.getKey(), next.getValue()));
                try {
                    zzalf.zza(zzajfVarZzc.zzb(), zzaleVarZza, next.getKey(), next.getValue());
                    zzamvVar.zza((zzamv<UT, UB>) ub, i2, zzajfVarZzc.zza());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private final Object zzf(int i) {
        return this.zzd[(i / 3) << 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t, int i) {
        zzamc zzamcVarZze = zze(i);
        long jZzc = zzc(i) & 1048575;
        if (!zzc((zzalr<T>) t, i)) {
            return zzamcVarZze.zza();
        }
        Object object = zzb.getObject(t, jZzc);
        if (zzg(object)) {
            return object;
        }
        Object objZza = zzamcVarZze.zza();
        if (object != null) {
            zzamcVarZze.zza(objZza, object);
        }
        return objZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t, int i, int i2) {
        zzamc zzamcVarZze = zze(i2);
        if (!zzc((zzalr<T>) t, i, i2)) {
            return zzamcVarZze.zza();
        }
        Object object = zzb.getObject(t, zzc(i2) & 1048575);
        if (zzg(object)) {
            return object;
        }
        Object objZza = zzamcVarZze.zza();
        if (object != null) {
            zzamcVarZze.zza(objZza, object);
        }
        return objZza;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzamc
    public final T zza() {
        return (T) this.zzn.zza(this.zzg);
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private zzalr(int[] iArr, Object[] objArr, int i, int i2, zzaln zzalnVar, boolean z, int[] iArr2, int i3, int i4, zzalv zzalvVar, zzakx zzakxVar, zzamv<?, ?> zzamvVar, zzajx<?> zzajxVar, zzalg zzalgVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzalnVar instanceof zzakg;
        this.zzh = zzajxVar != null && zzajxVar.zza(zzalnVar);
        this.zzj = false;
        this.zzk = iArr2;
        this.zzl = i3;
        this.zzm = i4;
        this.zzn = zzalvVar;
        this.zzo = zzakxVar;
        this.zzp = zzamvVar;
        this.zzq = zzajxVar;
        this.zzg = zzalnVar;
        this.zzr = zzalgVar;
    }

    private static void zzf(Object obj) {
        if (zzg(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + String.valueOf(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzamc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(T r8) {
        /*
            r7 = this;
            boolean r0 = zzg(r8)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r8 instanceof com.google.android.gms.internal.p000firebaseauthapi.zzakg
            r1 = 0
            if (r0 == 0) goto L1a
            r0 = r8
            com.google.android.gms.internal.firebase-auth-api.zzakg r0 = (com.google.android.gms.internal.p000firebaseauthapi.zzakg) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zzb(r2)
            r0.zza = r1
            r0.zzu()
        L1a:
            int[] r0 = r7.zzc
            int r0 = r0.length
        L1d:
            if (r1 >= r0) goto L83
            int r2 = r7.zzc(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            long r3 = (long) r3
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r2 = r2 & r5
            int r2 = r2 >>> 20
            r5 = 9
            if (r2 == r5) goto L6d
            r5 = 60
            if (r2 == r5) goto L55
            r5 = 68
            if (r2 == r5) goto L55
            switch(r2) {
                case 17: goto L6d;
                case 18: goto L4f;
                case 19: goto L4f;
                case 20: goto L4f;
                case 21: goto L4f;
                case 22: goto L4f;
                case 23: goto L4f;
                case 24: goto L4f;
                case 25: goto L4f;
                case 26: goto L4f;
                case 27: goto L4f;
                case 28: goto L4f;
                case 29: goto L4f;
                case 30: goto L4f;
                case 31: goto L4f;
                case 32: goto L4f;
                case 33: goto L4f;
                case 34: goto L4f;
                case 35: goto L4f;
                case 36: goto L4f;
                case 37: goto L4f;
                case 38: goto L4f;
                case 39: goto L4f;
                case 40: goto L4f;
                case 41: goto L4f;
                case 42: goto L4f;
                case 43: goto L4f;
                case 44: goto L4f;
                case 45: goto L4f;
                case 46: goto L4f;
                case 47: goto L4f;
                case 48: goto L4f;
                case 49: goto L4f;
                case 50: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L80
        L3d:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.p000firebaseauthapi.zzalr.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L80
            com.google.android.gms.internal.firebase-auth-api.zzalg r6 = r7.zzr
            java.lang.Object r5 = r6.zzc(r5)
            r2.putObject(r8, r3, r5)
            goto L80
        L4f:
            com.google.android.gms.internal.firebase-auth-api.zzakx r2 = r7.zzo
            r2.zzb(r8, r3)
            goto L80
        L55:
            int[] r2 = r7.zzc
            r2 = r2[r1]
            boolean r2 = r7.zzc(r8, r2, r1)
            if (r2 == 0) goto L80
            com.google.android.gms.internal.firebase-auth-api.zzamc r2 = r7.zze(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.p000firebaseauthapi.zzalr.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzd(r3)
            goto L80
        L6d:
            boolean r2 = r7.zzc(r8, r1)
            if (r2 == 0) goto L80
            com.google.android.gms.internal.firebase-auth-api.zzamc r2 = r7.zze(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.p000firebaseauthapi.zzalr.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzd(r3)
        L80:
            int r1 = r1 + 3
            goto L1d
        L83:
            com.google.android.gms.internal.firebase-auth-api.zzamv<?, ?> r0 = r7.zzp
            r0.zzf(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L91
            com.google.android.gms.internal.firebase-auth-api.zzajx<?> r0 = r7.zzq
            r0.zzc(r8)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.zzalr.zzd(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzamc
    public final void zza(T t, T t2) {
        zzf(t);
        t2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzc = zzc(i);
            long j = 1048575 & iZzc;
            int i2 = this.zzc[i];
            switch ((iZzc & 267386880) >>> 20) {
                case 0:
                    if (zzc((zzalr<T>) t2, i)) {
                        zzana.zza(t, j, zzana.zza(t2, j));
                        zzb((zzalr<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzc((zzalr<T>) t2, i)) {
                        zzana.zza(t, j, zzana.zzb(t2, j));
                        zzb((zzalr<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzc((zzalr<T>) t2, i)) {
                        zzana.zza(t, j, zzana.zzd(t2, j));
                        zzb((zzalr<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzc((zzalr<T>) t2, i)) {
                        zzana.zza(t, j, zzana.zzd(t2, j));
                        zzb((zzalr<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzc((zzalr<T>) t2, i)) {
                        zzana.zza(t, j, zzana.zzc(t2, j));
                        zzb((zzalr<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzc((zzalr<T>) t2, i)) {
                        zzana.zza(t, j, zzana.zzd(t2, j));
                        zzb((zzalr<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzc((zzalr<T>) t2, i)) {
                        zzana.zza(t, j, zzana.zzc(t2, j));
                        zzb((zzalr<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzc((zzalr<T>) t2, i)) {
                        zzana.zzc(t, j, zzana.zzh(t2, j));
                        zzb((zzalr<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzc((zzalr<T>) t2, i)) {
                        zzana.zza(t, j, zzana.zze(t2, j));
                        zzb((zzalr<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t, t2, i);
                    break;
                case 10:
                    if (zzc((zzalr<T>) t2, i)) {
                        zzana.zza(t, j, zzana.zze(t2, j));
                        zzb((zzalr<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzc((zzalr<T>) t2, i)) {
                        zzana.zza(t, j, zzana.zzc(t2, j));
                        zzb((zzalr<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzc((zzalr<T>) t2, i)) {
                        zzana.zza(t, j, zzana.zzc(t2, j));
                        zzb((zzalr<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzc((zzalr<T>) t2, i)) {
                        zzana.zza(t, j, zzana.zzc(t2, j));
                        zzb((zzalr<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzc((zzalr<T>) t2, i)) {
                        zzana.zza(t, j, zzana.zzd(t2, j));
                        zzb((zzalr<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzc((zzalr<T>) t2, i)) {
                        zzana.zza(t, j, zzana.zzc(t2, j));
                        zzb((zzalr<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzc((zzalr<T>) t2, i)) {
                        zzana.zza(t, j, zzana.zzd(t2, j));
                        zzb((zzalr<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(t, t2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzo.zza(t, t2, j);
                    break;
                case 50:
                    zzame.zza(this.zzr, t, t2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzc((zzalr<T>) t2, i2, i)) {
                        zzana.zza(t, j, zzana.zze(t2, j));
                        zzb((zzalr<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzb(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzc((zzalr<T>) t2, i2, i)) {
                        zzana.zza(t, j, zzana.zze(t2, j));
                        zzb((zzalr<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t, t2, i);
                    break;
            }
        }
        zzame.zza(this.zzp, t, t2);
        if (this.zzh) {
            zzame.zza(this.zzq, t, t2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0625 A[Catch: all -> 0x0297, TryCatch #2 {all -> 0x0297, blocks: (B:153:0x05f6, B:163:0x0620, B:165:0x0625, B:166:0x062a, B:50:0x00cc, B:51:0x00de, B:52:0x00f0, B:53:0x0102, B:54:0x0113, B:55:0x0124, B:57:0x012e, B:60:0x0135, B:61:0x013b, B:62:0x0148, B:63:0x0159, B:64:0x0166, B:65:0x0177, B:67:0x0182, B:68:0x0193, B:69:0x01a4, B:70:0x01b5, B:71:0x01c6, B:72:0x01d7, B:73:0x01e8, B:74:0x01f9, B:75:0x020b, B:77:0x021b, B:81:0x023c, B:78:0x0225, B:80:0x022d, B:82:0x024d, B:83:0x025f, B:84:0x026d, B:85:0x027b, B:86:0x0289), top: B:193:0x05f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x065b A[LOOP:3: B:181:0x0657->B:183:0x065b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0630 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.google.android.gms.internal.firebase-auth-api.zzamd] */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzamc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r18, com.google.android.gms.internal.p000firebaseauthapi.zzamd r19, com.google.android.gms.internal.p000firebaseauthapi.zzajv r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.zzalr.zza(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzamd, com.google.android.gms.internal.firebase-auth-api.zzajv):void");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzamc
    public final void zza(T t, byte[] bArr, int i, int i2, zzaiv zzaivVar) throws IOException {
        zza((zzalr<T>) t, bArr, i, i2, 0, zzaivVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(T t, T t2, int i) {
        if (zzc((zzalr<T>) t2, i)) {
            long jZzc = zzc(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t2, jZzc);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + String.valueOf(t2));
            }
            zzamc zzamcVarZze = zze(i);
            if (!zzc((zzalr<T>) t, i)) {
                if (!zzg(object)) {
                    unsafe.putObject(t, jZzc, object);
                } else {
                    Object objZza = zzamcVarZze.zza();
                    zzamcVarZze.zza(objZza, object);
                    unsafe.putObject(t, jZzc, objZza);
                }
                zzb((zzalr<T>) t, i);
                return;
            }
            Object object2 = unsafe.getObject(t, jZzc);
            if (!zzg(object2)) {
                Object objZza2 = zzamcVarZze.zza();
                zzamcVarZze.zza(objZza2, object2);
                unsafe.putObject(t, jZzc, objZza2);
                object2 = objZza2;
            }
            zzamcVarZze.zza(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzb(T t, T t2, int i) {
        int i2 = this.zzc[i];
        if (zzc((zzalr<T>) t2, i2, i)) {
            long jZzc = zzc(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t2, jZzc);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + String.valueOf(t2));
            }
            zzamc zzamcVarZze = zze(i);
            if (!zzc((zzalr<T>) t, i2, i)) {
                if (!zzg(object)) {
                    unsafe.putObject(t, jZzc, object);
                } else {
                    Object objZza = zzamcVarZze.zza();
                    zzamcVarZze.zza(objZza, object);
                    unsafe.putObject(t, jZzc, objZza);
                }
                zzb((zzalr<T>) t, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(t, jZzc);
            if (!zzg(object2)) {
                Object objZza2 = zzamcVarZze.zza();
                zzamcVarZze.zza(objZza2, object2);
                unsafe.putObject(t, jZzc, objZza2);
                object2 = objZza2;
            }
            zzamcVarZze.zza(object2, object);
        }
    }

    private final void zza(Object obj, int i, zzamd zzamdVar) throws IOException {
        if (zzg(i)) {
            zzana.zza(obj, i & 1048575, zzamdVar.zzr());
        } else if (this.zzi) {
            zzana.zza(obj, i & 1048575, zzamdVar.zzq());
        } else {
            zzana.zza(obj, i & 1048575, zzamdVar.zzp());
        }
    }

    private final void zzb(T t, int i) {
        int iZzb = zzb(i);
        long j = 1048575 & iZzb;
        if (j == 1048575) {
            return;
        }
        zzana.zza(t, j, (1 << (iZzb >>> 20)) | zzana.zzc(t, j));
    }

    private final void zzb(T t, int i, int i2) {
        zzana.zza(t, zzb(i2) & 1048575, i);
    }

    private final void zza(T t, int i, Object obj) {
        zzb.putObject(t, zzc(i) & 1048575, obj);
        zzb((zzalr<T>) t, i);
    }

    private final void zza(T t, int i, int i2, Object obj) {
        zzb.putObject(t, zzc(i2) & 1048575, obj);
        zzb((zzalr<T>) t, i, i2);
    }

    private final <K, V> void zza(zzanm zzanmVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzanmVar.zza(i, this.zzr.zza(zzf(i2)), this.zzr.zzd(obj));
        }
    }

    private static void zza(int i, Object obj, zzanm zzanmVar) throws IOException {
        if (obj instanceof String) {
            zzanmVar.zza(i, (String) obj);
        } else {
            zzanmVar.zza(i, (zzaiw) obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:176:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzamc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r24, com.google.android.gms.internal.firebase-auth-api.zzanm r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.zzalr.zza(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzanm):void");
    }

    private static <UT, UB> void zza(zzamv<UT, UB> zzamvVar, T t, zzanm zzanmVar) throws IOException {
        zzamvVar.zzb((zzamv<UT, UB>) zzamvVar.zzd(t), zzanmVar);
    }

    private final boolean zzc(T t, T t2, int i) {
        return zzc((zzalr<T>) t, i) == zzc((zzalr<T>) t2, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01c1  */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzamc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzb(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.zzalr.zzb(java.lang.Object, java.lang.Object):boolean");
    }

    private final boolean zzc(T t, int i) {
        int iZzb = zzb(i);
        long j = iZzb & 1048575;
        if (j != 1048575) {
            return (zzana.zzc(t, j) & (1 << (iZzb >>> 20))) != 0;
        }
        int iZzc = zzc(i);
        long j2 = iZzc & 1048575;
        switch ((iZzc & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(zzana.zza(t, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzana.zzb(t, j2)) != 0;
            case 2:
                return zzana.zzd(t, j2) != 0;
            case 3:
                return zzana.zzd(t, j2) != 0;
            case 4:
                return zzana.zzc(t, j2) != 0;
            case 5:
                return zzana.zzd(t, j2) != 0;
            case 6:
                return zzana.zzc(t, j2) != 0;
            case 7:
                return zzana.zzh(t, j2);
            case 8:
                Object objZze = zzana.zze(t, j2);
                if (objZze instanceof String) {
                    return !((String) objZze).isEmpty();
                }
                if (objZze instanceof zzaiw) {
                    return !zzaiw.zza.equals(objZze);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzana.zze(t, j2) != null;
            case 10:
                return !zzaiw.zza.equals(zzana.zze(t, j2));
            case 11:
                return zzana.zzc(t, j2) != 0;
            case 12:
                return zzana.zzc(t, j2) != 0;
            case 13:
                return zzana.zzc(t, j2) != 0;
            case 14:
                return zzana.zzd(t, j2) != 0;
            case 15:
                return zzana.zzc(t, j2) != 0;
            case 16:
                return zzana.zzd(t, j2) != 0;
            case 17:
                return zzana.zze(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zza(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzc((zzalr<T>) t, i);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dd  */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.google.android.gms.internal.firebase-auth-api.zzamc] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.internal.firebase-auth-api.zzamc] */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzamc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zze(T r19) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.zzalr.zze(java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i, zzamc zzamcVar) {
        return zzamcVar.zze(zzana.zze(obj, i & 1048575));
    }

    private static boolean zzg(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzakg) {
            return ((zzakg) obj).zzw();
        }
        return true;
    }

    private final boolean zzc(T t, int i, int i2) {
        return zzana.zzc(t, (long) (zzb(i2) & 1048575)) == i;
    }

    private static <T> boolean zze(T t, long j) {
        return ((Boolean) zzana.zze(t, j)).booleanValue();
    }
}
