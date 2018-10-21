package android.support.v7.widget;

import android.content.Context;
import android.support.v7.p021b.p022a.C0303b;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.j */
public class C0391j extends CheckedTextView {
    /* renamed from: a */
    private static final int[] f1405a = new int[]{16843016};
    /* renamed from: b */
    private final C0405z f1406b;

    public C0391j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public C0391j(Context context, AttributeSet attributeSet, int i) {
        super(at.m1473a(context), attributeSet, i);
        this.f1406b = C0405z.m1604a((TextView) this);
        this.f1406b.mo276a(attributeSet, i);
        this.f1406b.mo275a();
        aw a = aw.m1478a(getContext(), attributeSet, f1405a, i, 0);
        setCheckMarkDrawable(a.m1482a(0));
        a.m1483a();
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f1406b != null) {
            this.f1406b.mo275a();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0395n.m1585a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C0303b.m1131b(getContext(), i));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f1406b != null) {
            this.f1406b.m1613a(context, i);
        }
    }
}
