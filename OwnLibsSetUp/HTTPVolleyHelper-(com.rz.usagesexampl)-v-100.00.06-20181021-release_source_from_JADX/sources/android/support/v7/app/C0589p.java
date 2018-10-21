package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v4.p017g.C0227p;
import android.support.v4.p017g.C0234s;
import android.support.v4.p017g.C0235t;
import android.support.v4.p017g.C0236v;
import android.support.v4.p017g.C0565u;
import android.support.v7.app.C0287a.C0285b;
import android.support.v7.p020a.C0270a.C0260a;
import android.support.v7.p020a.C0270a.C0265f;
import android.support.v7.p020a.C0270a.C0269j;
import android.support.v7.view.C0306a;
import android.support.v7.view.C0308b;
import android.support.v7.view.C0308b.C0307a;
import android.support.v7.view.C0314g;
import android.support.v7.view.C0315h;
import android.support.v7.view.menu.C0598h;
import android.support.v7.view.menu.C0598h.C0325a;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.ActionBarOverlayLayout.C0341a;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ae;
import android.support.v7.widget.ap;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: android.support.v7.app.p */
public class C0589p extends C0287a implements C0341a {
    /* renamed from: s */
    static final /* synthetic */ boolean f2029s = (C0589p.class.desiredAssertionStatus() ^ 1);
    /* renamed from: t */
    private static final Interpolator f2030t = new AccelerateInterpolator();
    /* renamed from: u */
    private static final Interpolator f2031u = new DecelerateInterpolator();
    /* renamed from: A */
    private boolean f2032A;
    /* renamed from: B */
    private boolean f2033B;
    /* renamed from: C */
    private ArrayList<C0285b> f2034C = new ArrayList();
    /* renamed from: D */
    private boolean f2035D;
    /* renamed from: E */
    private int f2036E = 0;
    /* renamed from: F */
    private boolean f2037F;
    /* renamed from: G */
    private boolean f2038G = true;
    /* renamed from: H */
    private boolean f2039H;
    /* renamed from: a */
    Context f2040a;
    /* renamed from: b */
    ActionBarOverlayLayout f2041b;
    /* renamed from: c */
    ActionBarContainer f2042c;
    /* renamed from: d */
    ae f2043d;
    /* renamed from: e */
    ActionBarContextView f2044e;
    /* renamed from: f */
    View f2045f;
    /* renamed from: g */
    ap f2046g;
    /* renamed from: h */
    C0588a f2047h;
    /* renamed from: i */
    C0308b f2048i;
    /* renamed from: j */
    C0307a f2049j;
    /* renamed from: k */
    boolean f2050k = true;
    /* renamed from: l */
    boolean f2051l;
    /* renamed from: m */
    boolean f2052m;
    /* renamed from: n */
    C0315h f2053n;
    /* renamed from: o */
    boolean f2054o;
    /* renamed from: p */
    final C0235t f2055p = new C07541(this);
    /* renamed from: q */
    final C0235t f2056q = new C07552(this);
    /* renamed from: r */
    final C0236v f2057r = new C05873(this);
    /* renamed from: v */
    private Context f2058v;
    /* renamed from: w */
    private Activity f2059w;
    /* renamed from: x */
    private Dialog f2060x;
    /* renamed from: y */
    private ArrayList<Object> f2061y = new ArrayList();
    /* renamed from: z */
    private int f2062z = -1;

    /* renamed from: android.support.v7.app.p$3 */
    class C05873 implements C0236v {
        /* renamed from: a */
        final /* synthetic */ C0589p f2023a;

        C05873(C0589p c0589p) {
            this.f2023a = c0589p;
        }

        /* renamed from: a */
        public void mo167a(View view) {
            ((View) this.f2023a.f2042c.getParent()).invalidate();
        }
    }

    /* renamed from: android.support.v7.app.p$a */
    public class C0588a extends C0308b implements C0325a {
        /* renamed from: a */
        final /* synthetic */ C0589p f2024a;
        /* renamed from: b */
        private final Context f2025b;
        /* renamed from: c */
        private final C0598h f2026c;
        /* renamed from: d */
        private C0307a f2027d;
        /* renamed from: e */
        private WeakReference<View> f2028e;

        public C0588a(C0589p c0589p, Context context, C0307a c0307a) {
            this.f2024a = c0589p;
            this.f2025b = context;
            this.f2027d = c0307a;
            this.f2026c = new C0598h(context).m2647a(1);
            this.f2026c.mo514a((C0325a) this);
        }

        /* renamed from: a */
        public MenuInflater mo168a() {
            return new C0314g(this.f2025b);
        }

        /* renamed from: a */
        public void mo169a(int i) {
            mo175b(this.f2024a.f2040a.getResources().getString(i));
        }

        /* renamed from: a */
        public void mo149a(C0598h c0598h) {
            if (this.f2027d != null) {
                mo177d();
                this.f2024a.f2044e.mo238a();
            }
        }

        /* renamed from: a */
        public void mo170a(View view) {
            this.f2024a.f2044e.setCustomView(view);
            this.f2028e = new WeakReference(view);
        }

        /* renamed from: a */
        public void mo171a(CharSequence charSequence) {
            this.f2024a.f2044e.setSubtitle(charSequence);
        }

        /* renamed from: a */
        public void mo172a(boolean z) {
            super.mo172a(z);
            this.f2024a.f2044e.setTitleOptional(z);
        }

        /* renamed from: a */
        public boolean mo150a(C0598h c0598h, MenuItem menuItem) {
            return this.f2027d != null ? this.f2027d.mo144a((C0308b) this, menuItem) : false;
        }

        /* renamed from: b */
        public Menu mo173b() {
            return this.f2026c;
        }

        /* renamed from: b */
        public void mo174b(int i) {
            mo171a(this.f2024a.f2040a.getResources().getString(i));
        }

        /* renamed from: b */
        public void mo175b(CharSequence charSequence) {
            this.f2024a.f2044e.setTitle(charSequence);
        }

        /* renamed from: c */
        public void mo176c() {
            if (this.f2024a.f2047h == this) {
                if (C0589p.m2531a(this.f2024a.f2051l, this.f2024a.f2052m, false)) {
                    this.f2027d.mo142a(this);
                } else {
                    this.f2024a.f2048i = this;
                    this.f2024a.f2049j = this.f2027d;
                }
                this.f2027d = null;
                this.f2024a.m2560j(false);
                this.f2024a.f2044e.m2755b();
                this.f2024a.f2043d.mo301a().sendAccessibilityEvent(32);
                this.f2024a.f2041b.setHideOnContentScrollEnabled(this.f2024a.f2054o);
                this.f2024a.f2047h = null;
            }
        }

        /* renamed from: d */
        public void mo177d() {
            if (this.f2024a.f2047h == this) {
                this.f2026c.m2681g();
                try {
                    this.f2027d.mo145b(this, this.f2026c);
                } finally {
                    this.f2026c.m2682h();
                }
            }
        }

        /* renamed from: e */
        public boolean m2525e() {
            this.f2026c.m2681g();
            try {
                boolean a = this.f2027d.mo143a((C0308b) this, this.f2026c);
                return a;
            } finally {
                this.f2026c.m2682h();
            }
        }

        /* renamed from: f */
        public CharSequence mo178f() {
            return this.f2024a.f2044e.getTitle();
        }

        /* renamed from: g */
        public CharSequence mo179g() {
            return this.f2024a.f2044e.getSubtitle();
        }

        /* renamed from: h */
        public boolean mo180h() {
            return this.f2024a.f2044e.m2757d();
        }

        /* renamed from: i */
        public View mo181i() {
            return this.f2028e != null ? (View) this.f2028e.get() : null;
        }
    }

    /* renamed from: android.support.v7.app.p$1 */
    class C07541 extends C0565u {
        /* renamed from: a */
        final /* synthetic */ C0589p f2688a;

        C07541(C0589p c0589p) {
            this.f2688a = c0589p;
        }

        /* renamed from: b */
        public void mo100b(View view) {
            if (this.f2688a.f2050k && this.f2688a.f2045f != null) {
                this.f2688a.f2045f.setTranslationY(0.0f);
                this.f2688a.f2042c.setTranslationY(0.0f);
            }
            this.f2688a.f2042c.setVisibility(8);
            this.f2688a.f2042c.setTransitioning(false);
            this.f2688a.f2053n = null;
            this.f2688a.m2555h();
            if (this.f2688a.f2041b != null) {
                C0227p.m881g(this.f2688a.f2041b);
            }
        }
    }

    /* renamed from: android.support.v7.app.p$2 */
    class C07552 extends C0565u {
        /* renamed from: a */
        final /* synthetic */ C0589p f2689a;

        C07552(C0589p c0589p) {
            this.f2689a = c0589p;
        }

        /* renamed from: b */
        public void mo100b(View view) {
            this.f2689a.f2053n = null;
            this.f2689a.f2042c.requestLayout();
        }
    }

    public C0589p(Activity activity, boolean z) {
        this.f2059w = activity;
        View decorView = activity.getWindow().getDecorView();
        m2530a(decorView);
        if (!z) {
            this.f2045f = decorView.findViewById(16908290);
        }
    }

    public C0589p(Dialog dialog) {
        this.f2060x = dialog;
        m2530a(dialog.getWindow().getDecorView());
    }

    /* renamed from: a */
    private void m2530a(View view) {
        this.f2041b = (ActionBarOverlayLayout) view.findViewById(C0265f.decor_content_parent);
        if (this.f2041b != null) {
            this.f2041b.setActionBarVisibilityCallback(this);
        }
        this.f2043d = m2532b(view.findViewById(C0265f.action_bar));
        this.f2044e = (ActionBarContextView) view.findViewById(C0265f.action_context_bar);
        this.f2042c = (ActionBarContainer) view.findViewById(C0265f.action_bar_container);
        if (this.f2043d == null || this.f2044e == null || this.f2042c == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(getClass().getSimpleName());
            stringBuilder.append(" can only be used ");
            stringBuilder.append("with a compatible window decor layout");
            throw new IllegalStateException(stringBuilder.toString());
        }
        boolean z;
        TypedArray obtainStyledAttributes;
        int dimensionPixelSize;
        this.f2040a = this.f2043d.mo310b();
        Object obj = (this.f2043d.mo327o() & 4) != 0 ? 1 : null;
        if (obj != null) {
            this.f2032A = true;
        }
        C0306a a = C0306a.m1140a(this.f2040a);
        if (!a.m1146f()) {
            if (obj == null) {
                z = false;
                mo155a(z);
                m2533k(a.m1144d());
                obtainStyledAttributes = this.f2040a.obtainStyledAttributes(null, C0269j.ActionBar, C0260a.actionBarStyle, 0);
                if (obtainStyledAttributes.getBoolean(C0269j.ActionBar_hideOnContentScroll, false)) {
                    mo184b(true);
                }
                dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0269j.ActionBar_elevation, 0);
                if (dimensionPixelSize != 0) {
                    mo152a((float) dimensionPixelSize);
                }
                obtainStyledAttributes.recycle();
            }
        }
        z = true;
        mo155a(z);
        m2533k(a.m1144d());
        obtainStyledAttributes = this.f2040a.obtainStyledAttributes(null, C0269j.ActionBar, C0260a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C0269j.ActionBar_hideOnContentScroll, false)) {
            mo184b(true);
        }
        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0269j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            mo152a((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    static boolean m2531a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        if (!z) {
            if (!z2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private ae m2532b(View view) {
        if (view instanceof ae) {
            return (ae) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can't make a decor toolbar out of ");
        stringBuilder.append(view);
        throw new IllegalStateException(stringBuilder.toString() != null ? view.getClass().getSimpleName() : "null");
    }

    /* renamed from: k */
    private void m2533k(boolean z) {
        this.f2035D = z;
        if (this.f2035D) {
            this.f2042c.setTabContainer(null);
            this.f2043d.mo305a(this.f2046g);
        } else {
            this.f2043d.mo305a(null);
            this.f2042c.setTabContainer(this.f2046g);
        }
        boolean z2 = true;
        Object obj = m2557i() == 2 ? 1 : null;
        if (this.f2046g != null) {
            if (obj != null) {
                this.f2046g.setVisibility(0);
                if (this.f2041b != null) {
                    C0227p.m881g(this.f2041b);
                }
            } else {
                this.f2046g.setVisibility(8);
            }
        }
        ae aeVar = this.f2043d;
        boolean z3 = (this.f2035D || obj == null) ? false : true;
        aeVar.mo309a(z3);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2041b;
        if (this.f2035D || obj == null) {
            z2 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z2);
    }

    /* renamed from: l */
    private void m2534l(boolean z) {
        if (C0589p.m2531a(this.f2051l, this.f2052m, this.f2037F)) {
            if (!this.f2038G) {
                this.f2038G = true;
                m2556h(z);
            }
        } else if (this.f2038G) {
            this.f2038G = false;
            m2558i(z);
        }
    }

    /* renamed from: n */
    private void m2535n() {
        if (!this.f2037F) {
            this.f2037F = true;
            if (this.f2041b != null) {
                this.f2041b.setShowingForActionMode(true);
            }
            m2534l(false);
        }
    }

    /* renamed from: o */
    private void m2536o() {
        if (this.f2037F) {
            this.f2037F = false;
            if (this.f2041b != null) {
                this.f2041b.setShowingForActionMode(false);
            }
            m2534l(false);
        }
    }

    /* renamed from: p */
    private boolean m2537p() {
        return C0227p.m886l(this.f2042c);
    }

    /* renamed from: a */
    public int mo151a() {
        return this.f2043d.mo327o();
    }

    /* renamed from: a */
    public C0308b mo182a(C0307a c0307a) {
        if (this.f2047h != null) {
            this.f2047h.mo176c();
        }
        this.f2041b.setHideOnContentScrollEnabled(false);
        this.f2044e.m2756c();
        C0308b c0588a = new C0588a(this, this.f2044e.getContext(), c0307a);
        if (!c0588a.m2525e()) {
            return null;
        }
        this.f2047h = c0588a;
        c0588a.mo177d();
        this.f2044e.m2753a(c0588a);
        m2560j(true);
        this.f2044e.sendAccessibilityEvent(32);
        return c0588a;
    }

    /* renamed from: a */
    public void mo152a(float f) {
        C0227p.m866a(this.f2042c, f);
    }

    /* renamed from: a */
    public void mo183a(int i) {
        this.f2036E = i;
    }

    /* renamed from: a */
    public void m2542a(int i, int i2) {
        int o = this.f2043d.mo327o();
        if ((i2 & 4) != 0) {
            this.f2032A = true;
        }
        this.f2043d.mo313c((i & i2) | ((i2 ^ -1) & o));
    }

    /* renamed from: a */
    public void mo153a(Configuration configuration) {
        m2533k(C0306a.m1140a(this.f2040a).m1144d());
    }

    /* renamed from: a */
    public void mo154a(CharSequence charSequence) {
        this.f2043d.mo308a(charSequence);
    }

    /* renamed from: a */
    public void mo155a(boolean z) {
        this.f2043d.mo312b(z);
    }

    /* renamed from: a */
    public boolean mo156a(int i, KeyEvent keyEvent) {
        if (this.f2047h == null) {
            return false;
        }
        Menu b = this.f2047h.mo173b();
        if (b == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        b.setQwertyMode(z);
        return b.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: b */
    public Context mo158b() {
        if (this.f2058v == null) {
            TypedValue typedValue = new TypedValue();
            this.f2040a.getTheme().resolveAttribute(C0260a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f2058v = new ContextThemeWrapper(this.f2040a, i);
            } else {
                this.f2058v = this.f2040a;
            }
        }
        return this.f2058v;
    }

    /* renamed from: b */
    public void mo184b(boolean z) {
        if (z) {
            if (!this.f2041b.m2769a()) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        this.f2054o = z;
        this.f2041b.setHideOnContentScrollEnabled(z);
    }

    /* renamed from: c */
    public void mo159c(boolean z) {
        if (!this.f2032A) {
            m2552f(z);
        }
    }

    /* renamed from: d */
    public void mo161d(boolean z) {
        this.f2039H = z;
        if (!z && this.f2053n != null) {
            this.f2053n.m1194c();
        }
    }

    /* renamed from: e */
    public void mo163e(boolean z) {
        if (z != this.f2033B) {
            this.f2033B = z;
            int size = this.f2034C.size();
            for (int i = 0; i < size; i++) {
                ((C0285b) this.f2034C.get(i)).m1042a(z);
            }
        }
    }

    /* renamed from: f */
    public void m2552f(boolean z) {
        m2542a(z ? 4 : 0, 4);
    }

    /* renamed from: f */
    public boolean mo165f() {
        if (this.f2043d == null || !this.f2043d.mo314c()) {
            return false;
        }
        this.f2043d.mo315d();
        return true;
    }

    /* renamed from: g */
    public void mo185g(boolean z) {
        this.f2050k = z;
    }

    /* renamed from: h */
    void m2555h() {
        if (this.f2049j != null) {
            this.f2049j.mo142a(this.f2048i);
            this.f2048i = null;
            this.f2049j = null;
        }
    }

    /* renamed from: h */
    public void m2556h(boolean z) {
        if (this.f2053n != null) {
            this.f2053n.m1194c();
        }
        this.f2042c.setVisibility(0);
        if (this.f2036E == 0 && (this.f2039H || z)) {
            this.f2042c.setTranslationY(0.0f);
            float f = (float) (-this.f2042c.getHeight());
            if (z) {
                int[] iArr = new int[]{0, 0};
                this.f2042c.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            this.f2042c.setTranslationY(f);
            C0315h c0315h = new C0315h();
            C0234s b = C0227p.m878d(this.f2042c).m912b(0.0f);
            b.m910a(this.f2057r);
            c0315h.m1188a(b);
            if (this.f2050k && this.f2045f != null) {
                this.f2045f.setTranslationY(f);
                c0315h.m1188a(C0227p.m878d(this.f2045f).m912b(0.0f));
            }
            c0315h.m1191a(f2031u);
            c0315h.m1187a(250);
            c0315h.m1190a(this.f2056q);
            this.f2053n = c0315h;
            c0315h.m1192a();
        } else {
            this.f2042c.setAlpha(1.0f);
            this.f2042c.setTranslationY(0.0f);
            if (this.f2050k && this.f2045f != null) {
                this.f2045f.setTranslationY(0.0f);
            }
            this.f2056q.mo100b(null);
        }
        if (this.f2041b != null) {
            C0227p.m881g(this.f2041b);
        }
    }

    /* renamed from: i */
    public int m2557i() {
        return this.f2043d.mo328p();
    }

    /* renamed from: i */
    public void m2558i(boolean z) {
        if (this.f2053n != null) {
            this.f2053n.m1194c();
        }
        if (this.f2036E == 0 && (this.f2039H || z)) {
            this.f2042c.setAlpha(1.0f);
            this.f2042c.setTransitioning(true);
            C0315h c0315h = new C0315h();
            float f = (float) (-this.f2042c.getHeight());
            if (z) {
                int[] iArr = new int[]{0, 0};
                this.f2042c.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            C0234s b = C0227p.m878d(this.f2042c).m912b(f);
            b.m910a(this.f2057r);
            c0315h.m1188a(b);
            if (this.f2050k && this.f2045f != null) {
                c0315h.m1188a(C0227p.m878d(this.f2045f).m912b(f));
            }
            c0315h.m1191a(f2030t);
            c0315h.m1187a(250);
            c0315h.m1190a(this.f2055p);
            this.f2053n = c0315h;
            c0315h.m1192a();
            return;
        }
        this.f2055p.mo100b(null);
    }

    /* renamed from: j */
    public void mo186j() {
        if (this.f2052m) {
            this.f2052m = false;
            m2534l(true);
        }
    }

    /* renamed from: j */
    public void m2560j(boolean z) {
        if (z) {
            m2535n();
        } else {
            m2536o();
        }
        if (m2537p()) {
            C0234s a;
            C0234s a2;
            if (z) {
                a = this.f2043d.mo300a(4, 100);
                a2 = this.f2044e.mo237a(0, 200);
            } else {
                a2 = this.f2043d.mo300a(0, 200);
                a = this.f2044e.mo237a(8, 100);
            }
            C0315h c0315h = new C0315h();
            c0315h.m1189a(a, a2);
            c0315h.m1192a();
        } else if (z) {
            this.f2043d.mo316d(4);
            this.f2044e.setVisibility(0);
        } else {
            this.f2043d.mo316d(0);
            this.f2044e.setVisibility(8);
        }
    }

    /* renamed from: k */
    public void mo187k() {
        if (!this.f2052m) {
            this.f2052m = true;
            m2534l(true);
        }
    }

    /* renamed from: l */
    public void mo188l() {
        if (this.f2053n != null) {
            this.f2053n.m1194c();
            this.f2053n = null;
        }
    }

    /* renamed from: m */
    public void mo189m() {
    }
}
