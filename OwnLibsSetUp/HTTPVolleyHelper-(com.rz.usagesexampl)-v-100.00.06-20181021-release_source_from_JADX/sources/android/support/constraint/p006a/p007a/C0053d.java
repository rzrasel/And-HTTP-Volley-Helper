package android.support.constraint.p006a.p007a;

import android.support.constraint.p006a.p007a.C0061f.C0060a;
import java.util.ArrayList;

/* renamed from: android.support.constraint.a.a.d */
public class C0053d {
    /* renamed from: a */
    protected C0061f f183a;
    /* renamed from: b */
    protected C0061f f184b;
    /* renamed from: c */
    protected C0061f f185c;
    /* renamed from: d */
    protected C0061f f186d;
    /* renamed from: e */
    protected C0061f f187e;
    /* renamed from: f */
    protected C0061f f188f;
    /* renamed from: g */
    protected C0061f f189g;
    /* renamed from: h */
    protected ArrayList<C0061f> f190h;
    /* renamed from: i */
    protected int f191i;
    /* renamed from: j */
    protected int f192j;
    /* renamed from: k */
    protected float f193k = 0.0f;
    /* renamed from: l */
    protected boolean f194l;
    /* renamed from: m */
    protected boolean f195m;
    /* renamed from: n */
    protected boolean f196n;
    /* renamed from: o */
    private int f197o;
    /* renamed from: p */
    private boolean f198p = false;
    /* renamed from: q */
    private boolean f199q;

    public C0053d(C0061f c0061f, int i, boolean z) {
        this.f183a = c0061f;
        this.f197o = i;
        this.f198p = z;
    }

    /* renamed from: a */
    private static boolean m147a(C0061f c0061f, int i) {
        return c0061f.m226l() != 8 && c0061f.f238C[i] == C0060a.MATCH_CONSTRAINT && (c0061f.f267g[i] == 0 || c0061f.f267g[i] == 3);
    }

    /* renamed from: b */
    private void m148b() {
        int i = this.f197o * 2;
        C0061f c0061f = this.f183a;
        C0061f c0061f2 = this.f183a;
        C0061f c0061f3 = this.f183a;
        boolean z = false;
        C0061f c0061f4 = c0061f;
        Object obj = null;
        while (obj == null) {
            this.f191i++;
            C0061f c0061f5 = null;
            c0061f2.af[this.f197o] = null;
            c0061f2.ae[this.f197o] = null;
            if (c0061f2.m226l() != 8) {
                if (this.f184b == null) {
                    this.f184b = c0061f2;
                }
                this.f186d = c0061f2;
                if (c0061f2.f238C[this.f197o] == C0060a.MATCH_CONSTRAINT && (c0061f2.f267g[this.f197o] == 0 || c0061f2.f267g[this.f197o] == 3 || c0061f2.f267g[this.f197o] == 2)) {
                    this.f192j++;
                    float f = c0061f2.ad[this.f197o];
                    if (f > 0.0f) {
                        this.f193k += c0061f2.ad[this.f197o];
                    }
                    if (C0053d.m147a(c0061f2, this.f197o)) {
                        if (f < 0.0f) {
                            this.f194l = true;
                        } else {
                            this.f195m = true;
                        }
                        if (this.f190h == null) {
                            this.f190h = new ArrayList();
                        }
                        this.f190h.add(c0061f2);
                    }
                    if (this.f188f == null) {
                        this.f188f = c0061f2;
                    }
                    if (this.f189g != null) {
                        this.f189g.ae[this.f197o] = c0061f2;
                    }
                    this.f189g = c0061f2;
                }
            }
            if (c0061f4 != c0061f2) {
                c0061f4.af[this.f197o] = c0061f2;
            }
            C0058e c0058e = c0061f2.f236A[i + 1].f220c;
            if (c0058e != null) {
                c0061f4 = c0058e.f218a;
                if (c0061f4.f236A[i].f220c != null) {
                    if (c0061f4.f236A[i].f220c.f218a == c0061f2) {
                        c0061f5 = c0061f4;
                    }
                }
            }
            if (c0061f5 == null) {
                c0061f5 = c0061f2;
                obj = 1;
            }
            c0061f4 = c0061f2;
            c0061f2 = c0061f5;
        }
        this.f185c = c0061f2;
        C0061f c0061f6 = (this.f197o == 0 && this.f198p) ? this.f185c : this.f183a;
        this.f187e = c0061f6;
        if (this.f195m && this.f194l) {
            z = true;
        }
        this.f196n = z;
    }

    /* renamed from: a */
    public void m149a() {
        if (!this.f199q) {
            m148b();
        }
        this.f199q = true;
    }
}
