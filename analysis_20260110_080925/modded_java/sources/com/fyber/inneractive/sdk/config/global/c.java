package com.fyber.inneractive.sdk.config.global;

import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class c implements d {
    public final HashSet a = new HashSet();
    public final boolean b;

    public c(JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                long jOptLong = jSONArray.optLong(i);
                if (jOptLong != 0) {
                    this.a.add(Long.valueOf(jOptLong));
                }
            }
        }
        this.b = z;
    }

    @Override // com.fyber.inneractive.sdk.config.global.d
    public final boolean a(e eVar) {
        if (this.a.isEmpty() || eVar.a == null) {
            return false;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((Long) it.next()).equals(eVar.a)) {
                return !this.b;
            }
        }
        return this.b;
    }

    public final String toString() {
        return String.format("%s - %s include: %b", "demand", this.a, Boolean.valueOf(this.b));
    }
}
