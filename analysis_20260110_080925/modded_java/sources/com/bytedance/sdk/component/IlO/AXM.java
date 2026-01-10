package com.bytedance.sdk.component.IlO;

import android.net.Uri;
import com.bytedance.sdk.component.IlO.EV;
import com.bytedance.sdk.component.IlO.oeT;
import com.bytedance.sdk.component.IlO.vAh;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
class AXM {
    private EV.IlO Cc;
    private final vAh EO = cl.IlO;
    private final Set<String> IlO;
    private final Set<String> MY;
    private final oeT tV;

    AXM(oeT oet, Set<String> set, Set<String> set2) {
        this.tV = oet;
        if (set == null || set.isEmpty()) {
            this.IlO = new LinkedHashSet();
        } else {
            this.IlO = new LinkedHashSet(set);
        }
        if (set2 == null || set2.isEmpty()) {
            this.MY = new LinkedHashSet();
        } else {
            this.MY = new LinkedHashSet(set2);
        }
    }

    final synchronized kBB IlO(boolean z, String str, MY my) throws oeT.IlO {
        kBB kbbMY;
        EV.IlO ilO;
        Uri uri = Uri.parse(str);
        String host = uri.getHost();
        if (host == null) {
            return null;
        }
        kBB kbb = this.MY.contains(my.IlO()) ? kBB.IlO : null;
        for (String str2 : this.IlO) {
            if (uri.getHost().equals(str2) || host.endsWith(".".concat(String.valueOf(str2)))) {
                kbb = kBB.EO;
                break;
            }
        }
        if (kbb == null && (ilO = this.Cc) != null && ilO.IlO(str)) {
            if (this.Cc.IlO(str, my.IlO())) {
                return null;
            }
            kbb = kBB.EO;
        }
        if (z) {
            kbbMY = IlO(str, my);
        } else {
            kbbMY = MY(str, my);
        }
        return kbbMY != null ? kbbMY : kbb;
    }

    final synchronized kBB IlO(String str, MY my) throws oeT.IlO {
        return IlO(str, my, true);
    }

    final synchronized kBB MY(String str, MY my) {
        return IlO(str, my, false);
    }

    void IlO(EV.IlO ilO) {
        this.Cc = ilO;
    }

    void IlO(vAh.IlO ilO) {
        if (this.EO != null) {
            throw null;
        }
    }

    void MY(vAh.IlO ilO) {
        if (this.EO != null) {
            throw null;
        }
    }

    private kBB IlO(String str, MY my, boolean z) {
        if (!z || this.tV == null) {
            return null;
        }
        throw null;
    }
}
