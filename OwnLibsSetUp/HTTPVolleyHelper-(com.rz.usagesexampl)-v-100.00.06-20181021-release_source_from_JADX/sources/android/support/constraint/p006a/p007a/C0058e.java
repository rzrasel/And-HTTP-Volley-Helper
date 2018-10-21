package android.support.constraint.p006a.p007a;

import android.support.constraint.p006a.C0070c;
import android.support.constraint.p006a.C0077h;
import android.support.constraint.p006a.C0077h.C0076a;

/* renamed from: android.support.constraint.a.a.e */
public class C0058e {
    /* renamed from: a */
    final C0061f f218a;
    /* renamed from: b */
    final C0057c f219b;
    /* renamed from: c */
    C0058e f220c;
    /* renamed from: d */
    public int f221d = 0;
    /* renamed from: e */
    int f222e = -1;
    /* renamed from: f */
    C0077h f223f;
    /* renamed from: g */
    private C0515m f224g = new C0515m(this);
    /* renamed from: h */
    private C0056b f225h = C0056b.NONE;
    /* renamed from: i */
    private C0055a f226i = C0055a.RELAXED;
    /* renamed from: j */
    private int f227j = 0;

    /* renamed from: android.support.constraint.a.a.e$a */
    public enum C0055a {
        RELAXED,
        STRICT
    }

    /* renamed from: android.support.constraint.a.a.e$b */
    public enum C0056b {
        NONE,
        STRONG,
        WEAK
    }

    /* renamed from: android.support.constraint.a.a.e$c */
    public enum C0057c {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C0058e(C0061f c0061f, C0057c c0057c) {
        this.f218a = c0061f;
        this.f219b = c0057c;
    }

    /* renamed from: a */
    public C0515m m150a() {
        return this.f224g;
    }

    /* renamed from: a */
    public void m151a(C0070c c0070c) {
        if (this.f223f == null) {
            this.f223f = new C0077h(C0076a.UNRESTRICTED, null);
        } else {
            this.f223f.m330b();
        }
    }

    /* renamed from: a */
    public boolean m152a(C0058e c0058e) {
        boolean z = false;
        if (c0058e == null) {
            return false;
        }
        C0057c d = c0058e.m157d();
        if (d == this.f219b) {
            return this.f219b != C0057c.BASELINE || (c0058e.m156c().m249z() && m156c().m249z());
        } else {
            boolean z2;
            switch (this.f219b) {
                case CENTER:
                    if (!(d == C0057c.BASELINE || d == C0057c.CENTER_X || d == C0057c.CENTER_Y)) {
                        z = true;
                    }
                    return z;
                case LEFT:
                case RIGHT:
                    if (d != C0057c.LEFT) {
                        if (d != C0057c.RIGHT) {
                            z2 = false;
                            if (c0058e.m156c() instanceof C0513i) {
                                if (!z2) {
                                    if (d == C0057c.CENTER_X) {
                                        z2 = false;
                                    }
                                }
                                z2 = true;
                            }
                            return z2;
                        }
                    }
                    z2 = true;
                    if (c0058e.m156c() instanceof C0513i) {
                        if (z2) {
                            if (d == C0057c.CENTER_X) {
                                z2 = false;
                            }
                        }
                        z2 = true;
                    }
                    return z2;
                case TOP:
                case BOTTOM:
                    if (d != C0057c.TOP) {
                        if (d != C0057c.BOTTOM) {
                            z2 = false;
                            if (c0058e.m156c() instanceof C0513i) {
                                if (!z2) {
                                    if (d == C0057c.CENTER_Y) {
                                        z2 = false;
                                    }
                                }
                                z2 = true;
                            }
                            return z2;
                        }
                    }
                    z2 = true;
                    if (c0058e.m156c() instanceof C0513i) {
                        if (z2) {
                            if (d == C0057c.CENTER_Y) {
                                z2 = false;
                            }
                        }
                        z2 = true;
                    }
                    return z2;
                case BASELINE:
                case CENTER_X:
                case CENTER_Y:
                case NONE:
                    return false;
                default:
                    throw new AssertionError(this.f219b.name());
            }
        }
    }

    /* renamed from: a */
    public boolean m153a(C0058e c0058e, int i, int i2, C0056b c0056b, int i3, boolean z) {
        if (c0058e == null) {
            this.f220c = null;
            this.f221d = 0;
            this.f222e = -1;
            this.f225h = C0056b.NONE;
            this.f227j = 2;
            return true;
        } else if (!z && !m152a(c0058e)) {
            return false;
        } else {
            this.f220c = c0058e;
            if (i > 0) {
                this.f221d = i;
            } else {
                this.f221d = 0;
            }
            this.f222e = i2;
            this.f225h = c0056b;
            this.f227j = i3;
            return true;
        }
    }

    /* renamed from: a */
    public boolean m154a(C0058e c0058e, int i, C0056b c0056b, int i2) {
        return m153a(c0058e, i, -1, c0056b, i2, false);
    }

    /* renamed from: b */
    public C0077h m155b() {
        return this.f223f;
    }

    /* renamed from: c */
    public C0061f m156c() {
        return this.f218a;
    }

    /* renamed from: d */
    public C0057c m157d() {
        return this.f219b;
    }

    /* renamed from: e */
    public int m158e() {
        return this.f218a.m226l() == 8 ? 0 : (this.f222e <= -1 || this.f220c == null || this.f220c.f218a.m226l() != 8) ? this.f221d : this.f222e;
    }

    /* renamed from: f */
    public C0056b m159f() {
        return this.f225h;
    }

    /* renamed from: g */
    public C0058e m160g() {
        return this.f220c;
    }

    /* renamed from: h */
    public int m161h() {
        return this.f227j;
    }

    /* renamed from: i */
    public void m162i() {
        this.f220c = null;
        this.f221d = 0;
        this.f222e = -1;
        this.f225h = C0056b.STRONG;
        this.f227j = 0;
        this.f226i = C0055a.RELAXED;
        this.f224g.mo21b();
    }

    /* renamed from: j */
    public boolean m163j() {
        return this.f220c != null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f218a.m228m());
        stringBuilder.append(":");
        stringBuilder.append(this.f219b.toString());
        return stringBuilder.toString();
    }
}
