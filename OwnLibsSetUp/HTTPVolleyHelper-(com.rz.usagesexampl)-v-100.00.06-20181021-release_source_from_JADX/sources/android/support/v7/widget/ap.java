package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.app.C0287a.C0286c;
import android.support.v7.p020a.C0270a.C0260a;
import android.support.v7.view.C0306a;
import android.support.v7.widget.aj.C0366a;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class ap extends HorizontalScrollView implements OnItemSelectedListener {
    /* renamed from: j */
    private static final Interpolator f1315j = new DecelerateInterpolator();
    /* renamed from: a */
    Runnable f1316a;
    /* renamed from: b */
    aj f1317b;
    /* renamed from: c */
    int f1318c;
    /* renamed from: d */
    int f1319d;
    /* renamed from: e */
    private C0376b f1320e;
    /* renamed from: f */
    private Spinner f1321f;
    /* renamed from: g */
    private boolean f1322g;
    /* renamed from: h */
    private int f1323h;
    /* renamed from: i */
    private int f1324i;

    /* renamed from: android.support.v7.widget.ap$a */
    private class C0375a extends BaseAdapter {
        /* renamed from: a */
        final /* synthetic */ ap f1307a;

        C0375a(ap apVar) {
            this.f1307a = apVar;
        }

        public int getCount() {
            return this.f1307a.f1317b.getChildCount();
        }

        public Object getItem(int i) {
            return ((C0377c) this.f1307a.f1317b.getChildAt(i)).m1459b();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return this.f1307a.m1464a((C0286c) getItem(i), true);
            }
            ((C0377c) view).m1458a((C0286c) getItem(i));
            return view;
        }
    }

    /* renamed from: android.support.v7.widget.ap$b */
    private class C0376b implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ ap f1308a;

        C0376b(ap apVar) {
            this.f1308a = apVar;
        }

        public void onClick(View view) {
            ((C0377c) view).m1459b().m1046d();
            int childCount = this.f1308a.f1317b.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f1308a.f1317b.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* renamed from: android.support.v7.widget.ap$c */
    private class C0377c extends LinearLayout {
        /* renamed from: a */
        final /* synthetic */ ap f1309a;
        /* renamed from: b */
        private final int[] f1310b = new int[]{16842964};
        /* renamed from: c */
        private C0286c f1311c;
        /* renamed from: d */
        private TextView f1312d;
        /* renamed from: e */
        private ImageView f1313e;
        /* renamed from: f */
        private View f1314f;

        public C0377c(ap apVar, Context context, C0286c c0286c, boolean z) {
            this.f1309a = apVar;
            super(context, null, C0260a.actionBarTabStyle);
            this.f1311c = c0286c;
            aw a = aw.m1478a(context, null, this.f1310b, C0260a.actionBarTabStyle, 0);
            if (a.m1496g(0)) {
                setBackgroundDrawable(a.m1482a(0));
            }
            a.m1483a();
            if (z) {
                setGravity(8388627);
            }
            m1457a();
        }

        /* renamed from: a */
        public void m1457a() {
            C0286c c0286c = this.f1311c;
            View c = c0286c.m1045c();
            CharSequence charSequence = null;
            if (c != null) {
                C0377c parent = c.getParent();
                if (parent != this) {
                    if (parent != null) {
                        parent.removeView(c);
                    }
                    addView(c);
                }
                this.f1314f = c;
                if (this.f1312d != null) {
                    this.f1312d.setVisibility(8);
                }
                if (this.f1313e != null) {
                    this.f1313e.setVisibility(8);
                    this.f1313e.setImageDrawable(null);
                    return;
                }
                return;
            }
            if (this.f1314f != null) {
                removeView(this.f1314f);
                this.f1314f = null;
            }
            Drawable a = c0286c.m1043a();
            CharSequence b = c0286c.m1044b();
            if (a != null) {
                if (this.f1313e == null) {
                    View c0632q = new C0632q(getContext());
                    LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    c0632q.setLayoutParams(layoutParams);
                    addView(c0632q, 0);
                    this.f1313e = c0632q;
                }
                this.f1313e.setImageDrawable(a);
                this.f1313e.setVisibility(0);
            } else if (this.f1313e != null) {
                this.f1313e.setVisibility(8);
                this.f1313e.setImageDrawable(null);
            }
            int isEmpty = TextUtils.isEmpty(b) ^ 1;
            if (isEmpty != 0) {
                if (this.f1312d == null) {
                    View abVar = new ab(getContext(), null, C0260a.actionBarTabTextStyle);
                    abVar.setEllipsize(TruncateAt.END);
                    LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    abVar.setLayoutParams(layoutParams2);
                    addView(abVar);
                    this.f1312d = abVar;
                }
                this.f1312d.setText(b);
                this.f1312d.setVisibility(0);
            } else if (this.f1312d != null) {
                this.f1312d.setVisibility(8);
                this.f1312d.setText(null);
            }
            if (this.f1313e != null) {
                this.f1313e.setContentDescription(c0286c.m1047e());
            }
            if (isEmpty == 0) {
                charSequence = c0286c.m1047e();
            }
            ay.m1497a(this, charSequence);
        }

        /* renamed from: a */
        public void m1458a(C0286c c0286c) {
            this.f1311c = c0286c;
            m1457a();
        }

        /* renamed from: b */
        public C0286c m1459b() {
            return this.f1311c;
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(C0286c.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(C0286c.class.getName());
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (this.f1309a.f1318c > 0 && getMeasuredWidth() > this.f1309a.f1318c) {
                super.onMeasure(MeasureSpec.makeMeasureSpec(this.f1309a.f1318c, 1073741824), i2);
            }
        }

        public void setSelected(boolean z) {
            Object obj = isSelected() != z ? 1 : null;
            super.setSelected(z);
            if (obj != null && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* renamed from: a */
    private boolean m1460a() {
        return this.f1321f != null && this.f1321f.getParent() == this;
    }

    /* renamed from: b */
    private void m1461b() {
        if (!m1460a()) {
            if (this.f1321f == null) {
                this.f1321f = m1463d();
            }
            removeView(this.f1317b);
            addView(this.f1321f, new LayoutParams(-2, -1));
            if (this.f1321f.getAdapter() == null) {
                this.f1321f.setAdapter(new C0375a(this));
            }
            if (this.f1316a != null) {
                removeCallbacks(this.f1316a);
                this.f1316a = null;
            }
            this.f1321f.setSelection(this.f1324i);
        }
    }

    /* renamed from: c */
    private boolean m1462c() {
        if (!m1460a()) {
            return false;
        }
        removeView(this.f1321f);
        addView(this.f1317b, new LayoutParams(-2, -1));
        setTabSelected(this.f1321f.getSelectedItemPosition());
        return false;
    }

    /* renamed from: d */
    private Spinner m1463d() {
        Spinner c0637y = new C0637y(getContext(), null, C0260a.actionDropDownStyle);
        c0637y.setLayoutParams(new C0366a(-2, -1));
        c0637y.setOnItemSelectedListener(this);
        return c0637y;
    }

    /* renamed from: a */
    C0377c m1464a(C0286c c0286c, boolean z) {
        C0377c c0377c = new C0377c(this, getContext(), c0286c, z);
        if (z) {
            c0377c.setBackgroundDrawable(null);
            c0377c.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1323h));
        } else {
            c0377c.setFocusable(true);
            if (this.f1320e == null) {
                this.f1320e = new C0376b(this);
            }
            c0377c.setOnClickListener(this.f1320e);
        }
        return c0377c;
    }

    /* renamed from: a */
    public void m1465a(int i) {
        final View childAt = this.f1317b.getChildAt(i);
        if (this.f1316a != null) {
            removeCallbacks(this.f1316a);
        }
        this.f1316a = new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ ap f1306b;

            public void run() {
                this.f1306b.smoothScrollTo(childAt.getLeft() - ((this.f1306b.getWidth() - childAt.getWidth()) / 2), 0);
                this.f1306b.f1316a = null;
            }
        };
        post(this.f1316a);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1316a != null) {
            post(this.f1316a);
        }
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0306a a = C0306a.m1140a(getContext());
        setContentHeight(a.m1145e());
        this.f1319d = a.m1147g();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f1316a != null) {
            removeCallbacks(this.f1316a);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0377c) view).m1459b().m1046d();
    }

    public void onMeasure(int i, int i2) {
        int measuredWidth;
        i2 = MeasureSpec.getMode(i);
        Object obj = 1;
        boolean z = i2 == 1073741824;
        setFillViewport(z);
        int childCount = this.f1317b.getChildCount();
        if (childCount <= 1 || !(i2 == 1073741824 || i2 == Integer.MIN_VALUE)) {
            i2 = -1;
        } else {
            if (childCount > 2) {
                this.f1318c = (int) (((float) MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f1318c = MeasureSpec.getSize(i) / 2;
            }
            i2 = Math.min(this.f1318c, this.f1319d);
        }
        this.f1318c = i2;
        i2 = MeasureSpec.makeMeasureSpec(this.f1323h, 1073741824);
        if (z || !this.f1322g) {
            obj = null;
        }
        if (obj != null) {
            this.f1317b.measure(0, i2);
            if (this.f1317b.getMeasuredWidth() > MeasureSpec.getSize(i)) {
                m1461b();
                measuredWidth = getMeasuredWidth();
                super.onMeasure(i, i2);
                i = getMeasuredWidth();
                if (z && measuredWidth != i) {
                    setTabSelected(this.f1324i);
                    return;
                }
            }
        }
        m1462c();
        measuredWidth = getMeasuredWidth();
        super.onMeasure(i, i2);
        i = getMeasuredWidth();
        if (z) {
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f1322g = z;
    }

    public void setContentHeight(int i) {
        this.f1323h = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f1324i = i;
        int childCount = this.f1317b.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f1317b.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                m1465a(i);
            }
            i2++;
        }
        if (this.f1321f != null && i >= 0) {
            this.f1321f.setSelection(i);
        }
    }
}
