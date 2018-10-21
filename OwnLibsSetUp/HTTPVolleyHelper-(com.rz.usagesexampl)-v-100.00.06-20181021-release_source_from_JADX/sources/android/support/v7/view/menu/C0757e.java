package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.p017g.C0213d;
import android.support.v4.p017g.C0227p;
import android.support.v7.p020a.C0270a.C0263d;
import android.support.v7.p020a.C0270a.C0266g;
import android.support.v7.view.menu.C0330o.C0329a;
import android.support.v7.widget.al;
import android.support.v7.widget.am;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.view.menu.e */
final class C0757e extends C0606m implements C0330o, OnKeyListener, OnDismissListener {
    /* renamed from: a */
    final Handler f2704a;
    /* renamed from: b */
    final List<C0322a> f2705b = new ArrayList();
    /* renamed from: c */
    View f2706c;
    /* renamed from: d */
    boolean f2707d;
    /* renamed from: e */
    private final Context f2708e;
    /* renamed from: f */
    private final int f2709f;
    /* renamed from: g */
    private final int f2710g;
    /* renamed from: h */
    private final int f2711h;
    /* renamed from: i */
    private final boolean f2712i;
    /* renamed from: j */
    private final List<C0598h> f2713j = new ArrayList();
    /* renamed from: k */
    private final OnGlobalLayoutListener f2714k = new C03191(this);
    /* renamed from: l */
    private final OnAttachStateChangeListener f2715l = new C03202(this);
    /* renamed from: m */
    private final al f2716m = new C05963(this);
    /* renamed from: n */
    private int f2717n = 0;
    /* renamed from: o */
    private int f2718o = 0;
    /* renamed from: p */
    private View f2719p;
    /* renamed from: q */
    private int f2720q;
    /* renamed from: r */
    private boolean f2721r;
    /* renamed from: s */
    private boolean f2722s;
    /* renamed from: t */
    private int f2723t;
    /* renamed from: u */
    private int f2724u;
    /* renamed from: v */
    private boolean f2725v;
    /* renamed from: w */
    private boolean f2726w;
    /* renamed from: x */
    private C0329a f2727x;
    /* renamed from: y */
    private ViewTreeObserver f2728y;
    /* renamed from: z */
    private OnDismissListener f2729z;

    /* renamed from: android.support.v7.view.menu.e$1 */
    class C03191 implements OnGlobalLayoutListener {
        /* renamed from: a */
        final /* synthetic */ C0757e f1084a;

        C03191(C0757e c0757e) {
            this.f1084a = c0757e;
        }

        public void onGlobalLayout() {
            if (this.f1084a.mo288d() && this.f1084a.f2705b.size() > 0 && !((C0322a) this.f1084a.f2705b.get(0)).f1090a.m2875g()) {
                View view = this.f1084a.f2706c;
                if (view != null) {
                    if (view.isShown()) {
                        for (C0322a c0322a : this.f1084a.f2705b) {
                            c0322a.f1090a.mo286a();
                        }
                        return;
                    }
                }
                this.f1084a.mo287c();
            }
        }
    }

    /* renamed from: android.support.v7.view.menu.e$2 */
    class C03202 implements OnAttachStateChangeListener {
        /* renamed from: a */
        final /* synthetic */ C0757e f1085a;

        C03202(C0757e c0757e) {
            this.f1085a = c0757e;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            if (this.f1085a.f2728y != null) {
                if (!this.f1085a.f2728y.isAlive()) {
                    this.f1085a.f2728y = view.getViewTreeObserver();
                }
                this.f1085a.f2728y.removeGlobalOnLayoutListener(this.f1085a.f2714k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: android.support.v7.view.menu.e$a */
    private static class C0322a {
        /* renamed from: a */
        public final am f1090a;
        /* renamed from: b */
        public final C0598h f1091b;
        /* renamed from: c */
        public final int f1092c;

        public C0322a(am amVar, C0598h c0598h, int i) {
            this.f1090a = amVar;
            this.f1091b = c0598h;
            this.f1092c = i;
        }

        /* renamed from: a */
        public ListView m1196a() {
            return this.f1090a.mo289e();
        }
    }

    /* renamed from: android.support.v7.view.menu.e$3 */
    class C05963 implements al {
        /* renamed from: a */
        final /* synthetic */ C0757e f2128a;

        C05963(C0757e c0757e) {
            this.f2128a = c0757e;
        }

        /* renamed from: a */
        public void mo228a(C0598h c0598h, MenuItem menuItem) {
            this.f2128a.f2704a.removeCallbacksAndMessages(c0598h);
        }

        /* renamed from: b */
        public void mo229b(final C0598h c0598h, final MenuItem menuItem) {
            C0322a c0322a = null;
            this.f2128a.f2704a.removeCallbacksAndMessages(null);
            int size = this.f2128a.f2705b.size();
            int i = 0;
            while (i < size) {
                if (c0598h == ((C0322a) this.f2128a.f2705b.get(i)).f1091b) {
                    break;
                }
                i++;
            }
            i = -1;
            if (i != -1) {
                i++;
                if (i < this.f2128a.f2705b.size()) {
                    c0322a = (C0322a) this.f2128a.f2705b.get(i);
                }
                this.f2128a.f2704a.postAtTime(new Runnable(this) {
                    /* renamed from: d */
                    final /* synthetic */ C05963 f1089d;

                    public void run() {
                        if (c0322a != null) {
                            this.f1089d.f2128a.f2707d = true;
                            c0322a.f1091b.m2661a(false);
                            this.f1089d.f2128a.f2707d = false;
                        }
                        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                            c0598h.m2663a(menuItem, 4);
                        }
                    }
                }, c0598h, SystemClock.uptimeMillis() + 200);
            }
        }
    }

    public C0757e(Context context, View view, int i, int i2, boolean z) {
        this.f2708e = context;
        this.f2719p = view;
        this.f2710g = i;
        this.f2711h = i2;
        this.f2712i = z;
        this.f2725v = false;
        this.f2720q = m3550i();
        Resources resources = context.getResources();
        this.f2709f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0263d.abc_config_prefDialogWidth));
        this.f2704a = new Handler();
    }

    /* renamed from: a */
    private MenuItem m3541a(C0598h c0598h, C0598h c0598h2) {
        int size = c0598h.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0598h.getItem(i);
            if (item.hasSubMenu() && c0598h2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: a */
    private View m3542a(C0322a c0322a, C0598h c0598h) {
        MenuItem a = m3541a(c0322a.f1091b, c0598h);
        if (a == null) {
            return null;
        }
        int headersCount;
        C0324g c0324g;
        ListView a2 = c0322a.m1196a();
        ListAdapter adapter = a2.getAdapter();
        int i = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            c0324g = (C0324g) headerViewListAdapter.getWrappedAdapter();
        } else {
            c0324g = (C0324g) adapter;
            headersCount = 0;
        }
        int count = c0324g.getCount();
        while (i < count) {
            if (a == c0324g.m1200a(i)) {
                break;
            }
            i++;
        }
        i = -1;
        if (i == -1) {
            return null;
        }
        i = (i + headersCount) - a2.getFirstVisiblePosition();
        if (i >= 0) {
            if (i < a2.getChildCount()) {
                return a2.getChildAt(i);
            }
        }
        return null;
    }

    /* renamed from: c */
    private void m3546c(C0598h c0598h) {
        C0322a c0322a;
        View a;
        LayoutInflater from = LayoutInflater.from(this.f2708e);
        ListAdapter c0324g = new C0324g(c0598h, from, this.f2712i);
        if (!mo288d() && this.f2725v) {
            c0324g.m1201a(true);
        } else if (mo288d()) {
            c0324g.m1201a(C0606m.m2736b(c0598h));
        }
        int a2 = C0606m.m2734a(c0324g, null, this.f2708e, this.f2709f);
        am h = m3549h();
        h.mo531a(c0324g);
        h.m2874g(a2);
        h.m2872e(this.f2718o);
        if (this.f2705b.size() > 0) {
            c0322a = (C0322a) this.f2705b.get(this.f2705b.size() - 1);
            a = m3542a(c0322a, c0598h);
        } else {
            c0322a = null;
            a = c0322a;
        }
        if (a != null) {
            int i;
            h.mo524c(false);
            h.m3611a(null);
            int d = m3547d(a2);
            Object obj = d == 1 ? 1 : null;
            this.f2720q = d;
            if (VERSION.SDK_INT >= 26) {
                h.m2865b(a);
                d = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f2719p.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                a.getLocationOnScreen(iArr2);
                if ((this.f2718o & 7) == 5) {
                    iArr[0] = iArr[0] + this.f2719p.getWidth();
                    iArr2[0] = iArr2[0] + a.getWidth();
                }
                i = iArr2[0] - iArr[0];
                d = iArr2[1] - iArr[1];
            }
            if ((this.f2718o & 5) != 5) {
                if (obj != null) {
                    a2 = a.getWidth();
                }
                i -= a2;
                h.m2868c(i);
                h.m2866b(true);
                h.m2869d(d);
            } else if (obj == null) {
                a2 = a.getWidth();
                i -= a2;
                h.m2868c(i);
                h.m2866b(true);
                h.m2869d(d);
            }
            i += a2;
            h.m2868c(i);
            h.m2866b(true);
            h.m2869d(d);
        } else {
            if (this.f2721r) {
                h.m2868c(this.f2723t);
            }
            if (this.f2722s) {
                h.m2869d(this.f2724u);
            }
            h.m2858a(m2750g());
        }
        this.f2705b.add(new C0322a(h, c0598h, this.f2720q));
        h.mo286a();
        ViewGroup e = h.mo289e();
        e.setOnKeyListener(this);
        if (c0322a == null && this.f2726w && c0598h.m2687m() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C0266g.abc_popup_menu_header_item_layout, e, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            frameLayout.setEnabled(false);
            textView.setText(c0598h.m2687m());
            e.addHeaderView(frameLayout, null, false);
            h.mo286a();
        }
    }

    /* renamed from: d */
    private int m3547d(int i) {
        ListView a = ((C0322a) this.f2705b.get(this.f2705b.size() - 1)).m1196a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f2706c.getWindowVisibleDisplayFrame(rect);
        return this.f2720q == 1 ? (iArr[0] + a.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    /* renamed from: d */
    private int m3548d(C0598h c0598h) {
        int size = this.f2705b.size();
        for (int i = 0; i < size; i++) {
            if (c0598h == ((C0322a) this.f2705b.get(i)).f1091b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: h */
    private am m3549h() {
        am amVar = new am(this.f2708e, null, this.f2710g, this.f2711h);
        amVar.m3610a(this.f2716m);
        amVar.m2860a((OnItemClickListener) this);
        amVar.m2862a((OnDismissListener) this);
        amVar.m2865b(this.f2719p);
        amVar.m2872e(this.f2718o);
        amVar.m2863a(true);
        amVar.m2877h(2);
        return amVar;
    }

    /* renamed from: i */
    private int m3550i() {
        return C0227p.m876b(this.f2719p) == 1 ? 0 : 1;
    }

    /* renamed from: a */
    public void mo286a() {
        if (!mo288d()) {
            for (C0598h c : this.f2713j) {
                m3546c(c);
            }
            this.f2713j.clear();
            this.f2706c = this.f2719p;
            if (this.f2706c != null) {
                Object obj = this.f2728y == null ? 1 : null;
                this.f2728y = this.f2706c.getViewTreeObserver();
                if (obj != null) {
                    this.f2728y.addOnGlobalLayoutListener(this.f2714k);
                }
                this.f2706c.addOnAttachStateChangeListener(this.f2715l);
            }
        }
    }

    /* renamed from: a */
    public void mo500a(int i) {
        if (this.f2717n != i) {
            this.f2717n = i;
            this.f2718o = C0213d.m797a(i, C0227p.m876b(this.f2719p));
        }
    }

    /* renamed from: a */
    public void mo501a(C0598h c0598h) {
        c0598h.m2658a((C0330o) this, this.f2708e);
        if (mo288d()) {
            m3546c(c0598h);
        } else {
            this.f2713j.add(c0598h);
        }
    }

    /* renamed from: a */
    public void mo221a(C0598h c0598h, boolean z) {
        int d = m3548d(c0598h);
        if (d >= 0) {
            int i = d + 1;
            if (i < this.f2705b.size()) {
                ((C0322a) this.f2705b.get(i)).f1091b.m2661a(false);
            }
            C0322a c0322a = (C0322a) this.f2705b.remove(d);
            c0322a.f1091b.m2668b((C0330o) this);
            if (this.f2707d) {
                c0322a.f1090a.m3613b(null);
                c0322a.f1090a.m2864b(0);
            }
            c0322a.f1090a.mo287c();
            d = this.f2705b.size();
            this.f2720q = d > 0 ? ((C0322a) this.f2705b.get(d - 1)).f1092c : m3550i();
            if (d == 0) {
                mo287c();
                if (this.f2727x != null) {
                    this.f2727x.mo140a(c0598h, true);
                }
                if (this.f2728y != null) {
                    if (this.f2728y.isAlive()) {
                        this.f2728y.removeGlobalOnLayoutListener(this.f2714k);
                    }
                    this.f2728y = null;
                }
                this.f2706c.removeOnAttachStateChangeListener(this.f2715l);
                this.f2729z.onDismiss();
            } else if (z) {
                ((C0322a) this.f2705b.get(0)).f1091b.m2661a(false);
            }
        }
    }

    /* renamed from: a */
    public void mo222a(C0329a c0329a) {
        this.f2727x = c0329a;
    }

    /* renamed from: a */
    public void mo502a(View view) {
        if (this.f2719p != view) {
            this.f2719p = view;
            this.f2718o = C0213d.m797a(this.f2717n, C0227p.m876b(this.f2719p));
        }
    }

    /* renamed from: a */
    public void mo503a(OnDismissListener onDismissListener) {
        this.f2729z = onDismissListener;
    }

    /* renamed from: a */
    public void mo504a(boolean z) {
        this.f2725v = z;
    }

    /* renamed from: a */
    public boolean mo224a(C0762u c0762u) {
        for (C0322a c0322a : this.f2705b) {
            if (c0762u == c0322a.f1091b) {
                c0322a.m1196a().requestFocus();
                return true;
            }
        }
        if (!c0762u.hasVisibleItems()) {
            return false;
        }
        mo501a((C0598h) c0762u);
        if (this.f2727x != null) {
            this.f2727x.mo141a(c0762u);
        }
        return true;
    }

    /* renamed from: b */
    public void mo505b(int i) {
        this.f2721r = true;
        this.f2723t = i;
    }

    /* renamed from: b */
    public void mo225b(boolean z) {
        for (C0322a a : this.f2705b) {
            C0606m.m2735a(a.m1196a().getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public boolean mo226b() {
        return false;
    }

    /* renamed from: c */
    public void mo287c() {
        int size = this.f2705b.size();
        if (size > 0) {
            C0322a[] c0322aArr = (C0322a[]) this.f2705b.toArray(new C0322a[size]);
            for (size--; size >= 0; size--) {
                C0322a c0322a = c0322aArr[size];
                if (c0322a.f1090a.mo288d()) {
                    c0322a.f1090a.mo287c();
                }
            }
        }
    }

    /* renamed from: c */
    public void mo506c(int i) {
        this.f2722s = true;
        this.f2724u = i;
    }

    /* renamed from: c */
    public void mo507c(boolean z) {
        this.f2726w = z;
    }

    /* renamed from: d */
    public boolean mo288d() {
        return this.f2705b.size() > 0 && ((C0322a) this.f2705b.get(0)).f1090a.mo288d();
    }

    /* renamed from: e */
    public ListView mo289e() {
        return this.f2705b.isEmpty() ? null : ((C0322a) this.f2705b.get(this.f2705b.size() - 1)).m1196a();
    }

    /* renamed from: f */
    protected boolean mo508f() {
        return false;
    }

    public void onDismiss() {
        C0322a c0322a;
        int size = this.f2705b.size();
        for (int i = 0; i < size; i++) {
            c0322a = (C0322a) this.f2705b.get(i);
            if (!c0322a.f1090a.mo288d()) {
                break;
            }
        }
        c0322a = null;
        if (c0322a != null) {
            c0322a.f1091b.m2661a(false);
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        mo287c();
        return true;
    }
}
