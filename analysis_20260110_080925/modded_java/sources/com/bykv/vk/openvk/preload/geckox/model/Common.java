package com.bykv.vk.openvk.preload.geckox.model;

import android.os.Build;
import com.bykv.vk.openvk.preload.a.a.b;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class Common {

    /* renamed from: ac, reason: collision with root package name */
    @b(a = "ac")
    public String f663ac;

    @b(a = "aid")
    public long aid;

    @b(a = "app_name")
    public String appName;

    @b(a = "app_version")
    public String appVersion;

    @b(a = "device_id")
    public String deviceId;

    @b(a = "region")
    public String region;

    @b(a = "uid")
    public String uid;

    @b(a = "os")
    public int os = 0;

    @b(a = "os_version")
    public String osVersion = new StringBuilder().append(Build.VERSION.SDK_INT).toString();

    @b(a = "device_model")
    public String deviceModel = Build.MODEL;

    @b(a = "device_platform")
    public String devicePlatform = "android";

    @b(a = "sdk_version")
    public String sdkVersion = "2.0.3-rc.9-pangle";

    public Common(long j, String str, String str2, String str3, String str4) {
        this.aid = j;
        this.appVersion = str;
        this.deviceId = str2;
        this.appName = str3;
        this.f663ac = str4;
    }

    public Common(long j, String str, String str2, String str3, String str4, String str5, String str6) {
        this.aid = j;
        this.appVersion = str;
        this.deviceId = str2;
        this.appName = str3;
        this.f663ac = str4;
        this.uid = str5;
        this.region = str6;
    }
}
