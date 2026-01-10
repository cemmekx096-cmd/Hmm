package com.onevcat.uniwebview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
class URLLoadingResponser {
    private final Context context;
    private final UniWebViewDialog dialog;
    private final Logger logger = Logger.getInstance();
    private String url;

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.onevcat.uniwebview");
        p0.startActivity(p1);
    }

    private String getLowerUrl() {
        return this.url.toLowerCase(Locale.ROOT);
    }

    URLLoadingResponser(Context context, UniWebViewDialog uniWebViewDialog, String str) {
        this.context = context;
        this.dialog = uniWebViewDialog;
        this.url = str;
    }

    Intent smsIntent() {
        if (!getLowerUrl().startsWith("sms:")) {
            return null;
        }
        this.logger.debug("Received sms url...");
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.url));
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            return intent;
        } catch (Exception e) {
            this.logger.critical("sms url intent open exception: " + e.getMessage());
            return null;
        }
    }

    private Intent telIntent() {
        if (!getLowerUrl().startsWith("tel:")) {
            return null;
        }
        this.logger.debug("Received tel url...");
        return new Intent("android.intent.action.DIAL", Uri.parse(this.url));
    }

    private Intent mailToIntent() {
        if (!getLowerUrl().startsWith("mailto:")) {
            return null;
        }
        this.logger.debug("Received mailto url...");
        return new Intent("android.intent.action.SENDTO", Uri.parse(this.url));
    }

    private Intent explicitlyIntent() throws URISyntaxException {
        if (!getLowerUrl().startsWith("intent:")) {
            return null;
        }
        this.logger.debug("Received intent url...");
        try {
            Intent uri = Intent.parseUri(this.url, 1);
            if (this.context.getPackageManager().resolveActivity(uri, 65536) != null) {
                return uri;
            }
            String str = uri.getPackage();
            if (str == null) {
                return null;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("market://details?id=" + str));
            return intent;
        } catch (Exception e) {
            this.logger.critical("Parsing intent url error. " + e.getMessage());
            return null;
        }
    }

    private Intent marketIntent() {
        if (!getLowerUrl().startsWith("market:")) {
            return null;
        }
        this.logger.debug("Received market url...");
        try {
            return Intent.parseUri(this.url, 1);
        } catch (URISyntaxException e) {
            this.logger.critical("Parsing market url error. " + e.getMessage());
            return null;
        }
    }

    private boolean tryToRunIntent(Intent intent) {
        if (intent == null) {
            return false;
        }
        Context context = this.context;
        if (context == null) {
            return true;
        }
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            return true;
        } catch (Exception unused) {
            this.logger.critical("No Activity found to handle Intent: " + intent.getData());
            return true;
        }
    }

    boolean handleWithIntent() {
        this.logger.verbose("Checking url could be handled with any intents: " + this.url);
        return tryToRunIntent(mailToIntent()) || tryToRunIntent(telIntent()) || tryToRunIntent(smsIntent()) || tryToRunIntent(explicitlyIntent()) || tryToRunIntent(marketIntent());
    }

    boolean canResponseDefinedScheme() {
        this.logger.verbose("Checking url could match with a defined url scheme: " + this.url);
        Iterator it = this.dialog.getSchemes().iterator();
        while (it.hasNext()) {
            if (this.url.startsWith(((String) it.next()) + "://")) {
                this.logger.verbose("Found url match scheme: " + this.url);
                return true;
            }
        }
        this.logger.verbose("Did not find a matched scheme for: " + this.url);
        return false;
    }

    boolean canResponseBuiltinScheme() {
        if (!this.url.startsWith("uniwebviewinternal://")) {
            return false;
        }
        if (!this.url.contains("__uniwebview_internal_video_end")) {
            return true;
        }
        this.dialog.getWebView().notifyVideoEnd();
        return true;
    }
}
