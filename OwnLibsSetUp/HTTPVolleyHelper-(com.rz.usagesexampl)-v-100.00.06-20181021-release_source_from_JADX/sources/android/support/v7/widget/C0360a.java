package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v4.p017g.C0227p;
import android.support.v4.p017g.C0234s;
import android.support.v4.p017g.C0235t;
import android.support.v7.p020a.C0270a.C0260a;
import android.support.v7.p020a.C0270a.C0269j;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

/* renamed from: android.support.v7.widget.a */
abstract class C0360a extends ViewGroup {
    /* renamed from: a */
    protected final C0615a f1224a;
    /* renamed from: b */
    protected final Context f1225b;
    /* renamed from: c */
    protected ActionMenuView f1226c;
    /* renamed from: d */
    protected C0765d f1227d;
    /* renamed from: e */
    protected int f1228e;
    /* renamed from: f */
    protected C0234s f1229f;
    /* renamed from: g */
    private boolean f1230g;
    /* renamed from: h */
    private boolean f1231h;

    /* renamed from: android.support.v7.widget.a$a */
    protected class C0615a implements C0235t {
        /* renamed from: a */
        int f2321a;
        /* renamed from: b */
        final /* synthetic */ C0360a f2322b;
        /* renamed from: c */
        private boolean f2323c = false;

        protected C0615a(C0360a c0360a) {
            this.f2322b = c0360a;
        }

        /* renamed from: a */
        public C0615a m2844a(C0234s c0234s, int i) {
            this.f2322b.f1229f = c0234s;
            this.f2321a = i;
            return this;
        }

        /* renamed from: a */
        public void mo99a(View view) {
            super.setVisibility(0);
            this.f2323c = false;
        }

        /* renamed from: b */
        public void mo100b(View view) {
            if (!this.f2323c) {
                this.f2322b.f1229f = null;
                super.setVisibility(this.f2321a);
            }
        }

        /* renamed from: c */
        public void mo101c(View view) {
            this.f2323c = true;
        }
    }

    C0360a(Context context) {
        this(context, null);
    }

    C0360a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    C0360a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1224a = new C0615a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0260a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1225b = context;
        } else {
            this.f1225b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* renamed from: a */
    protected static int m1326a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* renamed from: a */
    protected int m1329a(View view, int i, int i2, int i3) {
        view.measure(MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* renamed from: a */
    protected int m1330a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        i2 += (i3 - measuredHeight) / 2;
        if (z) {
            view.layout(i - measuredWidth, i2, i, measuredHeight + i2);
        } else {
            view.layout(i, i2, i + measuredWidth, measuredHeight + i2);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: a */
    public C0234s mo237a(int i, long j) {
        C0234s a;
        if (this.f1229f != null) {
            this.f1229f.m914b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            a = C0227p.m878d(this).m907a(1.0f);
        } else {
            a = C0227p.m878d(this).m907a(0.0f);
        }
        a.m908a(j);
        a.m909a(this.f1224a.m2844a(a, i));
        return a;
    }

    /* renamed from: a */
    public boolean mo238a() {
        return this.f1227d != null ? this.f1227d.m3644d() : false;
    }

    public int getAnimatedVisibility() {
        return this.f1229f != null ? this.f1224a.f2321a : getVisibility();
    }

    public int getContentHeight() {
        return this.f1228e;
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C0269j.ActionBar, C0260a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C0269j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        if (this.f1227d != null) {
            this.f1227d.m3630a(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1231h = false;
        }
        if (!this.f1231h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1231h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1231h = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1230g = false;
        }
        if (!this.f1230g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1230g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1230g = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f1228e = i;
        requestLayout();
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            if (this.f1229f != null) {
                this.f1229f.m914b();
            }
            super.setVisibility(i);
        }
    }
}
