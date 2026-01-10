package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class co {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private c f127;

    /* renamed from: ｋ, reason: contains not printable characters */
    private dt f128;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m456(ht htVar, dr drVar, cp cpVar, List<Object> list) {
        c cVar = this.f127;
        if (cVar != null && !cVar.mo457(htVar)) {
            return false;
        }
        if (this.f128 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, htVar);
        return this.f128.m721(drVar, cpVar, arrayList).m732();
    }

    public static class b {

        /* renamed from: ﾒ, reason: contains not printable characters */
        private co f129 = new co();

        /* renamed from: ﾇ, reason: contains not printable characters */
        public final b m462(Class cls) {
            this.f129.f127 = new e(cls);
            return this;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        public final b m461(Class cls) {
            this.f129.f127 = new d(cls);
            return this;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        public final b m458(Class cls) {
            this.f129.f127 = new a(cls);
            return this;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        public final b m460(dt dtVar) {
            this.f129.f128 = dtVar;
            return this;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        public final co m459() {
            return this.f129;
        }
    }

    static abstract class c {

        /* renamed from: ﾒ, reason: contains not printable characters */
        private Class f130;

        /* renamed from: ﻐ */
        abstract boolean mo457(ht htVar);

        c(Class cls) {
            this.f130 = cls;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        final Class m463() {
            return this.f130;
        }
    }

    static class e extends c {
        e(Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.co.c
        /* renamed from: ﻐ */
        public final boolean mo457(ht htVar) {
            return m463().isAssignableFrom(htVar.ﾇ().getType());
        }
    }

    static class d extends c {
        d(Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.co.c
        /* renamed from: ﻐ */
        public final boolean mo457(ht htVar) {
            return m463().equals(htVar.ﾇ().getType());
        }
    }

    static class a extends c {
        a(Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.co.c
        /* renamed from: ﻐ, reason: contains not printable characters */
        final boolean mo457(ht htVar) {
            return m463().isInstance(htVar.ｋ());
        }
    }
}
