package android.support.v4.p017g;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: android.support.v4.g.p */
public class C0227p {
    /* renamed from: a */
    static final C0226j f785a;

    /* renamed from: android.support.v4.g.p$j */
    static class C0226j {
        /* renamed from: b */
        static boolean f779b = false;
        /* renamed from: c */
        private static Field f780c;
        /* renamed from: d */
        private static boolean f781d;
        /* renamed from: e */
        private static WeakHashMap<View, String> f782e;
        /* renamed from: f */
        private static final AtomicInteger f783f = new AtomicInteger(1);
        /* renamed from: a */
        WeakHashMap<View, C0234s> f784a = null;

        C0226j() {
        }

        /* renamed from: a */
        long m838a() {
            return ValueAnimator.getFrameDelay();
        }

        /* renamed from: a */
        public C0237w mo574a(View view, C0237w c0237w) {
            return c0237w;
        }

        /* renamed from: a */
        public void mo575a(View view, float f) {
        }

        /* renamed from: a */
        public void mo584a(View view, int i, int i2) {
        }

        /* renamed from: a */
        public void mo576a(View view, ColorStateList colorStateList) {
            if (view instanceof C0224o) {
                ((C0224o) view).setSupportBackgroundTintList(colorStateList);
            }
        }

        /* renamed from: a */
        public void mo577a(View view, Mode mode) {
            if (view instanceof C0224o) {
                ((C0224o) view).setSupportBackgroundTintMode(mode);
            }
        }

        /* renamed from: a */
        public void mo456a(View view, Drawable drawable) {
            view.setBackgroundDrawable(drawable);
        }

        /* renamed from: a */
        public void m845a(View view, C0209b c0209b) {
            view.setAccessibilityDelegate(c0209b == null ? null : c0209b.m775a());
        }

        /* renamed from: a */
        public void mo578a(View view, C0223n c0223n) {
        }

        /* renamed from: a */
        public void mo457a(View view, Runnable runnable) {
            view.postDelayed(runnable, m838a());
        }

        /* renamed from: a */
        public void mo458a(View view, Runnable runnable, long j) {
            view.postDelayed(runnable, m838a() + j);
        }

        /* renamed from: a */
        public void mo579a(View view, String str) {
            if (f782e == null) {
                f782e = new WeakHashMap();
            }
            f782e.put(view, str);
        }

        /* renamed from: a */
        public boolean mo98a(View view) {
            return false;
        }

        /* renamed from: b */
        public void mo459b(View view) {
            view.postInvalidate();
        }

        /* renamed from: c */
        public int mo460c(android.view.View r4) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/1763344271.run(Unknown Source)
*/
            /*
            r3 = this;
            r0 = f781d;
            if (r0 != 0) goto L_0x0016;
        L_0x0004:
            r0 = 1;
            r1 = android.view.View.class;	 Catch:{ NoSuchFieldException -> 0x0014 }
            r2 = "mMinHeight";	 Catch:{ NoSuchFieldException -> 0x0014 }
            r1 = r1.getDeclaredField(r2);	 Catch:{ NoSuchFieldException -> 0x0014 }
            f780c = r1;	 Catch:{ NoSuchFieldException -> 0x0014 }
            r1 = f780c;	 Catch:{ NoSuchFieldException -> 0x0014 }
            r1.setAccessible(r0);	 Catch:{ NoSuchFieldException -> 0x0014 }
        L_0x0014:
            f781d = r0;
        L_0x0016:
            r0 = f780c;
            if (r0 == 0) goto L_0x0027;
        L_0x001a:
            r0 = f780c;	 Catch:{ Exception -> 0x0027 }
            r4 = r0.get(r4);	 Catch:{ Exception -> 0x0027 }
            r4 = (java.lang.Integer) r4;	 Catch:{ Exception -> 0x0027 }
            r4 = r4.intValue();	 Catch:{ Exception -> 0x0027 }
            return r4;
        L_0x0027:
            r4 = 0;
            return r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.g.p.j.c(android.view.View):int");
        }

        /* renamed from: d */
        public void mo461d(View view) {
        }

        /* renamed from: e */
        public boolean mo462e(View view) {
            return true;
        }

        /* renamed from: f */
        public int mo540f(View view) {
            return 0;
        }

        /* renamed from: g */
        public int mo541g(View view) {
            return 0;
        }

        /* renamed from: h */
        public boolean mo562h(View view) {
            return view.getWidth() > 0 && view.getHeight() > 0;
        }

        /* renamed from: i */
        public boolean mo563i(View view) {
            return view.getWindowToken() != null;
        }

        /* renamed from: j */
        public String mo580j(View view) {
            return f782e == null ? null : (String) f782e.get(view);
        }

        /* renamed from: k */
        public void mo581k(View view) {
            if (view instanceof C0219h) {
                ((C0219h) view).stopNestedScroll();
            }
        }

        /* renamed from: l */
        public ColorStateList mo582l(View view) {
            return view instanceof C0224o ? ((C0224o) view).getSupportBackgroundTintList() : null;
        }

        /* renamed from: m */
        public Mode mo583m(View view) {
            return view instanceof C0224o ? ((C0224o) view).getSupportBackgroundTintMode() : null;
        }

        /* renamed from: n */
        public C0234s m863n(View view) {
            if (this.f784a == null) {
                this.f784a = new WeakHashMap();
            }
            C0234s c0234s = (C0234s) this.f784a.get(view);
            if (c0234s != null) {
                return c0234s;
            }
            c0234s = new C0234s(view);
            this.f784a.put(view, c0234s);
            return c0234s;
        }
    }

    /* renamed from: android.support.v4.g.p$a */
    static class C0561a extends C0226j {
        C0561a() {
        }

        /* renamed from: a */
        public boolean mo98a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* renamed from: android.support.v4.g.p$b */
    static class C0741b extends C0561a {
        C0741b() {
        }

        /* renamed from: a */
        public void mo456a(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        /* renamed from: a */
        public void mo457a(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        /* renamed from: a */
        public void mo458a(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        /* renamed from: b */
        public void mo459b(View view) {
            view.postInvalidateOnAnimation();
        }

        /* renamed from: c */
        public int mo460c(View view) {
            return view.getMinimumHeight();
        }

        /* renamed from: d */
        public void mo461d(View view) {
            view.requestFitSystemWindows();
        }

        /* renamed from: e */
        public boolean mo462e(View view) {
            return view.hasOverlappingRendering();
        }
    }

    /* renamed from: android.support.v4.g.p$c */
    static class C0780c extends C0741b {
        C0780c() {
        }

        /* renamed from: f */
        public int mo540f(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: g */
        public int mo541g(View view) {
            return view.getWindowSystemUiVisibility();
        }
    }

    /* renamed from: android.support.v4.g.p$d */
    static class C0787d extends C0780c {
        C0787d() {
        }
    }

    /* renamed from: android.support.v4.g.p$e */
    static class C0790e extends C0787d {
        C0790e() {
        }

        /* renamed from: h */
        public boolean mo562h(View view) {
            return view.isLaidOut();
        }

        /* renamed from: i */
        public boolean mo563i(View view) {
            return view.isAttachedToWindow();
        }
    }

    /* renamed from: android.support.v4.g.p$f */
    static class C0793f extends C0790e {
        C0793f() {
        }

        /* renamed from: a */
        public C0237w mo574a(View view, C0237w c0237w) {
            Object obj = (WindowInsets) C0237w.m921a(c0237w);
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(obj);
            if (onApplyWindowInsets != obj) {
                obj = new WindowInsets(onApplyWindowInsets);
            }
            return C0237w.m920a(obj);
        }

        /* renamed from: a */
        public void mo575a(View view, float f) {
            view.setElevation(f);
        }

        /* renamed from: a */
        public void mo576a(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
            if (VERSION.SDK_INT == 21) {
                Object obj;
                Drawable background = view.getBackground();
                if (view.getBackgroundTintList() == null) {
                    if (view.getBackgroundTintMode() == null) {
                        obj = null;
                        if (background != null && r0 != null) {
                            if (background.isStateful()) {
                                background.setState(view.getDrawableState());
                            }
                            view.setBackground(background);
                            return;
                        }
                    }
                }
                obj = 1;
                if (background != null) {
                }
            }
        }

        /* renamed from: a */
        public void mo577a(View view, Mode mode) {
            view.setBackgroundTintMode(mode);
            if (VERSION.SDK_INT == 21) {
                Object obj;
                Drawable background = view.getBackground();
                if (view.getBackgroundTintList() == null) {
                    if (view.getBackgroundTintMode() == null) {
                        obj = null;
                        if (background != null && r0 != null) {
                            if (background.isStateful()) {
                                background.setState(view.getDrawableState());
                            }
                            view.setBackground(background);
                            return;
                        }
                    }
                }
                obj = 1;
                if (background != null) {
                }
            }
        }

        /* renamed from: a */
        public void mo578a(View view, final C0223n c0223n) {
            if (c0223n == null) {
                view.setOnApplyWindowInsetsListener(null);
            } else {
                view.setOnApplyWindowInsetsListener(new OnApplyWindowInsetsListener(this) {
                    /* renamed from: b */
                    final /* synthetic */ C0793f f778b;

                    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        return (WindowInsets) C0237w.m921a(c0223n.mo136a(view, C0237w.m920a((Object) windowInsets)));
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo579a(View view, String str) {
            view.setTransitionName(str);
        }

        /* renamed from: d */
        public void mo461d(View view) {
            view.requestApplyInsets();
        }

        /* renamed from: j */
        public String mo580j(View view) {
            return view.getTransitionName();
        }

        /* renamed from: k */
        public void mo581k(View view) {
            view.stopNestedScroll();
        }

        /* renamed from: l */
        public ColorStateList mo582l(View view) {
            return view.getBackgroundTintList();
        }

        /* renamed from: m */
        public Mode mo583m(View view) {
            return view.getBackgroundTintMode();
        }
    }

    /* renamed from: android.support.v4.g.p$g */
    static class C0794g extends C0793f {
        C0794g() {
        }

        /* renamed from: a */
        public void mo584a(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: android.support.v4.g.p$h */
    static class C0795h extends C0794g {
        C0795h() {
        }
    }

    /* renamed from: android.support.v4.g.p$i */
    static class C0796i extends C0795h {
        C0796i() {
        }
    }

    static {
        C0226j c0796i = VERSION.SDK_INT >= 26 ? new C0796i() : VERSION.SDK_INT >= 24 ? new C0795h() : VERSION.SDK_INT >= 23 ? new C0794g() : VERSION.SDK_INT >= 21 ? new C0793f() : VERSION.SDK_INT >= 19 ? new C0790e() : VERSION.SDK_INT >= 18 ? new C0787d() : VERSION.SDK_INT >= 17 ? new C0780c() : VERSION.SDK_INT >= 16 ? new C0741b() : VERSION.SDK_INT >= 15 ? new C0561a() : new C0226j();
        f785a = c0796i;
    }

    /* renamed from: a */
    public static C0237w m864a(View view, C0237w c0237w) {
        return f785a.mo574a(view, c0237w);
    }

    /* renamed from: a */
    public static void m865a(View view) {
        f785a.mo459b(view);
    }

    /* renamed from: a */
    public static void m866a(View view, float f) {
        f785a.mo575a(view, f);
    }

    /* renamed from: a */
    public static void m867a(View view, int i, int i2) {
        f785a.mo584a(view, i, i2);
    }

    /* renamed from: a */
    public static void m868a(View view, ColorStateList colorStateList) {
        f785a.mo576a(view, colorStateList);
    }

    /* renamed from: a */
    public static void m869a(View view, Mode mode) {
        f785a.mo577a(view, mode);
    }

    /* renamed from: a */
    public static void m870a(View view, Drawable drawable) {
        f785a.mo456a(view, drawable);
    }

    /* renamed from: a */
    public static void m871a(View view, C0209b c0209b) {
        f785a.m845a(view, c0209b);
    }

    /* renamed from: a */
    public static void m872a(View view, C0223n c0223n) {
        f785a.mo578a(view, c0223n);
    }

    /* renamed from: a */
    public static void m873a(View view, Runnable runnable) {
        f785a.mo457a(view, runnable);
    }

    /* renamed from: a */
    public static void m874a(View view, Runnable runnable, long j) {
        f785a.mo458a(view, runnable, j);
    }

    /* renamed from: a */
    public static void m875a(View view, String str) {
        f785a.mo579a(view, str);
    }

    /* renamed from: b */
    public static int m876b(View view) {
        return f785a.mo540f(view);
    }

    /* renamed from: c */
    public static int m877c(View view) {
        return f785a.mo460c(view);
    }

    /* renamed from: d */
    public static C0234s m878d(View view) {
        return f785a.m863n(view);
    }

    /* renamed from: e */
    public static String m879e(View view) {
        return f785a.mo580j(view);
    }

    /* renamed from: f */
    public static int m880f(View view) {
        return f785a.mo541g(view);
    }

    /* renamed from: g */
    public static void m881g(View view) {
        f785a.mo461d(view);
    }

    /* renamed from: h */
    public static boolean m882h(View view) {
        return f785a.mo462e(view);
    }

    /* renamed from: i */
    public static ColorStateList m883i(View view) {
        return f785a.mo582l(view);
    }

    /* renamed from: j */
    public static Mode m884j(View view) {
        return f785a.mo583m(view);
    }

    /* renamed from: k */
    public static void m885k(View view) {
        f785a.mo581k(view);
    }

    /* renamed from: l */
    public static boolean m886l(View view) {
        return f785a.mo562h(view);
    }

    /* renamed from: m */
    public static boolean m887m(View view) {
        return f785a.mo563i(view);
    }

    /* renamed from: n */
    public static boolean m888n(View view) {
        return f785a.mo98a(view);
    }
}
