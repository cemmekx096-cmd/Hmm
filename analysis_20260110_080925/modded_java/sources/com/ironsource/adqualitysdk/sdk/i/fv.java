package com.ironsource.adqualitysdk.sdk.i;

import java.util.HashMap;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class fv extends fq {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private el f555;

    /* renamed from: ｋ, reason: contains not printable characters */
    private fk f556;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private fk f557;

    public fv(fk fkVar, fk fkVar2, el elVar) {
        this.f556 = fkVar;
        this.f557 = fkVar2;
        this.f555 = elVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fq
    /* renamed from: ｋ */
    public final du mo804(dr drVar, cp cpVar) {
        try {
            fk fkVar = this.f556;
            if (fkVar != null) {
                return fkVar.mo804(new dr(drVar), cpVar);
            }
        } catch (Throwable th) {
            if (this.f557 != null) {
                HashMap map = new HashMap();
                el elVar = this.f555;
                if (elVar != null) {
                    map.put(dw.m736(elVar.m786()), th);
                }
                return this.f557.mo804(new dr(map, drVar), cpVar);
            }
        }
        return new du(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fv fvVar = (fv) obj;
            fk fkVar = this.f556;
            if (fkVar == null ? fvVar.f556 != null : !fkVar.equals(fvVar.f556)) {
                return false;
            }
            fk fkVar2 = this.f557;
            if (fkVar2 == null ? fvVar.f557 != null : !fkVar2.equals(fvVar.f557)) {
                return false;
            }
            el elVar = this.f555;
            el elVar2 = fvVar.f555;
            if (elVar != null) {
                return elVar.equals(elVar2);
            }
            if (elVar2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        fk fkVar = this.f556;
        int iHashCode = (fkVar != null ? fkVar.hashCode() : 0) * 31;
        fk fkVar2 = this.f557;
        int iHashCode2 = (iHashCode + (fkVar2 != null ? fkVar2.hashCode() : 0)) * 31;
        el elVar = this.f555;
        return iHashCode2 + (elVar != null ? elVar.hashCode() : 0);
    }
}
