package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.p004b.p005a.C0729c;
import android.support.p004b.p005a.C0730i;
import android.support.v4.p008a.C0096a;
import android.support.v4.p010b.C0159a;
import android.support.v4.p010b.p011a.C0155a;
import android.support.v4.p016f.C0187f;
import android.support.v4.p016f.C0188g;
import android.support.v4.p016f.C0198l;
import android.support.v4.p016f.C0549a;
import android.support.v7.p020a.C0270a.C0260a;
import android.support.v7.p020a.C0270a.C0262c;
import android.support.v7.p020a.C0270a.C0264e;
import android.support.v7.p021b.p022a.C0303b;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v7.widget.l */
public final class C0394l {
    /* renamed from: a */
    private static final Mode f1413a = Mode.SRC_IN;
    /* renamed from: b */
    private static C0394l f1414b;
    /* renamed from: c */
    private static final C0628b f1415c = new C0628b(6);
    /* renamed from: d */
    private static final int[] f1416d = new int[]{C0264e.abc_textfield_search_default_mtrl_alpha, C0264e.abc_textfield_default_mtrl_alpha, C0264e.abc_ab_share_pack_mtrl_alpha};
    /* renamed from: e */
    private static final int[] f1417e = new int[]{C0264e.abc_ic_commit_search_api_mtrl_alpha, C0264e.abc_seekbar_tick_mark_material, C0264e.abc_ic_menu_share_mtrl_alpha, C0264e.abc_ic_menu_copy_mtrl_am_alpha, C0264e.abc_ic_menu_cut_mtrl_alpha, C0264e.abc_ic_menu_selectall_mtrl_alpha, C0264e.abc_ic_menu_paste_mtrl_am_alpha};
    /* renamed from: f */
    private static final int[] f1418f = new int[]{C0264e.abc_textfield_activated_mtrl_alpha, C0264e.abc_textfield_search_activated_mtrl_alpha, C0264e.abc_cab_background_top_mtrl_alpha, C0264e.abc_text_cursor_material, C0264e.abc_text_select_handle_left_mtrl_dark, C0264e.abc_text_select_handle_middle_mtrl_dark, C0264e.abc_text_select_handle_right_mtrl_dark, C0264e.abc_text_select_handle_left_mtrl_light, C0264e.abc_text_select_handle_middle_mtrl_light, C0264e.abc_text_select_handle_right_mtrl_light};
    /* renamed from: g */
    private static final int[] f1419g = new int[]{C0264e.abc_popup_background_mtrl_mult, C0264e.abc_cab_background_internal_bg, C0264e.abc_menu_hardkey_panel_mtrl_mult};
    /* renamed from: h */
    private static final int[] f1420h = new int[]{C0264e.abc_tab_indicator_material, C0264e.abc_textfield_search_material};
    /* renamed from: i */
    private static final int[] f1421i = new int[]{C0264e.abc_btn_check_material, C0264e.abc_btn_radio_material};
    /* renamed from: j */
    private WeakHashMap<Context, C0198l<ColorStateList>> f1422j;
    /* renamed from: k */
    private C0549a<String, C0393c> f1423k;
    /* renamed from: l */
    private C0198l<String> f1424l;
    /* renamed from: m */
    private final Object f1425m = new Object();
    /* renamed from: n */
    private final WeakHashMap<Context, C0187f<WeakReference<ConstantState>>> f1426n = new WeakHashMap(0);
    /* renamed from: o */
    private TypedValue f1427o;
    /* renamed from: p */
    private boolean f1428p;

    /* renamed from: android.support.v7.widget.l$c */
    private interface C0393c {
        /* renamed from: a */
        Drawable mo335a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme);
    }

    /* renamed from: android.support.v7.widget.l$a */
    private static class C0627a implements C0393c {
        C0627a() {
        }

        /* renamed from: a */
        public Drawable mo335a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C0729c.m3333a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Throwable e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* renamed from: android.support.v7.widget.l$b */
    private static class C0628b extends C0188g<Integer, PorterDuffColorFilter> {
        public C0628b(int i) {
            super(i);
        }

        /* renamed from: b */
        private static int m2939b(int i, Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* renamed from: a */
        PorterDuffColorFilter m2940a(int i, Mode mode) {
            return (PorterDuffColorFilter) m684a((Object) Integer.valueOf(C0628b.m2939b(i, mode)));
        }

        /* renamed from: a */
        PorterDuffColorFilter m2941a(int i, Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) m685a(Integer.valueOf(C0628b.m2939b(i, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: android.support.v7.widget.l$d */
    private static class C0629d implements C0393c {
        C0629d() {
        }

        /* renamed from: a */
        public Drawable mo335a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C0730i.m3339a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Throwable e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    private static long m1555a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* renamed from: a */
    static Mode m1556a(int i) {
        return i == C0264e.abc_switch_thumb_material ? Mode.MULTIPLY : null;
    }

    /* renamed from: a */
    public static PorterDuffColorFilter m1557a(int i, Mode mode) {
        PorterDuffColorFilter a = f1415c.m2940a(i, mode);
        if (a != null) {
            return a;
        }
        a = new PorterDuffColorFilter(i, mode);
        f1415c.m2941a(i, mode, a);
        return a;
    }

    /* renamed from: a */
    private static PorterDuffColorFilter m1558a(ColorStateList colorStateList, Mode mode, int[] iArr) {
        if (colorStateList != null) {
            if (mode != null) {
                return C0394l.m1557a(colorStateList.getColorForState(iArr, 0), mode);
            }
        }
        return null;
    }

    /* renamed from: a */
    private Drawable m1559a(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList b = m1584b(context, i);
        if (b != null) {
            if (af.m1400b(drawable)) {
                drawable = drawable.mutate();
            }
            drawable = C0155a.m572f(drawable);
            C0155a.m562a(drawable, b);
            Mode a = C0394l.m1556a(i);
            if (a == null) {
                return drawable;
            }
            C0155a.m565a(drawable, a);
            return drawable;
        }
        LayerDrawable layerDrawable;
        Drawable findDrawableByLayerId;
        int i2;
        if (i == C0264e.abc_seekbar_track_material) {
            layerDrawable = (LayerDrawable) drawable;
            C0394l.m1563a(layerDrawable.findDrawableByLayerId(16908288), ar.m1466a(context, C0260a.colorControlNormal), f1413a);
            findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
            i2 = C0260a.colorControlNormal;
        } else {
            if (!(i == C0264e.abc_ratingbar_material || i == C0264e.abc_ratingbar_indicator_material)) {
                if (i != C0264e.abc_ratingbar_small_material) {
                    return (C0394l.m1567a(context, i, drawable) || !z) ? drawable : null;
                }
            }
            layerDrawable = (LayerDrawable) drawable;
            C0394l.m1563a(layerDrawable.findDrawableByLayerId(16908288), ar.m1470c(context, C0260a.colorControlNormal), f1413a);
            findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
            i2 = C0260a.colorControlActivated;
        }
        C0394l.m1563a(findDrawableByLayerId, ar.m1466a(context, i2), f1413a);
        C0394l.m1563a(layerDrawable.findDrawableByLayerId(16908301), ar.m1466a(context, C0260a.colorControlActivated), f1413a);
        return drawable;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private android.graphics.drawable.Drawable m1560a(android.content.Context r5, long r6) {
        /*
        r4 = this;
        r0 = r4.f1425m;
        monitor-enter(r0);
        r1 = r4.f1426n;	 Catch:{ all -> 0x002f }
        r1 = r1.get(r5);	 Catch:{ all -> 0x002f }
        r1 = (android.support.v4.p016f.C0187f) r1;	 Catch:{ all -> 0x002f }
        r2 = 0;
        if (r1 != 0) goto L_0x0010;
    L_0x000e:
        monitor-exit(r0);	 Catch:{ all -> 0x002f }
        return r2;
    L_0x0010:
        r3 = r1.m676a(r6);	 Catch:{ all -> 0x002f }
        r3 = (java.lang.ref.WeakReference) r3;	 Catch:{ all -> 0x002f }
        if (r3 == 0) goto L_0x002d;
    L_0x0018:
        r3 = r3.get();	 Catch:{ all -> 0x002f }
        r3 = (android.graphics.drawable.Drawable.ConstantState) r3;	 Catch:{ all -> 0x002f }
        if (r3 == 0) goto L_0x002a;
    L_0x0020:
        r5 = r5.getResources();	 Catch:{ all -> 0x002f }
        r5 = r3.newDrawable(r5);	 Catch:{ all -> 0x002f }
        monitor-exit(r0);	 Catch:{ all -> 0x002f }
        return r5;
    L_0x002a:
        r1.m680b(r6);	 Catch:{ all -> 0x002f }
    L_0x002d:
        monitor-exit(r0);	 Catch:{ all -> 0x002f }
        return r2;
    L_0x002f:
        r5 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x002f }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.l.a(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    public static C0394l m1561a() {
        if (f1414b == null) {
            f1414b = new C0394l();
            C0394l.m1565a(f1414b);
        }
        return f1414b;
    }

    /* renamed from: a */
    private void m1562a(Context context, int i, ColorStateList colorStateList) {
        if (this.f1422j == null) {
            this.f1422j = new WeakHashMap();
        }
        C0198l c0198l = (C0198l) this.f1422j.get(context);
        if (c0198l == null) {
            c0198l = new C0198l();
            this.f1422j.put(context, c0198l);
        }
        c0198l.m733c(i, colorStateList);
    }

    /* renamed from: a */
    private static void m1563a(Drawable drawable, int i, Mode mode) {
        if (af.m1400b(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f1413a;
        }
        drawable.setColorFilter(C0394l.m1557a(i, mode));
    }

    /* renamed from: a */
    static void m1564a(Drawable drawable, au auVar, int[] iArr) {
        if (!af.m1400b(drawable) || drawable.mutate() == drawable) {
            if (!auVar.f1347d) {
                if (!auVar.f1346c) {
                    drawable.clearColorFilter();
                    if (VERSION.SDK_INT <= 23) {
                        drawable.invalidateSelf();
                    }
                    return;
                }
            }
            drawable.setColorFilter(C0394l.m1558a(auVar.f1347d ? auVar.f1344a : null, auVar.f1346c ? auVar.f1345b : f1413a, iArr));
            if (VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
            return;
        }
        Log.d("AppCompatDrawableManag", "Mutated drawable is not the same instance as the input.");
    }

    /* renamed from: a */
    private static void m1565a(C0394l c0394l) {
        if (VERSION.SDK_INT < 24) {
            c0394l.m1566a("vector", new C0629d());
            c0394l.m1566a("animated-vector", new C0627a());
        }
    }

    /* renamed from: a */
    private void m1566a(String str, C0393c c0393c) {
        if (this.f1423k == null) {
            this.f1423k = new C0549a();
        }
        this.f1423k.put(str, c0393c);
    }

    /* renamed from: a */
    static boolean m1567a(Context context, int i, Drawable drawable) {
        int round;
        Object obj;
        Mode mode = f1413a;
        int i2 = 16842801;
        if (C0394l.m1570a(f1416d, i)) {
            i2 = C0260a.colorControlNormal;
        } else if (C0394l.m1570a(f1418f, i)) {
            i2 = C0260a.colorControlActivated;
        } else if (C0394l.m1570a(f1419g, i)) {
            mode = Mode.MULTIPLY;
        } else {
            if (i == C0264e.abc_list_divider_mtrl_alpha) {
                i2 = 16842800;
                round = Math.round(40.8f);
                obj = 1;
            } else if (i != C0264e.abc_dialog_material_background) {
                obj = null;
                round = -1;
                i2 = 0;
            }
            if (obj != null) {
                return false;
            }
            if (af.m1400b(drawable)) {
                drawable = drawable.mutate();
            }
            drawable.setColorFilter(C0394l.m1557a(ar.m1466a(context, i2), mode));
            if (round != -1) {
                drawable.setAlpha(round);
            }
            return true;
        }
        obj = 1;
        round = -1;
        if (obj != null) {
            return false;
        }
        if (af.m1400b(drawable)) {
            drawable = drawable.mutate();
        }
        drawable.setColorFilter(C0394l.m1557a(ar.m1466a(context, i2), mode));
        if (round != -1) {
            drawable.setAlpha(round);
        }
        return true;
    }

    /* renamed from: a */
    private boolean m1568a(Context context, long j, Drawable drawable) {
        ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        synchronized (this.f1425m) {
            C0187f c0187f = (C0187f) this.f1426n.get(context);
            if (c0187f == null) {
                c0187f = new C0187f();
                this.f1426n.put(context, c0187f);
            }
            c0187f.m681b(j, new WeakReference(constantState));
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m1569a(Drawable drawable) {
        if (!(drawable instanceof C0730i)) {
            if (!"android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m1570a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private ColorStateList m1571b(Context context) {
        return m1578f(context, ar.m1466a(context, C0260a.colorButtonNormal));
    }

    /* renamed from: c */
    private ColorStateList m1572c(Context context) {
        return m1578f(context, 0);
    }

    /* renamed from: c */
    private Drawable m1573c(Context context, int i) {
        if (this.f1427o == null) {
            this.f1427o = new TypedValue();
        }
        TypedValue typedValue = this.f1427o;
        context.getResources().getValue(i, typedValue, true);
        long a = C0394l.m1555a(typedValue);
        Drawable a2 = m1560a(context, a);
        if (a2 != null) {
            return a2;
        }
        if (i == C0264e.abc_cab_background_top_material) {
            a2 = new LayerDrawable(new Drawable[]{m1580a(context, C0264e.abc_cab_background_internal_bg), m1580a(context, C0264e.abc_cab_background_top_mtrl_alpha)});
        }
        if (a2 != null) {
            a2.setChangingConfigurations(typedValue.changingConfigurations);
            m1568a(context, a, a2);
        }
        return a2;
    }

    /* renamed from: d */
    private ColorStateList m1574d(Context context) {
        return m1578f(context, ar.m1466a(context, C0260a.colorAccent));
    }

    /* renamed from: d */
    private Drawable m1575d(Context context, int i) {
        if (this.f1423k == null || this.f1423k.isEmpty()) {
            return null;
        }
        if (this.f1424l != null) {
            String str = (String) this.f1424l.m726a(i);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f1423k.get(str) == null)) {
                return null;
            }
        }
        this.f1424l = new C0198l();
        if (this.f1427o == null) {
            this.f1427o = new TypedValue();
        }
        TypedValue typedValue = this.f1427o;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long a = C0394l.m1555a(typedValue);
        Drawable a2 = m1560a(context, a);
        if (a2 != null) {
            return a2;
        }
        if (typedValue.string != null && typedValue.string.toString().endsWith(".xml")) {
            try {
                int next;
                String name;
                C0393c c0393c;
                XmlPullParser xml = resources.getXml(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        if (next != 2) {
                            name = xml.getName();
                            this.f1424l.m733c(i, name);
                            c0393c = (C0393c) this.f1423k.get(name);
                            if (c0393c != null) {
                                a2 = c0393c.mo335a(context, xml, asAttributeSet, context.getTheme());
                            }
                            if (a2 != null) {
                                a2.setChangingConfigurations(typedValue.changingConfigurations);
                                m1568a(context, a, a2);
                            }
                        } else {
                            throw new XmlPullParserException("No start tag found");
                        }
                    }
                }
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                name = xml.getName();
                this.f1424l.m733c(i, name);
                c0393c = (C0393c) this.f1423k.get(name);
                if (c0393c != null) {
                    a2 = c0393c.mo335a(context, xml, asAttributeSet, context.getTheme());
                }
                if (a2 != null) {
                    a2.setChangingConfigurations(typedValue.changingConfigurations);
                    m1568a(context, a, a2);
                }
            } catch (Throwable e) {
                Log.e("AppCompatDrawableManag", "Exception while inflating drawable", e);
            }
        }
        if (a2 == null) {
            this.f1424l.m733c(i, "appcompat_skip_skip");
        }
        return a2;
    }

    /* renamed from: e */
    private ColorStateList m1576e(Context context) {
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList b = ar.m1469b(context, C0260a.colorSwitchThumbNormal);
        if (b == null || !b.isStateful()) {
            iArr[0] = ar.f1330a;
            iArr2[0] = ar.m1470c(context, C0260a.colorSwitchThumbNormal);
            iArr[1] = ar.f1334e;
            iArr2[1] = ar.m1466a(context, C0260a.colorControlActivated);
            iArr[2] = ar.f1337h;
            iArr2[2] = ar.m1466a(context, C0260a.colorSwitchThumbNormal);
        } else {
            iArr[0] = ar.f1330a;
            iArr2[0] = b.getColorForState(iArr[0], 0);
            iArr[1] = ar.f1334e;
            iArr2[1] = ar.m1466a(context, C0260a.colorControlActivated);
            iArr[2] = ar.f1337h;
            iArr2[2] = b.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* renamed from: e */
    private ColorStateList m1577e(Context context, int i) {
        if (this.f1422j == null) {
            return null;
        }
        C0198l c0198l = (C0198l) this.f1422j.get(context);
        return c0198l != null ? (ColorStateList) c0198l.m726a(i) : null;
    }

    /* renamed from: f */
    private ColorStateList m1578f(Context context, int i) {
        r1 = new int[4][];
        r0 = new int[4];
        int a = ar.m1466a(context, C0260a.colorControlHighlight);
        int c = ar.m1470c(context, C0260a.colorButtonNormal);
        r1[0] = ar.f1330a;
        r0[0] = c;
        r1[1] = ar.f1333d;
        r0[1] = C0159a.m577a(a, i);
        r1[2] = ar.f1331b;
        r0[2] = C0159a.m577a(a, i);
        r1[3] = ar.f1337h;
        r0[3] = i;
        return new ColorStateList(r1, r0);
    }

    /* renamed from: f */
    private void m1579f(Context context) {
        if (!this.f1428p) {
            this.f1428p = true;
            Drawable a = m1580a(context, C0264e.abc_vector_test);
            if (a == null || !C0394l.m1569a(a)) {
                this.f1428p = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: a */
    public Drawable m1580a(Context context, int i) {
        return m1581a(context, i, false);
    }

    /* renamed from: a */
    Drawable m1581a(Context context, int i, boolean z) {
        m1579f(context);
        Drawable d = m1575d(context, i);
        if (d == null) {
            d = m1573c(context, i);
        }
        if (d == null) {
            d = C0096a.m385a(context, i);
        }
        if (d != null) {
            d = m1559a(context, i, z, d);
        }
        if (d != null) {
            af.m1399a(d);
        }
        return d;
    }

    /* renamed from: a */
    Drawable m1582a(Context context, bb bbVar, int i) {
        Drawable d = m1575d(context, i);
        if (d == null) {
            d = bbVar.m1512a(i);
        }
        return d != null ? m1559a(context, i, false, d) : null;
    }

    /* renamed from: a */
    public void m1583a(Context context) {
        synchronized (this.f1425m) {
            C0187f c0187f = (C0187f) this.f1426n.get(context);
            if (c0187f != null) {
                c0187f.m682c();
            }
        }
    }

    /* renamed from: b */
    ColorStateList m1584b(Context context, int i) {
        ColorStateList e = m1577e(context, i);
        if (e == null) {
            int i2;
            if (i == C0264e.abc_edit_text_material) {
                i2 = C0262c.abc_tint_edittext;
            } else if (i == C0264e.abc_switch_track_mtrl_alpha) {
                i2 = C0262c.abc_tint_switch_track;
            } else {
                if (i == C0264e.abc_switch_thumb_material) {
                    e = m1576e(context);
                } else if (i == C0264e.abc_btn_default_mtrl_shape) {
                    e = m1571b(context);
                } else if (i == C0264e.abc_btn_borderless_material) {
                    e = m1572c(context);
                } else if (i == C0264e.abc_btn_colored_material) {
                    e = m1574d(context);
                } else {
                    if (i != C0264e.abc_spinner_mtrl_am_alpha) {
                        if (i != C0264e.abc_spinner_textfield_background_material) {
                            if (C0394l.m1570a(f1417e, i)) {
                                e = ar.m1469b(context, C0260a.colorControlNormal);
                            } else if (C0394l.m1570a(f1420h, i)) {
                                i2 = C0262c.abc_tint_default;
                            } else if (C0394l.m1570a(f1421i, i)) {
                                i2 = C0262c.abc_tint_btn_checkable;
                            } else if (i == C0264e.abc_seekbar_thumb_material) {
                                i2 = C0262c.abc_tint_seek_thumb;
                            }
                        }
                    }
                    i2 = C0262c.abc_tint_spinner;
                }
                if (e != null) {
                    m1562a(context, i, e);
                }
            }
            e = C0303b.m1128a(context, i2);
            if (e != null) {
                m1562a(context, i, e);
            }
        }
        return e;
    }
}
