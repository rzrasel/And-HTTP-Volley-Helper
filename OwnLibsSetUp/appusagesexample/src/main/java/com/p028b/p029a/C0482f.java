package com.p028b.p029a;

import com.p028b.p029a.p031b.C0459c;
import com.p028b.p029a.p031b.C0699d;
import com.p028b.p029a.p031b.p032a.C0452n;
import com.p028b.p029a.p031b.p032a.C0653a;
import com.p028b.p029a.p031b.p032a.C0655b;
import com.p028b.p029a.p031b.p032a.C0657c;
import com.p028b.p029a.p031b.p032a.C0658d;
import com.p028b.p029a.p031b.p032a.C0662g;
import com.p028b.p029a.p031b.p032a.C0664h;
import com.p028b.p029a.p031b.p032a.C0667i;
import com.p028b.p029a.p031b.p032a.C0669j;
import com.p028b.p029a.p031b.p032a.C0671k;
import com.p028b.p029a.p035c.C0475a;
import com.p028b.p029a.p036d.C0477a;
import com.p028b.p029a.p036d.C0478b;
import com.p028b.p029a.p036d.C0479c;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* renamed from: com.b.a.f */
public final class C0482f {
    /* renamed from: r */
    private static final C0475a<?> f1698r = C0475a.m1821b(Object.class);
    /* renamed from: a */
    final List<C0493w> f1699a;
    /* renamed from: b */
    final C0699d f1700b;
    /* renamed from: c */
    final C0481e f1701c;
    /* renamed from: d */
    final Map<Type, C0484h<?>> f1702d;
    /* renamed from: e */
    final boolean f1703e;
    /* renamed from: f */
    final boolean f1704f;
    /* renamed from: g */
    final boolean f1705g;
    /* renamed from: h */
    final boolean f1706h;
    /* renamed from: i */
    final boolean f1707i;
    /* renamed from: j */
    final boolean f1708j;
    /* renamed from: k */
    final boolean f1709k;
    /* renamed from: l */
    final String f1710l;
    /* renamed from: m */
    final int f1711m;
    /* renamed from: n */
    final int f1712n;
    /* renamed from: o */
    final C0491u f1713o;
    /* renamed from: p */
    final List<C0493w> f1714p;
    /* renamed from: q */
    final List<C0493w> f1715q;
    /* renamed from: s */
    private final ThreadLocal<Map<C0475a<?>, C0713a<?>>> f1716s;
    /* renamed from: t */
    private final Map<C0475a<?>, C0492v<?>> f1717t;
    /* renamed from: u */
    private final C0459c f1718u;
    /* renamed from: v */
    private final C0658d f1719v;

    /* renamed from: com.b.a.f$1 */
    class C07081 extends C0492v<Number> {
        /* renamed from: a */
        final /* synthetic */ C0482f f2575a;

        C07081(C0482f c0482f) {
            this.f2575a = c0482f;
        }

        /* renamed from: a */
        public Double m3264a(C0477a c0477a) {
            if (c0477a.mo369f() != C0478b.NULL) {
                return Double.valueOf(c0477a.mo374k());
            }
            c0477a.mo373j();
            return null;
        }

        /* renamed from: a */
        public void m3265a(C0479c c0479c, Number number) {
            if (number == null) {
                c0479c.mo393f();
                return;
            }
            C0482f.m1887a(number.doubleValue());
            c0479c.mo383a(number);
        }

        /* renamed from: b */
        public /* synthetic */ Object mo361b(C0477a c0477a) {
            return m3264a(c0477a);
        }
    }

    /* renamed from: com.b.a.f$2 */
    class C07092 extends C0492v<Number> {
        /* renamed from: a */
        final /* synthetic */ C0482f f2576a;

        C07092(C0482f c0482f) {
            this.f2576a = c0482f;
        }

        /* renamed from: a */
        public Float m3268a(C0477a c0477a) {
            if (c0477a.mo369f() != C0478b.NULL) {
                return Float.valueOf((float) c0477a.mo374k());
            }
            c0477a.mo373j();
            return null;
        }

        /* renamed from: a */
        public void m3269a(C0479c c0479c, Number number) {
            if (number == null) {
                c0479c.mo393f();
                return;
            }
            C0482f.m1887a((double) number.floatValue());
            c0479c.mo383a(number);
        }

        /* renamed from: b */
        public /* synthetic */ Object mo361b(C0477a c0477a) {
            return m3268a(c0477a);
        }
    }

    /* renamed from: com.b.a.f$3 */
    static class C07103 extends C0492v<Number> {
        C07103() {
        }

        /* renamed from: a */
        public Number m3272a(C0477a c0477a) {
            if (c0477a.mo369f() != C0478b.NULL) {
                return Long.valueOf(c0477a.mo375l());
            }
            c0477a.mo373j();
            return null;
        }

        /* renamed from: a */
        public void m3273a(C0479c c0479c, Number number) {
            if (number == null) {
                c0479c.mo393f();
            } else {
                c0479c.mo388b(number.toString());
            }
        }

        /* renamed from: b */
        public /* synthetic */ Object mo361b(C0477a c0477a) {
            return m3272a(c0477a);
        }
    }

    /* renamed from: com.b.a.f$a */
    static class C0713a<T> extends C0492v<T> {
        /* renamed from: a */
        private C0492v<T> f2579a;

        C0713a() {
        }

        /* renamed from: a */
        public void mo360a(C0479c c0479c, T t) {
            if (this.f2579a != null) {
                this.f2579a.mo360a(c0479c, t);
                return;
            }
            throw new IllegalStateException();
        }

        /* renamed from: a */
        public void m3285a(C0492v<T> c0492v) {
            if (this.f2579a == null) {
                this.f2579a = c0492v;
                return;
            }
            throw new AssertionError();
        }

        /* renamed from: b */
        public T mo361b(C0477a c0477a) {
            if (this.f2579a != null) {
                return this.f2579a.mo361b(c0477a);
            }
            throw new IllegalStateException();
        }
    }

    public C0482f() {
        this(C0699d.f2554a, C0707d.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, C0491u.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    C0482f(C0699d c0699d, C0481e c0481e, Map<Type, C0484h<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, C0491u c0491u, String str, int i, int i2, List<C0493w> list, List<C0493w> list2, List<C0493w> list3) {
        C0699d c0699d2 = c0699d;
        C0481e c0481e2 = c0481e;
        Map<Type, C0484h<?>> map2 = map;
        boolean z8 = z2;
        boolean z9 = z7;
        this.f1716s = new ThreadLocal();
        this.f1717t = new ConcurrentHashMap();
        this.f1700b = c0699d2;
        this.f1701c = c0481e2;
        this.f1702d = map2;
        this.f1718u = new C0459c(map);
        this.f1703e = z;
        this.f1704f = z8;
        this.f1705g = z3;
        this.f1706h = z4;
        this.f1707i = z5;
        this.f1708j = z6;
        this.f1709k = z9;
        this.f1713o = c0491u;
        this.f1710l = str;
        this.f1711m = i;
        this.f1712n = i2;
        this.f1714p = list;
        this.f1715q = list2;
        List arrayList = new ArrayList();
        arrayList.add(C0452n.f1590Y);
        arrayList.add(C0664h.f2475a);
        arrayList.add(c0699d);
        arrayList.addAll(list3);
        arrayList.add(C0452n.f1569D);
        arrayList.add(C0452n.f1604m);
        arrayList.add(C0452n.f1598g);
        arrayList.add(C0452n.f1600i);
        arrayList.add(C0452n.f1602k);
        C0492v a = C0482f.m1884a(c0491u);
        arrayList.add(C0452n.m1752a(Long.TYPE, Long.class, a));
        arrayList.add(C0452n.m1752a(Double.TYPE, Double.class, m1886a(z9)));
        arrayList.add(C0452n.m1752a(Float.TYPE, Float.class, m1890b(z9)));
        arrayList.add(C0452n.f1615x);
        arrayList.add(C0452n.f1606o);
        arrayList.add(C0452n.f1608q);
        arrayList.add(C0452n.m1751a(AtomicLong.class, C0482f.m1885a(a)));
        arrayList.add(C0452n.m1751a(AtomicLongArray.class, C0482f.m1889b(a)));
        arrayList.add(C0452n.f1610s);
        arrayList.add(C0452n.f1617z);
        arrayList.add(C0452n.f1571F);
        arrayList.add(C0452n.f1573H);
        arrayList.add(C0452n.m1751a(BigDecimal.class, C0452n.f1567B));
        arrayList.add(C0452n.m1751a(BigInteger.class, C0452n.f1568C));
        arrayList.add(C0452n.f1575J);
        arrayList.add(C0452n.f1577L);
        arrayList.add(C0452n.f1581P);
        arrayList.add(C0452n.f1583R);
        arrayList.add(C0452n.f1588W);
        arrayList.add(C0452n.f1579N);
        arrayList.add(C0452n.f1595d);
        arrayList.add(C0657c.f2455a);
        arrayList.add(C0452n.f1586U);
        arrayList.add(C0671k.f2493a);
        arrayList.add(C0669j.f2491a);
        arrayList.add(C0452n.f1584S);
        arrayList.add(C0653a.f2449a);
        arrayList.add(C0452n.f1593b);
        arrayList.add(new C0655b(this.f1718u));
        arrayList.add(new C0662g(this.f1718u, z2));
        this.f1719v = new C0658d(this.f1718u);
        arrayList.add(this.f1719v);
        arrayList.add(C0452n.f1591Z);
        arrayList.add(new C0667i(this.f1718u, c0481e, c0699d, this.f1719v));
        this.f1699a = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    private static C0492v<Number> m1884a(C0491u c0491u) {
        return c0491u == C0491u.DEFAULT ? C0452n.f1611t : new C07103();
    }

    /* renamed from: a */
    private static C0492v<AtomicLong> m1885a(final C0492v<Number> c0492v) {
        return new C0492v<AtomicLong>() {
            /* renamed from: a */
            public AtomicLong m3276a(C0477a c0477a) {
                return new AtomicLong(((Number) c0492v.mo361b(c0477a)).longValue());
            }

            /* renamed from: a */
            public void m3278a(C0479c c0479c, AtomicLong atomicLong) {
                c0492v.mo360a(c0479c, Long.valueOf(atomicLong.get()));
            }

            /* renamed from: b */
            public /* synthetic */ Object mo361b(C0477a c0477a) {
                return m3276a(c0477a);
            }
        }.m1918a();
    }

    /* renamed from: a */
    private C0492v<Number> m1886a(boolean z) {
        return z ? C0452n.f1613v : new C07081(this);
    }

    /* renamed from: a */
    static void m1887a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(d);
            stringBuilder.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    private static void m1888a(Object obj, C0477a c0477a) {
        if (obj != null) {
            try {
                if (c0477a.mo369f() != C0478b.END_DOCUMENT) {
                    throw new C0715m("JSON document was not fully consumed.");
                }
            } catch (Throwable e) {
                throw new C0719t(e);
            } catch (Throwable e2) {
                throw new C0715m(e2);
            }
        }
    }

    /* renamed from: b */
    private static C0492v<AtomicLongArray> m1889b(final C0492v<Number> c0492v) {
        return new C0492v<AtomicLongArray>() {
            /* renamed from: a */
            public AtomicLongArray m3280a(C0477a c0477a) {
                List arrayList = new ArrayList();
                c0477a.mo363a();
                while (c0477a.mo368e()) {
                    arrayList.add(Long.valueOf(((Number) c0492v.mo361b(c0477a)).longValue()));
                }
                c0477a.mo364b();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            }

            /* renamed from: a */
            public void m3282a(C0479c c0479c, AtomicLongArray atomicLongArray) {
                c0479c.mo387b();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    c0492v.mo360a(c0479c, Long.valueOf(atomicLongArray.get(i)));
                }
                c0479c.mo389c();
            }

            /* renamed from: b */
            public /* synthetic */ Object mo361b(C0477a c0477a) {
                return m3280a(c0477a);
            }
        }.m1918a();
    }

    /* renamed from: b */
    private C0492v<Number> m1890b(boolean z) {
        return z ? C0452n.f1612u : new C07092(this);
    }

    /* renamed from: a */
    public C0477a m1891a(Reader reader) {
        C0477a c0477a = new C0477a(reader);
        c0477a.m1841a(this.f1708j);
        return c0477a;
    }

    /* renamed from: a */
    public <T> C0492v<T> m1892a(C0475a<T> c0475a) {
        C0492v<T> c0492v = (C0492v) this.f1717t.get(c0475a == null ? f1698r : c0475a);
        if (c0492v != null) {
            return c0492v;
        }
        Map map = (Map) this.f1716s.get();
        Object obj = null;
        if (map == null) {
            map = new HashMap();
            this.f1716s.set(map);
            obj = 1;
        }
        C0713a c0713a = (C0713a) map.get(c0475a);
        if (c0713a != null) {
            return c0713a;
        }
        try {
            C0492v<T> hasNext;
            c0713a = new C0713a();
            map.put(c0475a, c0713a);
            Iterator it = this.f1699a.iterator();
            while (true) {
                hasNext = it.hasNext();
                if (hasNext != null) {
                    hasNext = ((C0493w) it.next()).mo362a(this, c0475a);
                    if (hasNext != null) {
                        break;
                    }
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("GSON (2.8.5) cannot handle ");
                stringBuilder.append(c0475a);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            c0713a.m3285a(hasNext);
            this.f1717t.put(c0475a, hasNext);
            return hasNext;
        } finally {
            map.remove(c0475a);
            if (obj != null) {
                this.f1716s.remove();
            }
        }
    }

    /* renamed from: a */
    public <T> C0492v<T> m1893a(C0493w c0493w, C0475a<T> c0475a) {
        if (!this.f1699a.contains(c0493w)) {
            c0493w = this.f1719v;
        }
        Object obj = null;
        for (C0493w c0493w2 : this.f1699a) {
            if (obj != null) {
                C0492v<T> a = c0493w2.mo362a(this, c0475a);
                if (a != null) {
                    return a;
                }
            } else if (c0493w2 == c0493w) {
                obj = 1;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GSON cannot serialize ");
        stringBuilder.append(c0475a);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    public <T> C0492v<T> m1894a(Class<T> cls) {
        return m1892a(C0475a.m1821b(cls));
    }

    /* renamed from: a */
    public <T> T m1895a(C0477a c0477a, Type type) {
        boolean q = c0477a.m1856q();
        boolean z = true;
        c0477a.m1841a(true);
        try {
            c0477a.mo369f();
            z = false;
            T b = m1892a(C0475a.m1818a(type)).mo361b(c0477a);
            c0477a.m1841a(q);
            return b;
        } catch (Throwable e) {
            if (z) {
                c0477a.m1841a(q);
                return null;
            }
            throw new C0719t(e);
        } catch (Throwable e2) {
            throw new C0719t(e2);
        } catch (Throwable e22) {
            throw new C0719t(e22);
        } catch (Throwable e222) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AssertionError (GSON 2.8.5): ");
            stringBuilder.append(e222.getMessage());
            throw new AssertionError(stringBuilder.toString(), e222);
        } catch (Throwable th) {
            c0477a.m1841a(q);
        }
    }

    /* renamed from: a */
    public <T> T m1896a(Reader reader, Type type) {
        C0477a a = m1891a(reader);
        Object a2 = m1895a(a, type);
        C0482f.m1888a(a2, a);
        return a2;
    }

    /* renamed from: a */
    public <T> T m1897a(String str, Type type) {
        return str == null ? null : m1896a(new StringReader(str), type);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{serializeNulls:");
        stringBuilder.append(this.f1703e);
        stringBuilder.append(",factories:");
        stringBuilder.append(this.f1699a);
        stringBuilder.append(",instanceCreators:");
        stringBuilder.append(this.f1718u);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
