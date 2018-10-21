package android.support.constraint.p006a.p007a;

import android.support.constraint.p006a.C0072e;
import android.support.constraint.p006a.C0073f;
import android.support.constraint.p006a.C0077h;
import android.support.constraint.p006a.p007a.C0058e.C0057c;

/* renamed from: android.support.constraint.a.a.m */
public class C0515m extends C0066o {
    /* renamed from: a */
    C0058e f1796a;
    /* renamed from: b */
    float f1797b;
    /* renamed from: c */
    C0515m f1798c;
    /* renamed from: d */
    float f1799d;
    /* renamed from: e */
    C0515m f1800e;
    /* renamed from: f */
    float f1801f;
    /* renamed from: g */
    int f1802g = 0;
    /* renamed from: j */
    private C0515m f1803j;
    /* renamed from: k */
    private float f1804k;
    /* renamed from: l */
    private C0516n f1805l = null;
    /* renamed from: m */
    private int f1806m = 1;
    /* renamed from: n */
    private C0516n f1807n = null;
    /* renamed from: o */
    private int f1808o = 1;

    public C0515m(C0058e c0058e) {
        this.f1796a = c0058e;
    }

    /* renamed from: a */
    String m2015a(int i) {
        return i == 1 ? "DIRECT" : i == 2 ? "CENTER" : i == 3 ? "MATCH" : i == 4 ? "CHAIN" : i == 5 ? "BARRIER" : "UNCONNECTED";
    }

    /* renamed from: a */
    public void mo20a() {
        Object obj = 1;
        if (this.i != 1 && this.f1802g != 4) {
            if (this.f1805l != null) {
                if (this.f1805l.i == 1) {
                    this.f1799d = ((float) this.f1806m) * this.f1805l.f1809a;
                } else {
                    return;
                }
            }
            if (this.f1807n != null) {
                if (this.f1807n.i == 1) {
                    this.f1804k = ((float) this.f1808o) * this.f1807n.f1809a;
                } else {
                    return;
                }
            }
            float f;
            if (this.f1802g == 1 && (this.f1798c == null || this.f1798c.i == 1)) {
                if (this.f1798c == null) {
                    this.f1800e = this;
                    f = this.f1799d;
                } else {
                    this.f1800e = this.f1798c.f1800e;
                    f = this.f1798c.f1801f + this.f1799d;
                }
                this.f1801f = f;
                m266f();
            } else {
                C0073f a;
                if (this.f1802g == 2 && this.f1798c != null && this.f1798c.i == 1 && this.f1803j != null && this.f1803j.f1798c != null && this.f1803j.f1798c.i == 1) {
                    C0515m c0515m;
                    float f2;
                    int e;
                    int e2;
                    float f3;
                    float f4;
                    if (C0072e.m294a() != null) {
                        a = C0072e.m294a();
                        a.f370w++;
                    }
                    this.f1800e = this.f1798c.f1800e;
                    this.f1803j.f1800e = this.f1803j.f1798c.f1800e;
                    int i = 0;
                    if (this.f1796a.f219b != C0057c.RIGHT) {
                        if (this.f1796a.f219b != C0057c.BOTTOM) {
                            obj = null;
                        }
                    }
                    if (obj != null) {
                        f = this.f1798c.f1801f;
                        c0515m = this.f1803j.f1798c;
                    } else {
                        f = this.f1803j.f1798c.f1801f;
                        c0515m = this.f1798c;
                    }
                    f -= c0515m.f1801f;
                    if (this.f1796a.f219b != C0057c.LEFT) {
                        if (this.f1796a.f219b != C0057c.RIGHT) {
                            f -= (float) this.f1796a.f218a.m238r();
                            f2 = this.f1796a.f218a.f254T;
                            e = this.f1796a.m158e();
                            e2 = this.f1803j.f1796a.m158e();
                            if (this.f1796a.m160g() != this.f1803j.f1796a.m160g()) {
                                f2 = 0.5f;
                                e2 = 0;
                            } else {
                                i = e;
                            }
                            f3 = (float) i;
                            f4 = (float) e2;
                            f = (f - f3) - f4;
                            if (obj == null) {
                                this.f1803j.f1801f = (this.f1803j.f1798c.f1801f + f4) + (f * f2);
                                this.f1801f = (this.f1798c.f1801f - f3) - (f * (1.0f - f2));
                            } else {
                                this.f1801f = (this.f1798c.f1801f + f3) + (f * f2);
                                this.f1803j.f1801f = (this.f1803j.f1798c.f1801f - f4) - (f * (1.0f - f2));
                            }
                        }
                    }
                    f -= (float) this.f1796a.f218a.m234p();
                    f2 = this.f1796a.f218a.f253S;
                    e = this.f1796a.m158e();
                    e2 = this.f1803j.f1796a.m158e();
                    if (this.f1796a.m160g() != this.f1803j.f1796a.m160g()) {
                        i = e;
                    } else {
                        f2 = 0.5f;
                        e2 = 0;
                    }
                    f3 = (float) i;
                    f4 = (float) e2;
                    f = (f - f3) - f4;
                    if (obj == null) {
                        this.f1801f = (this.f1798c.f1801f + f3) + (f * f2);
                        this.f1803j.f1801f = (this.f1803j.f1798c.f1801f - f4) - (f * (1.0f - f2));
                    } else {
                        this.f1803j.f1801f = (this.f1803j.f1798c.f1801f + f4) + (f * f2);
                        this.f1801f = (this.f1798c.f1801f - f3) - (f * (1.0f - f2));
                    }
                } else if (this.f1802g == 3 && this.f1798c != null && this.f1798c.i == 1 && this.f1803j != null && this.f1803j.f1798c != null && this.f1803j.f1798c.i == 1) {
                    if (C0072e.m294a() != null) {
                        a = C0072e.m294a();
                        a.f371x++;
                    }
                    this.f1800e = this.f1798c.f1800e;
                    this.f1803j.f1800e = this.f1803j.f1798c.f1800e;
                    this.f1801f = this.f1798c.f1801f + this.f1799d;
                    this.f1803j.f1801f = this.f1803j.f1798c.f1801f + this.f1803j.f1799d;
                } else if (this.f1802g == 5) {
                    this.f1796a.f218a.mo443c();
                }
                m266f();
                this.f1803j.m266f();
            }
        }
    }

    /* renamed from: a */
    public void m2017a(int i, C0515m c0515m, int i2) {
        this.f1802g = i;
        this.f1798c = c0515m;
        this.f1799d = (float) i2;
        this.f1798c.m263a(this);
    }

    /* renamed from: a */
    public void m2018a(C0515m c0515m, float f) {
        if (this.i == 0 || !(this.f1800e == c0515m || this.f1801f == f)) {
            this.f1800e = c0515m;
            this.f1801f = f;
            if (this.i == 1) {
                m265e();
            }
            m266f();
        }
    }

    /* renamed from: a */
    public void m2019a(C0515m c0515m, int i) {
        this.f1798c = c0515m;
        this.f1799d = (float) i;
        this.f1798c.m263a(this);
    }

    /* renamed from: a */
    public void m2020a(C0515m c0515m, int i, C0516n c0516n) {
        this.f1798c = c0515m;
        this.f1798c.m263a(this);
        this.f1805l = c0516n;
        this.f1806m = i;
        this.f1805l.m263a(this);
    }

    /* renamed from: a */
    void m2021a(C0072e c0072e) {
        C0077h b = this.f1796a.m155b();
        if (this.f1800e == null) {
            c0072e.m309a(b, (int) (this.f1801f + 0.5f));
        } else {
            c0072e.m319c(b, c0072e.m304a(this.f1800e.f1796a), (int) (this.f1801f + 0.5f), 6);
        }
    }

    /* renamed from: b */
    public void mo21b() {
        super.mo21b();
        this.f1798c = null;
        this.f1799d = 0.0f;
        this.f1805l = null;
        this.f1806m = 1;
        this.f1807n = null;
        this.f1808o = 1;
        this.f1800e = null;
        this.f1801f = 0.0f;
        this.f1797b = 0.0f;
        this.f1803j = null;
        this.f1804k = 0.0f;
        this.f1802g = 0;
    }

    /* renamed from: b */
    public void m2023b(int i) {
        this.f1802g = i;
    }

    /* renamed from: b */
    public void m2024b(C0515m c0515m, float f) {
        this.f1803j = c0515m;
        this.f1804k = f;
    }

    /* renamed from: b */
    public void m2025b(C0515m c0515m, int i, C0516n c0516n) {
        this.f1803j = c0515m;
        this.f1807n = c0516n;
        this.f1808o = i;
    }

    /* renamed from: c */
    public void m2026c() {
        C0058e g = this.f1796a.m160g();
        if (g != null) {
            if (g.m160g() == this.f1796a) {
                this.f1802g = 4;
                g.m150a().f1802g = 4;
            }
            int e = this.f1796a.m158e();
            if (this.f1796a.f219b == C0057c.RIGHT || this.f1796a.f219b == C0057c.BOTTOM) {
                e = -e;
            }
            m2019a(g.m150a(), e);
        }
    }

    /* renamed from: d */
    public float m2027d() {
        return this.f1801f;
    }

    public String toString() {
        StringBuilder stringBuilder;
        String str;
        if (this.i != 1) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("{ ");
            stringBuilder.append(this.f1796a);
            str = " UNRESOLVED} type: ";
        } else if (this.f1800e == this) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append(this.f1796a);
            stringBuilder.append(", RESOLVED: ");
            stringBuilder.append(this.f1801f);
            str = "]  type: ";
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append(this.f1796a);
            stringBuilder.append(", RESOLVED: ");
            stringBuilder.append(this.f1800e);
            stringBuilder.append(":");
            stringBuilder.append(this.f1801f);
            str = "] type: ";
        }
        stringBuilder.append(str);
        stringBuilder.append(m2015a(this.f1802g));
        return stringBuilder.toString();
    }
}
