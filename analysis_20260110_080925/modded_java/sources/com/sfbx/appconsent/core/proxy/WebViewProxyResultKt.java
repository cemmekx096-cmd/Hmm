package com.sfbx.appconsent.core.proxy;

import com.crashlytics.android.BuildConfig;
import kotlin.Metadata;

/* compiled from: WebViewProxyResult.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003¨\u0006\b"}, d2 = {"NO_FEATURE_PRESENT_ERROR_DESCRIPTION", BuildConfig.FLAVOR, "getNO_FEATURE_PRESENT_ERROR_DESCRIPTION", "()Ljava/lang/String;", "NO_INSTANCE_PRESENT_ERROR_DESCRIPTION", "getNO_INSTANCE_PRESENT_ERROR_DESCRIPTION", "NO_PACKAGE_PRESENT_ERROR_DESCRIPTION", "getNO_PACKAGE_PRESENT_ERROR_DESCRIPTION", "appconsent-core_prodPremiumRelease"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class WebViewProxyResultKt {
    private static final String NO_PACKAGE_PRESENT_ERROR_DESCRIPTION = System.lineSeparator() + "*****************************************************************************************************************" + System.lineSeparator() + "* It seems that the \"WebView\" system component is not present on your device, or that it is being updated.      *" + System.lineSeparator() + "* Please take the time to check whether it is present or not.                                                   *" + System.lineSeparator() + "* If it is and this log continues to appear, please contact support.                                            *" + System.lineSeparator() + "* If the component is not present and you are unwilling/unable to install it, CMP will not be able to function. *" + System.lineSeparator() + "*****************************************************************************************************************";
    private static final String NO_FEATURE_PRESENT_ERROR_DESCRIPTION = System.lineSeparator() + "********************************************************************************************************" + System.lineSeparator() + "* It seems that your device does not support the \"FEATURE_WEBVIEW\" feature (android.software.webview). *" + System.lineSeparator() + "* Without this feature, it's impossible to use our CMP.                                                *" + System.lineSeparator() + "********************************************************************************************************";
    private static final String NO_INSTANCE_PRESENT_ERROR_DESCRIPTION = System.lineSeparator() + "***************************************************************************" + System.lineSeparator() + "* Despite the above checks, we tried to initialize the WebView component. *" + System.lineSeparator() + "* This was unsuccessful, so we're unable to initialize at all.            *" + System.lineSeparator() + "* Here's the full error trace.                                            *" + System.lineSeparator() + "***************************************************************************";

    public static final String getNO_PACKAGE_PRESENT_ERROR_DESCRIPTION() {
        return NO_PACKAGE_PRESENT_ERROR_DESCRIPTION;
    }

    public static final String getNO_FEATURE_PRESENT_ERROR_DESCRIPTION() {
        return NO_FEATURE_PRESENT_ERROR_DESCRIPTION;
    }

    public static final String getNO_INSTANCE_PRESENT_ERROR_DESCRIPTION() {
        return NO_INSTANCE_PRESENT_ERROR_DESCRIPTION;
    }
}
