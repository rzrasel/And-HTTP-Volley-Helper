package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.p017g.C0209b;
import android.support.v4.p017g.C0220j;
import android.support.v4.p017g.C0221k;
import android.support.v4.p017g.C0222m;
import android.support.v4.p017g.C0227p;
import android.support.v4.p017g.C0559i;
import android.support.v4.p017g.p018a.C0200a;
import android.support.v4.p017g.p018a.C0203c;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import java.util.List;

public class NestedScrollView extends FrameLayout implements C0559i, C0221k {
    /* renamed from: w */
    private static final C0566a f2625w = new C0566a();
    /* renamed from: x */
    private static final int[] f2626x = new int[]{16843130};
    /* renamed from: A */
    private float f2627A;
    /* renamed from: B */
    private C0238b f2628B;
    /* renamed from: a */
    private long f2629a;
    /* renamed from: b */
    private final Rect f2630b;
    /* renamed from: c */
    private OverScroller f2631c;
    /* renamed from: d */
    private EdgeEffect f2632d;
    /* renamed from: e */
    private EdgeEffect f2633e;
    /* renamed from: f */
    private int f2634f;
    /* renamed from: g */
    private boolean f2635g;
    /* renamed from: h */
    private boolean f2636h;
    /* renamed from: i */
    private View f2637i;
    /* renamed from: j */
    private boolean f2638j;
    /* renamed from: k */
    private VelocityTracker f2639k;
    /* renamed from: l */
    private boolean f2640l;
    /* renamed from: m */
    private boolean f2641m;
    /* renamed from: n */
    private int f2642n;
    /* renamed from: o */
    private int f2643o;
    /* renamed from: p */
    private int f2644p;
    /* renamed from: q */
    private int f2645q;
    /* renamed from: r */
    private final int[] f2646r;
    /* renamed from: s */
    private final int[] f2647s;
    /* renamed from: t */
    private int f2648t;
    /* renamed from: u */
    private int f2649u;
    /* renamed from: v */
    private C0240c f2650v;
    /* renamed from: y */
    private final C0222m f2651y;
    /* renamed from: z */
    private final C0220j f2652z;

    /* renamed from: android.support.v4.widget.NestedScrollView$b */
    public interface C0238b {
        /* renamed from: a */
        void mo120a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    /* renamed from: android.support.v4.widget.NestedScrollView$c */
    static class C0240c extends BaseSavedState {
        public static final Creator<C0240c> CREATOR = new C02391();
        /* renamed from: a */
        public int f799a;

        /* renamed from: android.support.v4.widget.NestedScrollView$c$1 */
        static class C02391 implements Creator<C0240c> {
            C02391() {
            }

            /* renamed from: a */
            public C0240c m928a(Parcel parcel) {
                return new C0240c(parcel);
            }

            /* renamed from: a */
            public C0240c[] m929a(int i) {
                return new C0240c[i];
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m928a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m929a(i);
            }
        }

        C0240c(Parcel parcel) {
            super(parcel);
            this.f799a = parcel.readInt();
        }

        C0240c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("HorizontalScrollView.SavedState{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" scrollPosition=");
            stringBuilder.append(this.f799a);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f799a);
        }
    }

    /* renamed from: android.support.v4.widget.NestedScrollView$a */
    static class C0566a extends C0209b {
        C0566a() {
        }

        /* renamed from: a */
        public void mo102a(View view, C0200a c0200a) {
            super.mo102a(view, c0200a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c0200a.m744a(ScrollView.class.getName());
            if (nestedScrollView.isEnabled()) {
                int scrollRange = nestedScrollView.getScrollRange();
                if (scrollRange > 0) {
                    c0200a.m745a(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        c0200a.m742a(8192);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        c0200a.m742a(4096);
                    }
                }
            }
        }

        /* renamed from: a */
        public boolean mo103a(View view, int i, Bundle bundle) {
            if (super.mo103a(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i == 4096) {
                i = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (i == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.m3452c(0, i);
                return true;
            } else if (i != 8192) {
                return false;
            } else {
                i = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (i == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.m3452c(0, i);
                return true;
            }
        }

        /* renamed from: d */
        public void mo104d(View view, AccessibilityEvent accessibilityEvent) {
            super.mo104d(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C0203c.m768a(accessibilityEvent, nestedScrollView.getScrollX());
            C0203c.m769b(accessibilityEvent, nestedScrollView.getScrollRange());
        }
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2630b = new Rect();
        this.f2635g = true;
        this.f2636h = false;
        this.f2637i = null;
        this.f2638j = false;
        this.f2641m = true;
        this.f2645q = -1;
        this.f2646r = new int[2];
        this.f2647s = new int[2];
        m3425a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2626x, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f2651y = new C0222m(this);
        this.f2652z = new C0220j(this);
        setNestedScrollingEnabled(true);
        C0227p.m871a((View) this, f2625w);
    }

    /* renamed from: a */
    private View m3424a(boolean z, int i, int i2) {
        List focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        Object obj = null;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                Object obj2 = (i >= top || bottom >= i2) ? null : 1;
                if (view == null) {
                    view = view2;
                    obj = obj2;
                } else {
                    Object obj3 = ((!z || top >= view.getTop()) && (z || bottom <= view.getBottom())) ? null : 1;
                    if (obj != null) {
                        if (!(obj2 == null || obj3 == null)) {
                        }
                    } else if (obj2 != null) {
                        view = view2;
                        obj = 1;
                    } else if (obj3 == null) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    /* renamed from: a */
    private void m3425a() {
        this.f2631c = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2642n = viewConfiguration.getScaledTouchSlop();
        this.f2643o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2644p = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: a */
    private void m3426a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2645q) {
            actionIndex = actionIndex == 0 ? 1 : 0;
            this.f2634f = (int) motionEvent.getY(actionIndex);
            this.f2645q = motionEvent.getPointerId(actionIndex);
            if (this.f2639k != null) {
                this.f2639k.clear();
            }
        }
    }

    /* renamed from: a */
    private boolean m3427a(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        height += scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View a = m3424a(z2, i2, i3);
        if (a == null) {
            a = this;
        }
        if (i2 < scrollY || i3 > height) {
            m3441g(z2 ? i2 - scrollY : i3 - height);
            z = true;
        }
        if (a != findFocus()) {
            a.requestFocus(i);
        }
        return z;
    }

    /* renamed from: a */
    private boolean m3428a(Rect rect, boolean z) {
        int a = m3443a(rect);
        boolean z2 = a != 0;
        if (z2) {
            if (z) {
                scrollBy(0, a);
            } else {
                m3450b(0, a);
            }
        }
        return z2;
    }

    /* renamed from: a */
    private boolean m3429a(View view) {
        return m3430a(view, 0, getHeight()) ^ 1;
    }

    /* renamed from: a */
    private boolean m3430a(View view, int i, int i2) {
        view.getDrawingRect(this.f2630b);
        offsetDescendantRectToMyCoords(view, this.f2630b);
        return this.f2630b.bottom + i >= getScrollY() && this.f2630b.top - i <= getScrollY() + i2;
    }

    /* renamed from: a */
    private static boolean m3431a(View view, View view2) {
        boolean z = true;
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !m3431a((View) parent, view2)) {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    private static int m3432b(int i, int i2, int i3) {
        if (i2 < i3) {
            if (i >= 0) {
                return i2 + i > i3 ? i3 - i2 : i;
            }
        }
        return 0;
    }

    /* renamed from: b */
    private void m3433b(View view) {
        view.getDrawingRect(this.f2630b);
        offsetDescendantRectToMyCoords(view, this.f2630b);
        int a = m3443a(this.f2630b);
        if (a != 0) {
            scrollBy(0, a);
        }
    }

    /* renamed from: b */
    private boolean m3434b() {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return false;
        }
        return getHeight() < (childAt.getHeight() + getPaddingTop()) + getPaddingBottom();
    }

    /* renamed from: c */
    private void m3435c() {
        if (this.f2639k == null) {
            this.f2639k = VelocityTracker.obtain();
        } else {
            this.f2639k.clear();
        }
    }

    /* renamed from: d */
    private void m3436d() {
        if (this.f2639k == null) {
            this.f2639k = VelocityTracker.obtain();
        }
    }

    /* renamed from: d */
    private boolean m3437d(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
    }

    /* renamed from: e */
    private void m3438e() {
        if (this.f2639k != null) {
            this.f2639k.recycle();
            this.f2639k = null;
        }
    }

    /* renamed from: f */
    private void m3439f() {
        this.f2638j = false;
        m3438e();
        m3444a(0);
        if (this.f2632d != null) {
            this.f2632d.onRelease();
            this.f2633e.onRelease();
        }
    }

    /* renamed from: g */
    private void m3440g() {
        if (getOverScrollMode() == 2) {
            this.f2632d = null;
            this.f2633e = null;
        } else if (this.f2632d == null) {
            Context context = getContext();
            this.f2632d = new EdgeEffect(context);
            this.f2633e = new EdgeEffect(context);
        }
    }

    /* renamed from: g */
    private void m3441g(int i) {
        if (i == 0) {
            return;
        }
        if (this.f2641m) {
            m3450b(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f2627A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f2627A = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f2627A;
    }

    /* renamed from: h */
    private void m3442h(int i) {
        boolean z;
        float f;
        int scrollY = getScrollY();
        if (scrollY > 0 || i > 0) {
            if (scrollY >= getScrollRange()) {
                if (i < 0) {
                }
            }
            z = true;
            f = (float) i;
            if (!dispatchNestedPreFling(0.0f, f)) {
                dispatchNestedFling(0.0f, f, z);
                m3456f(i);
            }
        }
        z = false;
        f = (float) i;
        if (!dispatchNestedPreFling(0.0f, f)) {
            dispatchNestedFling(0.0f, f, z);
            m3456f(i);
        }
    }

    /* renamed from: a */
    protected int m3443a(Rect rect) {
        int i = 0;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        if (rect.bottom < getChildAt(0).getHeight()) {
            i2 -= verticalFadingEdgeLength;
        }
        if (rect.bottom > i2 && rect.top > scrollY) {
            i = Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, getChildAt(0).getBottom() - i2);
        } else if (rect.top < scrollY && rect.bottom < i2) {
            i = Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
        return i;
    }

    /* renamed from: a */
    public void m3444a(int i) {
        this.f2652z.m831c(i);
    }

    /* renamed from: a */
    public boolean m3445a(int i, int i2) {
        return this.f2652z.m823a(i, i2);
    }

    /* renamed from: a */
    boolean m3446a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        Object obj;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z2;
        boolean z3;
        NestedScrollView nestedScrollView = this;
        int overScrollMode = getOverScrollMode();
        Object obj2 = computeHorizontalScrollRange() > computeHorizontalScrollExtent() ? 1 : null;
        Object obj3 = computeVerticalScrollRange() > computeVerticalScrollExtent() ? 1 : null;
        if (overScrollMode != 0) {
            if (overScrollMode != 1 || obj2 == null) {
                obj2 = null;
                if (overScrollMode != 0) {
                    if (overScrollMode == 1 || obj3 == null) {
                        obj = null;
                        overScrollMode = i3 + i;
                        i9 = obj2 != null ? 0 : i7;
                        i10 = i4 + i2;
                        i11 = obj != null ? 0 : i8;
                        i12 = -i9;
                        i9 += i5;
                        i13 = -i11;
                        i11 += i6;
                        if (overScrollMode <= i9) {
                            i12 = i9;
                        } else if (overScrollMode >= i12) {
                            i12 = overScrollMode;
                            z2 = false;
                            if (i10 <= i11) {
                                i13 = i11;
                            } else if (i10 >= i13) {
                                i13 = i10;
                                z3 = false;
                                if (z3 && !m3451b(1)) {
                                    nestedScrollView.f2631c.springBack(i12, i13, 0, 0, 0, getScrollRange());
                                }
                                onOverScrolled(i12, i13, z2, z3);
                                return z2 || z3;
                            }
                            z3 = true;
                            nestedScrollView.f2631c.springBack(i12, i13, 0, 0, 0, getScrollRange());
                            onOverScrolled(i12, i13, z2, z3);
                            if (!z2) {
                            }
                        }
                        z2 = true;
                        if (i10 <= i11) {
                            i13 = i11;
                        } else if (i10 >= i13) {
                            i13 = i10;
                            z3 = false;
                            nestedScrollView.f2631c.springBack(i12, i13, 0, 0, 0, getScrollRange());
                            onOverScrolled(i12, i13, z2, z3);
                            if (z2) {
                            }
                        }
                        z3 = true;
                        nestedScrollView.f2631c.springBack(i12, i13, 0, 0, 0, getScrollRange());
                        onOverScrolled(i12, i13, z2, z3);
                        if (z2) {
                        }
                    }
                }
                obj = 1;
                overScrollMode = i3 + i;
                if (obj2 != null) {
                }
                i10 = i4 + i2;
                if (obj != null) {
                }
                i12 = -i9;
                i9 += i5;
                i13 = -i11;
                i11 += i6;
                if (overScrollMode <= i9) {
                    i12 = i9;
                } else if (overScrollMode >= i12) {
                    i12 = overScrollMode;
                    z2 = false;
                    if (i10 <= i11) {
                        i13 = i11;
                    } else if (i10 >= i13) {
                        i13 = i10;
                        z3 = false;
                        nestedScrollView.f2631c.springBack(i12, i13, 0, 0, 0, getScrollRange());
                        onOverScrolled(i12, i13, z2, z3);
                        if (z2) {
                        }
                    }
                    z3 = true;
                    nestedScrollView.f2631c.springBack(i12, i13, 0, 0, 0, getScrollRange());
                    onOverScrolled(i12, i13, z2, z3);
                    if (z2) {
                    }
                }
                z2 = true;
                if (i10 <= i11) {
                    i13 = i11;
                } else if (i10 >= i13) {
                    i13 = i10;
                    z3 = false;
                    nestedScrollView.f2631c.springBack(i12, i13, 0, 0, 0, getScrollRange());
                    onOverScrolled(i12, i13, z2, z3);
                    if (z2) {
                    }
                }
                z3 = true;
                nestedScrollView.f2631c.springBack(i12, i13, 0, 0, 0, getScrollRange());
                onOverScrolled(i12, i13, z2, z3);
                if (z2) {
                }
            }
        }
        obj2 = 1;
        if (overScrollMode != 0) {
            if (overScrollMode == 1) {
            }
            obj = null;
            overScrollMode = i3 + i;
            if (obj2 != null) {
            }
            i10 = i4 + i2;
            if (obj != null) {
            }
            i12 = -i9;
            i9 += i5;
            i13 = -i11;
            i11 += i6;
            if (overScrollMode <= i9) {
                i12 = i9;
            } else if (overScrollMode >= i12) {
                i12 = overScrollMode;
                z2 = false;
                if (i10 <= i11) {
                    i13 = i11;
                } else if (i10 >= i13) {
                    i13 = i10;
                    z3 = false;
                    nestedScrollView.f2631c.springBack(i12, i13, 0, 0, 0, getScrollRange());
                    onOverScrolled(i12, i13, z2, z3);
                    if (z2) {
                    }
                }
                z3 = true;
                nestedScrollView.f2631c.springBack(i12, i13, 0, 0, 0, getScrollRange());
                onOverScrolled(i12, i13, z2, z3);
                if (z2) {
                }
            }
            z2 = true;
            if (i10 <= i11) {
                i13 = i11;
            } else if (i10 >= i13) {
                i13 = i10;
                z3 = false;
                nestedScrollView.f2631c.springBack(i12, i13, 0, 0, 0, getScrollRange());
                onOverScrolled(i12, i13, z2, z3);
                if (z2) {
                }
            }
            z3 = true;
            nestedScrollView.f2631c.springBack(i12, i13, 0, 0, 0, getScrollRange());
            onOverScrolled(i12, i13, z2, z3);
            if (z2) {
            }
        }
        obj = 1;
        overScrollMode = i3 + i;
        if (obj2 != null) {
        }
        i10 = i4 + i2;
        if (obj != null) {
        }
        i12 = -i9;
        i9 += i5;
        i13 = -i11;
        i11 += i6;
        if (overScrollMode <= i9) {
            i12 = i9;
        } else if (overScrollMode >= i12) {
            i12 = overScrollMode;
            z2 = false;
            if (i10 <= i11) {
                i13 = i11;
            } else if (i10 >= i13) {
                i13 = i10;
                z3 = false;
                nestedScrollView.f2631c.springBack(i12, i13, 0, 0, 0, getScrollRange());
                onOverScrolled(i12, i13, z2, z3);
                if (z2) {
                }
            }
            z3 = true;
            nestedScrollView.f2631c.springBack(i12, i13, 0, 0, 0, getScrollRange());
            onOverScrolled(i12, i13, z2, z3);
            if (z2) {
            }
        }
        z2 = true;
        if (i10 <= i11) {
            i13 = i11;
        } else if (i10 >= i13) {
            i13 = i10;
            z3 = false;
            nestedScrollView.f2631c.springBack(i12, i13, 0, 0, 0, getScrollRange());
            onOverScrolled(i12, i13, z2, z3);
            if (z2) {
            }
        }
        z3 = true;
        nestedScrollView.f2631c.springBack(i12, i13, 0, 0, 0, getScrollRange());
        onOverScrolled(i12, i13, z2, z3);
        if (z2) {
        }
    }

    /* renamed from: a */
    public boolean m3447a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.f2652z.m825a(i, i2, i3, i4, iArr, i5);
    }

    /* renamed from: a */
    public boolean m3448a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f2652z.m827a(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: a */
    public boolean m3449a(KeyEvent keyEvent) {
        this.f2630b.setEmpty();
        boolean z = false;
        int i = 130;
        if (m3434b()) {
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 62) {
                    switch (keyCode) {
                        case 19:
                            if (!keyEvent.isAltPressed()) {
                                z = m3455e(33);
                                break;
                            }
                            z = m3454d(33);
                            break;
                        case 20:
                            if (!keyEvent.isAltPressed()) {
                                z = m3455e(130);
                                break;
                            }
                            z = m3454d(130);
                            break;
                        default:
                            break;
                    }
                }
                if (keyEvent.isShiftPressed()) {
                    i = 33;
                }
                m3453c(i);
            }
            return z;
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            findFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (!(findFocus == null || findFocus == this || !findFocus.requestFocus(130))) {
                z = true;
            }
        }
        return z;
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public final void m3450b(int i, int i2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f2629a > 250) {
                i = Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
                int scrollY = getScrollY();
                this.f2631c.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, i)) - scrollY);
                C0227p.m865a(this);
            } else {
                if (!this.f2631c.isFinished()) {
                    this.f2631c.abortAnimation();
                }
                scrollBy(i, i2);
            }
            this.f2629a = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: b */
    public boolean m3451b(int i) {
        return this.f2652z.m822a(i);
    }

    /* renamed from: c */
    public final void m3452c(int i, int i2) {
        m3450b(i - getScrollX(), i2 - getScrollY());
    }

    /* renamed from: c */
    public boolean m3453c(int i) {
        Rect rect;
        int i2 = 0;
        Object obj = i == 130 ? 1 : null;
        int height = getHeight();
        if (obj != null) {
            this.f2630b.top = getScrollY() + height;
            i2 = getChildCount();
            if (i2 > 0) {
                View childAt = getChildAt(i2 - 1);
                if (this.f2630b.top + height > childAt.getBottom()) {
                    rect = this.f2630b;
                    i2 = childAt.getBottom() - height;
                }
            }
            this.f2630b.bottom = this.f2630b.top + height;
            return m3427a(i, this.f2630b.top, this.f2630b.bottom);
        }
        this.f2630b.top = getScrollY() - height;
        if (this.f2630b.top < 0) {
            rect = this.f2630b;
        }
        this.f2630b.bottom = this.f2630b.top + height;
        return m3427a(i, this.f2630b.top, this.f2630b.bottom);
        rect.top = i2;
        this.f2630b.bottom = this.f2630b.top + height;
        return m3427a(i, this.f2630b.top, this.f2630b.bottom);
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        if (this.f2631c.computeScrollOffset()) {
            r10.f2631c.getCurrX();
            int currY = r10.f2631c.getCurrY();
            int i = currY - r10.f2649u;
            if (m3448a(0, i, r10.f2647s, null, 1)) {
                i -= r10.f2647s[1];
            }
            int i2 = i;
            if (i2 != 0) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i3 = scrollY;
                m3446a(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - i3;
                if (!m3447a(0, scrollY2, 0, i2 - scrollY2, null, 1)) {
                    Object obj;
                    EdgeEffect edgeEffect;
                    int overScrollMode = getOverScrollMode();
                    if (overScrollMode != 0) {
                        if (overScrollMode != 1 || scrollRange <= 0) {
                            obj = null;
                            if (obj != null) {
                                m3440g();
                                if (currY > 0 && i3 > 0) {
                                    edgeEffect = r10.f2632d;
                                } else if (currY >= scrollRange && i3 < scrollRange) {
                                    edgeEffect = r10.f2633e;
                                }
                                edgeEffect.onAbsorb((int) r10.f2631c.getCurrVelocity());
                            }
                        }
                    }
                    obj = 1;
                    if (obj != null) {
                        m3440g();
                        if (currY > 0) {
                        }
                        edgeEffect = r10.f2633e;
                        edgeEffect.onAbsorb((int) r10.f2631c.getCurrVelocity());
                    }
                }
            }
            r10.f2649u = currY;
            C0227p.m865a(this);
            return;
        }
        if (m3451b(1)) {
            m3444a(1);
        }
        r10.f2649u = 0;
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (getChildCount() == 0) {
            return height;
        }
        int bottom = getChildAt(0).getBottom();
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            bottom -= scrollY;
        } else if (scrollY > max) {
            bottom += scrollY - max;
        }
        return bottom;
    }

    /* renamed from: d */
    public boolean m3454d(int i) {
        Object obj = i == 130 ? 1 : null;
        int height = getHeight();
        this.f2630b.top = 0;
        this.f2630b.bottom = height;
        if (obj != null) {
            int childCount = getChildCount();
            if (childCount > 0) {
                this.f2630b.bottom = getChildAt(childCount - 1).getBottom() + getPaddingBottom();
                this.f2630b.top = this.f2630b.bottom - height;
            }
        }
        return m3427a(i, this.f2630b.top, this.f2630b.bottom);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (!m3449a(keyEvent)) {
                return false;
            }
        }
        return true;
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f2652z.m821a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f2652z.m820a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f2652z.m826a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f2652z.m824a(i, i2, i3, i4, iArr);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f2632d != null) {
            int save;
            int width;
            int height;
            int scrollY = getScrollY();
            int i = 0;
            if (!this.f2632d.isFinished()) {
                int i2;
                save = canvas.save();
                width = getWidth();
                height = getHeight();
                int min = Math.min(0, scrollY);
                if (VERSION.SDK_INT >= 21) {
                    if (!getClipToPadding()) {
                        i2 = 0;
                        if (VERSION.SDK_INT >= 21 && getClipToPadding()) {
                            height -= getPaddingTop() + getPaddingBottom();
                            min += getPaddingTop();
                        }
                        canvas.translate((float) i2, (float) min);
                        this.f2632d.setSize(width, height);
                        if (this.f2632d.draw(canvas)) {
                            C0227p.m865a(this);
                        }
                        canvas.restoreToCount(save);
                    }
                }
                width -= getPaddingLeft() + getPaddingRight();
                i2 = getPaddingLeft() + 0;
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
                canvas.translate((float) i2, (float) min);
                this.f2632d.setSize(width, height);
                if (this.f2632d.draw(canvas)) {
                    C0227p.m865a(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f2633e.isFinished()) {
                save = canvas.save();
                width = getWidth();
                height = getHeight();
                scrollY = Math.max(getScrollRange(), scrollY) + height;
                if (VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = 0 + getPaddingLeft();
                }
                if (VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    scrollY -= getPaddingBottom();
                }
                canvas.translate((float) (i - width), (float) scrollY);
                canvas.rotate(180.0f, (float) width, 0.0f);
                this.f2633e.setSize(width, height);
                if (this.f2633e.draw(canvas)) {
                    C0227p.m865a(this);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* renamed from: e */
    public boolean m3455e(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m3430a(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                int bottom = getChildAt(0).getBottom() - ((getScrollY() + getHeight()) - getPaddingBottom());
                if (bottom < maxScrollAmount) {
                    maxScrollAmount = bottom;
                }
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m3441g(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f2630b);
            offsetDescendantRectToMyCoords(findNextFocus, this.f2630b);
            m3441g(m3443a(this.f2630b));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && m3429a(findFocus)) {
            i = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(i);
        }
        return true;
    }

    /* renamed from: f */
    public void m3456f(int i) {
        if (getChildCount() > 0) {
            m3445a(2, 1);
            this.f2631c.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f2649u = getScrollY();
            C0227p.m865a(this);
        }
    }

    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = (getChildAt(0).getBottom() - getScrollY()) - (getHeight() - getPaddingBottom());
        return bottom < verticalFadingEdgeLength ? ((float) bottom) / ((float) verticalFadingEdgeLength) : 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.f2651y.m832a();
    }

    int getScrollRange() {
        return getChildCount() > 0 ? Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop())) : 0;
    }

    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        return scrollY < verticalFadingEdgeLength ? ((float) scrollY) / ((float) verticalFadingEdgeLength) : 1.0f;
    }

    public boolean hasNestedScrollingParent() {
        return this.f2652z.m828b();
    }

    public boolean isNestedScrollingEnabled() {
        return this.f2652z.m819a();
    }

    protected void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), MeasureSpec.makeMeasureSpec(0, 0));
    }

    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, (((getPaddingLeft() + getPaddingRight()) + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin) + i2, marginLayoutParams.width), MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2636h = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0) {
            if (motionEvent.getAction() == 8) {
                if (!this.f2638j) {
                    float axisValue = motionEvent.getAxisValue(9);
                    if (axisValue != 0.0f) {
                        int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                        int scrollRange = getScrollRange();
                        int scrollY = getScrollY();
                        verticalScrollFactorCompat = scrollY - verticalScrollFactorCompat;
                        if (verticalScrollFactorCompat < 0) {
                            verticalScrollFactorCompat = 0;
                        } else if (verticalScrollFactorCompat > scrollRange) {
                            verticalScrollFactorCompat = scrollRange;
                        }
                        if (verticalScrollFactorCompat != scrollY) {
                            super.scrollTo(getScrollX(), verticalScrollFactorCompat);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f2638j) {
            return true;
        }
        action &= 255;
        if (action != 6) {
            switch (action) {
                case 0:
                    action = (int) motionEvent.getY();
                    if (!m3437d((int) motionEvent.getX(), action)) {
                        this.f2638j = false;
                        m3438e();
                        break;
                    }
                    this.f2634f = action;
                    this.f2645q = motionEvent.getPointerId(0);
                    m3435c();
                    this.f2639k.addMovement(motionEvent);
                    this.f2631c.computeScrollOffset();
                    this.f2638j = this.f2631c.isFinished() ^ true;
                    m3445a(2, 0);
                    break;
                case 1:
                case 3:
                    this.f2638j = false;
                    this.f2645q = -1;
                    m3438e();
                    if (this.f2631c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        C0227p.m865a(this);
                    }
                    m3444a(0);
                    break;
                case 2:
                    action = this.f2645q;
                    if (action != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(action);
                        if (findPointerIndex != -1) {
                            action = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(action - this.f2634f) > this.f2642n && (2 & getNestedScrollAxes()) == 0) {
                                this.f2638j = true;
                                this.f2634f = action;
                                m3436d();
                                this.f2639k.addMovement(motionEvent);
                                this.f2648t = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                    break;
                                }
                            }
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Invalid pointerId=");
                        stringBuilder.append(action);
                        stringBuilder.append(" in onInterceptTouchEvent");
                        Log.e("NestedScrollView", stringBuilder.toString());
                        break;
                    }
                    break;
                    break;
                default:
                    break;
            }
        }
        m3426a(motionEvent);
        return this.f2638j;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f2635g = false;
        if (this.f2637i != null && m3431a(this.f2637i, (View) this)) {
            m3433b(this.f2637i);
        }
        this.f2637i = null;
        if (!this.f2636h) {
            if (this.f2650v != null) {
                scrollTo(getScrollX(), this.f2650v.f799a);
                this.f2650v = null;
            }
            i = Math.max(0, (getChildCount() > 0 ? getChildAt(0).getMeasuredHeight() : 0) - (((i4 - i2) - getPaddingBottom()) - getPaddingTop()));
            if (getScrollY() > i) {
                scrollTo(getScrollX(), i);
            } else if (getScrollY() < 0) {
                scrollTo(getScrollX(), 0);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2636h = true;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2640l && MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            int measuredHeight = getMeasuredHeight();
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), ((FrameLayout.LayoutParams) childAt.getLayoutParams()).width), MeasureSpec.makeMeasureSpec((measuredHeight - getPaddingTop()) - getPaddingBottom(), 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        m3442h((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        dispatchNestedPreScroll(i, i2, iArr, null);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        dispatchNestedScroll(0, scrollY2, 0, i4 - scrollY2, null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f2651y.m835a(view, view2, i);
        startNestedScroll(2);
    }

    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        return (findNextFocus == null || m3429a(findNextFocus)) ? false : findNextFocus.requestFocus(i, rect);
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof C0240c) {
            C0240c c0240c = (C0240c) parcelable;
            super.onRestoreInstanceState(c0240c.getSuperState());
            this.f2650v = c0240c;
            requestLayout();
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable c0240c = new C0240c(super.onSaveInstanceState());
        c0240c.f799a = getScrollY();
        return c0240c;
    }

    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f2628B != null) {
            this.f2628B.mo120a(this, i, i2, i3, i4);
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null) {
            return;
        }
        if (this != findFocus) {
            if (m3430a(findFocus, 0, i4)) {
                findFocus.getDrawingRect(this.f2630b);
                offsetDescendantRectToMyCoords(findFocus, this.f2630b);
                m3441g(m3443a(this.f2630b));
            }
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.f2651y.m833a(view);
        stopNestedScroll();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
        r23 = this;
        r10 = r23;
        r11 = r24;
        r23.m3436d();
        r12 = android.view.MotionEvent.obtain(r24);
        r0 = r24.getActionMasked();
        r13 = 0;
        if (r0 != 0) goto L_0x0014;
    L_0x0012:
        r10.f2648t = r13;
    L_0x0014:
        r1 = r10.f2648t;
        r1 = (float) r1;
        r14 = 0;
        r12.offsetLocation(r14, r1);
        r1 = -1;
        r15 = 1;
        switch(r0) {
            case 0: goto L_0x0213;
            case 1: goto L_0x01db;
            case 2: goto L_0x0072;
            case 3: goto L_0x0047;
            case 4: goto L_0x0020;
            case 5: goto L_0x0034;
            case 6: goto L_0x0022;
            default: goto L_0x0020;
        };
    L_0x0020:
        goto L_0x024c;
    L_0x0022:
        r23.m3426a(r24);
        r0 = r10.f2645q;
        r0 = r11.findPointerIndex(r0);
        r0 = r11.getY(r0);
        r0 = (int) r0;
        r10.f2634f = r0;
        goto L_0x024c;
    L_0x0034:
        r0 = r24.getActionIndex();
        r1 = r11.getY(r0);
        r1 = (int) r1;
        r10.f2634f = r1;
        r0 = r11.getPointerId(r0);
        r10.f2645q = r0;
        goto L_0x024c;
    L_0x0047:
        r0 = r10.f2638j;
        if (r0 == 0) goto L_0x006b;
    L_0x004b:
        r0 = r23.getChildCount();
        if (r0 <= 0) goto L_0x006b;
    L_0x0051:
        r2 = r10.f2631c;
        r3 = r23.getScrollX();
        r4 = r23.getScrollY();
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r8 = r23.getScrollRange();
        r0 = r2.springBack(r3, r4, r5, r6, r7, r8);
        if (r0 == 0) goto L_0x006b;
    L_0x0068:
        android.support.v4.p017g.C0227p.m865a(r23);
    L_0x006b:
        r10.f2645q = r1;
        r23.m3439f();
        goto L_0x024c;
    L_0x0072:
        r0 = r10.f2645q;
        r9 = r11.findPointerIndex(r0);
        if (r9 != r1) goto L_0x0099;
    L_0x007a:
        r0 = "NestedScrollView";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Invalid pointerId=";
        r1.append(r2);
        r2 = r10.f2645q;
        r1.append(r2);
        r2 = " in onTouchEvent";
        r1.append(r2);
        r1 = r1.toString();
        android.util.Log.e(r0, r1);
        goto L_0x024c;
    L_0x0099:
        r0 = r11.getY(r9);
        r6 = (int) r0;
        r0 = r10.f2634f;
        r7 = r0 - r6;
        r1 = 0;
        r3 = r10.f2647s;
        r4 = r10.f2646r;
        r5 = 0;
        r0 = r23;
        r2 = r7;
        r0 = r0.m3448a(r1, r2, r3, r4, r5);
        if (r0 == 0) goto L_0x00c7;
    L_0x00b1:
        r0 = r10.f2647s;
        r0 = r0[r15];
        r7 = r7 - r0;
        r0 = r10.f2646r;
        r0 = r0[r15];
        r0 = (float) r0;
        r12.offsetLocation(r14, r0);
        r0 = r10.f2648t;
        r1 = r10.f2646r;
        r1 = r1[r15];
        r0 = r0 + r1;
        r10.f2648t = r0;
    L_0x00c7:
        r0 = r10.f2638j;
        if (r0 != 0) goto L_0x00e7;
    L_0x00cb:
        r0 = java.lang.Math.abs(r7);
        r1 = r10.f2642n;
        if (r0 <= r1) goto L_0x00e7;
    L_0x00d3:
        r0 = r23.getParent();
        if (r0 == 0) goto L_0x00dc;
    L_0x00d9:
        r0.requestDisallowInterceptTouchEvent(r15);
    L_0x00dc:
        r10.f2638j = r15;
        if (r7 <= 0) goto L_0x00e4;
    L_0x00e0:
        r0 = r10.f2642n;
        r7 = r7 - r0;
        goto L_0x00e7;
    L_0x00e4:
        r0 = r10.f2642n;
        r7 = r7 + r0;
    L_0x00e7:
        r8 = r7;
        r0 = r10.f2638j;
        if (r0 == 0) goto L_0x024c;
    L_0x00ec:
        r0 = r10.f2646r;
        r0 = r0[r15];
        r6 = r6 - r0;
        r10.f2634f = r6;
        r16 = r23.getScrollY();
        r7 = r23.getScrollRange();
        r0 = r23.getOverScrollMode();
        if (r0 == 0) goto L_0x0109;
    L_0x0101:
        if (r0 != r15) goto L_0x0106;
    L_0x0103:
        if (r7 <= 0) goto L_0x0106;
    L_0x0105:
        goto L_0x0109;
    L_0x0106:
        r17 = 0;
        goto L_0x010b;
    L_0x0109:
        r17 = 1;
    L_0x010b:
        r1 = 0;
        r3 = 0;
        r4 = r23.getScrollY();
        r5 = 0;
        r18 = 0;
        r19 = 0;
        r20 = 1;
        r0 = r23;
        r2 = r8;
        r6 = r7;
        r21 = r7;
        r7 = r18;
        r14 = r8;
        r8 = r19;
        r22 = r9;
        r9 = r20;
        r0 = r0.m3446a(r1, r2, r3, r4, r5, r6, r7, r8, r9);
        if (r0 == 0) goto L_0x0138;
    L_0x012d:
        r0 = r10.m3451b(r13);
        if (r0 != 0) goto L_0x0138;
    L_0x0133:
        r0 = r10.f2639k;
        r0.clear();
    L_0x0138:
        r0 = r23.getScrollY();
        r2 = r0 - r16;
        r4 = r14 - r2;
        r1 = 0;
        r3 = 0;
        r5 = r10.f2646r;
        r6 = 0;
        r0 = r23;
        r0 = r0.m3447a(r1, r2, r3, r4, r5, r6);
        if (r0 == 0) goto L_0x016a;
    L_0x014d:
        r0 = r10.f2634f;
        r1 = r10.f2646r;
        r1 = r1[r15];
        r0 = r0 - r1;
        r10.f2634f = r0;
        r0 = r10.f2646r;
        r0 = r0[r15];
        r0 = (float) r0;
        r1 = 0;
        r12.offsetLocation(r1, r0);
        r0 = r10.f2648t;
        r1 = r10.f2646r;
        r1 = r1[r15];
        r0 = r0 + r1;
        r10.f2648t = r0;
        goto L_0x024c;
    L_0x016a:
        if (r17 == 0) goto L_0x024c;
    L_0x016c:
        r23.m3440g();
        r0 = r16 + r14;
        if (r0 >= 0) goto L_0x0199;
    L_0x0173:
        r0 = r10.f2632d;
        r1 = (float) r14;
        r2 = r23.getHeight();
        r2 = (float) r2;
        r1 = r1 / r2;
        r2 = r22;
        r2 = r11.getX(r2);
        r3 = r23.getWidth();
        r3 = (float) r3;
        r2 = r2 / r3;
        android.support.v4.widget.C0252f.m976a(r0, r1, r2);
        r0 = r10.f2633e;
        r0 = r0.isFinished();
        if (r0 != 0) goto L_0x01c3;
    L_0x0193:
        r0 = r10.f2633e;
    L_0x0195:
        r0.onRelease();
        goto L_0x01c3;
    L_0x0199:
        r1 = r21;
        r2 = r22;
        if (r0 <= r1) goto L_0x01c3;
    L_0x019f:
        r0 = r10.f2633e;
        r1 = (float) r14;
        r3 = r23.getHeight();
        r3 = (float) r3;
        r1 = r1 / r3;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2 = r11.getX(r2);
        r4 = r23.getWidth();
        r4 = (float) r4;
        r2 = r2 / r4;
        r3 = r3 - r2;
        android.support.v4.widget.C0252f.m976a(r0, r1, r3);
        r0 = r10.f2632d;
        r0 = r0.isFinished();
        if (r0 != 0) goto L_0x01c3;
    L_0x01c0:
        r0 = r10.f2632d;
        goto L_0x0195;
    L_0x01c3:
        r0 = r10.f2632d;
        if (r0 == 0) goto L_0x024c;
    L_0x01c7:
        r0 = r10.f2632d;
        r0 = r0.isFinished();
        if (r0 == 0) goto L_0x01d7;
    L_0x01cf:
        r0 = r10.f2633e;
        r0 = r0.isFinished();
        if (r0 != 0) goto L_0x024c;
    L_0x01d7:
        android.support.v4.p017g.C0227p.m865a(r23);
        goto L_0x024c;
    L_0x01db:
        r0 = r10.f2639k;
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r3 = r10.f2644p;
        r3 = (float) r3;
        r0.computeCurrentVelocity(r2, r3);
        r2 = r10.f2645q;
        r0 = r0.getYVelocity(r2);
        r0 = (int) r0;
        r2 = java.lang.Math.abs(r0);
        r3 = r10.f2643o;
        if (r2 <= r3) goto L_0x01fa;
    L_0x01f4:
        r0 = -r0;
        r10.m3442h(r0);
        goto L_0x006b;
    L_0x01fa:
        r2 = r10.f2631c;
        r3 = r23.getScrollX();
        r4 = r23.getScrollY();
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r8 = r23.getScrollRange();
        r0 = r2.springBack(r3, r4, r5, r6, r7, r8);
        if (r0 == 0) goto L_0x006b;
    L_0x0211:
        goto L_0x0068;
    L_0x0213:
        r0 = r23.getChildCount();
        if (r0 != 0) goto L_0x021a;
    L_0x0219:
        return r13;
    L_0x021a:
        r0 = r10.f2631c;
        r0 = r0.isFinished();
        r0 = r0 ^ r15;
        r10.f2638j = r0;
        if (r0 == 0) goto L_0x022e;
    L_0x0225:
        r0 = r23.getParent();
        if (r0 == 0) goto L_0x022e;
    L_0x022b:
        r0.requestDisallowInterceptTouchEvent(r15);
    L_0x022e:
        r0 = r10.f2631c;
        r0 = r0.isFinished();
        if (r0 != 0) goto L_0x023b;
    L_0x0236:
        r0 = r10.f2631c;
        r0.abortAnimation();
    L_0x023b:
        r0 = r24.getY();
        r0 = (int) r0;
        r10.f2634f = r0;
        r0 = r11.getPointerId(r13);
        r10.f2645q = r0;
        r0 = 2;
        r10.m3445a(r0, r13);
    L_0x024c:
        r0 = r10.f2639k;
        if (r0 == 0) goto L_0x0255;
    L_0x0250:
        r0 = r10.f2639k;
        r0.addMovement(r12);
    L_0x0255:
        r12.recycle();
        return r15;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestChildFocus(View view, View view2) {
        if (this.f2635g) {
            this.f2637i = view2;
        } else {
            m3433b(view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m3428a(rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m3438e();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.f2635g = true;
        super.requestLayout();
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            i = m3432b(i, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth());
            i2 = m3432b(i2, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight());
            if (i != getScrollX() || i2 != getScrollY()) {
                super.scrollTo(i, i2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f2640l) {
            this.f2640l = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f2652z.m818a(z);
    }

    public void setOnScrollChangeListener(C0238b c0238b) {
        this.f2628B = c0238b;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f2641m = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i) {
        return this.f2652z.m829b(i);
    }

    public void stopNestedScroll() {
        this.f2652z.m830c();
    }
}
