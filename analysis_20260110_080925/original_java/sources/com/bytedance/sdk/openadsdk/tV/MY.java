package com.bytedance.sdk.openadsdk.tV;

import com.bytedance.sdk.openadsdk.tV.EO.IlO;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class MY {
    public static final String IlO = IlO.IlO.IlO;
    public static final String MY = IlO.IlO.MY;
    public static final String EO = IlO.IlO.EO;
    public static final String tV = IlO.IlO.tV;
    public static final String Cc = IlO.IlO.Cc;
    public static final String vCE = IlO.IlO.vCE;
    public static final Set<String> Bc = new HashSet(Arrays.asList("click", "show", "insight_log"));

    public static class IlO {
        public static String EO = "direct";
        public static String IlO = "openDetailPage";
        public static String MY = "openAdLandPageLinks";
        public static String tV = "saLandingPageLinks";
    }

    /* renamed from: com.bytedance.sdk.openadsdk.tV.MY$MY, reason: collision with other inner class name */
    public static class C0023MY {
        public static int EO = 100;
        public static int IlO = 1;
        public static int MY = 2;
    }

    public static boolean IlO(String str) {
        return "embeded_ad".equals(str) || "banner_ad".equals(str) || "interaction".equals(str) || "slide_banner_ad".equals(str);
    }
}
