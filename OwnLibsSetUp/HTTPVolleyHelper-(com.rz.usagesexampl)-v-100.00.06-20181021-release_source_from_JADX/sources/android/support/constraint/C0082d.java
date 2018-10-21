package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.C0087g.C0086b;
import android.support.constraint.ConstraintLayout.C0050a;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;

/* renamed from: android.support.constraint.d */
public class C0082d extends ViewGroup {
    /* renamed from: a */
    C0081c f456a;

    /* renamed from: android.support.constraint.d$a */
    public static class C0521a extends C0050a {
        public float an;
        public boolean ao;
        public float ap;
        public float aq;
        public float ar;
        public float as;
        public float at;
        public float au;
        public float av;
        public float aw;
        public float ax;
        public float ay;
        public float az;

        public C0521a(int i, int i2) {
            super(i, i2);
            this.an = 1.0f;
            this.ao = false;
            this.ap = 0.0f;
            this.aq = 0.0f;
            this.ar = 0.0f;
            this.as = 0.0f;
            this.at = 1.0f;
            this.au = 1.0f;
            this.av = 0.0f;
            this.aw = 0.0f;
            this.ax = 0.0f;
            this.ay = 0.0f;
            this.az = 0.0f;
        }

        public C0521a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.an = 1.0f;
            int i = 0;
            this.ao = false;
            this.ap = 0.0f;
            this.aq = 0.0f;
            this.ar = 0.0f;
            this.as = 0.0f;
            this.at = 1.0f;
            this.au = 1.0f;
            this.av = 0.0f;
            this.aw = 0.0f;
            this.ax = 0.0f;
            this.ay = 0.0f;
            this.az = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0086b.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            while (i < indexCount) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0086b.ConstraintSet_android_alpha) {
                    this.an = obtainStyledAttributes.getFloat(index, this.an);
                } else if (index == C0086b.ConstraintSet_android_elevation) {
                    this.ap = obtainStyledAttributes.getFloat(index, this.ap);
                    this.ao = true;
                } else if (index == C0086b.ConstraintSet_android_rotationX) {
                    this.ar = obtainStyledAttributes.getFloat(index, this.ar);
                } else if (index == C0086b.ConstraintSet_android_rotationY) {
                    this.as = obtainStyledAttributes.getFloat(index, this.as);
                } else if (index == C0086b.ConstraintSet_android_rotation) {
                    this.aq = obtainStyledAttributes.getFloat(index, this.aq);
                } else if (index == C0086b.ConstraintSet_android_scaleX) {
                    this.at = obtainStyledAttributes.getFloat(index, this.at);
                } else if (index == C0086b.ConstraintSet_android_scaleY) {
                    this.au = obtainStyledAttributes.getFloat(index, this.au);
                } else if (index == C0086b.ConstraintSet_android_transformPivotX) {
                    this.av = obtainStyledAttributes.getFloat(index, this.av);
                } else if (index == C0086b.ConstraintSet_android_transformPivotY) {
                    this.aw = obtainStyledAttributes.getFloat(index, this.aw);
                } else {
                    float f;
                    if (index == C0086b.ConstraintSet_android_translationX) {
                        f = this.ax;
                    } else if (index == C0086b.ConstraintSet_android_translationY) {
                        this.ay = obtainStyledAttributes.getFloat(index, this.ay);
                    } else if (index == C0086b.ConstraintSet_android_translationZ) {
                        f = this.az;
                    }
                    this.ax = obtainStyledAttributes.getFloat(index, f);
                }
                i++;
            }
        }
    }

    /* renamed from: a */
    protected C0521a m353a() {
        return new C0521a(-2, -2);
    }

    /* renamed from: a */
    public C0521a m354a(AttributeSet attributeSet) {
        return new C0521a(getContext(), attributeSet);
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return m353a();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return m354a(attributeSet);
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new C0050a(layoutParams);
    }

    public C0081c getConstraintSet() {
        if (this.f456a == null) {
            this.f456a = new C0081c();
        }
        this.f456a.m352a(this);
        return this.f456a;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
