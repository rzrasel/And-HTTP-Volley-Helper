package android.support.constraint.p006a.p007a;

import android.support.constraint.p006a.C0070c;
import java.util.ArrayList;

/* renamed from: android.support.constraint.a.a.q */
public class C0517q extends C0061f {
    protected ArrayList<C0061f> az = new ArrayList();

    /* renamed from: D */
    public void mo22D() {
        super.mo22D();
        if (this.az != null) {
            int size = this.az.size();
            for (int i = 0; i < size; i++) {
                C0061f c0061f = (C0061f) this.az.get(i);
                c0061f.mo24b(m242t(), m244u());
                if (!(c0061f instanceof C0732g)) {
                    c0061f.mo22D();
                }
            }
        }
    }

    /* renamed from: N */
    public void mo444N() {
        mo22D();
        if (this.az != null) {
            int size = this.az.size();
            for (int i = 0; i < size; i++) {
                C0061f c0061f = (C0061f) this.az.get(i);
                if (c0061f instanceof C0517q) {
                    ((C0517q) c0061f).mo444N();
                }
            }
        }
    }

    /* renamed from: T */
    public C0732g m2033T() {
        C0061f k = m224k();
        C0732g c0732g = this instanceof C0732g ? (C0732g) this : null;
        while (k != null) {
            C0061f k2 = k.m224k();
            if (k instanceof C0732g) {
                c0732g = (C0732g) k;
            }
            k = k2;
        }
        return c0732g;
    }

    /* renamed from: U */
    public void m2034U() {
        this.az.clear();
    }

    /* renamed from: a */
    public void mo23a(C0070c c0070c) {
        super.mo23a(c0070c);
        int size = this.az.size();
        for (int i = 0; i < size; i++) {
            ((C0061f) this.az.get(i)).mo23a(c0070c);
        }
    }

    /* renamed from: b */
    public void mo24b(int i, int i2) {
        super.mo24b(i, i2);
        i = this.az.size();
        for (i2 = 0; i2 < i; i2++) {
            ((C0061f) this.az.get(i2)).mo24b(m245v(), m246w());
        }
    }

    /* renamed from: b */
    public void m2037b(C0061f c0061f) {
        this.az.add(c0061f);
        if (c0061f.m224k() != null) {
            ((C0517q) c0061f.m224k()).m2038c(c0061f);
        }
        c0061f.m184a((C0061f) this);
    }

    /* renamed from: c */
    public void m2038c(C0061f c0061f) {
        this.az.remove(c0061f);
        c0061f.m184a(null);
    }

    /* renamed from: f */
    public void mo25f() {
        this.az.clear();
        super.mo25f();
    }
}
