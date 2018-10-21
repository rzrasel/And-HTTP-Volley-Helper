package android.support.v4.p010b.p011a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

/* renamed from: android.support.v4.b.a.d */
class C0539d extends Drawable implements Callback, C0156b, C0157c {
    /* renamed from: a */
    static final Mode f1953a = Mode.SRC_IN;
    /* renamed from: b */
    C0158a f1954b;
    /* renamed from: c */
    Drawable f1955c;
    /* renamed from: d */
    private int f1956d;
    /* renamed from: e */
    private Mode f1957e;
    /* renamed from: f */
    private boolean f1958f;
    /* renamed from: g */
    private boolean f1959g;

    /* renamed from: android.support.v4.b.a.d$a */
    protected static abstract class C0158a extends ConstantState {
        /* renamed from: a */
        int f634a;
        /* renamed from: b */
        ConstantState f635b;
        /* renamed from: c */
        ColorStateList f636c = null;
        /* renamed from: d */
        Mode f637d = C0539d.f1953a;

        C0158a(C0158a c0158a, Resources resources) {
            if (c0158a != null) {
                this.f634a = c0158a.f634a;
                this.f635b = c0158a.f635b;
                this.f636c = c0158a.f636c;
                this.f637d = c0158a.f637d;
            }
        }

        /* renamed from: a */
        boolean m576a() {
            return this.f635b != null;
        }

        public int getChangingConfigurations() {
            return this.f634a | (this.f635b != null ? this.f635b.getChangingConfigurations() : 0);
        }

        public Drawable newDrawable() {
            return newDrawable(null);
        }

        public abstract Drawable newDrawable(Resources resources);
    }

    /* renamed from: android.support.v4.b.a.d$b */
    private static class C0538b extends C0158a {
        C0538b(C0158a c0158a, Resources resources) {
            super(c0158a, resources);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0539d(this, resources);
        }
    }

    C0539d(Drawable drawable) {
        this.f1954b = mo455b();
        mo68a(drawable);
    }

    C0539d(C0158a c0158a, Resources resources) {
        this.f1954b = c0158a;
        m2358a(resources);
    }

    /* renamed from: a */
    private void m2358a(Resources resources) {
        if (this.f1954b != null && this.f1954b.f635b != null) {
            mo68a(this.f1954b.f635b.newDrawable(resources));
        }
    }

    /* renamed from: a */
    private boolean m2359a(int[] iArr) {
        if (!mo538c()) {
            return false;
        }
        ColorStateList colorStateList = this.f1954b.f636c;
        Mode mode = this.f1954b.f637d;
        if (colorStateList == null || mode == null) {
            this.f1958f = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f1958f && colorForState == this.f1956d && mode == this.f1957e)) {
                setColorFilter(colorForState, mode);
                this.f1956d = colorForState;
                this.f1957e = mode;
                this.f1958f = true;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final Drawable mo67a() {
        return this.f1955c;
    }

    /* renamed from: a */
    public final void mo68a(Drawable drawable) {
        if (this.f1955c != null) {
            this.f1955c.setCallback(null);
        }
        this.f1955c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            if (this.f1954b != null) {
                this.f1954b.f635b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* renamed from: b */
    C0158a mo455b() {
        return new C0538b(this.f1954b, null);
    }

    /* renamed from: c */
    protected boolean mo538c() {
        return true;
    }

    public void draw(Canvas canvas) {
        this.f1955c.draw(canvas);
    }

    public int getChangingConfigurations() {
        return (super.getChangingConfigurations() | (this.f1954b != null ? this.f1954b.getChangingConfigurations() : 0)) | this.f1955c.getChangingConfigurations();
    }

    public ConstantState getConstantState() {
        if (this.f1954b == null || !this.f1954b.m576a()) {
            return null;
        }
        this.f1954b.f634a = getChangingConfigurations();
        return this.f1954b;
    }

    public Drawable getCurrent() {
        return this.f1955c.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f1955c.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f1955c.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f1955c.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f1955c.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f1955c.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f1955c.getPadding(rect);
    }

    public int[] getState() {
        return this.f1955c.getState();
    }

    public Region getTransparentRegion() {
        return this.f1955c.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isStateful() {
        ColorStateList colorStateList = (!mo538c() || this.f1954b == null) ? null : this.f1954b.f636c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f1955c.isStateful();
    }

    public void jumpToCurrentState() {
        this.f1955c.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f1959g && super.mutate() == this) {
            this.f1954b = mo455b();
            if (this.f1955c != null) {
                this.f1955c.mutate();
            }
            if (this.f1954b != null) {
                this.f1954b.f635b = this.f1955c != null ? this.f1955c.getConstantState() : null;
            }
            this.f1959g = true;
        }
        return this;
    }

    protected void onBoundsChange(Rect rect) {
        if (this.f1955c != null) {
            this.f1955c.setBounds(rect);
        }
    }

    protected boolean onLevelChange(int i) {
        return this.f1955c.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f1955c.setAlpha(i);
    }

    public void setChangingConfigurations(int i) {
        this.f1955c.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1955c.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f1955c.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f1955c.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        boolean state = this.f1955c.setState(iArr);
        if (!m2359a(iArr)) {
            if (!state) {
                return false;
            }
        }
        return true;
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f1954b.f636c = colorStateList;
        m2359a(getState());
    }

    public void setTintMode(Mode mode) {
        this.f1954b.f637d = mode;
        m2359a(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (!super.setVisible(z, z2)) {
            if (!this.f1955c.setVisible(z, z2)) {
                return false;
            }
        }
        return true;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
