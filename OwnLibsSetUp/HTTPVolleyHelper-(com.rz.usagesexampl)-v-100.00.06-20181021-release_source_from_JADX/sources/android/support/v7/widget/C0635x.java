package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.p010b.p011a.C0155a;
import android.support.v4.p017g.C0227p;
import android.support.v7.p020a.C0270a.C0269j;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: android.support.v7.widget.x */
class C0635x extends C0398t {
    /* renamed from: a */
    private final SeekBar f2410a;
    /* renamed from: b */
    private Drawable f2411b;
    /* renamed from: c */
    private ColorStateList f2412c = null;
    /* renamed from: d */
    private Mode f2413d = null;
    /* renamed from: e */
    private boolean f2414e = false;
    /* renamed from: f */
    private boolean f2415f = false;

    C0635x(SeekBar seekBar) {
        super(seekBar);
        this.f2410a = seekBar;
    }

    /* renamed from: d */
    private void m2943d() {
        if (this.f2411b == null) {
            return;
        }
        if (this.f2414e || this.f2415f) {
            this.f2411b = C0155a.m572f(this.f2411b.mutate());
            if (this.f2414e) {
                C0155a.m562a(this.f2411b, this.f2412c);
            }
            if (this.f2415f) {
                C0155a.m565a(this.f2411b, this.f2413d);
            }
            if (this.f2411b.isStateful()) {
                this.f2411b.setState(this.f2410a.getDrawableState());
            }
        }
    }

    /* renamed from: a */
    void m2944a(Canvas canvas) {
        if (this.f2411b != null) {
            int max = this.f2410a.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.f2411b.getIntrinsicWidth();
                int intrinsicHeight = this.f2411b.getIntrinsicHeight();
                intrinsicWidth = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f2411b.setBounds(-intrinsicWidth, -i, intrinsicWidth, i);
                float width = ((float) ((this.f2410a.getWidth() - this.f2410a.getPaddingLeft()) - this.f2410a.getPaddingRight())) / ((float) max);
                intrinsicWidth = canvas.save();
                canvas.translate((float) this.f2410a.getPaddingLeft(), (float) (this.f2410a.getHeight() / 2));
                for (intrinsicHeight = 0; intrinsicHeight <= max; intrinsicHeight++) {
                    this.f2411b.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(intrinsicWidth);
            }
        }
    }

    /* renamed from: a */
    void mo340a(Drawable drawable) {
        if (this.f2411b != null) {
            this.f2411b.setCallback(null);
        }
        this.f2411b = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f2410a);
            C0155a.m568b(drawable, C0227p.m876b(this.f2410a));
            if (drawable.isStateful()) {
                drawable.setState(this.f2410a.getDrawableState());
            }
            m2943d();
        }
        this.f2410a.invalidate();
    }

    /* renamed from: a */
    void mo341a(AttributeSet attributeSet, int i) {
        super.mo341a(attributeSet, i);
        aw a = aw.m1478a(this.f2410a.getContext(), attributeSet, C0269j.AppCompatSeekBar, i, 0);
        Drawable b = a.m1486b(C0269j.AppCompatSeekBar_android_thumb);
        if (b != null) {
            this.f2410a.setThumb(b);
        }
        mo340a(a.m1482a(C0269j.AppCompatSeekBar_tickMark));
        if (a.m1496g(C0269j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f2413d = af.m1398a(a.m1480a(C0269j.AppCompatSeekBar_tickMarkTintMode, -1), this.f2413d);
            this.f2415f = true;
        }
        if (a.m1496g(C0269j.AppCompatSeekBar_tickMarkTint)) {
            this.f2412c = a.m1492e(C0269j.AppCompatSeekBar_tickMarkTint);
            this.f2414e = true;
        }
        a.m1483a();
        m2943d();
    }

    /* renamed from: b */
    void mo342b() {
        if (this.f2411b != null) {
            this.f2411b.jumpToCurrentState();
        }
    }

    /* renamed from: c */
    void m2948c() {
        Drawable drawable = this.f2411b;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f2410a.getDrawableState())) {
            this.f2410a.invalidateDrawable(drawable);
        }
    }
}
