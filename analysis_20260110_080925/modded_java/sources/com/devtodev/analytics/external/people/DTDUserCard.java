package com.devtodev.analytics.external.people;

import com.crashlytics.android.BuildConfig;
import com.devtodev.analytics.internal.core.Core;
import com.devtodev.analytics.internal.domain.events.people.PeopleParameter;
import com.devtodev.analytics.internal.domain.events.people.PeopleParameterBoolean;
import com.devtodev.analytics.internal.domain.events.people.PeopleParameterDouble;
import com.devtodev.analytics.internal.domain.events.people.PeopleParameterLong;
import com.devtodev.analytics.internal.domain.events.people.PeopleParameterString;
import com.devtodev.analytics.internal.modues.people.PeopleReservedKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: DTDUserCard.kt */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002J\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\fJ\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\rJ$\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00040\u000eJ\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\bJ\u0014\u0010\u0012\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0013J\u0016\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\fJ\u0016\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\rJ\u0006\u0010\u0015\u001a\u00020\u0004¨\u0006\u0016"}, d2 = {"Lcom/devtodev/analytics/external/people/DTDUserCard;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "cheater", BuildConfig.FLAVOR, "setCheater", "tester", "setTester", BuildConfig.FLAVOR, "key", "value", "set", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lkotlin/Function1;", "handler", "getValue", "property", "unset", BuildConfig.FLAVOR, "increment", "clearUser", "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class DTDUserCard {
    public static final DTDUserCard INSTANCE = new DTDUserCard();

    /* compiled from: DTDUserCard.kt */
    public static final class a extends Lambda implements Function1<PeopleParameter, Unit> {
        public final /* synthetic */ Function1<Object, Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1<Object, Unit> function1) {
            super(1);
            this.a = function1;
        }

        public final Object invoke(Object obj) {
            PeopleParameterString peopleParameterString = (PeopleParameter) obj;
            if (peopleParameterString instanceof PeopleParameterString) {
                this.a.invoke(peopleParameterString.getValue());
            } else if (peopleParameterString instanceof PeopleParameterLong) {
                this.a.invoke(Long.valueOf(((PeopleParameterLong) peopleParameterString).getValue()));
            } else if (peopleParameterString instanceof PeopleParameterDouble) {
                this.a.invoke(Double.valueOf(((PeopleParameterDouble) peopleParameterString).getValue()));
            } else if (peopleParameterString instanceof PeopleParameterBoolean) {
                this.a.invoke(Boolean.valueOf(((PeopleParameterBoolean) peopleParameterString).getValue()));
            } else {
                this.a.invoke((Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    public final void clearUser() {
        Core.INSTANCE.getPeopleProxy().clearUser("clearUser");
    }

    public final void getValue(String key, Function1<Object, Unit> handler) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Core.INSTANCE.getPeopleProxy().getValue("getValue", key, new a(handler));
    }

    public final void increment(String key, long value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Core.INSTANCE.getPeopleProxy().increment("increment", key, new PeopleParameterLong(value));
    }

    public final void set(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Core.INSTANCE.getPeopleProxy().setValue("set", key, new PeopleParameterString(value));
    }

    public final void setCheater(boolean cheater) {
        Core.INSTANCE.getPeopleProxy().setReservedValue("setCheater", PeopleReservedKeys.Cheater.getValue(), new PeopleParameterBoolean(cheater));
    }

    public final void setTester(boolean tester) {
        Core.INSTANCE.getPeopleProxy().setReservedValue("setTester", PeopleReservedKeys.Tester.getValue(), new PeopleParameterBoolean(tester));
    }

    public final void unset(String property) {
        Intrinsics.checkNotNullParameter(property, "property");
        Core.INSTANCE.getPeopleProxy().unset("unset", CollectionsKt.listOf(property));
    }

    public final void increment(String key, double value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Core.INSTANCE.getPeopleProxy().increment("increment", key, new PeopleParameterDouble(value));
    }

    public final void set(String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Core.INSTANCE.getPeopleProxy().setValue("set", key, new PeopleParameterBoolean(value));
    }

    public final void unset(List<String> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        Core.INSTANCE.getPeopleProxy().unset("unset", property);
    }

    public final void set(String key, long value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Core.INSTANCE.getPeopleProxy().setValue("set", key, new PeopleParameterLong(value));
    }

    public final void set(String key, double value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Core.INSTANCE.getPeopleProxy().setValue("set", key, new PeopleParameterDouble(value));
    }
}
