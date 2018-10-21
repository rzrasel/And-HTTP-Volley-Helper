package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.v4.p017g.C0204a;
import android.support.v4.p017g.C0213d;
import android.support.v4.p017g.C0216f;
import android.support.v4.p017g.C0227p;
import android.support.v7.app.C0287a.C0284a;
import android.support.v7.p020a.C0270a.C0260a;
import android.support.v7.p020a.C0270a.C0269j;
import android.support.v7.p021b.p022a.C0303b;
import android.support.v7.view.C0309c;
import android.support.v7.view.C0314g;
import android.support.v7.view.menu.C0330o;
import android.support.v7.view.menu.C0330o.C0329a;
import android.support.v7.view.menu.C0598h;
import android.support.v7.view.menu.C0598h.C0325a;
import android.support.v7.view.menu.C0601j;
import android.support.v7.view.menu.C0762u;
import android.support.v7.widget.ActionMenuView.C0344e;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup {
    /* renamed from: A */
    private int f1178A;
    /* renamed from: B */
    private int f1179B;
    /* renamed from: C */
    private boolean f1180C;
    /* renamed from: D */
    private boolean f1181D;
    /* renamed from: E */
    private final ArrayList<View> f1182E;
    /* renamed from: F */
    private final ArrayList<View> f1183F;
    /* renamed from: G */
    private final int[] f1184G;
    /* renamed from: H */
    private final C0344e f1185H;
    /* renamed from: I */
    private ax f1186I;
    /* renamed from: J */
    private C0765d f1187J;
    /* renamed from: K */
    private C0612a f1188K;
    /* renamed from: L */
    private C0329a f1189L;
    /* renamed from: M */
    private C0325a f1190M;
    /* renamed from: N */
    private boolean f1191N;
    /* renamed from: O */
    private final Runnable f1192O;
    /* renamed from: a */
    ImageButton f1193a;
    /* renamed from: b */
    View f1194b;
    /* renamed from: c */
    int f1195c;
    /* renamed from: d */
    C0357c f1196d;
    /* renamed from: e */
    private ActionMenuView f1197e;
    /* renamed from: f */
    private TextView f1198f;
    /* renamed from: g */
    private TextView f1199g;
    /* renamed from: h */
    private ImageButton f1200h;
    /* renamed from: i */
    private ImageView f1201i;
    /* renamed from: j */
    private Drawable f1202j;
    /* renamed from: k */
    private CharSequence f1203k;
    /* renamed from: l */
    private Context f1204l;
    /* renamed from: m */
    private int f1205m;
    /* renamed from: n */
    private int f1206n;
    /* renamed from: o */
    private int f1207o;
    /* renamed from: p */
    private int f1208p;
    /* renamed from: q */
    private int f1209q;
    /* renamed from: r */
    private int f1210r;
    /* renamed from: s */
    private int f1211s;
    /* renamed from: t */
    private int f1212t;
    /* renamed from: u */
    private ao f1213u;
    /* renamed from: v */
    private int f1214v;
    /* renamed from: w */
    private int f1215w;
    /* renamed from: x */
    private int f1216x;
    /* renamed from: y */
    private CharSequence f1217y;
    /* renamed from: z */
    private CharSequence f1218z;

    /* renamed from: android.support.v7.widget.Toolbar$2 */
    class C03552 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ Toolbar f1176a;

        C03552(Toolbar toolbar) {
            this.f1176a = toolbar;
        }

        public void run() {
            this.f1176a.m1315d();
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$3 */
    class C03563 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ Toolbar f1177a;

        C03563(Toolbar toolbar) {
            this.f1177a = toolbar;
        }

        public void onClick(View view) {
            this.f1177a.m1319h();
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$c */
    public interface C0357c {
        /* renamed from: a */
        boolean m1280a(MenuItem menuItem);
    }

    /* renamed from: android.support.v7.widget.Toolbar$1 */
    class C06111 implements C0344e {
        /* renamed from: a */
        final /* synthetic */ Toolbar f2314a;

        C06111(Toolbar toolbar) {
            this.f2314a = toolbar;
        }

        /* renamed from: a */
        public boolean mo274a(MenuItem menuItem) {
            return this.f2314a.f1196d != null ? this.f2314a.f1196d.m1280a(menuItem) : false;
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$a */
    private class C0612a implements C0330o {
        /* renamed from: a */
        C0598h f2315a;
        /* renamed from: b */
        C0601j f2316b;
        /* renamed from: c */
        final /* synthetic */ Toolbar f2317c;

        C0612a(Toolbar toolbar) {
            this.f2317c = toolbar;
        }

        /* renamed from: a */
        public void mo220a(Context context, C0598h c0598h) {
            if (!(this.f2315a == null || this.f2316b == null)) {
                this.f2315a.mo519d(this.f2316b);
            }
            this.f2315a = c0598h;
        }

        /* renamed from: a */
        public void mo221a(C0598h c0598h, boolean z) {
        }

        /* renamed from: a */
        public void mo222a(C0329a c0329a) {
        }

        /* renamed from: a */
        public boolean mo223a(C0598h c0598h, C0601j c0601j) {
            this.f2317c.m1320i();
            ViewParent parent = this.f2317c.f1193a.getParent();
            if (parent != this.f2317c) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f2317c.f1193a);
                }
                this.f2317c.addView(this.f2317c.f1193a);
            }
            this.f2317c.f1194b = c0601j.getActionView();
            this.f2316b = c0601j;
            parent = this.f2317c.f1194b.getParent();
            if (parent != this.f2317c) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f2317c.f1194b);
                }
                LayoutParams j = this.f2317c.m1321j();
                j.a = 8388611 | (this.f2317c.f1195c & C0269j.AppCompatTheme_windowActionModeOverlay);
                j.f2318b = 2;
                this.f2317c.f1194b.setLayoutParams(j);
                this.f2317c.addView(this.f2317c.f1194b);
            }
            this.f2317c.m1322k();
            this.f2317c.requestLayout();
            c0601j.m2717e(true);
            if (this.f2317c.f1194b instanceof C0309c) {
                ((C0309c) this.f2317c.f1194b).mo235a();
            }
            return true;
        }

        /* renamed from: a */
        public boolean mo224a(C0762u c0762u) {
            return false;
        }

        /* renamed from: b */
        public void mo225b(boolean z) {
            if (this.f2316b != null) {
                Object obj = null;
                if (this.f2315a != null) {
                    int size = this.f2315a.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f2315a.getItem(i) == this.f2316b) {
                            obj = 1;
                            break;
                        }
                    }
                }
                if (obj == null) {
                    mo227b(this.f2315a, this.f2316b);
                }
            }
        }

        /* renamed from: b */
        public boolean mo226b() {
            return false;
        }

        /* renamed from: b */
        public boolean mo227b(C0598h c0598h, C0601j c0601j) {
            if (this.f2317c.f1194b instanceof C0309c) {
                ((C0309c) this.f2317c.f1194b).mo236b();
            }
            this.f2317c.removeView(this.f2317c.f1194b);
            this.f2317c.removeView(this.f2317c.f1193a);
            this.f2317c.f1194b = null;
            this.f2317c.m1323l();
            this.f2316b = null;
            this.f2317c.requestLayout();
            c0601j.m2717e(false);
            return true;
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$b */
    public static class C0613b extends C0284a {
        /* renamed from: b */
        int f2318b;

        public C0613b(int i, int i2) {
            super(i, i2);
            this.f2318b = 0;
            this.a = 8388627;
        }

        public C0613b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2318b = 0;
        }

        public C0613b(C0284a c0284a) {
            super(c0284a);
            this.f2318b = 0;
        }

        public C0613b(C0613b c0613b) {
            super((C0284a) c0613b);
            this.f2318b = 0;
            this.f2318b = c0613b.f2318b;
        }

        public C0613b(LayoutParams layoutParams) {
            super(layoutParams);
            this.f2318b = 0;
        }

        public C0613b(MarginLayoutParams marginLayoutParams) {
            super((LayoutParams) marginLayoutParams);
            this.f2318b = 0;
            m2843a(marginLayoutParams);
        }

        /* renamed from: a */
        void m2843a(MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$d */
    public static class C0614d extends C0204a {
        public static final Creator<C0614d> CREATOR = new C03581();
        /* renamed from: b */
        int f2319b;
        /* renamed from: c */
        boolean f2320c;

        /* renamed from: android.support.v7.widget.Toolbar$d$1 */
        static class C03581 implements ClassLoaderCreator<C0614d> {
            C03581() {
            }

            /* renamed from: a */
            public C0614d m1281a(Parcel parcel) {
                return new C0614d(parcel, null);
            }

            /* renamed from: a */
            public C0614d m1282a(Parcel parcel, ClassLoader classLoader) {
                return new C0614d(parcel, classLoader);
            }

            /* renamed from: a */
            public C0614d[] m1283a(int i) {
                return new C0614d[i];
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m1281a(parcel);
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m1282a(parcel, classLoader);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m1283a(i);
            }
        }

        public C0614d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2319b = parcel.readInt();
            this.f2320c = parcel.readInt() != 0;
        }

        public C0614d(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2319b);
            parcel.writeInt(this.f2320c);
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0260a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1216x = 8388627;
        this.f1182E = new ArrayList();
        this.f1183F = new ArrayList();
        this.f1184G = new int[2];
        this.f1185H = new C06111(this);
        this.f1192O = new C03552(this);
        aw a = aw.m1478a(getContext(), attributeSet, C0269j.Toolbar, i, 0);
        this.f1206n = a.m1495g(C0269j.Toolbar_titleTextAppearance, 0);
        this.f1207o = a.m1495g(C0269j.Toolbar_subtitleTextAppearance, 0);
        this.f1216x = a.m1487c(C0269j.Toolbar_android_gravity, this.f1216x);
        this.f1195c = a.m1487c(C0269j.Toolbar_buttonGravity, 48);
        int d = a.m1489d(C0269j.Toolbar_titleMargin, 0);
        if (a.m1496g(C0269j.Toolbar_titleMargins)) {
            d = a.m1489d(C0269j.Toolbar_titleMargins, d);
        }
        this.f1212t = d;
        this.f1211s = d;
        this.f1210r = d;
        this.f1209q = d;
        d = a.m1489d(C0269j.Toolbar_titleMarginStart, -1);
        if (d >= 0) {
            this.f1209q = d;
        }
        d = a.m1489d(C0269j.Toolbar_titleMarginEnd, -1);
        if (d >= 0) {
            this.f1210r = d;
        }
        d = a.m1489d(C0269j.Toolbar_titleMarginTop, -1);
        if (d >= 0) {
            this.f1211s = d;
        }
        d = a.m1489d(C0269j.Toolbar_titleMarginBottom, -1);
        if (d >= 0) {
            this.f1212t = d;
        }
        this.f1208p = a.m1491e(C0269j.Toolbar_maxButtonHeight, -1);
        d = a.m1489d(C0269j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int d2 = a.m1489d(C0269j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int e = a.m1491e(C0269j.Toolbar_contentInsetLeft, 0);
        int e2 = a.m1491e(C0269j.Toolbar_contentInsetRight, 0);
        m1304s();
        this.f1213u.m1454b(e, e2);
        if (!(d == Integer.MIN_VALUE && d2 == Integer.MIN_VALUE)) {
            this.f1213u.m1451a(d, d2);
        }
        this.f1214v = a.m1489d(C0269j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f1215w = a.m1489d(C0269j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f1202j = a.m1482a(C0269j.Toolbar_collapseIcon);
        this.f1203k = a.m1488c(C0269j.Toolbar_collapseContentDescription);
        CharSequence c = a.m1488c(C0269j.Toolbar_title);
        if (!TextUtils.isEmpty(c)) {
            setTitle(c);
        }
        c = a.m1488c(C0269j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(c)) {
            setSubtitle(c);
        }
        this.f1204l = getContext();
        setPopupTheme(a.m1495g(C0269j.Toolbar_popupTheme, 0));
        Drawable a2 = a.m1482a(C0269j.Toolbar_navigationIcon);
        if (a2 != null) {
            setNavigationIcon(a2);
        }
        c = a.m1488c(C0269j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(c)) {
            setNavigationContentDescription(c);
        }
        a2 = a.m1482a(C0269j.Toolbar_logo);
        if (a2 != null) {
            setLogo(a2);
        }
        c = a.m1488c(C0269j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(c)) {
            setLogoDescription(c);
        }
        if (a.m1496g(C0269j.Toolbar_titleTextColor)) {
            setTitleTextColor(a.m1485b(C0269j.Toolbar_titleTextColor, -1));
        }
        if (a.m1496g(C0269j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a.m1485b(C0269j.Toolbar_subtitleTextColor, -1));
        }
        a.m1483a();
    }

    /* renamed from: a */
    private int m1284a(int i) {
        i &= C0269j.AppCompatTheme_windowActionModeOverlay;
        return (i == 16 || i == 48 || i == 80) ? i : this.f1216x & C0269j.AppCompatTheme_windowActionModeOverlay;
    }

    /* renamed from: a */
    private int m1285a(View view, int i) {
        C0613b c0613b = (C0613b) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        i = i > 0 ? (measuredHeight - i) / 2 : 0;
        int a = m1284a(c0613b.a);
        if (a == 48) {
            return getPaddingTop() - i;
        }
        if (a == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - c0613b.bottomMargin) - i;
        }
        i = getPaddingTop();
        a = getPaddingBottom();
        int height = getHeight();
        int i2 = (((height - i) - a) - measuredHeight) / 2;
        if (i2 < c0613b.topMargin) {
            i2 = c0613b.topMargin;
        } else {
            height = (((height - a) - measuredHeight) - i2) - i;
            if (height < c0613b.bottomMargin) {
                i2 = Math.max(0, i2 - (c0613b.bottomMargin - height));
            }
        }
        return i + i2;
    }

    /* renamed from: a */
    private int m1286a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, ((getPaddingLeft() + getPaddingRight()) + max) + i2, marginLayoutParams.width), getChildMeasureSpec(i3, (((getPaddingTop() + getPaddingBottom()) + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin) + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: a */
    private int m1287a(View view, int i, int[] iArr, int i2) {
        C0613b c0613b = (C0613b) view.getLayoutParams();
        int i3 = c0613b.leftMargin - iArr[0];
        i += Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int a = m1285a(view, i2);
        i2 = view.getMeasuredWidth();
        view.layout(i, a, i + i2, view.getMeasuredHeight() + a);
        return i + (i2 + c0613b.rightMargin);
    }

    /* renamed from: a */
    private int m1288a(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = i2;
        i2 = 0;
        int i4 = 0;
        while (i2 < size) {
            View view = (View) list.get(i2);
            C0613b c0613b = (C0613b) view.getLayoutParams();
            int i5 = c0613b.leftMargin - i;
            i = c0613b.rightMargin - i3;
            i3 = Math.max(0, i5);
            int max = Math.max(0, i);
            i5 = Math.max(0, -i5);
            i4 += (i3 + view.getMeasuredWidth()) + max;
            i2++;
            i3 = Math.max(0, -i);
            i = i5;
        }
        return i4;
    }

    /* renamed from: a */
    private void m1289a(View view, int i, int i2, int i3, int i4, int i5) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        i = getChildMeasureSpec(i, (((getPaddingLeft() + getPaddingRight()) + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin) + i2, marginLayoutParams.width);
        i2 = getChildMeasureSpec(i3, (((getPaddingTop() + getPaddingBottom()) + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin) + i4, marginLayoutParams.height);
        i3 = MeasureSpec.getMode(i2);
        if (i3 != 1073741824 && i5 >= 0) {
            if (i3 != 0) {
                i5 = Math.min(MeasureSpec.getSize(i2), i5);
            }
            i2 = MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(i, i2);
    }

    /* renamed from: a */
    private void m1290a(View view, boolean z) {
        LayoutParams layoutParams = view.getLayoutParams();
        layoutParams = layoutParams == null ? m1321j() : !checkLayoutParams(layoutParams) ? m1306a(layoutParams) : (C0613b) layoutParams;
        layoutParams.f2318b = 1;
        if (!z || this.f1194b == null) {
            addView(view, layoutParams);
            return;
        }
        view.setLayoutParams(layoutParams);
        this.f1183F.add(view);
    }

    /* renamed from: a */
    private void m1291a(List<View> list, int i) {
        Object obj = C0227p.m876b(this) == 1 ? 1 : null;
        int childCount = getChildCount();
        i = C0213d.m797a(i, C0227p.m876b(this));
        list.clear();
        View childAt;
        if (obj != null) {
            for (childCount--; childCount >= 0; childCount--) {
                childAt = getChildAt(childCount);
                C0613b c0613b = (C0613b) childAt.getLayoutParams();
                if (c0613b.f2318b == 0 && m1292a(childAt) && m1293b(c0613b.a) == i) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            childAt = getChildAt(i2);
            C0613b c0613b2 = (C0613b) childAt.getLayoutParams();
            if (c0613b2.f2318b == 0 && m1292a(childAt) && m1293b(c0613b2.a) == i) {
                list.add(childAt);
            }
        }
    }

    /* renamed from: a */
    private boolean m1292a(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: b */
    private int m1293b(int i) {
        int b = C0227p.m876b(this);
        i = C0213d.m797a(i, b) & 7;
        if (i != 1) {
            int i2 = 3;
            if (!(i == 3 || i == 5)) {
                if (b == 1) {
                    i2 = 5;
                }
                return i2;
            }
        }
        return i;
    }

    /* renamed from: b */
    private int m1294b(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return C0216f.m801a(marginLayoutParams) + C0216f.m802b(marginLayoutParams);
    }

    /* renamed from: b */
    private int m1295b(View view, int i, int[] iArr, int i2) {
        C0613b c0613b = (C0613b) view.getLayoutParams();
        int i3 = c0613b.rightMargin - iArr[1];
        i -= Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int a = m1285a(view, i2);
        i2 = view.getMeasuredWidth();
        view.layout(i - i2, a, i, view.getMeasuredHeight() + a);
        return i - (i2 + c0613b.leftMargin);
    }

    /* renamed from: c */
    private int m1296c(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: d */
    private boolean m1297d(View view) {
        if (view.getParent() != this) {
            if (!this.f1183F.contains(view)) {
                return false;
            }
        }
        return true;
    }

    private MenuInflater getMenuInflater() {
        return new C0314g(getContext());
    }

    /* renamed from: m */
    private void m1298m() {
        if (this.f1201i == null) {
            this.f1201i = new C0632q(getContext());
        }
    }

    /* renamed from: n */
    private void m1299n() {
        m1300o();
        if (this.f1197e.m2797d() == null) {
            C0598h c0598h = (C0598h) this.f1197e.getMenu();
            if (this.f1188K == null) {
                this.f1188K = new C0612a(this);
            }
            this.f1197e.setExpandedActionViewsExclusive(true);
            c0598h.m2658a(this.f1188K, this.f1204l);
        }
    }

    /* renamed from: o */
    private void m1300o() {
        if (this.f1197e == null) {
            this.f1197e = new ActionMenuView(getContext());
            this.f1197e.setPopupTheme(this.f1205m);
            this.f1197e.setOnMenuItemClickListener(this.f1185H);
            this.f1197e.m2789a(this.f1189L, this.f1190M);
            LayoutParams j = m1321j();
            j.a = 8388613 | (this.f1195c & C0269j.AppCompatTheme_windowActionModeOverlay);
            this.f1197e.setLayoutParams(j);
            m1290a(this.f1197e, false);
        }
    }

    /* renamed from: p */
    private void m1301p() {
        if (this.f1200h == null) {
            this.f1200h = new C0631o(getContext(), null, C0260a.toolbarNavigationButtonStyle);
            LayoutParams j = m1321j();
            j.a = 8388611 | (this.f1195c & C0269j.AppCompatTheme_windowActionModeOverlay);
            this.f1200h.setLayoutParams(j);
        }
    }

    /* renamed from: q */
    private void m1302q() {
        removeCallbacks(this.f1192O);
        post(this.f1192O);
    }

    /* renamed from: r */
    private boolean m1303r() {
        if (!this.f1191N) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m1292a(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    private void m1304s() {
        if (this.f1213u == null) {
            this.f1213u = new ao();
        }
    }

    /* renamed from: a */
    public C0613b m1305a(AttributeSet attributeSet) {
        return new C0613b(getContext(), attributeSet);
    }

    /* renamed from: a */
    protected C0613b m1306a(LayoutParams layoutParams) {
        return layoutParams instanceof C0613b ? new C0613b((C0613b) layoutParams) : layoutParams instanceof C0284a ? new C0613b((C0284a) layoutParams) : layoutParams instanceof MarginLayoutParams ? new C0613b((MarginLayoutParams) layoutParams) : new C0613b(layoutParams);
    }

    /* renamed from: a */
    public void m1307a(int i, int i2) {
        m1304s();
        this.f1213u.m1451a(i, i2);
    }

    /* renamed from: a */
    public void m1308a(Context context, int i) {
        this.f1206n = i;
        if (this.f1198f != null) {
            this.f1198f.setTextAppearance(context, i);
        }
    }

    /* renamed from: a */
    public void m1309a(C0598h c0598h, C0765d c0765d) {
        if (c0598h != null || this.f1197e != null) {
            m1300o();
            C0598h d = this.f1197e.m2797d();
            if (d != c0598h) {
                if (d != null) {
                    d.m2668b(this.f1187J);
                    d.m2668b(this.f1188K);
                }
                if (this.f1188K == null) {
                    this.f1188K = new C0612a(this);
                }
                c0765d.m3643d(true);
                if (c0598h != null) {
                    c0598h.m2658a((C0330o) c0765d, this.f1204l);
                    c0598h.m2658a(this.f1188K, this.f1204l);
                } else {
                    c0765d.mo220a(this.f1204l, null);
                    this.f1188K.mo220a(this.f1204l, null);
                    c0765d.mo225b(true);
                    this.f1188K.mo225b(true);
                }
                this.f1197e.setPopupTheme(this.f1205m);
                this.f1197e.setPresenter(c0765d);
                this.f1187J = c0765d;
            }
        }
    }

    /* renamed from: a */
    public void m1310a(C0329a c0329a, C0325a c0325a) {
        this.f1189L = c0329a;
        this.f1190M = c0325a;
        if (this.f1197e != null) {
            this.f1197e.m2789a(c0329a, c0325a);
        }
    }

    /* renamed from: a */
    public boolean m1311a() {
        return getVisibility() == 0 && this.f1197e != null && this.f1197e.m2790a();
    }

    /* renamed from: b */
    public void m1312b(Context context, int i) {
        this.f1207o = i;
        if (this.f1199g != null) {
            this.f1199g.setTextAppearance(context, i);
        }
    }

    /* renamed from: b */
    public boolean m1313b() {
        return this.f1197e != null && this.f1197e.m2800g();
    }

    /* renamed from: c */
    public boolean m1314c() {
        return this.f1197e != null && this.f1197e.m2801h();
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0613b);
    }

    /* renamed from: d */
    public boolean m1315d() {
        return this.f1197e != null && this.f1197e.m2798e();
    }

    /* renamed from: e */
    public boolean m1316e() {
        return this.f1197e != null && this.f1197e.m2799f();
    }

    /* renamed from: f */
    public void m1317f() {
        if (this.f1197e != null) {
            this.f1197e.m2802i();
        }
    }

    /* renamed from: g */
    public boolean m1318g() {
        return (this.f1188K == null || this.f1188K.f2316b == null) ? false : true;
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return m1321j();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return m1305a(attributeSet);
    }

    protected /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return m1306a(layoutParams);
    }

    public int getContentInsetEnd() {
        return this.f1213u != null ? this.f1213u.m1456d() : 0;
    }

    public int getContentInsetEndWithActions() {
        return this.f1215w != Integer.MIN_VALUE ? this.f1215w : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        return this.f1213u != null ? this.f1213u.m1450a() : 0;
    }

    public int getContentInsetRight() {
        return this.f1213u != null ? this.f1213u.m1453b() : 0;
    }

    public int getContentInsetStart() {
        return this.f1213u != null ? this.f1213u.m1455c() : 0;
    }

    public int getContentInsetStartWithNavigation() {
        return this.f1214v != Integer.MIN_VALUE ? this.f1214v : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        Object obj;
        if (this.f1197e != null) {
            C0598h d = this.f1197e.m2797d();
            if (d != null && d.hasVisibleItems()) {
                obj = 1;
                return obj == null ? Math.max(getContentInsetEnd(), Math.max(this.f1215w, 0)) : getContentInsetEnd();
            }
        }
        obj = null;
        if (obj == null) {
        }
    }

    public int getCurrentContentInsetLeft() {
        return C0227p.m876b(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return C0227p.m876b(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1214v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        return this.f1201i != null ? this.f1201i.getDrawable() : null;
    }

    public CharSequence getLogoDescription() {
        return this.f1201i != null ? this.f1201i.getContentDescription() : null;
    }

    public Menu getMenu() {
        m1299n();
        return this.f1197e.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        return this.f1200h != null ? this.f1200h.getContentDescription() : null;
    }

    public Drawable getNavigationIcon() {
        return this.f1200h != null ? this.f1200h.getDrawable() : null;
    }

    C0765d getOuterActionMenuPresenter() {
        return this.f1187J;
    }

    public Drawable getOverflowIcon() {
        m1299n();
        return this.f1197e.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f1204l;
    }

    public int getPopupTheme() {
        return this.f1205m;
    }

    public CharSequence getSubtitle() {
        return this.f1218z;
    }

    public CharSequence getTitle() {
        return this.f1217y;
    }

    public int getTitleMarginBottom() {
        return this.f1212t;
    }

    public int getTitleMarginEnd() {
        return this.f1210r;
    }

    public int getTitleMarginStart() {
        return this.f1209q;
    }

    public int getTitleMarginTop() {
        return this.f1211s;
    }

    public ae getWrapper() {
        if (this.f1186I == null) {
            this.f1186I = new ax(this, true);
        }
        return this.f1186I;
    }

    /* renamed from: h */
    public void m1319h() {
        C0601j c0601j = this.f1188K == null ? null : this.f1188K.f2316b;
        if (c0601j != null) {
            c0601j.collapseActionView();
        }
    }

    /* renamed from: i */
    void m1320i() {
        if (this.f1193a == null) {
            this.f1193a = new C0631o(getContext(), null, C0260a.toolbarNavigationButtonStyle);
            this.f1193a.setImageDrawable(this.f1202j);
            this.f1193a.setContentDescription(this.f1203k);
            LayoutParams j = m1321j();
            j.a = 8388611 | (this.f1195c & C0269j.AppCompatTheme_windowActionModeOverlay);
            j.f2318b = 2;
            this.f1193a.setLayoutParams(j);
            this.f1193a.setOnClickListener(new C03563(this));
        }
    }

    /* renamed from: j */
    protected C0613b m1321j() {
        return new C0613b(-2, -2);
    }

    /* renamed from: k */
    void m1322k() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((C0613b) childAt.getLayoutParams()).f2318b == 2 || childAt == this.f1197e)) {
                removeViewAt(childCount);
                this.f1183F.add(childAt);
            }
        }
    }

    /* renamed from: l */
    void m1323l() {
        for (int size = this.f1183F.size() - 1; size >= 0; size--) {
            addView((View) this.f1183F.get(size));
        }
        this.f1183F.clear();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1192O);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1181D = false;
        }
        if (!this.f1181D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1181D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1181D = false;
        }
        return true;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int b;
        int currentContentInsetLeft;
        int currentContentInsetRight;
        int max;
        boolean a;
        boolean a2;
        int i6;
        int i7;
        int i8;
        C0613b c0613b;
        int i9;
        int i10;
        int size;
        C0613b c0613b2;
        Object obj;
        int i11;
        C0613b c0613b3;
        int i12;
        Toolbar toolbar = this;
        Object obj2 = C0227p.m876b(this) == 1 ? 1 : null;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i13 = width - paddingRight;
        int[] iArr = toolbar.f1184G;
        iArr[1] = 0;
        iArr[0] = 0;
        int c = C0227p.m877c(this);
        c = c >= 0 ? Math.min(c, i4 - i2) : 0;
        if (!m1292a(toolbar.f1200h)) {
            i5 = paddingLeft;
        } else if (obj2 != null) {
            b = m1295b(toolbar.f1200h, i13, iArr, c);
            i5 = paddingLeft;
            if (m1292a(toolbar.f1193a)) {
                if (obj2 == null) {
                    b = m1295b(toolbar.f1193a, b, iArr, c);
                } else {
                    i5 = m1287a(toolbar.f1193a, i5, iArr, c);
                }
            }
            if (m1292a(toolbar.f1197e)) {
                if (obj2 == null) {
                    i5 = m1287a(toolbar.f1197e, i5, iArr, c);
                } else {
                    b = m1295b(toolbar.f1197e, b, iArr, c);
                }
            }
            currentContentInsetLeft = getCurrentContentInsetLeft();
            currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - i5);
            iArr[1] = Math.max(0, currentContentInsetRight - (i13 - b));
            max = Math.max(i5, currentContentInsetLeft);
            i13 = Math.min(b, i13 - currentContentInsetRight);
            if (m1292a(toolbar.f1194b)) {
                if (obj2 == null) {
                    i13 = m1295b(toolbar.f1194b, i13, iArr, c);
                } else {
                    max = m1287a(toolbar.f1194b, max, iArr, c);
                }
            }
            if (m1292a(toolbar.f1201i)) {
                if (obj2 == null) {
                    i13 = m1295b(toolbar.f1201i, i13, iArr, c);
                } else {
                    max = m1287a(toolbar.f1201i, max, iArr, c);
                }
            }
            a = m1292a(toolbar.f1198f);
            a2 = m1292a(toolbar.f1199g);
            if (a) {
                i6 = paddingRight;
                i7 = 0;
            } else {
                C0613b c0613b4 = (C0613b) toolbar.f1198f.getLayoutParams();
                i6 = paddingRight;
                i7 = ((c0613b4.topMargin + toolbar.f1198f.getMeasuredHeight()) + c0613b4.bottomMargin) + 0;
            }
            if (a2) {
                i8 = width;
            } else {
                c0613b = (C0613b) toolbar.f1199g.getLayoutParams();
                i8 = width;
                i7 += (c0613b.topMargin + toolbar.f1199g.getMeasuredHeight()) + c0613b.bottomMargin;
            }
            if (!a) {
                if (a2) {
                    i9 = paddingLeft;
                    i10 = c;
                    paddingRight = 0;
                    m1291a(toolbar.f1182E, 3);
                    size = toolbar.f1182E.size();
                    i7 = max;
                    for (max = 0; max < size; max++) {
                        i7 = m1287a((View) toolbar.f1182E.get(max), i7, iArr, i10);
                    }
                    c = i10;
                    m1291a(toolbar.f1182E, 5);
                    size = toolbar.f1182E.size();
                    for (max = 0; max < size; max++) {
                        i13 = m1295b((View) toolbar.f1182E.get(max), i13, iArr, c);
                    }
                    m1291a(toolbar.f1182E, 1);
                    size = m1288a(toolbar.f1182E, iArr);
                    max = (i9 + (((i8 - i9) - i6) / 2)) - (size / 2);
                    size += max;
                    if (max < i7) {
                        i7 = size <= i13 ? max - (size - i13) : max;
                    }
                    size = toolbar.f1182E.size();
                    for (paddingRight = 
/*
Method generation error in method: android.support.v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void, dex: classes.dex
jadx.core.utils.exceptions.CodegenException: Error generate insn: PHI: (r7_17 'paddingRight' int) = (r7_8 'paddingRight' int), (r7_16 'paddingRight' int), (r7_16 'paddingRight' int) binds: {(r7_16 'paddingRight' int)=B:99:0x0294, (r7_8 'paddingRight' int)=B:46:0x0128, (r7_16 'paddingRight' int)=B:100:0x0296} in method: android.support.v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void, dex: classes.dex
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:226)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:184)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:61)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:146)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:124)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:187)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:320)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:257)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:220)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:75)
	at jadx.core.codegen.CodeGen.visit(CodeGen.java:12)
	at jadx.core.ProcessClass.process(ProcessClass.java:40)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/1763344271.run(Unknown Source)
Caused by: jadx.core.utils.exceptions.CodegenException: PHI can be used only in fallback mode
	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:537)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:509)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:220)
	... 35 more

*/

                    protected void onMeasure(int i, int i2) {
                        int i3;
                        int i4;
                        int measuredWidth;
                        int max;
                        int combineMeasuredStates;
                        int measuredHeight;
                        int combineMeasuredStates2;
                        int[] iArr = this.f1184G;
                        if (bc.m1514a(this)) {
                            i3 = 1;
                            i4 = 0;
                        } else {
                            i3 = 0;
                            i4 = 1;
                        }
                        if (m1292a(r7.f1200h)) {
                            m1289a(r7.f1200h, i, 0, i2, 0, r7.f1208p);
                            measuredWidth = r7.f1200h.getMeasuredWidth() + m1294b(r7.f1200h);
                            max = Math.max(0, r7.f1200h.getMeasuredHeight() + m1296c(r7.f1200h));
                            combineMeasuredStates = View.combineMeasuredStates(0, r7.f1200h.getMeasuredState());
                        } else {
                            measuredWidth = 0;
                            max = 0;
                            combineMeasuredStates = 0;
                        }
                        if (m1292a(r7.f1193a)) {
                            m1289a(r7.f1193a, i, 0, i2, 0, r7.f1208p);
                            measuredWidth = r7.f1193a.getMeasuredWidth() + m1294b(r7.f1193a);
                            max = Math.max(max, r7.f1193a.getMeasuredHeight() + m1296c(r7.f1193a));
                            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, r7.f1193a.getMeasuredState());
                        }
                        int currentContentInsetStart = getCurrentContentInsetStart();
                        int max2 = Math.max(currentContentInsetStart, measuredWidth) + 0;
                        iArr[i3] = Math.max(0, currentContentInsetStart - measuredWidth);
                        if (m1292a(r7.f1197e)) {
                            m1289a(r7.f1197e, i, max2, i2, 0, r7.f1208p);
                            measuredWidth = r7.f1197e.getMeasuredWidth() + m1294b(r7.f1197e);
                            max = Math.max(max, r7.f1197e.getMeasuredHeight() + m1296c(r7.f1197e));
                            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, r7.f1197e.getMeasuredState());
                        } else {
                            measuredWidth = 0;
                        }
                        currentContentInsetStart = getCurrentContentInsetEnd();
                        i3 = max2 + Math.max(currentContentInsetStart, measuredWidth);
                        iArr[i4] = Math.max(0, currentContentInsetStart - measuredWidth);
                        if (m1292a(r7.f1194b)) {
                            i3 += m1286a(r7.f1194b, i, i3, i2, 0, iArr);
                            max = Math.max(max, r7.f1194b.getMeasuredHeight() + m1296c(r7.f1194b));
                            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, r7.f1194b.getMeasuredState());
                        }
                        if (m1292a(r7.f1201i)) {
                            i3 += m1286a(r7.f1201i, i, i3, i2, 0, iArr);
                            max = Math.max(max, r7.f1201i.getMeasuredHeight() + m1296c(r7.f1201i));
                            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, r7.f1201i.getMeasuredState());
                        }
                        i4 = getChildCount();
                        max2 = max;
                        max = i3;
                        for (i3 = 0; i3 < i4; i3++) {
                            View childAt = getChildAt(i3);
                            if (((C0613b) childAt.getLayoutParams()).f2318b == 0) {
                                if (m1292a(childAt)) {
                                    max += m1286a(childAt, i, max, i2, 0, iArr);
                                    max2 = Math.max(max2, childAt.getMeasuredHeight() + m1296c(childAt));
                                    combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, childAt.getMeasuredState());
                                }
                            }
                        }
                        i3 = r7.f1211s + r7.f1212t;
                        i4 = r7.f1209q + r7.f1210r;
                        if (m1292a(r7.f1198f)) {
                            m1286a(r7.f1198f, i, max + i4, i2, i3, iArr);
                            measuredWidth = r7.f1198f.getMeasuredWidth() + m1294b(r7.f1198f);
                            measuredHeight = r7.f1198f.getMeasuredHeight() + m1296c(r7.f1198f);
                            combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, r7.f1198f.getMeasuredState());
                            combineMeasuredStates = measuredWidth;
                        } else {
                            combineMeasuredStates2 = combineMeasuredStates;
                            combineMeasuredStates = 0;
                            measuredHeight = 0;
                        }
                        if (m1292a(r7.f1199g)) {
                            int i5 = measuredHeight + i3;
                            i3 = combineMeasuredStates2;
                            combineMeasuredStates = Math.max(combineMeasuredStates, m1286a(r7.f1199g, i, max + i4, i2, i5, iArr));
                            measuredHeight += r7.f1199g.getMeasuredHeight() + m1296c(r7.f1199g);
                            combineMeasuredStates2 = View.combineMeasuredStates(i3, r7.f1199g.getMeasuredState());
                        } else {
                            i3 = combineMeasuredStates2;
                        }
                        max += combineMeasuredStates;
                        measuredWidth = Math.max(max2, measuredHeight) + (getPaddingTop() + getPaddingBottom());
                        int i6 = i;
                        currentContentInsetStart = View.resolveSizeAndState(Math.max(max + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i6, -16777216 & combineMeasuredStates2);
                        measuredWidth = View.resolveSizeAndState(Math.max(measuredWidth, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16);
                        if (m1303r()) {
                            measuredWidth = 0;
                        }
                        setMeasuredDimension(currentContentInsetStart, measuredWidth);
                    }

                    protected void onRestoreInstanceState(Parcelable parcelable) {
                        if (parcelable instanceof C0614d) {
                            C0614d c0614d = (C0614d) parcelable;
                            super.onRestoreInstanceState(c0614d.m770a());
                            Menu d = this.f1197e != null ? this.f1197e.m2797d() : null;
                            if (!(c0614d.f2319b == 0 || this.f1188K == null || d == null)) {
                                MenuItem findItem = d.findItem(c0614d.f2319b);
                                if (findItem != null) {
                                    findItem.expandActionView();
                                }
                            }
                            if (c0614d.f2320c) {
                                m1302q();
                            }
                            return;
                        }
                        super.onRestoreInstanceState(parcelable);
                    }

                    public void onRtlPropertiesChanged(int i) {
                        if (VERSION.SDK_INT >= 17) {
                            super.onRtlPropertiesChanged(i);
                        }
                        m1304s();
                        ao aoVar = this.f1213u;
                        boolean z = true;
                        if (i != 1) {
                            z = false;
                        }
                        aoVar.m1452a(z);
                    }

                    protected Parcelable onSaveInstanceState() {
                        Parcelable c0614d = new C0614d(super.onSaveInstanceState());
                        if (!(this.f1188K == null || this.f1188K.f2316b == null)) {
                            c0614d.f2319b = this.f1188K.f2316b.getItemId();
                        }
                        c0614d.f2320c = m1313b();
                        return c0614d;
                    }

                    public boolean onTouchEvent(MotionEvent motionEvent) {
                        int actionMasked = motionEvent.getActionMasked();
                        if (actionMasked == 0) {
                            this.f1180C = false;
                        }
                        if (!this.f1180C) {
                            boolean onTouchEvent = super.onTouchEvent(motionEvent);
                            if (actionMasked == 0 && !onTouchEvent) {
                                this.f1180C = true;
                            }
                        }
                        if (actionMasked == 1 || actionMasked == 3) {
                            this.f1180C = false;
                        }
                        return true;
                    }

                    public void setCollapsible(boolean z) {
                        this.f1191N = z;
                        requestLayout();
                    }

                    public void setContentInsetEndWithActions(int i) {
                        if (i < 0) {
                            i = Integer.MIN_VALUE;
                        }
                        if (i != this.f1215w) {
                            this.f1215w = i;
                            if (getNavigationIcon() != null) {
                                requestLayout();
                            }
                        }
                    }

                    public void setContentInsetStartWithNavigation(int i) {
                        if (i < 0) {
                            i = Integer.MIN_VALUE;
                        }
                        if (i != this.f1214v) {
                            this.f1214v = i;
                            if (getNavigationIcon() != null) {
                                requestLayout();
                            }
                        }
                    }

                    public void setLogo(int i) {
                        setLogo(C0303b.m1131b(getContext(), i));
                    }

                    public void setLogo(Drawable drawable) {
                        if (drawable != null) {
                            m1298m();
                            if (!m1297d(this.f1201i)) {
                                m1290a(this.f1201i, true);
                            }
                        } else if (this.f1201i != null && m1297d(this.f1201i)) {
                            removeView(this.f1201i);
                            this.f1183F.remove(this.f1201i);
                        }
                        if (this.f1201i != null) {
                            this.f1201i.setImageDrawable(drawable);
                        }
                    }

                    public void setLogoDescription(int i) {
                        setLogoDescription(getContext().getText(i));
                    }

                    public void setLogoDescription(CharSequence charSequence) {
                        if (!TextUtils.isEmpty(charSequence)) {
                            m1298m();
                        }
                        if (this.f1201i != null) {
                            this.f1201i.setContentDescription(charSequence);
                        }
                    }

                    public void setNavigationContentDescription(int i) {
                        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
                    }

                    public void setNavigationContentDescription(CharSequence charSequence) {
                        if (!TextUtils.isEmpty(charSequence)) {
                            m1301p();
                        }
                        if (this.f1200h != null) {
                            this.f1200h.setContentDescription(charSequence);
                        }
                    }

                    public void setNavigationIcon(int i) {
                        setNavigationIcon(C0303b.m1131b(getContext(), i));
                    }

                    public void setNavigationIcon(Drawable drawable) {
                        if (drawable != null) {
                            m1301p();
                            if (!m1297d(this.f1200h)) {
                                m1290a(this.f1200h, true);
                            }
                        } else if (this.f1200h != null && m1297d(this.f1200h)) {
                            removeView(this.f1200h);
                            this.f1183F.remove(this.f1200h);
                        }
                        if (this.f1200h != null) {
                            this.f1200h.setImageDrawable(drawable);
                        }
                    }

                    public void setNavigationOnClickListener(OnClickListener onClickListener) {
                        m1301p();
                        this.f1200h.setOnClickListener(onClickListener);
                    }

                    public void setOnMenuItemClickListener(C0357c c0357c) {
                        this.f1196d = c0357c;
                    }

                    public void setOverflowIcon(Drawable drawable) {
                        m1299n();
                        this.f1197e.setOverflowIcon(drawable);
                    }

                    public void setPopupTheme(int i) {
                        if (this.f1205m != i) {
                            this.f1205m = i;
                            if (i == 0) {
                                this.f1204l = getContext();
                            } else {
                                this.f1204l = new ContextThemeWrapper(getContext(), i);
                            }
                        }
                    }

                    public void setSubtitle(int i) {
                        setSubtitle(getContext().getText(i));
                    }

                    public void setSubtitle(CharSequence charSequence) {
                        if (!TextUtils.isEmpty(charSequence)) {
                            if (this.f1199g == null) {
                                Context context = getContext();
                                this.f1199g = new ab(context);
                                this.f1199g.setSingleLine();
                                this.f1199g.setEllipsize(TruncateAt.END);
                                if (this.f1207o != 0) {
                                    this.f1199g.setTextAppearance(context, this.f1207o);
                                }
                                if (this.f1179B != 0) {
                                    this.f1199g.setTextColor(this.f1179B);
                                }
                            }
                            if (!m1297d(this.f1199g)) {
                                m1290a(this.f1199g, true);
                            }
                        } else if (this.f1199g != null && m1297d(this.f1199g)) {
                            removeView(this.f1199g);
                            this.f1183F.remove(this.f1199g);
                        }
                        if (this.f1199g != null) {
                            this.f1199g.setText(charSequence);
                        }
                        this.f1218z = charSequence;
                    }

                    public void setSubtitleTextColor(int i) {
                        this.f1179B = i;
                        if (this.f1199g != null) {
                            this.f1199g.setTextColor(i);
                        }
                    }

                    public void setTitle(int i) {
                        setTitle(getContext().getText(i));
                    }

                    public void setTitle(CharSequence charSequence) {
                        if (!TextUtils.isEmpty(charSequence)) {
                            if (this.f1198f == null) {
                                Context context = getContext();
                                this.f1198f = new ab(context);
                                this.f1198f.setSingleLine();
                                this.f1198f.setEllipsize(TruncateAt.END);
                                if (this.f1206n != 0) {
                                    this.f1198f.setTextAppearance(context, this.f1206n);
                                }
                                if (this.f1178A != 0) {
                                    this.f1198f.setTextColor(this.f1178A);
                                }
                            }
                            if (!m1297d(this.f1198f)) {
                                m1290a(this.f1198f, true);
                            }
                        } else if (this.f1198f != null && m1297d(this.f1198f)) {
                            removeView(this.f1198f);
                            this.f1183F.remove(this.f1198f);
                        }
                        if (this.f1198f != null) {
                            this.f1198f.setText(charSequence);
                        }
                        this.f1217y = charSequence;
                    }

                    public void setTitleMarginBottom(int i) {
                        this.f1212t = i;
                        requestLayout();
                    }

                    public void setTitleMarginEnd(int i) {
                        this.f1210r = i;
                        requestLayout();
                    }

                    public void setTitleMarginStart(int i) {
                        this.f1209q = i;
                        requestLayout();
                    }

                    public void setTitleMarginTop(int i) {
                        this.f1211s = i;
                        requestLayout();
                    }

                    public void setTitleTextColor(int i) {
                        this.f1178A = i;
                        if (this.f1198f != null) {
                            this.f1198f.setTextColor(i);
                        }
                    }
                }
