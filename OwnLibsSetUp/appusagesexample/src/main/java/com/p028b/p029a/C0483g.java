package com.p028b.p029a;

import com.p028b.p029a.p031b.C0699d;
import com.p028b.p029a.p031b.p032a.C0452n;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.b.a.g */
public final class C0483g {
    /* renamed from: a */
    private C0699d f1720a = C0699d.f2554a;
    /* renamed from: b */
    private C0491u f1721b = C0491u.DEFAULT;
    /* renamed from: c */
    private C0481e f1722c = C0707d.IDENTITY;
    /* renamed from: d */
    private final Map<Type, C0484h<?>> f1723d = new HashMap();
    /* renamed from: e */
    private final List<C0493w> f1724e = new ArrayList();
    /* renamed from: f */
    private final List<C0493w> f1725f = new ArrayList();
    /* renamed from: g */
    private boolean f1726g = false;
    /* renamed from: h */
    private String f1727h;
    /* renamed from: i */
    private int f1728i = 2;
    /* renamed from: j */
    private int f1729j = 2;
    /* renamed from: k */
    private boolean f1730k = false;
    /* renamed from: l */
    private boolean f1731l = false;
    /* renamed from: m */
    private boolean f1732m = true;
    /* renamed from: n */
    private boolean f1733n = false;
    /* renamed from: o */
    private boolean f1734o = false;
    /* renamed from: p */
    private boolean f1735p = false;

    /* renamed from: a */
    private void m1898a(String str, int i, int i2, List<C0493w> list) {
        C0492v c0651a;
        C0492v c0651a2;
        C0492v c0492v;
        if (str != null && !"".equals(str.trim())) {
            C0492v c0651a3 = new C0651a(Date.class, str);
            c0651a = new C0651a(Timestamp.class, str);
            c0651a2 = new C0651a(java.sql.Date.class, str);
            c0492v = c0651a3;
        } else if (i != 2 && i2 != 2) {
            c0492v = new C0651a(Date.class, i, i2);
            c0651a2 = new C0651a(Timestamp.class, i, i2);
            C0492v c0651a4 = new C0651a(java.sql.Date.class, i, i2);
            c0651a = c0651a2;
            c0651a2 = c0651a4;
        } else {
            return;
        }
        list.add(C0452n.m1751a(Date.class, c0492v));
        list.add(C0452n.m1751a(Timestamp.class, c0651a));
        list.add(C0452n.m1751a(java.sql.Date.class, c0651a2));
    }

    /* renamed from: a */
    public C0482f m1899a() {
        List list = r1;
        List arrayList = new ArrayList((this.f1724e.size() + this.f1725f.size()) + 3);
        arrayList.addAll(this.f1724e);
        Collections.reverse(arrayList);
        Collection arrayList2 = new ArrayList(this.f1725f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        m1898a(this.f1727h, this.f1728i, this.f1729j, arrayList);
        return new C0482f(this.f1720a, this.f1722c, this.f1723d, this.f1726g, this.f1730k, this.f1734o, this.f1732m, this.f1733n, this.f1735p, this.f1731l, this.f1721b, this.f1727h, this.f1728i, this.f1729j, this.f1724e, this.f1725f, list);
    }
}
