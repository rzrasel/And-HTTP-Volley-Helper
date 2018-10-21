package android.arch.p000a.p001a;

import java.util.concurrent.Executor;

/* renamed from: android.arch.a.a.a */
public class C0502a extends C0002c {
    /* renamed from: a */
    private static volatile C0502a f1761a;
    /* renamed from: d */
    private static final Executor f1762d = new C00001();
    /* renamed from: e */
    private static final Executor f1763e = new C00012();
    /* renamed from: b */
    private C0002c f1764b = this.f1765c;
    /* renamed from: c */
    private C0002c f1765c = new C0503b();

    /* renamed from: android.arch.a.a.a$1 */
    static class C00001 implements Executor {
        C00001() {
        }

        public void execute(Runnable runnable) {
            C0502a.m1953a().mo2b(runnable);
        }
    }

    /* renamed from: android.arch.a.a.a$2 */
    static class C00012 implements Executor {
        C00012() {
        }

        public void execute(Runnable runnable) {
            C0502a.m1953a().mo1a(runnable);
        }
    }

    private C0502a() {
    }

    /* renamed from: a */
    public static C0502a m1953a() {
        if (f1761a != null) {
            return f1761a;
        }
        synchronized (C0502a.class) {
            if (f1761a == null) {
                f1761a = new C0502a();
            }
        }
        return f1761a;
    }

    /* renamed from: a */
    public void mo1a(Runnable runnable) {
        this.f1764b.mo1a(runnable);
    }

    /* renamed from: b */
    public void mo2b(Runnable runnable) {
        this.f1764b.mo2b(runnable);
    }

    /* renamed from: b */
    public boolean mo3b() {
        return this.f1764b.mo3b();
    }
}
