package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.support.v7.p020a.C0270a.C0269j;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

class ac {
    /* renamed from: a */
    private static final RectF f1232a = new RectF();
    /* renamed from: b */
    private static ConcurrentHashMap<String, Method> f1233b = new ConcurrentHashMap();
    /* renamed from: c */
    private int f1234c = 0;
    /* renamed from: d */
    private boolean f1235d = false;
    /* renamed from: e */
    private float f1236e = -1.0f;
    /* renamed from: f */
    private float f1237f = -1.0f;
    /* renamed from: g */
    private float f1238g = -1.0f;
    /* renamed from: h */
    private int[] f1239h = new int[0];
    /* renamed from: i */
    private boolean f1240i = false;
    /* renamed from: j */
    private TextPaint f1241j;
    /* renamed from: k */
    private final TextView f1242k;
    /* renamed from: l */
    private final Context f1243l;

    ac(TextView textView) {
        this.f1242k = textView;
        this.f1243l = this.f1242k.getContext();
    }

    /* renamed from: a */
    private int m1333a(RectF rectF) {
        int length = this.f1239h.length;
        if (length != 0) {
            length--;
            int i = 1;
            int i2 = 0;
            while (i <= length) {
                i2 = (i + length) / 2;
                if (m1341a(this.f1239h[i2], rectF)) {
                    int i3 = i2 + 1;
                    i2 = i;
                    i = i3;
                } else {
                    i2--;
                    length = i2;
                }
            }
            return this.f1239h[i2];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: a */
    private StaticLayout m1334a(CharSequence charSequence, Alignment alignment, int i) {
        float lineSpacingMultiplier;
        float lineSpacingExtra;
        boolean includeFontPadding;
        if (VERSION.SDK_INT >= 16) {
            lineSpacingMultiplier = this.f1242k.getLineSpacingMultiplier();
            lineSpacingExtra = this.f1242k.getLineSpacingExtra();
            includeFontPadding = this.f1242k.getIncludeFontPadding();
        } else {
            lineSpacingMultiplier = ((Float) m1336a(this.f1242k, "getLineSpacingMultiplier", Float.valueOf(1.0f))).floatValue();
            lineSpacingExtra = ((Float) m1336a(this.f1242k, "getLineSpacingExtra", Float.valueOf(0.0f))).floatValue();
            includeFontPadding = ((Boolean) m1336a(this.f1242k, "getIncludeFontPadding", Boolean.valueOf(true))).booleanValue();
        }
        return new StaticLayout(charSequence, this.f1241j, i, alignment, lineSpacingMultiplier, lineSpacingExtra, includeFontPadding);
    }

    /* renamed from: a */
    private StaticLayout m1335a(CharSequence charSequence, Alignment alignment, int i, int i2) {
        TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) m1336a(this.f1242k, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
        Builder hyphenationFrequency = Builder.obtain(charSequence, 0, charSequence.length(), this.f1241j, i).setAlignment(alignment).setLineSpacing(this.f1242k.getLineSpacingExtra(), this.f1242k.getLineSpacingMultiplier()).setIncludePad(this.f1242k.getIncludeFontPadding()).setBreakStrategy(this.f1242k.getBreakStrategy()).setHyphenationFrequency(this.f1242k.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        return hyphenationFrequency.setMaxLines(i2).setTextDirection(textDirectionHeuristic).build();
    }

    /* renamed from: a */
    private <T> T m1336a(Object obj, String str, T t) {
        try {
            return m1337a(str).invoke(obj, new Object[0]);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to invoke TextView#");
            stringBuilder.append(str);
            stringBuilder.append("() method");
            Log.w("ACTVAutoSizeHelper", stringBuilder.toString(), e);
            return t;
        }
    }

    /* renamed from: a */
    private Method m1337a(String str) {
        try {
            Method method = (Method) f1233b.get(str);
            if (method == null) {
                method = TextView.class.getDeclaredMethod(str, new Class[0]);
                if (method != null) {
                    method.setAccessible(true);
                    f1233b.put(str, method);
                }
            }
            return method;
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to retrieve TextView#");
            stringBuilder.append(str);
            stringBuilder.append("() method");
            Log.w("ACTVAutoSizeHelper", stringBuilder.toString(), e);
            return null;
        }
    }

    /* renamed from: a */
    private void m1338a(float f) {
        if (f != this.f1242k.getPaint().getTextSize()) {
            this.f1242k.getPaint().setTextSize(f);
            boolean isInLayout = VERSION.SDK_INT >= 18 ? this.f1242k.isInLayout() : false;
            if (this.f1242k.getLayout() != null) {
                this.f1235d = false;
                try {
                    Method a = m1337a("nullLayouts");
                    if (a != null) {
                        a.invoke(this.f1242k, new Object[0]);
                    }
                } catch (Throwable e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (isInLayout) {
                    this.f1242k.forceLayout();
                } else {
                    this.f1242k.requestLayout();
                }
                this.f1242k.invalidate();
            }
        }
    }

    /* renamed from: a */
    private void m1339a(float f, float f2, float f3) {
        if (f <= 0.0f) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Minimum auto-size text size (");
            stringBuilder.append(f);
            stringBuilder.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (f2 <= f) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Maximum auto-size text size (");
            stringBuilder2.append(f2);
            stringBuilder2.append("px) is less or equal to minimum auto-size ");
            stringBuilder2.append("text size (");
            stringBuilder2.append(f);
            stringBuilder2.append("px)");
            throw new IllegalArgumentException(stringBuilder2.toString());
        } else if (f3 > 0.0f) {
            this.f1234c = 1;
            this.f1237f = f;
            this.f1238g = f2;
            this.f1236e = f3;
            this.f1240i = false;
        } else {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("The auto-size step granularity (");
            stringBuilder3.append(f3);
            stringBuilder3.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(stringBuilder3.toString());
        }
    }

    /* renamed from: a */
    private void m1340a(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f1239h = m1342a(iArr);
            m1343h();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private boolean m1341a(int r6, android.graphics.RectF r7) {
        /*
        r5 = this;
        r0 = r5.f1242k;
        r0 = r0.getText();
        r1 = r5.f1242k;
        r1 = r1.getTransformationMethod();
        if (r1 == 0) goto L_0x0017;
    L_0x000e:
        r2 = r5.f1242k;
        r1 = r1.getTransformation(r0, r2);
        if (r1 == 0) goto L_0x0017;
    L_0x0016:
        r0 = r1;
    L_0x0017:
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 16;
        r3 = -1;
        if (r1 < r2) goto L_0x0025;
    L_0x001e:
        r1 = r5.f1242k;
        r1 = r1.getMaxLines();
        goto L_0x0026;
    L_0x0025:
        r1 = -1;
    L_0x0026:
        r2 = r5.f1241j;
        if (r2 != 0) goto L_0x0032;
    L_0x002a:
        r2 = new android.text.TextPaint;
        r2.<init>();
        r5.f1241j = r2;
        goto L_0x0037;
    L_0x0032:
        r2 = r5.f1241j;
        r2.reset();
    L_0x0037:
        r2 = r5.f1241j;
        r4 = r5.f1242k;
        r4 = r4.getPaint();
        r2.set(r4);
        r2 = r5.f1241j;
        r6 = (float) r6;
        r2.setTextSize(r6);
        r6 = r5.f1242k;
        r2 = "getLayoutAlignment";
        r4 = android.text.Layout.Alignment.ALIGN_NORMAL;
        r6 = r5.m1336a(r6, r2, r4);
        r6 = (android.text.Layout.Alignment) r6;
        r2 = android.os.Build.VERSION.SDK_INT;
        r4 = 23;
        if (r2 < r4) goto L_0x0065;
    L_0x005a:
        r2 = r7.right;
        r2 = java.lang.Math.round(r2);
        r6 = r5.m1335a(r0, r6, r2, r1);
        goto L_0x006f;
    L_0x0065:
        r2 = r7.right;
        r2 = java.lang.Math.round(r2);
        r6 = r5.m1334a(r0, r6, r2);
    L_0x006f:
        r2 = 0;
        r4 = 1;
        if (r1 == r3) goto L_0x0089;
    L_0x0073:
        r3 = r6.getLineCount();
        if (r3 > r1) goto L_0x0088;
    L_0x0079:
        r1 = r6.getLineCount();
        r1 = r1 - r4;
        r1 = r6.getLineEnd(r1);
        r0 = r0.length();
        if (r1 == r0) goto L_0x0089;
    L_0x0088:
        return r2;
    L_0x0089:
        r6 = r6.getHeight();
        r6 = (float) r6;
        r7 = r7.bottom;
        r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1));
        if (r6 <= 0) goto L_0x0095;
    L_0x0094:
        return r2;
    L_0x0095:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ac.a(int, android.graphics.RectF):boolean");
    }

    /* renamed from: a */
    private int[] m1342a(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        List arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: h */
    private boolean m1343h() {
        int length = this.f1239h.length;
        this.f1240i = length > 0;
        if (this.f1240i) {
            this.f1234c = 1;
            this.f1237f = (float) this.f1239h[0];
            this.f1238g = (float) this.f1239h[length - 1];
            this.f1236e = -1.0f;
        }
        return this.f1240i;
    }

    /* renamed from: i */
    private boolean m1344i() {
        int i = 0;
        if (m1346k() && this.f1234c == 1) {
            if (!this.f1240i || this.f1239h.length == 0) {
                float round = (float) Math.round(this.f1237f);
                int i2 = 1;
                while (Math.round(this.f1236e + round) <= Math.round(this.f1238g)) {
                    i2++;
                    round += this.f1236e;
                }
                int[] iArr = new int[i2];
                float f = this.f1237f;
                while (i < i2) {
                    iArr[i] = Math.round(f);
                    f += this.f1236e;
                    i++;
                }
                this.f1239h = m1342a(iArr);
            }
            this.f1235d = true;
        } else {
            this.f1235d = false;
        }
        return this.f1235d;
    }

    /* renamed from: j */
    private void m1345j() {
        this.f1234c = 0;
        this.f1237f = -1.0f;
        this.f1238g = -1.0f;
        this.f1236e = -1.0f;
        this.f1239h = new int[0];
        this.f1235d = false;
    }

    /* renamed from: k */
    private boolean m1346k() {
        return !(this.f1242k instanceof C0630m);
    }

    /* renamed from: a */
    int m1347a() {
        return this.f1234c;
    }

    /* renamed from: a */
    void m1348a(int i) {
        if (m1346k()) {
            switch (i) {
                case 0:
                    m1345j();
                    return;
                case 1:
                    DisplayMetrics displayMetrics = this.f1243l.getResources().getDisplayMetrics();
                    m1339a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (m1344i()) {
                        m1357f();
                        return;
                    }
                    return;
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown auto-size text type: ");
                    stringBuilder.append(i);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
    }

    /* renamed from: a */
    void m1349a(int i, float f) {
        m1338a(TypedValue.applyDimension(i, f, (this.f1243l == null ? Resources.getSystem() : this.f1243l.getResources()).getDisplayMetrics()));
    }

    /* renamed from: a */
    void m1350a(int i, int i2, int i3, int i4) {
        if (m1346k()) {
            DisplayMetrics displayMetrics = this.f1243l.getResources().getDisplayMetrics();
            m1339a(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (m1344i()) {
                m1357f();
            }
        }
    }

    /* renamed from: a */
    void m1351a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f1243l.obtainStyledAttributes(attributeSet, C0269j.AppCompatTextView, i, 0);
        if (obtainStyledAttributes.hasValue(C0269j.AppCompatTextView_autoSizeTextType)) {
            this.f1234c = obtainStyledAttributes.getInt(C0269j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(C0269j.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(C0269j.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(C0269j.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(C0269j.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(C0269j.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(C0269j.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(C0269j.AppCompatTextView_autoSizePresetSizes)) {
            int resourceId = obtainStyledAttributes.getResourceId(C0269j.AppCompatTextView_autoSizePresetSizes, 0);
            if (resourceId > 0) {
                TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
                m1340a(obtainTypedArray);
                obtainTypedArray.recycle();
            }
        }
        obtainStyledAttributes.recycle();
        if (!m1346k()) {
            this.f1234c = 0;
        } else if (this.f1234c == 1) {
            if (!this.f1240i) {
                DisplayMetrics displayMetrics = this.f1243l.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m1339a(dimension2, dimension3, dimension);
            }
            m1344i();
        }
    }

    /* renamed from: a */
    void m1352a(int[] iArr, int i) {
        if (m1346k()) {
            int length = iArr.length;
            int i2 = 0;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1243l.getResources().getDisplayMetrics();
                    while (i2 < length) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                        i2++;
                    }
                }
                this.f1239h = m1342a(iArr2);
                if (!m1343h()) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("None of the preset sizes is valid: ");
                    stringBuilder.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            } else {
                this.f1240i = false;
            }
            if (m1344i()) {
                m1357f();
            }
        }
    }

    /* renamed from: b */
    int m1353b() {
        return Math.round(this.f1236e);
    }

    /* renamed from: c */
    int m1354c() {
        return Math.round(this.f1237f);
    }

    /* renamed from: d */
    int m1355d() {
        return Math.round(this.f1238g);
    }

    /* renamed from: e */
    int[] m1356e() {
        return this.f1239h;
    }

    /* renamed from: f */
    void m1357f() {
        if (m1358g()) {
            if (this.f1235d) {
                if (this.f1242k.getMeasuredHeight() > 0) {
                    if (this.f1242k.getMeasuredWidth() > 0) {
                        int measuredWidth = ((Boolean) m1336a(this.f1242k, "getHorizontallyScrolling", Boolean.valueOf(false))).booleanValue() ? 1048576 : (this.f1242k.getMeasuredWidth() - this.f1242k.getTotalPaddingLeft()) - this.f1242k.getTotalPaddingRight();
                        int height = (this.f1242k.getHeight() - this.f1242k.getCompoundPaddingBottom()) - this.f1242k.getCompoundPaddingTop();
                        if (measuredWidth > 0) {
                            if (height > 0) {
                                synchronized (f1232a) {
                                    f1232a.setEmpty();
                                    f1232a.right = (float) measuredWidth;
                                    f1232a.bottom = (float) height;
                                    float a = (float) m1333a(f1232a);
                                    if (a != this.f1242k.getTextSize()) {
                                        m1349a(0, a);
                                    }
                                }
                            }
                        }
                    }
                }
                return;
            }
            this.f1235d = true;
        }
    }

    /* renamed from: g */
    boolean m1358g() {
        return m1346k() && this.f1234c != 0;
    }
}
