package com.inmobi.media;

import androidx.media3.common.MimeTypes;
import com.crashlytics.android.BuildConfig;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public abstract class M7 {
    public static byte a(String str) {
        Intrinsics.checkNotNullParameter(str, "referencedCreativeString");
        Locale locale = Locale.US;
        Intrinsics.checkNotNullExpressionValue(locale, "US");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        int length = lowerCase.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.compare(lowerCase.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String strA = i7.a(length, 1, lowerCase, i);
        int iHashCode = strA.hashCode();
        if (iHashCode != -1412832500) {
            if (iHashCode != 0) {
                if (iHashCode == 112202875 && strA.equals(MimeTypes.BASE_TYPE_VIDEO)) {
                    return (byte) 1;
                }
            } else if (strA.equals(BuildConfig.FLAVOR)) {
                return (byte) 1;
            }
        } else if (strA.equals("companion")) {
            return (byte) 2;
        }
        return (byte) 0;
    }
}
