package android.support.v4.p010b;

import android.graphics.Color;

/* renamed from: android.support.v4.b.a */
public final class C0159a {
    /* renamed from: a */
    private static final ThreadLocal<double[]> f638a = new ThreadLocal();

    /* renamed from: a */
    public static int m577a(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int c = C0159a.m580c(alpha2, alpha);
        return Color.argb(c, C0159a.m578a(Color.red(i), alpha2, Color.red(i2), alpha, c), C0159a.m578a(Color.green(i), alpha2, Color.green(i2), alpha, c), C0159a.m578a(Color.blue(i), alpha2, Color.blue(i2), alpha, c));
    }

    /* renamed from: a */
    private static int m578a(int i, int i2, int i3, int i4, int i5) {
        return i5 == 0 ? 0 : (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    /* renamed from: b */
    public static int m579b(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    /* renamed from: c */
    private static int m580c(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }
}
