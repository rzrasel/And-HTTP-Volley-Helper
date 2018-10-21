package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.p017g.C0224o;
import android.support.v7.p020a.C0270a.C0260a;
import android.support.v7.p021b.p022a.C0303b;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.f */
public class C0624f extends AutoCompleteTextView implements C0224o {
    /* renamed from: a */
    private static final int[] f2393a = new int[]{16843126};
    /* renamed from: b */
    private final C0390g f2394b;
    /* renamed from: c */
    private final C0405z f2395c;

    public C0624f(Context context) {
        this(context, null);
    }

    public C0624f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0260a.autoCompleteTextViewStyle);
    }

    public C0624f(Context context, AttributeSet attributeSet, int i) {
        super(at.m1473a(context), attributeSet, i);
        aw a = aw.m1478a(getContext(), attributeSet, f2393a, i, 0);
        if (a.m1496g(0)) {
            setDropDownBackgroundDrawable(a.m1482a(0));
        }
        a.m1483a();
        this.f2394b = new C0390g(this);
        this.f2394b.m1542a(attributeSet, i);
        this.f2395c = C0405z.m1604a((TextView) this);
        this.f2395c.mo276a(attributeSet, i);
        this.f2395c.mo275a();
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f2394b != null) {
            this.f2394b.m1545c();
        }
        if (this.f2395c != null) {
            this.f2395c.mo275a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.f2394b != null ? this.f2394b.m1537a() : null;
    }

    public Mode getSupportBackgroundTintMode() {
        return this.f2394b != null ? this.f2394b.m1543b() : null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0395n.m1585a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f2394b != null) {
            this.f2394b.m1541a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f2394b != null) {
            this.f2394b.m1538a(i);
        }
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0303b.m1131b(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f2394b != null) {
            this.f2394b.m1539a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f2394b != null) {
            this.f2394b.m1540a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f2395c != null) {
            this.f2395c.m1613a(context, i);
        }
    }
}
