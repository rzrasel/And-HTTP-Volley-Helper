package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.p020a.C0270a.C0260a;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: android.support.v7.widget.w */
public class C0400w extends SeekBar {
    /* renamed from: a */
    private final C0635x f1439a;

    public C0400w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0260a.seekBarStyle);
    }

    public C0400w(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1439a = new C0635x(this);
        this.f1439a.mo341a(attributeSet, i);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1439a.m2948c();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1439a.mo342b();
    }

    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1439a.m2944a(canvas);
    }
}
