package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p010b.p011a.C0155a;
import android.support.v4.widget.C0246c;
import android.support.v7.p020a.C0270a.C0269j;
import android.support.v7.p021b.p022a.C0303b;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* renamed from: android.support.v7.widget.k */
class C0392k {
    /* renamed from: a */
    private final CompoundButton f1407a;
    /* renamed from: b */
    private ColorStateList f1408b = null;
    /* renamed from: c */
    private Mode f1409c = null;
    /* renamed from: d */
    private boolean f1410d = false;
    /* renamed from: e */
    private boolean f1411e = false;
    /* renamed from: f */
    private boolean f1412f;

    C0392k(CompoundButton compoundButton) {
        this.f1407a = compoundButton;
    }

    /* renamed from: a */
    int m1546a(int i) {
        if (VERSION.SDK_INT >= 17) {
            return i;
        }
        Drawable a = C0246c.m968a(this.f1407a);
        return a != null ? i + a.getIntrinsicWidth() : i;
    }

    /* renamed from: a */
    ColorStateList m1547a() {
        return this.f1408b;
    }

    /* renamed from: a */
    void m1548a(ColorStateList colorStateList) {
        this.f1408b = colorStateList;
        this.f1410d = true;
        m1553d();
    }

    /* renamed from: a */
    void m1549a(Mode mode) {
        this.f1409c = mode;
        this.f1411e = true;
        m1553d();
    }

    /* renamed from: a */
    void m1550a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f1407a.getContext().obtainStyledAttributes(attributeSet, C0269j.CompoundButton, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(C0269j.CompoundButton_android_button)) {
                i = obtainStyledAttributes.getResourceId(C0269j.CompoundButton_android_button, 0);
                if (i != 0) {
                    this.f1407a.setButtonDrawable(C0303b.m1131b(this.f1407a.getContext(), i));
                }
            }
            if (obtainStyledAttributes.hasValue(C0269j.CompoundButton_buttonTint)) {
                C0246c.m969a(this.f1407a, obtainStyledAttributes.getColorStateList(C0269j.CompoundButton_buttonTint));
            }
            if (obtainStyledAttributes.hasValue(C0269j.CompoundButton_buttonTintMode)) {
                C0246c.m970a(this.f1407a, af.m1398a(obtainStyledAttributes.getInt(C0269j.CompoundButton_buttonTintMode, -1), null));
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    Mode m1551b() {
        return this.f1409c;
    }

    /* renamed from: c */
    void m1552c() {
        if (this.f1412f) {
            this.f1412f = false;
            return;
        }
        this.f1412f = true;
        m1553d();
    }

    /* renamed from: d */
    void m1553d() {
        Drawable a = C0246c.m968a(this.f1407a);
        if (a == null) {
            return;
        }
        if (this.f1410d || this.f1411e) {
            a = C0155a.m572f(a).mutate();
            if (this.f1410d) {
                C0155a.m562a(a, this.f1408b);
            }
            if (this.f1411e) {
                C0155a.m565a(a, this.f1409c);
            }
            if (a.isStateful()) {
                a.setState(this.f1407a.getDrawableState());
            }
            this.f1407a.setButtonDrawable(a);
        }
    }
}
