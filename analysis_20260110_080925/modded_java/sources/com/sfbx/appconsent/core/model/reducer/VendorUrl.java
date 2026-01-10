package com.sfbx.appconsent.core.model.reducer;

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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 !2\u00020\u0001:\u0002 !B1\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0019\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J!\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÇ\u0001R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e¨\u0006\""}, d2 = {"Lcom/sfbx/appconsent/core/model/reducer/VendorUrl;", BuildConfig.FLAVOR, "seen1", BuildConfig.FLAVOR, "privacy", BuildConfig.FLAVOR, "legintClaim", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getLegintClaim$annotations", "()V", "getLegintClaim", "()Ljava/lang/String;", "getPrivacy$annotations", "getPrivacy", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", "toString", "write$Self", BuildConfig.FLAVOR, "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "appconsent-core_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Serializable
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final /* data */ class VendorUrl {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String legintClaim;
    private final String privacy;

    /* JADX WARN: Illegal instructions before constructor call */
    public VendorUrl() {
        String str = null;
        this(str, str, 3, (DefaultConstructorMarker) str);
    }

    public static /* synthetic */ VendorUrl copy$default(VendorUrl vendorUrl, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vendorUrl.privacy;
        }
        if ((i & 2) != 0) {
            str2 = vendorUrl.legintClaim;
        }
        return vendorUrl.copy(str, str2);
    }

    @SerialName("legint_claim")
    public static /* synthetic */ void getLegintClaim$annotations() {
    }

    @SerialName("privacy")
    public static /* synthetic */ void getPrivacy$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getPrivacy() {
        return this.privacy;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLegintClaim() {
        return this.legintClaim;
    }

    public final VendorUrl copy(String privacy, String legintClaim) {
        Intrinsics.checkNotNullParameter(privacy, "privacy");
        Intrinsics.checkNotNullParameter(legintClaim, "legintClaim");
        return new VendorUrl(privacy, legintClaim);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VendorUrl)) {
            return false;
        }
        VendorUrl vendorUrl = (VendorUrl) other;
        return Intrinsics.areEqual(this.privacy, vendorUrl.privacy) && Intrinsics.areEqual(this.legintClaim, vendorUrl.legintClaim);
    }

    public int hashCode() {
        return (this.privacy.hashCode() * 31) + this.legintClaim.hashCode();
    }

    public String toString() {
        return "VendorUrl(privacy=" + this.privacy + ", legintClaim=" + this.legintClaim + ')';
    }

    /* compiled from: VendorUrl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/sfbx/appconsent/core/model/reducer/VendorUrl$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sfbx/appconsent/core/model/reducer/VendorUrl;", "appconsent-core_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
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
    public /* synthetic */ VendorUrl(int i, @SerialName("privacy") String str, @SerialName("legint_claim") String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i, 0, VendorUrl$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.privacy = BuildConfig.FLAVOR;
        } else {
            this.privacy = str;
        }
        if ((i & 2) == 0) {
            this.legintClaim = BuildConfig.FLAVOR;
        } else {
            this.legintClaim = str2;
        }
    }

    public VendorUrl(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "privacy");
        Intrinsics.checkNotNullParameter(str2, "legintClaim");
        this.privacy = str;
        this.legintClaim = str2;
    }

    @JvmStatic
    public static final void write$Self(VendorUrl self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.privacy, BuildConfig.FLAVOR)) {
            output.encodeStringElement(serialDesc, 0, self.privacy);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual(self.legintClaim, BuildConfig.FLAVOR)) {
            output.encodeStringElement(serialDesc, 1, self.legintClaim);
        }
    }

    public /* synthetic */ VendorUrl(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.FLAVOR : str, (i & 2) != 0 ? BuildConfig.FLAVOR : str2);
    }

    public final String getPrivacy() {
        return this.privacy;
    }

    public final String getLegintClaim() {
        return this.legintClaim;
    }
}
