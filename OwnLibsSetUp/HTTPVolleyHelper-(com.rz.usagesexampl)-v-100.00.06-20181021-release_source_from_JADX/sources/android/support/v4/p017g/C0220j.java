package android.support.v4.p017g;

import android.view.View;
import android.view.ViewParent;

/* renamed from: android.support.v4.g.j */
public class C0220j {
    /* renamed from: a */
    private ViewParent f770a;
    /* renamed from: b */
    private ViewParent f771b;
    /* renamed from: c */
    private final View f772c;
    /* renamed from: d */
    private boolean f773d;
    /* renamed from: e */
    private int[] f774e;

    public C0220j(View view) {
        this.f772c = view;
    }

    /* renamed from: a */
    private void m816a(int i, ViewParent viewParent) {
        switch (i) {
            case 0:
                this.f770a = viewParent;
                return;
            case 1:
                this.f771b = viewParent;
                return;
            default:
                return;
        }
    }

    /* renamed from: d */
    private ViewParent m817d(int i) {
        switch (i) {
            case 0:
                return this.f770a;
            case 1:
                return this.f771b;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public void m818a(boolean z) {
        if (this.f773d) {
            C0227p.m885k(this.f772c);
        }
        this.f773d = z;
    }

    /* renamed from: a */
    public boolean m819a() {
        return this.f773d;
    }

    /* renamed from: a */
    public boolean m820a(float f, float f2) {
        if (m819a()) {
            ViewParent d = m817d(0);
            if (d != null) {
                return C0231r.m901a(d, this.f772c, f, f2);
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m821a(float f, float f2, boolean z) {
        if (m819a()) {
            ViewParent d = m817d(0);
            if (d != null) {
                return C0231r.m902a(d, this.f772c, f, f2, z);
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m822a(int i) {
        return m817d(i) != null;
    }

    /* renamed from: a */
    public boolean m823a(int i, int i2) {
        if (m822a(i2)) {
            return true;
        }
        if (m819a()) {
            View view = this.f772c;
            for (ViewParent parent = this.f772c.getParent(); parent != null; parent = parent.getParent()) {
                if (C0231r.m903a(parent, view, this.f772c, i, i2)) {
                    m816a(i2, parent);
                    C0231r.m904b(parent, view, this.f772c, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m824a(int i, int i2, int i3, int i4, int[] iArr) {
        return m825a(i, i2, i3, i4, iArr, 0);
    }

    /* renamed from: a */
    public boolean m825a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        C0220j c0220j = this;
        int[] iArr2 = iArr;
        if (m819a()) {
            ViewParent d = m817d(i5);
            if (d == null) {
                return false;
            }
            int i6;
            int i7;
            if (i == 0 && i2 == 0 && i3 == 0) {
                if (i4 == 0) {
                    if (iArr2 != null) {
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                    }
                }
            }
            if (iArr2 != null) {
                c0220j.f772c.getLocationInWindow(iArr2);
                i6 = iArr2[0];
                i7 = iArr2[1];
            } else {
                i6 = 0;
                i7 = 0;
            }
            C0231r.m899a(d, c0220j.f772c, i, i2, i3, i4, i5);
            if (iArr2 != null) {
                c0220j.f772c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i6;
                iArr2[1] = iArr2[1] - i7;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m826a(int i, int i2, int[] iArr, int[] iArr2) {
        return m827a(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: a */
    public boolean m827a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        if (m819a()) {
            ViewParent d = m817d(i3);
            if (d == null) {
                return false;
            }
            int i4;
            int i5;
            boolean z = true;
            if (i == 0) {
                if (i2 == 0) {
                    if (iArr2 != null) {
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                    }
                }
            }
            if (iArr2 != null) {
                this.f772c.getLocationInWindow(iArr2);
                i4 = iArr2[0];
                i5 = iArr2[1];
            } else {
                i4 = 0;
                i5 = 0;
            }
            if (iArr == null) {
                if (this.f774e == null) {
                    this.f774e = new int[2];
                }
                iArr = this.f774e;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            C0231r.m900a(d, this.f772c, i, i2, iArr, i3);
            if (iArr2 != null) {
                this.f772c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i4;
                iArr2[1] = iArr2[1] - i5;
            }
            if (iArr[0] == 0) {
                if (iArr[1] == 0) {
                    z = false;
                }
            }
            return z;
        }
        return false;
    }

    /* renamed from: b */
    public boolean m828b() {
        return m822a(0);
    }

    /* renamed from: b */
    public boolean m829b(int i) {
        return m823a(i, 0);
    }

    /* renamed from: c */
    public void m830c() {
        m831c(0);
    }

    /* renamed from: c */
    public void m831c(int i) {
        ViewParent d = m817d(i);
        if (d != null) {
            C0231r.m898a(d, this.f772c, i);
            m816a(i, null);
        }
    }
}
