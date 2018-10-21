package android.arch.lifecycle;

import android.arch.lifecycle.C0011a.C0009a;
import android.arch.lifecycle.C0015c.C0013a;

class ReflectiveGenericLifecycleObserver implements GenericLifecycleObserver {
    /* renamed from: a */
    private final Object f2594a;
    /* renamed from: b */
    private final C0009a f2595b = C0011a.f24a.m36b(this.f2594a.getClass());

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f2594a = obj;
    }

    /* renamed from: a */
    public void mo420a(C0017e c0017e, C0013a c0013a) {
        this.f2595b.m30a(c0017e, c0013a, this.f2594a);
    }
}
