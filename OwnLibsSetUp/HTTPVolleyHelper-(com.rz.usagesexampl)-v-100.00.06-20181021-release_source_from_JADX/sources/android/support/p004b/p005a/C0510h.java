package android.support.p004b.p005a;

import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.v4.p010b.p011a.C0155a;
import android.support.v4.p010b.p011a.C0156b;

/* renamed from: android.support.b.a.h */
abstract class C0510h extends Drawable implements C0156b {
    /* renamed from: b */
    Drawable f1782b;

    C0510h() {
    }

    public void applyTheme(Theme theme) {
        if (this.f1782b != null) {
            C0155a.m563a(this.f1782b, theme);
        }
    }

    public void clearColorFilter() {
        if (this.f1782b != null) {
            this.f1782b.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public ColorFilter getColorFilter() {
        return this.f1782b != null ? C0155a.m571e(this.f1782b) : null;
    }

    public Drawable getCurrent() {
        return this.f1782b != null ? this.f1782b.getCurrent() : super.getCurrent();
    }

    public int getMinimumHeight() {
        return this.f1782b != null ? this.f1782b.getMinimumHeight() : super.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f1782b != null ? this.f1782b.getMinimumWidth() : super.getMinimumWidth();
    }

    public boolean getPadding(Rect rect) {
        return this.f1782b != null ? this.f1782b.getPadding(rect) : super.getPadding(rect);
    }

    public int[] getState() {
        return this.f1782b != null ? this.f1782b.getState() : super.getState();
    }

    public Region getTransparentRegion() {
        return this.f1782b != null ? this.f1782b.getTransparentRegion() : super.getTransparentRegion();
    }

    public void jumpToCurrentState() {
        if (this.f1782b != null) {
            C0155a.m558a(this.f1782b);
        }
    }

    protected void onBoundsChange(Rect rect) {
        if (this.f1782b != null) {
            this.f1782b.setBounds(rect);
        } else {
            super.onBoundsChange(rect);
        }
    }

    protected boolean onLevelChange(int i) {
        return this.f1782b != null ? this.f1782b.setLevel(i) : super.onLevelChange(i);
    }

    public void setChangingConfigurations(int i) {
        if (this.f1782b != null) {
            this.f1782b.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    public void setColorFilter(int i, Mode mode) {
        if (this.f1782b != null) {
            this.f1782b.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    public void setFilterBitmap(boolean z) {
        if (this.f1782b != null) {
            this.f1782b.setFilterBitmap(z);
        }
    }

    public void setHotspot(float f, float f2) {
        if (this.f1782b != null) {
            C0155a.m559a(this.f1782b, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f1782b != null) {
            C0155a.m561a(this.f1782b, i, i2, i3, i4);
        }
    }

    public boolean setState(int[] iArr) {
        return this.f1782b != null ? this.f1782b.setState(iArr) : super.setState(iArr);
    }
}
