package com.ironsource;

import android.content.Context;
import com.crashlytics.android.BuildConfig;
import com.google.firebase.messaging.Constants;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.InitListener;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/ironsource/w0;", "Lcom/ironsource/v0;", "Landroid/content/Context;", "context", "Lcom/ironsource/pi;", "initConfig", "Lcom/unity3d/ironsourceads/InitListener;", "initListener", BuildConfig.FLAVOR, "a", "Lcom/ironsource/un;", "Lcom/ironsource/un;", "networkInitApi", "<init>", "(Lcom/ironsource/un;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class w0 implements v0 {

    /* renamed from: a, reason: from kotlin metadata */
    private final un networkInitApi;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"com/ironsource/w0$a", "Lcom/ironsource/ro;", BuildConfig.FLAVOR, "onSuccess", "Lcom/ironsource/jh;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onFail", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements ro {
        final /* synthetic */ pi a;
        final /* synthetic */ InitListener b;

        a(pi piVar, InitListener initListener) {
            this.a = piVar;
            this.b = initListener;
        }

        public void onFail(jh error) {
            Intrinsics.checkNotNullParameter(error, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            IronLog.ADAPTER_API.verbose("initSDKWithNetworkConfigurations error: " + error);
            this.b.onInitFailed(tb.a.a(new IronSourceError(error.a(), error.b())));
        }

        public void onSuccess() {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("initSDKWithNetworkConfigurations success");
            StringBuilder sbAppend = new StringBuilder().append("controllerURL = ");
            u0 u0VarE = this.a.e();
            ironLog.verbose(sbAppend.append(u0VarE != null ? u0VarE.c() : null).toString());
            StringBuilder sbAppend2 = new StringBuilder().append("controllerConfig = ");
            u0 u0VarE2 = this.a.e();
            ironLog.verbose(sbAppend2.append(u0VarE2 != null ? u0VarE2.a() : null).toString());
            StringBuilder sbAppend3 = new StringBuilder().append("debugMode = ");
            u0 u0VarE3 = this.a.e();
            ironLog.verbose(sbAppend3.append(u0VarE3 != null ? Integer.valueOf(u0VarE3.b()) : null).toString());
            ironLog.verbose("applicationKey = " + this.a.d());
            ironLog.verbose("userId = " + this.a.h());
            this.b.onInitSuccess();
        }
    }

    public w0(un unVar) {
        Intrinsics.checkNotNullParameter(unVar, "networkInitApi");
        this.networkInitApi = unVar;
    }

    public void a(Context context, pi initConfig, InitListener initListener) {
        JSONObject jSONObjectA;
        String strC;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initConfig, "initConfig");
        Intrinsics.checkNotNullParameter(initListener, "initListener");
        un unVar = this.networkInitApi;
        u0 u0VarE = initConfig.e();
        unVar.a(u0VarE != null ? u0VarE.b() : 0);
        u0 u0VarE2 = initConfig.e();
        if (u0VarE2 != null && (strC = u0VarE2.c()) != null) {
            this.networkInitApi.b(strC);
        }
        u0 u0VarE3 = initConfig.e();
        if (u0VarE3 != null && (jSONObjectA = u0VarE3.a()) != null) {
            un unVar2 = this.networkInitApi;
            String string = jSONObjectA.toString();
            Intrinsics.checkNotNullExpressionValue(string, "applicationConfig.toString()");
            unVar2.a(string);
        }
        Map mapA = new sn().a();
        this.networkInitApi.a(new a(initConfig, initListener));
        this.networkInitApi.a(context, initConfig.d(), initConfig.h(), mapA);
    }
}
