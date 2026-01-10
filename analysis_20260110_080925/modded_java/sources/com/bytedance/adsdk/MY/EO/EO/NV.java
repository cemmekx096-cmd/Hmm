package com.bytedance.adsdk.MY.EO.EO;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.adsdk.MY.DmF;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class NV extends tV {
    private int DmF;
    private int NV;
    private Path lEW;

    public NV(DmF dmF, Cc cc, Context context) {
        super(dmF, cc);
        this.lEW = null;
        this.DmF = -1;
        this.NV = -1;
        if (this.Bc != null) {
            float fIlO = com.bytedance.adsdk.MY.vCE.vCE.IlO();
            this.DmF = (int) (this.Bc.IlO() * fIlO);
            this.NV = (int) (this.Bc.MY() * fIlO);
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, this.DmF, this.NV);
            Path path = new Path();
            this.lEW = path;
            float f = fIlO * 40.0f;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
        }
    }

    public void MY(Canvas canvas, Matrix matrix, int i) {
        View viewIlO = this.MY.IlO();
        if (this.DmF <= 0 || viewIlO == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        IlO(i);
        float fVCE = vCE();
        IlO(viewIlO, this.DmF, this.NV);
        viewIlO.setAlpha(fVCE);
        canvas.clipPath(this.lEW);
        viewIlO.draw(canvas);
        canvas.restore();
    }

    private static void IlO(View view, int i, int i2) {
        view.layout(0, 0, i, i2);
        view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }
}
