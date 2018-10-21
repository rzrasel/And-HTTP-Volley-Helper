package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.C0258l;
import android.support.v7.p020a.C0270a.C0260a;
import android.support.v7.p021b.p022a.C0303b;
import android.util.AttributeSet;
import android.widget.RadioButton;

/* renamed from: android.support.v7.widget.u */
public class C0634u extends RadioButton implements C0258l {
    /* renamed from: a */
    private final C0392k f2408a;
    /* renamed from: b */
    private final C0405z f2409b;

    public C0634u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0260a.radioButtonStyle);
    }

    public C0634u(Context context, AttributeSet attributeSet, int i) {
        super(at.m1473a(context), attributeSet, i);
        this.f2408a = new C0392k(this);
        this.f2408a.m1550a(attributeSet, i);
        this.f2409b = new C0405z(this);
        this.f2409b.mo276a(attributeSet, i);
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        return this.f2408a != null ? this.f2408a.m1546a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportButtonTintList() {
        return this.f2408a != null ? this.f2408a.m1547a() : null;
    }

    public Mode getSupportButtonTintMode() {
        return this.f2408a != null ? this.f2408a.m1551b() : null;
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C0303b.m1131b(getContext(), i));
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        if (this.f2408a != null) {
            this.f2408a.m1552c();
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        if (this.f2408a != null) {
            this.f2408a.m1548a(colorStateList);
        }
    }

    public void setSupportButtonTintMode(Mode mode) {
        if (this.f2408a != null) {
            this.f2408a.m1549a(mode);
        }
    }
}
