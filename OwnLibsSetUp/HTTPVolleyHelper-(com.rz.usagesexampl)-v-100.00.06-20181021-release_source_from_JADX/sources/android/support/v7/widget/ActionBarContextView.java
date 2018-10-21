package android.support.v7.widget;

import android.content.Context;
import android.support.v4.p017g.C0227p;
import android.support.v4.p017g.C0234s;
import android.support.v7.p020a.C0270a.C0260a;
import android.support.v7.p020a.C0270a.C0265f;
import android.support.v7.p020a.C0270a.C0266g;
import android.support.v7.p020a.C0270a.C0269j;
import android.support.v7.view.C0308b;
import android.support.v7.view.menu.C0598h;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActionBarContextView extends C0360a {
    /* renamed from: g */
    private CharSequence f2210g;
    /* renamed from: h */
    private CharSequence f2211h;
    /* renamed from: i */
    private View f2212i;
    /* renamed from: j */
    private View f2213j;
    /* renamed from: k */
    private LinearLayout f2214k;
    /* renamed from: l */
    private TextView f2215l;
    /* renamed from: m */
    private TextView f2216m;
    /* renamed from: n */
    private int f2217n;
    /* renamed from: o */
    private int f2218o;
    /* renamed from: p */
    private boolean f2219p;
    /* renamed from: q */
    private int f2220q;

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0260a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aw a = aw.m1478a(context, attributeSet, C0269j.ActionMode, i, 0);
        C0227p.m870a((View) this, a.m1482a(C0269j.ActionMode_background));
        this.f2217n = a.m1495g(C0269j.ActionMode_titleTextStyle, 0);
        this.f2218o = a.m1495g(C0269j.ActionMode_subtitleTextStyle, 0);
        this.e = a.m1493f(C0269j.ActionMode_height, 0);
        this.f2220q = a.m1495g(C0269j.ActionMode_closeItemLayout, C0266g.abc_action_mode_close_item_material);
        a.m1483a();
    }

    /* renamed from: e */
    private void m2751e() {
        if (this.f2214k == null) {
            LayoutInflater.from(getContext()).inflate(C0266g.abc_action_bar_title_item, this);
            this.f2214k = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f2215l = (TextView) this.f2214k.findViewById(C0265f.action_bar_title);
            this.f2216m = (TextView) this.f2214k.findViewById(C0265f.action_bar_subtitle);
            if (this.f2217n != 0) {
                this.f2215l.setTextAppearance(getContext(), this.f2217n);
            }
            if (this.f2218o != 0) {
                this.f2216m.setTextAppearance(getContext(), this.f2218o);
            }
        }
        this.f2215l.setText(this.f2210g);
        this.f2216m.setText(this.f2211h);
        int isEmpty = TextUtils.isEmpty(this.f2210g) ^ 1;
        int isEmpty2 = TextUtils.isEmpty(this.f2211h) ^ 1;
        int i = 8;
        this.f2216m.setVisibility(isEmpty2 != 0 ? 0 : 8);
        LinearLayout linearLayout = this.f2214k;
        if (!(isEmpty == 0 && isEmpty2 == 0)) {
            i = 0;
        }
        linearLayout.setVisibility(i);
        if (this.f2214k.getParent() == null) {
            addView(this.f2214k);
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ C0234s mo237a(int i, long j) {
        return super.mo237a(i, j);
    }

    /* renamed from: a */
    public void m2753a(final C0308b c0308b) {
        C0598h c0598h;
        LayoutParams layoutParams;
        if (this.f2212i == null) {
            this.f2212i = LayoutInflater.from(getContext()).inflate(this.f2220q, this, false);
        } else {
            if (this.f2212i.getParent() == null) {
            }
            this.f2212i.findViewById(C0265f.action_mode_close_button).setOnClickListener(new OnClickListener(this) {
                /* renamed from: b */
                final /* synthetic */ ActionBarContextView f1127b;

                public void onClick(View view) {
                    c0308b.mo176c();
                }
            });
            c0598h = (C0598h) c0308b.mo173b();
            if (this.d != null) {
                this.d.m3646f();
            }
            this.d = new C0765d(getContext());
            this.d.m3642c(true);
            layoutParams = new LayoutParams(-2, -1);
            c0598h.m2658a(this.d, this.b);
            this.c = (ActionMenuView) this.d.mo525a((ViewGroup) this);
            C0227p.m870a(this.c, null);
            addView(this.c, layoutParams);
        }
        addView(this.f2212i);
        this.f2212i.findViewById(C0265f.action_mode_close_button).setOnClickListener(/* anonymous class already generated */);
        c0598h = (C0598h) c0308b.mo173b();
        if (this.d != null) {
            this.d.m3646f();
        }
        this.d = new C0765d(getContext());
        this.d.m3642c(true);
        layoutParams = new LayoutParams(-2, -1);
        c0598h.m2658a(this.d, this.b);
        this.c = (ActionMenuView) this.d.mo525a((ViewGroup) this);
        C0227p.m870a(this.c, null);
        addView(this.c, layoutParams);
    }

    /* renamed from: a */
    public boolean mo238a() {
        return this.d != null ? this.d.m3644d() : false;
    }

    /* renamed from: b */
    public void m2755b() {
        if (this.f2212i == null) {
            m2756c();
        }
    }

    /* renamed from: c */
    public void m2756c() {
        removeAllViews();
        this.f2213j = null;
        this.c = null;
    }

    /* renamed from: d */
    public boolean m2757d() {
        return this.f2219p;
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new MarginLayoutParams(-1, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f2211h;
    }

    public CharSequence getTitle() {
        return this.f2210g;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.d != null) {
            this.d.m3645e();
            this.d.m3647g();
        }
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f2210g);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        z = bc.m1514a(this);
        int paddingRight = z ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        i2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        if (this.f2212i == null || this.f2212i.getVisibility() == 8) {
            i4 = paddingRight;
        } else {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f2212i.getLayoutParams();
            int i5 = z ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            i4 = z ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int a = C0360a.m1326a(paddingRight, i5, z);
            i4 = C0360a.m1326a(a + m1330a(this.f2212i, a, paddingTop, i2, z), i4, z);
        }
        if (!(this.f2214k == null || this.f2213j != null || this.f2214k.getVisibility() == 8)) {
            i4 += m1330a(this.f2214k, i4, paddingTop, i2, z);
        }
        int i6 = i4;
        if (this.f2213j != null) {
            m1330a(this.f2213j, i6, paddingTop, i2, z);
        }
        int paddingLeft = z ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        if (this.c != null) {
            m1330a(this.c, paddingLeft, paddingTop, i2, z ^ 1);
        }
    }

    protected void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        StringBuilder stringBuilder;
        if (MeasureSpec.getMode(i) != 1073741824) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(getClass().getSimpleName());
            stringBuilder.append(" can only be used ");
            stringBuilder.append("with android:layout_width=\"match_parent\" (or fill_parent)");
            throw new IllegalStateException(stringBuilder.toString());
        } else if (MeasureSpec.getMode(i2) != 0) {
            i = MeasureSpec.getSize(i);
            i2 = this.e > 0 ? this.e : MeasureSpec.getSize(i2);
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
            int i4 = i2 - paddingTop;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
            int i5 = 0;
            if (this.f2212i != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f2212i.getLayoutParams();
                paddingLeft = m1329a(this.f2212i, paddingLeft, makeMeasureSpec, 0) - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            if (this.c != null && this.c.getParent() == this) {
                paddingLeft = m1329a(this.c, paddingLeft, makeMeasureSpec, 0);
            }
            if (this.f2214k != null && this.f2213j == null) {
                if (this.f2219p) {
                    this.f2214k.measure(MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    makeMeasureSpec = this.f2214k.getMeasuredWidth();
                    Object obj = makeMeasureSpec <= paddingLeft ? 1 : null;
                    if (obj != null) {
                        paddingLeft -= makeMeasureSpec;
                    }
                    this.f2214k.setVisibility(obj != null ? 0 : 8);
                } else {
                    paddingLeft = m1329a(this.f2214k, paddingLeft, makeMeasureSpec, 0);
                }
            }
            if (this.f2213j != null) {
                LayoutParams layoutParams = this.f2213j.getLayoutParams();
                int i6 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (layoutParams.width >= 0) {
                    paddingLeft = Math.min(layoutParams.width, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                if (layoutParams.height >= 0) {
                    i4 = Math.min(layoutParams.height, i4);
                }
                this.f2213j.measure(MeasureSpec.makeMeasureSpec(paddingLeft, i6), MeasureSpec.makeMeasureSpec(i4, i3));
            }
            if (this.e <= 0) {
                i2 = getChildCount();
                i3 = 0;
                while (i5 < i2) {
                    paddingLeft = getChildAt(i5).getMeasuredHeight() + paddingTop;
                    if (paddingLeft > i3) {
                        i3 = paddingLeft;
                    }
                    i5++;
                }
                setMeasuredDimension(i, i3);
                return;
            }
            setMeasuredDimension(i, i2);
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(getClass().getSimpleName());
            stringBuilder.append(" can only be used ");
            stringBuilder.append("with android:layout_height=\"wrap_content\"");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setContentHeight(int i) {
        this.e = i;
    }

    public void setCustomView(View view) {
        if (this.f2213j != null) {
            removeView(this.f2213j);
        }
        this.f2213j = view;
        if (!(view == null || this.f2214k == null)) {
            removeView(this.f2214k);
            this.f2214k = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f2211h = charSequence;
        m2751e();
    }

    public void setTitle(CharSequence charSequence) {
        this.f2210g = charSequence;
        m2751e();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f2219p) {
            requestLayout();
        }
        this.f2219p = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
