package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import androidx.media3.common.MimeTypes;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzenw implements zzetu {
    private final zzgdm zza;
    private final Context zzb;

    public zzenw(zzgdm zzgdmVar, Context context) {
        this.zza = zzgdmVar;
        this.zzb = context;
    }

    public static /* synthetic */ zzenx zzc(zzenw zzenwVar) {
        int streamMaxVolume;
        AudioManager audioManager = (AudioManager) zzenwVar.zzb.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        float fZza = zzv.zzt().zza();
        boolean zZze = zzv.zzt().zze();
        if (audioManager == null) {
            return new zzenx(-1, false, false, -1, -1, -1, -1, -1, fZza, zZze, true);
        }
        int mode = audioManager.getMode();
        boolean zIsMusicActive = audioManager.isMusicActive();
        boolean zIsSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        int i = -1;
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzlk)).booleanValue()) {
            int iZzj = zzv.zzs().zzj(audioManager);
            streamMaxVolume = audioManager.getStreamMaxVolume(3);
            i = iZzj;
        } else {
            streamMaxVolume = -1;
        }
        return new zzenx(mode, zIsMusicActive, zIsSpeakerphoneOn, streamVolume, i, streamMaxVolume, audioManager.getRingerMode(), audioManager.getStreamVolume(2), fZza, zZze, false);
    }

    public final int zza() {
        return 13;
    }

    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzenv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzenw.zzc(this.zza);
            }
        });
    }
}
