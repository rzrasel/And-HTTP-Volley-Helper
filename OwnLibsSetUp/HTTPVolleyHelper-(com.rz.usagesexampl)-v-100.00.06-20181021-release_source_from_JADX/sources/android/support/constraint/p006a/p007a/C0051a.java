package android.support.constraint.p006a.p007a;

import android.support.constraint.p006a.p007a.C0058e.C0057c;
import android.support.constraint.p006a.p007a.C0061f.C0060a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.constraint.a.a.a */
public class C0051a {
    /* renamed from: a */
    private static int m133a(C0061f c0061f) {
        int r;
        if (c0061f.m172F() == C0060a.MATCH_CONSTRAINT) {
            r = (int) (c0061f.f243H == 0 ? ((float) c0061f.m238r()) * c0061f.f242G : ((float) c0061f.m238r()) / c0061f.f242G);
            c0061f.m223j(r);
            return r;
        } else if (c0061f.m173G() != C0060a.MATCH_CONSTRAINT) {
            return -1;
        } else {
            r = (int) (c0061f.f243H == 1 ? ((float) c0061f.m234p()) * c0061f.f242G : ((float) c0061f.m234p()) / c0061f.f242G);
            c0061f.m225k(r);
            return r;
        }
    }

    /* renamed from: a */
    private static int m134a(C0061f c0061f, int i) {
        int i2 = i * 2;
        C0058e c0058e = c0061f.f236A[i2];
        C0058e c0058e2 = c0061f.f236A[i2 + 1];
        if (c0058e.f220c == null || c0058e.f220c.f218a != c0061f.f239D || c0058e2.f220c == null || c0058e2.f220c.f218a != c0061f.f239D) {
            return 0;
        }
        return (int) (((float) (((c0061f.f239D.m214f(i) - c0058e.m158e()) - c0058e2.m158e()) - c0061f.m214f(i))) * (i == 0 ? c0061f.f253S : c0061f.f254T));
    }

    /* renamed from: a */
    private static int m135a(C0061f c0061f, int i, boolean z, int i2) {
        C0061f c0061f2 = c0061f;
        int i3 = i;
        boolean z2 = z;
        int i4 = 0;
        if (!c0061f2.f257W) {
            return 0;
        }
        int A;
        int r;
        int i5;
        int i6;
        int i7;
        int i8;
        Object obj = (c0061f2.f283w.f220c == null || i3 != 1) ? null : 1;
        if (z2) {
            A = c0061f.m167A();
            r = c0061f.m238r() - c0061f.m167A();
            i5 = i3 * 2;
            i6 = i5 + 1;
        } else {
            A = c0061f.m238r() - c0061f.m167A();
            r = c0061f.m167A();
            i6 = i3 * 2;
            i5 = i6 + 1;
        }
        if (c0061f2.f236A[i6].f220c == null || c0061f2.f236A[i5].f220c != null) {
            i7 = i6;
            i6 = 1;
        } else {
            i7 = i5;
            i5 = i6;
            i6 = -1;
        }
        int e = (c0061f2.f236A[i5].m158e() * i6) + C0051a.m134a(c0061f, i);
        int i9 = (obj != null ? i2 - A : i2) + e;
        int p = (i3 == 0 ? c0061f.m234p() : c0061f.m238r()) * i6;
        Iterator it = c0061f2.f236A[i5].m150a().h.iterator();
        while (it.hasNext()) {
            i4 = Math.max(i4, C0051a.m135a(((C0515m) ((C0066o) it.next())).f1796a.f218a, i3, z2, i9));
        }
        Iterator it2 = c0061f2.f236A[i7].m150a().h.iterator();
        int i10 = 0;
        while (it2.hasNext()) {
            Iterator it3 = it2;
            i10 = Math.max(i10, C0051a.m135a(((C0515m) ((C0066o) it2.next())).f1796a.f218a, i3, z2, p + i9));
            it2 = it3;
        }
        if (obj != null) {
            i4 -= A;
            i10 += r;
        } else {
            i10 += (i3 == 0 ? c0061f.m234p() : c0061f.m238r()) * i6;
        }
        int i11 = 1;
        int i12;
        if (i3 == 1) {
            it2 = c0061f2.f283w.m150a().h.iterator();
            int i13 = 0;
            while (it2.hasNext()) {
                Iterator it4 = it2;
                C0515m c0515m = (C0515m) ((C0066o) it2.next());
                if (i6 == i11) {
                    i13 = Math.max(i13, C0051a.m135a(c0515m.f1796a.f218a, i3, z2, A + i9));
                    i12 = i7;
                } else {
                    i12 = i7;
                    i13 = Math.max(i13, C0051a.m135a(c0515m.f1796a.f218a, i3, z2, (r * i6) + i9));
                }
                it2 = it4;
                i7 = i12;
                i11 = 1;
            }
            i12 = i7;
            i11 = i13;
            i8 = (c0061f2.f283w.m150a().h.size() <= 0 || obj != null) ? i11 : i6 == 1 ? i11 + A : i11 - r;
        } else {
            i12 = i7;
            i8 = 0;
        }
        e += Math.max(i4, Math.max(i10, i8));
        i8 = i9 + p;
        if (i6 == -1) {
            int i14 = i9;
            i9 = i8;
            i8 = i14;
        }
        if (z2) {
            C0064k.m258a(c0061f2, i3, i9);
            c0061f2.m179a(i9, i8, i3);
        } else {
            c0061f2.f278r.m254a(c0061f2, i3);
            c0061f2.m212e(i9, i3);
        }
        if (c0061f.m243t(i) == C0060a.MATCH_CONSTRAINT && c0061f2.f242G != 0.0f) {
            c0061f2.f278r.m254a(c0061f2, i3);
        }
        if (!(c0061f2.f236A[i5].f220c == null || c0061f2.f236A[r21].f220c == null)) {
            C0061f k = c0061f.m224k();
            if (c0061f2.f236A[i5].f220c.f218a == k && c0061f2.f236A[r21].f220c.f218a == k) {
                c0061f2.f278r.m254a(c0061f2, i3);
            }
        }
        return e;
    }

    /* renamed from: a */
    private static int m136a(C0062h c0062h, int i) {
        int i2 = i * 2;
        List a = c0062h.m253a(i);
        int size = a.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            boolean z;
            C0061f c0061f = (C0061f) a.get(i4);
            int i5 = i2 + 1;
            if (c0061f.f236A[i5].f220c != null) {
                if (c0061f.f236A[i2].f220c == null || c0061f.f236A[i5].f220c == null) {
                    z = false;
                    i3 = Math.max(i3, C0051a.m135a(c0061f, i, z, 0));
                }
            }
            z = true;
            i3 = Math.max(i3, C0051a.m135a(c0061f, i, z, 0));
        }
        c0062h.f291e[i] = i3;
        return i3;
    }

    /* renamed from: a */
    private static void m137a(C0058e c0058e) {
        C0066o a = c0058e.m150a();
        if (c0058e.f220c != null && c0058e.f220c.f220c != c0058e) {
            c0058e.f220c.m150a().m263a(a);
        }
    }

    /* renamed from: a */
    private static void m138a(C0061f c0061f, int i, int i2) {
        int i3 = i * 2;
        C0058e c0058e = c0061f.f236A[i3];
        C0058e c0058e2 = c0061f.f236A[i3 + 1];
        Object obj = (c0058e.f220c == null || c0058e2.f220c == null) ? null : 1;
        if (obj != null) {
            C0064k.m258a(c0061f, i, C0051a.m134a(c0061f, i) + c0058e.m158e());
        } else if (c0061f.f242G == 0.0f || c0061f.m243t(i) != C0060a.MATCH_CONSTRAINT) {
            i2 -= c0061f.m235p(i);
            i3 = i2 - c0061f.m214f(i);
            c0061f.m179a(i3, i2, i);
            C0064k.m258a(c0061f, i, i3);
        } else {
            i2 = C0051a.m133a(c0061f);
            i3 = (int) c0061f.f236A[i3].m150a().f1801f;
            int i4 = i3 + i2;
            c0058e2.m150a().f1800e = c0058e.m150a();
            c0058e2.m150a().f1801f = (float) i2;
            c0058e2.m150a().i = 1;
            c0061f.m179a(i3, i4, i);
        }
    }

    /* renamed from: a */
    public static void m139a(C0732g c0732g) {
        if ((c0732g.mo13J() & 32) != 32) {
            C0051a.m144b(c0732g);
            return;
        }
        boolean z;
        int i;
        int i2;
        c0732g.ax = true;
        c0732g.as = false;
        c0732g.at = false;
        c0732g.au = false;
        List<C0061f> list = c0732g.az;
        List<C0062h> list2 = c0732g.ar;
        Object obj = c0732g.m172F() == C0060a.WRAP_CONTENT ? 1 : null;
        Object obj2 = c0732g.m173G() == C0060a.WRAP_CONTENT ? 1 : null;
        if (obj == null) {
            if (obj2 == null) {
                z = false;
                list2.clear();
                for (C0061f c0061f : list) {
                    c0061f.f278r = null;
                    c0061f.f259Y = false;
                    c0061f.mo442b();
                }
                for (C0061f c0061f2 : list) {
                    if (c0061f2.f278r != null && !C0051a.m143a(c0061f2, (List) list2, r6)) {
                        C0051a.m144b(c0732g);
                        c0732g.ax = false;
                        return;
                    }
                }
                i = 0;
                i2 = 0;
                for (C0062h c0062h : list2) {
                    i = Math.max(i, C0051a.m136a(c0062h, 0));
                    i2 = Math.max(i2, C0051a.m136a(c0062h, 1));
                }
                if (obj != null) {
                    c0732g.m183a(C0060a.FIXED);
                    c0732g.m223j(i);
                    c0732g.as = true;
                    c0732g.at = true;
                    c0732g.av = i;
                }
                if (obj2 != null) {
                    c0732g.m197b(C0060a.FIXED);
                    c0732g.m225k(i2);
                    c0732g.as = true;
                    c0732g.au = true;
                    c0732g.aw = i2;
                }
                C0051a.m141a((List) list2, 0, c0732g.m234p());
                C0051a.m141a((List) list2, 1, c0732g.m238r());
            }
        }
        z = true;
        list2.clear();
        for (C0061f c0061f3 : list) {
            c0061f3.f278r = null;
            c0061f3.f259Y = false;
            c0061f3.mo442b();
        }
        for (C0061f c0061f22 : list) {
            if (c0061f22.f278r != null) {
            }
        }
        i = 0;
        i2 = 0;
        for (C0062h c0062h2 : list2) {
            i = Math.max(i, C0051a.m136a(c0062h2, 0));
            i2 = Math.max(i2, C0051a.m136a(c0062h2, 1));
        }
        if (obj != null) {
            c0732g.m183a(C0060a.FIXED);
            c0732g.m223j(i);
            c0732g.as = true;
            c0732g.at = true;
            c0732g.av = i;
        }
        if (obj2 != null) {
            c0732g.m197b(C0060a.FIXED);
            c0732g.m225k(i2);
            c0732g.as = true;
            c0732g.au = true;
            c0732g.aw = i2;
        }
        C0051a.m141a((List) list2, 0, c0732g.m234p());
        C0051a.m141a((List) list2, 1, c0732g.m238r());
    }

    /* renamed from: a */
    private static void m140a(C0732g c0732g, C0061f c0061f, C0062h c0062h) {
        c0062h.f290d = false;
        c0732g.ax = false;
        c0061f.f257W = false;
    }

    /* renamed from: a */
    public static void m141a(List<C0062h> list, int i, int i2) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            for (C0061f c0061f : ((C0062h) list.get(i3)).m255b(i)) {
                if (c0061f.f257W) {
                    C0051a.m138a(c0061f, i, i2);
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m142a(C0061f c0061f, C0062h c0062h, List<C0062h> list, boolean z) {
        if (c0061f == null) {
            return true;
        }
        c0061f.f258X = false;
        C0732g c0732g = (C0732g) c0061f.m224k();
        if (c0061f.f278r == null) {
            C0060a G;
            C0060a c0060a;
            int i;
            c0061f.f257W = true;
            c0062h.f287a.add(c0061f);
            c0061f.f278r = c0062h;
            if (c0061f.f279s.f220c == null && c0061f.f281u.f220c == null && c0061f.f280t.f220c == null && c0061f.f282v.f220c == null && c0061f.f283w.f220c == null && c0061f.f286z.f220c == null) {
                C0051a.m140a(c0732g, c0061f, c0062h);
                if (z) {
                    return false;
                }
            }
            if (!(c0061f.f280t.f220c == null || c0061f.f282v.f220c == null)) {
                G = c0732g.m173G();
                c0060a = C0060a.WRAP_CONTENT;
                if (z) {
                    C0051a.m140a(c0732g, c0061f, c0062h);
                    return false;
                } else if (!(c0061f.f280t.f220c.f218a == c0061f.m224k() && c0061f.f282v.f220c.f218a == c0061f.m224k())) {
                    C0051a.m140a(c0732g, c0061f, c0062h);
                }
            }
            if (!(c0061f.f279s.f220c == null || c0061f.f281u.f220c == null)) {
                G = c0732g.m172F();
                c0060a = C0060a.WRAP_CONTENT;
                if (z) {
                    C0051a.m140a(c0732g, c0061f, c0062h);
                    return false;
                } else if (!(c0061f.f279s.f220c.f218a == c0061f.m224k() && c0061f.f281u.f220c.f218a == c0061f.m224k())) {
                    C0051a.m140a(c0732g, c0061f, c0062h);
                }
            }
            if (((c0061f.m172F() == C0060a.MATCH_CONSTRAINT ? 1 : 0) ^ (c0061f.m173G() == C0060a.MATCH_CONSTRAINT ? 1 : 0)) != 0 && c0061f.f242G != 0.0f) {
                C0051a.m133a(c0061f);
            } else if (c0061f.m172F() == C0060a.MATCH_CONSTRAINT || c0061f.m173G() == C0060a.MATCH_CONSTRAINT) {
                C0051a.m140a(c0732g, c0061f, c0062h);
                if (z) {
                    return false;
                }
            }
            if (((c0061f.f279s.f220c == null && c0061f.f281u.f220c == null) || ((c0061f.f279s.f220c != null && c0061f.f279s.f220c.f218a == c0061f.f239D && c0061f.f281u.f220c == null) || ((c0061f.f281u.f220c != null && c0061f.f281u.f220c.f218a == c0061f.f239D && c0061f.f279s.f220c == null) || (c0061f.f279s.f220c != null && c0061f.f279s.f220c.f218a == c0061f.f239D && c0061f.f281u.f220c != null && c0061f.f281u.f220c.f218a == c0061f.f239D)))) && c0061f.f286z.f220c == null && !(c0061f instanceof C0513i) && !(c0061f instanceof C0514j)) {
                c0062h.f292f.add(c0061f);
            }
            if (((c0061f.f280t.f220c == null && c0061f.f282v.f220c == null) || ((c0061f.f280t.f220c != null && c0061f.f280t.f220c.f218a == c0061f.f239D && c0061f.f282v.f220c == null) || ((c0061f.f282v.f220c != null && c0061f.f282v.f220c.f218a == c0061f.f239D && c0061f.f280t.f220c == null) || (c0061f.f280t.f220c != null && c0061f.f280t.f220c.f218a == c0061f.f239D && c0061f.f282v.f220c != null && c0061f.f282v.f220c.f218a == c0061f.f239D)))) && c0061f.f286z.f220c == null && c0061f.f283w.f220c == null && !(c0061f instanceof C0513i) && !(c0061f instanceof C0514j)) {
                c0062h.f293g.add(c0061f);
            }
            if (c0061f instanceof C0514j) {
                C0051a.m140a(c0732g, c0061f, c0062h);
                if (z) {
                    return false;
                }
                C0514j c0514j = (C0514j) c0061f;
                for (i = 0; i < c0514j.aj; i++) {
                    if (!C0051a.m142a(c0514j.ai[i], c0062h, (List) list, z)) {
                        return false;
                    }
                }
            }
            for (C0058e c0058e : c0061f.f236A) {
                if (!(c0058e.f220c == null || c0058e.f220c.f218a == c0061f.m224k())) {
                    if (c0058e.f219b == C0057c.CENTER) {
                        C0051a.m140a(c0732g, c0061f, c0062h);
                        if (z) {
                            return false;
                        }
                    }
                    C0051a.m137a(c0058e);
                    if (!C0051a.m142a(c0058e.f220c.f218a, c0062h, (List) list, z)) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (c0061f.f278r != c0062h) {
            c0062h.f287a.addAll(c0061f.f278r.f287a);
            c0062h.f292f.addAll(c0061f.f278r.f292f);
            c0062h.f293g.addAll(c0061f.f278r.f293g);
            if (!c0061f.f278r.f290d) {
                c0062h.f290d = false;
            }
            list.remove(c0061f.f278r);
            for (C0061f c0061f2 : c0061f.f278r.f287a) {
                c0061f2.f278r = c0062h;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m143a(C0061f c0061f, List<C0062h> list, boolean z) {
        C0062h c0062h = new C0062h(new ArrayList(), true);
        list.add(c0062h);
        return C0051a.m142a(c0061f, c0062h, (List) list, z);
    }

    /* renamed from: b */
    private static void m144b(C0732g c0732g) {
        c0732g.ar.clear();
        c0732g.ar.add(0, new C0062h(c0732g.az));
    }
}
