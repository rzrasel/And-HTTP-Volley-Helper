package com.p028b.p029a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.b.a.i */
public final class C0714i extends C0487l implements Iterable<C0487l> {
    /* renamed from: a */
    private final List<C0487l> f2580a = new ArrayList();

    /* renamed from: a */
    public Number mo402a() {
        if (this.f2580a.size() == 1) {
            return ((C0487l) this.f2580a.get(0)).mo402a();
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public void m3288a(C0487l c0487l) {
        Object obj;
        if (c0487l == null) {
            obj = C0716n.f2581a;
        }
        this.f2580a.add(obj);
    }

    /* renamed from: b */
    public String mo403b() {
        if (this.f2580a.size() == 1) {
            return ((C0487l) this.f2580a.get(0)).mo403b();
        }
        throw new IllegalStateException();
    }

    /* renamed from: c */
    public double mo404c() {
        if (this.f2580a.size() == 1) {
            return ((C0487l) this.f2580a.get(0)).mo404c();
        }
        throw new IllegalStateException();
    }

    /* renamed from: d */
    public long mo405d() {
        if (this.f2580a.size() == 1) {
            return ((C0487l) this.f2580a.get(0)).mo405d();
        }
        throw new IllegalStateException();
    }

    /* renamed from: e */
    public int mo406e() {
        if (this.f2580a.size() == 1) {
            return ((C0487l) this.f2580a.get(0)).mo406e();
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C0714i) || !((C0714i) obj).f2580a.equals(this.f2580a)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean mo407f() {
        if (this.f2580a.size() == 1) {
            return ((C0487l) this.f2580a.get(0)).mo407f();
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        return this.f2580a.hashCode();
    }

    public Iterator<C0487l> iterator() {
        return this.f2580a.iterator();
    }
}
