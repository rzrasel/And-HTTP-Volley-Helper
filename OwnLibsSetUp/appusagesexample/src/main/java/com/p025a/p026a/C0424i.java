package com.p025a.p026a;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Build.VERSION;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.a.a.i */
public class C0424i extends Thread {
    /* renamed from: a */
    private final BlockingQueue<C0429n<?>> f1501a;
    /* renamed from: b */
    private final C0423h f1502b;
    /* renamed from: c */
    private final C0417b f1503c;
    /* renamed from: d */
    private final C0435q f1504d;
    /* renamed from: e */
    private volatile boolean f1505e = false;

    public C0424i(BlockingQueue<C0429n<?>> blockingQueue, C0423h c0423h, C0417b c0417b, C0435q c0435q) {
        this.f1501a = blockingQueue;
        this.f1502b = c0423h;
        this.f1503c = c0417b;
        this.f1504d = c0435q;
    }

    /* renamed from: a */
    private void m1662a(C0429n<?> c0429n, C0437u c0437u) {
        this.f1504d.mo359a((C0429n) c0429n, c0429n.m1681a(c0437u));
    }

    /* renamed from: b */
    private void m1663b() {
        m1666a((C0429n) this.f1501a.take());
    }

    @TargetApi(14)
    /* renamed from: b */
    private void m1664b(C0429n<?> c0429n) {
        if (VERSION.SDK_INT >= 14) {
            TrafficStats.setThreadStatsTag(c0429n.m1686b());
        }
    }

    /* renamed from: a */
    public void m1665a() {
        this.f1505e = true;
        interrupt();
    }

    /* renamed from: a */
    void m1666a(C0429n<?> c0429n) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            c0429n.m1685a("network-queue-take");
            if (c0429n.m1692f()) {
                c0429n.m1688b("network-discard-cancelled");
                c0429n.m1708v();
                return;
            }
            m1664b(c0429n);
            C0425k a = this.f1502b.mo345a(c0429n);
            c0429n.m1685a("network-http-complete");
            if (a.f1510e && c0429n.m1707u()) {
                c0429n.m1688b("not-modified");
                c0429n.m1708v();
                return;
            }
            C0434p a2 = c0429n.mo349a(a);
            c0429n.m1685a("network-parse-complete");
            if (c0429n.m1701o() && a2.f1546b != null) {
                this.f1503c.mo348a(c0429n.m1690d(), a2.f1546b);
                c0429n.m1685a("network-cache-written");
            }
            c0429n.m1706t();
            this.f1504d.mo357a((C0429n) c0429n, a2);
            c0429n.m1683a(a2);
        } catch (C0437u e) {
            e.m1726a(SystemClock.elapsedRealtime() - elapsedRealtime);
            m1662a(c0429n, e);
            c0429n.m1708v();
        } catch (Throwable e2) {
            C0440v.m1731a(e2, "Unhandled exception %s", e2.toString());
            C0437u c0437u = new C0437u(e2);
            c0437u.m1726a(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.f1504d.mo359a((C0429n) c0429n, c0437u);
            c0429n.m1708v();
        }
    }

    public void run() {
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
        r2 = this;
        r0 = 10;
        android.os.Process.setThreadPriority(r0);
    L_0x0005:
        r2.m1663b();	 Catch:{ InterruptedException -> 0x0009 }
        goto L_0x0005;
    L_0x0009:
        r0 = r2.f1505e;
        if (r0 == 0) goto L_0x0015;
    L_0x000d:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
        return;
    L_0x0015:
        r0 = "Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it";
        r1 = 0;
        r1 = new java.lang.Object[r1];
        com.p025a.p026a.C0440v.m1733c(r0, r1);
        goto L_0x0005;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.a.i.run():void");
    }
}
