package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.p012c.p013a.C0545c;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.v */
class C0785v extends C0760r implements SubMenu {
    C0785v(Context context, C0545c c0545c) {
        super(context, c0545c);
    }

    /* renamed from: b */
    public C0545c m3708b() {
        return (C0545c) this.b;
    }

    public void clearHeader() {
        m3708b().clearHeader();
    }

    public MenuItem getItem() {
        return m2621a(m3708b().getItem());
    }

    public SubMenu setHeaderIcon(int i) {
        m3708b().setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        m3708b().setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        m3708b().setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        m3708b().setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        m3708b().setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        m3708b().setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        m3708b().setIcon(drawable);
        return this;
    }
}
