package com.digitalturbine.ignite.authenticator.handlers;

import com.digitalturbine.ignite.authenticator.callbacks.b;
import com.digitalturbine.ignite.authenticator.decorator.h;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class a {
    public h a;
    public b b = new b(this);
    public IIgniteServiceAPI c;

    public a(IIgniteServiceAPI iIgniteServiceAPI, h hVar) {
        this.a = hVar;
        this.c = iIgniteServiceAPI;
    }
}
