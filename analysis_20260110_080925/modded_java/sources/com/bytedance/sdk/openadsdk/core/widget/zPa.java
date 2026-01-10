package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.sdk.openadsdk.core.Cc.tV;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class zPa extends tV {
    private final RectF Cc;
    private int EO;
    private final Paint IlO;
    private int MY;
    private final Matrix tV;
    private BitmapShader vCE;

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("com.bytedance.sdk", this, me);
        return super.dispatchTouchEvent(me);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure("com.bytedance.sdk", this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public zPa(Context context) {
        this(context, null);
    }

    public zPa(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public zPa(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MY = 25;
        this.EO = 25;
        this.Cc = new RectF();
        Paint paint = new Paint();
        this.IlO = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.tV = new Matrix();
    }

    public void setXRound(int i) {
        this.MY = i;
        postInvalidate();
    }

    public void setYRound(int i) {
        this.EO = i;
        postInvalidate();
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.Cc.set(0.0f, 0.0f, i, i2);
    }

    protected void onDraw(Canvas canvas) {
        Bitmap bitmapIlO;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && (drawable instanceof AnimatedImageDrawable)) {
            super.onDraw(canvas);
            return;
        }
        if (this.vCE == null && (bitmapIlO = IlO(drawable)) != null) {
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.vCE = new BitmapShader(bitmapIlO, tileMode, tileMode);
            float fMax = (bitmapIlO.getWidth() == getWidth() && bitmapIlO.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / bitmapIlO.getWidth(), (getHeight() * 1.0f) / bitmapIlO.getHeight());
            this.tV.setScale(fMax, fMax);
            this.vCE.setLocalMatrix(this.tV);
        }
        BitmapShader bitmapShader = this.vCE;
        if (bitmapShader != null) {
            this.IlO.setShader(bitmapShader);
            canvas.drawRoundRect(this.Cc, this.MY, this.EO, this.IlO);
        } else {
            super.onDraw(canvas);
        }
    }

    public void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        this.vCE = null;
    }

    private Bitmap IlO(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int width = drawable.getIntrinsicWidth() <= 0 ? getWidth() : drawable.getIntrinsicWidth();
        int height = drawable.getIntrinsicHeight() <= 0 ? getHeight() : drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, width, height);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }
}
