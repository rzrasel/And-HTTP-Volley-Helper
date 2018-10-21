package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.view.menu.C0598h.C0326b;
import android.support.v7.widget.aw;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public final class ExpandedMenuView extends ListView implements C0326b, C0332p, OnItemClickListener {
    /* renamed from: a */
    private static final int[] f2075a = new int[]{16842964, 16843049};
    /* renamed from: b */
    private C0598h f2076b;
    /* renamed from: c */
    private int f2077c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        aw a = aw.m1478a(context, attributeSet, f2075a, i, 0);
        if (a.m1496g(0)) {
            setBackgroundDrawable(a.m1482a(0));
        }
        if (a.m1496g(1)) {
            setDivider(a.m1482a(1));
        }
        a.m1483a();
    }

    /* renamed from: a */
    public void mo192a(C0598h c0598h) {
        this.f2076b = c0598h;
    }

    /* renamed from: a */
    public boolean mo193a(C0601j c0601j) {
        return this.f2076b.m2663a((MenuItem) c0601j, 0);
    }

    public int getWindowAnimations() {
        return this.f2077c;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo193a((C0601j) getAdapter().getItem(i));
    }
}
