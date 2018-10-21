package com.p028b.p029a.p031b;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: com.b.a.b.h */
public final class C0468h<K, V> extends AbstractMap<K, V> implements Serializable {
    /* renamed from: f */
    static final /* synthetic */ boolean f1645f = (C0468h.class.desiredAssertionStatus() ^ 1);
    /* renamed from: g */
    private static final Comparator<Comparable> f1646g = new C04631();
    /* renamed from: a */
    Comparator<? super K> f1647a;
    /* renamed from: b */
    C0467d<K, V> f1648b;
    /* renamed from: c */
    int f1649c;
    /* renamed from: d */
    int f1650d;
    /* renamed from: e */
    final C0467d<K, V> f1651e;
    /* renamed from: h */
    private C0464a f1652h;
    /* renamed from: i */
    private C0465b f1653i;

    /* renamed from: com.b.a.b.h$1 */
    static class C04631 implements Comparator<Comparable> {
        C04631() {
        }

        /* renamed from: a */
        public int m1791a(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m1791a((Comparable) obj, (Comparable) obj2);
        }
    }

    /* renamed from: com.b.a.b.h$a */
    class C0464a extends AbstractSet<Entry<K, V>> {
        /* renamed from: a */
        final /* synthetic */ C0468h f1631a;

        /* renamed from: com.b.a.b.h$a$1 */
        class C07001 extends C0466c<Entry<K, V>> {
            /* renamed from: a */
            final /* synthetic */ C0464a f2561a;

            C07001(C0464a c0464a) {
                this.f2561a = c0464a;
                super(c0464a.f1631a);
            }

            /* renamed from: a */
            public Entry<K, V> m3255a() {
                return m1792b();
            }

            public /* synthetic */ Object next() {
                return m3255a();
            }
        }

        C0464a(C0468h c0468h) {
            this.f1631a = c0468h;
        }

        public void clear() {
            this.f1631a.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Entry) && this.f1631a.m1802a((Entry) obj) != null;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C07001(this);
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            C0467d a = this.f1631a.m1802a((Entry) obj);
            if (a == null) {
                return false;
            }
            this.f1631a.m1803a(a, true);
            return true;
        }

        public int size() {
            return this.f1631a.f1649c;
        }
    }

    /* renamed from: com.b.a.b.h$b */
    final class C0465b extends AbstractSet<K> {
        /* renamed from: a */
        final /* synthetic */ C0468h f1632a;

        /* renamed from: com.b.a.b.h$b$1 */
        class C07011 extends C0466c<K> {
            /* renamed from: a */
            final /* synthetic */ C0465b f2562a;

            C07011(C0465b c0465b) {
                this.f2562a = c0465b;
                super(c0465b.f1632a);
            }

            public K next() {
                return m1792b().f1642f;
            }
        }

        C0465b(C0468h c0468h) {
            this.f1632a = c0468h;
        }

        public void clear() {
            this.f1632a.clear();
        }

        public boolean contains(Object obj) {
            return this.f1632a.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new C07011(this);
        }

        public boolean remove(Object obj) {
            return this.f1632a.m1804b(obj) != null;
        }

        public int size() {
            return this.f1632a.f1649c;
        }
    }

    /* renamed from: com.b.a.b.h$c */
    private abstract class C0466c<T> implements Iterator<T> {
        /* renamed from: b */
        C0467d<K, V> f1633b = this.f1636e.f1651e.f1640d;
        /* renamed from: c */
        C0467d<K, V> f1634c = null;
        /* renamed from: d */
        int f1635d = this.f1636e.f1650d;
        /* renamed from: e */
        final /* synthetic */ C0468h f1636e;

        C0466c(C0468h c0468h) {
            this.f1636e = c0468h;
        }

        /* renamed from: b */
        final C0467d<K, V> m1792b() {
            C0467d<K, V> c0467d = this.f1633b;
            if (c0467d == this.f1636e.f1651e) {
                throw new NoSuchElementException();
            } else if (this.f1636e.f1650d == this.f1635d) {
                this.f1633b = c0467d.f1640d;
                this.f1634c = c0467d;
                return c0467d;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f1633b != this.f1636e.f1651e;
        }

        public final void remove() {
            if (this.f1634c != null) {
                this.f1636e.m1803a(this.f1634c, true);
                this.f1634c = null;
                this.f1635d = this.f1636e.f1650d;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: com.b.a.b.h$d */
    static final class C0467d<K, V> implements Entry<K, V> {
        /* renamed from: a */
        C0467d<K, V> f1637a;
        /* renamed from: b */
        C0467d<K, V> f1638b;
        /* renamed from: c */
        C0467d<K, V> f1639c;
        /* renamed from: d */
        C0467d<K, V> f1640d;
        /* renamed from: e */
        C0467d<K, V> f1641e;
        /* renamed from: f */
        final K f1642f;
        /* renamed from: g */
        V f1643g;
        /* renamed from: h */
        int f1644h;

        C0467d() {
            this.f1642f = null;
            this.f1641e = this;
            this.f1640d = this;
        }

        C0467d(C0467d<K, V> c0467d, K k, C0467d<K, V> c0467d2, C0467d<K, V> c0467d3) {
            this.f1637a = c0467d;
            this.f1642f = k;
            this.f1644h = 1;
            this.f1640d = c0467d2;
            this.f1641e = c0467d3;
            c0467d3.f1640d = this;
            c0467d2.f1641e = this;
        }

        /* renamed from: a */
        public C0467d<K, V> m1793a() {
            C0467d<K, V> c0467d = this;
            for (C0467d<K, V> c0467d2 = this.f1638b; c0467d2 != null; c0467d2 = c0467d2.f1638b) {
                c0467d = c0467d2;
            }
            return c0467d;
        }

        /* renamed from: b */
        public C0467d<K, V> m1794b() {
            C0467d<K, V> c0467d = this;
            for (C0467d<K, V> c0467d2 = this.f1639c; c0467d2 != null; c0467d2 = c0467d2.f1639c) {
                c0467d = c0467d2;
            }
            return c0467d;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (this.f1642f == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!this.f1642f.equals(entry.getKey())) {
                return false;
            }
            if (this.f1643g == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!this.f1643g.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        public K getKey() {
            return this.f1642f;
        }

        public V getValue() {
            return this.f1643g;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = this.f1642f == null ? 0 : this.f1642f.hashCode();
            if (this.f1643g != null) {
                i = this.f1643g.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            V v2 = this.f1643g;
            this.f1643g = v;
            return v2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f1642f);
            stringBuilder.append("=");
            stringBuilder.append(this.f1643g);
            return stringBuilder.toString();
        }
    }

    public C0468h() {
        this(f1646g);
    }

    public C0468h(Comparator<? super K> comparator) {
        Comparator comparator2;
        this.f1649c = 0;
        this.f1650d = 0;
        this.f1651e = new C0467d();
        if (comparator == null) {
            comparator2 = f1646g;
        }
        this.f1647a = comparator2;
    }

    /* renamed from: a */
    private void m1795a(C0467d<K, V> c0467d) {
        C0467d c0467d2 = c0467d.f1638b;
        C0467d c0467d3 = c0467d.f1639c;
        C0467d c0467d4 = c0467d3.f1638b;
        C0467d c0467d5 = c0467d3.f1639c;
        c0467d.f1639c = c0467d4;
        if (c0467d4 != null) {
            c0467d4.f1637a = c0467d;
        }
        m1796a((C0467d) c0467d, c0467d3);
        c0467d3.f1638b = c0467d;
        c0467d.f1637a = c0467d3;
        int i = 0;
        c0467d.f1644h = Math.max(c0467d2 != null ? c0467d2.f1644h : 0, c0467d4 != null ? c0467d4.f1644h : 0) + 1;
        int i2 = c0467d.f1644h;
        if (c0467d5 != null) {
            i = c0467d5.f1644h;
        }
        c0467d3.f1644h = Math.max(i2, i) + 1;
    }

    /* renamed from: a */
    private void m1796a(C0467d<K, V> c0467d, C0467d<K, V> c0467d2) {
        C0467d c0467d3 = c0467d.f1637a;
        c0467d.f1637a = null;
        if (c0467d2 != null) {
            c0467d2.f1637a = c0467d3;
        }
        if (c0467d3 == null) {
            this.f1648b = c0467d2;
        } else if (c0467d3.f1638b == c0467d) {
            c0467d3.f1638b = c0467d2;
        } else {
            if (!f1645f) {
                if (c0467d3.f1639c != c0467d) {
                    throw new AssertionError();
                }
            }
            c0467d3.f1639c = c0467d2;
        }
    }

    /* renamed from: a */
    private boolean m1797a(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private void m1798b(C0467d<K, V> c0467d) {
        C0467d c0467d2 = c0467d.f1638b;
        C0467d c0467d3 = c0467d.f1639c;
        C0467d c0467d4 = c0467d2.f1638b;
        C0467d c0467d5 = c0467d2.f1639c;
        c0467d.f1638b = c0467d5;
        if (c0467d5 != null) {
            c0467d5.f1637a = c0467d;
        }
        m1796a((C0467d) c0467d, c0467d2);
        c0467d2.f1639c = c0467d;
        c0467d.f1637a = c0467d2;
        int i = 0;
        c0467d.f1644h = Math.max(c0467d3 != null ? c0467d3.f1644h : 0, c0467d5 != null ? c0467d5.f1644h : 0) + 1;
        int i2 = c0467d.f1644h;
        if (c0467d4 != null) {
            i = c0467d4.f1644h;
        }
        c0467d2.f1644h = Math.max(i2, i) + 1;
    }

    /* renamed from: b */
    private void m1799b(C0467d<K, V> c0467d, boolean z) {
        C0467d c0467d2;
        while (c0467d2 != null) {
            C0467d c0467d3 = c0467d2.f1638b;
            C0467d c0467d4 = c0467d2.f1639c;
            int i = 0;
            int i2 = c0467d3 != null ? c0467d3.f1644h : 0;
            int i3 = c0467d4 != null ? c0467d4.f1644h : 0;
            int i4 = i2 - i3;
            C0467d c0467d5;
            if (i4 == -2) {
                c0467d3 = c0467d4.f1638b;
                c0467d5 = c0467d4.f1639c;
                i2 = c0467d5 != null ? c0467d5.f1644h : 0;
                if (c0467d3 != null) {
                    i = c0467d3.f1644h;
                }
                i -= i2;
                if (i != -1) {
                    if (i != 0 || z) {
                        if (!f1645f) {
                            if (i != 1) {
                                throw new AssertionError();
                            }
                        }
                        m1798b(c0467d4);
                    }
                }
                m1795a(c0467d2);
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                c0467d4 = c0467d3.f1638b;
                c0467d5 = c0467d3.f1639c;
                i2 = c0467d5 != null ? c0467d5.f1644h : 0;
                if (c0467d4 != null) {
                    i = c0467d4.f1644h;
                }
                i -= i2;
                if (i != 1) {
                    if (i != 0 || z) {
                        if (!f1645f) {
                            if (i != -1) {
                                throw new AssertionError();
                            }
                        }
                        m1795a(c0467d3);
                    }
                }
                m1798b(c0467d2);
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                c0467d2.f1644h = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                if (!(f1645f || i4 == -1)) {
                    if (i4 != 1) {
                        throw new AssertionError();
                    }
                }
                c0467d2.f1644h = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            c0467d2 = c0467d2.f1637a;
        }
    }

    /* renamed from: a */
    com.p028b.p029a.p031b.C0468h.C0467d<K, V> m1800a(java.lang.Object r3) {
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
        if (r3 == 0) goto L_0x000a;
    L_0x0003:
        r1 = 0;
        r3 = r2.m1801a(r3, r1);	 Catch:{ ClassCastException -> 0x0009 }
        goto L_0x000b;
    L_0x0009:
        return r0;
    L_0x000a:
        r3 = r0;
    L_0x000b:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.b.a.b.h.a(java.lang.Object):com.b.a.b.h$d<K, V>");
    }

    /* renamed from: a */
    C0467d<K, V> m1801a(K k, boolean z) {
        int compareTo;
        Comparator comparator = this.f1647a;
        C0467d c0467d = this.f1648b;
        if (c0467d != null) {
            Comparable comparable = comparator == f1646g ? (Comparable) k : null;
            while (true) {
                compareTo = comparable != null ? comparable.compareTo(c0467d.f1642f) : comparator.compare(k, c0467d.f1642f);
                if (compareTo == 0) {
                    return c0467d;
                }
                C0467d c0467d2 = compareTo < 0 ? c0467d.f1638b : c0467d.f1639c;
                if (c0467d2 == null) {
                    break;
                }
                c0467d = c0467d2;
            }
        } else {
            compareTo = 0;
        }
        if (!z) {
            return null;
        }
        C0467d<K, V> c0467d3;
        C0467d c0467d4 = this.f1651e;
        if (c0467d == null) {
            if (comparator == f1646g) {
                if (!(k instanceof Comparable)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(k.getClass().getName());
                    stringBuilder.append(" is not Comparable");
                    throw new ClassCastException(stringBuilder.toString());
                }
            }
            c0467d3 = new C0467d(c0467d, k, c0467d4, c0467d4.f1641e);
            this.f1648b = c0467d3;
        } else {
            c0467d3 = new C0467d(c0467d, k, c0467d4, c0467d4.f1641e);
            if (compareTo < 0) {
                c0467d.f1638b = c0467d3;
            } else {
                c0467d.f1639c = c0467d3;
            }
            m1799b(c0467d, true);
        }
        this.f1649c++;
        this.f1650d++;
        return c0467d3;
    }

    /* renamed from: a */
    C0467d<K, V> m1802a(Entry<?, ?> entry) {
        C0467d<K, V> a = m1800a(entry.getKey());
        Object obj = (a == null || !m1797a(a.f1643g, entry.getValue())) ? null : 1;
        return obj != null ? a : null;
    }

    /* renamed from: a */
    void m1803a(C0467d<K, V> c0467d, boolean z) {
        if (z) {
            c0467d.f1641e.f1640d = c0467d.f1640d;
            c0467d.f1640d.f1641e = c0467d.f1641e;
        }
        C0467d c0467d2 = c0467d.f1638b;
        C0467d c0467d3 = c0467d.f1639c;
        C0467d c0467d4 = c0467d.f1637a;
        int i = 0;
        if (c0467d2 == null || c0467d3 == null) {
            if (c0467d2 != null) {
                m1796a((C0467d) c0467d, c0467d2);
                c0467d.f1638b = null;
            } else if (c0467d3 != null) {
                m1796a((C0467d) c0467d, c0467d3);
                c0467d.f1639c = null;
            } else {
                m1796a((C0467d) c0467d, null);
            }
            m1799b(c0467d4, false);
            this.f1649c--;
            this.f1650d++;
            return;
        }
        int i2;
        c0467d2 = c0467d2.f1644h > c0467d3.f1644h ? c0467d2.m1794b() : c0467d3.m1793a();
        m1803a(c0467d2, false);
        c0467d3 = c0467d.f1638b;
        if (c0467d3 != null) {
            i2 = c0467d3.f1644h;
            c0467d2.f1638b = c0467d3;
            c0467d3.f1637a = c0467d2;
            c0467d.f1638b = null;
        } else {
            i2 = 0;
        }
        c0467d3 = c0467d.f1639c;
        if (c0467d3 != null) {
            i = c0467d3.f1644h;
            c0467d2.f1639c = c0467d3;
            c0467d3.f1637a = c0467d2;
            c0467d.f1639c = null;
        }
        c0467d2.f1644h = Math.max(i2, i) + 1;
        m1796a((C0467d) c0467d, c0467d2);
    }

    /* renamed from: b */
    C0467d<K, V> m1804b(Object obj) {
        C0467d a = m1800a(obj);
        if (a != null) {
            m1803a(a, true);
        }
        return a;
    }

    public void clear() {
        this.f1648b = null;
        this.f1649c = 0;
        this.f1650d++;
        C0467d c0467d = this.f1651e;
        c0467d.f1641e = c0467d;
        c0467d.f1640d = c0467d;
    }

    public boolean containsKey(Object obj) {
        return m1800a(obj) != null;
    }

    public Set<Entry<K, V>> entrySet() {
        Set set = this.f1652h;
        if (set != null) {
            return set;
        }
        set = new C0464a(this);
        this.f1652h = set;
        return set;
    }

    public V get(Object obj) {
        C0467d a = m1800a(obj);
        return a != null ? a.f1643g : null;
    }

    public Set<K> keySet() {
        Set set = this.f1653i;
        if (set != null) {
            return set;
        }
        set = new C0465b(this);
        this.f1653i = set;
        return set;
    }

    public V put(K k, V v) {
        if (k != null) {
            C0467d a = m1801a((Object) k, true);
            V v2 = a.f1643g;
            a.f1643g = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    public V remove(Object obj) {
        C0467d b = m1804b(obj);
        return b != null ? b.f1643g : null;
    }

    public int size() {
        return this.f1649c;
    }
}
