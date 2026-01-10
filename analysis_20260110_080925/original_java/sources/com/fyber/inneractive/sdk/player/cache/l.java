package com.fyber.inneractive.sdk.player.cache;

import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;
import org.json.JSONException;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class l implements Runnable {
    public final /* synthetic */ m a;

    public l(m mVar) {
        this.a = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        long j;
        File fileA = m.a(this.a.a, "fyb.vamp.vid.cache");
        if (fileA != null) {
            try {
                IAlog.a("VideoCache opening the cache in directory - %s", new Object[]{fileA});
                this.a.b = f.b(fileA);
                f fVar = this.a.b;
                fVar.getClass();
                IAlog.e("DiskLruCache delete cache", new Object[0]);
                fVar.close();
                k.a(fVar.a);
                this.a.b = f.b(fileA);
                f fVar2 = this.a.b;
                synchronized (fVar2) {
                    j = fVar2.h;
                }
                IAlog.a("VideoCache opened the cache in directory - %s current size is %d", new Object[]{fileA, Long.valueOf(j)});
                m mVar = this.a;
                mVar.b.l = mVar;
                mVar.c = true;
            } catch (Throwable th) {
                z.a("Failed to open cache directory", th.getMessage(), null, null);
                IAlog.a("Failed to open cache directory", th, new Object[0]);
            }
        }
    }
}
