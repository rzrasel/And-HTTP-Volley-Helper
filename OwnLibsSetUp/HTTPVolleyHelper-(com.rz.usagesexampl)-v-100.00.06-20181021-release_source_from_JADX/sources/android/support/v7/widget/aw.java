package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.p008a.p009a.C0094b;
import android.support.v4.p008a.p009a.C0094b.C0093a;
import android.support.v7.p021b.p022a.C0303b;
import android.util.AttributeSet;
import android.util.TypedValue;

public class aw {
    /* renamed from: a */
    private final Context f1348a;
    /* renamed from: b */
    private final TypedArray f1349b;
    /* renamed from: c */
    private TypedValue f1350c;

    private aw(Context context, TypedArray typedArray) {
        this.f1348a = context;
        this.f1349b = typedArray;
    }

    /* renamed from: a */
    public static aw m1476a(Context context, int i, int[] iArr) {
        return new aw(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: a */
    public static aw m1477a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new aw(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: a */
    public static aw m1478a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new aw(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public float m1479a(int i, float f) {
        return this.f1349b.getFloat(i, f);
    }

    /* renamed from: a */
    public int m1480a(int i, int i2) {
        return this.f1349b.getInt(i, i2);
    }

    /* renamed from: a */
    public Typeface m1481a(int i, int i2, C0093a c0093a) {
        i = this.f1349b.getResourceId(i, 0);
        if (i == 0) {
            return null;
        }
        if (this.f1350c == null) {
            this.f1350c = new TypedValue();
        }
        return C0094b.m372a(this.f1348a, i, this.f1350c, i2, c0093a);
    }

    /* renamed from: a */
    public Drawable m1482a(int i) {
        if (this.f1349b.hasValue(i)) {
            int resourceId = this.f1349b.getResourceId(i, 0);
            if (resourceId != 0) {
                return C0303b.m1131b(this.f1348a, resourceId);
            }
        }
        return this.f1349b.getDrawable(i);
    }

    /* renamed from: a */
    public void m1483a() {
        this.f1349b.recycle();
    }

    /* renamed from: a */
    public boolean m1484a(int i, boolean z) {
        return this.f1349b.getBoolean(i, z);
    }

    /* renamed from: b */
    public int m1485b(int i, int i2) {
        return this.f1349b.getColor(i, i2);
    }

    /* renamed from: b */
    public Drawable m1486b(int i) {
        if (this.f1349b.hasValue(i)) {
            i = this.f1349b.getResourceId(i, 0);
            if (i != 0) {
                return C0394l.m1561a().m1581a(this.f1348a, i, true);
            }
        }
        return null;
    }

    /* renamed from: c */
    public int m1487c(int i, int i2) {
        return this.f1349b.getInteger(i, i2);
    }

    /* renamed from: c */
    public CharSequence m1488c(int i) {
        return this.f1349b.getText(i);
    }

    /* renamed from: d */
    public int m1489d(int i, int i2) {
        return this.f1349b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: d */
    public String m1490d(int i) {
        return this.f1349b.getString(i);
    }

    /* renamed from: e */
    public int m1491e(int i, int i2) {
        return this.f1349b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: e */
    public ColorStateList m1492e(int i) {
        if (this.f1349b.hasValue(i)) {
            int resourceId = this.f1349b.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList a = C0303b.m1128a(this.f1348a, resourceId);
                if (a != null) {
                    return a;
                }
            }
        }
        return this.f1349b.getColorStateList(i);
    }

    /* renamed from: f */
    public int m1493f(int i, int i2) {
        return this.f1349b.getLayoutDimension(i, i2);
    }

    /* renamed from: f */
    public CharSequence[] m1494f(int i) {
        return this.f1349b.getTextArray(i);
    }

    /* renamed from: g */
    public int m1495g(int i, int i2) {
        return this.f1349b.getResourceId(i, i2);
    }

    /* renamed from: g */
    public boolean m1496g(int i) {
        return this.f1349b.hasValue(i);
    }
}
