package com.p028b.p029a;

import com.p028b.p029a.p031b.p032a.C0660f;
import com.p028b.p029a.p036d.C0477a;
import com.p028b.p029a.p036d.C0478b;
import com.p028b.p029a.p036d.C0479c;

/* renamed from: com.b.a.v */
public abstract class C0492v<T> {

    /* renamed from: com.b.a.v$1 */
    class C07221 extends C0492v<T> {
        /* renamed from: a */
        final /* synthetic */ C0492v f2585a;

        C07221(C0492v c0492v) {
            this.f2585a = c0492v;
        }

        /* renamed from: a */
        public void mo360a(C0479c c0479c, T t) {
            if (t == null) {
                c0479c.mo393f();
            } else {
                this.f2585a.mo360a(c0479c, t);
            }
        }

        /* renamed from: b */
        public T mo361b(C0477a c0477a) {
            if (c0477a.mo369f() != C0478b.NULL) {
                return this.f2585a.mo361b(c0477a);
            }
            c0477a.mo373j();
            return null;
        }
    }

    /* renamed from: a */
    public final C0487l m1917a(T t) {
        try {
            C0479c c0660f = new C0660f();
            mo360a(c0660f, t);
            return c0660f.mo386a();
        } catch (Throwable e) {
            throw new C0715m(e);
        }
    }

    /* renamed from: a */
    public final C0492v<T> m1918a() {
        return new C07221(this);
    }

    /* renamed from: a */
    public abstract void mo360a(C0479c c0479c, T t);

    /* renamed from: b */
    public abstract T mo361b(C0477a c0477a);
}
