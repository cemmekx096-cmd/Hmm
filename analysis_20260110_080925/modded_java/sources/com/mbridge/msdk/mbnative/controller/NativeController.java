package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.crashlytics.android.BuildConfig;
import com.google.firebase.messaging.Constants;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.same.task.a;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.mbnative.controller.c;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.out.OnImageLoadListener;
import com.mbridge.msdk.playercommon.VideoFeedsPlayer;
import io.fabric.sdk.android.services.events.EventsFilesManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class NativeController extends com.mbridge.msdk.mbnative.controller.a {
    private static final String c0 = "NativeController";
    public static Map<String, Long> d0 = new HashMap();
    private static boolean e0;
    private int A;
    private int B;
    private com.mbridge.msdk.foundation.same.task.b C;
    private List<com.mbridge.msdk.mbnative.controller.c> D;
    private List<c.d> E;
    private CopyOnWriteArrayList<com.mbridge.msdk.foundation.same.task.a> F;
    private Hashtable<String, AdSession> G;
    private int H;
    private int I;
    private n J;
    private boolean K;
    private boolean L;
    private Timer M;
    private String N;
    private String O;
    private ViewTreeObserver.OnGlobalLayoutListener P;
    private com.mbridge.msdk.setting.l Q;
    private long R;
    private int S;
    private int T;
    private boolean U;
    private int V;
    private int W;
    private boolean X;
    private List<Campaign> Y;
    private String Z;
    private AdSession a0;
    protected List<Integer> b;
    private AdEvents b0;
    protected List<Integer> c;
    Map<String, Object> d;
    private com.mbridge.msdk.setting.j e;
    private com.mbridge.msdk.mbnative.listener.a f;
    private NativeListener.NativeTrackingListener g;
    private Context h;
    private String i;
    private String j;
    private Queue<Integer> k;
    private Queue<Long> l;
    private String m;
    private com.mbridge.msdk.foundation.same.report.h n;
    private String o;
    private com.mbridge.msdk.click.a p;
    private int q;
    private int r;
    private int s;
    private int t;
    private String u;
    private boolean v;
    private boolean w;
    private boolean x;
    private int y;
    private int z;

    class a implements Runnable {
        final /* synthetic */ List a;
        final /* synthetic */ NativeListener.NativeAdListener b;
        final /* synthetic */ int c;

        a(List list, NativeListener.NativeAdListener nativeAdListener, int i) {
            this.a = list;
            this.b = nativeAdListener;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            List list = this.a;
            if (list != null && list.size() > 0) {
                CampaignEx campaignEx = (CampaignEx) this.a.get(0);
                NativeController.this.O = campaignEx.getRequestId();
                NativeController.this.Y = this.a;
            }
            NativeController.this.v = true;
            this.b.onAdLoaded(this.a, this.c);
            com.mbridge.msdk.mbnative.report.a.a(NativeController.this.h, (List<Campaign>) this.a, NativeController.this.i);
        }
    }

    class b implements Runnable {
        final /* synthetic */ com.mbridge.msdk.mbnative.listener.a a;
        final /* synthetic */ CampaignEx b;
        final /* synthetic */ String c;

        b(com.mbridge.msdk.mbnative.listener.a aVar, CampaignEx campaignEx, String str) {
            this.a = aVar;
            this.b = campaignEx;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(this.b, this.c);
        }
    }

    class c implements com.mbridge.msdk.foundation.same.image.c {
        c() {
        }

        public void onFailedLoad(String str, String str2) {
        }

        public void onSuccessLoad(Bitmap bitmap, String str) {
        }
    }

    class d extends TimerTask {
        final /* synthetic */ long a;
        final /* synthetic */ o b;
        final /* synthetic */ List c;

        d(long j, o oVar, List list) {
            this.a = j;
            this.b = oVar;
            this.c = list;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            boolean z;
            if (System.currentTimeMillis() - this.a >= 60000) {
                this.b.a();
                NativeController.this.c();
                return;
            }
            int iS = k0.s(NativeController.this.h);
            int iQ = NativeController.this.h().q();
            if (iS != 9 && iQ == 2) {
                this.b.a();
                NativeController.this.c();
                return;
            }
            if (iQ == 3) {
                this.b.a();
                NativeController.this.c();
                return;
            }
            loop0: while (true) {
                z = false;
                for (CampaignEx campaignEx : this.c) {
                    String id = campaignEx.getId();
                    if (campaignEx instanceof CampaignEx) {
                        CampaignEx campaignEx2 = campaignEx;
                        id = id + campaignEx2.getVideoUrlEncode() + campaignEx2.getBidToken();
                    }
                    com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(NativeController.this.i, id);
                    if (aVarA == null || !com.mbridge.msdk.videocommon.download.l.a(aVarA, NativeController.this.h().C())) {
                        break;
                    } else {
                        z = true;
                    }
                }
            }
            if (z) {
                this.b.a();
                NativeController.this.c();
            }
        }
    }

    class e implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ ImageView a;
        final /* synthetic */ View b;

        e(ImageView imageView, View view) {
            this.a = imageView;
            this.b = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.a != null) {
                this.a.setLayoutParams(new FrameLayout.LayoutParams(this.b.getWidth(), this.b.getHeight()));
            }
        }
    }

    class f extends com.mbridge.msdk.widget.a {
        final /* synthetic */ CampaignEx b;

        f(CampaignEx campaignEx) {
            this.b = campaignEx;
        }

        protected void a(View view) {
            NativeController.this.b(view.getContext(), this.b);
        }
    }

    class g extends com.mbridge.msdk.widget.a {
        final /* synthetic */ CampaignEx b;

        g(CampaignEx campaignEx) {
            this.b = campaignEx;
        }

        protected void a(View view) {
            NativeController.this.b(view.getContext(), this.b);
        }
    }

    class h implements com.mbridge.msdk.widget.dialog.b {
        final /* synthetic */ CampaignEx a;

        h(CampaignEx campaignEx) {
            this.a = campaignEx;
        }

        public void a() {
        }

        public void b() {
            NativeController.this.p.a(this.a, NativeController.this.f);
            NativeController.this.b(this.a);
        }

        public void c() {
        }
    }

    class i extends com.mbridge.msdk.widget.a {
        final /* synthetic */ CampaignEx b;

        i(CampaignEx campaignEx) {
            this.b = campaignEx;
        }

        protected void a(View view) {
            NativeController.this.b(view.getContext(), this.b);
        }
    }

    class j implements a.a {
        final /* synthetic */ s a;

        j(s sVar) {
            this.a = sVar;
        }

        public void a(a.b bVar) {
            if (bVar != a.b.e || NativeController.this.F == null || NativeController.this.F.size() <= 0 || !NativeController.this.F.contains(this.a)) {
                return;
            }
            NativeController.this.F.remove(this.a);
        }
    }

    class k implements c.d {
        final /* synthetic */ CampaignEx a;

        k(CampaignEx campaignEx) {
            this.a = campaignEx;
        }

        public void a(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
            if (arrayList == null || arrayList.size() <= 0) {
                return;
            }
            com.mbridge.msdk.mbnative.report.b.a(this.a, NativeController.this.h, NativeController.this.i, NativeController.this.f);
        }
    }

    class l implements o {
        final /* synthetic */ List a;
        final /* synthetic */ int b;
        final /* synthetic */ com.mbridge.msdk.mbnative.listener.a c;
        final /* synthetic */ List d;

        l(List list, int i, com.mbridge.msdk.mbnative.listener.a aVar, List list2) {
            this.a = list;
            this.b = i;
            this.c = aVar;
            this.d = list2;
        }

        @Override // com.mbridge.msdk.mbnative.controller.NativeController.o
        public void a() {
            List listA = NativeController.this.a((List<Campaign>) this.a, true);
            if (listA == null || listA.size() <= 0) {
                NativeController.this.a(this.c, "has no ads", (CampaignEx) this.d.get(0));
            } else {
                NativeController.this.a((List<Campaign>) listA, this.b, (NativeListener.NativeAdListener) this.c);
            }
        }
    }

    class m implements o {
        final /* synthetic */ List a;
        final /* synthetic */ int b;
        final /* synthetic */ com.mbridge.msdk.mbnative.listener.a c;

        m(List list, int i, com.mbridge.msdk.mbnative.listener.a aVar) {
            this.a = list;
            this.b = i;
            this.c = aVar;
        }

        @Override // com.mbridge.msdk.mbnative.controller.NativeController.o
        public void a() {
            List listA = NativeController.this.a((List<Campaign>) this.a, false);
            if (listA == null || listA.size() <= 0) {
                NativeController.this.a(this.c, "has no ads", (CampaignEx) null);
            } else {
                NativeController.this.a((List<Campaign>) listA, this.b, (NativeListener.NativeAdListener) this.c);
            }
        }
    }

    public class n extends com.mbridge.msdk.mbnative.service.net.b implements com.mbridge.msdk.foundation.same.task.d {
        private Runnable d;
        private boolean c = false;
        private boolean e = true;
        private List<String> f = null;

        class a extends c.a {
            final /* synthetic */ CampaignEx a;

            a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
                this.a = campaignEx;
            }

            public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
                com.mbridge.msdk.mbnative.report.a.a(str, cVar, this.a, NativeController.this.h, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
            }
        }

        public n() {
        }

        public void a(boolean z) {
            this.c = z;
        }

        public void b(boolean z) {
            this.e = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v10 */
        /* JADX WARN: Type inference failed for: r14v11, types: [int] */
        /* JADX WARN: Type inference failed for: r14v12 */
        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(List<com.mbridge.msdk.tracker.network.g> list, CampaignUnit campaignUnit) {
            Integer num;
            boolean z = true;
            NativeController.this.U = true;
            com.mbridge.msdk.foundation.db.j jVarA = com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(NativeController.this.h));
            jVarA.a();
            Runnable runnable = this.d;
            if (runnable != null) {
                ((com.mbridge.msdk.mbnative.controller.a) NativeController.this).a.removeCallbacks(runnable);
            }
            if (com.mbridge.msdk.util.b.a()) {
                NativeController.this.a(campaignUnit);
            }
            if (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0) {
                ((com.mbridge.msdk.foundation.same.net.c) this).unitId = "0_" + ((com.mbridge.msdk.foundation.same.net.c) this).unitId;
                com.mbridge.msdk.mbnative.controller.d.b(NativeController.this.s, ((com.mbridge.msdk.foundation.same.net.c) this).unitId);
                NativeController.this.t = 0;
                return;
            }
            NativeController.this.o = campaignUnit.getSessionId();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            if (NativeController.this.S <= 0) {
                if (NativeController.this.S == -3) {
                    NativeController.this.S = campaignUnit.getAds().size();
                } else {
                    NativeController nativeController = NativeController.this;
                    nativeController.S = nativeController.r;
                }
                if (NativeController.this.V != 0 && campaignUnit.getTemplate() == 2) {
                    NativeController nativeController2 = NativeController.this;
                    nativeController2.S = nativeController2.V;
                }
                if (NativeController.this.W != 0 && campaignUnit.getTemplate() == 3) {
                    NativeController nativeController3 = NativeController.this;
                    nativeController3.S = nativeController3.W;
                }
            }
            int i = 0;
            while (i < campaignUnit.getAds().size()) {
                CampaignEx campaignEx = (CampaignEx) campaignUnit.getAds().get(i);
                campaignEx.setCampaignUnitId(((com.mbridge.msdk.foundation.same.net.c) this).unitId);
                if (!TextUtils.isEmpty(NativeController.this.N)) {
                    campaignEx.setBidToken(NativeController.this.N);
                    campaignEx.setIsBidCampaign(z);
                }
                if (NativeController.e0) {
                    campaignEx.loadIconUrlAsyncWithBlock((OnImageLoadListener) null);
                    campaignEx.loadImageUrlAsyncWithBlock((OnImageLoadListener) null);
                }
                boolean zC = t0.c(NativeController.this.h, campaignEx.getPackageName());
                NativeController nativeController4 = NativeController.this;
                nativeController4.a(nativeController4.h, campaignEx);
                if (i < NativeController.this.r && campaignEx.getOfferType() != 99) {
                    if (t0.c(campaignEx)) {
                        campaignEx.setRtinsType((int) (zC ? z : 2));
                    }
                    if (com.mbridge.msdk.foundation.same.c.b(NativeController.this.h, campaignEx)) {
                        arrayList.add(campaignEx);
                        if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                            arrayList3.add(campaignEx);
                        }
                    } else {
                        t0.a(((com.mbridge.msdk.foundation.same.net.c) this).unitId, campaignEx, com.mbridge.msdk.foundation.same.a.x);
                        NativeController.this.Z = "APP ALREADY INSTALLED";
                    }
                    a(campaignEx, null, null);
                }
                if (i < NativeController.this.S && campaignEx.getOfferType() != 99) {
                    if (t0.c(campaignEx)) {
                        campaignEx.setRtinsType(zC ? 1 : 2);
                    }
                    if (!zC || t0.c(campaignEx)) {
                        arrayList2.add(campaignEx);
                    }
                }
                if (!jVarA.a(campaignEx.getId())) {
                    com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                    gVar.a(campaignEx.getId());
                    gVar.b(campaignEx.getFca());
                    gVar.c(campaignEx.getFcb());
                    gVar.a(0);
                    gVar.d(0);
                    gVar.a(System.currentTimeMillis());
                    jVarA.b(gVar);
                }
                com.mbridge.msdk.click.c.a(NativeController.this.h, campaignEx.getMaitve(), campaignEx.getMaitve_src());
                i++;
                z = true;
            }
            NativeController.this.d(arrayList3);
            int type = campaignUnit.getAds().get(0) != null ? ((CampaignEx) campaignUnit.getAds().get(0)).getType() : 1;
            com.mbridge.msdk.mbnative.cache.b bVarA = com.mbridge.msdk.mbnative.cache.c.a(type);
            if (bVarA != null) {
                bVarA.a(((com.mbridge.msdk.foundation.same.net.c) this).unitId, arrayList2, NativeController.this.N);
            }
            if (arrayList.size() == 0) {
                if (NativeController.this.Z.contains("INSTALLED")) {
                    NativeController.this.a("APP ALREADY INSTALLED", a(), b(), (CampaignEx) campaignUnit.getAds().get(0));
                    new com.mbridge.msdk.foundation.error.b(880021, "APP ALREADY INSTALLED");
                    return;
                } else {
                    NativeController.this.a("v3 response error", a(), b(), (CampaignEx) campaignUnit.getAds().get(0));
                    new com.mbridge.msdk.foundation.error.b(880003);
                    return;
                }
            }
            NativeController nativeController5 = NativeController.this;
            nativeController5.c((List<Campaign>) nativeController5.a(type, (List<Campaign>) nativeController5.a(arrayList)));
            if (com.mbridge.msdk.mbnative.controller.d.g().containsKey(((com.mbridge.msdk.foundation.same.net.c) this).unitId) && Boolean.TRUE.equals(com.mbridge.msdk.mbnative.controller.d.g().get(((com.mbridge.msdk.foundation.same.net.c) this).unitId))) {
                com.mbridge.msdk.mbnative.controller.d.a(NativeController.this.s, ((com.mbridge.msdk.foundation.same.net.c) this).unitId);
                return;
            }
            int iIntValue = (!com.mbridge.msdk.mbnative.controller.d.d().containsKey(((com.mbridge.msdk.foundation.same.net.c) this).unitId) || (num = (Integer) com.mbridge.msdk.mbnative.controller.d.d().get(((com.mbridge.msdk.foundation.same.net.c) this).unitId)) == null) ? 1 : num.intValue();
            int i2 = NativeController.this.r + NativeController.this.t;
            NativeController.this.t = i2 <= iIntValue ? i2 : 0;
        }

        public void b(List<String> list) {
            this.f = list;
        }

        private void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            try {
                com.mbridge.msdk.foundation.same.c.a(campaignEx, NativeController.this.h, cVar, new a(campaignEx, aVar));
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(int i, String str) {
            NativeController.this.U = true;
            if (this.c) {
                if (NativeController.this.v || !this.e) {
                    return;
                }
                NativeController.this.a(str, a(), b(), (CampaignEx) null);
                return;
            }
            if (i == -1) {
                com.mbridge.msdk.mbnative.controller.d.b(NativeController.this.s, ((com.mbridge.msdk.foundation.same.net.c) this).unitId);
                NativeController.this.t = 0;
            }
            Runnable runnable = this.d;
            if (runnable != null) {
                ((com.mbridge.msdk.mbnative.controller.a) NativeController.this).a.removeCallbacks(runnable);
            }
            if (NativeController.this.v) {
                return;
            }
            if (a() == 1 || this.e) {
                NativeController.this.a(str, a(), b(), (CampaignEx) null);
            }
        }

        public void a(Runnable runnable) {
            this.d = runnable;
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(List<Frame> list) {
            if (this.c) {
                return;
            }
            Runnable runnable = this.d;
            if (runnable != null) {
                ((com.mbridge.msdk.mbnative.controller.a) NativeController.this).a.removeCallbacks(runnable);
            }
            if (list == null || list.size() == 0) {
                if (NativeController.this.f != null) {
                    NativeController.this.v = true;
                    NativeController.this.f.onAdLoadError("frame is empty");
                    return;
                }
                return;
            }
            Iterator<Frame> it = list.iterator();
            while (it.hasNext()) {
                List<Campaign> campaigns = it.next().getCampaigns();
                if (campaigns == null || campaigns.size() == 0) {
                    if (NativeController.this.f != null) {
                        NativeController.this.v = true;
                        NativeController.this.f.onAdLoadError("ads in frame is empty");
                        return;
                    }
                    return;
                }
                for (Campaign campaign : campaigns) {
                    if (NativeController.e0) {
                        campaign.loadImageUrlAsyncWithBlock((OnImageLoadListener) null);
                        campaign.loadIconUrlAsyncWithBlock((OnImageLoadListener) null);
                    }
                }
            }
            if (NativeController.this.f != null) {
                NativeController.this.f.onAdFramesLoaded(list);
            }
        }
    }

    public interface o {
        void a();
    }

    public class p implements Runnable {
        private int a;
        private com.mbridge.msdk.foundation.same.task.d b;
        private int c;
        private String d;

        public p(int i, com.mbridge.msdk.foundation.same.task.d dVar, int i2, String str) {
            this.a = i;
            this.b = dVar;
            this.c = i2;
            this.d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.b.a(true);
            int i = this.a;
            if (i == 1) {
                NativeController.this.U = true;
                NativeController.this.a("REQUEST_TIMEOUT", this.c, this.d, (CampaignEx) null);
            } else {
                if (i != 2) {
                    return;
                }
                if (!NativeController.this.v || this.c == 1) {
                    NativeController.this.a("REQUEST_TIMEOUT", this.c, this.d, (CampaignEx) null);
                }
            }
        }
    }

    private static class q implements H5DownLoadManager.IH5SourceDownloadListener {
        private String a;
        private CampaignEx b;
        private long c = System.currentTimeMillis();
        private boolean d;

        public q(String str, CampaignEx campaignEx, boolean z) {
            this.d = true;
            this.a = str;
            this.b = campaignEx;
            this.d = z;
        }

        public void onFailed(String str, String str2) {
            try {
                if (this.d) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.c;
                    com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().d()));
                    com.mbridge.msdk.foundation.entity.m mVar = new com.mbridge.msdk.foundation.entity.m("2000043", 3, jCurrentTimeMillis + BuildConfig.FLAVOR, str, this.b.getId(), this.a, str2, "2");
                    mVar.n(this.b.getRequestId());
                    mVar.k(this.b.getCurrentLocalRid());
                    mVar.o(this.b.getRequestIdNotice());
                    CampaignEx campaignEx = this.b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        mVar.b(this.b.getId());
                    }
                    CampaignEx campaignEx2 = this.b;
                    if (campaignEx2 != null) {
                        mVar.a(campaignEx2.getAdSpaceT());
                    }
                    mVar.a(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    com.mbridge.msdk.foundation.same.report.g.a(mVar, this.a, this.b);
                }
            } catch (Exception e) {
                o0.b(NativeController.c0, com.mbridge.msdk.mbnative.common.a.a(e));
            }
        }

        public void onSuccess(String str, String str2, boolean z) {
            try {
                if (this.d) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.c;
                    com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().d()));
                    com.mbridge.msdk.foundation.entity.m mVar = new com.mbridge.msdk.foundation.entity.m("2000043", 1, jCurrentTimeMillis + BuildConfig.FLAVOR, str, this.b.getId(), this.a, BuildConfig.FLAVOR, "2");
                    CampaignEx campaignEx = this.b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        mVar.b(this.b.getId());
                    }
                    CampaignEx campaignEx2 = this.b;
                    if (campaignEx2 != null) {
                        mVar.n(campaignEx2.getRequestId());
                        mVar.o(this.b.getRequestIdNotice());
                        mVar.k(this.b.getCurrentLocalRid());
                        mVar.a(this.b.getAdSpaceT());
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        mVar.q(str2);
                    }
                    mVar.a(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    com.mbridge.msdk.foundation.same.report.g.a(mVar, this.a, this.b);
                }
            } catch (Exception e) {
                o0.b(NativeController.c0, com.mbridge.msdk.mbnative.common.a.a(e));
            }
        }
    }

    protected static class r extends Handler {
        private WeakReference<NativeController> a;

        public r(NativeController nativeController) {
            this.a = new WeakReference<>(nativeController);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<NativeController> weakReference;
            NativeController nativeController;
            super.handleMessage(message);
            try {
                if (message.what == 0 && (weakReference = this.a) != null && (nativeController = weakReference.get()) != null) {
                    nativeController.n.a(message.arg1, (String) message.obj);
                }
                if (message.what == 1) {
                    NativeController nativeController2 = null;
                    WeakReference<NativeController> weakReference2 = this.a;
                    if (weakReference2 != null && weakReference2.get() != null) {
                        nativeController2 = this.a.get();
                    }
                    if (nativeController2 != null) {
                        nativeController2.w = true;
                        List<Campaign> listA = nativeController2.a(nativeController2.i, nativeController2.r, nativeController2.N);
                        if (nativeController2.v) {
                            return;
                        }
                        nativeController2.c(listA);
                    }
                }
            } catch (Exception e) {
                o0.b(NativeController.c0, com.mbridge.msdk.mbnative.common.a.a(e));
            }
        }
    }

    private static class s extends com.mbridge.msdk.foundation.same.task.a {
        private CampaignEx a;
        private WeakReference<View> b;
        private WeakReference<List<View>> c;
        private WeakReference<NativeController> d;
        private WeakReference<AdSession> e;

        public s(CampaignEx campaignEx, View view, List<View> list, NativeController nativeController, AdSession adSession) {
            this.a = campaignEx;
            this.b = new WeakReference<>(view);
            this.c = new WeakReference<>(list);
            this.d = new WeakReference<>(nativeController);
            this.e = new WeakReference<>(adSession);
        }

        public void cancelTask() {
        }

        public void pauseTask(boolean z) {
        }

        public void runTask() {
            WeakReference<View> weakReference;
            try {
                if (this.d == null || (weakReference = this.b) == null || this.c == null) {
                    return;
                }
                View view = weakReference.get();
                List<View> list = this.c.get();
                NativeController nativeController = this.d.get();
                WeakReference<AdSession> weakReference2 = this.e;
                AdSession adSession = weakReference2 != null ? weakReference2.get() : null;
                if (view == null || nativeController == null) {
                    return;
                }
                nativeController.a(this.a, view, list, adSession);
            } catch (Exception e) {
                o0.b(NativeController.c0, com.mbridge.msdk.mbnative.common.a.a(e));
            }
        }
    }

    private static final class t implements H5DownLoadManager.ZipDownloadListener {
        String a;
        CampaignEx b;
        private long c = System.currentTimeMillis();
        private boolean d;

        public t(String str, CampaignEx campaignEx, boolean z) {
            this.d = true;
            this.a = str;
            this.b = campaignEx;
            this.d = z;
        }

        public void onFailed(String str, String str2) {
            try {
                if (this.d) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.c;
                    com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().d()));
                    com.mbridge.msdk.foundation.entity.m mVar = new com.mbridge.msdk.foundation.entity.m("2000043", 3, jCurrentTimeMillis + BuildConfig.FLAVOR, str2, this.b.getId(), this.a, str, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    CampaignEx campaignEx = this.b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        mVar.b(this.b.getId());
                    }
                    CampaignEx campaignEx2 = this.b;
                    if (campaignEx2 != null) {
                        mVar.n(campaignEx2.getRequestId());
                        mVar.k(this.b.getCurrentLocalRid());
                        mVar.o(this.b.getRequestIdNotice());
                        mVar.a(this.b.getAdSpaceT());
                    }
                    mVar.a("2");
                    com.mbridge.msdk.foundation.same.report.g.a(mVar, this.a, this.b);
                }
            } catch (Exception e) {
                o0.b(NativeController.c0, com.mbridge.msdk.mbnative.common.a.a(e));
            }
        }

        public void onSuccess(String str, String str2, boolean z) {
            try {
                if (this.d) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.c;
                    com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().d()));
                    com.mbridge.msdk.foundation.entity.m mVar = new com.mbridge.msdk.foundation.entity.m("2000043", 1, jCurrentTimeMillis + BuildConfig.FLAVOR, str, this.b.getId(), this.a, BuildConfig.FLAVOR, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    CampaignEx campaignEx = this.b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        mVar.b(this.b.getId());
                    }
                    CampaignEx campaignEx2 = this.b;
                    if (campaignEx2 != null) {
                        mVar.n(campaignEx2.getRequestId());
                        mVar.k(this.b.getCurrentLocalRid());
                        mVar.o(this.b.getRequestIdNotice());
                        mVar.a(this.b.getAdSpaceT());
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        mVar.q(str2);
                    }
                    mVar.a("2");
                    com.mbridge.msdk.foundation.same.report.g.a(mVar, this.a, this.b);
                }
            } catch (Exception e) {
                o0.b(NativeController.c0, com.mbridge.msdk.mbnative.common.a.a(e));
            }
        }
    }

    public NativeController(com.mbridge.msdk.mbnative.listener.a aVar, NativeListener.NativeTrackingListener nativeTrackingListener, Map<String, Object> map, Context context) {
        int iIntValue;
        Object obj;
        this.q = 1;
        this.r = 1;
        this.s = -1;
        this.t = 0;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.F = new CopyOnWriteArrayList<>();
        this.G = new Hashtable<>();
        this.H = 1;
        this.I = 2;
        this.N = BuildConfig.FLAVOR;
        this.O = BuildConfig.FLAVOR;
        this.Z = BuildConfig.FLAVOR;
        this.h = context;
        this.d = map;
        this.e = new com.mbridge.msdk.setting.j();
        this.f = aVar;
        this.g = nativeTrackingListener;
        this.D = new ArrayList();
        this.E = new ArrayList();
        String str = (String) map.get("unit_id");
        this.i = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!map.containsKey(MBridgeConstans.PLACEMENT_ID) || map.get(MBridgeConstans.PLACEMENT_ID) == null) {
            this.j = BuildConfig.FLAVOR;
        } else {
            this.j = (String) map.get(MBridgeConstans.PLACEMENT_ID);
        }
        if (map.containsKey("isPreloadImg") && (obj = map.get("isPreloadImg")) != null) {
            e0 = ((Boolean) obj).booleanValue();
        }
        this.k = new LinkedList();
        this.l = new LinkedList();
        this.C = new com.mbridge.msdk.foundation.same.task.b(this.h);
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        ((com.mbridge.msdk.mbnative.controller.a) this).a = new r(this);
        if (map.containsKey("catetory")) {
            this.u = (String) map.get("catetory");
        }
        try {
            boolean zEquals = com.mbridge.msdk.mbnative.controller.d.g().containsKey(this.i) ? Boolean.TRUE.equals(com.mbridge.msdk.mbnative.controller.d.g().get(this.i)) : false;
            Object obj2 = map.get("ad_num");
            Object obj3 = map.get("ad_frame_num");
            if (!zEquals) {
                if (map.containsKey("ad_num") && obj2 != null) {
                    try {
                        iIntValue = ((Integer) obj2).intValue();
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            o0.b(c0, e2.getMessage());
                        }
                        iIntValue = 1;
                    }
                    iIntValue = iIntValue < 1 ? 1 : iIntValue;
                    iIntValue = iIntValue > 10 ? 10 : iIntValue;
                    this.r = iIntValue;
                    this.q = iIntValue;
                }
                if (map.containsKey("ad_frame_num") && obj3 != null) {
                    try {
                        this.A = ((Integer) obj3).intValue();
                    } catch (Exception e3) {
                        if (MBridgeConstans.DEBUG) {
                            o0.b(c0, e3.getMessage());
                        }
                    }
                }
            } else if (com.mbridge.msdk.mbnative.controller.d.c().containsKey(this.i)) {
                Integer num = (Integer) com.mbridge.msdk.mbnative.controller.d.c().get(this.i);
                if (num != null) {
                    this.r = num.intValue();
                }
                if (map.containsKey("ad_num") && obj2 != null) {
                    int iIntValue2 = ((Integer) obj2).intValue();
                    this.y = iIntValue2;
                    this.q = iIntValue2;
                }
                if (map.containsKey("ad_frame_num") && obj3 != null) {
                    int iIntValue3 = ((Integer) obj3).intValue();
                    this.z = iIntValue3;
                    this.A = iIntValue3;
                }
            }
        } catch (Exception e4) {
            o0.b(c0, com.mbridge.msdk.mbnative.common.a.a(e4));
        }
        this.n = new com.mbridge.msdk.foundation.same.report.h(this.h);
        this.p = new com.mbridge.msdk.click.a(this.h, this.i);
        try {
            int i2 = MBMediaView.p0;
            this.L = true;
            Map<String, Object> map2 = this.d;
            if (map2 != null && (map2.containsKey("native_video_width") || this.d.containsKey("native_video_height") || map.containsKey("videoSupport"))) {
                this.K = true;
            }
            com.mbridge.msdk.mbnative.controller.e.a(this.h, this.i);
            m0.a();
            if (TextUtils.isEmpty(this.i)) {
                return;
            }
            com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.h)).a();
            int iA = a(map.containsKey("native_info") ? (String) map.get("native_info") : null);
            List<Campaign> listA = a(this.i, iA <= 0 ? this.q : iA);
            if (listA != null) {
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < listA.size(); i3++) {
                    CampaignEx campaignEx = listA.get(i3);
                    if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                        arrayList.add(campaignEx);
                    }
                }
                if (arrayList.size() > 0) {
                    Object objInvoke = com.mbridge.msdk.videocommon.download.b.class.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                    com.mbridge.msdk.videocommon.download.b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, com.mbridge.msdk.videocommon.listener.a.class).invoke(objInvoke, context, this.i, new CopyOnWriteArrayList(arrayList), 1, null);
                    com.mbridge.msdk.videocommon.download.b.class.getMethod("load", String.class).invoke(objInvoke, this.i);
                }
            }
        } catch (Throwable unused) {
            o0.b(c0, "please import the nativex aar");
        }
    }

    private List<Campaign> e(List<Campaign> list) {
        if (list != null) {
            CampaignEx campaignEx = null;
            for (int size = list.size() - 1; size >= 0; size--) {
                try {
                    campaignEx = (CampaignEx) list.get(size);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                if (campaignEx != null && TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                    Campaign campaignRemove = list.remove(size);
                    com.mbridge.msdk.mbnative.cache.c.a(campaignEx.getType()).a(this.i, campaignRemove, this.N);
                    o0.a(c0, "remove no videoURL ads:" + campaignRemove);
                }
            }
        }
        return list;
    }

    private void f() throws JSONException {
        try {
            if (this.m == null) {
                return;
            }
            JSONArray jSONArray = new JSONArray(this.m);
            if (jSONArray.length() > 0) {
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.opt(i2);
                    int iOptInt = jSONObject.optInt("id", 0);
                    if (2 == iOptInt) {
                        this.V = jSONObject.optInt("ad_num");
                        if (this.T > 0) {
                            jSONObject.remove("ad_num");
                            jSONObject.put("ad_num", this.T);
                        }
                    } else if (3 == iOptInt) {
                        this.W = jSONObject.optInt("ad_num");
                        if (this.T > 0) {
                            jSONObject.remove("ad_num");
                            jSONObject.put("ad_num", this.T);
                        }
                    }
                }
            }
            this.H = Math.max(this.V, this.W);
            this.m = jSONArray.toString();
        } catch (JSONException e2) {
            o0.b(c0, com.mbridge.msdk.mbnative.common.a.a(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.setting.l h() {
        com.mbridge.msdk.setting.l lVarE = com.mbridge.msdk.setting.h.b().e(BuildConfig.FLAVOR, this.i);
        this.Q = lVarE;
        if (lVarE == null) {
            this.Q = com.mbridge.msdk.setting.l.i(this.i);
        }
        return this.Q;
    }

    public String g() {
        return this.O;
    }

    public void i() {
        Runnable runnable;
        com.mbridge.msdk.foundation.same.task.b bVar = this.C;
        if (bVar != null) {
            bVar.a();
            this.C = null;
        }
        Hashtable<String, AdSession> hashtable = this.G;
        if (hashtable != null) {
            for (AdSession adSession : hashtable.values()) {
                if (adSession != null) {
                    adSession.finish();
                }
            }
            this.G.clear();
        }
        Handler handler = ((com.mbridge.msdk.mbnative.controller.a) this).a;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.g = null;
        this.p.c();
        try {
            Context context = this.h;
            if (context != null) {
                com.mbridge.msdk.foundation.same.image.b.a(context).b();
            }
            List<com.mbridge.msdk.mbnative.controller.c> list = this.D;
            if (list != null && list.size() > 0) {
                Iterator<com.mbridge.msdk.mbnative.controller.c> it = this.D.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
                this.D.clear();
                this.D = null;
            }
            List<c.d> list2 = this.E;
            if (list2 != null && list2.size() > 0) {
                for (c.d dVar : this.E) {
                }
                this.E.clear();
                this.E = null;
            }
            CopyOnWriteArrayList<com.mbridge.msdk.foundation.same.task.a> copyOnWriteArrayList = this.F;
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                return;
            }
            Iterator<com.mbridge.msdk.foundation.same.task.a> it2 = this.F.iterator();
            if (it2.hasNext() && (runnable = (com.mbridge.msdk.foundation.same.task.a) it2.next()) != null) {
                runnable.cancel();
                ((com.mbridge.msdk.mbnative.controller.a) this).a.removeCallbacks(runnable);
            }
            this.F.clear();
        } catch (Exception unused) {
        }
    }

    public void j() {
        List<Integer> list = this.b;
        if (list != null && list.size() > 0) {
            Queue<Integer> queue = this.k;
            if (queue != null && queue.size() > 0) {
                this.k.clear();
            }
            for (Integer num : this.b) {
                Queue<Integer> queue2 = this.k;
                if (queue2 != null) {
                    queue2.add(num);
                }
            }
        }
        List<Integer> list2 = this.c;
        if (list2 == null || list2.size() <= 0) {
            return;
        }
        Queue<Long> queue3 = this.l;
        if (queue3 != null && queue3.size() > 0) {
            this.l.clear();
        }
        for (Integer num2 : this.c) {
            Queue<Long> queue4 = this.l;
            if (queue4 != null) {
                queue4.add(Long.valueOf(num2.intValue() * VideoFeedsPlayer.INTERVAL_TIME_PLAY_TIME_CD_THREAD));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    try {
                        int i2 = MBMediaView.p0;
                        Object objInvoke = com.mbridge.msdk.videocommon.download.b.class.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                        if (objInvoke != null) {
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, com.mbridge.msdk.videocommon.listener.a.class).invoke(objInvoke, this.h, this.i, new CopyOnWriteArrayList(list), 1, null);
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("load", String.class).invoke(objInvoke, this.i);
                        }
                        Iterator<CampaignEx> it = list.iterator();
                        while (it.hasNext()) {
                            CampaignEx next = it.next();
                            if (next != null && !TextUtils.isEmpty(next.getImageUrl())) {
                                com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.m().d()).a(next.getImageUrl(), new c());
                            }
                            String str = BuildConfig.FLAVOR;
                            if (next != null) {
                                try {
                                    str = next.getendcard_url();
                                } catch (Exception unused) {
                                }
                            }
                            com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                            cVar.a(next);
                            if (!TextUtils.isEmpty(str)) {
                                cVar.f((next == null || next.getAabEntity() == null) ? 0 : next.getAabEntity().h3c);
                                if (str.contains(".zip") && str.contains("md5filename")) {
                                    H5DownLoadManager.getInstance().downloadH5Res(cVar, str, new t(this.i, next, TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(str))));
                                } else {
                                    H5DownLoadManager.getInstance().downloadH5Res(cVar, str, new q(this.i, next, TextUtils.isEmpty(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str))));
                                }
                            }
                        }
                    } catch (Throwable unused2) {
                        o0.b(c0, "please import the videocommon and nativex aar");
                    }
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(List<Campaign> list) {
        if ((!TextUtils.isEmpty(this.N) && list != null && list.size() == 0) || list == null || list.size() <= 0) {
            return false;
        }
        com.mbridge.msdk.mbnative.listener.a aVar = this.f;
        if (aVar == null) {
            return true;
        }
        CampaignEx campaignEx = (CampaignEx) list.get(0);
        if (campaignEx != null && campaignEx.isActiveOm()) {
            AdSession adSessionA = a(campaignEx);
            this.a0 = adSessionA;
            if (adSessionA != null) {
                adSessionA.start();
                AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(this.a0);
                this.b0 = adEventsCreateAdEvents;
                adEventsCreateAdEvents.loaded();
            }
        }
        int template = campaignEx != null ? campaignEx.getTemplate() : 2;
        com.mbridge.msdk.foundation.db.j jVarA = com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(this.h));
        jVarA.a();
        for (int i2 = 0; i2 < list.size(); i2++) {
            CampaignEx campaignEx2 = list.get(i2);
            if (!jVarA.a(campaignEx2.getId())) {
                com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                gVar.a(campaignEx2.getId());
                gVar.b(campaignEx2.getFca());
                gVar.c(campaignEx2.getFcb());
                gVar.a(0);
                gVar.d(0);
                gVar.a(System.currentTimeMillis());
                jVarA.b(gVar);
            }
        }
        if (this.L && this.K) {
            if (h().m() == 3) {
                List<Campaign> listE = e(list);
                if (list.size() > 0) {
                    a(list, new l(listE, template, aVar, list));
                    return true;
                }
                a(aVar, "has no ads", (CampaignEx) null);
                return true;
            }
            List<Campaign> listB = b(list);
            if (listB != null && listB.size() > 0) {
                a(listB, new m(list, template, aVar));
                return true;
            }
            a(list, template, (NativeListener.NativeAdListener) aVar);
            return true;
        }
        if (list.size() > 0) {
            Iterator<Campaign> it = list.iterator();
            while (it.hasNext()) {
                it.next().setVideoLength(0);
            }
            a(list, template, (NativeListener.NativeAdListener) aVar);
            return true;
        }
        a(aVar, "has no ads", (CampaignEx) null);
        return true;
    }

    public static boolean b(Map<String, Object> map) {
        if (map == null) {
            return false;
        }
        try {
            if (map.containsKey("app_id") && map.containsKey("app_key") && map.containsKey("key_word")) {
                return map.get("key_word") != null;
            }
            return false;
        } catch (Exception e2) {
            o0.b(c0, com.mbridge.msdk.mbnative.common.a.a(e2));
            return false;
        }
    }

    public void b(int i2, String str) {
        com.mbridge.msdk.mbnative.listener.a aVar;
        Long lPoll;
        Queue<Integer> queue = this.k;
        if (queue != null && queue.size() > 0) {
            Integer numPoll = this.k.poll();
            int iIntValue = numPoll != null ? numPoll.intValue() : 1;
            this.R = MBridgeConstans.REQUEST_TIME_OUT;
            Queue<Long> queue2 = this.l;
            if (queue2 != null && queue2.size() > 0 && (lPoll = this.l.poll()) != null) {
                this.R = lPoll.longValue();
            }
            b(iIntValue, this.R, i2, str);
            return;
        }
        if (this.v || (aVar = this.f) == null) {
            return;
        }
        this.v = true;
        aVar.onAdLoadError("no ad source");
    }

    public static List<String> a(Map<String, Object> map) {
        Exception e2;
        ArrayList arrayList = null;
        try {
            if (!(map.get("key_word") instanceof String)) {
                return null;
            }
            String str = (String) map.get("key_word");
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == 0) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString("p");
                        if (!TextUtils.isEmpty(strOptString)) {
                            arrayList2.add(strOptString);
                        }
                    }
                } catch (Exception e3) {
                    e2 = e3;
                    arrayList = arrayList2;
                    o0.b(c0, com.mbridge.msdk.mbnative.common.a.a(e2));
                    return arrayList;
                }
            }
            return arrayList2;
        } catch (Exception e4) {
            e2 = e4;
        }
    }

    public String e() {
        ArrayList arrayList = new ArrayList();
        List<Campaign> list = this.Y;
        if (list != null) {
            for (Campaign campaign : list) {
                CampaignEx campaignEx = new CampaignEx();
                campaignEx.setCreativeId(campaign.getCreativeId());
                arrayList.add(campaignEx);
            }
        }
        return com.mbridge.msdk.foundation.same.c.b(arrayList);
    }

    public void b(int i2, long j2, int i3, String str) {
        com.mbridge.msdk.mbnative.cache.b bVarA;
        if (i3 == 0 && (bVarA = com.mbridge.msdk.mbnative.cache.c.a(i2)) != null) {
            if ((i2 == 1 || i2 == 2) && this.d.containsKey("native_info")) {
                this.r = this.H;
            } else {
                this.r = this.q;
            }
            if (c(a(i2, a((List<Campaign>) bVarA.a(this.i, this.r))))) {
                return;
            }
        }
        if (i2 == 1) {
            a(j2, i3, true, this.i, str);
        } else if (i2 != 2) {
            a(i2, j2, i3, str);
        } else {
            a(2, j2, i3, str);
        }
    }

    public List<Campaign> a(String str, int i2) {
        com.mbridge.msdk.mbnative.cache.b bVarA;
        com.mbridge.msdk.setting.l lVarE = com.mbridge.msdk.setting.h.b().e(BuildConfig.FLAVOR, str);
        this.Q = lVarE;
        if (lVarE == null) {
            this.Q = com.mbridge.msdk.setting.l.i(str);
        }
        List<Integer> listB = this.Q.b();
        this.b = listB;
        if (listB == null || listB.size() <= 0 || !this.b.contains(1) || (bVarA = com.mbridge.msdk.mbnative.cache.c.a(1)) == null) {
            return null;
        }
        return (List) bVarA.a(str, i2);
    }

    private int a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() > 0) {
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.opt(i2);
                    if (2 == jSONObject.optInt("id", 0)) {
                        return jSONObject.optInt("ad_num");
                    }
                }
            }
        } catch (Exception e2) {
            o0.b(c0, com.mbridge.msdk.mbnative.common.a.a(e2));
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context, CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                if (campaignEx.needShowIDialog() && com.mbridge.msdk.util.b.a()) {
                    h hVar = new h(campaignEx);
                    if (com.mbridge.msdk.click.c.a(campaignEx) && campaignEx.needShowIDialog()) {
                        if (a(this.p, context, campaignEx, this.i, hVar)) {
                            return;
                        }
                        b(campaignEx);
                        this.f.onAdClick(campaignEx);
                        return;
                    }
                }
            } catch (Throwable th) {
                o0.a(c0, th.getMessage());
            }
        }
        this.p.a(campaignEx, this.f);
        b(campaignEx);
    }

    public void a(String str, String str2) {
        this.e.a(this.h, str, str2, this.i);
    }

    public void a(int i2, String str) throws JSONException {
        boolean zEquals = false;
        this.v = false;
        this.w = false;
        this.x = false;
        this.U = false;
        this.N = str;
        this.f.a(!TextUtils.isEmpty(str));
        this.J = null;
        Map<String, Long> map = d0;
        if (map != null && map.size() > 0) {
            d0.clear();
        }
        if (com.mbridge.msdk.mbnative.controller.d.g() != null && com.mbridge.msdk.mbnative.controller.d.g().containsKey(this.i)) {
            zEquals = Boolean.TRUE.equals(com.mbridge.msdk.mbnative.controller.d.g().get(this.i));
        }
        a(zEquals, i2);
    }

    public void d() {
        m0.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Timer timer = this.M;
        if (timer != null) {
            timer.cancel();
            this.M = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.isReportClick()) {
            return;
        }
        campaignEx.setReportClick(true);
        if (campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().d() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(this.h, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().d(), false, false);
    }

    public void b(Campaign campaign, View view) {
        b(campaign, view, null);
    }

    public void b(Campaign campaign, View view, List<View> list) {
        if (view != null && this.P != null) {
            try {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.P);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (campaign != null) {
            int type = campaign.getType();
            if (type == 1 || type == 2) {
                Class cls = null;
                try {
                    int i2 = MBMediaView.p0;
                    cls = MBMediaView.class;
                } catch (Throwable unused) {
                }
                if (list == null || list.size() <= 0) {
                    if (view != null) {
                        a(view, cls);
                    }
                } else {
                    Iterator<View> it = list.iterator();
                    while (it.hasNext()) {
                        a(it.next(), cls);
                    }
                }
            }
        }
    }

    private List<Campaign> b(List<Campaign> list) {
        ArrayList arrayList = null;
        if (list != null) {
            Iterator<Campaign> it = list.iterator();
            while (it.hasNext()) {
                CampaignEx campaignEx = (Campaign) it.next();
                if (campaignEx instanceof CampaignEx) {
                    CampaignEx campaignEx2 = campaignEx;
                    if (TextUtils.isEmpty(campaignEx2.getImageUrl()) && !TextUtils.isEmpty(campaignEx2.getVideoUrlEncode())) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(campaignEx);
                    }
                }
            }
        }
        return arrayList;
    }

    private void a(boolean z, int i2) throws JSONException {
        boolean zB;
        if (z && i2 == 1 && a(i2)) {
            return;
        }
        String strB = com.mbridge.msdk.foundation.controller.c.m().b();
        String strC = com.mbridge.msdk.foundation.controller.c.m().c();
        if (this.d.containsKey("app_id") && this.d.containsKey("app_key") && this.d.containsKey("key_word")) {
            strB = (String) this.d.get("app_id");
            strC = (String) this.d.get("app_key");
        }
        a(strB, strC);
        com.mbridge.msdk.setting.l lVarE = com.mbridge.msdk.setting.h.b().e(strB, this.i);
        this.Q = lVarE;
        if (lVarE == null) {
            this.Q = com.mbridge.msdk.setting.l.i(this.i);
        }
        com.mbridge.msdk.mbnative.controller.d.d().put(this.i, Integer.valueOf(this.Q.y() * this.r));
        this.b = this.Q.b();
        this.c = this.Q.c();
        this.T = this.Q.f();
        this.S = this.Q.e();
        this.r = this.q;
        List<Integer> list = this.b;
        if (list != null && list.size() != 0) {
            try {
                zB = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.b(com.mbridge.msdk.foundation.controller.c.m().d());
            } catch (Exception unused) {
                zB = false;
            }
            if (!zB) {
                com.mbridge.msdk.mbnative.listener.a aVar = this.f;
                if (aVar != null) {
                    aVar.onAdLoadError("webview is not available");
                    return;
                }
                return;
            }
            if (this.d.containsKey("native_info") && this.m == null) {
                this.m = (String) this.d.get("native_info");
                f();
            }
            if ((!this.b.contains(1) || this.b.get(0).intValue() == 1) && i2 == 0 && c(a(this.i, this.r, this.N))) {
                return;
            }
            this.X = true;
            if (this.b.contains(1) && i2 == 0 && this.b.get(0).intValue() != 1) {
                int iIntValue = this.b.get(0).intValue();
                com.mbridge.msdk.mbnative.cache.b bVarA = com.mbridge.msdk.mbnative.cache.c.a(iIntValue);
                if (iIntValue == 2 && this.d.containsKey("native_info")) {
                    this.r = this.H;
                } else {
                    this.r = this.q;
                }
                if (bVarA != null && c(a(iIntValue, a((List<Campaign>) bVarA.a(this.i, this.r))))) {
                    return;
                }
                this.X = false;
                try {
                    a(this.c.get(this.b.indexOf(1)).intValue() * VideoFeedsPlayer.INTERVAL_TIME_PLAY_TIME_CD_THREAD, i2, false, this.i, this.N);
                } catch (Exception unused2) {
                }
            }
            ((com.mbridge.msdk.mbnative.controller.a) this).a.sendEmptyMessageDelayed(1, this.Q.K() * VideoFeedsPlayer.INTERVAL_TIME_PLAY_TIME_CD_THREAD);
            j();
            b(i2, this.N);
            return;
        }
        com.mbridge.msdk.mbnative.listener.a aVar2 = this.f;
        if (aVar2 != null) {
            this.v = true;
            aVar2.onAdLoadError("do not have sorceList");
        }
    }

    public boolean a(int i2) {
        int iMin;
        int iOptInt;
        int iOptInt2;
        com.mbridge.msdk.mbnative.listener.a aVar;
        int i3 = 0;
        if (com.mbridge.msdk.mbnative.controller.d.g().containsKey(this.i) && Boolean.TRUE.equals(com.mbridge.msdk.mbnative.controller.d.g().get(this.i))) {
            Map mapF = com.mbridge.msdk.mbnative.controller.d.f();
            Map map = (Map) mapF.get(i2 + EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR + this.i);
            Integer num = (Integer) com.mbridge.msdk.mbnative.controller.d.c().get(this.i);
            com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.m().b());
            if (num != null) {
                this.r = num.intValue();
            }
            if (map != null && map.size() > 0) {
                Long l2 = (Long) map.keySet().iterator().next();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (gVarD == null) {
                    gVarD = com.mbridge.msdk.setting.h.b().a();
                }
                if (jCurrentTimeMillis - l2.longValue() >= gVarD.Z() * 1000) {
                    mapF.remove(i2 + EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR + this.i);
                } else {
                    if (i2 == 1) {
                        List<Frame> list = (List) map.get(l2);
                        if (list == null || list.size() <= 0 || (aVar = this.f) == null) {
                            return false;
                        }
                        if (this.A >= list.size()) {
                            mapF.remove(i2 + EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR + this.i);
                            aVar.onAdFramesLoaded(list);
                            return true;
                        }
                        if (this.A == 0) {
                            return false;
                        }
                        List<Frame> listSubList = list.subList(0, this.z);
                        aVar.onAdFramesLoaded(list);
                        list.removeAll(listSubList);
                        map.put(l2, listSubList);
                        ArrayList arrayList = new ArrayList();
                        for (Frame frame : list) {
                            if (i3 >= this.A) {
                                arrayList.add(frame);
                            }
                            i3++;
                        }
                        map.put(l2, arrayList);
                        mapF.put(i2 + EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR + this.i, map);
                        aVar.onAdFramesLoaded(listSubList);
                        return true;
                    }
                    List list2 = (List) map.get(l2);
                    if (list2 != null && list2.size() > 0) {
                        ArrayList arrayList2 = new ArrayList();
                        if (((CampaignEx) list2.get(0)).getType() == 1) {
                            if (TextUtils.isEmpty(this.m)) {
                                iMin = Math.min(this.y, list2.size());
                            } else {
                                try {
                                    JSONArray jSONArray = new JSONArray(this.m);
                                    if (jSONArray.length() > 0) {
                                        iOptInt = 0;
                                        iOptInt2 = 0;
                                        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                                            JSONObject jSONObject = (JSONObject) jSONArray.opt(i4);
                                            int iOptInt3 = jSONObject.optInt("id", 0);
                                            if (2 == iOptInt3) {
                                                iOptInt = jSONObject.optInt("ad_num");
                                            } else if (3 == iOptInt3) {
                                                iOptInt2 = jSONObject.optInt("ad_num");
                                            }
                                        }
                                    } else {
                                        iOptInt = 0;
                                        iOptInt2 = 0;
                                    }
                                    if (3 == ((CampaignEx) list2.get(0)).getTemplate()) {
                                        iMin = Math.min(iOptInt2, list2.size());
                                    } else {
                                        iMin = Math.min(iOptInt, list2.size());
                                    }
                                } catch (Exception unused) {
                                    o0.b(c0, "load from catch error in get nativeinfo adnum");
                                    iMin = 0;
                                }
                            }
                            if (iMin <= 0) {
                                return false;
                            }
                            Iterator it = list2.iterator();
                            while (it.hasNext() && i3 != iMin) {
                                CampaignEx campaignEx = (CampaignEx) it.next();
                                campaignEx.getTemplate();
                                arrayList2.add(campaignEx);
                                it.remove();
                                i3++;
                            }
                        } else {
                            int iMin2 = Math.min(this.y, list2.size());
                            if (iMin2 > 0) {
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext() && i3 != iMin2) {
                                    CampaignEx campaignEx2 = (CampaignEx) it2.next();
                                    campaignEx2.getTemplate();
                                    arrayList2.add(campaignEx2);
                                    it2.remove();
                                    i3++;
                                }
                            }
                        }
                        c(arrayList2);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public NativeController() {
        this.q = 1;
        this.r = 1;
        this.s = -1;
        this.t = 0;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.F = new CopyOnWriteArrayList<>();
        this.G = new Hashtable<>();
        this.H = 1;
        this.I = 2;
        this.N = BuildConfig.FLAVOR;
        this.O = BuildConfig.FLAVOR;
        this.Z = BuildConfig.FLAVOR;
    }

    public void a(String str, int i2, String str2, CampaignEx campaignEx) {
        Queue<Integer> queue = this.k;
        if ((queue != null && queue.size() <= 0) || this.k == null) {
            com.mbridge.msdk.mbnative.listener.a aVar = this.f;
            if (aVar == null || this.v) {
                return;
            }
            this.v = true;
            aVar.a(campaignEx, str);
            return;
        }
        b(i2, str2);
    }

    public synchronized void a(int i2, long j2, int i3, String str) {
        com.mbridge.msdk.foundation.same.net.b bVar;
        com.mbridge.msdk.foundation.same.net.wrapper.e eVar;
        com.mbridge.msdk.foundation.same.net.wrapper.c cVar;
        p pVar;
        int i4;
        com.mbridge.msdk.foundation.entity.k kVar;
        try {
            if (this.d.containsKey("native_info")) {
                this.r = Math.max(this.V, this.W);
            }
            if (i3 == 0) {
                com.mbridge.msdk.mbnative.cache.b bVarA = com.mbridge.msdk.mbnative.cache.c.a(i2);
                if (bVarA != null && c(a(1, a((List<Campaign>) bVarA.a(this.i, this.r))))) {
                    return;
                }
                n nVar = this.J;
                if (nVar != null && !this.U) {
                    nVar.b(true);
                }
                if (this.U && !this.v) {
                    a("mb load failed", i3, str, (CampaignEx) null);
                }
                if (!this.X) {
                    return;
                }
            }
            int i5 = this.s;
            if (i5 == -1) {
                this.s = i2;
            } else if (i5 != i2) {
                this.t = 0;
            }
            com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.h)).a();
            com.mbridge.msdk.foundation.same.net.wrapper.c aVar = new com.mbridge.msdk.mbnative.service.net.a(this.h);
            com.mbridge.msdk.foundation.same.net.wrapper.e eVar2 = new com.mbridge.msdk.foundation.same.net.wrapper.e();
            String strB = com.mbridge.msdk.foundation.controller.c.m().b();
            String strC = com.mbridge.msdk.foundation.controller.c.m().c();
            Map<String, Object> map = this.d;
            if (map != null && map.containsKey("app_id") && this.d.containsKey("app_key") && this.d.containsKey("key_word") && this.d.get("key_word") != null) {
                if (this.d.get("app_id") instanceof String) {
                    strB = (String) this.d.get("app_id");
                }
                if (this.d.get("app_key") instanceof String) {
                    strC = (String) this.d.get("app_key");
                }
                String str2 = this.d.get("key_word") instanceof String ? (String) this.d.get("key_word") : null;
                if (!TextUtils.isEmpty(str2)) {
                    eVar2.a("smart", i0.b(str2));
                }
            }
            eVar2.a("app_id", strB);
            eVar2.a("unit_id", this.i);
            if (!TextUtils.isEmpty(this.j)) {
                eVar2.a(MBridgeConstans.PLACEMENT_ID, this.j);
            }
            eVar2.a("req_type", "2");
            if (!TextUtils.isEmpty(this.u)) {
                eVar2.a("category", this.u);
            }
            eVar2.a("sign", SameMD5.getMD5(strB + strC));
            if (this.T > 0 && i3 == 0) {
                eVar2.a("ad_num", this.T + BuildConfig.FLAVOR);
            } else {
                eVar2.a("ad_num", this.q + BuildConfig.FLAVOR);
            }
            String strD = t0.d(this.i);
            if (!TextUtils.isEmpty(strD)) {
                eVar2.a("j", strD);
            }
            eVar2.a("only_impression", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            eVar2.a("ping_mode", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            if (this.A != 0) {
                eVar2.a("frame_num", this.A + BuildConfig.FLAVOR);
            }
            if (!TextUtils.isEmpty(this.m)) {
                eVar2.a("native_info", this.m);
                if (i2 == 1) {
                    eVar2.a("tnum", this.H + BuildConfig.FLAVOR);
                }
            } else if (i2 == 1) {
                eVar2.a("tnum", this.q + BuildConfig.FLAVOR);
            }
            a(eVar2, i2);
            String strA = com.mbridge.msdk.foundation.same.buffer.b.a(this.i, "native");
            if (!TextUtils.isEmpty(strA)) {
                eVar2.a(com.mbridge.msdk.foundation.same.net.wrapper.e.g, strA);
            }
            if (Build.VERSION.SDK_INT >= 14) {
                if (this.d.containsKey("native_video_width") && (this.d.get("native_video_width") instanceof Integer)) {
                    eVar2.a("video_width", ((Integer) this.d.get("native_video_width")).intValue() + BuildConfig.FLAVOR);
                }
                if (this.d.containsKey("native_video_height") && (this.d.get("native_video_height") instanceof Integer)) {
                    eVar2.a("video_height", ((Integer) this.d.get("native_video_height")).intValue() + BuildConfig.FLAVOR);
                }
                if (this.d.containsKey("videoSupport") && (this.d.get("videoSupport") instanceof Boolean)) {
                    ((Boolean) this.d.get("videoSupport")).booleanValue();
                }
                eVar2.a("video_version", "2.0");
            }
            if (com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.m().b()) == null) {
                com.mbridge.msdk.setting.h.b().a();
            }
            if (!b(this.d)) {
                JSONArray jSONArrayB = t0.b(this.h, this.i);
                if (jSONArrayB.length() > 0) {
                    eVar2.a(com.mbridge.msdk.foundation.same.net.wrapper.e.h, t0.a(jSONArrayB));
                }
            }
            if (com.mbridge.msdk.mbnative.controller.d.g().containsKey(this.i) && ((Boolean) com.mbridge.msdk.mbnative.controller.d.g().get(this.i)).booleanValue() && com.mbridge.msdk.mbnative.controller.d.e().get(this.i) != null && (kVar = (com.mbridge.msdk.foundation.entity.k) com.mbridge.msdk.mbnative.controller.d.e().get(this.i)) != null) {
                if (i2 == 1) {
                    this.t = kVar.a();
                } else if (i2 == 2) {
                    this.t = kVar.b();
                }
            }
            eVar2.a("offset", this.t + BuildConfig.FLAVOR);
            eVar2.a("ad_type", "42");
            eVar2.a("ad_source_id", i2 + BuildConfig.FLAVOR);
            if (!TextUtils.isEmpty(this.o)) {
                eVar2.a(com.mbridge.msdk.foundation.same.net.wrapper.e.i, this.o);
            }
            com.mbridge.msdk.foundation.same.net.b nVar2 = new n();
            nVar2.b(a(this.d));
            nVar2.setUnitId(this.i);
            nVar2.setPlacementId(this.j);
            nVar2.setAdType(42);
            nVar2.b(true);
            p pVar2 = new p(1, nVar2, i3, str);
            nVar2.a(pVar2);
            nVar2.a(i3);
            nVar2.a(str);
            if (i3 == 0) {
                if (!TextUtils.isEmpty(str)) {
                    eVar2.a("token", str);
                }
                bVar = nVar2;
                eVar = eVar2;
                cVar = aVar;
                pVar = pVar2;
                i4 = 1;
                aVar.choiceV3OrV5BySetting(1, eVar, bVar, str, com.mbridge.msdk.foundation.same.c.a(j2, 30000L));
            } else {
                bVar = nVar2;
                eVar = eVar2;
                cVar = aVar;
                pVar = pVar2;
                i4 = 1;
            }
            if (i3 == i4) {
                cVar.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().b0, eVar, bVar, Constants.ScionAnalytics.PARAM_CAMPAIGN, com.mbridge.msdk.foundation.same.c.a(j2, 30000L));
            }
            ((com.mbridge.msdk.mbnative.controller.a) this).a.postDelayed(pVar, j2);
        } catch (Exception e2) {
            String str3 = c0;
            o0.b(str3, com.mbridge.msdk.mbnative.common.a.a(e2));
            o0.b(str3, e2.getMessage());
        }
    }

    private void a(View view, CampaignEx campaignEx) {
        BitmapDrawable bitmapDrawableA;
        ImageView imageView;
        if (!(view instanceof FrameLayout) || (bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.m().a(this.i, campaignEx.getAdType())) == null) {
            return;
        }
        try {
            int childCount = ((ViewGroup) view).getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    imageView = null;
                    break;
                }
                View childAt = ((ViewGroup) view).getChildAt(i2);
                if ((childAt instanceof ImageView) && childAt.getTag() != null && "mb_wm".equals((String) childAt.getTag())) {
                    ((ImageView) childAt).setLayoutParams(new FrameLayout.LayoutParams(view.getWidth(), view.getHeight()));
                    imageView = (ImageView) childAt;
                    break;
                }
                i2++;
            }
            if (imageView == null) {
                imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.m().d());
                imageView.setTag("mb_wm");
                t0.a(imageView, bitmapDrawableA, view.getResources().getDisplayMetrics());
                if (imageView.getParent() == null) {
                    ((FrameLayout) view).addView(imageView, new FrameLayout.LayoutParams(view.getWidth(), view.getHeight()));
                }
                AdSession adSession = this.a0;
                if (adSession != null) {
                    adSession.addFriendlyObstruction(imageView, FriendlyObstructionPurpose.OTHER, (String) null);
                }
            }
            this.P = new e(imageView, view);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.P);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void a(Campaign campaign, View view, List<View> list) {
        try {
            a(view, (CampaignEx) campaign);
            NativeListener.NativeTrackingListener nativeTrackingListener = this.g;
            if (nativeTrackingListener != null) {
                this.p.a(nativeTrackingListener);
            }
            com.mbridge.msdk.mbnative.cache.c.a(campaign.getType()).a(this.i, campaign, this.N);
            CampaignEx campaignEx = (CampaignEx) campaign;
            Class cls = null;
            try {
                int i2 = MBMediaView.p0;
                cls = MBMediaView.class;
            } catch (Throwable unused) {
            }
            com.mbridge.msdk.foundation.same.buffer.b.a(this.i, campaignEx, "native");
            if (view != null) {
                if (cls != null && cls.isInstance(view)) {
                    return;
                } else {
                    view.setOnClickListener(new f(campaignEx));
                }
            }
            if (list != null && list.size() > 0) {
                for (View view2 : list) {
                    if (cls != null && cls.isInstance(view2)) {
                        break;
                    } else {
                        view2.setOnClickListener(new g(campaignEx));
                    }
                }
            }
            if (campaignEx.isReport()) {
                return;
            }
            a(campaignEx, view, list);
            Log.e(c0, "sendImpression" + campaignEx);
        } catch (Exception unused2) {
            o0.b(c0, "registerview exception!");
        }
    }

    public void a(Campaign campaign, View view) {
        try {
            NativeListener.NativeTrackingListener nativeTrackingListener = this.g;
            if (nativeTrackingListener != null) {
                this.p.a(nativeTrackingListener);
            }
            com.mbridge.msdk.mbnative.cache.c.a(campaign.getType()).a(this.i, campaign, this.N);
            CampaignEx campaignEx = (CampaignEx) campaign;
            com.mbridge.msdk.foundation.same.buffer.b.a(this.i, campaignEx, "native");
            com.mbridge.msdk.widget.a iVar = new i(campaignEx);
            try {
                int i2 = MBMediaView.p0;
                a(view, (View.OnClickListener) iVar, MBMediaView.class);
            } catch (Throwable unused) {
                a(view, (View.OnClickListener) iVar, (Class) null);
            }
            if (!com.mbridge.msdk.util.b.a()) {
                a(view, (CampaignEx) campaign);
            }
            if (campaignEx.isReport()) {
                return;
            }
            List<View> arrayList = new ArrayList<>();
            arrayList.add(view);
            a(campaignEx, view, arrayList);
            o0.c(c0, "sendImpression" + campaignEx);
        } catch (Exception unused2) {
            o0.b(c0, "registerview exception!");
        }
    }

    private AdSession a(CampaignEx campaignEx) {
        if (this.G == null) {
            this.G = new Hashtable<>();
        }
        String requestIdNotice = campaignEx.getRequestIdNotice();
        AdSession adSessionA = this.G.get(requestIdNotice);
        if (adSessionA == null && campaignEx.isActiveOm() && TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            adSessionA = com.mbridge.msdk.omsdk.b.a(this.h, true, campaignEx.getOmid(), campaignEx.getRequestId(), campaignEx.getId(), this.i, BuildConfig.FLAVOR, campaignEx.getRequestIdNotice());
        }
        if (adSessionA != null) {
            this.G.put(requestIdNotice, adSessionA);
        }
        return adSessionA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.mbridge.msdk.foundation.same.task.a, com.mbridge.msdk.mbnative.controller.NativeController$s, java.lang.Object, java.lang.Runnable] */
    private void a(CampaignEx campaignEx, View view, List<View> list) {
        AdSession adSessionA;
        try {
            if (this.h == null || campaignEx == null) {
                adSessionA = null;
            } else {
                adSessionA = a(campaignEx);
                if (adSessionA != null) {
                    adSessionA.registerAdView(view);
                    adSessionA.start();
                }
            }
            AdSession adSession = adSessionA;
            com.mbridge.msdk.setting.l lVar = this.Q;
            int iS = lVar != null ? lVar.s() : 0;
            if (campaignEx != null && campaignEx.getImpReportType() == 1) {
                iS = 0;
            }
            ?? sVar = new s(campaignEx, view, list, this, adSession);
            if (this.F == null) {
                this.F = new CopyOnWriteArrayList<>();
            }
            this.F.add(sVar);
            sVar.setOnStateChangeListener(new j(sVar));
            Handler handler = ((com.mbridge.msdk.mbnative.controller.a) this).a;
            if (handler != 0) {
                handler.postDelayed(sVar, iS * VideoFeedsPlayer.INTERVAL_TIME_PLAY_TIME_CD_THREAD);
            }
        } catch (Exception e2) {
            o0.b(c0, com.mbridge.msdk.mbnative.common.a.a(e2));
        }
    }

    private void a(View view, View.OnClickListener onClickListener, Class cls) {
        if (view == null || onClickListener == null) {
            return;
        }
        if (cls != null) {
            try {
                if (cls.isInstance(view)) {
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        view.setOnClickListener(onClickListener);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                a(viewGroup.getChildAt(i2), onClickListener, cls);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, View view, List<View> list, AdSession adSession) {
        try {
            k kVar = new k(campaignEx);
            com.mbridge.msdk.mbnative.controller.c cVar = new com.mbridge.msdk.mbnative.controller.c(list, kVar, new Handler(Looper.getMainLooper()), campaignEx.getImpReportType());
            cVar.a(view);
            List<com.mbridge.msdk.mbnative.controller.c> list2 = this.D;
            if (list2 != null) {
                list2.add(cVar);
            }
            List<c.d> list3 = this.E;
            if (list3 != null) {
                list3.add(kVar);
            }
            AdEvents adEvents = this.b0;
            if (adEvents != null) {
                adEvents.impressionOccurred();
            }
        } catch (Exception unused) {
        }
    }

    private void a(View view, Class cls) {
        if (view == null) {
            return;
        }
        if (cls != null) {
            try {
                if (cls.isInstance(view)) {
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        view.setOnClickListener(null);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                a(viewGroup.getChildAt(i2), cls);
            }
        }
    }

    public List<Campaign> a(String str, int i2, String str2) {
        int i3;
        int i4;
        List<Campaign> listA = null;
        if (this.b != null) {
            ArrayList arrayList = new ArrayList(this.b);
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                com.mbridge.msdk.mbnative.cache.b bVarA = com.mbridge.msdk.mbnative.cache.c.a(((Integer) arrayList.get(i5)).intValue());
                if (bVarA != null) {
                    if ((((Integer) arrayList.get(i5)).intValue() == 1 || ((Integer) arrayList.get(i5)).intValue() == 2) && this.d.containsKey("native_info")) {
                        i4 = this.H;
                    } else {
                        i4 = this.q;
                    }
                    listA = a(((Integer) arrayList.get(i5)).intValue(), (List<Campaign>) bVarA.a(str, i4));
                    if (listA != null) {
                        break;
                    }
                }
            }
            if (listA == null) {
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    com.mbridge.msdk.mbnative.cache.b bVarA2 = com.mbridge.msdk.mbnative.cache.c.a(((Integer) arrayList.get(i6)).intValue());
                    if ((((Integer) arrayList.get(i6)).intValue() == 1 || ((Integer) arrayList.get(i6)).intValue() == 2) && this.d.containsKey("native_info")) {
                        i3 = this.H;
                    } else {
                        i3 = this.q;
                    }
                    listA = a(((Integer) arrayList.get(i6)).intValue(), (List<Campaign>) bVarA2.b(str, i3));
                    if (listA != null) {
                        break;
                    }
                }
            }
        }
        return a(listA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<Campaign> list, int i2, NativeListener.NativeAdListener nativeAdListener) {
        ((com.mbridge.msdk.mbnative.controller.a) this).a.post(new a(list, nativeAdListener, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.mbnative.listener.a aVar, String str, CampaignEx campaignEx) {
        ((com.mbridge.msdk.mbnative.controller.a) this).a.post(new b(aVar, campaignEx, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Campaign> a(int i2, List<Campaign> list) {
        if (i2 != 1 || !this.d.containsKey("native_info") || list == null || list.size() <= 0) {
            return list;
        }
        CampaignEx campaignEx = list.get(0);
        int template = campaignEx != null ? campaignEx.getTemplate() : 1;
        if (template == 2) {
            int size = list.size();
            int i3 = this.V;
            return size >= i3 ? list.subList(0, i3) : list;
        }
        if (template != 3) {
            return list;
        }
        int size2 = list.size();
        int i4 = this.W;
        return size2 >= i4 ? list.subList(0, i4) : list;
    }

    private void a(List<Campaign> list, o oVar) {
        c();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Timer timer = new Timer();
        this.M = timer;
        timer.schedule(new d(jCurrentTimeMillis, oVar, list), 0L, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Campaign> a(List<Campaign> list, boolean z) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                CampaignEx campaignEx = (Campaign) list.get(size);
                String id = campaignEx.getId();
                boolean z2 = campaignEx instanceof CampaignEx;
                if (z2) {
                    CampaignEx campaignEx2 = campaignEx;
                    id = id + campaignEx2.getVideoUrlEncode() + campaignEx2.getBidToken();
                }
                com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.i, id);
                if (z) {
                    if (aVarA == null || !com.mbridge.msdk.videocommon.download.l.a(aVarA, h().C())) {
                        com.mbridge.msdk.mbnative.cache.c.a(campaignEx.getType()).a(this.i, list.remove(size), this.N);
                    }
                } else if (z2) {
                    CampaignEx campaignEx3 = campaignEx;
                    if (TextUtils.isEmpty(campaignEx3.getImageUrl()) && !TextUtils.isEmpty(campaignEx3.getVideoUrlEncode()) && (aVarA == null || !com.mbridge.msdk.videocommon.download.l.a(aVarA, h().C()))) {
                        com.mbridge.msdk.mbnative.cache.c.a(campaignEx.getType()).a(this.i, list.remove(size), this.N);
                    }
                }
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Campaign> a(List<Campaign> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        Iterator<Campaign> it = list.iterator();
        while (it.hasNext()) {
            CampaignEx campaignEx = (Campaign) it.next();
            if (campaignEx instanceof CampaignEx) {
                CampaignEx campaignEx2 = campaignEx;
                if (TextUtils.isEmpty(this.N) && TextUtils.isEmpty(campaignEx2.getBidToken()) && !campaignEx2.isBidCampaign()) {
                    arrayList2.add(campaignEx2);
                } else if (!TextUtils.isEmpty(this.N) && TextUtils.equals(campaignEx2.getBidToken(), this.N)) {
                    arrayList.add(campaignEx);
                }
            } else {
                arrayList2.add(campaignEx);
            }
        }
        return TextUtils.isEmpty(this.N) ? arrayList2 : arrayList;
    }
}
