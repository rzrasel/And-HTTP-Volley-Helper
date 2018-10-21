package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.view.menu.C0330o.C0329a;
import android.support.v7.view.menu.C0332p.C0331a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.b */
public abstract class C0594b implements C0330o {
    /* renamed from: a */
    protected Context f2115a;
    /* renamed from: b */
    protected Context f2116b;
    /* renamed from: c */
    protected C0598h f2117c;
    /* renamed from: d */
    protected LayoutInflater f2118d;
    /* renamed from: e */
    protected LayoutInflater f2119e;
    /* renamed from: f */
    protected C0332p f2120f;
    /* renamed from: g */
    private C0329a f2121g;
    /* renamed from: h */
    private int f2122h;
    /* renamed from: i */
    private int f2123i;
    /* renamed from: j */
    private int f2124j;

    public C0594b(Context context, int i, int i2) {
        this.f2115a = context;
        this.f2118d = LayoutInflater.from(context);
        this.f2122h = i;
        this.f2123i = i2;
    }

    /* renamed from: a */
    public C0329a m2604a() {
        return this.f2121g;
    }

    /* renamed from: a */
    public C0332p mo525a(ViewGroup viewGroup) {
        if (this.f2120f == null) {
            this.f2120f = (C0332p) this.f2118d.inflate(this.f2122h, viewGroup, false);
            this.f2120f.mo192a(this.f2117c);
            mo225b(true);
        }
        return this.f2120f;
    }

    /* renamed from: a */
    public View mo526a(C0601j c0601j, View view, ViewGroup viewGroup) {
        C0331a b = view instanceof C0331a ? (C0331a) view : m2617b(viewGroup);
        mo527a(c0601j, b);
        return (View) b;
    }

    /* renamed from: a */
    public void m2607a(int i) {
        this.f2124j = i;
    }

    /* renamed from: a */
    public void mo220a(Context context, C0598h c0598h) {
        this.f2116b = context;
        this.f2119e = LayoutInflater.from(this.f2116b);
        this.f2117c = c0598h;
    }

    /* renamed from: a */
    public void mo221a(C0598h c0598h, boolean z) {
        if (this.f2121g != null) {
            this.f2121g.mo140a(c0598h, z);
        }
    }

    /* renamed from: a */
    public abstract void mo527a(C0601j c0601j, C0331a c0331a);

    /* renamed from: a */
    public void mo222a(C0329a c0329a) {
        this.f2121g = c0329a;
    }

    /* renamed from: a */
    protected void m2612a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f2120f).addView(view, i);
    }

    /* renamed from: a */
    public boolean mo529a(int i, C0601j c0601j) {
        return true;
    }

    /* renamed from: a */
    public boolean mo223a(C0598h c0598h, C0601j c0601j) {
        return false;
    }

    /* renamed from: a */
    public boolean mo224a(C0762u c0762u) {
        return this.f2121g != null ? this.f2121g.mo141a(c0762u) : false;
    }

    /* renamed from: a */
    protected boolean mo530a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: b */
    public C0331a m2617b(ViewGroup viewGroup) {
        return (C0331a) this.f2118d.inflate(this.f2123i, viewGroup, false);
    }

    /* renamed from: b */
    public void mo225b(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f2120f;
        if (viewGroup != null) {
            int i = 0;
            if (this.f2117c != null) {
                this.f2117c.m2684j();
                ArrayList i2 = this.f2117c.m2683i();
                int size = i2.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    C0601j c0601j = (C0601j) i2.get(i4);
                    if (mo529a(i3, c0601j)) {
                        View childAt = viewGroup.getChildAt(i3);
                        C0601j itemData = childAt instanceof C0331a ? ((C0331a) childAt).getItemData() : null;
                        View a = mo526a(c0601j, childAt, viewGroup);
                        if (c0601j != itemData) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            m2612a(a, i3);
                        }
                        i3++;
                    }
                }
                i = i3;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo530a(viewGroup, i)) {
                    i++;
                }
            }
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
}
