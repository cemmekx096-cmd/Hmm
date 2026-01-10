package com.fyber.inneractive.sdk.activities;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.media3.exoplayer.RendererCapabilities;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.click.b;
import com.fyber.inneractive.sdk.click.j;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.response.e;
import com.fyber.inneractive.sdk.util.G;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.N;
import com.fyber.inneractive.sdk.util.g;
import com.fyber.inneractive.sdk.util.o;
import com.fyber.inneractive.sdk.util.t;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class InneractiveInternalBrowserActivity extends InneractiveBaseActivity {
    public static final String EXTRA_KEY_SPOT_ID = "spotId";
    public static final String URL_EXTRA = "extra_url";
    public static String j;
    public static InternalBrowserListener k;
    public x b;
    public String c;
    public LinearLayout d;
    public WebView e;
    public ImageButton f;
    public ImageButton g;
    public ImageButton h;
    public ImageButton i;

    public interface InternalBrowserListener {
        void onApplicationInBackground();

        void onInternalBrowserDismissed();
    }

    public static void a(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity, b bVar) throws JSONException {
        r rVar;
        x xVar = inneractiveInternalBrowserActivity.b;
        InneractiveAdRequest inneractiveAdRequest = xVar != null ? xVar.a : null;
        e eVarC = xVar != null ? xVar.c() : null;
        x xVar2 = inneractiveInternalBrowserActivity.b;
        JSONArray jSONArrayB = (xVar2 == null || (rVar = xVar2.c) == null) ? null : rVar.b();
        u uVar = u.FYBER_SUCCESS_CLICK;
        w wVar = new w(eVarC);
        wVar.c = uVar;
        wVar.a = inneractiveAdRequest;
        wVar.d = jSONArrayB;
        JSONObject jSONObject = new JSONObject();
        long j2 = bVar.e;
        if (j2 != 0) {
            Object objValueOf = Long.valueOf(j2);
            try {
                jSONObject.put("time_passed", objValueOf);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", new Object[]{"time_passed", objValueOf});
            }
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = bVar.f.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("url", jVar.a);
                jSONObject2.put("success", jVar.b);
                jSONObject2.put("opened_by", jVar.c);
                jSONObject2.put(AdOperationMetric.REASON, jVar.d);
            } catch (Exception unused2) {
            }
            jSONArray.put(jSONObject2);
        }
        try {
            jSONObject.put("urls", jSONArray);
        } catch (Exception unused3) {
            IAlog.f("Got exception adding param to json object: %s, %s", new Object[]{"urls", jSONArray});
        }
        Object obj = g.VIDEO_CTA;
        try {
            jSONObject.put("origin", obj);
        } catch (Exception unused4) {
            IAlog.f("Got exception adding param to json object: %s, %s", new Object[]{"origin", obj});
        }
        wVar.f.put(jSONObject);
        wVar.a((String) null);
    }

    public static void disableWebviewZoomControls(WebView webView) {
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        new N(webView).run();
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.inneractive");
        p0.startActivity(p1);
    }

    public static void setHtmlExtra(String str) {
        j = str;
    }

    public static void setInternalBrowserListener(InternalBrowserListener internalBrowserListener) {
        k = internalBrowserListener;
    }

    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch("com.inneractive", me);
        return super.dispatchTouchEvent(me);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void finish() {
        InternalBrowserListener internalBrowserListener = k;
        super/*android.app.Activity*/.finish();
        if (internalBrowserListener != null) {
            internalBrowserListener.onInternalBrowserDismissed();
        }
    }

    public void onBackPressed() {
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) throws UnsupportedEncodingException {
        InneractiveAdSpot spot;
        getWindow().requestFeature(2);
        getWindow().setFeatureInt(2, -1);
        getWindow().addFlags(RendererCapabilities.AUDIO_OFFLOAD_GAPLESS_SUPPORTED);
        super.onCreate(bundle);
        if (getActionBar() != null) {
            getActionBar().hide();
        }
        try {
            setContentView(a());
            String stringExtra = getIntent().getStringExtra(EXTRA_KEY_SPOT_ID);
            this.c = stringExtra;
            if (!TextUtils.isEmpty(stringExtra) && (spot = InneractiveAdSpotManager.get().getSpot(this.c)) != null) {
                this.b = spot.getAdContent();
            }
            Intent intent = getIntent();
            WebSettings settings = this.e.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(true);
            settings.setBuiltInZoomControls(true);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            disableWebviewZoomControls(this.e);
            this.e.setWebChromeClient(new e(this));
            String stringExtra2 = intent.getStringExtra(URL_EXTRA);
            if (!TextUtils.isEmpty(j)) {
                String str = j + "<title>DigitalTurbine Internal Browser</title>";
                j = str;
                this.e.loadDataWithBaseURL(stringExtra2, str, "text/html", HttpRequest.CHARSET_UTF8, null);
            } else if (TextUtils.isEmpty(stringExtra2)) {
                IAlog.f("Empty url", new Object[0]);
                finish();
            } else if (!G.d(stringExtra2)) {
                this.e.loadUrl(stringExtra2);
            } else if (G.c(stringExtra2)) {
                try {
                    stringExtra2 = URLDecoder.decode(stringExtra2, "utf-8");
                    this.e.loadUrl(stringExtra2);
                } catch (Exception unused) {
                    IAlog.f("Failed to open Url: %s", new Object[]{stringExtra2});
                    finish();
                }
            } else {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(stringExtra2));
                intent2.addFlags(268435456);
                try {
                    startActivity(intent2);
                    InternalBrowserListener internalBrowserListener = k;
                    if (internalBrowserListener != null) {
                        internalBrowserListener.onApplicationInBackground();
                    }
                } catch (ActivityNotFoundException unused2) {
                    IAlog.f("Failed to start activity for %s. Please ensure that your phone can handle this intent.", new Object[]{stringExtra2});
                }
                finish();
            }
            this.f.setBackgroundColor(0);
            this.f.setOnClickListener(new i(this));
            this.f.setContentDescription("IABackButton");
            this.g.setBackgroundColor(0);
            this.g.setOnClickListener(new j(this));
            this.g.setContentDescription("IAForwardButton");
            this.h.setBackgroundColor(0);
            this.h.setOnClickListener(new k(this));
            this.h.setContentDescription("IARefreshButton");
            this.i.setBackgroundColor(0);
            this.i.setOnClickListener(new l(this));
            this.i.setContentDescription("IACloseButton");
            o.a();
            o.g();
        } catch (Exception unused3) {
            finish();
        }
    }

    public void onDestroy() {
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        WebView webView = this.e;
        if (webView != null) {
            webView.removeAllViews();
            t.a(this.e);
            this.e.destroy();
            this.e = null;
        }
        super.onDestroy();
        setHtmlExtra(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.app.Activity*/.onDetachedFromWindow();
        setVisible(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        super/*android.app.Activity*/.onPause();
        o.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        super/*android.app.Activity*/.onResume();
        o.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LinearLayout a() {
        this.d = new LinearLayout(this);
        this.d.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.d.setOrientation(1);
        this.d.setContentDescription("IAInternalBrowserView");
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.d.addView(relativeLayout);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setId(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, o.a(getResources().getInteger(R.integer.ia_ib_toolbar_height_dp)));
        layoutParams.addRule(12);
        linearLayout.setLayoutParams(layoutParams);
        o.a(linearLayout, o.c(R.drawable.ia_ib_background));
        relativeLayout.addView(linearLayout);
        this.f = a(o.c(R.drawable.ia_ib_left_arrow));
        this.g = a(o.c(R.drawable.ia_ib_right_arrow));
        this.h = a(o.c(R.drawable.ia_ib_refresh));
        this.i = a(o.c(R.drawable.ia_ib_close));
        linearLayout.addView(this.f);
        linearLayout.addView(this.g);
        linearLayout.addView(this.h);
        linearLayout.addView(this.i);
        WebView webView = new WebView(IAConfigManager.O.v.a());
        this.e = webView;
        webView.setWebViewClient(new f(this));
        this.e.setId(R.id.ia_inneractive_webview_internal_browser);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, 1);
        this.e.setLayoutParams(layoutParams2);
        relativeLayout.addView(this.e);
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ImageButton a(Drawable drawable) {
        ImageButton imageButton = new ImageButton(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(o.a(getResources().getInteger(R.integer.ia_ib_button_size_dp)), o.a(getResources().getInteger(R.integer.ia_ib_button_size_dp)), 1.0f);
        layoutParams.gravity = 16;
        imageButton.setLayoutParams(layoutParams);
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setImageDrawable(drawable);
        return imageButton;
    }
}
