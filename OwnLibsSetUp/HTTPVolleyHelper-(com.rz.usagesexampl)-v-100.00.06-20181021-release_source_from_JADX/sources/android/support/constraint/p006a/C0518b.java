package android.support.constraint.p006a;

import android.support.constraint.p006a.C0072e.C0071a;
import android.support.constraint.p006a.C0077h.C0076a;

/* renamed from: android.support.constraint.a.b */
public class C0518b implements C0071a {
    /* renamed from: a */
    C0077h f1810a = null;
    /* renamed from: b */
    float f1811b = 0.0f;
    /* renamed from: c */
    boolean f1812c = false;
    /* renamed from: d */
    public final C0069a f1813d;
    /* renamed from: e */
    boolean f1814e = false;

    public C0518b(C0070c c0070c) {
        this.f1813d = new C0069a(this, c0070c);
    }

    /* renamed from: a */
    public C0518b m2040a(float f, float f2, float f3, C0077h c0077h, C0077h c0077h2, C0077h c0077h3, C0077h c0077h4) {
        this.f1811b = 0.0f;
        if (f2 != 0.0f) {
            if (f != f3) {
                if (f == 0.0f) {
                    this.f1813d.m281a(c0077h, 1.0f);
                    this.f1813d.m281a(c0077h2, -1.0f);
                } else if (f3 == 0.0f) {
                    this.f1813d.m281a(c0077h3, 1.0f);
                    this.f1813d.m281a(c0077h4, -1.0f);
                } else {
                    f = (f / f2) / (f3 / f2);
                    this.f1813d.m281a(c0077h, 1.0f);
                    this.f1813d.m281a(c0077h2, -1.0f);
                    this.f1813d.m281a(c0077h4, f);
                    this.f1813d.m281a(c0077h3, -f);
                }
                return this;
            }
        }
        this.f1813d.m281a(c0077h, 1.0f);
        this.f1813d.m281a(c0077h2, -1.0f);
        this.f1813d.m281a(c0077h4, 1.0f);
        this.f1813d.m281a(c0077h3, -1.0f);
        return this;
    }

    /* renamed from: a */
    public C0518b m2041a(C0072e c0072e, int i) {
        this.f1813d.m281a(c0072e.m303a(i, "ep"), 1.0f);
        this.f1813d.m281a(c0072e.m303a(i, "em"), -1.0f);
        return this;
    }

    /* renamed from: a */
    C0518b m2042a(C0077h c0077h, int i) {
        this.f1810a = c0077h;
        float f = (float) i;
        c0077h.f388d = f;
        this.f1811b = f;
        this.f1814e = true;
        return this;
    }

    /* renamed from: a */
    public C0518b m2043a(C0077h c0077h, C0077h c0077h2, int i) {
        Object obj = null;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                obj = 1;
            }
            this.f1811b = (float) i;
        }
        if (obj == null) {
            this.f1813d.m281a(c0077h, -1.0f);
            this.f1813d.m281a(c0077h2, 1.0f);
        } else {
            this.f1813d.m281a(c0077h, 1.0f);
            this.f1813d.m281a(c0077h2, -1.0f);
        }
        return this;
    }

    /* renamed from: a */
    C0518b m2044a(C0077h c0077h, C0077h c0077h2, int i, float f, C0077h c0077h3, C0077h c0077h4, int i2) {
        if (c0077h2 == c0077h3) {
            this.f1813d.m281a(c0077h, 1.0f);
            this.f1813d.m281a(c0077h4, 1.0f);
            this.f1813d.m281a(c0077h2, -2.0f);
            return this;
        }
        float f2;
        if (f == 0.5f) {
            this.f1813d.m281a(c0077h, 1.0f);
            this.f1813d.m281a(c0077h2, -1.0f);
            this.f1813d.m281a(c0077h3, -1.0f);
            this.f1813d.m281a(c0077h4, 1.0f);
            if (i > 0 || i2 > 0) {
                f2 = (float) ((-i) + i2);
            }
            return this;
        } else if (f <= 0.0f) {
            this.f1813d.m281a(c0077h, -1.0f);
            this.f1813d.m281a(c0077h2, 1.0f);
            f2 = (float) i;
        } else if (f >= 1.0f) {
            this.f1813d.m281a(c0077h3, -1.0f);
            this.f1813d.m281a(c0077h4, 1.0f);
            f2 = (float) i2;
        } else {
            float f3 = 1.0f - f;
            this.f1813d.m281a(c0077h, f3 * 1.0f);
            this.f1813d.m281a(c0077h2, f3 * -1.0f);
            this.f1813d.m281a(c0077h3, -1.0f * f);
            this.f1813d.m281a(c0077h4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                f2 = (((float) (-i)) * f3) + (((float) i2) * f);
            }
            return this;
        }
        this.f1811b = f2;
        return this;
    }

    /* renamed from: a */
    C0518b m2045a(C0077h c0077h, C0077h c0077h2, C0077h c0077h3, float f) {
        this.f1813d.m281a(c0077h, -1.0f);
        this.f1813d.m281a(c0077h2, 1.0f - f);
        this.f1813d.m281a(c0077h3, f);
        return this;
    }

    /* renamed from: a */
    public C0518b m2046a(C0077h c0077h, C0077h c0077h2, C0077h c0077h3, int i) {
        Object obj = null;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                obj = 1;
            }
            this.f1811b = (float) i;
        }
        if (obj == null) {
            this.f1813d.m281a(c0077h, -1.0f);
            this.f1813d.m281a(c0077h2, 1.0f);
            this.f1813d.m281a(c0077h3, 1.0f);
        } else {
            this.f1813d.m281a(c0077h, 1.0f);
            this.f1813d.m281a(c0077h2, -1.0f);
            this.f1813d.m281a(c0077h3, -1.0f);
        }
        return this;
    }

    /* renamed from: a */
    public C0518b m2047a(C0077h c0077h, C0077h c0077h2, C0077h c0077h3, C0077h c0077h4, float f) {
        this.f1813d.m281a(c0077h, -1.0f);
        this.f1813d.m281a(c0077h2, 1.0f);
        this.f1813d.m281a(c0077h3, f);
        this.f1813d.m281a(c0077h4, -f);
        return this;
    }

    /* renamed from: a */
    public C0077h mo26a(C0072e c0072e, boolean[] zArr) {
        return this.f1813d.m276a(zArr, null);
    }

    /* renamed from: a */
    public void mo27a(C0071a c0071a) {
        if (c0071a instanceof C0518b) {
            C0518b c0518b = (C0518b) c0071a;
            this.f1810a = null;
            this.f1813d.m277a();
            for (int i = 0; i < c0518b.f1813d.f312a; i++) {
                this.f1813d.m282a(c0518b.f1813d.m274a(i), c0518b.f1813d.m284b(i), true);
            }
        }
    }

    /* renamed from: a */
    boolean m2050a() {
        return this.f1810a != null && (this.f1810a.f390f == C0076a.UNRESTRICTED || this.f1811b >= 0.0f);
    }

    /* renamed from: a */
    boolean m2051a(C0072e c0072e) {
        boolean z;
        C0077h a = this.f1813d.m275a(c0072e);
        if (a == null) {
            z = true;
        } else {
            m2060c(a);
            z = false;
        }
        if (this.f1813d.f312a == 0) {
            this.f1814e = true;
        }
        return z;
    }

    /* renamed from: a */
    boolean m2052a(C0077h c0077h) {
        return this.f1813d.m283a(c0077h);
    }

    /* renamed from: b */
    public C0518b m2053b(C0077h c0077h, int i) {
        C0069a c0069a;
        float f;
        if (i < 0) {
            this.f1811b = (float) (i * -1);
            c0069a = this.f1813d;
            f = 1.0f;
        } else {
            this.f1811b = (float) i;
            c0069a = this.f1813d;
            f = -1.0f;
        }
        c0069a.m281a(c0077h, f);
        return this;
    }

    /* renamed from: b */
    public C0518b m2054b(C0077h c0077h, C0077h c0077h2, C0077h c0077h3, int i) {
        Object obj = null;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                obj = 1;
            }
            this.f1811b = (float) i;
        }
        if (obj == null) {
            this.f1813d.m281a(c0077h, -1.0f);
            this.f1813d.m281a(c0077h2, 1.0f);
            this.f1813d.m281a(c0077h3, -1.0f);
        } else {
            this.f1813d.m281a(c0077h, 1.0f);
            this.f1813d.m281a(c0077h2, -1.0f);
            this.f1813d.m281a(c0077h3, 1.0f);
        }
        return this;
    }

    /* renamed from: b */
    public C0518b m2055b(C0077h c0077h, C0077h c0077h2, C0077h c0077h3, C0077h c0077h4, float f) {
        this.f1813d.m281a(c0077h3, 0.5f);
        this.f1813d.m281a(c0077h4, 0.5f);
        this.f1813d.m281a(c0077h, -0.5f);
        this.f1813d.m281a(c0077h2, -0.5f);
        this.f1811b = -f;
        return this;
    }

    /* renamed from: b */
    C0077h m2056b(C0077h c0077h) {
        return this.f1813d.m276a(null, c0077h);
    }

    /* renamed from: b */
    String m2057b() {
        StringBuilder stringBuilder;
        Object obj;
        String str = "";
        if (this.f1810a == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("0");
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(this.f1810a);
        }
        str = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" = ");
        str = stringBuilder.toString();
        if (this.f1811b != 0.0f) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(this.f1811b);
            str = stringBuilder.toString();
            obj = 1;
        } else {
            obj = null;
        }
        int i = this.f1813d.f312a;
        for (int i2 = 0; i2 < i; i2++) {
            C0077h a = this.f1813d.m274a(i2);
            if (a != null) {
                float b = this.f1813d.m284b(i2);
                if (b != 0.0f) {
                    String c0077h = a.toString();
                    if (obj == null) {
                        if (b < 0.0f) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(str);
                            str = "- ";
                        }
                        if (b == 1.0f) {
                            stringBuilder = new StringBuilder();
                        } else {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(str);
                            stringBuilder.append(b);
                            str = " ";
                        }
                        stringBuilder.append(str);
                        stringBuilder.append(c0077h);
                        str = stringBuilder.toString();
                        obj = 1;
                    } else if (b > 0.0f) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(str);
                        stringBuilder.append(" + ");
                        str = stringBuilder.toString();
                        if (b == 1.0f) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(str);
                            stringBuilder.append(b);
                            str = " ";
                        } else {
                            stringBuilder = new StringBuilder();
                        }
                        stringBuilder.append(str);
                        stringBuilder.append(c0077h);
                        str = stringBuilder.toString();
                        obj = 1;
                    } else {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(str);
                        str = " - ";
                    }
                    stringBuilder.append(str);
                    str = stringBuilder.toString();
                    b *= -1.0f;
                    if (b == 1.0f) {
                        stringBuilder = new StringBuilder();
                    } else {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(str);
                        stringBuilder.append(b);
                        str = " ";
                    }
                    stringBuilder.append(str);
                    stringBuilder.append(c0077h);
                    str = stringBuilder.toString();
                    obj = 1;
                }
            }
        }
        if (obj != null) {
            return str;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("0.0");
        return stringBuilder.toString();
    }

    /* renamed from: c */
    C0518b m2058c(C0077h c0077h, int i) {
        this.f1813d.m281a(c0077h, (float) i);
        return this;
    }

    /* renamed from: c */
    public void m2059c() {
        this.f1810a = null;
        this.f1813d.m277a();
        this.f1811b = 0.0f;
        this.f1814e = false;
    }

    /* renamed from: c */
    void m2060c(C0077h c0077h) {
        if (this.f1810a != null) {
            this.f1813d.m281a(this.f1810a, -1.0f);
            this.f1810a = null;
        }
        float a = this.f1813d.m273a(c0077h, true) * -1.0f;
        this.f1810a = c0077h;
        if (a != 1.0f) {
            this.f1811b /= a;
            this.f1813d.m278a(a);
        }
    }

    /* renamed from: d */
    void m2061d() {
        if (this.f1811b < 0.0f) {
            this.f1811b *= -1.0f;
            this.f1813d.m286b();
        }
    }

    /* renamed from: d */
    public void mo28d(C0077h c0077h) {
        float f = 1.0f;
        if (c0077h.f387c != 1) {
            if (c0077h.f387c == 2) {
                f = 1000.0f;
            } else if (c0077h.f387c == 3) {
                f = 1000000.0f;
            } else if (c0077h.f387c == 4) {
                f = 1.0E9f;
            } else if (c0077h.f387c == 5) {
                f = 1.0E12f;
            }
        }
        this.f1813d.m281a(c0077h, f);
    }

    /* renamed from: e */
    public boolean m2063e() {
        return this.f1810a == null && this.f1811b == 0.0f && this.f1813d.f312a == 0;
    }

    /* renamed from: f */
    public void mo29f() {
        this.f1813d.m277a();
        this.f1810a = null;
        this.f1811b = 0.0f;
    }

    /* renamed from: g */
    public C0077h mo30g() {
        return this.f1810a;
    }

    public String toString() {
        return m2057b();
    }
}
