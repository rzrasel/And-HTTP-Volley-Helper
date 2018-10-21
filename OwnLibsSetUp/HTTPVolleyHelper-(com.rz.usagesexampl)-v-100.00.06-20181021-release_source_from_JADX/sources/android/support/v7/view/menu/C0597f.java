package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.p020a.C0270a.C0266g;
import android.support.v7.view.menu.C0330o.C0329a;
import android.support.v7.view.menu.C0332p.C0331a;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.f */
public class C0597f implements C0330o, OnItemClickListener {
    /* renamed from: a */
    Context f2129a;
    /* renamed from: b */
    LayoutInflater f2130b;
    /* renamed from: c */
    C0598h f2131c;
    /* renamed from: d */
    ExpandedMenuView f2132d;
    /* renamed from: e */
    int f2133e;
    /* renamed from: f */
    int f2134f;
    /* renamed from: g */
    int f2135g;
    /* renamed from: h */
    C0323a f2136h;
    /* renamed from: i */
    private C0329a f2137i;

    /* renamed from: android.support.v7.view.menu.f$a */
    private class C0323a extends BaseAdapter {
        /* renamed from: a */
        final /* synthetic */ C0597f f1093a;
        /* renamed from: b */
        private int f1094b = -1;

        public C0323a(C0597f c0597f) {
            this.f1093a = c0597f;
            m1198a();
        }

        /* renamed from: a */
        public C0601j m1197a(int i) {
            ArrayList l = this.f1093a.f2131c.m2686l();
            i += this.f1093a.f2133e;
            if (this.f1094b >= 0 && i >= this.f1094b) {
                i++;
            }
            return (C0601j) l.get(i);
        }

        /* renamed from: a */
        void m1198a() {
            C0601j r = this.f1093a.f2131c.m2692r();
            if (r != null) {
                ArrayList l = this.f1093a.f2131c.m2686l();
                int size = l.size();
                for (int i = 0; i < size; i++) {
                    if (((C0601j) l.get(i)) == r) {
                        this.f1094b = i;
                        return;
                    }
                }
            }
            this.f1094b = -1;
        }

        public int getCount() {
            int size = this.f1093a.f2131c.m2686l().size() - this.f1093a.f2133e;
            return this.f1094b < 0 ? size : size - 1;
        }

        public /* synthetic */ Object getItem(int i) {
            return m1197a(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = this.f1093a.f2130b.inflate(this.f1093a.f2135g, viewGroup, false);
            }
            ((C0331a) view).mo194a(m1197a(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            m1198a();
            super.notifyDataSetChanged();
        }
    }

    public C0597f(int i, int i2) {
        this.f2135g = i;
        this.f2134f = i2;
    }

    public C0597f(Context context, int i) {
        this(i, 0);
        this.f2129a = context;
        this.f2130b = LayoutInflater.from(this.f2129a);
    }

    /* renamed from: a */
    public C0332p m2628a(ViewGroup viewGroup) {
        if (this.f2132d == null) {
            this.f2132d = (ExpandedMenuView) this.f2130b.inflate(C0266g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f2136h == null) {
                this.f2136h = new C0323a(this);
            }
            this.f2132d.setAdapter(this.f2136h);
            this.f2132d.setOnItemClickListener(this);
        }
        return this.f2132d;
    }

    /* renamed from: a */
    public ListAdapter m2629a() {
        if (this.f2136h == null) {
            this.f2136h = new C0323a(this);
        }
        return this.f2136h;
    }

    /* renamed from: a */
    public void mo220a(Context context, C0598h c0598h) {
        if (this.f2134f != 0) {
            this.f2129a = new ContextThemeWrapper(context, this.f2134f);
        } else {
            if (this.f2129a != null) {
                this.f2129a = context;
                if (this.f2130b == null) {
                }
            }
            this.f2131c = c0598h;
            if (this.f2136h != null) {
                this.f2136h.notifyDataSetChanged();
            }
        }
        this.f2130b = LayoutInflater.from(this.f2129a);
        this.f2131c = c0598h;
        if (this.f2136h != null) {
            this.f2136h.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo221a(C0598h c0598h, boolean z) {
        if (this.f2137i != null) {
            this.f2137i.mo140a(c0598h, z);
        }
    }

    /* renamed from: a */
    public void mo222a(C0329a c0329a) {
        this.f2137i = c0329a;
    }

    /* renamed from: a */
    public boolean mo223a(C0598h c0598h, C0601j c0601j) {
        return false;
    }

    /* renamed from: a */
    public boolean mo224a(C0762u c0762u) {
        if (!c0762u.hasVisibleItems()) {
            return false;
        }
        new C0599i(c0762u).m2694a(null);
        if (this.f2137i != null) {
            this.f2137i.mo141a(c0762u);
        }
        return true;
    }

    /* renamed from: b */
    public void mo225b(boolean z) {
        if (this.f2136h != null) {
            this.f2136h.notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public boolean mo226b() {
        return false;
    }

    /* renamed from: b */
    public boolean mo227b(C0598h c0598h, C0601j c0601j) {
        return false;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f2131c.m2664a(this.f2136h.m1197a(i), (C0330o) this, 0);
    }
}
