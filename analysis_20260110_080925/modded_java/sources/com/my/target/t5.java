package com.my.target;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public abstract class t5 {
    public final Map a = new HashMap();

    public interface a {
        void a();

        void a(Object obj);
    }

    public boolean a(String str, a aVar) {
        boolean z;
        synchronized (this.a) {
            if (this.a.containsKey(str)) {
                List list = (List) this.a.get(str);
                if (list != null) {
                    list.add(aVar);
                }
                z = true;
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(aVar);
                this.a.put(str, arrayList);
                z = false;
            }
        }
        return z;
    }

    public void a(String str, Object obj) {
        synchronized (this.a) {
            List list = (List) this.a.get(str);
            if (list == null) {
                return;
            }
            if (obj == null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a();
                }
            } else {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((a) it2.next()).a(obj);
                }
            }
            this.a.remove(str);
        }
    }
}
