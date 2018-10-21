package android.support.v4.app;

import android.animation.Animator;
import android.app.Activity;
import android.arch.lifecycle.C0015c;
import android.arch.lifecycle.C0015c.C0013a;
import android.arch.lifecycle.C0017e;
import android.arch.lifecycle.C0029p;
import android.arch.lifecycle.C0507f;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.p016f.C0185d;
import android.support.v4.p016f.C0197k;
import android.support.v4.p017g.C0215e;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.g */
public class C0530g implements C0017e, ComponentCallbacks, OnCreateContextMenuListener {
    /* renamed from: V */
    private static final C0197k<String, Class<?>> f1855V = new C0197k();
    /* renamed from: a */
    static final Object f1856a = new Object();
    /* renamed from: A */
    String f1857A;
    /* renamed from: B */
    boolean f1858B;
    /* renamed from: C */
    boolean f1859C;
    /* renamed from: D */
    boolean f1860D;
    /* renamed from: E */
    boolean f1861E;
    /* renamed from: F */
    boolean f1862F;
    /* renamed from: G */
    boolean f1863G = true;
    /* renamed from: H */
    boolean f1864H;
    /* renamed from: I */
    ViewGroup f1865I;
    /* renamed from: J */
    View f1866J;
    /* renamed from: K */
    View f1867K;
    /* renamed from: L */
    boolean f1868L;
    /* renamed from: M */
    boolean f1869M = true;
    /* renamed from: N */
    LoaderManagerImpl f1870N;
    /* renamed from: O */
    C0108a f1871O;
    /* renamed from: P */
    boolean f1872P;
    /* renamed from: Q */
    boolean f1873Q;
    /* renamed from: R */
    float f1874R;
    /* renamed from: S */
    LayoutInflater f1875S;
    /* renamed from: T */
    boolean f1876T;
    /* renamed from: U */
    C0507f f1877U = new C0507f(this);
    /* renamed from: b */
    int f1878b = 0;
    /* renamed from: c */
    Bundle f1879c;
    /* renamed from: d */
    SparseArray<Parcelable> f1880d;
    /* renamed from: e */
    Boolean f1881e;
    /* renamed from: f */
    int f1882f = -1;
    /* renamed from: g */
    String f1883g;
    /* renamed from: h */
    Bundle f1884h;
    /* renamed from: i */
    C0530g f1885i;
    /* renamed from: j */
    int f1886j = -1;
    /* renamed from: k */
    int f1887k;
    /* renamed from: l */
    boolean f1888l;
    /* renamed from: m */
    boolean f1889m;
    /* renamed from: n */
    boolean f1890n;
    /* renamed from: o */
    boolean f1891o;
    /* renamed from: p */
    boolean f1892p;
    /* renamed from: q */
    boolean f1893q;
    /* renamed from: r */
    int f1894r;
    /* renamed from: s */
    C0535m f1895s;
    /* renamed from: t */
    C0531k f1896t;
    /* renamed from: u */
    C0535m f1897u;
    /* renamed from: v */
    C0129n f1898v;
    /* renamed from: w */
    C0029p f1899w;
    /* renamed from: x */
    C0530g f1900x;
    /* renamed from: y */
    int f1901y;
    /* renamed from: z */
    int f1902z;

    /* renamed from: android.support.v4.app.g$1 */
    class C01071 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0530g f498a;

        C01071(C0530g c0530g) {
            this.f498a = c0530g;
        }

        public void run() {
            this.f498a.m2104Y();
        }
    }

    /* renamed from: android.support.v4.app.g$a */
    static class C0108a {
        /* renamed from: a */
        View f499a;
        /* renamed from: b */
        Animator f500b;
        /* renamed from: c */
        int f501c;
        /* renamed from: d */
        int f502d;
        /* renamed from: e */
        int f503e;
        /* renamed from: f */
        int f504f;
        /* renamed from: g */
        C0153x f505g = null;
        /* renamed from: h */
        C0153x f506h = null;
        /* renamed from: i */
        boolean f507i;
        /* renamed from: j */
        C0110c f508j;
        /* renamed from: k */
        boolean f509k;
        /* renamed from: l */
        private Object f510l = null;
        /* renamed from: m */
        private Object f511m = C0530g.f1856a;
        /* renamed from: n */
        private Object f512n = null;
        /* renamed from: o */
        private Object f513o = C0530g.f1856a;
        /* renamed from: p */
        private Object f514p = null;
        /* renamed from: q */
        private Object f515q = C0530g.f1856a;
        /* renamed from: r */
        private Boolean f516r;
        /* renamed from: s */
        private Boolean f517s;

        C0108a() {
        }
    }

    /* renamed from: android.support.v4.app.g$b */
    public static class C0109b extends RuntimeException {
        public C0109b(String str, Exception exception) {
            super(str, exception);
        }
    }

    /* renamed from: android.support.v4.app.g$c */
    interface C0110c {
        /* renamed from: a */
        void mo44a();

        /* renamed from: b */
        void mo45b();
    }

    /* renamed from: android.support.v4.app.g$2 */
    class C05292 extends C0113i {
        /* renamed from: a */
        final /* synthetic */ C0530g f1854a;

        C05292(C0530g c0530g) {
            this.f1854a = c0530g;
        }

        /* renamed from: a */
        public C0530g mo39a(Context context, String str, Bundle bundle) {
            return this.f1854a.f1896t.mo39a(context, str, bundle);
        }

        /* renamed from: a */
        public View mo40a(int i) {
            if (this.f1854a.f1866J != null) {
                return this.f1854a.f1866J.findViewById(i);
            }
            throw new IllegalStateException("Fragment does not have a view");
        }

        /* renamed from: a */
        public boolean mo41a() {
            return this.f1854a.f1866J != null;
        }
    }

    /* renamed from: Y */
    private void m2104Y() {
        C0110c c0110c;
        if (this.f1871O == null) {
            c0110c = null;
        } else {
            this.f1871O.f507i = false;
            c0110c = this.f1871O.f508j;
            this.f1871O.f508j = null;
        }
        if (c0110c != null) {
            c0110c.mo44a();
        }
    }

    /* renamed from: Z */
    private C0108a m2105Z() {
        if (this.f1871O == null) {
            this.f1871O = new C0108a();
        }
        return this.f1871O;
    }

    /* renamed from: a */
    public static C0530g m2106a(Context context, String str, Bundle bundle) {
        StringBuilder stringBuilder;
        try {
            Class cls = (Class) f1855V.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f1855V.put(str, cls);
            }
            C0530g c0530g = (C0530g) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(c0530g.getClass().getClassLoader());
                c0530g.m2161b(bundle);
            }
            return c0530g;
        } catch (Exception e) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to instantiate fragment ");
            stringBuilder.append(str);
            stringBuilder.append(": make sure class name exists, is public, and has an");
            stringBuilder.append(" empty constructor that is public");
            throw new C0109b(stringBuilder.toString(), e);
        } catch (Exception e2) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to instantiate fragment ");
            stringBuilder.append(str);
            stringBuilder.append(": make sure class name exists, is public, and has an");
            stringBuilder.append(" empty constructor that is public");
            throw new C0109b(stringBuilder.toString(), e2);
        } catch (Exception e22) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to instantiate fragment ");
            stringBuilder.append(str);
            stringBuilder.append(": make sure class name exists, is public, and has an");
            stringBuilder.append(" empty constructor that is public");
            throw new C0109b(stringBuilder.toString(), e22);
        } catch (Exception e222) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to instantiate fragment ");
            stringBuilder.append(str);
            stringBuilder.append(": could not find Fragment constructor");
            throw new C0109b(stringBuilder.toString(), e222);
        } catch (Exception e2222) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to instantiate fragment ");
            stringBuilder.append(str);
            stringBuilder.append(": calling Fragment constructor caused an exception");
            throw new C0109b(stringBuilder.toString(), e2222);
        }
    }

    /* renamed from: a */
    static boolean m2107a(android.content.Context r1, java.lang.String r2) {
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
        r0 = f1855V;	 Catch:{ ClassNotFoundException -> 0x001e }
        r0 = r0.get(r2);	 Catch:{ ClassNotFoundException -> 0x001e }
        r0 = (java.lang.Class) r0;	 Catch:{ ClassNotFoundException -> 0x001e }
        if (r0 != 0) goto L_0x0017;	 Catch:{ ClassNotFoundException -> 0x001e }
    L_0x000a:
        r1 = r1.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x001e }
        r0 = r1.loadClass(r2);	 Catch:{ ClassNotFoundException -> 0x001e }
        r1 = f1855V;	 Catch:{ ClassNotFoundException -> 0x001e }
        r1.put(r2, r0);	 Catch:{ ClassNotFoundException -> 0x001e }
    L_0x0017:
        r1 = android.support.v4.app.C0530g.class;	 Catch:{ ClassNotFoundException -> 0x001e }
        r1 = r1.isAssignableFrom(r0);	 Catch:{ ClassNotFoundException -> 0x001e }
        return r1;
    L_0x001e:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.g.a(android.content.Context, java.lang.String):boolean");
    }

    /* renamed from: A */
    public boolean m2109A() {
        if (this.f1871O != null) {
            if (this.f1871O.f517s != null) {
                return this.f1871O.f517s.booleanValue();
            }
        }
        return true;
    }

    /* renamed from: B */
    public boolean m2110B() {
        if (this.f1871O != null) {
            if (this.f1871O.f516r != null) {
                return this.f1871O.f516r.booleanValue();
            }
        }
        return true;
    }

    /* renamed from: C */
    public void m2111C() {
        if (this.f1895s != null) {
            if (this.f1895s.f1938m != null) {
                if (Looper.myLooper() != this.f1895s.f1938m.m2221h().getLooper()) {
                    this.f1895s.f1938m.m2221h().postAtFrontOfQueue(new C01071(this));
                    return;
                } else {
                    m2104Y();
                    return;
                }
            }
        }
        m2105Z().f507i = false;
    }

    /* renamed from: D */
    void m2112D() {
        if (this.f1896t != null) {
            this.f1897u = new C0535m();
            this.f1897u.m2278a(this.f1896t, new C05292(this), this);
            return;
        }
        throw new IllegalStateException("Fragment has not been attached yet.");
    }

    /* renamed from: E */
    void m2113E() {
        if (this.f1897u != null) {
            this.f1897u.m2322k();
            this.f1897u.m2308e();
        }
        this.f1878b = 4;
        this.f1864H = false;
        m2193l();
        if (this.f1864H) {
            if (this.f1897u != null) {
                this.f1897u.m2329n();
            }
            this.f1877U.m1990a(C0013a.ON_START);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onStart()");
        throw new C0154y(stringBuilder.toString());
    }

    /* renamed from: F */
    void m2114F() {
        if (this.f1897u != null) {
            this.f1897u.m2322k();
            this.f1897u.m2308e();
        }
        this.f1878b = 5;
        this.f1864H = false;
        m2195m();
        if (this.f1864H) {
            if (this.f1897u != null) {
                this.f1897u.m2330o();
                this.f1897u.m2308e();
            }
            this.f1877U.m1990a(C0013a.ON_RESUME);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onResume()");
        throw new C0154y(stringBuilder.toString());
    }

    /* renamed from: G */
    void m2115G() {
        if (this.f1897u != null) {
            this.f1897u.m2322k();
        }
    }

    /* renamed from: H */
    void m2116H() {
        onLowMemory();
        if (this.f1897u != null) {
            this.f1897u.m2337u();
        }
    }

    /* renamed from: I */
    void m2117I() {
        this.f1877U.m1990a(C0013a.ON_PAUSE);
        if (this.f1897u != null) {
            this.f1897u.m2332p();
        }
        this.f1878b = 4;
        this.f1864H = false;
        m2197n();
        if (!this.f1864H) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(this);
            stringBuilder.append(" did not call through to super.onPause()");
            throw new C0154y(stringBuilder.toString());
        }
    }

    /* renamed from: J */
    void m2118J() {
        this.f1877U.m1990a(C0013a.ON_STOP);
        if (this.f1897u != null) {
            this.f1897u.m2333q();
        }
        this.f1878b = 3;
        this.f1864H = false;
        m2198o();
        if (!this.f1864H) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(this);
            stringBuilder.append(" did not call through to super.onStop()");
            throw new C0154y(stringBuilder.toString());
        }
    }

    /* renamed from: K */
    void m2119K() {
        if (this.f1897u != null) {
            this.f1897u.m2334r();
        }
        this.f1878b = 2;
    }

    /* renamed from: L */
    void m2120L() {
        if (this.f1897u != null) {
            this.f1897u.m2335s();
        }
        this.f1878b = 1;
        this.f1864H = false;
        m2199p();
        if (this.f1864H) {
            if (this.f1870N != null) {
                this.f1870N.m2081a();
            }
            this.f1893q = false;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onDestroyView()");
        throw new C0154y(stringBuilder.toString());
    }

    /* renamed from: M */
    void m2121M() {
        this.f1877U.m1990a(C0013a.ON_DESTROY);
        if (this.f1897u != null) {
            this.f1897u.m2336t();
        }
        this.f1878b = 0;
        this.f1864H = false;
        this.f1876T = false;
        m2200q();
        if (this.f1864H) {
            this.f1897u = null;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onDestroy()");
        throw new C0154y(stringBuilder.toString());
    }

    /* renamed from: N */
    void m2122N() {
        this.f1864H = false;
        m2202s();
        this.f1875S = null;
        StringBuilder stringBuilder;
        if (!this.f1864H) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(this);
            stringBuilder.append(" did not call through to super.onDetach()");
            throw new C0154y(stringBuilder.toString());
        } else if (this.f1897u == null) {
        } else {
            if (this.f1861E) {
                this.f1897u.m2336t();
                this.f1897u = null;
                return;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Child FragmentManager of ");
            stringBuilder.append(this);
            stringBuilder.append(" was not ");
            stringBuilder.append(" destroyed and this fragment is not retaining instance");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: O */
    int m2123O() {
        return this.f1871O == null ? 0 : this.f1871O.f502d;
    }

    /* renamed from: P */
    int m2124P() {
        return this.f1871O == null ? 0 : this.f1871O.f503e;
    }

    /* renamed from: Q */
    int m2125Q() {
        return this.f1871O == null ? 0 : this.f1871O.f504f;
    }

    /* renamed from: R */
    C0153x m2126R() {
        return this.f1871O == null ? null : this.f1871O.f505g;
    }

    /* renamed from: S */
    C0153x m2127S() {
        return this.f1871O == null ? null : this.f1871O.f506h;
    }

    /* renamed from: T */
    View m2128T() {
        return this.f1871O == null ? null : this.f1871O.f499a;
    }

    /* renamed from: U */
    Animator m2129U() {
        return this.f1871O == null ? null : this.f1871O.f500b;
    }

    /* renamed from: V */
    int m2130V() {
        return this.f1871O == null ? 0 : this.f1871O.f501c;
    }

    /* renamed from: W */
    boolean m2131W() {
        return this.f1871O == null ? false : this.f1871O.f507i;
    }

    /* renamed from: X */
    boolean m2132X() {
        return this.f1871O == null ? false : this.f1871O.f509k;
    }

    /* renamed from: a */
    public C0015c mo42a() {
        return this.f1877U;
    }

    /* renamed from: a */
    C0530g m2134a(String str) {
        return str.equals(this.f1883g) ? this : this.f1897u != null ? this.f1897u.m2288b(str) : null;
    }

    /* renamed from: a */
    public View m2135a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* renamed from: a */
    public Animation m2136a(int i, boolean z, int i2) {
        return null;
    }

    /* renamed from: a */
    void m2137a(int i) {
        if (this.f1871O != null || i != 0) {
            m2105Z().f502d = i;
        }
    }

    /* renamed from: a */
    void m2138a(int i, int i2) {
        if (this.f1871O != null || i != 0 || i2 != 0) {
            m2105Z();
            this.f1871O.f503e = i;
            this.f1871O.f504f = i2;
        }
    }

    /* renamed from: a */
    public void m2139a(int i, int i2, Intent intent) {
    }

    /* renamed from: a */
    final void m2140a(int i, C0530g c0530g) {
        StringBuilder stringBuilder;
        String str;
        this.f1882f = i;
        if (c0530g != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(c0530g.f1883g);
            str = ":";
        } else {
            stringBuilder = new StringBuilder();
            str = "android:fragment:";
        }
        stringBuilder.append(str);
        stringBuilder.append(this.f1882f);
        this.f1883g = stringBuilder.toString();
    }

    /* renamed from: a */
    public void m2141a(int i, String[] strArr, int[] iArr) {
    }

    /* renamed from: a */
    void m2142a(Animator animator) {
        m2105Z().f500b = animator;
    }

    @Deprecated
    /* renamed from: a */
    public void m2143a(Activity activity) {
        this.f1864H = true;
    }

    @Deprecated
    /* renamed from: a */
    public void m2144a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f1864H = true;
    }

    /* renamed from: a */
    public void m2145a(Context context) {
        this.f1864H = true;
        Activity f = this.f1896t == null ? null : this.f1896t.m2219f();
        if (f != null) {
            this.f1864H = false;
            m2143a(f);
        }
    }

    /* renamed from: a */
    public void m2146a(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f1864H = true;
        Activity f = this.f1896t == null ? null : this.f1896t.m2219f();
        if (f != null) {
            this.f1864H = false;
            m2144a(f, attributeSet, bundle);
        }
    }

    /* renamed from: a */
    void m2147a(Configuration configuration) {
        onConfigurationChanged(configuration);
        if (this.f1897u != null) {
            this.f1897u.m2268a(configuration);
        }
    }

    /* renamed from: a */
    final void m2148a(Bundle bundle) {
        if (this.f1880d != null) {
            this.f1867K.restoreHierarchyState(this.f1880d);
            this.f1880d = null;
        }
        this.f1864H = false;
        m2188i(bundle);
        if (!this.f1864H) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(this);
            stringBuilder.append(" did not call through to super.onViewStateRestored()");
            throw new C0154y(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    void m2149a(C0110c c0110c) {
        m2105Z();
        if (c0110c != this.f1871O.f508j) {
            if (c0110c != null) {
                if (this.f1871O.f508j != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Trying to set a replacement startPostponedEnterTransition on ");
                    stringBuilder.append(this);
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
            if (this.f1871O.f507i) {
                this.f1871O.f508j = c0110c;
            }
            if (c0110c != null) {
                c0110c.mo45b();
            }
        }
    }

    /* renamed from: a */
    public void m2150a(C0530g c0530g) {
    }

    /* renamed from: a */
    public void m2151a(Menu menu) {
    }

    /* renamed from: a */
    public void m2152a(Menu menu, MenuInflater menuInflater) {
    }

    /* renamed from: a */
    void m2153a(View view) {
        m2105Z().f499a = view;
    }

    /* renamed from: a */
    public void m2154a(View view, Bundle bundle) {
    }

    /* renamed from: a */
    public void m2155a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f1901y));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f1902z));
        printWriter.print(" mTag=");
        printWriter.println(this.f1857A);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f1878b);
        printWriter.print(" mIndex=");
        printWriter.print(this.f1882f);
        printWriter.print(" mWho=");
        printWriter.print(this.f1883g);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f1894r);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f1888l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f1889m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f1890n);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f1891o);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f1858B);
        printWriter.print(" mDetached=");
        printWriter.print(this.f1859C);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f1863G);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f1862F);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f1860D);
        printWriter.print(" mRetaining=");
        printWriter.print(this.f1861E);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f1869M);
        if (this.f1895s != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f1895s);
        }
        if (this.f1896t != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f1896t);
        }
        if (this.f1900x != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f1900x);
        }
        if (this.f1884h != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f1884h);
        }
        if (this.f1879c != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f1879c);
        }
        if (this.f1880d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f1880d);
        }
        if (this.f1885i != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.f1885i);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f1887k);
        }
        if (m2123O() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(m2123O());
        }
        if (this.f1865I != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f1865I);
        }
        if (this.f1866J != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f1866J);
        }
        if (this.f1867K != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.f1866J);
        }
        if (m2128T() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(m2128T());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(m2130V());
        }
        if (this.f1870N != null) {
            printWriter.print(str);
            printWriter.println("Loader Manager:");
            LoaderManagerImpl loaderManagerImpl = this.f1870N;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("  ");
            loaderManagerImpl.mo37a(stringBuilder.toString(), fileDescriptor, printWriter, strArr);
        }
        if (this.f1897u != null) {
            printWriter.print(str);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Child ");
            stringBuilder2.append(this.f1897u);
            stringBuilder2.append(":");
            printWriter.println(stringBuilder2.toString());
            C0535m c0535m = this.f1897u;
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("  ");
            c0535m.mo46a(stringBuilder.toString(), fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: a */
    public void m2156a(boolean z) {
    }

    /* renamed from: a */
    public boolean m2157a(MenuItem menuItem) {
        return false;
    }

    /* renamed from: b */
    public Animator m2158b(int i, boolean z, int i2) {
        return null;
    }

    /* renamed from: b */
    View m2159b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f1897u != null) {
            this.f1897u.m2322k();
        }
        this.f1893q = true;
        return m2135a(layoutInflater, viewGroup, bundle);
    }

    /* renamed from: b */
    void m2160b(int i) {
        m2105Z().f501c = i;
    }

    /* renamed from: b */
    public void m2161b(Bundle bundle) {
        if (this.f1882f >= 0) {
            if (m2169c()) {
                throw new IllegalStateException("Fragment already active and state has been saved");
            }
        }
        this.f1884h = bundle;
    }

    /* renamed from: b */
    public void m2162b(Menu menu) {
    }

    /* renamed from: b */
    public void m2163b(boolean z) {
    }

    /* renamed from: b */
    final boolean m2164b() {
        return this.f1894r > 0;
    }

    /* renamed from: b */
    boolean m2165b(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f1858B) {
            return false;
        }
        if (this.f1862F && this.f1863G) {
            z = true;
            m2152a(menu, menuInflater);
        }
        return this.f1897u != null ? z | this.f1897u.m2284a(menu, menuInflater) : z;
    }

    /* renamed from: b */
    public boolean m2166b(MenuItem menuItem) {
        return false;
    }

    /* renamed from: c */
    public LayoutInflater m2167c(Bundle bundle) {
        return m2178e(bundle);
    }

    /* renamed from: c */
    public void m2168c(boolean z) {
    }

    /* renamed from: c */
    public final boolean m2169c() {
        return this.f1895s == null ? false : this.f1895s.mo49c();
    }

    /* renamed from: c */
    boolean m2170c(Menu menu) {
        boolean z = false;
        if (this.f1858B) {
            return false;
        }
        if (this.f1862F && this.f1863G) {
            z = true;
            m2151a(menu);
        }
        return this.f1897u != null ? z | this.f1897u.m2283a(menu) : z;
    }

    /* renamed from: c */
    boolean m2171c(MenuItem menuItem) {
        if (!this.f1858B) {
            if (this.f1862F && this.f1863G && m2157a(menuItem)) {
                return true;
            }
            if (this.f1897u != null && this.f1897u.m2285a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public Context m2172d() {
        return this.f1896t == null ? null : this.f1896t.m2220g();
    }

    /* renamed from: d */
    LayoutInflater m2173d(Bundle bundle) {
        this.f1875S = m2167c(bundle);
        return this.f1875S;
    }

    /* renamed from: d */
    void m2174d(Menu menu) {
        if (!this.f1858B) {
            if (this.f1862F && this.f1863G) {
                m2162b(menu);
            }
            if (this.f1897u != null) {
                this.f1897u.m2294b(menu);
            }
        }
    }

    /* renamed from: d */
    void m2175d(boolean z) {
        m2163b(z);
        if (this.f1897u != null) {
            this.f1897u.m2280a(z);
        }
    }

    /* renamed from: d */
    boolean m2176d(MenuItem menuItem) {
        if (!this.f1858B) {
            if (m2166b(menuItem)) {
                return true;
            }
            if (this.f1897u != null && this.f1897u.m2296b(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final Context m2177e() {
        Context d = m2172d();
        if (d != null) {
            return d;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" not attached to a context.");
        throw new IllegalStateException(stringBuilder.toString());
    }

    @Deprecated
    /* renamed from: e */
    public LayoutInflater m2178e(Bundle bundle) {
        if (this.f1896t != null) {
            LayoutInflater b = this.f1896t.mo450b();
            m2187i();
            C0215e.m800b(b, this.f1897u.m2339w());
            return b;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    /* renamed from: e */
    void m2179e(boolean z) {
        m2168c(z);
        if (this.f1897u != null) {
            this.f1897u.m2295b(z);
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f */
    public final C0786h m2180f() {
        return this.f1896t == null ? null : (C0786h) this.f1896t.m2219f();
    }

    /* renamed from: f */
    public void m2181f(Bundle bundle) {
        this.f1864H = true;
        m2184g(bundle);
        if (this.f1897u != null && !this.f1897u.m2282a(1)) {
            this.f1897u.m2324l();
        }
    }

    /* renamed from: f */
    void m2182f(boolean z) {
        m2105Z().f509k = z;
    }

    /* renamed from: g */
    public final Resources m2183g() {
        return m2177e().getResources();
    }

    /* renamed from: g */
    void m2184g(Bundle bundle) {
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                if (this.f1897u == null) {
                    m2112D();
                }
                this.f1897u.m2270a(parcelable, this.f1898v);
                this.f1898v = null;
                this.f1897u.m2324l();
            }
        }
    }

    /* renamed from: h */
    public final C0117l m2185h() {
        return this.f1895s;
    }

    /* renamed from: h */
    public void m2186h(Bundle bundle) {
        this.f1864H = true;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public final C0117l m2187i() {
        if (this.f1897u == null) {
            m2112D();
            if (this.f1878b >= 5) {
                this.f1897u.m2330o();
            } else if (this.f1878b >= 4) {
                this.f1897u.m2329n();
            } else if (this.f1878b >= 2) {
                this.f1897u.m2326m();
            } else if (this.f1878b >= 1) {
                this.f1897u.m2324l();
            }
        }
        return this.f1897u;
    }

    /* renamed from: i */
    public void m2188i(Bundle bundle) {
        this.f1864H = true;
    }

    /* renamed from: j */
    C0117l m2189j() {
        return this.f1897u;
    }

    /* renamed from: j */
    public void m2190j(Bundle bundle) {
    }

    /* renamed from: k */
    public View m2191k() {
        return this.f1866J;
    }

    /* renamed from: k */
    void m2192k(Bundle bundle) {
        if (this.f1897u != null) {
            this.f1897u.m2322k();
        }
        this.f1878b = 1;
        this.f1864H = false;
        m2181f(bundle);
        this.f1876T = true;
        if (this.f1864H) {
            this.f1877U.m1990a(C0013a.ON_CREATE);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onCreate()");
        throw new C0154y(stringBuilder.toString());
    }

    /* renamed from: l */
    public void m2193l() {
        this.f1864H = true;
    }

    /* renamed from: l */
    void m2194l(Bundle bundle) {
        if (this.f1897u != null) {
            this.f1897u.m2322k();
        }
        this.f1878b = 2;
        this.f1864H = false;
        m2186h(bundle);
        if (!this.f1864H) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(this);
            stringBuilder.append(" did not call through to super.onActivityCreated()");
            throw new C0154y(stringBuilder.toString());
        } else if (this.f1897u != null) {
            this.f1897u.m2326m();
        }
    }

    /* renamed from: m */
    public void m2195m() {
        this.f1864H = true;
    }

    /* renamed from: m */
    void m2196m(Bundle bundle) {
        m2190j(bundle);
        if (this.f1897u != null) {
            Parcelable j = this.f1897u.m2320j();
            if (j != null) {
                bundle.putParcelable("android:support:fragments", j);
            }
        }
    }

    /* renamed from: n */
    public void m2197n() {
        this.f1864H = true;
    }

    /* renamed from: o */
    public void m2198o() {
        this.f1864H = true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f1864H = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        m2180f().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.f1864H = true;
    }

    /* renamed from: p */
    public void m2199p() {
        this.f1864H = true;
    }

    /* renamed from: q */
    public void m2200q() {
        this.f1864H = true;
        if (this.f1899w != null && !this.f1896t.f1906d.f1943s) {
            this.f1899w.m62a();
        }
    }

    /* renamed from: r */
    void m2201r() {
        this.f1882f = -1;
        this.f1883g = null;
        this.f1888l = false;
        this.f1889m = false;
        this.f1890n = false;
        this.f1891o = false;
        this.f1892p = false;
        this.f1894r = 0;
        this.f1895s = null;
        this.f1897u = null;
        this.f1896t = null;
        this.f1901y = 0;
        this.f1902z = 0;
        this.f1857A = null;
        this.f1858B = false;
        this.f1859C = false;
        this.f1861E = false;
    }

    /* renamed from: s */
    public void m2202s() {
        this.f1864H = true;
    }

    /* renamed from: t */
    public void m2203t() {
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        C0185d.m671a(this, stringBuilder);
        if (this.f1882f >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.f1882f);
        }
        if (this.f1901y != 0) {
            stringBuilder.append(" id=0x");
            stringBuilder.append(Integer.toHexString(this.f1901y));
        }
        if (this.f1857A != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.f1857A);
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    /* renamed from: u */
    public Object m2204u() {
        return this.f1871O == null ? null : this.f1871O.f510l;
    }

    /* renamed from: v */
    public Object m2205v() {
        if (this.f1871O == null) {
            return null;
        }
        return this.f1871O.f511m == f1856a ? m2204u() : this.f1871O.f511m;
    }

    /* renamed from: w */
    public Object m2206w() {
        return this.f1871O == null ? null : this.f1871O.f512n;
    }

    /* renamed from: x */
    public Object m2207x() {
        if (this.f1871O == null) {
            return null;
        }
        return this.f1871O.f513o == f1856a ? m2206w() : this.f1871O.f513o;
    }

    /* renamed from: y */
    public Object m2208y() {
        return this.f1871O == null ? null : this.f1871O.f514p;
    }

    /* renamed from: z */
    public Object m2209z() {
        if (this.f1871O == null) {
            return null;
        }
        return this.f1871O.f515q == f1856a ? m2208y() : this.f1871O.f515q;
    }
}
