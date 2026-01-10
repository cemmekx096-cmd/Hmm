package com.bytedance.adsdk.IlO.MY.tV;

import androidx.media3.exoplayer.RendererCapabilities;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.slf4j.Marker;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public enum EO implements Cc {
    QUESTION("?", 0),
    COLON(":", 0),
    DOUBLE_AMP("&&", 1),
    DOUBLE_BAR("||", 1),
    EQ("==", 2),
    GT(">", 2),
    LT("<", 2),
    LT_EQ("<=", 2),
    GT_EQ(">=", 2),
    NOT_EQ("!=", 2),
    PLUS(Marker.ANY_NON_NULL_MARKER, 3),
    MINUS("-", 3),
    MULTI(Marker.ANY_MARKER, 4),
    DIVISION("/", 4),
    MOD("%", 4);

    private final String cL;
    private final int es;
    private static final Map<String, EO> zPa = new HashMap(RendererCapabilities.DECODER_SUPPORT_PRIMARY);
    private static final Set<EO> cl = new HashSet();

    static {
        for (EO eo : values()) {
            zPa.put(eo.IlO(), eo);
            cl.add(eo);
        }
    }

    EO(String str, int i) {
        this.cL = str;
        this.es = i;
    }

    public static EO IlO(String str) {
        return zPa.get(str);
    }

    public static boolean IlO(Cc cc) {
        return cc instanceof EO;
    }

    public String IlO() {
        return this.cL;
    }

    public int MY() {
        return this.es;
    }
}
