package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.constraint.C0087g.C0086b;
import android.support.constraint.ConstraintLayout.C0050a;
import android.support.constraint.p006a.p007a.C0514j;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.Arrays;

/* renamed from: android.support.constraint.b */
public abstract class C0078b extends View {
    /* renamed from: a */
    protected int[] f395a = new int[32];
    /* renamed from: b */
    protected int f396b;
    /* renamed from: c */
    protected Context f397c;
    /* renamed from: d */
    protected C0514j f398d;
    /* renamed from: e */
    protected boolean f399e = false;
    /* renamed from: f */
    private String f400f;

    public C0078b(Context context) {
        super(context);
        this.f397c = context;
        mo34a(null);
    }

    /* renamed from: a */
    private void m333a(java.lang.String r6) {
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
        if (r6 != 0) goto L_0x0003;
    L_0x0002:
        return;
    L_0x0003:
        r0 = r5.f397c;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return;
    L_0x0008:
        r6 = r6.trim();
        r0 = 0;
        r1 = 0;
        r2 = android.support.constraint.C0087g.C0085a.class;	 Catch:{ Exception -> 0x0019 }
        r2 = r2.getField(r6);	 Catch:{ Exception -> 0x0019 }
        r2 = r2.getInt(r0);	 Catch:{ Exception -> 0x0019 }
        goto L_0x001a;
    L_0x0019:
        r2 = 0;
    L_0x001a:
        if (r2 != 0) goto L_0x002e;
    L_0x001c:
        r2 = r5.f397c;
        r2 = r2.getResources();
        r3 = "id";
        r4 = r5.f397c;
        r4 = r4.getPackageName();
        r2 = r2.getIdentifier(r6, r3, r4);
    L_0x002e:
        if (r2 != 0) goto L_0x0054;
    L_0x0030:
        r3 = r5.isInEditMode();
        if (r3 == 0) goto L_0x0054;
    L_0x0036:
        r3 = r5.getParent();
        r3 = r3 instanceof android.support.constraint.ConstraintLayout;
        if (r3 == 0) goto L_0x0054;
    L_0x003e:
        r3 = r5.getParent();
        r3 = (android.support.constraint.ConstraintLayout) r3;
        r1 = r3.m130a(r1, r6);
        if (r1 == 0) goto L_0x0054;
    L_0x004a:
        r3 = r1 instanceof java.lang.Integer;
        if (r3 == 0) goto L_0x0054;
    L_0x004e:
        r1 = (java.lang.Integer) r1;
        r2 = r1.intValue();
    L_0x0054:
        if (r2 == 0) goto L_0x005a;
    L_0x0056:
        r5.setTag(r2, r0);
        goto L_0x0075;
    L_0x005a:
        r0 = "ConstraintHelper";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Could not find id of \"";
        r1.append(r2);
        r1.append(r6);
        r6 = "\"";
        r1.append(r6);
        r6 = r1.toString();
        android.util.Log.w(r0, r6);
    L_0x0075:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.b.a(java.lang.String):void");
    }

    private void setIds(String str) {
        if (str != null) {
            int i = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m333a(str.substring(i));
                    return;
                } else {
                    m333a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    /* renamed from: a */
    public void m334a() {
        if (this.f398d != null) {
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof C0050a) {
                ((C0050a) layoutParams).al = this.f398d;
            }
        }
    }

    /* renamed from: a */
    public void m335a(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.f400f);
        }
        if (this.f398d != null) {
            this.f398d.mo13J();
            for (int i = 0; i < this.f396b; i++) {
                View a = constraintLayout.m129a(this.f395a[i]);
                if (a != null) {
                    this.f398d.m2014b(constraintLayout.m128a(a));
                }
            }
        }
    }

    /* renamed from: a */
    protected void mo34a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0086b.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0086b.ConstraintLayout_Layout_constraint_referenced_ids) {
                    this.f400f = obtainStyledAttributes.getString(index);
                    setIds(this.f400f);
                }
            }
        }
    }

    /* renamed from: b */
    public void m337b(ConstraintLayout constraintLayout) {
    }

    /* renamed from: c */
    public void m338c(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f395a, this.f396b);
    }

    public void onDraw(Canvas canvas) {
    }

    protected void onMeasure(int i, int i2) {
        if (this.f399e) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setReferencedIds(int[] iArr) {
        int i = 0;
        this.f396b = 0;
        while (i < iArr.length) {
            setTag(iArr[i], null);
            i++;
        }
    }

    public void setTag(int i, Object obj) {
        if (this.f396b + 1 > this.f395a.length) {
            this.f395a = Arrays.copyOf(this.f395a, this.f395a.length * 2);
        }
        this.f395a[this.f396b] = i;
        this.f396b++;
    }
}
