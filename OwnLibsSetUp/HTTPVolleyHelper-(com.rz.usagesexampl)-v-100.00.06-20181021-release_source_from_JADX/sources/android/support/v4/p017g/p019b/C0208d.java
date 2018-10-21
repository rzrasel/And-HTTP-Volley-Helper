package android.support.v4.p017g.p019b;

import android.view.animation.Interpolator;

/* renamed from: android.support.v4.g.b.d */
abstract class C0208d implements Interpolator {
    /* renamed from: a */
    private final float[] f758a;
    /* renamed from: b */
    private final float f759b = (1.0f / ((float) (this.f758a.length - 1)));

    protected C0208d(float[] fArr) {
        this.f758a = fArr;
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        int min = Math.min((int) (((float) (this.f758a.length - 1)) * f), this.f758a.length - 2);
        return this.f758a[min] + (((f - (((float) min) * this.f759b)) / this.f759b) * (this.f758a[min + 1] - this.f758a[min]));
    }
}
