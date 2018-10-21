package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.p020a.C0270a.C0269j;
import android.support.v7.view.C0308b;
import android.support.v7.view.C0308b.C0307a;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: android.support.v7.app.a */
public abstract class C0287a {

    /* renamed from: android.support.v7.app.a$a */
    public static class C0284a extends MarginLayoutParams {
        /* renamed from: a */
        public int f963a;

        public C0284a(int i, int i2) {
            super(i, i2);
            this.f963a = 0;
            this.f963a = 8388627;
        }

        public C0284a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f963a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0269j.ActionBarLayout);
            this.f963a = obtainStyledAttributes.getInt(C0269j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C0284a(C0284a c0284a) {
            super(c0284a);
            this.f963a = 0;
            this.f963a = c0284a.f963a;
        }

        public C0284a(LayoutParams layoutParams) {
            super(layoutParams);
            this.f963a = 0;
        }
    }

    /* renamed from: android.support.v7.app.a$b */
    public interface C0285b {
        /* renamed from: a */
        void m1042a(boolean z);
    }

    @Deprecated
    /* renamed from: android.support.v7.app.a$c */
    public static abstract class C0286c {
        /* renamed from: a */
        public abstract Drawable m1043a();

        /* renamed from: b */
        public abstract CharSequence m1044b();

        /* renamed from: c */
        public abstract View m1045c();

        /* renamed from: d */
        public abstract void m1046d();

        /* renamed from: e */
        public abstract CharSequence m1047e();
    }

    /* renamed from: a */
    public abstract int mo151a();

    /* renamed from: a */
    public C0308b mo182a(C0307a c0307a) {
        return null;
    }

    /* renamed from: a */
    public void mo152a(float f) {
        if (f != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    /* renamed from: a */
    public void mo153a(Configuration configuration) {
    }

    /* renamed from: a */
    public void mo154a(CharSequence charSequence) {
    }

    /* renamed from: a */
    public void mo155a(boolean z) {
    }

    /* renamed from: a */
    public boolean mo156a(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: a */
    public boolean mo157a(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public Context mo158b() {
        return null;
    }

    /* renamed from: b */
    public void mo184b(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }

    /* renamed from: c */
    public void mo159c(boolean z) {
    }

    /* renamed from: c */
    public boolean mo160c() {
        return false;
    }

    /* renamed from: d */
    public void mo161d(boolean z) {
    }

    /* renamed from: d */
    public boolean mo162d() {
        return false;
    }

    /* renamed from: e */
    public void mo163e(boolean z) {
    }

    /* renamed from: e */
    public boolean mo164e() {
        return false;
    }

    /* renamed from: f */
    public boolean mo165f() {
        return false;
    }

    /* renamed from: g */
    void mo166g() {
    }
}
