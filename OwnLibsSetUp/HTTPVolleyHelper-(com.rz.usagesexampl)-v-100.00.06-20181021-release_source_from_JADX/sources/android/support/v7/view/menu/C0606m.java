package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;

/* renamed from: android.support.v7.view.menu.m */
abstract class C0606m implements C0330o, C0334s, OnItemClickListener {
    /* renamed from: a */
    private Rect f2209a;

    C0606m() {
    }

    /* renamed from: a */
    protected static int m2734a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int i2 = 0;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        ViewGroup viewGroup2 = viewGroup;
        View view = null;
        int i3 = 0;
        int i4 = 0;
        while (i2 < count) {
            int itemViewType = listAdapter.getItemViewType(i2);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup2 == null) {
                viewGroup2 = new FrameLayout(context);
            }
            view = listAdapter.getView(i2, view, viewGroup2);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            itemViewType = view.getMeasuredWidth();
            if (itemViewType >= i) {
                return i;
            }
            if (itemViewType > i4) {
                i4 = itemViewType;
            }
            i2++;
        }
        return i4;
    }

    /* renamed from: a */
    protected static C0324g m2735a(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0324g) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0324g) listAdapter;
    }

    /* renamed from: b */
    protected static boolean m2736b(C0598h c0598h) {
        int size = c0598h.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0598h.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract void mo500a(int i);

    /* renamed from: a */
    public void mo220a(Context context, C0598h c0598h) {
    }

    /* renamed from: a */
    public void m2739a(Rect rect) {
        this.f2209a = rect;
    }

    /* renamed from: a */
    public abstract void mo501a(C0598h c0598h);

    /* renamed from: a */
    public abstract void mo502a(View view);

    /* renamed from: a */
    public abstract void mo503a(OnDismissListener onDismissListener);

    /* renamed from: a */
    public abstract void mo504a(boolean z);

    /* renamed from: a */
    public boolean mo223a(C0598h c0598h, C0601j c0601j) {
        return false;
    }

    /* renamed from: b */
    public abstract void mo505b(int i);

    /* renamed from: b */
    public boolean mo227b(C0598h c0598h, C0601j c0601j) {
        return false;
    }

    /* renamed from: c */
    public abstract void mo506c(int i);

    /* renamed from: c */
    public abstract void mo507c(boolean z);

    /* renamed from: f */
    protected boolean mo508f() {
        return true;
    }

    /* renamed from: g */
    public Rect m2750g() {
        return this.f2209a;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        C0606m.m2735a(listAdapter).f1096b.m2664a((MenuItem) listAdapter.getItem(i), (C0330o) this, mo508f() ? 0 : 4);
    }
}
