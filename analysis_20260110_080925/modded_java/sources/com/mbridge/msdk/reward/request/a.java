package com.mbridge.msdk.reward.request;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.report.metrics.c;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;

/* compiled from: RewarLoadVideoResponseHandler.java */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public abstract class a extends c {
    public abstract void a(CampaignUnit campaignUnit);

    public void a(List<Frame> list) {
    }

    public void a(List<g> list, CampaignUnit campaignUnit) {
        a(campaignUnit);
    }

    public abstract void b(int i, String str, c cVar);

    public void a(int i, String str, c cVar) {
        b(i, str, cVar);
    }
}
