package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bykv.vk.openvk.IlO.IlO.IlO.Bc.MY;
import com.bytedance.sdk.component.utils.ea;
import com.crashlytics.android.BuildConfig;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class AdSlot {
    public static final int ANCHORED_BANNER = 2;
    public static final int FIX_BANNER = 1;
    public static final int INLINE_BANNER = 3;
    public static final int TYPE_BANNER = 1;
    public static final int TYPE_CACHED_SPLASH = 4;
    public static final int TYPE_FEED = 5;
    public static final int TYPE_FULL_SCREEN_VIDEO = 8;
    public static final int TYPE_INTERACTION_AD = 2;
    public static final int TYPE_OPEN_AD = 3;
    public static final int TYPE_REWARD_VIDEO = 7;
    private int AXM;
    private boolean Bc;
    private float Cc;
    private int DmF;
    private int EO;
    private String EV;
    private String IlO;
    private int MY;
    private String NV;
    private boolean bWL;
    private String cL;
    private String cl;
    private String ea;
    private String es;
    private boolean hp;
    private int kBB;
    private String lEW;
    private int oeT;
    private boolean pP;
    private int rp;
    private float tV;
    private Map<String, Object> tl;
    private int vAh;
    private int vCE;
    private int xF;
    private String zPa;

    public static int getPosition(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return (i == 3 || i == 4 || i == 7 || i == 8) ? 5 : 3;
        }
        return 4;
    }

    private AdSlot() {
        this.hp = true;
        this.bWL = false;
        this.xF = 0;
        this.AXM = 0;
        this.oeT = 0;
        this.kBB = 1;
    }

    public void setUserData(String str) {
        this.es = str;
    }

    public String getUserData() {
        return this.es;
    }

    public String getCodeId() {
        return this.IlO;
    }

    public boolean isAutoPlay() {
        return this.hp;
    }

    public boolean isExpressAd() {
        return this.bWL;
    }

    public String getBidAdm() {
        return this.ea;
    }

    public int getImgAcceptedWidth() {
        return this.MY;
    }

    public int getImgAcceptedHeight() {
        return this.EO;
    }

    public float getExpressViewAcceptedWidth() {
        return this.tV;
    }

    public float getExpressViewAcceptedHeight() {
        return this.Cc;
    }

    public void setExpressViewAccepted(float f, float f2) {
        this.tV = f;
        this.Cc = f2;
    }

    public boolean isSupportDeepLink() {
        return this.Bc;
    }

    public int getAdCount() {
        return this.vCE;
    }

    public void setAdCount(int i) {
        this.vCE = i;
    }

    @Deprecated
    public String getRewardName() {
        return this.lEW;
    }

    @Deprecated
    public int getRewardAmount() {
        return this.DmF;
    }

    public String getMediaExtra() {
        return this.NV;
    }

    public String getUserID() {
        return this.EV;
    }

    public int getNativeAdType() {
        return this.rp;
    }

    public void setNativeAdType(int i) {
        this.rp = i;
    }

    public String getAdId() {
        return this.zPa;
    }

    public String getCreativeId() {
        return this.cl;
    }

    public String getExt() {
        return this.cL;
    }

    public int getIsRotateBanner() {
        return this.xF;
    }

    public void setIsRotateBanner(int i) {
        this.xF = i;
    }

    public int getRotateTime() {
        return this.AXM;
    }

    public void setRotateTime(int i) {
        this.AXM = i;
    }

    public int getRotateOrder() {
        return this.oeT;
    }

    public void setRotateOrder(int i) {
        this.oeT = i;
    }

    public void setDurationSlotType(int i) {
        this.vAh = i;
    }

    public int getDurationSlotType() {
        return this.vAh;
    }

    public Map<String, Object> getRequestExtraMap() {
        return this.tl;
    }

    public void setPreload(boolean z) {
        this.pP = z;
    }

    public boolean isPreload() {
        return this.pP;
    }

    public String toString() {
        return super.toString();
    }

    public JSONObject toJsonObj() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mCodeId", this.IlO);
            jSONObject.put("mAdCount", this.vCE);
            jSONObject.put("mIsAutoPlay", this.hp);
            jSONObject.put("mImgAcceptedWidth", this.MY);
            jSONObject.put("mImgAcceptedHeight", this.EO);
            jSONObject.put("mExpressViewAcceptedWidth", this.tV);
            jSONObject.put("mExpressViewAcceptedHeight", this.Cc);
            jSONObject.put("mSupportDeepLink", this.Bc);
            jSONObject.put("mRewardName", this.lEW);
            jSONObject.put("mRewardAmount", this.DmF);
            jSONObject.put("mMediaExtra", this.NV);
            jSONObject.put("mUserID", this.EV);
            jSONObject.put("mNativeAdType", this.rp);
            jSONObject.put("mIsExpressAd", this.bWL);
            jSONObject.put("mAdId", this.zPa);
            jSONObject.put("mCreativeId", this.cl);
            jSONObject.put("mExt", this.cL);
            jSONObject.put("mBidAdm", this.ea);
            jSONObject.put("mUserData", this.es);
            jSONObject.put("mDurationSlotType", this.vAh);
            jSONObject.put("mBannerType", this.kBB);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public int getBannerType() {
        return this.kBB;
    }

    public static AdSlot getSlot(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Builder builder = new Builder();
        try {
            int iOptInt = jSONObject.optInt("mImgAcceptedWidth", 640);
            int iOptInt2 = jSONObject.optInt("mImgAcceptedHeight", 320);
            double dOptDouble = jSONObject.optDouble("mExpressViewAcceptedWidth", 0.0d);
            double dOptDouble2 = jSONObject.optDouble("mExpressViewAcceptedHeight", 0.0d);
            builder.setCodeId(jSONObject.optString("mCodeId", null));
            builder.setAdCount(jSONObject.optInt("mAdCount", 1));
            builder.setIsAutoPlay(jSONObject.optBoolean("mIsAutoPlay"));
            builder.setImageAcceptedSize(iOptInt, iOptInt2);
            builder.setExpressViewAcceptedSize(Double.valueOf(dOptDouble).floatValue(), Double.valueOf(dOptDouble2).floatValue());
            builder.setSupportDeepLink(jSONObject.optBoolean("mSupportDeepLink", false));
            builder.setRewardName(jSONObject.optString("mRewardName", null));
            builder.setRewardAmount(jSONObject.optInt("mRewardAmount"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra", null));
            builder.setUserID(jSONObject.optString("mUserID", null));
            builder.setNativeAdType(jSONObject.optInt("mNativeAdType"));
            builder.isExpressAd(jSONObject.optBoolean("mIsExpressAd"));
            builder.withBid(jSONObject.optString("mBidAdm"));
            builder.setAdId(jSONObject.optString("mAdId"));
            builder.setCreativeId(jSONObject.optString("mCreativeId"));
            builder.setExt(jSONObject.optString("mExt"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra"));
            builder.setBannerType(jSONObject.optInt("mBannerType"));
        } catch (Exception unused) {
        }
        AdSlot adSlotBuild = builder.build();
        adSlotBuild.setDurationSlotType(jSONObject.optInt("mDurationSlotType"));
        return adSlotBuild;
    }

    public static class Builder {
        private int AXM;
        private float EV;
        private String IlO;
        private int NV;
        private String bWL;
        private String cL;
        private String cl;
        private String ea;
        private boolean hp;
        private String lEW;
        private float rp;
        private String zPa;
        private int MY = 640;
        private int EO = 320;
        private final boolean tV = true;
        private int Cc = 1;
        private final String vCE = BuildConfig.FLAVOR;
        private final int Bc = 0;
        private String DmF = "defaultUser";
        private boolean es = true;
        private Map<String, Object> xF = null;
        private int oeT = 1;

        @Deprecated
        public Builder setRewardAmount(int i) {
            return this;
        }

        @Deprecated
        public Builder setRewardName(String str) {
            return this;
        }

        @Deprecated
        public Builder setSupportDeepLink(boolean z) {
            return this;
        }

        public Builder setAdId(String str) {
            this.ea = str;
            return this;
        }

        public Builder setCreativeId(String str) {
            this.zPa = str;
            return this;
        }

        public Builder setExt(String str) {
            this.cl = str;
            return this;
        }

        public Builder setIsAutoPlay(boolean z) {
            this.es = z;
            return this;
        }

        public Builder setCodeId(String str) {
            this.IlO = str;
            return this;
        }

        public Builder isExpressAd(boolean z) {
            this.hp = z;
            return this;
        }

        public Builder setImageAcceptedSize(int i, int i2) {
            this.MY = i;
            this.EO = i2;
            return this;
        }

        public Builder setExpressViewAcceptedSize(float f, float f2) {
            this.EV = f;
            this.rp = f2;
            return this;
        }

        public Builder setDurationSlotType(int i) {
            this.AXM = i;
            return this;
        }

        public Builder setAdCount(int i) {
            if (i <= 0) {
                i = 1;
            }
            if (i > 20) {
                i = 20;
            }
            this.Cc = i;
            return this;
        }

        public Builder setMediaExtra(String str) {
            this.lEW = str;
            return this;
        }

        public Builder setUserID(String str) {
            this.DmF = str;
            return this;
        }

        public Builder setNativeAdType(int i) {
            this.NV = i;
            return this;
        }

        public Builder withBid(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (ea.tV()) {
                new StringBuilder("AdSlot -> bidAdm=").append(MY.IlO(str));
            }
            this.bWL = str;
            return this;
        }

        public Builder setUserData(String str) {
            this.cL = str;
            return this;
        }

        public Builder setRequestExtraMap(Map<String, Object> map) {
            this.xF = map;
            return this;
        }

        public Builder setBannerType(int i) {
            this.oeT = i;
            return this;
        }

        public AdSlot build() {
            AdSlot adSlot = new AdSlot();
            adSlot.IlO = this.IlO;
            adSlot.vCE = this.Cc;
            adSlot.Bc = true;
            adSlot.MY = this.MY;
            adSlot.EO = this.EO;
            float f = this.EV;
            if (f <= 0.0f) {
                adSlot.tV = this.MY;
                adSlot.Cc = this.EO;
            } else {
                adSlot.tV = f;
                adSlot.Cc = this.rp;
            }
            adSlot.lEW = BuildConfig.FLAVOR;
            adSlot.DmF = 0;
            adSlot.NV = this.lEW;
            adSlot.EV = this.DmF;
            adSlot.rp = this.NV;
            adSlot.hp = this.es;
            adSlot.bWL = this.hp;
            adSlot.ea = this.bWL;
            adSlot.zPa = this.ea;
            adSlot.cl = this.zPa;
            adSlot.cL = this.cl;
            adSlot.es = this.cL;
            adSlot.tl = this.xF;
            adSlot.vAh = this.AXM;
            adSlot.kBB = this.oeT;
            return adSlot;
        }
    }
}
