package com.bytedance.adsdk.MY.Cc;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.adsdk.MY.Bc;
import com.bytedance.adsdk.MY.Bc.IlO;
import com.bytedance.adsdk.MY.IlO.MY.DmF;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
class oeT {
    static <T> List<IlO<T>> IlO(JsonReader jsonReader, Bc bc, float f, HSR<T> hsr, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            bc.IlO("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("k")) {
                if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                    jsonReader.beginArray();
                    if (jsonReader.peek() == JsonToken.NUMBER) {
                        arrayList.add(AXM.IlO(jsonReader, bc, f, hsr, false, z));
                    } else {
                        while (jsonReader.hasNext()) {
                            arrayList.add(AXM.IlO(jsonReader, bc, f, hsr, true, z));
                        }
                    }
                    jsonReader.endArray();
                } else {
                    arrayList.add(AXM.IlO(jsonReader, bc, f, hsr, false, z));
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        IlO(arrayList);
        return arrayList;
    }

    public static <T> void IlO(List<? extends IlO<T>> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            DmF dmF = (IlO) list.get(i2);
            i2++;
            IlO<T> ilO = list.get(i2);
            ((IlO) dmF).Bc = Float.valueOf(ilO.vCE);
            if (((IlO) dmF).MY == null && ilO.IlO != null) {
                ((IlO) dmF).MY = ilO.IlO;
                if (dmF instanceof DmF) {
                    dmF.IlO();
                }
            }
        }
        IlO<T> ilO2 = list.get(i);
        if ((ilO2.IlO == null || ilO2.MY == null) && list.size() > 1) {
            list.remove(ilO2);
        }
    }
}
