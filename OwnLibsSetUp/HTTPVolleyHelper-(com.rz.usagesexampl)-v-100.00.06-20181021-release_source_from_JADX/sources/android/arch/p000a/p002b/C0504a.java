package android.arch.p000a.p002b;

import android.arch.p000a.p002b.C0006b.C0004c;
import java.util.HashMap;
import java.util.Map.Entry;

/* renamed from: android.arch.a.b.a */
public class C0504a<K, V> extends C0006b<K, V> {
    /* renamed from: a */
    private HashMap<K, C0004c<K, V>> f1769a = new HashMap();

    /* renamed from: a */
    protected C0004c<K, V> mo4a(K k) {
        return (C0004c) this.f1769a.get(k);
    }

    /* renamed from: a */
    public V mo5a(K k, V v) {
        C0004c a = mo4a(k);
        if (a != null) {
            return a.f1b;
        }
        this.f1769a.put(k, m7b(k, v));
        return null;
    }

    /* renamed from: b */
    public V mo6b(K k) {
        V b = super.mo6b(k);
        this.f1769a.remove(k);
        return b;
    }

    /* renamed from: c */
    public boolean m1963c(K k) {
        return this.f1769a.containsKey(k);
    }

    /* renamed from: d */
    public Entry<K, V> m1964d(K k) {
        return m1963c(k) ? ((C0004c) this.f1769a.get(k)).f3d : null;
    }
}
