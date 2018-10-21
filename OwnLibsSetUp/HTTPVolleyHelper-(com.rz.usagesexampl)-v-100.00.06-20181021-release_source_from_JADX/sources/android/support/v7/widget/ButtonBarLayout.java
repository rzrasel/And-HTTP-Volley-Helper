package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.p017g.C0227p;
import android.support.v7.p020a.C0270a.C0265f;
import android.support.v7.p020a.C0270a.C0269j;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class ButtonBarLayout extends LinearLayout {
    /* renamed from: a */
    private boolean f1155a;
    /* renamed from: b */
    private int f1156b = -1;
    /* renamed from: c */
    private int f1157c = 0;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0269j.ButtonBarLayout);
        this.f1155a = obtainStyledAttributes.getBoolean(C0269j.ButtonBarLayout_allowStacking, true);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private int m1265a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    private boolean m1266a() {
        return getOrientation() == 1;
    }

    private void setStacked(boolean z) {
        setOrientation(z);
        setGravity(z ? 5 : 80);
        View findViewById = findViewById(C0265f.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    public int getMinimumHeight() {
        return Math.max(this.f1157c, super.getMinimumHeight());
    }

    protected void onMeasure(int i, int i2) {
        Object obj;
        int size = MeasureSpec.getSize(i);
        int i3 = 0;
        if (this.f1155a) {
            if (size > this.f1156b && m1266a()) {
                setStacked(false);
            }
            this.f1156b = size;
        }
        if (m1266a() || MeasureSpec.getMode(i) != 1073741824) {
            size = i;
            obj = null;
        } else {
            size = MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            obj = 1;
        }
        super.onMeasure(size, i2);
        if (this.f1155a && !m1266a()) {
            if (((getMeasuredWidthAndState() & -16777216) == 16777216 ? 1 : null) != null) {
                setStacked(true);
                obj = 1;
            }
        }
        if (obj != null) {
            super.onMeasure(i, i2);
        }
        i = m1265a(0);
        if (i >= 0) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int paddingTop = (((getPaddingTop() + childAt.getMeasuredHeight()) + layoutParams.topMargin) + layoutParams.bottomMargin) + 0;
            if (m1266a()) {
                i = m1265a(i + 1);
                if (i >= 0) {
                    paddingTop += getChildAt(i).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i3 = paddingTop;
            } else {
                i3 = paddingTop + getPaddingBottom();
            }
        }
        if (C0227p.m877c(this) != i3) {
            setMinimumHeight(i3);
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f1155a != z) {
            this.f1155a = z;
            if (!this.f1155a && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
