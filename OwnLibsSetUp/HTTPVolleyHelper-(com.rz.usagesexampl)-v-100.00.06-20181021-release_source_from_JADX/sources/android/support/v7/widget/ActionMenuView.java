package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.C0330o.C0329a;
import android.support.v7.view.menu.C0332p;
import android.support.v7.view.menu.C0598h;
import android.support.v7.view.menu.C0598h.C0325a;
import android.support.v7.view.menu.C0598h.C0326b;
import android.support.v7.view.menu.C0601j;
import android.support.v7.widget.aj.C0366a;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;

public class ActionMenuView extends aj implements C0326b, C0332p {
    /* renamed from: a */
    C0325a f2257a;
    /* renamed from: b */
    C0344e f2258b;
    /* renamed from: c */
    private C0598h f2259c;
    /* renamed from: d */
    private Context f2260d;
    /* renamed from: e */
    private int f2261e;
    /* renamed from: f */
    private boolean f2262f;
    /* renamed from: g */
    private C0765d f2263g;
    /* renamed from: h */
    private C0329a f2264h;
    /* renamed from: i */
    private boolean f2265i;
    /* renamed from: j */
    private int f2266j;
    /* renamed from: k */
    private int f2267k;
    /* renamed from: l */
    private int f2268l;

    /* renamed from: android.support.v7.widget.ActionMenuView$a */
    public interface C0343a {
        /* renamed from: c */
        boolean mo498c();

        /* renamed from: d */
        boolean mo499d();
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$e */
    public interface C0344e {
        /* renamed from: a */
        boolean mo274a(MenuItem menuItem);
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$b */
    private static class C0607b implements C0329a {
        C0607b() {
        }

        /* renamed from: a */
        public void mo140a(C0598h c0598h, boolean z) {
        }

        /* renamed from: a */
        public boolean mo141a(C0598h c0598h) {
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$c */
    public static class C0608c extends C0366a {
        @ExportedProperty
        /* renamed from: a */
        public boolean f2250a;
        @ExportedProperty
        /* renamed from: b */
        public int f2251b;
        @ExportedProperty
        /* renamed from: c */
        public int f2252c;
        @ExportedProperty
        /* renamed from: d */
        public boolean f2253d;
        @ExportedProperty
        /* renamed from: e */
        public boolean f2254e;
        /* renamed from: f */
        boolean f2255f;

        public C0608c(int i, int i2) {
            super(i, i2);
            this.f2250a = false;
        }

        public C0608c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0608c(C0608c c0608c) {
            super(c0608c);
            this.f2250a = c0608c.f2250a;
        }

        public C0608c(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$d */
    private class C0609d implements C0325a {
        /* renamed from: a */
        final /* synthetic */ ActionMenuView f2256a;

        C0609d(ActionMenuView actionMenuView) {
            this.f2256a = actionMenuView;
        }

        /* renamed from: a */
        public void mo149a(C0598h c0598h) {
            if (this.f2256a.f2257a != null) {
                this.f2256a.f2257a.mo149a(c0598h);
            }
        }

        /* renamed from: a */
        public boolean mo150a(C0598h c0598h, MenuItem menuItem) {
            return this.f2256a.f2258b != null && this.f2256a.f2258b.mo274a(menuItem);
        }
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f2267k = (int) (56.0f * f);
        this.f2268l = (int) (f * 4.0f);
        this.f2260d = context;
        this.f2261e = 0;
    }

    /* renamed from: a */
    static int m2784a(View view, int i, int i2, int i3, int i4) {
        C0608c c0608c = (C0608c) view.getLayoutParams();
        i3 = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i3) - i4, MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        Object obj = (actionMenuItemView == null || !actionMenuItemView.m3538b()) ? null : 1;
        int i5 = 2;
        if (i2 <= 0 || (obj != null && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), i3);
            i2 = view.getMeasuredWidth();
            int i6 = i2 / i;
            if (i2 % i != 0) {
                i6++;
            }
            if (obj == null || i6 >= 2) {
                i5 = i6;
            }
        }
        if (c0608c.f2250a || obj == null) {
            z = false;
        }
        c0608c.f2253d = z;
        c0608c.f2251b = i5;
        view.measure(MeasureSpec.makeMeasureSpec(i * i5, 1073741824), i3);
        return i5;
    }

    /* renamed from: c */
    private void m2785c(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
        size -= paddingLeft;
        paddingLeft = size / this.f2267k;
        int i3 = size % this.f2267k;
        if (paddingLeft == 0) {
            setMeasuredDimension(size, 0);
            return;
        }
        int i4;
        int i5;
        Object obj;
        int i6;
        int i7;
        int i8;
        View childAt;
        int i9 = r0.f2267k + (i3 / paddingLeft);
        i3 = getChildCount();
        int i10 = paddingLeft;
        paddingLeft = 0;
        int i11 = 0;
        Object obj2 = null;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        long j = 0;
        while (paddingLeft < i3) {
            View childAt2 = getChildAt(paddingLeft);
            i4 = size2;
            if (childAt2.getVisibility() == 8) {
                i5 = size;
            } else {
                int i15;
                boolean z;
                int i16;
                boolean z2 = childAt2 instanceof ActionMenuItemView;
                i12++;
                if (z2) {
                    i15 = i12;
                    i5 = size;
                    z = false;
                    childAt2.setPadding(r0.f2268l, 0, r0.f2268l, 0);
                } else {
                    i5 = size;
                    i15 = i12;
                    z = false;
                }
                C0608c c0608c = (C0608c) childAt2.getLayoutParams();
                c0608c.f2255f = z;
                c0608c.f2252c = z;
                c0608c.f2251b = z;
                c0608c.f2253d = z;
                c0608c.leftMargin = z;
                c0608c.rightMargin = z;
                z = z2 && ((ActionMenuItemView) childAt2).m3538b();
                c0608c.f2254e = z;
                size = m2784a(childAt2, i9, c0608c.f2250a ? 1 : i10, childMeasureSpec, paddingTop);
                size2 = Math.max(i13, size);
                if (c0608c.f2253d) {
                    i14++;
                }
                if (c0608c.f2250a) {
                    obj2 = 1;
                }
                i10 -= size;
                i11 = Math.max(i11, childAt2.getMeasuredHeight());
                if (size == 1) {
                    i16 = size2;
                    j |= (long) (1 << paddingLeft);
                } else {
                    i16 = size2;
                }
                i12 = i15;
                i13 = i16;
            }
            paddingLeft++;
            size2 = i4;
            size = i5;
        }
        i5 = size;
        i4 = size2;
        Object obj3 = (obj2 == null || i12 != 2) ? null : 1;
        Object obj4 = null;
        while (i14 > 0 && i10 > 0) {
            paddingTop = 0;
            int i17 = 0;
            int i18 = Integer.MAX_VALUE;
            long j2 = 0;
            while (paddingTop < i3) {
                C0608c c0608c2 = (C0608c) getChildAt(paddingTop).getLayoutParams();
                obj = obj4;
                if (c0608c2.f2253d) {
                    if (c0608c2.f2251b < i18) {
                        j2 = 1 << paddingTop;
                        i18 = c0608c2.f2251b;
                        i17 = 1;
                    } else if (c0608c2.f2251b == i18) {
                        j2 |= 1 << paddingTop;
                        i17++;
                    }
                }
                paddingTop++;
                obj4 = obj;
            }
            obj = obj4;
            j |= j2;
            if (i17 > i10) {
                break;
            }
            i18++;
            size = 0;
            while (size < i3) {
                View childAt3 = getChildAt(size);
                C0608c c0608c3 = (C0608c) childAt3.getLayoutParams();
                i6 = i11;
                i7 = childMeasureSpec;
                i8 = i3;
                long j3 = (long) (1 << size);
                if ((j2 & j3) != 0) {
                    boolean z3;
                    if (obj3 == null || !c0608c3.f2254e) {
                        z3 = true;
                    } else {
                        z3 = true;
                        if (i10 == 1) {
                            childAt3.setPadding(r0.f2268l + i9, 0, r0.f2268l, 0);
                        }
                    }
                    c0608c3.f2251b += z3;
                    c0608c3.f2255f = z3;
                    i10--;
                } else if (c0608c3.f2251b == i18) {
                    j |= j3;
                }
                size++;
                i11 = i6;
                childMeasureSpec = i7;
                i3 = i8;
            }
            obj4 = 1;
        }
        obj = obj4;
        i7 = childMeasureSpec;
        i8 = i3;
        i6 = i11;
        C0608c c0608c4;
        if (obj2 == null) {
            size = 1;
            if (i12 == 1) {
                obj3 = 1;
                if (i10 > 0 || j == 0 || (i10 >= i12 - r2 && obj3 == null && i13 <= r2)) {
                    size = i8;
                    size2 = 0;
                } else {
                    float bitCount = (float) Long.bitCount(j);
                    if (obj3 == null) {
                        if ((j & 1) != 0) {
                            size2 = 0;
                            if (!((C0608c) getChildAt(0).getLayoutParams()).f2254e) {
                                bitCount -= 0.5f;
                            }
                        } else {
                            size2 = 0;
                        }
                        i3 = i8 - 1;
                        if (!((j & ((long) (1 << i3))) == 0 || ((C0608c) getChildAt(i3).getLayoutParams()).f2254e)) {
                            bitCount -= 0.5f;
                        }
                    } else {
                        size2 = 0;
                    }
                    i17 = bitCount > 0.0f ? (int) (((float) (i10 * i9)) / bitCount) : 0;
                    Object obj5 = obj;
                    size = i8;
                    for (paddingLeft = 0; paddingLeft < size; paddingLeft++) {
                        if ((j & ((long) (1 << paddingLeft))) != 0) {
                            childAt = getChildAt(paddingLeft);
                            c0608c4 = (C0608c) childAt.getLayoutParams();
                            if (childAt instanceof ActionMenuItemView) {
                                c0608c4.f2252c = i17;
                                c0608c4.f2255f = true;
                                if (paddingLeft == 0 && !c0608c4.f2254e) {
                                    c0608c4.leftMargin = (-i17) / 2;
                                }
                            } else if (c0608c4.f2250a) {
                                c0608c4.f2252c = i17;
                                c0608c4.f2255f = true;
                                c0608c4.rightMargin = (-i17) / 2;
                            } else {
                                if (paddingLeft != 0) {
                                    c0608c4.leftMargin = i17 / 2;
                                }
                                if (paddingLeft != size - 1) {
                                    c0608c4.rightMargin = i17 / 2;
                                }
                            }
                            obj5 = 1;
                        }
                    }
                    obj = obj5;
                }
                if (obj != null) {
                    while (size2 < size) {
                        childAt = getChildAt(size2);
                        c0608c4 = (C0608c) childAt.getLayoutParams();
                        if (c0608c4.f2255f) {
                            i3 = i7;
                        } else {
                            i3 = i7;
                            childAt.measure(MeasureSpec.makeMeasureSpec((c0608c4.f2251b * i9) + c0608c4.f2252c, 1073741824), i3);
                        }
                        size2++;
                        i7 = i3;
                    }
                }
                if (mode == 1073741824) {
                    size = i5;
                    mode = i6;
                } else {
                    mode = i4;
                    size = i5;
                }
                setMeasuredDimension(size, mode);
            }
        }
        size = 1;
        obj3 = null;
        if (i10 > 0) {
        }
        size = i8;
        size2 = 0;
        if (obj != null) {
            while (size2 < size) {
                childAt = getChildAt(size2);
                c0608c4 = (C0608c) childAt.getLayoutParams();
                if (c0608c4.f2255f) {
                    i3 = i7;
                    childAt.measure(MeasureSpec.makeMeasureSpec((c0608c4.f2251b * i9) + c0608c4.f2252c, 1073741824), i3);
                } else {
                    i3 = i7;
                }
                size2++;
                i7 = i3;
            }
        }
        if (mode == 1073741824) {
            mode = i4;
            size = i5;
        } else {
            size = i5;
            mode = i6;
        }
        setMeasuredDimension(size, mode);
    }

    /* renamed from: a */
    public C0608c m2786a(AttributeSet attributeSet) {
        return new C0608c(getContext(), attributeSet);
    }

    /* renamed from: a */
    protected C0608c m2787a(LayoutParams layoutParams) {
        if (layoutParams == null) {
            return m2793b();
        }
        C0608c c0608c = layoutParams instanceof C0608c ? new C0608c((C0608c) layoutParams) : new C0608c(layoutParams);
        if (c0608c.h <= 0) {
            c0608c.h = 16;
        }
        return c0608c;
    }

    /* renamed from: a */
    public void mo192a(C0598h c0598h) {
        this.f2259c = c0598h;
    }

    /* renamed from: a */
    public void m2789a(C0329a c0329a, C0325a c0325a) {
        this.f2264h = c0329a;
        this.f2257a = c0325a;
    }

    /* renamed from: a */
    public boolean m2790a() {
        return this.f2262f;
    }

    /* renamed from: a */
    protected boolean m2791a(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0343a)) {
            z = 0 | ((C0343a) childAt).mo499d();
        }
        if (i > 0 && (childAt2 instanceof C0343a)) {
            z |= ((C0343a) childAt2).mo498c();
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo193a(C0601j c0601j) {
        return this.f2259c.m2663a((MenuItem) c0601j, 0);
    }

    /* renamed from: b */
    protected C0608c m2793b() {
        C0608c c0608c = new C0608c(-2, -2);
        c0608c.h = 16;
        return c0608c;
    }

    /* renamed from: b */
    public /* synthetic */ C0366a mo263b(AttributeSet attributeSet) {
        return m2786a(attributeSet);
    }

    /* renamed from: b */
    protected /* synthetic */ C0366a mo264b(LayoutParams layoutParams) {
        return m2787a(layoutParams);
    }

    /* renamed from: c */
    public C0608c m2796c() {
        C0608c b = m2793b();
        b.f2250a = true;
        return b;
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof C0608c);
    }

    /* renamed from: d */
    public C0598h m2797d() {
        return this.f2259c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* renamed from: e */
    public boolean m2798e() {
        return this.f2263g != null && this.f2263g.m3644d();
    }

    /* renamed from: f */
    public boolean m2799f() {
        return this.f2263g != null && this.f2263g.m3645e();
    }

    /* renamed from: g */
    public boolean m2800g() {
        return this.f2263g != null && this.f2263g.m3648h();
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return m2793b();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return m2786a(attributeSet);
    }

    protected /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return m2787a(layoutParams);
    }

    public Menu getMenu() {
        if (this.f2259c == null) {
            Context context = getContext();
            this.f2259c = new C0598h(context);
            this.f2259c.mo514a(new C0609d(this));
            this.f2263g = new C0765d(context);
            this.f2263g.m3642c(true);
            this.f2263g.mo222a(this.f2264h != null ? this.f2264h : new C0607b());
            this.f2259c.m2658a(this.f2263g, this.f2260d);
            this.f2263g.m3634a(this);
        }
        return this.f2259c;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f2263g.m3641c();
    }

    public int getPopupTheme() {
        return this.f2261e;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* renamed from: h */
    public boolean m2801h() {
        return this.f2263g != null && this.f2263g.m3649i();
    }

    /* renamed from: i */
    public void m2802i() {
        if (this.f2263g != null) {
            this.f2263g.m3646f();
        }
    }

    /* renamed from: j */
    protected /* synthetic */ C0366a mo269j() {
        return m2793b();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f2263g != null) {
            this.f2263g.mo225b(false);
            if (this.f2263g.m3648h()) {
                this.f2263g.m3645e();
                this.f2263g.m3644d();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2802i();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f2265i) {
            int i5;
            int childCount = getChildCount();
            int i6 = (i4 - i2) / 2;
            int dividerWidth = getDividerWidth();
            int i7 = i3 - i;
            int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
            boolean a = bc.m1514a(this);
            int i8 = paddingRight;
            int i9 = 0;
            int i10 = 0;
            for (paddingRight = 0; paddingRight < childCount; paddingRight++) {
                View childAt = getChildAt(paddingRight);
                if (childAt.getVisibility() != 8) {
                    C0608c c0608c = (C0608c) childAt.getLayoutParams();
                    if (c0608c.f2250a) {
                        int paddingLeft;
                        int i11;
                        i9 = childAt.getMeasuredWidth();
                        if (m2791a(paddingRight)) {
                            i9 += dividerWidth;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        if (a) {
                            paddingLeft = getPaddingLeft() + c0608c.leftMargin;
                            i11 = paddingLeft + i9;
                        } else {
                            i11 = (getWidth() - getPaddingRight()) - c0608c.rightMargin;
                            paddingLeft = i11 - i9;
                        }
                        i5 = i6 - (measuredHeight / 2);
                        childAt.layout(paddingLeft, i5, i11, measuredHeight + i5);
                        i8 -= i9;
                        i9 = 1;
                    } else {
                        i8 -= (childAt.getMeasuredWidth() + c0608c.leftMargin) + c0608c.rightMargin;
                        boolean a2 = m2791a(paddingRight);
                        i10++;
                    }
                }
            }
            if (childCount == 1 && i9 == 0) {
                View childAt2 = getChildAt(0);
                dividerWidth = childAt2.getMeasuredWidth();
                paddingRight = childAt2.getMeasuredHeight();
                i7 = (i7 / 2) - (dividerWidth / 2);
                i6 -= paddingRight / 2;
                childAt2.layout(i7, i6, dividerWidth + i7, paddingRight + i6);
                return;
            }
            i10 -= i9 ^ 1;
            if (i10 > 0) {
                i5 = i8 / i10;
                dividerWidth = 0;
            } else {
                dividerWidth = 0;
                i5 = 0;
            }
            i7 = Math.max(dividerWidth, i5);
            View childAt3;
            C0608c c0608c2;
            if (a) {
                paddingRight = getWidth() - getPaddingRight();
                while (dividerWidth < childCount) {
                    childAt3 = getChildAt(dividerWidth);
                    c0608c2 = (C0608c) childAt3.getLayoutParams();
                    if (childAt3.getVisibility() != 8) {
                        if (!c0608c2.f2250a) {
                            paddingRight -= c0608c2.rightMargin;
                            i9 = childAt3.getMeasuredWidth();
                            i10 = childAt3.getMeasuredHeight();
                            i8 = i6 - (i10 / 2);
                            childAt3.layout(paddingRight - i9, i8, paddingRight, i10 + i8);
                            paddingRight -= (i9 + c0608c2.leftMargin) + i7;
                        }
                    }
                    dividerWidth++;
                }
            } else {
                paddingRight = getPaddingLeft();
                while (dividerWidth < childCount) {
                    childAt3 = getChildAt(dividerWidth);
                    c0608c2 = (C0608c) childAt3.getLayoutParams();
                    if (childAt3.getVisibility() != 8) {
                        if (!c0608c2.f2250a) {
                            paddingRight += c0608c2.leftMargin;
                            i9 = childAt3.getMeasuredWidth();
                            i10 = childAt3.getMeasuredHeight();
                            i8 = i6 - (i10 / 2);
                            childAt3.layout(paddingRight, i8, paddingRight + i9, i10 + i8);
                            paddingRight += (i9 + c0608c2.rightMargin) + i7;
                        }
                    }
                    dividerWidth++;
                }
            }
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    protected void onMeasure(int i, int i2) {
        boolean z = this.f2265i;
        this.f2265i = MeasureSpec.getMode(i) == 1073741824;
        if (z != this.f2265i) {
            this.f2266j = 0;
        }
        int size = MeasureSpec.getSize(i);
        if (!(!this.f2265i || this.f2259c == null || size == this.f2266j)) {
            this.f2266j = size;
            this.f2259c.m2669b(true);
        }
        size = getChildCount();
        if (!this.f2265i || size <= 0) {
            for (int i3 = 0; i3 < size; i3++) {
                C0608c c0608c = (C0608c) getChildAt(i3).getLayoutParams();
                c0608c.rightMargin = 0;
                c0608c.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        m2785c(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f2263g.m3643d(z);
    }

    public void setOnMenuItemClickListener(C0344e c0344e) {
        this.f2258b = c0344e;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f2263g.m3631a(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f2262f = z;
    }

    public void setPopupTheme(int i) {
        if (this.f2261e != i) {
            this.f2261e = i;
            if (i == 0) {
                this.f2260d = getContext();
            } else {
                this.f2260d = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0765d c0765d) {
        this.f2263g = c0765d;
        this.f2263g.m3634a(this);
    }
}
