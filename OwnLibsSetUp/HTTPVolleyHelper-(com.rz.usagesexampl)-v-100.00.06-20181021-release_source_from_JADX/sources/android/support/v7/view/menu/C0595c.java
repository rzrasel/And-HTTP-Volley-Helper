package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.p012c.p013a.C0168b;
import android.support.v4.p012c.p013a.C0545c;
import android.support.v4.p016f.C0549a;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

/* renamed from: android.support.v7.view.menu.c */
abstract class C0595c<T> extends C0318d<T> {
    /* renamed from: a */
    final Context f2125a;
    /* renamed from: c */
    private Map<C0168b, MenuItem> f2126c;
    /* renamed from: d */
    private Map<C0545c, SubMenu> f2127d;

    C0595c(Context context, T t) {
        super(t);
        this.f2125a = context;
    }

    /* renamed from: a */
    final MenuItem m2621a(MenuItem menuItem) {
        if (!(menuItem instanceof C0168b)) {
            return menuItem;
        }
        C0168b c0168b = (C0168b) menuItem;
        if (this.f2126c == null) {
            this.f2126c = new C0549a();
        }
        menuItem = (MenuItem) this.f2126c.get(menuItem);
        if (menuItem != null) {
            return menuItem;
        }
        menuItem = C0333q.m1234a(this.f2125a, c0168b);
        this.f2126c.put(c0168b, menuItem);
        return menuItem;
    }

    /* renamed from: a */
    final SubMenu m2622a(SubMenu subMenu) {
        if (!(subMenu instanceof C0545c)) {
            return subMenu;
        }
        C0545c c0545c = (C0545c) subMenu;
        if (this.f2127d == null) {
            this.f2127d = new C0549a();
        }
        SubMenu subMenu2 = (SubMenu) this.f2127d.get(c0545c);
        if (subMenu2 == null) {
            subMenu2 = C0333q.m1235a(this.f2125a, c0545c);
            this.f2127d.put(c0545c, subMenu2);
        }
        return subMenu2;
    }

    /* renamed from: a */
    final void m2623a() {
        if (this.f2126c != null) {
            this.f2126c.clear();
        }
        if (this.f2127d != null) {
            this.f2127d.clear();
        }
    }

    /* renamed from: a */
    final void m2624a(int i) {
        if (this.f2126c != null) {
            Iterator it = this.f2126c.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getGroupId()) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: b */
    final void m2625b(int i) {
        if (this.f2126c != null) {
            Iterator it = this.f2126c.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getItemId()) {
                    it.remove();
                    break;
                }
            }
        }
    }
}
