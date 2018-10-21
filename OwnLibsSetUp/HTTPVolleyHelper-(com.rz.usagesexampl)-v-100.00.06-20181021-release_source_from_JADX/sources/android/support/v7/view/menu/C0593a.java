package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.p008a.C0096a;
import android.support.v4.p010b.p011a.C0155a;
import android.support.v4.p012c.p013a.C0168b;
import android.support.v4.p017g.C0212c;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.a */
public class C0593a implements C0168b {
    /* renamed from: a */
    private final int f2093a;
    /* renamed from: b */
    private final int f2094b;
    /* renamed from: c */
    private final int f2095c;
    /* renamed from: d */
    private final int f2096d;
    /* renamed from: e */
    private CharSequence f2097e;
    /* renamed from: f */
    private CharSequence f2098f;
    /* renamed from: g */
    private Intent f2099g;
    /* renamed from: h */
    private char f2100h;
    /* renamed from: i */
    private int f2101i = 4096;
    /* renamed from: j */
    private char f2102j;
    /* renamed from: k */
    private int f2103k = 4096;
    /* renamed from: l */
    private Drawable f2104l;
    /* renamed from: m */
    private int f2105m = 0;
    /* renamed from: n */
    private Context f2106n;
    /* renamed from: o */
    private OnMenuItemClickListener f2107o;
    /* renamed from: p */
    private CharSequence f2108p;
    /* renamed from: q */
    private CharSequence f2109q;
    /* renamed from: r */
    private ColorStateList f2110r = null;
    /* renamed from: s */
    private Mode f2111s = null;
    /* renamed from: t */
    private boolean f2112t = false;
    /* renamed from: u */
    private boolean f2113u = false;
    /* renamed from: v */
    private int f2114v = 16;

    public C0593a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f2106n = context;
        this.f2093a = i2;
        this.f2094b = i;
        this.f2095c = i3;
        this.f2096d = i4;
        this.f2097e = charSequence;
    }

    /* renamed from: b */
    private void m2596b() {
        if (this.f2104l == null) {
            return;
        }
        if (this.f2112t || this.f2113u) {
            this.f2104l = C0155a.m572f(this.f2104l);
            this.f2104l = this.f2104l.mutate();
            if (this.f2112t) {
                C0155a.m562a(this.f2104l, this.f2110r);
            }
            if (this.f2113u) {
                C0155a.m565a(this.f2104l, this.f2111s);
            }
        }
    }

    /* renamed from: a */
    public C0168b m2597a(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C0168b mo197a(C0212c c0212c) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C0168b m2599a(View view) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C0168b mo198a(CharSequence charSequence) {
        this.f2108p = charSequence;
        return this;
    }

    /* renamed from: a */
    public C0212c mo199a() {
        return null;
    }

    /* renamed from: b */
    public C0168b m2602b(int i) {
        setShowAsAction(i);
        return this;
    }

    /* renamed from: b */
    public C0168b mo200b(CharSequence charSequence) {
        this.f2109q = charSequence;
        return this;
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f2103k;
    }

    public char getAlphabeticShortcut() {
        return this.f2102j;
    }

    public CharSequence getContentDescription() {
        return this.f2108p;
    }

    public int getGroupId() {
        return this.f2094b;
    }

    public Drawable getIcon() {
        return this.f2104l;
    }

    public ColorStateList getIconTintList() {
        return this.f2110r;
    }

    public Mode getIconTintMode() {
        return this.f2111s;
    }

    public Intent getIntent() {
        return this.f2099g;
    }

    public int getItemId() {
        return this.f2093a;
    }

    public ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f2101i;
    }

    public char getNumericShortcut() {
        return this.f2100h;
    }

    public int getOrder() {
        return this.f2096d;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f2097e;
    }

    public CharSequence getTitleCondensed() {
        return this.f2098f != null ? this.f2098f : this.f2097e;
    }

    public CharSequence getTooltipText() {
        return this.f2109q;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f2114v & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f2114v & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f2114v & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f2114v & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ MenuItem setActionView(int i) {
        return m2597a(i);
    }

    public /* synthetic */ MenuItem setActionView(View view) {
        return m2599a(view);
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f2102j = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f2102j = Character.toLowerCase(c);
        this.f2103k = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f2114v = z | (this.f2114v & -2);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f2114v = (z ? 2 : 0) | (this.f2114v & -3);
        return this;
    }

    public /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        return mo198a(charSequence);
    }

    public MenuItem setEnabled(boolean z) {
        this.f2114v = (z ? 16 : 0) | (this.f2114v & -17);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f2105m = i;
        this.f2104l = C0096a.m385a(this.f2106n, i);
        m2596b();
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f2104l = drawable;
        this.f2105m = 0;
        m2596b();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2110r = colorStateList;
        this.f2112t = true;
        m2596b();
        return this;
    }

    public MenuItem setIconTintMode(Mode mode) {
        this.f2111s = mode;
        this.f2113u = true;
        m2596b();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f2099g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f2100h = c;
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f2100h = c;
        this.f2101i = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f2107o = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f2100h = c;
        this.f2102j = Character.toLowerCase(c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f2100h = c;
        this.f2101i = KeyEvent.normalizeMetaState(i);
        this.f2102j = Character.toLowerCase(c2);
        this.f2103k = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        return m2602b(i);
    }

    public MenuItem setTitle(int i) {
        this.f2097e = this.f2106n.getResources().getString(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f2097e = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2098f = charSequence;
        return this;
    }

    public /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        return mo200b(charSequence);
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f2114v & 8;
        if (z) {
            i = 0;
        }
        this.f2114v = i2 | i;
        return this;
    }
}
