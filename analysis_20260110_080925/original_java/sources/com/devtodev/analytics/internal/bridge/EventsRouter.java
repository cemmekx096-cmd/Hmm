package com.devtodev.analytics.internal.bridge;

import com.crashlytics.android.BuildConfig;
import com.devtodev.analytics.external.DTDLogLevel;
import com.devtodev.analytics.internal.core.Core;
import com.devtodev.analytics.internal.logger.Logger;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventsRouter.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010 \n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J)\u0010\u0011\u001a\u00020\u00042!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00040\u0013J \u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ \u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\r2\b\u0010!\u001a\u0004\u0018\u00010\u0006J\u0016\u0010\"\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\rJ\u0016\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0010J\u0014\u0010&\u001a\u00020\u00042\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060(¨\u0006)"}, d2 = {"Lcom/devtodev/analytics/internal/bridge/EventsRouter;", BuildConfig.FLAVOR, "()V", "autoPayment", BuildConfig.FLAVOR, "orderId", BuildConfig.FLAVOR, "price", BuildConfig.FLAVOR, "productId", "purchaseToken", "currencyCode", "paymentType", BuildConfig.FLAVOR, "doNotRestoreUser", "isInit", BuildConfig.FLAVOR, "isNeedRestoreHistory", "callBack", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "flag", "sendLog", "logLevel", "Lcom/devtodev/analytics/external/DTDLogLevel;", "text", "throwable", BuildConfig.FLAVOR, "sendPushOpened", "timestamp", BuildConfig.FLAVOR, "pushId", "button", "sendPushReceived", "sendPushToken", "token", "isAllowed", "subscriptionHistory", "purchaseList", BuildConfig.FLAVOR, "DTDAnalytics_unityRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class EventsRouter {
    public static final EventsRouter INSTANCE = new EventsRouter();

    /* compiled from: EventsRouter.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DTDLogLevel.values().length];
            iArr[DTDLogLevel.Error.ordinal()] = 1;
            iArr[DTDLogLevel.Info.ordinal()] = 2;
            iArr[DTDLogLevel.Warning.ordinal()] = 3;
            iArr[DTDLogLevel.Debug.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private EventsRouter() {
    }

    public final void autoPayment(String orderId, double price, String productId, String purchaseToken, String currencyCode, int paymentType) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Core.INSTANCE.getPurchasesProxy().autoPayment(orderId, price, productId, purchaseToken, currencyCode, paymentType);
    }

    public final void doNotRestoreUser() {
        Core.INSTANCE.getPurchasesProxy().autoPurchaseIsInitialized();
    }

    public final boolean isInit() {
        return Core.INSTANCE.isInitialized();
    }

    public final void isNeedRestoreHistory(Function1<? super Boolean, Unit> callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        Core.INSTANCE.getPurchasesProxy().isNeedRestoreHistory(callBack);
    }

    public final void sendLog(DTDLogLevel logLevel, String text, Throwable throwable) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        Intrinsics.checkNotNullParameter(text, "text");
        int i = WhenMappings.$EnumSwitchMapping$0[logLevel.ordinal()];
        if (i == 1) {
            Logger.INSTANCE.error(text, throwable);
            return;
        }
        if (i == 2) {
            Logger.INSTANCE.info(text, throwable);
        } else if (i == 3) {
            Logger.INSTANCE.warning(text, throwable);
        } else {
            if (i != 4) {
                return;
            }
            Logger.INSTANCE.debug(text, throwable);
        }
    }

    public final void sendPushOpened(long timestamp, int pushId, String button) {
        Core.INSTANCE.getMessagingProxy().pushOpened(timestamp, pushId, button);
    }

    public final void sendPushReceived(long timestamp, int pushId) {
        Core.INSTANCE.getMessagingProxy().pushReceive(timestamp, pushId);
    }

    public final void sendPushToken(String token, boolean isAllowed) {
        Intrinsics.checkNotNullParameter(token, "token");
        Core.INSTANCE.getMessagingProxy().pushToken(token, isAllowed);
    }

    public final void subscriptionHistory(List<String> purchaseList) {
        Intrinsics.checkNotNullParameter(purchaseList, "purchaseList");
        Core.INSTANCE.getPurchasesProxy().subscriptionHistory(purchaseList);
    }
}
