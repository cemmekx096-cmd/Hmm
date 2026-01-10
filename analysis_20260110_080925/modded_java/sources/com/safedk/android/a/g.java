package com.safedk.android.a;

import com.mbridge.msdk.playercommon.VideoFeedsPlayer;
import com.safedk.android.utils.Logger;
import java.io.IOException;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public abstract class g {
    public static final String e = "POST";
    public static final String f = "PUT";
    public static final int g = 2;
    public static final int[] h = {VideoFeedsPlayer.INTERVAL_TIME_PLAY_TIME_CD_THREAD, 2000};
    protected String d = "ServerUploadFile";
    protected int i;
    protected String j;
    protected String k;

    public abstract a a() throws IOException;

    public g(String str, String str2, int i) {
        this.i = i;
        this.j = str;
        this.k = str2;
        Logger.d("ServerUploadFile", "object created, File path=" + str + ", hash=" + str2);
    }

    public static class a {
        private final String a;
        private final int b;
        private final String c;

        a(String str, int i, String str2) {
            Logger.d("ServerResponseData", "object created, URL=" + str + ", response=" + i + ", file hash=" + str2);
            this.a = str;
            this.b = i;
            this.c = str2;
        }

        public String a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public String c() {
            return this.c;
        }
    }
}
