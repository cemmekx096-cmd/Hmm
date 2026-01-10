package com.sfbx.appconsent.core.model.api.proto;

import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.api.proto.I18NString$;
import com.sfbx.appconsent.core.util.ExtensionKt;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: Stack.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002=>Bq\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011BY\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0012J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJh\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000e\u00101\u001a\u0002022\u0006\u00103\u001a\u000202J\t\u00104\u001a\u00020\u0003HÖ\u0001J\t\u00105\u001a\u000202HÖ\u0001J!\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<HÇ\u0001R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u001b\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR \u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u001b\u0012\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u001a¨\u0006?"}, d2 = {"Lcom/sfbx/appconsent/core/model/api/proto/Stack;", BuildConfig.FLAVOR, "seen1", BuildConfig.FLAVOR, "id", "iabId", "name", "Lcom/sfbx/appconsent/core/model/api/proto/I18NString;", "description", "consentables", BuildConfig.FLAVOR, SettingsJsonConstants.APP_STATUS_KEY, "Lcom/sfbx/appconsent/core/model/ConsentStatus;", "legintStatus", "vendorsNumber", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/Integer;Lcom/sfbx/appconsent/core/model/api/proto/I18NString;Lcom/sfbx/appconsent/core/model/api/proto/I18NString;Ljava/util/List;Lcom/sfbx/appconsent/core/model/ConsentStatus;Lcom/sfbx/appconsent/core/model/ConsentStatus;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILjava/lang/Integer;Lcom/sfbx/appconsent/core/model/api/proto/I18NString;Lcom/sfbx/appconsent/core/model/api/proto/I18NString;Ljava/util/List;Lcom/sfbx/appconsent/core/model/ConsentStatus;Lcom/sfbx/appconsent/core/model/ConsentStatus;Ljava/lang/Integer;)V", "getConsentables", "()Ljava/util/List;", "getDescription", "()Lcom/sfbx/appconsent/core/model/api/proto/I18NString;", "getIabId$annotations", "()V", "getIabId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId", "()I", "getLegintStatus", "()Lcom/sfbx/appconsent/core/model/ConsentStatus;", "getName", "getStatus", "getVendorsNumber$annotations", "getVendorsNumber", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ILjava/lang/Integer;Lcom/sfbx/appconsent/core/model/api/proto/I18NString;Lcom/sfbx/appconsent/core/model/api/proto/I18NString;Ljava/util/List;Lcom/sfbx/appconsent/core/model/ConsentStatus;Lcom/sfbx/appconsent/core/model/ConsentStatus;Ljava/lang/Integer;)Lcom/sfbx/appconsent/core/model/api/proto/Stack;", "equals", BuildConfig.FLAVOR, "other", "getNameAsString", BuildConfig.FLAVOR, "appconsentThemeLocal", "hashCode", "toString", "write$Self", BuildConfig.FLAVOR, "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "appconsent-core_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Serializable
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final /* data */ class Stack {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<Integer> consentables;
    private final I18NString description;
    private final Integer iabId;
    private final int id;
    private final ConsentStatus legintStatus;
    private final I18NString name;
    private final ConsentStatus status;
    private final Integer vendorsNumber;

    @SerialName("iab_id")
    public static /* synthetic */ void getIabId$annotations() {
    }

    @SerialName("vendors_number")
    public static /* synthetic */ void getVendorsNumber$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getIabId() {
        return this.iabId;
    }

    /* renamed from: component3, reason: from getter */
    public final I18NString getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final I18NString getDescription() {
        return this.description;
    }

    public final List<Integer> component5() {
        return this.consentables;
    }

    /* renamed from: component6, reason: from getter */
    public final ConsentStatus getStatus() {
        return this.status;
    }

    /* renamed from: component7, reason: from getter */
    public final ConsentStatus getLegintStatus() {
        return this.legintStatus;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getVendorsNumber() {
        return this.vendorsNumber;
    }

    public final Stack copy(int id, Integer iabId, I18NString name, I18NString description, List<Integer> consentables, ConsentStatus status, ConsentStatus legintStatus, Integer vendorsNumber) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(consentables, "consentables");
        Intrinsics.checkNotNullParameter(status, SettingsJsonConstants.APP_STATUS_KEY);
        Intrinsics.checkNotNullParameter(legintStatus, "legintStatus");
        return new Stack(id, iabId, name, description, consentables, status, legintStatus, vendorsNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Stack)) {
            return false;
        }
        Stack stack = (Stack) other;
        return this.id == stack.id && Intrinsics.areEqual(this.iabId, stack.iabId) && Intrinsics.areEqual(this.name, stack.name) && Intrinsics.areEqual(this.description, stack.description) && Intrinsics.areEqual(this.consentables, stack.consentables) && this.status == stack.status && this.legintStatus == stack.legintStatus && Intrinsics.areEqual(this.vendorsNumber, stack.vendorsNumber);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        Integer num = this.iabId;
        int iHashCode2 = (((((((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + this.consentables.hashCode()) * 31) + this.status.hashCode()) * 31) + this.legintStatus.hashCode()) * 31;
        Integer num2 = this.vendorsNumber;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "Stack(id=" + this.id + ", iabId=" + this.iabId + ", name=" + this.name + ", description=" + this.description + ", consentables=" + this.consentables + ", status=" + this.status + ", legintStatus=" + this.legintStatus + ", vendorsNumber=" + this.vendorsNumber + ')';
    }

    /* compiled from: Stack.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/sfbx/appconsent/core/model/api/proto/Stack$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sfbx/appconsent/core/model/api/proto/Stack;", "appconsent-core_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<Stack> serializer() {
            return Stack$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = BuildConfig.FLAVOR, imports = {}))
    public /* synthetic */ Stack(int i, int i2, @SerialName("iab_id") Integer num, I18NString i18NString, I18NString i18NString2, List list, ConsentStatus consentStatus, ConsentStatus consentStatus2, @SerialName("vendors_number") Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if (13 != (i & 13)) {
            PluginExceptionsKt.throwMissingFieldException(i, 13, Stack$$serializer.INSTANCE.getDescriptor());
        }
        this.id = i2;
        if ((i & 2) == 0) {
            this.iabId = null;
        } else {
            this.iabId = num;
        }
        this.name = i18NString;
        this.description = i18NString2;
        if ((i & 16) == 0) {
            this.consentables = CollectionsKt.emptyList();
        } else {
            this.consentables = list;
        }
        if ((i & 32) == 0) {
            this.status = ConsentStatus.PENDING;
        } else {
            this.status = consentStatus;
        }
        if ((i & 64) == 0) {
            this.legintStatus = ConsentStatus.PENDING;
        } else {
            this.legintStatus = consentStatus2;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_PRIMARY) == 0) {
            this.vendorsNumber = null;
        } else {
            this.vendorsNumber = num2;
        }
    }

    public Stack(int i, Integer num, I18NString i18NString, I18NString i18NString2, List<Integer> list, ConsentStatus consentStatus, ConsentStatus consentStatus2, Integer num2) {
        Intrinsics.checkNotNullParameter(i18NString, "name");
        Intrinsics.checkNotNullParameter(i18NString2, "description");
        Intrinsics.checkNotNullParameter(list, "consentables");
        Intrinsics.checkNotNullParameter(consentStatus, SettingsJsonConstants.APP_STATUS_KEY);
        Intrinsics.checkNotNullParameter(consentStatus2, "legintStatus");
        this.id = i;
        this.iabId = num;
        this.name = i18NString;
        this.description = i18NString2;
        this.consentables = list;
        this.status = consentStatus;
        this.legintStatus = consentStatus2;
        this.vendorsNumber = num2;
    }

    @JvmStatic
    public static final void write$Self(Stack self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeIntElement(serialDesc, 0, self.id);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.iabId != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.iabId);
        }
        output.encodeSerializableElement(serialDesc, 2, I18NString$.serializer.INSTANCE, self.name);
        output.encodeSerializableElement(serialDesc, 3, I18NString$.serializer.INSTANCE, self.description);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !Intrinsics.areEqual(self.consentables, CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 4, new ArrayListSerializer(IntSerializer.INSTANCE), self.consentables);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.status != ConsentStatus.PENDING) {
            output.encodeSerializableElement(serialDesc, 5, EnumsKt.createSimpleEnumSerializer("com.sfbx.appconsent.core.model.ConsentStatus", ConsentStatus.values()), self.status);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.legintStatus != ConsentStatus.PENDING) {
            output.encodeSerializableElement(serialDesc, 6, EnumsKt.createSimpleEnumSerializer("com.sfbx.appconsent.core.model.ConsentStatus", ConsentStatus.values()), self.legintStatus);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.vendorsNumber != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, IntSerializer.INSTANCE, self.vendorsNumber);
        }
    }

    public final int getId() {
        return this.id;
    }

    public final Integer getIabId() {
        return this.iabId;
    }

    public final I18NString getName() {
        return this.name;
    }

    public final I18NString getDescription() {
        return this.description;
    }

    public /* synthetic */ Stack(int i, Integer num, I18NString i18NString, I18NString i18NString2, List list, ConsentStatus consentStatus, ConsentStatus consentStatus2, Integer num2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : num, i18NString, i18NString2, (i2 & 16) != 0 ? CollectionsKt.emptyList() : list, (i2 & 32) != 0 ? ConsentStatus.PENDING : consentStatus, (i2 & 64) != 0 ? ConsentStatus.PENDING : consentStatus2, (i2 & RendererCapabilities.DECODER_SUPPORT_PRIMARY) != 0 ? null : num2);
    }

    public final List<Integer> getConsentables() {
        return this.consentables;
    }

    public final ConsentStatus getStatus() {
        return this.status;
    }

    public final ConsentStatus getLegintStatus() {
        return this.legintStatus;
    }

    public final Integer getVendorsNumber() {
        return this.vendorsNumber;
    }

    public final String getNameAsString(String appconsentThemeLocal) {
        Intrinsics.checkNotNullParameter(appconsentThemeLocal, "appconsentThemeLocal");
        return ExtensionKt.removeLineSeparatorAtEnd(LocalizedUtils.INSTANCE.getNameByAppConsentThemeLocal$appconsent_core_prodPremiumRelease(appconsentThemeLocal, this.name));
    }
}
