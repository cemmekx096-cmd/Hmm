package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
public final class CircularProgressIndicator extends BaseProgressIndicator<CircularProgressIndicatorSpec> {
    public static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_CircularProgressIndicator;
    public static final int INDICATOR_DIRECTION_CLOCKWISE = 0;
    public static final int INDICATOR_DIRECTION_COUNTERCLOCKWISE = 1;

    @Retention(RetentionPolicy.SOURCE)
    public @interface IndicatorDirection {
    }

    public CircularProgressIndicator(Context context) {
        this(context, null);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, DEF_STYLE_RES);
        initializeDrawables();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CircularProgressIndicatorSpec createSpec(Context context, AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    private void initializeDrawables() {
        setIndeterminateDrawable(IndeterminateDrawable.createCircularDrawable(getContext(), this.spec));
        setProgressDrawable(DeterminateDrawable.createCircularDrawable(getContext(), this.spec));
    }

    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        this.spec.validateSpec();
    }

    public int getIndicatorInset() {
        return this.spec.indicatorInset;
    }

    public void setIndicatorInset(int i) {
        if (this.spec.indicatorInset != i) {
            this.spec.indicatorInset = i;
            invalidate();
        }
    }

    public int getIndicatorSize() {
        return this.spec.indicatorSize;
    }

    public void setIndicatorSize(int i) {
        int iMax = Math.max(i, getTrackThickness() * 2);
        if (this.spec.indicatorSize != iMax) {
            this.spec.indicatorSize = iMax;
            this.spec.validateSpec();
            invalidate();
        }
    }

    public int getIndicatorDirection() {
        return this.spec.indicatorDirection;
    }

    public void setIndicatorDirection(int i) {
        this.spec.indicatorDirection = i;
        invalidate();
    }
}
