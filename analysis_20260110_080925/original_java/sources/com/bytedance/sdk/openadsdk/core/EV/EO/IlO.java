package com.bytedance.sdk.openadsdk.core.EV.EO;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import androidx.media3.common.MimeTypes;
import com.bytedance.sdk.openadsdk.core.cl;
import com.bytedance.sdk.openadsdk.utils.BS;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class IlO {
    public static final Set<String> IlO = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.EV.EO.IlO.1
        {
            add(MimeTypes.IMAGE_JPEG);
            add(MimeTypes.IMAGE_PNG);
            add(MimeTypes.IMAGE_BMP);
            add("image/gif");
            add("image/jpg");
        }
    };
    public static Set<String> MY = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.EV.EO.IlO.2
        {
            add("application/x-javascript");
        }
    };

    /* renamed from: com.bytedance.sdk.openadsdk.core.EV.EO.IlO$IlO, reason: collision with other inner class name */
    public enum EnumC0019IlO {
        NONE,
        IMAGE,
        JAVASCRIPT
    }

    public enum MY {
        HTML_RESOURCE,
        STATIC_RESOURCE,
        IFRAME_RESOURCE
    }

    public static Point IlO(Context context, int i, int i2, MY my) {
        if (context == null) {
            context = cl.IlO();
        }
        Point point = new Point(i, i2);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        int iMY = BS.MY(context, i);
        int iMY2 = BS.MY(context, i2);
        if (iMY <= width && iMY2 <= height) {
            return point;
        }
        Point point2 = new Point();
        if (MY.HTML_RESOURCE == my) {
            point2.x = Math.min(width, iMY);
            point2.y = Math.min(height, iMY2);
        } else {
            float f = iMY;
            float f2 = f / width;
            float f3 = iMY2;
            float f4 = f3 / height;
            if (f2 >= f4) {
                point2.x = width;
                point2.y = (int) (f3 / f2);
            } else {
                point2.x = (int) (f / f4);
                point2.y = height;
            }
        }
        if (point2.x < 0 || point2.y < 0) {
            return point;
        }
        point2.x = BS.EO(context, point2.x);
        point2.y = BS.EO(context, point2.y);
        return point2;
    }
}
