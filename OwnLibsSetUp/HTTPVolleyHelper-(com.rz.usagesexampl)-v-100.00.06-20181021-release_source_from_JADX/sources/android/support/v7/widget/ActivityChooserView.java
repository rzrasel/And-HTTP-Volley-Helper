package android.support.v7.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.p017g.C0212c;
import android.support.v7.p020a.C0270a.C0265f;
import android.support.v7.p020a.C0270a.C0266g;
import android.support.v7.p020a.C0270a.C0267h;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;

public class ActivityChooserView extends ViewGroup {
    /* renamed from: a */
    final C0345a f1139a;
    /* renamed from: b */
    final FrameLayout f1140b;
    /* renamed from: c */
    final FrameLayout f1141c;
    /* renamed from: d */
    C0212c f1142d;
    /* renamed from: e */
    final DataSetObserver f1143e;
    /* renamed from: f */
    OnDismissListener f1144f;
    /* renamed from: g */
    boolean f1145g;
    /* renamed from: h */
    int f1146h;
    /* renamed from: i */
    private final C0346b f1147i;
    /* renamed from: j */
    private final View f1148j;
    /* renamed from: k */
    private final ImageView f1149k;
    /* renamed from: l */
    private final int f1150l;
    /* renamed from: m */
    private final OnGlobalLayoutListener f1151m;
    /* renamed from: n */
    private ak f1152n;
    /* renamed from: o */
    private boolean f1153o;
    /* renamed from: p */
    private int f1154p;

    public static class InnerLayout extends LinearLayout {
        /* renamed from: a */
        private static final int[] f1131a = new int[]{16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            aw a = aw.m1477a(context, attributeSet, f1131a);
            setBackgroundDrawable(a.m1482a(0));
            a.m1483a();
        }
    }

    /* renamed from: android.support.v7.widget.ActivityChooserView$a */
    private class C0345a extends BaseAdapter {
        /* renamed from: a */
        final /* synthetic */ ActivityChooserView f1132a;
        /* renamed from: b */
        private C0389e f1133b;
        /* renamed from: c */
        private int f1134c;
        /* renamed from: d */
        private boolean f1135d;
        /* renamed from: e */
        private boolean f1136e;
        /* renamed from: f */
        private boolean f1137f;

        /* renamed from: a */
        public int m1251a() {
            int i = this.f1134c;
            this.f1134c = Integer.MAX_VALUE;
            int i2 = 0;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            View view = null;
            int i3 = 0;
            while (i2 < count) {
                view = getView(i2, view, null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i3 = Math.max(i3, view.getMeasuredWidth());
                i2++;
            }
            this.f1134c = i;
            return i3;
        }

        /* renamed from: a */
        public void m1252a(int i) {
            if (this.f1134c != i) {
                this.f1134c = i;
                notifyDataSetChanged();
            }
        }

        /* renamed from: a */
        public void m1253a(C0389e c0389e) {
            C0389e d = this.f1132a.f1139a.m1258d();
            if (d != null && this.f1132a.isShown()) {
                d.unregisterObserver(this.f1132a.f1143e);
            }
            this.f1133b = c0389e;
            if (c0389e != null && this.f1132a.isShown()) {
                c0389e.registerObserver(this.f1132a.f1143e);
            }
            notifyDataSetChanged();
        }

        /* renamed from: a */
        public void m1254a(boolean z) {
            if (this.f1137f != z) {
                this.f1137f = z;
                notifyDataSetChanged();
            }
        }

        /* renamed from: a */
        public void m1255a(boolean z, boolean z2) {
            if (this.f1135d != z || this.f1136e != z2) {
                this.f1135d = z;
                this.f1136e = z2;
                notifyDataSetChanged();
            }
        }

        /* renamed from: b */
        public ResolveInfo m1256b() {
            return this.f1133b.m1533b();
        }

        /* renamed from: c */
        public int m1257c() {
            return this.f1133b.m1529a();
        }

        /* renamed from: d */
        public C0389e m1258d() {
            return this.f1133b;
        }

        /* renamed from: e */
        public boolean m1259e() {
            return this.f1135d;
        }

        public int getCount() {
            int a = this.f1133b.m1529a();
            if (!(this.f1135d || this.f1133b.m1533b() == null)) {
                a--;
            }
            a = Math.min(a, this.f1134c);
            return this.f1137f ? a + 1 : a;
        }

        public Object getItem(int i) {
            switch (getItemViewType(i)) {
                case 0:
                    if (!(this.f1135d || this.f1133b.m1533b() == null)) {
                        i++;
                    }
                    return this.f1133b.m1531a(i);
                case 1:
                    return null;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            return (this.f1137f && i == getCount() - 1) ? 1 : 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            switch (getItemViewType(i)) {
                case 0:
                    if (view == null || view.getId() != C0265f.list_item) {
                        view = LayoutInflater.from(this.f1132a.getContext()).inflate(C0266g.abc_activity_chooser_view_list_item, viewGroup, false);
                    }
                    PackageManager packageManager = this.f1132a.getContext().getPackageManager();
                    ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                    ((ImageView) view.findViewById(C0265f.icon)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                    ((TextView) view.findViewById(C0265f.title)).setText(resolveInfo.loadLabel(packageManager));
                    if (this.f1135d && i == 0 && this.f1136e) {
                        view.setActivated(true);
                    } else {
                        view.setActivated(false);
                    }
                    return view;
                case 1:
                    if (view == null || view.getId() != 1) {
                        view = LayoutInflater.from(this.f1132a.getContext()).inflate(C0266g.abc_activity_chooser_view_list_item, viewGroup, false);
                        view.setId(1);
                        ((TextView) view.findViewById(C0265f.title)).setText(this.f1132a.getContext().getString(C0267h.abc_activity_chooser_view_see_all));
                    }
                    return view;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public int getViewTypeCount() {
            return 3;
        }
    }

    /* renamed from: android.support.v7.widget.ActivityChooserView$b */
    private class C0346b implements OnClickListener, OnLongClickListener, OnItemClickListener, OnDismissListener {
        /* renamed from: a */
        final /* synthetic */ ActivityChooserView f1138a;

        /* renamed from: a */
        private void m1260a() {
            if (this.f1138a.f1144f != null) {
                this.f1138a.f1144f.onDismiss();
            }
        }

        public void onClick(View view) {
            if (view == this.f1138a.f1141c) {
                this.f1138a.m1263b();
                Intent b = this.f1138a.f1139a.m1258d().m1532b(this.f1138a.f1139a.m1258d().m1530a(this.f1138a.f1139a.m1256b()));
                if (b != null) {
                    b.addFlags(524288);
                    this.f1138a.getContext().startActivity(b);
                }
            } else if (view == this.f1138a.f1140b) {
                this.f1138a.f1145g = false;
                this.f1138a.m1261a(this.f1138a.f1146h);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public void onDismiss() {
            m1260a();
            if (this.f1138a.f1142d != null) {
                this.f1138a.f1142d.m791a(false);
            }
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            switch (((C0345a) adapterView.getAdapter()).getItemViewType(i)) {
                case 0:
                    this.f1138a.m1263b();
                    if (!this.f1138a.f1145g) {
                        if (!this.f1138a.f1139a.m1259e()) {
                            i++;
                        }
                        Intent b = this.f1138a.f1139a.m1258d().m1532b(i);
                        if (b != null) {
                            b.addFlags(524288);
                            this.f1138a.getContext().startActivity(b);
                            return;
                        }
                        return;
                    } else if (i > 0) {
                        this.f1138a.f1139a.m1258d().m1534c(i);
                        return;
                    } else {
                        return;
                    }
                case 1:
                    this.f1138a.m1261a(Integer.MAX_VALUE);
                    return;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public boolean onLongClick(View view) {
            if (view == this.f1138a.f1141c) {
                if (this.f1138a.f1139a.getCount() > 0) {
                    this.f1138a.f1145g = true;
                    this.f1138a.m1261a(this.f1138a.f1146h);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    void m1261a(int i) {
        if (this.f1139a.m1258d() != null) {
            C0345a c0345a;
            getViewTreeObserver().addOnGlobalLayoutListener(this.f1151m);
            boolean z = this.f1141c.getVisibility() == 0;
            int c = this.f1139a.m1257c();
            if (i == Integer.MAX_VALUE || c <= i + z) {
                this.f1139a.m1254a(false);
                c0345a = this.f1139a;
            } else {
                this.f1139a.m1254a(true);
                c0345a = this.f1139a;
                i--;
            }
            c0345a.m1252a(i);
            ak listPopupWindow = getListPopupWindow();
            if (!listPopupWindow.mo288d()) {
                if (!this.f1145g) {
                    if (z) {
                        this.f1139a.m1255a(false, false);
                        listPopupWindow.m2874g(Math.min(this.f1139a.m1251a(), this.f1150l));
                        listPopupWindow.mo286a();
                        if (this.f1142d != null) {
                            this.f1142d.m791a(true);
                        }
                        listPopupWindow.mo289e().setContentDescription(getContext().getString(C0267h.abc_activitychooserview_choose_application));
                        listPopupWindow.mo289e().setSelector(new ColorDrawable(0));
                        return;
                    }
                }
                this.f1139a.m1255a(true, z);
                listPopupWindow.m2874g(Math.min(this.f1139a.m1251a(), this.f1150l));
                listPopupWindow.mo286a();
                if (this.f1142d != null) {
                    this.f1142d.m791a(true);
                }
                listPopupWindow.mo289e().setContentDescription(getContext().getString(C0267h.abc_activitychooserview_choose_application));
                listPopupWindow.mo289e().setSelector(new ColorDrawable(0));
                return;
            }
            return;
        }
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    /* renamed from: a */
    public boolean m1262a() {
        if (!m1264c()) {
            if (this.f1153o) {
                this.f1145g = false;
                m1261a(this.f1146h);
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean m1263b() {
        if (m1264c()) {
            getListPopupWindow().mo287c();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f1151m);
            }
        }
        return true;
    }

    /* renamed from: c */
    public boolean m1264c() {
        return getListPopupWindow().mo288d();
    }

    public C0389e getDataModel() {
        return this.f1139a.m1258d();
    }

    ak getListPopupWindow() {
        if (this.f1152n == null) {
            this.f1152n = new ak(getContext());
            this.f1152n.mo531a(this.f1139a);
            this.f1152n.m2865b((View) this);
            this.f1152n.m2863a(true);
            this.f1152n.m2860a(this.f1147i);
            this.f1152n.m2862a(this.f1147i);
        }
        return this.f1152n;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0389e d = this.f1139a.m1258d();
        if (d != null) {
            d.registerObserver(this.f1143e);
        }
        this.f1153o = true;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0389e d = this.f1139a.m1258d();
        if (d != null) {
            d.unregisterObserver(this.f1143e);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f1151m);
        }
        if (m1264c()) {
            m1263b();
        }
        this.f1153o = false;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f1148j.layout(0, 0, i3 - i, i4 - i2);
        if (!m1264c()) {
            m1263b();
        }
    }

    protected void onMeasure(int i, int i2) {
        View view = this.f1148j;
        if (this.f1141c.getVisibility() != 0) {
            i2 = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(C0389e c0389e) {
        this.f1139a.m1253a(c0389e);
        if (m1264c()) {
            m1263b();
            m1262a();
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.f1154p = i;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f1149k.setContentDescription(getContext().getString(i));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f1149k.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i) {
        this.f1146h = i;
    }

    public void setOnDismissListener(OnDismissListener onDismissListener) {
        this.f1144f = onDismissListener;
    }

    public void setProvider(C0212c c0212c) {
        this.f1142d = c0212c;
    }
}
