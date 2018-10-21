package android.support.v7.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.v4.p017g.C0204a;
import android.support.v4.widget.C0568d;
import android.support.v7.p020a.C0270a.C0260a;
import android.support.v7.p020a.C0270a.C0263d;
import android.support.v7.view.C0309c;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewConfiguration;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends aj implements C0309c {
    /* renamed from: i */
    static final C0349a f2272i = new C0349a();
    /* renamed from: A */
    private OnClickListener f2273A;
    /* renamed from: B */
    private boolean f2274B;
    /* renamed from: C */
    private boolean f2275C;
    /* renamed from: D */
    private boolean f2276D;
    /* renamed from: E */
    private CharSequence f2277E;
    /* renamed from: F */
    private boolean f2278F;
    /* renamed from: G */
    private boolean f2279G;
    /* renamed from: H */
    private int f2280H;
    /* renamed from: I */
    private boolean f2281I;
    /* renamed from: J */
    private CharSequence f2282J;
    /* renamed from: K */
    private boolean f2283K;
    /* renamed from: L */
    private int f2284L;
    /* renamed from: M */
    private Bundle f2285M;
    /* renamed from: N */
    private final Runnable f2286N;
    /* renamed from: O */
    private Runnable f2287O;
    /* renamed from: P */
    private final WeakHashMap<String, ConstantState> f2288P;
    /* renamed from: a */
    final SearchAutoComplete f2289a;
    /* renamed from: b */
    final ImageView f2290b;
    /* renamed from: c */
    final ImageView f2291c;
    /* renamed from: d */
    final ImageView f2292d;
    /* renamed from: e */
    final ImageView f2293e;
    /* renamed from: f */
    OnFocusChangeListener f2294f;
    /* renamed from: g */
    C0568d f2295g;
    /* renamed from: h */
    SearchableInfo f2296h;
    /* renamed from: j */
    private final View f2297j;
    /* renamed from: k */
    private final View f2298k;
    /* renamed from: l */
    private C0354f f2299l;
    /* renamed from: m */
    private Rect f2300m;
    /* renamed from: n */
    private Rect f2301n;
    /* renamed from: o */
    private int[] f2302o;
    /* renamed from: p */
    private int[] f2303p;
    /* renamed from: q */
    private final ImageView f2304q;
    /* renamed from: r */
    private final Drawable f2305r;
    /* renamed from: s */
    private final int f2306s;
    /* renamed from: t */
    private final int f2307t;
    /* renamed from: u */
    private final Intent f2308u;
    /* renamed from: v */
    private final Intent f2309v;
    /* renamed from: w */
    private final CharSequence f2310w;
    /* renamed from: x */
    private C0351c f2311x;
    /* renamed from: y */
    private C0350b f2312y;
    /* renamed from: z */
    private C0352d f2313z;

    /* renamed from: android.support.v7.widget.SearchView$a */
    private static class C0349a {
        /* renamed from: a */
        private Method f1167a;
        /* renamed from: b */
        private Method f1168b;
        /* renamed from: c */
        private Method f1169c;

        C0349a() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/1763344271.run(Unknown Source)
*/
            /*
            r6 = this;
            r6.<init>();
            r0 = 0;
            r1 = 1;
            r2 = android.widget.AutoCompleteTextView.class;	 Catch:{ NoSuchMethodException -> 0x0016 }
            r3 = "doBeforeTextChanged";	 Catch:{ NoSuchMethodException -> 0x0016 }
            r4 = new java.lang.Class[r0];	 Catch:{ NoSuchMethodException -> 0x0016 }
            r2 = r2.getDeclaredMethod(r3, r4);	 Catch:{ NoSuchMethodException -> 0x0016 }
            r6.f1167a = r2;	 Catch:{ NoSuchMethodException -> 0x0016 }
            r2 = r6.f1167a;	 Catch:{ NoSuchMethodException -> 0x0016 }
            r2.setAccessible(r1);	 Catch:{ NoSuchMethodException -> 0x0016 }
        L_0x0016:
            r2 = android.widget.AutoCompleteTextView.class;	 Catch:{ NoSuchMethodException -> 0x0027 }
            r3 = "doAfterTextChanged";	 Catch:{ NoSuchMethodException -> 0x0027 }
            r4 = new java.lang.Class[r0];	 Catch:{ NoSuchMethodException -> 0x0027 }
            r2 = r2.getDeclaredMethod(r3, r4);	 Catch:{ NoSuchMethodException -> 0x0027 }
            r6.f1168b = r2;	 Catch:{ NoSuchMethodException -> 0x0027 }
            r2 = r6.f1168b;	 Catch:{ NoSuchMethodException -> 0x0027 }
            r2.setAccessible(r1);	 Catch:{ NoSuchMethodException -> 0x0027 }
        L_0x0027:
            r2 = android.widget.AutoCompleteTextView.class;	 Catch:{ NoSuchMethodException -> 0x003c }
            r3 = "ensureImeVisible";	 Catch:{ NoSuchMethodException -> 0x003c }
            r4 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x003c }
            r5 = java.lang.Boolean.TYPE;	 Catch:{ NoSuchMethodException -> 0x003c }
            r4[r0] = r5;	 Catch:{ NoSuchMethodException -> 0x003c }
            r0 = r2.getMethod(r3, r4);	 Catch:{ NoSuchMethodException -> 0x003c }
            r6.f1169c = r0;	 Catch:{ NoSuchMethodException -> 0x003c }
            r0 = r6.f1169c;	 Catch:{ NoSuchMethodException -> 0x003c }
            r0.setAccessible(r1);	 Catch:{ NoSuchMethodException -> 0x003c }
        L_0x003c:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SearchView.a.<init>():void");
        }

        /* renamed from: a */
        void m1271a(android.widget.AutoCompleteTextView r3) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/1763344271.run(Unknown Source)
*/
            /*
            r2 = this;
            r0 = r2.f1167a;
            if (r0 == 0) goto L_0x000c;
        L_0x0004:
            r0 = r2.f1167a;	 Catch:{ Exception -> 0x000c }
            r1 = 0;	 Catch:{ Exception -> 0x000c }
            r1 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x000c }
            r0.invoke(r3, r1);	 Catch:{ Exception -> 0x000c }
        L_0x000c:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SearchView.a.a(android.widget.AutoCompleteTextView):void");
        }

        /* renamed from: a */
        void m1272a(android.widget.AutoCompleteTextView r4, boolean r5) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/1763344271.run(Unknown Source)
*/
            /*
            r3 = this;
            r0 = r3.f1169c;
            if (r0 == 0) goto L_0x0013;
        L_0x0004:
            r0 = r3.f1169c;	 Catch:{ Exception -> 0x0013 }
            r1 = 1;	 Catch:{ Exception -> 0x0013 }
            r1 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x0013 }
            r2 = 0;	 Catch:{ Exception -> 0x0013 }
            r5 = java.lang.Boolean.valueOf(r5);	 Catch:{ Exception -> 0x0013 }
            r1[r2] = r5;	 Catch:{ Exception -> 0x0013 }
            r0.invoke(r4, r1);	 Catch:{ Exception -> 0x0013 }
        L_0x0013:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SearchView.a.a(android.widget.AutoCompleteTextView, boolean):void");
        }

        /* renamed from: b */
        void m1273b(android.widget.AutoCompleteTextView r3) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/1763344271.run(Unknown Source)
*/
            /*
            r2 = this;
            r0 = r2.f1168b;
            if (r0 == 0) goto L_0x000c;
        L_0x0004:
            r0 = r2.f1168b;	 Catch:{ Exception -> 0x000c }
            r1 = 0;	 Catch:{ Exception -> 0x000c }
            r1 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x000c }
            r0.invoke(r3, r1);	 Catch:{ Exception -> 0x000c }
        L_0x000c:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SearchView.a.b(android.widget.AutoCompleteTextView):void");
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$b */
    public interface C0350b {
        /* renamed from: a */
        boolean m1274a();
    }

    /* renamed from: android.support.v7.widget.SearchView$c */
    public interface C0351c {
        /* renamed from: a */
        boolean m1275a(String str);
    }

    /* renamed from: android.support.v7.widget.SearchView$d */
    public interface C0352d {
    }

    /* renamed from: android.support.v7.widget.SearchView$f */
    private static class C0354f extends TouchDelegate {
        /* renamed from: a */
        private final View f1170a;
        /* renamed from: b */
        private final Rect f1171b = new Rect();
        /* renamed from: c */
        private final Rect f1172c = new Rect();
        /* renamed from: d */
        private final Rect f1173d = new Rect();
        /* renamed from: e */
        private final int f1174e;
        /* renamed from: f */
        private boolean f1175f;

        public C0354f(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1174e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            m1279a(rect, rect2);
            this.f1170a = view;
        }

        /* renamed from: a */
        public void m1279a(Rect rect, Rect rect2) {
            this.f1171b.set(rect);
            this.f1173d.set(rect);
            this.f1173d.inset(-this.f1174e, -this.f1174e);
            this.f1172c.set(rect2);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r7) {
            /*
            r6 = this;
            r0 = r7.getX();
            r0 = (int) r0;
            r1 = r7.getY();
            r1 = (int) r1;
            r2 = r7.getAction();
            r3 = 1;
            r4 = 0;
            switch(r2) {
                case 0: goto L_0x0027;
                case 1: goto L_0x0019;
                case 2: goto L_0x0019;
                case 3: goto L_0x0014;
                default: goto L_0x0013;
            };
        L_0x0013:
            goto L_0x0033;
        L_0x0014:
            r2 = r6.f1175f;
            r6.f1175f = r4;
            goto L_0x0034;
        L_0x0019:
            r2 = r6.f1175f;
            if (r2 == 0) goto L_0x0034;
        L_0x001d:
            r5 = r6.f1173d;
            r5 = r5.contains(r0, r1);
            if (r5 != 0) goto L_0x0034;
        L_0x0025:
            r3 = 0;
            goto L_0x0034;
        L_0x0027:
            r2 = r6.f1171b;
            r2 = r2.contains(r0, r1);
            if (r2 == 0) goto L_0x0033;
        L_0x002f:
            r6.f1175f = r3;
            r2 = 1;
            goto L_0x0034;
        L_0x0033:
            r2 = 0;
        L_0x0034:
            if (r2 == 0) goto L_0x0067;
        L_0x0036:
            if (r3 == 0) goto L_0x0052;
        L_0x0038:
            r2 = r6.f1172c;
            r2 = r2.contains(r0, r1);
            if (r2 != 0) goto L_0x0052;
        L_0x0040:
            r0 = r6.f1170a;
            r0 = r0.getWidth();
            r0 = r0 / 2;
            r0 = (float) r0;
            r1 = r6.f1170a;
            r1 = r1.getHeight();
            r1 = r1 / 2;
            goto L_0x005d;
        L_0x0052:
            r2 = r6.f1172c;
            r2 = r2.left;
            r0 = r0 - r2;
            r0 = (float) r0;
            r2 = r6.f1172c;
            r2 = r2.top;
            r1 = r1 - r2;
        L_0x005d:
            r1 = (float) r1;
            r7.setLocation(r0, r1);
            r0 = r6.f1170a;
            r4 = r0.dispatchTouchEvent(r7);
        L_0x0067:
            return r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SearchView.f.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$e */
    static class C0610e extends C0204a {
        public static final Creator<C0610e> CREATOR = new C03531();
        /* renamed from: b */
        boolean f2271b;

        /* renamed from: android.support.v7.widget.SearchView$e$1 */
        static class C03531 implements ClassLoaderCreator<C0610e> {
            C03531() {
            }

            /* renamed from: a */
            public C0610e m1276a(Parcel parcel) {
                return new C0610e(parcel, null);
            }

            /* renamed from: a */
            public C0610e m1277a(Parcel parcel, ClassLoader classLoader) {
                return new C0610e(parcel, classLoader);
            }

            /* renamed from: a */
            public C0610e[] m1278a(int i) {
                return new C0610e[i];
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m1276a(parcel);
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m1277a(parcel, classLoader);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m1278a(i);
            }
        }

        public C0610e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2271b = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        C0610e(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SearchView.SavedState{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" isIconified=");
            stringBuilder.append(this.f2271b);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f2271b));
        }
    }

    public static class SearchAutoComplete extends C0624f {
        /* renamed from: a */
        final Runnable f2755a;
        /* renamed from: b */
        private int f2756b;
        /* renamed from: c */
        private SearchView f2757c;
        /* renamed from: d */
        private boolean f2758d;

        /* renamed from: android.support.v7.widget.SearchView$SearchAutoComplete$1 */
        class C03481 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ SearchAutoComplete f1166a;

            C03481(SearchAutoComplete searchAutoComplete) {
                this.f1166a = searchAutoComplete;
            }

            public void run() {
                this.f1166a.m3605a();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C0260a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f2755a = new C03481(this);
            this.f2756b = getThreshold();
        }

        /* renamed from: a */
        private void m3605a() {
            if (this.f2758d) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f2758d = false;
            }
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                if (i < 640 || i2 < 480) {
                    return 160;
                }
            }
            return 192;
        }

        private void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f2758d = false;
                removeCallbacks(this.f2755a);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f2758d = false;
                removeCallbacks(this.f2755a);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f2758d = true;
            }
        }

        public boolean enoughToFilter() {
            if (this.f2756b > 0) {
                if (!super.enoughToFilter()) {
                    return false;
                }
            }
            return true;
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f2758d) {
                removeCallbacks(this.f2755a);
                post(this.f2755a);
            }
            return onCreateInputConnection;
        }

        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        protected void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f2757c.m2832g();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f2757c.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f2757c.hasFocus() && getVisibility() == 0) {
                this.f2758d = true;
                if (SearchView.m2811a(getContext())) {
                    SearchView.f2272i.m1272a(this, true);
                }
            }
        }

        public void performCompletion() {
        }

        protected void replaceText(CharSequence charSequence) {
        }

        void setSearchView(SearchView searchView) {
            this.f2757c = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f2756b = i;
        }
    }

    /* renamed from: a */
    private Intent m2808a(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f2282J);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        if (this.f2285M != null) {
            intent.putExtra("app_data", this.f2285M);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f2296h.getSearchActivity());
        return intent;
    }

    /* renamed from: a */
    private void m2809a(View view, Rect rect) {
        view.getLocationInWindow(this.f2302o);
        getLocationInWindow(this.f2303p);
        int i = this.f2302o[1] - this.f2303p[1];
        int i2 = this.f2302o[0] - this.f2303p[0];
        rect.set(i2, i, view.getWidth() + i2, view.getHeight() + i);
    }

    /* renamed from: a */
    private void m2810a(boolean z) {
        this.f2275C = z;
        int i = 8;
        boolean z2 = false;
        boolean isEmpty = TextUtils.isEmpty(this.f2289a.getText()) ^ true;
        this.f2290b.setVisibility(z ? 0 : 8);
        m2813b(isEmpty);
        this.f2297j.setVisibility(z ? 8 : 0);
        if (this.f2304q.getDrawable() != null) {
            if (!this.f2274B) {
                i = 0;
            }
        }
        this.f2304q.setVisibility(i);
        m2818m();
        if (!isEmpty) {
            z2 = true;
        }
        m2814c(z2);
        m2817l();
    }

    /* renamed from: a */
    static boolean m2811a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: b */
    private CharSequence m2812b(CharSequence charSequence) {
        if (this.f2274B) {
            if (this.f2305r != null) {
                double textSize = (double) this.f2289a.getTextSize();
                Double.isNaN(textSize);
                int i = (int) (textSize * 1.25d);
                this.f2305r.setBounds(0, 0, i, i);
                CharSequence spannableStringBuilder = new SpannableStringBuilder("   ");
                spannableStringBuilder.setSpan(new ImageSpan(this.f2305r), 1, 2, 33);
                spannableStringBuilder.append(charSequence);
                return spannableStringBuilder;
            }
        }
        return charSequence;
    }

    /* renamed from: b */
    private void m2813b(boolean z) {
        int i = (this.f2276D && m2816k() && hasFocus() && (z || !this.f2281I)) ? 0 : 8;
        this.f2291c.setVisibility(i);
    }

    /* renamed from: c */
    private void m2814c(boolean z) {
        int i;
        if (this.f2281I && !m2828c() && z) {
            i = 0;
            this.f2291c.setVisibility(8);
        } else {
            i = 8;
        }
        this.f2293e.setVisibility(i);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C0263d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C0263d.abc_search_view_preferred_width);
    }

    /* renamed from: i */
    private boolean m2815i() {
        if (this.f2296h == null || !this.f2296h.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f2296h.getVoiceSearchLaunchWebSearch()) {
            intent = this.f2308u;
        } else if (this.f2296h.getVoiceSearchLaunchRecognizer()) {
            intent = this.f2309v;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    /* renamed from: k */
    private boolean m2816k() {
        return (this.f2276D || this.f2281I) && !m2828c();
    }

    /* renamed from: l */
    private void m2817l() {
        int i = (m2816k() && (this.f2291c.getVisibility() == 0 || this.f2293e.getVisibility() == 0)) ? 0 : 8;
        this.f2298k.setVisibility(i);
    }

    /* renamed from: m */
    private void m2818m() {
        int i = 1;
        int isEmpty = TextUtils.isEmpty(this.f2289a.getText()) ^ 1;
        int i2 = 0;
        if (isEmpty == 0) {
            if (!this.f2274B || this.f2283K) {
                i = 0;
            }
        }
        ImageView imageView = this.f2292d;
        if (i == 0) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        Drawable drawable = this.f2292d.getDrawable();
        if (drawable != null) {
            drawable.setState(isEmpty != 0 ? ENABLED_STATE_SET : EMPTY_STATE_SET);
        }
    }

    /* renamed from: n */
    private void m2819n() {
        post(this.f2286N);
    }

    /* renamed from: o */
    private void m2820o() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f2289a;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m2812b(queryHint));
    }

    /* renamed from: p */
    private void m2821p() {
        this.f2289a.setThreshold(this.f2296h.getSuggestThreshold());
        this.f2289a.setImeOptions(this.f2296h.getImeOptions());
        int inputType = this.f2296h.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f2296h.getSuggestAuthority() != null) {
                inputType = (inputType | 65536) | 524288;
            }
        }
        this.f2289a.setInputType(inputType);
        if (this.f2295g != null) {
            this.f2295g.mo109a(null);
        }
        if (this.f2296h.getSuggestAuthority() != null) {
            this.f2295g = new aq(getContext(), this, this.f2296h, this.f2288P);
            this.f2289a.setAdapter(this.f2295g);
            aq aqVar = (aq) this.f2295g;
            if (this.f2278F) {
                i = 2;
            }
            aqVar.m3728a(i);
        }
    }

    /* renamed from: q */
    private void m2822q() {
        this.f2289a.dismissDropDown();
    }

    private void setQuery(CharSequence charSequence) {
        this.f2289a.setText(charSequence);
        this.f2289a.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* renamed from: a */
    public void mo235a() {
        if (!this.f2283K) {
            this.f2283K = true;
            this.f2284L = this.f2289a.getImeOptions();
            this.f2289a.setImeOptions(this.f2284L | 33554432);
            this.f2289a.setText("");
            setIconified(false);
        }
    }

    /* renamed from: a */
    void m2824a(int i, String str, String str2) {
        getContext().startActivity(m2808a("android.intent.action.SEARCH", null, null, str2, i, str));
    }

    /* renamed from: a */
    void m2825a(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: a */
    public void m2826a(CharSequence charSequence, boolean z) {
        this.f2289a.setText(charSequence);
        if (charSequence != null) {
            this.f2289a.setSelection(this.f2289a.length());
            this.f2282J = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            m2829d();
        }
    }

    /* renamed from: b */
    public void mo236b() {
        m2826a((CharSequence) "", false);
        clearFocus();
        m2810a(true);
        this.f2289a.setImeOptions(this.f2284L);
        this.f2283K = false;
    }

    /* renamed from: c */
    public boolean m2828c() {
        return this.f2275C;
    }

    public void clearFocus() {
        this.f2279G = true;
        super.clearFocus();
        this.f2289a.clearFocus();
        this.f2289a.setImeVisibility(false);
        this.f2279G = false;
    }

    /* renamed from: d */
    void m2829d() {
        CharSequence text = this.f2289a.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f2311x == null || !this.f2311x.m1275a(text.toString())) {
                if (this.f2296h != null) {
                    m2824a(0, null, text.toString());
                }
                this.f2289a.setImeVisibility(false);
                m2822q();
            }
        }
    }

    /* renamed from: e */
    void m2830e() {
        if (!TextUtils.isEmpty(this.f2289a.getText())) {
            this.f2289a.setText("");
            this.f2289a.requestFocus();
            this.f2289a.setImeVisibility(true);
        } else if (!this.f2274B) {
        } else {
            if (this.f2312y == null || !this.f2312y.m1274a()) {
                clearFocus();
                m2810a(true);
            }
        }
    }

    /* renamed from: f */
    void m2831f() {
        m2810a(false);
        this.f2289a.requestFocus();
        this.f2289a.setImeVisibility(true);
        if (this.f2273A != null) {
            this.f2273A.onClick(this);
        }
    }

    /* renamed from: g */
    void m2832g() {
        m2810a(m2828c());
        m2819n();
        if (this.f2289a.hasFocus()) {
            m2833h();
        }
    }

    public int getImeOptions() {
        return this.f2289a.getImeOptions();
    }

    public int getInputType() {
        return this.f2289a.getInputType();
    }

    public int getMaxWidth() {
        return this.f2280H;
    }

    public CharSequence getQuery() {
        return this.f2289a.getText();
    }

    public CharSequence getQueryHint() {
        return this.f2277E != null ? this.f2277E : (this.f2296h == null || this.f2296h.getHintId() == 0) ? this.f2310w : getContext().getText(this.f2296h.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.f2307t;
    }

    int getSuggestionRowLayout() {
        return this.f2306s;
    }

    public C0568d getSuggestionsAdapter() {
        return this.f2295g;
    }

    /* renamed from: h */
    void m2833h() {
        f2272i.m1271a(this.f2289a);
        f2272i.m1273b(this.f2289a);
    }

    protected void onDetachedFromWindow() {
        removeCallbacks(this.f2286N);
        post(this.f2287O);
        super.onDetachedFromWindow();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m2809a(this.f2289a, this.f2300m);
            this.f2301n.set(this.f2300m.left, 0, this.f2300m.right, i4 - i2);
            if (this.f2299l == null) {
                this.f2299l = new C0354f(this.f2301n, this.f2300m, this.f2289a);
                setTouchDelegate(this.f2299l);
                return;
            }
            this.f2299l.m1279a(this.f2301n, this.f2300m);
        }
    }

    protected void onMeasure(int i, int i2) {
        if (m2828c()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = MeasureSpec.getMode(i);
        i = MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i = this.f2280H > 0 ? this.f2280H : getPreferredWidth();
            } else if (mode == 1073741824) {
                if (this.f2280H > 0) {
                }
            }
            mode = MeasureSpec.getMode(i2);
            i2 = MeasureSpec.getSize(i2);
            if (mode != Integer.MIN_VALUE) {
                i2 = Math.min(getPreferredHeight(), i2);
            } else if (mode != 0) {
                i2 = getPreferredHeight();
            }
            super.onMeasure(MeasureSpec.makeMeasureSpec(i, 1073741824), MeasureSpec.makeMeasureSpec(i2, 1073741824));
        } else if (this.f2280H <= 0) {
            mode = getPreferredWidth();
            i = Math.min(mode, i);
            mode = MeasureSpec.getMode(i2);
            i2 = MeasureSpec.getSize(i2);
            if (mode != Integer.MIN_VALUE) {
                i2 = Math.min(getPreferredHeight(), i2);
            } else if (mode != 0) {
                i2 = getPreferredHeight();
            }
            super.onMeasure(MeasureSpec.makeMeasureSpec(i, 1073741824), MeasureSpec.makeMeasureSpec(i2, 1073741824));
        }
        mode = this.f2280H;
        i = Math.min(mode, i);
        mode = MeasureSpec.getMode(i2);
        i2 = MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            i2 = Math.min(getPreferredHeight(), i2);
        } else if (mode != 0) {
            i2 = getPreferredHeight();
        }
        super.onMeasure(MeasureSpec.makeMeasureSpec(i, 1073741824), MeasureSpec.makeMeasureSpec(i2, 1073741824));
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof C0610e) {
            C0610e c0610e = (C0610e) parcelable;
            super.onRestoreInstanceState(c0610e.m770a());
            m2810a(c0610e.f2271b);
            requestLayout();
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable c0610e = new C0610e(super.onSaveInstanceState());
        c0610e.f2271b = m2828c();
        return c0610e;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m2819n();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f2279G || !isFocusable()) {
            return false;
        }
        if (m2828c()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f2289a.requestFocus(i, rect);
        if (requestFocus) {
            m2810a(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f2285M = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m2830e();
        } else {
            m2831f();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f2274B != z) {
            this.f2274B = z;
            m2810a(z);
            m2820o();
        }
    }

    public void setImeOptions(int i) {
        this.f2289a.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f2289a.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f2280H = i;
        requestLayout();
    }

    public void setOnCloseListener(C0350b c0350b) {
        this.f2312y = c0350b;
    }

    public void setOnQueryTextFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        this.f2294f = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C0351c c0351c) {
        this.f2311x = c0351c;
    }

    public void setOnSearchClickListener(OnClickListener onClickListener) {
        this.f2273A = onClickListener;
    }

    public void setOnSuggestionListener(C0352d c0352d) {
        this.f2313z = c0352d;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f2277E = charSequence;
        m2820o();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f2278F = z;
        if (this.f2295g instanceof aq) {
            ((aq) this.f2295g).m3728a(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f2296h = searchableInfo;
        if (this.f2296h != null) {
            m2821p();
            m2820o();
        }
        this.f2281I = m2815i();
        if (this.f2281I) {
            this.f2289a.setPrivateImeOptions("nm");
        }
        m2810a(m2828c());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f2276D = z;
        m2810a(m2828c());
    }

    public void setSuggestionsAdapter(C0568d c0568d) {
        this.f2295g = c0568d;
        this.f2289a.setAdapter(this.f2295g);
    }
}
