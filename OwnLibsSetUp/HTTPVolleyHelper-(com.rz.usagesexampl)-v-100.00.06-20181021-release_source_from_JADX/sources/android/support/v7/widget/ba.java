package android.support.v7.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.support.v7.p020a.C0270a.C0265f;
import android.support.v7.p020a.C0270a.C0266g;
import android.support.v7.p020a.C0270a.C0268i;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;

class ba {
    /* renamed from: a */
    private final Context f1366a;
    /* renamed from: b */
    private final View f1367b;
    /* renamed from: c */
    private final TextView f1368c;
    /* renamed from: d */
    private final LayoutParams f1369d = new LayoutParams();
    /* renamed from: e */
    private final Rect f1370e = new Rect();
    /* renamed from: f */
    private final int[] f1371f = new int[2];
    /* renamed from: g */
    private final int[] f1372g = new int[2];

    ba(Context context) {
        this.f1366a = context;
        this.f1367b = LayoutInflater.from(this.f1366a).inflate(C0266g.abc_tooltip, null);
        this.f1368c = (TextView) this.f1367b.findViewById(C0265f.message);
        this.f1369d.setTitle(getClass().getSimpleName());
        this.f1369d.packageName = this.f1366a.getPackageName();
        this.f1369d.type = 1002;
        this.f1369d.width = -2;
        this.f1369d.height = -2;
        this.f1369d.format = -3;
        this.f1369d.windowAnimations = C0268i.Animation_AppCompat_Tooltip;
        this.f1369d.flags = 24;
    }

    /* renamed from: a */
    private static View m1506a(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof LayoutParams) && ((LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m1507a(android.view.View r9, int r10, int r11, boolean r12, android.view.WindowManager.LayoutParams r13) {
        /*
        r8 = this;
        r0 = r9.getApplicationWindowToken();
        r13.token = r0;
        r0 = r8.f1366a;
        r0 = r0.getResources();
        r1 = android.support.v7.p020a.C0270a.C0263d.tooltip_precise_anchor_threshold;
        r0 = r0.getDimensionPixelOffset(r1);
        r1 = r9.getWidth();
        if (r1 < r0) goto L_0x0019;
    L_0x0018:
        goto L_0x001f;
    L_0x0019:
        r10 = r9.getWidth();
        r10 = r10 / 2;
    L_0x001f:
        r1 = r9.getHeight();
        r2 = 0;
        if (r1 < r0) goto L_0x0036;
    L_0x0026:
        r0 = r8.f1366a;
        r0 = r0.getResources();
        r1 = android.support.v7.p020a.C0270a.C0263d.tooltip_precise_anchor_extra_offset;
        r0 = r0.getDimensionPixelOffset(r1);
        r1 = r11 + r0;
        r11 = r11 - r0;
        goto L_0x003b;
    L_0x0036:
        r1 = r9.getHeight();
        r11 = 0;
    L_0x003b:
        r0 = 49;
        r13.gravity = r0;
        r0 = r8.f1366a;
        r0 = r0.getResources();
        if (r12 == 0) goto L_0x004a;
    L_0x0047:
        r3 = android.support.v7.p020a.C0270a.C0263d.tooltip_y_offset_touch;
        goto L_0x004c;
    L_0x004a:
        r3 = android.support.v7.p020a.C0270a.C0263d.tooltip_y_offset_non_touch;
    L_0x004c:
        r0 = r0.getDimensionPixelOffset(r3);
        r3 = m1506a(r9);
        if (r3 != 0) goto L_0x005e;
    L_0x0056:
        r9 = "TooltipPopup";
        r10 = "Cannot find app view";
        android.util.Log.e(r9, r10);
        return;
    L_0x005e:
        r4 = r8.f1370e;
        r3.getWindowVisibleDisplayFrame(r4);
        r4 = r8.f1370e;
        r4 = r4.left;
        if (r4 >= 0) goto L_0x0094;
    L_0x0069:
        r4 = r8.f1370e;
        r4 = r4.top;
        if (r4 >= 0) goto L_0x0094;
    L_0x006f:
        r4 = r8.f1366a;
        r4 = r4.getResources();
        r5 = "status_bar_height";
        r6 = "dimen";
        r7 = "android";
        r5 = r4.getIdentifier(r5, r6, r7);
        if (r5 == 0) goto L_0x0086;
    L_0x0081:
        r5 = r4.getDimensionPixelSize(r5);
        goto L_0x0087;
    L_0x0086:
        r5 = 0;
    L_0x0087:
        r4 = r4.getDisplayMetrics();
        r6 = r8.f1370e;
        r7 = r4.widthPixels;
        r4 = r4.heightPixels;
        r6.set(r2, r5, r7, r4);
    L_0x0094:
        r4 = r8.f1372g;
        r3.getLocationOnScreen(r4);
        r4 = r8.f1371f;
        r9.getLocationOnScreen(r4);
        r9 = r8.f1371f;
        r4 = r9[r2];
        r5 = r8.f1372g;
        r5 = r5[r2];
        r4 = r4 - r5;
        r9[r2] = r4;
        r9 = r8.f1371f;
        r4 = 1;
        r5 = r9[r4];
        r6 = r8.f1372g;
        r6 = r6[r4];
        r5 = r5 - r6;
        r9[r4] = r5;
        r9 = r8.f1371f;
        r9 = r9[r2];
        r9 = r9 + r10;
        r10 = r3.getWidth();
        r10 = r10 / 2;
        r9 = r9 - r10;
        r13.x = r9;
        r9 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2);
        r10 = r8.f1367b;
        r10.measure(r9, r9);
        r9 = r8.f1367b;
        r9 = r9.getMeasuredHeight();
        r10 = r8.f1371f;
        r10 = r10[r4];
        r10 = r10 + r11;
        r10 = r10 - r0;
        r10 = r10 - r9;
        r11 = r8.f1371f;
        r11 = r11[r4];
        r11 = r11 + r1;
        r11 = r11 + r0;
        if (r12 == 0) goto L_0x00e9;
    L_0x00e1:
        if (r10 < 0) goto L_0x00e6;
    L_0x00e3:
        r13.y = r10;
        goto L_0x00f3;
    L_0x00e6:
        r13.y = r11;
        goto L_0x00f3;
    L_0x00e9:
        r9 = r9 + r11;
        r12 = r8.f1370e;
        r12 = r12.height();
        if (r9 > r12) goto L_0x00e3;
    L_0x00f2:
        goto L_0x00e6;
    L_0x00f3:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ba.a(android.view.View, int, int, boolean, android.view.WindowManager$LayoutParams):void");
    }

    /* renamed from: a */
    void m1508a() {
        if (m1510b()) {
            ((WindowManager) this.f1366a.getSystemService("window")).removeView(this.f1367b);
        }
    }

    /* renamed from: a */
    void m1509a(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (m1510b()) {
            m1508a();
        }
        this.f1368c.setText(charSequence);
        m1507a(view, i, i2, z, this.f1369d);
        ((WindowManager) this.f1366a.getSystemService("window")).addView(this.f1367b, this.f1369d);
    }

    /* renamed from: b */
    boolean m1510b() {
        return this.f1367b.getParent() != null;
    }
}
