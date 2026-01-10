package com.inmobi.media;

import android.content.Context;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class R9 {
    public static volatile Picasso b;
    public static final R9 a = new R9();
    public static final Object c = new Object();
    public static final ArrayList d = new ArrayList();
    public static final Q9 e = new Q9();

    public static final /* synthetic */ String d() {
        return "R9";
    }

    public static final WeakReference a(R9 r9, Context context) {
        r9.getClass();
        int size = d.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = d;
            Context context2 = (Context) ((WeakReference) arrayList.get(i)).get();
            if (context2 != null && Intrinsics.areEqual(context2, context)) {
                return (WeakReference) arrayList.get(i);
            }
        }
        return null;
    }

    public final Picasso a(Context context) {
        WeakReference weakReference;
        Picasso picassoBuild;
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (c) {
            int size = d.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    weakReference = null;
                    break;
                }
                ArrayList arrayList = d;
                Context context2 = (Context) ((WeakReference) arrayList.get(i)).get();
                if (context2 != null && Intrinsics.areEqual(context2, context)) {
                    weakReference = (WeakReference) arrayList.get(i);
                    break;
                }
                i++;
            }
            if (weakReference == null) {
                d.add(new WeakReference(context));
            }
            picassoBuild = b;
            if (picassoBuild == null) {
                picassoBuild = new Picasso.Builder(context).build();
                b = picassoBuild;
                Kb.a(context, e);
            }
        }
        Intrinsics.checkNotNullExpressionValue(picassoBuild, "synchronized(...)");
        return picassoBuild;
    }

    public final Object a(InvocationHandler invocationHandler) {
        Intrinsics.checkNotNullParameter(invocationHandler, "connectionCallbackHandler");
        try {
            return Proxy.newProxyInstance(Callback.class.getClassLoader(), new Class[]{Callback.class}, invocationHandler);
        } catch (Exception unused) {
            return null;
        }
    }
}
