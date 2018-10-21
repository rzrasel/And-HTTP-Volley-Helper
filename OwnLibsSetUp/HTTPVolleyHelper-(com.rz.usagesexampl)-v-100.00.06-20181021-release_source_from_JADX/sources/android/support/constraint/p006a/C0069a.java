package android.support.constraint.p006a;

import android.support.constraint.p006a.C0077h.C0076a;
import java.util.Arrays;

/* renamed from: android.support.constraint.a.a */
public class C0069a {
    /* renamed from: a */
    int f312a = 0;
    /* renamed from: b */
    private final C0518b f313b;
    /* renamed from: c */
    private final C0070c f314c;
    /* renamed from: d */
    private int f315d = 8;
    /* renamed from: e */
    private C0077h f316e = null;
    /* renamed from: f */
    private int[] f317f = new int[this.f315d];
    /* renamed from: g */
    private int[] f318g = new int[this.f315d];
    /* renamed from: h */
    private float[] f319h = new float[this.f315d];
    /* renamed from: i */
    private int f320i = -1;
    /* renamed from: j */
    private int f321j = -1;
    /* renamed from: k */
    private boolean f322k = false;

    C0069a(C0518b c0518b, C0070c c0070c) {
        this.f313b = c0518b;
        this.f314c = c0070c;
    }

    /* renamed from: a */
    private boolean m272a(C0077h c0077h, C0072e c0072e) {
        return c0077h.f393i <= 1;
    }

    /* renamed from: a */
    public final float m273a(C0077h c0077h, boolean z) {
        if (this.f316e == c0077h) {
            this.f316e = null;
        }
        if (this.f320i == -1) {
            return 0.0f;
        }
        int i = this.f320i;
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f312a) {
            if (this.f317f[i] == c0077h.f385a) {
                if (i == this.f320i) {
                    this.f320i = this.f318g[i];
                } else {
                    this.f318g[i3] = this.f318g[i];
                }
                if (z) {
                    c0077h.m331b(this.f313b);
                }
                c0077h.f393i--;
                this.f312a--;
                this.f317f[i] = -1;
                if (this.f322k) {
                    this.f321j = i;
                }
                return this.f319h[i];
            }
            i2++;
            i3 = i;
            i = this.f318g[i];
        }
        return 0.0f;
    }

    /* renamed from: a */
    final C0077h m274a(int i) {
        int i2 = this.f320i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f312a) {
            if (i3 == i) {
                return this.f314c.f325c[this.f317f[i2]];
            }
            i2 = this.f318g[i2];
            i3++;
        }
        return null;
    }

    /* renamed from: a */
    C0077h m275a(C0072e c0072e) {
        int i = this.f320i;
        C0077h c0077h = null;
        int i2 = 0;
        C0077h c0077h2 = null;
        float f = 0.0f;
        boolean z = false;
        float f2 = 0.0f;
        boolean z2 = false;
        while (i != -1 && i2 < this.f312a) {
            float f3 = this.f319h[i];
            C0077h c0077h3 = this.f314c.f325c[this.f317f[i]];
            if (f3 < 0.0f) {
                if (f3 > -0.001f) {
                    this.f319h[i] = 0.0f;
                }
                if (f3 != 0.0f) {
                    if (c0077h3.f390f == C0076a.UNRESTRICTED) {
                        if (c0077h != null) {
                            if (f > f3) {
                                if (!z && m272a(c0077h3, c0072e)) {
                                    f = f3;
                                    c0077h = c0077h3;
                                    z = true;
                                }
                            }
                        }
                        z = m272a(c0077h3, c0072e);
                        f = f3;
                        c0077h = c0077h3;
                    } else if (c0077h == null && f3 < 0.0f) {
                        if (c0077h2 != null) {
                            if (f2 > f3) {
                                if (!z2 && m272a(c0077h3, c0072e)) {
                                    f2 = f3;
                                    c0077h2 = c0077h3;
                                    z2 = true;
                                }
                            }
                        }
                        z2 = m272a(c0077h3, c0072e);
                        f2 = f3;
                        c0077h2 = c0077h3;
                    }
                }
                i = this.f318g[i];
                i2++;
            } else {
                if (f3 < 0.001f) {
                    this.f319h[i] = 0.0f;
                }
                if (f3 != 0.0f) {
                    if (c0077h3.f390f == C0076a.UNRESTRICTED) {
                        if (c0077h2 != null) {
                            if (f2 > f3) {
                                f2 = f3;
                                c0077h2 = c0077h3;
                                z2 = true;
                            }
                        }
                        z2 = m272a(c0077h3, c0072e);
                        f2 = f3;
                        c0077h2 = c0077h3;
                    } else {
                        if (c0077h != null) {
                            if (f > f3) {
                                f = f3;
                                c0077h = c0077h3;
                                z = true;
                            }
                        }
                        z = m272a(c0077h3, c0072e);
                        f = f3;
                        c0077h = c0077h3;
                    }
                }
                i = this.f318g[i];
                i2++;
            }
            c0077h3.m331b(this.f313b);
            f3 = 0.0f;
            if (f3 != 0.0f) {
                if (c0077h3.f390f == C0076a.UNRESTRICTED) {
                    if (c0077h != null) {
                        if (f > f3) {
                            f = f3;
                            c0077h = c0077h3;
                            z = true;
                        }
                    }
                    z = m272a(c0077h3, c0072e);
                    f = f3;
                    c0077h = c0077h3;
                } else {
                    if (c0077h2 != null) {
                        if (f2 > f3) {
                            f2 = f3;
                            c0077h2 = c0077h3;
                            z2 = true;
                        }
                    }
                    z2 = m272a(c0077h3, c0072e);
                    f2 = f3;
                    c0077h2 = c0077h3;
                }
            }
            i = this.f318g[i];
            i2++;
        }
        return c0077h != null ? c0077h : c0077h2;
    }

    /* renamed from: a */
    C0077h m276a(boolean[] zArr, C0077h c0077h) {
        int i = this.f320i;
        int i2 = 0;
        C0077h c0077h2 = null;
        float f = 0.0f;
        while (i != -1 && i2 < this.f312a) {
            if (this.f319h[i] < 0.0f) {
                C0077h c0077h3 = this.f314c.f325c[this.f317f[i]];
                if ((zArr == null || !zArr[c0077h3.f385a]) && c0077h3 != c0077h && (c0077h3.f390f == C0076a.SLACK || c0077h3.f390f == C0076a.ERROR)) {
                    float f2 = this.f319h[i];
                    if (f2 < f) {
                        c0077h2 = c0077h3;
                        f = f2;
                    }
                }
            }
            i = this.f318g[i];
            i2++;
        }
        return c0077h2;
    }

    /* renamed from: a */
    public final void m277a() {
        int i = this.f320i;
        int i2 = 0;
        while (i != -1 && i2 < this.f312a) {
            C0077h c0077h = this.f314c.f325c[this.f317f[i]];
            if (c0077h != null) {
                c0077h.m331b(this.f313b);
            }
            i = this.f318g[i];
            i2++;
        }
        this.f320i = -1;
        this.f321j = -1;
        this.f322k = false;
        this.f312a = 0;
    }

    /* renamed from: a */
    void m278a(float f) {
        int i = this.f320i;
        int i2 = 0;
        while (i != -1 && i2 < this.f312a) {
            float[] fArr = this.f319h;
            fArr[i] = fArr[i] / f;
            i = this.f318g[i];
            i2++;
        }
    }

    /* renamed from: a */
    final void m279a(C0518b c0518b, C0518b c0518b2, boolean z) {
        int i = this.f320i;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.f312a) {
                if (this.f317f[i] == c0518b2.f1810a.f385a) {
                    float f = this.f319h[i];
                    m273a(c0518b2.f1810a, z);
                    C0069a c0069a = c0518b2.f1813d;
                    int i3 = c0069a.f320i;
                    int i4 = 0;
                    while (i3 != -1 && i4 < c0069a.f312a) {
                        m282a(this.f314c.f325c[c0069a.f317f[i3]], c0069a.f319h[i3] * f, z);
                        i3 = c0069a.f318g[i3];
                        i4++;
                    }
                    c0518b.f1811b += c0518b2.f1811b * f;
                    if (z) {
                        c0518b2.f1810a.m331b(c0518b);
                    }
                    i = this.f320i;
                } else {
                    i = this.f318g[i];
                    i2++;
                }
            }
            return;
        }
    }

    /* renamed from: a */
    void m280a(C0518b c0518b, C0518b[] c0518bArr) {
        int i = this.f320i;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.f312a) {
                C0077h c0077h = this.f314c.f325c[this.f317f[i]];
                if (c0077h.f386b != -1) {
                    float f = this.f319h[i];
                    m273a(c0077h, true);
                    C0518b c0518b2 = c0518bArr[c0077h.f386b];
                    if (!c0518b2.f1814e) {
                        C0069a c0069a = c0518b2.f1813d;
                        int i3 = c0069a.f320i;
                        int i4 = 0;
                        while (i3 != -1 && i4 < c0069a.f312a) {
                            m282a(this.f314c.f325c[c0069a.f317f[i3]], c0069a.f319h[i3] * f, true);
                            i3 = c0069a.f318g[i3];
                            i4++;
                        }
                    }
                    c0518b.f1811b += c0518b2.f1811b * f;
                    c0518b2.f1810a.m331b(c0518b);
                    i = this.f320i;
                } else {
                    i = this.f318g[i];
                    i2++;
                }
            }
            return;
        }
    }

    /* renamed from: a */
    public final void m281a(C0077h c0077h, float f) {
        if (f == 0.0f) {
            m273a(c0077h, true);
        } else if (this.f320i == -1) {
            this.f320i = 0;
            this.f319h[this.f320i] = f;
            this.f317f[this.f320i] = c0077h.f385a;
            this.f318g[this.f320i] = -1;
            c0077h.f393i++;
            c0077h.m328a(this.f313b);
            this.f312a++;
            if (!this.f322k) {
                this.f321j++;
                if (this.f321j >= this.f317f.length) {
                    this.f322k = true;
                    this.f321j = this.f317f.length - 1;
                }
            }
        } else {
            int i = this.f320i;
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.f312a) {
                if (this.f317f[i] == c0077h.f385a) {
                    this.f319h[i] = f;
                    return;
                }
                if (this.f317f[i] < c0077h.f385a) {
                    i3 = i;
                }
                i = this.f318g[i];
                i2++;
            }
            i = this.f321j + 1;
            if (this.f322k) {
                i = this.f317f[this.f321j] == -1 ? this.f321j : this.f317f.length;
            }
            if (i >= this.f317f.length && this.f312a < this.f317f.length) {
                for (i2 = 0; i2 < this.f317f.length; i2++) {
                    if (this.f317f[i2] == -1) {
                        i = i2;
                        break;
                    }
                }
            }
            if (i >= this.f317f.length) {
                i = this.f317f.length;
                this.f315d *= 2;
                this.f322k = false;
                this.f321j = i - 1;
                this.f319h = Arrays.copyOf(this.f319h, this.f315d);
                this.f317f = Arrays.copyOf(this.f317f, this.f315d);
                this.f318g = Arrays.copyOf(this.f318g, this.f315d);
            }
            this.f317f[i] = c0077h.f385a;
            this.f319h[i] = f;
            if (i3 != -1) {
                this.f318g[i] = this.f318g[i3];
                this.f318g[i3] = i;
            } else {
                this.f318g[i] = this.f320i;
                this.f320i = i;
            }
            c0077h.f393i++;
            c0077h.m328a(this.f313b);
            this.f312a++;
            if (!this.f322k) {
                this.f321j++;
            }
            if (this.f312a >= this.f317f.length) {
                this.f322k = true;
            }
            if (this.f321j >= this.f317f.length) {
                this.f322k = true;
                this.f321j = this.f317f.length - 1;
            }
        }
    }

    /* renamed from: a */
    final void m282a(C0077h c0077h, float f, boolean z) {
        if (f != 0.0f) {
            if (this.f320i == -1) {
                this.f320i = 0;
                this.f319h[this.f320i] = f;
                this.f317f[this.f320i] = c0077h.f385a;
                this.f318g[this.f320i] = -1;
                c0077h.f393i++;
                c0077h.m328a(this.f313b);
                this.f312a++;
                if (!this.f322k) {
                    this.f321j++;
                    if (this.f321j >= this.f317f.length) {
                        this.f322k = true;
                        this.f321j = this.f317f.length - 1;
                    }
                }
                return;
            }
            int i = this.f320i;
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.f312a) {
                if (this.f317f[i] == c0077h.f385a) {
                    float[] fArr = this.f319h;
                    fArr[i] = fArr[i] + f;
                    if (this.f319h[i] == 0.0f) {
                        if (i == this.f320i) {
                            this.f320i = this.f318g[i];
                        } else {
                            this.f318g[i3] = this.f318g[i];
                        }
                        if (z) {
                            c0077h.m331b(this.f313b);
                        }
                        if (this.f322k) {
                            this.f321j = i;
                        }
                        c0077h.f393i--;
                        this.f312a--;
                    }
                    return;
                }
                if (this.f317f[i] < c0077h.f385a) {
                    i3 = i;
                }
                i = this.f318g[i];
                i2++;
            }
            int i4 = this.f321j + 1;
            if (this.f322k) {
                i4 = this.f317f[this.f321j] == -1 ? this.f321j : this.f317f.length;
            }
            if (i4 >= this.f317f.length && this.f312a < this.f317f.length) {
                for (int i5 = 0; i5 < this.f317f.length; i5++) {
                    if (this.f317f[i5] == -1) {
                        i4 = i5;
                        break;
                    }
                }
            }
            if (i4 >= this.f317f.length) {
                i4 = this.f317f.length;
                this.f315d *= 2;
                this.f322k = false;
                this.f321j = i4 - 1;
                this.f319h = Arrays.copyOf(this.f319h, this.f315d);
                this.f317f = Arrays.copyOf(this.f317f, this.f315d);
                this.f318g = Arrays.copyOf(this.f318g, this.f315d);
            }
            this.f317f[i4] = c0077h.f385a;
            this.f319h[i4] = f;
            if (i3 != -1) {
                this.f318g[i4] = this.f318g[i3];
                this.f318g[i3] = i4;
            } else {
                this.f318g[i4] = this.f320i;
                this.f320i = i4;
            }
            c0077h.f393i++;
            c0077h.m328a(this.f313b);
            this.f312a++;
            if (!this.f322k) {
                this.f321j++;
            }
            if (this.f321j >= this.f317f.length) {
                this.f322k = true;
                this.f321j = this.f317f.length - 1;
            }
        }
    }

    /* renamed from: a */
    final boolean m283a(C0077h c0077h) {
        if (this.f320i == -1) {
            return false;
        }
        int i = this.f320i;
        int i2 = 0;
        while (i != -1 && i2 < this.f312a) {
            if (this.f317f[i] == c0077h.f385a) {
                return true;
            }
            i = this.f318g[i];
            i2++;
        }
        return false;
    }

    /* renamed from: b */
    final float m284b(int i) {
        int i2 = this.f320i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f312a) {
            if (i3 == i) {
                return this.f319h[i2];
            }
            i2 = this.f318g[i2];
            i3++;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final float m285b(C0077h c0077h) {
        int i = this.f320i;
        int i2 = 0;
        while (i != -1 && i2 < this.f312a) {
            if (this.f317f[i] == c0077h.f385a) {
                return this.f319h[i];
            }
            i = this.f318g[i];
            i2++;
        }
        return 0.0f;
    }

    /* renamed from: b */
    void m286b() {
        int i = this.f320i;
        int i2 = 0;
        while (i != -1 && i2 < this.f312a) {
            float[] fArr = this.f319h;
            fArr[i] = fArr[i] * -1.0f;
            i = this.f318g[i];
            i2++;
        }
    }

    public String toString() {
        String str = "";
        int i = this.f320i;
        int i2 = 0;
        while (i != -1 && i2 < this.f312a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" -> ");
            str = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(this.f319h[i]);
            stringBuilder.append(" : ");
            str = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(this.f314c.f325c[this.f317f[i]]);
            str = stringBuilder.toString();
            i = this.f318g[i];
            i2++;
        }
        return str;
    }
}
