package com.p028b.p029a.p031b;

import com.p028b.p029a.C0484h;
import com.p028b.p029a.C0715m;
import com.p028b.p029a.p031b.C0459c;
import com.p028b.p029a.p031b.p034b.C0457b;
import com.p028b.p029a.p035c.C0475a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* renamed from: com.b.a.b.c */
public final class C0459c {
    /* renamed from: a */
    private final Map<Type, C0484h<?>> f1626a;
    /* renamed from: b */
    private final C0457b f1627b = C0457b.m1757a();

    /* renamed from: com.b.a.b.c$2 */
    class C06902 implements C0469i<T> {
        /* renamed from: a */
        final /* synthetic */ C0459c f2534a;

        C06902(C0459c c0459c) {
            this.f2534a = c0459c;
        }

        /* renamed from: a */
        public T mo399a() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: com.b.a.b.c$3 */
    class C06913 implements C0469i<T> {
        /* renamed from: a */
        final /* synthetic */ C0459c f2535a;

        C06913(C0459c c0459c) {
            this.f2535a = c0459c;
        }

        /* renamed from: a */
        public T mo399a() {
            return new TreeMap();
        }
    }

    /* renamed from: com.b.a.b.c$4 */
    class C06924 implements C0469i<T> {
        /* renamed from: a */
        final /* synthetic */ C0459c f2536a;

        C06924(C0459c c0459c) {
            this.f2536a = c0459c;
        }

        /* renamed from: a */
        public T mo399a() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: com.b.a.b.c$5 */
    class C06935 implements C0469i<T> {
        /* renamed from: a */
        final /* synthetic */ C0459c f2537a;

        C06935(C0459c c0459c) {
            this.f2537a = c0459c;
        }

        /* renamed from: a */
        public T mo399a() {
            return new C0468h();
        }
    }

    /* renamed from: com.b.a.b.c$9 */
    class C06979 implements C0469i<T> {
        /* renamed from: a */
        final /* synthetic */ C0459c f2547a;

        C06979(C0459c c0459c) {
            this.f2547a = c0459c;
        }

        /* renamed from: a */
        public T mo399a() {
            return new TreeSet();
        }
    }

    public C0459c(Map<Type, C0484h<?>> map) {
        this.f1626a = map;
    }

    /* renamed from: a */
    private <T> com.p028b.p029a.p031b.C0469i<T> m1780a(java.lang.Class<? super T> r2) {
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
        r1 = this;
        r0 = 0;
        r0 = new java.lang.Class[r0];	 Catch:{ NoSuchMethodException -> 0x0018 }
        r2 = r2.getDeclaredConstructor(r0);	 Catch:{ NoSuchMethodException -> 0x0018 }
        r0 = r2.isAccessible();	 Catch:{ NoSuchMethodException -> 0x0018 }
        if (r0 != 0) goto L_0x0012;	 Catch:{ NoSuchMethodException -> 0x0018 }
    L_0x000d:
        r0 = r1.f1627b;	 Catch:{ NoSuchMethodException -> 0x0018 }
        r0.mo398a(r2);	 Catch:{ NoSuchMethodException -> 0x0018 }
    L_0x0012:
        r0 = new com.b.a.b.c$8;	 Catch:{ NoSuchMethodException -> 0x0018 }
        r0.<init>(r1, r2);	 Catch:{ NoSuchMethodException -> 0x0018 }
        return r0;
    L_0x0018:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.b.a.b.c.a(java.lang.Class):com.b.a.b.i<T>");
    }

    /* renamed from: a */
    private <T> C0469i<T> m1781a(final Type type, Class<? super T> cls) {
        return Collection.class.isAssignableFrom(cls) ? SortedSet.class.isAssignableFrom(cls) ? new C06979(this) : EnumSet.class.isAssignableFrom(cls) ? new C0469i<T>(this) {
            /* renamed from: b */
            final /* synthetic */ C0459c f2526b;

            /* renamed from: a */
            public T mo399a() {
                if (type instanceof ParameterizedType) {
                    Type type = ((ParameterizedType) type).getActualTypeArguments()[0];
                    if (type instanceof Class) {
                        return EnumSet.noneOf((Class) type);
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid EnumSet type: ");
                    stringBuilder.append(type.toString());
                    throw new C0715m(stringBuilder.toString());
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid EnumSet type: ");
                stringBuilder.append(type.toString());
                throw new C0715m(stringBuilder.toString());
            }
        } : Set.class.isAssignableFrom(cls) ? new C0469i<T>(this) {
            /* renamed from: a */
            final /* synthetic */ C0459c f2527a;

            {
                this.f2527a = r1;
            }

            /* renamed from: a */
            public T mo399a() {
                return new LinkedHashSet();
            }
        } : Queue.class.isAssignableFrom(cls) ? new C0469i<T>(this) {
            /* renamed from: a */
            final /* synthetic */ C0459c f2528a;

            {
                this.f2528a = r1;
            }

            /* renamed from: a */
            public T mo399a() {
                return new ArrayDeque();
            }
        } : new C0469i<T>(this) {
            /* renamed from: a */
            final /* synthetic */ C0459c f2529a;

            {
                this.f2529a = r1;
            }

            /* renamed from: a */
            public T mo399a() {
                return new ArrayList();
            }
        } : Map.class.isAssignableFrom(cls) ? ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new C0469i<T>(this) {
            /* renamed from: a */
            final /* synthetic */ C0459c f2530a;

            {
                this.f2530a = r1;
            }

            /* renamed from: a */
            public T mo399a() {
                return new ConcurrentSkipListMap();
            }
        } : ConcurrentMap.class.isAssignableFrom(cls) ? new C06902(this) : SortedMap.class.isAssignableFrom(cls) ? new C06913(this) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(C0475a.m1818a(((ParameterizedType) type).getActualTypeArguments()[0]).m1822a())) ? new C06935(this) : new C06924(this) : null;
    }

    /* renamed from: b */
    private <T> C0469i<T> m1782b(final Type type, final Class<? super T> cls) {
        return new C0469i<T>(this) {
            /* renamed from: c */
            final /* synthetic */ C0459c f2540c;
            /* renamed from: d */
            private final C0473m f2541d = C0473m.m1813a();

            /* renamed from: a */
            public T mo399a() {
                try {
                    return this.f2541d.mo400a(cls);
                } catch (Throwable e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unable to invoke no-args constructor for ");
                    stringBuilder.append(type);
                    stringBuilder.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
                    throw new RuntimeException(stringBuilder.toString(), e);
                }
            }
        };
    }

    /* renamed from: a */
    public <T> C0469i<T> m1783a(C0475a<T> c0475a) {
        final Type b = c0475a.m1823b();
        Class a = c0475a.m1822a();
        final C0484h c0484h = (C0484h) this.f1626a.get(b);
        if (c0484h != null) {
            return new C0469i<T>(this) {
                /* renamed from: c */
                final /* synthetic */ C0459c f2533c;

                /* renamed from: a */
                public T mo399a() {
                    return c0484h.m1900a(b);
                }
            };
        }
        c0484h = (C0484h) this.f1626a.get(a);
        if (c0484h != null) {
            return new C0469i<T>(this) {
                /* renamed from: c */
                final /* synthetic */ C0459c f2544c;

                /* renamed from: a */
                public T mo399a() {
                    return c0484h.m1900a(b);
                }
            };
        }
        C0469i<T> a2 = m1780a(a);
        if (a2 != null) {
            return a2;
        }
        a2 = m1781a(b, a);
        return a2 != null ? a2 : m1782b(b, a);
    }

    public String toString() {
        return this.f1626a.toString();
    }
}
