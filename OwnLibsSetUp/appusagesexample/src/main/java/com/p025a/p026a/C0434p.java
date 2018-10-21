package com.p025a.p026a;

import com.p025a.p026a.C0417b.C0416a;

/* renamed from: com.a.a.p */
public class C0434p<T> {
    /* renamed from: a */
    public final T f1545a;
    /* renamed from: b */
    public final C0416a f1546b;
    /* renamed from: c */
    public final C0437u f1547c;
    /* renamed from: d */
    public boolean f1548d;

    /* renamed from: com.a.a.p$a */
    public interface C0432a {
        /* renamed from: a */
        void mo417a(C0437u c0437u);
    }

    /* renamed from: com.a.a.p$b */
    public interface C0433b<T> {
        /* renamed from: a */
        void mo416a(T t);
    }

    private C0434p(C0437u c0437u) {
        this.f1548d = false;
        this.f1545a = null;
        this.f1546b = null;
        this.f1547c = c0437u;
    }

    private C0434p(T t, C0416a c0416a) {
        this.f1548d = false;
        this.f1545a = t;
        this.f1546b = c0416a;
        this.f1547c = null;
    }

    /* renamed from: a */
    public static <T> C0434p<T> m1717a(C0437u c0437u) {
        return new C0434p(c0437u);
    }

    /* renamed from: a */
    public static <T> C0434p<T> m1718a(T t, C0416a c0416a) {
        return new C0434p(t, c0416a);
    }

    /* renamed from: a */
    public boolean m1719a() {
        return this.f1547c == null;
    }
}
