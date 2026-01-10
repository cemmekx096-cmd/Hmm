package com.fyber.inneractive.sdk.config.global;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class f implements d {
    public final String a;
    public final boolean b;

    public f(boolean z, String str) {
        this.a = str;
        this.b = z;
    }

    @Override // com.fyber.inneractive.sdk.config.global.d
    public final boolean a(e eVar) {
        String str = this.a;
        if (str != null) {
            return str.equalsIgnoreCase("android") ? !this.b : this.b;
        }
        return false;
    }

    public final String toString() {
        return "os - " + this.a + " include: " + this.b;
    }
}
