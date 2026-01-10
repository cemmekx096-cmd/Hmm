package com.sfbx.appconsent.core.model;

import androidx.media3.exoplayer.RendererCapabilities;
import com.crashlytics.android.BuildConfig;
import com.sfbx.appconsent.core.model.Consentable$;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: Stack.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002<=B\u0085\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013Bo\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0014J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0015\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0015\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\t\u0010+\u001a\u00020\u000eHÆ\u0003J\t\u0010,\u001a\u00020\u000eHÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0080\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0003HÖ\u0001J\t\u00104\u001a\u00020\bHÖ\u0001J!\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;HÇ\u0001R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000f\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b%\u0010\u001a¨\u0006>"}, d2 = {"Lcom/sfbx/appconsent/core/model/Stack;", BuildConfig.FLAVOR, "seen1", BuildConfig.FLAVOR, "id", "iabId", "name", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "description", "consentables", BuildConfig.FLAVOR, "Lcom/sfbx/appconsent/core/model/Consentable;", SettingsJsonConstants.APP_STATUS_KEY, "Lcom/sfbx/appconsent/core/model/ConsentStatus;", "legIntStatus", "vendorsNumber", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/Integer;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Lcom/sfbx/appconsent/core/model/ConsentStatus;Lcom/sfbx/appconsent/core/model/ConsentStatus;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILjava/lang/Integer;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Lcom/sfbx/appconsent/core/model/ConsentStatus;Lcom/sfbx/appconsent/core/model/ConsentStatus;Ljava/lang/Integer;)V", "getConsentables", "()Ljava/util/List;", "getDescription", "()Ljava/util/Map;", "getIabId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId", "()I", "getLegIntStatus", "()Lcom/sfbx/appconsent/core/model/ConsentStatus;", "setLegIntStatus", "(Lcom/sfbx/appconsent/core/model/ConsentStatus;)V", "getName", "getStatus", "setStatus", "getVendorsNumber", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ILjava/lang/Integer;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Lcom/sfbx/appconsent/core/model/ConsentStatus;Lcom/sfbx/appconsent/core/model/ConsentStatus;Ljava/lang/Integer;)Lcom/sfbx/appconsent/core/model/Stack;", "equals", BuildConfig.FLAVOR, "other", "hashCode", "toString", "write$Self", BuildConfig.FLAVOR, "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "appconsent-core_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Serializable
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final /* data */ class Stack {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<Consentable> consentables;
    private final Map<String, String> description;
    private final Integer iabId;
    private final int id;
    private ConsentStatus legIntStatus;
    private final Map<String, String> name;
    private ConsentStatus status;
    private final Integer vendorsNumber;

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getIabId() {
        return this.iabId;
    }

    public final Map<String, String> component3() {
        return this.name;
    }

    public final Map<String, String> component4() {
        return this.description;
    }

    public final List<Consentable> component5() {
        return this.consentables;
    }

    /* renamed from: component6, reason: from getter */
    public final ConsentStatus getStatus() {
        return this.status;
    }

    /* renamed from: component7, reason: from getter */
    public final ConsentStatus getLegIntStatus() {
        return this.legIntStatus;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getVendorsNumber() {
        return this.vendorsNumber;
    }

    public final Stack copy(int id, Integer iabId, Map<String, String> name, Map<String, String> description, List<Consentable> consentables, ConsentStatus status, ConsentStatus legIntStatus, Integer vendorsNumber) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(consentables, "consentables");
        Intrinsics.checkNotNullParameter(status, SettingsJsonConstants.APP_STATUS_KEY);
        Intrinsics.checkNotNullParameter(legIntStatus, "legIntStatus");
        return new Stack(id, iabId, name, description, consentables, status, legIntStatus, vendorsNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Stack)) {
            return false;
        }
        Stack stack = (Stack) other;
        return this.id == stack.id && Intrinsics.areEqual(this.iabId, stack.iabId) && Intrinsics.areEqual(this.name, stack.name) && Intrinsics.areEqual(this.description, stack.description) && Intrinsics.areEqual(this.consentables, stack.consentables) && this.status == stack.status && this.legIntStatus == stack.legIntStatus && Intrinsics.areEqual(this.vendorsNumber, stack.vendorsNumber);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        Integer num = this.iabId;
        int iHashCode2 = (((((((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + this.consentables.hashCode()) * 31) + this.status.hashCode()) * 31) + this.legIntStatus.hashCode()) * 31;
        Integer num2 = this.vendorsNumber;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "Stack(id=" + this.id + ", iabId=" + this.iabId + ", name=" + this.name + ", description=" + this.description + ", consentables=" + this.consentables + ", status=" + this.status + ", legIntStatus=" + this.legIntStatus + ", vendorsNumber=" + this.vendorsNumber + ')';
    }

    /* compiled from: Stack.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/sfbx/appconsent/core/model/Stack$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sfbx/appconsent/core/model/Stack;", "appconsent-core_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
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
    public /* synthetic */ Stack(int i, int i2, Integer num, Map map, Map map2, List list, ConsentStatus consentStatus, ConsentStatus consentStatus2, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, Stack$$serializer.INSTANCE.getDescriptor());
        }
        this.id = i2;
        this.iabId = num;
        this.name = map;
        this.description = map2;
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
            this.legIntStatus = ConsentStatus.UNDEFINED;
        } else {
            this.legIntStatus = consentStatus2;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_PRIMARY) == 0) {
            this.vendorsNumber = null;
        } else {
            this.vendorsNumber = num2;
        }
    }

    public Stack(int i, Integer num, Map<String, String> map, Map<String, String> map2, List<Consentable> list, ConsentStatus consentStatus, ConsentStatus consentStatus2, Integer num2) {
        Intrinsics.checkNotNullParameter(map, "name");
        Intrinsics.checkNotNullParameter(map2, "description");
        Intrinsics.checkNotNullParameter(list, "consentables");
        Intrinsics.checkNotNullParameter(consentStatus, SettingsJsonConstants.APP_STATUS_KEY);
        Intrinsics.checkNotNullParameter(consentStatus2, "legIntStatus");
        this.id = i;
        this.iabId = num;
        this.name = map;
        this.description = map2;
        this.consentables = list;
        this.status = consentStatus;
        this.legIntStatus = consentStatus2;
        this.vendorsNumber = num2;
    }

    @JvmStatic
    public static final void write$Self(Stack self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeIntElement(serialDesc, 0, self.id);
        output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.iabId);
        output.encodeSerializableElement(serialDesc, 2, new LinkedHashMapSerializer(StringSerializer.INSTANCE, StringSerializer.INSTANCE), self.name);
        output.encodeSerializableElement(serialDesc, 3, new LinkedHashMapSerializer(StringSerializer.INSTANCE, StringSerializer.INSTANCE), self.description);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !Intrinsics.areEqual(self.consentables, CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 4, new ArrayListSerializer(Consentable$.serializer.INSTANCE), self.consentables);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.status != ConsentStatus.PENDING) {
            output.encodeSerializableElement(serialDesc, 5, EnumsKt.createSimpleEnumSerializer("com.sfbx.appconsent.core.model.ConsentStatus", ConsentStatus.values()), self.status);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.legIntStatus != ConsentStatus.UNDEFINED) {
            output.encodeSerializableElement(serialDesc, 6, EnumsKt.createSimpleEnumSerializer("com.sfbx.appconsent.core.model.ConsentStatus", ConsentStatus.values()), self.legIntStatus);
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

    public final Map<String, String> getName() {
        return this.name;
    }

    public final Map<String, String> getDescription() {
        return this.description;
    }

    public /* synthetic */ Stack(int i, Integer num, Map map, Map map2, List list, ConsentStatus consentStatus, ConsentStatus consentStatus2, Integer num2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, num, map, map2, (i2 & 16) != 0 ? CollectionsKt.emptyList() : list, (i2 & 32) != 0 ? ConsentStatus.PENDING : consentStatus, (i2 & 64) != 0 ? ConsentStatus.UNDEFINED : consentStatus2, (i2 & RendererCapabilities.DECODER_SUPPORT_PRIMARY) != 0 ? null : num2);
    }

    public final List<Consentable> getConsentables() {
        return this.consentables;
    }

    public final ConsentStatus getStatus() {
        return this.status;
    }

    public final void setStatus(ConsentStatus consentStatus) {
        Intrinsics.checkNotNullParameter(consentStatus, "<set-?>");
        this.status = consentStatus;
    }

    public final ConsentStatus getLegIntStatus() {
        return this.legIntStatus;
    }

    public final void setLegIntStatus(ConsentStatus consentStatus) {
        Intrinsics.checkNotNullParameter(consentStatus, "<set-?>");
        this.legIntStatus = consentStatus;
    }

    public final Integer getVendorsNumber() {
        return this.vendorsNumber;
    }
}
