package com.inmobi.media;

import android.content.Context;
import android.widget.ImageView;
import com.google.firebase.messaging.Constants;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public final class Q8 implements InvocationHandler {
    public final D7 a;
    public final WeakReference b;
    public final WeakReference c;

    public Q8(Context context, ImageView imageView, D7 d7) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(d7, "imageAsset");
        this.a = d7;
        this.b = new WeakReference(context);
        this.c = new WeakReference(imageView);
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String strA;
        HashMap map = d9.c;
        Intrinsics.checkNotNullExpressionValue("d9", "access$getTAG$cp(...)");
        Objects.toString(method);
        if (StringsKt.equals("onError", method != null ? method.getName() : null, true)) {
            HashMap map2 = d9.c;
            Context context = (Context) this.b.get();
            ImageView imageView = (ImageView) this.c.get();
            D7 d7 = this.a;
            if (context != null && imageView != null) {
                String str = d7.p;
                if (StringsKt.equals("cross_button", d7.b, true)) {
                    if (str != null) {
                        int length = str.length() - 1;
                        int i = 0;
                        boolean z = false;
                        while (i <= length) {
                            boolean z2 = Intrinsics.compare(str.charAt(!z ? i : length), 32) <= 0;
                            if (z) {
                                if (!z2) {
                                    break;
                                }
                                length--;
                            } else if (z2) {
                                i++;
                            } else {
                                z = true;
                            }
                        }
                        strA = i7.a(length, 1, str, i);
                    } else {
                        strA = null;
                    }
                    if (strA == null || strA.length() == 0) {
                        N8.a(context, imageView);
                    }
                }
            }
            HashMap map3 = new HashMap();
            map3.put("[ERRORCODE]", "603");
            d7.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, map3, (l7) null, (f5) null);
        }
        return null;
    }
}
