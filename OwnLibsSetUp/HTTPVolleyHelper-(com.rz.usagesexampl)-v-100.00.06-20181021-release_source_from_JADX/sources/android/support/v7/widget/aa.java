package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.p020a.C0270a.C0269j;
import android.util.AttributeSet;
import android.widget.TextView;

class aa extends C0405z {
    /* renamed from: b */
    private au f2324b;
    /* renamed from: c */
    private au f2325c;

    aa(TextView textView) {
        super(textView);
    }

    /* renamed from: a */
    void mo275a() {
        super.mo275a();
        if (this.f2324b != null || this.f2325c != null) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            m1614a(compoundDrawablesRelative[0], this.f2324b);
            m1614a(compoundDrawablesRelative[2], this.f2325c);
        }
    }

    /* renamed from: a */
    void mo276a(AttributeSet attributeSet, int i) {
        super.mo276a(attributeSet, i);
        Context context = this.a.getContext();
        C0394l a = C0394l.m1561a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0269j.AppCompatTextHelper, i, 0);
        if (obtainStyledAttributes.hasValue(C0269j.AppCompatTextHelper_android_drawableStart)) {
            this.f2324b = C0405z.m1603a(context, a, obtainStyledAttributes.getResourceId(C0269j.AppCompatTextHelper_android_drawableStart, 0));
        }
        if (obtainStyledAttributes.hasValue(C0269j.AppCompatTextHelper_android_drawableEnd)) {
            this.f2325c = C0405z.m1603a(context, a, obtainStyledAttributes.getResourceId(C0269j.AppCompatTextHelper_android_drawableEnd, 0));
        }
        obtainStyledAttributes.recycle();
    }
}
