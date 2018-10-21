package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: android.support.v4.widget.c */
public final class C0246c {
    /* renamed from: a */
    private static final C0245c f833a;

    /* renamed from: android.support.v4.widget.c$c */
    static class C0245c {
        /* renamed from: a */
        private static Field f831a;
        /* renamed from: b */
        private static boolean f832b;

        C0245c() {
        }

        /* renamed from: a */
        public Drawable mo472a(CompoundButton compoundButton) {
            if (!f832b) {
                try {
                    f831a = CompoundButton.class.getDeclaredField("mButtonDrawable");
                    f831a.setAccessible(true);
                } catch (Throwable e) {
                    Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
                }
                f832b = true;
            }
            if (f831a != null) {
                try {
                    return (Drawable) f831a.get(compoundButton);
                } catch (Throwable e2) {
                    Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e2);
                    f831a = null;
                }
            }
            return null;
        }

        /* renamed from: a */
        public void mo105a(CompoundButton compoundButton, ColorStateList colorStateList) {
            if (compoundButton instanceof C0258l) {
                ((C0258l) compoundButton).setSupportButtonTintList(colorStateList);
            }
        }

        /* renamed from: a */
        public void mo106a(CompoundButton compoundButton, Mode mode) {
            if (compoundButton instanceof C0258l) {
                ((C0258l) compoundButton).setSupportButtonTintMode(mode);
            }
        }
    }

    /* renamed from: android.support.v4.widget.c$a */
    static class C0567a extends C0245c {
        C0567a() {
        }

        /* renamed from: a */
        public void mo105a(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        /* renamed from: a */
        public void mo106a(CompoundButton compoundButton, Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* renamed from: android.support.v4.widget.c$b */
    static class C0744b extends C0567a {
        C0744b() {
        }

        /* renamed from: a */
        public Drawable mo472a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    static {
        C0245c c0744b = VERSION.SDK_INT >= 23 ? new C0744b() : VERSION.SDK_INT >= 21 ? new C0567a() : new C0245c();
        f833a = c0744b;
    }

    /* renamed from: a */
    public static Drawable m968a(CompoundButton compoundButton) {
        return f833a.mo472a(compoundButton);
    }

    /* renamed from: a */
    public static void m969a(CompoundButton compoundButton, ColorStateList colorStateList) {
        f833a.mo105a(compoundButton, colorStateList);
    }

    /* renamed from: a */
    public static void m970a(CompoundButton compoundButton, Mode mode) {
        f833a.mo106a(compoundButton, mode);
    }
}
