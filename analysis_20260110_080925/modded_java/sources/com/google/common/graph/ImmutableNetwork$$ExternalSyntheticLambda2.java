package com.google.common.graph;

import com.google.common.base.Function;

/* compiled from: D8$$SyntheticClass */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final /* synthetic */ class ImmutableNetwork$$ExternalSyntheticLambda2 implements Function {
    public final /* synthetic */ Network f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ImmutableNetwork$$ExternalSyntheticLambda2(Network network, Object obj) {
        this.f$0 = network;
        this.f$1 = obj;
    }

    public final Object apply(Object obj) {
        return ImmutableNetwork.lambda$adjacentNodeFn$2(this.f$0, this.f$1, obj);
    }
}
