package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ironsource.cm$;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import java.util.Date;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class cm implements SegmentListener {
    private SegmentListener a;
    private final b b;
    protected long c;

    private class b extends Thread {
        private Handler a;

        private b() {
        }

        public Handler a() {
            return this.a;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Looper.prepare();
            this.a = new Handler();
            Looper.loop();
        }
    }

    public cm() {
        b bVar = new b();
        this.b = bVar;
        bVar.start();
        this.c = new Date().getTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.onSegmentReceived(str);
    }

    public void a(SegmentListener segmentListener) {
        this.a = segmentListener;
    }

    protected void a(Runnable runnable) {
        Handler handlerA;
        b bVar = this.b;
        if (bVar == null || (handlerA = bVar.a()) == null) {
            return;
        }
        handlerA.post(runnable);
    }

    protected boolean a(Object obj) {
        return (obj == null || this.b == null) ? false : true;
    }

    @Override // com.ironsource.mediationsdk.sdk.SegmentListener
    public void onSegmentReceived(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onSegmentReceived(" + str + ")", 1);
        if (a((Object) this.a)) {
            a((Runnable) new cm$.ExternalSyntheticLambda0(this, str));
        }
    }
}
