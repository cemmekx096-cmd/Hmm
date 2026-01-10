package com.appsflyer.internal;

import android.content.Intent;
import android.os.Parcelable;
import com.appsflyer.AFLogger;
import com.crashlytics.android.BuildConfig;
import java.util.ConcurrentModificationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class AFj1jSDK {
    final Intent getCurrencyIso4217Code;

    public AFj1jSDK(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, BuildConfig.FLAVOR);
        this.getCurrencyIso4217Code = intent;
    }

    public final <T extends Parcelable> T H_(final String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        return (T) getMonetizationNetwork(new Function0<T>() { // from class: com.appsflyer.internal.AFj1jSDK.1
            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            /* renamed from: J_, reason: merged with bridge method [inline-methods] */
            public final Parcelable invoke() {
                return AFj1jSDK.this.getCurrencyIso4217Code.getParcelableExtra(str);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "Error while trying to read " + str + " extra from intent", null, true);
    }

    public final String getRevenue(final String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        return (String) getMonetizationNetwork(new Function0<String>() { // from class: com.appsflyer.internal.AFj1jSDK.2
            /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return AFj1jSDK.this.getCurrencyIso4217Code.getStringExtra(str);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "Error while trying to read " + str + " extra from intent", null, true);
    }

    public final boolean getMonetizationNetwork(final String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Boolean bool = (Boolean) getMonetizationNetwork(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFj1jSDK.5
            /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(AFj1jSDK.this.getCurrencyIso4217Code.hasExtra(str));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "Error while trying to check presence of " + str + " extra from intent", Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final Intent I_(final String str, final long j) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        return (Intent) getMonetizationNetwork(new Function0<Intent>() { // from class: com.appsflyer.internal.AFj1jSDK.3
            /* renamed from: K_, reason: merged with bridge method [inline-methods] */
            public final Intent invoke() {
                return AFj1jSDK.this.getCurrencyIso4217Code.putExtra(str, j);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "Error while trying to write " + str + " extra to intent", null, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object] */
    private final <T> T getMonetizationNetwork(Function0<? extends T> function0, String str, T t, boolean z) {
        T t2;
        ?? r7;
        Object monetizationNetwork;
        synchronized (this.getCurrencyIso4217Code) {
            try {
                Result.Companion companion = Result.Companion;
                AFj1jSDK aFj1jSDK = this;
                t2 = Result.constructor-impl(function0.invoke());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                t2 = Result.constructor-impl(ResultKt.createFailure(th));
            }
            KClass[] kClassArr = {Reflection.getOrCreateKotlinClass(ConcurrentModificationException.class), Reflection.getOrCreateKotlinClass(ArrayIndexOutOfBoundsException.class)};
            Throwable th2 = Result.exceptionOrNull-impl(t2);
            T t3 = t2;
            if (th2 != null) {
                try {
                    Result.Companion companion3 = Result.Companion;
                } catch (Throwable th3) {
                    Result.Companion companion4 = Result.Companion;
                    r7 = Result.constructor-impl(ResultKt.createFailure(th3));
                }
                if (ArraysKt.contains(kClassArr, Reflection.getOrCreateKotlinClass(th2.getClass()))) {
                    if (z) {
                        monetizationNetwork = getMonetizationNetwork(function0, str, t, false);
                    } else {
                        AFLogger.afErrorLog(str, th2, false, false);
                        monetizationNetwork = t;
                    }
                    r7 = Result.constructor-impl(monetizationNetwork);
                    t3 = r7;
                } else {
                    throw th2;
                }
            }
            Throwable th4 = Result.exceptionOrNull-impl(t3);
            if (th4 == null) {
                t = t3;
            } else {
                AFLogger.afErrorLog(str, th4, false, false);
            }
        }
        return t;
    }
}
