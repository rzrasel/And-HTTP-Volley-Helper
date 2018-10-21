package android.support.constraint.p006a.p007a;

import android.support.constraint.p006a.p007a.C0058e.C0056b;
import java.util.ArrayList;

/* renamed from: android.support.constraint.a.a.p */
public class C0068p {
    /* renamed from: a */
    private int f307a;
    /* renamed from: b */
    private int f308b;
    /* renamed from: c */
    private int f309c;
    /* renamed from: d */
    private int f310d;
    /* renamed from: e */
    private ArrayList<C0067a> f311e = new ArrayList();

    /* renamed from: android.support.constraint.a.a.p$a */
    static class C0067a {
        /* renamed from: a */
        private C0058e f302a;
        /* renamed from: b */
        private C0058e f303b;
        /* renamed from: c */
        private int f304c;
        /* renamed from: d */
        private C0056b f305d;
        /* renamed from: e */
        private int f306e;

        public C0067a(C0058e c0058e) {
            this.f302a = c0058e;
            this.f303b = c0058e.m160g();
            this.f304c = c0058e.m158e();
            this.f305d = c0058e.m159f();
            this.f306e = c0058e.m161h();
        }

        /* renamed from: a */
        public void m268a(C0061f c0061f) {
            int h;
            this.f302a = c0061f.mo14a(this.f302a.m157d());
            if (this.f302a != null) {
                this.f303b = this.f302a.m160g();
                this.f304c = this.f302a.m158e();
                this.f305d = this.f302a.m159f();
                h = this.f302a.m161h();
            } else {
                this.f303b = null;
                h = 0;
                this.f304c = 0;
                this.f305d = C0056b.STRONG;
            }
            this.f306e = h;
        }

        /* renamed from: b */
        public void m269b(C0061f c0061f) {
            c0061f.mo14a(this.f302a.m157d()).m154a(this.f303b, this.f304c, this.f305d, this.f306e);
        }
    }

    public C0068p(C0061f c0061f) {
        this.f307a = c0061f.m230n();
        this.f308b = c0061f.m232o();
        this.f309c = c0061f.m234p();
        this.f310d = c0061f.m238r();
        ArrayList C = c0061f.mo12C();
        int size = C.size();
        for (int i = 0; i < size; i++) {
            this.f311e.add(new C0067a((C0058e) C.get(i)));
        }
    }

    /* renamed from: a */
    public void m270a(C0061f c0061f) {
        this.f307a = c0061f.m230n();
        this.f308b = c0061f.m232o();
        this.f309c = c0061f.m234p();
        this.f310d = c0061f.m238r();
        int size = this.f311e.size();
        for (int i = 0; i < size; i++) {
            ((C0067a) this.f311e.get(i)).m268a(c0061f);
        }
    }

    /* renamed from: b */
    public void m271b(C0061f c0061f) {
        c0061f.m218h(this.f307a);
        c0061f.m221i(this.f308b);
        c0061f.m223j(this.f309c);
        c0061f.m225k(this.f310d);
        int size = this.f311e.size();
        for (int i = 0; i < size; i++) {
            ((C0067a) this.f311e.get(i)).m269b(c0061f);
        }
    }
}
