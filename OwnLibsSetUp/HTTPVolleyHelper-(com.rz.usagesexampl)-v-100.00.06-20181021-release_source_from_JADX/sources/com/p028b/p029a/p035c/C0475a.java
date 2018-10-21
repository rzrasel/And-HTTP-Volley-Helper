package com.p028b.p029a.p035c;

import com.p028b.p029a.p031b.C0453a;
import com.p028b.p029a.p031b.C0458b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: com.b.a.c.a */
public class C0475a<T> {
    /* renamed from: a */
    final Class<? super T> f1656a;
    /* renamed from: b */
    final Type f1657b;
    /* renamed from: c */
    final int f1658c;

    protected C0475a() {
        this.f1657b = C0475a.m1820a(getClass());
        this.f1656a = C0458b.m1776e(this.f1657b);
        this.f1658c = this.f1657b.hashCode();
    }

    C0475a(Type type) {
        this.f1657b = C0458b.m1775d((Type) C0453a.m1755a((Object) type));
        this.f1656a = C0458b.m1776e(this.f1657b);
        this.f1658c = this.f1657b.hashCode();
    }

    /* renamed from: a */
    public static C0475a<?> m1818a(Type type) {
        return new C0475a(type);
    }

    /* renamed from: a */
    public static C0475a<?> m1819a(Type type, Type... typeArr) {
        return new C0475a(C0458b.m1763a(null, type, typeArr));
    }

    /* renamed from: a */
    static Type m1820a(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return C0458b.m1775d(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    /* renamed from: b */
    public static <T> C0475a<T> m1821b(Class<T> cls) {
        return new C0475a(cls);
    }

    /* renamed from: a */
    public final Class<? super T> m1822a() {
        return this.f1656a;
    }

    /* renamed from: b */
    public final Type m1823b() {
        return this.f1657b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0475a) && C0458b.m1770a(this.f1657b, ((C0475a) obj).f1657b);
    }

    public final int hashCode() {
        return this.f1658c;
    }

    public final String toString() {
        return C0458b.m1777f(this.f1657b);
    }
}
