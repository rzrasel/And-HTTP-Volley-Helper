package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.v4.widget.C0254g;
import android.support.v7.p020a.C0270a.C0269j;
import android.support.v7.p021b.p022a.C0303b;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: android.support.v7.widget.p */
public class C0396p {
    /* renamed from: a */
    private final ImageView f1429a;
    /* renamed from: b */
    private au f1430b;
    /* renamed from: c */
    private au f1431c;
    /* renamed from: d */
    private au f1432d;

    public C0396p(ImageView imageView) {
        this.f1429a = imageView;
    }

    /* renamed from: a */
    private boolean m1586a(Drawable drawable) {
        if (this.f1432d == null) {
            this.f1432d = new au();
        }
        au auVar = this.f1432d;
        auVar.m1475a();
        ColorStateList a = C0254g.m981a(this.f1429a);
        if (a != null) {
            auVar.f1347d = true;
            auVar.f1344a = a;
        }
        Mode b = C0254g.m984b(this.f1429a);
        if (b != null) {
            auVar.f1346c = true;
            auVar.f1345b = b;
        }
        if (!auVar.f1347d) {
            if (!auVar.f1346c) {
                return false;
            }
        }
        C0394l.m1564a(drawable, auVar, this.f1429a.getDrawableState());
        return true;
    }

    /* renamed from: e */
    private boolean m1587e() {
        int i = VERSION.SDK_INT;
        boolean z = false;
        if (i <= 21) {
            return i == 21;
        } else {
            if (this.f1430b != null) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: a */
    public void m1588a(int i) {
        if (i != 0) {
            Drawable b = C0303b.m1131b(this.f1429a.getContext(), i);
            if (b != null) {
                af.m1399a(b);
            }
            this.f1429a.setImageDrawable(b);
        } else {
            this.f1429a.setImageDrawable(null);
        }
        m1595d();
    }

    /* renamed from: a */
    void m1589a(ColorStateList colorStateList) {
        if (this.f1431c == null) {
            this.f1431c = new au();
        }
        this.f1431c.f1344a = colorStateList;
        this.f1431c.f1347d = true;
        m1595d();
    }

    /* renamed from: a */
    void m1590a(Mode mode) {
        if (this.f1431c == null) {
            this.f1431c = new au();
        }
        this.f1431c.f1345b = mode;
        this.f1431c.f1346c = true;
        m1595d();
    }

    /* renamed from: a */
    public void m1591a(AttributeSet attributeSet, int i) {
        aw a = aw.m1478a(this.f1429a.getContext(), attributeSet, C0269j.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.f1429a.getDrawable();
            if (drawable == null) {
                int g = a.m1495g(C0269j.AppCompatImageView_srcCompat, -1);
                if (g != -1) {
                    drawable = C0303b.m1131b(this.f1429a.getContext(), g);
                    if (drawable != null) {
                        this.f1429a.setImageDrawable(drawable);
                    }
                }
            }
            if (drawable != null) {
                af.m1399a(drawable);
            }
            if (a.m1496g(C0269j.AppCompatImageView_tint)) {
                C0254g.m982a(this.f1429a, a.m1492e(C0269j.AppCompatImageView_tint));
            }
            if (a.m1496g(C0269j.AppCompatImageView_tintMode)) {
                C0254g.m983a(this.f1429a, af.m1398a(a.m1480a(C0269j.AppCompatImageView_tintMode, -1), null));
            }
            a.m1483a();
        } catch (Throwable th) {
            a.m1483a();
        }
    }

    /* renamed from: a */
    boolean m1592a() {
        return VERSION.SDK_INT < 21 || !(this.f1429a.getBackground() instanceof RippleDrawable);
    }

    /* renamed from: b */
    ColorStateList m1593b() {
        return this.f1431c != null ? this.f1431c.f1344a : null;
    }

    /* renamed from: c */
    Mode m1594c() {
        return this.f1431c != null ? this.f1431c.f1345b : null;
    }

    /* renamed from: d */
    void m1595d() {
        Drawable drawable = this.f1429a.getDrawable();
        if (drawable != null) {
            af.m1399a(drawable);
        }
        if (drawable != null && (!m1587e() || !m1586a(drawable))) {
            au auVar;
            if (this.f1431c != null) {
                auVar = this.f1431c;
            } else {
                if (this.f1430b != null) {
                    auVar = this.f1430b;
                }
            }
            C0394l.m1564a(drawable, auVar, this.f1429a.getDrawableState());
        }
    }
}
