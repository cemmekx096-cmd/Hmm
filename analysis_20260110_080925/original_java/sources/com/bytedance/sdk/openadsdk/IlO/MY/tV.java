package com.bytedance.sdk.openadsdk.IlO.MY;

import android.view.View;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.core.model.oeT;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class tV implements PAGNativeAdData {
    private final IlO IlO;

    public tV(IlO ilO) {
        this.IlO = ilO;
    }

    public PAGImageItem getIcon() {
        IlO ilO = this.IlO;
        if (ilO != null) {
            return ilO.EO();
        }
        return null;
    }

    public String getTitle() {
        IlO ilO = this.IlO;
        if (ilO != null) {
            return ilO.tV();
        }
        return null;
    }

    public String getDescription() {
        IlO ilO = this.IlO;
        if (ilO != null) {
            return ilO.Cc();
        }
        return null;
    }

    public String getButtonText() {
        IlO ilO = this.IlO;
        if (ilO != null) {
            return ilO.vCE();
        }
        return null;
    }

    public PAGMediaView getMediaView() {
        IlO ilO = this.IlO;
        if (ilO != null) {
            return ilO.Bc();
        }
        return null;
    }

    public View getAdLogoView() {
        IlO ilO = this.IlO;
        if (ilO != null) {
            return ilO.NV();
        }
        return null;
    }

    public PAGNativeAdData.PAGNativeMediaType getMediaType() {
        if (oeT.Cc(this.IlO.IlO)) {
            return PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeVideo;
        }
        return PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeImage;
    }

    public View getAdChoicesView() {
        IlO ilO = this.IlO;
        if (ilO != null) {
            return ilO.EV();
        }
        return null;
    }
}
