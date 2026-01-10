package com.sfbx.appconsent.core.model.api;

import com.crashlytics.android.BuildConfig;
import com.sfbx.appconsent.core.model.api.XChangeDataAddress$;
import com.sfbx.appconsent.core.util.ExtensionKt;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: XChangeUserData.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 $2\u00020\u0001:\u0003\"#$BU\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fBC\b\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0010J!\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÇ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006%"}, d2 = {"Lcom/sfbx/appconsent/core/model/api/XChangeUserData;", BuildConfig.FLAVOR, "seen1", BuildConfig.FLAVOR, "emailSHA256", BuildConfig.FLAVOR, "externalId", "phoneSHA256", "xChangeDataAddress", "Lcom/sfbx/appconsent/core/model/api/XChangeDataAddress;", "timestampCollect", BuildConfig.FLAVOR, "unstructuredData", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sfbx/appconsent/core/model/api/XChangeDataAddress;Ljava/lang/Long;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sfbx/appconsent/core/model/api/XChangeDataAddress;Ljava/lang/Long;Ljava/lang/String;)V", "getEmailSHA256", "()Ljava/lang/String;", "getExternalId", "getPhoneSHA256", "getTimestampCollect", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getUnstructuredData", "getXChangeDataAddress", "()Lcom/sfbx/appconsent/core/model/api/XChangeDataAddress;", "write$Self", BuildConfig.FLAVOR, "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Builder", "Companion", "appconsent-core_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Serializable
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class XChangeUserData {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String emailSHA256;
    private final String externalId;
    private final String phoneSHA256;
    private final Long timestampCollect;
    private final String unstructuredData;
    private final XChangeDataAddress xChangeDataAddress;

    public /* synthetic */ XChangeUserData(String str, String str2, String str3, XChangeDataAddress xChangeDataAddress, Long l, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, xChangeDataAddress, l, str4);
    }

    /* compiled from: XChangeUserData.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/sfbx/appconsent/core/model/api/XChangeUserData$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sfbx/appconsent/core/model/api/XChangeUserData;", "appconsent-core_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<XChangeUserData> serializer() {
            return XChangeUserData$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = BuildConfig.FLAVOR, imports = {}))
    public /* synthetic */ XChangeUserData(int i, String str, String str2, String str3, XChangeDataAddress xChangeDataAddress, Long l, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, XChangeUserData$$serializer.INSTANCE.getDescriptor());
        }
        this.emailSHA256 = str;
        this.externalId = str2;
        this.phoneSHA256 = str3;
        this.xChangeDataAddress = xChangeDataAddress;
        this.timestampCollect = l;
        this.unstructuredData = str4;
    }

    private XChangeUserData(String str, String str2, String str3, XChangeDataAddress xChangeDataAddress, Long l, String str4) {
        this.emailSHA256 = str;
        this.externalId = str2;
        this.phoneSHA256 = str3;
        this.xChangeDataAddress = xChangeDataAddress;
        this.timestampCollect = l;
        this.unstructuredData = str4;
    }

    @JvmStatic
    public static final void write$Self(XChangeUserData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.emailSHA256);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.externalId);
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.phoneSHA256);
        output.encodeNullableSerializableElement(serialDesc, 3, XChangeDataAddress$.serializer.INSTANCE, self.xChangeDataAddress);
        output.encodeNullableSerializableElement(serialDesc, 4, LongSerializer.INSTANCE, self.timestampCollect);
        output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.unstructuredData);
    }

    public final String getEmailSHA256() {
        return this.emailSHA256;
    }

    public final String getExternalId() {
        return this.externalId;
    }

    public final String getPhoneSHA256() {
        return this.phoneSHA256;
    }

    public final XChangeDataAddress getXChangeDataAddress() {
        return this.xChangeDataAddress;
    }

    public final Long getTimestampCollect() {
        return this.timestampCollect;
    }

    public final String getUnstructuredData() {
        return this.unstructuredData;
    }

    /* compiled from: XChangeUserData.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0003J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/sfbx/appconsent/core/model/api/XChangeUserData$Builder;", BuildConfig.FLAVOR, "emailSHA256", BuildConfig.FLAVOR, "externalId", "phoneSHA256", "xChangeDataAddress", "Lcom/sfbx/appconsent/core/model/api/XChangeDataAddress;", "timestampCollect", BuildConfig.FLAVOR, "unstructuredData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sfbx/appconsent/core/model/api/XChangeDataAddress;Ljava/lang/Long;Ljava/lang/String;)V", "Ljava/lang/Long;", "build", "Lcom/sfbx/appconsent/core/model/api/XChangeUserData;", "email", "phoneNumber", "xChangeInfoAddress", "appconsent-core_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {
        private String emailSHA256;
        private String externalId;
        private String phoneSHA256;
        private Long timestampCollect;
        private String unstructuredData;
        private XChangeDataAddress xChangeDataAddress;

        public Builder() {
            this(null, null, null, null, null, null, 63, null);
        }

        public Builder(String str, String str2, String str3, XChangeDataAddress xChangeDataAddress, Long l, String str4) {
            this.emailSHA256 = str;
            this.externalId = str2;
            this.phoneSHA256 = str3;
            this.xChangeDataAddress = xChangeDataAddress;
            this.timestampCollect = l;
            this.unstructuredData = str4;
        }

        public /* synthetic */ Builder(String str, String str2, String str3, XChangeDataAddress xChangeDataAddress, Long l, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : xChangeDataAddress, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : str4);
        }

        public final Builder email(String email) {
            Intrinsics.checkNotNullParameter(email, "email");
            String string = StringsKt.trim(email).toString();
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            String lowerCase = string.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.emailSHA256 = ExtensionKt.sha256(lowerCase);
            return this;
        }

        public final Builder externalId(String externalId) {
            Intrinsics.checkNotNullParameter(externalId, "externalId");
            this.externalId = externalId;
            return this;
        }

        public final Builder phoneNumber(String phoneNumber) {
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            this.phoneSHA256 = ExtensionKt.sha256(ExtensionKt.formatNumber$default(phoneNumber, (String) null, 1, (Object) null));
            return this;
        }

        public final Builder xChangeInfoAddress(XChangeDataAddress xChangeDataAddress) {
            Intrinsics.checkNotNullParameter(xChangeDataAddress, "xChangeDataAddress");
            this.xChangeDataAddress = xChangeDataAddress;
            return this;
        }

        public final Builder unstructuredData(String unstructuredData) {
            Intrinsics.checkNotNullParameter(unstructuredData, "unstructuredData");
            this.unstructuredData = unstructuredData;
            return this;
        }

        public final XChangeUserData build() {
            return new XChangeUserData(this.emailSHA256, this.externalId, this.phoneSHA256, this.xChangeDataAddress, this.timestampCollect, this.unstructuredData, null);
        }
    }
}
