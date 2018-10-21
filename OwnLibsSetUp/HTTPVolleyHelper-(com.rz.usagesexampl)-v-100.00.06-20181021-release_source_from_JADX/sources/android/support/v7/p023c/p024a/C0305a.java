package android.support.v7.p023c.p024a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.support.v4.p010b.p011a.C0155a;

/* renamed from: android.support.v7.c.a.a */
public class C0305a extends Drawable implements Callback {
    /* renamed from: a */
    private Drawable f1024a;

    public C0305a(Drawable drawable) {
        m1139a(drawable);
    }

    /* renamed from: a */
    public Drawable m1138a() {
        return this.f1024a;
    }

    /* renamed from: a */
    public void m1139a(Drawable drawable) {
        if (this.f1024a != null) {
            this.f1024a.setCallback(null);
        }
        this.f1024a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f1024a.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f1024a.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f1024a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f1024a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f1024a.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f1024a.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f1024a.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f1024a.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f1024a.getPadding(rect);
    }

    public int[] getState() {
        return this.f1024a.getState();
    }

    public Region getTransparentRegion() {
        return this.f1024a.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C0155a.m567b(this.f1024a);
    }

    public boolean isStateful() {
        return this.f1024a.isStateful();
    }

    public void jumpToCurrentState() {
        C0155a.m558a(this.f1024a);
    }

    protected void onBoundsChange(Rect rect) {
        this.f1024a.setBounds(rect);
    }

    protected boolean onLevelChange(int i) {
        return this.f1024a.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f1024a.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C0155a.m566a(this.f1024a, z);
    }

    public void setChangingConfigurations(int i) {
        this.f1024a.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1024a.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f1024a.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f1024a.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C0155a.m559a(this.f1024a, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C0155a.m561a(this.f1024a, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f1024a.setState(iArr);
    }

    public void setTint(int i) {
        C0155a.m560a(this.f1024a, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C0155a.m562a(this.f1024a, colorStateList);
    }

    public void setTintMode(Mode mode) {
        C0155a.m565a(this.f1024a, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (!super.setVisible(z, z2)) {
            if (!this.f1024a.setVisible(z, z2)) {
                return false;
            }
        }
        return true;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
