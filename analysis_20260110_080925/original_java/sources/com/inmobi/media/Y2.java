package com.inmobi.media;

import android.content.ContentValues;
import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class Y2 extends R1 {
    public Y2() {
        super("c_data", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, e_data TEXT NOT NULL, timestamp INTEGER NOT NULL )");
        Intrinsics.checkNotNullExpressionValue("Y2", "getSimpleName(...)");
    }

    @Override // com.inmobi.media.R1
    public final Object a(ContentValues contentValues) {
        Intrinsics.checkNotNullParameter(contentValues, "contentValues");
        String asString = contentValues.getAsString("e_data");
        Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
        Long asLong = contentValues.getAsLong("timestamp");
        Intrinsics.checkNotNullExpressionValue(asLong, "getAsLong(...)");
        return new Z3(asString, asLong.longValue());
    }

    @Override // com.inmobi.media.R1
    public final ContentValues b(Object obj) {
        Z3 z3 = (Z3) obj;
        Intrinsics.checkNotNullParameter(z3, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        ContentValues contentValues = new ContentValues();
        contentValues.put("e_data", z3.a);
        contentValues.put("timestamp", Long.valueOf(z3.b));
        return contentValues;
    }
}
