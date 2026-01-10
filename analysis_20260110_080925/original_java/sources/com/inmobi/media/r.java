package com.inmobi.media;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import androidx.media3.common.MimeTypes;
import com.inmobi.media.r$;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class r extends Lambda implements Function0 {
    public final /* synthetic */ f5 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(f5 f5Var, Context context, long j) {
        super(0);
        this.a = f5Var;
        this.b = context;
        this.c = j;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Unit invoke() {
        if (s.d.compareAndSet(false, true)) {
            s sVar = s.a;
            ((ScheduledThreadPoolExecutor) m4.c.getValue()).execute(new r$.ExternalSyntheticLambda0(this.a, this.b, this.c));
            return Unit.INSTANCE;
        }
        g5 g5Var = this.a;
        if (g5Var == null) {
            return null;
        }
        g5Var.c("AdAudioTracker", "Audio volume tracking is already started");
        return Unit.INSTANCE;
    }

    public static final void a(f5 f5Var, Context context, long j) {
        if (f5Var != null) {
            ((g5) f5Var).c("AdAudioTracker", "Starting audio volume tracking");
        }
        if (s.b == null) {
            Object systemService = context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            s.b = (AudioManager) systemService;
        }
        s sVar = s.a;
        s.a(j);
        q qVar = new q(j);
        s.h = qVar;
        Kb.f().a(new int[]{102, 101}, qVar);
        s.c = new n();
        context.registerReceiver(s.c, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
        s.a(Float.valueOf(sVar.a()));
    }
}
