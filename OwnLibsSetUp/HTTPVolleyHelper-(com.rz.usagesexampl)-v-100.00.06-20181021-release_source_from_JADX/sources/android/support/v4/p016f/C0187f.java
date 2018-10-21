package android.support.v4.p016f;

/* renamed from: android.support.v4.f.f */
public class C0187f<E> implements Cloneable {
    /* renamed from: a */
    private static final Object f705a = new Object();
    /* renamed from: b */
    private boolean f706b;
    /* renamed from: c */
    private long[] f707c;
    /* renamed from: d */
    private Object[] f708d;
    /* renamed from: e */
    private int f709e;

    public C0187f() {
        this(10);
    }

    public C0187f(int i) {
        Object[] objArr;
        this.f706b = false;
        if (i == 0) {
            this.f707c = C0184c.f701b;
            objArr = C0184c.f702c;
        } else {
            i = C0184c.m669b(i);
            this.f707c = new long[i];
            objArr = new Object[i];
        }
        this.f708d = objArr;
        this.f709e = 0;
    }

    /* renamed from: d */
    private void m673d() {
        int i = this.f709e;
        long[] jArr = this.f707c;
        Object[] objArr = this.f708d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f705a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f706b = false;
        this.f709e = i2;
    }

    /* renamed from: a */
    public long m674a(int i) {
        if (this.f706b) {
            m673d();
        }
        return this.f707c[i];
    }

    /* renamed from: a */
    public android.support.v4.p016f.C0187f<E> m675a() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/1763344271.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = 0;
        r1 = super.clone();	 Catch:{ CloneNotSupportedException -> 0x001c }
        r1 = (android.support.v4.p016f.C0187f) r1;	 Catch:{ CloneNotSupportedException -> 0x001c }
        r0 = r2.f707c;	 Catch:{ CloneNotSupportedException -> 0x001d }
        r0 = r0.clone();	 Catch:{ CloneNotSupportedException -> 0x001d }
        r0 = (long[]) r0;	 Catch:{ CloneNotSupportedException -> 0x001d }
        r1.f707c = r0;	 Catch:{ CloneNotSupportedException -> 0x001d }
        r0 = r2.f708d;	 Catch:{ CloneNotSupportedException -> 0x001d }
        r0 = r0.clone();	 Catch:{ CloneNotSupportedException -> 0x001d }
        r0 = (java.lang.Object[]) r0;	 Catch:{ CloneNotSupportedException -> 0x001d }
        r1.f708d = r0;	 Catch:{ CloneNotSupportedException -> 0x001d }
        goto L_0x001d;
    L_0x001c:
        r1 = r0;
    L_0x001d:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.f.f.a():android.support.v4.f.f<E>");
    }

    /* renamed from: a */
    public E m676a(long j) {
        return m677a(j, null);
    }

    /* renamed from: a */
    public E m677a(long j, E e) {
        int a = C0184c.m667a(this.f707c, this.f709e, j);
        if (a >= 0) {
            if (this.f708d[a] != f705a) {
                return this.f708d[a];
            }
        }
        return e;
    }

    /* renamed from: b */
    public int m678b() {
        if (this.f706b) {
            m673d();
        }
        return this.f709e;
    }

    /* renamed from: b */
    public E m679b(int i) {
        if (this.f706b) {
            m673d();
        }
        return this.f708d[i];
    }

    /* renamed from: b */
    public void m680b(long j) {
        int a = C0184c.m667a(this.f707c, this.f709e, j);
        if (a >= 0 && this.f708d[a] != f705a) {
            this.f708d[a] = f705a;
            this.f706b = true;
        }
    }

    /* renamed from: b */
    public void m681b(long j, E e) {
        int a = C0184c.m667a(this.f707c, this.f709e, j);
        if (a >= 0) {
            this.f708d[a] = e;
        } else {
            a ^= -1;
            if (a >= this.f709e || this.f708d[a] != f705a) {
                if (this.f706b && this.f709e >= this.f707c.length) {
                    m673d();
                    a = C0184c.m667a(this.f707c, this.f709e, j) ^ -1;
                }
                if (this.f709e >= this.f707c.length) {
                    int b = C0184c.m669b(this.f709e + 1);
                    Object obj = new long[b];
                    Object obj2 = new Object[b];
                    System.arraycopy(this.f707c, 0, obj, 0, this.f707c.length);
                    System.arraycopy(this.f708d, 0, obj2, 0, this.f708d.length);
                    this.f707c = obj;
                    this.f708d = obj2;
                }
                if (this.f709e - a != 0) {
                    int i = a + 1;
                    System.arraycopy(this.f707c, a, this.f707c, i, this.f709e - a);
                    System.arraycopy(this.f708d, a, this.f708d, i, this.f709e - a);
                }
                this.f707c[a] = j;
                this.f708d[a] = e;
                this.f709e++;
            } else {
                this.f707c[a] = j;
                this.f708d[a] = e;
            }
        }
    }

    /* renamed from: c */
    public void m682c() {
        int i = this.f709e;
        Object[] objArr = this.f708d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f709e = 0;
        this.f706b = false;
    }

    public /* synthetic */ Object clone() {
        return m675a();
    }

    public String toString() {
        if (m678b() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f709e * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f709e; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(m674a(i));
            stringBuilder.append('=');
            C0187f b = m679b(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
