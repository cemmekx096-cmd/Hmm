package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.common.MimeTypes;
import androidx.media3.exoplayer.RendererCapabilities;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzaba extends zztp implements zzabq {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private int zzA;
    private int zzB;
    private int zzC;
    private zzmh zzD;
    private boolean zzE;
    private long zzF;
    private int zzG;
    private long zzH;
    private zzcd zzI;
    private zzcd zzJ;
    private int zzK;
    private int zzL;
    private zzabo zzM;
    private long zzN;
    private long zzO;
    private boolean zzP;
    private boolean zzQ;
    private int zzR;
    private final Context zze;
    private final boolean zzf;
    private final zzach zzg;
    private final boolean zzh;
    private final zzabr zzi;
    private final zzabp zzj;
    private final long zzk;
    private final PriorityQueue zzl;
    private zzaaz zzm;
    private boolean zzn;
    private boolean zzo;
    private zzacn zzp;
    private boolean zzq;
    private int zzr;
    private List zzs;
    private Surface zzt;
    private zzabd zzu;
    private zzeo zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private long zzz;

    protected zzaba(zzaay zzaayVar) {
        super(2, zzaayVar.zzd, zzaayVar.zzc, false, 30.0f);
        Context applicationContext = zzaayVar.zza.getApplicationContext();
        this.zze = applicationContext;
        this.zzp = null;
        this.zzg = new zzach(zzaayVar.zze, zzaayVar.zzf);
        this.zzf = this.zzp == null;
        this.zzi = new zzabr(applicationContext, this, 0L);
        this.zzj = new zzabp();
        this.zzh = "NVIDIA".equals(Build.MANUFACTURER);
        this.zzv = zzeo.zza;
        this.zzx = 1;
        this.zzy = 0;
        this.zzI = zzcd.zza;
        this.zzL = 0;
        this.zzJ = null;
        this.zzK = -1000;
        this.zzN = -9223372036854775807L;
        this.zzO = -9223372036854775807L;
        this.zzl = new PriorityQueue();
        this.zzk = -9223372036854775807L;
        this.zzD = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zzad(com.google.android.gms.internal.ads.zzti r11, com.google.android.gms.internal.ads.zzz r12) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaba.zzad(com.google.android.gms.internal.ads.zzti, com.google.android.gms.internal.ads.zzz):int");
    }

    protected static int zzae(zzti zztiVar, zzz zzzVar) {
        int i = zzzVar.zzp;
        if (i == -1) {
            return zzad(zztiVar, zzzVar);
        }
        List list = zzzVar.zzr;
        int size = list.size();
        int length = 0;
        for (int i2 = 0; i2 < size; i2++) {
            length += ((byte[]) list.get(i2)).length;
        }
        return i + length;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007e A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0081 A[Catch: all -> 0x07ab, TRY_ENTER, TryCatch #0 {, blocks: (B:7:0x000d, B:9:0x0011, B:11:0x001f, B:515:0x07a3, B:42:0x0081, B:44:0x0087, B:47:0x0092, B:80:0x00fd, B:82:0x0103, B:507:0x078c, B:516:0x07a7), top: B:522:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected static final boolean zzba(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 2926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaba.zzba(java.lang.String):boolean");
    }

    protected static final boolean zzbb(zzti zztiVar) {
        return Build.VERSION.SDK_INT >= 35 && zztiVar.zzh;
    }

    private final Surface zzbc(zzti zztiVar) {
        zzacn zzacnVar = this.zzp;
        if (zzacnVar != null) {
            return zzacnVar.zzb();
        }
        Surface surface = this.zzt;
        if (surface != null) {
            return surface;
        }
        if (zzbb(zztiVar)) {
            return null;
        }
        zzdd.zzf(zzaZ(zztiVar));
        zzabd zzabdVar = this.zzu;
        if (zzabdVar != null) {
            if (zzabdVar.zza != zztiVar.zzf) {
                zzbh();
            }
        }
        if (this.zzu == null) {
            this.zzu = zzabd.zza(this.zze, zztiVar.zzf);
        }
        return this.zzu;
    }

    private static List zzbd(Context context, zztr zztrVar, zzz zzzVar, boolean z, boolean z2) throws zztw {
        String str = zzzVar.zzo;
        if (str == null) {
            return zzfyf.zzn();
        }
        if (Build.VERSION.SDK_INT >= 26 && MimeTypes.VIDEO_DOLBY_VISION.equals(str) && !zzaax.zza(context)) {
            List listZzc = zzuc.zzc(zztrVar, zzzVar, z, z2);
            if (!listZzc.isEmpty()) {
                return listZzc;
            }
        }
        return zzuc.zze(zztrVar, zzzVar, z, z2);
    }

    private final void zzbe() {
        zzcd zzcdVar = this.zzJ;
        if (zzcdVar != null) {
            this.zzg.zzt(zzcdVar);
        }
    }

    private final void zzbf(long j, long j2, zzz zzzVar) {
        zzabo zzaboVar = this.zzM;
        if (zzaboVar != null) {
            zzaboVar.zzcT(j, j2, zzzVar, zzay());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresNonNull({"displaySurface"})
    public final void zzbg() {
        this.zzg.zzq(this.zzt);
        this.zzw = true;
    }

    private final void zzbh() {
        zzabd zzabdVar = this.zzu;
        if (zzabdVar != null) {
            zzabdVar.release();
            this.zzu = null;
        }
    }

    private final void zzbi(Object obj) throws zzin {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.zzt == surface) {
            if (surface != null) {
                zzbe();
                Surface surface2 = this.zzt;
                if (surface2 == null || !this.zzw) {
                    return;
                }
                this.zzg.zzq(surface2);
                return;
            }
            return;
        }
        this.zzt = surface;
        if (this.zzp == null) {
            this.zzi.zzk(surface);
        }
        this.zzw = false;
        int iZzcU = zzcU();
        zztf zztfVarZzaB = zzaB();
        if (zztfVarZzaB != null && this.zzp == null) {
            zzti zztiVarZzaD = zzaD();
            zztiVarZzaD.getClass();
            if (!zzbj(zztiVarZzaD) || this.zzn) {
                zzaI();
                zzaF();
            } else {
                Surface surfaceZzbc = zzbc(zztiVarZzaD);
                if (surfaceZzbc != null) {
                    zztfVarZzaB.zzp(surfaceZzbc);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    zztfVarZzaB.zzi();
                }
            }
        }
        if (surface != null) {
            zzbe();
        } else {
            this.zzJ = null;
            zzacn zzacnVar = this.zzp;
            if (zzacnVar != null) {
                zzacnVar.zzi();
            }
        }
        if (iZzcU == 2) {
            zzacn zzacnVar2 = this.zzp;
            if (zzacnVar2 != null) {
                zzacnVar2.zzk(true);
            } else {
                this.zzi.zzc(true);
            }
        }
    }

    private final boolean zzbj(zzti zztiVar) {
        if (this.zzp != null) {
            return true;
        }
        Surface surface = this.zzt;
        return (surface != null && surface.isValid()) || zzbb(zztiVar) || zzaZ(zztiVar);
    }

    protected final void zzA() {
        zzacn zzacnVar = this.zzp;
        if (zzacnVar == null || !this.zzf) {
            return;
        }
        zzacnVar.zzn();
    }

    protected final void zzC() {
        try {
            super.zzC();
        } finally {
            this.zzq = false;
            this.zzN = -9223372036854775807L;
            zzbh();
        }
    }

    protected final void zzD() {
        this.zzA = 0;
        this.zzz = zzi().zzb();
        this.zzF = 0L;
        this.zzG = 0;
        zzacn zzacnVar = this.zzp;
        if (zzacnVar != null) {
            zzacnVar.zzx();
        } else {
            this.zzi.zzd();
        }
    }

    protected final void zzE() {
        if (this.zzA > 0) {
            long jZzb = zzi().zzb();
            this.zzg.zzn(this.zzA, jZzb - this.zzz);
            this.zzA = 0;
            this.zzz = jZzb;
        }
        int i = this.zzG;
        if (i != 0) {
            this.zzg.zzr(this.zzF, i);
            this.zzF = 0L;
            this.zzG = 0;
        }
        zzacn zzacnVar = this.zzp;
        if (zzacnVar != null) {
            zzacnVar.zzy();
        } else {
            this.zzi.zze();
        }
    }

    protected final void zzF(zzz[] zzzVarArr, long j, long j2, zzvh zzvhVar) throws zzin {
        super.zzF(zzzVarArr, j, j2, zzvhVar);
        zzbl zzblVarZzh = zzh();
        if (zzblVarZzh.zzo()) {
            this.zzO = -9223372036854775807L;
        } else {
            this.zzO = zzblVarZzh.zzn(zzvhVar.zza, new zzbj()).zzd;
        }
    }

    public final void zzM(float f, float f2) throws zzin {
        super.zzM(f, f2);
        zzacn zzacnVar = this.zzp;
        if (zzacnVar != null) {
            zzacnVar.zzt(f);
        } else {
            this.zzi.zzl(f);
        }
    }

    public final String zzU() {
        return "MediaCodecVideoRenderer";
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.ads.zzin */
    public final void zzV(long j, long j2) throws zzin {
        zzacn zzacnVar = this.zzp;
        if (zzacnVar != null) {
            try {
                zzacnVar.zzo(j, j2);
            } catch (zzacm e) {
                throw zzcX(e, e.zza, false, 7001);
            }
        }
        super.zzV(j, j2);
    }

    public final boolean zzW() {
        zzacn zzacnVar;
        return super.zzW() && ((zzacnVar = this.zzp) == null || zzacnVar.zzB());
    }

    public final boolean zzX() {
        boolean zZzX = super.zzX();
        zzacn zzacnVar = this.zzp;
        if (zzacnVar != null) {
            return zzacnVar.zzD(zZzX);
        }
        if (zZzX && zzaB() == null) {
            return true;
        }
        return this.zzi.zzm(zZzX);
    }

    protected final float zzZ(float f, zzz zzzVar, zzz[] zzzVarArr) {
        zzti zztiVarZzaD;
        float fMax = -1.0f;
        for (zzz zzzVar2 : zzzVarArr) {
            float f2 = zzzVar2.zzz;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        float f3 = fMax == -1.0f ? -1.0f : fMax * f;
        if (this.zzD == null || (zztiVarZzaD = zzaD()) == null) {
            return f3;
        }
        float fZza = zztiVarZzaD.zza(zzzVar.zzv, zzzVar.zzw);
        return f3 != -1.0f ? Math.max(f3, fZza) : fZza;
    }

    protected final zzth zzaC(Throwable th, zzti zztiVar) {
        return new zzaau(th, zztiVar, this.zzt);
    }

    protected final void zzaG(long j) {
        super.zzaG(j);
        this.zzC--;
    }

    protected final void zzaH(zzhs zzhsVar) throws zzin {
        this.zzR = 0;
        this.zzC++;
    }

    protected final void zzaJ() {
        super.zzaJ();
        this.zzl.clear();
        this.zzQ = false;
        this.zzC = 0;
        this.zzR = 0;
        this.zzE = false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.ads.zzin */
    protected final boolean zzaP(zzz zzzVar) throws zzin {
        zzacn zzacnVar = this.zzp;
        if (zzacnVar == null || zzacnVar.zzC()) {
            return true;
        }
        try {
            zzacnVar.zzA(zzzVar);
            return true;
        } catch (zzacm e) {
            throw zzcX(e, zzzVar, false, 7000);
        }
    }

    protected final boolean zzaQ(zzhs zzhsVar) {
        if (!zzQ() && !zzhsVar.zzh() && this.zzO != -9223372036854775807L) {
            if (this.zzO - (zzhsVar.zze - zzaw()) > 100000) {
                boolean z = zzhsVar.zze < zzf();
                if ((z || this.zzQ) && !zzhsVar.zze() && zzhsVar.zzi()) {
                    zzhsVar.zzb();
                    if (z) {
                        this.zza.zzd++;
                    } else if (this.zzQ) {
                        this.zzl.add(Long.valueOf(zzhsVar.zze));
                        this.zzR++;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    protected final boolean zzaR() {
        return this.zzD == null || this.zzE || zzaM() || zzav() != -9223372036854775807L;
    }

    protected final boolean zzaS(zzti zztiVar) {
        return zzbj(zztiVar);
    }

    protected final boolean zzaT() {
        zzti zztiVarZzaD = zzaD();
        if (this.zzp != null && zztiVarZzaD != null) {
            String str = zztiVarZzaD.zza;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.zzaT();
    }

    protected final void zzaW(int i, int i2) {
        zzid zzidVar = this.zza;
        zzidVar.zzh += i;
        int i3 = i + i2;
        zzidVar.zzg += i3;
        this.zzA += i3;
        int i4 = this.zzB + i3;
        this.zzB = i4;
        zzidVar.zzi = Math.max(i4, zzidVar.zzi);
    }

    protected final void zzaX(long j) {
        zzid zzidVar = this.zza;
        zzidVar.zzk += j;
        zzidVar.zzl++;
        this.zzF += j;
        this.zzG++;
    }

    @Override // com.google.android.gms.internal.ads.zzabq
    public final boolean zzaY(long j, long j2, long j3, boolean z, boolean z2) throws zzin {
        int iZzd;
        if (this.zzp != null && this.zzf) {
            j2 -= -this.zzN;
        }
        long j4 = this.zzk;
        if (j4 != -9223372036854775807L) {
            this.zzQ = j2 > zzf() + 200000 && j < j4;
        }
        if (j >= -500000 || z || (iZzd = zzd(j2)) == 0) {
            return false;
        }
        if (z2) {
            zzid zzidVar = this.zza;
            int i = zzidVar.zzd + iZzd;
            zzidVar.zzd = i;
            zzidVar.zzf += this.zzC;
            zzidVar.zzd = i + this.zzl.size();
        } else {
            this.zza.zzj++;
            zzaW(iZzd + this.zzl.size(), this.zzC);
        }
        zzaL();
        zzacn zzacnVar = this.zzp;
        if (zzacnVar != null) {
            zzacnVar.zzj(false);
        }
        return true;
    }

    protected final boolean zzaZ(zzti zztiVar) {
        return !zzba(zztiVar.zza) && (!zztiVar.zzf || zzabd.zzb(this.zze));
    }

    protected final int zzaa(zztr zztrVar, zzz zzzVar) throws zztw {
        boolean z;
        String str = zzzVar.zzo;
        boolean zZzj = zzay.zzj(str);
        int i = RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!zZzj) {
            return RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        }
        Context context = this.zze;
        int i2 = 0;
        boolean z2 = zzzVar.zzs != null;
        List listZzbd = zzbd(context, zztrVar, zzzVar, z2, false);
        if (z2 && listZzbd.isEmpty()) {
            listZzbd = zzbd(context, zztrVar, zzzVar, false, false);
        }
        if (listZzbd.isEmpty()) {
            return 129;
        }
        if (!zzaU(zzzVar)) {
            return 130;
        }
        zzti zztiVar = (zzti) listZzbd.get(0);
        boolean zZzf = zztiVar.zzf(zzzVar);
        if (zZzf) {
            z = true;
        } else {
            for (int i3 = 1; i3 < listZzbd.size(); i3++) {
                zzti zztiVar2 = (zzti) listZzbd.get(i3);
                if (zztiVar2.zzf(zzzVar)) {
                    zZzf = true;
                    z = false;
                    zztiVar = zztiVar2;
                    break;
                }
            }
            z = true;
        }
        int i4 = true != zZzf ? 3 : 4;
        int i5 = true != zztiVar.zzg(zzzVar) ? 8 : 16;
        int i6 = true != zztiVar.zzg ? 0 : 64;
        if (true != z) {
            i = 0;
        }
        if (Build.VERSION.SDK_INT >= 26 && MimeTypes.VIDEO_DOLBY_VISION.equals(str) && !zzaax.zza(context)) {
            i = 256;
        }
        if (zZzf) {
            List listZzbd2 = zzbd(context, zztrVar, zzzVar, z2, true);
            if (!listZzbd2.isEmpty()) {
                zzti zztiVar3 = (zzti) zzuc.zzf(listZzbd2, zzzVar).get(0);
                if (zztiVar3.zzf(zzzVar) && zztiVar3.zzg(zzzVar)) {
                    i2 = 32;
                }
            }
        }
        return i | i4 | i5 | i2 | i6;
    }

    protected final zzie zzab(zzti zztiVar, zzz zzzVar, zzz zzzVar2) {
        int i;
        int i2;
        zzie zzieVarZzc = zztiVar.zzc(zzzVar, zzzVar2);
        int i3 = zzieVarZzc.zze;
        zzaaz zzaazVar = this.zzm;
        zzaazVar.getClass();
        if (zzzVar2.zzv > zzaazVar.zza || zzzVar2.zzw > zzaazVar.zzb) {
            i3 |= 256;
        }
        if (zzae(zztiVar, zzzVar2) > zzaazVar.zzc) {
            i3 |= 64;
        }
        String str = zztiVar.zza;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = zzieVarZzc.zzd;
            i2 = 0;
        }
        return new zzie(str, zzzVar, zzzVar2, i, i2);
    }

    protected final zzie zzac(zzkv zzkvVar) throws zzin {
        zzie zzieVarZzac = super.zzac(zzkvVar);
        zzz zzzVar = zzkvVar.zza;
        zzzVar.getClass();
        this.zzg.zzp(zzzVar, zzieVarZzac);
        return zzieVarZzac;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0103, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final com.google.android.gms.internal.ads.zztc zzag(com.google.android.gms.internal.ads.zzti r21, com.google.android.gms.internal.ads.zzz r22, android.media.MediaCrypto r23, float r24) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaba.zzag(com.google.android.gms.internal.ads.zzti, com.google.android.gms.internal.ads.zzz, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.zztc");
    }

    protected final List zzah(zztr zztrVar, zzz zzzVar, boolean z) throws zztw {
        return zzuc.zzf(zzbd(this.zze, zztrVar, zzzVar, false, false), zzzVar);
    }

    protected final void zzaj(zztf zztfVar, int i, long j, long j2) {
        Trace.beginSection("releaseOutputBuffer");
        zztfVar.zzn(i, j2);
        Trace.endSection();
        this.zza.zze++;
        this.zzB = 0;
        if (this.zzp == null) {
            zzcd zzcdVar = this.zzI;
            if (!zzcdVar.equals(zzcd.zza) && !zzcdVar.equals(this.zzJ)) {
                this.zzJ = zzcdVar;
                this.zzg.zzt(zzcdVar);
            }
            if (!this.zzi.zzn() || this.zzt == null) {
                return;
            }
            zzbg();
        }
    }

    protected final void zzak(zzhs zzhsVar) throws zzin {
        if (this.zzo) {
            ByteBuffer byteBuffer = zzhsVar.zzf;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zztf zztfVarZzaB = zzaB();
                        zztfVarZzaB.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zztfVarZzaB.zzq(bundle);
                    }
                }
            }
        }
    }

    protected final void zzal(Exception exc) {
        zzea.zzd("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzs(exc);
    }

    protected final void zzam(String str, zztc zztcVar, long j, long j2) {
        this.zzg.zzk(str, j, j2);
        this.zzn = zzba(str);
        zzti zztiVarZzaD = zzaD();
        zztiVarZzaD.getClass();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && MimeTypes.VIDEO_VP9.equals(zztiVarZzaD.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrZzi = zztiVarZzaD.zzi();
            int length = codecProfileLevelArrZzi.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (codecProfileLevelArrZzi[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.zzo = z;
    }

    protected final void zzan(String str) {
        this.zzg.zzl(str);
    }

    protected final void zzao(zzz zzzVar, MediaFormat mediaFormat) {
        zztf zztfVarZzaB = zzaB();
        if (zztfVarZzaB != null) {
            zztfVarZzaB.zzr(this.zzx);
        }
        mediaFormat.getClass();
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger(SettingsJsonConstants.ICON_WIDTH_KEY);
        int integer2 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger(SettingsJsonConstants.ICON_HEIGHT_KEY);
        float f = zzzVar.zzB;
        int i = zzzVar.zzA;
        if (i == 90 || i == 270) {
            f = 1.0f / f;
            int i2 = integer2;
            integer2 = integer;
            integer = i2;
        }
        this.zzI = new zzcd(integer, integer2, f);
        zzacn zzacnVar = this.zzp;
        if (zzacnVar == null || !this.zzP) {
            this.zzi.zzj(zzzVar.zzz);
        } else {
            zzx zzxVarZzb = zzzVar.zzb();
            zzxVarZzb.zzam(integer);
            zzxVarZzb.zzQ(integer2);
            zzxVarZzb.zzad(f);
            zzz zzzVarZzan = zzxVarZzb.zzan();
            int i3 = this.zzr;
            zzfyf zzfyfVarZzn = this.zzs;
            if (zzfyfVarZzn == null) {
                zzfyfVarZzn = zzfyf.zzn();
            }
            zzacnVar.zzl(1, zzzVarZzan, zzax(), i3, zzfyfVarZzn);
            this.zzr = 2;
        }
        this.zzP = false;
    }

    protected final void zzap(zztf zztfVar, int i, long j) {
        Trace.beginSection("skipVideoBuffer");
        zztfVar.zzo(i, false);
        Trace.endSection();
        this.zza.zzf++;
    }

    protected final void zzaq() {
        zzacn zzacnVar = this.zzp;
        if (zzacnVar != null) {
            zzacnVar.zzw();
            long jZzax = this.zzN;
            if (jZzax == -9223372036854775807L) {
                jZzax = zzax();
                this.zzN = jZzax;
            }
            this.zzp.zzp(-jZzax);
        } else {
            this.zzi.zzf(2);
        }
        this.zzP = true;
    }

    protected final void zzar() {
        zzacn zzacnVar = this.zzp;
        if (zzacnVar != null) {
            zzacnVar.zzw();
        }
    }

    public final void zzt() {
        zzacn zzacnVar = this.zzp;
        if (zzacnVar == null) {
            this.zzi.zzb();
            return;
        }
        int i = this.zzr;
        if (i == 0 || i == 1) {
            this.zzr = 0;
        } else {
            zzacnVar.zzh();
        }
    }

    protected final void zzx() {
        this.zzJ = null;
        this.zzO = -9223372036854775807L;
        this.zzw = false;
        this.zzE = true;
        try {
            super.zzx();
        } finally {
            zzach zzachVar = this.zzg;
            zzachVar.zzm(this.zza);
            zzachVar.zzt(zzcd.zza);
        }
    }

    protected final void zzy(boolean z, boolean z2) throws zzin {
        super.zzy(z, z2);
        zzn();
        this.zzg.zzo(this.zza);
        if (!this.zzq) {
            if (this.zzs != null && this.zzp == null) {
                zzabg zzabgVar = new zzabg(this.zze, this.zzi);
                zzabgVar.zze(true);
                zzabgVar.zzd(zzi());
                zzabn zzabnVarZzf = zzabgVar.zzf();
                zzabnVarZzf.zzt(1);
                this.zzp = zzabnVarZzf.zze(0);
            }
            this.zzq = true;
        }
        int i = !z2 ? 1 : 0;
        zzacn zzacnVar = this.zzp;
        if (zzacnVar == null) {
            zzabr zzabrVar = this.zzi;
            zzabrVar.zzi(zzi());
            zzabrVar.zzf(i);
            return;
        }
        zzacnVar.zzr(new zzaav(this), zzgdt.zzc());
        zzabo zzaboVar = this.zzM;
        if (zzaboVar != null) {
            this.zzp.zzv(zzaboVar);
        }
        if (this.zzt != null && !this.zzv.equals(zzeo.zza)) {
            this.zzp.zzs(this.zzt, this.zzv);
        }
        this.zzp.zzq(this.zzy);
        this.zzp.zzt(zzau());
        List list = this.zzs;
        if (list != null) {
            this.zzp.zzu(list);
        }
        this.zzr = i;
        zzaE();
    }

    protected final void zzz(long j, boolean z) throws zzin {
        zzacn zzacnVar = this.zzp;
        if (zzacnVar != null && !z) {
            zzacnVar.zzj(true);
        }
        super.zzz(j, z);
        if (this.zzp == null) {
            this.zzi.zzg();
        }
        if (z) {
            zzacn zzacnVar2 = this.zzp;
            if (zzacnVar2 != null) {
                zzacnVar2.zzk(false);
            } else {
                this.zzi.zzc(false);
            }
        }
        this.zzB = 0;
    }

    protected final boolean zzas(long j, long j2, zztf zztfVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzz zzzVar) throws zzin {
        zztfVar.getClass();
        long jZzaw = j3 - zzaw();
        int i4 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.zzl;
            Long l = (Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j3) {
                break;
            }
            priorityQueue.poll();
            i4++;
        }
        zzaW(i4, 0);
        zzacn zzacnVar = this.zzp;
        if (zzacnVar != null) {
            if (!z || z2) {
                return zzacnVar.zzz(j3, new zzaaw(this, zztfVar, i, jZzaw));
            }
            zzap(zztfVar, i, jZzaw);
            return true;
        }
        zzabr zzabrVar = this.zzi;
        long jZzax = zzax();
        zzabp zzabpVar = this.zzj;
        int iZza = zzabrVar.zza(j3, j, j2, jZzax, z, z2, zzabpVar);
        if (iZza == 0) {
            long jZzc = zzi().zzc();
            zzbf(jZzaw, jZzc, zzzVar);
            zzaj(zztfVar, i, jZzaw, jZzc);
            zzaX(zzabpVar.zzc());
            return true;
        }
        if (iZza == 1) {
            long jZzd = zzabpVar.zzd();
            long jZzc2 = zzabpVar.zzc();
            if (jZzd == this.zzH) {
                zzap(zztfVar, i, jZzaw);
            } else {
                zzbf(jZzaw, jZzd, zzzVar);
                zzaj(zztfVar, i, jZzaw, jZzd);
            }
            zzaX(jZzc2);
            this.zzH = jZzd;
            return true;
        }
        if (iZza != 2) {
            if (iZza != 3) {
                return false;
            }
            zzap(zztfVar, i, jZzaw);
            zzaX(zzabpVar.zzc());
            return true;
        }
        Trace.beginSection("dropVideoBuffer");
        zztfVar.zzo(i, false);
        Trace.endSection();
        zzaW(0, 1);
        zzaX(zzabpVar.zzc());
        return true;
    }

    public final void zzu(int i, Object obj) throws zzin {
        if (i == 1) {
            zzbi(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            zzabo zzaboVar = (zzabo) obj;
            this.zzM = zzaboVar;
            zzacn zzacnVar = this.zzp;
            if (zzacnVar != null) {
                zzacnVar.zzv(zzaboVar);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.zzL != iIntValue) {
                this.zzL = iIntValue;
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.zzx = iIntValue2;
            zztf zztfVarZzaB = zzaB();
            if (zztfVarZzaB != null) {
                zztfVarZzaB.zzr(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.zzy = iIntValue3;
            zzacn zzacnVar2 = this.zzp;
            if (zzacnVar2 != null) {
                zzacnVar2.zzq(iIntValue3);
                return;
            } else {
                this.zzi.zzh(iIntValue3);
                return;
            }
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(zzbz.zza)) {
                zzacn zzacnVar3 = this.zzp;
                if (zzacnVar3 == null || !zzacnVar3.zzC()) {
                    return;
                }
                zzacnVar3.zzm();
                return;
            }
            this.zzs = list;
            zzacn zzacnVar4 = this.zzp;
            if (zzacnVar4 != null) {
                zzacnVar4.zzu(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            zzeo zzeoVar = (zzeo) obj;
            if (zzeoVar.zzb() == 0 || zzeoVar.zza() == 0) {
                return;
            }
            this.zzv = zzeoVar;
            zzacn zzacnVar5 = this.zzp;
            if (zzacnVar5 != null) {
                Surface surface = this.zzt;
                zzdd.zzb(surface);
                zzacnVar5.zzs(surface, zzeoVar);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.zzK = ((Integer) obj).intValue();
                zztf zztfVarZzaB2 = zzaB();
                if (zztfVarZzaB2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.zzK));
                    zztfVarZzaB2.zzq(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.zzt;
                zzbi(null);
                obj.getClass();
                ((zzaba) obj).zzu(1, surface2);
                break;
            case 18:
                boolean z = this.zzD != null;
                zzmh zzmhVar = (zzmh) obj;
                this.zzD = zzmhVar;
                if (z != (zzmhVar != null)) {
                    zzaV();
                    break;
                }
                break;
            default:
                super.zzu(i, obj);
                break;
        }
    }
}
