package com.p028b.p029a.p031b.p032a;

import com.p028b.p029a.C0482f;
import com.p028b.p029a.C0487l;
import com.p028b.p029a.C0492v;
import com.p028b.p029a.C0493w;
import com.p028b.p029a.C0718q;
import com.p028b.p029a.C0719t;
import com.p028b.p029a.p031b.C0458b;
import com.p028b.p029a.p031b.C0459c;
import com.p028b.p029a.p031b.C0461f;
import com.p028b.p029a.p031b.C0469i;
import com.p028b.p029a.p031b.C0472l;
import com.p028b.p029a.p035c.C0475a;
import com.p028b.p029a.p036d.C0477a;
import com.p028b.p029a.p036d.C0478b;
import com.p028b.p029a.p036d.C0479c;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.b.a.b.a.g */
public final class C0662g implements C0493w {
    /* renamed from: a */
    final boolean f2473a;
    /* renamed from: b */
    private final C0459c f2474b;

    /* renamed from: com.b.a.b.a.g$a */
    private final class C0661a<K, V> extends C0492v<Map<K, V>> {
        /* renamed from: a */
        final /* synthetic */ C0662g f2469a;
        /* renamed from: b */
        private final C0492v<K> f2470b;
        /* renamed from: c */
        private final C0492v<V> f2471c;
        /* renamed from: d */
        private final C0469i<? extends Map<K, V>> f2472d;

        public C0661a(C0662g c0662g, C0482f c0482f, Type type, C0492v<K> c0492v, Type type2, C0492v<V> c0492v2, C0469i<? extends Map<K, V>> c0469i) {
            this.f2469a = c0662g;
            this.f2470b = new C0674m(c0482f, c0492v, type);
            this.f2471c = new C0674m(c0482f, c0492v2, type2);
            this.f2472d = c0469i;
        }

        /* renamed from: a */
        private String m3056a(C0487l c0487l) {
            if (c0487l.m1910i()) {
                C0718q m = c0487l.m1914m();
                if (m.m3307p()) {
                    return String.valueOf(m.mo402a());
                }
                if (m.m3306o()) {
                    return Boolean.toString(m.mo407f());
                }
                if (m.m3308q()) {
                    return m.mo403b();
                }
                throw new AssertionError();
            } else if (c0487l.m1911j()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        /* renamed from: a */
        public Map<K, V> m3057a(C0477a c0477a) {
            C0478b f = c0477a.mo369f();
            if (f == C0478b.NULL) {
                c0477a.mo373j();
                return null;
            }
            Map<K, V> map = (Map) this.f2472d.mo399a();
            Object b;
            StringBuilder stringBuilder;
            if (f == C0478b.BEGIN_ARRAY) {
                c0477a.mo363a();
                while (c0477a.mo368e()) {
                    c0477a.mo363a();
                    b = this.f2470b.mo361b(c0477a);
                    if (map.put(b, this.f2471c.mo361b(c0477a)) == null) {
                        c0477a.mo364b();
                    } else {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("duplicate key: ");
                        stringBuilder.append(b);
                        throw new C0719t(stringBuilder.toString());
                    }
                }
                c0477a.mo364b();
            } else {
                c0477a.mo365c();
                while (c0477a.mo368e()) {
                    C0461f.f1629a.mo401a(c0477a);
                    b = this.f2470b.mo361b(c0477a);
                    if (map.put(b, this.f2471c.mo361b(c0477a)) != null) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("duplicate key: ");
                        stringBuilder.append(b);
                        throw new C0719t(stringBuilder.toString());
                    }
                }
                c0477a.mo367d();
            }
            return map;
        }

        /* renamed from: a */
        public void m3059a(C0479c c0479c, Map<K, V> map) {
            if (map == null) {
                c0479c.mo393f();
            } else if (this.f2469a.f2473a) {
                List arrayList = new ArrayList(map.size());
                List arrayList2 = new ArrayList(map.size());
                int i = 0;
                int i2 = 0;
                for (Entry entry : map.entrySet()) {
                    int i3;
                    C0487l a = this.f2470b.m1917a(entry.getKey());
                    arrayList.add(a);
                    arrayList2.add(entry.getValue());
                    if (!a.m1908g()) {
                        if (!a.m1909h()) {
                            i3 = 0;
                            i2 |= i3;
                        }
                    }
                    i3 = 1;
                    i2 |= i3;
                }
                int size;
                if (i2 != 0) {
                    c0479c.mo387b();
                    size = arrayList.size();
                    while (i < size) {
                        c0479c.mo387b();
                        C0472l.m1812a((C0487l) arrayList.get(i), c0479c);
                        this.f2471c.mo360a(c0479c, arrayList2.get(i));
                        c0479c.mo389c();
                        i++;
                    }
                    c0479c.mo389c();
                } else {
                    c0479c.mo391d();
                    size = arrayList.size();
                    while (i < size) {
                        c0479c.mo384a(m3056a((C0487l) arrayList.get(i)));
                        this.f2471c.mo360a(c0479c, arrayList2.get(i));
                        i++;
                    }
                    c0479c.mo392e();
                }
            } else {
                c0479c.mo391d();
                for (Entry entry2 : map.entrySet()) {
                    c0479c.mo384a(String.valueOf(entry2.getKey()));
                    this.f2471c.mo360a(c0479c, entry2.getValue());
                }
                c0479c.mo392e();
            }
        }

        /* renamed from: b */
        public /* synthetic */ Object mo361b(C0477a c0477a) {
            return m3057a(c0477a);
        }
    }

    public C0662g(C0459c c0459c, boolean z) {
        this.f2474b = c0459c;
        this.f2473a = z;
    }

    /* renamed from: a */
    private C0492v<?> m3061a(C0482f c0482f, Type type) {
        if (type != Boolean.TYPE) {
            if (type != Boolean.class) {
                return c0482f.m1892a(C0475a.m1818a(type));
            }
        }
        return C0452n.f1597f;
    }

    /* renamed from: a */
    public <T> C0492v<T> mo362a(C0482f c0482f, C0475a<T> c0475a) {
        Type b = c0475a.m1823b();
        if (!Map.class.isAssignableFrom(c0475a.m1822a())) {
            return null;
        }
        Type[] b2 = C0458b.m1773b(b, C0458b.m1776e(b));
        return new C0661a(this, c0482f, b2[0], m3061a(c0482f, b2[0]), b2[1], c0482f.m1892a(C0475a.m1818a(b2[1])), this.f2474b.m1783a((C0475a) c0475a));
    }
}
