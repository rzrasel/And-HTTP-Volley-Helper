package android.support.constraint.p006a.p007a;

import android.support.constraint.p006a.p007a.C0058e.C0057c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: android.support.constraint.a.a.h */
public class C0062h {
    /* renamed from: a */
    public List<C0061f> f287a;
    /* renamed from: b */
    int f288b = -1;
    /* renamed from: c */
    int f289c = -1;
    /* renamed from: d */
    public boolean f290d = false;
    /* renamed from: e */
    public final int[] f291e = new int[]{this.f288b, this.f289c};
    /* renamed from: f */
    List<C0061f> f292f = new ArrayList();
    /* renamed from: g */
    List<C0061f> f293g = new ArrayList();
    /* renamed from: h */
    HashSet<C0061f> f294h = new HashSet();
    /* renamed from: i */
    HashSet<C0061f> f295i = new HashSet();
    /* renamed from: j */
    List<C0061f> f296j = new ArrayList();
    /* renamed from: k */
    List<C0061f> f297k = new ArrayList();

    C0062h(List<C0061f> list) {
        this.f287a = list;
    }

    C0062h(List<C0061f> list, boolean z) {
        this.f287a = list;
        this.f290d = z;
    }

    /* renamed from: a */
    private void m250a(C0061f c0061f) {
        if (c0061f.f257W && !c0061f.m219h()) {
            int p;
            C0058e c0058e;
            int i;
            Object obj = null;
            Object obj2 = c0061f.f281u.f220c != null ? 1 : null;
            C0058e c0058e2 = (obj2 != null ? c0061f.f281u : c0061f.f279s).f220c;
            if (c0058e2 != null) {
                if (!c0058e2.f218a.f258X) {
                    m250a(c0058e2.f218a);
                }
                if (c0058e2.f219b == C0057c.RIGHT) {
                    p = c0058e2.f218a.m234p() + c0058e2.f218a.f244I;
                } else if (c0058e2.f219b == C0057c.LEFT) {
                    p = c0058e2.f218a.f244I;
                }
                p = obj2 == null ? p - c0061f.f281u.m158e() : p + (c0061f.f279s.m158e() + c0061f.m234p());
                c0061f.m204c(p - c0061f.m234p(), p);
                if (c0061f.f283w.f220c == null) {
                    c0058e = c0061f.f283w.f220c;
                    if (!c0058e.f218a.f258X) {
                        m250a(c0058e.f218a);
                    }
                    i = (c0058e.f218a.f245J + c0058e.f218a.f250O) - c0061f.f250O;
                    c0061f.m209d(i, c0061f.f241F + i);
                    c0061f.f258X = true;
                }
                if (c0061f.f282v.f220c != null) {
                    obj = 1;
                }
                c0058e = (obj == null ? c0061f.f282v : c0061f.f280t).f220c;
                if (c0058e != null) {
                    if (!c0058e.f218a.f258X) {
                        m250a(c0058e.f218a);
                    }
                    if (c0058e.f219b == C0057c.BOTTOM) {
                        p = c0058e.f218a.f245J + c0058e.f218a.m238r();
                    } else if (c0058e.f219b == C0057c.TOP) {
                        p = c0058e.f218a.f245J;
                    }
                }
                p = obj == null ? p - c0061f.f282v.m158e() : p + (c0061f.f280t.m158e() + c0061f.m238r());
                c0061f.m209d(p - c0061f.m238r(), p);
                c0061f.f258X = true;
                return;
            }
            p = 0;
            if (obj2 == null) {
            }
            c0061f.m204c(p - c0061f.m234p(), p);
            if (c0061f.f283w.f220c == null) {
                if (c0061f.f282v.f220c != null) {
                    obj = 1;
                }
                if (obj == null) {
                }
                c0058e = (obj == null ? c0061f.f282v : c0061f.f280t).f220c;
                if (c0058e != null) {
                    if (c0058e.f218a.f258X) {
                        m250a(c0058e.f218a);
                    }
                    if (c0058e.f219b == C0057c.BOTTOM) {
                        p = c0058e.f218a.f245J + c0058e.f218a.m238r();
                    } else if (c0058e.f219b == C0057c.TOP) {
                        p = c0058e.f218a.f245J;
                    }
                }
                if (obj == null) {
                }
                c0061f.m209d(p - c0061f.m238r(), p);
                c0061f.f258X = true;
                return;
            }
            c0058e = c0061f.f283w.f220c;
            if (c0058e.f218a.f258X) {
                m250a(c0058e.f218a);
            }
            i = (c0058e.f218a.f245J + c0058e.f218a.f250O) - c0061f.f250O;
            c0061f.m209d(i, c0061f.f241F + i);
            c0061f.f258X = true;
        }
    }

    /* renamed from: a */
    private void m251a(ArrayList<C0061f> arrayList, C0061f c0061f) {
        if (!c0061f.f259Y) {
            arrayList.add(c0061f);
            c0061f.f259Y = true;
            if (!c0061f.m219h()) {
                if (c0061f instanceof C0514j) {
                    C0514j c0514j = (C0514j) c0061f;
                    int i = c0514j.aj;
                    for (int i2 = 0; i2 < i; i2++) {
                        m251a((ArrayList) arrayList, c0514j.ai[i2]);
                    }
                }
                for (C0058e c0058e : c0061f.f236A) {
                    C0058e c0058e2 = c0058e2.f220c;
                    if (c0058e2 != null) {
                        C0061f c0061f2 = c0058e2.f218a;
                        if (!(c0058e2 == null || c0061f2 == c0061f.m224k())) {
                            m251a((ArrayList) arrayList, c0061f2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    List<C0061f> m252a() {
        if (!this.f296j.isEmpty()) {
            return this.f296j;
        }
        int size = this.f287a.size();
        for (int i = 0; i < size; i++) {
            C0061f c0061f = (C0061f) this.f287a.get(i);
            if (!c0061f.f257W) {
                m251a((ArrayList) this.f296j, c0061f);
            }
        }
        this.f297k.clear();
        this.f297k.addAll(this.f287a);
        this.f297k.removeAll(this.f296j);
        return this.f296j;
    }

    /* renamed from: a */
    public List<C0061f> m253a(int i) {
        return i == 0 ? this.f292f : i == 1 ? this.f293g : null;
    }

    /* renamed from: a */
    void m254a(C0061f c0061f, int i) {
        HashSet hashSet;
        if (i == 0) {
            hashSet = this.f294h;
        } else if (i == 1) {
            hashSet = this.f295i;
        } else {
            return;
        }
        hashSet.add(c0061f);
    }

    /* renamed from: b */
    Set<C0061f> m255b(int i) {
        return i == 0 ? this.f294h : i == 1 ? this.f295i : null;
    }

    /* renamed from: b */
    void m256b() {
        int size = this.f297k.size();
        for (int i = 0; i < size; i++) {
            m250a((C0061f) this.f297k.get(i));
        }
    }
}
