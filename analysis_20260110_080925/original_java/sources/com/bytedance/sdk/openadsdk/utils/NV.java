package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.os.Build;
import com.bytedance.sdk.openadsdk.core.EO;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class NV {
    public static int IlO() {
        File[] fileArrListFiles;
        if (Build.VERSION.SDK_INT >= 17) {
            return Math.max(Runtime.getRuntime().availableProcessors(), 0);
        }
        try {
            File file = new File("/sys/devices/system/cpu/");
            if (file.exists() && (fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: com.bytedance.sdk.openadsdk.utils.NV.1
                private final Pattern IlO = Pattern.compile("^cpu[0-9]+$");

                @Override // java.io.FilenameFilter
                public boolean accept(File file2, String str) {
                    return this.IlO.matcher(str).matches();
                }
            })) != null) {
                return Math.max(fileArrListFiles.length, 0);
            }
        } catch (Throwable unused) {
        }
        return 0;
    }

    public static int IlO(Context context) {
        return EO.IlO(context).MY("cpu_count", 0);
    }

    public static int MY(Context context) {
        return EO.IlO(context).MY("cpu_max_frequency", 0);
    }

    public static int EO(Context context) {
        return EO.IlO(context).MY("cpu_min_frequency", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060 A[Catch: Exception -> 0x0063, DONT_GENERATE, TRY_LEAVE, TryCatch #6 {Exception -> 0x0063, blocks: (B:22:0x005b, B:24:0x0060), top: B:48:0x005b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int IlO(int r7) throws java.io.IOException {
        /*
            r0 = 0
            r1 = 0
            r2 = r1
            r1 = r0
        L4:
            int r7 = r7 + (-1)
            if (r7 < 0) goto L71
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L4c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c
            java.lang.String r5 = "/sys/devices/system/cpu/cpu"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L4c
            java.lang.StringBuilder r4 = r4.append(r7)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r5 = "/cpufreq/cpuinfo_max_freq"
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L4c
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L4c
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L46
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = r0.readLine()     // Catch: java.lang.Throwable -> L41
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L41
            if (r4 != 0) goto L38
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L41
            if (r1 <= r2) goto L38
            r2 = r1
        L38:
            r0.close()     // Catch: java.lang.Exception -> L3e
            r3.close()     // Catch: java.lang.Exception -> L3e
        L3e:
            r1 = r0
            r0 = r3
            goto L4
        L41:
            r1 = move-exception
            r6 = r3
            r3 = r0
            r0 = r6
            goto L50
        L46:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r3
            r3 = r6
            goto L50
        L4c:
            r3 = move-exception
            r6 = r3
            r3 = r1
            r1 = r6
        L50:
            java.lang.String r4 = "CpuUtils"
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L65
            com.bytedance.sdk.component.utils.oeT.EO(r4, r1)     // Catch: java.lang.Throwable -> L65
            if (r3 == 0) goto L5e
            r3.close()     // Catch: java.lang.Exception -> L63
        L5e:
            if (r0 == 0) goto L63
            r0.close()     // Catch: java.lang.Exception -> L63
        L63:
            r1 = r3
            goto L4
        L65:
            r7 = move-exception
            if (r3 == 0) goto L6b
            r3.close()     // Catch: java.lang.Exception -> L70
        L6b:
            if (r0 == 0) goto L70
            r0.close()     // Catch: java.lang.Exception -> L70
        L70:
            throw r7
        L71:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.NV.IlO(int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[Catch: Exception -> 0x0066, DONT_GENERATE, TRY_LEAVE, TryCatch #3 {Exception -> 0x0066, blocks: (B:24:0x005e, B:26:0x0063), top: B:44:0x005e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int MY(int r7) throws java.io.IOException {
        /*
            r0 = 0
            r1 = 0
            r2 = r1
            r1 = r0
        L4:
            int r7 = r7 + (-1)
            if (r7 < 0) goto L74
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L4f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            java.lang.String r5 = "/sys/devices/system/cpu/cpu"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L4f
            java.lang.StringBuilder r4 = r4.append(r7)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r5 = "/cpufreq/cpuinfo_min_freq"
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L4f
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L4f
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L49
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = r0.readLine()     // Catch: java.lang.Throwable -> L44
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L44
            if (r4 != 0) goto L3b
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L44
            if (r1 >= r2) goto L38
            goto L3a
        L38:
            if (r2 != 0) goto L3b
        L3a:
            r2 = r1
        L3b:
            r0.close()     // Catch: java.lang.Exception -> L41
            r3.close()     // Catch: java.lang.Exception -> L41
        L41:
            r1 = r0
            r0 = r3
            goto L4
        L44:
            r1 = move-exception
            r6 = r3
            r3 = r0
            r0 = r6
            goto L53
        L49:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r3
            r3 = r6
            goto L53
        L4f:
            r3 = move-exception
            r6 = r3
            r3 = r1
            r1 = r6
        L53:
            java.lang.String r4 = "CpuUtils"
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L68
            com.bytedance.sdk.component.utils.oeT.EO(r4, r1)     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L61
            r3.close()     // Catch: java.lang.Exception -> L66
        L61:
            if (r0 == 0) goto L66
            r0.close()     // Catch: java.lang.Exception -> L66
        L66:
            r1 = r3
            goto L4
        L68:
            r7 = move-exception
            if (r3 == 0) goto L6e
            r3.close()     // Catch: java.lang.Exception -> L73
        L6e:
            if (r0 == 0) goto L73
            r0.close()     // Catch: java.lang.Exception -> L73
        L73:
            throw r7
        L74:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.NV.MY(int):int");
    }
}
