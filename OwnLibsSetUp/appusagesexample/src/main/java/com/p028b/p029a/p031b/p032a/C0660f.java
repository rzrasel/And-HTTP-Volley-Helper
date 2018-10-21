package com.p028b.p029a.p031b.p032a;

import com.p028b.p029a.C0487l;
import com.p028b.p029a.C0714i;
import com.p028b.p029a.C0716n;
import com.p028b.p029a.C0717o;
import com.p028b.p029a.C0718q;
import com.p028b.p029a.p036d.C0479c;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.b.a.b.a.f */
public final class C0660f extends C0479c {
    /* renamed from: a */
    private static final Writer f2464a = new C04481();
    /* renamed from: b */
    private static final C0718q f2465b = new C0718q("closed");
    /* renamed from: c */
    private final List<C0487l> f2466c = new ArrayList();
    /* renamed from: d */
    private String f2467d;
    /* renamed from: e */
    private C0487l f2468e = C0716n.f2581a;

    /* renamed from: com.b.a.b.a.f$1 */
    static class C04481 extends Writer {
        C04481() {
        }

        public void close() {
            throw new AssertionError();
        }

        public void flush() {
            throw new AssertionError();
        }

        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public C0660f() {
        super(f2464a);
    }

    /* renamed from: a */
    private void m3042a(C0487l c0487l) {
        if (this.f2467d != null) {
            if (!c0487l.m1911j() || m1882h()) {
                ((C0717o) m3043i()).m3294a(this.f2467d, c0487l);
            }
            this.f2467d = null;
        } else if (this.f2466c.isEmpty()) {
            this.f2468e = c0487l;
        } else {
            C0487l i = m3043i();
            if (i instanceof C0714i) {
                ((C0714i) i).m3288a(c0487l);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: i */
    private C0487l m3043i() {
        return (C0487l) this.f2466c.get(this.f2466c.size() - 1);
    }

    /* renamed from: a */
    public C0479c mo381a(long j) {
        m3042a(new C0718q(Long.valueOf(j)));
        return this;
    }

    /* renamed from: a */
    public C0479c mo382a(Boolean bool) {
        if (bool == null) {
            return mo393f();
        }
        m3042a(new C0718q(bool));
        return this;
    }

    /* renamed from: a */
    public C0479c mo383a(Number number) {
        if (number == null) {
            return mo393f();
        }
        if (!m1881g()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("JSON forbids NaN and infinities: ");
                stringBuilder.append(number);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        m3042a(new C0718q(number));
        return this;
    }

    /* renamed from: a */
    public C0479c mo384a(String str) {
        if (this.f2466c.isEmpty() || this.f2467d != null) {
            throw new IllegalStateException();
        } else if (m3043i() instanceof C0717o) {
            this.f2467d = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public C0479c mo385a(boolean z) {
        m3042a(new C0718q(Boolean.valueOf(z)));
        return this;
    }

    /* renamed from: a */
    public C0487l mo386a() {
        if (this.f2466c.isEmpty()) {
            return this.f2468e;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected one JSON element but was ");
        stringBuilder.append(this.f2466c);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: b */
    public C0479c mo387b() {
        C0487l c0714i = new C0714i();
        m3042a(c0714i);
        this.f2466c.add(c0714i);
        return this;
    }

    /* renamed from: b */
    public C0479c mo388b(String str) {
        if (str == null) {
            return mo393f();
        }
        m3042a(new C0718q(str));
        return this;
    }

    /* renamed from: c */
    public C0479c mo389c() {
        if (this.f2466c.isEmpty() || this.f2467d != null) {
            throw new IllegalStateException();
        } else if (m3043i() instanceof C0714i) {
            this.f2466c.remove(this.f2466c.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public void close() {
        if (this.f2466c.isEmpty()) {
            this.f2466c.add(f2465b);
            return;
        }
        throw new IOException("Incomplete document");
    }

    /* renamed from: d */
    public C0479c mo391d() {
        C0487l c0717o = new C0717o();
        m3042a(c0717o);
        this.f2466c.add(c0717o);
        return this;
    }

    /* renamed from: e */
    public C0479c mo392e() {
        if (this.f2466c.isEmpty() || this.f2467d != null) {
            throw new IllegalStateException();
        } else if (m3043i() instanceof C0717o) {
            this.f2466c.remove(this.f2466c.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: f */
    public C0479c mo393f() {
        m3042a(C0716n.f2581a);
        return this;
    }

    public void flush() {
    }
}
