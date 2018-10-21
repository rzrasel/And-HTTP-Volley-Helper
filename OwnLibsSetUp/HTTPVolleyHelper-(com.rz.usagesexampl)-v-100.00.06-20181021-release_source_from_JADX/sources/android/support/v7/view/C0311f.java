package android.support.v7.view;

import android.content.Context;
import android.support.v4.p012c.p013a.C0167a;
import android.support.v4.p012c.p013a.C0168b;
import android.support.v4.p016f.C0197k;
import android.support.v7.view.C0308b.C0307a;
import android.support.v7.view.menu.C0333q;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.f */
public class C0311f extends ActionMode {
    /* renamed from: a */
    final Context f1033a;
    /* renamed from: b */
    final C0308b f1034b;

    /* renamed from: android.support.v7.view.f$a */
    public static class C0591a implements C0307a {
        /* renamed from: a */
        final Callback f2070a;
        /* renamed from: b */
        final Context f2071b;
        /* renamed from: c */
        final ArrayList<C0311f> f2072c = new ArrayList();
        /* renamed from: d */
        final C0197k<Menu, Menu> f2073d = new C0197k();

        public C0591a(Context context, Callback callback) {
            this.f2071b = context;
            this.f2070a = callback;
        }

        /* renamed from: a */
        private Menu m2580a(Menu menu) {
            Menu menu2 = (Menu) this.f2073d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            menu2 = C0333q.m1233a(this.f2071b, (C0167a) menu);
            this.f2073d.put(menu, menu2);
            return menu2;
        }

        /* renamed from: a */
        public void mo142a(C0308b c0308b) {
            this.f2070a.onDestroyActionMode(m2584b(c0308b));
        }

        /* renamed from: a */
        public boolean mo143a(C0308b c0308b, Menu menu) {
            return this.f2070a.onCreateActionMode(m2584b(c0308b), m2580a(menu));
        }

        /* renamed from: a */
        public boolean mo144a(C0308b c0308b, MenuItem menuItem) {
            return this.f2070a.onActionItemClicked(m2584b(c0308b), C0333q.m1234a(this.f2071b, (C0168b) menuItem));
        }

        /* renamed from: b */
        public ActionMode m2584b(C0308b c0308b) {
            int size = this.f2072c.size();
            for (int i = 0; i < size; i++) {
                C0311f c0311f = (C0311f) this.f2072c.get(i);
                if (c0311f != null && c0311f.f1034b == c0308b) {
                    return c0311f;
                }
            }
            ActionMode c0311f2 = new C0311f(this.f2071b, c0308b);
            this.f2072c.add(c0311f2);
            return c0311f2;
        }

        /* renamed from: b */
        public boolean mo145b(C0308b c0308b, Menu menu) {
            return this.f2070a.onPrepareActionMode(m2584b(c0308b), m2580a(menu));
        }
    }

    public C0311f(Context context, C0308b c0308b) {
        this.f1033a = context;
        this.f1034b = c0308b;
    }

    public void finish() {
        this.f1034b.mo176c();
    }

    public View getCustomView() {
        return this.f1034b.mo181i();
    }

    public Menu getMenu() {
        return C0333q.m1233a(this.f1033a, (C0167a) this.f1034b.mo173b());
    }

    public MenuInflater getMenuInflater() {
        return this.f1034b.mo168a();
    }

    public CharSequence getSubtitle() {
        return this.f1034b.mo179g();
    }

    public Object getTag() {
        return this.f1034b.m1167j();
    }

    public CharSequence getTitle() {
        return this.f1034b.mo178f();
    }

    public boolean getTitleOptionalHint() {
        return this.f1034b.m1168k();
    }

    public void invalidate() {
        this.f1034b.mo177d();
    }

    public boolean isTitleOptional() {
        return this.f1034b.mo180h();
    }

    public void setCustomView(View view) {
        this.f1034b.mo170a(view);
    }

    public void setSubtitle(int i) {
        this.f1034b.mo174b(i);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1034b.mo171a(charSequence);
    }

    public void setTag(Object obj) {
        this.f1034b.m1156a(obj);
    }

    public void setTitle(int i) {
        this.f1034b.mo169a(i);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1034b.mo175b(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f1034b.mo172a(z);
    }
}
