package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.p020a.C0270a.C0265f;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public class ActionBarContainer extends FrameLayout {
    /* renamed from: a */
    Drawable f1116a;
    /* renamed from: b */
    Drawable f1117b;
    /* renamed from: c */
    Drawable f1118c;
    /* renamed from: d */
    boolean f1119d;
    /* renamed from: e */
    boolean f1120e;
    /* renamed from: f */
    private boolean f1121f;
    /* renamed from: g */
    private View f1122g;
    /* renamed from: h */
    private View f1123h;
    /* renamed from: i */
    private View f1124i;
    /* renamed from: j */
    private int f1125j;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActionBarContainer(android.content.Context r3, android.util.AttributeSet r4) {
        /*
        r2 = this;
        r2.<init>(r3, r4);
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 21;
        if (r0 < r1) goto L_0x000f;
    L_0x0009:
        r0 = new android.support.v7.widget.c;
        r0.<init>(r2);
        goto L_0x0014;
    L_0x000f:
        r0 = new android.support.v7.widget.b;
        r0.<init>(r2);
    L_0x0014:
        android.support.v4.p017g.C0227p.m870a(r2, r0);
        r0 = android.support.v7.p020a.C0270a.C0269j.ActionBar;
        r3 = r3.obtainStyledAttributes(r4, r0);
        r4 = android.support.v7.p020a.C0270a.C0269j.ActionBar_background;
        r4 = r3.getDrawable(r4);
        r2.f1116a = r4;
        r4 = android.support.v7.p020a.C0270a.C0269j.ActionBar_backgroundStacked;
        r4 = r3.getDrawable(r4);
        r2.f1117b = r4;
        r4 = android.support.v7.p020a.C0270a.C0269j.ActionBar_height;
        r0 = -1;
        r4 = r3.getDimensionPixelSize(r4, r0);
        r2.f1125j = r4;
        r4 = r2.getId();
        r0 = android.support.v7.p020a.C0270a.C0265f.split_action_bar;
        r1 = 1;
        if (r4 != r0) goto L_0x0049;
    L_0x003f:
        r2.f1119d = r1;
        r4 = android.support.v7.p020a.C0270a.C0269j.ActionBar_backgroundSplit;
        r4 = r3.getDrawable(r4);
        r2.f1118c = r4;
    L_0x0049:
        r3.recycle();
        r3 = r2.f1119d;
        r4 = 0;
        if (r3 == 0) goto L_0x0057;
    L_0x0051:
        r3 = r2.f1118c;
        if (r3 != 0) goto L_0x0060;
    L_0x0055:
        r4 = 1;
        goto L_0x0060;
    L_0x0057:
        r3 = r2.f1116a;
        if (r3 != 0) goto L_0x0060;
    L_0x005b:
        r3 = r2.f1117b;
        if (r3 != 0) goto L_0x0060;
    L_0x005f:
        goto L_0x0055;
    L_0x0060:
        r2.setWillNotDraw(r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarContainer.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: a */
    private boolean m1240a(View view) {
        if (!(view == null || view.getVisibility() == 8)) {
            if (view.getMeasuredHeight() != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private int m1241b(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return (view.getMeasuredHeight() + layoutParams.topMargin) + layoutParams.bottomMargin;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f1116a != null && this.f1116a.isStateful()) {
            this.f1116a.setState(getDrawableState());
        }
        if (this.f1117b != null && this.f1117b.isStateful()) {
            this.f1117b.setState(getDrawableState());
        }
        if (this.f1118c != null && this.f1118c.isStateful()) {
            this.f1118c.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f1122g;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f1116a != null) {
            this.f1116a.jumpToCurrentState();
        }
        if (this.f1117b != null) {
            this.f1117b.jumpToCurrentState();
        }
        if (this.f1118c != null) {
            this.f1118c.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1123h = findViewById(C0265f.action_bar);
        this.f1124i = findViewById(C0265f.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f1121f) {
            if (!super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
        }
        return true;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f1122g;
        i4 = 1;
        int i5 = 0;
        boolean z2 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!(view == null || view.getVisibility() == 8)) {
            i2 = getMeasuredHeight();
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            view.layout(i, (i2 - view.getMeasuredHeight()) - layoutParams.bottomMargin, i3, i2 - layoutParams.bottomMargin);
        }
        if (!this.f1119d) {
            if (this.f1116a != null) {
                Drawable drawable;
                View view2;
                if (this.f1123h.getVisibility() == 0) {
                    drawable = this.f1116a;
                    i2 = this.f1123h.getLeft();
                    i3 = this.f1123h.getTop();
                    i5 = this.f1123h.getRight();
                    view2 = this.f1123h;
                } else if (this.f1124i == null || this.f1124i.getVisibility() != 0) {
                    this.f1116a.setBounds(0, 0, 0, 0);
                    i5 = 1;
                } else {
                    drawable = this.f1116a;
                    i2 = this.f1124i.getLeft();
                    i3 = this.f1124i.getTop();
                    i5 = this.f1124i.getRight();
                    view2 = this.f1124i;
                }
                drawable.setBounds(i2, i3, i5, view2.getBottom());
                i5 = 1;
            }
            this.f1120e = z2;
            if (!z2 || this.f1117b == null) {
                i4 = i5;
            } else {
                this.f1117b.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        } else if (this.f1118c != null) {
            this.f1118c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        } else {
            i4 = 0;
        }
        if (i4 != 0) {
            invalidate();
        }
    }

    public void onMeasure(int i, int i2) {
        if (this.f1123h == null && MeasureSpec.getMode(i2) == Integer.MIN_VALUE && this.f1125j >= 0) {
            i2 = MeasureSpec.makeMeasureSpec(Math.min(this.f1125j, MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f1123h != null) {
            i = MeasureSpec.getMode(i2);
            if (!(this.f1122g == null || this.f1122g.getVisibility() == 8 || i == 1073741824)) {
                View view;
                int i3;
                if (!m1240a(this.f1123h)) {
                    view = this.f1123h;
                } else if (m1240a(this.f1124i)) {
                    i3 = 0;
                    setMeasuredDimension(getMeasuredWidth(), Math.min(i3 + m1241b(this.f1122g), i != Integer.MIN_VALUE ? MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
                } else {
                    view = this.f1124i;
                }
                i3 = m1241b(view);
                if (i != Integer.MIN_VALUE) {
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(i3 + m1241b(this.f1122g), i != Integer.MIN_VALUE ? MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setPrimaryBackground(android.graphics.drawable.Drawable r5) {
        /*
        r4 = this;
        r0 = r4.f1116a;
        if (r0 == 0) goto L_0x000f;
    L_0x0004:
        r0 = r4.f1116a;
        r1 = 0;
        r0.setCallback(r1);
        r0 = r4.f1116a;
        r4.unscheduleDrawable(r0);
    L_0x000f:
        r4.f1116a = r5;
        if (r5 == 0) goto L_0x0037;
    L_0x0013:
        r5.setCallback(r4);
        r5 = r4.f1123h;
        if (r5 == 0) goto L_0x0037;
    L_0x001a:
        r5 = r4.f1116a;
        r0 = r4.f1123h;
        r0 = r0.getLeft();
        r1 = r4.f1123h;
        r1 = r1.getTop();
        r2 = r4.f1123h;
        r2 = r2.getRight();
        r3 = r4.f1123h;
        r3 = r3.getBottom();
        r5.setBounds(r0, r1, r2, r3);
    L_0x0037:
        r5 = r4.f1119d;
        r0 = 0;
        r1 = 1;
        if (r5 == 0) goto L_0x0043;
    L_0x003d:
        r5 = r4.f1118c;
        if (r5 != 0) goto L_0x004c;
    L_0x0041:
        r0 = 1;
        goto L_0x004c;
    L_0x0043:
        r5 = r4.f1116a;
        if (r5 != 0) goto L_0x004c;
    L_0x0047:
        r5 = r4.f1117b;
        if (r5 != 0) goto L_0x004c;
    L_0x004b:
        goto L_0x0041;
    L_0x004c:
        r4.setWillNotDraw(r0);
        r4.invalidate();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarContainer.setPrimaryBackground(android.graphics.drawable.Drawable):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSplitBackground(android.graphics.drawable.Drawable r4) {
        /*
        r3 = this;
        r0 = r3.f1118c;
        if (r0 == 0) goto L_0x000f;
    L_0x0004:
        r0 = r3.f1118c;
        r1 = 0;
        r0.setCallback(r1);
        r0 = r3.f1118c;
        r3.unscheduleDrawable(r0);
    L_0x000f:
        r3.f1118c = r4;
        r0 = 0;
        if (r4 == 0) goto L_0x002c;
    L_0x0014:
        r4.setCallback(r3);
        r4 = r3.f1119d;
        if (r4 == 0) goto L_0x002c;
    L_0x001b:
        r4 = r3.f1118c;
        if (r4 == 0) goto L_0x002c;
    L_0x001f:
        r4 = r3.f1118c;
        r1 = r3.getMeasuredWidth();
        r2 = r3.getMeasuredHeight();
        r4.setBounds(r0, r0, r1, r2);
    L_0x002c:
        r4 = r3.f1119d;
        r1 = 1;
        if (r4 == 0) goto L_0x0037;
    L_0x0031:
        r4 = r3.f1118c;
        if (r4 != 0) goto L_0x0040;
    L_0x0035:
        r0 = 1;
        goto L_0x0040;
    L_0x0037:
        r4 = r3.f1116a;
        if (r4 != 0) goto L_0x0040;
    L_0x003b:
        r4 = r3.f1117b;
        if (r4 != 0) goto L_0x0040;
    L_0x003f:
        goto L_0x0035;
    L_0x0040:
        r3.setWillNotDraw(r0);
        r3.invalidate();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarContainer.setSplitBackground(android.graphics.drawable.Drawable):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setStackedBackground(android.graphics.drawable.Drawable r5) {
        /*
        r4 = this;
        r0 = r4.f1117b;
        if (r0 == 0) goto L_0x000f;
    L_0x0004:
        r0 = r4.f1117b;
        r1 = 0;
        r0.setCallback(r1);
        r0 = r4.f1117b;
        r4.unscheduleDrawable(r0);
    L_0x000f:
        r4.f1117b = r5;
        if (r5 == 0) goto L_0x003b;
    L_0x0013:
        r5.setCallback(r4);
        r5 = r4.f1120e;
        if (r5 == 0) goto L_0x003b;
    L_0x001a:
        r5 = r4.f1117b;
        if (r5 == 0) goto L_0x003b;
    L_0x001e:
        r5 = r4.f1117b;
        r0 = r4.f1122g;
        r0 = r0.getLeft();
        r1 = r4.f1122g;
        r1 = r1.getTop();
        r2 = r4.f1122g;
        r2 = r2.getRight();
        r3 = r4.f1122g;
        r3 = r3.getBottom();
        r5.setBounds(r0, r1, r2, r3);
    L_0x003b:
        r5 = r4.f1119d;
        r0 = 0;
        r1 = 1;
        if (r5 == 0) goto L_0x0047;
    L_0x0041:
        r5 = r4.f1118c;
        if (r5 != 0) goto L_0x0050;
    L_0x0045:
        r0 = 1;
        goto L_0x0050;
    L_0x0047:
        r5 = r4.f1116a;
        if (r5 != 0) goto L_0x0050;
    L_0x004b:
        r5 = r4.f1117b;
        if (r5 != 0) goto L_0x0050;
    L_0x004f:
        goto L_0x0045;
    L_0x0050:
        r4.setWillNotDraw(r0);
        r4.invalidate();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarContainer.setStackedBackground(android.graphics.drawable.Drawable):void");
    }

    public void setTabContainer(ap apVar) {
        if (this.f1122g != null) {
            removeView(this.f1122g);
        }
        this.f1122g = apVar;
        if (apVar != null) {
            addView(apVar);
            ViewGroup.LayoutParams layoutParams = apVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            apVar.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f1121f = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        if (this.f1116a != null) {
            this.f1116a.setVisible(z, false);
        }
        if (this.f1117b != null) {
            this.f1117b.setVisible(z, false);
        }
        if (this.f1118c != null) {
            this.f1118c.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, Callback callback, int i) {
        return i != 0 ? super.startActionModeForChild(view, callback, i) : null;
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f1116a && !this.f1119d) || ((drawable == this.f1117b && this.f1120e) || ((drawable == this.f1118c && this.f1119d) || super.verifyDrawable(drawable)));
    }
}
