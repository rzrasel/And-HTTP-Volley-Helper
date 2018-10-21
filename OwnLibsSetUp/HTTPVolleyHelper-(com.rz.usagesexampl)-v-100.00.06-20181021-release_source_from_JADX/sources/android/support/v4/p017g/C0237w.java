package android.support.v4.p017g;

import android.os.Build.VERSION;
import android.view.WindowInsets;

/* renamed from: android.support.v4.g.w */
public class C0237w {
    /* renamed from: a */
    private final Object f798a;

    private C0237w(Object obj) {
        this.f798a = obj;
    }

    /* renamed from: a */
    static C0237w m920a(Object obj) {
        return obj == null ? null : new C0237w(obj);
    }

    /* renamed from: a */
    static Object m921a(C0237w c0237w) {
        return c0237w == null ? null : c0237w.f798a;
    }

    /* renamed from: a */
    public int m922a() {
        return VERSION.SDK_INT >= 20 ? ((WindowInsets) this.f798a).getSystemWindowInsetLeft() : 0;
    }

    /* renamed from: a */
    public C0237w m923a(int i, int i2, int i3, int i4) {
        return VERSION.SDK_INT >= 20 ? new C0237w(((WindowInsets) this.f798a).replaceSystemWindowInsets(i, i2, i3, i4)) : null;
    }

    /* renamed from: b */
    public int m924b() {
        return VERSION.SDK_INT >= 20 ? ((WindowInsets) this.f798a).getSystemWindowInsetTop() : 0;
    }

    /* renamed from: c */
    public int m925c() {
        return VERSION.SDK_INT >= 20 ? ((WindowInsets) this.f798a).getSystemWindowInsetRight() : 0;
    }

    /* renamed from: d */
    public int m926d() {
        return VERSION.SDK_INT >= 20 ? ((WindowInsets) this.f798a).getSystemWindowInsetBottom() : 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C0237w c0237w = (C0237w) obj;
                if (this.f798a != null) {
                    z = this.f798a.equals(c0237w.f798a);
                } else if (c0237w.f798a != null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f798a == null ? 0 : this.f798a.hashCode();
    }
}
