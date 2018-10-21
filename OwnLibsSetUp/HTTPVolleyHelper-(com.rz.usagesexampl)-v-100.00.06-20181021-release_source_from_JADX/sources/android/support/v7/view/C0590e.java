package android.support.v7.view;

import android.content.Context;
import android.support.v7.view.C0308b.C0307a;
import android.support.v7.view.menu.C0598h;
import android.support.v7.view.menu.C0598h.C0325a;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.view.e */
public class C0590e extends C0308b implements C0325a {
    /* renamed from: a */
    private Context f2063a;
    /* renamed from: b */
    private ActionBarContextView f2064b;
    /* renamed from: c */
    private C0307a f2065c;
    /* renamed from: d */
    private WeakReference<View> f2066d;
    /* renamed from: e */
    private boolean f2067e;
    /* renamed from: f */
    private boolean f2068f;
    /* renamed from: g */
    private C0598h f2069g;

    public C0590e(Context context, ActionBarContextView actionBarContextView, C0307a c0307a, boolean z) {
        this.f2063a = context;
        this.f2064b = actionBarContextView;
        this.f2065c = c0307a;
        this.f2069g = new C0598h(actionBarContextView.getContext()).m2647a(1);
        this.f2069g.mo514a((C0325a) this);
        this.f2068f = z;
    }

    /* renamed from: a */
    public MenuInflater mo168a() {
        return new C0314g(this.f2064b.getContext());
    }

    /* renamed from: a */
    public void mo169a(int i) {
        mo175b(this.f2063a.getString(i));
    }

    /* renamed from: a */
    public void mo149a(C0598h c0598h) {
        mo177d();
        this.f2064b.mo238a();
    }

    /* renamed from: a */
    public void mo170a(View view) {
        this.f2064b.setCustomView(view);
        this.f2066d = view != null ? new WeakReference(view) : null;
    }

    /* renamed from: a */
    public void mo171a(CharSequence charSequence) {
        this.f2064b.setSubtitle(charSequence);
    }

    /* renamed from: a */
    public void mo172a(boolean z) {
        super.mo172a(z);
        this.f2064b.setTitleOptional(z);
    }

    /* renamed from: a */
    public boolean mo150a(C0598h c0598h, MenuItem menuItem) {
        return this.f2065c.mo144a((C0308b) this, menuItem);
    }

    /* renamed from: b */
    public Menu mo173b() {
        return this.f2069g;
    }

    /* renamed from: b */
    public void mo174b(int i) {
        mo171a(this.f2063a.getString(i));
    }

    /* renamed from: b */
    public void mo175b(CharSequence charSequence) {
        this.f2064b.setTitle(charSequence);
    }

    /* renamed from: c */
    public void mo176c() {
        if (!this.f2067e) {
            this.f2067e = true;
            this.f2064b.sendAccessibilityEvent(32);
            this.f2065c.mo142a(this);
        }
    }

    /* renamed from: d */
    public void mo177d() {
        this.f2065c.mo145b(this, this.f2069g);
    }

    /* renamed from: f */
    public CharSequence mo178f() {
        return this.f2064b.getTitle();
    }

    /* renamed from: g */
    public CharSequence mo179g() {
        return this.f2064b.getSubtitle();
    }

    /* renamed from: h */
    public boolean mo180h() {
        return this.f2064b.m2757d();
    }

    /* renamed from: i */
    public View mo181i() {
        return this.f2066d != null ? (View) this.f2066d.get() : null;
    }
}
