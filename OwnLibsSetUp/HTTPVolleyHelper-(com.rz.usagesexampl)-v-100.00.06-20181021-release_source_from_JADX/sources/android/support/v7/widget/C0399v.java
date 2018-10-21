package android.support.v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.p020a.C0270a.C0260a;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* renamed from: android.support.v7.widget.v */
public class C0399v extends RatingBar {
    /* renamed from: a */
    private final C0398t f1438a;

    public C0399v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0260a.ratingBarStyle);
    }

    public C0399v(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1438a = new C0398t(this);
        this.f1438a.mo341a(attributeSet, i);
    }

    protected synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap a = this.f1438a.m1601a();
        if (a != null) {
            setMeasuredDimension(View.resolveSizeAndState(a.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
