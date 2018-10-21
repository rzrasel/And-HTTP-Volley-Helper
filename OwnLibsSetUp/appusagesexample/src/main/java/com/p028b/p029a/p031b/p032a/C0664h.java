package com.p028b.p029a.p031b.p032a;

import com.p028b.p029a.C0482f;
import com.p028b.p029a.C0492v;
import com.p028b.p029a.C0493w;
import com.p028b.p029a.p031b.C0468h;
import com.p028b.p029a.p035c.C0475a;
import com.p028b.p029a.p036d.C0477a;
import com.p028b.p029a.p036d.C0479c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.b.a.b.a.h */
public final class C0664h extends C0492v<Object> {
    /* renamed from: a */
    public static final C0493w f2475a = new C06631();
    /* renamed from: b */
    private final C0482f f2476b;

    /* renamed from: com.b.a.b.a.h$1 */
    static class C06631 implements C0493w {
        C06631() {
        }

        /* renamed from: a */
        public <T> C0492v<T> mo362a(C0482f c0482f, C0475a<T> c0475a) {
            return c0475a.m1822a() == Object.class ? new C0664h(c0482f) : null;
        }
    }

    C0664h(C0482f c0482f) {
        this.f2476b = c0482f;
    }

    /* renamed from: a */
    public void mo360a(C0479c c0479c, Object obj) {
        if (obj == null) {
            c0479c.mo393f();
            return;
        }
        C0492v a = this.f2476b.m1894a(obj.getClass());
        if (a instanceof C0664h) {
            c0479c.mo391d();
            c0479c.mo392e();
            return;
        }
        a.mo360a(c0479c, obj);
    }

    /* renamed from: b */
    public Object mo361b(C0477a c0477a) {
        switch (c0477a.mo369f()) {
            case BEGIN_ARRAY:
                List arrayList = new ArrayList();
                c0477a.mo363a();
                while (c0477a.mo368e()) {
                    arrayList.add(mo361b(c0477a));
                }
                c0477a.mo364b();
                return arrayList;
            case BEGIN_OBJECT:
                Map c0468h = new C0468h();
                c0477a.mo365c();
                while (c0477a.mo368e()) {
                    c0468h.put(c0477a.mo370g(), mo361b(c0477a));
                }
                c0477a.mo367d();
                return c0468h;
            case STRING:
                return c0477a.mo371h();
            case NUMBER:
                return Double.valueOf(c0477a.mo374k());
            case BOOLEAN:
                return Boolean.valueOf(c0477a.mo372i());
            case NULL:
                c0477a.mo373j();
                return null;
            default:
                throw new IllegalStateException();
        }
    }
}
