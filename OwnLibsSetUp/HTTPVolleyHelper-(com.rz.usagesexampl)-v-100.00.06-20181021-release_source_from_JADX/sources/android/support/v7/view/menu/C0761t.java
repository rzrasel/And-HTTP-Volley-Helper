package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.p020a.C0270a.C0263d;
import android.support.v7.p020a.C0270a.C0266g;
import android.support.v7.view.menu.C0330o.C0329a;
import android.support.v7.widget.am;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;

/* renamed from: android.support.v7.view.menu.t */
final class C0761t extends C0606m implements C0330o, OnKeyListener, OnItemClickListener, OnDismissListener {
    /* renamed from: a */
    final am f2733a;
    /* renamed from: b */
    View f2734b;
    /* renamed from: c */
    private final Context f2735c;
    /* renamed from: d */
    private final C0598h f2736d;
    /* renamed from: e */
    private final C0324g f2737e;
    /* renamed from: f */
    private final boolean f2738f;
    /* renamed from: g */
    private final int f2739g;
    /* renamed from: h */
    private final int f2740h;
    /* renamed from: i */
    private final int f2741i;
    /* renamed from: j */
    private final OnGlobalLayoutListener f2742j = new C03351(this);
    /* renamed from: k */
    private final OnAttachStateChangeListener f2743k = new C03362(this);
    /* renamed from: l */
    private OnDismissListener f2744l;
    /* renamed from: m */
    private View f2745m;
    /* renamed from: n */
    private C0329a f2746n;
    /* renamed from: o */
    private ViewTreeObserver f2747o;
    /* renamed from: p */
    private boolean f2748p;
    /* renamed from: q */
    private boolean f2749q;
    /* renamed from: r */
    private int f2750r;
    /* renamed from: s */
    private int f2751s = 0;
    /* renamed from: t */
    private boolean f2752t;

    /* renamed from: android.support.v7.view.menu.t$1 */
    class C03351 implements OnGlobalLayoutListener {
        /* renamed from: a */
        final /* synthetic */ C0761t f1114a;

        C03351(C0761t c0761t) {
            this.f1114a = c0761t;
        }

        public void onGlobalLayout() {
            if (this.f1114a.mo288d() && !this.f1114a.f2733a.m2875g()) {
                View view = this.f1114a.f2734b;
                if (view != null) {
                    if (view.isShown()) {
                        this.f1114a.f2733a.mo286a();
                        return;
                    }
                }
                this.f1114a.mo287c();
            }
        }
    }

    /* renamed from: android.support.v7.view.menu.t$2 */
    class C03362 implements OnAttachStateChangeListener {
        /* renamed from: a */
        final /* synthetic */ C0761t f1115a;

        C03362(C0761t c0761t) {
            this.f1115a = c0761t;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            if (this.f1115a.f2747o != null) {
                if (!this.f1115a.f2747o.isAlive()) {
                    this.f1115a.f2747o = view.getViewTreeObserver();
                }
                this.f1115a.f2747o.removeGlobalOnLayoutListener(this.f1115a.f2742j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public C0761t(Context context, C0598h c0598h, View view, int i, int i2, boolean z) {
        this.f2735c = context;
        this.f2736d = c0598h;
        this.f2738f = z;
        this.f2737e = new C0324g(c0598h, LayoutInflater.from(context), this.f2738f);
        this.f2740h = i;
        this.f2741i = i2;
        Resources resources = context.getResources();
        this.f2739g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0263d.abc_config_prefDialogWidth));
        this.f2745m = view;
        this.f2733a = new am(this.f2735c, null, this.f2740h, this.f2741i);
        c0598h.m2658a((C0330o) this, context);
    }

    /* renamed from: h */
    private boolean m3578h() {
        if (mo288d()) {
            return true;
        }
        if (!this.f2748p) {
            if (this.f2745m != null) {
                this.f2734b = this.f2745m;
                this.f2733a.m2862a((OnDismissListener) this);
                this.f2733a.m2860a((OnItemClickListener) this);
                this.f2733a.m2863a(true);
                View view = this.f2734b;
                Object obj = this.f2747o == null ? 1 : null;
                this.f2747o = view.getViewTreeObserver();
                if (obj != null) {
                    this.f2747o.addOnGlobalLayoutListener(this.f2742j);
                }
                view.addOnAttachStateChangeListener(this.f2743k);
                this.f2733a.m2865b(view);
                this.f2733a.m2872e(this.f2751s);
                if (!this.f2749q) {
                    this.f2750r = C0606m.m2734a(this.f2737e, null, this.f2735c, this.f2739g);
                    this.f2749q = true;
                }
                this.f2733a.m2874g(this.f2750r);
                this.f2733a.m2877h(2);
                this.f2733a.m2858a(m2750g());
                this.f2733a.mo286a();
                ViewGroup e = this.f2733a.mo289e();
                e.setOnKeyListener(this);
                if (this.f2752t && this.f2736d.m2687m() != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f2735c).inflate(C0266g.abc_popup_menu_header_item_layout, e, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.f2736d.m2687m());
                    }
                    frameLayout.setEnabled(false);
                    e.addHeaderView(frameLayout, null, false);
                }
                this.f2733a.mo531a(this.f2737e);
                this.f2733a.mo286a();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo286a() {
        if (!m3578h()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    /* renamed from: a */
    public void mo500a(int i) {
        this.f2751s = i;
    }

    /* renamed from: a */
    public void mo501a(C0598h c0598h) {
    }

    /* renamed from: a */
    public void mo221a(C0598h c0598h, boolean z) {
        if (c0598h == this.f2736d) {
            mo287c();
            if (this.f2746n != null) {
                this.f2746n.mo140a(c0598h, z);
            }
        }
    }

    /* renamed from: a */
    public void mo222a(C0329a c0329a) {
        this.f2746n = c0329a;
    }

    /* renamed from: a */
    public void mo502a(View view) {
        this.f2745m = view;
    }

    /* renamed from: a */
    public void mo503a(OnDismissListener onDismissListener) {
        this.f2744l = onDismissListener;
    }

    /* renamed from: a */
    public void mo504a(boolean z) {
        this.f2737e.m1201a(z);
    }

    /* renamed from: a */
    public boolean mo224a(C0762u c0762u) {
        if (c0762u.hasVisibleItems()) {
            C0328n c0328n = new C0328n(this.f2735c, c0762u, this.f2734b, this.f2738f, this.f2740h, this.f2741i);
            c0328n.m1210a(this.f2746n);
            c0328n.m1213a(C0606m.m2736b((C0598h) c0762u));
            c0328n.m1209a(this.f2751s);
            c0328n.m1212a(this.f2744l);
            this.f2744l = null;
            this.f2736d.m2661a(false);
            if (c0328n.m1214a(this.f2733a.m2880j(), this.f2733a.m2881k())) {
                if (this.f2746n != null) {
                    this.f2746n.mo141a(c0762u);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo505b(int i) {
        this.f2733a.m2868c(i);
    }

    /* renamed from: b */
    public void mo225b(boolean z) {
        this.f2749q = false;
        if (this.f2737e != null) {
            this.f2737e.notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public boolean mo226b() {
        return false;
    }

    /* renamed from: c */
    public void mo287c() {
        if (mo288d()) {
            this.f2733a.mo287c();
        }
    }

    /* renamed from: c */
    public void mo506c(int i) {
        this.f2733a.m2869d(i);
    }

    /* renamed from: c */
    public void mo507c(boolean z) {
        this.f2752t = z;
    }

    /* renamed from: d */
    public boolean mo288d() {
        return !this.f2748p && this.f2733a.mo288d();
    }

    /* renamed from: e */
    public ListView mo289e() {
        return this.f2733a.mo289e();
    }

    public void onDismiss() {
        this.f2748p = true;
        this.f2736d.close();
        if (this.f2747o != null) {
            if (!this.f2747o.isAlive()) {
                this.f2747o = this.f2734b.getViewTreeObserver();
            }
            this.f2747o.removeGlobalOnLayoutListener(this.f2742j);
            this.f2747o = null;
        }
        this.f2734b.removeOnAttachStateChangeListener(this.f2743k);
        if (this.f2744l != null) {
            this.f2744l.onDismiss();
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        mo287c();
        return true;
    }
}
