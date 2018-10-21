package android.support.v4.p016f;

import java.util.ConcurrentModificationException;

/* renamed from: android.support.v4.f.k */
public class C0197k<K, V> {
    /* renamed from: b */
    static Object[] f735b;
    /* renamed from: c */
    static int f736c;
    /* renamed from: d */
    static Object[] f737d;
    /* renamed from: e */
    static int f738e;
    /* renamed from: f */
    int[] f739f;
    /* renamed from: g */
    Object[] f740g;
    /* renamed from: h */
    int f741h;

    public C0197k() {
        this.f739f = C0184c.f700a;
        this.f740g = C0184c.f702c;
        this.f741h = 0;
    }

    public C0197k(int i) {
        if (i == 0) {
            this.f739f = C0184c.f700a;
            this.f740g = C0184c.f702c;
        } else {
            m714e(i);
        }
        this.f741h = 0;
    }

    /* renamed from: a */
    private static int m712a(int[] r0, int r1, int r2) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/1763344271.run(Unknown Source)
*/
        /*
        r0 = android.support.v4.p016f.C0184c.m666a(r0, r1, r2);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0005 }
        return r0;
    L_0x0005:
        r0 = new java.util.ConcurrentModificationException;
        r0.<init>();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.f.k.a(int[], int, int):int");
    }

    /* renamed from: a */
    private static void m713a(int[] iArr, Object[] objArr, int i) {
        int i2;
        if (iArr.length == 8) {
            synchronized (C0549a.class) {
                if (f738e < 10) {
                    objArr[0] = f737d;
                    objArr[1] = iArr;
                    for (i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f737d = objArr;
                    f738e++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0549a.class) {
                if (f736c < 10) {
                    objArr[0] = f735b;
                    objArr[1] = iArr;
                    for (i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f735b = objArr;
                    f736c++;
                }
            }
        }
    }

    /* renamed from: e */
    private void m714e(int i) {
        Object[] objArr;
        if (i == 8) {
            synchronized (C0549a.class) {
                if (f737d != null) {
                    objArr = f737d;
                    this.f740g = objArr;
                    f737d = (Object[]) objArr[0];
                    this.f739f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f738e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0549a.class) {
                if (f735b != null) {
                    objArr = f735b;
                    this.f740g = objArr;
                    f735b = (Object[]) objArr[0];
                    this.f739f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f736c--;
                    return;
                }
            }
        }
        this.f739f = new int[i];
        this.f740g = new Object[(i << 1)];
    }

    /* renamed from: a */
    int m715a() {
        int i = this.f741h;
        if (i == 0) {
            return -1;
        }
        int a = C0197k.m712a(this.f739f, i, 0);
        if (a < 0 || this.f740g[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f739f[i2] == 0) {
            if (this.f740g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        a--;
        while (a >= 0 && this.f739f[a] == 0) {
            if (this.f740g[a << 1] == null) {
                return a;
            }
            a--;
        }
        return i2 ^ -1;
    }

    /* renamed from: a */
    public int m716a(Object obj) {
        return obj == null ? m715a() : m717a(obj, obj.hashCode());
    }

    /* renamed from: a */
    int m717a(Object obj, int i) {
        int i2 = this.f741h;
        if (i2 == 0) {
            return -1;
        }
        int a = C0197k.m712a(this.f739f, i2, i);
        if (a < 0 || obj.equals(this.f740g[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f739f[i3] == i) {
            if (obj.equals(this.f740g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        a--;
        while (a >= 0 && this.f739f[a] == i) {
            if (obj.equals(this.f740g[a << 1])) {
                return a;
            }
            a--;
        }
        return i3 ^ -1;
    }

    /* renamed from: a */
    public V m718a(int i, V v) {
        i = (i << 1) + 1;
        V v2 = this.f740g[i];
        this.f740g[i] = v;
        return v2;
    }

    /* renamed from: a */
    public void m719a(int i) {
        int i2 = this.f741h;
        if (this.f739f.length < i) {
            int[] iArr = this.f739f;
            Object[] objArr = this.f740g;
            m714e(i);
            if (this.f741h > 0) {
                System.arraycopy(iArr, 0, this.f739f, 0, i2);
                System.arraycopy(objArr, 0, this.f740g, 0, i2 << 1);
            }
            C0197k.m713a(iArr, objArr, i2);
        }
        if (this.f741h != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: b */
    int m720b(Object obj) {
        int i = this.f741h * 2;
        Object[] objArr = this.f740g;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
        } else {
            for (int i3 = 1; i3 < i; i3 += 2) {
                if (obj.equals(objArr[i3])) {
                    return i3 >> 1;
                }
            }
        }
        return -1;
    }

    /* renamed from: b */
    public K m721b(int i) {
        return this.f740g[i << 1];
    }

    /* renamed from: c */
    public V m722c(int i) {
        return this.f740g[(i << 1) + 1];
    }

    public void clear() {
        if (this.f741h > 0) {
            int[] iArr = this.f739f;
            Object[] objArr = this.f740g;
            int i = this.f741h;
            this.f739f = C0184c.f700a;
            this.f740g = C0184c.f702c;
            this.f741h = 0;
            C0197k.m713a(iArr, objArr, i);
        }
        if (this.f741h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m716a(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m720b(obj) >= 0;
    }

    /* renamed from: d */
    public V m723d(int i) {
        int i2 = i << 1;
        V v = this.f740g[i2 + 1];
        int i3 = this.f741h;
        int i4 = 0;
        if (i3 <= 1) {
            C0197k.m713a(this.f739f, this.f740g, i3);
            this.f739f = C0184c.f700a;
            this.f740g = C0184c.f702c;
        } else {
            int i5 = i3 - 1;
            int i6 = 8;
            if (this.f739f.length <= 8 || this.f741h >= this.f739f.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(this.f739f, i7, this.f739f, i, i8);
                    System.arraycopy(this.f740g, i7 << 1, this.f740g, i2, i8 << 1);
                }
                i2 = i5 << 1;
                this.f740g[i2] = null;
                this.f740g[i2 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                Object obj = this.f739f;
                Object obj2 = this.f740g;
                m714e(i6);
                if (i3 == this.f741h) {
                    if (i > 0) {
                        System.arraycopy(obj, 0, this.f739f, 0, i);
                        System.arraycopy(obj2, 0, this.f740g, 0, i2);
                    }
                    if (i < i5) {
                        i4 = i + 1;
                        int i9 = i5 - i;
                        System.arraycopy(obj, i4, this.f739f, i, i9);
                        System.arraycopy(obj2, i4 << 1, this.f740g, i2, i9 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.f741h) {
            this.f741h = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public boolean equals(java.lang.Object r7) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/1763344271.run(Unknown Source)
*/
        /*
        r6 = this;
        r0 = 1;
        if (r6 != r7) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r7 instanceof android.support.v4.p016f.C0197k;
        r2 = 0;
        if (r1 == 0) goto L_0x003e;
    L_0x0009:
        r7 = (android.support.v4.p016f.C0197k) r7;
        r1 = r6.size();
        r3 = r7.size();
        if (r1 == r3) goto L_0x0016;
    L_0x0015:
        return r2;
    L_0x0016:
        r1 = 0;
    L_0x0017:
        r3 = r6.f741h;	 Catch:{ NullPointerException -> 0x003d, NullPointerException -> 0x003d }
        if (r1 >= r3) goto L_0x003c;	 Catch:{ NullPointerException -> 0x003d, NullPointerException -> 0x003d }
    L_0x001b:
        r3 = r6.m721b(r1);	 Catch:{ NullPointerException -> 0x003d, NullPointerException -> 0x003d }
        r4 = r6.m722c(r1);	 Catch:{ NullPointerException -> 0x003d, NullPointerException -> 0x003d }
        r5 = r7.get(r3);	 Catch:{ NullPointerException -> 0x003d, NullPointerException -> 0x003d }
        if (r4 != 0) goto L_0x0032;	 Catch:{ NullPointerException -> 0x003d, NullPointerException -> 0x003d }
    L_0x0029:
        if (r5 != 0) goto L_0x0031;	 Catch:{ NullPointerException -> 0x003d, NullPointerException -> 0x003d }
    L_0x002b:
        r3 = r7.containsKey(r3);	 Catch:{ NullPointerException -> 0x003d, NullPointerException -> 0x003d }
        if (r3 != 0) goto L_0x0039;	 Catch:{ NullPointerException -> 0x003d, NullPointerException -> 0x003d }
    L_0x0031:
        return r2;	 Catch:{ NullPointerException -> 0x003d, NullPointerException -> 0x003d }
    L_0x0032:
        r3 = r4.equals(r5);	 Catch:{ NullPointerException -> 0x003d, NullPointerException -> 0x003d }
        if (r3 != 0) goto L_0x0039;
    L_0x0038:
        return r2;
    L_0x0039:
        r1 = r1 + 1;
        goto L_0x0017;
    L_0x003c:
        return r0;
    L_0x003d:
        return r2;
    L_0x003e:
        r1 = r7 instanceof java.util.Map;
        if (r1 == 0) goto L_0x0076;
    L_0x0042:
        r7 = (java.util.Map) r7;
        r1 = r6.size();
        r3 = r7.size();
        if (r1 == r3) goto L_0x004f;
    L_0x004e:
        return r2;
    L_0x004f:
        r1 = 0;
    L_0x0050:
        r3 = r6.f741h;	 Catch:{ NullPointerException -> 0x0076, NullPointerException -> 0x0076 }
        if (r1 >= r3) goto L_0x0075;	 Catch:{ NullPointerException -> 0x0076, NullPointerException -> 0x0076 }
    L_0x0054:
        r3 = r6.m721b(r1);	 Catch:{ NullPointerException -> 0x0076, NullPointerException -> 0x0076 }
        r4 = r6.m722c(r1);	 Catch:{ NullPointerException -> 0x0076, NullPointerException -> 0x0076 }
        r5 = r7.get(r3);	 Catch:{ NullPointerException -> 0x0076, NullPointerException -> 0x0076 }
        if (r4 != 0) goto L_0x006b;	 Catch:{ NullPointerException -> 0x0076, NullPointerException -> 0x0076 }
    L_0x0062:
        if (r5 != 0) goto L_0x006a;	 Catch:{ NullPointerException -> 0x0076, NullPointerException -> 0x0076 }
    L_0x0064:
        r3 = r7.containsKey(r3);	 Catch:{ NullPointerException -> 0x0076, NullPointerException -> 0x0076 }
        if (r3 != 0) goto L_0x0072;	 Catch:{ NullPointerException -> 0x0076, NullPointerException -> 0x0076 }
    L_0x006a:
        return r2;	 Catch:{ NullPointerException -> 0x0076, NullPointerException -> 0x0076 }
    L_0x006b:
        r3 = r4.equals(r5);	 Catch:{ NullPointerException -> 0x0076, NullPointerException -> 0x0076 }
        if (r3 != 0) goto L_0x0072;
    L_0x0071:
        return r2;
    L_0x0072:
        r1 = r1 + 1;
        goto L_0x0050;
    L_0x0075:
        return r0;
    L_0x0076:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.f.k.equals(java.lang.Object):boolean");
    }

    public V get(Object obj) {
        int a = m716a(obj);
        return a >= 0 ? this.f740g[(a << 1) + 1] : null;
    }

    public int hashCode() {
        int[] iArr = this.f739f;
        Object[] objArr = this.f740g;
        int i = this.f741h;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < i) {
            Object obj = objArr[i3];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i2];
            i2++;
            i3 += 2;
        }
        return i4;
    }

    public boolean isEmpty() {
        return this.f741h <= 0;
    }

    public V put(K k, V v) {
        int a;
        int i;
        int i2 = this.f741h;
        if (k == null) {
            a = m715a();
            i = 0;
        } else {
            a = k.hashCode();
            i = a;
            a = m717a((Object) k, a);
        }
        if (a >= 0) {
            int i3 = (a << 1) + 1;
            V v2 = this.f740g[i3];
            this.f740g[i3] = v;
            return v2;
        }
        a ^= -1;
        if (i2 >= this.f739f.length) {
            int i4 = 4;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i4 = 8;
            }
            int[] iArr = this.f739f;
            Object[] objArr = this.f740g;
            m714e(i4);
            if (i2 == this.f741h) {
                if (this.f739f.length > 0) {
                    System.arraycopy(iArr, 0, this.f739f, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f740g, 0, objArr.length);
                }
                C0197k.m713a(iArr, objArr, i2);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (a < i2) {
            int i5 = a + 1;
            System.arraycopy(this.f739f, a, this.f739f, i5, i2 - a);
            System.arraycopy(this.f740g, a << 1, this.f740g, i5 << 1, (this.f741h - a) << 1);
        }
        if (i2 != this.f741h || a >= this.f739f.length) {
            throw new ConcurrentModificationException();
        }
        this.f739f[a] = i;
        int i6 = a << 1;
        this.f740g[i6] = k;
        this.f740g[i6 + 1] = v;
        this.f741h++;
        return null;
    }

    public V remove(Object obj) {
        int a = m716a(obj);
        return a >= 0 ? m723d(a) : null;
    }

    public int size() {
        return this.f741h;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f741h * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f741h; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            C0197k b = m721b(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append("(this Map)");
            }
            stringBuilder.append('=');
            b = m722c(i);
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
