package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.p017g.C0224o;
import android.support.v4.widget.C0259m;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: android.support.v7.widget.q */
public class C0632q extends ImageView implements C0224o, C0259m {
    /* renamed from: a */
    private final C0390g f2403a;
    /* renamed from: b */
    private final C0396p f2404b;

    public C0632q(Context context) {
        this(context, null);
    }

    public C0632q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0632q(Context context, AttributeSet attributeSet, int i) {
        super(at.m1473a(context), attributeSet, i);
        this.f2403a = new C0390g(this);
        this.f2403a.m1542a(attributeSet, i);
        this.f2404b = new C0396p(this);
        this.f2404b.m1591a(attributeSet, i);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f2403a != null) {
            this.f2403a.m1545c();
        }
        if (this.f2404b != null) {
            this.f2404b.m1595d();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.f2403a != null ? this.f2403a.m1537a() : null;
    }

    public Mode getSupportBackgroundTintMode() {
        return this.f2403a != null ? this.f2403a.m1543b() : null;
    }

    public ColorStateList getSupportImageTintList() {
        return this.f2404b != null ? this.f2404b.m1593b() : null;
    }

    public Mode getSupportImageTintMode() {
        return this.f2404b != null ? this.f2404b.m1594c() : null;
    }

    public boolean hasOverlappingRendering() {
        return this.f2404b.m1592a() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f2403a != null) {
            this.f2403a.m1541a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f2403a != null) {
            this.f2403a.m1538a(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (this.f2404b != null) {
            this.f2404b.m1595d();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (this.f2404b != null) {
            this.f2404b.m1595d();
        }
    }

    public void setImageResource(int i) {
        if (this.f2404b != null) {
            this.f2404b.m1588a(i);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        if (this.f2404b != null) {
            this.f2404b.m1595d();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f2403a != null) {
            this.f2403a.m1539a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f2403a != null) {
            this.f2403a.m1540a(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f2404b != null) {
            this.f2404b.m1589a(colorStateList);
        }
    }

    public void setSupportImageTintMode(Mode mode) {
        if (this.f2404b != null) {
            this.f2404b.m1590a(mode);
        }
    }
}
