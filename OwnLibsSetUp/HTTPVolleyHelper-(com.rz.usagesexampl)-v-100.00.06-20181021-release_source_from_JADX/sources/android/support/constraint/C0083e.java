package android.support.constraint;

import android.content.Context;
import android.graphics.Canvas;
import android.support.constraint.ConstraintLayout.C0050a;
import android.view.View;

/* renamed from: android.support.constraint.e */
public class C0083e extends View {
    public C0083e(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public void draw(Canvas canvas) {
    }

    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        C0050a c0050a = (C0050a) getLayoutParams();
        c0050a.f137a = i;
        setLayoutParams(c0050a);
    }

    public void setGuidelineEnd(int i) {
        C0050a c0050a = (C0050a) getLayoutParams();
        c0050a.f138b = i;
        setLayoutParams(c0050a);
    }

    public void setGuidelinePercent(float f) {
        C0050a c0050a = (C0050a) getLayoutParams();
        c0050a.f139c = f;
        setLayoutParams(c0050a);
    }

    public void setVisibility(int i) {
    }
}
