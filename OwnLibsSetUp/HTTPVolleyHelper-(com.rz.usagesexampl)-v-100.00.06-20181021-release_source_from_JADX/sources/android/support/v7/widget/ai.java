package android.support.v7.widget;

import android.os.SystemClock;
import android.support.v7.view.menu.C0334s;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;

public abstract class ai implements OnAttachStateChangeListener, OnTouchListener {
    /* renamed from: a */
    private final float f1263a;
    /* renamed from: b */
    private final int f1264b;
    /* renamed from: c */
    final View f1265c;
    /* renamed from: d */
    private final int f1266d;
    /* renamed from: e */
    private Runnable f1267e;
    /* renamed from: f */
    private Runnable f1268f;
    /* renamed from: g */
    private boolean f1269g;
    /* renamed from: h */
    private int f1270h;
    /* renamed from: i */
    private final int[] f1271i = new int[2];

    /* renamed from: android.support.v7.widget.ai$a */
    private class C0364a implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ai f1261a;

        C0364a(ai aiVar) {
            this.f1261a = aiVar;
        }

        public void run() {
            ViewParent parent = this.f1261a.f1265c.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: android.support.v7.widget.ai$b */
    private class C0365b implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ai f1262a;

        C0365b(ai aiVar) {
            this.f1262a = aiVar;
        }

        public void run() {
            this.f1262a.m1426d();
        }
    }

    public ai(View view) {
        this.f1265c = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1263a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f1264b = ViewConfiguration.getTapTimeout();
        this.f1266d = (this.f1264b + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    private boolean m1417a(MotionEvent motionEvent) {
        View view = this.f1265c;
        if (!view.isEnabled()) {
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f1270h = motionEvent.getPointerId(0);
                if (this.f1267e == null) {
                    this.f1267e = new C0364a(this);
                }
                view.postDelayed(this.f1267e, (long) this.f1264b);
                if (this.f1268f == null) {
                    this.f1268f = new C0365b(this);
                }
                view.postDelayed(this.f1268f, (long) this.f1266d);
                break;
            case 1:
            case 3:
                m1422e();
                break;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.f1270h);
                if (findPointerIndex >= 0 && !m1418a(view, motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex), this.f1263a)) {
                    m1422e();
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
            default:
                break;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m1418a(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: a */
    private boolean m1419a(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1271i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    /* renamed from: b */
    private boolean m1420b(MotionEvent motionEvent) {
        View view = this.f1265c;
        C0334s a = mo190a();
        if (a != null) {
            if (a.mo288d()) {
                ag agVar = (ag) a.mo289e();
                if (agVar != null) {
                    if (agVar.isShown()) {
                        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                        m1421b(view, obtainNoHistory);
                        m1419a(agVar, obtainNoHistory);
                        boolean a2 = agVar.mo291a(obtainNoHistory, this.f1270h);
                        obtainNoHistory.recycle();
                        int actionMasked = motionEvent.getActionMasked();
                        boolean z = true;
                        Object obj = (actionMasked == 1 || actionMasked == 3) ? null : 1;
                        if (!a2 || obj == null) {
                            z = false;
                        }
                        return z;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private boolean m1421b(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1271i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    /* renamed from: e */
    private void m1422e() {
        if (this.f1268f != null) {
            this.f1265c.removeCallbacks(this.f1268f);
        }
        if (this.f1267e != null) {
            this.f1265c.removeCallbacks(this.f1267e);
        }
    }

    /* renamed from: a */
    public abstract C0334s mo190a();

    /* renamed from: b */
    protected boolean mo191b() {
        C0334s a = mo190a();
        if (!(a == null || a.mo288d())) {
            a.mo286a();
        }
        return true;
    }

    /* renamed from: c */
    protected boolean mo332c() {
        C0334s a = mo190a();
        if (a != null && a.mo288d()) {
            a.mo287c();
        }
        return true;
    }

    /* renamed from: d */
    void m1426d() {
        m1422e();
        View view = this.f1265c;
        if (view.isEnabled()) {
            if (!view.isLongClickable()) {
                if (mo191b()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    this.f1269g = true;
                }
            }
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f1269g;
        if (z2) {
            if (!m1420b(motionEvent)) {
                if (mo332c()) {
                    z = false;
                }
            }
            z = true;
        } else {
            z = m1417a(motionEvent) && mo191b();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1265c.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f1269g = z;
        return z || z2;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f1269g = false;
        this.f1270h = -1;
        if (this.f1267e != null) {
            this.f1265c.removeCallbacks(this.f1267e);
        }
    }
}
