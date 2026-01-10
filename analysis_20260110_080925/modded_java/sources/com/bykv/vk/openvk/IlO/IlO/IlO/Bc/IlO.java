package com.bykv.vk.openvk.IlO.IlO.IlO.Bc;

import android.text.TextUtils;
import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import io.ktor.util.date.GMTDateParser;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class IlO {
    public static String IlO(File file) {
        return IlO(file, null);
    }

    public static String IlO(File file, String str) throws NoSuchAlgorithmException, IOException {
        if (!file.isFile()) {
            return BuildConfig.FLAVOR;
        }
        byte[] bArr = new byte[RendererCapabilities.AUDIO_OFFLOAD_GAPLESS_SUPPORTED];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            while (true) {
                int i = bufferedInputStream.read(bArr, 0, RendererCapabilities.AUDIO_OFFLOAD_GAPLESS_SUPPORTED);
                if (i == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i);
            }
            if (!TextUtils.isEmpty(str)) {
                messageDigest.update(str.getBytes());
            }
            bufferedInputStream.close();
            return IlO(messageDigest.digest());
        } catch (Exception unused) {
            return BuildConfig.FLAVOR;
        }
    }

    private static String IlO(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return BuildConfig.FLAVOR;
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', GMTDateParser.DAY_OF_MONTH, 'e', 'f'};
        char[] cArr2 = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b >>> 4) & 15];
            i = i2 + 1;
            cArr2[i2] = cArr[b & 15];
        }
        return new String(cArr2);
    }
}
