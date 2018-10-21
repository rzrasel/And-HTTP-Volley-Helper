package com.p028b.p029a.p036d;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* renamed from: com.b.a.d.c */
public class C0479c implements Closeable, Flushable {
    /* renamed from: a */
    private static final String[] f1687a = new String[128];
    /* renamed from: b */
    private static final String[] f1688b = ((String[]) f1687a.clone());
    /* renamed from: c */
    private final Writer f1689c;
    /* renamed from: d */
    private int[] f1690d = new int[32];
    /* renamed from: e */
    private int f1691e = 0;
    /* renamed from: f */
    private String f1692f;
    /* renamed from: g */
    private String f1693g;
    /* renamed from: h */
    private boolean f1694h;
    /* renamed from: i */
    private boolean f1695i;
    /* renamed from: j */
    private String f1696j;
    /* renamed from: k */
    private boolean f1697k;

    static {
        for (int i = 0; i <= 31; i++) {
            f1687a[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        f1687a[34] = "\\\"";
        f1687a[92] = "\\\\";
        f1687a[9] = "\\t";
        f1687a[8] = "\\b";
        f1687a[10] = "\\n";
        f1687a[13] = "\\r";
        f1687a[12] = "\\f";
        f1688b[60] = "\\u003c";
        f1688b[62] = "\\u003e";
        f1688b[38] = "\\u0026";
        f1688b[61] = "\\u003d";
        f1688b[39] = "\\u0027";
    }

    public C0479c(Writer writer) {
        m1862a(6);
        this.f1693g = ":";
        this.f1697k = true;
        if (writer != null) {
            this.f1689c = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    /* renamed from: a */
    private int mo386a() {
        if (this.f1691e != 0) {
            return this.f1690d[this.f1691e - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: a */
    private C0479c m1860a(int i, int i2, String str) {
        int a = mo386a();
        if (a != i2) {
            if (a != i) {
                throw new IllegalStateException("Nesting problem.");
            }
        }
        if (this.f1696j == null) {
            this.f1691e--;
            if (a == i2) {
                m1866j();
            }
            this.f1689c.write(str);
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Dangling name: ");
        stringBuilder.append(this.f1696j);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: a */
    private C0479c m1861a(int i, String str) {
        m1868l();
        m1862a(i);
        this.f1689c.write(str);
        return this;
    }

    /* renamed from: a */
    private void m1862a(int i) {
        if (this.f1691e == this.f1690d.length) {
            Object obj = new int[(this.f1691e * 2)];
            System.arraycopy(this.f1690d, 0, obj, 0, this.f1691e);
            this.f1690d = obj;
        }
        int[] iArr = this.f1690d;
        int i2 = this.f1691e;
        this.f1691e = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: b */
    private void m1863b(int i) {
        this.f1690d[this.f1691e - 1] = i;
    }

    /* renamed from: c */
    private void m1864c(String str) {
        String[] strArr = this.f1695i ? f1688b : f1687a;
        this.f1689c.write("\"");
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            String str2;
            char charAt = str.charAt(i2);
            if (charAt < '') {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == ' ') {
                str2 = "\\u2028";
            } else if (charAt == ' ') {
                str2 = "\\u2029";
            } else {
            }
            if (i < i2) {
                this.f1689c.write(str, i, i2 - i);
            }
            this.f1689c.write(str2);
            i = i2 + 1;
        }
        if (i < length) {
            this.f1689c.write(str, i, length - i);
        }
        this.f1689c.write("\"");
    }

    /* renamed from: i */
    private void m1865i() {
        if (this.f1696j != null) {
            m1867k();
            m1864c(this.f1696j);
            this.f1696j = null;
        }
    }

    /* renamed from: j */
    private void m1866j() {
        if (this.f1692f != null) {
            this.f1689c.write("\n");
            int i = this.f1691e;
            for (int i2 = 1; i2 < i; i2++) {
                this.f1689c.write(this.f1692f);
            }
        }
    }

    /* renamed from: k */
    private void m1867k() {
        int a = mo386a();
        if (a == 5) {
            this.f1689c.write(44);
        } else if (a != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m1866j();
        m1863b(4);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: l */
    private void m1868l() {
        /*
        r2 = this;
        r0 = r2.mo386a();
        switch(r0) {
            case 1: goto L_0x0032;
            case 2: goto L_0x002a;
            case 3: goto L_0x0007;
            case 4: goto L_0x001e;
            case 5: goto L_0x0007;
            case 6: goto L_0x001c;
            case 7: goto L_0x000f;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = new java.lang.IllegalStateException;
        r1 = "Nesting problem.";
        r0.<init>(r1);
        throw r0;
    L_0x000f:
        r0 = r2.f1694h;
        if (r0 == 0) goto L_0x0014;
    L_0x0013:
        goto L_0x001c;
    L_0x0014:
        r0 = new java.lang.IllegalStateException;
        r1 = "JSON must have only one top-level value.";
        r0.<init>(r1);
        throw r0;
    L_0x001c:
        r0 = 7;
        goto L_0x0026;
    L_0x001e:
        r0 = r2.f1689c;
        r1 = r2.f1693g;
        r0.append(r1);
        r0 = 5;
    L_0x0026:
        r2.m1863b(r0);
        goto L_0x0039;
    L_0x002a:
        r0 = r2.f1689c;
        r1 = 44;
        r0.append(r1);
        goto L_0x0036;
    L_0x0032:
        r0 = 2;
        r2.m1863b(r0);
    L_0x0036:
        r2.m1866j();
    L_0x0039:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.b.a.d.c.l():void");
    }

    /* renamed from: a */
    public C0479c mo381a(long j) {
        m1865i();
        m1868l();
        this.f1689c.write(Long.toString(j));
        return this;
    }

    /* renamed from: a */
    public C0479c mo382a(Boolean bool) {
        if (bool == null) {
            return mo393f();
        }
        m1865i();
        m1868l();
        this.f1689c.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    /* renamed from: a */
    public C0479c mo383a(Number number) {
        if (number == null) {
            return mo393f();
        }
        m1865i();
        CharSequence obj = number.toString();
        if (!this.f1694h) {
            if (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN")) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Numeric values must be finite, but was ");
                stringBuilder.append(number);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        m1868l();
        this.f1689c.append(obj);
        return this;
    }

    /* renamed from: a */
    public C0479c mo384a(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f1696j != null) {
            throw new IllegalStateException();
        } else if (this.f1691e != 0) {
            this.f1696j = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: a */
    public C0479c mo385a(boolean z) {
        m1865i();
        m1868l();
        this.f1689c.write(z ? "true" : "false");
        return this;
    }

    /* renamed from: b */
    public C0479c mo387b() {
        m1865i();
        return m1861a(1, "[");
    }

    /* renamed from: b */
    public C0479c mo388b(String str) {
        if (str == null) {
            return mo393f();
        }
        m1865i();
        m1868l();
        m1864c(str);
        return this;
    }

    /* renamed from: b */
    public final void m1876b(boolean z) {
        this.f1694h = z;
    }

    /* renamed from: c */
    public C0479c mo389c() {
        return m1860a(1, 2, "]");
    }

    public void close() {
        this.f1689c.close();
        int i = this.f1691e;
        if (i > 1 || (i == 1 && this.f1690d[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f1691e = 0;
    }

    /* renamed from: d */
    public C0479c mo391d() {
        m1865i();
        return m1861a(3, "{");
    }

    /* renamed from: e */
    public C0479c mo392e() {
        return m1860a(3, 5, "}");
    }

    /* renamed from: f */
    public C0479c mo393f() {
        if (this.f1696j != null) {
            if (this.f1697k) {
                m1865i();
            } else {
                this.f1696j = null;
                return this;
            }
        }
        m1868l();
        this.f1689c.write("null");
        return this;
    }

    public void flush() {
        if (this.f1691e != 0) {
            this.f1689c.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: g */
    public boolean m1881g() {
        return this.f1694h;
    }

    /* renamed from: h */
    public final boolean m1882h() {
        return this.f1697k;
    }
}
