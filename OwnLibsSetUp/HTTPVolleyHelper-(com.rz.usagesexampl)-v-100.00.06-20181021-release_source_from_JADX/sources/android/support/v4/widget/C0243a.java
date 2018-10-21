package android.support.v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.v4.p017g.C0227p;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* renamed from: android.support.v4.widget.a */
public abstract class C0243a implements OnTouchListener {
    /* renamed from: r */
    private static final int f812r = ViewConfiguration.getTapTimeout();
    /* renamed from: a */
    final C0241a f813a = new C0241a();
    /* renamed from: b */
    final View f814b;
    /* renamed from: c */
    boolean f815c;
    /* renamed from: d */
    boolean f816d;
    /* renamed from: e */
    boolean f817e;
    /* renamed from: f */
    private final Interpolator f818f = new AccelerateInterpolator();
    /* renamed from: g */
    private Runnable f819g;
    /* renamed from: h */
    private float[] f820h = new float[]{0.0f, 0.0f};
    /* renamed from: i */
    private float[] f821i = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
    /* renamed from: j */
    private int f822j;
    /* renamed from: k */
    private int f823k;
    /* renamed from: l */
    private float[] f824l = new float[]{0.0f, 0.0f};
    /* renamed from: m */
    private float[] f825m = new float[]{0.0f, 0.0f};
    /* renamed from: n */
    private float[] f826n = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
    /* renamed from: o */
    private boolean f827o;
    /* renamed from: p */
    private boolean f828p;
    /* renamed from: q */
    private boolean f829q;

    /* renamed from: android.support.v4.widget.a$a */
    private static class C0241a {
        /* renamed from: a */
        private int f800a;
        /* renamed from: b */
        private int f801b;
        /* renamed from: c */
        private float f802c;
        /* renamed from: d */
        private float f803d;
        /* renamed from: e */
        private long f804e = Long.MIN_VALUE;
        /* renamed from: f */
        private long f805f = 0;
        /* renamed from: g */
        private int f806g = 0;
        /* renamed from: h */
        private int f807h = 0;
        /* renamed from: i */
        private long f808i = -1;
        /* renamed from: j */
        private float f809j;
        /* renamed from: k */
        private int f810k;

        C0241a() {
        }

        /* renamed from: a */
        private float m930a(float f) {
            return ((-4.0f * f) * f) + (f * 4.0f);
        }

        /* renamed from: a */
        private float m931a(long j) {
            if (j < this.f804e) {
                return 0.0f;
            }
            if (this.f808i >= 0) {
                if (j >= this.f808i) {
                    return (1.0f - this.f809j) + (this.f809j * C0243a.m943a(((float) (j - this.f808i)) / ((float) this.f810k), 0.0f, 1.0f));
                }
            }
            return C0243a.m943a(((float) (j - this.f804e)) / ((float) this.f800a), 0.0f, 1.0f) * 0.5f;
        }

        /* renamed from: a */
        public void m932a() {
            this.f804e = AnimationUtils.currentAnimationTimeMillis();
            this.f808i = -1;
            this.f805f = this.f804e;
            this.f809j = 0.5f;
            this.f806g = 0;
            this.f807h = 0;
        }

        /* renamed from: a */
        public void m933a(float f, float f2) {
            this.f802c = f;
            this.f803d = f2;
        }

        /* renamed from: a */
        public void m934a(int i) {
            this.f800a = i;
        }

        /* renamed from: b */
        public void m935b() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f810k = C0243a.m946a((int) (currentAnimationTimeMillis - this.f804e), 0, this.f801b);
            this.f809j = m931a(currentAnimationTimeMillis);
            this.f808i = currentAnimationTimeMillis;
        }

        /* renamed from: b */
        public void m936b(int i) {
            this.f801b = i;
        }

        /* renamed from: c */
        public boolean m937c() {
            return this.f808i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f808i + ((long) this.f810k);
        }

        /* renamed from: d */
        public void m938d() {
            if (this.f805f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float a = m930a(m931a(currentAnimationTimeMillis));
                long j = currentAnimationTimeMillis - this.f805f;
                this.f805f = currentAnimationTimeMillis;
                float f = ((float) j) * a;
                this.f806g = (int) (this.f802c * f);
                this.f807h = (int) (f * this.f803d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: e */
        public int m939e() {
            return (int) (this.f802c / Math.abs(this.f802c));
        }

        /* renamed from: f */
        public int m940f() {
            return (int) (this.f803d / Math.abs(this.f803d));
        }

        /* renamed from: g */
        public int m941g() {
            return this.f806g;
        }

        /* renamed from: h */
        public int m942h() {
            return this.f807h;
        }
    }

    /* renamed from: android.support.v4.widget.a$b */
    private class C0242b implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0243a f811a;

        C0242b(C0243a c0243a) {
            this.f811a = c0243a;
        }

        public void run() {
            if (this.f811a.f817e) {
                if (this.f811a.f815c) {
                    this.f811a.f815c = false;
                    this.f811a.f813a.m932a();
                }
                C0241a c0241a = this.f811a.f813a;
                if (!c0241a.m937c()) {
                    if (this.f811a.m954a()) {
                        if (this.f811a.f816d) {
                            this.f811a.f816d = false;
                            this.f811a.m957b();
                        }
                        c0241a.m938d();
                        this.f811a.mo116a(c0241a.m941g(), c0241a.m942h());
                        C0227p.m873a(this.f811a.f814b, (Runnable) this);
                        return;
                    }
                }
                this.f811a.f817e = false;
            }
        }
    }

    public C0243a(View view) {
        this.f814b = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i = (int) ((displayMetrics.density * 1575.0f) + 0.5f);
        int i2 = (int) ((displayMetrics.density * 315.0f) + 0.5f);
        float f = (float) i;
        m950a(f, f);
        float f2 = (float) i2;
        m955b(f2, f2);
        m951a(1);
        m962e(Float.MAX_VALUE, Float.MAX_VALUE);
        m960d(0.2f, 0.2f);
        m958c(1.0f, 1.0f);
        m956b(f812r);
        m959c(500);
        m961d(500);
    }

    /* renamed from: a */
    static float m943a(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: a */
    private float m944a(float f, float f2, float f3, float f4) {
        f = C0243a.m943a(f * f2, 0.0f, f3);
        f = m949f(f2 - f4, f) - m949f(f4, f);
        if (f < 0.0f) {
            f = -this.f818f.getInterpolation(-f);
        } else if (f <= 0.0f) {
            return 0.0f;
        } else {
            f = this.f818f.getInterpolation(f);
        }
        return C0243a.m943a(f, -1.0f, 1.0f);
    }

    /* renamed from: a */
    private float m945a(int i, float f, float f2, float f3) {
        f = m944a(this.f820h[i], f2, this.f821i[i], f);
        if (f == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f824l[i];
        float f5 = this.f825m[i];
        float f6 = this.f826n[i];
        f4 *= f3;
        return f > 0.0f ? C0243a.m943a(f * f4, f5, f6) : -C0243a.m943a((-f) * f4, f5, f6);
    }

    /* renamed from: a */
    static int m946a(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: c */
    private void m947c() {
        if (this.f819g == null) {
            this.f819g = new C0242b(this);
        }
        this.f817e = true;
        this.f815c = true;
        if (this.f827o || this.f823k <= 0) {
            this.f819g.run();
        } else {
            C0227p.m874a(this.f814b, this.f819g, (long) this.f823k);
        }
        this.f827o = true;
    }

    /* renamed from: d */
    private void m948d() {
        if (this.f815c) {
            this.f817e = false;
        } else {
            this.f813a.m935b();
        }
    }

    /* renamed from: f */
    private float m949f(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        switch (this.f822j) {
            case 0:
            case 1:
                if (f < f2) {
                    return f >= 0.0f ? 1.0f - (f / f2) : (this.f817e && this.f822j == 1) ? 1.0f : 0.0f;
                }
                break;
            case 2:
                if (f < 0.0f) {
                    return f / (-f2);
                }
                break;
            default:
                break;
        }
    }

    /* renamed from: a */
    public C0243a m950a(float f, float f2) {
        this.f826n[0] = f / 1000.0f;
        this.f826n[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: a */
    public C0243a m951a(int i) {
        this.f822j = i;
        return this;
    }

    /* renamed from: a */
    public C0243a m952a(boolean z) {
        if (this.f828p && !z) {
            m948d();
        }
        this.f828p = z;
        return this;
    }

    /* renamed from: a */
    public abstract void mo116a(int i, int i2);

    /* renamed from: a */
    boolean m954a() {
        C0241a c0241a = this.f813a;
        int f = c0241a.m940f();
        int e = c0241a.m939e();
        return (f != 0 && mo118f(f)) || (e != 0 && mo117e(e));
    }

    /* renamed from: b */
    public C0243a m955b(float f, float f2) {
        this.f825m[0] = f / 1000.0f;
        this.f825m[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: b */
    public C0243a m956b(int i) {
        this.f823k = i;
        return this;
    }

    /* renamed from: b */
    void m957b() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f814b.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: c */
    public C0243a m958c(float f, float f2) {
        this.f824l[0] = f / 1000.0f;
        this.f824l[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: c */
    public C0243a m959c(int i) {
        this.f813a.m934a(i);
        return this;
    }

    /* renamed from: d */
    public C0243a m960d(float f, float f2) {
        this.f820h[0] = f;
        this.f820h[1] = f2;
        return this;
    }

    /* renamed from: d */
    public C0243a m961d(int i) {
        this.f813a.m936b(i);
        return this;
    }

    /* renamed from: e */
    public C0243a m962e(float f, float f2) {
        this.f821i[0] = f;
        this.f821i[1] = f2;
        return this;
    }

    /* renamed from: e */
    public abstract boolean mo117e(int i);

    /* renamed from: f */
    public abstract boolean mo118f(int i);

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z = false;
        if (!this.f828p) {
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f816d = true;
                this.f827o = false;
                break;
            case 1:
            case 3:
                m948d();
                break;
            case 2:
                break;
            default:
                break;
        }
        this.f813a.m933a(m945a(0, motionEvent.getX(), (float) view.getWidth(), (float) this.f814b.getWidth()), m945a(1, motionEvent.getY(), (float) view.getHeight(), (float) this.f814b.getHeight()));
        if (!this.f817e && m954a()) {
            m947c();
        }
        if (this.f829q && this.f817e) {
            z = true;
        }
        return z;
    }
}
