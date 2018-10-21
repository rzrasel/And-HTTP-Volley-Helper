package android.arch.p000a.p002b;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: android.arch.a.b.b */
public class C0006b<K, V> implements Iterable<Entry<K, V>> {
    /* renamed from: a */
    private C0004c<K, V> f4a;
    /* renamed from: b */
    private C0004c<K, V> f5b;
    /* renamed from: c */
    private WeakHashMap<C0005f<K, V>, Boolean> f6c = new WeakHashMap();
    /* renamed from: d */
    private int f7d = 0;

    /* renamed from: android.arch.a.b.b$c */
    static class C0004c<K, V> implements Entry<K, V> {
        /* renamed from: a */
        final K f0a;
        /* renamed from: b */
        final V f1b;
        /* renamed from: c */
        C0004c<K, V> f2c;
        /* renamed from: d */
        C0004c<K, V> f3d;

        C0004c(K k, V v) {
            this.f0a = k;
            this.f1b = v;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0004c)) {
                return false;
            }
            C0004c c0004c = (C0004c) obj;
            if (!this.f0a.equals(c0004c.f0a) || !this.f1b.equals(c0004c.f1b)) {
                z = false;
            }
            return z;
        }

        public K getKey() {
            return this.f0a;
        }

        public V getValue() {
            return this.f1b;
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f0a);
            stringBuilder.append("=");
            stringBuilder.append(this.f1b);
            return stringBuilder.toString();
        }
    }

    /* renamed from: android.arch.a.b.b$f */
    interface C0005f<K, V> {
        void a_(C0004c<K, V> c0004c);
    }

    /* renamed from: android.arch.a.b.b$d */
    private class C0505d implements C0005f<K, V>, Iterator<Entry<K, V>> {
        /* renamed from: a */
        final /* synthetic */ C0006b f1770a;
        /* renamed from: b */
        private C0004c<K, V> f1771b;
        /* renamed from: c */
        private boolean f1772c;

        private C0505d(C0006b c0006b) {
            this.f1770a = c0006b;
            this.f1772c = true;
        }

        /* renamed from: a */
        public Entry<K, V> m1965a() {
            C0004c a;
            if (this.f1772c) {
                this.f1772c = false;
                a = this.f1770a.f4a;
            } else {
                a = this.f1771b != null ? this.f1771b.f2c : null;
            }
            this.f1771b = a;
            return this.f1771b;
        }

        public void a_(C0004c<K, V> c0004c) {
            if (c0004c == this.f1771b) {
                this.f1771b = this.f1771b.f3d;
                this.f1772c = this.f1771b == null;
            }
        }

        public boolean hasNext() {
            boolean z = false;
            if (this.f1772c) {
                if (this.f1770a.f4a != null) {
                    z = true;
                }
                return z;
            }
            if (!(this.f1771b == null || this.f1771b.f2c == null)) {
                z = true;
            }
            return z;
        }

        public /* synthetic */ Object next() {
            return m1965a();
        }
    }

    /* renamed from: android.arch.a.b.b$e */
    private static abstract class C0506e<K, V> implements C0005f<K, V>, Iterator<Entry<K, V>> {
        /* renamed from: a */
        C0004c<K, V> f1773a;
        /* renamed from: b */
        C0004c<K, V> f1774b;

        C0506e(C0004c<K, V> c0004c, C0004c<K, V> c0004c2) {
            this.f1773a = c0004c2;
            this.f1774b = c0004c;
        }

        /* renamed from: b */
        private C0004c<K, V> m1966b() {
            if (this.f1774b != this.f1773a) {
                if (this.f1773a != null) {
                    return mo418a(this.f1774b);
                }
            }
            return null;
        }

        /* renamed from: a */
        abstract C0004c<K, V> mo418a(C0004c<K, V> c0004c);

        /* renamed from: a */
        public Entry<K, V> m1968a() {
            Entry entry = this.f1774b;
            this.f1774b = m1966b();
            return entry;
        }

        public void a_(C0004c<K, V> c0004c) {
            if (this.f1773a == c0004c && c0004c == this.f1774b) {
                this.f1774b = null;
                this.f1773a = null;
            }
            if (this.f1773a == c0004c) {
                this.f1773a = mo419b(this.f1773a);
            }
            if (this.f1774b == c0004c) {
                this.f1774b = m1966b();
            }
        }

        /* renamed from: b */
        abstract C0004c<K, V> mo419b(C0004c<K, V> c0004c);

        public boolean hasNext() {
            return this.f1774b != null;
        }

        public /* synthetic */ Object next() {
            return m1968a();
        }
    }

    /* renamed from: android.arch.a.b.b$a */
    static class C0727a<K, V> extends C0506e<K, V> {
        C0727a(C0004c<K, V> c0004c, C0004c<K, V> c0004c2) {
            super(c0004c, c0004c2);
        }

        /* renamed from: a */
        C0004c<K, V> mo418a(C0004c<K, V> c0004c) {
            return c0004c.f2c;
        }

        /* renamed from: b */
        C0004c<K, V> mo419b(C0004c<K, V> c0004c) {
            return c0004c.f3d;
        }
    }

    /* renamed from: android.arch.a.b.b$b */
    private static class C0728b<K, V> extends C0506e<K, V> {
        C0728b(C0004c<K, V> c0004c, C0004c<K, V> c0004c2) {
            super(c0004c, c0004c2);
        }

        /* renamed from: a */
        C0004c<K, V> mo418a(C0004c<K, V> c0004c) {
            return c0004c.f3d;
        }

        /* renamed from: b */
        C0004c<K, V> mo419b(C0004c<K, V> c0004c) {
            return c0004c.f2c;
        }
    }

    /* renamed from: a */
    public int m4a() {
        return this.f7d;
    }

    /* renamed from: a */
    protected C0004c<K, V> mo4a(K k) {
        C0004c<K, V> c0004c = this.f4a;
        while (c0004c != null) {
            if (c0004c.f0a.equals(k)) {
                break;
            }
            c0004c = c0004c.f2c;
        }
        return c0004c;
    }

    /* renamed from: a */
    public V mo5a(K k, V v) {
        C0004c a = mo4a((Object) k);
        if (a != null) {
            return a.f1b;
        }
        m7b(k, v);
        return null;
    }

    /* renamed from: b */
    protected C0004c<K, V> m7b(K k, V v) {
        C0004c<K, V> c0004c = new C0004c(k, v);
        this.f7d++;
        if (this.f5b == null) {
            this.f4a = c0004c;
            this.f5b = this.f4a;
            return c0004c;
        }
        this.f5b.f2c = c0004c;
        c0004c.f3d = this.f5b;
        this.f5b = c0004c;
        return c0004c;
    }

    /* renamed from: b */
    public V mo6b(K k) {
        C0004c a = mo4a((Object) k);
        if (a == null) {
            return null;
        }
        this.f7d--;
        if (!this.f6c.isEmpty()) {
            for (C0005f a_ : this.f6c.keySet()) {
                a_.a_(a);
            }
        }
        if (a.f3d != null) {
            a.f3d.f2c = a.f2c;
        } else {
            this.f4a = a.f2c;
        }
        if (a.f2c != null) {
            a.f2c.f3d = a.f3d;
        } else {
            this.f5b = a.f3d;
        }
        a.f2c = null;
        a.f3d = null;
        return a.f1b;
    }

    /* renamed from: b */
    public Iterator<Entry<K, V>> m9b() {
        Iterator c0728b = new C0728b(this.f5b, this.f4a);
        this.f6c.put(c0728b, Boolean.valueOf(false));
        return c0728b;
    }

    /* renamed from: c */
    public C0505d m10c() {
        C0505d c0505d = new C0505d();
        this.f6c.put(c0505d, Boolean.valueOf(false));
        return c0505d;
    }

    /* renamed from: d */
    public Entry<K, V> m11d() {
        return this.f4a;
    }

    /* renamed from: e */
    public Entry<K, V> m12e() {
        return this.f5b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0006b)) {
            return false;
        }
        C0006b c0006b = (C0006b) obj;
        if (m4a() != c0006b.m4a()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c0006b.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Entry entry = (Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            z = false;
        }
        return z;
    }

    public Iterator<Entry<K, V>> iterator() {
        Iterator c0727a = new C0727a(this.f4a, this.f5b);
        this.f6c.put(c0727a, Boolean.valueOf(false));
        return c0727a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            stringBuilder.append(((Entry) it.next()).toString());
            if (it.hasNext()) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
