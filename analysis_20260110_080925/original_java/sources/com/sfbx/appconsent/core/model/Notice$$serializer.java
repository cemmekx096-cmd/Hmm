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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: Notice.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/sfbx/appconsent/core/model/Notice.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/sfbx/appconsent/core/model/Notice;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", BuildConfig.FLAVOR, "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", BuildConfig.FLAVOR, "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "appconsent-core_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = BuildConfig.FLAVOR, imports = {}))
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class Notice$$serializer implements GeneratedSerializer<Notice> {
    public static final Notice$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Notice$$serializer notice$$serializer = new Notice$$serializer();
        INSTANCE = notice$$serializer;
        SerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sfbx.appconsent.core.model.Notice", notice$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("consentables", true);
        pluginGeneratedSerialDescriptor.addElement("stacks", true);
        pluginGeneratedSerialDescriptor.addElement("vendors", true);
        pluginGeneratedSerialDescriptor.addElement("dataCategories", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Notice$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{(KSerializer) new ArrayListSerializer(Consentable$.serializer.INSTANCE), (KSerializer) new ArrayListSerializer(Stack$$serializer.INSTANCE), (KSerializer) new ArrayListSerializer(Vendor$.serializer.INSTANCE), (KSerializer) new ArrayListSerializer(DataCategoryCore$.serializer.INSTANCE)};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public Notice m996deserialize(Decoder decoder) throws UnknownFieldException {
        Object objDecodeSerializableElement;
        Object objDecodeSerializableElement2;
        int i;
        Object objDecodeSerializableElement3;
        Object objDecodeSerializableElement4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 0, new ArrayListSerializer(Consentable$.serializer.INSTANCE), (Object) null);
            Object objDecodeSerializableElement5 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 1, new ArrayListSerializer(Stack$$serializer.INSTANCE), (Object) null);
            objDecodeSerializableElement3 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 2, new ArrayListSerializer(Vendor$.serializer.INSTANCE), (Object) null);
            objDecodeSerializableElement4 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 3, new ArrayListSerializer(DataCategoryCore$.serializer.INSTANCE), (Object) null);
            objDecodeSerializableElement2 = objDecodeSerializableElement5;
            i = 15;
        } else {
            objDecodeSerializableElement = null;
            objDecodeSerializableElement2 = null;
            Object objDecodeSerializableElement6 = null;
            Object objDecodeSerializableElement7 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 0, new ArrayListSerializer(Consentable$.serializer.INSTANCE), objDecodeSerializableElement);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 1, new ArrayListSerializer(Stack$$serializer.INSTANCE), objDecodeSerializableElement2);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    objDecodeSerializableElement6 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 2, new ArrayListSerializer(Vendor$.serializer.INSTANCE), objDecodeSerializableElement6);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    objDecodeSerializableElement7 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor2, 3, new ArrayListSerializer(DataCategoryCore$.serializer.INSTANCE), objDecodeSerializableElement7);
                    i2 |= 8;
                }
            }
            i = i2;
            objDecodeSerializableElement3 = objDecodeSerializableElement6;
            objDecodeSerializableElement4 = objDecodeSerializableElement7;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new Notice(i, (List) objDecodeSerializableElement, (List) objDecodeSerializableElement2, (List) objDecodeSerializableElement3, (List) objDecodeSerializableElement4, (SerializationConstructorMarker) null);
    }

    public void serialize(Encoder encoder, Notice value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        Notice.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
