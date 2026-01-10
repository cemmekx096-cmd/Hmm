package com.bytedance.sdk.openadsdk.api.banner;

import android.content.Context;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.bytedance.sdk.openadsdk.utils.EO;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class PAGBannerSize {
    private int EO = 1;
    private int IlO;
    private int MY;
    private int tV;
    public static final PAGBannerSize BANNER_W_320_H_50 = new PAGBannerSize(320, 50);
    public static final PAGBannerSize BANNER_W_300_H_250 = new PAGBannerSize(300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
    public static final PAGBannerSize BANNER_W_728_H_90 = new PAGBannerSize(728, 90);

    public PAGBannerSize(int i, int i2) {
        this.IlO = i;
        this.MY = i2;
    }

    public int getWidth() {
        return this.IlO;
    }

    public int getHeight() {
        return this.MY;
    }

    public int getType() {
        return this.EO;
    }

    public int getMaxHeight() {
        return this.tV;
    }

    public static PAGBannerSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i) {
        int iIlO = EO.IlO(context, i, 0);
        if (iIlO == EO.IlO) {
            return new PAGBannerSize(-1, -1);
        }
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i, iIlO);
        pAGBannerSize.EO = 2;
        return pAGBannerSize;
    }

    public static PAGBannerSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int i) {
        int iIlO = EO.IlO(context, 0);
        if (iIlO == EO.IlO) {
            return new PAGBannerSize(-1, -1);
        }
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i, 0);
        pAGBannerSize.tV = iIlO;
        pAGBannerSize.EO = 3;
        return pAGBannerSize;
    }

    public static PAGBannerSize getInlineAdaptiveBannerAdSize(int i, int i2) {
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i, 0);
        pAGBannerSize.tV = i2;
        pAGBannerSize.EO = 3;
        return pAGBannerSize;
    }
}
