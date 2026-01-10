package io.ktor.utils.io.core.internal;

import com.crashlytics.android.BuildConfig;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Numbers.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001a\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0081\b¨\u0006\b"}, d2 = {"failLongToIntConversion", BuildConfig.FLAVOR, "value", BuildConfig.FLAVOR, "name", BuildConfig.FLAVOR, "toIntOrFail", BuildConfig.FLAVOR, "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class NumbersKt {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final int toIntOrFail(long j, String str) throws KotlinNothingValueException {
        Intrinsics.checkNotNullParameter(str, "name");
        if (j < 2147483647L) {
            return (int) j;
        }
        failLongToIntConversion(j, str);
        throw new KotlinNothingValueException();
    }

    public static final Void failLongToIntConversion(long j, String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        throw new IllegalArgumentException("Long value " + j + " of " + str + " doesn't fit into 32-bit integer");
    }
}
