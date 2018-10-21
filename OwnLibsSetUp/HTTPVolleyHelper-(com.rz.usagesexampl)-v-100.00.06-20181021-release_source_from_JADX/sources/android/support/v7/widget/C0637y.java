package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p017g.C0224o;
import android.support.v4.p017g.C0227p;
import android.support.v7.p020a.C0270a.C0260a;
import android.support.v7.p021b.p022a.C0303b;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* renamed from: android.support.v7.widget.y */
public class C0637y extends Spinner implements C0224o {
    /* renamed from: a */
    private static final int[] f2418a = new int[]{16843505};
    /* renamed from: b */
    private final C0390g f2419b;
    /* renamed from: c */
    private final Context f2420c;
    /* renamed from: d */
    private ai f2421d;
    /* renamed from: e */
    private SpinnerAdapter f2422e;
    /* renamed from: f */
    private final boolean f2423f;
    /* renamed from: g */
    private C0766b f2424g;
    /* renamed from: h */
    private int f2425h;
    /* renamed from: i */
    private final Rect f2426i;

    /* renamed from: android.support.v7.widget.y$a */
    private static class C0401a implements ListAdapter, SpinnerAdapter {
        /* renamed from: a */
        private SpinnerAdapter f1440a;
        /* renamed from: b */
        private ListAdapter f1441b;

        public C0401a(SpinnerAdapter spinnerAdapter, Theme theme) {
            this.f1440a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1441b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof as) {
                as asVar = (as) spinnerAdapter;
                if (asVar.m1471a() == null) {
                    asVar.m1472a(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1441b;
            return listAdapter != null ? listAdapter.areAllItemsEnabled() : true;
        }

        public int getCount() {
            return this.f1440a == null ? 0 : this.f1440a.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            return this.f1440a == null ? null : this.f1440a.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            return this.f1440a == null ? null : this.f1440a.getItem(i);
        }

        public long getItemId(int i) {
            return this.f1440a == null ? -1 : this.f1440a.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            return this.f1440a != null && this.f1440a.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f1441b;
            return listAdapter != null ? listAdapter.isEnabled(i) : true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            if (this.f1440a != null) {
                this.f1440a.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            if (this.f1440a != null) {
                this.f1440a.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: android.support.v7.widget.y$b */
    private class C0766b extends ak {
        /* renamed from: a */
        ListAdapter f2787a;
        /* renamed from: b */
        final /* synthetic */ C0637y f2788b;
        /* renamed from: h */
        private CharSequence f2789h;
        /* renamed from: i */
        private final Rect f2790i = new Rect();

        /* renamed from: android.support.v7.widget.y$b$2 */
        class C04032 implements OnGlobalLayoutListener {
            /* renamed from: a */
            final /* synthetic */ C0766b f1444a;

            C04032(C0766b c0766b) {
                this.f1444a = c0766b;
            }

            public void onGlobalLayout() {
                if (this.f1444a.m3654a(this.f1444a.f2788b)) {
                    this.f1444a.mo533f();
                    super.mo286a();
                    return;
                }
                this.f1444a.mo287c();
            }
        }

        public C0766b(final C0637y c0637y, Context context, AttributeSet attributeSet, int i) {
            this.f2788b = c0637y;
            super(context, attributeSet, i);
            m2865b((View) c0637y);
            m2863a(true);
            m2857a(0);
            m2860a(new OnItemClickListener(this) {
                /* renamed from: b */
                final /* synthetic */ C0766b f1443b;

                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    this.f1443b.f2788b.setSelection(i);
                    if (this.f1443b.f2788b.getOnItemClickListener() != null) {
                        this.f1443b.f2788b.performItemClick(view, i, this.f1443b.f2787a.getItemId(i));
                    }
                    this.f1443b.mo287c();
                }
            });
        }

        /* renamed from: a */
        public void mo286a() {
            boolean d = mo288d();
            mo533f();
            m2877h(2);
            super.mo286a();
            mo289e().setChoiceMode(1);
            m2879i(this.f2788b.getSelectedItemPosition());
            if (!d) {
                ViewTreeObserver viewTreeObserver = this.f2788b.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    final OnGlobalLayoutListener c04032 = new C04032(this);
                    viewTreeObserver.addOnGlobalLayoutListener(c04032);
                    m2862a(new OnDismissListener(this) {
                        /* renamed from: b */
                        final /* synthetic */ C0766b f1446b;

                        public void onDismiss() {
                            ViewTreeObserver viewTreeObserver = this.f1446b.f2788b.getViewTreeObserver();
                            if (viewTreeObserver != null) {
                                viewTreeObserver.removeGlobalOnLayoutListener(c04032);
                            }
                        }
                    });
                }
            }
        }

        /* renamed from: a */
        public void mo531a(ListAdapter listAdapter) {
            super.mo531a(listAdapter);
            this.f2787a = listAdapter;
        }

        /* renamed from: a */
        public void m3653a(CharSequence charSequence) {
            this.f2789h = charSequence;
        }

        /* renamed from: a */
        boolean m3654a(View view) {
            return C0227p.m887m(view) && view.getGlobalVisibleRect(this.f2790i);
        }

        /* renamed from: b */
        public CharSequence mo532b() {
            return this.f2789h;
        }

        /* renamed from: f */
        void mo533f() {
            int a;
            Drawable h = m2876h();
            int i = 0;
            if (h != null) {
                h.getPadding(this.f2788b.f2426i);
                i = bc.m1514a(this.f2788b) ? this.f2788b.f2426i.right : -this.f2788b.f2426i.left;
            } else {
                Rect b = this.f2788b.f2426i;
                this.f2788b.f2426i.right = 0;
                b.left = 0;
            }
            int paddingLeft = this.f2788b.getPaddingLeft();
            int paddingRight = this.f2788b.getPaddingRight();
            int width = this.f2788b.getWidth();
            if (this.f2788b.f2425h == -2) {
                a = this.f2788b.m2954a((SpinnerAdapter) this.f2787a, m2876h());
                int i2 = (this.f2788b.getContext().getResources().getDisplayMetrics().widthPixels - this.f2788b.f2426i.left) - this.f2788b.f2426i.right;
                if (a > i2) {
                    a = i2;
                }
                a = Math.max(a, (width - paddingLeft) - paddingRight);
            } else {
                a = this.f2788b.f2425h == -1 ? (width - paddingLeft) - paddingRight : this.f2788b.f2425h;
            }
            m2874g(a);
            m2868c(bc.m1514a(this.f2788b) ? i + ((width - paddingRight) - m2882l()) : i + paddingLeft);
        }
    }

    public C0637y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0260a.spinnerStyle);
    }

    public C0637y(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public C0637y(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0637y(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11, android.content.res.Resources.Theme r12) {
        /*
        r7 = this;
        r7.<init>(r8, r9, r10);
        r0 = new android.graphics.Rect;
        r0.<init>();
        r7.f2426i = r0;
        r0 = android.support.v7.p020a.C0270a.C0269j.Spinner;
        r1 = 0;
        r0 = android.support.v7.widget.aw.m1478a(r8, r9, r0, r10, r1);
        r2 = new android.support.v7.widget.g;
        r2.<init>(r7);
        r7.f2419b = r2;
        r2 = 0;
        if (r12 == 0) goto L_0x0023;
    L_0x001b:
        r3 = new android.support.v7.view.d;
        r3.<init>(r8, r12);
    L_0x0020:
        r7.f2420c = r3;
        goto L_0x003c;
    L_0x0023:
        r12 = android.support.v7.p020a.C0270a.C0269j.Spinner_popupTheme;
        r12 = r0.m1495g(r12, r1);
        if (r12 == 0) goto L_0x0031;
    L_0x002b:
        r3 = new android.support.v7.view.d;
        r3.<init>(r8, r12);
        goto L_0x0020;
    L_0x0031:
        r12 = android.os.Build.VERSION.SDK_INT;
        r3 = 23;
        if (r12 >= r3) goto L_0x0039;
    L_0x0037:
        r12 = r8;
        goto L_0x003a;
    L_0x0039:
        r12 = r2;
    L_0x003a:
        r7.f2420c = r12;
    L_0x003c:
        r12 = r7.f2420c;
        r3 = 1;
        if (r12 == 0) goto L_0x00ab;
    L_0x0041:
        r12 = -1;
        if (r11 != r12) goto L_0x0073;
    L_0x0044:
        r12 = f2418a;	 Catch:{ Exception -> 0x0060, all -> 0x005d }
        r12 = r8.obtainStyledAttributes(r9, r12, r10, r1);	 Catch:{ Exception -> 0x0060, all -> 0x005d }
        r4 = r12.hasValue(r1);	 Catch:{ Exception -> 0x005b }
        if (r4 == 0) goto L_0x0055;
    L_0x0050:
        r4 = r12.getInt(r1, r1);	 Catch:{ Exception -> 0x005b }
        r11 = r4;
    L_0x0055:
        if (r12 == 0) goto L_0x0073;
    L_0x0057:
        r12.recycle();
        goto L_0x0073;
    L_0x005b:
        r4 = move-exception;
        goto L_0x0062;
    L_0x005d:
        r8 = move-exception;
        r12 = r2;
        goto L_0x006d;
    L_0x0060:
        r4 = move-exception;
        r12 = r2;
    L_0x0062:
        r5 = "AppCompatSpinner";
        r6 = "Could not read android:spinnerMode";
        android.util.Log.i(r5, r6, r4);	 Catch:{ all -> 0x006c }
        if (r12 == 0) goto L_0x0073;
    L_0x006b:
        goto L_0x0057;
    L_0x006c:
        r8 = move-exception;
    L_0x006d:
        if (r12 == 0) goto L_0x0072;
    L_0x006f:
        r12.recycle();
    L_0x0072:
        throw r8;
    L_0x0073:
        if (r11 != r3) goto L_0x00ab;
    L_0x0075:
        r11 = new android.support.v7.widget.y$b;
        r12 = r7.f2420c;
        r11.<init>(r7, r12, r9, r10);
        r12 = r7.f2420c;
        r4 = android.support.v7.p020a.C0270a.C0269j.Spinner;
        r12 = android.support.v7.widget.aw.m1478a(r12, r9, r4, r10, r1);
        r1 = android.support.v7.p020a.C0270a.C0269j.Spinner_android_dropDownWidth;
        r4 = -2;
        r1 = r12.m1493f(r1, r4);
        r7.f2425h = r1;
        r1 = android.support.v7.p020a.C0270a.C0269j.Spinner_android_popupBackground;
        r1 = r12.m1482a(r1);
        r11.m2859a(r1);
        r1 = android.support.v7.p020a.C0270a.C0269j.Spinner_android_prompt;
        r1 = r0.m1490d(r1);
        r11.m3653a(r1);
        r12.m1483a();
        r7.f2424g = r11;
        r12 = new android.support.v7.widget.y$1;
        r12.<init>(r7, r7, r11);
        r7.f2421d = r12;
    L_0x00ab:
        r11 = android.support.v7.p020a.C0270a.C0269j.Spinner_android_entries;
        r11 = r0.m1494f(r11);
        if (r11 == 0) goto L_0x00c3;
    L_0x00b3:
        r12 = new android.widget.ArrayAdapter;
        r1 = 17367048; // 0x1090008 float:2.5162948E-38 double:8.580462E-317;
        r12.<init>(r8, r1, r11);
        r8 = android.support.v7.p020a.C0270a.C0266g.support_simple_spinner_dropdown_item;
        r12.setDropDownViewResource(r8);
        r7.setAdapter(r12);
    L_0x00c3:
        r0.m1483a();
        r7.f2423f = r3;
        r8 = r7.f2422e;
        if (r8 == 0) goto L_0x00d3;
    L_0x00cc:
        r8 = r7.f2422e;
        r7.setAdapter(r8);
        r7.f2422e = r2;
    L_0x00d3:
        r8 = r7.f2419b;
        r8.m1542a(r9, r10);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.y.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* renamed from: a */
    int m2954a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (max = Math.max(0, max - (15 - (min - max))); max < min; max++) {
            int itemViewType = spinnerAdapter.getItemViewType(max);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.f2426i);
            i2 += this.f2426i.left + this.f2426i.right;
        }
        return i2;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f2419b != null) {
            this.f2419b.m1545c();
        }
    }

    public int getDropDownHorizontalOffset() {
        return this.f2424g != null ? this.f2424g.m2880j() : VERSION.SDK_INT >= 16 ? super.getDropDownHorizontalOffset() : 0;
    }

    public int getDropDownVerticalOffset() {
        return this.f2424g != null ? this.f2424g.m2881k() : VERSION.SDK_INT >= 16 ? super.getDropDownVerticalOffset() : 0;
    }

    public int getDropDownWidth() {
        return this.f2424g != null ? this.f2425h : VERSION.SDK_INT >= 16 ? super.getDropDownWidth() : 0;
    }

    public Drawable getPopupBackground() {
        return this.f2424g != null ? this.f2424g.m2876h() : VERSION.SDK_INT >= 16 ? super.getPopupBackground() : null;
    }

    public Context getPopupContext() {
        return this.f2424g != null ? this.f2420c : VERSION.SDK_INT >= 23 ? super.getPopupContext() : null;
    }

    public CharSequence getPrompt() {
        return this.f2424g != null ? this.f2424g.mo532b() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.f2419b != null ? this.f2419b.m1537a() : null;
    }

    public Mode getSupportBackgroundTintMode() {
        return this.f2419b != null ? this.f2419b.m1543b() : null;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f2424g != null && this.f2424g.mo288d()) {
            this.f2424g.mo287c();
        }
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2424g != null && MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m2954a(getAdapter(), getBackground())), MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return (this.f2421d == null || !this.f2421d.onTouch(this, motionEvent)) ? super.onTouchEvent(motionEvent) : true;
    }

    public boolean performClick() {
        if (this.f2424g == null) {
            return super.performClick();
        }
        if (!this.f2424g.mo288d()) {
            this.f2424g.mo286a();
        }
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (this.f2423f) {
            super.setAdapter(spinnerAdapter);
            if (this.f2424g != null) {
                this.f2424g.mo531a(new C0401a(spinnerAdapter, (this.f2420c == null ? getContext() : this.f2420c).getTheme()));
            }
            return;
        }
        this.f2422e = spinnerAdapter;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f2419b != null) {
            this.f2419b.m1541a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f2419b != null) {
            this.f2419b.m1538a(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        if (this.f2424g != null) {
            this.f2424g.m2868c(i);
        } else if (VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public void setDropDownVerticalOffset(int i) {
        if (this.f2424g != null) {
            this.f2424g.m2869d(i);
        } else if (VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f2424g != null) {
            this.f2425h = i;
        } else if (VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        if (this.f2424g != null) {
            this.f2424g.m2859a(drawable);
        } else if (VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C0303b.m1131b(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        if (this.f2424g != null) {
            this.f2424g.m3653a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f2419b != null) {
            this.f2419b.m1539a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f2419b != null) {
            this.f2419b.m1540a(mode);
        }
    }
}
