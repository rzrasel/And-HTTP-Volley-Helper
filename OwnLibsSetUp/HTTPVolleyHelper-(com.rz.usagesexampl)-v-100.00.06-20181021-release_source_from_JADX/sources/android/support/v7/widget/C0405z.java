package android.support.v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.widget.C0244b;
import android.support.v7.p020a.C0270a.C0269j;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.z */
class C0405z {
    /* renamed from: a */
    final TextView f1447a;
    /* renamed from: b */
    private au f1448b;
    /* renamed from: c */
    private au f1449c;
    /* renamed from: d */
    private au f1450d;
    /* renamed from: e */
    private au f1451e;
    /* renamed from: f */
    private final ac f1452f;
    /* renamed from: g */
    private int f1453g = 0;
    /* renamed from: h */
    private Typeface f1454h;
    /* renamed from: i */
    private boolean f1455i;

    C0405z(TextView textView) {
        this.f1447a = textView;
        this.f1452f = new ac(this.f1447a);
    }

    /* renamed from: a */
    protected static au m1603a(Context context, C0394l c0394l, int i) {
        ColorStateList b = c0394l.m1584b(context, i);
        if (b == null) {
            return null;
        }
        au auVar = new au();
        auVar.f1347d = true;
        auVar.f1344a = b;
        return auVar;
    }

    /* renamed from: a */
    static C0405z m1604a(TextView textView) {
        return VERSION.SDK_INT >= 17 ? new aa(textView) : new C0405z(textView);
    }

    /* renamed from: a */
    private void m1605a(android.content.Context r5, android.support.v7.widget.aw r6) {
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
        r0 = android.support.v7.p020a.C0270a.C0269j.TextAppearance_android_textStyle;
        r1 = r4.f1453g;
        r0 = r6.m1480a(r0, r1);
        r4.f1453g = r0;
        r0 = android.support.v7.p020a.C0270a.C0269j.TextAppearance_android_fontFamily;
        r0 = r6.m1496g(r0);
        r1 = 1;
        r2 = 0;
        if (r0 != 0) goto L_0x003c;
    L_0x0014:
        r0 = android.support.v7.p020a.C0270a.C0269j.TextAppearance_fontFamily;
        r0 = r6.m1496g(r0);
        if (r0 == 0) goto L_0x001d;
    L_0x001c:
        goto L_0x003c;
    L_0x001d:
        r5 = android.support.v7.p020a.C0270a.C0269j.TextAppearance_android_typeface;
        r5 = r6.m1496g(r5);
        if (r5 == 0) goto L_0x003b;
    L_0x0025:
        r4.f1455i = r2;
        r5 = android.support.v7.p020a.C0270a.C0269j.TextAppearance_android_typeface;
        r5 = r6.m1480a(r5, r1);
        switch(r5) {
            case 1: goto L_0x0037;
            case 2: goto L_0x0034;
            case 3: goto L_0x0031;
            default: goto L_0x0030;
        };
    L_0x0030:
        goto L_0x003b;
    L_0x0031:
        r5 = android.graphics.Typeface.MONOSPACE;
        goto L_0x0039;
    L_0x0034:
        r5 = android.graphics.Typeface.SERIF;
        goto L_0x0039;
    L_0x0037:
        r5 = android.graphics.Typeface.SANS_SERIF;
    L_0x0039:
        r4.f1454h = r5;
    L_0x003b:
        return;
    L_0x003c:
        r0 = 0;
        r4.f1454h = r0;
        r0 = android.support.v7.p020a.C0270a.C0269j.TextAppearance_fontFamily;
        r0 = r6.m1496g(r0);
        if (r0 == 0) goto L_0x004a;
    L_0x0047:
        r0 = android.support.v7.p020a.C0270a.C0269j.TextAppearance_fontFamily;
        goto L_0x004c;
    L_0x004a:
        r0 = android.support.v7.p020a.C0270a.C0269j.TextAppearance_android_fontFamily;
    L_0x004c:
        r5 = r5.isRestricted();
        if (r5 != 0) goto L_0x0070;
    L_0x0052:
        r5 = new java.lang.ref.WeakReference;
        r3 = r4.f1447a;
        r5.<init>(r3);
        r3 = new android.support.v7.widget.z$1;
        r3.<init>(r4, r5);
        r5 = r4.f1453g;	 Catch:{ UnsupportedOperationException -> 0x006f, UnsupportedOperationException -> 0x006f }
        r5 = r6.m1481a(r0, r5, r3);	 Catch:{ UnsupportedOperationException -> 0x006f, UnsupportedOperationException -> 0x006f }
        r4.f1454h = r5;	 Catch:{ UnsupportedOperationException -> 0x006f, UnsupportedOperationException -> 0x006f }
        r5 = r4.f1454h;	 Catch:{ UnsupportedOperationException -> 0x006f, UnsupportedOperationException -> 0x006f }
        if (r5 != 0) goto L_0x006b;	 Catch:{ UnsupportedOperationException -> 0x006f, UnsupportedOperationException -> 0x006f }
    L_0x006a:
        goto L_0x006c;	 Catch:{ UnsupportedOperationException -> 0x006f, UnsupportedOperationException -> 0x006f }
    L_0x006b:
        r1 = 0;	 Catch:{ UnsupportedOperationException -> 0x006f, UnsupportedOperationException -> 0x006f }
    L_0x006c:
        r4.f1455i = r1;	 Catch:{ UnsupportedOperationException -> 0x006f, UnsupportedOperationException -> 0x006f }
        goto L_0x0070;
    L_0x0070:
        r5 = r4.f1454h;
        if (r5 != 0) goto L_0x0082;
    L_0x0074:
        r5 = r6.m1490d(r0);
        if (r5 == 0) goto L_0x0082;
    L_0x007a:
        r6 = r4.f1453g;
        r5 = android.graphics.Typeface.create(r5, r6);
        r4.f1454h = r5;
    L_0x0082:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.z.a(android.content.Context, android.support.v7.widget.aw):void");
    }

    /* renamed from: a */
    private void m1607a(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1455i) {
            this.f1454h = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f1453g);
            }
        }
    }

    /* renamed from: b */
    private void m1608b(int i, float f) {
        this.f1452f.m1349a(i, f);
    }

    /* renamed from: a */
    void mo275a() {
        if (this.f1448b != null || this.f1449c != null || this.f1450d != null || this.f1451e != null) {
            Drawable[] compoundDrawables = this.f1447a.getCompoundDrawables();
            m1614a(compoundDrawables[0], this.f1448b);
            m1614a(compoundDrawables[1], this.f1449c);
            m1614a(compoundDrawables[2], this.f1450d);
            m1614a(compoundDrawables[3], this.f1451e);
        }
    }

    /* renamed from: a */
    void m1610a(int i) {
        this.f1452f.m1348a(i);
    }

    /* renamed from: a */
    void m1611a(int i, float f) {
        if (!C0244b.f830a && !m1620c()) {
            m1608b(i, f);
        }
    }

    /* renamed from: a */
    void m1612a(int i, int i2, int i3, int i4) {
        this.f1452f.m1350a(i, i2, i3, i4);
    }

    /* renamed from: a */
    void m1613a(Context context, int i) {
        aw a = aw.m1476a(context, i, C0269j.TextAppearance);
        if (a.m1496g(C0269j.TextAppearance_textAllCaps)) {
            m1616a(a.m1484a(C0269j.TextAppearance_textAllCaps, false));
        }
        if (VERSION.SDK_INT < 23 && a.m1496g(C0269j.TextAppearance_android_textColor)) {
            ColorStateList e = a.m1492e(C0269j.TextAppearance_android_textColor);
            if (e != null) {
                this.f1447a.setTextColor(e);
            }
        }
        m1605a(context, a);
        a.m1483a();
        if (this.f1454h != null) {
            this.f1447a.setTypeface(this.f1454h, this.f1453g);
        }
    }

    /* renamed from: a */
    final void m1614a(Drawable drawable, au auVar) {
        if (drawable != null && auVar != null) {
            C0394l.m1564a(drawable, auVar, this.f1447a.getDrawableState());
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    void mo276a(AttributeSet attributeSet, int i) {
        aw a;
        Object obj;
        boolean z;
        ColorStateList e;
        ColorStateList e2;
        Context context = this.f1447a.getContext();
        C0394l a2 = C0394l.m1561a();
        aw a3 = aw.m1478a(context, attributeSet, C0269j.AppCompatTextHelper, i, 0);
        int g = a3.m1495g(C0269j.AppCompatTextHelper_android_textAppearance, -1);
        if (a3.m1496g(C0269j.AppCompatTextHelper_android_drawableLeft)) {
            this.f1448b = C0405z.m1603a(context, a2, a3.m1495g(C0269j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (a3.m1496g(C0269j.AppCompatTextHelper_android_drawableTop)) {
            this.f1449c = C0405z.m1603a(context, a2, a3.m1495g(C0269j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (a3.m1496g(C0269j.AppCompatTextHelper_android_drawableRight)) {
            this.f1450d = C0405z.m1603a(context, a2, a3.m1495g(C0269j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (a3.m1496g(C0269j.AppCompatTextHelper_android_drawableBottom)) {
            this.f1451e = C0405z.m1603a(context, a2, a3.m1495g(C0269j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        a3.m1483a();
        boolean z2 = this.f1447a.getTransformationMethod() instanceof PasswordTransformationMethod;
        Object obj2 = 1;
        ColorStateList colorStateList = null;
        if (g != -1) {
            a = aw.m1476a(context, g, C0269j.TextAppearance);
            if (z2 || !a.m1496g(C0269j.TextAppearance_textAllCaps)) {
                obj = null;
                z = false;
            } else {
                z = a.m1484a(C0269j.TextAppearance_textAllCaps, false);
                obj = 1;
            }
            m1605a(context, a);
            if (VERSION.SDK_INT < 23) {
                e = a.m1496g(C0269j.TextAppearance_android_textColor) ? a.m1492e(C0269j.TextAppearance_android_textColor) : null;
                e2 = a.m1496g(C0269j.TextAppearance_android_textColorHint) ? a.m1492e(C0269j.TextAppearance_android_textColorHint) : null;
                if (a.m1496g(C0269j.TextAppearance_android_textColorLink)) {
                    colorStateList = a.m1492e(C0269j.TextAppearance_android_textColorLink);
                }
                ColorStateList colorStateList2 = e;
                e = colorStateList;
                colorStateList = colorStateList2;
            } else {
                e = null;
                e2 = e;
            }
            a.m1483a();
        } else {
            e = null;
            e2 = e;
            obj = null;
            z = false;
        }
        a = aw.m1478a(context, attributeSet, C0269j.TextAppearance, i, 0);
        if (z2 || !a.m1496g(C0269j.TextAppearance_textAllCaps)) {
            obj2 = obj;
        } else {
            z = a.m1484a(C0269j.TextAppearance_textAllCaps, false);
        }
        if (VERSION.SDK_INT < 23) {
            if (a.m1496g(C0269j.TextAppearance_android_textColor)) {
                colorStateList = a.m1492e(C0269j.TextAppearance_android_textColor);
            }
            if (a.m1496g(C0269j.TextAppearance_android_textColorHint)) {
                e2 = a.m1492e(C0269j.TextAppearance_android_textColorHint);
            }
            if (a.m1496g(C0269j.TextAppearance_android_textColorLink)) {
                e = a.m1492e(C0269j.TextAppearance_android_textColorLink);
            }
        }
        m1605a(context, a);
        a.m1483a();
        if (colorStateList != null) {
            this.f1447a.setTextColor(colorStateList);
        }
        if (e2 != null) {
            this.f1447a.setHintTextColor(e2);
        }
        if (e != null) {
            this.f1447a.setLinkTextColor(e);
        }
        if (!(z2 || r2 == null)) {
            m1616a(z);
        }
        if (this.f1454h != null) {
            this.f1447a.setTypeface(this.f1454h, this.f1453g);
        }
        this.f1452f.m1351a(attributeSet, i);
        if (C0244b.f830a && this.f1452f.m1347a() != 0) {
            int[] e3 = this.f1452f.m1356e();
            if (e3.length <= 0) {
                return;
            }
            if (((float) this.f1447a.getAutoSizeStepGranularity()) != -1.0f) {
                this.f1447a.setAutoSizeTextTypeUniformWithConfiguration(this.f1452f.m1354c(), this.f1452f.m1355d(), this.f1452f.m1353b(), 0);
            } else {
                this.f1447a.setAutoSizeTextTypeUniformWithPresetSizes(e3, 0);
            }
        }
    }

    /* renamed from: a */
    void m1616a(boolean z) {
        this.f1447a.setAllCaps(z);
    }

    /* renamed from: a */
    void m1617a(boolean z, int i, int i2, int i3, int i4) {
        if (!C0244b.f830a) {
            m1619b();
        }
    }

    /* renamed from: a */
    void m1618a(int[] iArr, int i) {
        this.f1452f.m1352a(iArr, i);
    }

    /* renamed from: b */
    void m1619b() {
        this.f1452f.m1357f();
    }

    /* renamed from: c */
    boolean m1620c() {
        return this.f1452f.m1358g();
    }

    /* renamed from: d */
    int m1621d() {
        return this.f1452f.m1347a();
    }

    /* renamed from: e */
    int m1622e() {
        return this.f1452f.m1353b();
    }

    /* renamed from: f */
    int m1623f() {
        return this.f1452f.m1354c();
    }

    /* renamed from: g */
    int m1624g() {
        return this.f1452f.m1355d();
    }

    /* renamed from: h */
    int[] m1625h() {
        return this.f1452f.m1356e();
    }
}
