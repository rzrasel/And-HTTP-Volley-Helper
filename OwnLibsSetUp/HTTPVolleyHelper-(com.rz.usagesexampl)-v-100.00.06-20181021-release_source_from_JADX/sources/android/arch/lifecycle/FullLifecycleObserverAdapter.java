package android.arch.lifecycle;

import android.arch.lifecycle.C0015c.C0013a;

class FullLifecycleObserverAdapter implements GenericLifecycleObserver {
    /* renamed from: a */
    private final FullLifecycleObserver f2591a;

    FullLifecycleObserverAdapter(FullLifecycleObserver fullLifecycleObserver) {
        this.f2591a = fullLifecycleObserver;
    }

    /* renamed from: a */
    public void mo420a(C0017e c0017e, C0013a c0013a) {
        switch (c0013a) {
            case ON_CREATE:
                this.f2591a.m1970a(c0017e);
                return;
            case ON_START:
                this.f2591a.m1971b(c0017e);
                return;
            case ON_RESUME:
                this.f2591a.m1972c(c0017e);
                return;
            case ON_PAUSE:
                this.f2591a.m1973d(c0017e);
                return;
            case ON_STOP:
                this.f2591a.m1974e(c0017e);
                return;
            case ON_DESTROY:
                this.f2591a.m1975f(c0017e);
                return;
            case ON_ANY:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                return;
        }
    }
}
