package android.support.v4.p010b.p011a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v4.b.a.a */
public final class C0155a {
    /* renamed from: a */
    private static Method f630a;
    /* renamed from: b */
    private static boolean f631b;
    /* renamed from: c */
    private static Method f632c;
    /* renamed from: d */
    private static boolean f633d;

    @Deprecated
    /* renamed from: a */
    public static void m558a(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: a */
    public static void m559a(Drawable drawable, float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f, f2);
        }
    }

    /* renamed from: a */
    public static void m560a(Drawable drawable, int i) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
        } else if (drawable instanceof C0156b) {
            ((C0156b) drawable).setTint(i);
        }
    }

    /* renamed from: a */
    public static void m561a(Drawable drawable, int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public static void m562a(Drawable drawable, ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof C0156b) {
            ((C0156b) drawable).setTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m563a(Drawable drawable, Theme theme) {
        if (VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    /* renamed from: a */
    public static void m564a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        if (VERSION.SDK_INT >= 21) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    /* renamed from: a */
    public static void m565a(Drawable drawable, Mode mode) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof C0156b) {
            ((C0156b) drawable).setTintMode(mode);
        }
    }

    /* renamed from: a */
    public static void m566a(Drawable drawable, boolean z) {
        if (VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(z);
        }
    }

    /* renamed from: b */
    public static boolean m567b(Drawable drawable) {
        return VERSION.SDK_INT >= 19 ? drawable.isAutoMirrored() : false;
    }

    /* renamed from: b */
    public static boolean m568b(Drawable drawable, int i) {
        if (VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (VERSION.SDK_INT >= 17) {
            if (!f631b) {
                try {
                    f630a = Drawable.class.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                    f630a.setAccessible(true);
                } catch (Throwable e) {
                    Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
                }
                f631b = true;
            }
            if (f630a != null) {
                try {
                    f630a.invoke(drawable, new Object[]{Integer.valueOf(i)});
                    return true;
                } catch (Throwable e2) {
                    Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                    f630a = null;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public static int m569c(Drawable drawable) {
        return VERSION.SDK_INT >= 19 ? drawable.getAlpha() : 0;
    }

    /* renamed from: d */
    public static boolean m570d(Drawable drawable) {
        return VERSION.SDK_INT >= 21 ? drawable.canApplyTheme() : false;
    }

    /* renamed from: e */
    public static ColorFilter m571e(Drawable drawable) {
        return VERSION.SDK_INT >= 21 ? drawable.getColorFilter() : null;
    }

    /* renamed from: f */
    public static Drawable m572f(Drawable drawable) {
        return VERSION.SDK_INT >= 23 ? drawable : VERSION.SDK_INT >= 21 ? !(drawable instanceof C0156b) ? new C0778f(drawable) : drawable : VERSION.SDK_INT >= 19 ? !(drawable instanceof C0156b) ? new C0737e(drawable) : drawable : !(drawable instanceof C0156b) ? new C0539d(drawable) : drawable;
    }

    /* renamed from: g */
    public static int m573g(Drawable drawable) {
        if (VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        if (VERSION.SDK_INT >= 17) {
            if (!f633d) {
                try {
                    f632c = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    f632c.setAccessible(true);
                } catch (Throwable e) {
                    Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e);
                }
                f633d = true;
            }
            if (f632c != null) {
                try {
                    return ((Integer) f632c.invoke(drawable, new Object[0])).intValue();
                } catch (Throwable e2) {
                    Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e2);
                    f632c = null;
                }
            }
        }
        return 0;
    }
}
