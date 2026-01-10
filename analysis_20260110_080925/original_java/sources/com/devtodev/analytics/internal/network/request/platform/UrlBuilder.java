package com.devtodev.analytics.internal.network.request.platform;

import com.crashlytics.android.BuildConfig;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UrlBuilder.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/devtodev/analytics/internal/network/request/platform/UrlBuilder;", "Lcom/devtodev/analytics/internal/network/request/platform/IUrlBuilder;", "host", BuildConfig.FLAVOR, "(Ljava/lang/String;)V", "path", "queryParameter", BuildConfig.FLAVOR, "appendSegment", BuildConfig.FLAVOR, "segment", "buildFullPath", "getUrl", "Ljava/net/URL;", "setQueryParam", "key", "value", "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class UrlBuilder implements IUrlBuilder {
    private String host;
    private String path;
    private Map<String, String> queryParameter;

    public UrlBuilder(String str) {
        Intrinsics.checkNotNullParameter(str, "host");
        this.host = str;
        this.path = BuildConfig.FLAVOR;
        this.queryParameter = new LinkedHashMap();
    }

    private final String buildFullPath() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.host);
        sb.append(this.path);
        if (!this.queryParameter.isEmpty()) {
            sb.append("?");
        }
        boolean z = false;
        for (String str : this.queryParameter.keySet()) {
            String str2 = this.queryParameter.get(str);
            if (str2 != null) {
                if (z) {
                    sb.append("&");
                }
                sb.append(str);
                sb.append("=");
                sb.append(str2);
                if (!z) {
                    z = true;
                }
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "fullPath.toString()");
        return string;
    }

    public void appendSegment(String segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        this.host += "/" + segment;
    }

    public URL getUrl() throws MalformedURLException {
        URL url = new URI(buildFullPath()).toURL();
        Intrinsics.checkNotNullExpressionValue(url, "uri.toURL()");
        return url;
    }

    public void setQueryParam(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.queryParameter.put(key, value);
    }
}
