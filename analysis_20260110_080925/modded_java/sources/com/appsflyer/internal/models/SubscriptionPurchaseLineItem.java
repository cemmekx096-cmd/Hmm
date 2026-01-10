package com.appsflyer.internal.models;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.media3.exoplayer.RendererCapabilities;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA2w;
import com.crashlytics.android.BuildConfig;
import com.ironsource.adqualitysdk.sdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u0000 42\u00020\u0001:\u00014BA\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÇ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÇ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÇ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\nHÇ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÇ\u0003¢\u0006\u0004\b\u0019\u0010\u0014JT\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u0006HÇ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\"\u0010\u0014R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0010R\u001c\u0010&\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0012R\u001a\u0010)\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0014R\u001c\u0010,\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0016R\u001c\u0010/\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0018R\u001a\u00102\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010*\u001a\u0004\b3\u0010\u0014"}, d2 = {"Lcom/appsflyer/internal/models/SubscriptionPurchaseLineItem;", BuildConfig.FLAVOR, "Lcom/appsflyer/internal/models/AutoRenewingPlan;", "p0", "Lcom/appsflyer/internal/models/DeferredItemReplacement;", "p1", BuildConfig.FLAVOR, "p2", "Lcom/appsflyer/internal/models/OfferDetails;", "p3", "Lcom/appsflyer/internal/models/PrepaidPlan;", "p4", "p5", "<init>", "(Lcom/appsflyer/internal/models/AutoRenewingPlan;Lcom/appsflyer/internal/models/DeferredItemReplacement;Ljava/lang/String;Lcom/appsflyer/internal/models/OfferDetails;Lcom/appsflyer/internal/models/PrepaidPlan;Ljava/lang/String;)V", "component1", "()Lcom/appsflyer/internal/models/AutoRenewingPlan;", "component2", "()Lcom/appsflyer/internal/models/DeferredItemReplacement;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/appsflyer/internal/models/OfferDetails;", "component5", "()Lcom/appsflyer/internal/models/PrepaidPlan;", "component6", "copy", "(Lcom/appsflyer/internal/models/AutoRenewingPlan;Lcom/appsflyer/internal/models/DeferredItemReplacement;Ljava/lang/String;Lcom/appsflyer/internal/models/OfferDetails;Lcom/appsflyer/internal/models/PrepaidPlan;Ljava/lang/String;)Lcom/appsflyer/internal/models/SubscriptionPurchaseLineItem;", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", BuildConfig.FLAVOR, "hashCode", "()I", "toString", "autoRenewingPlan", "Lcom/appsflyer/internal/models/AutoRenewingPlan;", "getAutoRenewingPlan", "deferredItemReplacement", "Lcom/appsflyer/internal/models/DeferredItemReplacement;", "getDeferredItemReplacement", "expiryTime", "Ljava/lang/String;", "getExpiryTime", "offerDetails", "Lcom/appsflyer/internal/models/OfferDetails;", "getOfferDetails", "prepaidPlan", "Lcom/appsflyer/internal/models/PrepaidPlan;", "getPrepaidPlan", "productId", "getProductId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final /* data */ class SubscriptionPurchaseLineItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AutoRenewingPlan autoRenewingPlan;
    private final DeferredItemReplacement deferredItemReplacement;
    private final String expiryTime;
    private final OfferDetails offerDetails;
    private final PrepaidPlan prepaidPlan;
    private final String productId;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/appsflyer/internal/models/SubscriptionPurchaseLineItem$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/SubscriptionPurchaseLineItem;", "<init>", "()V", "Lorg/json/JSONObject;", "p0", "fromJson", "(Lorg/json/JSONObject;)Lcom/appsflyer/internal/models/SubscriptionPurchaseLineItem;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements Deserialize<SubscriptionPurchaseLineItem> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int getOneTimePurchaseOfferDetails = 1;
        private static int getPackageName = -861462659;
        private static int getQuantity;

        private static void a(boolean z, int i, int i2, int i3, String str, Object[] objArr) {
            int i4 = $10 + R.styleable.AppCompatTheme_windowMinWidthMinor;
            $11 = i4 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            int i5 = i4 % 2;
            char[] charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = charArray;
            AFPurchaseConnectorA2w aFPurchaseConnectorA2w = new AFPurchaseConnectorA2w();
            char[] cArr2 = new char[i3];
            aFPurchaseConnectorA2w.toJsonMap = 0;
            while (aFPurchaseConnectorA2w.toJsonMap < i3) {
                aFPurchaseConnectorA2w.getOneTimePurchaseOfferDetails = cArr[aFPurchaseConnectorA2w.toJsonMap];
                cArr2[aFPurchaseConnectorA2w.toJsonMap] = (char) (aFPurchaseConnectorA2w.getOneTimePurchaseOfferDetails + i);
                int i6 = aFPurchaseConnectorA2w.toJsonMap;
                cArr2[i6] = (char) (cArr2[i6] - ((int) (getPackageName ^ (-2543415058719367236L))));
                aFPurchaseConnectorA2w.toJsonMap++;
            }
            if (i2 > 0) {
                aFPurchaseConnectorA2w.InAppPurchaseEvent = i2;
                char[] cArr3 = new char[i3];
                System.arraycopy(cArr2, 0, cArr3, 0, i3);
                System.arraycopy(cArr3, 0, cArr2, i3 - aFPurchaseConnectorA2w.InAppPurchaseEvent, aFPurchaseConnectorA2w.InAppPurchaseEvent);
                System.arraycopy(cArr3, aFPurchaseConnectorA2w.InAppPurchaseEvent, cArr2, 0, i3 - aFPurchaseConnectorA2w.InAppPurchaseEvent);
            }
            if (z) {
                char[] cArr4 = new char[i3];
                aFPurchaseConnectorA2w.toJsonMap = 0;
                int i7 = $10 + 43;
                $11 = i7 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
                int i8 = i7 % 2;
                while (true) {
                    if ((aFPurchaseConnectorA2w.toJsonMap < i3 ? ':' : '2') != ':') {
                        break;
                    }
                    cArr4[aFPurchaseConnectorA2w.toJsonMap] = cArr2[(i3 - aFPurchaseConnectorA2w.toJsonMap) - 1];
                    aFPurchaseConnectorA2w.toJsonMap++;
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        private Companion() {
        }

        /* renamed from: fromJson, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ Object m77fromJson(JSONObject jSONObject) {
            int i = getQuantity + 73;
            getOneTimePurchaseOfferDetails = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            char c = i % 2 == 0 ? 'J' : (char) 25;
            SubscriptionPurchaseLineItem subscriptionPurchaseLineItemFromJson = fromJson(jSONObject);
            if (c == 'J') {
                int i2 = 84 / 0;
            }
            int i3 = getQuantity + 55;
            getOneTimePurchaseOfferDetails = i3 % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if ((i3 % 2 == 0 ? '`' : '#') != '`') {
                return subscriptionPurchaseLineItemFromJson;
            }
            int i4 = 32 / 0;
            return subscriptionPurchaseLineItemFromJson;
        }

        public final SubscriptionPurchaseLineItem fromJson(JSONObject p0) {
            Intrinsics.checkNotNullParameter(p0, BuildConfig.FLAVOR);
            Object[] objArr = new Object[1];
            a(false, (ViewConfiguration.getJumpTapTimeout() >> 16) + 297, 12 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16, "￪�\u0006�\u000f\u0001\u0006\uffff￨\u0004\ufff9\u0006\ufff9\r\f\u0007", objArr);
            AutoRenewingPlan autoRenewingPlan = (AutoRenewingPlan) SubscriptionPurchaseKt.access$toObject(p0, ((String) objArr[0]).intern(), AutoRenewingPlan.Companion);
            Object[] objArr2 = new Object[1];
            a(false, 295 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 7, View.resolveSize(0, 0) + 23, "\ufffb�\uffff\u0007\uffff\b\u000e\ufffe\uffff\u0000\uffff\f\f\uffff\ufffe￣\u000e\uffff\u0007￬\uffff\n\u0006", objArr2);
            DeferredItemReplacement deferredItemReplacement = (DeferredItemReplacement) SubscriptionPurchaseKt.access$toObject(p0, ((String) objArr2[0]).intern(), DeferredItemReplacement.Companion);
            Object[] objArr3 = new Object[1];
            a(false, 300 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8, 10 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0005\ufffe\u0007\u000e￩\ufffe\u0002\ufffa\ufffa\r", objArr3);
            String strOptString = p0.optString(((String) objArr3[0]).intern());
            Intrinsics.checkNotNullExpressionValue(strOptString, BuildConfig.FLAVOR);
            Object[] objArr4 = new Object[1];
            a(false, (ViewConfiguration.getTouchSlop() >> 8) + 296, 2 - ExpandableListView.getPackedPositionType(0L), 12 - Color.red(0), "\u0005\f\b\uffff\uffff\ufffe\u000b\uffdd\ufffe\r\ufffa\u0002", objArr4);
            OfferDetails offerDetails = (OfferDetails) SubscriptionPurchaseKt.access$toObject(p0, ((String) objArr4[0]).intern(), OfferDetails.Companion);
            Object[] objArr5 = new Object[1];
            a(true, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 296, AndroidCharacter.getMirror('0') - '(', (Process.myTid() >> 22) + 11, "￩�\u0002\ufffa\t\ufffe\u000b\t\u0007\ufffa\u0005", objArr5);
            PrepaidPlan prepaidPlan = (PrepaidPlan) SubscriptionPurchaseKt.access$toObject(p0, ((String) objArr5[0]).intern(), PrepaidPlan.Companion);
            Object[] objArr6 = new Object[1];
            a(true, (ViewConfiguration.getScrollBarSize() >> 8) + 297, TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 3, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 8, "\n\b￼￡\f\ufffb\r￼\u0007", objArr6);
            String strOptString2 = p0.optString(((String) objArr6[0]).intern());
            Intrinsics.checkNotNullExpressionValue(strOptString2, BuildConfig.FLAVOR);
            SubscriptionPurchaseLineItem subscriptionPurchaseLineItem = new SubscriptionPurchaseLineItem(autoRenewingPlan, deferredItemReplacement, strOptString, offerDetails, prepaidPlan, strOptString2);
            int i = getOneTimePurchaseOfferDetails + 91;
            getQuantity = i % RendererCapabilities.DECODER_SUPPORT_PRIMARY;
            if ((i % 2 != 0 ? 'J' : 'N') == 'N') {
                return subscriptionPurchaseLineItem;
            }
            int i2 = 93 / 0;
            return subscriptionPurchaseLineItem;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SubscriptionPurchaseLineItem(AutoRenewingPlan autoRenewingPlan, DeferredItemReplacement deferredItemReplacement, String str, OfferDetails offerDetails, PrepaidPlan prepaidPlan, String str2) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        this.autoRenewingPlan = autoRenewingPlan;
        this.deferredItemReplacement = deferredItemReplacement;
        this.expiryTime = str;
        this.offerDetails = offerDetails;
        this.prepaidPlan = prepaidPlan;
        this.productId = str2;
    }

    public final AutoRenewingPlan getAutoRenewingPlan() {
        return this.autoRenewingPlan;
    }

    public final DeferredItemReplacement getDeferredItemReplacement() {
        return this.deferredItemReplacement;
    }

    public final String getExpiryTime() {
        return this.expiryTime;
    }

    public final OfferDetails getOfferDetails() {
        return this.offerDetails;
    }

    public final PrepaidPlan getPrepaidPlan() {
        return this.prepaidPlan;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SubscriptionPurchaseLineItem)) {
            return false;
        }
        SubscriptionPurchaseLineItem subscriptionPurchaseLineItem = (SubscriptionPurchaseLineItem) p0;
        return Intrinsics.areEqual(this.autoRenewingPlan, subscriptionPurchaseLineItem.autoRenewingPlan) && Intrinsics.areEqual(this.deferredItemReplacement, subscriptionPurchaseLineItem.deferredItemReplacement) && Intrinsics.areEqual(this.expiryTime, subscriptionPurchaseLineItem.expiryTime) && Intrinsics.areEqual(this.offerDetails, subscriptionPurchaseLineItem.offerDetails) && Intrinsics.areEqual(this.prepaidPlan, subscriptionPurchaseLineItem.prepaidPlan) && Intrinsics.areEqual(this.productId, subscriptionPurchaseLineItem.productId);
    }

    public final int hashCode() {
        AutoRenewingPlan autoRenewingPlan = this.autoRenewingPlan;
        int iHashCode = (autoRenewingPlan == null ? 0 : autoRenewingPlan.hashCode()) * 31;
        DeferredItemReplacement deferredItemReplacement = this.deferredItemReplacement;
        int iHashCode2 = (((iHashCode + (deferredItemReplacement == null ? 0 : deferredItemReplacement.hashCode())) * 31) + this.expiryTime.hashCode()) * 31;
        OfferDetails offerDetails = this.offerDetails;
        int iHashCode3 = (iHashCode2 + (offerDetails == null ? 0 : offerDetails.hashCode())) * 31;
        PrepaidPlan prepaidPlan = this.prepaidPlan;
        return ((iHashCode3 + (prepaidPlan != null ? prepaidPlan.hashCode() : 0)) * 31) + this.productId.hashCode();
    }

    public final String toString() {
        return "SubscriptionPurchaseLineItem(autoRenewingPlan=" + this.autoRenewingPlan + ", deferredItemReplacement=" + this.deferredItemReplacement + ", expiryTime=" + this.expiryTime + ", offerDetails=" + this.offerDetails + ", prepaidPlan=" + this.prepaidPlan + ", productId=" + this.productId + ")";
    }

    public static /* synthetic */ SubscriptionPurchaseLineItem copy$default(SubscriptionPurchaseLineItem subscriptionPurchaseLineItem, AutoRenewingPlan autoRenewingPlan, DeferredItemReplacement deferredItemReplacement, String str, OfferDetails offerDetails, PrepaidPlan prepaidPlan, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            autoRenewingPlan = subscriptionPurchaseLineItem.autoRenewingPlan;
        }
        if ((i & 2) != 0) {
            deferredItemReplacement = subscriptionPurchaseLineItem.deferredItemReplacement;
        }
        DeferredItemReplacement deferredItemReplacement2 = deferredItemReplacement;
        if ((i & 4) != 0) {
            str = subscriptionPurchaseLineItem.expiryTime;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            offerDetails = subscriptionPurchaseLineItem.offerDetails;
        }
        OfferDetails offerDetails2 = offerDetails;
        if ((i & 16) != 0) {
            prepaidPlan = subscriptionPurchaseLineItem.prepaidPlan;
        }
        PrepaidPlan prepaidPlan2 = prepaidPlan;
        if ((i & 32) != 0) {
            str2 = subscriptionPurchaseLineItem.productId;
        }
        return subscriptionPurchaseLineItem.copy(autoRenewingPlan, deferredItemReplacement2, str3, offerDetails2, prepaidPlan2, str2);
    }

    public final SubscriptionPurchaseLineItem copy(AutoRenewingPlan p0, DeferredItemReplacement p1, String p2, OfferDetails p3, PrepaidPlan p4, String p5) {
        Intrinsics.checkNotNullParameter(p2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(p5, BuildConfig.FLAVOR);
        return new SubscriptionPurchaseLineItem(p0, p1, p2, p3, p4, p5);
    }

    /* renamed from: component6, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* renamed from: component5, reason: from getter */
    public final PrepaidPlan getPrepaidPlan() {
        return this.prepaidPlan;
    }

    /* renamed from: component4, reason: from getter */
    public final OfferDetails getOfferDetails() {
        return this.offerDetails;
    }

    /* renamed from: component3, reason: from getter */
    public final String getExpiryTime() {
        return this.expiryTime;
    }

    /* renamed from: component2, reason: from getter */
    public final DeferredItemReplacement getDeferredItemReplacement() {
        return this.deferredItemReplacement;
    }

    /* renamed from: component1, reason: from getter */
    public final AutoRenewingPlan getAutoRenewingPlan() {
        return this.autoRenewingPlan;
    }
}
