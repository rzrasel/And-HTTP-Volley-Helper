package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.p017g.C0224o;
import android.support.v7.p020a.C0270a.C0260a;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.m */
public class C0630m extends EditText implements C0224o {
    /* renamed from: a */
    private final C0390g f2399a;
    /* renamed from: b */
    private final C0405z f2400b;

    public C0630m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0260a.editTextStyle);
    }

    public C0630m(Context context, AttributeSet attributeSet, int i) {
        super(at.m1473a(context), attributeSet, i);
        this.f2399a = new C0390g(this);
        this.f2399a.m1542a(attributeSet, i);
        this.f2400b = C0405z.m1604a((TextView) this);
        this.f2400b.mo276a(attributeSet, i);
        this.f2400b.mo275a();
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f2399a != null) {
            this.f2399a.m1545c();
        }
        if (this.f2400b != null) {
            this.f2400b.mo275a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.f2399a != null ? this.f2399a.m1537a() : null;
    }

    public Mode getSupportBackgroundTintMode() {
        return this.f2399a != null ? this.f2399a.m1543b() : null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0395n.m1585a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f2399a != null) {
            this.f2399a.m1541a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f2399a != null) {
            this.f2399a.m1538a(i);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f2399a != null) {
            this.f2399a.m1539a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f2399a != null) {
            this.f2399a.m1540a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f2400b != null) {
            this.f2400b.m1613a(context, i);
        }
    }
}
