package com.tiktok.util;

import android.util.Log;
import com.mbridge.msdk.playercommon.VideoFeedsPlayer;
import com.tiktok.TikTokBusinessSdk;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class TTLogger {
    public final TikTokBusinessSdk.LogLevel logLevel;
    private final String tag;

    public TTLogger(String tag, TikTokBusinessSdk.LogLevel logLevel) {
        this.tag = tag;
        this.logLevel = logLevel;
    }

    private String resolvedStr(String format, Object... extra) {
        return format == null ? "null" : extra.length == 0 ? format : String.format(format, extra);
    }

    public void info(String format, Object... extra) {
        if (shouldLog(TikTokBusinessSdk.LogLevel.INFO)) {
            String strResolvedStr = resolvedStr(format, extra);
            if (strResolvedStr.length() > 1000) {
                Log.i(this.tag, strResolvedStr.substring(0, VideoFeedsPlayer.INTERVAL_TIME_PLAY_TIME_CD_THREAD));
                info(strResolvedStr.substring(VideoFeedsPlayer.INTERVAL_TIME_PLAY_TIME_CD_THREAD), new Object[0]);
            } else {
                Log.i(this.tag, strResolvedStr);
            }
        }
    }

    public void warn(String format, Object... extra) {
        if (shouldLog(TikTokBusinessSdk.LogLevel.WARN)) {
            Log.w(this.tag, resolvedStr(format, extra));
        }
    }

    public void debug(String format, Object... extra) {
        if (shouldLog(TikTokBusinessSdk.LogLevel.DEBUG)) {
            String strResolvedStr = resolvedStr(format, extra);
            if (strResolvedStr.length() > 1000) {
                Log.d(this.tag, strResolvedStr.substring(0, VideoFeedsPlayer.INTERVAL_TIME_PLAY_TIME_CD_THREAD));
                debug(strResolvedStr.substring(VideoFeedsPlayer.INTERVAL_TIME_PLAY_TIME_CD_THREAD), new Object[0]);
            } else {
                Log.d(this.tag, strResolvedStr);
            }
        }
    }

    public void error(Throwable error, String format, Object... extra) {
        if (shouldLog(TikTokBusinessSdk.LogLevel.INFO)) {
            Log.e(this.tag, resolvedStr(format, extra), error);
        }
    }

    private boolean shouldLog(TikTokBusinessSdk.LogLevel level) {
        return this.logLevel.ordinal() >= level.ordinal();
    }
}
