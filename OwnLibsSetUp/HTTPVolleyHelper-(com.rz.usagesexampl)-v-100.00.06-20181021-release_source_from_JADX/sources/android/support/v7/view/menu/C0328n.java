package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.p017g.C0213d;
import android.support.v4.p017g.C0227p;
import android.support.v7.p020a.C0270a.C0263d;
import android.support.v7.view.menu.C0330o.C0329a;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow.OnDismissListener;

/* renamed from: android.support.v7.view.menu.n */
public class C0328n {
    /* renamed from: a */
    private final Context f1102a;
    /* renamed from: b */
    private final C0598h f1103b;
    /* renamed from: c */
    private final boolean f1104c;
    /* renamed from: d */
    private final int f1105d;
    /* renamed from: e */
    private final int f1106e;
    /* renamed from: f */
    private View f1107f;
    /* renamed from: g */
    private int f1108g;
    /* renamed from: h */
    private boolean f1109h;
    /* renamed from: i */
    private C0329a f1110i;
    /* renamed from: j */
    private C0606m f1111j;
    /* renamed from: k */
    private OnDismissListener f1112k;
    /* renamed from: l */
    private final OnDismissListener f1113l;

    /* renamed from: android.support.v7.view.menu.n$1 */
    class C03271 implements OnDismissListener {
        /* renamed from: a */
        final /* synthetic */ C0328n f1101a;

        C03271(C0328n c0328n) {
            this.f1101a = c0328n;
        }

        public void onDismiss() {
            this.f1101a.mo330e();
        }
    }

    public C0328n(Context context, C0598h c0598h, View view, boolean z, int i) {
        this(context, c0598h, view, z, i, 0);
    }

    public C0328n(Context context, C0598h c0598h, View view, boolean z, int i, int i2) {
        this.f1108g = 8388611;
        this.f1113l = new C03271(this);
        this.f1102a = context;
        this.f1103b = c0598h;
        this.f1107f = view;
        this.f1104c = z;
        this.f1105d = i;
        this.f1106e = i2;
    }

    /* renamed from: a */
    private void m1206a(int i, int i2, boolean z, boolean z2) {
        C0606m b = m1215b();
        b.mo507c(z2);
        if (z) {
            if ((C0213d.m797a(this.f1108g, C0227p.m876b(this.f1107f)) & 7) == 5) {
                i += this.f1107f.getWidth();
            }
            b.mo505b(i);
            b.mo506c(i2);
            int i3 = (int) ((this.f1102a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            b.m2739a(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        b.mo286a();
    }

    /* renamed from: g */
    private C0606m m1207g() {
        Display defaultDisplay = ((WindowManager) this.f1102a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        if ((Math.min(point.x, point.y) >= this.f1102a.getResources().getDimensionPixelSize(C0263d.abc_cascading_menus_min_smallest_width) ? 1 : null) != null) {
            C0606m c0757e = new C0757e(this.f1102a, this.f1107f, this.f1105d, this.f1106e, this.f1104c);
        } else {
            C0606m c0761t = new C0761t(this.f1102a, this.f1103b, this.f1107f, this.f1105d, this.f1106e, this.f1104c);
        }
        r0.mo501a(this.f1103b);
        r0.mo503a(this.f1113l);
        r0.mo502a(this.f1107f);
        r0.mo222a(this.f1110i);
        r0.mo504a(this.f1109h);
        r0.mo500a(this.f1108g);
        return r0;
    }

    /* renamed from: a */
    public void m1208a() {
        if (!m1216c()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: a */
    public void m1209a(int i) {
        this.f1108g = i;
    }

    /* renamed from: a */
    public void m1210a(C0329a c0329a) {
        this.f1110i = c0329a;
        if (this.f1111j != null) {
            this.f1111j.mo222a(c0329a);
        }
    }

    /* renamed from: a */
    public void m1211a(View view) {
        this.f1107f = view;
    }

    /* renamed from: a */
    public void m1212a(OnDismissListener onDismissListener) {
        this.f1112k = onDismissListener;
    }

    /* renamed from: a */
    public void m1213a(boolean z) {
        this.f1109h = z;
        if (this.f1111j != null) {
            this.f1111j.mo504a(z);
        }
    }

    /* renamed from: a */
    public boolean m1214a(int i, int i2) {
        if (m1219f()) {
            return true;
        }
        if (this.f1107f == null) {
            return false;
        }
        m1206a(i, i2, true, true);
        return true;
    }

    /* renamed from: b */
    public C0606m m1215b() {
        if (this.f1111j == null) {
            this.f1111j = m1207g();
        }
        return this.f1111j;
    }

    /* renamed from: c */
    public boolean m1216c() {
        if (m1219f()) {
            return true;
        }
        if (this.f1107f == null) {
            return false;
        }
        m1206a(0, 0, false, false);
        return true;
    }

    /* renamed from: d */
    public void m1217d() {
        if (m1219f()) {
            this.f1111j.mo287c();
        }
    }

    /* renamed from: e */
    protected void mo330e() {
        this.f1111j = null;
        if (this.f1112k != null) {
            this.f1112k.onDismiss();
        }
    }

    /* renamed from: f */
    public boolean m1219f() {
        return this.f1111j != null && this.f1111j.mo288d();
    }
}
