package android.arch.lifecycle;

import android.arch.lifecycle.C0015c.C0013a;
import android.arch.lifecycle.C0015c.C0014b;
import android.arch.p000a.p001a.C0502a;
import android.arch.p000a.p002b.C0006b;
import java.util.Iterator;
import java.util.Map.Entry;

public abstract class LiveData<T> {
    /* renamed from: a */
    private static final Object f13a = new Object();
    /* renamed from: b */
    private C0006b<C0022k<T>, C0008a> f14b;
    /* renamed from: c */
    private int f15c;
    /* renamed from: d */
    private volatile Object f16d;
    /* renamed from: e */
    private int f17e;
    /* renamed from: f */
    private boolean f18f;
    /* renamed from: g */
    private boolean f19g;

    /* renamed from: android.arch.lifecycle.LiveData$a */
    private abstract class C0008a {
        /* renamed from: c */
        final C0022k<T> f9c;
        /* renamed from: d */
        boolean f10d;
        /* renamed from: e */
        int f11e = -1;
        /* renamed from: f */
        final /* synthetic */ LiveData f12f;

        C0008a(LiveData liveData, C0022k<T> c0022k) {
            this.f12f = liveData;
            this.f9c = c0022k;
        }

        /* renamed from: a */
        void m13a(boolean z) {
            if (z != this.f10d) {
                this.f10d = z;
                int i = 1;
                Object obj = this.f12f.f15c == 0 ? 1 : null;
                LiveData liveData = this.f12f;
                int a = liveData.f15c;
                if (!this.f10d) {
                    i = -1;
                }
                liveData.f15c = a + i;
                if (obj != null && this.f10d) {
                    this.f12f.mo446b();
                }
                if (this.f12f.f15c == 0 && !this.f10d) {
                    this.f12f.mo447c();
                }
                if (this.f10d) {
                    this.f12f.m22b(this);
                }
            }
        }

        /* renamed from: a */
        abstract boolean mo421a();

        /* renamed from: a */
        boolean mo422a(C0017e c0017e) {
            return false;
        }

        /* renamed from: b */
        void mo423b() {
        }
    }

    class LifecycleBoundObserver extends C0008a implements GenericLifecycleObserver {
        /* renamed from: a */
        final C0017e f2592a;
        /* renamed from: b */
        final /* synthetic */ LiveData f2593b;

        LifecycleBoundObserver(LiveData liveData, C0017e c0017e, C0022k<T> c0022k) {
            this.f2593b = liveData;
            super(liveData, c0022k);
            this.f2592a = c0017e;
        }

        /* renamed from: a */
        public void mo420a(C0017e c0017e, C0013a c0013a) {
            if (this.f2592a.mo42a().mo8a() == C0014b.DESTROYED) {
                this.f2593b.mo445a(this.c);
            } else {
                m13a(mo421a());
            }
        }

        /* renamed from: a */
        boolean mo421a() {
            return this.f2592a.mo42a().mo8a().m38a(C0014b.STARTED);
        }

        /* renamed from: a */
        boolean mo422a(C0017e c0017e) {
            return this.f2592a == c0017e;
        }

        /* renamed from: b */
        void mo423b() {
            this.f2592a.mo42a().mo10b(this);
        }
    }

    /* renamed from: a */
    private void m19a(C0008a c0008a) {
        if (!c0008a.f10d) {
            return;
        }
        if (!c0008a.mo421a()) {
            c0008a.m13a(false);
        } else if (c0008a.f11e < this.f17e) {
            c0008a.f11e = this.f17e;
            c0008a.f9c.mo36a(this.f16d);
        }
    }

    /* renamed from: a */
    private static void m21a(String str) {
        if (!C0502a.m1953a().mo3b()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot invoke ");
            stringBuilder.append(str);
            stringBuilder.append(" on a background");
            stringBuilder.append(" thread");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: b */
    private void m22b(C0008a c0008a) {
        if (this.f18f) {
            this.f19g = true;
            return;
        }
        this.f18f = true;
        do {
            this.f19g = false;
            C0008a c0008a2;
            if (c0008a2 == null) {
                Iterator c = this.f14b.m10c();
                while (c.hasNext()) {
                    m19a((C0008a) ((Entry) c.next()).getValue());
                    if (this.f19g) {
                        break;
                    }
                }
            }
            m19a(c0008a2);
            c0008a2 = null;
        } while (this.f19g);
        this.f18f = false;
    }

    /* renamed from: a */
    public T m23a() {
        T t = this.f16d;
        return t != f13a ? t : null;
    }

    /* renamed from: a */
    public void m24a(C0017e c0017e, C0022k<T> c0022k) {
        if (c0017e.mo42a().mo8a() != C0014b.DESTROYED) {
            C0016d lifecycleBoundObserver = new LifecycleBoundObserver(this, c0017e, c0022k);
            C0008a c0008a = (C0008a) this.f14b.mo5a(c0022k, lifecycleBoundObserver);
            if (c0008a != null) {
                if (!c0008a.mo422a(c0017e)) {
                    throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
                }
            }
            if (c0008a == null) {
                c0017e.mo42a().mo9a(lifecycleBoundObserver);
            }
        }
    }

    /* renamed from: a */
    public void mo445a(C0022k<T> c0022k) {
        m21a("removeObserver");
        C0008a c0008a = (C0008a) this.f14b.mo6b(c0022k);
        if (c0008a != null) {
            c0008a.mo423b();
            c0008a.m13a(false);
        }
    }

    /* renamed from: b */
    protected void mo446b() {
    }

    /* renamed from: c */
    protected void mo447c() {
    }

    /* renamed from: d */
    public boolean m28d() {
        return this.f15c > 0;
    }
}
