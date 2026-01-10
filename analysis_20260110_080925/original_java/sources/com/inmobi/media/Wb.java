package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.safedk.android.internal.partials.InMobiFilesBridge;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class Wb implements o0 {
    public final byte[] a;
    public final String b;

    public Wb(String str, byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "imageBytes");
        Intrinsics.checkNotNullParameter(str, "location");
        this.a = bArr;
        this.b = str;
    }

    public final Object a() {
        byte[] bArr = this.a;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        Intrinsics.checkNotNull(bitmapDecodeByteArray);
        StringBuilder sb = new StringBuilder();
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String string2 = sb.append(string).append(".jpg").toString();
        File file = new File(this.b);
        if (!file.exists()) {
            file.mkdirs();
        }
        bitmapDecodeByteArray.compress(Bitmap.CompressFormat.JPEG, 100, InMobiFilesBridge.fileOutputStreamCtor(new File(this.b + '/' + string2)));
        Intrinsics.checkNotNullParameter("StoreProcess", "tag");
        Intrinsics.checkNotNullParameter("screenshot file saved", SettingsJsonConstants.PROMPT_MESSAGE_KEY);
        Log.i("StoreProcess", "screenshot file saved");
        return this.b + '/' + string2;
    }
}
