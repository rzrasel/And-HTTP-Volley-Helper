package com.p025a.p026a;

/* renamed from: com.a.a.e */
public class C0645e implements C0436r {
    /* renamed from: a */
    private int f2442a;
    /* renamed from: b */
    private int f2443b;
    /* renamed from: c */
    private final int f2444c;
    /* renamed from: d */
    private final float f2445d;

    public C0645e() {
        this(2500, 1, 1.0f);
    }

    public C0645e(int i, int i2, float f) {
        this.f2442a = i;
        this.f2444c = i2;
        this.f2445d = f;
    }

    /* renamed from: a */
    public int mo354a() {
        return this.f2442a;
    }

    /* renamed from: a */
    public void mo355a(C0437u c0437u) {
        this.f2443b++;
        this.f2442a += (int) (((float) this.f2442a) * this.f2445d);
        if (!m2995c()) {
            throw c0437u;
        }
    }

    /* renamed from: b */
    public int mo356b() {
        return this.f2443b;
    }

    /* renamed from: c */
    protected boolean m2995c() {
        return this.f2443b <= this.f2444c;
    }
}
