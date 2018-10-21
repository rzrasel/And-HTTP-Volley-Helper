package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.ImageView;

/* renamed from: android.support.v4.widget.g */
public class C0254g {
    /* renamed from: a */
    static final C0253b f838a = (VERSION.SDK_INT >= 21 ? new C0745c() : new C0570a());

    /* renamed from: android.support.v4.widget.g$b */
    interface C0253b {
        /* renamed from: a */
        ColorStateList mo112a(ImageView imageView);

        /* renamed from: a */
        void mo113a(ImageView imageView, ColorStateList colorStateList);

        /* renamed from: a */
        void mo114a(ImageView imageView, Mode mode);

        /* renamed from: b */
        Mode mo115b(ImageView imageView);
    }

    /* renamed from: android.support.v4.widget.g$a */
    static class C0570a implements C0253b {
        C0570a() {
        }

        /* renamed from: a */
        public ColorStateList mo112a(ImageView imageView) {
            return imageView instanceof C0259m ? ((C0259m) imageView).getSupportImageTintList() : null;
        }

        /* renamed from: a */
        public void mo113a(ImageView imageView, ColorStateList colorStateList) {
            if (imageView instanceof C0259m) {
                ((C0259m) imageView).setSupportImageTintList(colorStateList);
            }
        }

        /* renamed from: a */
        public void mo114a(ImageView imageView, Mode mode) {
            if (imageView instanceof C0259m) {
                ((C0259m) imageView).setSupportImageTintMode(mode);
            }
        }

        /* renamed from: b */
        public Mode mo115b(ImageView imageView) {
            return imageView instanceof C0259m ? ((C0259m) imageView).getSupportImageTintMode() : null;
        }
    }

    /* renamed from: android.support.v4.widget.g$c */
    static class C0745c extends C0570a {
        C0745c() {
        }

        /* renamed from: a */
        public ColorStateList mo112a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        /* renamed from: a */
        public void mo113a(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
            if (VERSION.SDK_INT == 21) {
                Drawable drawable = imageView.getDrawable();
                Object obj = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? null : 1;
                if (drawable != null && obj != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        }

        /* renamed from: a */
        public void mo114a(ImageView imageView, Mode mode) {
            imageView.setImageTintMode(mode);
            if (VERSION.SDK_INT == 21) {
                Drawable drawable = imageView.getDrawable();
                Object obj = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? null : 1;
                if (drawable != null && obj != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        }

        /* renamed from: b */
        public Mode mo115b(ImageView imageView) {
            return imageView.getImageTintMode();
        }
    }

    /* renamed from: a */
    public static ColorStateList m981a(ImageView imageView) {
        return f838a.mo112a(imageView);
    }

    /* renamed from: a */
    public static void m982a(ImageView imageView, ColorStateList colorStateList) {
        f838a.mo113a(imageView, colorStateList);
    }

    /* renamed from: a */
    public static void m983a(ImageView imageView, Mode mode) {
        f838a.mo114a(imageView, mode);
    }

    /* renamed from: b */
    public static Mode m984b(ImageView imageView) {
        return f838a.mo115b(imageView);
    }
}
