package android.support.v4.p016f;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: android.support.v4.f.a */
public class C0549a<K, V> extends C0197k<K, V> implements Map<K, V> {
    /* renamed from: a */
    C0194h<K, V> f1966a;

    /* renamed from: android.support.v4.f.a$1 */
    class C05481 extends C0194h<K, V> {
        /* renamed from: a */
        final /* synthetic */ C0549a f1965a;

        C05481(C0549a c0549a) {
            this.f1965a = c0549a;
        }

        /* renamed from: a */
        protected int mo78a() {
            return this.f1965a.h;
        }

        /* renamed from: a */
        protected int mo79a(Object obj) {
            return this.f1965a.m716a(obj);
        }

        /* renamed from: a */
        protected Object mo80a(int i, int i2) {
            return this.f1965a.g[(i << 1) + i2];
        }

        /* renamed from: a */
        protected V mo81a(int i, V v) {
            return this.f1965a.m718a(i, (Object) v);
        }

        /* renamed from: a */
        protected void mo82a(int i) {
            this.f1965a.m723d(i);
        }

        /* renamed from: a */
        protected void mo83a(K k, V v) {
            this.f1965a.put(k, v);
        }

        /* renamed from: b */
        protected int mo84b(Object obj) {
            return this.f1965a.m720b(obj);
        }

        /* renamed from: b */
        protected Map<K, V> mo85b() {
            return this.f1965a;
        }

        /* renamed from: c */
        protected void mo86c() {
            this.f1965a.clear();
        }
    }

    public C0549a(int i) {
        super(i);
    }

    /* renamed from: b */
    private C0194h<K, V> m2392b() {
        if (this.f1966a == null) {
            this.f1966a = new C05481(this);
        }
        return this.f1966a;
    }

    /* renamed from: a */
    public boolean m2393a(Collection<?> collection) {
        return C0194h.m695c(this, collection);
    }

    public Set<Entry<K, V>> entrySet() {
        return m2392b().m707d();
    }

    public Set<K> keySet() {
        return m2392b().m708e();
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        m719a(this.h + map.size());
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Collection<V> values() {
        return m2392b().m709f();
    }
}
