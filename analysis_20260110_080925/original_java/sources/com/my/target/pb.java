package com.my.target;

import android.content.Context;
import com.my.target.common.models.VideoData;
import com.my.target.t5;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class pb {
    public final List a;

    public pb(List list) {
        this.a = list;
    }

    public void a(Context context) throws InterruptedException {
        if (f0.a()) {
            fb.b("VideoLoaderUtils: Method load called from main thread");
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(this.a.size());
        for (o5 o5Var : this.a) {
            VideoData videoData = (VideoData) o5Var.a;
            String url = videoData.getUrl();
            ob.a().b(url, new a(videoData, countDownLatch, o5Var, url), context);
        }
        try {
            countDownLatch.await();
            fb.a("VideoLoaderUtils: success media loading");
        } catch (InterruptedException unused) {
            fb.a("VideoLoaderUtils: awaiting media files load failed");
        }
    }

    public class a implements t5.a {
        public final /* synthetic */ VideoData a;
        public final /* synthetic */ CountDownLatch b;
        public final /* synthetic */ o5 c;
        public final /* synthetic */ String d;

        public a(VideoData videoData, CountDownLatch countDownLatch, o5 o5Var, String str) {
            this.a = videoData;
            this.b = countDownLatch;
            this.c = o5Var;
            this.d = str;
        }

        @Override // com.my.target.t5.a
        public void a() {
            this.a.a((Object) null);
            this.b.countDown();
            this.c.b.c(0, 4001, "videoUrl=" + this.d);
        }

        @Override // com.my.target.t5.a
        public void a(String str) {
            this.a.a(str);
            this.b.countDown();
        }
    }

    public static pb a(VideoData videoData) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new o5(videoData, h0.e));
        return a(arrayList);
    }

    public static pb a(List list) {
        return new pb(list);
    }
}
