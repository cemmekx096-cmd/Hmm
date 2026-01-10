package com.sfbx.appconsent.core.model;

import com.crashlytics.android.BuildConfig;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: VendorUrl.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B/\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0019\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J!\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eHÇ\u0001R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006!"}, d2 = {"Lcom/sfbx/appconsent/core/model/VendorUrl;", BuildConfig.FLAVOR, "seen1", BuildConfig.FLAVOR, "policyUrl", BuildConfig.FLAVOR, "legintClaimUrl", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getLegintClaimUrl$annotations", "()V", "getLegintClaimUrl", "()Ljava/lang/String;", "getPolicyUrl", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", "toString", "write$Self", BuildConfig.FLAVOR, "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "appconsent-core_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Serializable
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final /* data */ class VendorUrl {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String legintClaimUrl;
    private final String policyUrl;

    /* JADX WARN: Illegal instructions before constructor call */
    public VendorUrl() {
        String str = null;
        this(str, str, 3, (DefaultConstructorMarker) str);
    }

    public static /* synthetic */ VendorUrl copy$default(VendorUrl vendorUrl, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vendorUrl.policyUrl;
        }
        if ((i & 2) != 0) {
            str2 = vendorUrl.legintClaimUrl;
        }
        return vendorUrl.copy(str, str2);
    }

    @SerialName("legIntClaimUrl")
    public static /* synthetic */ void getLegintClaimUrl$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getPolicyUrl() {
        return this.policyUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLegintClaimUrl() {
        return this.legintClaimUrl;
    }

    public final VendorUrl copy(String policyUrl, String legintClaimUrl) {
        Intrinsics.checkNotNullParameter(policyUrl, "policyUrl");
        Intrinsics.checkNotNullParameter(legintClaimUrl, "legintClaimUrl");
        return new VendorUrl(policyUrl, legintClaimUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VendorUrl)) {
            return false;
        }
        VendorUrl vendorUrl = (VendorUrl) other;
        return Intrinsics.areEqual(this.policyUrl, vendorUrl.policyUrl) && Intrinsics.areEqual(this.legintClaimUrl, vendorUrl.legintClaimUrl);
    }

    public int hashCode() {
        return (this.policyUrl.hashCode() * 31) + this.legintClaimUrl.hashCode();
    }

    public String toString() {
        return "VendorUrl(policyUrl=" + this.policyUrl + ", legintClaimUrl=" + this.legintClaimUrl + ')';
    }

    /* compiled from: VendorUrl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/sfbx/appconsent/core/model/VendorUrl$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sfbx/appconsent/core/model/VendorUrl;", "appconsent-core_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<VendorUrl> serializer() {
            return VendorUrl$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = BuildConfig.FLAVOR, imports = {}))
    public /* synthetic */ VendorUrl(int i, String str, @SerialName("legIntClaimUrl") String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i, 0, VendorUrl$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.policyUrl = BuildConfig.FLAVOR;
        } else {
            this.policyUrl = str;
        }
        if ((i & 2) == 0) {
            this.legintClaimUrl = BuildConfig.FLAVOR;
        } else {
            this.legintClaimUrl = str2;
        }
    }

    public VendorUrl(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "policyUrl");
        Intrinsics.checkNotNullParameter(str2, "legintClaimUrl");
        this.policyUrl = str;
        this.legintClaimUrl = str2;
    }

    @JvmStatic
    public static final void write$Self(VendorUrl self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.policyUrl, BuildConfig.FLAVOR)) {
            output.encodeStringElement(serialDesc, 0, self.policyUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual(self.legintClaimUrl, BuildConfig.FLAVOR)) {
            output.encodeStringElement(serialDesc, 1, self.legintClaimUrl);
        }
    }

    public /* synthetic */ VendorUrl(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.FLAVOR : str, (i & 2) != 0 ? BuildConfig.FLAVOR : str2);
    }

    public final String getPolicyUrl() {
        return this.policyUrl;
    }

    public final String getLegintClaimUrl() {
        return this.legintClaimUrl;
    }
}
