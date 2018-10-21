package com.p028b.p029a.p031b.p032a;

import com.p028b.p029a.C0482f;
import com.p028b.p029a.C0492v;
import com.p028b.p029a.C0493w;
import com.p028b.p029a.p031b.C0458b;
import com.p028b.p029a.p035c.C0475a;
import com.p028b.p029a.p036d.C0477a;
import com.p028b.p029a.p036d.C0478b;
import com.p028b.p029a.p036d.C0479c;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.b.a.b.a.a */
public final class C0653a<E> extends C0492v<Object> {
    /* renamed from: a */
    public static final C0493w f2449a = new C06521();
    /* renamed from: b */
    private final Class<E> f2450b;
    /* renamed from: c */
    private final C0492v<E> f2451c;

    /* renamed from: com.b.a.b.a.a$1 */
    static class C06521 implements C0493w {
        C06521() {
        }

        /* renamed from: a */
        public <T> C0492v<T> mo362a(C0482f c0482f, C0475a<T> c0475a) {
            Type b = c0475a.m1823b();
            if (!(b instanceof GenericArrayType) && (!(b instanceof Class) || !((Class) b).isArray())) {
                return null;
            }
            b = C0458b.m1778g(b);
            return new C0653a(c0482f, c0482f.m1892a(C0475a.m1818a(b)), C0458b.m1776e(b));
        }
    }

    public C0653a(C0482f c0482f, C0492v<E> c0492v, Class<E> cls) {
        this.f2451c = new C0674m(c0482f, c0492v, cls);
        this.f2450b = cls;
    }

    /* renamed from: a */
    public void mo360a(C0479c c0479c, Object obj) {
        if (obj == null) {
            c0479c.mo393f();
            return;
        }
        c0479c.mo387b();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f2451c.mo360a(c0479c, Array.get(obj, i));
        }
        c0479c.mo389c();
    }

    /* renamed from: b */
    public Object mo361b(C0477a c0477a) {
        if (c0477a.mo369f() == C0478b.NULL) {
            c0477a.mo373j();
            return null;
        }
        List arrayList = new ArrayList();
        c0477a.mo363a();
        while (c0477a.mo368e()) {
            arrayList.add(this.f2451c.mo361b(c0477a));
        }
        c0477a.mo364b();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.f2450b, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }
}
