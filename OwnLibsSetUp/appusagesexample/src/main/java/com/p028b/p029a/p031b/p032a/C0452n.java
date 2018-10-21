package com.p028b.p029a.p031b.p032a;

import com.b.a.b.a.n.AnonymousClass19;
import com.b.a.b.a.n.AnonymousClass28;
import com.b.a.b.a.n.AnonymousClass29;
import com.p028b.p029a.C0482f;
import com.p028b.p029a.C0487l;
import com.p028b.p029a.C0492v;
import com.p028b.p029a.C0493w;
import com.p028b.p029a.C0714i;
import com.p028b.p029a.C0715m;
import com.p028b.p029a.C0716n;
import com.p028b.p029a.C0717o;
import com.p028b.p029a.C0718q;
import com.p028b.p029a.C0719t;
import com.p028b.p029a.p030a.C0443c;
import com.p028b.p029a.p031b.C0462g;
import com.p028b.p029a.p031b.p032a.C0452n.C0686a;
import com.p028b.p029a.p035c.C0475a;
import com.p028b.p029a.p036d.C0477a;
import com.p028b.p029a.p036d.C0478b;
import com.p028b.p029a.p036d.C0479c;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* renamed from: com.b.a.b.a.n */
public final class C0452n {
    /* renamed from: A */
    public static final C0492v<String> f1566A = new C06848();
    /* renamed from: B */
    public static final C0492v<BigDecimal> f1567B = new C06859();
    /* renamed from: C */
    public static final C0492v<BigInteger> f1568C = new C0492v<BigInteger>() {
        /* renamed from: a */
        public BigInteger m3093a(C0477a c0477a) {
            if (c0477a.mo369f() == C0478b.NULL) {
                c0477a.mo373j();
                return null;
            }
            try {
                return new BigInteger(c0477a.mo371h());
            } catch (Throwable e) {
                throw new C0719t(e);
            }
        }

        /* renamed from: a */
        public void m3095a(C0479c c0479c, BigInteger bigInteger) {
            c0479c.mo383a((Number) bigInteger);
        }

        /* renamed from: b */
        public /* synthetic */ Object mo361b(C0477a c0477a) {
            return m3093a(c0477a);
        }
    };
    /* renamed from: D */
    public static final C0493w f1569D = C0452n.m1751a(String.class, f1566A);
    /* renamed from: E */
    public static final C0492v<StringBuilder> f1570E = new C0492v<StringBuilder>() {
        /* renamed from: a */
        public StringBuilder m3097a(C0477a c0477a) {
            if (c0477a.mo369f() != C0478b.NULL) {
                return new StringBuilder(c0477a.mo371h());
            }
            c0477a.mo373j();
            return null;
        }

        /* renamed from: a */
        public void m3099a(C0479c c0479c, StringBuilder stringBuilder) {
            c0479c.mo388b(stringBuilder == null ? null : stringBuilder.toString());
        }

        /* renamed from: b */
        public /* synthetic */ Object mo361b(C0477a c0477a) {
            return m3097a(c0477a);
        }
    };
    /* renamed from: F */
    public static final C0493w f1571F = C0452n.m1751a(StringBuilder.class, f1570E);
    /* renamed from: G */
    public static final C0492v<StringBuffer> f1572G = new C0492v<StringBuffer>() {
        /* renamed from: a */
        public StringBuffer m3105a(C0477a c0477a) {
            if (c0477a.mo369f() != C0478b.NULL) {
                return new StringBuffer(c0477a.mo371h());
            }
            c0477a.mo373j();
            return null;
        }

        /* renamed from: a */
        public void m3107a(C0479c c0479c, StringBuffer stringBuffer) {
            c0479c.mo388b(stringBuffer == null ? null : stringBuffer.toString());
        }

        /* renamed from: b */
        public /* synthetic */ Object mo361b(C0477a c0477a) {
            return m3105a(c0477a);
        }
    };
    /* renamed from: H */
    public static final C0493w f1573H = C0452n.m1751a(StringBuffer.class, f1572G);
    /* renamed from: I */
    public static final C0492v<URL> f1574I = new C0492v<URL>() {
        /* renamed from: a */
        public URL m3109a(C0477a c0477a) {
            URL url = null;
            if (c0477a.mo369f() == C0478b.NULL) {
                c0477a.mo373j();
                return null;
            }
            String h = c0477a.mo371h();
            if (!"null".equals(h)) {
                url = new URL(h);
            }
            return url;
        }

        /* renamed from: a */
        public void m3111a(C0479c c0479c, URL url) {
            c0479c.mo388b(url == null ? null : url.toExternalForm());
        }

        /* renamed from: b */
        public /* synthetic */ Object mo361b(C0477a c0477a) {
            return m3109a(c0477a);
        }
    };
    /* renamed from: J */
    public static final C0493w f1575J = C0452n.m1751a(URL.class, f1574I);
    /* renamed from: K */
    public static final C0492v<URI> f1576K = new C0492v<URI>() {
        /* renamed from: a */
        public URI m3113a(C0477a c0477a) {
            URI uri = null;
            if (c0477a.mo369f() == C0478b.NULL) {
                c0477a.mo373j();
                return null;
            }
            try {
                String h = c0477a.mo371h();
                if (!"null".equals(h)) {
                    uri = new URI(h);
                }
                return uri;
            } catch (Throwable e) {
                throw new C0715m(e);
            }
        }

        /* renamed from: a */
        public void m3115a(C0479c c0479c, URI uri) {
            c0479c.mo388b(uri == null ? null : uri.toASCIIString());
        }

        /* renamed from: b */
        public /* synthetic */ Object mo361b(C0477a c0477a) {
            return m3113a(c0477a);
        }
    };
    /* renamed from: L */
    public static final C0493w f1577L = C0452n.m1751a(URI.class, f1576K);
    /* renamed from: M */
    public static final C0492v<InetAddress> f1578M = new C0492v<InetAddress>() {
        /* renamed from: a */
        public InetAddress m3117a(C0477a c0477a) {
            if (c0477a.mo369f() != C0478b.NULL) {
                return InetAddress.getByName(c0477a.mo371h());
            }
            c0477a.mo373j();
            return null;
        }

        /* renamed from: a */
        public void m3119a(C0479c c0479c, InetAddress inetAddress) {
            c0479c.mo388b(inetAddress == null ? null : inetAddress.getHostAddress());
        }

        /* renamed from: b */
        public /* synthetic */ Object mo361b(C0477a c0477a) {
            return m3117a(c0477a);
        }
    };
    /* renamed from: N */
    public static final C0493w f1579N = C0452n.m1753b(InetAddress.class, f1578M);
    /* renamed from: O */
    public static final C0492v<UUID> f1580O = new C0492v<UUID>() {
        /* renamed from: a */
        public UUID m3121a(C0477a c0477a) {
            if (c0477a.mo369f() != C0478b.NULL) {
                return UUID.fromString(c0477a.mo371h());
            }
            c0477a.mo373j();
            return null;
        }

        /* renamed from: a */
        public void m3123a(C0479c c0479c, UUID uuid) {
            c0479c.mo388b(uuid == null ? null : uuid.toString());
        }

        /* renamed from: b */
        public /* synthetic */ Object mo361b(C0477a c0477a) {
            return m3121a(c0477a);
        }
    };
    /* renamed from: P */
    public static final C0493w f1581P = C0452n.m1751a(UUID.class, f1580O);
    /* renamed from: Q */
    public static final C0492v<Currency> f1582Q = new C0492v<Currency>() {
        /* renamed from: a */
        public Currency m3125a(C0477a c0477a) {
            return Currency.getInstance(c0477a.mo371h());
        }

        /* renamed from: a */
        public void m3127a(C0479c c0479c, Currency currency) {
            c0479c.mo388b(currency.getCurrencyCode());
        }

        /* renamed from: b */
        public /* synthetic */ Object mo361b(C0477a c0477a) {
            return m3125a(c0477a);
        }
    }.m1918a();
    /* renamed from: R */
    public static final C0493w f1583R = C0452n.m1751a(Currency.class, f1582Q);
    /* renamed from: S */
    public static final C0493w f1584S = new C0493w() {
        /* renamed from: a */
        public <T> C0492v<T> mo362a(C0482f c0482f, C0475a<T> c0475a) {
            if (c0475a.m1822a() != Timestamp.class) {
                return null;
            }
            final C0492v a = c0482f.m1894a(Date.class);
            return new C0492v<Timestamp>(this) {
                /* renamed from: b */
                final /* synthetic */ AnonymousClass19 f2507b;

                /* renamed from: a */
                public Timestamp m3129a(C0477a c0477a) {
                    Date date = (Date) a.mo361b(c0477a);
                    return date != null ? new Timestamp(date.getTime()) : null;
                }

                /* renamed from: a */
                public void m3131a(C0479c c0479c, Timestamp timestamp) {
                    a.mo360a(c0479c, timestamp);
                }

                /* renamed from: b */
                public /* synthetic */ Object mo361b(C0477a c0477a) {
                    return m3129a(c0477a);
                }
            };
        }
    };
    /* renamed from: T */
    public static final C0492v<Calendar> f1585T = new C0492v<Calendar>() {
        /* renamed from: a */
        public Calendar m3138a(C0477a c0477a) {
            if (c0477a.mo369f() == C0478b.NULL) {
                c0477a.mo373j();
                return null;
            }
            c0477a.mo365c();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (c0477a.mo369f() != C0478b.END_OBJECT) {
                String g = c0477a.mo370g();
                int m = c0477a.mo376m();
                if ("year".equals(g)) {
                    i = m;
                } else if ("month".equals(g)) {
                    i2 = m;
                } else if ("dayOfMonth".equals(g)) {
                    i3 = m;
                } else if ("hourOfDay".equals(g)) {
                    i4 = m;
                } else if ("minute".equals(g)) {
                    i5 = m;
                } else if ("second".equals(g)) {
                    i6 = m;
                }
            }
            c0477a.mo367d();
            return new GregorianCalendar(i, i2, i3, i4, i5, i6);
        }

        /* renamed from: a */
        public void m3140a(C0479c c0479c, Calendar calendar) {
            if (calendar == null) {
                c0479c.mo393f();
                return;
            }
            c0479c.mo391d();
            c0479c.mo384a("year");
            c0479c.mo381a((long) calendar.get(1));
            c0479c.mo384a("month");
            c0479c.mo381a((long) calendar.get(2));
            c0479c.mo384a("dayOfMonth");
            c0479c.mo381a((long) calendar.get(5));
            c0479c.mo384a("hourOfDay");
            c0479c.mo381a((long) calendar.get(11));
            c0479c.mo384a("minute");
            c0479c.mo381a((long) calendar.get(12));
            c0479c.mo384a("second");
            c0479c.mo381a((long) calendar.get(13));
            c0479c.mo392e();
        }

        /* renamed from: b */
        public /* synthetic */ Object mo361b(C0477a c0477a) {
            return m3138a(c0477a);
        }
    };
    /* renamed from: U */
    public static final C0493w f1586U = C0452n.m1754b(Calendar.class, GregorianCalendar.class, f1585T);
    /* renamed from: V */
    public static final C0492v<Locale> f1587V = new C0492v<Locale>() {
        /* renamed from: a */
        public Locale m3142a(C0477a c0477a) {
            String str = null;
            if (c0477a.mo369f() == C0478b.NULL) {
                c0477a.mo373j();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(c0477a.mo371h(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            }
            return (nextToken2 == null && str == null) ? new Locale(nextToken) : str == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, str);
        }

        /* renamed from: a */
        public void m3144a(C0479c c0479c, Locale locale) {
            c0479c.mo388b(locale == null ? null : locale.toString());
        }

        /* renamed from: b */
        public /* synthetic */ Object mo361b(C0477a c0477a) {
            return m3142a(c0477a);
        }
    };
    /* renamed from: W */
    public static final C0493w f1588W = C0452n.m1751a(Locale.class, f1587V);
    /* renamed from: X */
    public static final C0492v<C0487l> f1589X = new C0492v<C0487l>() {
        /* renamed from: a */
        public C0487l m3146a(C0477a c0477a) {
            C0487l c0714i;
            switch (c0477a.mo369f()) {
                case NUMBER:
                    return new C0718q(new C0462g(c0477a.mo371h()));
                case BOOLEAN:
                    return new C0718q(Boolean.valueOf(c0477a.mo372i()));
                case STRING:
                    return new C0718q(c0477a.mo371h());
                case NULL:
                    c0477a.mo373j();
                    return C0716n.f2581a;
                case BEGIN_ARRAY:
                    c0714i = new C0714i();
                    c0477a.mo363a();
                    while (c0477a.mo368e()) {
                        c0714i.m3288a(m3146a(c0477a));
                    }
                    c0477a.mo364b();
                    return c0714i;
                case BEGIN_OBJECT:
                    c0714i = new C0717o();
                    c0477a.mo365c();
                    while (c0477a.mo368e()) {
                        c0714i.m3294a(c0477a.mo370g(), m3146a(c0477a));
                    }
                    c0477a.mo367d();
                    return c0714i;
                default:
                    throw new IllegalArgumentException();
            }
        }

        /* renamed from: a */
        public void m3147a(C0479c c0479c, C0487l c0487l) {
            if (c0487l != null) {
                if (!c0487l.m1911j()) {
                    if (c0487l.m1910i()) {
                        C0718q m = c0487l.m1914m();
                        if (m.m3307p()) {
                            c0479c.mo383a(m.mo402a());
                            return;
                        } else if (m.m3306o()) {
                            c0479c.mo385a(m.mo407f());
                            return;
                        } else {
                            c0479c.mo388b(m.mo403b());
                            return;
                        }
                    } else if (c0487l.m1908g()) {
                        c0479c.mo387b();
                        r4 = c0487l.m1913l().iterator();
                        while (r4.hasNext()) {
                            m3147a(c0479c, (C0487l) r4.next());
                        }
                        c0479c.mo389c();
                        return;
                    } else if (c0487l.m1909h()) {
                        c0479c.mo391d();
                        for (Entry entry : c0487l.m1912k().m3295o()) {
                            c0479c.mo384a((String) entry.getKey());
                            m3147a(c0479c, (C0487l) entry.getValue());
                        }
                        c0479c.mo392e();
                        return;
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Couldn't write ");
                        stringBuilder.append(c0487l.getClass());
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
            }
            c0479c.mo393f();
        }

        /* renamed from: b */
        public /* synthetic */ Object mo361b(C0477a c0477a) {
            return m3146a(c0477a);
        }
    };
    /* renamed from: Y */
    public static final C0493w f1590Y = C0452n.m1753b(C0487l.class, f1589X);
    /* renamed from: Z */
    public static final C0493w f1591Z = new C0493w() {
        /* renamed from: a */
        public <T> C0492v<T> mo362a(C0482f c0482f, C0475a<T> c0475a) {
            Class a = c0475a.m1822a();
            if (Enum.class.isAssignableFrom(a)) {
                if (a != Enum.class) {
                    if (!a.isEnum()) {
                        a = a.getSuperclass();
                    }
                    return new C0686a(a);
                }
            }
            return null;
        }
    };
    /* renamed from: a */
    public static final C0492v<Class> f1592a = new C06761().m1918a();
    /* renamed from: b */
    public static final C0493w f1593b = C0452n.m1751a(Class.class, f1592a);
    /* renamed from: c */
    public static final C0492v<BitSet> f1594c = new C0492v<BitSet>() {
        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        public java.util.BitSet m3101a(com.p028b.p029a.p036d.C0477a r7) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/1763344271.run(Unknown Source)
*/
            /*
            r6 = this;
            r0 = new java.util.BitSet;
            r0.<init>();
            r7.mo363a();
            r1 = r7.mo369f();
            r2 = 0;
            r3 = 0;
        L_0x000e:
            r4 = com.p028b.p029a.p036d.C0478b.END_ARRAY;
            if (r1 == r4) goto L_0x0070;
        L_0x0012:
            r4 = com.b.a.b.a.n.AnonymousClass29.f1565a;
            r5 = r1.ordinal();
            r4 = r4[r5];
            r5 = 1;
            switch(r4) {
                case 1: goto L_0x005e;
                case 2: goto L_0x0059;
                case 3: goto L_0x0035;
                default: goto L_0x001e;
            };
        L_0x001e:
            r7 = new com.b.a.t;
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r2 = "Invalid bitset value type: ";
            r0.append(r2);
            r0.append(r1);
            r0 = r0.toString();
            r7.<init>(r0);
            throw r7;
        L_0x0035:
            r1 = r7.mo371h();
            r4 = java.lang.Integer.parseInt(r1);	 Catch:{ NumberFormatException -> 0x0042 }
            if (r4 == 0) goto L_0x0040;
        L_0x003f:
            goto L_0x0064;
        L_0x0040:
            r5 = 0;
            goto L_0x0064;
        L_0x0042:
            r7 = new com.b.a.t;
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r2 = "Error: Expecting: bitset number value (1, 0), Found: ";
            r0.append(r2);
            r0.append(r1);
            r0 = r0.toString();
            r7.<init>(r0);
            throw r7;
        L_0x0059:
            r5 = r7.mo372i();
            goto L_0x0064;
        L_0x005e:
            r1 = r7.mo376m();
            if (r1 == 0) goto L_0x0040;
        L_0x0064:
            if (r5 == 0) goto L_0x0069;
        L_0x0066:
            r0.set(r3);
        L_0x0069:
            r3 = r3 + 1;
            r1 = r7.mo369f();
            goto L_0x000e;
        L_0x0070:
            r7.mo364b();
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.b.a.b.a.n.12.a(com.b.a.d.a):java.util.BitSet");
        }

        /* renamed from: a */
        public void m3103a(C0479c c0479c, BitSet bitSet) {
            c0479c.mo387b();
            int length = bitSet.length();
            for (int i = 0; i < length; i++) {
                c0479c.mo381a((long) bitSet.get(i));
            }
            c0479c.mo389c();
        }

        /* renamed from: b */
        public /* synthetic */ Object mo361b(C0477a c0477a) {
            return m3101a(c0477a);
        }
    }.m1918a();
    /* renamed from: d */
    public static final C0493w f1595d = C0452n.m1751a(BitSet.class, f1594c);
    /* renamed from: e */
    public static final C0492v<Boolean> f1596e = new C0492v<Boolean>() {
        /* renamed from: a */
        public Boolean m3150a(C0477a c0477a) {
            C0478b f = c0477a.mo369f();
            if (f != C0478b.NULL) {
                return f == C0478b.STRING ? Boolean.valueOf(Boolean.parseBoolean(c0477a.mo371h())) : Boolean.valueOf(c0477a.mo372i());
            } else {
                c0477a.mo373j();
                return null;
            }
        }

        /* renamed from: a */
        public void m3151a(C0479c c0479c, Boolean bool) {
            c0479c.mo382a(bool);
        }

        /* renamed from: b */
        public /* synthetic */ Object mo361b(C0477a c0477a) {
            return m3150a(c0477a);
        }
    };
    /* renamed from: f */
    public static final C0492v<Boolean> f1597f = new C0492v<Boolean>() {
        /* renamed from: a */
        public Boolean m3165a(C0477a c0477a) {
            if (c0477a.mo369f() != C0478b.NULL) {
                return Boolean.valueOf(c0477a.mo371h());
            }
            c0477a.mo373j();
            return null;
        }

        /* renamed from: a */
        public void m3166a(C0479c c0479c, Boolean bool) {
            c0479c.mo388b(bool == null ? "null" : bool.toString());
        }

        /* renamed from: b */
        public /* synthetic */ Object mo361b(C0477a c0477a) {
            return m3165a(c0477a);
        }
    };
    /* renamed from: g */
    public static final C0493w f1598g = C0452n.m1752a(Boolean.TYPE, Boolean.class, f1596e);
    /* renamed from: h */
    public static final C0492v<Number> f1599h = new C0492v<Number>() {
        /* renamed from: a */
        public Number m3169a(C0477a c0477a) {
            if (c0477a.mo369f() == C0478b.NULL) {
                c0477a.mo373j();
                return null;
            }
            try {
                return Byte.valueOf((byte) c0477a.mo376m());
            } catch (Throwable e) {
                throw new C0719t(e);
            }
        }

        /* renamed from: a */
        public void m3170a(C0479c c0479c, Number number) {
            c0479c.mo383a(number);
        }

        /* renamed from: b */
        public /* synthetic */ Object mo361b(C0477a c0477a) {
            return m3169a(c0477a);
        }
    };
    /* renamed from: i */
    public static final C0493w f1600i = C0452n.m1752a(Byte.TYPE, Byte.class, f1599h);
    /* renamed from: j */
    public static final C0492v<Number> f1601j = new C0492v<Number>() {
        /* renamed from: a */
        public Number m3173a(C0477a c0477a) {
            if (c0477a.mo369f() == C0478b.NULL) {
                c0477a.mo373j();
                return null;
            }
            try {
                return Short.valueOf((short) c0477a.mo376m());
            } catch (Throwable e) {
                throw new C0719t(e);
            }
        }

        /* renamed from: a */
        public void m3174a(C0479c c0479c, Number number) {
            c0479c.mo383a(number);
        }

        /* renamed from: b */
        public /* synthetic */ Object mo361b(C0477a c0477a) {
            return m3173a(c0477a);
        }
    };
    /* renamed from: k */
    public static final C0493w f1602k = C0452n.m1752a(Short.TYPE, Short.class, f1601j);
    /* renamed from: l */
    public static final C0492v<Number> f1603l = new C0492v<Number>() {
        /* renamed from: a */
        public Number m3177a(C0477a c0477a) {
            if (c0477a.mo369f() == C0478b.NULL) {
                c0477a.mo373j();
                return null;
            }
            try {
                return Integer.valueOf(c0477a.mo376m());
            } catch (Throwable e) {
                throw new C0719t(e);
            }
        }

        /* renamed from: a */
        public void m3178a(C0479c c0479c, Number number) {
            c0479c.mo383a(number);
        }

        /* renamed from: b */
        public /* synthetic */ Object mo361b(C0477a c0477a) {
            return m3177a(c0477a);
        }
    };
    /* renamed from: m */
    public static final C0493w f1604m = C0452n.m1752a(Integer.TYPE, Integer.class, f1603l);
    /* renamed from: n */
    public static final C0492v<AtomicInteger> f1605n = new C0492v<AtomicInteger>() {
        /* renamed from: a */
        public AtomicInteger m3181a(C0477a c0477a) {
            try {
                return new AtomicInteger(c0477a.mo376m());
            } catch (Throwable e) {
                throw new C0719t(e);
            }
        }

        /* renamed from: a */
        public void m3183a(C0479c c0479c, AtomicInteger atomicInteger) {
            c0479c.mo381a((long) atomicInteger.get());
        }

        /* renamed from: b */
        public /* synthetic */ Object mo361b(C0477a c0477a) {
            return m3181a(c0477a);
        }
    }.m1918a();
    /* renamed from: o */
    public static final C0493w f1606o = C0452n.m1751a(AtomicInteger.class, f1605n);
    /* renamed from: p */
    public static final C0492v<AtomicBoolean> f1607p = new C0492v<AtomicBoolean>() {
        /* renamed from: a */
        public AtomicBoolean m3185a(C0477a c0477a) {
            return new AtomicBoolean(c0477a.mo372i());
        }

        /* renamed from: a */
        public void m3187a(C0479c c0479c, AtomicBoolean atomicBoolean) {
            c0479c.mo385a(atomicBoolean.get());
        }

        /* renamed from: b */
        public /* synthetic */ Object mo361b(C0477a c0477a) {
            return m3185a(c0477a);
        }
    }.m1918a();
    /* renamed from: q */
    public static final C0493w f1608q = C0452n.m1751a(AtomicBoolean.class, f1607p);
    /* renamed from: r */
    public static final C0492v<AtomicIntegerArray> f1609r = new C06782().m1918a();
    /* renamed from: s */
    public static final C0493w f1610s = C0452n.m1751a(AtomicIntegerArray.class, f1609r);
    /* renamed from: t */
    public static final C0492v<Number> f1611t = new C06793();
    /* renamed from: u */
    public static final C0492v<Number> f1612u = new C06804();
    /* renamed from: v */
    public static final C0492v<Number> f1613v = new C06815();
    /* renamed from: w */
    public static final C0492v<Number> f1614w = new C06826();
    /* renamed from: x */
    public static final C0493w f1615x = C0452n.m1751a(Number.class, f1614w);
    /* renamed from: y */
    public static final C0492v<Character> f1616y = new C06837();
    /* renamed from: z */
    public static final C0493w f1617z = C0452n.m1752a(Character.TYPE, Character.class, f1616y);

    /* renamed from: com.b.a.b.a.n$1 */
    static class C06761 extends C0492v<Class> {
        C06761() {
        }

        /* renamed from: a */
        public Class m3134a(C0477a c0477a) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        /* renamed from: a */
        public void m3135a(C0479c c0479c, Class cls) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Attempted to serialize java.lang.Class: ");
            stringBuilder.append(cls.getName());
            stringBuilder.append(". Forgot to register a type adapter?");
            throw new UnsupportedOperationException(stringBuilder.toString());
        }

        /* renamed from: b */
        public /* synthetic */ Object mo361b(C0477a c0477a) {
            return m3134a(c0477a);
        }
    }

    /* renamed from: com.b.a.b.a.n$2 */
    static class C06782 extends C0492v<AtomicIntegerArray> {
        C06782() {
        }

        /* renamed from: a */
        public AtomicIntegerArray m3161a(C0477a c0477a) {
            List arrayList = new ArrayList();
            c0477a.mo363a();
            while (c0477a.mo368e()) {
                try {
                    arrayList.add(Integer.valueOf(c0477a.mo376m()));
                } catch (Throwable e) {
                    throw new C0719t(e);
                }
            }
            c0477a.mo364b();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        /* renamed from: a */
        public void m3163a(C0479c c0479c, AtomicIntegerArray atomicIntegerArray) {
            c0479c.mo387b();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                c0479c.mo381a((long) atomicIntegerArray.get(i));
            }
            c0479c.mo389c();
        }

        /* renamed from: b */
        public /* synthetic */ Object mo361b(C0477a c0477a) {
            return m3161a(c0477a);
        }
    }

    /* renamed from: com.b.a.b.a.n$3 */
    static class C06793 extends C0492v<Number> {
        C06793() {
        }

        /* renamed from: a */
        public Number m3189a(C0477a c0477a) {
            if (c0477a.mo369f() == C0478b.NULL) {
                c0477a.mo373j();
                return null;
            }
            try {
                return Long.valueOf(c0477a.mo375l());
            } catch (Throwable e) {
                throw new C0719t(e);
            }
        }

        /* renamed from: a */
        public void m3190a(C0479c c0479c, Number number) {
            c0479c.mo383a(number);
        }

        /* renamed from: b */
        public /* synthetic */ Object mo361b(C0477a c0477a) {
            return m3189a(c0477a);
        }
    }

    /* renamed from: com.b.a.b.a.n$4 */
    static class C06804 extends C0492v<Number> {
        C06804() {
        }

        /* renamed from: a */
        public Number m3193a(C0477a c0477a) {
            if (c0477a.mo369f() != C0478b.NULL) {
                return Float.valueOf((float) c0477a.mo374k());
            }
            c0477a.mo373j();
            return null;
        }

        /* renamed from: a */
        public void m3194a(C0479c c0479c, Number number) {
            c0479c.mo383a(number);
        }

        /* renamed from: b */
        public /* synthetic */ Object mo361b(C0477a c0477a) {
            return m3193a(c0477a);
        }
    }

    /* renamed from: com.b.a.b.a.n$5 */
    static class C06815 extends C0492v<Number> {
        C06815() {
        }

        /* renamed from: a */
        public Number m3197a(C0477a c0477a) {
            if (c0477a.mo369f() != C0478b.NULL) {
                return Double.valueOf(c0477a.mo374k());
            }
            c0477a.mo373j();
            return null;
        }

        /* renamed from: a */
        public void m3198a(C0479c c0479c, Number number) {
            c0479c.mo383a(number);
        }

        /* renamed from: b */
        public /* synthetic */ Object mo361b(C0477a c0477a) {
            return m3197a(c0477a);
        }
    }

    /* renamed from: com.b.a.b.a.n$6 */
    static class C06826 extends C0492v<Number> {
        C06826() {
        }

        /* renamed from: a */
        public Number m3201a(C0477a c0477a) {
            C0478b f = c0477a.mo369f();
            int i = AnonymousClass29.f1565a[f.ordinal()];
            if (i != 1) {
                switch (i) {
                    case 3:
                        break;
                    case 4:
                        c0477a.mo373j();
                        return null;
                    default:
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Expecting number, got: ");
                        stringBuilder.append(f);
                        throw new C0719t(stringBuilder.toString());
                }
            }
            return new C0462g(c0477a.mo371h());
        }

        /* renamed from: a */
        public void m3202a(C0479c c0479c, Number number) {
            c0479c.mo383a(number);
        }

        /* renamed from: b */
        public /* synthetic */ Object mo361b(C0477a c0477a) {
            return m3201a(c0477a);
        }
    }

    /* renamed from: com.b.a.b.a.n$7 */
    static class C06837 extends C0492v<Character> {
        C06837() {
        }

        /* renamed from: a */
        public Character m3205a(C0477a c0477a) {
            if (c0477a.mo369f() == C0478b.NULL) {
                c0477a.mo373j();
                return null;
            }
            String h = c0477a.mo371h();
            if (h.length() == 1) {
                return Character.valueOf(h.charAt(0));
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expecting character, got: ");
            stringBuilder.append(h);
            throw new C0719t(stringBuilder.toString());
        }

        /* renamed from: a */
        public void m3206a(C0479c c0479c, Character ch) {
            c0479c.mo388b(ch == null ? null : String.valueOf(ch));
        }

        /* renamed from: b */
        public /* synthetic */ Object mo361b(C0477a c0477a) {
            return m3205a(c0477a);
        }
    }

    /* renamed from: com.b.a.b.a.n$8 */
    static class C06848 extends C0492v<String> {
        C06848() {
        }

        /* renamed from: a */
        public String m3209a(C0477a c0477a) {
            C0478b f = c0477a.mo369f();
            if (f != C0478b.NULL) {
                return f == C0478b.BOOLEAN ? Boolean.toString(c0477a.mo372i()) : c0477a.mo371h();
            } else {
                c0477a.mo373j();
                return null;
            }
        }

        /* renamed from: a */
        public void m3211a(C0479c c0479c, String str) {
            c0479c.mo388b(str);
        }

        /* renamed from: b */
        public /* synthetic */ Object mo361b(C0477a c0477a) {
            return m3209a(c0477a);
        }
    }

    /* renamed from: com.b.a.b.a.n$9 */
    static class C06859 extends C0492v<BigDecimal> {
        C06859() {
        }

        /* renamed from: a */
        public BigDecimal m3213a(C0477a c0477a) {
            if (c0477a.mo369f() == C0478b.NULL) {
                c0477a.mo373j();
                return null;
            }
            try {
                return new BigDecimal(c0477a.mo371h());
            } catch (Throwable e) {
                throw new C0719t(e);
            }
        }

        /* renamed from: a */
        public void m3215a(C0479c c0479c, BigDecimal bigDecimal) {
            c0479c.mo383a((Number) bigDecimal);
        }

        /* renamed from: b */
        public /* synthetic */ Object mo361b(C0477a c0477a) {
            return m3213a(c0477a);
        }
    }

    /* renamed from: com.b.a.b.a.n$a */
    private static final class C0686a<T extends Enum<T>> extends C0492v<T> {
        /* renamed from: a */
        private final Map<String, T> f2520a = new HashMap();
        /* renamed from: b */
        private final Map<T, String> f2521b = new HashMap();

        public C0686a(Class<T> cls) {
            try {
                for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                    Object name = enumR.name();
                    C0443c c0443c = (C0443c) cls.getField(name).getAnnotation(C0443c.class);
                    if (c0443c != null) {
                        name = c0443c.m1740a();
                        for (Object put : c0443c.m1741b()) {
                            this.f2520a.put(put, enumR);
                        }
                    }
                    this.f2520a.put(name, enumR);
                    this.f2521b.put(enumR, name);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }

        /* renamed from: a */
        public T m3217a(C0477a c0477a) {
            if (c0477a.mo369f() != C0478b.NULL) {
                return (Enum) this.f2520a.get(c0477a.mo371h());
            }
            c0477a.mo373j();
            return null;
        }

        /* renamed from: a */
        public void m3218a(C0479c c0479c, T t) {
            c0479c.mo388b(t == null ? null : (String) this.f2521b.get(t));
        }

        /* renamed from: b */
        public /* synthetic */ Object mo361b(C0477a c0477a) {
            return m3217a(c0477a);
        }
    }

    /* renamed from: a */
    public static <TT> C0493w m1751a(final Class<TT> cls, final C0492v<TT> c0492v) {
        return new C0493w() {
            /* renamed from: a */
            public <T> C0492v<T> mo362a(C0482f c0482f, C0475a<T> c0475a) {
                return c0475a.m1822a() == cls ? c0492v : null;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Factory[type=");
                stringBuilder.append(cls.getName());
                stringBuilder.append(",adapter=");
                stringBuilder.append(c0492v);
                stringBuilder.append("]");
                return stringBuilder.toString();
            }
        };
    }

    /* renamed from: a */
    public static <TT> C0493w m1752a(final Class<TT> cls, final Class<TT> cls2, final C0492v<? super TT> c0492v) {
        return new C0493w() {
            /* renamed from: a */
            public <T> C0492v<T> mo362a(C0482f c0482f, C0475a<T> c0475a) {
                Class a = c0475a.m1822a();
                if (a != cls) {
                    if (a != cls2) {
                        return null;
                    }
                }
                return c0492v;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Factory[type=");
                stringBuilder.append(cls2.getName());
                stringBuilder.append("+");
                stringBuilder.append(cls.getName());
                stringBuilder.append(",adapter=");
                stringBuilder.append(c0492v);
                stringBuilder.append("]");
                return stringBuilder.toString();
            }
        };
    }

    /* renamed from: b */
    public static <T1> C0493w m1753b(final Class<T1> cls, final C0492v<T1> c0492v) {
        return new C0493w() {
            /* renamed from: a */
            public <T2> C0492v<T2> mo362a(C0482f c0482f, C0475a<T2> c0475a) {
                final Class a = c0475a.m1822a();
                return !cls.isAssignableFrom(a) ? null : new C0492v<T1>(this) {
                    /* renamed from: b */
                    final /* synthetic */ AnonymousClass28 f2517b;

                    /* renamed from: a */
                    public void mo360a(C0479c c0479c, T1 t1) {
                        c0492v.mo360a(c0479c, t1);
                    }

                    /* renamed from: b */
                    public T1 mo361b(C0477a c0477a) {
                        T1 b = c0492v.mo361b(c0477a);
                        if (b != null) {
                            if (!a.isInstance(b)) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("Expected a ");
                                stringBuilder.append(a.getName());
                                stringBuilder.append(" but was ");
                                stringBuilder.append(b.getClass().getName());
                                throw new C0719t(stringBuilder.toString());
                            }
                        }
                        return b;
                    }
                };
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Factory[typeHierarchy=");
                stringBuilder.append(cls.getName());
                stringBuilder.append(",adapter=");
                stringBuilder.append(c0492v);
                stringBuilder.append("]");
                return stringBuilder.toString();
            }
        };
    }

    /* renamed from: b */
    public static <TT> C0493w m1754b(final Class<TT> cls, final Class<? extends TT> cls2, final C0492v<? super TT> c0492v) {
        return new C0493w() {
            /* renamed from: a */
            public <T> C0492v<T> mo362a(C0482f c0482f, C0475a<T> c0475a) {
                Class a = c0475a.m1822a();
                if (a != cls) {
                    if (a != cls2) {
                        return null;
                    }
                }
                return c0492v;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Factory[type=");
                stringBuilder.append(cls.getName());
                stringBuilder.append("+");
                stringBuilder.append(cls2.getName());
                stringBuilder.append(",adapter=");
                stringBuilder.append(c0492v);
                stringBuilder.append("]");
                return stringBuilder.toString();
            }
        };
    }
}
