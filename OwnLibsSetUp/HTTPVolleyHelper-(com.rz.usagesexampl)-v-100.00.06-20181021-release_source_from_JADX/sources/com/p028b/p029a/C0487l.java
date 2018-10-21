package com.p028b.p029a;

import com.p028b.p029a.p031b.C0472l;
import com.p028b.p029a.p036d.C0479c;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: com.b.a.l */
public abstract class C0487l {
    /* renamed from: a */
    public Number mo402a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: b */
    public String mo403b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: c */
    public double mo404c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: d */
    public long mo405d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: e */
    public int mo406e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: f */
    public boolean mo407f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: g */
    public boolean m1908g() {
        return this instanceof C0714i;
    }

    /* renamed from: h */
    public boolean m1909h() {
        return this instanceof C0717o;
    }

    /* renamed from: i */
    public boolean m1910i() {
        return this instanceof C0718q;
    }

    /* renamed from: j */
    public boolean m1911j() {
        return this instanceof C0716n;
    }

    /* renamed from: k */
    public C0717o m1912k() {
        if (m1909h()) {
            return (C0717o) this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not a JSON Object: ");
        stringBuilder.append(this);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: l */
    public C0714i m1913l() {
        if (m1908g()) {
            return (C0714i) this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not a JSON Array: ");
        stringBuilder.append(this);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: m */
    public C0718q m1914m() {
        if (m1910i()) {
            return (C0718q) this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not a JSON Primitive: ");
        stringBuilder.append(this);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: n */
    Boolean mo408n() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String toString() {
        try {
            Writer stringWriter = new StringWriter();
            C0479c c0479c = new C0479c(stringWriter);
            c0479c.m1876b(true);
            C0472l.m1812a(this, c0479c);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
