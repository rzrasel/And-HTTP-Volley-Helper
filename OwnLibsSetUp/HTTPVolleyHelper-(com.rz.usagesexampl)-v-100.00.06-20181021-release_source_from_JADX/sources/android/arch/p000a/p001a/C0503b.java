package android.arch.p000a.p001a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: android.arch.a.a.b */
public class C0503b extends C0002c {
    /* renamed from: a */
    private final Object f1766a = new Object();
    /* renamed from: b */
    private ExecutorService f1767b = Executors.newFixedThreadPool(2);
    /* renamed from: c */
    private volatile Handler f1768c;

    /* renamed from: a */
    public void mo1a(Runnable runnable) {
        this.f1767b.execute(runnable);
    }

    /* renamed from: b */
    public void mo2b(Runnable runnable) {
        if (this.f1768c == null) {
            synchronized (this.f1766a) {
                if (this.f1768c == null) {
                    this.f1768c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f1768c.post(runnable);
    }

    /* renamed from: b */
    public boolean mo3b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
