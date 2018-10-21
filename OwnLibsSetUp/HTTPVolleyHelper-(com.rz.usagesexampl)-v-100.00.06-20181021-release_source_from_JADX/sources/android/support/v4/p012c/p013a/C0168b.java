package android.support.v4.p012c.p013a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.support.v4.p017g.C0212c;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v4.c.a.b */
public interface C0168b extends MenuItem {
    /* renamed from: a */
    C0168b mo197a(C0212c c0212c);

    /* renamed from: a */
    C0168b mo198a(CharSequence charSequence);

    /* renamed from: a */
    C0212c mo199a();

    /* renamed from: b */
    C0168b mo200b(CharSequence charSequence);

    boolean collapseActionView();

    boolean expandActionView();

    View getActionView();

    int getAlphabeticModifiers();

    CharSequence getContentDescription();

    ColorStateList getIconTintList();

    Mode getIconTintMode();

    int getNumericModifiers();

    CharSequence getTooltipText();

    boolean isActionViewExpanded();

    MenuItem setActionView(int i);

    MenuItem setActionView(View view);

    MenuItem setAlphabeticShortcut(char c, int i);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(Mode mode);

    MenuItem setNumericShortcut(char c, int i);

    MenuItem setShortcut(char c, char c2, int i, int i2);

    void setShowAsAction(int i);

    MenuItem setShowAsActionFlags(int i);
}
