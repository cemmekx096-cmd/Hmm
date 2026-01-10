package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.crashlytics.android.BuildConfig;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.ads.preload.zzb;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbmb;
import com.google.android.gms.internal.ads.zzbmj;
import com.google.android.gms.internal.ads.zzbmk;
import com.google.android.gms.internal.ads.zzfvv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class zzey {
    public static final Set zza = new HashSet(Arrays.asList(AdFormat.APP_OPEN_AD, AdFormat.INTERSTITIAL, AdFormat.REWARDED));
    private static zzey zzb;
    private zzep zzc;
    private zzfc zzd;
    private zzeo zze;
    private zzdb zzl;
    private final Object zzf = new Object();
    private final Object zzg = new Object();
    private boolean zzi = false;
    private boolean zzj = false;
    private final Object zzk = new Object();
    private OnAdInspectorClosedListener zzm = null;
    private RequestConfiguration zzn = new RequestConfiguration.Builder().build();
    private final ArrayList zzh = new ArrayList();

    private zzey() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InitializationStatus zzA(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbmb zzbmbVar = (zzbmb) it.next();
            map.put(zzbmbVar.zza, new zzbmj(zzbmbVar.zzb ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, zzbmbVar.zzd, zzbmbVar.zzc));
        }
        return new zzbmk(map);
    }

    private final void zzB(String str) {
        try {
            this.zzl.zzk();
            this.zzl.zzl((String) null, ObjectWrapper.wrap(null));
        } catch (RemoteException e) {
            zzo.zzk("MobileAdsSettingManager initialization failed", e);
        }
    }

    private final void zzC(Context context) {
        if (this.zzl == null) {
            this.zzl = (zzdb) new zzau(zzbb.zza(), context).zzd(context, false);
        }
    }

    private final void zzD(RequestConfiguration requestConfiguration) {
        try {
            this.zzl.zzu(new zzfx(requestConfiguration));
        } catch (RemoteException e) {
            zzo.zzh("Unable to set request configuration parcel.", e);
        }
    }

    public static zzey zzf() {
        zzey zzeyVar;
        synchronized (zzey.class) {
            if (zzb == null) {
                zzb = new zzey();
            }
            zzeyVar = zzb;
        }
        return zzeyVar;
    }

    public static /* synthetic */ void zzl(zzey zzeyVar, String str) {
        synchronized (zzeyVar.zzk) {
            zzeyVar.zzB(null);
        }
    }

    public static /* synthetic */ void zzm(zzey zzeyVar, String str) {
        synchronized (zzeyVar.zzk) {
            zzeyVar.zzB(null);
        }
    }

    public final RequestConfiguration zzc() {
        return this.zzn;
    }

    public final InitializationStatus zze() {
        InitializationStatus initializationStatusZzA;
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                initializationStatusZzA = zzA(this.zzl.zzg());
            } catch (RemoteException unused) {
                zzo.zzg("Unable to get Initialization status.");
                return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzeq
                    public final Map getAdapterStatusMap() {
                        HashMap map = new HashMap();
                        map.put("com.google.android.gms.ads.MobileAds", new zzeu(this.zza));
                        return map;
                    }
                };
            }
        }
        return initializationStatusZzA;
    }

    public final zzb zzg(AdFormat adFormat) {
        AdFormat adFormat2 = AdFormat.BANNER;
        int iOrdinal = adFormat.ordinal();
        if (iOrdinal == 1) {
            return this.zzc;
        }
        if (iOrdinal == 2) {
            return this.zzd;
        }
        if (iOrdinal != 5) {
            return null;
        }
        return this.zze;
    }

    public final Status zzh(Context context, List list, PreloadCallback preloadCallback) {
        boolean z;
        Status status;
        zzbdc.zza(context);
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PreloadConfiguration preloadConfiguration = (PreloadConfiguration) it.next();
            String str = String.valueOf(preloadConfiguration.getAdFormat()) + "#" + preloadConfiguration.getAdUnitId();
            map.put(str, Integer.valueOf(((Integer) zzf.zzi(map, str, 0)).intValue() + 1));
        }
        Iterator it2 = map.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z = false;
                break;
            }
            if (((Integer) ((Map.Entry) it2.next()).getValue()).intValue() > 1) {
                hashSet.add("Preload configurations include duplicated ad unit IDs and ad format combinations");
                z = true;
                break;
            }
        }
        HashMap map2 = new HashMap();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            PreloadConfiguration preloadConfiguration2 = (PreloadConfiguration) it3.next();
            AdFormat adFormat = preloadConfiguration2.getAdFormat();
            if (zza.contains(preloadConfiguration2.getAdFormat())) {
                map2.put(adFormat, Integer.valueOf(((Integer) zzf.zzi(map2, adFormat, 0)).intValue() + 1));
                if (preloadConfiguration2.getBufferSize() > 15) {
                    hashSet.add(String.format(Locale.US, "Preload configurations' buffer size exceeds the maximum limit %d for %s", 15, adFormat.name()));
                } else if (preloadConfiguration2.getBufferSize() < 0) {
                    hashSet.add(String.format(Locale.US, "Preload configurations' buffer size less than 0 for %s", adFormat.name()));
                }
            } else {
                hashSet.add("PreloadConfiguration ad format is not supported:".concat(String.valueOf(String.valueOf(preloadConfiguration2.getAdFormat()))));
            }
            z = true;
        }
        EnumMap enumMap = new EnumMap(AdFormat.class);
        enumMap.put((EnumMap) AdFormat.APP_OPEN_AD, (AdFormat) zzbd.zzc().zzb(zzbdc.zzeJ));
        enumMap.put((EnumMap) AdFormat.INTERSTITIAL, (AdFormat) zzbd.zzc().zzb(zzbdc.zzeH));
        enumMap.put((EnumMap) AdFormat.REWARDED, (AdFormat) zzbd.zzc().zzb(zzbdc.zzeI));
        for (Map.Entry entry : map2.entrySet()) {
            AdFormat adFormat2 = (AdFormat) entry.getKey();
            int iIntValue = ((Integer) entry.getValue()).intValue();
            int iIntValue2 = ((Integer) zzf.zzi(enumMap, adFormat2, 0)).intValue();
            if (iIntValue > iIntValue2) {
                hashSet.add(String.format(Locale.US, "Preload configurations' size exceeds the maximum limit %d for %s", Integer.valueOf(iIntValue2), adFormat2.name()));
                z = true;
            }
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            Iterator it4 = hashSet.iterator();
            while (it4.hasNext()) {
                sb.append((String) it4.next());
                if (it4.hasNext()) {
                    sb.append(", ");
                }
            }
            String string = sb.toString();
            zzo.zzg(string);
            status = new Status(13, string);
        } else {
            status = Status.RESULT_SUCCESS;
        }
        String statusMessage = status.getStatusMessage();
        if (statusMessage == null) {
            statusMessage = BuildConfig.FLAVOR;
        }
        Preconditions.checkArgument(status.isSuccess(), statusMessage);
        synchronized (this.zzg) {
            ArrayList arrayList = new ArrayList();
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                arrayList.add(zzf.zze(context, (PreloadConfiguration) it5.next(), 1));
            }
            try {
                com.google.android.gms.ads.zzb.zza(context).zzp(arrayList, new zzet(this, preloadCallback));
            } catch (RemoteException e) {
                zzo.zzh("Unable to start preload.", e);
                return Status.RESULT_INTERNAL_ERROR;
            }
        }
        return Status.RESULT_SUCCESS;
    }

    public final String zzj() {
        String strZzc;
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                strZzc = zzfvv.zzc(this.zzl.zzf());
            } catch (RemoteException e) {
                zzo.zzh("Unable to get internal version.", e);
                return BuildConfig.FLAVOR;
            }
        }
        return strZzc;
    }

    public final void zzp(Context context) {
        synchronized (this.zzk) {
            zzC(context);
            try {
                this.zzl.zzi();
            } catch (RemoteException unused) {
                zzo.zzg("Unable to disable mediation adapter initialization.");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078 A[Catch: all -> 0x005e, TryCatch #1 {, blocks: (B:24:0x0030, B:26:0x0050, B:34:0x0067, B:36:0x0078, B:38:0x008a, B:45:0x00cd, B:46:0x00e2, B:39:0x009a, B:41:0x00a8, B:43:0x00ba, B:44:0x00c5, B:28:0x0058, B:33:0x0062), top: B:55:0x0030, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a A[Catch: all -> 0x005e, TryCatch #1 {, blocks: (B:24:0x0030, B:26:0x0050, B:34:0x0067, B:36:0x0078, B:38:0x008a, B:45:0x00cd, B:46:0x00e2, B:39:0x009a, B:41:0x00a8, B:43:0x00ba, B:44:0x00c5, B:28:0x0058, B:33:0x0062), top: B:55:0x0030, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5 A[Catch: all -> 0x005e, TryCatch #1 {, blocks: (B:24:0x0030, B:26:0x0050, B:34:0x0067, B:36:0x0078, B:38:0x008a, B:45:0x00cd, B:46:0x00e2, B:39:0x009a, B:41:0x00a8, B:43:0x00ba, B:44:0x00c5, B:28:0x0058, B:33:0x0062), top: B:55:0x0030, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzq(android.content.Context r3, java.lang.String r4, com.google.android.gms.ads.initialization.OnInitializationCompleteListener r5) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzey.zzq(android.content.Context, java.lang.String, com.google.android.gms.ads.initialization.OnInitializationCompleteListener):void");
    }

    public final void zzr(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.zzk) {
            zzC(context);
            this.zzm = onAdInspectorClosedListener;
            try {
                this.zzl.zzm(new zzev(null));
            } catch (RemoteException unused) {
                zzo.zzg("Unable to open the ad inspector.");
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", "com.google.android.gms.ads"));
                }
            }
        }
    }

    public final void zzs(Context context, String str) {
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.zzl.zzn(ObjectWrapper.wrap(context), str);
            } catch (RemoteException e) {
                zzo.zzh("Unable to open debug menu.", e);
            }
        }
    }

    public final void zzt(Class cls) {
        synchronized (this.zzk) {
            try {
                this.zzl.zzh(cls.getCanonicalName());
            } catch (RemoteException e) {
                zzo.zzh("Unable to register RtbAdapter", e);
            }
        }
    }

    public final void zzu(boolean z) {
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.zzl.zzp(z);
            } catch (RemoteException e) {
                zzo.zzh("Unable to set app mute state.", e);
            }
        }
    }

    public final void zzv(float f) {
        boolean z = true;
        Preconditions.checkArgument(f >= 0.0f && f <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.zzk) {
            if (this.zzl == null) {
                z = false;
            }
            Preconditions.checkState(z, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.zzl.zzq(f);
            } catch (RemoteException e) {
                zzo.zzh("Unable to set app volume.", e);
            }
        }
    }

    public final void zzw(String str) {
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.zzl.zzt(str);
            } catch (RemoteException e) {
                zzo.zzh("Unable to set plugin.", e);
            }
        }
    }

    public final void zzx(RequestConfiguration requestConfiguration) {
        Preconditions.checkArgument(requestConfiguration != null, "Null passed to setRequestConfiguration.");
        synchronized (this.zzk) {
            RequestConfiguration requestConfiguration2 = this.zzn;
            this.zzn = requestConfiguration;
            if (this.zzl == null) {
                return;
            }
            if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                zzD(requestConfiguration);
            }
        }
    }

    public final boolean zzz(boolean z) {
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to enable/disable the publisher first-party ID.");
            try {
                this.zzl.zzj(z);
            } catch (RemoteException e) {
                zzo.zzh("Unable to " + (z ? "enable" : "disable") + " the publisher first-party ID.", e);
                return false;
            }
        }
        return true;
    }

    public final float zza() {
        synchronized (this.zzk) {
            zzdb zzdbVar = this.zzl;
            float fZze = 1.0f;
            if (zzdbVar == null) {
                return 1.0f;
            }
            try {
                fZze = zzdbVar.zze();
            } catch (RemoteException e) {
                zzo.zzh("Unable to get app volume.", e);
            }
            return fZze;
        }
    }

    public final boolean zzy() {
        synchronized (this.zzk) {
            zzdb zzdbVar = this.zzl;
            boolean zZzv = false;
            if (zzdbVar == null) {
                return false;
            }
            try {
                zZzv = zzdbVar.zzv();
            } catch (RemoteException e) {
                zzo.zzh("Unable to get app mute state.", e);
            }
            return zZzv;
        }
    }
}
