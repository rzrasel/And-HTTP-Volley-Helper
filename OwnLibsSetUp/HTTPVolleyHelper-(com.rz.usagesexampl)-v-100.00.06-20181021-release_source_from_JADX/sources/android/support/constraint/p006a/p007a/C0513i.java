package android.support.constraint.p006a.p007a;

import android.support.constraint.p006a.C0072e;
import android.support.constraint.p006a.C0077h;
import android.support.constraint.p006a.p007a.C0058e.C0057c;
import android.support.constraint.p006a.p007a.C0061f.C0060a;
import java.util.ArrayList;

/* renamed from: android.support.constraint.a.a.i */
public class C0513i extends C0061f {
    protected float ai = -1.0f;
    protected int aj = -1;
    protected int ak = -1;
    private C0058e al = this.t;
    private int am;
    private boolean an;
    private int ao;
    private C0065l ap;
    private int aq;

    public C0513i() {
        int i = 0;
        this.am = 0;
        this.an = false;
        this.ao = 0;
        this.ap = new C0065l();
        this.aq = 8;
        this.B.clear();
        this.B.add(this.al);
        int length = this.A.length;
        while (i < length) {
            this.A[i] = this.al;
            i++;
        }
    }

    /* renamed from: C */
    public ArrayList<C0058e> mo12C() {
        return this.B;
    }

    /* renamed from: J */
    public int mo13J() {
        return this.am;
    }

    /* renamed from: a */
    public C0058e mo14a(C0057c c0057c) {
        switch (c0057c) {
            case LEFT:
            case RIGHT:
                if (this.am == 1) {
                    return this.al;
                }
                break;
            case TOP:
            case BOTTOM:
                if (this.am == 0) {
                    return this.al;
                }
                break;
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
            case NONE:
                return null;
            default:
                break;
        }
        throw new AssertionError(c0057c.name());
    }

    /* renamed from: a */
    public void mo15a(int i) {
        if (this.am != i) {
            this.am = i;
            this.B.clear();
            this.al = this.am == 1 ? this.s : this.t;
            this.B.add(this.al);
            i = this.A.length;
            for (int i2 = 0; i2 < i; i2++) {
                this.A[i2] = this.al;
            }
        }
    }

    /* renamed from: a */
    public void mo16a(C0072e c0072e) {
        C0732g c0732g = (C0732g) m224k();
        if (c0732g != null) {
            Object a = c0732g.mo14a(C0057c.LEFT);
            Object a2 = c0732g.mo14a(C0057c.RIGHT);
            Object obj = (this.D == null || this.D.f238C[0] != C0060a.WRAP_CONTENT) ? null : 1;
            if (this.am == 0) {
                a = c0732g.mo14a(C0057c.TOP);
                a2 = c0732g.mo14a(C0057c.BOTTOM);
                obj = (this.D == null || this.D.f238C[1] != C0060a.WRAP_CONTENT) ? null : 1;
            }
            C0077h a3;
            if (this.aj != -1) {
                a3 = c0072e.m304a(this.al);
                c0072e.m319c(a3, c0072e.m304a(a), this.aj, 6);
                if (obj != null) {
                    c0072e.m311a(c0072e.m304a(a2), a3, 0, 5);
                }
            } else if (this.ak != -1) {
                a3 = c0072e.m304a(this.al);
                C0077h a4 = c0072e.m304a(a2);
                c0072e.m319c(a3, a4, -this.ak, 6);
                if (obj != null) {
                    c0072e.m311a(a3, c0072e.m304a(a), 0, 5);
                    c0072e.m311a(a4, a3, 0, 5);
                }
            } else if (this.ai != -1.0f) {
                c0072e.m306a(C0072e.m293a(c0072e, c0072e.m304a(this.al), c0072e.m304a(a), c0072e.m304a(a2), this.ai, this.an));
            }
        }
    }

    /* renamed from: a */
    public boolean mo17a() {
        return true;
    }

    /* renamed from: b */
    public void mo18b(int i) {
        C0061f k = m224k();
        if (k != null) {
            C0515m a;
            C0058e c0058e;
            C0515m a2;
            int i2;
            int i3;
            C0515m a3;
            if (mo13J() == 1) {
                this.t.m150a().m2017a(1, k.f280t.m150a(), 0);
                this.v.m150a().m2017a(1, k.f280t.m150a(), 0);
                if (this.aj != -1) {
                    this.s.m150a().m2017a(1, k.f279s.m150a(), this.aj);
                    a = this.u.m150a();
                    c0058e = k.f279s;
                } else if (this.ak != -1) {
                    this.s.m150a().m2017a(1, k.f281u.m150a(), -this.ak);
                    a = this.u.m150a();
                    c0058e = k.f281u;
                    a2 = c0058e.m150a();
                    i2 = -this.ak;
                    a.m2017a(1, a2, i2);
                } else {
                    if (this.ai != -1.0f && k.m172F() == C0060a.FIXED) {
                        i3 = (int) (((float) k.f240E) * this.ai);
                        this.s.m150a().m2017a(1, k.f279s.m150a(), i3);
                        a3 = this.u.m150a();
                        c0058e = k.f279s;
                        a3.m2017a(1, c0058e.m150a(), i3);
                    }
                }
            }
            this.s.m150a().m2017a(1, k.f279s.m150a(), 0);
            this.u.m150a().m2017a(1, k.f279s.m150a(), 0);
            if (this.aj != -1) {
                this.t.m150a().m2017a(1, k.f280t.m150a(), this.aj);
                a = this.v.m150a();
                c0058e = k.f280t;
            } else if (this.ak != -1) {
                this.t.m150a().m2017a(1, k.f282v.m150a(), -this.ak);
                a = this.v.m150a();
                c0058e = k.f282v;
                a2 = c0058e.m150a();
                i2 = -this.ak;
                a.m2017a(1, a2, i2);
            } else {
                if (this.ai != -1.0f && k.m173G() == C0060a.FIXED) {
                    i3 = (int) (((float) k.f241F) * this.ai);
                    this.t.m150a().m2017a(1, k.f280t.m150a(), i3);
                    a3 = this.v.m150a();
                    c0058e = k.f280t;
                    a3.m2017a(1, c0058e.m150a(), i3);
                }
            }
            a2 = c0058e.m150a();
            i2 = this.aj;
            a.m2017a(1, a2, i2);
        }
    }

    /* renamed from: c */
    public void mo19c(C0072e c0072e) {
        if (m224k() != null) {
            int b = c0072e.m314b(this.al);
            if (this.am == 1) {
                m218h(b);
                m221i(0);
                m225k(m224k().m238r());
                m223j(0);
            } else {
                m218h(0);
                m221i(b);
                m223j(m224k().m234p());
                m225k(0);
            }
        }
    }

    /* renamed from: e */
    public void m2010e(float f) {
        if (f > -1.0f) {
            this.ai = f;
            this.aj = -1;
            this.ak = -1;
        }
    }

    /* renamed from: u */
    public void m2011u(int i) {
        if (i > -1) {
            this.ai = -1.0f;
            this.aj = i;
            this.ak = -1;
        }
    }

    /* renamed from: v */
    public void m2012v(int i) {
        if (i > -1) {
            this.ai = -1.0f;
            this.aj = -1;
            this.ak = i;
        }
    }
}
