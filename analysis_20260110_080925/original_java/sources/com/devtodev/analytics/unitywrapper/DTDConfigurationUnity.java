package com.devtodev.analytics.unitywrapper;

import com.devtodev.analytics.external.DTDLogLevel;
import com.devtodev.analytics.external.DTDTrackingStatus;
import com.devtodev.analytics.external.analytics.DTDAnalyticsConfiguration;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class DTDConfigurationUnity {
    public static DTDAnalyticsConfiguration create() {
        return new DTDAnalyticsConfiguration();
    }

    public static void setCurrentLevel(DTDAnalyticsConfiguration dTDAnalyticsConfiguration, int i) {
        dTDAnalyticsConfiguration.setCurrentLevel(Integer.valueOf(i));
    }

    public static void setLogLevel(DTDAnalyticsConfiguration dTDAnalyticsConfiguration, int i) {
        DTDLogLevel dTDLogLevel = DTDLogLevel.No;
        if (i == 0) {
            dTDLogLevel = DTDLogLevel.Debug;
        } else if (i == 1) {
            dTDLogLevel = DTDLogLevel.Info;
        } else if (i == 2) {
            dTDLogLevel = DTDLogLevel.Warning;
        } else if (i == 3) {
            dTDLogLevel = DTDLogLevel.Error;
        }
        dTDAnalyticsConfiguration.setLogLevel(dTDLogLevel);
    }

    public static void setTracking(DTDAnalyticsConfiguration dTDAnalyticsConfiguration, boolean z) {
        dTDAnalyticsConfiguration.setTrackingAvailability(z ? DTDTrackingStatus.Enable : DTDTrackingStatus.Disable);
    }

    public static void setUserId(DTDAnalyticsConfiguration dTDAnalyticsConfiguration, String str) {
        dTDAnalyticsConfiguration.setUserId(str);
    }
}
