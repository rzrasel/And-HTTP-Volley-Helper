package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.p010b.p011a.C0155a;
import android.support.v4.p017g.C0212c;
import android.support.v4.p017g.C0212c.C0210a;
import android.support.v7.p020a.C0270a.C0260a;
import android.support.v7.p020a.C0270a.C0266g;
import android.support.v7.view.C0306a;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.ActionMenuItemView.C0317b;
import android.support.v7.view.menu.C0328n;
import android.support.v7.view.menu.C0330o.C0329a;
import android.support.v7.view.menu.C0332p;
import android.support.v7.view.menu.C0334s;
import android.support.v7.view.menu.C0594b;
import android.support.v7.view.menu.C0598h;
import android.support.v7.view.menu.C0601j;
import android.support.v7.view.menu.C0762u;
import android.support.v7.view.menu.p.a;
import android.support.v7.widget.ActionMenuView.C0343a;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;

/* renamed from: android.support.v7.widget.d */
class C0765d extends C0594b implements C0210a {
    /* renamed from: A */
    private C0620b f2766A;
    /* renamed from: g */
    C0764d f2767g;
    /* renamed from: h */
    C0622e f2768h;
    /* renamed from: i */
    C0619a f2769i;
    /* renamed from: j */
    C0383c f2770j;
    /* renamed from: k */
    final C0623f f2771k = new C0623f(this);
    /* renamed from: l */
    int f2772l;
    /* renamed from: m */
    private Drawable f2773m;
    /* renamed from: n */
    private boolean f2774n;
    /* renamed from: o */
    private boolean f2775o;
    /* renamed from: p */
    private boolean f2776p;
    /* renamed from: q */
    private int f2777q;
    /* renamed from: r */
    private int f2778r;
    /* renamed from: s */
    private int f2779s;
    /* renamed from: t */
    private boolean f2780t;
    /* renamed from: u */
    private boolean f2781u;
    /* renamed from: v */
    private boolean f2782v;
    /* renamed from: w */
    private boolean f2783w;
    /* renamed from: x */
    private int f2784x;
    /* renamed from: y */
    private final SparseBooleanArray f2785y = new SparseBooleanArray();
    /* renamed from: z */
    private View f2786z;

    /* renamed from: android.support.v7.widget.d$c */
    private class C0383c implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0765d f1375a;
        /* renamed from: b */
        private C0622e f1376b;

        public C0383c(C0765d c0765d, C0622e c0622e) {
            this.f1375a = c0765d;
            this.f1376b = c0622e;
        }

        public void run() {
            if (this.f1375a.c != null) {
                this.f1375a.c.m2680f();
            }
            View view = (View) this.f1375a.f;
            if (!(view == null || view.getWindowToken() == null || !this.f1376b.m1216c())) {
                this.f1375a.f2768h = this.f1376b;
            }
            this.f1375a.f2770j = null;
        }
    }

    /* renamed from: android.support.v7.widget.d$a */
    private class C0619a extends C0328n {
        /* renamed from: a */
        final /* synthetic */ C0765d f2387a;

        public C0619a(C0765d c0765d, Context context, C0762u c0762u, View view) {
            this.f2387a = c0765d;
            super(context, c0762u, view, false, C0260a.actionOverflowMenuStyle);
            if (!((C0601j) c0762u.getItem()).m2722j()) {
                m1211a(c0765d.f2767g == null ? (View) c0765d.f : c0765d.f2767g);
            }
            m1210a(c0765d.f2771k);
        }

        /* renamed from: e */
        protected void mo330e() {
            this.f2387a.f2769i = null;
            this.f2387a.f2772l = 0;
            super.mo330e();
        }
    }

    /* renamed from: android.support.v7.widget.d$b */
    private class C0620b extends C0317b {
        /* renamed from: a */
        final /* synthetic */ C0765d f2388a;

        C0620b(C0765d c0765d) {
            this.f2388a = c0765d;
        }

        /* renamed from: a */
        public C0334s mo331a() {
            return this.f2388a.f2769i != null ? this.f2388a.f2769i.m1215b() : null;
        }
    }

    /* renamed from: android.support.v7.widget.d$e */
    private class C0622e extends C0328n {
        /* renamed from: a */
        final /* synthetic */ C0765d f2391a;

        public C0622e(C0765d c0765d, Context context, C0598h c0598h, View view, boolean z) {
            this.f2391a = c0765d;
            super(context, c0598h, view, z, C0260a.actionOverflowMenuStyle);
            m1209a(8388613);
            m1210a(c0765d.f2771k);
        }

        /* renamed from: e */
        protected void mo330e() {
            if (this.f2391a.c != null) {
                this.f2391a.c.close();
            }
            this.f2391a.f2768h = null;
            super.mo330e();
        }
    }

    /* renamed from: android.support.v7.widget.d$f */
    private class C0623f implements C0329a {
        /* renamed from: a */
        final /* synthetic */ C0765d f2392a;

        C0623f(C0765d c0765d) {
            this.f2392a = c0765d;
        }

        /* renamed from: a */
        public void mo140a(C0598h c0598h, boolean z) {
            if (c0598h instanceof C0762u) {
                c0598h.mo520p().m2661a(false);
            }
            C0329a a = this.f2392a.m2604a();
            if (a != null) {
                a.mo140a(c0598h, z);
            }
        }

        /* renamed from: a */
        public boolean mo141a(C0598h c0598h) {
            boolean z = false;
            if (c0598h == null) {
                return false;
            }
            this.f2392a.f2772l = ((C0762u) c0598h).getItem().getItemId();
            C0329a a = this.f2392a.m2604a();
            if (a != null) {
                z = a.mo141a(c0598h);
            }
            return z;
        }
    }

    /* renamed from: android.support.v7.widget.d$d */
    private class C0764d extends C0632q implements C0343a {
        /* renamed from: a */
        final /* synthetic */ C0765d f2764a;
        /* renamed from: b */
        private final float[] f2765b = new float[2];

        public C0764d(final C0765d c0765d, Context context) {
            this.f2764a = c0765d;
            super(context, null, C0260a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            ay.m1497a(this, getContentDescription());
            setOnTouchListener(new ai(this, this) {
                /* renamed from: b */
                final /* synthetic */ C0764d f2390b;

                /* renamed from: a */
                public C0334s mo190a() {
                    return this.f2390b.f2764a.f2768h == null ? null : this.f2390b.f2764a.f2768h.m1215b();
                }

                /* renamed from: b */
                public boolean mo191b() {
                    this.f2390b.f2764a.m3644d();
                    return true;
                }

                /* renamed from: c */
                public boolean mo332c() {
                    if (this.f2390b.f2764a.f2770j != null) {
                        return false;
                    }
                    this.f2390b.f2764a.m3645e();
                    return true;
                }
            });
        }

        /* renamed from: c */
        public boolean mo498c() {
            return false;
        }

        /* renamed from: d */
        public boolean mo499d() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            this.f2764a.m3644d();
            return true;
        }

        protected boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                i2 = getWidth();
                i4 = getHeight();
                int max = Math.max(i2, i4) / 2;
                i2 = (i2 + (getPaddingLeft() - getPaddingRight())) / 2;
                i4 = (i4 + (getPaddingTop() - getPaddingBottom())) / 2;
                C0155a.m561a(background, i2 - max, i4 - max, i2 + max, i4 + max);
            }
            return frame;
        }
    }

    public C0765d(Context context) {
        super(context, C0266g.abc_action_menu_layout, C0266g.abc_action_menu_item_layout);
    }

    /* renamed from: a */
    private View m3621a(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof a) && ((a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0332p mo525a(ViewGroup viewGroup) {
        C0332p c0332p = this.f;
        C0332p a = super.mo525a(viewGroup);
        if (c0332p != a) {
            ((ActionMenuView) a).setPresenter(this);
        }
        return a;
    }

    /* renamed from: a */
    public View mo526a(C0601j c0601j, View view, ViewGroup viewGroup) {
        View actionView = c0601j.getActionView();
        if (actionView == null || c0601j.m2726n()) {
            actionView = super.mo526a(c0601j, view, viewGroup);
        }
        actionView.setVisibility(c0601j.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.m2787a(layoutParams));
        }
        return actionView;
    }

    /* renamed from: a */
    public void mo220a(Context context, C0598h c0598h) {
        super.mo220a(context, c0598h);
        Resources resources = context.getResources();
        C0306a a = C0306a.m1140a(context);
        if (!this.f2776p) {
            this.f2775o = a.m1142b();
        }
        if (!this.f2782v) {
            this.f2777q = a.m1143c();
        }
        if (!this.f2780t) {
            this.f2779s = a.m1141a();
        }
        int i = this.f2777q;
        if (this.f2775o) {
            if (this.f2767g == null) {
                this.f2767g = new C0764d(this, this.a);
                if (this.f2774n) {
                    this.f2767g.setImageDrawable(this.f2773m);
                    this.f2773m = null;
                    this.f2774n = false;
                }
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
                this.f2767g.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f2767g.getMeasuredWidth();
        } else {
            this.f2767g = null;
        }
        this.f2778r = i;
        this.f2784x = (int) (resources.getDisplayMetrics().density * 56.0f);
        this.f2786z = null;
    }

    /* renamed from: a */
    public void m3630a(Configuration configuration) {
        if (!this.f2780t) {
            this.f2779s = C0306a.m1140a(this.b).m1141a();
        }
        if (this.c != null) {
            this.c.m2669b(true);
        }
    }

    /* renamed from: a */
    public void m3631a(Drawable drawable) {
        if (this.f2767g != null) {
            this.f2767g.setImageDrawable(drawable);
            return;
        }
        this.f2774n = true;
        this.f2773m = drawable;
    }

    /* renamed from: a */
    public void mo221a(C0598h c0598h, boolean z) {
        m3646f();
        super.mo221a(c0598h, z);
    }

    /* renamed from: a */
    public void mo527a(C0601j c0601j, a aVar) {
        aVar.mo194a(c0601j, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f);
        if (this.f2766A == null) {
            this.f2766A = new C0620b(this);
        }
        actionMenuItemView.setPopupCallback(this.f2766A);
    }

    /* renamed from: a */
    public void m3634a(ActionMenuView actionMenuView) {
        this.f = actionMenuView;
        actionMenuView.mo192a(this.c);
    }

    /* renamed from: a */
    public void mo528a(boolean z) {
        if (z) {
            super.mo224a(null);
        } else if (this.c != null) {
            this.c.m2661a(false);
        }
    }

    /* renamed from: a */
    public boolean mo529a(int i, C0601j c0601j) {
        return c0601j.m2722j();
    }

    /* renamed from: a */
    public boolean mo224a(C0762u c0762u) {
        boolean z = false;
        if (!c0762u.hasVisibleItems()) {
            return false;
        }
        C0762u c0762u2 = c0762u;
        while (c0762u2.m3604s() != this.c) {
            c0762u2 = (C0762u) c0762u2.m3604s();
        }
        View a = m3621a(c0762u2.getItem());
        if (a == null) {
            return false;
        }
        this.f2772l = c0762u.getItem().getItemId();
        int size = c0762u.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0762u.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
        }
        this.f2769i = new C0619a(this, this.b, c0762u, a);
        this.f2769i.m1213a(z);
        this.f2769i.m1208a();
        super.mo224a(c0762u);
        return true;
    }

    /* renamed from: a */
    public boolean mo530a(ViewGroup viewGroup, int i) {
        return viewGroup.getChildAt(i) == this.f2767g ? false : super.mo530a(viewGroup, i);
    }

    /* renamed from: b */
    public void mo225b(boolean z) {
        ArrayList k;
        int size;
        super.mo225b(z);
        ((View) this.f).requestLayout();
        int i = 0;
        if (this.c != null) {
            k = this.c.m2685k();
            size = k.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0212c a = ((C0601j) k.get(i2)).mo199a();
                if (a != null) {
                    a.m788a((C0210a) this);
                }
            }
        }
        k = this.c != null ? this.c.m2686l() : null;
        if (this.f2775o && k != null) {
            size = k.size();
            if (size == 1) {
                i = ((C0601j) k.get(0)).isActionViewExpanded() ^ 1;
            } else if (size > 0) {
                i = 1;
            }
        }
        if (i != 0) {
            if (this.f2767g == null) {
                this.f2767g = new C0764d(this, this.a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f2767g.getParent();
            if (viewGroup != this.f) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f2767g);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f;
                actionMenuView.addView(this.f2767g, actionMenuView.m2796c());
            }
        } else if (this.f2767g != null && this.f2767g.getParent() == this.f) {
            ((ViewGroup) this.f).removeView(this.f2767g);
        }
        ((ActionMenuView) this.f).setOverflowReserved(this.f2775o);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public boolean mo226b() {
        /*
        r19 = this;
        r0 = r19;
        r1 = r0.c;
        r2 = 0;
        if (r1 == 0) goto L_0x0012;
    L_0x0007:
        r1 = r0.c;
        r1 = r1.m2683i();
        r3 = r1.size();
        goto L_0x0014;
    L_0x0012:
        r1 = 0;
        r3 = 0;
    L_0x0014:
        r4 = r0.f2779s;
        r5 = r0.f2778r;
        r6 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2);
        r7 = r0.f;
        r7 = (android.view.ViewGroup) r7;
        r11 = r4;
        r4 = 0;
        r8 = 0;
        r9 = 0;
        r10 = 0;
    L_0x0025:
        if (r4 >= r3) goto L_0x004e;
    L_0x0027:
        r13 = r1.get(r4);
        r13 = (android.support.v7.view.menu.C0601j) r13;
        r14 = r13.m2724l();
        if (r14 == 0) goto L_0x0036;
    L_0x0033:
        r8 = r8 + 1;
        goto L_0x0040;
    L_0x0036:
        r14 = r13.m2723k();
        if (r14 == 0) goto L_0x003f;
    L_0x003c:
        r10 = r10 + 1;
        goto L_0x0040;
    L_0x003f:
        r9 = 1;
    L_0x0040:
        r12 = r0.f2783w;
        if (r12 == 0) goto L_0x004b;
    L_0x0044:
        r12 = r13.isActionViewExpanded();
        if (r12 == 0) goto L_0x004b;
    L_0x004a:
        r11 = 0;
    L_0x004b:
        r4 = r4 + 1;
        goto L_0x0025;
    L_0x004e:
        r4 = r0.f2775o;
        if (r4 == 0) goto L_0x0059;
    L_0x0052:
        if (r9 != 0) goto L_0x0057;
    L_0x0054:
        r10 = r10 + r8;
        if (r10 <= r11) goto L_0x0059;
    L_0x0057:
        r11 = r11 + -1;
    L_0x0059:
        r11 = r11 - r8;
        r4 = r0.f2785y;
        r4.clear();
        r8 = r0.f2781u;
        if (r8 == 0) goto L_0x0070;
    L_0x0063:
        r8 = r0.f2784x;
        r8 = r5 / r8;
        r9 = r0.f2784x;
        r9 = r5 % r9;
        r10 = r0.f2784x;
        r9 = r9 / r8;
        r9 = r9 + r10;
        goto L_0x0072;
    L_0x0070:
        r8 = 0;
        r9 = 0;
    L_0x0072:
        r10 = r5;
        r5 = 0;
        r13 = 0;
    L_0x0075:
        if (r5 >= r3) goto L_0x0160;
    L_0x0077:
        r14 = r1.get(r5);
        r14 = (android.support.v7.view.menu.C0601j) r14;
        r15 = r14.m2724l();
        if (r15 == 0) goto L_0x00ba;
    L_0x0083:
        r15 = r0.f2786z;
        r15 = r0.mo526a(r14, r15, r7);
        r12 = r0.f2786z;
        if (r12 != 0) goto L_0x008f;
    L_0x008d:
        r0.f2786z = r15;
    L_0x008f:
        r12 = r0.f2781u;
        if (r12 == 0) goto L_0x0099;
    L_0x0093:
        r12 = android.support.v7.widget.ActionMenuView.m2784a(r15, r9, r8, r6, r2);
        r8 = r8 - r12;
        goto L_0x009c;
    L_0x0099:
        r15.measure(r6, r6);
    L_0x009c:
        r12 = r15.getMeasuredWidth();
        r10 = r10 - r12;
        if (r13 != 0) goto L_0x00a4;
    L_0x00a3:
        goto L_0x00a5;
    L_0x00a4:
        r12 = r13;
    L_0x00a5:
        r13 = r14.getGroupId();
        if (r13 == 0) goto L_0x00b0;
    L_0x00ab:
        r15 = 1;
        r4.put(r13, r15);
        goto L_0x00b1;
    L_0x00b0:
        r15 = 1;
    L_0x00b1:
        r14.m2715d(r15);
        r17 = r3;
        r13 = r12;
    L_0x00b7:
        r0 = 0;
        goto L_0x0157;
    L_0x00ba:
        r12 = r14.m2723k();
        if (r12 == 0) goto L_0x0151;
    L_0x00c0:
        r12 = r14.getGroupId();
        r15 = r4.get(r12);
        if (r11 > 0) goto L_0x00cc;
    L_0x00ca:
        if (r15 == 0) goto L_0x00d6;
    L_0x00cc:
        if (r10 <= 0) goto L_0x00d6;
    L_0x00ce:
        r2 = r0.f2781u;
        if (r2 == 0) goto L_0x00d4;
    L_0x00d2:
        if (r8 <= 0) goto L_0x00d6;
    L_0x00d4:
        r2 = 1;
        goto L_0x00d7;
    L_0x00d6:
        r2 = 0;
    L_0x00d7:
        if (r2 == 0) goto L_0x0115;
    L_0x00d9:
        r16 = r2;
        r2 = r0.f2786z;
        r2 = r0.mo526a(r14, r2, r7);
        r17 = r3;
        r3 = r0.f2786z;
        if (r3 != 0) goto L_0x00e9;
    L_0x00e7:
        r0.f2786z = r2;
    L_0x00e9:
        r3 = r0.f2781u;
        if (r3 == 0) goto L_0x00f9;
    L_0x00ed:
        r3 = 0;
        r18 = android.support.v7.widget.ActionMenuView.m2784a(r2, r9, r8, r6, r3);
        r8 = r8 - r18;
        if (r18 != 0) goto L_0x00fc;
    L_0x00f6:
        r16 = 0;
        goto L_0x00fc;
    L_0x00f9:
        r2.measure(r6, r6);
    L_0x00fc:
        r2 = r2.getMeasuredWidth();
        r10 = r10 - r2;
        if (r13 != 0) goto L_0x0104;
    L_0x0103:
        r13 = r2;
    L_0x0104:
        r2 = r0.f2781u;
        if (r2 == 0) goto L_0x0110;
    L_0x0108:
        if (r10 < 0) goto L_0x010c;
    L_0x010a:
        r2 = 1;
        goto L_0x010d;
    L_0x010c:
        r2 = 0;
    L_0x010d:
        r2 = r16 & r2;
        goto L_0x0119;
    L_0x0110:
        r2 = r10 + r13;
        if (r2 <= 0) goto L_0x010c;
    L_0x0114:
        goto L_0x010a;
    L_0x0115:
        r16 = r2;
        r17 = r3;
    L_0x0119:
        if (r2 == 0) goto L_0x0122;
    L_0x011b:
        if (r12 == 0) goto L_0x0122;
    L_0x011d:
        r3 = 1;
        r4.put(r12, r3);
        goto L_0x0148;
    L_0x0122:
        if (r15 == 0) goto L_0x0148;
    L_0x0124:
        r3 = 0;
        r4.put(r12, r3);
        r3 = 0;
    L_0x0129:
        if (r3 >= r5) goto L_0x0148;
    L_0x012b:
        r15 = r1.get(r3);
        r15 = (android.support.v7.view.menu.C0601j) r15;
        r0 = r15.getGroupId();
        if (r0 != r12) goto L_0x0143;
    L_0x0137:
        r0 = r15.m2722j();
        if (r0 == 0) goto L_0x013f;
    L_0x013d:
        r11 = r11 + 1;
    L_0x013f:
        r0 = 0;
        r15.m2715d(r0);
    L_0x0143:
        r3 = r3 + 1;
        r0 = r19;
        goto L_0x0129;
    L_0x0148:
        if (r2 == 0) goto L_0x014c;
    L_0x014a:
        r11 = r11 + -1;
    L_0x014c:
        r14.m2715d(r2);
        goto L_0x00b7;
    L_0x0151:
        r17 = r3;
        r0 = 0;
        r14.m2715d(r0);
    L_0x0157:
        r5 = r5 + 1;
        r3 = r17;
        r0 = r19;
        r2 = 0;
        goto L_0x0075;
    L_0x0160:
        r2 = 1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.d.b():boolean");
    }

    /* renamed from: c */
    public Drawable m3641c() {
        return this.f2767g != null ? this.f2767g.getDrawable() : this.f2774n ? this.f2773m : null;
    }

    /* renamed from: c */
    public void m3642c(boolean z) {
        this.f2775o = z;
        this.f2776p = true;
    }

    /* renamed from: d */
    public void m3643d(boolean z) {
        this.f2783w = z;
    }

    /* renamed from: d */
    public boolean m3644d() {
        if (!this.f2775o || m3648h() || this.c == null || this.f == null || this.f2770j != null || this.c.m2686l().isEmpty()) {
            return false;
        }
        this.f2770j = new C0383c(this, new C0622e(this, this.b, this.c, this.f2767g, true));
        ((View) this.f).post(this.f2770j);
        super.mo224a(null);
        return true;
    }

    /* renamed from: e */
    public boolean m3645e() {
        if (this.f2770j == null || this.f == null) {
            C0328n c0328n = this.f2768h;
            if (c0328n == null) {
                return false;
            }
            c0328n.m1217d();
            return true;
        }
        ((View) this.f).removeCallbacks(this.f2770j);
        this.f2770j = null;
        return true;
    }

    /* renamed from: f */
    public boolean m3646f() {
        return m3645e() | m3647g();
    }

    /* renamed from: g */
    public boolean m3647g() {
        if (this.f2769i == null) {
            return false;
        }
        this.f2769i.m1217d();
        return true;
    }

    /* renamed from: h */
    public boolean m3648h() {
        return this.f2768h != null && this.f2768h.m1219f();
    }

    /* renamed from: i */
    public boolean m3649i() {
        if (this.f2770j == null) {
            if (!m3648h()) {
                return false;
            }
        }
        return true;
    }
}
