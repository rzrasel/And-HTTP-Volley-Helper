package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p017g.C0227p;
import android.support.v7.p020a.C0270a.C0269j;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: android.support.v7.widget.g */
class C0390g {
    /* renamed from: a */
    private final View f1399a;
    /* renamed from: b */
    private final C0394l f1400b;
    /* renamed from: c */
    private int f1401c = -1;
    /* renamed from: d */
    private au f1402d;
    /* renamed from: e */
    private au f1403e;
    /* renamed from: f */
    private au f1404f;

    C0390g(View view) {
        this.f1399a = view;
        this.f1400b = C0394l.m1561a();
    }

    /* renamed from: b */
    private boolean m1535b(Drawable drawable) {
        if (this.f1404f == null) {
            this.f1404f = new au();
        }
        au auVar = this.f1404f;
        auVar.m1475a();
        ColorStateList i = C0227p.m883i(this.f1399a);
        if (i != null) {
            auVar.f1347d = true;
            auVar.f1344a = i;
        }
        Mode j = C0227p.m884j(this.f1399a);
        if (j != null) {
            auVar.f1346c = true;
            auVar.f1345b = j;
        }
        if (!auVar.f1347d) {
            if (!auVar.f1346c) {
                return false;
            }
        }
        C0394l.m1564a(drawable, auVar, this.f1399a.getDrawableState());
        return true;
    }

    /* renamed from: d */
    private boolean m1536d() {
        int i = VERSION.SDK_INT;
        boolean z = false;
        if (i <= 21) {
            return i == 21;
        } else {
            if (this.f1402d != null) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: a */
    ColorStateList m1537a() {
        return this.f1403e != null ? this.f1403e.f1344a : null;
    }

    /* renamed from: a */
    void m1538a(int i) {
        this.f1401c = i;
        m1544b(this.f1400b != null ? this.f1400b.m1584b(this.f1399a.getContext(), i) : null);
        m1545c();
    }

    /* renamed from: a */
    void m1539a(ColorStateList colorStateList) {
        if (this.f1403e == null) {
            this.f1403e = new au();
        }
        this.f1403e.f1344a = colorStateList;
        this.f1403e.f1347d = true;
        m1545c();
    }

    /* renamed from: a */
    void m1540a(Mode mode) {
        if (this.f1403e == null) {
            this.f1403e = new au();
        }
        this.f1403e.f1345b = mode;
        this.f1403e.f1346c = true;
        m1545c();
    }

    /* renamed from: a */
    void m1541a(Drawable drawable) {
        this.f1401c = -1;
        m1544b(null);
        m1545c();
    }

    /* renamed from: a */
    void m1542a(AttributeSet attributeSet, int i) {
        aw a = aw.m1478a(this.f1399a.getContext(), attributeSet, C0269j.ViewBackgroundHelper, i, 0);
        try {
            if (a.m1496g(C0269j.ViewBackgroundHelper_android_background)) {
                this.f1401c = a.m1495g(C0269j.ViewBackgroundHelper_android_background, -1);
                ColorStateList b = this.f1400b.m1584b(this.f1399a.getContext(), this.f1401c);
                if (b != null) {
                    m1544b(b);
                }
            }
            if (a.m1496g(C0269j.ViewBackgroundHelper_backgroundTint)) {
                C0227p.m868a(this.f1399a, a.m1492e(C0269j.ViewBackgroundHelper_backgroundTint));
            }
            if (a.m1496g(C0269j.ViewBackgroundHelper_backgroundTintMode)) {
                C0227p.m869a(this.f1399a, af.m1398a(a.m1480a(C0269j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
            a.m1483a();
        } catch (Throwable th) {
            a.m1483a();
        }
    }

    /* renamed from: b */
    Mode m1543b() {
        return this.f1403e != null ? this.f1403e.f1345b : null;
    }

    /* renamed from: b */
    void m1544b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1402d == null) {
                this.f1402d = new au();
            }
            this.f1402d.f1344a = colorStateList;
            this.f1402d.f1347d = true;
        } else {
            this.f1402d = null;
        }
        m1545c();
    }

    /* renamed from: c */
    void m1545c() {
        Drawable background = this.f1399a.getBackground();
        if (background != null && (!m1536d() || !m1535b(background))) {
            au auVar;
            if (this.f1403e != null) {
                auVar = this.f1403e;
            } else {
                if (this.f1402d != null) {
                    auVar = this.f1402d;
                }
            }
            C0394l.m1564a(background, auVar, this.f1399a.getDrawableState());
        }
    }
}
