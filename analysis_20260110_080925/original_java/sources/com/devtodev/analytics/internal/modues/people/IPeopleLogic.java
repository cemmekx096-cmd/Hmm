package com.devtodev.analytics.internal.modues.people;

import com.crashlytics.android.BuildConfig;
import com.devtodev.analytics.internal.domain.events.people.PeopleParameter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: IPeopleLogic.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J&\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00030\bH&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\tH&J\b\u0010\f\u001a\u00020\u0003H&J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\tH&J\u0016\u0010\u000e\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H&¨\u0006\u0011"}, d2 = {"Lcom/devtodev/analytics/internal/modues/people/IPeopleLogic;", BuildConfig.FLAVOR, "clearUser", BuildConfig.FLAVOR, "getValue", "key", BuildConfig.FLAVOR, "completionHandler", "Lkotlin/Function1;", "Lcom/devtodev/analytics/internal/domain/events/people/PeopleParameter;", "increment", "value", "prepareCallBacks", "setValue", "unset", "properties", BuildConfig.FLAVOR, "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public interface IPeopleLogic {
    void clearUser();

    void getValue(String key, Function1<? super PeopleParameter, Unit> completionHandler);

    void increment(String key, PeopleParameter value);

    void prepareCallBacks();

    void setValue(String key, PeopleParameter value);

    void unset(List<String> properties);
}
