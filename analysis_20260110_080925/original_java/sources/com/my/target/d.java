package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.ImageData;
import com.my.target.d$;
import com.my.target.z2;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class d {
    public final c a;
    public final f b;
    public final z2.b c;
    public final String d;
    public final View.OnClickListener e;
    public WeakReference f;

    public interface a {
        void a(Context context);
    }

    public d(c cVar, MenuFactory menuFactory, z2.b bVar) {
        this.a = cVar;
        this.c = bVar;
        if (cVar == null) {
            this.b = null;
            this.e = null;
            this.d = null;
            return;
        }
        List listA = cVar.a();
        if (listA == null || listA.isEmpty()) {
            this.b = null;
        } else {
            this.b = f.a(listA, menuFactory == null ? new p1() : menuFactory);
        }
        this.d = cVar.b();
        this.e = new d$.ExternalSyntheticLambda0(this);
    }

    public void a(i iVar) {
        iVar.setImageBitmap((Bitmap) null);
        iVar.setImageDrawable((Drawable) null);
        iVar.setVisibility(8);
        iVar.setOnClickListener(null);
    }

    public void a(Context context) {
        f fVar = this.b;
        if (fVar != null) {
            if (fVar.b()) {
                return;
            }
            this.b.a(context);
        } else {
            String str = this.d;
            if (str != null) {
                x3.a(str, context);
            }
        }
    }

    public final /* synthetic */ void a(View view) {
        a(view.getContext());
    }

    public static d a(c cVar) {
        return a(cVar, null, null);
    }

    public static d a(c cVar, MenuFactory menuFactory, z2.b bVar) {
        return new d(cVar, menuFactory, bVar);
    }

    public void a(i iVar, a aVar) {
        if (this.a == null) {
            a(iVar);
            return;
        }
        f fVar = this.b;
        if (fVar != null) {
            fVar.a(aVar);
        }
        this.f = new WeakReference(iVar);
        iVar.setVisibility(0);
        iVar.setOnClickListener(this.e);
        if (iVar.hasImage()) {
            return;
        }
        ImageData imageDataC = this.a.c();
        Bitmap bitmap = imageDataC.getBitmap();
        if (bitmap != null) {
            iVar.setImageBitmap(bitmap);
        } else {
            z2.a(imageDataC, iVar, this.c);
        }
    }

    public void a() {
        f fVar = this.b;
        if (fVar != null) {
            fVar.a((a) null);
        }
        WeakReference weakReference = this.f;
        i iVar = weakReference != null ? (i) weakReference.get() : null;
        if (iVar == null) {
            return;
        }
        c cVar = this.a;
        if (cVar != null) {
            z2.a(cVar.c(), iVar);
        }
        a(iVar);
        this.f.clear();
        this.f = null;
    }
}
