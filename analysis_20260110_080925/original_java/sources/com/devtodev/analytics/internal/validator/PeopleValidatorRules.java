package com.devtodev.analytics.internal.validator;

import com.crashlytics.android.BuildConfig;
import com.devtodev.analytics.internal.domain.events.people.PeopleParameter;
import com.devtodev.analytics.internal.domain.events.people.PeopleParameterBoolean;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.modues.people.PeopleReservedKeys;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PeopleValidatorRules.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\nJ\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ \u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0010¨\u0006\u0013"}, d2 = {"Lcom/devtodev/analytics/internal/validator/PeopleValidatorRules;", BuildConfig.FLAVOR, "()V", "peopleParameterIsBoolean", BuildConfig.FLAVOR, "key", "Lcom/devtodev/analytics/internal/modues/people/PeopleReservedKeys;", "value", "Lcom/devtodev/analytics/internal/domain/events/people/PeopleParameter;", "validateKey", BuildConfig.FLAVOR, "method", "validateReservedValueType", "validateSet", "Lcom/devtodev/analytics/internal/validator/PeopleValidatorRules$ValidPeopleParameter;", "validateUnset", BuildConfig.FLAVOR, "properties", "ValidPeopleParameter", "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class PeopleValidatorRules {
    public static final PeopleValidatorRules INSTANCE = new PeopleValidatorRules();

    /* compiled from: PeopleValidatorRules.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/devtodev/analytics/internal/validator/PeopleValidatorRules$ValidPeopleParameter;", BuildConfig.FLAVOR, "key", BuildConfig.FLAVOR, "peopleParameter", "Lcom/devtodev/analytics/internal/domain/events/people/PeopleParameter;", "(Ljava/lang/String;Lcom/devtodev/analytics/internal/domain/events/people/PeopleParameter;)V", "getKey", "()Ljava/lang/String;", "getPeopleParameter", "()Lcom/devtodev/analytics/internal/domain/events/people/PeopleParameter;", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class ValidPeopleParameter {
        private final String key;
        private final PeopleParameter peopleParameter;

        public ValidPeopleParameter(String str, PeopleParameter peopleParameter) {
            Intrinsics.checkNotNullParameter(str, "key");
            Intrinsics.checkNotNullParameter(peopleParameter, "peopleParameter");
            this.key = str;
            this.peopleParameter = peopleParameter;
        }

        public static /* synthetic */ ValidPeopleParameter copy$default(ValidPeopleParameter validPeopleParameter, String str, PeopleParameter peopleParameter, int i, Object obj) {
            if ((i & 1) != 0) {
                str = validPeopleParameter.key;
            }
            if ((i & 2) != 0) {
                peopleParameter = validPeopleParameter.peopleParameter;
            }
            return validPeopleParameter.copy(str, peopleParameter);
        }

        /* renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* renamed from: component2, reason: from getter */
        public final PeopleParameter getPeopleParameter() {
            return this.peopleParameter;
        }

        public final ValidPeopleParameter copy(String key, PeopleParameter peopleParameter) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(peopleParameter, "peopleParameter");
            return new ValidPeopleParameter(key, peopleParameter);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ValidPeopleParameter)) {
                return false;
            }
            ValidPeopleParameter validPeopleParameter = (ValidPeopleParameter) other;
            return Intrinsics.areEqual(this.key, validPeopleParameter.key) && Intrinsics.areEqual(this.peopleParameter, validPeopleParameter.peopleParameter);
        }

        public final String getKey() {
            return this.key;
        }

        public final PeopleParameter getPeopleParameter() {
            return this.peopleParameter;
        }

        public int hashCode() {
            return this.peopleParameter.hashCode() + (this.key.hashCode() * 31);
        }

        public String toString() {
            return "ValidPeopleParameter(key=" + this.key + ", peopleParameter=" + this.peopleParameter + ")";
        }
    }

    /* compiled from: PeopleValidatorRules.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PeopleReservedKeys.values().length];
            iArr[PeopleReservedKeys.Cheater.ordinal()] = 1;
            iArr[PeopleReservedKeys.Tester.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private PeopleValidatorRules() {
    }

    private final boolean peopleParameterIsBoolean(PeopleReservedKeys key, PeopleParameter value) {
        if (value instanceof PeopleParameterBoolean) {
            return true;
        }
        Logger.error$default(Logger.INSTANCE, "Invalid value! The [" + value + "] value of the reserved key [" + key.getValue() + "] must be Boolean", (Throwable) null, 2, (Object) null);
        return false;
    }

    public final String validateKey(String method, String key) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(key, "key");
        Bounder bounder = Bounder.INSTANCE;
        String strDeleteNonPrintCharacters = bounder.deleteNonPrintCharacters(key);
        String str = "The [" + strDeleteNonPrintCharacters + "] key argument";
        String strMaxStringLength = bounder.maxStringLength(method, str, strDeleteNonPrintCharacters, 64);
        if (Validator.INSTANCE.notNullOrEmpty(method, str, strMaxStringLength)) {
            return strMaxStringLength;
        }
        ValidatorRules.INSTANCE.notifyThatMethodExecutionWasCanceled(method);
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final boolean validateReservedValueType(PeopleReservedKeys key, PeopleParameter value) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        int i = WhenMappings.$EnumSwitchMapping$0[key.ordinal()];
        if (i == 1) {
            return peopleParameterIsBoolean(key, value);
        }
        if (i == 2) {
            return peopleParameterIsBoolean(key, value);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final List<String> validateUnset(String method, List<String> properties) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(properties, "properties");
        ArrayList arrayList = new ArrayList();
        for (String str : properties) {
            Bounder bounder = Bounder.INSTANCE;
            String strDeleteNonPrintCharacters = bounder.deleteNonPrintCharacters(str);
            String str2 = "The [" + strDeleteNonPrintCharacters + "] key of the keys array";
            String strMaxStringLength = bounder.maxStringLength(method, str2, strDeleteNonPrintCharacters, 64);
            if (Validator.INSTANCE.notNullOrEmpty(method, str2, strMaxStringLength)) {
                Intrinsics.checkNotNull(strMaxStringLength);
                arrayList.add(strMaxStringLength);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.devtodev.analytics.internal.validator.PeopleValidatorRules.ValidPeopleParameter validateSet(java.lang.String r18, java.lang.String r19, com.devtodev.analytics.internal.domain.events.people.PeopleParameter r20) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.devtodev.analytics.internal.validator.PeopleValidatorRules.validateSet(java.lang.String, java.lang.String, com.devtodev.analytics.internal.domain.events.people.PeopleParameter):com.devtodev.analytics.internal.validator.PeopleValidatorRules$ValidPeopleParameter");
    }
}
