package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.C0087g.C0086b;
import android.support.constraint.p006a.p007a.C0731b;
import android.util.AttributeSet;

/* renamed from: android.support.constraint.a */
public class C0520a extends C0078b {
    /* renamed from: f */
    private int f1817f;
    /* renamed from: g */
    private int f1818g;
    /* renamed from: h */
    private C0731b f1819h;

    public C0520a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* renamed from: a */
    protected void mo34a(AttributeSet attributeSet) {
        super.mo34a(attributeSet);
        this.f1819h = new C0731b();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0086b.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0086b.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0086b.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f1819h.m3348a(obtainStyledAttributes.getBoolean(index, true));
                }
            }
        }
        this.d = this.f1819h;
        m334a();
    }

    public int getType() {
        return this.f1817f;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f1819h.m3348a(z);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setType(int r6) {
        /*
        r5 = this;
        r5.f1817f = r6;
        r5.f1818g = r6;
        r6 = android.os.Build.VERSION.SDK_INT;
        r0 = 6;
        r1 = 5;
        r2 = 0;
        r3 = 1;
        r4 = 17;
        if (r6 >= r4) goto L_0x001c;
    L_0x000e:
        r6 = r5.f1817f;
        if (r6 != r1) goto L_0x0015;
    L_0x0012:
        r5.f1818g = r2;
        goto L_0x0043;
    L_0x0015:
        r6 = r5.f1817f;
        if (r6 != r0) goto L_0x0043;
    L_0x0019:
        r5.f1818g = r3;
        goto L_0x0043;
    L_0x001c:
        r6 = r5.getResources();
        r6 = r6.getConfiguration();
        r6 = r6.getLayoutDirection();
        if (r3 != r6) goto L_0x002c;
    L_0x002a:
        r6 = 1;
        goto L_0x002d;
    L_0x002c:
        r6 = 0;
    L_0x002d:
        if (r6 == 0) goto L_0x0039;
    L_0x002f:
        r6 = r5.f1817f;
        if (r6 != r1) goto L_0x0034;
    L_0x0033:
        goto L_0x0019;
    L_0x0034:
        r6 = r5.f1817f;
        if (r6 != r0) goto L_0x0043;
    L_0x0038:
        goto L_0x0012;
    L_0x0039:
        r6 = r5.f1817f;
        if (r6 != r1) goto L_0x003e;
    L_0x003d:
        goto L_0x0012;
    L_0x003e:
        r6 = r5.f1817f;
        if (r6 != r0) goto L_0x0043;
    L_0x0042:
        goto L_0x0019;
    L_0x0043:
        r6 = r5.f1819h;
        r0 = r5.f1818g;
        r6.mo15a(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.a.setType(int):void");
    }
}
