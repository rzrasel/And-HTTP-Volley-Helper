package android.support.v4.p016f;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: android.support.v4.f.b */
public final class C0183b<E> implements Collection<E>, Set<E> {
    /* renamed from: a */
    private static final int[] f690a = new int[0];
    /* renamed from: b */
    private static final Object[] f691b = new Object[0];
    /* renamed from: c */
    private static Object[] f692c;
    /* renamed from: d */
    private static int f693d;
    /* renamed from: e */
    private static Object[] f694e;
    /* renamed from: f */
    private static int f695f;
    /* renamed from: g */
    private int[] f696g;
    /* renamed from: h */
    private Object[] f697h;
    /* renamed from: i */
    private int f698i;
    /* renamed from: j */
    private C0194h<E, E> f699j;

    /* renamed from: android.support.v4.f.b$1 */
    class C05501 extends C0194h<E, E> {
        /* renamed from: a */
        final /* synthetic */ C0183b f1967a;

        C05501(C0183b c0183b) {
            this.f1967a = c0183b;
        }

        /* renamed from: a */
        protected int mo78a() {
            return this.f1967a.f698i;
        }

        /* renamed from: a */
        protected int mo79a(Object obj) {
            return this.f1967a.m661a(obj);
        }

        /* renamed from: a */
        protected Object mo80a(int i, int i2) {
            return this.f1967a.f697h[i];
        }

        /* renamed from: a */
        protected E mo81a(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }

        /* renamed from: a */
        protected void mo82a(int i) {
            this.f1967a.m664c(i);
        }

        /* renamed from: a */
        protected void mo83a(E e, E e2) {
            this.f1967a.add(e);
        }

        /* renamed from: b */
        protected int mo84b(Object obj) {
            return this.f1967a.m661a(obj);
        }

        /* renamed from: b */
        protected Map<E, E> mo85b() {
            throw new UnsupportedOperationException("not a map");
        }

        /* renamed from: c */
        protected void mo86c() {
            this.f1967a.clear();
        }
    }

    public C0183b() {
        this(0);
    }

    public C0183b(int i) {
        if (i == 0) {
            this.f696g = f690a;
            this.f697h = f691b;
        } else {
            m660d(i);
        }
        this.f698i = 0;
    }

    /* renamed from: a */
    private int m654a() {
        int i = this.f698i;
        if (i == 0) {
            return -1;
        }
        int a = C0184c.m666a(this.f696g, i, 0);
        if (a < 0 || this.f697h[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f696g[i2] == 0) {
            if (this.f697h[i2] == null) {
                return i2;
            }
            i2++;
        }
        a--;
        while (a >= 0 && this.f696g[a] == 0) {
            if (this.f697h[a] == null) {
                return a;
            }
            a--;
        }
        return i2 ^ -1;
    }

    /* renamed from: a */
    private int m656a(Object obj, int i) {
        int i2 = this.f698i;
        if (i2 == 0) {
            return -1;
        }
        int a = C0184c.m666a(this.f696g, i2, i);
        if (a < 0 || obj.equals(this.f697h[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f696g[i3] == i) {
            if (obj.equals(this.f697h[i3])) {
                return i3;
            }
            i3++;
        }
        a--;
        while (a >= 0 && this.f696g[a] == i) {
            if (obj.equals(this.f697h[a])) {
                return a;
            }
            a--;
        }
        return i3 ^ -1;
    }

    /* renamed from: a */
    private static void m657a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0183b.class) {
                if (f695f < 10) {
                    objArr[0] = f694e;
                    objArr[1] = iArr;
                    for (i--; i >= 2; i--) {
                        objArr[i] = null;
                    }
                    f694e = objArr;
                    f695f++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0183b.class) {
                if (f693d < 10) {
                    objArr[0] = f692c;
                    objArr[1] = iArr;
                    for (i--; i >= 2; i--) {
                        objArr[i] = null;
                    }
                    f692c = objArr;
                    f693d++;
                }
            }
        }
    }

    /* renamed from: b */
    private C0194h<E, E> m658b() {
        if (this.f699j == null) {
            this.f699j = new C05501(this);
        }
        return this.f699j;
    }

    /* renamed from: d */
    private void m660d(int i) {
        Object[] objArr;
        if (i == 8) {
            synchronized (C0183b.class) {
                if (f694e != null) {
                    objArr = f694e;
                    this.f697h = objArr;
                    f694e = (Object[]) objArr[0];
                    this.f696g = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f695f--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0183b.class) {
                if (f692c != null) {
                    objArr = f692c;
                    this.f697h = objArr;
                    f692c = (Object[]) objArr[0];
                    this.f696g = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f693d--;
                    return;
                }
            }
        }
        this.f696g = new int[i];
        this.f697h = new Object[i];
    }

    /* renamed from: a */
    public int m661a(Object obj) {
        return obj == null ? m654a() : m656a(obj, obj.hashCode());
    }

    /* renamed from: a */
    public void m662a(int i) {
        if (this.f696g.length < i) {
            Object obj = this.f696g;
            Object obj2 = this.f697h;
            m660d(i);
            if (this.f698i > 0) {
                System.arraycopy(obj, 0, this.f696g, 0, this.f698i);
                System.arraycopy(obj2, 0, this.f697h, 0, this.f698i);
            }
            C0183b.m657a(obj, obj2, this.f698i);
        }
    }

    public boolean add(E e) {
        int a;
        int i;
        if (e == null) {
            a = m654a();
            i = 0;
        } else {
            a = e.hashCode();
            i = a;
            a = m656a(e, a);
        }
        if (a >= 0) {
            return false;
        }
        int i2;
        a ^= -1;
        if (this.f698i >= this.f696g.length) {
            i2 = 4;
            if (this.f698i >= 8) {
                i2 = (this.f698i >> 1) + this.f698i;
            } else if (this.f698i >= 4) {
                i2 = 8;
            }
            Object obj = this.f696g;
            Object obj2 = this.f697h;
            m660d(i2);
            if (this.f696g.length > 0) {
                System.arraycopy(obj, 0, this.f696g, 0, obj.length);
                System.arraycopy(obj2, 0, this.f697h, 0, obj2.length);
            }
            C0183b.m657a(obj, obj2, this.f698i);
        }
        if (a < this.f698i) {
            i2 = a + 1;
            System.arraycopy(this.f696g, a, this.f696g, i2, this.f698i - a);
            System.arraycopy(this.f697h, a, this.f697h, i2, this.f698i - a);
        }
        this.f696g[a] = i;
        this.f697h[a] = e;
        this.f698i++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        m662a(this.f698i + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    /* renamed from: b */
    public E m663b(int i) {
        return this.f697h[i];
    }

    /* renamed from: c */
    public E m664c(int i) {
        E e = this.f697h[i];
        if (this.f698i <= 1) {
            C0183b.m657a(this.f696g, this.f697h, this.f698i);
            this.f696g = f690a;
            this.f697h = f691b;
            this.f698i = 0;
        } else {
            int i2 = 8;
            int i3;
            if (this.f696g.length <= 8 || this.f698i >= this.f696g.length / 3) {
                this.f698i--;
                if (i < this.f698i) {
                    i3 = i + 1;
                    System.arraycopy(this.f696g, i3, this.f696g, i, this.f698i - i);
                    System.arraycopy(this.f697h, i3, this.f697h, i, this.f698i - i);
                }
                this.f697h[this.f698i] = null;
            } else {
                if (this.f698i > 8) {
                    i2 = (this.f698i >> 1) + this.f698i;
                }
                Object obj = this.f696g;
                Object obj2 = this.f697h;
                m660d(i2);
                this.f698i--;
                if (i > 0) {
                    System.arraycopy(obj, 0, this.f696g, 0, i);
                    System.arraycopy(obj2, 0, this.f697h, 0, i);
                }
                if (i < this.f698i) {
                    i3 = i + 1;
                    System.arraycopy(obj, i3, this.f696g, i, this.f698i - i);
                    System.arraycopy(obj2, i3, this.f697h, i, this.f698i - i);
                }
            }
        }
        return e;
    }

    public void clear() {
        if (this.f698i != 0) {
            C0183b.m657a(this.f696g, this.f697h, this.f698i);
            this.f696g = f690a;
            this.f697h = f691b;
            this.f698i = 0;
        }
    }

    public boolean contains(Object obj) {
        return m661a(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(java.lang.Object r5) {
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
        r4 = this;
        r0 = 1;
        if (r4 != r5) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof java.util.Set;
        r2 = 0;
        if (r1 == 0) goto L_0x002a;
    L_0x0009:
        r5 = (java.util.Set) r5;
        r1 = r4.size();
        r3 = r5.size();
        if (r1 == r3) goto L_0x0016;
    L_0x0015:
        return r2;
    L_0x0016:
        r1 = 0;
    L_0x0017:
        r3 = r4.f698i;	 Catch:{ NullPointerException -> 0x002a, NullPointerException -> 0x002a }
        if (r1 >= r3) goto L_0x0029;	 Catch:{ NullPointerException -> 0x002a, NullPointerException -> 0x002a }
    L_0x001b:
        r3 = r4.m663b(r1);	 Catch:{ NullPointerException -> 0x002a, NullPointerException -> 0x002a }
        r3 = r5.contains(r3);	 Catch:{ NullPointerException -> 0x002a, NullPointerException -> 0x002a }
        if (r3 != 0) goto L_0x0026;
    L_0x0025:
        return r2;
    L_0x0026:
        r1 = r1 + 1;
        goto L_0x0017;
    L_0x0029:
        return r0;
    L_0x002a:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.f.b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int[] iArr = this.f696g;
        int i = 0;
        for (int i2 = 0; i2 < this.f698i; i2++) {
            i += iArr[i2];
        }
        return i;
    }

    public boolean isEmpty() {
        return this.f698i <= 0;
    }

    public Iterator<E> iterator() {
        return m658b().m708e().iterator();
    }

    public boolean remove(Object obj) {
        int a = m661a(obj);
        if (a < 0) {
            return false;
        }
        m664c(a);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f698i - 1; i >= 0; i--) {
            if (!collection.contains(this.f697h[i])) {
                m664c(i);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f698i;
    }

    public Object[] toArray() {
        Object obj = new Object[this.f698i];
        System.arraycopy(this.f697h, 0, obj, 0, this.f698i);
        return obj;
    }

    public <T> T[] toArray(T[] tArr) {
        Object obj;
        if (tArr.length < this.f698i) {
            obj = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f698i);
        }
        System.arraycopy(this.f697h, 0, obj, 0, this.f698i);
        if (obj.length > this.f698i) {
            obj[this.f698i] = null;
        }
        return obj;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f698i * 14);
        stringBuilder.append('{');
        for (int i = 0; i < this.f698i; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            C0183b b = m663b(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append("(this Set)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
