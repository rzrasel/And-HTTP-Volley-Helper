package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.p017g.C0213d;
import android.support.v4.p017g.C0227p;
import android.support.v7.p020a.C0270a.C0265f;
import android.support.v7.p020a.C0270a.C0269j;
import android.support.v7.widget.aj.C0366a;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

public class AlertDialogLayout extends aj {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private void m2804a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    /* renamed from: c */
    private static int m2805c(View view) {
        int c = C0227p.m877c(view);
        if (c > 0) {
            return c;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return m2805c(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* renamed from: c */
    private boolean m2806c(int i, int i2) {
        int i3;
        int combineMeasuredStates;
        int c;
        int measuredHeight;
        int measuredHeight2;
        AlertDialogLayout alertDialogLayout = this;
        int i4 = i;
        int i5 = i2;
        int childCount = getChildCount();
        View view = null;
        View view2 = view;
        View view3 = view2;
        for (i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == C0265f.topPanel) {
                    view = childAt;
                } else if (id == C0265f.buttonPanel) {
                    view2 = childAt;
                } else {
                    if (id != C0265f.contentPanel) {
                        if (id != C0265f.customPanel) {
                            return false;
                        }
                    }
                    if (view3 != null) {
                        return false;
                    }
                    view3 = childAt;
                }
            }
        }
        i3 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        int mode = MeasureSpec.getMode(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i4, 0);
            paddingTop += view.getMeasuredHeight();
            combineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            combineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i4, 0);
            c = m2805c(view2);
            measuredHeight = view2.getMeasuredHeight() - c;
            paddingTop += c;
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, view2.getMeasuredState());
        } else {
            c = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i4, i3 == 0 ? 0 : MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), i3));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingTop += measuredHeight2;
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        size -= paddingTop;
        if (view2 != null) {
            paddingTop -= c;
            measuredHeight = Math.min(size, measuredHeight);
            if (measuredHeight > 0) {
                size -= measuredHeight;
                c += measuredHeight;
            }
            view2.measure(i4, MeasureSpec.makeMeasureSpec(c, 1073741824));
            paddingTop += view2.getMeasuredHeight();
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && size > 0) {
            paddingTop -= measuredHeight2;
            view3.measure(i4, MeasureSpec.makeMeasureSpec(measuredHeight2 + size, i3));
            paddingTop += view3.getMeasuredHeight();
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, view3.getMeasuredState());
        }
        int i6 = 0;
        for (i3 = 0; i3 < childCount; i3++) {
            view3 = getChildAt(i3);
            if (view3.getVisibility() != 8) {
                i6 = Math.max(i6, view3.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i6 + (getPaddingLeft() + getPaddingRight()), i4, combineMeasuredStates), View.resolveSizeAndState(paddingTop, i5, 0));
        if (mode != 1073741824) {
            m2807d(childCount, i5);
        }
        return true;
    }

    /* renamed from: d */
    private void m2807d(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0366a c0366a = (C0366a) childAt.getLayoutParams();
                if (c0366a.width == -1) {
                    int i4 = c0366a.height;
                    c0366a.height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, makeMeasureSpec, 0, i2, 0);
                    c0366a.height = i4;
                }
            }
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AlertDialogLayout alertDialogLayout = this;
        int paddingLeft = getPaddingLeft();
        int i5 = i3 - i;
        int paddingRight = i5 - getPaddingRight();
        int paddingRight2 = (i5 - paddingLeft) - getPaddingRight();
        i5 = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i6 = gravity & C0269j.AppCompatTheme_windowActionModeOverlay;
        int i7 = gravity & 8388615;
        int paddingTop = i6 != 16 ? i6 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - i5 : (((i4 - i2) - i5) / 2) + getPaddingTop();
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                int i9;
                i6 = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                C0366a c0366a = (C0366a) childAt.getLayoutParams();
                i5 = c0366a.f1273h;
                if (i5 < 0) {
                    i5 = i7;
                }
                i5 = C0213d.m797a(i5, C0227p.m876b(this)) & 7;
                if (i5 == 1) {
                    i5 = (((paddingRight2 - i6) / 2) + paddingLeft) + c0366a.leftMargin;
                } else if (i5 != 5) {
                    i5 = c0366a.leftMargin + paddingLeft;
                    if (m1445c(i8)) {
                        paddingTop += intrinsicHeight;
                    }
                    i9 = paddingTop + c0366a.topMargin;
                    m2804a(childAt, i5, i9, i6, measuredHeight);
                    paddingTop = i9 + (measuredHeight + c0366a.bottomMargin);
                } else {
                    i5 = paddingRight - i6;
                }
                i5 -= c0366a.rightMargin;
                if (m1445c(i8)) {
                    paddingTop += intrinsicHeight;
                }
                i9 = paddingTop + c0366a.topMargin;
                m2804a(childAt, i5, i9, i6, measuredHeight);
                paddingTop = i9 + (measuredHeight + c0366a.bottomMargin);
            }
        }
    }

    protected void onMeasure(int i, int i2) {
        if (!m2806c(i, i2)) {
            super.onMeasure(i, i2);
        }
    }
}
