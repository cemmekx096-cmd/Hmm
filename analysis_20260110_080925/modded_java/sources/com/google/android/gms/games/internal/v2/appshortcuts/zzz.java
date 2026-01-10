package com.google.android.gms.games.internal.v2.appshortcuts;

import android.content.Intent;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;

/* compiled from: com.google.android.gms:play-services-games-v2@@21.0.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
final /* synthetic */ class zzz implements OnCompleteListener {
    private final /* synthetic */ PlayGamesAppShortcutsActivity zza;

    public static void safedk_PlayGamesAppShortcutsActivity_startActivityForResult_896c8c97fbd06eed423f92a6c69d5593(PlayGamesAppShortcutsActivity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Lcom/google/android/gms/games/internal/v2/appshortcuts/PlayGamesAppShortcutsActivity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.google.android.gms.games");
        p0.startActivityForResult(p1, p2);
    }

    public final /* synthetic */ void onComplete(Task task) {
        PlayGamesAppShortcutsActivity playGamesAppShortcutsActivity = this.zza;
        if (task.isSuccessful()) {
            safedk_PlayGamesAppShortcutsActivity_startActivityForResult_896c8c97fbd06eed423f92a6c69d5593(playGamesAppShortcutsActivity, (Intent) task.getResult(), 1005000000);
        } else {
            Log.e("PGShortcutsActivity", "Failed to access intent.", task.getException());
            playGamesAppShortcutsActivity.finish();
        }
    }
}
