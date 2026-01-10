package com.bytedance.adsdk.MY.Cc;

import android.util.JsonReader;
import com.bytedance.adsdk.MY.Bc;
import com.bytedance.adsdk.MY.EO.IlO.EV;
import com.bytedance.adsdk.MY.EO.IlO.IlO;
import java.io.IOException;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class MY {
    public static EV IlO(JsonReader jsonReader, Bc bc) throws IOException {
        jsonReader.beginObject();
        EV evMY = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("a")) {
                evMY = MY(jsonReader, bc);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return evMY == null ? new EV((IlO) null, (IlO) null, (com.bytedance.adsdk.MY.EO.IlO.MY) null, (com.bytedance.adsdk.MY.EO.IlO.MY) null) : evMY;
    }

    private static EV MY(JsonReader jsonReader, Bc bc) throws IOException {
        jsonReader.beginObject();
        IlO ilOBc = null;
        IlO ilOBc2 = null;
        com.bytedance.adsdk.MY.EO.IlO.MY myIlO = null;
        com.bytedance.adsdk.MY.EO.IlO.MY myIlO2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "t":
                    myIlO2 = tV.IlO(jsonReader, bc);
                    break;
                case "fc":
                    ilOBc = tV.Bc(jsonReader, bc);
                    break;
                case "sc":
                    ilOBc2 = tV.Bc(jsonReader, bc);
                    break;
                case "sw":
                    myIlO = tV.IlO(jsonReader, bc);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new EV(ilOBc, ilOBc2, myIlO, myIlO2);
    }
}
