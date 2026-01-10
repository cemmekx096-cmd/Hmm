package com.sfbx.appconsent.core.model;

import com.crashlytics.android.BuildConfig;
import com.sfbx.appconsent.core.model.Consentable$;
import com.sfbx.appconsent.core.model.DataCategoryCore$;
import com.sfbx.appconsent.core.model.Vendor$;
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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: Notice.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002()BY\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fBE\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\u0002\u0010\u0010J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u0005HÆ\u0003JI\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J!\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'HÇ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006*"}, d2 = {"Lcom/sfbx/appconsent/core/model/Notice;", BuildConfig.FLAVOR, "seen1", BuildConfig.FLAVOR, "consentables", BuildConfig.FLAVOR, "Lcom/sfbx/appconsent/core/model/Consentable;", "stacks", "Lcom/sfbx/appconsent/core/model/Stack;", "vendors", "Lcom/sfbx/appconsent/core/model/Vendor;", "dataCategories", "Lcom/sfbx/appconsent/core/model/DataCategoryCore;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getConsentables", "()Ljava/util/List;", "getDataCategories", "getStacks", "getVendors", "component1", "component2", "component3", "component4", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", "toString", BuildConfig.FLAVOR, "write$Self", BuildConfig.FLAVOR, "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "appconsent-core_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Serializable
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final /* data */ class Notice {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<Consentable> consentables;
    private final List<DataCategoryCore> dataCategories;
    private final List<Stack> stacks;
    private final List<Vendor> vendors;

    public Notice() {
        this((List) null, (List) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Notice copy$default(Notice notice, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = notice.consentables;
        }
        if ((i & 2) != 0) {
            list2 = notice.stacks;
        }
        if ((i & 4) != 0) {
            list3 = notice.vendors;
        }
        if ((i & 8) != 0) {
            list4 = notice.dataCategories;
        }
        return notice.copy(list, list2, list3, list4);
    }

    public final List<Consentable> component1() {
        return this.consentables;
    }

    public final List<Stack> component2() {
        return this.stacks;
    }

    public final List<Vendor> component3() {
        return this.vendors;
    }

    public final List<DataCategoryCore> component4() {
        return this.dataCategories;
    }

    public final Notice copy(List<Consentable> consentables, List<Stack> stacks, List<Vendor> vendors, List<DataCategoryCore> dataCategories) {
        Intrinsics.checkNotNullParameter(consentables, "consentables");
        Intrinsics.checkNotNullParameter(stacks, "stacks");
        Intrinsics.checkNotNullParameter(vendors, "vendors");
        Intrinsics.checkNotNullParameter(dataCategories, "dataCategories");
        return new Notice(consentables, stacks, vendors, dataCategories);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Notice)) {
            return false;
        }
        Notice notice = (Notice) other;
        return Intrinsics.areEqual(this.consentables, notice.consentables) && Intrinsics.areEqual(this.stacks, notice.stacks) && Intrinsics.areEqual(this.vendors, notice.vendors) && Intrinsics.areEqual(this.dataCategories, notice.dataCategories);
    }

    public int hashCode() {
        return (((((this.consentables.hashCode() * 31) + this.stacks.hashCode()) * 31) + this.vendors.hashCode()) * 31) + this.dataCategories.hashCode();
    }

    public String toString() {
        return "Notice(consentables=" + this.consentables + ", stacks=" + this.stacks + ", vendors=" + this.vendors + ", dataCategories=" + this.dataCategories + ')';
    }

    /* compiled from: Notice.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/sfbx/appconsent/core/model/Notice$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sfbx/appconsent/core/model/Notice;", "appconsent-core_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<Notice> serializer() {
            return Notice$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = BuildConfig.FLAVOR, imports = {}))
    public /* synthetic */ Notice(int i, List list, List list2, List list3, List list4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i, 0, Notice$$serializer.INSTANCE.getDescriptor());
        }
        this.consentables = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
        if ((i & 2) == 0) {
            this.stacks = CollectionsKt.emptyList();
        } else {
            this.stacks = list2;
        }
        if ((i & 4) == 0) {
            this.vendors = CollectionsKt.emptyList();
        } else {
            this.vendors = list3;
        }
        if ((i & 8) == 0) {
            this.dataCategories = CollectionsKt.emptyList();
        } else {
            this.dataCategories = list4;
        }
    }

    public Notice(List<Consentable> list, List<Stack> list2, List<Vendor> list3, List<DataCategoryCore> list4) {
        Intrinsics.checkNotNullParameter(list, "consentables");
        Intrinsics.checkNotNullParameter(list2, "stacks");
        Intrinsics.checkNotNullParameter(list3, "vendors");
        Intrinsics.checkNotNullParameter(list4, "dataCategories");
        this.consentables = list;
        this.stacks = list2;
        this.vendors = list3;
        this.dataCategories = list4;
    }

    @JvmStatic
    public static final void write$Self(Notice self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.consentables, CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 0, new ArrayListSerializer(Consentable$.serializer.INSTANCE), self.consentables);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual(self.stacks, CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 1, new ArrayListSerializer(Stack$$serializer.INSTANCE), self.stacks);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.areEqual(self.vendors, CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 2, new ArrayListSerializer(Vendor$.serializer.INSTANCE), self.vendors);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.areEqual(self.dataCategories, CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 3, new ArrayListSerializer(DataCategoryCore$.serializer.INSTANCE), self.dataCategories);
        }
    }

    public /* synthetic */ Notice(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? CollectionsKt.emptyList() : list3, (i & 8) != 0 ? CollectionsKt.emptyList() : list4);
    }

    public final List<Consentable> getConsentables() {
        return this.consentables;
    }

    public final List<Stack> getStacks() {
        return this.stacks;
    }

    public final List<Vendor> getVendors() {
        return this.vendors;
    }

    public final List<DataCategoryCore> getDataCategories() {
        return this.dataCategories;
    }
}
