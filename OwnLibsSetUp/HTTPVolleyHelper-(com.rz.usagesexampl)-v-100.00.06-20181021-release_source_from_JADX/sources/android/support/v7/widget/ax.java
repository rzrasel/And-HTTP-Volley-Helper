package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.p017g.C0227p;
import android.support.v4.p017g.C0234s;
import android.support.v4.p017g.C0565u;
import android.support.v7.p020a.C0270a.C0260a;
import android.support.v7.p020a.C0270a.C0264e;
import android.support.v7.p020a.C0270a.C0265f;
import android.support.v7.p020a.C0270a.C0267h;
import android.support.v7.p020a.C0270a.C0269j;
import android.support.v7.p021b.p022a.C0303b;
import android.support.v7.view.menu.C0330o.C0329a;
import android.support.v7.view.menu.C0593a;
import android.support.v7.view.menu.C0598h;
import android.support.v7.view.menu.C0598h.C0325a;
import android.support.v7.widget.Toolbar.C0613b;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;

public class ax implements ae {
    /* renamed from: a */
    Toolbar f2370a;
    /* renamed from: b */
    CharSequence f2371b;
    /* renamed from: c */
    Callback f2372c;
    /* renamed from: d */
    boolean f2373d;
    /* renamed from: e */
    private int f2374e;
    /* renamed from: f */
    private View f2375f;
    /* renamed from: g */
    private View f2376g;
    /* renamed from: h */
    private Drawable f2377h;
    /* renamed from: i */
    private Drawable f2378i;
    /* renamed from: j */
    private Drawable f2379j;
    /* renamed from: k */
    private boolean f2380k;
    /* renamed from: l */
    private CharSequence f2381l;
    /* renamed from: m */
    private CharSequence f2382m;
    /* renamed from: n */
    private C0765d f2383n;
    /* renamed from: o */
    private int f2384o;
    /* renamed from: p */
    private int f2385p;
    /* renamed from: q */
    private Drawable f2386q;

    /* renamed from: android.support.v7.widget.ax$1 */
    class C03791 implements OnClickListener {
        /* renamed from: a */
        final C0593a f1351a = new C0593a(this.f1352b.f2370a.getContext(), 0, 16908332, 0, 0, this.f1352b.f2371b);
        /* renamed from: b */
        final /* synthetic */ ax f1352b;

        C03791(ax axVar) {
            this.f1352b = axVar;
        }

        public void onClick(View view) {
            if (this.f1352b.f2372c != null && this.f1352b.f2373d) {
                this.f1352b.f2372c.onMenuItemSelected(0, this.f1351a);
            }
        }
    }

    public ax(Toolbar toolbar, boolean z) {
        this(toolbar, z, C0267h.abc_action_bar_up_description, C0264e.abc_ic_ab_back_material);
    }

    public ax(Toolbar toolbar, boolean z, int i, int i2) {
        this.f2384o = 0;
        this.f2385p = 0;
        this.f2370a = toolbar;
        this.f2371b = toolbar.getTitle();
        this.f2381l = toolbar.getSubtitle();
        this.f2380k = this.f2371b != null;
        this.f2379j = toolbar.getNavigationIcon();
        aw a = aw.m1478a(toolbar.getContext(), null, C0269j.ActionBar, C0260a.actionBarStyle, 0);
        this.f2386q = a.m1482a(C0269j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence c = a.m1488c(C0269j.ActionBar_title);
            if (!TextUtils.isEmpty(c)) {
                m2906b(c);
            }
            c = a.m1488c(C0269j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(c)) {
                m2910c(c);
            }
            Drawable a2 = a.m1482a(C0269j.ActionBar_logo);
            if (a2 != null) {
                m2905b(a2);
            }
            a2 = a.m1482a(C0269j.ActionBar_icon);
            if (a2 != null) {
                mo303a(a2);
            }
            if (this.f2379j == null && this.f2386q != null) {
                m2909c(this.f2386q);
            }
            mo313c(a.m1480a(C0269j.ActionBar_displayOptions, 0));
            int g = a.m1495g(C0269j.ActionBar_customNavigationLayout, 0);
            if (g != 0) {
                m2899a(LayoutInflater.from(this.f2370a.getContext()).inflate(g, this.f2370a, false));
                mo313c(this.f2374e | 16);
            }
            g = a.m1493f(C0269j.ActionBar_height, 0);
            if (g > 0) {
                LayoutParams layoutParams = this.f2370a.getLayoutParams();
                layoutParams.height = g;
                this.f2370a.setLayoutParams(layoutParams);
            }
            g = a.m1489d(C0269j.ActionBar_contentInsetStart, -1);
            int d = a.m1489d(C0269j.ActionBar_contentInsetEnd, -1);
            if (g >= 0 || d >= 0) {
                this.f2370a.m1307a(Math.max(g, 0), Math.max(d, 0));
            }
            g = a.m1495g(C0269j.ActionBar_titleTextStyle, 0);
            if (g != 0) {
                this.f2370a.m1308a(this.f2370a.getContext(), g);
            }
            g = a.m1495g(C0269j.ActionBar_subtitleTextStyle, 0);
            if (g != 0) {
                this.f2370a.m1312b(this.f2370a.getContext(), g);
            }
            g = a.m1495g(C0269j.ActionBar_popupTheme, 0);
            if (g != 0) {
                this.f2370a.setPopupTheme(g);
            }
        } else {
            this.f2374e = m2888r();
        }
        a.m1483a();
        m2916e(i);
        this.f2382m = this.f2370a.getNavigationContentDescription();
        this.f2370a.setNavigationOnClickListener(new C03791(this));
    }

    /* renamed from: e */
    private void m2887e(CharSequence charSequence) {
        this.f2371b = charSequence;
        if ((this.f2374e & 8) != 0) {
            this.f2370a.setTitle(charSequence);
        }
    }

    /* renamed from: r */
    private int m2888r() {
        if (this.f2370a.getNavigationIcon() == null) {
            return 11;
        }
        this.f2386q = this.f2370a.getNavigationIcon();
        return 15;
    }

    /* renamed from: s */
    private void m2889s() {
        Drawable drawable = (this.f2374e & 2) != 0 ? ((this.f2374e & 1) == 0 || this.f2378i == null) ? this.f2377h : this.f2378i : null;
        this.f2370a.setLogo(drawable);
    }

    /* renamed from: t */
    private void m2890t() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f2374e & 4) != 0) {
            toolbar = this.f2370a;
            drawable = this.f2379j != null ? this.f2379j : this.f2386q;
        } else {
            toolbar = this.f2370a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* renamed from: u */
    private void m2891u() {
        if ((this.f2374e & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f2382m)) {
            this.f2370a.setNavigationContentDescription(this.f2385p);
        } else {
            this.f2370a.setNavigationContentDescription(this.f2382m);
        }
    }

    /* renamed from: a */
    public C0234s mo300a(final int i, long j) {
        return C0227p.m878d(this.f2370a).m907a(i == 0 ? 1.0f : 0.0f).m908a(j).m909a(new C0565u(this) {
            /* renamed from: b */
            final /* synthetic */ ax f2762b;
            /* renamed from: c */
            private boolean f2763c = false;

            /* renamed from: a */
            public void mo99a(View view) {
                this.f2762b.f2370a.setVisibility(0);
            }

            /* renamed from: b */
            public void mo100b(View view) {
                if (!this.f2763c) {
                    this.f2762b.f2370a.setVisibility(i);
                }
            }

            /* renamed from: c */
            public void mo101c(View view) {
                this.f2763c = true;
            }
        });
    }

    /* renamed from: a */
    public ViewGroup mo301a() {
        return this.f2370a;
    }

    /* renamed from: a */
    public void mo302a(int i) {
        mo303a(i != 0 ? C0303b.m1131b(mo310b(), i) : null);
    }

    /* renamed from: a */
    public void mo303a(Drawable drawable) {
        this.f2377h = drawable;
        m2889s();
    }

    /* renamed from: a */
    public void mo304a(C0329a c0329a, C0325a c0325a) {
        this.f2370a.m1310a(c0329a, c0325a);
    }

    /* renamed from: a */
    public void mo305a(ap apVar) {
        if (this.f2375f != null && this.f2375f.getParent() == this.f2370a) {
            this.f2370a.removeView(this.f2375f);
        }
        this.f2375f = apVar;
        if (apVar != null && this.f2384o == 2) {
            this.f2370a.addView(this.f2375f, 0);
            C0613b c0613b = (C0613b) this.f2375f.getLayoutParams();
            c0613b.width = -2;
            c0613b.height = -2;
            c0613b.a = 8388691;
            apVar.setAllowCollapse(true);
        }
    }

    /* renamed from: a */
    public void mo306a(Menu menu, C0329a c0329a) {
        if (this.f2383n == null) {
            this.f2383n = new C0765d(this.f2370a.getContext());
            this.f2383n.m2607a(C0265f.action_menu_presenter);
        }
        this.f2383n.mo222a(c0329a);
        this.f2370a.m1309a((C0598h) menu, this.f2383n);
    }

    /* renamed from: a */
    public void m2899a(View view) {
        if (!(this.f2376g == null || (this.f2374e & 16) == 0)) {
            this.f2370a.removeView(this.f2376g);
        }
        this.f2376g = view;
        if (view != null && (this.f2374e & 16) != 0) {
            this.f2370a.addView(this.f2376g);
        }
    }

    /* renamed from: a */
    public void mo307a(Callback callback) {
        this.f2372c = callback;
    }

    /* renamed from: a */
    public void mo308a(CharSequence charSequence) {
        if (!this.f2380k) {
            m2887e(charSequence);
        }
    }

    /* renamed from: a */
    public void mo309a(boolean z) {
        this.f2370a.setCollapsible(z);
    }

    /* renamed from: b */
    public Context mo310b() {
        return this.f2370a.getContext();
    }

    /* renamed from: b */
    public void mo311b(int i) {
        m2905b(i != 0 ? C0303b.m1131b(mo310b(), i) : null);
    }

    /* renamed from: b */
    public void m2905b(Drawable drawable) {
        this.f2378i = drawable;
        m2889s();
    }

    /* renamed from: b */
    public void m2906b(CharSequence charSequence) {
        this.f2380k = true;
        m2887e(charSequence);
    }

    /* renamed from: b */
    public void mo312b(boolean z) {
    }

    /* renamed from: c */
    public void mo313c(int i) {
        int i2 = this.f2374e ^ i;
        this.f2374e = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m2891u();
                }
                m2890t();
            }
            if ((i2 & 3) != 0) {
                m2889s();
            }
            if ((i2 & 8) != 0) {
                Toolbar toolbar;
                CharSequence charSequence;
                if ((i & 8) != 0) {
                    this.f2370a.setTitle(this.f2371b);
                    toolbar = this.f2370a;
                    charSequence = this.f2381l;
                } else {
                    charSequence = null;
                    this.f2370a.setTitle(null);
                    toolbar = this.f2370a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) != 0 && this.f2376g != null) {
                if ((i & 16) != 0) {
                    this.f2370a.addView(this.f2376g);
                } else {
                    this.f2370a.removeView(this.f2376g);
                }
            }
        }
    }

    /* renamed from: c */
    public void m2909c(Drawable drawable) {
        this.f2379j = drawable;
        m2890t();
    }

    /* renamed from: c */
    public void m2910c(CharSequence charSequence) {
        this.f2381l = charSequence;
        if ((this.f2374e & 8) != 0) {
            this.f2370a.setSubtitle(charSequence);
        }
    }

    /* renamed from: c */
    public boolean mo314c() {
        return this.f2370a.m1318g();
    }

    /* renamed from: d */
    public void mo315d() {
        this.f2370a.m1319h();
    }

    /* renamed from: d */
    public void mo316d(int i) {
        this.f2370a.setVisibility(i);
    }

    /* renamed from: d */
    public void m2914d(CharSequence charSequence) {
        this.f2382m = charSequence;
        m2891u();
    }

    /* renamed from: e */
    public CharSequence mo317e() {
        return this.f2370a.getTitle();
    }

    /* renamed from: e */
    public void m2916e(int i) {
        if (i != this.f2385p) {
            this.f2385p = i;
            if (TextUtils.isEmpty(this.f2370a.getNavigationContentDescription())) {
                m2918f(this.f2385p);
            }
        }
    }

    /* renamed from: f */
    public void mo318f() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: f */
    public void m2918f(int i) {
        m2914d(i == 0 ? null : mo310b().getString(i));
    }

    /* renamed from: g */
    public void mo319g() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: h */
    public boolean mo320h() {
        return this.f2370a.m1311a();
    }

    /* renamed from: i */
    public boolean mo321i() {
        return this.f2370a.m1313b();
    }

    /* renamed from: j */
    public boolean mo322j() {
        return this.f2370a.m1314c();
    }

    /* renamed from: k */
    public boolean mo323k() {
        return this.f2370a.m1315d();
    }

    /* renamed from: l */
    public boolean mo324l() {
        return this.f2370a.m1316e();
    }

    /* renamed from: m */
    public void mo325m() {
        this.f2373d = true;
    }

    /* renamed from: n */
    public void mo326n() {
        this.f2370a.m1317f();
    }

    /* renamed from: o */
    public int mo327o() {
        return this.f2374e;
    }

    /* renamed from: p */
    public int mo328p() {
        return this.f2384o;
    }

    /* renamed from: q */
    public Menu mo329q() {
        return this.f2370a.getMenu();
    }
}
