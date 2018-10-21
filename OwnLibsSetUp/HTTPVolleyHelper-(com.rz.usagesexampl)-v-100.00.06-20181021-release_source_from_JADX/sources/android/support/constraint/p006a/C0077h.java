package android.support.constraint.p006a;

import java.util.Arrays;

/* renamed from: android.support.constraint.a.h */
public class C0077h {
    /* renamed from: j */
    private static int f380j = 1;
    /* renamed from: k */
    private static int f381k = 1;
    /* renamed from: l */
    private static int f382l = 1;
    /* renamed from: m */
    private static int f383m = 1;
    /* renamed from: n */
    private static int f384n = 1;
    /* renamed from: a */
    public int f385a = -1;
    /* renamed from: b */
    int f386b = -1;
    /* renamed from: c */
    public int f387c = 0;
    /* renamed from: d */
    public float f388d;
    /* renamed from: e */
    float[] f389e = new float[7];
    /* renamed from: f */
    C0076a f390f;
    /* renamed from: g */
    C0518b[] f391g = new C0518b[8];
    /* renamed from: h */
    int f392h = 0;
    /* renamed from: i */
    public int f393i = 0;
    /* renamed from: o */
    private String f394o;

    /* renamed from: android.support.constraint.a.h$a */
    public enum C0076a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C0077h(C0076a c0076a, String str) {
        this.f390f = c0076a;
    }

    /* renamed from: a */
    static void m327a() {
        f381k++;
    }

    /* renamed from: a */
    public final void m328a(C0518b c0518b) {
        int i = 0;
        while (i < this.f392h) {
            if (this.f391g[i] != c0518b) {
                i++;
            } else {
                return;
            }
        }
        if (this.f392h >= this.f391g.length) {
            this.f391g = (C0518b[]) Arrays.copyOf(this.f391g, this.f391g.length * 2);
        }
        this.f391g[this.f392h] = c0518b;
        this.f392h++;
    }

    /* renamed from: a */
    public void m329a(C0076a c0076a, String str) {
        this.f390f = c0076a;
    }

    /* renamed from: b */
    public void m330b() {
        this.f394o = null;
        this.f390f = C0076a.UNKNOWN;
        this.f387c = 0;
        this.f385a = -1;
        this.f386b = -1;
        this.f388d = 0.0f;
        this.f392h = 0;
        this.f393i = 0;
    }

    /* renamed from: b */
    public final void m331b(C0518b c0518b) {
        int i = this.f392h;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f391g[i2] == c0518b) {
                for (int i3 = 0; i3 < (i - i2) - 1; i3++) {
                    int i4 = i2 + i3;
                    this.f391g[i4] = this.f391g[i4 + 1];
                }
                this.f392h--;
                return;
            }
        }
    }

    /* renamed from: c */
    public final void m332c(C0518b c0518b) {
        int i = this.f392h;
        for (int i2 = 0; i2 < i; i2++) {
            this.f391g[i2].f1813d.m279a(this.f391g[i2], c0518b, false);
        }
        this.f392h = 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.f394o);
        return stringBuilder.toString();
    }
}
