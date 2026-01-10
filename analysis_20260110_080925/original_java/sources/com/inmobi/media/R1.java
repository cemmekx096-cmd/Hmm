package com.inmobi.media;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public abstract class R1 {
    public final String a;

    public R1(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "tableName");
        Intrinsics.checkNotNullParameter(str2, "tableSchema");
        this.a = str;
        try {
            v3.a.a(str, str2);
        } catch (Exception unused) {
        }
    }

    public abstract Object a(ContentValues contentValues);

    public final void a(Object obj) {
        try {
            v3.a(this.a, b(obj));
            Intrinsics.checkNotNullExpressionValue("R1", "TAG");
            Objects.toString(obj);
        } catch (Exception unused) {
        }
    }

    public abstract ContentValues b(Object obj);

    public final void b(Object obj, String str, String[] strArr) {
        try {
            v3.b(this.a, b(obj), str, strArr);
            Intrinsics.checkNotNullExpressionValue("R1", "TAG");
            Objects.toString(obj);
        } catch (Exception unused) {
        }
    }

    public final void a(Object obj, String str, String[] strArr) {
        try {
            v3.a(this.a, b(obj), str, strArr);
            Intrinsics.checkNotNullExpressionValue("R1", "TAG");
            Objects.toString(obj);
        } catch (Exception unused) {
        }
    }

    public final Object b(String str, String[] strArr) {
        try {
            List listB = v3.b(this.a, (String[]) null, str, strArr, (String) null, (String) null, (String) null, (String) null);
            if (listB.isEmpty()) {
                return null;
            }
            return a((ContentValues) listB.get(0));
        } catch (Exception unused) {
            return null;
        }
    }

    public static ArrayList a(R1 r1, String str, String[] strArr, String str2, String str3, String str4, Integer num, int i) {
        String str5 = (i & 1) != 0 ? null : str;
        String[] strArr2 = (i & 2) != 0 ? null : strArr;
        String str6 = (i & 4) != 0 ? null : str2;
        String str7 = (i & 8) != 0 ? null : str3;
        String str8 = (i & 16) != 0 ? null : str4;
        Integer num2 = (i & 32) != 0 ? null : num;
        r1.getClass();
        try {
            ArrayList arrayList = new ArrayList();
            List listB = v3.b(r1.a, (String[]) null, str5, strArr2, str6, str7, str8, num2 != null ? num2.toString() : null);
            if (listB.isEmpty()) {
                return arrayList;
            }
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(r1.a((ContentValues) it.next()));
            }
            return arrayList;
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    public static int a(R1 r1) {
        r1.getClass();
        try {
            return v3.a(r1.a, (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null, (String) null);
        } catch (Exception unused) {
            return 0;
        }
    }

    public final int a(String str, String[] strArr) {
        try {
            return v3.a(this.a, str, strArr);
        } catch (Exception unused) {
            return 0;
        }
    }
}
