package android.support.constraint.p006a.p007a;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: android.support.constraint.a.a.o */
public class C0066o {
    /* renamed from: h */
    HashSet<C0066o> f300h = new HashSet(2);
    /* renamed from: i */
    int f301i = 0;

    /* renamed from: a */
    public void mo20a() {
    }

    /* renamed from: a */
    public void m263a(C0066o c0066o) {
        this.f300h.add(c0066o);
    }

    /* renamed from: b */
    public void mo21b() {
        this.f301i = 0;
        this.f300h.clear();
    }

    /* renamed from: e */
    public void m265e() {
        this.f301i = 0;
        Iterator it = this.f300h.iterator();
        while (it.hasNext()) {
            ((C0066o) it.next()).m265e();
        }
    }

    /* renamed from: f */
    public void m266f() {
        this.f301i = 1;
        Iterator it = this.f300h.iterator();
        while (it.hasNext()) {
            ((C0066o) it.next()).mo20a();
        }
    }

    /* renamed from: g */
    public boolean m267g() {
        return this.f301i == 1;
    }
}
