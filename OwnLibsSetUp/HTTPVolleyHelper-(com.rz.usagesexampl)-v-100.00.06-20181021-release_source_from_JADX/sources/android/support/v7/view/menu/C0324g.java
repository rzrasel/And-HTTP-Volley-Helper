package android.support.v7.view.menu;

import android.support.v7.p020a.C0270a.C0266g;
import android.support.v7.view.menu.C0332p.C0331a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.g */
public class C0324g extends BaseAdapter {
    /* renamed from: a */
    static final int f1095a = C0266g.abc_popup_menu_item_layout;
    /* renamed from: b */
    C0598h f1096b;
    /* renamed from: c */
    private int f1097c = -1;
    /* renamed from: d */
    private boolean f1098d;
    /* renamed from: e */
    private final boolean f1099e;
    /* renamed from: f */
    private final LayoutInflater f1100f;

    public C0324g(C0598h c0598h, LayoutInflater layoutInflater, boolean z) {
        this.f1099e = z;
        this.f1100f = layoutInflater;
        this.f1096b = c0598h;
        m1202b();
    }

    /* renamed from: a */
    public C0598h m1199a() {
        return this.f1096b;
    }

    /* renamed from: a */
    public C0601j m1200a(int i) {
        ArrayList l = this.f1099e ? this.f1096b.m2686l() : this.f1096b.m2683i();
        if (this.f1097c >= 0 && i >= this.f1097c) {
            i++;
        }
        return (C0601j) l.get(i);
    }

    /* renamed from: a */
    public void m1201a(boolean z) {
        this.f1098d = z;
    }

    /* renamed from: b */
    void m1202b() {
        C0601j r = this.f1096b.m2692r();
        if (r != null) {
            ArrayList l = this.f1096b.m2686l();
            int size = l.size();
            for (int i = 0; i < size; i++) {
                if (((C0601j) l.get(i)) == r) {
                    this.f1097c = i;
                    return;
                }
            }
        }
        this.f1097c = -1;
    }

    public int getCount() {
        ArrayList l = this.f1099e ? this.f1096b.m2686l() : this.f1096b.m2683i();
        return this.f1097c < 0 ? l.size() : l.size() - 1;
    }

    public /* synthetic */ Object getItem(int i) {
        return m1200a(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1100f.inflate(f1095a, viewGroup, false);
        }
        C0331a c0331a = (C0331a) view;
        if (this.f1098d) {
            ((ListMenuItemView) view).setForceShowIcon(true);
        }
        c0331a.mo194a(m1200a(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        m1202b();
        super.notifyDataSetChanged();
    }
}
