package com.p025a.p026a;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.a.a.o */
public class C0431o {
    /* renamed from: a */
    private final AtomicInteger f1535a;
    /* renamed from: b */
    private final Set<C0429n<?>> f1536b;
    /* renamed from: c */
    private final PriorityBlockingQueue<C0429n<?>> f1537c;
    /* renamed from: d */
    private final PriorityBlockingQueue<C0429n<?>> f1538d;
    /* renamed from: e */
    private final C0417b f1539e;
    /* renamed from: f */
    private final C0423h f1540f;
    /* renamed from: g */
    private final C0435q f1541g;
    /* renamed from: h */
    private final C0424i[] f1542h;
    /* renamed from: i */
    private C0419c f1543i;
    /* renamed from: j */
    private final List<C0430a> f1544j;

    /* renamed from: com.a.a.o$a */
    public interface C0430a<T> {
        /* renamed from: a */
        void m1709a(C0429n<T> c0429n);
    }

    public C0431o(C0417b c0417b, C0423h c0423h) {
        this(c0417b, c0423h, 4);
    }

    public C0431o(C0417b c0417b, C0423h c0423h, int i) {
        this(c0417b, c0423h, i, new C0646f(new Handler(Looper.getMainLooper())));
    }

    public C0431o(C0417b c0417b, C0423h c0423h, int i, C0435q c0435q) {
        this.f1535a = new AtomicInteger();
        this.f1536b = new HashSet();
        this.f1537c = new PriorityBlockingQueue();
        this.f1538d = new PriorityBlockingQueue();
        this.f1544j = new ArrayList();
        this.f1539e = c0417b;
        this.f1540f = c0423h;
        this.f1542h = new C0424i[i];
        this.f1541g = c0435q;
    }

    /* renamed from: a */
    public <T> C0429n<T> m1710a(C0429n<T> c0429n) {
        c0429n.m1678a(this);
        synchronized (this.f1536b) {
            this.f1536b.add(c0429n);
        }
        c0429n.m1676a(m1714c());
        c0429n.m1685a("add-to-queue");
        (!c0429n.m1701o() ? this.f1538d : this.f1537c).add(c0429n);
        return c0429n;
    }

    /* renamed from: a */
    public void m1711a() {
        m1712b();
        this.f1543i = new C0419c(this.f1537c, this.f1538d, this.f1539e, this.f1541g);
        this.f1543i.start();
        for (int i = 0; i < this.f1542h.length; i++) {
            C0424i c0424i = new C0424i(this.f1538d, this.f1540f, this.f1539e, this.f1541g);
            this.f1542h[i] = c0424i;
            c0424i.start();
        }
    }

    /* renamed from: b */
    public void m1712b() {
        if (this.f1543i != null) {
            this.f1543i.m1657a();
        }
        for (C0424i c0424i : this.f1542h) {
            if (c0424i != null) {
                c0424i.m1665a();
            }
        }
    }

    /* renamed from: b */
    <T> void m1713b(C0429n<T> c0429n) {
        synchronized (this.f1536b) {
            this.f1536b.remove(c0429n);
        }
        synchronized (this.f1544j) {
            for (C0430a a : this.f1544j) {
                a.m1709a(c0429n);
            }
        }
    }

    /* renamed from: c */
    public int m1714c() {
        return this.f1535a.incrementAndGet();
    }
}
