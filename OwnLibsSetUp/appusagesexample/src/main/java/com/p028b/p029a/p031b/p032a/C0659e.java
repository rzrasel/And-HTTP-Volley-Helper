package com.p028b.p029a.p031b.p032a;

import com.p028b.p029a.C0714i;
import com.p028b.p029a.C0716n;
import com.p028b.p029a.C0717o;
import com.p028b.p029a.C0718q;
import com.p028b.p029a.p036d.C0477a;
import com.p028b.p029a.p036d.C0478b;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.b.a.b.a.e */
public final class C0659e extends C0477a {
    /* renamed from: b */
    private static final Reader f2458b = new C04471();
    /* renamed from: c */
    private static final Object f2459c = new Object();
    /* renamed from: d */
    private Object[] f2460d;
    /* renamed from: e */
    private int f2461e;
    /* renamed from: f */
    private String[] f2462f;
    /* renamed from: g */
    private int[] f2463g;

    /* renamed from: com.b.a.b.a.e$1 */
    static class C04471 extends Reader {
        C04471() {
        }

        public void close() {
            throw new AssertionError();
        }

        public int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    private void m3021a(C0478b c0478b) {
        if (mo369f() != c0478b) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected ");
            stringBuilder.append(c0478b);
            stringBuilder.append(" but was ");
            stringBuilder.append(mo369f());
            stringBuilder.append(m3025v());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    private void m3022a(Object obj) {
        if (this.f2461e == this.f2460d.length) {
            Object obj2 = new Object[(this.f2461e * 2)];
            Object obj3 = new int[(this.f2461e * 2)];
            Object obj4 = new String[(this.f2461e * 2)];
            System.arraycopy(this.f2460d, 0, obj2, 0, this.f2461e);
            System.arraycopy(this.f2463g, 0, obj3, 0, this.f2461e);
            System.arraycopy(this.f2462f, 0, obj4, 0, this.f2461e);
            this.f2460d = obj2;
            this.f2463g = obj3;
            this.f2462f = obj4;
        }
        Object[] objArr = this.f2460d;
        int i = this.f2461e;
        this.f2461e = i + 1;
        objArr[i] = obj;
    }

    /* renamed from: t */
    private Object m3023t() {
        return this.f2460d[this.f2461e - 1];
    }

    /* renamed from: u */
    private Object m3024u() {
        Object[] objArr = this.f2460d;
        int i = this.f2461e - 1;
        this.f2461e = i;
        Object obj = objArr[i];
        this.f2460d[this.f2461e] = null;
        return obj;
    }

    /* renamed from: v */
    private String m3025v() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" at path ");
        stringBuilder.append(mo379p());
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public void mo363a() {
        m3021a(C0478b.BEGIN_ARRAY);
        m3022a(((C0714i) m3023t()).iterator());
        this.f2463g[this.f2461e - 1] = 0;
    }

    /* renamed from: b */
    public void mo364b() {
        m3021a(C0478b.END_ARRAY);
        m3024u();
        m3024u();
        if (this.f2461e > 0) {
            int[] iArr = this.f2463g;
            int i = this.f2461e - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    /* renamed from: c */
    public void mo365c() {
        m3021a(C0478b.BEGIN_OBJECT);
        m3022a(((C0717o) m3023t()).m3295o().iterator());
    }

    public void close() {
        this.f2460d = new Object[]{f2459c};
        this.f2461e = 1;
    }

    /* renamed from: d */
    public void mo367d() {
        m3021a(C0478b.END_OBJECT);
        m3024u();
        m3024u();
        if (this.f2461e > 0) {
            int[] iArr = this.f2463g;
            int i = this.f2461e - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    /* renamed from: e */
    public boolean mo368e() {
        C0478b f = mo369f();
        return (f == C0478b.END_OBJECT || f == C0478b.END_ARRAY) ? false : true;
    }

    /* renamed from: f */
    public C0478b mo369f() {
        if (this.f2461e == 0) {
            return C0478b.END_DOCUMENT;
        }
        Object t = m3023t();
        if (t instanceof Iterator) {
            boolean z = this.f2460d[this.f2461e - 2] instanceof C0717o;
            Iterator it = (Iterator) t;
            if (!it.hasNext()) {
                return z ? C0478b.END_OBJECT : C0478b.END_ARRAY;
            } else if (z) {
                return C0478b.NAME;
            } else {
                m3022a(it.next());
                return mo369f();
            }
        } else if (t instanceof C0717o) {
            return C0478b.BEGIN_OBJECT;
        } else {
            if (t instanceof C0714i) {
                return C0478b.BEGIN_ARRAY;
            }
            if (t instanceof C0718q) {
                C0718q c0718q = (C0718q) t;
                if (c0718q.m3308q()) {
                    return C0478b.STRING;
                }
                if (c0718q.m3306o()) {
                    return C0478b.BOOLEAN;
                }
                if (c0718q.m3307p()) {
                    return C0478b.NUMBER;
                }
                throw new AssertionError();
            } else if (t instanceof C0716n) {
                return C0478b.NULL;
            } else {
                if (t == f2459c) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    /* renamed from: g */
    public String mo370g() {
        m3021a(C0478b.NAME);
        Entry entry = (Entry) ((Iterator) m3023t()).next();
        String str = (String) entry.getKey();
        this.f2462f[this.f2461e - 1] = str;
        m3022a(entry.getValue());
        return str;
    }

    /* renamed from: h */
    public String mo371h() {
        C0478b f = mo369f();
        if (f != C0478b.STRING) {
            if (f != C0478b.NUMBER) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Expected ");
                stringBuilder.append(C0478b.STRING);
                stringBuilder.append(" but was ");
                stringBuilder.append(f);
                stringBuilder.append(m3025v());
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        String b = ((C0718q) m3024u()).mo403b();
        if (this.f2461e > 0) {
            int[] iArr = this.f2463g;
            int i = this.f2461e - 1;
            iArr[i] = iArr[i] + 1;
        }
        return b;
    }

    /* renamed from: i */
    public boolean mo372i() {
        m3021a(C0478b.BOOLEAN);
        boolean f = ((C0718q) m3024u()).mo407f();
        if (this.f2461e > 0) {
            int[] iArr = this.f2463g;
            int i = this.f2461e - 1;
            iArr[i] = iArr[i] + 1;
        }
        return f;
    }

    /* renamed from: j */
    public void mo373j() {
        m3021a(C0478b.NULL);
        m3024u();
        if (this.f2461e > 0) {
            int[] iArr = this.f2463g;
            int i = this.f2461e - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    /* renamed from: k */
    public double mo374k() {
        C0478b f = mo369f();
        if (f != C0478b.NUMBER) {
            if (f != C0478b.STRING) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Expected ");
                stringBuilder.append(C0478b.NUMBER);
                stringBuilder.append(" but was ");
                stringBuilder.append(f);
                stringBuilder.append(m3025v());
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        double c = ((C0718q) m3023t()).mo404c();
        if (!m1856q()) {
            if (Double.isNaN(c) || Double.isInfinite(c)) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("JSON forbids NaN and infinities: ");
                stringBuilder2.append(c);
                throw new NumberFormatException(stringBuilder2.toString());
            }
        }
        m3024u();
        if (this.f2461e > 0) {
            int[] iArr = this.f2463g;
            int i = this.f2461e - 1;
            iArr[i] = iArr[i] + 1;
        }
        return c;
    }

    /* renamed from: l */
    public long mo375l() {
        C0478b f = mo369f();
        if (f != C0478b.NUMBER) {
            if (f != C0478b.STRING) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Expected ");
                stringBuilder.append(C0478b.NUMBER);
                stringBuilder.append(" but was ");
                stringBuilder.append(f);
                stringBuilder.append(m3025v());
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        long d = ((C0718q) m3023t()).mo405d();
        m3024u();
        if (this.f2461e > 0) {
            int[] iArr = this.f2463g;
            int i = this.f2461e - 1;
            iArr[i] = iArr[i] + 1;
        }
        return d;
    }

    /* renamed from: m */
    public int mo376m() {
        C0478b f = mo369f();
        if (f != C0478b.NUMBER) {
            if (f != C0478b.STRING) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Expected ");
                stringBuilder.append(C0478b.NUMBER);
                stringBuilder.append(" but was ");
                stringBuilder.append(f);
                stringBuilder.append(m3025v());
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        int e = ((C0718q) m3023t()).mo406e();
        m3024u();
        if (this.f2461e > 0) {
            int[] iArr = this.f2463g;
            int i = this.f2461e - 1;
            iArr[i] = iArr[i] + 1;
        }
        return e;
    }

    /* renamed from: n */
    public void mo377n() {
        if (mo369f() == C0478b.NAME) {
            mo370g();
            this.f2462f[this.f2461e - 2] = "null";
        } else {
            m3024u();
            if (this.f2461e > 0) {
                this.f2462f[this.f2461e - 1] = "null";
            }
        }
        if (this.f2461e > 0) {
            int[] iArr = this.f2463g;
            int i = this.f2461e - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    /* renamed from: o */
    public void mo378o() {
        m3021a(C0478b.NAME);
        Entry entry = (Entry) ((Iterator) m3023t()).next();
        m3022a(entry.getValue());
        m3022a(new C0718q((String) entry.getKey()));
    }

    /* renamed from: p */
    public String mo379p() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('$');
        int i = 0;
        while (i < this.f2461e) {
            if (this.f2460d[i] instanceof C0714i) {
                i++;
                if (this.f2460d[i] instanceof Iterator) {
                    stringBuilder.append('[');
                    stringBuilder.append(this.f2463g[i]);
                    stringBuilder.append(']');
                }
            } else if (this.f2460d[i] instanceof C0717o) {
                i++;
                if (this.f2460d[i] instanceof Iterator) {
                    stringBuilder.append('.');
                    if (this.f2462f[i] != null) {
                        stringBuilder.append(this.f2462f[i]);
                    }
                }
            }
            i++;
        }
        return stringBuilder.toString();
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
