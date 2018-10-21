package android.support.v7.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.widget.C0257j;
import android.support.v7.p020a.C0270a.C0269j;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: android.support.v7.widget.s */
class C0397s extends PopupWindow {
    /* renamed from: a */
    private static final boolean f1433a = (VERSION.SDK_INT < 21);
    /* renamed from: b */
    private boolean f1434b;

    public C0397s(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m1596a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m1596a(Context context, AttributeSet attributeSet, int i, int i2) {
        aw a = aw.m1478a(context, attributeSet, C0269j.PopupWindow, i, i2);
        if (a.m1496g(C0269j.PopupWindow_overlapAnchor)) {
            m1597a(a.m1484a(C0269j.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(a.m1482a(C0269j.PopupWindow_android_popupBackground));
        a.m1483a();
    }

    /* renamed from: a */
    private void m1597a(boolean z) {
        if (f1433a) {
            this.f1434b = z;
        } else {
            C0257j.m991a((PopupWindow) this, z);
        }
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (f1433a && this.f1434b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f1433a && this.f1434b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        if (f1433a && this.f1434b) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
