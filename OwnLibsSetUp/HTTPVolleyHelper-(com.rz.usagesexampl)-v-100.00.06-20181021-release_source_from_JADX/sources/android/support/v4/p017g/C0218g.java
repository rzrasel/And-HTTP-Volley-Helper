package android.support.v4.p017g;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.support.v4.p012c.p013a.C0168b;
import android.util.Log;
import android.view.MenuItem;

/* renamed from: android.support.v4.g.g */
public final class C0218g {
    /* renamed from: a */
    static final C0217c f769a = (VERSION.SDK_INT >= 26 ? new C0740a() : new C0558b());

    /* renamed from: android.support.v4.g.g$c */
    interface C0217c {
        /* renamed from: a */
        void mo92a(MenuItem menuItem, char c, int i);

        /* renamed from: a */
        void mo93a(MenuItem menuItem, ColorStateList colorStateList);

        /* renamed from: a */
        void mo94a(MenuItem menuItem, Mode mode);

        /* renamed from: a */
        void mo95a(MenuItem menuItem, CharSequence charSequence);

        /* renamed from: b */
        void mo96b(MenuItem menuItem, char c, int i);

        /* renamed from: b */
        void mo97b(MenuItem menuItem, CharSequence charSequence);
    }

    /* renamed from: android.support.v4.g.g$b */
    static class C0558b implements C0217c {
        C0558b() {
        }

        /* renamed from: a */
        public void mo92a(MenuItem menuItem, char c, int i) {
        }

        /* renamed from: a */
        public void mo93a(MenuItem menuItem, ColorStateList colorStateList) {
        }

        /* renamed from: a */
        public void mo94a(MenuItem menuItem, Mode mode) {
        }

        /* renamed from: a */
        public void mo95a(MenuItem menuItem, CharSequence charSequence) {
        }

        /* renamed from: b */
        public void mo96b(MenuItem menuItem, char c, int i) {
        }

        /* renamed from: b */
        public void mo97b(MenuItem menuItem, CharSequence charSequence) {
        }
    }

    /* renamed from: android.support.v4.g.g$a */
    static class C0740a extends C0558b {
        C0740a() {
        }

        /* renamed from: a */
        public void mo92a(MenuItem menuItem, char c, int i) {
            menuItem.setAlphabeticShortcut(c, i);
        }

        /* renamed from: a */
        public void mo93a(MenuItem menuItem, ColorStateList colorStateList) {
            menuItem.setIconTintList(colorStateList);
        }

        /* renamed from: a */
        public void mo94a(MenuItem menuItem, Mode mode) {
            menuItem.setIconTintMode(mode);
        }

        /* renamed from: a */
        public void mo95a(MenuItem menuItem, CharSequence charSequence) {
            menuItem.setContentDescription(charSequence);
        }

        /* renamed from: b */
        public void mo96b(MenuItem menuItem, char c, int i) {
            menuItem.setNumericShortcut(c, i);
        }

        /* renamed from: b */
        public void mo97b(MenuItem menuItem, CharSequence charSequence) {
            menuItem.setTooltipText(charSequence);
        }
    }

    /* renamed from: a */
    public static MenuItem m809a(MenuItem menuItem, C0212c c0212c) {
        if (menuItem instanceof C0168b) {
            return ((C0168b) menuItem).mo197a(c0212c);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: a */
    public static void m810a(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C0168b) {
            ((C0168b) menuItem).setNumericShortcut(c, i);
        } else {
            f769a.mo96b(menuItem, c, i);
        }
    }

    /* renamed from: a */
    public static void m811a(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof C0168b) {
            ((C0168b) menuItem).setIconTintList(colorStateList);
        } else {
            f769a.mo93a(menuItem, colorStateList);
        }
    }

    /* renamed from: a */
    public static void m812a(MenuItem menuItem, Mode mode) {
        if (menuItem instanceof C0168b) {
            ((C0168b) menuItem).setIconTintMode(mode);
        } else {
            f769a.mo94a(menuItem, mode);
        }
    }

    /* renamed from: a */
    public static void m813a(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C0168b) {
            ((C0168b) menuItem).mo198a(charSequence);
        } else {
            f769a.mo95a(menuItem, charSequence);
        }
    }

    /* renamed from: b */
    public static void m814b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C0168b) {
            ((C0168b) menuItem).setAlphabeticShortcut(c, i);
        } else {
            f769a.mo92a(menuItem, c, i);
        }
    }

    /* renamed from: b */
    public static void m815b(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C0168b) {
            ((C0168b) menuItem).mo200b(charSequence);
        } else {
            f769a.mo97b(menuItem, charSequence);
        }
    }
}
