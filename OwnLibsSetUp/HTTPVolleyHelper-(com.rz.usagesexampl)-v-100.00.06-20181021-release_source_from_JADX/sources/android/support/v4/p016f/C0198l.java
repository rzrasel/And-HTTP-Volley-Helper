package android.support.v4.p016f;

/* renamed from: android.support.v4.f.l */
public class C0198l<E> implements Cloneable {
    /* renamed from: a */
    private static final Object f742a = new Object();
    /* renamed from: b */
    private boolean f743b;
    /* renamed from: c */
    private int[] f744c;
    /* renamed from: d */
    private Object[] f745d;
    /* renamed from: e */
    private int f746e;

    public C0198l() {
        this(10);
    }

    public C0198l(int i) {
        Object[] objArr;
        this.f743b = false;
        if (i == 0) {
            this.f744c = C0184c.f700a;
            objArr = C0184c.f702c;
        } else {
            i = C0184c.m665a(i);
            this.f744c = new int[i];
            objArr = new Object[i];
        }
        this.f745d = objArr;
        this.f746e = 0;
    }

    /* renamed from: d */
    private void m724d() {
        int i = this.f746e;
        int[] iArr = this.f744c;
        Object[] objArr = this.f745d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f742a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f743b = false;
        this.f746e = i2;
    }

    /* renamed from: a */
    public android.support.v4.p016f.C0198l<E> m725a() {
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
        r1 = (android.support.v4.p016f.C0198l) r1;	 Catch:{ CloneNotSupportedException -> 0x001c }
        r0 = r2.f744c;	 Catch:{ CloneNotSupportedException -> 0x001d }
        r0 = r0.clone();	 Catch:{ CloneNotSupportedException -> 0x001d }
        r0 = (int[]) r0;	 Catch:{ CloneNotSupportedException -> 0x001d }
        r1.f744c = r0;	 Catch:{ CloneNotSupportedException -> 0x001d }
        r0 = r2.f745d;	 Catch:{ CloneNotSupportedException -> 0x001d }
        r0 = r0.clone();	 Catch:{ CloneNotSupportedException -> 0x001d }
        r0 = (java.lang.Object[]) r0;	 Catch:{ CloneNotSupportedException -> 0x001d }
        r1.f745d = r0;	 Catch:{ CloneNotSupportedException -> 0x001d }
        goto L_0x001d;
    L_0x001c:
        r1 = r0;
    L_0x001d:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.f.l.a():android.support.v4.f.l<E>");
    }

    /* renamed from: a */
    public E m726a(int i) {
        return m727a(i, null);
    }

    /* renamed from: a */
    public E m727a(int i, E e) {
        i = C0184c.m666a(this.f744c, this.f746e, i);
        if (i >= 0) {
            if (this.f745d[i] != f742a) {
                return this.f745d[i];
            }
        }
        return e;
    }

    /* renamed from: b */
    public int m728b() {
        if (this.f743b) {
            m724d();
        }
        return this.f746e;
    }

    /* renamed from: b */
    public void m729b(int i) {
        i = C0184c.m666a(this.f744c, this.f746e, i);
        if (i >= 0 && this.f745d[i] != f742a) {
            this.f745d[i] = f742a;
            this.f743b = true;
        }
    }

    /* renamed from: b */
    public void m730b(int i, E e) {
        int a = C0184c.m666a(this.f744c, this.f746e, i);
        if (a >= 0) {
            this.f745d[a] = e;
        } else {
            a ^= -1;
            if (a >= this.f746e || this.f745d[a] != f742a) {
                if (this.f743b && this.f746e >= this.f744c.length) {
                    m724d();
                    a = C0184c.m666a(this.f744c, this.f746e, i) ^ -1;
                }
                if (this.f746e >= this.f744c.length) {
                    int a2 = C0184c.m665a(this.f746e + 1);
                    Object obj = new int[a2];
                    Object obj2 = new Object[a2];
                    System.arraycopy(this.f744c, 0, obj, 0, this.f744c.length);
                    System.arraycopy(this.f745d, 0, obj2, 0, this.f745d.length);
                    this.f744c = obj;
                    this.f745d = obj2;
                }
                if (this.f746e - a != 0) {
                    int i2 = a + 1;
                    System.arraycopy(this.f744c, a, this.f744c, i2, this.f746e - a);
                    System.arraycopy(this.f745d, a, this.f745d, i2, this.f746e - a);
                }
                this.f744c[a] = i;
                this.f745d[a] = e;
                this.f746e++;
            } else {
                this.f744c[a] = i;
                this.f745d[a] = e;
            }
        }
    }

    /* renamed from: c */
    public void m731c() {
        int i = this.f746e;
        Object[] objArr = this.f745d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f746e = 0;
        this.f743b = false;
    }

    /* renamed from: c */
    public void m732c(int i) {
        m729b(i);
    }

    /* renamed from: c */
    public void m733c(int i, E e) {
        if (this.f746e == 0 || i > this.f744c[this.f746e - 1]) {
            if (this.f743b && this.f746e >= this.f744c.length) {
                m724d();
            }
            int i2 = this.f746e;
            if (i2 >= this.f744c.length) {
                int a = C0184c.m665a(i2 + 1);
                Object obj = new int[a];
                Object obj2 = new Object[a];
                System.arraycopy(this.f744c, 0, obj, 0, this.f744c.length);
                System.arraycopy(this.f745d, 0, obj2, 0, this.f745d.length);
                this.f744c = obj;
                this.f745d = obj2;
            }
            this.f744c[i2] = i;
            this.f745d[i2] = e;
            this.f746e = i2 + 1;
            return;
        }
        m730b(i, e);
    }

    public /* synthetic */ Object clone() {
        return m725a();
    }

    /* renamed from: d */
    public int m734d(int i) {
        if (this.f743b) {
            m724d();
        }
        return this.f744c[i];
    }

    /* renamed from: e */
    public E m735e(int i) {
        if (this.f743b) {
            m724d();
        }
        return this.f745d[i];
    }

    public String toString() {
        if (m728b() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f746e * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f746e; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(m734d(i));
            stringBuilder.append('=');
            C0198l e = m735e(i);
            if (e != this) {
                stringBuilder.append(e);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
