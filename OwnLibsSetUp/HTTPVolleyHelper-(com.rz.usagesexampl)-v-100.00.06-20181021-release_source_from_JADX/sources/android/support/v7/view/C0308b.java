package android.support.v7.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v7.view.b */
public abstract class C0308b {
    /* renamed from: a */
    private Object f1026a;
    /* renamed from: b */
    private boolean f1027b;

    /* renamed from: android.support.v7.view.b$a */
    public interface C0307a {
        /* renamed from: a */
        void mo142a(C0308b c0308b);

        /* renamed from: a */
        boolean mo143a(C0308b c0308b, Menu menu);

        /* renamed from: a */
        boolean mo144a(C0308b c0308b, MenuItem menuItem);

        /* renamed from: b */
        boolean mo145b(C0308b c0308b, Menu menu);
    }

    /* renamed from: a */
    public abstract MenuInflater mo168a();

    /* renamed from: a */
    public abstract void mo169a(int i);

    /* renamed from: a */
    public abstract void mo170a(View view);

    /* renamed from: a */
    public abstract void mo171a(CharSequence charSequence);

    /* renamed from: a */
    public void m1156a(Object obj) {
        this.f1026a = obj;
    }

    /* renamed from: a */
    public void mo172a(boolean z) {
        this.f1027b = z;
    }

    /* renamed from: b */
    public abstract Menu mo173b();

    /* renamed from: b */
    public abstract void mo174b(int i);

    /* renamed from: b */
    public abstract void mo175b(CharSequence charSequence);

    /* renamed from: c */
    public abstract void mo176c();

    /* renamed from: d */
    public abstract void mo177d();

    /* renamed from: f */
    public abstract CharSequence mo178f();

    /* renamed from: g */
    public abstract CharSequence mo179g();

    /* renamed from: h */
    public boolean mo180h() {
        return false;
    }

    /* renamed from: i */
    public abstract View mo181i();

    /* renamed from: j */
    public Object m1167j() {
        return this.f1026a;
    }

    /* renamed from: k */
    public boolean m1168k() {
        return this.f1027b;
    }
}
