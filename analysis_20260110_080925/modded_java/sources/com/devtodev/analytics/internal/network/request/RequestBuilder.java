package com.devtodev.analytics.internal.network.request;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.crashlytics.android.BuildConfig;
import com.devtodev.analytics.internal.backend.repository.contentbuilder.ContentData;
import com.devtodev.analytics.internal.backend.repository.contentbuilder.IContentData;
import com.devtodev.analytics.internal.backend.repository.contentbuilder.IRequestContent;
import com.devtodev.analytics.internal.datacompression.IDataCompressor;
import com.devtodev.analytics.internal.network.IRequest;
import com.devtodev.analytics.internal.network.IRequestBuilder;
import com.devtodev.analytics.internal.network.request.platform.IUrlBuilder;
import com.devtodev.analytics.internal.network.request.platform.PlatformRequest;
import com.google.firebase.messaging.Constants;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RequestBuilder.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\bH\u0016J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0016J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\nH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/devtodev/analytics/internal/network/request/RequestBuilder;", "Lcom/devtodev/analytics/internal/network/IRequestBuilder;", "type", "Lcom/devtodev/analytics/internal/network/request/RequestType;", "urlBuilder", "Lcom/devtodev/analytics/internal/network/request/platform/IUrlBuilder;", "(Lcom/devtodev/analytics/internal/network/request/RequestType;Lcom/devtodev/analytics/internal/network/request/platform/IUrlBuilder;)V", "requestContent", "Lcom/devtodev/analytics/internal/backend/repository/contentbuilder/IRequestContent;", "requestIdentifier", "", "appendPathSegment", "", "segment", "build", "Lcom/devtodev/analytics/internal/network/IRequest;", "setContent", "content", "setQueryParam", "key", "value", "setRequestIdentifier", SettingsJsonConstants.APP_IDENTIFIER_KEY, "Companion", "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class RequestBuilder implements IRequestBuilder {
    private static final IRequestContent EMPTY_CONTENT = new IRequestContent() { // from class: com.devtodev.analytics.internal.network.request.RequestBuilder$Companion$EMPTY_CONTENT$1
        private final RequestBuilder$Companion$EMPTY_CONTENT$1$dataCompressor$1 dataCompressor = new IDataCompressor() { // from class: com.devtodev.analytics.internal.network.request.RequestBuilder$Companion$EMPTY_CONTENT$1$dataCompressor$1
            public byte[] compressData(byte[] data, int compressionLevel) {
                Intrinsics.checkNotNullParameter(data, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                return data;
            }
        };

        public Map<String, String> getBase64Headers() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("Content-type", BuildConfig.FLAVOR);
            return linkedHashMap;
        }

        public IContentData getContent() {
            return new ContentData(this.dataCompressor, new byte[0], BuildConfig.FLAVOR);
        }

        public final RequestBuilder$Companion$EMPTY_CONTENT$1$dataCompressor$1 getDataCompressor() {
            return this.dataCompressor;
        }

        public Map<String, String> getHeader() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("Content-type", BuildConfig.FLAVOR);
            return linkedHashMap;
        }

        public String getPrettyJson() {
            return JsonUtils.EMPTY_JSON;
        }

        public boolean isEmpty() {
            return true;
        }
    };
    private static final String EMPTY_HEADER = "";
    private IRequestContent requestContent;
    private String requestIdentifier;
    private final RequestType type;
    private final IUrlBuilder urlBuilder;

    public RequestBuilder(RequestType requestType, IUrlBuilder iUrlBuilder) {
        Intrinsics.checkNotNullParameter(requestType, "type");
        Intrinsics.checkNotNullParameter(iUrlBuilder, "urlBuilder");
        this.type = requestType;
        this.urlBuilder = iUrlBuilder;
        this.requestContent = EMPTY_CONTENT;
        this.requestIdentifier = "";
    }

    public void appendPathSegment(String segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        this.urlBuilder.appendSegment(segment);
    }

    public IRequest build() {
        return new PlatformRequest(this.urlBuilder, this.type, this.requestContent, this.requestIdentifier);
    }

    public void setContent(IRequestContent content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.requestContent = content;
    }

    public void setQueryParam(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.urlBuilder.setQueryParam(key, value);
    }

    public void setRequestIdentifier(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, SettingsJsonConstants.APP_IDENTIFIER_KEY);
        this.requestIdentifier = identifier;
    }
}
