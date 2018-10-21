package com.p025a.p026a;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.p025a.p026a.C0417b.C0416a;
import com.p025a.p026a.C0434p.C0432a;
import com.p025a.p026a.C0440v.C0439a;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.a.a.n */
public abstract class C0429n<T> implements Comparable<C0429n<T>> {
    /* renamed from: a */
    private final C0439a f1520a;
    /* renamed from: b */
    private final int f1521b;
    /* renamed from: c */
    private final String f1522c;
    /* renamed from: d */
    private final int f1523d;
    /* renamed from: e */
    private final Object f1524e;
    /* renamed from: f */
    private C0432a f1525f;
    /* renamed from: g */
    private Integer f1526g;
    /* renamed from: h */
    private C0431o f1527h;
    /* renamed from: i */
    private boolean f1528i;
    /* renamed from: j */
    private boolean f1529j;
    /* renamed from: k */
    private boolean f1530k;
    /* renamed from: l */
    private boolean f1531l;
    /* renamed from: m */
    private C0436r f1532m;
    /* renamed from: n */
    private C0416a f1533n;
    /* renamed from: o */
    private C0427a f1534o;

    /* renamed from: com.a.a.n$a */
    interface C0427a {
        /* renamed from: a */
        void mo352a(C0429n<?> c0429n);

        /* renamed from: a */
        void mo353a(C0429n<?> c0429n, C0434p<?> c0434p);
    }

    /* renamed from: com.a.a.n$b */
    public enum C0428b {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public C0429n(int i, String str, C0432a c0432a) {
        this.f1520a = C0439a.f1554a ? new C0439a() : null;
        this.f1524e = new Object();
        this.f1528i = true;
        this.f1529j = false;
        this.f1530k = false;
        this.f1531l = false;
        this.f1533n = null;
        this.f1521b = i;
        this.f1522c = str;
        this.f1525f = c0432a;
        m1679a(new C0645e());
        this.f1523d = C0429n.mo351c(str);
    }

    /* renamed from: a */
    private byte[] m1671a(Map<String, String> map, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            for (Entry entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw new IllegalArgumentException(String.format("Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null.", new Object[]{entry.getKey(), entry.getValue()}));
                }
                stringBuilder.append(URLEncoder.encode((String) entry.getKey(), str));
                stringBuilder.append('=');
                stringBuilder.append(URLEncoder.encode((String) entry.getValue(), str));
                stringBuilder.append('&');
            }
            return stringBuilder.toString().getBytes(str);
        } catch (Throwable e) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Encoding not supported: ");
            stringBuilder2.append(str);
            throw new RuntimeException(stringBuilder2.toString(), e);
        }
    }

    /* renamed from: c */
    private static int mo351c(String str) {
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                str = parse.getHost();
                if (str != null) {
                    return str.hashCode();
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    public int m1674a() {
        return this.f1521b;
    }

    /* renamed from: a */
    public int m1675a(C0429n<T> c0429n) {
        C0428b q = m1703q();
        C0428b q2 = c0429n.m1703q();
        return q == q2 ? this.f1526g.intValue() - c0429n.f1526g.intValue() : q2.ordinal() - q.ordinal();
    }

    /* renamed from: a */
    public final C0429n<?> m1676a(int i) {
        this.f1526g = Integer.valueOf(i);
        return this;
    }

    /* renamed from: a */
    public C0429n<?> m1677a(C0416a c0416a) {
        this.f1533n = c0416a;
        return this;
    }

    /* renamed from: a */
    public C0429n<?> m1678a(C0431o c0431o) {
        this.f1527h = c0431o;
        return this;
    }

    /* renamed from: a */
    public C0429n<?> m1679a(C0436r c0436r) {
        this.f1532m = c0436r;
        return this;
    }

    /* renamed from: a */
    protected abstract C0434p<T> mo349a(C0425k c0425k);

    /* renamed from: a */
    protected C0437u m1681a(C0437u c0437u) {
        return c0437u;
    }

    /* renamed from: a */
    void m1682a(C0427a c0427a) {
        synchronized (this.f1524e) {
            this.f1534o = c0427a;
        }
    }

    /* renamed from: a */
    void m1683a(C0434p<?> c0434p) {
        synchronized (this.f1524e) {
            C0427a c0427a = this.f1534o;
        }
        if (c0427a != null) {
            c0427a.mo353a(this, c0434p);
        }
    }

    /* renamed from: a */
    protected abstract void mo350a(T t);

    /* renamed from: a */
    public void m1685a(String str) {
        if (C0439a.f1554a) {
            this.f1520a.m1729a(str, Thread.currentThread().getId());
        }
    }

    /* renamed from: b */
    public int m1686b() {
        return this.f1523d;
    }

    /* renamed from: b */
    public void m1687b(C0437u c0437u) {
        synchronized (this.f1524e) {
            C0432a c0432a = this.f1525f;
        }
        if (c0432a != null) {
            c0432a.mo417a(c0437u);
        }
    }

    /* renamed from: b */
    void m1688b(final String str) {
        if (this.f1527h != null) {
            this.f1527h.m1713b(this);
        }
        if (C0439a.f1554a) {
            final long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new Runnable(this) {
                    /* renamed from: c */
                    final /* synthetic */ C0429n f1514c;

                    public void run() {
                        this.f1514c.f1520a.m1729a(str, id);
                        this.f1514c.f1520a.m1728a(this.f1514c.toString());
                    }
                });
            } else {
                this.f1520a.m1729a(str, id);
                this.f1520a.m1728a(toString());
            }
        }
    }

    /* renamed from: c */
    public String m1689c() {
        return this.f1522c;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return m1675a((C0429n) obj);
    }

    /* renamed from: d */
    public String m1690d() {
        String c = m1689c();
        int a = m1674a();
        if (a == 0) {
            return c;
        }
        if (a == -1) {
            return c;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Integer.toString(a));
        stringBuilder.append('-');
        stringBuilder.append(c);
        return stringBuilder.toString();
    }

    /* renamed from: e */
    public C0416a m1691e() {
        return this.f1533n;
    }

    /* renamed from: f */
    public boolean m1692f() {
        boolean z;
        synchronized (this.f1524e) {
            z = this.f1529j;
        }
        return z;
    }

    /* renamed from: g */
    public Map<String, String> mo536g() {
        return Collections.emptyMap();
    }

    @Deprecated
    /* renamed from: h */
    protected Map<String, String> m1694h() {
        return mo537k();
    }

    @Deprecated
    /* renamed from: i */
    protected String m1695i() {
        return m1698l();
    }

    @Deprecated
    /* renamed from: j */
    public byte[] m1696j() {
        Map h = m1694h();
        return (h == null || h.size() <= 0) ? null : m1671a(h, m1695i());
    }

    /* renamed from: k */
    protected Map<String, String> mo537k() {
        return null;
    }

    /* renamed from: l */
    protected String m1698l() {
        return "UTF-8";
    }

    /* renamed from: m */
    public String m1699m() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("application/x-www-form-urlencoded; charset=");
        stringBuilder.append(m1698l());
        return stringBuilder.toString();
    }

    /* renamed from: n */
    public byte[] m1700n() {
        Map k = mo537k();
        return (k == null || k.size() <= 0) ? null : m1671a(k, m1698l());
    }

    /* renamed from: o */
    public final boolean m1701o() {
        return this.f1528i;
    }

    /* renamed from: p */
    public final boolean m1702p() {
        return this.f1531l;
    }

    /* renamed from: q */
    public C0428b m1703q() {
        return C0428b.NORMAL;
    }

    /* renamed from: r */
    public final int m1704r() {
        return m1705s().mo354a();
    }

    /* renamed from: s */
    public C0436r m1705s() {
        return this.f1532m;
    }

    /* renamed from: t */
    public void m1706t() {
        synchronized (this.f1524e) {
            this.f1530k = true;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("0x");
        stringBuilder.append(Integer.toHexString(m1686b()));
        String stringBuilder2 = stringBuilder.toString();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(m1692f() ? "[X] " : "[ ] ");
        stringBuilder3.append(m1689c());
        stringBuilder3.append(" ");
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append(" ");
        stringBuilder3.append(m1703q());
        stringBuilder3.append(" ");
        stringBuilder3.append(this.f1526g);
        return stringBuilder3.toString();
    }

    /* renamed from: u */
    public boolean m1707u() {
        boolean z;
        synchronized (this.f1524e) {
            z = this.f1530k;
        }
        return z;
    }

    /* renamed from: v */
    void m1708v() {
        synchronized (this.f1524e) {
            C0427a c0427a = this.f1534o;
        }
        if (c0427a != null) {
            c0427a.mo352a(this);
        }
    }
}
