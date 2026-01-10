package com.sfbx.appconsent.core.model;

import com.crashlytics.android.BuildConfig;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;

/* compiled from: ConsentableType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0087\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/sfbx/appconsent/core/model/ConsentableType;", BuildConfig.FLAVOR, "(Ljava/lang/String;I)V", "PURPOSE", "SPECIAL_PURPOSE", "FEATURE", "SPECIAL_FEATURE", "STACK", "EXTRA_PURPOSE", "EXTRA_SPECIAL_PURPOSE", "EXTRA_FEATURE", "EXTRA_SPECIAL_FEATURE", "UNKNOWN", "Companion", "appconsent-core_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Serializable
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public enum ConsentableType {
    PURPOSE,
    SPECIAL_PURPOSE,
    FEATURE,
    SPECIAL_FEATURE,
    STACK,
    EXTRA_PURPOSE,
    EXTRA_SPECIAL_PURPOSE,
    EXTRA_FEATURE,
    EXTRA_SPECIAL_FEATURE,
    UNKNOWN;


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.sfbx.appconsent.core.model.ConsentableType$Companion$$cachedSerializer$delegate$1
        public final KSerializer<Object> invoke() {
            return EnumsKt.createSimpleEnumSerializer("com.sfbx.appconsent.core.model.ConsentableType", ConsentableType.values());
        }
    });

    /* compiled from: ConsentableType.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/sfbx/appconsent/core/model/ConsentableType$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sfbx/appconsent/core/model/ConsentableType;", "appconsent-core_prodPremiumRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
            return ConsentableType.$cachedSerializer$delegate;
        }

        public final KSerializer<ConsentableType> serializer() {
            return (KSerializer) get$cachedSerializer$delegate().getValue();
        }
    }
}
