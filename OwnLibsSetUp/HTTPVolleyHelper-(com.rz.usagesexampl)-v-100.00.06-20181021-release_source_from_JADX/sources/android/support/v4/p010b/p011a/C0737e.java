package android.support.v4.p010b.p011a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.p010b.p011a.C0539d.C0158a;

/* renamed from: android.support.v4.b.a.e */
class C0737e extends C0539d {

    /* renamed from: android.support.v4.b.a.e$a */
    private static class C0540a extends C0158a {
        C0540a(C0158a c0158a, Resources resources) {
            super(c0158a, resources);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0737e(this, resources);
        }
    }

    C0737e(Drawable drawable) {
        super(drawable);
    }

    C0737e(C0158a c0158a, Resources resources) {
        super(c0158a, resources);
    }

    /* renamed from: b */
    C0158a mo455b() {
        return new C0540a(this.b, null);
    }

    public boolean isAutoMirrored() {
        return this.c.isAutoMirrored();
    }

    public void setAutoMirrored(boolean z) {
        this.c.setAutoMirrored(z);
    }
}
