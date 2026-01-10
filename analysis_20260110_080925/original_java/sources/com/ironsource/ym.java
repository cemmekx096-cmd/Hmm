package com.ironsource;

import android.app.Activity;
import com.crashlytics.android.BuildConfig;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.sdk.controller.e;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.l;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.vh;
import com.ironsource.ym$;
import com.ironsource.zm;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B+\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\b\b\u0002\u0010\"\u001a\u00020 \u0012\b\b\u0002\u0010%\u001a\u00020#¢\u0006\u0004\b/\u00100J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\fH\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010$R\u001c\u0010(\u001a\n &*\u0004\u0018\u00010\u001a0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001bR$\u0010.\u001a\u0004\u0018\u00010)8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b\u0007\u0010,\"\u0004\b\u0007\u0010-¨\u00061"}, d2 = {"Lcom/ironsource/ym;", "Lcom/ironsource/zm;", "Landroid/app/Activity;", "activity", "Lcom/ironsource/sdk/controller/f$a;", qs.n, BuildConfig.FLAVOR, "a", "Lcom/ironsource/vh$b;", "report", "Lcom/ironsource/vh;", "adData", "Lorg/json/JSONObject;", "d", "b", "Lcom/ironsource/sdk/controller/l$b;", "c", "Lcom/ironsource/sm;", "msg", "loadParams", "destroy", "Lcom/ironsource/yh;", "viewHolder", "Lcom/ironsource/yv;", "viewVisibilityParams", "clickParams", BuildConfig.FLAVOR, "Ljava/lang/String;", "id", "Lcom/ironsource/sdk/controller/e;", "Lcom/ironsource/sdk/controller/e;", "controllerManager", "Lcom/ironsource/mi;", "Lcom/ironsource/mi;", "imageLoader", "Lcom/ironsource/z2;", "Lcom/ironsource/z2;", "adViewManagement", "kotlin.jvm.PlatformType", "e", "logTag", "Lcom/ironsource/zm$a;", "f", "Lcom/ironsource/zm$a;", "()Lcom/ironsource/zm$a;", "(Lcom/ironsource/zm$a;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Ljava/lang/String;Lcom/ironsource/sdk/controller/e;Lcom/ironsource/mi;Lcom/ironsource/z2;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class ym implements zm {

    /* renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* renamed from: b, reason: from kotlin metadata */
    private final e controllerManager;

    /* renamed from: c, reason: from kotlin metadata */
    private final mi imageLoader;

    /* renamed from: d, reason: from kotlin metadata */
    private final z2 adViewManagement;

    /* renamed from: e, reason: from kotlin metadata */
    private final String logTag;

    /* renamed from: f, reason: from kotlin metadata */
    private zm.a listener;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004¨\u0006\u0014"}, d2 = {"Lcom/ironsource/ym$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "b", "Ljava/lang/String;", "LOAD", "c", "LOAD_REPORT", "d", "REGISTER", "e", "CLICK", "f", "PRIVACY_CLICK", "g", "VISIBILITY_CHANGED", "h", "DESTROY", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {
        public static final a a = new a();

        /* renamed from: b, reason: from kotlin metadata */
        public static final String LOAD = "nativeAd.load";

        /* renamed from: c, reason: from kotlin metadata */
        public static final String LOAD_REPORT = "nativeAd.loadReport";

        /* renamed from: d, reason: from kotlin metadata */
        public static final String REGISTER = "nativeAd.register";

        /* renamed from: e, reason: from kotlin metadata */
        public static final String CLICK = "nativeAd.click";

        /* renamed from: f, reason: from kotlin metadata */
        public static final String PRIVACY_CLICK = "nativeAd.privacyClick";

        /* renamed from: g, reason: from kotlin metadata */
        public static final String VISIBILITY_CHANGED = "nativeAd.visibilityChanged";

        /* renamed from: h, reason: from kotlin metadata */
        public static final String DESTROY = "nativeAd.destroy";

        private a() {
        }
    }

    public ym(String str, e eVar, mi miVar, z2 z2Var) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(eVar, "controllerManager");
        Intrinsics.checkNotNullParameter(miVar, "imageLoader");
        Intrinsics.checkNotNullParameter(z2Var, "adViewManagement");
        this.id = str;
        this.controllerManager = eVar;
        this.imageLoader = miVar;
        this.adViewManagement = z2Var;
        this.logTag = "ym";
        eVar.a(str, c());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ym(String str, e eVar, mi miVar, z2 z2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        miVar = (i & 4) != 0 ? new li((t8) null, 1, (DefaultConstructorMarker) null) : miVar;
        if ((i & 8) != 0) {
            z2Var = fh.a();
            Intrinsics.checkNotNullExpressionValue(z2Var, "getInstance()");
        }
        this(str, eVar, miVar, z2Var);
    }

    private final void a(Activity activity, f.a response) {
        if (response.d() == null) {
            zm.a listener = getListener();
            if (listener != null) {
                listener.a("failed to load native ad: missing params");
                return;
            }
            return;
        }
        if (response.d().optBoolean("success", false)) {
            vh.b bVarA = new vh.a(this.imageLoader, this.adViewManagement).a(activity, response.d());
            a(bVarA, bVarA.a().h());
            return;
        }
        String strOptString = response.d().optString(AdOperationMetric.REASON, "failed to load native ad: unexpected error");
        zm.a listener2 = getListener();
        if (listener2 != null) {
            Intrinsics.checkNotNullExpressionValue(strOptString, AdOperationMetric.REASON);
            listener2.a(strOptString);
        }
    }

    private final void a(f.a response) {
        if (response.d() == null) {
            Logger.i(this.logTag, "failed to handle click on native ad: missing params");
            return;
        }
        if (!response.d().optBoolean("success", false)) {
            Logger.i(this.logTag, "failed to handle click on native ad: " + response.d().optString(AdOperationMetric.REASON, "unexpected error"));
        } else {
            zm.a listener = getListener();
            if (listener != null) {
                listener.c();
            }
        }
    }

    private final void a(sm msg) {
        if (msg.f() == null) {
            Logger.i(this.logTag, "failed to handle click on native ad: missing params");
            return;
        }
        if (!msg.f().optBoolean("success", false)) {
            Logger.i(this.logTag, "failed to handle click on native ad: " + msg.f().optString(AdOperationMetric.REASON, "unexpected error"));
        } else {
            zm.a listener = getListener();
            if (listener != null) {
                listener.c();
            }
        }
    }

    private final void a(vh.b report, vh adData) {
        this.controllerManager.a(new f.c(this.id, "nativeAd.loadReport." + this.id, report.b()), new ym$.ExternalSyntheticLambda1(this, adData));
    }

    private final void a(vh adData, f.a response) {
        if (response.d() == null) {
            zm.a listener = getListener();
            if (listener != null) {
                listener.a("failed to load native ad: missing report params");
                return;
            }
            return;
        }
        if (response.d().optBoolean("success", false)) {
            zm.a listener2 = getListener();
            if (listener2 != null) {
                listener2.a(adData);
                return;
            }
            return;
        }
        String strOptString = response.d().optString(AdOperationMetric.REASON, "failed to load native ad: unexpected error");
        zm.a listener3 = getListener();
        if (listener3 != null) {
            Intrinsics.checkNotNullExpressionValue(strOptString, AdOperationMetric.REASON);
            listener3.a(strOptString);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ym ymVar, Activity activity, f.a aVar) {
        Intrinsics.checkNotNullParameter(ymVar, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(aVar, "it");
        ymVar.a(activity, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ym ymVar, f.a aVar) {
        Intrinsics.checkNotNullParameter(ymVar, "this$0");
        Intrinsics.checkNotNullParameter(aVar, "it");
        ymVar.a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ym ymVar, sm smVar) {
        Intrinsics.checkNotNullParameter(ymVar, "this$0");
        Intrinsics.checkNotNullParameter(smVar, "msg");
        if (Intrinsics.areEqual(smVar.e(), a.CLICK)) {
            ymVar.a(smVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ym ymVar, vh vhVar, f.a aVar) {
        Intrinsics.checkNotNullParameter(ymVar, "this$0");
        Intrinsics.checkNotNullParameter(vhVar, "$adData");
        Intrinsics.checkNotNullParameter(aVar, "it");
        ymVar.a(vhVar, aVar);
    }

    private final void b(f.a response) {
        if (response.d() == null) {
            Logger.i(this.logTag, "failed to handle show on native ad: missing params");
            return;
        }
        if (!response.d().optBoolean("success", false)) {
            Logger.i(this.logTag, "failed to handle show on native ad: " + response.d().optString(AdOperationMetric.REASON, "unexpected error"));
        } else {
            zm.a listener = getListener();
            if (listener != null) {
                listener.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ym ymVar, f.a aVar) {
        Intrinsics.checkNotNullParameter(ymVar, "this$0");
        Intrinsics.checkNotNullParameter(aVar, "it");
        ymVar.b(aVar);
    }

    private final l.b c() {
        return new ym$.ExternalSyntheticLambda4(this);
    }

    private final JSONObject d() throws JSONException {
        JSONObject jSONObjectPut = IronSourceNetworkBridge.jsonObjectInit().put("command", a.CLICK).put("sdkCallback", "onReceivedMessage");
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "JSONObject()\n        .pu…hods.ON_RECEIVED_MESSAGE)");
        return jSONObjectPut;
    }

    @Override // com.ironsource.zm
    /* renamed from: a, reason: from getter */
    public zm.a getListener() {
        return this.listener;
    }

    @Override // com.ironsource.zm
    public void a(Activity activity, JSONObject loadParams) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        this.controllerManager.a(activity);
        this.controllerManager.a(new f.c(this.id, a.LOAD, loadParams), new ym$.ExternalSyntheticLambda3(this, activity));
    }

    @Override // com.ironsource.zm
    public void a(yh viewHolder) throws JSONException {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        JSONObject jSONObjectPut = IronSourceNetworkBridge.jsonObjectInit().put("assetViews", viewHolder.t()).put("adViewClickCommand", d());
        String str = this.id;
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "params");
        this.controllerManager.a(new f.c(str, a.REGISTER, jSONObjectPut), (l.a) null);
    }

    @Override // com.ironsource.zm
    public void a(yv viewVisibilityParams) {
        Intrinsics.checkNotNullParameter(viewVisibilityParams, "viewVisibilityParams");
        this.controllerManager.a(new f.c(this.id, a.VISIBILITY_CHANGED, viewVisibilityParams.g()), new ym$.ExternalSyntheticLambda0(this));
    }

    @Override // com.ironsource.zm
    public void a(zm.a aVar) {
        this.listener = aVar;
    }

    @Override // com.ironsource.zm
    public void a(JSONObject clickParams) {
        Intrinsics.checkNotNullParameter(clickParams, "clickParams");
        this.controllerManager.a(new f.c(this.id, a.CLICK, clickParams), new ym$.ExternalSyntheticLambda2(this));
    }

    @Override // com.ironsource.zm
    public void b() {
        this.controllerManager.a(new f.c(this.id, a.PRIVACY_CLICK, IronSourceNetworkBridge.jsonObjectInit()), (l.a) null);
    }

    @Override // com.ironsource.zm
    public void destroy() {
        this.controllerManager.a(new f.c(this.id, a.DESTROY, IronSourceNetworkBridge.jsonObjectInit()), (l.a) null);
    }
}
