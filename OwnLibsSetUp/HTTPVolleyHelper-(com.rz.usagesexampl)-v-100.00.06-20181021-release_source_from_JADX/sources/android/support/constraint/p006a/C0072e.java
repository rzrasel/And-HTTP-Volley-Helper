package android.support.constraint.p006a;

import android.support.constraint.p006a.C0077h.C0076a;
import android.support.constraint.p006a.p007a.C0058e;
import android.support.constraint.p006a.p007a.C0058e.C0057c;
import android.support.constraint.p006a.p007a.C0061f;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: android.support.constraint.a.e */
public class C0072e {
    /* renamed from: g */
    public static C0073f f326g = null;
    /* renamed from: h */
    private static int f327h = 1000;
    /* renamed from: a */
    int f328a;
    /* renamed from: b */
    C0518b[] f329b;
    /* renamed from: c */
    public boolean f330c;
    /* renamed from: d */
    int f331d;
    /* renamed from: e */
    int f332e;
    /* renamed from: f */
    final C0070c f333f;
    /* renamed from: i */
    private HashMap<String, C0077h> f334i;
    /* renamed from: j */
    private C0071a f335j;
    /* renamed from: k */
    private int f336k;
    /* renamed from: l */
    private int f337l;
    /* renamed from: m */
    private boolean[] f338m;
    /* renamed from: n */
    private int f339n;
    /* renamed from: o */
    private C0077h[] f340o;
    /* renamed from: p */
    private int f341p;
    /* renamed from: q */
    private C0518b[] f342q;
    /* renamed from: r */
    private final C0071a f343r;

    /* renamed from: android.support.constraint.a.e$a */
    interface C0071a {
        /* renamed from: a */
        C0077h mo26a(C0072e c0072e, boolean[] zArr);

        /* renamed from: a */
        void mo27a(C0071a c0071a);

        /* renamed from: d */
        void mo28d(C0077h c0077h);

        /* renamed from: f */
        void mo29f();

        /* renamed from: g */
        C0077h mo30g();
    }

    public C0072e() {
        this.f328a = 0;
        this.f334i = null;
        this.f336k = 32;
        this.f337l = this.f336k;
        this.f329b = null;
        this.f330c = false;
        this.f338m = new boolean[this.f336k];
        this.f331d = 1;
        this.f332e = 0;
        this.f339n = this.f336k;
        this.f340o = new C0077h[f327h];
        this.f341p = 0;
        this.f342q = new C0518b[this.f336k];
        this.f329b = new C0518b[this.f336k];
        m301i();
        this.f333f = new C0070c();
        this.f335j = new C0733d(this.f333f);
        this.f343r = new C0518b(this.f333f);
    }

    /* renamed from: a */
    private final int m292a(C0071a c0071a, boolean z) {
        if (f326g != null) {
            C0073f c0073f = f326g;
            c0073f.f355h++;
        }
        for (int i = 0; i < this.f331d; i++) {
            this.f338m[i] = false;
        }
        Object obj = null;
        int i2 = 0;
        while (obj == null) {
            if (f326g != null) {
                C0073f c0073f2 = f326g;
                c0073f2.f356i++;
            }
            i2++;
            if (i2 >= this.f331d * 2) {
                return i2;
            }
            if (c0071a.mo30g() != null) {
                this.f338m[c0071a.mo30g().f385a] = true;
            }
            C0077h a = c0071a.mo26a(this, this.f338m);
            if (a != null) {
                if (this.f338m[a.f385a]) {
                    return i2;
                }
                this.f338m[a.f385a] = true;
            }
            if (a != null) {
                int i3 = -1;
                float f = Float.MAX_VALUE;
                for (int i4 = 0; i4 < this.f332e; i4++) {
                    C0518b c0518b = this.f329b[i4];
                    if (c0518b.f1810a.f390f != C0076a.UNRESTRICTED) {
                        if (!c0518b.f1814e) {
                            if (c0518b.m2052a(a)) {
                                float b = c0518b.f1813d.m285b(a);
                                if (b < 0.0f) {
                                    float f2 = (-c0518b.f1811b) / b;
                                    if (f2 < f) {
                                        i3 = i4;
                                        f = f2;
                                    }
                                }
                            }
                        }
                    }
                }
                if (i3 > -1) {
                    C0518b c0518b2 = this.f329b[i3];
                    c0518b2.f1810a.f386b = -1;
                    if (f326g != null) {
                        C0073f c0073f3 = f326g;
                        c0073f3.f357j++;
                    }
                    c0518b2.m2060c(a);
                    c0518b2.f1810a.f386b = i3;
                    c0518b2.f1810a.m332c(c0518b2);
                }
            }
            obj = 1;
        }
        return i2;
    }

    /* renamed from: a */
    public static C0518b m293a(C0072e c0072e, C0077h c0077h, C0077h c0077h2, C0077h c0077h3, float f, boolean z) {
        C0518b c = c0072e.m318c();
        if (z) {
            c0072e.m297b(c);
        }
        return c.m2045a(c0077h, c0077h2, c0077h3, f);
    }

    /* renamed from: a */
    public static C0073f m294a() {
        return f326g;
    }

    /* renamed from: a */
    private C0077h m295a(C0076a c0076a, String str) {
        C0077h c0077h = (C0077h) this.f333f.f324b.mo31a();
        if (c0077h == null) {
            c0077h = new C0077h(c0076a, str);
        } else {
            c0077h.m330b();
        }
        c0077h.m329a(c0076a, str);
        if (this.f341p >= f327h) {
            f327h *= 2;
            this.f340o = (C0077h[]) Arrays.copyOf(this.f340o, f327h);
        }
        C0077h[] c0077hArr = this.f340o;
        int i = this.f341p;
        this.f341p = i + 1;
        c0077hArr[i] = c0077h;
        return c0077h;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private int m296b(android.support.constraint.p006a.C0072e.C0071a r19) {
        /*
        r18 = this;
        r0 = r18;
        r2 = 0;
    L_0x0003:
        r3 = r0.f332e;
        r4 = 0;
        if (r2 >= r3) goto L_0x0024;
    L_0x0008:
        r3 = r0.f329b;
        r3 = r3[r2];
        r3 = r3.f1810a;
        r3 = r3.f390f;
        r6 = android.support.constraint.p006a.C0077h.C0076a.UNRESTRICTED;
        if (r3 != r6) goto L_0x0015;
    L_0x0014:
        goto L_0x0021;
    L_0x0015:
        r3 = r0.f329b;
        r3 = r3[r2];
        r3 = r3.f1811b;
        r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
        if (r3 >= 0) goto L_0x0021;
    L_0x001f:
        r2 = 1;
        goto L_0x0025;
    L_0x0021:
        r2 = r2 + 1;
        goto L_0x0003;
    L_0x0024:
        r2 = 0;
    L_0x0025:
        if (r2 == 0) goto L_0x00db;
    L_0x0027:
        r2 = 0;
        r3 = 0;
    L_0x0029:
        if (r2 != 0) goto L_0x00d8;
    L_0x002b:
        r6 = f326g;
        r7 = 1;
        if (r6 == 0) goto L_0x0038;
    L_0x0031:
        r6 = f326g;
        r9 = r6.f358k;
        r9 = r9 + r7;
        r6.f358k = r9;
    L_0x0038:
        r3 = r3 + 1;
        r6 = 2139095039; // 0x7f7fffff float:3.4028235E38 double:1.056853372E-314;
        r9 = -1;
        r6 = 0;
        r10 = -1;
        r11 = -1;
        r12 = 2139095039; // 0x7f7fffff float:3.4028235E38 double:1.056853372E-314;
        r13 = 0;
    L_0x0045:
        r14 = r0.f332e;
        if (r6 >= r14) goto L_0x00a3;
    L_0x0049:
        r14 = r0.f329b;
        r14 = r14[r6];
        r15 = r14.f1810a;
        r15 = r15.f390f;
        r1 = android.support.constraint.p006a.C0077h.C0076a.UNRESTRICTED;
        if (r15 != r1) goto L_0x0056;
    L_0x0055:
        goto L_0x009d;
    L_0x0056:
        r1 = r14.f1814e;
        if (r1 == 0) goto L_0x005b;
    L_0x005a:
        goto L_0x009d;
    L_0x005b:
        r1 = r14.f1811b;
        r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1));
        if (r1 >= 0) goto L_0x009d;
    L_0x0061:
        r1 = 1;
    L_0x0062:
        r15 = r0.f331d;
        if (r1 >= r15) goto L_0x009d;
    L_0x0066:
        r15 = r0.f333f;
        r15 = r15.f325c;
        r15 = r15[r1];
        r5 = r14.f1813d;
        r5 = r5.m285b(r15);
        r17 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1));
        if (r17 > 0) goto L_0x0077;
    L_0x0076:
        goto L_0x0097;
    L_0x0077:
        r4 = r13;
        r13 = r12;
        r12 = r11;
        r11 = r10;
        r10 = 0;
    L_0x007c:
        r7 = 7;
        if (r10 >= r7) goto L_0x0093;
    L_0x007f:
        r7 = r15.f389e;
        r7 = r7[r10];
        r7 = r7 / r5;
        r8 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1));
        if (r8 >= 0) goto L_0x008a;
    L_0x0088:
        if (r10 == r4) goto L_0x008c;
    L_0x008a:
        if (r10 <= r4) goto L_0x0090;
    L_0x008c:
        r12 = r1;
        r11 = r6;
        r13 = r7;
        r4 = r10;
    L_0x0090:
        r10 = r10 + 1;
        goto L_0x007c;
    L_0x0093:
        r10 = r11;
        r11 = r12;
        r12 = r13;
        r13 = r4;
    L_0x0097:
        r1 = r1 + 1;
        r4 = 0;
        r7 = 1;
        goto L_0x0062;
    L_0x009d:
        r6 = r6 + 1;
        r4 = 0;
        r7 = 1;
        goto L_0x0045;
    L_0x00a3:
        if (r10 == r9) goto L_0x00cd;
    L_0x00a5:
        r1 = r0.f329b;
        r1 = r1[r10];
        r4 = r1.f1810a;
        r4.f386b = r9;
        r4 = f326g;
        if (r4 == 0) goto L_0x00ba;
    L_0x00b1:
        r4 = f326g;
        r5 = r4.f357j;
        r7 = 1;
        r5 = r5 + r7;
        r4.f357j = r5;
    L_0x00ba:
        r4 = r0.f333f;
        r4 = r4.f325c;
        r4 = r4[r11];
        r1.m2060c(r4);
        r4 = r1.f1810a;
        r4.f386b = r10;
        r4 = r1.f1810a;
        r4.m332c(r1);
        goto L_0x00ce;
    L_0x00cd:
        r2 = 1;
    L_0x00ce:
        r1 = r0.f331d;
        r1 = r1 / 2;
        if (r3 <= r1) goto L_0x00d5;
    L_0x00d4:
        r2 = 1;
    L_0x00d5:
        r4 = 0;
        goto L_0x0029;
    L_0x00d8:
        r16 = r3;
        goto L_0x00dd;
    L_0x00db:
        r16 = 0;
    L_0x00dd:
        return r16;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.a.e.b(android.support.constraint.a.e$a):int");
    }

    /* renamed from: b */
    private void m297b(C0518b c0518b) {
        c0518b.m2041a(this, 0);
    }

    /* renamed from: c */
    private final void m298c(C0518b c0518b) {
        if (this.f332e > 0) {
            c0518b.f1813d.m280a(c0518b, this.f329b);
            if (c0518b.f1813d.f312a == 0) {
                c0518b.f1814e = true;
            }
        }
    }

    /* renamed from: d */
    private final void m299d(C0518b c0518b) {
        if (this.f329b[this.f332e] != null) {
            this.f333f.f323a.mo33a(this.f329b[this.f332e]);
        }
        this.f329b[this.f332e] = c0518b;
        c0518b.f1810a.f386b = this.f332e;
        this.f332e++;
        c0518b.f1810a.m332c(c0518b);
    }

    /* renamed from: h */
    private void m300h() {
        this.f336k *= 2;
        this.f329b = (C0518b[]) Arrays.copyOf(this.f329b, this.f336k);
        this.f333f.f325c = (C0077h[]) Arrays.copyOf(this.f333f.f325c, this.f336k);
        this.f338m = new boolean[this.f336k];
        this.f337l = this.f336k;
        this.f339n = this.f336k;
        if (f326g != null) {
            C0073f c0073f = f326g;
            c0073f.f351d++;
            f326g.f363p = Math.max(f326g.f363p, (long) this.f336k);
            f326g.f347D = f326g.f363p;
        }
    }

    /* renamed from: i */
    private void m301i() {
        for (int i = 0; i < this.f329b.length; i++) {
            Object obj = this.f329b[i];
            if (obj != null) {
                this.f333f.f323a.mo33a(obj);
            }
            this.f329b[i] = null;
        }
    }

    /* renamed from: j */
    private void m302j() {
        for (int i = 0; i < this.f332e; i++) {
            C0518b c0518b = this.f329b[i];
            c0518b.f1810a.f388d = c0518b.f1811b;
        }
    }

    /* renamed from: a */
    public C0077h m303a(int i, String str) {
        if (f326g != null) {
            C0073f c0073f = f326g;
            c0073f.f360m++;
        }
        if (this.f331d + 1 >= this.f337l) {
            m300h();
        }
        C0077h a = m295a(C0076a.ERROR, str);
        this.f328a++;
        this.f331d++;
        a.f385a = this.f328a;
        a.f387c = i;
        this.f333f.f325c[this.f328a] = a;
        this.f335j.mo28d(a);
        return a;
    }

    /* renamed from: a */
    public C0077h m304a(Object obj) {
        C0077h c0077h = null;
        if (obj == null) {
            return null;
        }
        if (this.f331d + 1 >= this.f337l) {
            m300h();
        }
        if (obj instanceof C0058e) {
            C0058e c0058e = (C0058e) obj;
            c0077h = c0058e.m155b();
            if (c0077h == null) {
                c0058e.m151a(this.f333f);
                c0077h = c0058e.m155b();
            }
            if (c0077h.f385a == -1 || c0077h.f385a > this.f328a || this.f333f.f325c[c0077h.f385a] == null) {
                if (c0077h.f385a != -1) {
                    c0077h.m330b();
                }
                this.f328a++;
                this.f331d++;
                c0077h.f385a = this.f328a;
                c0077h.f390f = C0076a.UNRESTRICTED;
                this.f333f.f325c[this.f328a] = c0077h;
            }
        }
        return c0077h;
    }

    /* renamed from: a */
    public void m305a(C0061f c0061f, C0061f c0061f2, float f, int i) {
        C0061f c0061f3 = c0061f;
        C0061f c0061f4 = c0061f2;
        C0077h a = m304a(c0061f3.mo14a(C0057c.LEFT));
        C0077h a2 = m304a(c0061f3.mo14a(C0057c.TOP));
        C0077h a3 = m304a(c0061f3.mo14a(C0057c.RIGHT));
        C0077h a4 = m304a(c0061f3.mo14a(C0057c.BOTTOM));
        C0077h a5 = m304a(c0061f4.mo14a(C0057c.LEFT));
        C0077h a6 = m304a(c0061f4.mo14a(C0057c.TOP));
        C0077h a7 = m304a(c0061f4.mo14a(C0057c.RIGHT));
        C0077h a8 = m304a(c0061f4.mo14a(C0057c.BOTTOM));
        C0518b c = m318c();
        double d = (double) f;
        double sin = Math.sin(d);
        C0077h c0077h = a3;
        double d2 = (double) i;
        Double.isNaN(d2);
        C0077h c0077h2 = a7;
        c.m2055b(a2, a4, a6, a8, (float) (sin * d2));
        m306a(c);
        c = m318c();
        double cos = Math.cos(d);
        Double.isNaN(d2);
        c.m2055b(a, c0077h, a5, c0077h2, (float) (cos * d2));
        m306a(c);
    }

    /* renamed from: a */
    public void m306a(C0518b c0518b) {
        if (c0518b != null) {
            if (f326g != null) {
                C0073f c0073f = f326g;
                c0073f.f353f++;
                if (c0518b.f1814e) {
                    c0073f = f326g;
                    c0073f.f354g++;
                }
            }
            if (this.f332e + 1 >= this.f339n || this.f331d + 1 >= this.f337l) {
                m300h();
            }
            Object obj = null;
            if (!c0518b.f1814e) {
                m298c(c0518b);
                if (!c0518b.m2063e()) {
                    c0518b.m2061d();
                    if (c0518b.m2051a(this)) {
                        C0077h e = m321e();
                        c0518b.f1810a = e;
                        m299d(c0518b);
                        this.f343r.mo27a(c0518b);
                        m292a(this.f343r, true);
                        if (e.f386b == -1) {
                            if (c0518b.f1810a == e) {
                                e = c0518b.m2056b(e);
                                if (e != null) {
                                    if (f326g != null) {
                                        C0073f c0073f2 = f326g;
                                        c0073f2.f357j++;
                                    }
                                    c0518b.m2060c(e);
                                }
                            }
                            if (!c0518b.f1814e) {
                                c0518b.f1810a.m332c(c0518b);
                            }
                            this.f332e--;
                        }
                        obj = 1;
                    }
                    if (!c0518b.m2050a()) {
                        return;
                    }
                }
                return;
            }
            if (obj == null) {
                m299d(c0518b);
            }
        }
    }

    /* renamed from: a */
    void m307a(C0518b c0518b, int i, int i2) {
        c0518b.m2058c(m303a(i2, null), i);
    }

    /* renamed from: a */
    void m308a(C0071a c0071a) {
        if (f326g != null) {
            C0073f c0073f = f326g;
            c0073f.f367t++;
            f326g.f368u = Math.max(f326g.f368u, (long) this.f331d);
            f326g.f369v = Math.max(f326g.f369v, (long) this.f332e);
        }
        m298c((C0518b) c0071a);
        m296b(c0071a);
        m292a(c0071a, false);
        m302j();
    }

    /* renamed from: a */
    public void m309a(C0077h c0077h, int i) {
        C0518b c0518b;
        int i2 = c0077h.f386b;
        if (c0077h.f386b != -1) {
            c0518b = this.f329b[i2];
            if (!c0518b.f1814e) {
                if (c0518b.f1813d.f312a == 0) {
                    c0518b.f1814e = true;
                } else {
                    c0518b = m318c();
                    c0518b.m2053b(c0077h, i);
                }
            }
            c0518b.f1811b = (float) i;
            return;
        }
        c0518b = m318c();
        c0518b.m2042a(c0077h, i);
        m306a(c0518b);
    }

    /* renamed from: a */
    public void m310a(C0077h c0077h, C0077h c0077h2, int i, float f, C0077h c0077h3, C0077h c0077h4, int i2, int i3) {
        C0072e c0072e = this;
        int i4 = i3;
        C0518b c = m318c();
        c.m2044a(c0077h, c0077h2, i, f, c0077h3, c0077h4, i2);
        if (i4 != 6) {
            c.m2041a(this, i4);
        }
        m306a(c);
    }

    /* renamed from: a */
    public void m311a(C0077h c0077h, C0077h c0077h2, int i, int i2) {
        C0518b c = m318c();
        C0077h d = m320d();
        d.f387c = 0;
        c.m2046a(c0077h, c0077h2, d, i);
        if (i2 != 6) {
            m307a(c, (int) (c.f1813d.m285b(d) * -1.0f), i2);
        }
        m306a(c);
    }

    /* renamed from: a */
    public void m312a(C0077h c0077h, C0077h c0077h2, C0077h c0077h3, C0077h c0077h4, float f, int i) {
        C0518b c = m318c();
        c.m2047a(c0077h, c0077h2, c0077h3, c0077h4, f);
        if (i != 6) {
            c.m2041a(this, i);
        }
        m306a(c);
    }

    /* renamed from: a */
    public void m313a(C0077h c0077h, C0077h c0077h2, boolean z) {
        C0518b c = m318c();
        C0077h d = m320d();
        d.f387c = 0;
        c.m2046a(c0077h, c0077h2, d, 0);
        if (z) {
            m307a(c, (int) (c.f1813d.m285b(d) * -1.0f), 1);
        }
        m306a(c);
    }

    /* renamed from: b */
    public int m314b(Object obj) {
        C0077h b = ((C0058e) obj).m155b();
        return b != null ? (int) (b.f388d + 0.5f) : 0;
    }

    /* renamed from: b */
    public void m315b() {
        int i;
        for (C0077h c0077h : this.f333f.f325c) {
            if (c0077h != null) {
                c0077h.m330b();
            }
        }
        this.f333f.f324b.mo32a(this.f340o, this.f341p);
        this.f341p = 0;
        Arrays.fill(this.f333f.f325c, null);
        if (this.f334i != null) {
            this.f334i.clear();
        }
        this.f328a = 0;
        this.f335j.mo29f();
        this.f331d = 1;
        for (i = 0; i < this.f332e; i++) {
            this.f329b[i].f1812c = false;
        }
        m301i();
        this.f332e = 0;
    }

    /* renamed from: b */
    public void m316b(C0077h c0077h, C0077h c0077h2, int i, int i2) {
        C0518b c = m318c();
        C0077h d = m320d();
        d.f387c = 0;
        c.m2054b(c0077h, c0077h2, d, i);
        if (i2 != 6) {
            m307a(c, (int) (c.f1813d.m285b(d) * -1.0f), i2);
        }
        m306a(c);
    }

    /* renamed from: b */
    public void m317b(C0077h c0077h, C0077h c0077h2, boolean z) {
        C0518b c = m318c();
        C0077h d = m320d();
        d.f387c = 0;
        c.m2054b(c0077h, c0077h2, d, 0);
        if (z) {
            m307a(c, (int) (c.f1813d.m285b(d) * -1.0f), 1);
        }
        m306a(c);
    }

    /* renamed from: c */
    public C0518b m318c() {
        C0518b c0518b = (C0518b) this.f333f.f323a.mo31a();
        if (c0518b == null) {
            c0518b = new C0518b(this.f333f);
        } else {
            c0518b.m2059c();
        }
        C0077h.m327a();
        return c0518b;
    }

    /* renamed from: c */
    public C0518b m319c(C0077h c0077h, C0077h c0077h2, int i, int i2) {
        C0518b c = m318c();
        c.m2043a(c0077h, c0077h2, i);
        if (i2 != 6) {
            c.m2041a(this, i2);
        }
        m306a(c);
        return c;
    }

    /* renamed from: d */
    public C0077h m320d() {
        if (f326g != null) {
            C0073f c0073f = f326g;
            c0073f.f361n++;
        }
        if (this.f331d + 1 >= this.f337l) {
            m300h();
        }
        C0077h a = m295a(C0076a.SLACK, null);
        this.f328a++;
        this.f331d++;
        a.f385a = this.f328a;
        this.f333f.f325c[this.f328a] = a;
        return a;
    }

    /* renamed from: e */
    public C0077h m321e() {
        if (f326g != null) {
            C0073f c0073f = f326g;
            c0073f.f362o++;
        }
        if (this.f331d + 1 >= this.f337l) {
            m300h();
        }
        C0077h a = m295a(C0076a.SLACK, null);
        this.f328a++;
        this.f331d++;
        a.f385a = this.f328a;
        this.f333f.f325c[this.f328a] = a;
        return a;
    }

    /* renamed from: f */
    public void m322f() {
        if (f326g != null) {
            C0073f c0073f = f326g;
            c0073f.f352e++;
        }
        if (this.f330c) {
            if (f326g != null) {
                c0073f = f326g;
                c0073f.f365r++;
            }
            Object obj = null;
            for (int i = 0; i < this.f332e; i++) {
                if (!this.f329b[i].f1814e) {
                    break;
                }
            }
            obj = 1;
            if (obj != null) {
                if (f326g != null) {
                    c0073f = f326g;
                    c0073f.f364q++;
                }
                m302j();
                return;
            }
        }
        m308a(this.f335j);
    }

    /* renamed from: g */
    public C0070c m323g() {
        return this.f333f;
    }
}
