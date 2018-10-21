package android.arch.lifecycle;

import android.arch.lifecycle.C0015c.C0013a;
import android.arch.lifecycle.C0015c.C0014b;
import android.arch.p000a.p002b.C0504a;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: android.arch.lifecycle.f */
public class C0507f extends C0015c {
    /* renamed from: a */
    private C0504a<C0016d, C0019a> f1775a = new C0504a();
    /* renamed from: b */
    private C0014b f1776b;
    /* renamed from: c */
    private final WeakReference<C0017e> f1777c;
    /* renamed from: d */
    private int f1778d = 0;
    /* renamed from: e */
    private boolean f1779e = false;
    /* renamed from: f */
    private boolean f1780f = false;
    /* renamed from: g */
    private ArrayList<C0014b> f1781g = new ArrayList();

    /* renamed from: android.arch.lifecycle.f$a */
    static class C0019a {
        /* renamed from: a */
        C0014b f35a;
        /* renamed from: b */
        GenericLifecycleObserver f36b;

        C0019a(C0016d c0016d, C0014b c0014b) {
            this.f36b = C0020h.m44a((Object) c0016d);
            this.f35a = c0014b;
        }

        /* renamed from: a */
        void m43a(C0017e c0017e, C0013a c0013a) {
            C0014b b = C0507f.m1979b(c0013a);
            this.f35a = C0507f.m1977a(this.f35a, b);
            this.f36b.mo420a(c0017e, c0013a);
            this.f35a = b;
        }
    }

    public C0507f(C0017e c0017e) {
        this.f1777c = new WeakReference(c0017e);
        this.f1776b = C0014b.INITIALIZED;
    }

    /* renamed from: a */
    static C0014b m1977a(C0014b c0014b, C0014b c0014b2) {
        return (c0014b2 == null || c0014b2.compareTo(c0014b) >= 0) ? c0014b : c0014b2;
    }

    /* renamed from: a */
    private void m1978a(C0017e c0017e) {
        Iterator c = this.f1775a.m10c();
        while (c.hasNext() && !this.f1780f) {
            Entry entry = (Entry) c.next();
            C0019a c0019a = (C0019a) entry.getValue();
            while (c0019a.f35a.compareTo(this.f1776b) < 0 && !this.f1780f && this.f1775a.m1963c(entry.getKey())) {
                m1985c(c0019a.f35a);
                c0019a.m43a(c0017e, C0507f.m1988e(c0019a.f35a));
                m1984c();
            }
        }
    }

    /* renamed from: b */
    static C0014b m1979b(C0013a c0013a) {
        switch (c0013a) {
            case ON_CREATE:
            case ON_STOP:
                return C0014b.CREATED;
            case ON_START:
            case ON_PAUSE:
                return C0014b.STARTED;
            case ON_RESUME:
                return C0014b.RESUMED;
            case ON_DESTROY:
                return C0014b.DESTROYED;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected event value ");
                stringBuilder.append(c0013a);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: b */
    private void m1980b(C0014b c0014b) {
        if (this.f1776b != c0014b) {
            this.f1776b = c0014b;
            if (!this.f1779e) {
                if (this.f1778d == 0) {
                    this.f1779e = true;
                    m1987d();
                    this.f1779e = false;
                    return;
                }
            }
            this.f1780f = true;
        }
    }

    /* renamed from: b */
    private void m1981b(C0017e c0017e) {
        Iterator b = this.f1775a.m9b();
        while (b.hasNext() && !this.f1780f) {
            Entry entry = (Entry) b.next();
            C0019a c0019a = (C0019a) entry.getValue();
            while (c0019a.f35a.compareTo(this.f1776b) > 0 && !this.f1780f && this.f1775a.m1963c(entry.getKey())) {
                C0013a d = C0507f.m1986d(c0019a.f35a);
                m1985c(C0507f.m1979b(d));
                c0019a.m43a(c0017e, d);
                m1984c();
            }
        }
    }

    /* renamed from: b */
    private boolean m1982b() {
        boolean z = true;
        if (this.f1775a.m4a() == 0) {
            return true;
        }
        C0014b c0014b = ((C0019a) this.f1775a.m11d().getValue()).f35a;
        C0014b c0014b2 = ((C0019a) this.f1775a.m12e().getValue()).f35a;
        if (c0014b != c0014b2 || this.f1776b != c0014b2) {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    private C0014b m1983c(C0016d c0016d) {
        Entry d = this.f1775a.m1964d(c0016d);
        C0014b c0014b = null;
        C0014b c0014b2 = d != null ? ((C0019a) d.getValue()).f35a : null;
        if (!this.f1781g.isEmpty()) {
            c0014b = (C0014b) this.f1781g.get(this.f1781g.size() - 1);
        }
        return C0507f.m1977a(C0507f.m1977a(this.f1776b, c0014b2), c0014b);
    }

    /* renamed from: c */
    private void m1984c() {
        this.f1781g.remove(this.f1781g.size() - 1);
    }

    /* renamed from: c */
    private void m1985c(C0014b c0014b) {
        this.f1781g.add(c0014b);
    }

    /* renamed from: d */
    private static C0013a m1986d(C0014b c0014b) {
        switch (c0014b) {
            case INITIALIZED:
                throw new IllegalArgumentException();
            case CREATED:
                return C0013a.ON_DESTROY;
            case STARTED:
                return C0013a.ON_STOP;
            case RESUMED:
                return C0013a.ON_PAUSE;
            case DESTROYED:
                throw new IllegalArgumentException();
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected state value ");
                stringBuilder.append(c0014b);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: d */
    private void m1987d() {
        C0017e c0017e = (C0017e) this.f1777c.get();
        if (c0017e == null) {
            Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
            return;
        }
        while (!m1982b()) {
            this.f1780f = false;
            if (this.f1776b.compareTo(((C0019a) this.f1775a.m11d().getValue()).f35a) < 0) {
                m1981b(c0017e);
            }
            Entry e = this.f1775a.m12e();
            if (!(this.f1780f || e == null || this.f1776b.compareTo(((C0019a) e.getValue()).f35a) <= 0)) {
                m1978a(c0017e);
            }
        }
        this.f1780f = false;
    }

    /* renamed from: e */
    private static C0013a m1988e(C0014b c0014b) {
        switch (c0014b) {
            case INITIALIZED:
            case DESTROYED:
                return C0013a.ON_CREATE;
            case CREATED:
                return C0013a.ON_START;
            case STARTED:
                return C0013a.ON_RESUME;
            case RESUMED:
                throw new IllegalArgumentException();
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected state value ");
                stringBuilder.append(c0014b);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public C0014b mo8a() {
        return this.f1776b;
    }

    /* renamed from: a */
    public void m1990a(C0013a c0013a) {
        m1980b(C0507f.m1979b(c0013a));
    }

    /* renamed from: a */
    public void m1991a(C0014b c0014b) {
        m1980b(c0014b);
    }

    /* renamed from: a */
    public void mo9a(C0016d c0016d) {
        C0019a c0019a = new C0019a(c0016d, this.f1776b == C0014b.DESTROYED ? C0014b.DESTROYED : C0014b.INITIALIZED);
        if (((C0019a) this.f1775a.mo5a(c0016d, c0019a)) == null) {
            C0017e c0017e = (C0017e) this.f1777c.get();
            if (c0017e != null) {
                Object obj;
                Enum c;
                if (this.f1778d == 0) {
                    if (!this.f1779e) {
                        obj = null;
                        c = m1983c(c0016d);
                        this.f1778d++;
                        while (c0019a.f35a.compareTo(c) < 0 && this.f1775a.m1963c(c0016d)) {
                            m1985c(c0019a.f35a);
                            c0019a.m43a(c0017e, C0507f.m1988e(c0019a.f35a));
                            m1984c();
                            c = m1983c(c0016d);
                        }
                        if (obj == null) {
                            m1987d();
                        }
                        this.f1778d--;
                    }
                }
                obj = 1;
                c = m1983c(c0016d);
                this.f1778d++;
                while (c0019a.f35a.compareTo(c) < 0) {
                    m1985c(c0019a.f35a);
                    c0019a.m43a(c0017e, C0507f.m1988e(c0019a.f35a));
                    m1984c();
                    c = m1983c(c0016d);
                }
                if (obj == null) {
                    m1987d();
                }
                this.f1778d--;
            }
        }
    }

    /* renamed from: b */
    public void mo10b(C0016d c0016d) {
        this.f1775a.mo6b(c0016d);
    }
}
