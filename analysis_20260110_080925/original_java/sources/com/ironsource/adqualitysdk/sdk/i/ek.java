package com.ironsource.adqualitysdk.sdk.i;

import java.math.BigDecimal;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public abstract class ek extends ef {
    /* renamed from: ﻛ, reason: contains not printable characters */
    abstract boolean mo782(int i);

    /* renamed from: ﻛ, reason: contains not printable characters */
    abstract boolean mo783(Object obj, Object obj2);

    /* renamed from: ﾇ, reason: contains not printable characters */
    abstract boolean mo784(String str, String str2);

    public ek(ee eeVar, ee eeVar2, dm dmVar) {
        super(eeVar, eeVar2, dmVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ee
    /* renamed from: ｋ */
    public final du mo735(dr drVar, cp cpVar) {
        Object objM728 = m774().m769(drVar, cpVar).m728();
        Object objM7282 = m773().m769(drVar, cpVar).m728();
        try {
            return new du(Boolean.valueOf(mo782(new BigDecimal(objM728.toString()).compareTo(new BigDecimal(objM7282.toString())))));
        } catch (Exception unused) {
            if ((objM728 instanceof String) && (objM7282 instanceof String)) {
                return new du(Boolean.valueOf(mo784((String) objM728, (String) objM7282)));
            }
            return new du(Boolean.valueOf(mo783(objM728, objM7282)));
        }
    }
}
