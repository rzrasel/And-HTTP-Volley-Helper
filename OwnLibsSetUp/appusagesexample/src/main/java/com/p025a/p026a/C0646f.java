package com.p025a.p026a;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.a.a.f */
public class C0646f implements C0435q {
    /* renamed from: a */
    private final Executor f2446a;

    /* renamed from: com.a.a.f$a */
    private static class C0421a implements Runnable {
        /* renamed from: a */
        private final C0429n f1496a;
        /* renamed from: b */
        private final C0434p f1497b;
        /* renamed from: c */
        private final Runnable f1498c;

        public C0421a(C0429n c0429n, C0434p c0434p, Runnable runnable) {
            this.f1496a = c0429n;
            this.f1497b = c0434p;
            this.f1498c = runnable;
        }

        public void run() {
            if (this.f1496a.m1692f()) {
                this.f1496a.m1688b("canceled-at-delivery");
                return;
            }
            if (this.f1497b.m1719a()) {
                this.f1496a.mo350a(this.f1497b.f1545a);
            } else {
                this.f1496a.m1687b(this.f1497b.f1547c);
            }
            if (this.f1497b.f1548d) {
                this.f1496a.m1685a("intermediate-response");
            } else {
                this.f1496a.m1688b("done");
            }
            if (this.f1498c != null) {
                this.f1498c.run();
            }
        }
    }

    public C0646f(final Handler handler) {
        this.f2446a = new Executor(this) {
            /* renamed from: b */
            final /* synthetic */ C0646f f1495b;

            public void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    /* renamed from: a */
    public void mo357a(C0429n<?> c0429n, C0434p<?> c0434p) {
        mo358a(c0429n, c0434p, null);
    }

    /* renamed from: a */
    public void mo358a(C0429n<?> c0429n, C0434p<?> c0434p, Runnable runnable) {
        c0429n.m1706t();
        c0429n.m1685a("post-response");
        this.f2446a.execute(new C0421a(c0429n, c0434p, runnable));
    }

    /* renamed from: a */
    public void mo359a(C0429n<?> c0429n, C0437u c0437u) {
        c0429n.m1685a("post-error");
        this.f2446a.execute(new C0421a(c0429n, C0434p.m1717a(c0437u), null));
    }
}
