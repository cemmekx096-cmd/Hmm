package com.fyber.inneractive.sdk.network;

import io.fabric.sdk.android.services.network.HttpRequest;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public enum M {
    POST("POST"),
    PUT("PUT"),
    DELETE(HttpRequest.METHOD_DELETE),
    GET(HttpRequest.METHOD_GET);

    final String key;

    M(String str) {
        this.key = str;
    }
}
