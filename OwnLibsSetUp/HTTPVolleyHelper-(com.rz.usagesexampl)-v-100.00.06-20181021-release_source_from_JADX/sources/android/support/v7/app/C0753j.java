package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.C0151v;
import android.support.v4.p017g.C0215e;
import android.support.v4.p017g.C0223n;
import android.support.v4.p017g.C0227p;
import android.support.v4.p017g.C0234s;
import android.support.v4.p017g.C0237w;
import android.support.v4.p017g.C0565u;
import android.support.v7.p020a.C0270a.C0260a;
import android.support.v7.p020a.C0270a.C0262c;
import android.support.v7.p020a.C0270a.C0265f;
import android.support.v7.p020a.C0270a.C0266g;
import android.support.v7.p020a.C0270a.C0268i;
import android.support.v7.p020a.C0270a.C0269j;
import android.support.v7.p021b.p022a.C0303b;
import android.support.v7.view.C0308b;
import android.support.v7.view.C0308b.C0307a;
import android.support.v7.view.C0310d;
import android.support.v7.view.menu.C0330o.C0329a;
import android.support.v7.view.menu.C0332p;
import android.support.v7.view.menu.C0597f;
import android.support.v7.view.menu.C0598h;
import android.support.v7.view.menu.C0598h.C0325a;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.C0394l;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.ContentFrameLayout.C0347a;
import android.support.v7.widget.ad;
import android.support.v7.widget.ah;
import android.support.v7.widget.ah.C0363a;
import android.support.v7.widget.bb;
import android.support.v7.widget.bc;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v7.app.j */
class C0753j extends C0575f implements C0325a, Factory2 {
    /* renamed from: t */
    private static final boolean f2662t = (VERSION.SDK_INT < 21);
    /* renamed from: A */
    private View f2663A;
    /* renamed from: B */
    private boolean f2664B;
    /* renamed from: C */
    private boolean f2665C;
    /* renamed from: D */
    private boolean f2666D;
    /* renamed from: E */
    private C0296d[] f2667E;
    /* renamed from: F */
    private C0296d f2668F;
    /* renamed from: G */
    private boolean f2669G;
    /* renamed from: H */
    private final Runnable f2670H = new C02941(this);
    /* renamed from: I */
    private boolean f2671I;
    /* renamed from: J */
    private Rect f2672J;
    /* renamed from: K */
    private Rect f2673K;
    /* renamed from: L */
    private AppCompatViewInflater f2674L;
    /* renamed from: m */
    C0308b f2675m;
    /* renamed from: n */
    ActionBarContextView f2676n;
    /* renamed from: o */
    PopupWindow f2677o;
    /* renamed from: p */
    Runnable f2678p;
    /* renamed from: q */
    C0234s f2679q = null;
    /* renamed from: r */
    boolean f2680r;
    /* renamed from: s */
    int f2681s;
    /* renamed from: u */
    private ad f2682u;
    /* renamed from: v */
    private C0579a f2683v;
    /* renamed from: w */
    private C0582e f2684w;
    /* renamed from: x */
    private boolean f2685x;
    /* renamed from: y */
    private ViewGroup f2686y;
    /* renamed from: z */
    private TextView f2687z;

    /* renamed from: android.support.v7.app.j$1 */
    class C02941 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0753j f975a;

        C02941(C0753j c0753j) {
            this.f975a = c0753j;
        }

        public void run() {
            if ((this.f975a.f2681s & 1) != 0) {
                this.f975a.m3520f(0);
            }
            if ((this.f975a.f2681s & 4096) != 0) {
                this.f975a.m3520f(C0269j.AppCompatTheme_tooltipFrameBackground);
            }
            this.f975a.f2680r = false;
            this.f975a.f2681s = 0;
        }
    }

    /* renamed from: android.support.v7.app.j$5 */
    class C02955 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0753j f976a;

        /* renamed from: android.support.v7.app.j$5$1 */
        class C07501 extends C0565u {
            /* renamed from: a */
            final /* synthetic */ C02955 f2659a;

            C07501(C02955 c02955) {
                this.f2659a = c02955;
            }

            /* renamed from: a */
            public void mo99a(View view) {
                this.f2659a.f976a.f2676n.setVisibility(0);
            }

            /* renamed from: b */
            public void mo100b(View view) {
                this.f2659a.f976a.f2676n.setAlpha(1.0f);
                this.f2659a.f976a.f2679q.m909a(null);
                this.f2659a.f976a.f2679q = null;
            }
        }

        C02955(C0753j c0753j) {
            this.f976a = c0753j;
        }

        public void run() {
            this.f976a.f2677o.showAtLocation(this.f976a.f2676n, 55, 0, 0);
            this.f976a.m3526t();
            if (this.f976a.m3525s()) {
                this.f976a.f2676n.setAlpha(0.0f);
                this.f976a.f2679q = C0227p.m878d(this.f976a.f2676n).m907a(1.0f);
                this.f976a.f2679q.m909a(new C07501(this));
                return;
            }
            this.f976a.f2676n.setAlpha(1.0f);
            this.f976a.f2676n.setVisibility(0);
        }
    }

    /* renamed from: android.support.v7.app.j$d */
    protected static final class C0296d {
        /* renamed from: a */
        int f977a;
        /* renamed from: b */
        int f978b;
        /* renamed from: c */
        int f979c;
        /* renamed from: d */
        int f980d;
        /* renamed from: e */
        int f981e;
        /* renamed from: f */
        int f982f;
        /* renamed from: g */
        ViewGroup f983g;
        /* renamed from: h */
        View f984h;
        /* renamed from: i */
        View f985i;
        /* renamed from: j */
        C0598h f986j;
        /* renamed from: k */
        C0597f f987k;
        /* renamed from: l */
        Context f988l;
        /* renamed from: m */
        boolean f989m;
        /* renamed from: n */
        boolean f990n;
        /* renamed from: o */
        boolean f991o;
        /* renamed from: p */
        public boolean f992p;
        /* renamed from: q */
        boolean f993q = false;
        /* renamed from: r */
        boolean f994r;
        /* renamed from: s */
        Bundle f995s;

        C0296d(int i) {
            this.f977a = i;
        }

        /* renamed from: a */
        C0332p m1106a(C0329a c0329a) {
            if (this.f986j == null) {
                return null;
            }
            if (this.f987k == null) {
                this.f987k = new C0597f(this.f988l, C0266g.abc_list_menu_item_layout);
                this.f987k.mo222a(c0329a);
                this.f986j.m2657a(this.f987k);
            }
            return this.f987k.m2628a(this.f983g);
        }

        /* renamed from: a */
        void m1107a(Context context) {
            TypedValue typedValue = new TypedValue();
            Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C0260a.actionBarPopupTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            }
            newTheme.resolveAttribute(C0260a.panelMenuListTheme, typedValue, true);
            newTheme.applyStyle(typedValue.resourceId != 0 ? typedValue.resourceId : C0268i.Theme_AppCompat_CompactMenu, true);
            Context c0310d = new C0310d(context, 0);
            c0310d.getTheme().setTo(newTheme);
            this.f988l = c0310d;
            TypedArray obtainStyledAttributes = c0310d.obtainStyledAttributes(C0269j.AppCompatTheme);
            this.f978b = obtainStyledAttributes.getResourceId(C0269j.AppCompatTheme_panelBackground, 0);
            this.f982f = obtainStyledAttributes.getResourceId(C0269j.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        void m1108a(C0598h c0598h) {
            if (c0598h != this.f986j) {
                if (this.f986j != null) {
                    this.f986j.m2668b(this.f987k);
                }
                this.f986j = c0598h;
                if (!(c0598h == null || this.f987k == null)) {
                    c0598h.m2657a(this.f987k);
                }
            }
        }

        /* renamed from: a */
        public boolean m1109a() {
            boolean z = false;
            if (this.f984h == null) {
                return false;
            }
            if (this.f985i != null) {
                return true;
            }
            if (this.f987k.m2629a().getCount() > 0) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: android.support.v7.app.j$2 */
    class C05762 implements C0223n {
        /* renamed from: a */
        final /* synthetic */ C0753j f2005a;

        C05762(C0753j c0753j) {
            this.f2005a = c0753j;
        }

        /* renamed from: a */
        public C0237w mo136a(View view, C0237w c0237w) {
            int b = c0237w.m924b();
            int g = this.f2005a.m3521g(b);
            if (b != g) {
                c0237w = c0237w.m923a(c0237w.m922a(), g, c0237w.m925c(), c0237w.m926d());
            }
            return C0227p.m864a(view, c0237w);
        }
    }

    /* renamed from: android.support.v7.app.j$3 */
    class C05773 implements C0363a {
        /* renamed from: a */
        final /* synthetic */ C0753j f2006a;

        C05773(C0753j c0753j) {
            this.f2006a = c0753j;
        }

        /* renamed from: a */
        public void mo137a(Rect rect) {
            rect.top = this.f2006a.m3521g(rect.top);
        }
    }

    /* renamed from: android.support.v7.app.j$4 */
    class C05784 implements C0347a {
        /* renamed from: a */
        final /* synthetic */ C0753j f2007a;

        C05784(C0753j c0753j) {
            this.f2007a = c0753j;
        }

        /* renamed from: a */
        public void mo138a() {
        }

        /* renamed from: b */
        public void mo139b() {
            this.f2007a.m3528v();
        }
    }

    /* renamed from: android.support.v7.app.j$a */
    private final class C0579a implements C0329a {
        /* renamed from: a */
        final /* synthetic */ C0753j f2008a;

        C0579a(C0753j c0753j) {
            this.f2008a = c0753j;
        }

        /* renamed from: a */
        public void mo140a(C0598h c0598h, boolean z) {
            this.f2008a.m3509b(c0598h);
        }

        /* renamed from: a */
        public boolean mo141a(C0598h c0598h) {
            Callback q = this.f2008a.m2470q();
            if (q != null) {
                q.onMenuOpened(C0269j.AppCompatTheme_tooltipFrameBackground, c0598h);
            }
            return true;
        }
    }

    /* renamed from: android.support.v7.app.j$b */
    class C0580b implements C0307a {
        /* renamed from: a */
        final /* synthetic */ C0753j f2009a;
        /* renamed from: b */
        private C0307a f2010b;

        /* renamed from: android.support.v7.app.j$b$1 */
        class C07521 extends C0565u {
            /* renamed from: a */
            final /* synthetic */ C0580b f2661a;

            C07521(C0580b c0580b) {
                this.f2661a = c0580b;
            }

            /* renamed from: b */
            public void mo100b(View view) {
                this.f2661a.f2009a.f2676n.setVisibility(8);
                if (this.f2661a.f2009a.f2677o != null) {
                    this.f2661a.f2009a.f2677o.dismiss();
                } else if (this.f2661a.f2009a.f2676n.getParent() instanceof View) {
                    C0227p.m881g((View) this.f2661a.f2009a.f2676n.getParent());
                }
                this.f2661a.f2009a.f2676n.removeAllViews();
                this.f2661a.f2009a.f2679q.m909a(null);
                this.f2661a.f2009a.f2679q = null;
            }
        }

        public C0580b(C0753j c0753j, C0307a c0307a) {
            this.f2009a = c0753j;
            this.f2010b = c0307a;
        }

        /* renamed from: a */
        public void mo142a(C0308b c0308b) {
            this.f2010b.mo142a(c0308b);
            if (this.f2009a.f2677o != null) {
                this.f2009a.b.getDecorView().removeCallbacks(this.f2009a.f2678p);
            }
            if (this.f2009a.f2676n != null) {
                this.f2009a.m3526t();
                this.f2009a.f2679q = C0227p.m878d(this.f2009a.f2676n).m907a(0.0f);
                this.f2009a.f2679q.m909a(new C07521(this));
            }
            if (this.f2009a.e != null) {
                this.f2009a.e.mo148b(this.f2009a.f2675m);
            }
            this.f2009a.f2675m = null;
        }

        /* renamed from: a */
        public boolean mo143a(C0308b c0308b, Menu menu) {
            return this.f2010b.mo143a(c0308b, menu);
        }

        /* renamed from: a */
        public boolean mo144a(C0308b c0308b, MenuItem menuItem) {
            return this.f2010b.mo144a(c0308b, menuItem);
        }

        /* renamed from: b */
        public boolean mo145b(C0308b c0308b, Menu menu) {
            return this.f2010b.mo145b(c0308b, menu);
        }
    }

    /* renamed from: android.support.v7.app.j$c */
    private class C0581c extends ContentFrameLayout {
        /* renamed from: a */
        final /* synthetic */ C0753j f2011a;

        public C0581c(C0753j c0753j, Context context) {
            this.f2011a = c0753j;
            super(context);
        }

        /* renamed from: a */
        private boolean m2482a(int i, int i2) {
            if (i >= -5 && i2 >= -5 && i <= getWidth() + 5) {
                if (i2 <= getHeight() + 5) {
                    return false;
                }
            }
            return true;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (!this.f2011a.mo487a(keyEvent)) {
                if (!super.dispatchKeyEvent(keyEvent)) {
                    return false;
                }
            }
            return true;
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m2482a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            this.f2011a.m3518e(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C0303b.m1131b(getContext(), i));
        }
    }

    /* renamed from: android.support.v7.app.j$e */
    private final class C0582e implements C0329a {
        /* renamed from: a */
        final /* synthetic */ C0753j f2012a;

        C0582e(C0753j c0753j) {
            this.f2012a = c0753j;
        }

        /* renamed from: a */
        public void mo140a(C0598h c0598h, boolean z) {
            Menu menu;
            Menu p = c0598h.mo520p();
            Object obj = p != c0598h ? 1 : null;
            C0753j c0753j = this.f2012a;
            if (obj != null) {
                menu = p;
            }
            C0296d a = c0753j.m3489a(menu);
            if (a == null) {
                return;
            }
            if (obj != null) {
                this.f2012a.m3493a(a.f977a, a, p);
                this.f2012a.m3497a(a, true);
                return;
            }
            this.f2012a.m3497a(a, z);
        }

        /* renamed from: a */
        public boolean mo141a(C0598h c0598h) {
            if (c0598h == null && this.f2012a.h) {
                Callback q = this.f2012a.m2470q();
                if (!(q == null || this.f2012a.m2469p())) {
                    q.onMenuOpened(C0269j.AppCompatTheme_tooltipFrameBackground, c0598h);
                }
            }
            return true;
        }
    }

    /* renamed from: android.support.v7.app.j$6 */
    class C07516 extends C0565u {
        /* renamed from: a */
        final /* synthetic */ C0753j f2660a;

        C07516(C0753j c0753j) {
            this.f2660a = c0753j;
        }

        /* renamed from: a */
        public void mo99a(View view) {
            this.f2660a.f2676n.setVisibility(0);
            this.f2660a.f2676n.sendAccessibilityEvent(32);
            if (this.f2660a.f2676n.getParent() instanceof View) {
                C0227p.m881g((View) this.f2660a.f2676n.getParent());
            }
        }

        /* renamed from: b */
        public void mo100b(View view) {
            this.f2660a.f2676n.setAlpha(1.0f);
            this.f2660a.f2679q.m909a(null);
            this.f2660a.f2679q = null;
        }
    }

    C0753j(Context context, Window window, C0289d c0289d) {
        super(context, window, c0289d);
    }

    /* renamed from: a */
    private void m3472a(C0296d c0296d, KeyEvent keyEvent) {
        if (!c0296d.f991o) {
            if (!m2469p()) {
                if (c0296d.f977a == 0) {
                    if (((this.a.getResources().getConfiguration().screenLayout & 15) == 4 ? 1 : null) != null) {
                        return;
                    }
                }
                Callback q = m2470q();
                if (q == null || q.onMenuOpened(c0296d.f977a, c0296d.f986j)) {
                    WindowManager windowManager = (WindowManager) this.a.getSystemService("window");
                    if (windowManager != null && m3478b(c0296d, keyEvent)) {
                        LayoutParams layoutParams;
                        int i;
                        LayoutParams layoutParams2;
                        if (c0296d.f983g != null) {
                            if (!c0296d.f993q) {
                                if (c0296d.f985i != null) {
                                    layoutParams = c0296d.f985i.getLayoutParams();
                                    if (layoutParams != null && layoutParams.width == -1) {
                                        i = -1;
                                        c0296d.f990n = false;
                                        layoutParams2 = new WindowManager.LayoutParams(i, -2, c0296d.f980d, c0296d.f981e, 1002, 8519680, -3);
                                        layoutParams2.gravity = c0296d.f979c;
                                        layoutParams2.windowAnimations = c0296d.f982f;
                                        windowManager.addView(c0296d.f983g, layoutParams2);
                                        c0296d.f991o = true;
                                    }
                                }
                                i = -2;
                                c0296d.f990n = false;
                                layoutParams2 = new WindowManager.LayoutParams(i, -2, c0296d.f980d, c0296d.f981e, 1002, 8519680, -3);
                                layoutParams2.gravity = c0296d.f979c;
                                layoutParams2.windowAnimations = c0296d.f982f;
                                windowManager.addView(c0296d.f983g, layoutParams2);
                                c0296d.f991o = true;
                            }
                        }
                        if (c0296d.f983g == null) {
                            if (!m3474a(c0296d) || c0296d.f983g == null) {
                                return;
                            }
                        } else if (c0296d.f993q && c0296d.f983g.getChildCount() > 0) {
                            c0296d.f983g.removeAllViews();
                        }
                        if (m3479c(c0296d)) {
                            if (c0296d.m1109a()) {
                                layoutParams = c0296d.f984h.getLayoutParams();
                                if (layoutParams == null) {
                                    layoutParams = new LayoutParams(-2, -2);
                                }
                                c0296d.f983g.setBackgroundResource(c0296d.f978b);
                                ViewParent parent = c0296d.f984h.getParent();
                                if (parent != null && (parent instanceof ViewGroup)) {
                                    ((ViewGroup) parent).removeView(c0296d.f984h);
                                }
                                c0296d.f983g.addView(c0296d.f984h, layoutParams);
                                if (!c0296d.f984h.hasFocus()) {
                                    c0296d.f984h.requestFocus();
                                }
                                i = -2;
                                c0296d.f990n = false;
                                layoutParams2 = new WindowManager.LayoutParams(i, -2, c0296d.f980d, c0296d.f981e, 1002, 8519680, -3);
                                layoutParams2.gravity = c0296d.f979c;
                                layoutParams2.windowAnimations = c0296d.f982f;
                                windowManager.addView(c0296d.f983g, layoutParams2);
                                c0296d.f991o = true;
                            }
                        }
                    } else {
                        return;
                    }
                }
                m3497a(c0296d, true);
            }
        }
    }

    /* renamed from: a */
    private void m3473a(C0598h c0598h, boolean z) {
        if (this.f2682u == null || !this.f2682u.mo247e() || (ViewConfiguration.get(this.a).hasPermanentMenuKey() && !this.f2682u.mo249g())) {
            C0296d a = m3488a(0, true);
            a.f993q = true;
            m3497a(a, false);
            m3472a(a, null);
            return;
        }
        Callback q = m2470q();
        if (this.f2682u.mo248f()) {
            if (z) {
                this.f2682u.mo251i();
                if (!m2469p()) {
                    q.onPanelClosed(C0269j.AppCompatTheme_tooltipFrameBackground, m3488a(0, true).f986j);
                }
            }
        }
        if (!(q == null || m2469p())) {
            if (this.f2680r && (this.f2681s & 1) != 0) {
                this.b.getDecorView().removeCallbacks(this.f2670H);
                this.f2670H.run();
            }
            C0296d a2 = m3488a(0, true);
            if (!(a2.f986j == null || a2.f994r || !q.onPreparePanel(0, a2.f985i, a2.f986j))) {
                q.onMenuOpened(C0269j.AppCompatTheme_tooltipFrameBackground, a2.f986j);
                this.f2682u.mo250h();
            }
        }
    }

    /* renamed from: a */
    private boolean m3474a(C0296d c0296d) {
        c0296d.m1107a(m2467n());
        c0296d.f983g = new C0581c(this, c0296d.f988l);
        c0296d.f979c = 81;
        return true;
    }

    /* renamed from: a */
    private boolean m3475a(C0296d c0296d, int i, KeyEvent keyEvent, int i2) {
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c0296d.f989m || m3478b(c0296d, keyEvent)) && c0296d.f986j != null) {
            z = c0296d.f986j.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f2682u == null) {
            m3497a(c0296d, true);
        }
        return z;
    }

    /* renamed from: a */
    private boolean m3476a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        ViewParent decorView = this.b.getDecorView();
        while (viewParent != null) {
            if (viewParent != decorView && (viewParent instanceof View)) {
                if (!C0227p.m887m((View) viewParent)) {
                    viewParent = viewParent.getParent();
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private boolean m3477b(C0296d c0296d) {
        Context context = this.a;
        if ((c0296d.f977a == 0 || c0296d.f977a == C0269j.AppCompatTheme_tooltipFrameBackground) && this.f2682u != null) {
            TypedValue typedValue = new TypedValue();
            Theme theme = context.getTheme();
            theme.resolveAttribute(C0260a.actionBarTheme, typedValue, true);
            Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C0260a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C0260a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                Context c0310d = new C0310d(context, 0);
                c0310d.getTheme().setTo(theme2);
                context = c0310d;
            }
        }
        C0598h c0598h = new C0598h(context);
        c0598h.mo514a((C0325a) this);
        c0296d.m1108a(c0598h);
        return true;
    }

    /* renamed from: b */
    private boolean m3478b(C0296d c0296d, KeyEvent keyEvent) {
        if (m2469p()) {
            return false;
        }
        if (c0296d.f989m) {
            return true;
        }
        Object obj;
        if (!(this.f2668F == null || this.f2668F == c0296d)) {
            m3497a(this.f2668F, false);
        }
        Callback q = m2470q();
        if (q != null) {
            c0296d.f985i = q.onCreatePanelView(c0296d.f977a);
        }
        if (c0296d.f977a != 0) {
            if (c0296d.f977a != C0269j.AppCompatTheme_tooltipFrameBackground) {
                obj = null;
                if (!(obj == null || this.f2682u == null)) {
                    this.f2682u.mo252j();
                }
                if (c0296d.f985i == null && (obj == null || !(m2466m() instanceof C0586m))) {
                    if (c0296d.f986j == null || c0296d.f994r) {
                        if (c0296d.f986j != null && (!m3477b(c0296d) || c0296d.f986j == null)) {
                            return false;
                        }
                        if (!(obj == null || this.f2682u == null)) {
                            if (this.f2683v == null) {
                                this.f2683v = new C0579a(this);
                            }
                            this.f2682u.mo246a(c0296d.f986j, this.f2683v);
                        }
                        c0296d.f986j.m2681g();
                        if (q.onCreatePanelMenu(c0296d.f977a, c0296d.f986j)) {
                            c0296d.m1108a(null);
                            if (!(obj == null || this.f2682u == null)) {
                                this.f2682u.mo246a(null, this.f2683v);
                            }
                            return false;
                        }
                        c0296d.f994r = false;
                    }
                    c0296d.f986j.m2681g();
                    if (c0296d.f995s != null) {
                        c0296d.f986j.m2666b(c0296d.f995s);
                        c0296d.f995s = null;
                    }
                    if (q.onPreparePanel(0, c0296d.f985i, c0296d.f986j)) {
                        if (!(obj == null || this.f2682u == null)) {
                            this.f2682u.mo246a(null, this.f2683v);
                        }
                        c0296d.f986j.m2682h();
                        return false;
                    }
                    c0296d.f992p = KeyCharacterMap.load(keyEvent == null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1;
                    c0296d.f986j.setQwertyMode(c0296d.f992p);
                    c0296d.f986j.m2682h();
                }
                c0296d.f989m = true;
                c0296d.f990n = false;
                this.f2668F = c0296d;
                return true;
            }
        }
        obj = 1;
        this.f2682u.mo252j();
        if (c0296d.f986j != null) {
        }
        if (this.f2683v == null) {
            this.f2683v = new C0579a(this);
        }
        this.f2682u.mo246a(c0296d.f986j, this.f2683v);
        c0296d.f986j.m2681g();
        if (q.onCreatePanelMenu(c0296d.f977a, c0296d.f986j)) {
            c0296d.f994r = false;
            c0296d.f986j.m2681g();
            if (c0296d.f995s != null) {
                c0296d.f986j.m2666b(c0296d.f995s);
                c0296d.f995s = null;
            }
            if (q.onPreparePanel(0, c0296d.f985i, c0296d.f986j)) {
                if (keyEvent == null) {
                }
                if (KeyCharacterMap.load(keyEvent == null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
                }
                c0296d.f992p = KeyCharacterMap.load(keyEvent == null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1;
                c0296d.f986j.setQwertyMode(c0296d.f992p);
                c0296d.f986j.m2682h();
                c0296d.f989m = true;
                c0296d.f990n = false;
                this.f2668F = c0296d;
                return true;
            }
            this.f2682u.mo246a(null, this.f2683v);
            c0296d.f986j.m2682h();
            return false;
        }
        c0296d.m1108a(null);
        this.f2682u.mo246a(null, this.f2683v);
        return false;
    }

    /* renamed from: c */
    private boolean m3479c(C0296d c0296d) {
        boolean z = true;
        if (c0296d.f985i != null) {
            c0296d.f984h = c0296d.f985i;
            return true;
        } else if (c0296d.f986j == null) {
            return false;
        } else {
            if (this.f2684w == null) {
                this.f2684w = new C0582e(this);
            }
            c0296d.f984h = (View) c0296d.m1106a(this.f2684w);
            if (c0296d.f984h == null) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: d */
    private void mo545d(int i) {
        this.f2681s = (1 << i) | this.f2681s;
        if (!this.f2680r) {
            C0227p.m873a(this.b.getDecorView(), this.f2670H);
            this.f2680r = true;
        }
    }

    /* renamed from: d */
    private boolean m3481d(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            C0296d a = m3488a(i, true);
            if (!a.f991o) {
                return m3478b(a, keyEvent);
            }
        }
        return false;
    }

    /* renamed from: e */
    private boolean m3482e(int i, KeyEvent keyEvent) {
        if (this.f2675m != null) {
            return false;
        }
        boolean b;
        C0296d a = m3488a(i, true);
        AudioManager audioManager;
        if (i != 0 || this.f2682u == null || !this.f2682u.mo247e() || ViewConfiguration.get(this.a).hasPermanentMenuKey()) {
            if (!a.f991o) {
                if (!a.f990n) {
                    if (a.f989m) {
                        if (a.f994r) {
                            a.f989m = false;
                            b = m3478b(a, keyEvent);
                        } else {
                            b = true;
                        }
                        if (b) {
                            m3472a(a, keyEvent);
                            b = true;
                            if (b) {
                                audioManager = (AudioManager) this.a.getSystemService("audio");
                                if (audioManager == null) {
                                    audioManager.playSoundEffect(0);
                                } else {
                                    Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                }
                            }
                            return b;
                        }
                    }
                }
            }
            b = a.f991o;
            m3497a(a, true);
            if (b) {
                audioManager = (AudioManager) this.a.getSystemService("audio");
                if (audioManager == null) {
                    Log.w("AppCompatDelegate", "Couldn't get audio manager");
                } else {
                    audioManager.playSoundEffect(0);
                }
            }
            return b;
        }
        if (this.f2682u.mo248f()) {
            b = this.f2682u.mo251i();
        } else if (!m2469p() && m3478b(a, keyEvent)) {
            b = this.f2682u.mo250h();
        }
        if (b) {
            audioManager = (AudioManager) this.a.getSystemService("audio");
            if (audioManager == null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return b;
        b = false;
        if (b) {
            audioManager = (AudioManager) this.a.getSystemService("audio");
            if (audioManager == null) {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            } else {
                audioManager.playSoundEffect(0);
            }
        }
        return b;
    }

    /* renamed from: h */
    private int m3483h(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return C0269j.AppCompatTheme_tooltipFrameBackground;
        }
        if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = C0269j.AppCompatTheme_viewInflaterClass;
        }
        return i;
    }

    /* renamed from: w */
    private void m3484w() {
        if (!this.f2685x) {
            this.f2686y = m3485x();
            CharSequence r = m2471r();
            if (!TextUtils.isEmpty(r)) {
                mo491b(r);
            }
            m3486y();
            m3501a(this.f2686y);
            this.f2685x = true;
            C0296d a = m3488a(0, false);
            if (!m2469p()) {
                if (a == null || a.f986j == null) {
                    mo545d(C0269j.AppCompatTheme_tooltipFrameBackground);
                }
            }
        }
    }

    /* renamed from: x */
    private ViewGroup m3485x() {
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(C0269j.AppCompatTheme);
        if (obtainStyledAttributes.hasValue(C0269j.AppCompatTheme_windowActionBar)) {
            View view;
            if (obtainStyledAttributes.getBoolean(C0269j.AppCompatTheme_windowNoTitle, false)) {
                mo493c(1);
            } else if (obtainStyledAttributes.getBoolean(C0269j.AppCompatTheme_windowActionBar, false)) {
                mo493c((int) C0269j.AppCompatTheme_tooltipFrameBackground);
            }
            if (obtainStyledAttributes.getBoolean(C0269j.AppCompatTheme_windowActionBarOverlay, false)) {
                mo493c((int) C0269j.AppCompatTheme_viewInflaterClass);
            }
            if (obtainStyledAttributes.getBoolean(C0269j.AppCompatTheme_windowActionModeOverlay, false)) {
                mo493c(10);
            }
            this.k = obtainStyledAttributes.getBoolean(C0269j.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            this.b.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.a);
            if (this.l) {
                view = (ViewGroup) from.inflate(this.j ? C0266g.abc_screen_simple_overlay_action_mode : C0266g.abc_screen_simple, null);
                if (VERSION.SDK_INT >= 21) {
                    C0227p.m872a(view, new C05762(this));
                } else {
                    ((ah) view).setOnFitSystemWindowsListener(new C05773(this));
                }
            } else if (this.k) {
                view = (ViewGroup) from.inflate(C0266g.abc_dialog_title_material, null);
                this.i = false;
                this.h = false;
            } else if (this.h) {
                TypedValue typedValue = new TypedValue();
                this.a.getTheme().resolveAttribute(C0260a.actionBarTheme, typedValue, true);
                view = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0310d(this.a, typedValue.resourceId) : this.a).inflate(C0266g.abc_screen_toolbar, null);
                this.f2682u = (ad) view.findViewById(C0265f.decor_content_parent);
                this.f2682u.setWindowCallback(m2470q());
                if (this.i) {
                    this.f2682u.mo245a(C0269j.AppCompatTheme_viewInflaterClass);
                }
                if (this.f2664B) {
                    this.f2682u.mo245a(2);
                }
                if (this.f2665C) {
                    this.f2682u.mo245a(5);
                }
            } else {
                view = null;
            }
            if (view != null) {
                if (this.f2682u == null) {
                    this.f2687z = (TextView) view.findViewById(C0265f.title);
                }
                bc.m1515b(view);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) view.findViewById(C0265f.action_bar_activity_content);
                ViewGroup viewGroup = (ViewGroup) this.b.findViewById(16908290);
                if (viewGroup != null) {
                    while (viewGroup.getChildCount() > 0) {
                        View childAt = viewGroup.getChildAt(0);
                        viewGroup.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup instanceof FrameLayout) {
                        ((FrameLayout) viewGroup).setForeground(null);
                    }
                }
                this.b.setContentView(view);
                contentFrameLayout.setAttachListener(new C05784(this));
                return view;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AppCompat does not support the current theme features: { windowActionBar: ");
            stringBuilder.append(this.h);
            stringBuilder.append(", windowActionBarOverlay: ");
            stringBuilder.append(this.i);
            stringBuilder.append(", android:windowIsFloating: ");
            stringBuilder.append(this.k);
            stringBuilder.append(", windowActionModeOverlay: ");
            stringBuilder.append(this.j);
            stringBuilder.append(", windowNoTitle: ");
            stringBuilder.append(this.l);
            stringBuilder.append(" }");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: y */
    private void m3486y() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f2686y.findViewById(16908290);
        View decorView = this.b.getDecorView();
        contentFrameLayout.m1269a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(C0269j.AppCompatTheme);
        obtainStyledAttributes.getValue(C0269j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C0269j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(C0269j.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(C0269j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(C0269j.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(C0269j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(C0269j.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(C0269j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(C0269j.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(C0269j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: z */
    private void m3487z() {
        if (this.f2685x) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: a */
    protected C0296d m3488a(int i, boolean z) {
        Object obj = this.f2667E;
        if (obj == null || obj.length <= i) {
            Object obj2 = new C0296d[(i + 1)];
            if (obj != null) {
                System.arraycopy(obj, 0, obj2, 0, obj.length);
            }
            this.f2667E = obj2;
            obj = obj2;
        }
        C0296d c0296d = obj[i];
        if (c0296d != null) {
            return c0296d;
        }
        c0296d = new C0296d(i);
        obj[i] = c0296d;
        return c0296d;
    }

    /* renamed from: a */
    C0296d m3489a(Menu menu) {
        C0296d[] c0296dArr = this.f2667E;
        int i = 0;
        int length = c0296dArr != null ? c0296dArr.length : 0;
        while (i < length) {
            C0296d c0296d = c0296dArr[i];
            if (c0296d != null && c0296d.f986j == menu) {
                return c0296d;
            }
            i++;
        }
        return null;
    }

    /* renamed from: a */
    android.support.v7.view.C0308b mo479a(android.support.v7.view.C0308b.C0307a r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/1763344271.run(Unknown Source)
*/
        /*
        r7 = this;
        r7.m3526t();
        r0 = r7.f2675m;
        if (r0 == 0) goto L_0x000c;
    L_0x0007:
        r0 = r7.f2675m;
        r0.mo176c();
    L_0x000c:
        r0 = r8 instanceof android.support.v7.app.C0753j.C0580b;
        if (r0 != 0) goto L_0x0016;
    L_0x0010:
        r0 = new android.support.v7.app.j$b;
        r0.<init>(r7, r8);
        r8 = r0;
    L_0x0016:
        r0 = r7.e;
        r1 = 0;
        if (r0 == 0) goto L_0x0028;
    L_0x001b:
        r0 = r7.m2469p();
        if (r0 != 0) goto L_0x0028;
    L_0x0021:
        r0 = r7.e;	 Catch:{ AbstractMethodError -> 0x0028 }
        r0 = r0.mo146a(r8);	 Catch:{ AbstractMethodError -> 0x0028 }
        goto L_0x0029;
    L_0x0028:
        r0 = r1;
    L_0x0029:
        if (r0 == 0) goto L_0x002f;
    L_0x002b:
        r7.f2675m = r0;
        goto L_0x016c;
    L_0x002f:
        r0 = r7.f2676n;
        r2 = 0;
        r3 = 1;
        if (r0 != 0) goto L_0x00dc;
    L_0x0035:
        r0 = r7.k;
        if (r0 == 0) goto L_0x00bd;
    L_0x0039:
        r0 = new android.util.TypedValue;
        r0.<init>();
        r4 = r7.a;
        r4 = r4.getTheme();
        r5 = android.support.v7.p020a.C0270a.C0260a.actionBarTheme;
        r4.resolveAttribute(r5, r0, r3);
        r5 = r0.resourceId;
        if (r5 == 0) goto L_0x006e;
    L_0x004d:
        r5 = r7.a;
        r5 = r5.getResources();
        r5 = r5.newTheme();
        r5.setTo(r4);
        r4 = r0.resourceId;
        r5.applyStyle(r4, r3);
        r4 = new android.support.v7.view.d;
        r6 = r7.a;
        r4.<init>(r6, r2);
        r6 = r4.getTheme();
        r6.setTo(r5);
        goto L_0x0070;
    L_0x006e:
        r4 = r7.a;
    L_0x0070:
        r5 = new android.support.v7.widget.ActionBarContextView;
        r5.<init>(r4);
        r7.f2676n = r5;
        r5 = new android.widget.PopupWindow;
        r6 = android.support.v7.p020a.C0270a.C0260a.actionModePopupWindowStyle;
        r5.<init>(r4, r1, r6);
        r7.f2677o = r5;
        r5 = r7.f2677o;
        r6 = 2;
        android.support.v4.widget.C0257j.m989a(r5, r6);
        r5 = r7.f2677o;
        r6 = r7.f2676n;
        r5.setContentView(r6);
        r5 = r7.f2677o;
        r6 = -1;
        r5.setWidth(r6);
        r5 = r4.getTheme();
        r6 = android.support.v7.p020a.C0270a.C0260a.actionBarSize;
        r5.resolveAttribute(r6, r0, r3);
        r0 = r0.data;
        r4 = r4.getResources();
        r4 = r4.getDisplayMetrics();
        r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4);
        r4 = r7.f2676n;
        r4.setContentHeight(r0);
        r0 = r7.f2677o;
        r4 = -2;
        r0.setHeight(r4);
        r0 = new android.support.v7.app.j$5;
        r0.<init>(r7);
        r7.f2678p = r0;
        goto L_0x00dc;
    L_0x00bd:
        r0 = r7.f2686y;
        r4 = android.support.v7.p020a.C0270a.C0265f.action_mode_bar_stub;
        r0 = r0.findViewById(r4);
        r0 = (android.support.v7.widget.ViewStubCompat) r0;
        if (r0 == 0) goto L_0x00dc;
    L_0x00c9:
        r4 = r7.m2467n();
        r4 = android.view.LayoutInflater.from(r4);
        r0.setLayoutInflater(r4);
        r0 = r0.m1325a();
        r0 = (android.support.v7.widget.ActionBarContextView) r0;
        r7.f2676n = r0;
    L_0x00dc:
        r0 = r7.f2676n;
        if (r0 == 0) goto L_0x016c;
    L_0x00e0:
        r7.m3526t();
        r0 = r7.f2676n;
        r0.m2756c();
        r0 = new android.support.v7.view.e;
        r4 = r7.f2676n;
        r4 = r4.getContext();
        r5 = r7.f2676n;
        r6 = r7.f2677o;
        if (r6 != 0) goto L_0x00f7;
    L_0x00f6:
        goto L_0x00f8;
    L_0x00f7:
        r3 = 0;
    L_0x00f8:
        r0.<init>(r4, r5, r8, r3);
        r3 = r0.mo173b();
        r8 = r8.mo143a(r0, r3);
        if (r8 == 0) goto L_0x016a;
    L_0x0105:
        r0.mo177d();
        r8 = r7.f2676n;
        r8.m2753a(r0);
        r7.f2675m = r0;
        r8 = r7.m3525s();
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        if (r8 == 0) goto L_0x0134;
    L_0x0117:
        r8 = r7.f2676n;
        r1 = 0;
        r8.setAlpha(r1);
        r8 = r7.f2676n;
        r8 = android.support.v4.p017g.C0227p.m878d(r8);
        r8 = r8.m907a(r0);
        r7.f2679q = r8;
        r8 = r7.f2679q;
        r0 = new android.support.v7.app.j$6;
        r0.<init>(r7);
        r8.m909a(r0);
        goto L_0x015a;
    L_0x0134:
        r8 = r7.f2676n;
        r8.setAlpha(r0);
        r8 = r7.f2676n;
        r8.setVisibility(r2);
        r8 = r7.f2676n;
        r0 = 32;
        r8.sendAccessibilityEvent(r0);
        r8 = r7.f2676n;
        r8 = r8.getParent();
        r8 = r8 instanceof android.view.View;
        if (r8 == 0) goto L_0x015a;
    L_0x014f:
        r8 = r7.f2676n;
        r8 = r8.getParent();
        r8 = (android.view.View) r8;
        android.support.v4.p017g.C0227p.m881g(r8);
    L_0x015a:
        r8 = r7.f2677o;
        if (r8 == 0) goto L_0x016c;
    L_0x015e:
        r8 = r7.b;
        r8 = r8.getDecorView();
        r0 = r7.f2678p;
        r8.post(r0);
        goto L_0x016c;
    L_0x016a:
        r7.f2675m = r1;
    L_0x016c:
        r8 = r7.f2675m;
        if (r8 == 0) goto L_0x017b;
    L_0x0170:
        r8 = r7.e;
        if (r8 == 0) goto L_0x017b;
    L_0x0174:
        r8 = r7.e;
        r0 = r7.f2675m;
        r8.mo147a(r0);
    L_0x017b:
        r8 = r7.f2675m;
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.j.a(android.support.v7.view.b$a):android.support.v7.view.b");
    }

    /* renamed from: a */
    public <T extends View> T mo480a(int i) {
        m3484w();
        return this.b.findViewById(i);
    }

    /* renamed from: a */
    View mo543a(View view, String str, Context context, AttributeSet attributeSet) {
        if (this.c instanceof Factory) {
            view = ((Factory) this.c).onCreateView(str, context, attributeSet);
            if (view != null) {
                return view;
            }
        }
        return null;
    }

    /* renamed from: a */
    void m3493a(int i, C0296d c0296d, Menu menu) {
        if (menu == null) {
            if (c0296d == null && i >= 0 && i < this.f2667E.length) {
                c0296d = this.f2667E[i];
            }
            if (c0296d != null) {
                menu = c0296d.f986j;
            }
        }
        if ((c0296d == null || c0296d.f991o) && !m2469p()) {
            this.c.onPanelClosed(i, menu);
        }
    }

    /* renamed from: a */
    void mo481a(int i, Menu menu) {
        if (i == C0269j.AppCompatTheme_tooltipFrameBackground) {
            C0287a a = mo128a();
            if (a != null) {
                a.mo163e(false);
            }
        } else if (i == 0) {
            C0296d a2 = m3488a(i, true);
            if (a2.f991o) {
                m3497a(a2, false);
            }
        }
    }

    /* renamed from: a */
    public void mo482a(Configuration configuration) {
        if (this.h && this.f2685x) {
            C0287a a = mo128a();
            if (a != null) {
                a.mo153a(configuration);
            }
        }
        C0394l.m1561a().m1583a(this.a);
        mo135i();
    }

    /* renamed from: a */
    public void mo483a(Bundle bundle) {
        if ((this.c instanceof Activity) && C0151v.m550b((Activity) this.c) != null) {
            C0287a m = m2466m();
            if (m == null) {
                this.f2671I = true;
            } else {
                m.mo159c(true);
            }
        }
    }

    /* renamed from: a */
    void m3497a(C0296d c0296d, boolean z) {
        if (z && c0296d.f977a == 0 && this.f2682u != null && this.f2682u.mo248f()) {
            m3509b(c0296d.f986j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.a.getSystemService("window");
        if (!(windowManager == null || !c0296d.f991o || c0296d.f983g == null)) {
            windowManager.removeView(c0296d.f983g);
            if (z) {
                m3493a(c0296d.f977a, c0296d, null);
            }
        }
        c0296d.f989m = false;
        c0296d.f990n = false;
        c0296d.f991o = false;
        c0296d.f984h = null;
        c0296d.f993q = true;
        if (this.f2668F == c0296d) {
            this.f2668F = null;
        }
    }

    /* renamed from: a */
    public void mo149a(C0598h c0598h) {
        m3473a(c0598h, true);
    }

    /* renamed from: a */
    public void mo484a(View view) {
        m3484w();
        ViewGroup viewGroup = (ViewGroup) this.f2686y.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.c.onContentChanged();
    }

    /* renamed from: a */
    public void mo485a(View view, LayoutParams layoutParams) {
        m3484w();
        ViewGroup viewGroup = (ViewGroup) this.f2686y.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.c.onContentChanged();
    }

    /* renamed from: a */
    void m3501a(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    boolean mo486a(int i, KeyEvent keyEvent) {
        C0287a a = mo128a();
        if (a != null && a.mo156a(i, keyEvent)) {
            return true;
        }
        if (this.f2668F == null || !m3475a(this.f2668F, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f2668F == null) {
                C0296d a2 = m3488a(0, true);
                m3478b(a2, keyEvent);
                boolean a3 = m3475a(a2, keyEvent.getKeyCode(), keyEvent, 1);
                a2.f989m = false;
                if (a3) {
                    return true;
                }
            }
            return false;
        }
        if (this.f2668F != null) {
            this.f2668F.f990n = true;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo150a(C0598h c0598h, MenuItem menuItem) {
        Callback q = m2470q();
        if (!(q == null || m2469p())) {
            C0296d a = m3489a(c0598h.mo520p());
            if (a != null) {
                return q.onMenuItemSelected(a.f977a, menuItem);
            }
        }
        return false;
    }

    /* renamed from: a */
    boolean mo487a(KeyEvent keyEvent) {
        boolean z = true;
        if (keyEvent.getKeyCode() == 82 && this.c.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? m3515c(keyCode, keyEvent) : m3512b(keyCode, keyEvent);
    }

    /* renamed from: b */
    public C0308b m3505b(C0307a c0307a) {
        if (c0307a != null) {
            if (this.f2675m != null) {
                this.f2675m.mo176c();
            }
            C0307a c0580b = new C0580b(this, c0307a);
            C0287a a = mo128a();
            if (a != null) {
                this.f2675m = a.mo182a(c0580b);
                if (!(this.f2675m == null || this.e == null)) {
                    this.e.mo147a(this.f2675m);
                }
            }
            if (this.f2675m == null) {
                this.f2675m = mo479a(c0580b);
            }
            return this.f2675m;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* renamed from: b */
    public View m3506b(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        boolean z2 = false;
        if (this.f2674L == null) {
            AppCompatViewInflater appCompatViewInflater;
            String string = this.a.obtainStyledAttributes(C0269j.AppCompatTheme).getString(C0269j.AppCompatTheme_viewInflaterClass);
            if (string != null) {
                if (!AppCompatViewInflater.class.getName().equals(string)) {
                    try {
                        this.f2674L = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    } catch (Throwable th) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Failed to instantiate custom view inflater ");
                        stringBuilder.append(string);
                        stringBuilder.append(". Falling back to default.");
                        Log.i("AppCompatDelegate", stringBuilder.toString(), th);
                        appCompatViewInflater = new AppCompatViewInflater();
                    }
                }
            }
            appCompatViewInflater = new AppCompatViewInflater();
            this.f2674L = appCompatViewInflater;
        }
        if (f2662t) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z2 = m3476a((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = false;
        }
        return this.f2674L.m1029a(view, str, context, attributeSet, z, f2662t, true, bb.m1511a());
    }

    /* renamed from: b */
    public void mo488b(int i) {
        m3484w();
        ViewGroup viewGroup = (ViewGroup) this.f2686y.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.a).inflate(i, viewGroup);
        this.c.onContentChanged();
    }

    /* renamed from: b */
    public void mo489b(Bundle bundle) {
        m3484w();
    }

    /* renamed from: b */
    void m3509b(C0598h c0598h) {
        if (!this.f2666D) {
            this.f2666D = true;
            this.f2682u.mo253k();
            Callback q = m2470q();
            if (!(q == null || m2469p())) {
                q.onPanelClosed(C0269j.AppCompatTheme_tooltipFrameBackground, c0598h);
            }
            this.f2666D = false;
        }
    }

    /* renamed from: b */
    public void mo490b(View view, LayoutParams layoutParams) {
        m3484w();
        ((ViewGroup) this.f2686y.findViewById(16908290)).addView(view, layoutParams);
        this.c.onContentChanged();
    }

    /* renamed from: b */
    void mo491b(CharSequence charSequence) {
        if (this.f2682u != null) {
            this.f2682u.setWindowTitle(charSequence);
        } else if (m2466m() != null) {
            m2466m().mo154a(charSequence);
        } else if (this.f2687z != null) {
            this.f2687z.setText(charSequence);
        }
    }

    /* renamed from: b */
    boolean m3512b(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f2669G;
            this.f2669G = false;
            C0296d a = m3488a(0, false);
            if (a != null && a.f991o) {
                if (!z) {
                    m3497a(a, true);
                }
                return true;
            } else if (m3527u()) {
                return true;
            }
        } else if (i == 82) {
            m3482e(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: b */
    boolean mo492b(int i, Menu menu) {
        if (i != C0269j.AppCompatTheme_tooltipFrameBackground) {
            return false;
        }
        C0287a a = mo128a();
        if (a != null) {
            a.mo163e(true);
        }
        return true;
    }

    /* renamed from: c */
    public boolean mo493c(int i) {
        i = m3483h(i);
        if (this.l && i == C0269j.AppCompatTheme_tooltipFrameBackground) {
            return false;
        }
        if (this.h && i == 1) {
            this.h = false;
        }
        switch (i) {
            case 1:
                m3487z();
                this.l = true;
                return true;
            case 2:
                m3487z();
                this.f2664B = true;
                return true;
            case 5:
                m3487z();
                this.f2665C = true;
                return true;
            case 10:
                m3487z();
                this.j = true;
                return true;
            case C0269j.AppCompatTheme_tooltipFrameBackground /*108*/:
                m3487z();
                this.h = true;
                return true;
            case C0269j.AppCompatTheme_viewInflaterClass /*109*/:
                m3487z();
                this.i = true;
                return true;
            default:
                return this.b.requestFeature(i);
        }
    }

    /* renamed from: c */
    boolean m3515c(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.f2669G = z;
        } else if (i == 82) {
            m3481d(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void mo133d() {
        C0287a a = mo128a();
        if (a != null) {
            a.mo161d(false);
        }
    }

    /* renamed from: e */
    public void mo494e() {
        C0287a a = mo128a();
        if (a != null) {
            a.mo161d(true);
        }
    }

    /* renamed from: e */
    void m3518e(int i) {
        m3497a(m3488a(i, true), true);
    }

    /* renamed from: f */
    public void mo495f() {
        C0287a a = mo128a();
        if (a == null || !a.mo164e()) {
            mo545d(0);
        }
    }

    /* renamed from: f */
    void m3520f(int i) {
        C0296d a = m3488a(i, true);
        if (a.f986j != null) {
            Bundle bundle = new Bundle();
            a.f986j.m2654a(bundle);
            if (bundle.size() > 0) {
                a.f995s = bundle;
            }
            a.f986j.m2681g();
            a.f986j.clear();
        }
        a.f994r = true;
        a.f993q = true;
        if ((i == C0269j.AppCompatTheme_tooltipFrameBackground || i == 0) && this.f2682u != null) {
            C0296d a2 = m3488a(0, false);
            if (a2 != null) {
                a2.f989m = false;
                m3478b(a2, null);
            }
        }
    }

    /* renamed from: g */
    int m3521g(int i) {
        Object obj;
        int i2 = 0;
        if (this.f2676n == null || !(this.f2676n.getLayoutParams() instanceof MarginLayoutParams)) {
            obj = null;
        } else {
            Object obj2;
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f2676n.getLayoutParams();
            obj = 1;
            if (this.f2676n.isShown()) {
                if (this.f2672J == null) {
                    this.f2672J = new Rect();
                    this.f2673K = new Rect();
                }
                Rect rect = this.f2672J;
                Rect rect2 = this.f2673K;
                rect.set(0, i, 0, 0);
                bc.m1513a(this.f2686y, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    if (this.f2663A == null) {
                        this.f2663A = new View(this.a);
                        this.f2663A.setBackgroundColor(this.a.getResources().getColor(C0262c.abc_input_method_navigation_guard));
                        this.f2686y.addView(this.f2663A, -1, new LayoutParams(-1, i));
                    } else {
                        LayoutParams layoutParams = this.f2663A.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f2663A.setLayoutParams(layoutParams);
                        }
                    }
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                if (this.f2663A == null) {
                    obj = null;
                }
                if (!(this.j || r3 == null)) {
                    i = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                obj = null;
            }
            if (obj2 != null) {
                this.f2676n.setLayoutParams(marginLayoutParams);
            }
        }
        if (this.f2663A != null) {
            View view = this.f2663A;
            if (obj == null) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
        return i;
    }

    /* renamed from: g */
    public void mo134g() {
        if (this.f2680r) {
            this.b.getDecorView().removeCallbacks(this.f2670H);
        }
        super.mo134g();
        if (this.f != null) {
            this.f.mo166g();
        }
    }

    /* renamed from: h */
    public void mo496h() {
        LayoutInflater from = LayoutInflater.from(this.a);
        if (from.getFactory() == null) {
            C0215e.m800b(from, this);
        } else if (!(from.getFactory2() instanceof C0753j)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* renamed from: l */
    public void mo497l() {
        m3484w();
        if (!this.h) {
            return;
        }
        if (this.f == null) {
            C0287a c0589p;
            if (this.c instanceof Activity) {
                c0589p = new C0589p((Activity) this.c, this.i);
            } else {
                if (this.c instanceof Dialog) {
                    c0589p = new C0589p((Dialog) this.c);
                }
                if (this.f != null) {
                    this.f.mo159c(this.f2671I);
                }
            }
            this.f = c0589p;
            if (this.f != null) {
                this.f.mo159c(this.f2671I);
            }
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a = mo543a(view, str, context, attributeSet);
        return a != null ? a : m3506b(view, str, context, attributeSet);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* renamed from: s */
    final boolean m3525s() {
        return this.f2685x && this.f2686y != null && C0227p.m886l(this.f2686y);
    }

    /* renamed from: t */
    void m3526t() {
        if (this.f2679q != null) {
            this.f2679q.m914b();
        }
    }

    /* renamed from: u */
    boolean m3527u() {
        if (this.f2675m != null) {
            this.f2675m.mo176c();
            return true;
        }
        C0287a a = mo128a();
        return a != null && a.mo165f();
    }

    /* renamed from: v */
    void m3528v() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/1763344271.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = r2.f2682u;
        if (r0 == 0) goto L_0x0009;
    L_0x0004:
        r0 = r2.f2682u;
        r0.mo253k();
    L_0x0009:
        r0 = r2.f2677o;
        if (r0 == 0) goto L_0x0028;
    L_0x000d:
        r0 = r2.b;
        r0 = r0.getDecorView();
        r1 = r2.f2678p;
        r0.removeCallbacks(r1);
        r0 = r2.f2677o;
        r0 = r0.isShowing();
        if (r0 == 0) goto L_0x0025;
    L_0x0020:
        r0 = r2.f2677o;	 Catch:{ IllegalArgumentException -> 0x0025 }
        r0.dismiss();	 Catch:{ IllegalArgumentException -> 0x0025 }
    L_0x0025:
        r0 = 0;
        r2.f2677o = r0;
    L_0x0028:
        r2.m3526t();
        r0 = 0;
        r0 = r2.m3488a(r0, r0);
        if (r0 == 0) goto L_0x003b;
    L_0x0032:
        r1 = r0.f986j;
        if (r1 == 0) goto L_0x003b;
    L_0x0036:
        r0 = r0.f986j;
        r0.close();
    L_0x003b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.j.v():void");
    }
}
