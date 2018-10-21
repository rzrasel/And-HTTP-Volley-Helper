package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.p020a.C0270a.C0269j;
import android.support.v7.view.menu.C0332p.C0331a;
import android.support.v7.view.menu.C0598h.C0326b;
import android.support.v7.widget.ActionMenuView.C0343a;
import android.support.v7.widget.ab;
import android.support.v7.widget.ai;
import android.support.v7.widget.ay;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;

public class ActionMenuItemView extends ab implements C0331a, C0343a, OnClickListener {
    /* renamed from: b */
    C0601j f2693b;
    /* renamed from: c */
    C0326b f2694c;
    /* renamed from: d */
    C0317b f2695d;
    /* renamed from: e */
    private CharSequence f2696e;
    /* renamed from: f */
    private Drawable f2697f;
    /* renamed from: g */
    private ai f2698g;
    /* renamed from: h */
    private boolean f2699h;
    /* renamed from: i */
    private boolean f2700i;
    /* renamed from: j */
    private int f2701j;
    /* renamed from: k */
    private int f2702k;
    /* renamed from: l */
    private int f2703l;

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView$b */
    public static abstract class C0317b {
        /* renamed from: a */
        public abstract C0334s mo331a();
    }

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView$a */
    private class C0592a extends ai {
        /* renamed from: a */
        final /* synthetic */ ActionMenuItemView f2074a;

        public C0592a(ActionMenuItemView actionMenuItemView) {
            this.f2074a = actionMenuItemView;
            super(actionMenuItemView);
        }

        /* renamed from: a */
        public C0334s mo190a() {
            return this.f2074a.f2695d != null ? this.f2074a.f2695d.mo331a() : null;
        }

        /* renamed from: b */
        protected boolean mo191b() {
            if (this.f2074a.f2694c == null || !this.f2074a.f2694c.mo193a(this.f2074a.f2693b)) {
                return false;
            }
            C0334s a = mo190a();
            return a != null && a.mo288d();
        }
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f2699h = m3534e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0269j.ActionMenuItemView, i, 0);
        this.f2701j = obtainStyledAttributes.getDimensionPixelSize(C0269j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f2703l = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f2702k = -1;
        setSaveEnabled(false);
    }

    /* renamed from: e */
    private boolean m3534e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480 && (i < 640 || i2 < 480)) {
            if (configuration.orientation != 2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    private void m3535f() {
        int i = 1;
        int isEmpty = TextUtils.isEmpty(this.f2696e) ^ 1;
        if (this.f2697f != null) {
            if (this.f2693b.m2725m()) {
                if (!this.f2699h) {
                    if (this.f2700i) {
                    }
                }
            }
            i = 0;
        }
        isEmpty &= i;
        CharSequence charSequence = null;
        setText(isEmpty != 0 ? this.f2696e : null);
        CharSequence contentDescription = this.f2693b.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = isEmpty != 0 ? null : this.f2693b.getTitle();
        }
        setContentDescription(contentDescription);
        contentDescription = this.f2693b.getTooltipText();
        if (TextUtils.isEmpty(contentDescription)) {
            if (isEmpty == 0) {
                charSequence = this.f2693b.getTitle();
            }
            ay.m1497a(this, charSequence);
            return;
        }
        ay.m1497a(this, contentDescription);
    }

    /* renamed from: a */
    public void mo194a(C0601j c0601j, int i) {
        this.f2693b = c0601j;
        setIcon(c0601j.getIcon());
        setTitle(c0601j.m2704a((C0331a) this));
        setId(c0601j.getItemId());
        setVisibility(c0601j.isVisible() ? 0 : 8);
        setEnabled(c0601j.isEnabled());
        if (c0601j.hasSubMenu() && this.f2698g == null) {
            this.f2698g = new C0592a(this);
        }
    }

    /* renamed from: a */
    public boolean mo195a() {
        return true;
    }

    /* renamed from: b */
    public boolean m3538b() {
        return TextUtils.isEmpty(getText()) ^ 1;
    }

    /* renamed from: c */
    public boolean mo498c() {
        return m3538b() && this.f2693b.getIcon() == null;
    }

    /* renamed from: d */
    public boolean mo499d() {
        return m3538b();
    }

    public C0601j getItemData() {
        return this.f2693b;
    }

    public void onClick(View view) {
        if (this.f2694c != null) {
            this.f2694c.mo193a(this.f2693b);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2699h = m3534e();
        m3535f();
    }

    protected void onMeasure(int i, int i2) {
        boolean b = m3538b();
        if (b && this.f2702k >= 0) {
            super.setPadding(this.f2702k, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        i = MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        i = mode == Integer.MIN_VALUE ? Math.min(i, this.f2701j) : this.f2701j;
        if (mode != 1073741824 && this.f2701j > 0 && measuredWidth < i) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(i, 1073741824), i2);
        }
        if (!b && this.f2697f != null) {
            super.setPadding((getMeasuredWidth() - this.f2697f.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return (this.f2693b.hasSubMenu() && this.f2698g != null && this.f2698g.onTouch(this, motionEvent)) ? true : super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f2700i != z) {
            this.f2700i = z;
            if (this.f2693b != null) {
                this.f2693b.m2720h();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f2697f = drawable;
        if (drawable != null) {
            float f;
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > this.f2703l) {
                f = ((float) this.f2703l) / ((float) intrinsicWidth);
                intrinsicWidth = this.f2703l;
                intrinsicHeight = (int) (((float) intrinsicHeight) * f);
            }
            if (intrinsicHeight > this.f2703l) {
                f = ((float) this.f2703l) / ((float) intrinsicHeight);
                intrinsicHeight = this.f2703l;
                intrinsicWidth = (int) (((float) intrinsicWidth) * f);
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        m3535f();
    }

    public void setItemInvoker(C0326b c0326b) {
        this.f2694c = c0326b;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f2702k = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C0317b c0317b) {
        this.f2695d = c0317b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f2696e = charSequence;
        m3535f();
    }
}
