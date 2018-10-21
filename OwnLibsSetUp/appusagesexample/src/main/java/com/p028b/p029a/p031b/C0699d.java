package com.p028b.p029a.p031b;

import com.p028b.p029a.C0474b;
import com.p028b.p029a.C0482f;
import com.p028b.p029a.C0492v;
import com.p028b.p029a.C0493w;
import com.p028b.p029a.p030a.C0444d;
import com.p028b.p029a.p030a.C0445e;
import com.p028b.p029a.p035c.C0475a;
import com.p028b.p029a.p036d.C0477a;
import com.p028b.p029a.p036d.C0479c;
import java.util.Collections;
import java.util.List;

/* renamed from: com.b.a.b.d */
public final class C0699d implements C0493w, Cloneable {
    /* renamed from: a */
    public static final C0699d f2554a = new C0699d();
    /* renamed from: b */
    private double f2555b = -1.0d;
    /* renamed from: c */
    private int f2556c = 136;
    /* renamed from: d */
    private boolean f2557d = true;
    /* renamed from: e */
    private boolean f2558e;
    /* renamed from: f */
    private List<C0474b> f2559f = Collections.emptyList();
    /* renamed from: g */
    private List<C0474b> f2560g = Collections.emptyList();

    /* renamed from: a */
    private boolean m3243a(C0444d c0444d) {
        return c0444d == null || c0444d.m1742a() <= this.f2555b;
    }

    /* renamed from: a */
    private boolean m3244a(C0444d c0444d, C0445e c0445e) {
        return m3243a(c0444d) && m3245a(c0445e);
    }

    /* renamed from: a */
    private boolean m3245a(C0445e c0445e) {
        return c0445e == null || c0445e.m1743a() > this.f2555b;
    }

    /* renamed from: a */
    private boolean m3246a(Class<?> cls) {
        return (this.f2555b == -1.0d || m3244a((C0444d) cls.getAnnotation(C0444d.class), (C0445e) cls.getAnnotation(C0445e.class))) ? (!this.f2557d && m3249c(cls)) || m3247b(cls) : true;
    }

    /* renamed from: b */
    private boolean m3247b(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    /* renamed from: b */
    private boolean m3248b(Class<?> cls, boolean z) {
        for (C0474b a : z ? this.f2559f : this.f2560g) {
            if (a.m1817a((Class) cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private boolean m3249c(Class<?> cls) {
        return cls.isMemberClass() && !m3250d(cls);
    }

    /* renamed from: d */
    private boolean m3250d(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    /* renamed from: a */
    protected C0699d m3251a() {
        try {
            return (C0699d) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public <T> C0492v<T> mo362a(C0482f c0482f, C0475a<T> c0475a) {
        boolean z;
        boolean z2;
        final C0482f c0482f2;
        final C0475a<T> c0475a2;
        Class a = c0475a.m1822a();
        boolean a2 = m3246a(a);
        if (!a2) {
            if (!m3248b(a, true)) {
                z = false;
                if (!a2) {
                    if (m3248b(a, false)) {
                        z2 = false;
                        if (z && !z2) {
                            return null;
                        }
                        c0482f2 = c0482f;
                        c0475a2 = c0475a;
                        return new C0492v<T>(this) {
                            /* renamed from: e */
                            final /* synthetic */ C0699d f2552e;
                            /* renamed from: f */
                            private C0492v<T> f2553f;

                            /* renamed from: b */
                            private C0492v<T> m3240b() {
                                C0492v<T> c0492v = this.f2553f;
                                if (c0492v != null) {
                                    return c0492v;
                                }
                                c0492v = c0482f2.m1893a(this.f2552e, c0475a2);
                                this.f2553f = c0492v;
                                return c0492v;
                            }

                            /* renamed from: a */
                            public void mo360a(C0479c c0479c, T t) {
                                if (z) {
                                    c0479c.mo393f();
                                } else {
                                    m3240b().mo360a(c0479c, t);
                                }
                            }

                            /* renamed from: b */
                            public T mo361b(C0477a c0477a) {
                                if (!z2) {
                                    return m3240b().mo361b(c0477a);
                                }
                                c0477a.mo377n();
                                return null;
                            }
                        };
                    }
                }
                z2 = true;
                if (z) {
                }
                c0482f2 = c0482f;
                c0475a2 = c0475a;
                return /* anonymous class already generated */;
            }
        }
        z = true;
        if (a2) {
            if (m3248b(a, false)) {
                z2 = false;
                if (z) {
                }
                c0482f2 = c0482f;
                c0475a2 = c0475a;
                return /* anonymous class already generated */;
            }
        }
        z2 = true;
        if (z) {
        }
        c0482f2 = c0482f;
        c0475a2 = c0475a;
        return /* anonymous class already generated */;
    }

    /* renamed from: a */
    public boolean m3253a(Class<?> cls, boolean z) {
        if (!m3246a((Class) cls)) {
            if (!m3248b(cls, z)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public boolean m3254a(java.lang.reflect.Field r7, boolean r8) {
        /*
        r6 = this;
        r0 = r6.f2556c;
        r1 = r7.getModifiers();
        r0 = r0 & r1;
        r1 = 1;
        if (r0 == 0) goto L_0x000b;
    L_0x000a:
        return r1;
    L_0x000b:
        r2 = r6.f2555b;
        r4 = -4616189618054758400; // 0xbff0000000000000 float:0.0 double:-1.0;
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 == 0) goto L_0x002a;
    L_0x0013:
        r0 = com.p028b.p029a.p030a.C0444d.class;
        r0 = r7.getAnnotation(r0);
        r0 = (com.p028b.p029a.p030a.C0444d) r0;
        r2 = com.p028b.p029a.p030a.C0445e.class;
        r2 = r7.getAnnotation(r2);
        r2 = (com.p028b.p029a.p030a.C0445e) r2;
        r0 = r6.m3244a(r0, r2);
        if (r0 != 0) goto L_0x002a;
    L_0x0029:
        return r1;
    L_0x002a:
        r0 = r7.isSynthetic();
        if (r0 == 0) goto L_0x0031;
    L_0x0030:
        return r1;
    L_0x0031:
        r0 = r6.f2558e;
        if (r0 == 0) goto L_0x004f;
    L_0x0035:
        r0 = com.p028b.p029a.p030a.C0441a.class;
        r0 = r7.getAnnotation(r0);
        r0 = (com.p028b.p029a.p030a.C0441a) r0;
        if (r0 == 0) goto L_0x004e;
    L_0x003f:
        if (r8 == 0) goto L_0x0048;
    L_0x0041:
        r0 = r0.m1736a();
        if (r0 != 0) goto L_0x004f;
    L_0x0047:
        goto L_0x004e;
    L_0x0048:
        r0 = r0.m1737b();
        if (r0 != 0) goto L_0x004f;
    L_0x004e:
        return r1;
    L_0x004f:
        r0 = r6.f2557d;
        if (r0 != 0) goto L_0x005e;
    L_0x0053:
        r0 = r7.getType();
        r0 = r6.m3249c(r0);
        if (r0 == 0) goto L_0x005e;
    L_0x005d:
        return r1;
    L_0x005e:
        r0 = r7.getType();
        r0 = r6.m3247b(r0);
        if (r0 == 0) goto L_0x0069;
    L_0x0068:
        return r1;
    L_0x0069:
        if (r8 == 0) goto L_0x006e;
    L_0x006b:
        r8 = r6.f2559f;
        goto L_0x0070;
    L_0x006e:
        r8 = r6.f2560g;
    L_0x0070:
        r0 = r8.isEmpty();
        if (r0 != 0) goto L_0x0092;
    L_0x0076:
        r0 = new com.b.a.c;
        r0.<init>(r7);
        r7 = r8.iterator();
    L_0x007f:
        r8 = r7.hasNext();
        if (r8 == 0) goto L_0x0092;
    L_0x0085:
        r8 = r7.next();
        r8 = (com.p028b.p029a.C0474b) r8;
        r8 = r8.m1816a(r0);
        if (r8 == 0) goto L_0x007f;
    L_0x0091:
        return r1;
    L_0x0092:
        r7 = 0;
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.b.a.b.d.a(java.lang.reflect.Field, boolean):boolean");
    }

    protected /* synthetic */ Object clone() {
        return m3251a();
    }
}
