package com.bytedance.adsdk.IlO;

import android.text.TextUtils;
import com.bytedance.adsdk.IlO.MY.IlO.IlO;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class DmF {
    public static Object IlO(IlO ilO) {
        vCE vceIlO;
        if (ilO == null || (vceIlO = IlO(ilO.IlO())) == null) {
            return null;
        }
        return vceIlO.IlO(null, ilO.MY());
    }

    public static vCE IlO(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.hashCode();
        switch (str) {
            case "modArray":
                return new Bc();
            case "find":
                return new tV();
            case "chunk":
                return new IlO();
            case "exist":
                return new EO();
            case "translate":
                return new lEW();
            case "isDigit":
                return new Cc();
            default:
                return null;
        }
    }
}
