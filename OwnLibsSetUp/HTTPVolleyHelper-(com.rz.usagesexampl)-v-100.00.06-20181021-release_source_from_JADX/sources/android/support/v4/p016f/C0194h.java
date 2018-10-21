package android.support.v4.p016f;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: android.support.v4.f.h */
abstract class C0194h<K, V> {
    /* renamed from: b */
    C0190b f730b;
    /* renamed from: c */
    C0191c f731c;
    /* renamed from: d */
    C0193e f732d;

    /* renamed from: android.support.v4.f.h$a */
    final class C0189a<T> implements Iterator<T> {
        /* renamed from: a */
        final int f718a;
        /* renamed from: b */
        int f719b;
        /* renamed from: c */
        int f720c;
        /* renamed from: d */
        boolean f721d = false;
        /* renamed from: e */
        final /* synthetic */ C0194h f722e;

        C0189a(C0194h c0194h, int i) {
            this.f722e = c0194h;
            this.f718a = i;
            this.f719b = c0194h.mo78a();
        }

        public boolean hasNext() {
            return this.f720c < this.f719b;
        }

        public T next() {
            if (hasNext()) {
                T a = this.f722e.mo80a(this.f720c, this.f718a);
                this.f720c++;
                this.f721d = true;
                return a;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f721d) {
                this.f720c--;
                this.f719b--;
                this.f721d = false;
                this.f722e.mo82a(this.f720c);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: android.support.v4.f.h$b */
    final class C0190b implements Set<Entry<K, V>> {
        /* renamed from: a */
        final /* synthetic */ C0194h f723a;

        C0190b(C0194h c0194h) {
            this.f723a = c0194h;
        }

        /* renamed from: a */
        public boolean m690a(Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ boolean add(Object obj) {
            return m690a((Entry) obj);
        }

        public boolean addAll(Collection<? extends Entry<K, V>> collection) {
            int a = this.f723a.mo78a();
            for (Entry entry : collection) {
                this.f723a.mo83a(entry.getKey(), entry.getValue());
            }
            return a != this.f723a.mo78a();
        }

        public void clear() {
            this.f723a.mo86c();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            int a = this.f723a.mo79a(entry.getKey());
            return a < 0 ? false : C0184c.m668a(this.f723a.mo80a(a, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return C0194h.m693a((Set) this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int a = this.f723a.mo78a() - 1; a >= 0; a--) {
                Object a2 = this.f723a.mo80a(a, 0);
                Object a3 = this.f723a.mo80a(a, 1);
                i += (a2 == null ? 0 : a2.hashCode()) ^ (a3 == null ? 0 : a3.hashCode());
            }
            return i;
        }

        public boolean isEmpty() {
            return this.f723a.mo78a() == 0;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C0192d(this.f723a);
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return this.f723a.mo78a();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: android.support.v4.f.h$c */
    final class C0191c implements Set<K> {
        /* renamed from: a */
        final /* synthetic */ C0194h f724a;

        C0191c(C0194h c0194h) {
            this.f724a = c0194h;
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            this.f724a.mo86c();
        }

        public boolean contains(Object obj) {
            return this.f724a.mo79a(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return C0194h.m692a(this.f724a.mo85b(), (Collection) collection);
        }

        public boolean equals(Object obj) {
            return C0194h.m693a((Set) this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int a = this.f724a.mo78a() - 1; a >= 0; a--) {
                Object a2 = this.f724a.mo80a(a, 0);
                i += a2 == null ? 0 : a2.hashCode();
            }
            return i;
        }

        public boolean isEmpty() {
            return this.f724a.mo78a() == 0;
        }

        public Iterator<K> iterator() {
            return new C0189a(this.f724a, 0);
        }

        public boolean remove(Object obj) {
            int a = this.f724a.mo79a(obj);
            if (a < 0) {
                return false;
            }
            this.f724a.mo82a(a);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return C0194h.m694b(this.f724a.mo85b(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return C0194h.m695c(this.f724a.mo85b(), collection);
        }

        public int size() {
            return this.f724a.mo78a();
        }

        public Object[] toArray() {
            return this.f724a.m705b(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return this.f724a.m702a((Object[]) tArr, 0);
        }
    }

    /* renamed from: android.support.v4.f.h$d */
    final class C0192d implements Iterator<Entry<K, V>>, Entry<K, V> {
        /* renamed from: a */
        int f725a;
        /* renamed from: b */
        int f726b;
        /* renamed from: c */
        boolean f727c = false;
        /* renamed from: d */
        final /* synthetic */ C0194h f728d;

        C0192d(C0194h c0194h) {
            this.f728d = c0194h;
            this.f725a = c0194h.mo78a() - 1;
            this.f726b = -1;
        }

        /* renamed from: a */
        public Entry<K, V> m691a() {
            if (hasNext()) {
                this.f726b++;
                this.f727c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public boolean equals(Object obj) {
            if (this.f727c) {
                boolean z = false;
                if (!(obj instanceof Entry)) {
                    return false;
                }
                Entry entry = (Entry) obj;
                if (C0184c.m668a(entry.getKey(), this.f728d.mo80a(this.f726b, 0)) && C0184c.m668a(entry.getValue(), this.f728d.mo80a(this.f726b, 1))) {
                    z = true;
                }
                return z;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public K getKey() {
            if (this.f727c) {
                return this.f728d.mo80a(this.f726b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f727c) {
                return this.f728d.mo80a(this.f726b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f726b < this.f725a;
        }

        public int hashCode() {
            if (this.f727c) {
                int i = 0;
                Object a = this.f728d.mo80a(this.f726b, 0);
                Object a2 = this.f728d.mo80a(this.f726b, 1);
                int hashCode = a == null ? 0 : a.hashCode();
                if (a2 != null) {
                    i = a2.hashCode();
                }
                return hashCode ^ i;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public /* synthetic */ Object next() {
            return m691a();
        }

        public void remove() {
            if (this.f727c) {
                this.f728d.mo82a(this.f726b);
                this.f726b--;
                this.f725a--;
                this.f727c = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.f727c) {
                return this.f728d.mo81a(this.f726b, (Object) v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(getKey());
            stringBuilder.append("=");
            stringBuilder.append(getValue());
            return stringBuilder.toString();
        }
    }

    /* renamed from: android.support.v4.f.h$e */
    final class C0193e implements Collection<V> {
        /* renamed from: a */
        final /* synthetic */ C0194h f729a;

        C0193e(C0194h c0194h) {
            this.f729a = c0194h;
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            this.f729a.mo86c();
        }

        public boolean contains(Object obj) {
            return this.f729a.mo84b(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return this.f729a.mo78a() == 0;
        }

        public Iterator<V> iterator() {
            return new C0189a(this.f729a, 1);
        }

        public boolean remove(Object obj) {
            int b = this.f729a.mo84b(obj);
            if (b < 0) {
                return false;
            }
            this.f729a.mo82a(b);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int a = this.f729a.mo78a();
            int i = 0;
            boolean z = false;
            while (i < a) {
                if (collection.contains(this.f729a.mo80a(i, 1))) {
                    this.f729a.mo82a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int a = this.f729a.mo78a();
            int i = 0;
            boolean z = false;
            while (i < a) {
                if (!collection.contains(this.f729a.mo80a(i, 1))) {
                    this.f729a.mo82a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return this.f729a.mo78a();
        }

        public Object[] toArray() {
            return this.f729a.m705b(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return this.f729a.m702a((Object[]) tArr, 1);
        }
    }

    C0194h() {
    }

    /* renamed from: a */
    public static <K, V> boolean m692a(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static <T> boolean m693a(java.util.Set<T> r4, java.lang.Object r5) {
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
        r0 = 1;
        if (r4 != r5) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof java.util.Set;
        r2 = 0;
        if (r1 == 0) goto L_0x001e;
    L_0x0009:
        r5 = (java.util.Set) r5;
        r1 = r4.size();	 Catch:{ NullPointerException -> 0x001e, NullPointerException -> 0x001e }
        r3 = r5.size();	 Catch:{ NullPointerException -> 0x001e, NullPointerException -> 0x001e }
        if (r1 != r3) goto L_0x001c;	 Catch:{ NullPointerException -> 0x001e, NullPointerException -> 0x001e }
    L_0x0015:
        r4 = r4.containsAll(r5);	 Catch:{ NullPointerException -> 0x001e, NullPointerException -> 0x001e }
        if (r4 == 0) goto L_0x001c;
    L_0x001b:
        goto L_0x001d;
    L_0x001c:
        r0 = 0;
    L_0x001d:
        return r0;
    L_0x001e:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.f.h.a(java.util.Set, java.lang.Object):boolean");
    }

    /* renamed from: b */
    public static <K, V> boolean m694b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    /* renamed from: c */
    public static <K, V> boolean m695c(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: a */
    protected abstract int mo78a();

    /* renamed from: a */
    protected abstract int mo79a(Object obj);

    /* renamed from: a */
    protected abstract Object mo80a(int i, int i2);

    /* renamed from: a */
    protected abstract V mo81a(int i, V v);

    /* renamed from: a */
    protected abstract void mo82a(int i);

    /* renamed from: a */
    protected abstract void mo83a(K k, V v);

    /* renamed from: a */
    public <T> T[] m702a(T[] tArr, int i) {
        int a = mo78a();
        if (tArr.length < a) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), a);
        }
        for (int i2 = 0; i2 < a; i2++) {
            tArr[i2] = mo80a(i2, i);
        }
        if (tArr.length > a) {
            tArr[a] = null;
        }
        return tArr;
    }

    /* renamed from: b */
    protected abstract int mo84b(Object obj);

    /* renamed from: b */
    protected abstract Map<K, V> mo85b();

    /* renamed from: b */
    public Object[] m705b(int i) {
        int a = mo78a();
        Object[] objArr = new Object[a];
        for (int i2 = 0; i2 < a; i2++) {
            objArr[i2] = mo80a(i2, i);
        }
        return objArr;
    }

    /* renamed from: c */
    protected abstract void mo86c();

    /* renamed from: d */
    public Set<Entry<K, V>> m707d() {
        if (this.f730b == null) {
            this.f730b = new C0190b(this);
        }
        return this.f730b;
    }

    /* renamed from: e */
    public Set<K> m708e() {
        if (this.f731c == null) {
            this.f731c = new C0191c(this);
        }
        return this.f731c;
    }

    /* renamed from: f */
    public Collection<V> m709f() {
        if (this.f732d == null) {
            this.f732d = new C0193e(this);
        }
        return this.f732d;
    }
}
