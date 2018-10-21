package com.p028b.p029a.p031b.p032a;

import com.p028b.p029a.C0481e;
import com.p028b.p029a.C0482f;
import com.p028b.p029a.C0492v;
import com.p028b.p029a.C0493w;
import com.p028b.p029a.C0719t;
import com.p028b.p029a.p030a.C0442b;
import com.p028b.p029a.p030a.C0443c;
import com.p028b.p029a.p031b.C0458b;
import com.p028b.p029a.p031b.C0459c;
import com.p028b.p029a.p031b.C0469i;
import com.p028b.p029a.p031b.C0471k;
import com.p028b.p029a.p031b.C0699d;
import com.p028b.p029a.p031b.p034b.C0457b;
import com.p028b.p029a.p035c.C0475a;
import com.p028b.p029a.p036d.C0477a;
import com.p028b.p029a.p036d.C0478b;
import com.p028b.p029a.p036d.C0479c;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.b.a.b.a.i */
public final class C0667i implements C0493w {
    /* renamed from: a */
    private final C0459c f2486a;
    /* renamed from: b */
    private final C0481e f2487b;
    /* renamed from: c */
    private final C0699d f2488c;
    /* renamed from: d */
    private final C0658d f2489d;
    /* renamed from: e */
    private final C0457b f2490e = C0457b.m1757a();

    /* renamed from: com.b.a.b.a.i$b */
    static abstract class C0450b {
        /* renamed from: h */
        final String f1562h;
        /* renamed from: i */
        final boolean f1563i;
        /* renamed from: j */
        final boolean f1564j;

        protected C0450b(String str, boolean z, boolean z2) {
            this.f1562h = str;
            this.f1563i = z;
            this.f1564j = z2;
        }

        /* renamed from: a */
        abstract void mo395a(C0477a c0477a, Object obj);

        /* renamed from: a */
        abstract void mo396a(C0479c c0479c, Object obj);

        /* renamed from: a */
        abstract boolean mo397a(Object obj);
    }

    /* renamed from: com.b.a.b.a.i$a */
    public static final class C0666a<T> extends C0492v<T> {
        /* renamed from: a */
        private final C0469i<T> f2484a;
        /* renamed from: b */
        private final Map<String, C0450b> f2485b;

        C0666a(C0469i<T> c0469i, Map<String, C0450b> map) {
            this.f2484a = c0469i;
            this.f2485b = map;
        }

        /* renamed from: a */
        public void mo360a(C0479c c0479c, T t) {
            if (t == null) {
                c0479c.mo393f();
                return;
            }
            c0479c.mo391d();
            try {
                for (C0450b c0450b : this.f2485b.values()) {
                    if (c0450b.mo397a(t)) {
                        c0479c.mo384a(c0450b.f1562h);
                        c0450b.mo396a(c0479c, (Object) t);
                    }
                }
                c0479c.mo392e();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        /* renamed from: b */
        public T mo361b(C0477a c0477a) {
            if (c0477a.mo369f() == C0478b.NULL) {
                c0477a.mo373j();
                return null;
            }
            Object a = this.f2484a.mo399a();
            try {
                c0477a.mo365c();
                while (c0477a.mo368e()) {
                    C0450b c0450b = (C0450b) this.f2485b.get(c0477a.mo370g());
                    if (c0450b != null) {
                        if (c0450b.f1564j) {
                            c0450b.mo395a(c0477a, a);
                        }
                    }
                    c0477a.mo377n();
                }
                c0477a.mo367d();
                return a;
            } catch (Throwable e) {
                throw new C0719t(e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public C0667i(C0459c c0459c, C0481e c0481e, C0699d c0699d, C0658d c0658d) {
        this.f2486a = c0459c;
        this.f2487b = c0481e;
        this.f2488c = c0699d;
        this.f2489d = c0658d;
    }

    /* renamed from: a */
    private C0450b m3071a(C0482f c0482f, Field field, String str, C0475a<?> c0475a, boolean z, boolean z2) {
        C0667i c0667i = this;
        C0482f c0482f2 = c0482f;
        C0475a c0475a2 = c0475a;
        final boolean a = C0471k.m1810a(c0475a.m1822a());
        Field field2 = field;
        C0442b c0442b = (C0442b) field.getAnnotation(C0442b.class);
        C0492v a2 = c0442b != null ? c0667i.f2489d.m3019a(c0667i.f2486a, c0482f, c0475a2, c0442b) : null;
        final boolean z3 = a2 != null;
        if (a2 == null) {
            a2 = c0482f.m1892a(c0475a2);
        }
        final C0492v c0492v = a2;
        field2 = field;
        c0482f2 = c0482f;
        final C0475a<?> c0475a3 = c0475a;
        return new C0450b(this, str, z, z2) {
            /* renamed from: g */
            final /* synthetic */ C0667i f2483g;

            /* renamed from: a */
            void mo395a(C0477a c0477a, Object obj) {
                Object b = c0492v.mo361b(c0477a);
                if (b != null || !a) {
                    field2.set(obj, b);
                }
            }

            /* renamed from: a */
            void mo396a(C0479c c0479c, Object obj) {
                (z3 ? c0492v : new C0674m(c0482f2, c0492v, c0475a3.m1823b())).mo360a(c0479c, field2.get(obj));
            }

            /* renamed from: a */
            public boolean mo397a(Object obj) {
                boolean z = false;
                if (!this.i) {
                    return false;
                }
                if (field2.get(obj) != obj) {
                    z = true;
                }
                return z;
            }
        };
    }

    /* renamed from: a */
    private List<String> m3072a(Field field) {
        C0443c c0443c = (C0443c) field.getAnnotation(C0443c.class);
        if (c0443c == null) {
            return Collections.singletonList(this.f2487b.mo535a(field));
        }
        String a = c0443c.m1740a();
        String[] b = c0443c.m1741b();
        if (b.length == 0) {
            return Collections.singletonList(a);
        }
        List<String> arrayList = new ArrayList(b.length + 1);
        arrayList.add(a);
        for (Object add : b) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* renamed from: a */
    private Map<String, C0450b> m3073a(C0482f c0482f, C0475a<?> c0475a, Class<?> cls) {
        C0667i c0667i = this;
        Map<String, C0450b> linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type b = c0475a.m1823b();
        C0475a c0475a2 = c0475a;
        Class cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                AccessibleObject accessibleObject = declaredFields[i];
                boolean a = m3076a((Field) accessibleObject, true);
                boolean a2 = m3076a((Field) accessibleObject, z);
                if (a || a2) {
                    C0450b c0450b;
                    c0667i.f2490e.mo398a(accessibleObject);
                    Type a3 = C0458b.m1766a(c0475a2.m1823b(), cls2, accessibleObject.getGenericType());
                    List a4 = m3072a(accessibleObject);
                    int size = a4.size();
                    C0450b c0450b2 = null;
                    int i2 = 0;
                    while (i2 < size) {
                        String str = (String) a4.get(i2);
                        boolean z2 = i2 != 0 ? false : a;
                        String str2 = str;
                        c0450b = c0450b2;
                        int i3 = i2;
                        int i4 = size;
                        List list = a4;
                        AccessibleObject accessibleObject2 = accessibleObject;
                        c0450b2 = c0450b == null ? (C0450b) linkedHashMap.put(str2, m3071a(c0482f, accessibleObject, str2, C0475a.m1818a(a3), z2, a2)) : c0450b;
                        i2 = i3 + 1;
                        a = z2;
                        a4 = list;
                        size = i4;
                        accessibleObject = accessibleObject2;
                    }
                    c0450b = c0450b2;
                    if (c0450b != null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(b);
                        stringBuilder.append(" declares multiple JSON fields named ");
                        stringBuilder.append(c0450b.f1562h);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
                i++;
                z = false;
            }
            c0475a2 = C0475a.m1818a(C0458b.m1766a(c0475a2.m1823b(), cls2, cls2.getGenericSuperclass()));
            cls2 = c0475a2.m1822a();
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    static boolean m3074a(Field field, boolean z, C0699d c0699d) {
        return (c0699d.m3253a(field.getType(), z) || c0699d.m3254a(field, z)) ? false : true;
    }

    /* renamed from: a */
    public <T> C0492v<T> mo362a(C0482f c0482f, C0475a<T> c0475a) {
        Class a = c0475a.m1822a();
        return !Object.class.isAssignableFrom(a) ? null : new C0666a(this.f2486a.m1783a((C0475a) c0475a), m3073a(c0482f, (C0475a) c0475a, a));
    }

    /* renamed from: a */
    public boolean m3076a(Field field, boolean z) {
        return C0667i.m3074a(field, z, this.f2488c);
    }
}
