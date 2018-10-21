package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v4.p010b.C0159a;
import android.util.TypedValue;

class ar {
    /* renamed from: a */
    static final int[] f1330a = new int[]{-16842910};
    /* renamed from: b */
    static final int[] f1331b = new int[]{16842908};
    /* renamed from: c */
    static final int[] f1332c = new int[]{16843518};
    /* renamed from: d */
    static final int[] f1333d = new int[]{16842919};
    /* renamed from: e */
    static final int[] f1334e = new int[]{16842912};
    /* renamed from: f */
    static final int[] f1335f = new int[]{16842913};
    /* renamed from: g */
    static final int[] f1336g = new int[]{-16842919, -16842908};
    /* renamed from: h */
    static final int[] f1337h = new int[0];
    /* renamed from: i */
    private static final ThreadLocal<TypedValue> f1338i = new ThreadLocal();
    /* renamed from: j */
    private static final int[] f1339j = new int[1];

    /* renamed from: a */
    public static int m1466a(Context context, int i) {
        f1339j[0] = i;
        aw a = aw.m1477a(context, null, f1339j);
        try {
            i = a.m1485b(0, 0);
            return i;
        } finally {
            a.m1483a();
        }
    }

    /* renamed from: a */
    static int m1467a(Context context, int i, float f) {
        int a = m1466a(context, i);
        return C0159a.m579b(a, Math.round(((float) Color.alpha(a)) * f));
    }

    /* renamed from: a */
    private static TypedValue m1468a() {
        TypedValue typedValue = (TypedValue) f1338i.get();
        if (typedValue != null) {
            return typedValue;
        }
        typedValue = new TypedValue();
        f1338i.set(typedValue);
        return typedValue;
    }

    /* renamed from: b */
    public static ColorStateList m1469b(Context context, int i) {
        f1339j[0] = i;
        aw a = aw.m1477a(context, null, f1339j);
        try {
            ColorStateList e = a.m1492e(0);
            return e;
        } finally {
            a.m1483a();
        }
    }

    /* renamed from: c */
    public static int m1470c(Context context, int i) {
        ColorStateList b = m1469b(context, i);
        if (b != null && b.isStateful()) {
            return b.getColorForState(f1330a, b.getDefaultColor());
        }
        TypedValue a = m1468a();
        context.getTheme().resolveAttribute(16842803, a, true);
        return m1467a(context, i, a.getFloat());
    }
}
