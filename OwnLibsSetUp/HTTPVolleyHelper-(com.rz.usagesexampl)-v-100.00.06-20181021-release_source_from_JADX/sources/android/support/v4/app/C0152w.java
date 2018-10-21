package android.support.v4.app;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

/* renamed from: android.support.v4.app.w */
class C0152w implements OnAttachStateChangeListener, OnPreDrawListener {
    /* renamed from: a */
    private final View f626a;
    /* renamed from: b */
    private ViewTreeObserver f627b;
    /* renamed from: c */
    private final Runnable f628c;

    private C0152w(View view, Runnable runnable) {
        this.f626a = view;
        this.f627b = view.getViewTreeObserver();
        this.f628c = runnable;
    }

    /* renamed from: a */
    public static C0152w m553a(View view, Runnable runnable) {
        C0152w c0152w = new C0152w(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(c0152w);
        view.addOnAttachStateChangeListener(c0152w);
        return c0152w;
    }

    /* renamed from: a */
    public void m554a() {
        (this.f627b.isAlive() ? this.f627b : this.f626a.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f626a.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        m554a();
        this.f628c.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f627b = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        m554a();
    }
}
