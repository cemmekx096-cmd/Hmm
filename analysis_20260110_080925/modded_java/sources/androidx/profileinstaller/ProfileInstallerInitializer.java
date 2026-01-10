package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer$;
import androidx.profileinstaller.ProfileInstallerInitializer$Choreographer16Impl$;
import androidx.startup.Initializer;
import com.mbridge.msdk.playercommon.VideoFeedsPlayer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class ProfileInstallerInitializer implements Initializer<Result> {
    private static final int DELAY_MS = 5000;

    public static class Result {
    }

    /* renamed from: create, reason: merged with bridge method [inline-methods] */
    public Result m54create(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new Result();
        }
        delayAfterFirstFrame(context.getApplicationContext());
        return new Result();
    }

    void delayAfterFirstFrame(Context context) {
        Choreographer16Impl.postFrameCallback(new ProfileInstallerInitializer$.ExternalSyntheticLambda1(this, context));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: installAfterDelay, reason: merged with bridge method [inline-methods] */
    public void m53xfbd6c934(Context context) {
        Handler handler;
        if (Build.VERSION.SDK_INT >= 28) {
            handler = Handler28Impl.createAsync(Looper.getMainLooper());
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.postDelayed(new ProfileInstallerInitializer$.ExternalSyntheticLambda0(context), new Random().nextInt(Math.max(VideoFeedsPlayer.INTERVAL_TIME_PLAY_TIME_CD_THREAD, 1)) + DELAY_MS);
    }

    public List<Class<? extends Initializer<?>>> dependencies() {
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeInBackground(Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new ProfileInstallerInitializer$.ExternalSyntheticLambda2(context));
    }

    private static class Choreographer16Impl {
        private Choreographer16Impl() {
        }

        public static void postFrameCallback(Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new ProfileInstallerInitializer$Choreographer16Impl$.ExternalSyntheticLambda0(runnable));
        }
    }

    private static class Handler28Impl {
        private Handler28Impl() {
        }

        public static Handler createAsync(Looper looper) {
            return Handler.createAsync(looper);
        }
    }
}
