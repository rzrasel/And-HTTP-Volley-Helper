package com.p028b.p029a.p031b.p032a;

import com.p028b.p029a.C0482f;
import com.p028b.p029a.C0492v;
import com.p028b.p029a.p031b.p032a.C0667i.C0666a;
import com.p028b.p029a.p035c.C0475a;
import com.p028b.p029a.p036d.C0477a;
import com.p028b.p029a.p036d.C0479c;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: com.b.a.b.a.m */
final class C0674m<T> extends C0492v<T> {
    /* renamed from: a */
    private final C0482f f2503a;
    /* renamed from: b */
    private final C0492v<T> f2504b;
    /* renamed from: c */
    private final Type f2505c;

    C0674m(C0482f c0482f, C0492v<T> c0492v, Type type) {
        this.f2503a = c0482f;
        this.f2504b = c0492v;
        this.f2505c = type;
    }

    /* renamed from: a */
    private Type m3090a(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    /* renamed from: a */
    public void mo360a(C0479c c0479c, T t) {
        C0492v c0492v = this.f2504b;
        Type a = m3090a(this.f2505c, (Object) t);
        if (a != this.f2505c) {
            c0492v = this.f2503a.m1892a(C0475a.m1818a(a));
            if (c0492v instanceof C0666a) {
                if (!(this.f2504b instanceof C0666a)) {
                    c0492v = this.f2504b;
                }
            }
        }
        c0492v.mo360a(c0479c, t);
    }

    /* renamed from: b */
    public T mo361b(C0477a c0477a) {
        return this.f2504b.mo361b(c0477a);
    }
}
