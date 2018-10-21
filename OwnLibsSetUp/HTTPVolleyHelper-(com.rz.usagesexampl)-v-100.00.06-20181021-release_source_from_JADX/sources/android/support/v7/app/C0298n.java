package android.support.v7.app;

/* renamed from: android.support.v7.app.n */
class C0298n {
    /* renamed from: d */
    private static C0298n f1004d;
    /* renamed from: a */
    public long f1005a;
    /* renamed from: b */
    public long f1006b;
    /* renamed from: c */
    public int f1007c;

    C0298n() {
    }

    /* renamed from: a */
    static C0298n m1115a() {
        if (f1004d == null) {
            f1004d = new C0298n();
        }
        return f1004d;
    }

    /* renamed from: a */
    public void m1116a(long j, double d, double d2) {
        C0298n c0298n = this;
        float f = ((float) (j - 946728000000L)) / 8.64E7f;
        float f2 = (0.01720197f * f) + 6.24006f;
        double d3 = (double) f2;
        double sin = Math.sin(d3) * 0.03341960161924362d;
        Double.isNaN(d3);
        sin = ((((sin + d3) + (Math.sin((double) (2.0f * f2)) * 3.4906598739326E-4d)) + (Math.sin((double) (f2 * 3.0f)) * 5.236000106378924E-6d)) + 1.796593063d) + 3.141592653589793d;
        double d4 = (-d2) / 360.0d;
        double d5 = (double) (f - 9.0E-4f);
        Double.isNaN(d5);
        double round = (double) (((float) Math.round(d5 - d4)) + 9.0E-4f);
        Double.isNaN(round);
        round = ((round + d4) + (Math.sin(d3) * 0.0053d)) + (Math.sin(2.0d * sin) * -0.0069d);
        d3 = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        sin = 0.01745329238474369d * d;
        d4 = (Math.sin(-0.10471975803375244d) - (Math.sin(sin) * Math.sin(d3))) / (Math.cos(sin) * Math.cos(d3));
        if (d4 >= 1.0d) {
            c0298n.f1007c = 1;
        } else if (d4 <= -1.0d) {
            c0298n.f1007c = 0;
        } else {
            double acos = (double) ((float) (Math.acos(d4) / 6.283185307179586d));
            Double.isNaN(acos);
            c0298n.f1005a = Math.round((round + acos) * 8.64E7d) + 946728000000L;
            Double.isNaN(acos);
            c0298n.f1006b = Math.round((round - acos) * 8.64E7d) + 946728000000L;
            if (c0298n.f1006b >= j || c0298n.f1005a <= j) {
                c0298n.f1007c = 1;
            } else {
                c0298n.f1007c = 0;
            }
            return;
        }
        c0298n.f1005a = -1;
        c0298n.f1006b = -1;
    }
}
