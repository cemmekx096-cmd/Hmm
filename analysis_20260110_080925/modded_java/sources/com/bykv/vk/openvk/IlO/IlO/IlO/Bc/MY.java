package com.bykv.vk.openvk.IlO.IlO.IlO.Bc;

import android.text.TextUtils;
import com.crashlytics.android.BuildConfig;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class MY {
    private static final MessageDigest IlO = IlO();
    private static final char[] MY = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private MY() {
    }

    private static MessageDigest IlO() {
        try {
            return MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String IlO(String str) {
        byte[] bArrDigest;
        MessageDigest messageDigest = IlO;
        if (messageDigest == null || TextUtils.isEmpty(str)) {
            return BuildConfig.FLAVOR;
        }
        byte[] bytes = str.getBytes(Charset.forName(HttpRequest.CHARSET_UTF8));
        synchronized (MY.class) {
            bArrDigest = messageDigest.digest(bytes);
        }
        return IlO(bArrDigest);
    }

    public static String IlO(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[bArr.length << 1];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = MY;
            cArr[i] = cArr2[(b & 240) >> 4];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }
}
