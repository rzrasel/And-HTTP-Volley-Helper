package android.support.v4.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.arch.lifecycle.C0029p;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.C0117l.C0115a;
import android.support.v4.app.C0117l.C0116b;
import android.support.v4.app.C0530g.C0110c;
import android.support.v4.p016f.C0183b;
import android.support.v4.p016f.C0185d;
import android.support.v4.p016f.C0186e;
import android.support.v4.p016f.C0195i;
import android.support.v4.p017g.C0227p;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: android.support.v4.app.m */
final class C0535m extends C0117l implements Factory2 {
    /* renamed from: F */
    static final Interpolator f1915F = new DecelerateInterpolator(2.5f);
    /* renamed from: G */
    static final Interpolator f1916G = new DecelerateInterpolator(1.5f);
    /* renamed from: H */
    static final Interpolator f1917H = new AccelerateInterpolator(2.5f);
    /* renamed from: I */
    static final Interpolator f1918I = new AccelerateInterpolator(1.5f);
    /* renamed from: a */
    static boolean f1919a = false;
    /* renamed from: q */
    static Field f1920q;
    /* renamed from: A */
    Bundle f1921A = null;
    /* renamed from: B */
    SparseArray<Parcelable> f1922B = null;
    /* renamed from: C */
    ArrayList<C0534h> f1923C;
    /* renamed from: D */
    C0129n f1924D;
    /* renamed from: E */
    Runnable f1925E = new C01181(this);
    /* renamed from: J */
    private final CopyOnWriteArrayList<C0195i<C0115a, Boolean>> f1926J = new CopyOnWriteArrayList();
    /* renamed from: b */
    ArrayList<C0128g> f1927b;
    /* renamed from: c */
    boolean f1928c;
    /* renamed from: d */
    int f1929d = 0;
    /* renamed from: e */
    final ArrayList<C0530g> f1930e = new ArrayList();
    /* renamed from: f */
    SparseArray<C0530g> f1931f;
    /* renamed from: g */
    ArrayList<C0528c> f1932g;
    /* renamed from: h */
    ArrayList<C0530g> f1933h;
    /* renamed from: i */
    ArrayList<C0528c> f1934i;
    /* renamed from: j */
    ArrayList<Integer> f1935j;
    /* renamed from: k */
    ArrayList<C0116b> f1936k;
    /* renamed from: l */
    int f1937l = 0;
    /* renamed from: m */
    C0531k f1938m;
    /* renamed from: n */
    C0113i f1939n;
    /* renamed from: o */
    C0530g f1940o;
    /* renamed from: p */
    C0530g f1941p;
    /* renamed from: r */
    boolean f1942r;
    /* renamed from: s */
    boolean f1943s;
    /* renamed from: t */
    boolean f1944t;
    /* renamed from: u */
    boolean f1945u;
    /* renamed from: v */
    String f1946v;
    /* renamed from: w */
    boolean f1947w;
    /* renamed from: x */
    ArrayList<C0528c> f1948x;
    /* renamed from: y */
    ArrayList<Boolean> f1949y;
    /* renamed from: z */
    ArrayList<C0530g> f1950z;

    /* renamed from: android.support.v4.app.m$1 */
    class C01181 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0535m f523a;

        C01181(C0535m c0535m) {
            this.f523a = c0535m;
        }

        public void run() {
            this.f523a.m2308e();
        }
    }

    /* renamed from: android.support.v4.app.m$b */
    private static class C0123b implements AnimationListener {
        /* renamed from: a */
        private final AnimationListener f534a;

        private C0123b(AnimationListener animationListener) {
            this.f534a = animationListener;
        }

        public void onAnimationEnd(Animation animation) {
            if (this.f534a != null) {
                this.f534a.onAnimationEnd(animation);
            }
        }

        public void onAnimationRepeat(Animation animation) {
            if (this.f534a != null) {
                this.f534a.onAnimationRepeat(animation);
            }
        }

        public void onAnimationStart(Animation animation) {
            if (this.f534a != null) {
                this.f534a.onAnimationStart(animation);
            }
        }
    }

    /* renamed from: android.support.v4.app.m$c */
    private static class C0124c {
        /* renamed from: a */
        public final Animation f535a;
        /* renamed from: b */
        public final Animator f536b;

        private C0124c(Animator animator) {
            this.f535a = null;
            this.f536b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        private C0124c(Animation animation) {
            this.f535a = animation;
            this.f536b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* renamed from: android.support.v4.app.m$d */
    private static class C0125d extends AnimatorListenerAdapter {
        /* renamed from: a */
        View f537a;

        C0125d(View view) {
            this.f537a = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f537a.setLayerType(0, null);
            animator.removeListener(this);
        }

        public void onAnimationStart(Animator animator) {
            this.f537a.setLayerType(2, null);
        }
    }

    /* renamed from: android.support.v4.app.m$e */
    private static class C0126e extends AnimationSet implements Runnable {
        /* renamed from: a */
        private final ViewGroup f538a;
        /* renamed from: b */
        private final View f539b;
        /* renamed from: c */
        private boolean f540c;
        /* renamed from: d */
        private boolean f541d;

        C0126e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f538a = viewGroup;
            this.f539b = view;
            addAnimation(animation);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            if (this.f540c) {
                return this.f541d ^ true;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f540c = true;
                C0152w.m553a(this.f538a, this);
            }
            return true;
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            if (this.f540c) {
                return this.f541d ^ true;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f540c = true;
                C0152w.m553a(this.f538a, this);
            }
            return true;
        }

        public void run() {
            this.f538a.endViewTransition(this.f539b);
            this.f541d = true;
        }
    }

    /* renamed from: android.support.v4.app.m$f */
    static class C0127f {
        /* renamed from: a */
        public static final int[] f542a = new int[]{16842755, 16842960, 16842961};
    }

    /* renamed from: android.support.v4.app.m$g */
    interface C0128g {
        /* renamed from: a */
        boolean mo38a(ArrayList<C0528c> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: android.support.v4.app.m$a */
    private static class C0533a extends C0123b {
        /* renamed from: a */
        View f1911a;

        /* renamed from: android.support.v4.app.m$a$1 */
        class C01221 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C0533a f533a;

            C01221(C0533a c0533a) {
                this.f533a = c0533a;
            }

            public void run() {
                this.f533a.f1911a.setLayerType(0, null);
            }
        }

        C0533a(View view, AnimationListener animationListener) {
            super(animationListener);
            this.f1911a = view;
        }

        public void onAnimationEnd(Animation animation) {
            if (!C0227p.m887m(this.f1911a)) {
                if (VERSION.SDK_INT < 24) {
                    this.f1911a.setLayerType(0, null);
                    super.onAnimationEnd(animation);
                }
            }
            this.f1911a.post(new C01221(this));
            super.onAnimationEnd(animation);
        }
    }

    /* renamed from: android.support.v4.app.m$h */
    static class C0534h implements C0110c {
        /* renamed from: a */
        private final boolean f1912a;
        /* renamed from: b */
        private final C0528c f1913b;
        /* renamed from: c */
        private int f1914c;

        C0534h(C0528c c0528c, boolean z) {
            this.f1912a = z;
            this.f1913b = c0528c;
        }

        /* renamed from: a */
        public void mo44a() {
            this.f1914c--;
            if (this.f1914c == 0) {
                this.f1913b.f1833a.m2261y();
            }
        }

        /* renamed from: b */
        public void mo45b() {
            this.f1914c++;
        }

        /* renamed from: c */
        public boolean m2227c() {
            return this.f1914c == 0;
        }

        /* renamed from: d */
        public void m2228d() {
            int i = this.f1914c > 0 ? 1 : 0;
            C0535m c0535m = this.f1913b.f1833a;
            int size = c0535m.f1930e.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0530g c0530g = (C0530g) c0535m.f1930e.get(i2);
                c0530g.m2149a(null);
                if (i != 0 && c0530g.m2131W()) {
                    c0530g.m2111C();
                }
            }
            this.f1913b.f1833a.m2237a(this.f1913b, this.f1912a, i ^ true, true);
        }

        /* renamed from: e */
        public void m2229e() {
            this.f1913b.f1833a.m2237a(this.f1913b, this.f1912a, false, false);
        }
    }

    C0535m() {
    }

    /* renamed from: A */
    private void m2230A() {
        if (this.f1923C != null) {
            while (!this.f1923C.isEmpty()) {
                ((C0534h) this.f1923C.remove(0)).m2228d();
            }
        }
    }

    /* renamed from: B */
    private void m2231B() {
        int i = 0;
        int size = this.f1931f == null ? 0 : this.f1931f.size();
        while (i < size) {
            C0530g c0530g = (C0530g) this.f1931f.valueAt(i);
            if (c0530g != null) {
                if (c0530g.m2128T() != null) {
                    int V = c0530g.m2130V();
                    View T = c0530g.m2128T();
                    Animation animation = T.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        T.clearAnimation();
                    }
                    c0530g.m2153a(null);
                    m2273a(c0530g, V, 0, 0, false);
                } else if (c0530g.m2129U() != null) {
                    c0530g.m2129U().end();
                }
            }
            i++;
        }
    }

    /* renamed from: C */
    private void m2232C() {
        if (this.f1931f != null) {
            for (int size = this.f1931f.size() - 1; size >= 0; size--) {
                if (this.f1931f.valueAt(size) == null) {
                    this.f1931f.delete(this.f1931f.keyAt(size));
                }
            }
        }
    }

    /* renamed from: a */
    private int m2233a(ArrayList<C0528c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C0183b<C0530g> c0183b) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C0528c c0528c = (C0528c) arrayList.get(i4);
            boolean booleanValue = ((Boolean) arrayList2.get(i4)).booleanValue();
            Object obj = (!c0528c.m2099c() || c0528c.m2094a((ArrayList) arrayList, i4 + 1, i2)) ? null : 1;
            if (obj != null) {
                if (this.f1923C == null) {
                    this.f1923C = new ArrayList();
                }
                C0110c c0534h = new C0534h(c0528c, booleanValue);
                this.f1923C.add(c0534h);
                c0528c.m2090a(c0534h);
                if (booleanValue) {
                    c0528c.m2097b();
                } else {
                    c0528c.m2093a(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, c0528c);
                }
                m2251b((C0183b) c0183b);
            }
        }
        return i3;
    }

    /* renamed from: a */
    static C0124c m2234a(Context context, float f, float f2) {
        Animation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(f1916G);
        alphaAnimation.setDuration(220);
        return new C0124c(alphaAnimation);
    }

    /* renamed from: a */
    static C0124c m2235a(Context context, float f, float f2, float f3, float f4) {
        Animation animationSet = new AnimationSet(false);
        Animation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f1915F);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        Animation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(f1916G);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new C0124c(animationSet);
    }

    /* renamed from: a */
    private static AnimationListener m2236a(Animation animation) {
        Throwable e;
        String str;
        String str2;
        try {
            if (f1920q == null) {
                f1920q = Animation.class.getDeclaredField("mListener");
                f1920q.setAccessible(true);
            }
            return (AnimationListener) f1920q.get(animation);
        } catch (NoSuchFieldException e2) {
            e = e2;
            str = "FragmentManager";
            str2 = "No field with the name mListener is found in Animation class";
            Log.e(str, str2, e);
            return null;
        } catch (IllegalAccessException e3) {
            e = e3;
            str = "FragmentManager";
            str2 = "Cannot access Animation's mListener field";
            Log.e(str, str2, e);
            return null;
        }
    }

    /* renamed from: a */
    private void m2237a(C0528c c0528c, boolean z, boolean z2, boolean z3) {
        if (z) {
            c0528c.m2093a(z3);
        } else {
            c0528c.m2097b();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c0528c);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C0140r.m499a(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z3) {
            m2267a(this.f1937l, true);
        }
        if (this.f1931f != null) {
            int size = this.f1931f.size();
            for (int i = 0; i < size; i++) {
                C0530g c0530g = (C0530g) this.f1931f.valueAt(i);
                if (c0530g != null && c0530g.f1866J != null && c0530g.f1872P && c0528c.m2098b(c0530g.f1902z)) {
                    if (c0530g.f1874R > 0.0f) {
                        c0530g.f1866J.setAlpha(c0530g.f1874R);
                    }
                    if (z3) {
                        c0530g.f1874R = 0.0f;
                    } else {
                        c0530g.f1874R = -1.0f;
                        c0530g.f1872P = false;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m2238a(final C0530g c0530g, C0124c c0124c, int i) {
        final View view = c0530g.f1866J;
        final ViewGroup viewGroup = c0530g.f1865I;
        viewGroup.startViewTransition(view);
        c0530g.m2160b(i);
        if (c0124c.f535a != null) {
            Animation c0126e = new C0126e(c0124c.f535a, viewGroup, view);
            c0530g.m2153a(c0530g.f1866J);
            c0126e.setAnimationListener(new C0123b(this, C0535m.m2236a(c0126e)) {
                /* renamed from: c */
                final /* synthetic */ C0535m f1910c;

                /* renamed from: android.support.v4.app.m$2$1 */
                class C01191 implements Runnable {
                    /* renamed from: a */
                    final /* synthetic */ C05322 f524a;

                    C01191(C05322 c05322) {
                        this.f524a = c05322;
                    }

                    public void run() {
                        if (c0530g.m2128T() != null) {
                            c0530g.m2153a(null);
                            this.f524a.f1910c.m2273a(c0530g, c0530g.m2130V(), 0, 0, false);
                        }
                    }
                }

                public void onAnimationEnd(Animation animation) {
                    super.onAnimationEnd(animation);
                    viewGroup.post(new C01191(this));
                }
            });
            C0535m.m2252b(view, c0124c);
            c0530g.f1866J.startAnimation(c0126e);
            return;
        }
        Animator animator = c0124c.f536b;
        c0530g.m2142a(c0124c.f536b);
        animator.addListener(new AnimatorListenerAdapter(this) {
            /* renamed from: d */
            final /* synthetic */ C0535m f528d;

            public void onAnimationEnd(Animator animator) {
                viewGroup.endViewTransition(view);
                animator = c0530g.m2129U();
                c0530g.m2142a(null);
                if (animator != null && viewGroup.indexOfChild(view) < 0) {
                    this.f528d.m2273a(c0530g, c0530g.m2130V(), 0, 0, false);
                }
            }
        });
        animator.setTarget(c0530g.f1866J);
        C0535m.m2252b(c0530g.f1866J, c0124c);
        animator.start();
    }

    /* renamed from: a */
    private static void m2241a(C0129n c0129n) {
        if (c0129n != null) {
            List<C0530g> a = c0129n.m475a();
            if (a != null) {
                for (C0530g c0530g : a) {
                    c0530g.f1861E = true;
                }
            }
            List<C0129n> b = c0129n.m476b();
            if (b != null) {
                for (C0129n a2 : b) {
                    C0535m.m2241a(a2);
                }
            }
        }
    }

    /* renamed from: a */
    private void m2242a(C0183b<C0530g> c0183b) {
        int size = c0183b.size();
        for (int i = 0; i < size; i++) {
            C0530g c0530g = (C0530g) c0183b.m663b(i);
            if (!c0530g.f1888l) {
                View k = c0530g.m2191k();
                c0530g.f1874R = k.getAlpha();
                k.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: a */
    private void m2243a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0186e("FragmentManager"));
        if (this.f1938m != null) {
            try {
                this.f1938m.mo448a("  ", null, printWriter, new String[0]);
            } catch (Throwable e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            mo46a("  ", null, printWriter, new String[0]);
        }
        throw runtimeException;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m2244a(java.util.ArrayList<android.support.v4.app.C0528c> r8, java.util.ArrayList<java.lang.Boolean> r9) {
        /*
        r7 = this;
        r0 = r7.f1923C;
        r1 = 0;
        if (r0 != 0) goto L_0x0007;
    L_0x0005:
        r0 = 0;
        goto L_0x000d;
    L_0x0007:
        r0 = r7.f1923C;
        r0 = r0.size();
    L_0x000d:
        r2 = r0;
        r0 = 0;
    L_0x000f:
        if (r0 >= r2) goto L_0x0080;
    L_0x0011:
        r3 = r7.f1923C;
        r3 = r3.get(r0);
        r3 = (android.support.v4.app.C0535m.C0534h) r3;
        r4 = -1;
        if (r8 == 0) goto L_0x003c;
    L_0x001c:
        r5 = r3.f1912a;
        if (r5 != 0) goto L_0x003c;
    L_0x0022:
        r5 = r3.f1913b;
        r5 = r8.indexOf(r5);
        if (r5 == r4) goto L_0x003c;
    L_0x002c:
        r5 = r9.get(r5);
        r5 = (java.lang.Boolean) r5;
        r5 = r5.booleanValue();
        if (r5 == 0) goto L_0x003c;
    L_0x0038:
        r3.m2229e();
        goto L_0x007d;
    L_0x003c:
        r5 = r3.m2227c();
        if (r5 != 0) goto L_0x0052;
    L_0x0042:
        if (r8 == 0) goto L_0x007d;
    L_0x0044:
        r5 = r3.f1913b;
        r6 = r8.size();
        r5 = r5.m2094a(r8, r1, r6);
        if (r5 == 0) goto L_0x007d;
    L_0x0052:
        r5 = r7.f1923C;
        r5.remove(r0);
        r0 = r0 + -1;
        r2 = r2 + -1;
        if (r8 == 0) goto L_0x007a;
    L_0x005d:
        r5 = r3.f1912a;
        if (r5 != 0) goto L_0x007a;
    L_0x0063:
        r5 = r3.f1913b;
        r5 = r8.indexOf(r5);
        if (r5 == r4) goto L_0x007a;
    L_0x006d:
        r4 = r9.get(r5);
        r4 = (java.lang.Boolean) r4;
        r4 = r4.booleanValue();
        if (r4 == 0) goto L_0x007a;
    L_0x0079:
        goto L_0x0038;
    L_0x007a:
        r3.m2228d();
    L_0x007d:
        r0 = r0 + 1;
        goto L_0x000f;
    L_0x0080:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.m.a(java.util.ArrayList, java.util.ArrayList):void");
    }

    /* renamed from: a */
    private void m2245a(ArrayList<C0528c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        int i4;
        ArrayList<C0528c> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i5 = i;
        int i6 = i2;
        boolean z = ((C0528c) arrayList3.get(i5)).f1852t;
        if (this.f1950z == null) {
            r6.f1950z = new ArrayList();
        } else {
            r6.f1950z.clear();
        }
        r6.f1950z.addAll(r6.f1930e);
        C0530g v = m2338v();
        Object obj = null;
        for (i3 = i5; i3 < i6; i3++) {
            C0528c c0528c = (C0528c) arrayList3.get(i3);
            v = !((Boolean) arrayList4.get(i3)).booleanValue() ? c0528c.m2086a(r6.f1950z, v) : c0528c.m2096b(r6.f1950z, v);
            if (obj == null) {
                if (!c0528c.f1841i) {
                    obj = null;
                }
            }
            obj = 1;
        }
        r6.f1950z.clear();
        if (!z) {
            C0140r.m499a(this, (ArrayList) arrayList, (ArrayList) arrayList2, i, i2, false);
        }
        C0535m.m2254b(arrayList, arrayList2, i, i2);
        if (z) {
            C0183b c0183b = new C0183b();
            m2251b(c0183b);
            i3 = m2233a((ArrayList) arrayList, (ArrayList) arrayList2, i, i2, c0183b);
            m2242a(c0183b);
            i4 = i3;
        } else {
            i4 = i6;
        }
        if (i4 != i5 && z) {
            C0140r.m499a(this, (ArrayList) arrayList, (ArrayList) arrayList2, i, i4, true);
            m2267a(r6.f1937l, true);
        }
        while (i5 < i6) {
            C0528c c0528c2 = (C0528c) arrayList3.get(i5);
            if (((Boolean) arrayList4.get(i5)).booleanValue() && c0528c2.f1845m >= 0) {
                m2297c(c0528c2.f1845m);
                c0528c2.f1845m = -1;
            }
            c0528c2.m2087a();
            i5++;
        }
        if (obj != null) {
            m2312g();
        }
    }

    /* renamed from: a */
    static boolean m2246a(Animator animator) {
        if (animator == null) {
            return false;
        }
        int i;
        if (animator instanceof ValueAnimator) {
            PropertyValuesHolder[] values = ((ValueAnimator) animator).getValues();
            for (PropertyValuesHolder propertyName : values) {
                if ("alpha".equals(propertyName.getPropertyName())) {
                    return true;
                }
            }
        } else if (animator instanceof AnimatorSet) {
            List childAnimations = ((AnimatorSet) animator).getChildAnimations();
            for (i = 0; i < childAnimations.size(); i++) {
                if (C0535m.m2246a((Animator) childAnimations.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m2247a(C0124c c0124c) {
        if (c0124c.f535a instanceof AlphaAnimation) {
            return true;
        }
        if (!(c0124c.f535a instanceof AnimationSet)) {
            return C0535m.m2246a(c0124c.f536b);
        }
        List animations = ((AnimationSet) c0124c.f535a).getAnimations();
        for (int i = 0; i < animations.size(); i++) {
            if (animations.get(i) instanceof AlphaAnimation) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m2248a(View view, C0124c c0124c) {
        return view != null ? c0124c == null ? false : VERSION.SDK_INT >= 19 && view.getLayerType() == 0 && C0227p.m882h(view) && C0535m.m2247a(c0124c) : false;
    }

    /* renamed from: a */
    private boolean m2249a(String str, int i, int i2) {
        m2308e();
        m2255c(true);
        if (this.f1941p != null && i < 0 && str == null) {
            C0117l j = this.f1941p.m2189j();
            if (j != null && j.mo47a()) {
                return true;
            }
        }
        boolean a = m2286a(this.f1948x, this.f1949y, str, i, i2);
        if (a) {
            this.f1928c = true;
            try {
                m2253b(this.f1948x, this.f1949y);
            } finally {
                m2262z();
            }
        }
        m2309f();
        m2232C();
        return a;
    }

    /* renamed from: b */
    public static int m2250b(int i, boolean z) {
        return i != 4097 ? i != 4099 ? i != 8194 ? -1 : z ? 3 : 4 : z ? 5 : 6 : z ? 1 : 2;
    }

    /* renamed from: b */
    private void m2251b(C0183b<C0530g> c0183b) {
        if (this.f1937l >= 1) {
            int min = Math.min(this.f1937l, 4);
            int size = this.f1930e.size();
            for (int i = 0; i < size; i++) {
                C0530g c0530g = (C0530g) this.f1930e.get(i);
                if (c0530g.f1878b < min) {
                    m2273a(c0530g, min, c0530g.m2123O(), c0530g.m2124P(), false);
                    if (!(c0530g.f1866J == null || c0530g.f1858B || !c0530g.f1872P)) {
                        c0183b.add(c0530g);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private static void m2252b(View view, C0124c c0124c) {
        if (view == null) {
            return;
        }
        if (c0124c != null) {
            if (!C0535m.m2248a(view, c0124c)) {
                return;
            }
            if (c0124c.f536b != null) {
                c0124c.f536b.addListener(new C0125d(view));
                return;
            }
            AnimationListener a = C0535m.m2236a(c0124c.f535a);
            view.setLayerType(2, null);
            c0124c.f535a.setAnimationListener(new C0533a(view, a));
        }
    }

    /* renamed from: b */
    private void m2253b(ArrayList<C0528c> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                    throw new IllegalStateException("Internal error with the back stack records");
                }
                m2244a((ArrayList) arrayList, (ArrayList) arrayList2);
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!((C0528c) arrayList.get(i)).f1852t) {
                        if (i2 != i) {
                            m2245a((ArrayList) arrayList, (ArrayList) arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (((Boolean) arrayList2.get(i)).booleanValue()) {
                            while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0528c) arrayList.get(i2)).f1852t) {
                                i2++;
                            }
                        }
                        m2245a((ArrayList) arrayList, (ArrayList) arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    m2245a((ArrayList) arrayList, (ArrayList) arrayList2, i2, size);
                }
            }
        }
    }

    /* renamed from: b */
    private static void m2254b(ArrayList<C0528c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C0528c c0528c = (C0528c) arrayList.get(i);
            boolean z = true;
            if (((Boolean) arrayList2.get(i)).booleanValue()) {
                c0528c.m2088a(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                c0528c.m2093a(z);
            } else {
                c0528c.m2088a(1);
                c0528c.m2097b();
            }
            i++;
        }
    }

    /* renamed from: c */
    private void m2255c(boolean z) {
        if (this.f1928c) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f1938m == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() == this.f1938m.m2221h().getLooper()) {
            if (!z) {
                m2260x();
            }
            if (this.f1948x == null) {
                this.f1948x = new ArrayList();
                this.f1949y = new ArrayList();
            }
            this.f1928c = true;
            try {
                m2244a(null, null);
            } finally {
                this.f1928c = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: c */
    private boolean m2256c(java.util.ArrayList<android.support.v4.app.C0528c> r5, java.util.ArrayList<java.lang.Boolean> r6) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.f1927b;	 Catch:{ all -> 0x003c }
        r1 = 0;
        if (r0 == 0) goto L_0x003a;
    L_0x0006:
        r0 = r4.f1927b;	 Catch:{ all -> 0x003c }
        r0 = r0.size();	 Catch:{ all -> 0x003c }
        if (r0 != 0) goto L_0x000f;
    L_0x000e:
        goto L_0x003a;
    L_0x000f:
        r0 = r4.f1927b;	 Catch:{ all -> 0x003c }
        r0 = r0.size();	 Catch:{ all -> 0x003c }
        r2 = 0;
    L_0x0016:
        if (r1 >= r0) goto L_0x0028;
    L_0x0018:
        r3 = r4.f1927b;	 Catch:{ all -> 0x003c }
        r3 = r3.get(r1);	 Catch:{ all -> 0x003c }
        r3 = (android.support.v4.app.C0535m.C0128g) r3;	 Catch:{ all -> 0x003c }
        r3 = r3.mo38a(r5, r6);	 Catch:{ all -> 0x003c }
        r2 = r2 | r3;
        r1 = r1 + 1;
        goto L_0x0016;
    L_0x0028:
        r5 = r4.f1927b;	 Catch:{ all -> 0x003c }
        r5.clear();	 Catch:{ all -> 0x003c }
        r5 = r4.f1938m;	 Catch:{ all -> 0x003c }
        r5 = r5.m2221h();	 Catch:{ all -> 0x003c }
        r6 = r4.f1925E;	 Catch:{ all -> 0x003c }
        r5.removeCallbacks(r6);	 Catch:{ all -> 0x003c }
        monitor-exit(r4);	 Catch:{ all -> 0x003c }
        return r2;
    L_0x003a:
        monitor-exit(r4);	 Catch:{ all -> 0x003c }
        return r1;
    L_0x003c:
        r5 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x003c }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.m.c(java.util.ArrayList, java.util.ArrayList):boolean");
    }

    /* renamed from: d */
    public static int m2257d(int i) {
        return i != 4097 ? i != 4099 ? i != 8194 ? 0 : 4097 : 4099 : 8194;
    }

    /* renamed from: e */
    private void m2258e(int i) {
        try {
            this.f1928c = true;
            m2267a(i, false);
            m2308e();
        } finally {
            this.f1928c = false;
        }
    }

    /* renamed from: p */
    private C0530g m2259p(C0530g c0530g) {
        ViewGroup viewGroup = c0530g.f1865I;
        View view = c0530g.f1866J;
        if (viewGroup != null) {
            if (view != null) {
                for (int indexOf = this.f1930e.indexOf(c0530g) - 1; indexOf >= 0; indexOf--) {
                    C0530g c0530g2 = (C0530g) this.f1930e.get(indexOf);
                    if (c0530g2.f1865I == viewGroup && c0530g2.f1866J != null) {
                        return c0530g2;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: x */
    private void m2260x() {
        if (mo49c()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.f1946v != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can not perform this action inside of ");
            stringBuilder.append(this.f1946v);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: y */
    private void m2261y() {
        synchronized (this) {
            Object obj = null;
            Object obj2 = (this.f1923C == null || this.f1923C.isEmpty()) ? null : 1;
            if (this.f1927b != null && this.f1927b.size() == 1) {
                obj = 1;
            }
            if (!(obj2 == null && r1 == null)) {
                this.f1938m.m2221h().removeCallbacks(this.f1925E);
                this.f1938m.m2221h().post(this.f1925E);
            }
        }
    }

    /* renamed from: z */
    private void m2262z() {
        this.f1928c = false;
        this.f1949y.clear();
        this.f1948x.clear();
    }

    /* renamed from: a */
    public C0530g m2263a(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        C0530g c0530g = (C0530g) this.f1931f.get(i);
        if (c0530g == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment no longer exists for key ");
            stringBuilder.append(str);
            stringBuilder.append(": index ");
            stringBuilder.append(i);
            m2243a(new IllegalStateException(stringBuilder.toString()));
        }
        return c0530g;
    }

    /* renamed from: a */
    public C0530g m2264a(String str) {
        int size;
        C0530g c0530g;
        if (str != null) {
            for (size = this.f1930e.size() - 1; size >= 0; size--) {
                c0530g = (C0530g) this.f1930e.get(size);
                if (c0530g != null && str.equals(c0530g.f1857A)) {
                    return c0530g;
                }
            }
        }
        if (!(this.f1931f == null || str == null)) {
            for (size = this.f1931f.size() - 1; size >= 0; size--) {
                c0530g = (C0530g) this.f1931f.valueAt(size);
                if (c0530g != null && str.equals(c0530g.f1857A)) {
                    return c0530g;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    android.support.v4.app.C0535m.C0124c m2265a(android.support.v4.app.C0530g r6, int r7, boolean r8, int r9) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/1763344271.run(Unknown Source)
*/
        /*
        r5 = this;
        r0 = r6.m2123O();
        r1 = r6.m2136a(r7, r8, r0);
        r2 = 0;
        if (r1 == 0) goto L_0x0011;
    L_0x000b:
        r6 = new android.support.v4.app.m$c;
        r6.<init>(r1);
        return r6;
    L_0x0011:
        r6 = r6.m2158b(r7, r8, r0);
        if (r6 == 0) goto L_0x001d;
    L_0x0017:
        r7 = new android.support.v4.app.m$c;
        r7.<init>(r6);
        return r7;
    L_0x001d:
        if (r0 == 0) goto L_0x0076;
    L_0x001f:
        r6 = r5.f1938m;
        r6 = r6.m2220g();
        r6 = r6.getResources();
        r6 = r6.getResourceTypeName(r0);
        r1 = "anim";
        r6 = r1.equals(r6);
        r1 = 0;
        if (r6 == 0) goto L_0x004c;
    L_0x0036:
        r3 = r5.f1938m;	 Catch:{ NotFoundException -> 0x004a, RuntimeException -> 0x004c }
        r3 = r3.m2220g();	 Catch:{ NotFoundException -> 0x004a, RuntimeException -> 0x004c }
        r3 = android.view.animation.AnimationUtils.loadAnimation(r3, r0);	 Catch:{ NotFoundException -> 0x004a, RuntimeException -> 0x004c }
        if (r3 == 0) goto L_0x0048;	 Catch:{ NotFoundException -> 0x004a, RuntimeException -> 0x004c }
    L_0x0042:
        r4 = new android.support.v4.app.m$c;	 Catch:{ NotFoundException -> 0x004a, RuntimeException -> 0x004c }
        r4.<init>(r3);	 Catch:{ NotFoundException -> 0x004a, RuntimeException -> 0x004c }
        return r4;
    L_0x0048:
        r1 = 1;
        goto L_0x004c;
    L_0x004a:
        r6 = move-exception;
        throw r6;
    L_0x004c:
        if (r1 != 0) goto L_0x0076;
    L_0x004e:
        r1 = r5.f1938m;	 Catch:{ RuntimeException -> 0x0060 }
        r1 = r1.m2220g();	 Catch:{ RuntimeException -> 0x0060 }
        r1 = android.animation.AnimatorInflater.loadAnimator(r1, r0);	 Catch:{ RuntimeException -> 0x0060 }
        if (r1 == 0) goto L_0x0076;	 Catch:{ RuntimeException -> 0x0060 }
    L_0x005a:
        r3 = new android.support.v4.app.m$c;	 Catch:{ RuntimeException -> 0x0060 }
        r3.<init>(r1);	 Catch:{ RuntimeException -> 0x0060 }
        return r3;
    L_0x0060:
        r1 = move-exception;
        if (r6 != 0) goto L_0x0075;
    L_0x0063:
        r6 = r5.f1938m;
        r6 = r6.m2220g();
        r6 = android.view.animation.AnimationUtils.loadAnimation(r6, r0);
        if (r6 == 0) goto L_0x0076;
    L_0x006f:
        r7 = new android.support.v4.app.m$c;
        r7.<init>(r6);
        return r7;
    L_0x0075:
        throw r1;
    L_0x0076:
        if (r7 != 0) goto L_0x0079;
    L_0x0078:
        return r2;
    L_0x0079:
        r6 = android.support.v4.app.C0535m.m2250b(r7, r8);
        if (r6 >= 0) goto L_0x0080;
    L_0x007f:
        return r2;
    L_0x0080:
        r7 = 1064933786; // 0x3f79999a float:0.975 double:5.26147199E-315;
        r8 = 0;
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        switch(r6) {
            case 1: goto L_0x00d4;
            case 2: goto L_0x00c9;
            case 3: goto L_0x00be;
            case 4: goto L_0x00b0;
            case 5: goto L_0x00a5;
            case 6: goto L_0x009a;
            default: goto L_0x0089;
        };
    L_0x0089:
        if (r9 != 0) goto L_0x00e1;
    L_0x008b:
        r6 = r5.f1938m;
        r6 = r6.mo453d();
        if (r6 == 0) goto L_0x00e1;
    L_0x0093:
        r6 = r5.f1938m;
        r9 = r6.mo454e();
        goto L_0x00e1;
    L_0x009a:
        r6 = r5.f1938m;
        r6 = r6.m2220g();
        r6 = android.support.v4.app.C0535m.m2234a(r6, r0, r8);
        return r6;
    L_0x00a5:
        r6 = r5.f1938m;
        r6 = r6.m2220g();
        r6 = android.support.v4.app.C0535m.m2234a(r6, r8, r0);
        return r6;
    L_0x00b0:
        r6 = r5.f1938m;
        r6 = r6.m2220g();
        r7 = 1065982362; // 0x3f89999a float:1.075 double:5.26665264E-315;
        r6 = android.support.v4.app.C0535m.m2235a(r6, r0, r7, r0, r8);
        return r6;
    L_0x00be:
        r6 = r5.f1938m;
        r6 = r6.m2220g();
        r6 = android.support.v4.app.C0535m.m2235a(r6, r7, r0, r8, r0);
        return r6;
    L_0x00c9:
        r6 = r5.f1938m;
        r6 = r6.m2220g();
        r6 = android.support.v4.app.C0535m.m2235a(r6, r0, r7, r0, r8);
        return r6;
    L_0x00d4:
        r6 = r5.f1938m;
        r6 = r6.m2220g();
        r7 = 1066401792; // 0x3f900000 float:1.125 double:5.2687249E-315;
        r6 = android.support.v4.app.C0535m.m2235a(r6, r7, r0, r8, r0);
        return r6;
    L_0x00e1:
        if (r9 != 0) goto L_0x00e3;
    L_0x00e3:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.m.a(android.support.v4.app.g, int, boolean, int):android.support.v4.app.m$c");
    }

    /* renamed from: a */
    public void m2266a(int i, C0528c c0528c) {
        synchronized (this) {
            if (this.f1934i == null) {
                this.f1934i = new ArrayList();
            }
            int size = this.f1934i.size();
            StringBuilder stringBuilder;
            if (i < size) {
                if (f1919a) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Setting back stack index ");
                    stringBuilder.append(i);
                    stringBuilder.append(" to ");
                    stringBuilder.append(c0528c);
                    Log.v("FragmentManager", stringBuilder.toString());
                }
                this.f1934i.set(i, c0528c);
            } else {
                while (size < i) {
                    this.f1934i.add(null);
                    if (this.f1935j == null) {
                        this.f1935j = new ArrayList();
                    }
                    if (f1919a) {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Adding available back stack index ");
                        stringBuilder2.append(size);
                        Log.v("FragmentManager", stringBuilder2.toString());
                    }
                    this.f1935j.add(Integer.valueOf(size));
                    size++;
                }
                if (f1919a) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Adding back stack index ");
                    stringBuilder.append(i);
                    stringBuilder.append(" with ");
                    stringBuilder.append(c0528c);
                    Log.v("FragmentManager", stringBuilder.toString());
                }
                this.f1934i.add(c0528c);
            }
        }
    }

    /* renamed from: a */
    void m2267a(int i, boolean z) {
        if (this.f1938m == null) {
            if (i != 0) {
                throw new IllegalStateException("No activity");
            }
        }
        if (z || i != this.f1937l) {
            this.f1937l = i;
            if (this.f1931f != null) {
                int i2;
                i = this.f1930e.size();
                for (i2 = 0; i2 < i; i2++) {
                    m2306e((C0530g) this.f1930e.get(i2));
                }
                i = this.f1931f.size();
                for (i2 = 0; i2 < i; i2++) {
                    C0530g c0530g = (C0530g) this.f1931f.valueAt(i2);
                    if (c0530g != null && ((c0530g.f1889m || c0530g.f1859C) && !c0530g.f1872P)) {
                        m2306e(c0530g);
                    }
                }
                m2302d();
                if (this.f1942r && this.f1938m != null && this.f1937l == 5) {
                    this.f1938m.mo452c();
                    this.f1942r = false;
                }
            }
        }
    }

    /* renamed from: a */
    public void m2268a(Configuration configuration) {
        for (int i = 0; i < this.f1930e.size(); i++) {
            C0530g c0530g = (C0530g) this.f1930e.get(i);
            if (c0530g != null) {
                c0530g.m2147a(configuration);
            }
        }
    }

    /* renamed from: a */
    public void m2269a(Bundle bundle, String str, C0530g c0530g) {
        if (c0530g.f1882f < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(c0530g);
            stringBuilder.append(" is not currently in the FragmentManager");
            m2243a(new IllegalStateException(stringBuilder.toString()));
        }
        bundle.putInt(str, c0530g.f1882f);
    }

    /* renamed from: a */
    void m2270a(Parcelable parcelable, C0129n c0129n) {
        if (parcelable != null) {
            C0131o c0131o = (C0131o) parcelable;
            if (c0131o.f546a != null) {
                List b;
                List c;
                int i;
                if (c0129n != null) {
                    List a = c0129n.m475a();
                    b = c0129n.m476b();
                    c = c0129n.m477c();
                    int size = a != null ? a.size() : 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        C0530g c0530g = (C0530g) a.get(i2);
                        if (f1919a) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("restoreAllState: re-attaching retained ");
                            stringBuilder.append(c0530g);
                            Log.v("FragmentManager", stringBuilder.toString());
                        }
                        int i3 = 0;
                        while (i3 < c0131o.f546a.length && c0131o.f546a[i3].f552b != c0530g.f1882f) {
                            i3++;
                        }
                        if (i3 == c0131o.f546a.length) {
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("Could not find active fragment with index ");
                            stringBuilder2.append(c0530g.f1882f);
                            m2243a(new IllegalStateException(stringBuilder2.toString()));
                        }
                        C0133p c0133p = c0131o.f546a[i3];
                        c0133p.f562l = c0530g;
                        c0530g.f1880d = null;
                        c0530g.f1894r = 0;
                        c0530g.f1891o = false;
                        c0530g.f1888l = false;
                        c0530g.f1885i = null;
                        if (c0133p.f561k != null) {
                            c0133p.f561k.setClassLoader(this.f1938m.m2220g().getClassLoader());
                            c0530g.f1880d = c0133p.f561k.getSparseParcelableArray("android:view_state");
                            c0530g.f1879c = c0133p.f561k;
                        }
                    }
                } else {
                    b = null;
                    c = b;
                }
                this.f1931f = new SparseArray(c0131o.f546a.length);
                int i4 = 0;
                while (i4 < c0131o.f546a.length) {
                    C0133p c0133p2 = c0131o.f546a[i4];
                    if (c0133p2 != null) {
                        C0129n c0129n2 = (b == null || i4 >= b.size()) ? null : (C0129n) b.get(i4);
                        C0029p c0029p = (c == null || i4 >= c.size()) ? null : (C0029p) c.get(i4);
                        C0530g a2 = c0133p2.m482a(this.f1938m, this.f1939n, this.f1940o, c0129n2, c0029p);
                        if (f1919a) {
                            StringBuilder stringBuilder3 = new StringBuilder();
                            stringBuilder3.append("restoreAllState: active #");
                            stringBuilder3.append(i4);
                            stringBuilder3.append(": ");
                            stringBuilder3.append(a2);
                            Log.v("FragmentManager", stringBuilder3.toString());
                        }
                        this.f1931f.put(a2.f1882f, a2);
                        c0133p2.f562l = null;
                    }
                    i4++;
                }
                if (c0129n != null) {
                    List a3 = c0129n.m475a();
                    i4 = a3 != null ? a3.size() : 0;
                    for (int i5 = 0; i5 < i4; i5++) {
                        C0530g c0530g2 = (C0530g) a3.get(i5);
                        if (c0530g2.f1886j >= 0) {
                            c0530g2.f1885i = (C0530g) this.f1931f.get(c0530g2.f1886j);
                            if (c0530g2.f1885i == null) {
                                StringBuilder stringBuilder4 = new StringBuilder();
                                stringBuilder4.append("Re-attaching retained fragment ");
                                stringBuilder4.append(c0530g2);
                                stringBuilder4.append(" target no longer exists: ");
                                stringBuilder4.append(c0530g2.f1886j);
                                Log.w("FragmentManager", stringBuilder4.toString());
                            }
                        }
                    }
                }
                this.f1930e.clear();
                if (c0131o.f547b != null) {
                    for (i = 0; i < c0131o.f547b.length; i++) {
                        StringBuilder stringBuilder5;
                        C0530g c0530g3 = (C0530g) this.f1931f.get(c0131o.f547b[i]);
                        if (c0530g3 == null) {
                            stringBuilder5 = new StringBuilder();
                            stringBuilder5.append("No instantiated fragment for index #");
                            stringBuilder5.append(c0131o.f547b[i]);
                            m2243a(new IllegalStateException(stringBuilder5.toString()));
                        }
                        c0530g3.f1888l = true;
                        if (f1919a) {
                            stringBuilder5 = new StringBuilder();
                            stringBuilder5.append("restoreAllState: added #");
                            stringBuilder5.append(i);
                            stringBuilder5.append(": ");
                            stringBuilder5.append(c0530g3);
                            Log.v("FragmentManager", stringBuilder5.toString());
                        }
                        if (this.f1930e.contains(c0530g3)) {
                            throw new IllegalStateException("Already added!");
                        }
                        synchronized (this.f1930e) {
                            this.f1930e.add(c0530g3);
                        }
                    }
                }
                if (c0131o.f548c != null) {
                    this.f1932g = new ArrayList(c0131o.f548c.length);
                    for (i = 0; i < c0131o.f548c.length; i++) {
                        C0528c a4 = c0131o.f548c[i].m414a(this);
                        if (f1919a) {
                            StringBuilder stringBuilder6 = new StringBuilder();
                            stringBuilder6.append("restoreAllState: back stack #");
                            stringBuilder6.append(i);
                            stringBuilder6.append(" (index ");
                            stringBuilder6.append(a4.f1845m);
                            stringBuilder6.append("): ");
                            stringBuilder6.append(a4);
                            Log.v("FragmentManager", stringBuilder6.toString());
                            PrintWriter printWriter = new PrintWriter(new C0186e("FragmentManager"));
                            a4.m2092a("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f1932g.add(a4);
                        if (a4.f1845m >= 0) {
                            m2266a(a4.f1845m, a4);
                        }
                    }
                } else {
                    this.f1932g = null;
                }
                if (c0131o.f549d >= 0) {
                    this.f1941p = (C0530g) this.f1931f.get(c0131o.f549d);
                }
                this.f1929d = c0131o.f550e;
            }
        }
    }

    /* renamed from: a */
    void m2271a(C0528c c0528c) {
        if (this.f1932g == null) {
            this.f1932g = new ArrayList();
        }
        this.f1932g.add(c0528c);
    }

    /* renamed from: a */
    public void m2272a(C0530g c0530g) {
        if (c0530g.f1868L) {
            if (this.f1928c) {
                this.f1947w = true;
                return;
            }
            c0530g.f1868L = false;
            m2273a(c0530g, this.f1937l, 0, 0, false);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    void m2273a(android.support.v4.app.C0530g r16, int r17, int r18, int r19, boolean r20) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/1763344271.run(Unknown Source)
*/
        /*
        r15 = this;
        r6 = r15;
        r7 = r16;
        r0 = r7.f1888l;
        r8 = 1;
        if (r0 == 0) goto L_0x0010;
    L_0x0008:
        r0 = r7.f1859C;
        if (r0 == 0) goto L_0x000d;
    L_0x000c:
        goto L_0x0010;
    L_0x000d:
        r0 = r17;
        goto L_0x0015;
    L_0x0010:
        r0 = r17;
        if (r0 <= r8) goto L_0x0015;
    L_0x0014:
        r0 = 1;
    L_0x0015:
        r1 = r7.f1889m;
        if (r1 == 0) goto L_0x002b;
    L_0x0019:
        r1 = r7.f1878b;
        if (r0 <= r1) goto L_0x002b;
    L_0x001d:
        r0 = r7.f1878b;
        if (r0 != 0) goto L_0x0029;
    L_0x0021:
        r0 = r16.m2164b();
        if (r0 == 0) goto L_0x0029;
    L_0x0027:
        r0 = 1;
        goto L_0x002b;
    L_0x0029:
        r0 = r7.f1878b;
    L_0x002b:
        r1 = r7.f1868L;
        r9 = 4;
        r10 = 3;
        if (r1 == 0) goto L_0x0039;
    L_0x0031:
        r1 = r7.f1878b;
        if (r1 >= r9) goto L_0x0039;
    L_0x0035:
        if (r0 <= r10) goto L_0x0039;
    L_0x0037:
        r11 = 3;
        goto L_0x003a;
    L_0x0039:
        r11 = r0;
    L_0x003a:
        r0 = r7.f1878b;
        r12 = 2;
        r13 = 0;
        r14 = 0;
        if (r0 > r11) goto L_0x02fa;
    L_0x0041:
        r0 = r7.f1890n;
        if (r0 == 0) goto L_0x004a;
    L_0x0045:
        r0 = r7.f1891o;
        if (r0 != 0) goto L_0x004a;
    L_0x0049:
        return;
    L_0x004a:
        r0 = r16.m2128T();
        if (r0 != 0) goto L_0x0056;
    L_0x0050:
        r0 = r16.m2129U();
        if (r0 == 0) goto L_0x0069;
    L_0x0056:
        r7.m2153a(r13);
        r7.m2142a(r13);
        r2 = r16.m2130V();
        r3 = 0;
        r4 = 0;
        r5 = 1;
        r0 = r15;
        r1 = r16;
        r0.m2273a(r1, r2, r3, r4, r5);
    L_0x0069:
        r0 = r7.f1878b;
        switch(r0) {
            case 0: goto L_0x0070;
            case 1: goto L_0x01af;
            case 2: goto L_0x02ac;
            case 3: goto L_0x02b0;
            case 4: goto L_0x02d2;
            default: goto L_0x006e;
        };
    L_0x006e:
        goto L_0x045f;
    L_0x0070:
        if (r11 <= 0) goto L_0x01af;
    L_0x0072:
        r0 = f1919a;
        if (r0 == 0) goto L_0x008c;
    L_0x0076:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto CREATED: ";
        r1.append(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x008c:
        r0 = r7.f1879c;
        if (r0 == 0) goto L_0x00e3;
    L_0x0090:
        r0 = r7.f1879c;
        r1 = r6.f1938m;
        r1 = r1.m2220g();
        r1 = r1.getClassLoader();
        r0.setClassLoader(r1);
        r0 = r7.f1879c;
        r1 = "android:view_state";
        r0 = r0.getSparseParcelableArray(r1);
        r7.f1880d = r0;
        r0 = r7.f1879c;
        r1 = "android:target_state";
        r0 = r15.m2263a(r0, r1);
        r7.f1885i = r0;
        r0 = r7.f1885i;
        if (r0 == 0) goto L_0x00c1;
    L_0x00b7:
        r0 = r7.f1879c;
        r1 = "android:target_req_state";
        r0 = r0.getInt(r1, r14);
        r7.f1887k = r0;
    L_0x00c1:
        r0 = r7.f1881e;
        if (r0 == 0) goto L_0x00d0;
    L_0x00c5:
        r0 = r7.f1881e;
        r0 = r0.booleanValue();
        r7.f1869M = r0;
        r7.f1881e = r13;
        goto L_0x00da;
    L_0x00d0:
        r0 = r7.f1879c;
        r1 = "android:user_visible_hint";
        r0 = r0.getBoolean(r1, r8);
        r7.f1869M = r0;
    L_0x00da:
        r0 = r7.f1869M;
        if (r0 != 0) goto L_0x00e3;
    L_0x00de:
        r7.f1868L = r8;
        if (r11 <= r10) goto L_0x00e3;
    L_0x00e2:
        r11 = 3;
    L_0x00e3:
        r0 = r6.f1938m;
        r7.f1896t = r0;
        r0 = r6.f1940o;
        r7.f1900x = r0;
        r0 = r6.f1940o;
        if (r0 == 0) goto L_0x00f4;
    L_0x00ef:
        r0 = r6.f1940o;
        r0 = r0.f1897u;
        goto L_0x00fa;
    L_0x00f4:
        r0 = r6.f1938m;
        r0 = r0.m2222i();
    L_0x00fa:
        r7.f1895s = r0;
        r0 = r7.f1885i;
        if (r0 == 0) goto L_0x0145;
    L_0x0100:
        r0 = r6.f1931f;
        r1 = r7.f1885i;
        r1 = r1.f1882f;
        r0 = r0.get(r1);
        r1 = r7.f1885i;
        if (r0 != r1) goto L_0x011f;
    L_0x010e:
        r0 = r7.f1885i;
        r0 = r0.f1878b;
        if (r0 >= r8) goto L_0x0145;
    L_0x0114:
        r1 = r7.f1885i;
        r2 = 1;
        r3 = 0;
        r4 = 0;
        r5 = 1;
        r0 = r15;
        r0.m2273a(r1, r2, r3, r4, r5);
        goto L_0x0145;
    L_0x011f:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Fragment ";
        r1.append(r2);
        r1.append(r7);
        r2 = " declared target fragment ";
        r1.append(r2);
        r2 = r7.f1885i;
        r1.append(r2);
        r2 = " that does not belong to this FragmentManager!";
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0145:
        r0 = r6.f1938m;
        r0 = r0.m2220g();
        r15.m2274a(r7, r0, r14);
        r7.f1864H = r14;
        r0 = r6.f1938m;
        r0 = r0.m2220g();
        r7.m2145a(r0);
        r0 = r7.f1864H;
        if (r0 == 0) goto L_0x0193;
    L_0x015d:
        r0 = r7.f1900x;
        if (r0 != 0) goto L_0x0167;
    L_0x0161:
        r0 = r6.f1938m;
        r0.mo451b(r7);
        goto L_0x016c;
    L_0x0167:
        r0 = r7.f1900x;
        r0.m2150a(r7);
    L_0x016c:
        r0 = r6.f1938m;
        r0 = r0.m2220g();
        r15.m2291b(r7, r0, r14);
        r0 = r7.f1876T;
        if (r0 != 0) goto L_0x0189;
    L_0x0179:
        r0 = r7.f1879c;
        r15.m2275a(r7, r0, r14);
        r0 = r7.f1879c;
        r7.m2192k(r0);
        r0 = r7.f1879c;
        r15.m2292b(r7, r0, r14);
        goto L_0x0190;
    L_0x0189:
        r0 = r7.f1879c;
        r7.m2184g(r0);
        r7.f1878b = r8;
    L_0x0190:
        r7.f1861E = r14;
        goto L_0x01af;
    L_0x0193:
        r0 = new android.support.v4.app.y;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Fragment ";
        r1.append(r2);
        r1.append(r7);
        r2 = " did not call through to super.onAttach()";
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x01af:
        r15.m2298c(r16);
        if (r11 <= r8) goto L_0x02ac;
    L_0x01b4:
        r0 = f1919a;
        if (r0 == 0) goto L_0x01ce;
    L_0x01b8:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto ACTIVITY_CREATED: ";
        r1.append(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x01ce:
        r0 = r7.f1890n;
        if (r0 != 0) goto L_0x0297;
    L_0x01d2:
        r0 = r7.f1902z;
        if (r0 == 0) goto L_0x0246;
    L_0x01d6:
        r0 = r7.f1902z;
        r1 = -1;
        if (r0 != r1) goto L_0x01f9;
    L_0x01db:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Cannot create fragment ";
        r1.append(r2);
        r1.append(r7);
        r2 = " for a container view with no id";
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        r15.m2243a(r0);
    L_0x01f9:
        r0 = r6.f1939n;
        r1 = r7.f1902z;
        r0 = r0.mo40a(r1);
        r0 = (android.view.ViewGroup) r0;
        if (r0 != 0) goto L_0x0247;
    L_0x0205:
        r1 = r7.f1892p;
        if (r1 != 0) goto L_0x0247;
    L_0x0209:
        r1 = r16.m2183g();	 Catch:{ NotFoundException -> 0x0214 }
        r2 = r7.f1902z;	 Catch:{ NotFoundException -> 0x0214 }
        r1 = r1.getResourceName(r2);	 Catch:{ NotFoundException -> 0x0214 }
        goto L_0x0216;
    L_0x0214:
        r1 = "unknown";
    L_0x0216:
        r2 = new java.lang.IllegalArgumentException;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "No view found for id 0x";
        r3.append(r4);
        r4 = r7.f1902z;
        r4 = java.lang.Integer.toHexString(r4);
        r3.append(r4);
        r4 = " (";
        r3.append(r4);
        r3.append(r1);
        r1 = ") for fragment ";
        r3.append(r1);
        r3.append(r7);
        r1 = r3.toString();
        r2.<init>(r1);
        r15.m2243a(r2);
        goto L_0x0247;
    L_0x0246:
        r0 = r13;
    L_0x0247:
        r7.f1865I = r0;
        r1 = r7.f1879c;
        r1 = r7.m2173d(r1);
        r2 = r7.f1879c;
        r1 = r7.m2159b(r1, r0, r2);
        r7.f1866J = r1;
        r1 = r7.f1866J;
        if (r1 == 0) goto L_0x0295;
    L_0x025b:
        r1 = r7.f1866J;
        r7.f1867K = r1;
        r1 = r7.f1866J;
        r1.setSaveFromParentEnabled(r14);
        if (r0 == 0) goto L_0x026b;
    L_0x0266:
        r1 = r7.f1866J;
        r0.addView(r1);
    L_0x026b:
        r0 = r7.f1858B;
        if (r0 == 0) goto L_0x0276;
    L_0x026f:
        r0 = r7.f1866J;
        r1 = 8;
        r0.setVisibility(r1);
    L_0x0276:
        r0 = r7.f1866J;
        r1 = r7.f1879c;
        r7.m2154a(r0, r1);
        r0 = r7.f1866J;
        r1 = r7.f1879c;
        r15.m2276a(r7, r0, r1, r14);
        r0 = r7.f1866J;
        r0 = r0.getVisibility();
        if (r0 != 0) goto L_0x0291;
    L_0x028c:
        r0 = r7.f1865I;
        if (r0 == 0) goto L_0x0291;
    L_0x0290:
        goto L_0x0292;
    L_0x0291:
        r8 = 0;
    L_0x0292:
        r7.f1872P = r8;
        goto L_0x0297;
    L_0x0295:
        r7.f1867K = r13;
    L_0x0297:
        r0 = r7.f1879c;
        r7.m2194l(r0);
        r0 = r7.f1879c;
        r15.m2299c(r7, r0, r14);
        r0 = r7.f1866J;
        if (r0 == 0) goto L_0x02aa;
    L_0x02a5:
        r0 = r7.f1879c;
        r7.m2148a(r0);
    L_0x02aa:
        r7.f1879c = r13;
    L_0x02ac:
        if (r11 <= r12) goto L_0x02b0;
    L_0x02ae:
        r7.f1878b = r10;
    L_0x02b0:
        if (r11 <= r10) goto L_0x02d2;
    L_0x02b2:
        r0 = f1919a;
        if (r0 == 0) goto L_0x02cc;
    L_0x02b6:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto STARTED: ";
        r1.append(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x02cc:
        r16.m2113E();
        r15.m2293b(r7, r14);
    L_0x02d2:
        if (r11 <= r9) goto L_0x045f;
    L_0x02d4:
        r0 = f1919a;
        if (r0 == 0) goto L_0x02ee;
    L_0x02d8:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto RESUMED: ";
        r1.append(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x02ee:
        r16.m2114F();
        r15.m2300c(r7, r14);
        r7.f1879c = r13;
        r7.f1880d = r13;
        goto L_0x045f;
    L_0x02fa:
        r0 = r7.f1878b;
        if (r0 <= r11) goto L_0x045f;
    L_0x02fe:
        r0 = r7.f1878b;
        switch(r0) {
            case 1: goto L_0x03e9;
            case 2: goto L_0x0369;
            case 3: goto L_0x034a;
            case 4: goto L_0x0328;
            case 5: goto L_0x0305;
            default: goto L_0x0303;
        };
    L_0x0303:
        goto L_0x045f;
    L_0x0305:
        r0 = 5;
        if (r11 >= r0) goto L_0x0328;
    L_0x0308:
        r0 = f1919a;
        if (r0 == 0) goto L_0x0322;
    L_0x030c:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom RESUMED: ";
        r1.append(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0322:
        r16.m2117I();
        r15.m2305d(r7, r14);
    L_0x0328:
        if (r11 >= r9) goto L_0x034a;
    L_0x032a:
        r0 = f1919a;
        if (r0 == 0) goto L_0x0344;
    L_0x032e:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom STARTED: ";
        r1.append(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0344:
        r16.m2118J();
        r15.m2307e(r7, r14);
    L_0x034a:
        if (r11 >= r10) goto L_0x0369;
    L_0x034c:
        r0 = f1919a;
        if (r0 == 0) goto L_0x0366;
    L_0x0350:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom STOPPED: ";
        r1.append(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0366:
        r16.m2119K();
    L_0x0369:
        if (r11 >= r12) goto L_0x03e9;
    L_0x036b:
        r0 = f1919a;
        if (r0 == 0) goto L_0x0385;
    L_0x036f:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom ACTIVITY_CREATED: ";
        r1.append(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0385:
        r0 = r7.f1866J;
        if (r0 == 0) goto L_0x0398;
    L_0x0389:
        r0 = r6.f1938m;
        r0 = r0.mo449a(r7);
        if (r0 == 0) goto L_0x0398;
    L_0x0391:
        r0 = r7.f1880d;
        if (r0 != 0) goto L_0x0398;
    L_0x0395:
        r15.m2327m(r16);
    L_0x0398:
        r16.m2120L();
        r15.m2311f(r7, r14);
        r0 = r7.f1866J;
        if (r0 == 0) goto L_0x03e1;
    L_0x03a2:
        r0 = r7.f1865I;
        if (r0 == 0) goto L_0x03e1;
    L_0x03a6:
        r0 = r7.f1865I;
        r1 = r7.f1866J;
        r0.endViewTransition(r1);
        r0 = r7.f1866J;
        r0.clearAnimation();
        r0 = r6.f1937l;
        r1 = 0;
        if (r0 <= 0) goto L_0x03d2;
    L_0x03b7:
        r0 = r6.f1945u;
        if (r0 != 0) goto L_0x03d2;
    L_0x03bb:
        r0 = r7.f1866J;
        r0 = r0.getVisibility();
        if (r0 != 0) goto L_0x03d2;
    L_0x03c3:
        r0 = r7.f1874R;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 < 0) goto L_0x03d2;
    L_0x03c9:
        r0 = r18;
        r2 = r19;
        r0 = r15.m2265a(r7, r0, r14, r2);
        goto L_0x03d3;
    L_0x03d2:
        r0 = r13;
    L_0x03d3:
        r7.f1874R = r1;
        if (r0 == 0) goto L_0x03da;
    L_0x03d7:
        r15.m2238a(r7, r0, r11);
    L_0x03da:
        r0 = r7.f1865I;
        r1 = r7.f1866J;
        r0.removeView(r1);
    L_0x03e1:
        r7.f1865I = r13;
        r7.f1866J = r13;
        r7.f1867K = r13;
        r7.f1891o = r14;
    L_0x03e9:
        if (r11 >= r8) goto L_0x045f;
    L_0x03eb:
        r0 = r6.f1945u;
        if (r0 == 0) goto L_0x0410;
    L_0x03ef:
        r0 = r16.m2128T();
        if (r0 == 0) goto L_0x0400;
    L_0x03f5:
        r0 = r16.m2128T();
        r7.m2153a(r13);
        r0.clearAnimation();
        goto L_0x0410;
    L_0x0400:
        r0 = r16.m2129U();
        if (r0 == 0) goto L_0x0410;
    L_0x0406:
        r0 = r16.m2129U();
        r7.m2142a(r13);
        r0.cancel();
    L_0x0410:
        r0 = r16.m2128T();
        if (r0 != 0) goto L_0x045b;
    L_0x0416:
        r0 = r16.m2129U();
        if (r0 == 0) goto L_0x041d;
    L_0x041c:
        goto L_0x045b;
    L_0x041d:
        r0 = f1919a;
        if (r0 == 0) goto L_0x0437;
    L_0x0421:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom CREATED: ";
        r1.append(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0437:
        r0 = r7.f1861E;
        if (r0 != 0) goto L_0x0442;
    L_0x043b:
        r16.m2121M();
        r15.m2314g(r7, r14);
        goto L_0x0444;
    L_0x0442:
        r7.f1878b = r14;
    L_0x0444:
        r16.m2122N();
        r15.m2317h(r7, r14);
        if (r20 != 0) goto L_0x045f;
    L_0x044c:
        r0 = r7.f1861E;
        if (r0 != 0) goto L_0x0454;
    L_0x0450:
        r15.m2313g(r16);
        goto L_0x045f;
    L_0x0454:
        r7.f1896t = r13;
        r7.f1900x = r13;
        r7.f1895s = r13;
        goto L_0x045f;
    L_0x045b:
        r7.m2160b(r11);
        goto L_0x0460;
    L_0x045f:
        r8 = r11;
    L_0x0460:
        r0 = r7.f1878b;
        if (r0 == r8) goto L_0x0493;
    L_0x0464:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveToState: Fragment state for ";
        r1.append(r2);
        r1.append(r7);
        r2 = " not updated inline; ";
        r1.append(r2);
        r2 = "expected state ";
        r1.append(r2);
        r1.append(r8);
        r2 = " found ";
        r1.append(r2);
        r2 = r7.f1878b;
        r1.append(r2);
        r1 = r1.toString();
        android.util.Log.w(r0, r1);
        r7.f1878b = r8;
    L_0x0493:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.m.a(android.support.v4.app.g, int, int, int, boolean):void");
    }

    /* renamed from: a */
    void m2274a(C0530g c0530g, Context context, boolean z) {
        if (this.f1940o != null) {
            C0117l h = this.f1940o.m2185h();
            if (h instanceof C0535m) {
                ((C0535m) h).m2274a(c0530g, context, true);
            }
        }
        Iterator it = this.f1926J.iterator();
        while (it.hasNext()) {
            C0195i c0195i = (C0195i) it.next();
            if (!z || ((Boolean) c0195i.f734b).booleanValue()) {
                ((C0115a) c0195i.f733a).m456a((C0117l) this, c0530g, context);
            }
        }
    }

    /* renamed from: a */
    void m2275a(C0530g c0530g, Bundle bundle, boolean z) {
        if (this.f1940o != null) {
            C0117l h = this.f1940o.m2185h();
            if (h instanceof C0535m) {
                ((C0535m) h).m2275a(c0530g, bundle, true);
            }
        }
        Iterator it = this.f1926J.iterator();
        while (it.hasNext()) {
            C0195i c0195i = (C0195i) it.next();
            if (!z || ((Boolean) c0195i.f734b).booleanValue()) {
                ((C0115a) c0195i.f733a).m457a((C0117l) this, c0530g, bundle);
            }
        }
    }

    /* renamed from: a */
    void m2276a(C0530g c0530g, View view, Bundle bundle, boolean z) {
        if (this.f1940o != null) {
            C0117l h = this.f1940o.m2185h();
            if (h instanceof C0535m) {
                ((C0535m) h).m2276a(c0530g, view, bundle, true);
            }
        }
        Iterator it = this.f1926J.iterator();
        while (it.hasNext()) {
            C0195i c0195i = (C0195i) it.next();
            if (!z || ((Boolean) c0195i.f734b).booleanValue()) {
                ((C0115a) c0195i.f733a).m458a(this, c0530g, view, bundle);
            }
        }
    }

    /* renamed from: a */
    public void m2277a(C0530g c0530g, boolean z) {
        if (f1919a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("add: ");
            stringBuilder.append(c0530g);
            Log.v("FragmentManager", stringBuilder.toString());
        }
        m2310f(c0530g);
        if (!c0530g.f1859C) {
            if (this.f1930e.contains(c0530g)) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Fragment already added: ");
                stringBuilder2.append(c0530g);
                throw new IllegalStateException(stringBuilder2.toString());
            }
            synchronized (this.f1930e) {
                this.f1930e.add(c0530g);
            }
            c0530g.f1888l = true;
            c0530g.f1889m = false;
            if (c0530g.f1866J == null) {
                c0530g.f1873Q = false;
            }
            if (c0530g.f1862F && c0530g.f1863G) {
                this.f1942r = true;
            }
            if (z) {
                m2290b(c0530g);
            }
        }
    }

    /* renamed from: a */
    public void m2278a(C0531k c0531k, C0113i c0113i, C0530g c0530g) {
        if (this.f1938m == null) {
            this.f1938m = c0531k;
            this.f1939n = c0113i;
            this.f1940o = c0530g;
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    /* renamed from: a */
    public void mo46a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int i;
        C0530g c0530g;
        int size2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("    ");
        String stringBuilder2 = stringBuilder.toString();
        if (this.f1931f != null) {
            size = this.f1931f.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.print("Active Fragments in ");
                printWriter.print(Integer.toHexString(System.identityHashCode(this)));
                printWriter.println(":");
                for (i = 0; i < size; i++) {
                    c0530g = (C0530g) this.f1931f.valueAt(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(c0530g);
                    if (c0530g != null) {
                        c0530g.m2155a(stringBuilder2, fileDescriptor, printWriter, strArr);
                    }
                }
            }
        }
        size = this.f1930e.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (i = 0; i < size; i++) {
                c0530g = (C0530g) this.f1930e.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(c0530g.toString());
            }
        }
        if (this.f1933h != null) {
            size = this.f1933h.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Fragments Created Menus:");
                for (i = 0; i < size; i++) {
                    c0530g = (C0530g) this.f1933h.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(c0530g.toString());
                }
            }
        }
        if (this.f1932g != null) {
            size = this.f1932g.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (i = 0; i < size; i++) {
                    C0528c c0528c = (C0528c) this.f1932g.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(c0528c.toString());
                    c0528c.m2091a(stringBuilder2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        synchronized (this) {
            if (this.f1934i != null) {
                size2 = this.f1934i.size();
                if (size2 > 0) {
                    printWriter.print(str);
                    printWriter.println("Back Stack Indices:");
                    for (int i2 = 0; i2 < size2; i2++) {
                        C0528c c0528c2 = (C0528c) this.f1934i.get(i2);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i2);
                        printWriter.print(": ");
                        printWriter.println(c0528c2);
                    }
                }
            }
            if (this.f1935j != null && this.f1935j.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f1935j.toArray()));
            }
        }
        if (this.f1927b != null) {
            size2 = this.f1927b.size();
            if (size2 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size2; i3++) {
                    C0128g c0128g = (C0128g) this.f1927b.get(i3);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(c0128g);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1938m);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1939n);
        if (this.f1940o != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1940o);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1937l);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f1943s);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1944t);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f1945u);
        if (this.f1942r) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f1942r);
        }
        if (this.f1946v != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.f1946v);
        }
    }

    /* renamed from: a */
    public void m2280a(boolean z) {
        for (int size = this.f1930e.size() - 1; size >= 0; size--) {
            C0530g c0530g = (C0530g) this.f1930e.get(size);
            if (c0530g != null) {
                c0530g.m2175d(z);
            }
        }
    }

    /* renamed from: a */
    public boolean mo47a() {
        m2260x();
        return m2249a(null, -1, 0);
    }

    /* renamed from: a */
    boolean m2282a(int i) {
        return this.f1937l >= i;
    }

    /* renamed from: a */
    public boolean m2283a(Menu menu) {
        int i = 0;
        if (this.f1937l < 1) {
            return false;
        }
        boolean z = false;
        while (i < this.f1930e.size()) {
            C0530g c0530g = (C0530g) this.f1930e.get(i);
            if (c0530g != null && c0530g.m2170c(menu)) {
                z = true;
            }
            i++;
        }
        return z;
    }

    /* renamed from: a */
    public boolean m2284a(Menu menu, MenuInflater menuInflater) {
        int i = 0;
        if (this.f1937l < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (int i2 = 0; i2 < this.f1930e.size(); i2++) {
            C0530g c0530g = (C0530g) this.f1930e.get(i2);
            if (c0530g != null && c0530g.m2165b(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c0530g);
                z = true;
            }
        }
        if (this.f1933h != null) {
            while (i < this.f1933h.size()) {
                C0530g c0530g2 = (C0530g) this.f1933h.get(i);
                if (arrayList == null || !arrayList.contains(c0530g2)) {
                    c0530g2.m2203t();
                }
                i++;
            }
        }
        this.f1933h = arrayList;
        return z;
    }

    /* renamed from: a */
    public boolean m2285a(MenuItem menuItem) {
        if (this.f1937l < 1) {
            return false;
        }
        for (int i = 0; i < this.f1930e.size(); i++) {
            C0530g c0530g = (C0530g) this.f1930e.get(i);
            if (c0530g != null && c0530g.m2171c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    boolean m2286a(ArrayList<C0528c> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        if (this.f1932g == null) {
            return false;
        }
        int size;
        if (str == null && i < 0 && (i2 & 1) == 0) {
            size = this.f1932g.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f1932g.remove(size));
            arrayList2.add(Boolean.valueOf(true));
        } else {
            int i3;
            if (str == null) {
                if (i < 0) {
                    i3 = -1;
                    if (i3 == this.f1932g.size() - 1) {
                        return false;
                    }
                    for (size = this.f1932g.size() - 1; size > i3; size--) {
                        arrayList.add(this.f1932g.remove(size));
                        arrayList2.add(Boolean.valueOf(true));
                    }
                }
            }
            i3 = this.f1932g.size() - 1;
            while (i3 >= 0) {
                C0528c c0528c = (C0528c) this.f1932g.get(i3);
                if (str == null || !str.equals(c0528c.m2100d())) {
                    if (i >= 0 && i == c0528c.f1845m) {
                        break;
                    }
                    i3--;
                } else {
                    break;
                }
            }
            if (i3 < 0) {
                return false;
            }
            if ((i2 & 1) != 0) {
                while (true) {
                    i3--;
                    if (i3 < 0) {
                        break;
                    }
                    C0528c c0528c2 = (C0528c) this.f1932g.get(i3);
                    if (str == null || !str.equals(c0528c2.m2100d())) {
                        if (i < 0 || i != c0528c2.f1845m) {
                            break;
                        }
                    }
                }
            }
            if (i3 == this.f1932g.size() - 1) {
                return false;
            }
            for (size = this.f1932g.size() - 1; size > i3; size--) {
                arrayList.add(this.f1932g.remove(size));
                arrayList2.add(Boolean.valueOf(true));
            }
        }
        return true;
    }

    /* renamed from: b */
    public C0530g m2287b(int i) {
        int size;
        for (size = this.f1930e.size() - 1; size >= 0; size--) {
            C0530g c0530g = (C0530g) this.f1930e.get(size);
            if (c0530g != null && c0530g.f1901y == i) {
                return c0530g;
            }
        }
        if (this.f1931f != null) {
            for (size = this.f1931f.size() - 1; size >= 0; size--) {
                c0530g = (C0530g) this.f1931f.valueAt(size);
                if (c0530g != null && c0530g.f1901y == i) {
                    return c0530g;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public C0530g m2288b(String str) {
        if (!(this.f1931f == null || str == null)) {
            for (int size = this.f1931f.size() - 1; size >= 0; size--) {
                C0530g c0530g = (C0530g) this.f1931f.valueAt(size);
                if (c0530g != null) {
                    c0530g = c0530g.m2134a(str);
                    if (c0530g != null) {
                        return c0530g;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public List<C0530g> mo48b() {
        if (this.f1930e.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        List<C0530g> list;
        synchronized (this.f1930e) {
            list = (List) this.f1930e.clone();
        }
        return list;
    }

    /* renamed from: b */
    void m2290b(C0530g c0530g) {
        m2273a(c0530g, this.f1937l, 0, 0, false);
    }

    /* renamed from: b */
    void m2291b(C0530g c0530g, Context context, boolean z) {
        if (this.f1940o != null) {
            C0117l h = this.f1940o.m2185h();
            if (h instanceof C0535m) {
                ((C0535m) h).m2291b(c0530g, context, true);
            }
        }
        Iterator it = this.f1926J.iterator();
        while (it.hasNext()) {
            C0195i c0195i = (C0195i) it.next();
            if (!z || ((Boolean) c0195i.f734b).booleanValue()) {
                ((C0115a) c0195i.f733a).m460b((C0117l) this, c0530g, context);
            }
        }
    }

    /* renamed from: b */
    void m2292b(C0530g c0530g, Bundle bundle, boolean z) {
        if (this.f1940o != null) {
            C0117l h = this.f1940o.m2185h();
            if (h instanceof C0535m) {
                ((C0535m) h).m2292b(c0530g, bundle, true);
            }
        }
        Iterator it = this.f1926J.iterator();
        while (it.hasNext()) {
            C0195i c0195i = (C0195i) it.next();
            if (!z || ((Boolean) c0195i.f734b).booleanValue()) {
                ((C0115a) c0195i.f733a).m461b((C0117l) this, c0530g, bundle);
            }
        }
    }

    /* renamed from: b */
    void m2293b(C0530g c0530g, boolean z) {
        if (this.f1940o != null) {
            C0117l h = this.f1940o.m2185h();
            if (h instanceof C0535m) {
                ((C0535m) h).m2293b(c0530g, true);
            }
        }
        Iterator it = this.f1926J.iterator();
        while (it.hasNext()) {
            C0195i c0195i = (C0195i) it.next();
            if (!z || ((Boolean) c0195i.f734b).booleanValue()) {
                ((C0115a) c0195i.f733a).m455a(this, c0530g);
            }
        }
    }

    /* renamed from: b */
    public void m2294b(Menu menu) {
        if (this.f1937l >= 1) {
            for (int i = 0; i < this.f1930e.size(); i++) {
                C0530g c0530g = (C0530g) this.f1930e.get(i);
                if (c0530g != null) {
                    c0530g.m2174d(menu);
                }
            }
        }
    }

    /* renamed from: b */
    public void m2295b(boolean z) {
        for (int size = this.f1930e.size() - 1; size >= 0; size--) {
            C0530g c0530g = (C0530g) this.f1930e.get(size);
            if (c0530g != null) {
                c0530g.m2179e(z);
            }
        }
    }

    /* renamed from: b */
    public boolean m2296b(MenuItem menuItem) {
        if (this.f1937l < 1) {
            return false;
        }
        for (int i = 0; i < this.f1930e.size(); i++) {
            C0530g c0530g = (C0530g) this.f1930e.get(i);
            if (c0530g != null && c0530g.m2176d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void m2297c(int i) {
        synchronized (this) {
            this.f1934i.set(i, null);
            if (this.f1935j == null) {
                this.f1935j = new ArrayList();
            }
            if (f1919a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Freeing back stack index ");
                stringBuilder.append(i);
                Log.v("FragmentManager", stringBuilder.toString());
            }
            this.f1935j.add(Integer.valueOf(i));
        }
    }

    /* renamed from: c */
    void m2298c(C0530g c0530g) {
        if (c0530g.f1890n && !c0530g.f1893q) {
            c0530g.f1866J = c0530g.m2159b(c0530g.m2173d(c0530g.f1879c), null, c0530g.f1879c);
            if (c0530g.f1866J != null) {
                c0530g.f1867K = c0530g.f1866J;
                c0530g.f1866J.setSaveFromParentEnabled(false);
                if (c0530g.f1858B) {
                    c0530g.f1866J.setVisibility(8);
                }
                c0530g.m2154a(c0530g.f1866J, c0530g.f1879c);
                m2276a(c0530g, c0530g.f1866J, c0530g.f1879c, false);
                return;
            }
            c0530g.f1867K = null;
        }
    }

    /* renamed from: c */
    void m2299c(C0530g c0530g, Bundle bundle, boolean z) {
        if (this.f1940o != null) {
            C0117l h = this.f1940o.m2185h();
            if (h instanceof C0535m) {
                ((C0535m) h).m2299c(c0530g, bundle, true);
            }
        }
        Iterator it = this.f1926J.iterator();
        while (it.hasNext()) {
            C0195i c0195i = (C0195i) it.next();
            if (!z || ((Boolean) c0195i.f734b).booleanValue()) {
                ((C0115a) c0195i.f733a).m463c(this, c0530g, bundle);
            }
        }
    }

    /* renamed from: c */
    void m2300c(C0530g c0530g, boolean z) {
        if (this.f1940o != null) {
            C0117l h = this.f1940o.m2185h();
            if (h instanceof C0535m) {
                ((C0535m) h).m2300c(c0530g, true);
            }
        }
        Iterator it = this.f1926J.iterator();
        while (it.hasNext()) {
            C0195i c0195i = (C0195i) it.next();
            if (!z || ((Boolean) c0195i.f734b).booleanValue()) {
                ((C0115a) c0195i.f733a).m459b(this, c0530g);
            }
        }
    }

    /* renamed from: c */
    public boolean mo49c() {
        if (!this.f1943s) {
            if (!this.f1944t) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    void m2302d() {
        if (this.f1931f != null) {
            for (int i = 0; i < this.f1931f.size(); i++) {
                C0530g c0530g = (C0530g) this.f1931f.valueAt(i);
                if (c0530g != null) {
                    m2272a(c0530g);
                }
            }
        }
    }

    /* renamed from: d */
    void m2303d(final C0530g c0530g) {
        if (c0530g.f1866J != null) {
            C0124c a = m2265a(c0530g, c0530g.m2124P(), c0530g.f1858B ^ true, c0530g.m2125Q());
            if (a == null || a.f536b == null) {
                if (a != null) {
                    C0535m.m2252b(c0530g.f1866J, a);
                    c0530g.f1866J.startAnimation(a.f535a);
                    a.f535a.start();
                }
                int i = (!c0530g.f1858B || c0530g.m2132X()) ? 0 : 8;
                c0530g.f1866J.setVisibility(i);
                if (c0530g.m2132X()) {
                    c0530g.m2182f(false);
                }
            } else {
                a.f536b.setTarget(c0530g.f1866J);
                if (!c0530g.f1858B) {
                    c0530g.f1866J.setVisibility(0);
                } else if (c0530g.m2132X()) {
                    c0530g.m2182f(false);
                } else {
                    final ViewGroup viewGroup = c0530g.f1865I;
                    final View view = c0530g.f1866J;
                    viewGroup.startViewTransition(view);
                    a.f536b.addListener(new AnimatorListenerAdapter(this) {
                        /* renamed from: d */
                        final /* synthetic */ C0535m f532d;

                        public void onAnimationEnd(Animator animator) {
                            viewGroup.endViewTransition(view);
                            animator.removeListener(this);
                            if (c0530g.f1866J != null) {
                                c0530g.f1866J.setVisibility(8);
                            }
                        }
                    });
                }
                C0535m.m2252b(c0530g.f1866J, a);
                a.f536b.start();
            }
        }
        if (c0530g.f1888l && c0530g.f1862F && c0530g.f1863G) {
            this.f1942r = true;
        }
        c0530g.f1873Q = false;
        c0530g.m2156a(c0530g.f1858B);
    }

    /* renamed from: d */
    void m2304d(C0530g c0530g, Bundle bundle, boolean z) {
        if (this.f1940o != null) {
            C0117l h = this.f1940o.m2185h();
            if (h instanceof C0535m) {
                ((C0535m) h).m2304d(c0530g, bundle, true);
            }
        }
        Iterator it = this.f1926J.iterator();
        while (it.hasNext()) {
            C0195i c0195i = (C0195i) it.next();
            if (!z || ((Boolean) c0195i.f734b).booleanValue()) {
                ((C0115a) c0195i.f733a).m465d(this, c0530g, bundle);
            }
        }
    }

    /* renamed from: d */
    void m2305d(C0530g c0530g, boolean z) {
        if (this.f1940o != null) {
            C0117l h = this.f1940o.m2185h();
            if (h instanceof C0535m) {
                ((C0535m) h).m2305d(c0530g, true);
            }
        }
        Iterator it = this.f1926J.iterator();
        while (it.hasNext()) {
            C0195i c0195i = (C0195i) it.next();
            if (!z || ((Boolean) c0195i.f734b).booleanValue()) {
                ((C0115a) c0195i.f733a).m462c(this, c0530g);
            }
        }
    }

    /* renamed from: e */
    void m2306e(C0530g c0530g) {
        if (c0530g != null) {
            int i = this.f1937l;
            if (c0530g.f1889m) {
                i = c0530g.m2164b() ? Math.min(i, 1) : Math.min(i, 0);
            }
            m2273a(c0530g, i, c0530g.m2124P(), c0530g.m2125Q(), false);
            if (c0530g.f1866J != null) {
                C0530g p = m2259p(c0530g);
                if (p != null) {
                    View view = p.f1866J;
                    ViewGroup viewGroup = c0530g.f1865I;
                    i = viewGroup.indexOfChild(view);
                    int indexOfChild = viewGroup.indexOfChild(c0530g.f1866J);
                    if (indexOfChild < i) {
                        viewGroup.removeViewAt(indexOfChild);
                        viewGroup.addView(c0530g.f1866J, i);
                    }
                }
                if (c0530g.f1872P && c0530g.f1865I != null) {
                    if (c0530g.f1874R > 0.0f) {
                        c0530g.f1866J.setAlpha(c0530g.f1874R);
                    }
                    c0530g.f1874R = 0.0f;
                    c0530g.f1872P = false;
                    C0124c a = m2265a(c0530g, c0530g.m2124P(), true, c0530g.m2125Q());
                    if (a != null) {
                        C0535m.m2252b(c0530g.f1866J, a);
                        if (a.f535a != null) {
                            c0530g.f1866J.startAnimation(a.f535a);
                        } else {
                            a.f536b.setTarget(c0530g.f1866J);
                            a.f536b.start();
                        }
                    }
                }
            }
            if (c0530g.f1873Q) {
                m2303d(c0530g);
            }
        }
    }

    /* renamed from: e */
    void m2307e(C0530g c0530g, boolean z) {
        if (this.f1940o != null) {
            C0117l h = this.f1940o.m2185h();
            if (h instanceof C0535m) {
                ((C0535m) h).m2307e(c0530g, true);
            }
        }
        Iterator it = this.f1926J.iterator();
        while (it.hasNext()) {
            C0195i c0195i = (C0195i) it.next();
            if (!z || ((Boolean) c0195i.f734b).booleanValue()) {
                ((C0115a) c0195i.f733a).m464d(this, c0530g);
            }
        }
    }

    /* renamed from: e */
    public boolean m2308e() {
        m2255c(true);
        boolean z = false;
        while (m2256c(this.f1948x, this.f1949y)) {
            this.f1928c = true;
            try {
                m2253b(this.f1948x, this.f1949y);
                m2262z();
                z = true;
            } catch (Throwable th) {
                m2262z();
                throw th;
            }
        }
        m2309f();
        m2232C();
        return z;
    }

    /* renamed from: f */
    void m2309f() {
        if (this.f1947w) {
            this.f1947w = false;
            m2302d();
        }
    }

    /* renamed from: f */
    void m2310f(C0530g c0530g) {
        if (c0530g.f1882f < 0) {
            int i = this.f1929d;
            this.f1929d = i + 1;
            c0530g.m2140a(i, this.f1940o);
            if (this.f1931f == null) {
                this.f1931f = new SparseArray();
            }
            this.f1931f.put(c0530g.f1882f, c0530g);
            if (f1919a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Allocated fragment index ");
                stringBuilder.append(c0530g);
                Log.v("FragmentManager", stringBuilder.toString());
            }
        }
    }

    /* renamed from: f */
    void m2311f(C0530g c0530g, boolean z) {
        if (this.f1940o != null) {
            C0117l h = this.f1940o.m2185h();
            if (h instanceof C0535m) {
                ((C0535m) h).m2311f(c0530g, true);
            }
        }
        Iterator it = this.f1926J.iterator();
        while (it.hasNext()) {
            C0195i c0195i = (C0195i) it.next();
            if (!z || ((Boolean) c0195i.f734b).booleanValue()) {
                ((C0115a) c0195i.f733a).m466e(this, c0530g);
            }
        }
    }

    /* renamed from: g */
    void m2312g() {
        if (this.f1936k != null) {
            for (int i = 0; i < this.f1936k.size(); i++) {
                ((C0116b) this.f1936k.get(i)).m469a();
            }
        }
    }

    /* renamed from: g */
    void m2313g(C0530g c0530g) {
        if (c0530g.f1882f >= 0) {
            if (f1919a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Freeing fragment index ");
                stringBuilder.append(c0530g);
                Log.v("FragmentManager", stringBuilder.toString());
            }
            this.f1931f.put(c0530g.f1882f, null);
            c0530g.m2201r();
        }
    }

    /* renamed from: g */
    void m2314g(C0530g c0530g, boolean z) {
        if (this.f1940o != null) {
            C0117l h = this.f1940o.m2185h();
            if (h instanceof C0535m) {
                ((C0535m) h).m2314g(c0530g, true);
            }
        }
        Iterator it = this.f1926J.iterator();
        while (it.hasNext()) {
            C0195i c0195i = (C0195i) it.next();
            if (!z || ((Boolean) c0195i.f734b).booleanValue()) {
                ((C0115a) c0195i.f733a).m467f(this, c0530g);
            }
        }
    }

    /* renamed from: h */
    C0129n m2315h() {
        C0535m.m2241a(this.f1924D);
        return this.f1924D;
    }

    /* renamed from: h */
    public void m2316h(C0530g c0530g) {
        if (f1919a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("remove: ");
            stringBuilder.append(c0530g);
            stringBuilder.append(" nesting=");
            stringBuilder.append(c0530g.f1894r);
            Log.v("FragmentManager", stringBuilder.toString());
        }
        int b = c0530g.m2164b() ^ 1;
        if (!c0530g.f1859C || b != 0) {
            synchronized (this.f1930e) {
                this.f1930e.remove(c0530g);
            }
            if (c0530g.f1862F && c0530g.f1863G) {
                this.f1942r = true;
            }
            c0530g.f1888l = false;
            c0530g.f1889m = true;
        }
    }

    /* renamed from: h */
    void m2317h(C0530g c0530g, boolean z) {
        if (this.f1940o != null) {
            C0117l h = this.f1940o.m2185h();
            if (h instanceof C0535m) {
                ((C0535m) h).m2317h(c0530g, true);
            }
        }
        Iterator it = this.f1926J.iterator();
        while (it.hasNext()) {
            C0195i c0195i = (C0195i) it.next();
            if (!z || ((Boolean) c0195i.f734b).booleanValue()) {
                ((C0115a) c0195i.f733a).m468g(this, c0530g);
            }
        }
    }

    /* renamed from: i */
    void m2318i() {
        List list;
        List list2;
        List list3;
        if (this.f1931f != null) {
            list = null;
            list2 = list;
            list3 = list2;
            for (int i = 0; i < this.f1931f.size(); i++) {
                C0530g c0530g = (C0530g) this.f1931f.valueAt(i);
                if (c0530g != null) {
                    Object obj;
                    if (c0530g.f1860D) {
                        if (list == null) {
                            list = new ArrayList();
                        }
                        list.add(c0530g);
                        c0530g.f1886j = c0530g.f1885i != null ? c0530g.f1885i.f1882f : -1;
                        if (f1919a) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("retainNonConfig: keeping retained ");
                            stringBuilder.append(c0530g);
                            Log.v("FragmentManager", stringBuilder.toString());
                        }
                    }
                    if (c0530g.f1897u != null) {
                        c0530g.f1897u.m2318i();
                        obj = c0530g.f1897u.f1924D;
                    } else {
                        obj = c0530g.f1898v;
                    }
                    if (list2 == null && obj != null) {
                        list2 = new ArrayList(this.f1931f.size());
                        for (int i2 = 0; i2 < i; i2++) {
                            list2.add(null);
                        }
                    }
                    if (list2 != null) {
                        list2.add(obj);
                    }
                    if (list3 == null && c0530g.f1899w != null) {
                        list3 = new ArrayList(this.f1931f.size());
                        for (int i3 = 0; i3 < i; i3++) {
                            list3.add(null);
                        }
                    }
                    if (list3 != null) {
                        list3.add(c0530g.f1899w);
                    }
                }
            }
        } else {
            list = null;
            list2 = list;
            list3 = list2;
        }
        if (list == null && list2 == null && list3 == null) {
            this.f1924D = null;
        } else {
            this.f1924D = new C0129n(list, list2, list3);
        }
    }

    /* renamed from: i */
    public void m2319i(C0530g c0530g) {
        if (f1919a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hide: ");
            stringBuilder.append(c0530g);
            Log.v("FragmentManager", stringBuilder.toString());
        }
        if (!c0530g.f1858B) {
            c0530g.f1858B = true;
            c0530g.f1873Q = true ^ c0530g.f1873Q;
        }
    }

    /* renamed from: j */
    Parcelable m2320j() {
        m2230A();
        m2231B();
        m2308e();
        this.f1943s = true;
        C0106d[] c0106dArr = null;
        this.f1924D = null;
        if (this.f1931f != null) {
            if (this.f1931f.size() > 0) {
                int i;
                int size = this.f1931f.size();
                C0133p[] c0133pArr = new C0133p[size];
                Object obj = null;
                for (i = 0; i < size; i++) {
                    C0530g c0530g = (C0530g) this.f1931f.valueAt(i);
                    if (c0530g != null) {
                        StringBuilder stringBuilder;
                        if (c0530g.f1882f < 0) {
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("Failure saving state: active ");
                            stringBuilder2.append(c0530g);
                            stringBuilder2.append(" has cleared index: ");
                            stringBuilder2.append(c0530g.f1882f);
                            m2243a(new IllegalStateException(stringBuilder2.toString()));
                        }
                        C0133p c0133p = new C0133p(c0530g);
                        c0133pArr[i] = c0133p;
                        if (c0530g.f1878b <= 0 || c0133p.f561k != null) {
                            c0133p.f561k = c0530g.f1879c;
                        } else {
                            c0133p.f561k = m2328n(c0530g);
                            if (c0530g.f1885i != null) {
                                if (c0530g.f1885i.f1882f < 0) {
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Failure saving state: ");
                                    stringBuilder.append(c0530g);
                                    stringBuilder.append(" has target not in fragment manager: ");
                                    stringBuilder.append(c0530g.f1885i);
                                    m2243a(new IllegalStateException(stringBuilder.toString()));
                                }
                                if (c0133p.f561k == null) {
                                    c0133p.f561k = new Bundle();
                                }
                                m2269a(c0133p.f561k, "android:target_state", c0530g.f1885i);
                                if (c0530g.f1887k != 0) {
                                    c0133p.f561k.putInt("android:target_req_state", c0530g.f1887k);
                                }
                            }
                        }
                        if (f1919a) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Saved state of ");
                            stringBuilder.append(c0530g);
                            stringBuilder.append(": ");
                            stringBuilder.append(c0133p.f561k);
                            Log.v("FragmentManager", stringBuilder.toString());
                        }
                        obj = 1;
                    }
                }
                if (obj == null) {
                    if (f1919a) {
                        Log.v("FragmentManager", "saveAllState: no fragments!");
                    }
                    return null;
                }
                int[] iArr;
                int size2 = this.f1930e.size();
                if (size2 > 0) {
                    iArr = new int[size2];
                    for (i = 0; i < size2; i++) {
                        StringBuilder stringBuilder3;
                        iArr[i] = ((C0530g) this.f1930e.get(i)).f1882f;
                        if (iArr[i] < 0) {
                            stringBuilder3 = new StringBuilder();
                            stringBuilder3.append("Failure saving state: active ");
                            stringBuilder3.append(this.f1930e.get(i));
                            stringBuilder3.append(" has cleared index: ");
                            stringBuilder3.append(iArr[i]);
                            m2243a(new IllegalStateException(stringBuilder3.toString()));
                        }
                        if (f1919a) {
                            stringBuilder3 = new StringBuilder();
                            stringBuilder3.append("saveAllState: adding fragment #");
                            stringBuilder3.append(i);
                            stringBuilder3.append(": ");
                            stringBuilder3.append(this.f1930e.get(i));
                            Log.v("FragmentManager", stringBuilder3.toString());
                        }
                    }
                } else {
                    iArr = null;
                }
                if (this.f1932g != null) {
                    size2 = this.f1932g.size();
                    if (size2 > 0) {
                        c0106dArr = new C0106d[size2];
                        for (int i2 = 0; i2 < size2; i2++) {
                            c0106dArr[i2] = new C0106d((C0528c) this.f1932g.get(i2));
                            if (f1919a) {
                                StringBuilder stringBuilder4 = new StringBuilder();
                                stringBuilder4.append("saveAllState: adding back stack #");
                                stringBuilder4.append(i2);
                                stringBuilder4.append(": ");
                                stringBuilder4.append(this.f1932g.get(i2));
                                Log.v("FragmentManager", stringBuilder4.toString());
                            }
                        }
                    }
                }
                Parcelable c0131o = new C0131o();
                c0131o.f546a = c0133pArr;
                c0131o.f547b = iArr;
                c0131o.f548c = c0106dArr;
                if (this.f1941p != null) {
                    c0131o.f549d = this.f1941p.f1882f;
                }
                c0131o.f550e = this.f1929d;
                m2318i();
                return c0131o;
            }
        }
        return null;
    }

    /* renamed from: j */
    public void m2321j(C0530g c0530g) {
        if (f1919a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("show: ");
            stringBuilder.append(c0530g);
            Log.v("FragmentManager", stringBuilder.toString());
        }
        if (c0530g.f1858B) {
            c0530g.f1858B = false;
            c0530g.f1873Q ^= 1;
        }
    }

    /* renamed from: k */
    public void m2322k() {
        this.f1924D = null;
        int i = 0;
        this.f1943s = false;
        this.f1944t = false;
        int size = this.f1930e.size();
        while (i < size) {
            C0530g c0530g = (C0530g) this.f1930e.get(i);
            if (c0530g != null) {
                c0530g.m2115G();
            }
            i++;
        }
    }

    /* renamed from: k */
    public void m2323k(C0530g c0530g) {
        if (f1919a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("detach: ");
            stringBuilder.append(c0530g);
            Log.v("FragmentManager", stringBuilder.toString());
        }
        if (!c0530g.f1859C) {
            c0530g.f1859C = true;
            if (c0530g.f1888l) {
                if (f1919a) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("remove from detach: ");
                    stringBuilder2.append(c0530g);
                    Log.v("FragmentManager", stringBuilder2.toString());
                }
                synchronized (this.f1930e) {
                    this.f1930e.remove(c0530g);
                }
                if (c0530g.f1862F && c0530g.f1863G) {
                    this.f1942r = true;
                }
                c0530g.f1888l = false;
            }
        }
    }

    /* renamed from: l */
    public void m2324l() {
        this.f1943s = false;
        this.f1944t = false;
        m2258e(1);
    }

    /* renamed from: l */
    public void m2325l(C0530g c0530g) {
        if (f1919a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("attach: ");
            stringBuilder.append(c0530g);
            Log.v("FragmentManager", stringBuilder.toString());
        }
        if (c0530g.f1859C) {
            c0530g.f1859C = false;
            if (!c0530g.f1888l) {
                if (this.f1930e.contains(c0530g)) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Fragment already added: ");
                    stringBuilder.append(c0530g);
                    throw new IllegalStateException(stringBuilder.toString());
                }
                if (f1919a) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("add from attach: ");
                    stringBuilder.append(c0530g);
                    Log.v("FragmentManager", stringBuilder.toString());
                }
                synchronized (this.f1930e) {
                    this.f1930e.add(c0530g);
                }
                c0530g.f1888l = true;
                if (c0530g.f1862F && c0530g.f1863G) {
                    this.f1942r = true;
                }
            }
        }
    }

    /* renamed from: m */
    public void m2326m() {
        this.f1943s = false;
        this.f1944t = false;
        m2258e(2);
    }

    /* renamed from: m */
    void m2327m(C0530g c0530g) {
        if (c0530g.f1867K != null) {
            if (this.f1922B == null) {
                this.f1922B = new SparseArray();
            } else {
                this.f1922B.clear();
            }
            c0530g.f1867K.saveHierarchyState(this.f1922B);
            if (this.f1922B.size() > 0) {
                c0530g.f1880d = this.f1922B;
                this.f1922B = null;
            }
        }
    }

    /* renamed from: n */
    Bundle m2328n(C0530g c0530g) {
        Bundle bundle;
        if (this.f1921A == null) {
            this.f1921A = new Bundle();
        }
        c0530g.m2196m(this.f1921A);
        m2304d(c0530g, this.f1921A, false);
        if (this.f1921A.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.f1921A;
            this.f1921A = null;
        }
        if (c0530g.f1866J != null) {
            m2327m(c0530g);
        }
        if (c0530g.f1880d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", c0530g.f1880d);
        }
        if (!c0530g.f1869M) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", c0530g.f1869M);
        }
        return bundle;
    }

    /* renamed from: n */
    public void m2329n() {
        this.f1943s = false;
        this.f1944t = false;
        m2258e(4);
    }

    /* renamed from: o */
    public void m2330o() {
        this.f1943s = false;
        this.f1944t = false;
        m2258e(5);
    }

    /* renamed from: o */
    public void m2331o(C0530g c0530g) {
        if (c0530g != null) {
            if (this.f1931f.get(c0530g.f1882f) == c0530g) {
                if (c0530g.f1896t != null) {
                    if (c0530g.m2185h() == this) {
                    }
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(c0530g);
            stringBuilder.append(" is not an active fragment of FragmentManager ");
            stringBuilder.append(this);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f1941p = c0530g;
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C0535m c0535m = this;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        String str2 = str;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet2.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, C0127f.f542a);
        int i = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str3 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!C0530g.m2107a(c0535m.f1938m.m2220g(), str3)) {
            return null;
        }
        C0530g c0530g;
        if (view != null) {
            i = view.getId();
        }
        if (i == -1 && resourceId == -1) {
            if (string == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(attributeSet.getPositionDescription());
                stringBuilder.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
                stringBuilder.append(str3);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        C0530g b = resourceId != -1 ? m2287b(resourceId) : null;
        if (b == null && string != null) {
            b = m2264a(string);
        }
        if (b == null && i != -1) {
            b = m2287b(i);
        }
        if (f1919a) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("onCreateView: id=0x");
            stringBuilder2.append(Integer.toHexString(resourceId));
            stringBuilder2.append(" fname=");
            stringBuilder2.append(str3);
            stringBuilder2.append(" existing=");
            stringBuilder2.append(b);
            Log.v("FragmentManager", stringBuilder2.toString());
        }
        if (b == null) {
            C0530g a = c0535m.f1939n.mo39a(context2, str3, null);
            a.f1890n = true;
            a.f1901y = resourceId != 0 ? resourceId : i;
            a.f1902z = i;
            a.f1857A = string;
            a.f1891o = true;
            a.f1895s = c0535m;
            a.f1896t = c0535m.f1938m;
            a.m2146a(c0535m.f1938m.m2220g(), attributeSet2, a.f1879c);
            m2277a(a, true);
            c0530g = a;
        } else if (b.f1891o) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(attributeSet.getPositionDescription());
            stringBuilder.append(": Duplicate id 0x");
            stringBuilder.append(Integer.toHexString(resourceId));
            stringBuilder.append(", tag ");
            stringBuilder.append(string);
            stringBuilder.append(", or parent id 0x");
            stringBuilder.append(Integer.toHexString(i));
            stringBuilder.append(" with another fragment for ");
            stringBuilder.append(str3);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else {
            b.f1891o = true;
            b.f1896t = c0535m.f1938m;
            if (!b.f1861E) {
                b.m2146a(c0535m.f1938m.m2220g(), attributeSet2, b.f1879c);
            }
            c0530g = b;
        }
        if (c0535m.f1937l >= 1 || !c0530g.f1890n) {
            m2290b(c0530g);
        } else {
            m2273a(c0530g, 1, 0, 0, false);
        }
        if (c0530g.f1866J != null) {
            if (resourceId != 0) {
                c0530g.f1866J.setId(resourceId);
            }
            if (c0530g.f1866J.getTag() == null) {
                c0530g.f1866J.setTag(string);
            }
            return c0530g.f1866J;
        }
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("Fragment ");
        stringBuilder3.append(str3);
        stringBuilder3.append(" did not create a view.");
        throw new IllegalStateException(stringBuilder3.toString());
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* renamed from: p */
    public void m2332p() {
        m2258e(4);
    }

    /* renamed from: q */
    public void m2333q() {
        this.f1944t = true;
        m2258e(3);
    }

    /* renamed from: r */
    public void m2334r() {
        m2258e(2);
    }

    /* renamed from: s */
    public void m2335s() {
        m2258e(1);
    }

    /* renamed from: t */
    public void m2336t() {
        this.f1945u = true;
        m2308e();
        m2258e(0);
        this.f1938m = null;
        this.f1939n = null;
        this.f1940o = null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("FragmentManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        C0185d.m671a(this.f1940o != null ? this.f1940o : this.f1938m, stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    /* renamed from: u */
    public void m2337u() {
        for (int i = 0; i < this.f1930e.size(); i++) {
            C0530g c0530g = (C0530g) this.f1930e.get(i);
            if (c0530g != null) {
                c0530g.m2116H();
            }
        }
    }

    /* renamed from: v */
    public C0530g m2338v() {
        return this.f1941p;
    }

    /* renamed from: w */
    Factory2 m2339w() {
        return this;
    }
}
