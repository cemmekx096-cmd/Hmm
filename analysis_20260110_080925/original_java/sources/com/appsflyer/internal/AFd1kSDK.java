package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.media3.exoplayer.RendererCapabilities;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFd1kSDK$;
import com.google.firebase.messaging.Constants;
import com.ironsource.adqualitysdk.sdk.R;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class AFd1kSDK implements AFd1pSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long areAllFieldsValid = 0;
    private static char copy = 0;
    private static int equals = 1;
    private static final int getRevenue;
    private static int hashCode;
    private static int toString;
    private final AFc1dSDK component1;
    private List<String> getCurrencyIso4217Code = new ArrayList();
    private boolean getMonetizationNetwork = true;
    private final Map<String, Object> AFAdRevenueData = new HashMap();
    private SecureRandom component3 = new SecureRandom();
    private boolean component2 = true ^ AppsFlyerProperties.getInstance().getBoolean("disableProxy", false);
    private int getMediationNetwork = 0;
    private boolean component4 = false;

    public static /* synthetic */ Object getMediationNetwork(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = ~(i4 | i5);
        int i7 = ~i3;
        int i8 = (~(i4 | i7)) | i6 | (~(i5 | i7));
        int i9 = i | i2;
        int i10 = (i * 85) + (i2 * 85) + ((i8 | (~(i9 | i3))) * (-84));
        int i11 = i | (~(i3 | i5));
        int i12 = ~(i2 | i7);
        int i13 = i10 + ((i11 | i12) * (-84)) + (((~i9) | i12) * 84);
        if (i13 == 1) {
            AFd1kSDK aFd1kSDK = (AFd1kSDK) objArr[0];
            String str = (String) objArr[1];
            String[] strArr = (String[]) objArr[2];
            int i14 = toString + 69;
            equals = i14 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i15 = i14 % 2;
            aFd1kSDK.getCurrencyIso4217Code("public_api_call", str, strArr);
            int i16 = equals + 1;
            toString = i16 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i17 = i16 % 2;
            return null;
        }
        if (i13 == 2) {
            return getCurrencyIso4217Code(objArr);
        }
        if (i13 == 3) {
            return getMonetizationNetwork(objArr);
        }
        AFd1kSDK aFd1kSDK2 = (AFd1kSDK) objArr[0];
        boolean zAFAdRevenueData = aFd1kSDK2.AFAdRevenueData(getCurrencyIso4217Code(aFd1kSDK2.component1.component1().getMediationNetwork.getCurrencyIso4217Code), getCurrencyIso4217Code(aFd1kSDK2.component1.component1().getMediationNetwork.AFAdRevenueData));
        if (!(zAFAdRevenueData)) {
            aFd1kSDK2.getRevenue();
            aFd1kSDK2.getMediationNetwork();
        } else {
            int i18 = toString + 57;
            equals = i18 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i19 = i18 % 2;
            aFd1kSDK2.areAllFieldsValid();
        }
        int i20 = toString + 31;
        equals = i20 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i21 = i20 % 2;
        return Boolean.valueOf(zAFAdRevenueData);
    }

    static {
        component3();
        getRevenue = 98166;
        int i = equals + R.styleable.AppCompatTheme_windowActionBar;
        toString = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 != 0 ? (char) 5 : '=') != '=') {
            int i2 = 69 / 0;
        }
    }

    public AFd1kSDK(AFc1dSDK aFc1dSDK) {
        this.component1 = aFc1dSDK;
    }

    private synchronized void areAllFieldsValid() {
        int i = toString + 63;
        equals = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i % 2 != 0)) {
            throw null;
        }
        if (this.component4) {
            return;
        }
        this.component4 = true;
        try {
            getCurrencyIso4217Code("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
            int i2 = toString + 3;
            equals = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i3 = i2 % 2;
            return;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.afInfoLog, "Error while starting remote debugger", th, true, true, true);
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(int i, char c, String str, String str2, String str3, Object[] objArr) {
        char[] charArray;
        char[] charArray2;
        if ((str3 != null ? (char) 17 : (char) 27) != 27) {
            int i2 = $11 + 31;
            $10 = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if ((i2 % 2 != 0 ? 'V' : 'F') != 'F') {
                str3.toCharArray();
                throw null;
            }
            charArray = str3.toCharArray();
        } else {
            charArray = str3;
        }
        char[] cArr = charArray;
        if (str2 != 0) {
            charArray2 = str2.toCharArray();
            int i3 = $11 + 29;
            $10 = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i4 = i3 % 2;
        } else {
            charArray2 = str2;
        }
        char[] cArr2 = charArray2;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        AFk1jSDK aFk1jSDK = new AFk1jSDK();
        int length = charArray3.length;
        char[] cArr3 = new char[length];
        int length2 = cArr.length;
        char[] cArr4 = new char[length2];
        System.arraycopy(charArray3, 0, cArr3, 0, length);
        System.arraycopy(cArr, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c);
        cArr4[2] = (char) (cArr4[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr5 = new char[length3];
        aFk1jSDK.getMediationNetwork = 0;
        while (aFk1jSDK.getMediationNetwork < length3) {
            int i5 = (aFk1jSDK.getMediationNetwork + 2) % 4;
            int i6 = (aFk1jSDK.getMediationNetwork + 3) % 4;
            aFk1jSDK.AFAdRevenueData = (char) (((cArr3[aFk1jSDK.getMediationNetwork % 4] * 32718) + cArr4[i5]) % 65535);
            cArr4[i6] = (char) (((cArr3[i6] * 32718) + cArr4[i5]) / 65535);
            cArr3[i6] = aFk1jSDK.AFAdRevenueData;
            cArr5[aFk1jSDK.getMediationNetwork] = (char) ((((cArr3[i6] ^ cArr2[aFk1jSDK.getMediationNetwork]) ^ (areAllFieldsValid ^ (-866183138771165766L))) ^ ((int) (hashCode ^ (-866183138771165766L)))) ^ ((char) (copy ^ (-866183138771165766L))));
            aFk1jSDK.getMediationNetwork++;
        }
        objArr[0] = new String(cArr5);
    }

    public final synchronized void getMediationNetwork() {
        int i = toString + 35;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        equals = i2;
        int i3 = i % 2;
        if (!(!this.component4)) {
            this.component4 = false;
            this.getMonetizationNetwork = false;
            getCurrencyIso4217Code("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
            return;
        }
        int i4 = i2 + 23;
        toString = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!this.getMonetizationNetwork) {
            return;
        }
        this.component4 = false;
        this.getMonetizationNetwork = false;
        try {
            getCurrencyIso4217Code("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
            return;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.afInfoLog, "Error while stopping remote debugger", th, true, true, true);
            return;
        }
    }

    public final synchronized void AFAdRevenueData() {
        int i = equals + 31;
        toString = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        this.AFAdRevenueData.clear();
        this.getCurrencyIso4217Code.clear();
        this.getMediationNetwork = 0;
        int i3 = toString + 105;
        equals = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i3 % 2 == 0 ? (char) 2 : (char) 0) != 2) {
            return;
        }
        int i4 = 83 / 0;
    }

    public final void o_(String str, PackageManager packageManager) {
        int i = equals + R.styleable.AppCompatTheme_windowActionBar;
        toString = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        Object obj = null;
        try {
            if ((i % 2 != 0 ? (char) 21 : 'W') == 'W') {
                AFd1mSDK revenue = this.component1.getCurrencyIso4217Code().getRevenue(p_(str, packageManager), this.component1.registerClient().getMediationNetwork());
                if (revenue == null) {
                    AFLogger.afErrorLogForExcManagerOnly("could not send null proxy data", new NullPointerException("request was null"));
                    return;
                }
                ExecutorService monetizationNetwork = this.component1.getMonetizationNetwork();
                Objects.requireNonNull(revenue);
                monetizationNetwork.execute(new AFd1kSDK$.ExternalSyntheticLambda0(revenue));
                int i2 = toString + 19;
                equals = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                if (i2 % 2 == 0) {
                    throw null;
                }
                return;
            }
            this.component1.getCurrencyIso4217Code().getRevenue(p_(str, packageManager), this.component1.registerClient().getMediationNetwork());
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", th);
        }
    }

    public final void getMonetizationNetwork(Throwable th) {
        StackTraceElement[] stackTrace;
        int i = toString + 45;
        equals = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        Throwable cause = th.getCause();
        String simpleName = th.getClass().getSimpleName();
        String message = cause == null ? th.getMessage() : cause.getMessage();
        if (cause == null) {
            int i3 = equals + 73;
            toString = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if ((i3 % 2 != 0 ? 'K' : (char) 24) != 24) {
                th.getStackTrace();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            stackTrace = th.getStackTrace();
        } else {
            stackTrace = cause.getStackTrace();
            int i4 = toString + 3;
            equals = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i5 = i4 % 2;
        }
        getCurrencyIso4217Code("exception", simpleName, getRevenue(message, stackTrace));
    }

    public final void getCurrencyIso4217Code(String str, String str2) {
        int i = toString + 17;
        equals = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i % 2 == 0)) {
            getCurrencyIso4217Code("server_request", str, str2);
        } else {
            String[] strArr = new String[0];
            strArr[0] = str2;
            getCurrencyIso4217Code("server_request", str, strArr);
        }
        int i2 = toString + 101;
        equals = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final void getRevenue(String str, int i, String str2) {
        int i2 = toString + 29;
        equals = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        getCurrencyIso4217Code("server_response", str, String.valueOf(i), str2);
        int i4 = equals + R.styleable.AppCompatTheme_windowFixedHeightMinor;
        toString = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i4 % 2 == 0) {
        } else {
            throw null;
        }
    }

    public final void getMonetizationNetwork(String str, String str2) {
        int i = toString + 53;
        equals = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i % 2 == 0 ? '9' : '`') != '9') {
            getCurrencyIso4217Code(null, str, str2);
        } else {
            String[] strArr = new String[1];
            strArr[1] = str2;
            getCurrencyIso4217Code(null, str, strArr);
        }
        int i2 = equals + 45;
        toString = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i2 % 2 != 0 ? (char) 31 : 'C') == 'C') {
        } else {
            throw null;
        }
    }

    public final synchronized void getRevenue() {
        int i = toString + R.styleable.AppCompatTheme_windowMinWidthMinor;
        equals = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        this.getMonetizationNetwork = false;
        AFAdRevenueData();
        equals();
        int i3 = equals + R.styleable.AppCompatTheme_windowFixedHeightMinor;
        toString = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
    }

    public final void getCurrencyIso4217Code() {
        int i = toString + 23;
        int i2 = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        equals = i2;
        if ((i % 2 == 0 ? 'W' : 'G') != 'G') {
            this.component2 = true;
        } else {
            this.component2 = false;
        }
        int i3 = i2 + 63;
        toString = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i3 % 2 == 0) {
        } else {
            throw null;
        }
    }

    public final boolean component4() {
        int i = equals;
        int i2 = i + 103;
        toString = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i2 % 2 != 0 ? '3' : (char) 0) != 0) {
            throw null;
        }
        boolean z = this.component4;
        int i3 = i + R.styleable.AppCompatTheme_windowActionModeOverlay;
        toString = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return z;
    }

    private float component2() {
        int i = toString + 65;
        equals = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        float fNextFloat = this.component3.nextFloat();
        int i3 = equals + R.styleable.AppCompatTheme_windowActionModeOverlay;
        toString = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if ((i3 % 2 != 0 ? '>' : (char) 14) == 14) {
            return fNextFloat;
        }
        int i4 = 16 / 0;
        return fNextFloat;
    }

    private Map<String, Object> p_(String str, PackageManager packageManager) {
        int i = equals + 95;
        toString = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        Object obj = null;
        if (i % 2 == 0) {
            q_(str, packageManager, this.component1.registerClient(), this.component1.afInfoLog());
            Map<String, Object> mapCopy = copy();
            int i2 = equals + 29;
            toString = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (!(i2 % 2 != 0)) {
                return mapCopy;
            }
            obj.hashCode();
            throw null;
        }
        q_(str, packageManager, this.component1.registerClient(), this.component1.afInfoLog());
        copy();
        throw null;
    }

    private static String component1() {
        int i = toString;
        int i2 = i + 77;
        equals = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i2 % 2 != 0)) {
            throw null;
        }
        int i3 = i + 33;
        equals = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return "6.17.0";
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if ((r4.component4 ? '+' : 14) != 14) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object getCurrencyIso4217Code(java.lang.Object[] r4) {
        /*
            r0 = 0
            r4 = r4[r0]
            com.appsflyer.internal.AFd1kSDK r4 = (com.appsflyer.internal.AFd1kSDK) r4
            boolean r1 = r4.component2
            r2 = 63
            if (r1 == 0) goto Le
            r1 = 29
            goto Lf
        Le:
            r1 = r2
        Lf:
            if (r1 == r2) goto L45
            int r1 = com.appsflyer.internal.AFd1kSDK.equals
            int r2 = r1 + 49
            int r3 = r2 % 128
            com.appsflyer.internal.AFd1kSDK.toString = r3
            int r2 = r2 % 2
            boolean r2 = r4.getMonetizationNetwork
            if (r2 != 0) goto L2b
            boolean r4 = r4.component4
            r2 = 14
            if (r4 == 0) goto L28
            r4 = 43
            goto L29
        L28:
            r4 = r2
        L29:
            if (r4 == r2) goto L45
        L2b:
            int r1 = r1 + 57
            int r4 = r1 % 128
            com.appsflyer.internal.AFd1kSDK.toString = r4
            int r1 = r1 % 2
            r4 = 1
            if (r1 == 0) goto L37
            r0 = r4
        L37:
            if (r0 != 0) goto L3e
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L3e:
            r4 = 0
            r4.hashCode()     // Catch: java.lang.Throwable -> L43
            throw r4     // Catch: java.lang.Throwable -> L43
        L43:
            r4 = move-exception
            throw r4
        L45:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1kSDK.getCurrencyIso4217Code(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0073 A[Catch: all -> 0x006f, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0053, B:16:0x0073), top: B:41:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d A[Catch: all -> 0x00b4, TRY_ENTER, TryCatch #0 {all -> 0x00b4, blocks: (B:3:0x0001, B:6:0x005d, B:11:0x0067, B:22:0x0086, B:24:0x008c, B:25:0x0094, B:26:0x0098, B:30:0x009d, B:35:0x00ab), top: B:40:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void getMediationNetwork(java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            r11 = this;
            monitor-enter(r11)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r11.AFAdRevenueData     // Catch: java.lang.Throwable -> Lb4
            r1 = 428417108(0x19892054, float:1.4178525E-23)
            java.lang.String r2 = ""
            r3 = 48
            r4 = 0
            int r2 = android.text.TextUtils.indexOf(r2, r3, r4, r4)     // Catch: java.lang.Throwable -> Lb4
            int r5 = r1 - r2
            r1 = 45453(0xb18d, float:6.3693E-41)
            java.lang.String r2 = ""
            int r2 = android.text.TextUtils.indexOf(r2, r3, r4)     // Catch: java.lang.Throwable -> Lb4
            int r1 = r1 - r2
            char r6 = (char) r1     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r7 = "嗊褠踙\ue7b1"
            java.lang.String r8 = "ᒸي醼뇗ൎ"
            java.lang.String r9 = "\u0000\u0000\u0000\u0000"
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lb4
            r10 = r2
            a(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lb4
            r2 = r2[r4]     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r2 = r2.intern()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r3 = android.os.Build.BRAND     // Catch: java.lang.Throwable -> Lb4
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> Lb4
            java.util.Map<java.lang.String, java.lang.Object> r0 = r11.AFAdRevenueData     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r2 = "model"
            java.lang.String r3 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> Lb4
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> Lb4
            java.util.Map<java.lang.String, java.lang.Object> r0 = r11.AFAdRevenueData     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r2 = "platform"
            java.lang.String r3 = "Android"
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> Lb4
            java.util.Map<java.lang.String, java.lang.Object> r0 = r11.AFAdRevenueData     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r2 = "platform_version"
            java.lang.String r3 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> Lb4
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> Lb4
            if (r12 == 0) goto L71
            int r0 = com.appsflyer.internal.AFd1kSDK.toString     // Catch: java.lang.Throwable -> L6f
            int r0 = r0 + 111
            int r2 = r0 % 128
            com.appsflyer.internal.AFd1kSDK.equals = r2     // Catch: java.lang.Throwable -> L6f
            int r0 = r0 % 2
            int r0 = r12.length()     // Catch: java.lang.Throwable -> Lb4
            if (r0 <= 0) goto L64
            goto L65
        L64:
            r4 = r1
        L65:
            if (r4 == r1) goto L71
            java.util.Map<java.lang.String, java.lang.Object> r0 = r11.AFAdRevenueData     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r1 = "advertiserId"
            r0.put(r1, r12)     // Catch: java.lang.Throwable -> Lb4
            goto L71
        L6f:
            r12 = move-exception
            goto L99
        L71:
            if (r13 == 0) goto L9b
            int r12 = com.appsflyer.internal.AFd1kSDK.toString     // Catch: java.lang.Throwable -> L6f
            int r12 = r12 + 27
            int r0 = r12 % 128
            com.appsflyer.internal.AFd1kSDK.equals = r0     // Catch: java.lang.Throwable -> L6f
            int r12 = r12 % 2
            r0 = 5
            if (r12 != 0) goto L82
            r12 = r0
            goto L84
        L82:
            r12 = 82
        L84:
            if (r12 == r0) goto L94
            int r12 = r13.length()     // Catch: java.lang.Throwable -> Lb4
            if (r12 <= 0) goto L9b
            java.util.Map<java.lang.String, java.lang.Object> r12 = r11.AFAdRevenueData     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r0 = "imei"
            r12.put(r0, r13)     // Catch: java.lang.Throwable -> Lb4
            goto L9b
        L94:
            r13.length()     // Catch: java.lang.Throwable -> Lb4
            r12 = 0
            throw r12     // Catch: java.lang.Throwable -> Lb4
        L99:
            monitor-exit(r11)
            throw r12
        L9b:
            if (r14 == 0) goto Lb2
            int r12 = r14.length()     // Catch: java.lang.Throwable -> Lb4
            r13 = 51
            if (r12 <= 0) goto La8
            r12 = 92
            goto La9
        La8:
            r12 = r13
        La9:
            if (r12 == r13) goto Lb2
            java.util.Map<java.lang.String, java.lang.Object> r12 = r11.AFAdRevenueData     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r13 = "android_id"
            r12.put(r13, r14)     // Catch: java.lang.Throwable -> Lb4
        Lb2:
            monitor-exit(r11)
            return
        Lb4:
            monitor-exit(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1kSDK.getMediationNetwork(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003e A[Catch: all -> 0x003a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:9:0x0011, B:24:0x003e, B:37:0x0069), top: B:56:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069 A[Catch: all -> 0x003a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:9:0x0011, B:24:0x003e, B:37:0x0069), top: B:56:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void getCurrencyIso4217Code(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.AFAdRevenueData     // Catch: java.lang.Throwable -> L94
            java.lang.String r1 = "sdk_version"
            r0.put(r1, r4)     // Catch: java.lang.Throwable -> L94
            r4 = 1
            r0 = 0
            if (r5 == 0) goto Le
            r1 = r4
            goto Lf
        Le:
            r1 = r0
        Lf:
            if (r1 == 0) goto L3c
            int r1 = com.appsflyer.internal.AFd1kSDK.toString     // Catch: java.lang.Throwable -> L3a
            int r1 = r1 + 61
            int r2 = r1 % 128
            com.appsflyer.internal.AFd1kSDK.equals = r2     // Catch: java.lang.Throwable -> L3a
            int r1 = r1 % 2
            if (r1 != 0) goto L1f
            r1 = r0
            goto L20
        L1f:
            r1 = r4
        L20:
            if (r1 == 0) goto L29
            int r1 = r5.length()     // Catch: java.lang.Throwable -> L94
            if (r1 <= 0) goto L3c
            goto L32
        L29:
            int r1 = r5.length()     // Catch: java.lang.Throwable -> L94
            r2 = 47
            int r2 = r2 / r0
            if (r1 <= 0) goto L3c
        L32:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.AFAdRevenueData     // Catch: java.lang.Throwable -> L94
            java.lang.String r2 = "devkey"
            r1.put(r2, r5)     // Catch: java.lang.Throwable -> L94
            goto L3c
        L3a:
            r4 = move-exception
            goto L92
        L3c:
            if (r6 == 0) goto L61
            int r5 = com.appsflyer.internal.AFd1kSDK.toString     // Catch: java.lang.Throwable -> L3a
            int r5 = r5 + 19
            int r1 = r5 % 128
            com.appsflyer.internal.AFd1kSDK.equals = r1     // Catch: java.lang.Throwable -> L3a
            int r5 = r5 % 2
            if (r5 != 0) goto L54
            int r5 = r6.length()     // Catch: java.lang.Throwable -> L94
            r1 = 74
            int r1 = r1 / r0
            if (r5 <= 0) goto L61
            goto L5a
        L54:
            int r5 = r6.length()     // Catch: java.lang.Throwable -> L94
            if (r5 <= 0) goto L61
        L5a:
            java.util.Map<java.lang.String, java.lang.Object> r5 = r3.AFAdRevenueData     // Catch: java.lang.Throwable -> L94
            java.lang.String r1 = "originalAppsFlyerId"
            r5.put(r1, r6)     // Catch: java.lang.Throwable -> L94
        L61:
            if (r7 == 0) goto L65
            r5 = r4
            goto L66
        L65:
            r5 = r0
        L66:
            if (r5 == r4) goto L69
            goto L90
        L69:
            int r5 = com.appsflyer.internal.AFd1kSDK.toString     // Catch: java.lang.Throwable -> L3a
            int r5 = r5 + 61
            int r6 = r5 % 128
            com.appsflyer.internal.AFd1kSDK.equals = r6     // Catch: java.lang.Throwable -> L3a
            int r5 = r5 % 2
            if (r5 != 0) goto L83
            int r5 = r7.length()     // Catch: java.lang.Throwable -> L94
            r6 = 79
            int r6 = r6 / r0
            if (r5 <= 0) goto L7f
            goto L80
        L7f:
            r4 = r0
        L80:
            if (r4 == 0) goto L90
            goto L89
        L83:
            int r4 = r7.length()     // Catch: java.lang.Throwable -> L94
            if (r4 <= 0) goto L90
        L89:
            java.util.Map<java.lang.String, java.lang.Object> r4 = r3.AFAdRevenueData     // Catch: java.lang.Throwable -> L94
            java.lang.String r5 = "uid"
            r4.put(r5, r7)     // Catch: java.lang.Throwable -> L94
        L90:
            monitor-exit(r3)
            return
        L92:
            monitor-exit(r3)
            throw r4
        L94:
            monitor-exit(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1kSDK.getCurrencyIso4217Code(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    private synchronized void getMonetizationNetwork(String str, String str2, String str3, String str4) {
        int i = toString;
        int i2 = i + 71;
        equals = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        try {
            if (i2 % 2 == 0) {
                throw null;
            }
            if (!(str == null)) {
                int i3 = i + 35;
                equals = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i4 = i3 % 2;
                if (str.length() > 0) {
                    int i5 = toString + 109;
                    equals = i5 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                    if (i5 % 2 != 0) {
                        this.AFAdRevenueData.put("app_id", str);
                    } else {
                        this.AFAdRevenueData.put("app_id", str);
                        int i6 = 52 / 0;
                    }
                }
            }
            if (str2 != null && str2.length() > 0) {
                this.AFAdRevenueData.put("app_version", str2);
            }
            if (str3 != null && str3.length() > 0) {
                this.AFAdRevenueData.put("channel", str3);
                int i7 = equals + 55;
                toString = i7 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i8 = i7 % 2;
            }
            if (!(str4 == null) && str4.length() > 0) {
                this.AFAdRevenueData.put("preInstall", str4);
            }
        } catch (Throwable unused) {
        }
    }

    private synchronized void getCurrencyIso4217Code(String str, String str2, String... strArr) {
        String string;
        boolean z;
        if ((copydefault() ? (char) 29 : (char) 27) != 27) {
            int i = toString + 75;
            equals = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
            if (this.getMediationNetwork < 98304) {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strJoin = TextUtils.join(", ", strArr);
                    if (str != null) {
                        string = new StringBuilder().append(jCurrentTimeMillis).append(" ").append(Thread.currentThread().getId()).append(" _/AppsFlyer_6.17.0 [").append(str).append("] ").append(str2).append(" ").append(strJoin).toString();
                    } else {
                        string = new StringBuilder().append(jCurrentTimeMillis).append(" ").append(Thread.currentThread().getId()).append(" ").append(str2).append("/AppsFlyer_6.17.0 ").append(strJoin).toString();
                        int i3 = equals + 73;
                        toString = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                        int i4 = i3 % 2;
                    }
                    int length = this.getMediationNetwork + (string.length() << 1);
                    int i5 = getRevenue;
                    if (length > i5) {
                        string = string.substring(0, (i5 - this.getMediationNetwork) / 2);
                        z = true;
                    } else {
                        z = false;
                    }
                    this.getCurrencyIso4217Code.add(string);
                    this.getMediationNetwork += string.length() << 1;
                    if (z) {
                        int i6 = toString + 47;
                        equals = i6 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                        if (i6 % 2 == 0) {
                            this.getCurrencyIso4217Code.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                            this.getMediationNetwork += 7164;
                        } else {
                            this.getCurrencyIso4217Code.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                            this.getMediationNetwork += 138;
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    private synchronized Map<String, Object> copy() {
        Map<String, Object> map;
        int i = toString + 47;
        equals = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        this.AFAdRevenueData.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, this.getCurrencyIso4217Code);
        equals();
        map = this.AFAdRevenueData;
        int i3 = equals + 111;
        toString = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b A[Catch: all -> 0x00e2, PHI: r0 r2
      0x004b: PHI (r0v6 com.appsflyer.AppsFlyerProperties) = (r0v5 com.appsflyer.AppsFlyerProperties), (r0v7 com.appsflyer.AppsFlyerProperties) binds: [B:16:0x0039, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x004b: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v2 java.lang.String) binds: [B:16:0x0039, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0013, B:19:0x004b, B:21:0x00a7, B:25:0x00c7, B:14:0x0029, B:15:0x002a, B:10:0x0024), top: B:33:0x0001, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003b A[EXC_TOP_SPLITTER, PHI: r3
      0x003b: PHI (r3v1 java.lang.String) = (r3v0 java.lang.String), (r3v7 java.lang.String) binds: [B:16:0x0039, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void q_(java.lang.String r6, android.content.pm.PackageManager r7, com.appsflyer.internal.AFf1gSDK r8, com.appsflyer.internal.AFc1kSDK r9) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = com.appsflyer.internal.AFd1kSDK.toString     // Catch: java.lang.Throwable -> Le2
            int r0 = r0 + 43
            int r1 = r0 % 128
            com.appsflyer.internal.AFd1kSDK.equals = r1     // Catch: java.lang.Throwable -> Le2
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = r1
        L11:
            if (r0 == 0) goto L2a
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch: java.lang.Throwable -> Le2
            java.lang.String r2 = "remote_debug_static_data"
            java.lang.String r3 = r0.getString(r2)     // Catch: java.lang.Throwable -> Le2
            java.util.Map<java.lang.String, java.lang.Object> r4 = r5.AFAdRevenueData     // Catch: java.lang.Throwable -> Le2
            r4.clear()     // Catch: java.lang.Throwable -> Le2
            r4 = 38
            int r4 = r4 / r1
            if (r3 == 0) goto L4b
            goto L3b
        L28:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> Le2
        L2a:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch: java.lang.Throwable -> Le2
            java.lang.String r2 = "remote_debug_static_data"
            java.lang.String r3 = r0.getString(r2)     // Catch: java.lang.Throwable -> Le2
            java.util.Map<java.lang.String, java.lang.Object> r4 = r5.AFAdRevenueData     // Catch: java.lang.Throwable -> Le2
            r4.clear()     // Catch: java.lang.Throwable -> Le2
            if (r3 == 0) goto L4b
        L3b:
            java.util.Map<java.lang.String, java.lang.Object> r6 = r5.AFAdRevenueData     // Catch: java.lang.Throwable -> Lc7
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lc7
            r7.<init>(r3)     // Catch: java.lang.Throwable -> Lc7
            java.util.Map r7 = com.appsflyer.internal.AFg1lSDK.getMonetizationNetwork(r7)     // Catch: java.lang.Throwable -> Lc7
            r6.putAll(r7)     // Catch: java.lang.Throwable -> Lc7
            goto Lc7
        L4b:
            com.appsflyer.internal.AFc1dSDK r3 = r5.component1     // Catch: java.lang.Throwable -> Le2
            com.appsflyer.internal.AFc1pSDK r3 = r3.getRevenue()     // Catch: java.lang.Throwable -> Le2
            java.lang.String r3 = r3.AFAdRevenueData()     // Catch: java.lang.Throwable -> Le2
            java.lang.String r8 = r8.getRevenue()     // Catch: java.lang.Throwable -> Le2
            java.lang.String r9 = r9.AFAdRevenueData     // Catch: java.lang.Throwable -> Le2
            r5.getMediationNetwork(r3, r8, r9)     // Catch: java.lang.Throwable -> Le2
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le2
            java.lang.String r9 = "6.17.0."
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r9 = com.appsflyer.internal.AFa1tSDK.getMonetizationNetwork     // Catch: java.lang.Throwable -> Le2
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Le2
            com.appsflyer.internal.AFc1dSDK r9 = r5.component1     // Catch: java.lang.Throwable -> Le2
            com.appsflyer.internal.AFf1gSDK r9 = r9.registerClient()     // Catch: java.lang.Throwable -> Le2
            java.lang.String r9 = r9.getMediationNetwork()     // Catch: java.lang.Throwable -> Le2
            java.lang.String r3 = "KSAppsFlyerId"
            java.lang.String r3 = r0.getString(r3)     // Catch: java.lang.Throwable -> Le2
            com.appsflyer.internal.AFc1dSDK r4 = r5.component1     // Catch: java.lang.Throwable -> Le2
            com.appsflyer.internal.AFc1pSDK r4 = r4.getRevenue()     // Catch: java.lang.Throwable -> Le2
            com.appsflyer.internal.AFc1qSDK r4 = r4.getMonetizationNetwork     // Catch: java.lang.Throwable -> Le2
            java.lang.String r4 = com.appsflyer.internal.AFb1iSDK.getRevenue(r4)     // Catch: java.lang.Throwable -> Le2
            r5.getCurrencyIso4217Code(r8, r9, r3, r4)     // Catch: java.lang.Throwable -> Le2
            android.content.pm.PackageInfo r7 = r7.getPackageInfo(r6, r1)     // Catch: java.lang.Throwable -> La7
            int r7 = r7.versionCode     // Catch: java.lang.Throwable -> La7
            java.lang.String r8 = "channel"
            java.lang.String r8 = r0.getString(r8)     // Catch: java.lang.Throwable -> La7
            java.lang.String r9 = "preInstallName"
            java.lang.String r9 = r0.getString(r9)     // Catch: java.lang.Throwable -> La7
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> La7
            r5.getMonetizationNetwork(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> La7
        La7:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Le2
            java.util.Map<java.lang.String, java.lang.Object> r7 = r5.AFAdRevenueData     // Catch: java.lang.Throwable -> Le2
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Le2
            r0.set(r2, r6)     // Catch: java.lang.Throwable -> Le2
            int r6 = com.appsflyer.internal.AFd1kSDK.toString     // Catch: java.lang.Throwable -> Le2
            int r6 = r6 + 43
            int r7 = r6 % 128
            com.appsflyer.internal.AFd1kSDK.equals = r7     // Catch: java.lang.Throwable -> Le2
            int r6 = r6 % 2
            r7 = 76
            if (r6 != 0) goto Lc6
            r6 = 86
            goto Lc7
        Lc6:
            r6 = r7
        Lc7:
            java.util.Map<java.lang.String, java.lang.Object> r6 = r5.AFAdRevenueData     // Catch: java.lang.Throwable -> Le2
            java.lang.String r7 = "launch_counter"
            com.appsflyer.internal.AFc1dSDK r8 = r5.component1     // Catch: java.lang.Throwable -> Le2
            com.appsflyer.internal.AFc1pSDK r8 = r8.getRevenue()     // Catch: java.lang.Throwable -> Le2
            com.appsflyer.internal.AFc1qSDK r8 = r8.getMonetizationNetwork     // Catch: java.lang.Throwable -> Le2
            java.lang.String r9 = "appsFlyerCount"
            int r8 = r8.AFAdRevenueData(r9, r1)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> Le2
            r6.put(r7, r8)     // Catch: java.lang.Throwable -> Le2
            monitor-exit(r5)
            return
        Le2:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1kSDK.q_(java.lang.String, android.content.pm.PackageManager, com.appsflyer.internal.AFf1gSDK, com.appsflyer.internal.AFc1kSDK):void");
    }

    private static String[] getRevenue(String str, StackTraceElement[] stackTraceElementArr) {
        int i = toString;
        int i2 = i + 55;
        equals = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i3 = i2 % 2;
        int i4 = 1;
        if (!(stackTraceElementArr != null)) {
            int i5 = i + 91;
            equals = i5 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (i5 % 2 != 0) {
                return new String[]{str};
            }
            String[] strArr = new String[0];
            strArr[1] = str;
            return strArr;
        }
        String[] strArr2 = new String[stackTraceElementArr.length + 1];
        strArr2[0] = str;
        while (true) {
            if ((i4 < stackTraceElementArr.length ? 'L' : '>') != 'L') {
                return strArr2;
            }
            strArr2[i4] = stackTraceElementArr[i4].toString();
            i4++;
        }
    }

    private synchronized void equals() {
        this.getCurrencyIso4217Code = new ArrayList();
        this.getMediationNetwork = 0;
        int i = equals + R.styleable.AppCompatTheme_tooltipFrameBackground;
        toString = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
    }

    private synchronized boolean AFAdRevenueData(AFi1xSDK aFi1xSDK, AFi1xSDK aFi1xSDK2) {
        boolean z = false;
        if ((aFi1xSDK == null ? (char) 20 : (char) 28) != 28) {
            AFInAppEventParameterName();
            return false;
        }
        if (!aFi1xSDK.getCurrencyIso4217Code()) {
            int i = toString;
            int i2 = i + 13;
            equals = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i3 = i2 % 2;
            int i4 = i + 77;
            equals = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if (i4 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!(this.component1.getRevenue().getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0) <= aFi1xSDK.getMonetizationNetwork)) {
            int i5 = equals + 3;
            toString = i5 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i6 = i5 % 2;
            return false;
        }
        if (!getRevenue(aFi1xSDK, aFi1xSDK2)) {
            return false;
        }
        if (AFAdRevenueData(aFi1xSDK.AFAdRevenueData)) {
            if (getCurrencyIso4217Code(aFi1xSDK.component2)) {
                return true;
            }
            int i7 = toString + R.styleable.AppCompatTheme_toolbarStyle;
            equals = i7 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            return (i7 % 2 == 0 ? '&' : (char) 4) != 4;
        }
        int i8 = equals;
        int i9 = i8 + R.styleable.AppCompatTheme_toolbarStyle;
        toString = i9 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i9 % 2 == 0) {
            z = true;
        }
        boolean z2 = !z;
        int i10 = i8 + 21;
        toString = i10 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i11 = i10 % 2;
        return z2;
    }

    private boolean getRevenue(AFi1xSDK aFi1xSDK, AFi1xSDK aFi1xSDK2) {
        int i = toString + 87;
        equals = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        if ((aFi1xSDK.equals(aFi1xSDK2) ? (char) 14 : '.') != 14) {
            boolean monetizationNetwork = getMonetizationNetwork(aFi1xSDK.getRevenue);
            getMediationNetwork(new Object[]{this, Boolean.valueOf(monetizationNetwork)}, 124011145, -124011142, System.identityHashCode(this));
            return monetizationNetwork;
        }
        int i3 = toString + 63;
        equals = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return registerClient();
    }

    private static boolean getCurrencyIso4217Code(String str) {
        int i = equals + 65;
        toString = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        if ((AFk1ySDK.getCurrencyIso4217Code(str) ? 'M' : 'S') != 'M') {
            new AFd1sSDK();
            return AFd1sSDK.getMediationNetwork(component1(), str);
        }
        int i3 = toString + 97;
        equals = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        return (i3 % 2 == 0 ? '/' : '(') == '(';
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if ((com.appsflyer.internal.AFk1ySDK.getCurrencyIso4217Code(r5) ? '8' : io.ktor.util.date.GMTDateParser.YEAR) != '8') goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (com.appsflyer.internal.AFk1ySDK.getCurrencyIso4217Code(r5) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        r0 = r4.component1.getRevenue();
        r5 = r5.equals(com.appsflyer.internal.AFj1iSDK.getMediationNetwork(r0.getRevenue.getMonetizationNetwork, r0.getRevenue.getMonetizationNetwork.getPackageName()));
        r0 = com.appsflyer.internal.AFd1kSDK.toString + 93;
        com.appsflyer.internal.AFd1kSDK.equals = r0 % androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_PRIMARY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if ((r0 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        r0 = 13 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean AFAdRevenueData(java.lang.String r5) {
        /*
            r4 = this;
            int r0 = com.appsflyer.internal.AFd1kSDK.equals
            int r0 = r0 + 125
            int r1 = r0 % 128
            com.appsflyer.internal.AFd1kSDK.toString = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            if (r0 == r1) goto L22
            boolean r0 = com.appsflyer.internal.AFk1ySDK.getCurrencyIso4217Code(r5)
            r3 = 56
            if (r0 == 0) goto L1d
            r0 = r3
            goto L1f
        L1d:
            r0 = 89
        L1f:
            if (r0 == r3) goto L2b
            goto L2c
        L22:
            boolean r0 = com.appsflyer.internal.AFk1ySDK.getCurrencyIso4217Code(r5)
            r3 = 31
            int r3 = r3 / r2
            if (r0 == 0) goto L2c
        L2b:
            return r1
        L2c:
            com.appsflyer.internal.AFc1dSDK r0 = r4.component1
            com.appsflyer.internal.AFc1pSDK r0 = r0.getRevenue()
            com.appsflyer.internal.AFc1iSDK r1 = r0.getRevenue
            android.content.Context r1 = r1.getMonetizationNetwork
            com.appsflyer.internal.AFc1iSDK r0 = r0.getRevenue
            android.content.Context r0 = r0.getMonetizationNetwork
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r0 = com.appsflyer.internal.AFj1iSDK.getMediationNetwork(r1, r0)
            boolean r5 = r5.equals(r0)
            int r0 = com.appsflyer.internal.AFd1kSDK.toString
            int r0 = r0 + 93
            int r1 = r0 % 128
            com.appsflyer.internal.AFd1kSDK.equals = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L58
            r0 = 13
            int r0 = r0 / r2
            return r5
        L56:
            r5 = move-exception
            throw r5
        L58:
            return r5
        L59:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1kSDK.AFAdRevenueData(java.lang.String):boolean");
    }

    private boolean getMonetizationNetwork(float f) {
        double d = f;
        if (!(d < 1.0d)) {
            return true;
        }
        if (d <= 0.0d) {
            int i = toString + 39;
            equals = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i2 = i % 2;
            return false;
        }
        if (component2() > f) {
            return false;
        }
        int i3 = equals + 67;
        toString = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return true;
    }

    private static AFi1xSDK getCurrencyIso4217Code(AFi1wSDK aFi1wSDK) {
        if ((aFi1wSDK != null ? 'V' : '!') == 'V') {
            int i = equals + 49;
            toString = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if ((i % 2 != 0 ? '@' : '&') == '&') {
                AFh1cSDK aFh1cSDK = aFi1wSDK.getMonetizationNetwork;
                if (!(aFh1cSDK == null)) {
                    AFi1xSDK aFi1xSDK = aFh1cSDK.AFAdRevenueData;
                    int i2 = toString + 51;
                    equals = i2 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                    int i3 = i2 % 2;
                    return aFi1xSDK;
                }
            } else {
                AFh1cSDK aFh1cSDK2 = aFi1wSDK.getMonetizationNetwork;
                throw null;
            }
        }
        return null;
    }

    private void AFInAppEventParameterName() {
        int i = equals + 89;
        toString = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i2 = i % 2;
        this.component1.component2().getMonetizationNetwork("participantInProxy");
        int i3 = toString + R.styleable.AppCompatTheme_windowFixedHeightMinor;
        equals = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFd1kSDK aFd1kSDK = (AFd1kSDK) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = toString + 41;
        equals = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (!(i % 2 != 0)) {
            aFd1kSDK.component1.component2().getCurrencyIso4217Code("participantInProxy", zBooleanValue);
            int i2 = 89 / 0;
        } else {
            aFd1kSDK.component1.component2().getCurrencyIso4217Code("participantInProxy", zBooleanValue);
        }
        int i3 = equals + 31;
        toString = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        int i4 = i3 % 2;
        return null;
    }

    private boolean registerClient() {
        int i = toString + 9;
        equals = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
        if (i % 2 == 0) {
        }
        return this.component1.component2().getMediationNetwork("participantInProxy", false);
    }

    static void component3() {
        areAllFieldsValid = -866183138771165766L;
        hashCode = 1193057722;
        copy = (char) 29794;
    }

    private void getMonetizationNetwork(boolean z) {
        getMediationNetwork(new Object[]{this, Boolean.valueOf(z)}, 124011145, -124011142, System.identityHashCode(this));
    }

    private boolean copydefault() {
        return ((Boolean) getMediationNetwork(new Object[]{this}, -1999031441, 1999031443, System.identityHashCode(this))).booleanValue();
    }

    public final void getMediationNetwork(String str, String... strArr) {
        getMediationNetwork(new Object[]{this, str, strArr}, 595413115, -595413114, System.identityHashCode(this));
    }

    public final boolean getMonetizationNetwork() {
        return ((Boolean) getMediationNetwork(new Object[]{this}, -1790300573, 1790300573, System.identityHashCode(this))).booleanValue();
    }
}
