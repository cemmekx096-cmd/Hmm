package com.ironsource;

import com.crashlytics.android.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/ironsource/ue;", BuildConfig.FLAVOR, "Lcom/ironsource/we;", "b", BuildConfig.FLAVOR, "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public interface ue {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/ironsource/ue$a;", "Lcom/ironsource/ue;", "Lcom/ironsource/we;", "b", BuildConfig.FLAVOR, "a", "Lcom/ironsource/we;", "c", "()Lcom/ironsource/we;", "strategy", "<init>", "(Lcom/ironsource/we;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements ue {

        /* renamed from: a, reason: from kotlin metadata */
        private final we strategy;

        public a(we weVar) {
            Intrinsics.checkNotNullParameter(weVar, "strategy");
            this.strategy = weVar;
        }

        @Override // com.ironsource.ue
        public String a() {
            return "WebView is unavailable";
        }

        @Override // com.ironsource.ue
        /* renamed from: b, reason: from getter */
        public we getStrategy() {
            return this.strategy;
        }

        public final we c() {
            return this.strategy;
        }
    }

    String a();

    /* renamed from: b */
    we getStrategy();
}
