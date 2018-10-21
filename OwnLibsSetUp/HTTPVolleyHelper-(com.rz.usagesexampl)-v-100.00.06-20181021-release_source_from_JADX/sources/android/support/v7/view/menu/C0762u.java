package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.C0598h.C0325a;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.u */
public class C0762u extends C0598h implements SubMenu {
    /* renamed from: d */
    private C0598h f2753d;
    /* renamed from: e */
    private C0601j f2754e;

    public C0762u(Context context, C0598h c0598h, C0601j c0601j) {
        super(context);
        this.f2753d = c0598h;
        this.f2754e = c0601j;
    }

    /* renamed from: a */
    public String mo513a() {
        int itemId = this.f2754e != null ? this.f2754e.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.mo513a());
        stringBuilder.append(":");
        stringBuilder.append(itemId);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public void mo514a(C0325a c0325a) {
        this.f2753d.mo514a(c0325a);
    }

    /* renamed from: a */
    boolean mo515a(C0598h c0598h, MenuItem menuItem) {
        if (!super.mo515a(c0598h, menuItem)) {
            if (!this.f2753d.mo515a(c0598h, menuItem)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo516b() {
        return this.f2753d.mo516b();
    }

    /* renamed from: c */
    public boolean mo517c() {
        return this.f2753d.mo517c();
    }

    /* renamed from: c */
    public boolean mo518c(C0601j c0601j) {
        return this.f2753d.mo518c(c0601j);
    }

    /* renamed from: d */
    public boolean mo519d(C0601j c0601j) {
        return this.f2753d.mo519d(c0601j);
    }

    public MenuItem getItem() {
        return this.f2754e;
    }

    /* renamed from: p */
    public C0598h mo520p() {
        return this.f2753d.mo520p();
    }

    /* renamed from: s */
    public Menu m3604s() {
        return this.f2753d;
    }

    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.m2679e(i);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.m2648a(drawable);
    }

    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.m2676d(i);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.m2650a(charSequence);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.m2649a(view);
    }

    public SubMenu setIcon(int i) {
        this.f2754e.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f2754e.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f2753d.setQwertyMode(z);
    }
}
