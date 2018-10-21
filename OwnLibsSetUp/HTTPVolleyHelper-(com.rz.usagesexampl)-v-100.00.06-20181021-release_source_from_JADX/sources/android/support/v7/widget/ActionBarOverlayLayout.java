package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p017g.C0221k;
import android.support.v4.p017g.C0222m;
import android.support.v4.p017g.C0227p;
import android.support.v7.p020a.C0270a.C0260a;
import android.support.v7.p020a.C0270a.C0265f;
import android.support.v7.p020a.C0270a.C0269j;
import android.support.v7.view.menu.C0330o.C0329a;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.Window.Callback;
import android.widget.OverScroller;

public class ActionBarOverlayLayout extends ViewGroup implements C0221k, ad {
    /* renamed from: e */
    static final int[] f2221e = new int[]{C0260a.actionBarSize, 16842841};
    /* renamed from: A */
    private final Runnable f2222A;
    /* renamed from: B */
    private final Runnable f2223B;
    /* renamed from: C */
    private final C0222m f2224C;
    /* renamed from: a */
    ActionBarContainer f2225a;
    /* renamed from: b */
    boolean f2226b;
    /* renamed from: c */
    ViewPropertyAnimator f2227c;
    /* renamed from: d */
    final AnimatorListenerAdapter f2228d;
    /* renamed from: f */
    private int f2229f;
    /* renamed from: g */
    private int f2230g;
    /* renamed from: h */
    private ContentFrameLayout f2231h;
    /* renamed from: i */
    private ae f2232i;
    /* renamed from: j */
    private Drawable f2233j;
    /* renamed from: k */
    private boolean f2234k;
    /* renamed from: l */
    private boolean f2235l;
    /* renamed from: m */
    private boolean f2236m;
    /* renamed from: n */
    private boolean f2237n;
    /* renamed from: o */
    private int f2238o;
    /* renamed from: p */
    private int f2239p;
    /* renamed from: q */
    private final Rect f2240q;
    /* renamed from: r */
    private final Rect f2241r;
    /* renamed from: s */
    private final Rect f2242s;
    /* renamed from: t */
    private final Rect f2243t;
    /* renamed from: u */
    private final Rect f2244u;
    /* renamed from: v */
    private final Rect f2245v;
    /* renamed from: w */
    private final Rect f2246w;
    /* renamed from: x */
    private C0341a f2247x;
    /* renamed from: y */
    private final int f2248y;
    /* renamed from: z */
    private OverScroller f2249z;

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$1 */
    class C03381 extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ ActionBarOverlayLayout f1128a;

        C03381(ActionBarOverlayLayout actionBarOverlayLayout) {
            this.f1128a = actionBarOverlayLayout;
        }

        public void onAnimationCancel(Animator animator) {
            this.f1128a.f2227c = null;
            this.f1128a.f2226b = false;
        }

        public void onAnimationEnd(Animator animator) {
            this.f1128a.f2227c = null;
            this.f1128a.f2226b = false;
        }
    }

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$2 */
    class C03392 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ActionBarOverlayLayout f1129a;

        C03392(ActionBarOverlayLayout actionBarOverlayLayout) {
            this.f1129a = actionBarOverlayLayout;
        }

        public void run() {
            this.f1129a.m2772d();
            this.f1129a.f2227c = this.f1129a.f2225a.animate().translationY(0.0f).setListener(this.f1129a.f2228d);
        }
    }

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$3 */
    class C03403 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ActionBarOverlayLayout f1130a;

        C03403(ActionBarOverlayLayout actionBarOverlayLayout) {
            this.f1130a = actionBarOverlayLayout;
        }

        public void run() {
            this.f1130a.m2772d();
            this.f1130a.f2227c = this.f1130a.f2225a.animate().translationY((float) (-this.f1130a.f2225a.getHeight())).setListener(this.f1130a.f2228d);
        }
    }

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$a */
    public interface C0341a {
        /* renamed from: a */
        void mo183a(int i);

        /* renamed from: g */
        void mo185g(boolean z);

        /* renamed from: j */
        void mo186j();

        /* renamed from: k */
        void mo187k();

        /* renamed from: l */
        void mo188l();

        /* renamed from: m */
        void mo189m();
    }

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$b */
    public static class C0342b extends MarginLayoutParams {
        public C0342b(int i, int i2) {
            super(i, i2);
        }

        public C0342b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0342b(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2230g = 0;
        this.f2240q = new Rect();
        this.f2241r = new Rect();
        this.f2242s = new Rect();
        this.f2243t = new Rect();
        this.f2244u = new Rect();
        this.f2245v = new Rect();
        this.f2246w = new Rect();
        this.f2248y = 600;
        this.f2228d = new C03381(this);
        this.f2222A = new C03392(this);
        this.f2223B = new C03403(this);
        m2759a(context);
        this.f2224C = new C0222m(this);
    }

    /* renamed from: a */
    private ae m2758a(View view) {
        if (view instanceof ae) {
            return (ae) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can't make a decor toolbar out of ");
        stringBuilder.append(view.getClass().getSimpleName());
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: a */
    private void m2759a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f2221e);
        boolean z = false;
        this.f2229f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f2233j = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.f2233j == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f2234k = z;
        this.f2249z = new OverScroller(context);
    }

    /* renamed from: a */
    private boolean m2760a(float f, float f2) {
        this.f2249z.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f2249z.getFinalY() > this.f2225a.getHeight();
    }

    /* renamed from: a */
    private boolean m2761a(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        C0342b c0342b = (C0342b) view.getLayoutParams();
        if (!z || c0342b.leftMargin == rect.left) {
            z = false;
        } else {
            c0342b.leftMargin = rect.left;
            z = true;
        }
        if (z2 && c0342b.topMargin != rect.top) {
            c0342b.topMargin = rect.top;
            z = true;
        }
        if (z4 && c0342b.rightMargin != rect.right) {
            c0342b.rightMargin = rect.right;
            z = true;
        }
        if (!z3 || c0342b.bottomMargin == rect.bottom) {
            return z;
        }
        c0342b.bottomMargin = rect.bottom;
        return true;
    }

    /* renamed from: l */
    private void m2762l() {
        m2772d();
        postDelayed(this.f2222A, 600);
    }

    /* renamed from: m */
    private void m2763m() {
        m2772d();
        postDelayed(this.f2223B, 600);
    }

    /* renamed from: n */
    private void m2764n() {
        m2772d();
        this.f2222A.run();
    }

    /* renamed from: o */
    private void m2765o() {
        m2772d();
        this.f2223B.run();
    }

    /* renamed from: a */
    public C0342b m2766a(AttributeSet attributeSet) {
        return new C0342b(getContext(), attributeSet);
    }

    /* renamed from: a */
    public void mo245a(int i) {
        m2771c();
        if (i == 2) {
            this.f2232i.mo318f();
        } else if (i == 5) {
            this.f2232i.mo319g();
        } else if (i == C0269j.AppCompatTheme_viewInflaterClass) {
            setOverlayMode(true);
        }
    }

    /* renamed from: a */
    public void mo246a(Menu menu, C0329a c0329a) {
        m2771c();
        this.f2232i.mo306a(menu, c0329a);
    }

    /* renamed from: a */
    public boolean m2769a() {
        return this.f2235l;
    }

    /* renamed from: b */
    protected C0342b m2770b() {
        return new C0342b(-1, -1);
    }

    /* renamed from: c */
    void m2771c() {
        if (this.f2231h == null) {
            this.f2231h = (ContentFrameLayout) findViewById(C0265f.action_bar_activity_content);
            this.f2225a = (ActionBarContainer) findViewById(C0265f.action_bar_container);
            this.f2232i = m2758a(findViewById(C0265f.action_bar));
        }
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0342b;
    }

    /* renamed from: d */
    void m2772d() {
        removeCallbacks(this.f2222A);
        removeCallbacks(this.f2223B);
        if (this.f2227c != null) {
            this.f2227c.cancel();
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f2233j != null && !this.f2234k) {
            int bottom = this.f2225a.getVisibility() == 0 ? (int) ((((float) this.f2225a.getBottom()) + this.f2225a.getTranslationY()) + 0.5f) : 0;
            this.f2233j.setBounds(0, bottom, getWidth(), this.f2233j.getIntrinsicHeight() + bottom);
            this.f2233j.draw(canvas);
        }
    }

    /* renamed from: e */
    public boolean mo247e() {
        m2771c();
        return this.f2232i.mo320h();
    }

    /* renamed from: f */
    public boolean mo248f() {
        m2771c();
        return this.f2232i.mo321i();
    }

    protected boolean fitSystemWindows(Rect rect) {
        m2771c();
        int f = C0227p.m880f(this) & 256;
        boolean a = m2761a(this.f2225a, rect, true, true, false, true);
        this.f2243t.set(rect);
        bc.m1513a(this, this.f2243t, this.f2240q);
        if (!this.f2244u.equals(this.f2243t)) {
            this.f2244u.set(this.f2243t);
            a = true;
        }
        if (!this.f2241r.equals(this.f2240q)) {
            this.f2241r.set(this.f2240q);
            a = true;
        }
        if (a) {
            requestLayout();
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo249g() {
        m2771c();
        return this.f2232i.mo322j();
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return m2770b();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return m2766a(attributeSet);
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new C0342b(layoutParams);
    }

    public int getActionBarHideOffset() {
        return this.f2225a != null ? -((int) this.f2225a.getTranslationY()) : 0;
    }

    public int getNestedScrollAxes() {
        return this.f2224C.m832a();
    }

    public CharSequence getTitle() {
        m2771c();
        return this.f2232i.mo317e();
    }

    /* renamed from: h */
    public boolean mo250h() {
        m2771c();
        return this.f2232i.mo323k();
    }

    /* renamed from: i */
    public boolean mo251i() {
        m2771c();
        return this.f2232i.mo324l();
    }

    /* renamed from: j */
    public void mo252j() {
        m2771c();
        this.f2232i.mo325m();
    }

    /* renamed from: k */
    public void mo253k() {
        m2771c();
        this.f2232i.mo326n();
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m2759a(getContext());
        C0227p.m881g(this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2772d();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        i = getPaddingLeft();
        getPaddingRight();
        i2 = getPaddingTop();
        getPaddingBottom();
        for (i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0342b c0342b = (C0342b) childAt.getLayoutParams();
                int i5 = c0342b.leftMargin + i;
                int i6 = c0342b.topMargin + i2;
                childAt.layout(i5, i6, childAt.getMeasuredWidth() + i5, childAt.getMeasuredHeight() + i6);
            }
        }
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        m2771c();
        measureChildWithMargins(this.f2225a, i, 0, i2, 0);
        C0342b c0342b = (C0342b) this.f2225a.getLayoutParams();
        int max = Math.max(0, (this.f2225a.getMeasuredWidth() + c0342b.leftMargin) + c0342b.rightMargin);
        int max2 = Math.max(0, (this.f2225a.getMeasuredHeight() + c0342b.topMargin) + c0342b.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f2225a.getMeasuredState());
        Object obj = (C0227p.m880f(this) & 256) != 0 ? 1 : null;
        if (obj != null) {
            i3 = this.f2229f;
            if (this.f2236m && this.f2225a.getTabContainer() != null) {
                i3 += this.f2229f;
            }
        } else {
            i3 = this.f2225a.getVisibility() != 8 ? this.f2225a.getMeasuredHeight() : 0;
        }
        this.f2242s.set(this.f2240q);
        this.f2245v.set(this.f2243t);
        Rect rect;
        if (this.f2235l || obj != null) {
            rect = this.f2245v;
            rect.top += i3;
            rect = this.f2245v;
        } else {
            rect = this.f2242s;
            rect.top += i3;
            rect = this.f2242s;
        }
        r4.bottom += 0;
        m2761a(this.f2231h, this.f2242s, true, true, true, true);
        if (!this.f2246w.equals(this.f2245v)) {
            this.f2246w.set(this.f2245v);
            this.f2231h.m1270a(this.f2245v);
        }
        measureChildWithMargins(this.f2231h, i, 0, i2, 0);
        C0342b c0342b2 = (C0342b) this.f2231h.getLayoutParams();
        max = Math.max(max, (this.f2231h.getMeasuredWidth() + c0342b2.leftMargin) + c0342b2.rightMargin);
        max2 = Math.max(max2, (this.f2231h.getMeasuredHeight() + c0342b2.topMargin) + c0342b2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f2231h.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max2 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (this.f2237n) {
            if (z) {
                if (m2760a(f, f2)) {
                    m2765o();
                } else {
                    m2764n();
                }
                this.f2226b = true;
                return true;
            }
        }
        return false;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.f2238o += i2;
        setActionBarHideOffset(this.f2238o);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f2224C.m835a(view, view2, i);
        this.f2238o = getActionBarHideOffset();
        m2772d();
        if (this.f2247x != null) {
            this.f2247x.mo188l();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) != 0) {
            if (this.f2225a.getVisibility() == 0) {
                return this.f2237n;
            }
        }
        return false;
    }

    public void onStopNestedScroll(View view) {
        if (this.f2237n && !this.f2226b) {
            if (this.f2238o <= this.f2225a.getHeight()) {
                m2762l();
            } else {
                m2763m();
            }
        }
        if (this.f2247x != null) {
            this.f2247x.mo189m();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        if (VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        m2771c();
        int i2 = this.f2239p ^ i;
        this.f2239p = i;
        int i3 = 0;
        Object obj = (i & 4) == 0 ? 1 : null;
        if ((i & 256) != 0) {
            i3 = 1;
        }
        if (this.f2247x != null) {
            this.f2247x.mo185g(i3 ^ 1);
            if (obj == null) {
                if (i3 != 0) {
                    this.f2247x.mo187k();
                }
            }
            this.f2247x.mo186j();
        }
        if ((i2 & 256) != 0 && this.f2247x != null) {
            C0227p.m881g(this);
        }
    }

    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f2230g = i;
        if (this.f2247x != null) {
            this.f2247x.mo183a(i);
        }
    }

    public void setActionBarHideOffset(int i) {
        m2772d();
        this.f2225a.setTranslationY((float) (-Math.max(0, Math.min(i, this.f2225a.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C0341a c0341a) {
        this.f2247x = c0341a;
        if (getWindowToken() != null) {
            this.f2247x.mo183a(this.f2230g);
            if (this.f2239p != 0) {
                onWindowSystemUiVisibilityChanged(this.f2239p);
                C0227p.m881g(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f2236m = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f2237n) {
            this.f2237n = z;
            if (!z) {
                m2772d();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        m2771c();
        this.f2232i.mo302a(i);
    }

    public void setIcon(Drawable drawable) {
        m2771c();
        this.f2232i.mo303a(drawable);
    }

    public void setLogo(int i) {
        m2771c();
        this.f2232i.mo311b(i);
    }

    public void setOverlayMode(boolean z) {
        this.f2235l = z;
        z = z && getContext().getApplicationInfo().targetSdkVersion < 19;
        this.f2234k = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Callback callback) {
        m2771c();
        this.f2232i.mo307a(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        m2771c();
        this.f2232i.mo308a(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
