package android.support.v7.widget;

import android.support.v4.p017g.C0227p;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnHoverListener;
import android.view.View.OnLongClickListener;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

class az implements OnAttachStateChangeListener, OnHoverListener, OnLongClickListener {
    /* renamed from: i */
    private static az f1355i;
    /* renamed from: j */
    private static az f1356j;
    /* renamed from: a */
    private final View f1357a;
    /* renamed from: b */
    private final CharSequence f1358b;
    /* renamed from: c */
    private final Runnable f1359c = new C03801(this);
    /* renamed from: d */
    private final Runnable f1360d = new C03812(this);
    /* renamed from: e */
    private int f1361e;
    /* renamed from: f */
    private int f1362f;
    /* renamed from: g */
    private ba f1363g;
    /* renamed from: h */
    private boolean f1364h;

    /* renamed from: android.support.v7.widget.az$1 */
    class C03801 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ az f1353a;

        C03801(az azVar) {
            this.f1353a = azVar;
        }

        public void run() {
            this.f1353a.m1502a(false);
        }
    }

    /* renamed from: android.support.v7.widget.az$2 */
    class C03812 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ az f1354a;

        C03812(az azVar) {
            this.f1354a = azVar;
        }

        public void run() {
            this.f1354a.m1498a();
        }
    }

    private az(View view, CharSequence charSequence) {
        this.f1357a = view;
        this.f1358b = charSequence;
        this.f1357a.setOnLongClickListener(this);
        this.f1357a.setOnHoverListener(this);
    }

    /* renamed from: a */
    private void m1498a() {
        if (f1356j == this) {
            f1356j = null;
            if (this.f1363g != null) {
                this.f1363g.m1508a();
                this.f1363g = null;
                this.f1357a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1355i == this) {
            m1504b(null);
        }
        this.f1357a.removeCallbacks(this.f1360d);
    }

    /* renamed from: a */
    public static void m1501a(View view, CharSequence charSequence) {
        if (f1355i != null && f1355i.f1357a == view) {
            m1504b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (f1356j != null && f1356j.f1357a == view) {
                f1356j.m1498a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        az azVar = new az(view, charSequence);
    }

    /* renamed from: a */
    private void m1502a(boolean z) {
        if (C0227p.m887m(this.f1357a)) {
            long j;
            m1504b(null);
            if (f1356j != null) {
                f1356j.m1498a();
            }
            f1356j = this;
            this.f1364h = z;
            this.f1363g = new ba(this.f1357a.getContext());
            this.f1363g.m1509a(this.f1357a, this.f1361e, this.f1362f, this.f1364h, this.f1358b);
            this.f1357a.addOnAttachStateChangeListener(this);
            if (this.f1364h) {
                j = 2500;
            } else {
                j = ((C0227p.m880f(this.f1357a) & 1) == 1 ? 3000 : 15000) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f1357a.removeCallbacks(this.f1360d);
            this.f1357a.postDelayed(this.f1360d, j);
        }
    }

    /* renamed from: b */
    private void m1503b() {
        this.f1357a.postDelayed(this.f1359c, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: b */
    private static void m1504b(az azVar) {
        if (f1355i != null) {
            f1355i.m1505c();
        }
        f1355i = azVar;
        if (f1355i != null) {
            f1355i.m1503b();
        }
    }

    /* renamed from: c */
    private void m1505c() {
        this.f1357a.removeCallbacks(this.f1359c);
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1363g != null && this.f1364h) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1357a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m1498a();
            }
        } else if (this.f1357a.isEnabled() && this.f1363g == null) {
            this.f1361e = (int) motionEvent.getX();
            this.f1362f = (int) motionEvent.getY();
            m1504b(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f1361e = view.getWidth() / 2;
        this.f1362f = view.getHeight() / 2;
        m1502a(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        m1498a();
    }
}
