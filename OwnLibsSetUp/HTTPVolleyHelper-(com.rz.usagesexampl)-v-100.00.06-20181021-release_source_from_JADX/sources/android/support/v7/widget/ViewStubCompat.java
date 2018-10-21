package android.support.v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.v7.p020a.C0270a.C0269j;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {
    /* renamed from: a */
    private int f1219a;
    /* renamed from: b */
    private int f1220b;
    /* renamed from: c */
    private WeakReference<View> f1221c;
    /* renamed from: d */
    private LayoutInflater f1222d;
    /* renamed from: e */
    private C0359a f1223e;

    /* renamed from: android.support.v7.widget.ViewStubCompat$a */
    public interface C0359a {
        /* renamed from: a */
        void m1324a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1219a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0269j.ViewStubCompat, i, 0);
        this.f1220b = obtainStyledAttributes.getResourceId(C0269j.ViewStubCompat_android_inflatedId, -1);
        this.f1219a = obtainStyledAttributes.getResourceId(C0269j.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(C0269j.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* renamed from: a */
    public View m1325a() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f1219a != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            View inflate = (this.f1222d != null ? this.f1222d : LayoutInflater.from(getContext())).inflate(this.f1219a, viewGroup, false);
            if (this.f1220b != -1) {
                inflate.setId(this.f1220b);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f1221c = new WeakReference(inflate);
            if (this.f1223e != null) {
                this.f1223e.m1324a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    protected void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1220b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1222d;
    }

    public int getLayoutResource() {
        return this.f1219a;
    }

    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f1220b = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1222d = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f1219a = i;
    }

    public void setOnInflateListener(C0359a c0359a) {
        this.f1223e = c0359a;
    }

    public void setVisibility(int i) {
        if (this.f1221c != null) {
            View view = (View) this.f1221c.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m1325a();
        }
    }
}
