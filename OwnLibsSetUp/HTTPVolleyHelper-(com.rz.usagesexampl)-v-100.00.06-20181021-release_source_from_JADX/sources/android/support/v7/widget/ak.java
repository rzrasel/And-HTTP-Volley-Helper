package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v4.p017g.C0227p;
import android.support.v4.widget.C0257j;
import android.support.v7.p020a.C0270a.C0260a;
import android.support.v7.p020a.C0270a.C0269j;
import android.support.v7.view.menu.C0334s;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import java.lang.reflect.Method;

public class ak implements C0334s {
    /* renamed from: a */
    private static Method f2329a;
    /* renamed from: b */
    private static Method f2330b;
    /* renamed from: h */
    private static Method f2331h;
    /* renamed from: A */
    private Drawable f2332A;
    /* renamed from: B */
    private OnItemClickListener f2333B;
    /* renamed from: C */
    private OnItemSelectedListener f2334C;
    /* renamed from: D */
    private final C0372d f2335D;
    /* renamed from: E */
    private final C0371c f2336E;
    /* renamed from: F */
    private final C0369a f2337F;
    /* renamed from: G */
    private Runnable f2338G;
    /* renamed from: H */
    private final Rect f2339H;
    /* renamed from: I */
    private Rect f2340I;
    /* renamed from: J */
    private boolean f2341J;
    /* renamed from: c */
    ag f2342c;
    /* renamed from: d */
    int f2343d;
    /* renamed from: e */
    final C0373e f2344e;
    /* renamed from: f */
    final Handler f2345f;
    /* renamed from: g */
    PopupWindow f2346g;
    /* renamed from: i */
    private Context f2347i;
    /* renamed from: j */
    private ListAdapter f2348j;
    /* renamed from: k */
    private int f2349k;
    /* renamed from: l */
    private int f2350l;
    /* renamed from: m */
    private int f2351m;
    /* renamed from: n */
    private int f2352n;
    /* renamed from: o */
    private int f2353o;
    /* renamed from: p */
    private boolean f2354p;
    /* renamed from: q */
    private boolean f2355q;
    /* renamed from: r */
    private boolean f2356r;
    /* renamed from: s */
    private boolean f2357s;
    /* renamed from: t */
    private int f2358t;
    /* renamed from: u */
    private boolean f2359u;
    /* renamed from: v */
    private boolean f2360v;
    /* renamed from: w */
    private View f2361w;
    /* renamed from: x */
    private int f2362x;
    /* renamed from: y */
    private DataSetObserver f2363y;
    /* renamed from: z */
    private View f2364z;

    /* renamed from: android.support.v7.widget.ak$1 */
    class C03671 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ak f1289a;

        C03671(ak akVar) {
            this.f1289a = akVar;
        }

        public void run() {
            View i = this.f1289a.m2878i();
            if (i != null && i.getWindowToken() != null) {
                this.f1289a.mo286a();
            }
        }
    }

    /* renamed from: android.support.v7.widget.ak$2 */
    class C03682 implements OnItemSelectedListener {
        /* renamed from: a */
        final /* synthetic */ ak f1290a;

        C03682(ak akVar) {
            this.f1290a = akVar;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i != -1) {
                ag agVar = this.f1290a.f2342c;
                if (agVar != null) {
                    agVar.setListSelectionHidden(false);
                }
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: android.support.v7.widget.ak$a */
    private class C0369a implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ak f1291a;

        C0369a(ak akVar) {
            this.f1291a = akVar;
        }

        public void run() {
            this.f1291a.m2883m();
        }
    }

    /* renamed from: android.support.v7.widget.ak$b */
    private class C0370b extends DataSetObserver {
        /* renamed from: a */
        final /* synthetic */ ak f1292a;

        C0370b(ak akVar) {
            this.f1292a = akVar;
        }

        public void onChanged() {
            if (this.f1292a.mo288d()) {
                this.f1292a.mo286a();
            }
        }

        public void onInvalidated() {
            this.f1292a.mo287c();
        }
    }

    /* renamed from: android.support.v7.widget.ak$c */
    private class C0371c implements OnScrollListener {
        /* renamed from: a */
        final /* synthetic */ ak f1293a;

        C0371c(ak akVar) {
            this.f1293a = akVar;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !this.f1293a.m2884n() && this.f1293a.f2346g.getContentView() != null) {
                this.f1293a.f2345f.removeCallbacks(this.f1293a.f2344e);
                this.f1293a.f2344e.run();
            }
        }
    }

    /* renamed from: android.support.v7.widget.ak$d */
    private class C0372d implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ ak f1294a;

        C0372d(ak akVar) {
            this.f1294a = akVar;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && this.f1294a.f2346g != null && this.f1294a.f2346g.isShowing() && x >= 0 && x < this.f1294a.f2346g.getWidth() && y >= 0 && y < this.f1294a.f2346g.getHeight()) {
                this.f1294a.f2345f.postDelayed(this.f1294a.f2344e, 250);
            } else if (action == 1) {
                this.f1294a.f2345f.removeCallbacks(this.f1294a.f2344e);
            }
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.ak$e */
    private class C0373e implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ak f1295a;

        C0373e(ak akVar) {
            this.f1295a = akVar;
        }

        public void run() {
            if (this.f1295a.f2342c != null && C0227p.m887m(this.f1295a.f2342c) && this.f1295a.f2342c.getCount() > this.f1295a.f2342c.getChildCount() && this.f1295a.f2342c.getChildCount() <= this.f1295a.f2343d) {
                this.f1295a.f2346g.setInputMethodMode(2);
                this.f1295a.mo286a();
            }
        }
    }

    static {
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
        r0 = 0;
        r1 = 1;
        r2 = android.widget.PopupWindow.class;	 Catch:{ NoSuchMethodException -> 0x0013 }
        r3 = "setClipToScreenEnabled";	 Catch:{ NoSuchMethodException -> 0x0013 }
        r4 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x0013 }
        r5 = java.lang.Boolean.TYPE;	 Catch:{ NoSuchMethodException -> 0x0013 }
        r4[r0] = r5;	 Catch:{ NoSuchMethodException -> 0x0013 }
        r2 = r2.getDeclaredMethod(r3, r4);	 Catch:{ NoSuchMethodException -> 0x0013 }
        f2329a = r2;	 Catch:{ NoSuchMethodException -> 0x0013 }
        goto L_0x001a;
    L_0x0013:
        r2 = "ListPopupWindow";
        r3 = "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.";
        android.util.Log.i(r2, r3);
    L_0x001a:
        r2 = android.widget.PopupWindow.class;	 Catch:{ NoSuchMethodException -> 0x0035 }
        r3 = "getMaxAvailableHeight";	 Catch:{ NoSuchMethodException -> 0x0035 }
        r4 = 3;	 Catch:{ NoSuchMethodException -> 0x0035 }
        r4 = new java.lang.Class[r4];	 Catch:{ NoSuchMethodException -> 0x0035 }
        r5 = android.view.View.class;	 Catch:{ NoSuchMethodException -> 0x0035 }
        r4[r0] = r5;	 Catch:{ NoSuchMethodException -> 0x0035 }
        r5 = java.lang.Integer.TYPE;	 Catch:{ NoSuchMethodException -> 0x0035 }
        r4[r1] = r5;	 Catch:{ NoSuchMethodException -> 0x0035 }
        r5 = 2;	 Catch:{ NoSuchMethodException -> 0x0035 }
        r6 = java.lang.Boolean.TYPE;	 Catch:{ NoSuchMethodException -> 0x0035 }
        r4[r5] = r6;	 Catch:{ NoSuchMethodException -> 0x0035 }
        r2 = r2.getDeclaredMethod(r3, r4);	 Catch:{ NoSuchMethodException -> 0x0035 }
        f2330b = r2;	 Catch:{ NoSuchMethodException -> 0x0035 }
        goto L_0x003c;
    L_0x0035:
        r2 = "ListPopupWindow";
        r3 = "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.";
        android.util.Log.i(r2, r3);
    L_0x003c:
        r2 = android.widget.PopupWindow.class;	 Catch:{ NoSuchMethodException -> 0x004d }
        r3 = "setEpicenterBounds";	 Catch:{ NoSuchMethodException -> 0x004d }
        r1 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x004d }
        r4 = android.graphics.Rect.class;	 Catch:{ NoSuchMethodException -> 0x004d }
        r1[r0] = r4;	 Catch:{ NoSuchMethodException -> 0x004d }
        r0 = r2.getDeclaredMethod(r3, r1);	 Catch:{ NoSuchMethodException -> 0x004d }
        f2331h = r0;	 Catch:{ NoSuchMethodException -> 0x004d }
        goto L_0x0054;
    L_0x004d:
        r0 = "ListPopupWindow";
        r1 = "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.";
        android.util.Log.i(r0, r1);
    L_0x0054:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ak.<clinit>():void");
    }

    public ak(Context context) {
        this(context, null, C0260a.listPopupWindowStyle);
    }

    public ak(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ak(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f2349k = -2;
        this.f2350l = -2;
        this.f2353o = 1002;
        this.f2355q = true;
        this.f2358t = 0;
        this.f2359u = false;
        this.f2360v = false;
        this.f2343d = Integer.MAX_VALUE;
        this.f2362x = 0;
        this.f2344e = new C0373e(this);
        this.f2335D = new C0372d(this);
        this.f2336E = new C0371c(this);
        this.f2337F = new C0369a(this);
        this.f2339H = new Rect();
        this.f2347i = context;
        this.f2345f = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0269j.ListPopupWindow, i, i2);
        this.f2351m = obtainStyledAttributes.getDimensionPixelOffset(C0269j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.f2352n = obtainStyledAttributes.getDimensionPixelOffset(C0269j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.f2352n != 0) {
            this.f2354p = true;
        }
        obtainStyledAttributes.recycle();
        this.f2346g = new C0397s(context, attributeSet, i, i2);
        this.f2346g.setInputMethodMode(1);
    }

    /* renamed from: a */
    private int m2851a(android.view.View r6, int r7, boolean r8) {
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
        r0 = f2330b;
        if (r0 == 0) goto L_0x002e;
    L_0x0004:
        r0 = f2330b;	 Catch:{ Exception -> 0x0027 }
        r1 = r5.f2346g;	 Catch:{ Exception -> 0x0027 }
        r2 = 3;	 Catch:{ Exception -> 0x0027 }
        r2 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x0027 }
        r3 = 0;	 Catch:{ Exception -> 0x0027 }
        r2[r3] = r6;	 Catch:{ Exception -> 0x0027 }
        r3 = 1;	 Catch:{ Exception -> 0x0027 }
        r4 = java.lang.Integer.valueOf(r7);	 Catch:{ Exception -> 0x0027 }
        r2[r3] = r4;	 Catch:{ Exception -> 0x0027 }
        r3 = 2;	 Catch:{ Exception -> 0x0027 }
        r8 = java.lang.Boolean.valueOf(r8);	 Catch:{ Exception -> 0x0027 }
        r2[r3] = r8;	 Catch:{ Exception -> 0x0027 }
        r8 = r0.invoke(r1, r2);	 Catch:{ Exception -> 0x0027 }
        r8 = (java.lang.Integer) r8;	 Catch:{ Exception -> 0x0027 }
        r8 = r8.intValue();	 Catch:{ Exception -> 0x0027 }
        return r8;
    L_0x0027:
        r8 = "ListPopupWindow";
        r0 = "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.";
        android.util.Log.i(r8, r0);
    L_0x002e:
        r8 = r5.f2346g;
        r6 = r8.getMaxAvailableHeight(r6, r7);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ak.a(android.view.View, int, boolean):int");
    }

    /* renamed from: b */
    private void mo532b() {
        if (this.f2361w != null) {
            ViewParent parent = this.f2361w.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f2361w);
            }
        }
    }

    /* renamed from: c */
    private void mo524c(boolean r5) {
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
        r4 = this;
        r0 = f2329a;
        if (r0 == 0) goto L_0x001d;
    L_0x0004:
        r0 = f2329a;	 Catch:{ Exception -> 0x0016 }
        r1 = r4.f2346g;	 Catch:{ Exception -> 0x0016 }
        r2 = 1;	 Catch:{ Exception -> 0x0016 }
        r2 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x0016 }
        r3 = 0;	 Catch:{ Exception -> 0x0016 }
        r5 = java.lang.Boolean.valueOf(r5);	 Catch:{ Exception -> 0x0016 }
        r2[r3] = r5;	 Catch:{ Exception -> 0x0016 }
        r0.invoke(r1, r2);	 Catch:{ Exception -> 0x0016 }
        goto L_0x001d;
    L_0x0016:
        r5 = "ListPopupWindow";
        r0 = "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.";
        android.util.Log.i(r5, r0);
    L_0x001d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ak.c(boolean):void");
    }

    /* renamed from: f */
    private int mo533f() {
        int i;
        int i2;
        boolean z = true;
        if (this.f2342c == null) {
            Context context = this.f2347i;
            this.f2338G = new C03671(this);
            this.f2342c = mo523a(context, this.f2341J ^ true);
            if (this.f2332A != null) {
                this.f2342c.setSelector(this.f2332A);
            }
            this.f2342c.setAdapter(this.f2348j);
            this.f2342c.setOnItemClickListener(this.f2333B);
            this.f2342c.setFocusable(true);
            this.f2342c.setFocusableInTouchMode(true);
            this.f2342c.setOnItemSelectedListener(new C03682(this));
            this.f2342c.setOnScrollListener(this.f2336E);
            if (this.f2334C != null) {
                this.f2342c.setOnItemSelectedListener(this.f2334C);
            }
            View view = this.f2342c;
            View view2 = this.f2361w;
            if (view2 != null) {
                View linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                switch (this.f2362x) {
                    case 0:
                        linearLayout.addView(view2);
                        linearLayout.addView(view, layoutParams);
                        break;
                    case 1:
                        linearLayout.addView(view, layoutParams);
                        linearLayout.addView(view2);
                        break;
                    default:
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Invalid hint position ");
                        stringBuilder.append(this.f2362x);
                        Log.e("ListPopupWindow", stringBuilder.toString());
                        break;
                }
                if (this.f2350l >= 0) {
                    i = this.f2350l;
                    i2 = Integer.MIN_VALUE;
                } else {
                    i = 0;
                    i2 = 0;
                }
                view2.measure(MeasureSpec.makeMeasureSpec(i, i2), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i = (view2.getMeasuredHeight() + layoutParams2.topMargin) + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                i = 0;
            }
            this.f2346g.setContentView(view);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f2346g.getContentView();
            View view3 = this.f2361w;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                i = (view3.getMeasuredHeight() + layoutParams3.topMargin) + layoutParams3.bottomMargin;
            } else {
                i = 0;
            }
        }
        Drawable background = this.f2346g.getBackground();
        if (background != null) {
            background.getPadding(this.f2339H);
            i2 = this.f2339H.top + this.f2339H.bottom;
            if (!this.f2354p) {
                this.f2352n = -this.f2339H.top;
            }
        } else {
            this.f2339H.setEmpty();
            i2 = 0;
        }
        if (this.f2346g.getInputMethodMode() != 2) {
            z = false;
        }
        int a = m2851a(m2878i(), this.f2352n, z);
        if (!this.f2359u) {
            if (this.f2349k != -1) {
                int makeMeasureSpec;
                switch (this.f2350l) {
                    case -2:
                        makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f2347i.getResources().getDisplayMetrics().widthPixels - (this.f2339H.left + this.f2339H.right), Integer.MIN_VALUE);
                        break;
                    case -1:
                        makeMeasureSpec = this.f2347i.getResources().getDisplayMetrics().widthPixels - (this.f2339H.left + this.f2339H.right);
                        break;
                    default:
                        makeMeasureSpec = this.f2350l;
                        break;
                }
                makeMeasureSpec = MeasureSpec.makeMeasureSpec(makeMeasureSpec, 1073741824);
                makeMeasureSpec = this.f2342c.mo290a(makeMeasureSpec, 0, -1, a - i, -1);
                if (makeMeasureSpec > 0) {
                    i += i2 + (this.f2342c.getPaddingTop() + this.f2342c.getPaddingBottom());
                }
                return makeMeasureSpec + i;
            }
        }
        return a + i2;
    }

    /* renamed from: a */
    ag mo523a(Context context, boolean z) {
        return new ag(context, z);
    }

    /* renamed from: a */
    public void mo286a() {
        int f = mo533f();
        boolean n = m2884n();
        C0257j.m989a(this.f2346g, this.f2353o);
        boolean z = true;
        if (!this.f2346g.isShowing()) {
            int width = this.f2350l == -1 ? -1 : this.f2350l == -2 ? m2878i().getWidth() : this.f2350l;
            if (this.f2349k == -1) {
                f = -1;
            } else if (this.f2349k != -2) {
                f = this.f2349k;
            }
            this.f2346g.setWidth(width);
            this.f2346g.setHeight(f);
            mo524c(true);
            PopupWindow popupWindow = this.f2346g;
            n = (this.f2360v || this.f2359u) ? false : true;
            popupWindow.setOutsideTouchable(n);
            this.f2346g.setTouchInterceptor(this.f2335D);
            if (this.f2357s) {
                C0257j.m991a(this.f2346g, this.f2356r);
            }
            if (f2331h != null) {
                try {
                    f2331h.invoke(this.f2346g, new Object[]{this.f2340I});
                } catch (Throwable e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
            C0257j.m990a(this.f2346g, m2878i(), this.f2351m, this.f2352n, this.f2358t);
            this.f2342c.setSelection(-1);
            if (!this.f2341J || this.f2342c.isInTouchMode()) {
                m2883m();
            }
            if (!this.f2341J) {
                this.f2345f.post(this.f2337F);
            }
        } else if (C0227p.m887m(m2878i())) {
            int width2 = this.f2350l == -1 ? -1 : this.f2350l == -2 ? m2878i().getWidth() : this.f2350l;
            if (this.f2349k == -1) {
                if (!n) {
                    f = -1;
                }
                if (n) {
                    this.f2346g.setWidth(this.f2350l == -1 ? -1 : 0);
                    this.f2346g.setHeight(0);
                } else {
                    this.f2346g.setWidth(this.f2350l == -1 ? -1 : 0);
                    this.f2346g.setHeight(-1);
                }
            } else if (this.f2349k != -2) {
                f = this.f2349k;
            }
            PopupWindow popupWindow2 = this.f2346g;
            if (this.f2360v || this.f2359u) {
                z = false;
            }
            popupWindow2.setOutsideTouchable(z);
            this.f2346g.update(m2878i(), this.f2351m, this.f2352n, width2 < 0 ? -1 : width2, f < 0 ? -1 : f);
        }
    }

    /* renamed from: a */
    public void m2857a(int i) {
        this.f2362x = i;
    }

    /* renamed from: a */
    public void m2858a(Rect rect) {
        this.f2340I = rect;
    }

    /* renamed from: a */
    public void m2859a(Drawable drawable) {
        this.f2346g.setBackgroundDrawable(drawable);
    }

    /* renamed from: a */
    public void m2860a(OnItemClickListener onItemClickListener) {
        this.f2333B = onItemClickListener;
    }

    /* renamed from: a */
    public void mo531a(ListAdapter listAdapter) {
        if (this.f2363y == null) {
            this.f2363y = new C0370b(this);
        } else if (this.f2348j != null) {
            this.f2348j.unregisterDataSetObserver(this.f2363y);
        }
        this.f2348j = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2363y);
        }
        if (this.f2342c != null) {
            this.f2342c.setAdapter(this.f2348j);
        }
    }

    /* renamed from: a */
    public void m2862a(OnDismissListener onDismissListener) {
        this.f2346g.setOnDismissListener(onDismissListener);
    }

    /* renamed from: a */
    public void m2863a(boolean z) {
        this.f2341J = z;
        this.f2346g.setFocusable(z);
    }

    /* renamed from: b */
    public void m2864b(int i) {
        this.f2346g.setAnimationStyle(i);
    }

    /* renamed from: b */
    public void m2865b(View view) {
        this.f2364z = view;
    }

    /* renamed from: b */
    public void m2866b(boolean z) {
        this.f2357s = true;
        this.f2356r = z;
    }

    /* renamed from: c */
    public void mo287c() {
        this.f2346g.dismiss();
        mo532b();
        this.f2346g.setContentView(null);
        this.f2342c = null;
        this.f2345f.removeCallbacks(this.f2344e);
    }

    /* renamed from: c */
    public void m2868c(int i) {
        this.f2351m = i;
    }

    /* renamed from: d */
    public void m2869d(int i) {
        this.f2352n = i;
        this.f2354p = true;
    }

    /* renamed from: d */
    public boolean mo288d() {
        return this.f2346g.isShowing();
    }

    /* renamed from: e */
    public ListView mo289e() {
        return this.f2342c;
    }

    /* renamed from: e */
    public void m2872e(int i) {
        this.f2358t = i;
    }

    /* renamed from: f */
    public void m2873f(int i) {
        this.f2350l = i;
    }

    /* renamed from: g */
    public void m2874g(int i) {
        Drawable background = this.f2346g.getBackground();
        if (background != null) {
            background.getPadding(this.f2339H);
            this.f2350l = (this.f2339H.left + this.f2339H.right) + i;
            return;
        }
        m2873f(i);
    }

    /* renamed from: g */
    public boolean m2875g() {
        return this.f2341J;
    }

    /* renamed from: h */
    public Drawable m2876h() {
        return this.f2346g.getBackground();
    }

    /* renamed from: h */
    public void m2877h(int i) {
        this.f2346g.setInputMethodMode(i);
    }

    /* renamed from: i */
    public View m2878i() {
        return this.f2364z;
    }

    /* renamed from: i */
    public void m2879i(int i) {
        ag agVar = this.f2342c;
        if (mo288d() && agVar != null) {
            agVar.setListSelectionHidden(false);
            agVar.setSelection(i);
            if (agVar.getChoiceMode() != 0) {
                agVar.setItemChecked(i, true);
            }
        }
    }

    /* renamed from: j */
    public int m2880j() {
        return this.f2351m;
    }

    /* renamed from: k */
    public int m2881k() {
        return !this.f2354p ? 0 : this.f2352n;
    }

    /* renamed from: l */
    public int m2882l() {
        return this.f2350l;
    }

    /* renamed from: m */
    public void m2883m() {
        ag agVar = this.f2342c;
        if (agVar != null) {
            agVar.setListSelectionHidden(true);
            agVar.requestLayout();
        }
    }

    /* renamed from: n */
    public boolean m2884n() {
        return this.f2346g.getInputMethodMode() == 2;
    }
}
