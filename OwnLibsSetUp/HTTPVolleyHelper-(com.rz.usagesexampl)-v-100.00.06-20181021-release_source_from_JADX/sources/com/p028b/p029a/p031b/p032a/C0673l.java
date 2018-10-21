package com.p028b.p029a.p031b.p032a;

import com.p028b.p029a.C0482f;
import com.p028b.p029a.C0485j;
import com.p028b.p029a.C0486k;
import com.p028b.p029a.C0487l;
import com.p028b.p029a.C0489r;
import com.p028b.p029a.C0490s;
import com.p028b.p029a.C0492v;
import com.p028b.p029a.C0493w;
import com.p028b.p029a.p031b.C0472l;
import com.p028b.p029a.p035c.C0475a;
import com.p028b.p029a.p036d.C0477a;
import com.p028b.p029a.p036d.C0479c;

/* renamed from: com.b.a.b.a.l */
public final class C0673l<T> extends C0492v<T> {
    /* renamed from: a */
    final C0482f f2496a;
    /* renamed from: b */
    private final C0490s<T> f2497b;
    /* renamed from: c */
    private final C0486k<T> f2498c;
    /* renamed from: d */
    private final C0475a<T> f2499d;
    /* renamed from: e */
    private final C0493w f2500e;
    /* renamed from: f */
    private final C0672a f2501f = new C0672a();
    /* renamed from: g */
    private C0492v<T> f2502g;

    /* renamed from: com.b.a.b.a.l$a */
    private final class C0672a implements C0485j, C0489r {
        /* renamed from: a */
        final /* synthetic */ C0673l f2495a;

        private C0672a(C0673l c0673l) {
            this.f2495a = c0673l;
        }
    }

    public C0673l(C0490s<T> c0490s, C0486k<T> c0486k, C0482f c0482f, C0475a<T> c0475a, C0493w c0493w) {
        this.f2497b = c0490s;
        this.f2498c = c0486k;
        this.f2496a = c0482f;
        this.f2499d = c0475a;
        this.f2500e = c0493w;
    }

    /* renamed from: b */
    private C0492v<T> m3087b() {
        C0492v<T> c0492v = this.f2502g;
        if (c0492v != null) {
            return c0492v;
        }
        c0492v = this.f2496a.m1893a(this.f2500e, this.f2499d);
        this.f2502g = c0492v;
        return c0492v;
    }

    /* renamed from: a */
    public void mo360a(C0479c c0479c, T t) {
        if (this.f2497b == null) {
            m3087b().mo360a(c0479c, t);
        } else if (t == null) {
            c0479c.mo393f();
        } else {
            C0472l.m1812a(this.f2497b.m1916a(t, this.f2499d.m1823b(), this.f2501f), c0479c);
        }
    }

    /* renamed from: b */
    public T mo361b(C0477a c0477a) {
        if (this.f2498c == null) {
            return m3087b().mo361b(c0477a);
        }
        C0487l a = C0472l.m1811a(c0477a);
        return a.m1911j() ? null : this.f2498c.m1901a(a, this.f2499d.m1823b(), this.f2501f);
    }
}
