package android.support.v4.p017g;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v4.g.s */
public final class C0234s {
    /* renamed from: a */
    Runnable f794a = null;
    /* renamed from: b */
    Runnable f795b = null;
    /* renamed from: c */
    int f796c = -1;
    /* renamed from: d */
    private WeakReference<View> f797d;

    /* renamed from: android.support.v4.g.s$a */
    static class C0564a implements C0235t {
        /* renamed from: a */
        C0234s f1971a;
        /* renamed from: b */
        boolean f1972b;

        C0564a(C0234s c0234s) {
            this.f1971a = c0234s;
        }

        /* renamed from: a */
        public void mo99a(View view) {
            this.f1972b = false;
            C0235t c0235t = null;
            if (this.f1971a.f796c > -1) {
                view.setLayerType(2, null);
            }
            if (this.f1971a.f794a != null) {
                Runnable runnable = this.f1971a.f794a;
                this.f1971a.f794a = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            if (tag instanceof C0235t) {
                c0235t = (C0235t) tag;
            }
            if (c0235t != null) {
                c0235t.mo99a(view);
            }
        }

        /* renamed from: b */
        public void mo100b(View view) {
            C0235t c0235t = null;
            if (this.f1971a.f796c > -1) {
                view.setLayerType(this.f1971a.f796c, null);
                this.f1971a.f796c = -1;
            }
            if (VERSION.SDK_INT >= 16 || !this.f1972b) {
                if (this.f1971a.f795b != null) {
                    Runnable runnable = this.f1971a.f795b;
                    this.f1971a.f795b = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                if (tag instanceof C0235t) {
                    c0235t = (C0235t) tag;
                }
                if (c0235t != null) {
                    c0235t.mo100b(view);
                }
                this.f1972b = true;
            }
        }

        /* renamed from: c */
        public void mo101c(View view) {
            Object tag = view.getTag(2113929216);
            C0235t c0235t = tag instanceof C0235t ? (C0235t) tag : null;
            if (c0235t != null) {
                c0235t.mo101c(view);
            }
        }
    }

    C0234s(View view) {
        this.f797d = new WeakReference(view);
    }

    /* renamed from: a */
    private void m905a(final View view, final C0235t c0235t) {
        if (c0235t != null) {
            view.animate().setListener(new AnimatorListenerAdapter(this) {
                /* renamed from: c */
                final /* synthetic */ C0234s f790c;

                public void onAnimationCancel(Animator animator) {
                    c0235t.mo101c(view);
                }

                public void onAnimationEnd(Animator animator) {
                    c0235t.mo100b(view);
                }

                public void onAnimationStart(Animator animator) {
                    c0235t.mo99a(view);
                }
            });
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: a */
    public long m906a() {
        View view = (View) this.f797d.get();
        return view != null ? view.animate().getDuration() : 0;
    }

    /* renamed from: a */
    public C0234s m907a(float f) {
        View view = (View) this.f797d.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: a */
    public C0234s m908a(long j) {
        View view = (View) this.f797d.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: a */
    public C0234s m909a(C0235t c0235t) {
        View view = (View) this.f797d.get();
        if (view != null) {
            if (VERSION.SDK_INT < 16) {
                view.setTag(2113929216, c0235t);
                c0235t = new C0564a(this);
            }
            m905a(view, c0235t);
        }
        return this;
    }

    /* renamed from: a */
    public C0234s m910a(final C0236v c0236v) {
        final View view = (View) this.f797d.get();
        if (view != null && VERSION.SDK_INT >= 19) {
            AnimatorUpdateListener animatorUpdateListener = null;
            if (c0236v != null) {
                animatorUpdateListener = new AnimatorUpdateListener(this) {
                    /* renamed from: c */
                    final /* synthetic */ C0234s f793c;

                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        c0236v.mo167a(view);
                    }
                };
            }
            view.animate().setUpdateListener(animatorUpdateListener);
        }
        return this;
    }

    /* renamed from: a */
    public C0234s m911a(Interpolator interpolator) {
        View view = (View) this.f797d.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: b */
    public C0234s m912b(float f) {
        View view = (View) this.f797d.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    /* renamed from: b */
    public C0234s m913b(long j) {
        View view = (View) this.f797d.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: b */
    public void m914b() {
        View view = (View) this.f797d.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c */
    public void m915c() {
        View view = (View) this.f797d.get();
        if (view != null) {
            view.animate().start();
        }
    }
}
