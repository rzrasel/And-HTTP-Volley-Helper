package android.support.constraint.p006a.p007a;

import android.support.constraint.p006a.C0072e;
import android.support.constraint.p006a.p007a.C0058e.C0057c;
import android.support.constraint.p006a.p007a.C0061f.C0060a;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: android.support.constraint.a.a.g */
public class C0732g extends C0517q {
    private boolean aA = false;
    private C0068p aB;
    private int aC = 7;
    private boolean aD = false;
    private boolean aE = false;
    protected C0072e ai = new C0072e();
    int aj;
    int ak;
    int al;
    int am;
    int an = 0;
    int ao = 0;
    C0053d[] ap = new C0053d[4];
    C0053d[] aq = new C0053d[4];
    public List<C0062h> ar = new ArrayList();
    public boolean as = false;
    public boolean at = false;
    public boolean au = false;
    public int av = 0;
    public int aw = 0;
    public boolean ax = false;
    int ay = 0;

    /* renamed from: V */
    private void m3353V() {
        this.an = 0;
        this.ao = 0;
    }

    /* renamed from: d */
    private void m3354d(C0061f c0061f) {
        if (this.an + 1 >= this.aq.length) {
            this.aq = (C0053d[]) Arrays.copyOf(this.aq, this.aq.length * 2);
        }
        this.aq[this.an] = new C0053d(c0061f, 0, m3359M());
        this.an++;
    }

    /* renamed from: e */
    private void m3355e(C0061f c0061f) {
        if (this.ao + 1 >= this.ap.length) {
            this.ap = (C0053d[]) Arrays.copyOf(this.ap, this.ap.length * 2);
        }
        this.ap[this.ao] = new C0053d(c0061f, 1, m3359M());
        this.ao++;
    }

    /* renamed from: J */
    public int mo13J() {
        return this.aC;
    }

    /* renamed from: K */
    public boolean m3357K() {
        return this.aD;
    }

    /* renamed from: L */
    public boolean m3358L() {
        return this.aE;
    }

    /* renamed from: M */
    public boolean m3359M() {
        return this.aA;
    }

    /* renamed from: N */
    public void mo444N() {
        Object obj;
        Object obj2;
        int i;
        int i2;
        C0061f c0061f;
        Object obj3;
        int i3;
        boolean z;
        int i4;
        Object obj4;
        Exception e;
        boolean d;
        PrintStream printStream;
        boolean z2;
        StringBuilder stringBuilder;
        int i5;
        C0061f c0061f2;
        int i6;
        int i7;
        boolean z3;
        int i8 = this.I;
        int i9 = this.J;
        int max = Math.max(0, m234p());
        int max2 = Math.max(0, m238r());
        this.aD = false;
        this.aE = false;
        if (this.D != null) {
            if (r1.aB == null) {
                r1.aB = new C0068p(r1);
            }
            r1.aB.m270a(r1);
            m218h(r1.aj);
            m221i(r1.ak);
            m171E();
            mo23a(r1.ai.m323g());
        } else {
            r1.I = 0;
            r1.J = 0;
        }
        int i10 = 32;
        if (r1.aC != 0) {
            if (!m3374u(8)) {
                m3363Q();
            }
            if (!m3374u(32)) {
                m3364R();
            }
            r1.ai.f330c = true;
        } else {
            r1.ai.f330c = false;
        }
        C0060a c0060a = r1.C[1];
        C0060a c0060a2 = r1.C[0];
        m3353V();
        if (r1.ar.size() == 0) {
            r1.ar.clear();
            r1.ar.add(0, new C0062h(r1.az));
        }
        int size = r1.ar.size();
        ArrayList arrayList = r1.az;
        if (m172F() != C0060a.WRAP_CONTENT) {
            if (m173G() != C0060a.WRAP_CONTENT) {
                obj = null;
                obj2 = null;
                i = 0;
                while (i < size && !r1.ax) {
                    if (((C0062h) r1.ar.get(i)).f290d) {
                        if (m3374u(i10)) {
                            List a = (m172F() == C0060a.FIXED || m173G() != C0060a.FIXED) ? ((C0062h) r1.ar.get(i)).f287a : ((C0062h) r1.ar.get(i)).m252a();
                            r1.az = (ArrayList) a;
                        }
                        m3353V();
                        i10 = r1.az.size();
                        for (i2 = 0; i2 < i10; i2++) {
                            c0061f = (C0061f) r1.az.get(i2);
                            if (c0061f instanceof C0517q) {
                                ((C0517q) c0061f).mo444N();
                            }
                        }
                        obj3 = obj2;
                        i3 = 0;
                        z = true;
                        while (z) {
                            boolean z4 = z;
                            i4 = i3 + 1;
                            try {
                                r1.ai.m315b();
                                m3353V();
                                m198b(r1.ai);
                                i3 = 0;
                                while (i3 < i10) {
                                    obj4 = obj3;
                                    try {
                                        ((C0061f) r1.az.get(i3)).m198b(r1.ai);
                                        i3++;
                                        obj3 = obj4;
                                    } catch (Exception e2) {
                                        e = e2;
                                    }
                                }
                                obj4 = obj3;
                                d = m3371d(r1.ai);
                                if (d) {
                                    try {
                                        r1.ai.m322f();
                                    } catch (Exception e3) {
                                        e = e3;
                                        e.printStackTrace();
                                        printStream = System.out;
                                        z2 = d;
                                        stringBuilder = new StringBuilder();
                                        i5 = size;
                                        stringBuilder.append("EXCEPTION : ");
                                        stringBuilder.append(e);
                                        printStream.println(stringBuilder.toString());
                                        if (!z2) {
                                            m3368a(r1.ai, C0064k.f299a);
                                        } else {
                                            mo19c(r1.ai);
                                            for (i2 = 0; i2 < i10; i2++) {
                                                c0061f2 = (C0061f) r1.az.get(i2);
                                                if (c0061f2.f238C[0] == C0060a.MATCH_CONSTRAINT) {
                                                }
                                                if (c0061f2.f238C[1] != C0060a.MATCH_CONSTRAINT) {
                                                }
                                            }
                                        }
                                        i6 = 2;
                                        if (obj == null) {
                                        }
                                        i7 = i4;
                                        obj3 = obj4;
                                        z3 = false;
                                        i4 = Math.max(r1.P, m234p());
                                        if (i4 > m234p()) {
                                            m223j(i4);
                                            r1.C[0] = C0060a.FIXED;
                                            z3 = true;
                                            obj3 = 1;
                                        }
                                        i4 = Math.max(r1.Q, m238r());
                                        if (i4 <= m238r()) {
                                            d = true;
                                        } else {
                                            m225k(i4);
                                            d = true;
                                            r1.C[1] = C0060a.FIXED;
                                            z3 = true;
                                            obj3 = 1;
                                        }
                                        if (obj3 == null) {
                                            r1.aD = d;
                                            r1.C[0] = C0060a.FIXED;
                                            m223j(max);
                                            z3 = true;
                                            obj3 = 1;
                                            r1.aE = d;
                                            r1.C[d] = C0060a.FIXED;
                                            m225k(max2);
                                            z = true;
                                            obj3 = 1;
                                            size = i5;
                                            i3 = i7;
                                        }
                                        z = z3;
                                        size = i5;
                                        i3 = i7;
                                    }
                                }
                                z2 = d;
                                i5 = size;
                            } catch (Exception e4) {
                                e = e4;
                                obj4 = obj3;
                                d = z4;
                                e.printStackTrace();
                                printStream = System.out;
                                z2 = d;
                                stringBuilder = new StringBuilder();
                                i5 = size;
                                stringBuilder.append("EXCEPTION : ");
                                stringBuilder.append(e);
                                printStream.println(stringBuilder.toString());
                                if (!z2) {
                                    m3368a(r1.ai, C0064k.f299a);
                                } else {
                                    mo19c(r1.ai);
                                    for (i2 = 0; i2 < i10; i2++) {
                                        c0061f2 = (C0061f) r1.az.get(i2);
                                        if (c0061f2.f238C[0] == C0060a.MATCH_CONSTRAINT) {
                                        }
                                        if (c0061f2.f238C[1] != C0060a.MATCH_CONSTRAINT) {
                                        }
                                    }
                                }
                                i6 = 2;
                                if (obj == null) {
                                }
                                i7 = i4;
                                obj3 = obj4;
                                z3 = false;
                                i4 = Math.max(r1.P, m234p());
                                if (i4 > m234p()) {
                                    m223j(i4);
                                    r1.C[0] = C0060a.FIXED;
                                    z3 = true;
                                    obj3 = 1;
                                }
                                i4 = Math.max(r1.Q, m238r());
                                if (i4 <= m238r()) {
                                    m225k(i4);
                                    d = true;
                                    r1.C[1] = C0060a.FIXED;
                                    z3 = true;
                                    obj3 = 1;
                                } else {
                                    d = true;
                                }
                                if (obj3 == null) {
                                    r1.aD = d;
                                    r1.C[0] = C0060a.FIXED;
                                    m223j(max);
                                    z3 = true;
                                    obj3 = 1;
                                    r1.aE = d;
                                    r1.C[d] = C0060a.FIXED;
                                    m225k(max2);
                                    z = true;
                                    obj3 = 1;
                                    size = i5;
                                    i3 = i7;
                                }
                                z = z3;
                                size = i5;
                                i3 = i7;
                            }
                            if (!z2) {
                                mo19c(r1.ai);
                                while (i2 < i10) {
                                    c0061f2 = (C0061f) r1.az.get(i2);
                                    if (c0061f2.f238C[0] == C0060a.MATCH_CONSTRAINT || c0061f2.m234p() >= c0061f2.m236q()) {
                                        if (c0061f2.f238C[1] != C0060a.MATCH_CONSTRAINT && c0061f2.m238r() < c0061f2.m240s()) {
                                            i6 = 2;
                                            C0064k.f299a[2] = true;
                                            break;
                                        }
                                    } else {
                                        C0064k.f299a[2] = true;
                                        break;
                                    }
                                }
                            }
                            m3368a(r1.ai, C0064k.f299a);
                            i6 = 2;
                            if (obj == null && i4 < 8 && C0064k.f299a[r9]) {
                                i3 = 0;
                                i6 = 0;
                                size = 0;
                                while (i3 < i10) {
                                    C0061f c0061f3 = (C0061f) r1.az.get(i3);
                                    i7 = i4;
                                    i6 = Math.max(i6, c0061f3.f244I + c0061f3.m234p());
                                    size = Math.max(size, c0061f3.f245J + c0061f3.m238r());
                                    i3++;
                                    i4 = i7;
                                }
                                i7 = i4;
                                i3 = Math.max(r1.P, i6);
                                i4 = Math.max(r1.Q, size);
                                if (c0060a2 != C0060a.WRAP_CONTENT || m234p() >= i3) {
                                    z3 = false;
                                } else {
                                    m223j(i3);
                                    r1.C[0] = C0060a.WRAP_CONTENT;
                                    z3 = true;
                                    obj4 = 1;
                                }
                                if (c0060a != C0060a.WRAP_CONTENT || m238r() >= i4) {
                                    obj3 = obj4;
                                } else {
                                    m225k(i4);
                                    r1.C[1] = C0060a.WRAP_CONTENT;
                                    z3 = true;
                                    obj3 = 1;
                                }
                            } else {
                                i7 = i4;
                                obj3 = obj4;
                                z3 = false;
                            }
                            i4 = Math.max(r1.P, m234p());
                            if (i4 > m234p()) {
                                m223j(i4);
                                r1.C[0] = C0060a.FIXED;
                                z3 = true;
                                obj3 = 1;
                            }
                            i4 = Math.max(r1.Q, m238r());
                            if (i4 <= m238r()) {
                                m225k(i4);
                                d = true;
                                r1.C[1] = C0060a.FIXED;
                                z3 = true;
                                obj3 = 1;
                            } else {
                                d = true;
                            }
                            if (obj3 == null) {
                                if (r1.C[0] == C0060a.WRAP_CONTENT && max > 0 && m234p() > max) {
                                    r1.aD = d;
                                    r1.C[0] = C0060a.FIXED;
                                    m223j(max);
                                    z3 = true;
                                    obj3 = 1;
                                }
                                if (r1.C[d] == C0060a.WRAP_CONTENT && max2 > 0 && m238r() > max2) {
                                    r1.aE = d;
                                    r1.C[d] = C0060a.FIXED;
                                    m225k(max2);
                                    z = true;
                                    obj3 = 1;
                                    size = i5;
                                    i3 = i7;
                                }
                            }
                            z = z3;
                            size = i5;
                            i3 = i7;
                        }
                        obj4 = obj3;
                        i5 = size;
                        ((C0062h) r1.ar.get(i)).m256b();
                        obj2 = obj4;
                    } else {
                        i5 = size;
                    }
                    i++;
                    size = i5;
                    i10 = 32;
                }
                r1.az = arrayList;
                if (r1.D == null) {
                    i8 = Math.max(r1.P, m234p());
                    i9 = Math.max(r1.Q, m238r());
                    r1.aB.m271b(r1);
                    m223j((i8 + r1.aj) + r1.al);
                    m225k((i9 + r1.ak) + r1.am);
                } else {
                    r1.I = i8;
                    r1.J = i9;
                }
                if (obj2 != null) {
                    r1.C[0] = c0060a2;
                    r1.C[1] = c0060a;
                }
                mo23a(r1.ai.m323g());
                if (r1 == m2033T()) {
                    mo22D();
                }
            }
        }
        obj = 1;
        obj2 = null;
        i = 0;
        while (i < size) {
            if (((C0062h) r1.ar.get(i)).f290d) {
                if (m3374u(i10)) {
                    if (m172F() == C0060a.FIXED) {
                    }
                    r1.az = (ArrayList) a;
                }
                m3353V();
                i10 = r1.az.size();
                for (i2 = 0; i2 < i10; i2++) {
                    c0061f = (C0061f) r1.az.get(i2);
                    if (c0061f instanceof C0517q) {
                        ((C0517q) c0061f).mo444N();
                    }
                }
                obj3 = obj2;
                i3 = 0;
                z = true;
                while (z) {
                    boolean z42 = z;
                    i4 = i3 + 1;
                    r1.ai.m315b();
                    m3353V();
                    m198b(r1.ai);
                    i3 = 0;
                    while (i3 < i10) {
                        obj4 = obj3;
                        ((C0061f) r1.az.get(i3)).m198b(r1.ai);
                        i3++;
                        obj3 = obj4;
                    }
                    obj4 = obj3;
                    d = m3371d(r1.ai);
                    if (d) {
                        r1.ai.m322f();
                    }
                    z2 = d;
                    i5 = size;
                    if (!z2) {
                        mo19c(r1.ai);
                        for (i2 = 0; i2 < i10; i2++) {
                            c0061f2 = (C0061f) r1.az.get(i2);
                            if (c0061f2.f238C[0] == C0060a.MATCH_CONSTRAINT) {
                            }
                            if (c0061f2.f238C[1] != C0060a.MATCH_CONSTRAINT) {
                            }
                        }
                    } else {
                        m3368a(r1.ai, C0064k.f299a);
                    }
                    i6 = 2;
                    if (obj == null) {
                    }
                    i7 = i4;
                    obj3 = obj4;
                    z3 = false;
                    i4 = Math.max(r1.P, m234p());
                    if (i4 > m234p()) {
                        m223j(i4);
                        r1.C[0] = C0060a.FIXED;
                        z3 = true;
                        obj3 = 1;
                    }
                    i4 = Math.max(r1.Q, m238r());
                    if (i4 <= m238r()) {
                        d = true;
                    } else {
                        m225k(i4);
                        d = true;
                        r1.C[1] = C0060a.FIXED;
                        z3 = true;
                        obj3 = 1;
                    }
                    if (obj3 == null) {
                        r1.aD = d;
                        r1.C[0] = C0060a.FIXED;
                        m223j(max);
                        z3 = true;
                        obj3 = 1;
                        r1.aE = d;
                        r1.C[d] = C0060a.FIXED;
                        m225k(max2);
                        z = true;
                        obj3 = 1;
                        size = i5;
                        i3 = i7;
                    }
                    z = z3;
                    size = i5;
                    i3 = i7;
                }
                obj4 = obj3;
                i5 = size;
                ((C0062h) r1.ar.get(i)).m256b();
                obj2 = obj4;
            } else {
                i5 = size;
            }
            i++;
            size = i5;
            i10 = 32;
        }
        r1.az = arrayList;
        if (r1.D == null) {
            r1.I = i8;
            r1.J = i9;
        } else {
            i8 = Math.max(r1.P, m234p());
            i9 = Math.max(r1.Q, m238r());
            r1.aB.m271b(r1);
            m223j((i8 + r1.aj) + r1.al);
            m225k((i9 + r1.ak) + r1.am);
        }
        if (obj2 != null) {
            r1.C[0] = c0060a2;
            r1.C[1] = c0060a;
        }
        mo23a(r1.ai.m323g());
        if (r1 == m2033T()) {
            mo22D();
        }
    }

    /* renamed from: O */
    public void m3361O() {
        m3363Q();
        mo18b(this.aC);
    }

    /* renamed from: P */
    public void m3362P() {
        C0515m a = mo14a(C0057c.LEFT).m150a();
        C0515m a2 = mo14a(C0057c.TOP).m150a();
        a.m2018a(null, 0.0f);
        a2.m2018a(null, 0.0f);
    }

    /* renamed from: Q */
    public void m3363Q() {
        int size = this.az.size();
        mo442b();
        for (int i = 0; i < size; i++) {
            ((C0061f) this.az.get(i)).mo442b();
        }
    }

    /* renamed from: R */
    public void m3364R() {
        if (!m3374u(8)) {
            mo18b(this.aC);
        }
        m3362P();
    }

    /* renamed from: S */
    public boolean m3365S() {
        return false;
    }

    /* renamed from: a */
    public void mo15a(int i) {
        this.aC = i;
    }

    /* renamed from: a */
    void m3367a(C0061f c0061f, int i) {
        if (i == 0) {
            m3354d(c0061f);
        } else if (i == 1) {
            m3355e(c0061f);
        }
    }

    /* renamed from: a */
    public void m3368a(C0072e c0072e, boolean[] zArr) {
        zArr[2] = false;
        mo19c(c0072e);
        int size = this.az.size();
        for (int i = 0; i < size; i++) {
            C0061f c0061f = (C0061f) this.az.get(i);
            c0061f.mo19c(c0072e);
            if (c0061f.f238C[0] == C0060a.MATCH_CONSTRAINT && c0061f.m234p() < c0061f.m236q()) {
                zArr[2] = true;
            }
            if (c0061f.f238C[1] == C0060a.MATCH_CONSTRAINT && c0061f.m238r() < c0061f.m240s()) {
                zArr[2] = true;
            }
        }
    }

    /* renamed from: a */
    public void m3369a(boolean z) {
        this.aA = z;
    }

    /* renamed from: b */
    public void mo18b(int i) {
        super.mo18b(i);
        int size = this.az.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0061f) this.az.get(i2)).mo18b(i);
        }
    }

    /* renamed from: d */
    public boolean m3371d(C0072e c0072e) {
        mo16a(c0072e);
        int size = this.az.size();
        for (int i = 0; i < size; i++) {
            C0061f c0061f = (C0061f) this.az.get(i);
            if (c0061f instanceof C0732g) {
                C0060a c0060a = c0061f.f238C[0];
                C0060a c0060a2 = c0061f.f238C[1];
                if (c0060a == C0060a.WRAP_CONTENT) {
                    c0061f.m183a(C0060a.FIXED);
                }
                if (c0060a2 == C0060a.WRAP_CONTENT) {
                    c0061f.m197b(C0060a.FIXED);
                }
                c0061f.mo16a(c0072e);
                if (c0060a == C0060a.WRAP_CONTENT) {
                    c0061f.m183a(c0060a);
                }
                if (c0060a2 == C0060a.WRAP_CONTENT) {
                    c0061f.m197b(c0060a2);
                }
            } else {
                C0064k.m259a(this, c0072e, c0061f);
                c0061f.mo16a(c0072e);
            }
        }
        if (this.an > 0) {
            C0052c.m145a(this, c0072e, 0);
        }
        if (this.ao > 0) {
            C0052c.m145a(this, c0072e, 1);
        }
        return true;
    }

    /* renamed from: f */
    public void mo25f() {
        this.ai.m315b();
        this.aj = 0;
        this.al = 0;
        this.ak = 0;
        this.am = 0;
        this.ar.clear();
        this.ax = false;
        super.mo25f();
    }

    /* renamed from: f */
    public void m3373f(int i, int i2) {
        if (!(this.C[0] == C0060a.WRAP_CONTENT || this.c == null)) {
            this.c.m2028a(i);
        }
        if (this.C[1] != C0060a.WRAP_CONTENT && this.d != null) {
            this.d.m2028a(i2);
        }
    }

    /* renamed from: u */
    public boolean m3374u(int i) {
        return (this.aC & i) == i;
    }
}
