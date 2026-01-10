package com.applovin.impl.privacy.consentFlow;

import android.net.Uri;
import com.applovin.impl.sdk.o;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class TermsAndPrivacyPolicyFlowSettingsImpl implements AppLovinTermsAndPrivacyPolicyFlowSettings {
    private boolean a;
    private boolean b;
    private AppLovinSdkConfiguration.ConsentFlowUserGeography c;
    private Uri d;
    private Uri e;

    public TermsAndPrivacyPolicyFlowSettingsImpl(boolean z, boolean z2, AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, Uri uri, Uri uri2) {
        this.a = z;
        this.b = z2;
        this.c = consentFlowUserGeography;
        this.d = uri;
        this.e = uri2;
    }

    public AppLovinSdkConfiguration.ConsentFlowUserGeography getDebugUserGeography() {
        return this.c;
    }

    public Uri getPrivacyPolicyUri() {
        return this.d;
    }

    public Uri getTermsOfServiceUri() {
        return this.e;
    }

    public boolean isEnabled() {
        return this.a;
    }

    public void setDebugUserGeography(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography) {
        o.g("ConsentFlowSettingsImpl", "Setting user debug geography: " + consentFlowUserGeography);
        this.c = consentFlowUserGeography;
    }

    public void setEnabled(boolean z) {
        o.g("ConsentFlowSettingsImpl", "Setting Terms and Privacy Policy Flow enabled: " + z);
        this.a = z;
    }

    public void setPrivacyPolicyUri(Uri uri) {
        o.g("ConsentFlowSettingsImpl", "Setting privacy policy: " + uri);
        this.d = uri;
    }

    public void setShowTermsAndPrivacyPolicyAlertInGdpr(boolean z) {
        o.g("ConsentFlowSettingsImpl", "Setting show Terms and Privacy Policy alert in GDPR: " + z);
        this.b = z;
    }

    public void setTermsOfServiceUri(Uri uri) {
        o.g("ConsentFlowSettingsImpl", "Setting terms of service: " + uri);
        this.e = uri;
    }

    public boolean shouldShowTermsAndPrivacyPolicyAlertInGdpr() {
        return this.b;
    }

    public String toString() {
        return "ConsentFlowSettings{isEnabled=" + this.a + ", privacyPolicyUri=" + this.d + ", termsOfServiceUri=" + this.e + '}';
    }
}
