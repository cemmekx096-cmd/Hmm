package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.inmobi.media.Ua$;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class Ua extends WebChromeClient {
    public final /* synthetic */ Ya a;

    public Ua(Ya ya) {
        this.a = ya;
    }

    public static final void a(JsResult jsResult, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(jsResult, "$result");
        jsResult.confirm();
    }

    public static final boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    public static final void b(JsResult jsResult, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(jsResult, "$result");
        jsResult.confirm();
    }

    public static final void c(JsResult jsResult, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(jsResult, "$result");
        jsResult.cancel();
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
        return defaultVideoPoster == null ? Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888) : defaultVideoPoster;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        Intrinsics.checkNotNullParameter(consoleMessage, "cm");
        String str = consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId();
        g5 g5Var = this.a.i;
        if (g5Var == null) {
            return true;
        }
        String str2 = Ya.P0;
        g5Var.c(str2, k6.a(str2, "access$getTAG$cp(...)", "Console message:", str));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        a();
        super.onHideCustomView();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        Intrinsics.checkNotNullParameter(webView, "view");
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(str2, SettingsJsonConstants.PROMPT_MESSAGE_KEY);
        Intrinsics.checkNotNullParameter(jsResult, "result");
        g5 g5Var = this.a.i;
        if (g5Var != null) {
            String str3 = Ya.P0;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$cp(...)");
            g5Var.a(str3, "jsAlert called with: " + str2 + str);
        }
        if (!Ya.a(this.a, jsResult)) {
            return true;
        }
        Activity fullScreenActivity = this.a.getFullScreenActivity();
        if (fullScreenActivity != null) {
            new AlertDialog.Builder(fullScreenActivity).setMessage(str2).setTitle(str).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) new Ua$.ExternalSyntheticLambda4(jsResult)).setCancelable(false).create().show();
            return true;
        }
        jsResult.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        Intrinsics.checkNotNullParameter(webView, "view");
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(str2, SettingsJsonConstants.PROMPT_MESSAGE_KEY);
        Intrinsics.checkNotNullParameter(jsResult, "result");
        g5 g5Var = this.a.i;
        if (g5Var != null) {
            String str3 = Ya.P0;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$cp(...)");
            g5Var.a(str3, "jsConfirm called with: " + str2 + str);
        }
        if (!Ya.a(this.a, jsResult)) {
            return true;
        }
        if (this.a.getFullScreenActivity() != null) {
            new AlertDialog.Builder(this.a.getFullScreenActivity()).setMessage(str2).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) new Ua$.ExternalSyntheticLambda5(jsResult)).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) new Ua$.ExternalSyntheticLambda6(jsResult)).create().show();
            return true;
        }
        jsResult.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        Intrinsics.checkNotNullParameter(webView, "view");
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(str2, SettingsJsonConstants.PROMPT_MESSAGE_KEY);
        Intrinsics.checkNotNullParameter(str3, "defaultValue");
        Intrinsics.checkNotNullParameter(jsPromptResult, "result");
        g5 g5Var = this.a.i;
        if (g5Var != null) {
            String str4 = Ya.P0;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$cp(...)");
            g5Var.a(str4, "jsPrompt called with: " + str2 + str);
        }
        if (!Ya.a(this.a, jsPromptResult)) {
            return true;
        }
        if (this.a.getFullScreenActivity() != null) {
            return false;
        }
        jsPromptResult.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        g5 g5Var = this.a.i;
        if (g5Var != null) {
            String str = Ya.P0;
            g5Var.c(str, x8.a(str, "access$getTAG$cp(...)", "webview progress changed - ", i));
        }
        super.onProgressChanged(webView, i);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(customViewCallback, "callback");
        if (this.a.k.get() != null) {
            Ya ya = this.a;
            ya.I = view;
            ya.J = customViewCallback;
            if (view != null) {
                view.setOnTouchListener(new Ua$.ExternalSyntheticLambda0());
            }
            Activity activity = (Activity) this.a.k.get();
            FrameLayout frameLayout = activity != null ? (FrameLayout) activity.findViewById(R.id.content) : null;
            View view2 = this.a.I;
            if (view2 != null) {
                view2.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            }
            if (frameLayout != null) {
                frameLayout.addView(this.a.I, new AbsoluteLayout.LayoutParams(-1, -1, 0, 0));
            }
            View view3 = this.a.I;
            if (view3 != null) {
                view3.requestFocus();
            }
            Ya ya2 = this.a;
            View view4 = ya2.I;
            Ua$.ExternalSyntheticLambda1 externalSyntheticLambda1 = new Ua$.ExternalSyntheticLambda1(ya2, this);
            if (view4 != null) {
                view4.setOnKeyListener(externalSyntheticLambda1);
            }
            if (view4 != null) {
                view4.setFocusable(true);
            }
            if (view4 != null) {
                view4.setFocusableInTouchMode(true);
            }
            if (view4 != null) {
                view4.requestFocus();
            }
        }
    }

    public static final void b(GeolocationPermissions.Callback callback, String str, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(str, "$origin");
        callback.invoke(str, false, false);
    }

    public static final boolean a(Ya ya, Ua ua, View view, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(ya, "this$0");
        Intrinsics.checkNotNullParameter(ua, "this$1");
        if (4 != keyEvent.getKeyCode() || keyEvent.getAction() != 0) {
            return false;
        }
        g5 g5Var = ya.i;
        if (g5Var != null) {
            String str = Ya.P0;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            g5Var.a(str, "Back pressed when HTML5 video is playing.");
        }
        ua.a();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        Intrinsics.checkNotNullParameter(str, "origin");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.a.k.get() != null) {
            new AlertDialog.Builder((Context) this.a.k.get()).setTitle("Location Permission").setMessage("Allow location access").setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) new Ua$.ExternalSyntheticLambda2(callback, str)).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) new Ua$.ExternalSyntheticLambda3(callback, str)).create().show();
        }
        super.onGeolocationPermissionsShowPrompt(str, callback);
    }

    public final void a() {
        Ya ya = this.a;
        if (ya.I == null) {
            return;
        }
        WebChromeClient.CustomViewCallback customViewCallback = ya.J;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
        Ya ya2 = this.a;
        ya2.J = null;
        View view = ya2.I;
        if ((view != null ? view.getParent() : null) != null) {
            View view2 = this.a.I;
            ViewParent parent = view2 != null ? view2.getParent() : null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.a.I);
            }
            this.a.I = null;
        }
    }

    public static final void a(GeolocationPermissions.Callback callback, String str, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(str, "$origin");
        callback.invoke(str, true, false);
    }
}
