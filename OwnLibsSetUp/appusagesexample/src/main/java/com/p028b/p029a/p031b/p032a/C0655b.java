package com.p028b.p029a.p031b.p032a;

import com.p028b.p029a.C0482f;
import com.p028b.p029a.C0492v;
import com.p028b.p029a.C0493w;
import com.p028b.p029a.p031b.C0458b;
import com.p028b.p029a.p031b.C0459c;
import com.p028b.p029a.p031b.C0469i;
import com.p028b.p029a.p035c.C0475a;
import com.p028b.p029a.p036d.C0477a;
import com.p028b.p029a.p036d.C0478b;
import com.p028b.p029a.p036d.C0479c;
import java.lang.reflect.Type;
import java.util.Collection;

/* renamed from: com.b.a.b.a.b */
public final class C0655b implements C0493w {
    /* renamed from: a */
    private final C0459c f2454a;

    /* renamed from: com.b.a.b.a.b$a */
    private static final class C0654a<E> extends C0492v<Collection<E>> {
        /* renamed from: a */
        private final C0492v<E> f2452a;
        /* renamed from: b */
        private final C0469i<? extends Collection<E>> f2453b;

        public C0654a(C0482f c0482f, Type type, C0492v<E> c0492v, C0469i<? extends Collection<E>> c0469i) {
            this.f2452a = new C0674m(c0482f, c0492v, type);
            this.f2453b = c0469i;
        }

        /* renamed from: a */
        public Collection<E> m3008a(C0477a c0477a) {
            if (c0477a.mo369f() == C0478b.NULL) {
                c0477a.mo373j();
                return null;
            }
            Collection<E> collection = (Collection) this.f2453b.mo399a();
            c0477a.mo363a();
            while (c0477a.mo368e()) {
                collection.add(this.f2452a.mo361b(c0477a));
            }
            c0477a.mo364b();
            return collection;
        }

        /* renamed from: a */
        public void m3010a(C0479c c0479c, Collection<E> collection) {
            if (collection == null) {
                c0479c.mo393f();
                return;
            }
            c0479c.mo387b();
            for (E a : collection) {
                this.f2452a.mo360a(c0479c, a);
            }
            c0479c.mo389c();
        }

        /* renamed from: b */
        public /* synthetic */ Object mo361b(C0477a c0477a) {
            return m3008a(c0477a);
        }
    }

    public C0655b(C0459c c0459c) {
        this.f2454a = c0459c;
    }

    /* renamed from: a */
    public <T> C0492v<T> mo362a(C0482f c0482f, C0475a<T> c0475a) {
        Type b = c0475a.m1823b();
        Class a = c0475a.m1822a();
        if (!Collection.class.isAssignableFrom(a)) {
            return null;
        }
        b = C0458b.m1764a(b, a);
        return new C0654a(c0482f, b, c0482f.m1892a(C0475a.m1818a(b)), this.f2454a.m1783a((C0475a) c0475a));
    }
}
