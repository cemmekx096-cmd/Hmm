package com.bytedance.adsdk.ugeno.DmF.tV;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import java.util.HashSet;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public class MY extends Drawable {
    private final int Bc;
    private final Paint Cc;
    private final Paint DmF;
    private final RectF EO;
    private final RectF EV;
    private final RectF IlO = new RectF();
    private final RectF MY = new RectF();
    private final Matrix NV;
    private boolean bWL;
    private float cL;
    private boolean cl;
    private float ea;
    private ColorStateList es;
    private Shader.TileMode hp;
    private final RectF lEW;
    private Shader.TileMode rp;
    private final Bitmap tV;
    private final int vCE;
    private ImageView.ScaleType xF;
    private final boolean[] zPa;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public MY(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.EO = rectF;
        this.lEW = new RectF();
        this.NV = new Matrix();
        this.EV = new RectF();
        this.rp = Shader.TileMode.CLAMP;
        this.hp = Shader.TileMode.CLAMP;
        this.bWL = true;
        this.ea = 0.0f;
        this.zPa = new boolean[]{true, true, true, true};
        this.cl = false;
        this.cL = 0.0f;
        this.es = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        this.xF = ImageView.ScaleType.FIT_CENTER;
        this.tV = bitmap;
        int width = bitmap.getWidth();
        this.vCE = width;
        int height = bitmap.getHeight();
        this.Bc = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint();
        this.Cc = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.DmF = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.es.getColorForState(getState(), ViewCompat.MEASURED_STATE_MASK));
        paint2.setStrokeWidth(this.cL);
    }

    public static MY IlO(Bitmap bitmap) {
        if (bitmap != null) {
            return new MY(bitmap);
        }
        return null;
    }

    public static Drawable IlO(Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof MY) {
                return drawable;
            }
            if (Build.VERSION.SDK_INT >= 28 && (drawable instanceof AnimatedImageDrawable)) {
                return drawable;
            }
            if (drawable instanceof LayerDrawable) {
                Drawable.ConstantState constantState = drawable.mutate().getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i = 0; i < numberOfLayers; i++) {
                    layerDrawable.setDrawableByLayerId(layerDrawable.getId(i), IlO(layerDrawable.getDrawable(i)));
                }
                return layerDrawable;
            }
        }
        Bitmap bitmapMY = MY(drawable);
        return bitmapMY != null ? new MY(bitmapMY) : drawable;
    }

    public static Bitmap MY(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
            return null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.es.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState = this.es.getColorForState(iArr, 0);
        if (this.DmF.getColor() != colorForState) {
            this.DmF.setColor(colorForState);
            return true;
        }
        return super.onStateChange(iArr);
    }

    /* renamed from: com.bytedance.adsdk.ugeno.DmF.tV.MY$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] IlO;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            IlO = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IlO[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                IlO[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                IlO[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                IlO[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                IlO[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                IlO[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private void IlO() {
        float fWidth;
        float fHeight;
        int i = AnonymousClass1.IlO[this.xF.ordinal()];
        if (i == 1) {
            this.lEW.set(this.IlO);
            RectF rectF = this.lEW;
            float f = this.cL;
            rectF.inset(f / 2.0f, f / 2.0f);
            this.NV.reset();
            this.NV.setTranslate((int) (((this.lEW.width() - this.vCE) * 0.5f) + 0.5f), (int) (((this.lEW.height() - this.Bc) * 0.5f) + 0.5f));
        } else if (i == 2) {
            this.lEW.set(this.IlO);
            RectF rectF2 = this.lEW;
            float f2 = this.cL;
            rectF2.inset(f2 / 2.0f, f2 / 2.0f);
            this.NV.reset();
            float fWidth2 = 0.0f;
            if (this.vCE * this.lEW.height() > this.lEW.width() * this.Bc) {
                fWidth = this.lEW.height() / this.Bc;
                fHeight = 0.0f;
                fWidth2 = (this.lEW.width() - (this.vCE * fWidth)) * 0.5f;
            } else {
                fWidth = this.lEW.width() / this.vCE;
                fHeight = (this.lEW.height() - (this.Bc * fWidth)) * 0.5f;
            }
            this.NV.setScale(fWidth, fWidth);
            Matrix matrix = this.NV;
            float f3 = this.cL;
            matrix.postTranslate(((int) (fWidth2 + 0.5f)) + (f3 / 2.0f), ((int) (fHeight + 0.5f)) + (f3 / 2.0f));
        } else if (i == 3) {
            this.NV.reset();
            float fMin = (((float) this.vCE) > this.IlO.width() || ((float) this.Bc) > this.IlO.height()) ? Math.min(this.IlO.width() / this.vCE, this.IlO.height() / this.Bc) : 1.0f;
            float fWidth3 = (int) (((this.IlO.width() - (this.vCE * fMin)) * 0.5f) + 0.5f);
            float fHeight2 = (int) (((this.IlO.height() - (this.Bc * fMin)) * 0.5f) + 0.5f);
            this.NV.setScale(fMin, fMin);
            this.NV.postTranslate(fWidth3, fHeight2);
            this.lEW.set(this.EO);
            this.NV.mapRect(this.lEW);
            RectF rectF3 = this.lEW;
            float f4 = this.cL;
            rectF3.inset(f4 / 2.0f, f4 / 2.0f);
            this.NV.setRectToRect(this.EO, this.lEW, Matrix.ScaleToFit.FILL);
        } else if (i == 5) {
            this.lEW.set(this.EO);
            this.NV.setRectToRect(this.EO, this.IlO, Matrix.ScaleToFit.END);
            this.NV.mapRect(this.lEW);
            RectF rectF4 = this.lEW;
            float f5 = this.cL;
            rectF4.inset(f5 / 2.0f, f5 / 2.0f);
            this.NV.setRectToRect(this.EO, this.lEW, Matrix.ScaleToFit.FILL);
        } else if (i == 6) {
            this.lEW.set(this.EO);
            this.NV.setRectToRect(this.EO, this.IlO, Matrix.ScaleToFit.START);
            this.NV.mapRect(this.lEW);
            RectF rectF5 = this.lEW;
            float f6 = this.cL;
            rectF5.inset(f6 / 2.0f, f6 / 2.0f);
            this.NV.setRectToRect(this.EO, this.lEW, Matrix.ScaleToFit.FILL);
        } else if (i != 7) {
            this.lEW.set(this.EO);
            this.NV.setRectToRect(this.EO, this.IlO, Matrix.ScaleToFit.CENTER);
            this.NV.mapRect(this.lEW);
            RectF rectF6 = this.lEW;
            float f7 = this.cL;
            rectF6.inset(f7 / 2.0f, f7 / 2.0f);
            this.NV.setRectToRect(this.EO, this.lEW, Matrix.ScaleToFit.FILL);
        } else {
            this.lEW.set(this.IlO);
            RectF rectF7 = this.lEW;
            float f8 = this.cL;
            rectF7.inset(f8 / 2.0f, f8 / 2.0f);
            this.NV.reset();
            this.NV.setRectToRect(this.EO, this.lEW, Matrix.ScaleToFit.FILL);
        }
        this.MY.set(this.lEW);
        this.bWL = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.IlO.set(rect);
        IlO();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.bWL) {
            BitmapShader bitmapShader = new BitmapShader(this.tV, this.rp, this.hp);
            if (this.rp == Shader.TileMode.CLAMP && this.hp == Shader.TileMode.CLAMP) {
                bitmapShader.setLocalMatrix(this.NV);
            }
            this.Cc.setShader(bitmapShader);
            this.bWL = false;
        }
        if (this.cl) {
            if (this.cL > 0.0f) {
                canvas.drawOval(this.MY, this.Cc);
                canvas.drawOval(this.lEW, this.DmF);
                return;
            } else {
                canvas.drawOval(this.MY, this.Cc);
                return;
            }
        }
        if (IlO(this.zPa)) {
            float f = this.ea;
            if (this.cL > 0.0f) {
                canvas.drawRoundRect(this.MY, f, f, this.Cc);
                canvas.drawRoundRect(this.lEW, f, f, this.DmF);
                IlO(canvas);
                MY(canvas);
                return;
            }
            canvas.drawRoundRect(this.MY, f, f, this.Cc);
            IlO(canvas);
            return;
        }
        canvas.drawRect(this.MY, this.Cc);
        if (this.cL > 0.0f) {
            canvas.drawRect(this.lEW, this.DmF);
        }
    }

    private void IlO(Canvas canvas) {
        if (MY(this.zPa) || this.ea == 0.0f) {
            return;
        }
        float f = this.MY.left;
        float f2 = this.MY.top;
        float fWidth = this.MY.width() + f;
        float fHeight = this.MY.height() + f2;
        float f3 = this.ea;
        if (!this.zPa[0]) {
            this.EV.set(f, f2, f + f3, f2 + f3);
            canvas.drawRect(this.EV, this.Cc);
        }
        if (!this.zPa[1]) {
            this.EV.set(fWidth - f3, f2, fWidth, f3);
            canvas.drawRect(this.EV, this.Cc);
        }
        if (!this.zPa[2]) {
            this.EV.set(fWidth - f3, fHeight - f3, fWidth, fHeight);
            canvas.drawRect(this.EV, this.Cc);
        }
        if (this.zPa[3]) {
            return;
        }
        this.EV.set(f, fHeight - f3, f3 + f, fHeight);
        canvas.drawRect(this.EV, this.Cc);
    }

    private void MY(Canvas canvas) {
        if (MY(this.zPa) || this.ea == 0.0f) {
            return;
        }
        float f = this.MY.left;
        float f2 = this.MY.top;
        float fWidth = f + this.MY.width();
        float fHeight = f2 + this.MY.height();
        float f3 = this.ea;
        float f4 = this.cL / 2.0f;
        if (!this.zPa[0]) {
            canvas.drawLine(f - f4, f2, f + f3, f2, this.DmF);
            canvas.drawLine(f, f2 - f4, f, f2 + f3, this.DmF);
        }
        if (!this.zPa[1]) {
            canvas.drawLine((fWidth - f3) - f4, f2, fWidth, f2, this.DmF);
            canvas.drawLine(fWidth, f2 - f4, fWidth, f2 + f3, this.DmF);
        }
        if (!this.zPa[2]) {
            canvas.drawLine((fWidth - f3) - f4, fHeight, fWidth + f4, fHeight, this.DmF);
            canvas.drawLine(fWidth, fHeight - f3, fWidth, fHeight, this.DmF);
        }
        if (this.zPa[3]) {
            return;
        }
        canvas.drawLine(f - f4, fHeight, f + f3, fHeight, this.DmF);
        canvas.drawLine(f, fHeight - f3, f, fHeight, this.DmF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.Cc.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.Cc.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.Cc.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.Cc.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.Cc.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.Cc.setFilterBitmap(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.vCE;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.Bc;
    }

    public MY IlO(float f, float f2, float f3, float f4) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f));
        hashSet.add(Float.valueOf(f2));
        hashSet.add(Float.valueOf(f3));
        hashSet.add(Float.valueOf(f4));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
        }
        if (!hashSet.isEmpty()) {
            float fFloatValue = ((Float) hashSet.iterator().next()).floatValue();
            if (Float.isInfinite(fFloatValue) || Float.isNaN(fFloatValue) || fFloatValue < 0.0f) {
                throw new IllegalArgumentException("Invalid radius value: ".concat(String.valueOf(fFloatValue)));
            }
            this.ea = fFloatValue;
        } else {
            this.ea = 0.0f;
        }
        boolean[] zArr = this.zPa;
        zArr[0] = f > 0.0f;
        zArr[1] = f2 > 0.0f;
        zArr[2] = f3 > 0.0f;
        zArr[3] = f4 > 0.0f;
        return this;
    }

    public MY IlO(float f) {
        this.cL = f;
        this.DmF.setStrokeWidth(f);
        return this;
    }

    public MY IlO(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.es = colorStateList;
        this.DmF.setColor(colorStateList.getColorForState(getState(), ViewCompat.MEASURED_STATE_MASK));
        return this;
    }

    public MY IlO(boolean z) {
        this.cl = z;
        return this;
    }

    public MY IlO(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.xF != scaleType) {
            this.xF = scaleType;
            IlO();
        }
        return this;
    }

    public MY IlO(Shader.TileMode tileMode) {
        if (this.rp != tileMode) {
            this.rp = tileMode;
            this.bWL = true;
            invalidateSelf();
        }
        return this;
    }

    public MY MY(Shader.TileMode tileMode) {
        if (this.hp != tileMode) {
            this.hp = tileMode;
            this.bWL = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean IlO(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    private static boolean MY(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return false;
            }
        }
        return true;
    }
}
