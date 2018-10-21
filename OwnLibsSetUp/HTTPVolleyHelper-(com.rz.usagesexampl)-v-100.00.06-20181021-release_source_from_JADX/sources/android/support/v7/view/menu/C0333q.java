package android.support.v7.view.menu;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.p012c.p013a.C0167a;
import android.support.v4.p012c.p013a.C0168b;
import android.support.v4.p012c.p013a.C0545c;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: android.support.v7.view.menu.q */
public final class C0333q {
    /* renamed from: a */
    public static Menu m1233a(Context context, C0167a c0167a) {
        return new C0760r(context, c0167a);
    }

    /* renamed from: a */
    public static MenuItem m1234a(Context context, C0168b c0168b) {
        return VERSION.SDK_INT >= 16 ? new C0784l(context, c0168b) : new C0758k(context, c0168b);
    }

    /* renamed from: a */
    public static SubMenu m1235a(Context context, C0545c c0545c) {
        return new C0785v(context, c0545c);
    }
}
