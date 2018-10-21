package android.support.v4.p010b.p011a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.v4.p010b.p011a.C0539d.C0158a;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.b.a.f */
class C0778f extends C0737e {
    /* renamed from: d */
    private static Method f2795d;

    /* renamed from: android.support.v4.b.a.f$a */
    private static class C0541a extends C0158a {
        C0541a(C0158a c0158a, Resources resources) {
            super(c0158a, resources);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0778f(this, resources);
        }
    }

    C0778f(Drawable drawable) {
        super(drawable);
        m3676d();
    }

    C0778f(C0158a c0158a, Resources resources) {
        super(c0158a, resources);
        m3676d();
    }

    /* renamed from: d */
    private void m3676d() {
        if (f2795d == null) {
            try {
                f2795d = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Throwable e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    /* renamed from: b */
    C0158a mo455b() {
        return new C0541a(this.b, null);
    }

    /* renamed from: c */
    protected boolean mo538c() {
        if (VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.c;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    public Rect getDirtyBounds() {
        return this.c.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.c.getOutline(outline);
    }

    public void setHotspot(float f, float f2) {
        this.c.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.c.setHotspotBounds(i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setTint(int i) {
        if (mo538c()) {
            super.setTint(i);
        } else {
            this.c.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (mo538c()) {
            super.setTintList(colorStateList);
        } else {
            this.c.setTintList(colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        if (mo538c()) {
            super.setTintMode(mode);
        } else {
            this.c.setTintMode(mode);
        }
    }
}
