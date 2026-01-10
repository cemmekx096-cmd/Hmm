package com.google.android.gms.games.achievement;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: com.google.android.gms:play-services-games-v2@@21.0.0 */
/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class AchievementBuffer extends AbstractDataBuffer<Achievement> {
    public AchievementBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    /* renamed from: get, reason: merged with bridge method [inline-methods] */
    public Achievement m120get(int i) {
        return new AchievementRef(this.mDataHolder, i);
    }
}
