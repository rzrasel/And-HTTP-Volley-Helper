package com.p025a.p026a;

import com.p025a.p026a.C0417b.C0416a;
import com.p025a.p026a.C0429n.C0427a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.a.a.c */
public class C0419c extends Thread {
    /* renamed from: a */
    private static final boolean f1487a = C0440v.f1558b;
    /* renamed from: b */
    private final BlockingQueue<C0429n<?>> f1488b;
    /* renamed from: c */
    private final BlockingQueue<C0429n<?>> f1489c;
    /* renamed from: d */
    private final C0417b f1490d;
    /* renamed from: e */
    private final C0435q f1491e;
    /* renamed from: f */
    private volatile boolean f1492f = false;
    /* renamed from: g */
    private final C0644a f1493g;

    /* renamed from: com.a.a.c$a */
    private static class C0644a implements C0427a {
        /* renamed from: a */
        private final Map<String, List<C0429n<?>>> f2440a = new HashMap();
        /* renamed from: b */
        private final C0419c f2441b;

        C0644a(C0419c c0419c) {
            this.f2441b = c0419c;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: b */
        private synchronized boolean m2989b(com.p025a.p026a.C0429n<?> r6) {
            /*
            r5 = this;
            monitor-enter(r5);
            r0 = r6.m1690d();	 Catch:{ all -> 0x0052 }
            r1 = r5.f2440a;	 Catch:{ all -> 0x0052 }
            r1 = r1.containsKey(r0);	 Catch:{ all -> 0x0052 }
            r2 = 1;
            r3 = 0;
            if (r1 == 0) goto L_0x003a;
        L_0x000f:
            r1 = r5.f2440a;	 Catch:{ all -> 0x0052 }
            r1 = r1.get(r0);	 Catch:{ all -> 0x0052 }
            r1 = (java.util.List) r1;	 Catch:{ all -> 0x0052 }
            if (r1 != 0) goto L_0x001e;
        L_0x0019:
            r1 = new java.util.ArrayList;	 Catch:{ all -> 0x0052 }
            r1.<init>();	 Catch:{ all -> 0x0052 }
        L_0x001e:
            r4 = "waiting-for-response";
            r6.m1685a(r4);	 Catch:{ all -> 0x0052 }
            r1.add(r6);	 Catch:{ all -> 0x0052 }
            r6 = r5.f2440a;	 Catch:{ all -> 0x0052 }
            r6.put(r0, r1);	 Catch:{ all -> 0x0052 }
            r6 = com.p025a.p026a.C0440v.f1558b;	 Catch:{ all -> 0x0052 }
            if (r6 == 0) goto L_0x0038;
        L_0x002f:
            r6 = "Request for cacheKey=%s is in flight, putting on hold.";
            r1 = new java.lang.Object[r2];	 Catch:{ all -> 0x0052 }
            r1[r3] = r0;	 Catch:{ all -> 0x0052 }
            com.p025a.p026a.C0440v.m1732b(r6, r1);	 Catch:{ all -> 0x0052 }
        L_0x0038:
            monitor-exit(r5);
            return r2;
        L_0x003a:
            r1 = r5.f2440a;	 Catch:{ all -> 0x0052 }
            r4 = 0;
            r1.put(r0, r4);	 Catch:{ all -> 0x0052 }
            r6.m1682a(r5);	 Catch:{ all -> 0x0052 }
            r6 = com.p025a.p026a.C0440v.f1558b;	 Catch:{ all -> 0x0052 }
            if (r6 == 0) goto L_0x0050;
        L_0x0047:
            r6 = "new request, sending to network %s";
            r1 = new java.lang.Object[r2];	 Catch:{ all -> 0x0052 }
            r1[r3] = r0;	 Catch:{ all -> 0x0052 }
            com.p025a.p026a.C0440v.m1732b(r6, r1);	 Catch:{ all -> 0x0052 }
        L_0x0050:
            monitor-exit(r5);
            return r3;
        L_0x0052:
            r6 = move-exception;
            monitor-exit(r5);
            throw r6;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.a.a.c.a.b(com.a.a.n):boolean");
        }

        /* renamed from: a */
        public synchronized void mo352a(C0429n<?> c0429n) {
            String d = c0429n.m1690d();
            List list = (List) this.f2440a.remove(d);
            if (!(list == null || list.isEmpty())) {
                if (C0440v.f1558b) {
                    C0440v.m1730a("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), d);
                }
                C0429n c0429n2 = (C0429n) list.remove(0);
                this.f2440a.put(d, list);
                c0429n2.m1682a((C0427a) this);
                try {
                    this.f2441b.f1489c.put(c0429n2);
                } catch (InterruptedException e) {
                    C0440v.m1733c("Couldn't add request to queue. %s", e.toString());
                    Thread.currentThread().interrupt();
                    this.f2441b.m1657a();
                }
            }
            return;
        }

        /* renamed from: a */
        public void mo353a(C0429n<?> c0429n, C0434p<?> c0434p) {
            if (c0434p.f1546b != null) {
                if (!c0434p.f1546b.m1649a()) {
                    List<C0429n> list;
                    String d = c0429n.m1690d();
                    synchronized (this) {
                        list = (List) this.f2440a.remove(d);
                    }
                    if (list != null) {
                        if (C0440v.f1558b) {
                            C0440v.m1730a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), d);
                        }
                        for (C0429n a : list) {
                            this.f2441b.f1491e.mo357a(a, (C0434p) c0434p);
                        }
                    }
                    return;
                }
            }
            mo352a(c0429n);
        }
    }

    public C0419c(BlockingQueue<C0429n<?>> blockingQueue, BlockingQueue<C0429n<?>> blockingQueue2, C0417b c0417b, C0435q c0435q) {
        this.f1488b = blockingQueue;
        this.f1489c = blockingQueue2;
        this.f1490d = c0417b;
        this.f1491e = c0435q;
        this.f1493g = new C0644a(this);
    }

    /* renamed from: b */
    private void m1656b() {
        m1658a((C0429n) this.f1488b.take());
    }

    /* renamed from: a */
    public void m1657a() {
        this.f1492f = true;
        interrupt();
    }

    /* renamed from: a */
    void m1658a(final C0429n<?> c0429n) {
        c0429n.m1685a("cache-queue-take");
        if (c0429n.m1692f()) {
            c0429n.m1688b("cache-discard-canceled");
            return;
        }
        C0416a a = this.f1490d.mo346a(c0429n.m1690d());
        if (a == null) {
            c0429n.m1685a("cache-miss");
            if (!this.f1493g.m2989b(c0429n)) {
                this.f1489c.put(c0429n);
            }
        } else if (a.m1649a()) {
            c0429n.m1685a("cache-hit-expired");
            c0429n.m1677a(a);
            if (!this.f1493g.m2989b(c0429n)) {
                this.f1489c.put(c0429n);
            }
        } else {
            c0429n.m1685a("cache-hit");
            C0434p a2 = c0429n.mo349a(new C0425k(a.f1477a, a.f1483g));
            c0429n.m1685a("cache-hit-parsed");
            if (a.m1650b()) {
                c0429n.m1685a("cache-hit-refresh-needed");
                c0429n.m1677a(a);
                a2.f1548d = true;
                if (!this.f1493g.m2989b(c0429n)) {
                    this.f1491e.mo358a(c0429n, a2, new Runnable(this) {
                        /* renamed from: b */
                        final /* synthetic */ C0419c f1486b;

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
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/1763344271.run(Unknown Source)
*/
                            /*
                            r2 = this;
                            r0 = r2.f1486b;	 Catch:{ InterruptedException -> 0x000c }
                            r0 = r0.f1489c;	 Catch:{ InterruptedException -> 0x000c }
                            r1 = r5;	 Catch:{ InterruptedException -> 0x000c }
                            r0.put(r1);	 Catch:{ InterruptedException -> 0x000c }
                            goto L_0x0013;
                        L_0x000c:
                            r0 = java.lang.Thread.currentThread();
                            r0.interrupt();
                        L_0x0013:
                            return;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.a.a.c.1.run():void");
                        }
                    });
                }
            }
            this.f1491e.mo357a((C0429n) c0429n, a2);
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
        r3 = this;
        r0 = f1487a;
        r1 = 0;
        if (r0 == 0) goto L_0x000c;
    L_0x0005:
        r0 = "start new dispatcher";
        r2 = new java.lang.Object[r1];
        com.p025a.p026a.C0440v.m1730a(r0, r2);
    L_0x000c:
        r0 = 10;
        android.os.Process.setThreadPriority(r0);
        r0 = r3.f1490d;
        r0.mo347a();
    L_0x0016:
        r3.m1656b();	 Catch:{ InterruptedException -> 0x001a }
        goto L_0x0016;
    L_0x001a:
        r0 = r3.f1492f;
        if (r0 == 0) goto L_0x0026;
    L_0x001e:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
        return;
    L_0x0026:
        r0 = "Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it";
        r2 = new java.lang.Object[r1];
        com.p025a.p026a.C0440v.m1733c(r0, r2);
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.a.c.run():void");
    }
}
