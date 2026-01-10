package com.inmobi.media;

import android.app.Activity;
import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.Map;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public interface x {
    void a();

    void a(byte b, Map map);

    void b();

    boolean c();

    void e();

    AdConfig getAdConfig();

    String getAdType();

    String getCreativeId();

    Object getDataModel();

    w getFullScreenEventsListener();

    String getImpressionId();

    String getMarkupType();

    byte getPlacementType();

    View getVideoContainerView();

    md getViewableAd();

    void setFullScreenActivityContext(Activity activity);
}
