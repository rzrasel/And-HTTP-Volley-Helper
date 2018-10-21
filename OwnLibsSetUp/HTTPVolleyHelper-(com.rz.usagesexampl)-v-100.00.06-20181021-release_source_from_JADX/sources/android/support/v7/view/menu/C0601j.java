package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p010b.p011a.C0155a;
import android.support.v4.p012c.p013a.C0168b;
import android.support.v4.p017g.C0212c;
import android.support.v4.p017g.C0212c.C0211b;
import android.support.v7.p021b.p022a.C0303b;
import android.support.v7.view.menu.C0332p.C0331a;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.LinearLayout;

/* renamed from: android.support.v7.view.menu.j */
public final class C0601j implements C0168b {
    /* renamed from: F */
    private static String f2169F;
    /* renamed from: G */
    private static String f2170G;
    /* renamed from: H */
    private static String f2171H;
    /* renamed from: I */
    private static String f2172I;
    /* renamed from: A */
    private View f2173A;
    /* renamed from: B */
    private C0212c f2174B;
    /* renamed from: C */
    private OnActionExpandListener f2175C;
    /* renamed from: D */
    private boolean f2176D = false;
    /* renamed from: E */
    private ContextMenuInfo f2177E;
    /* renamed from: a */
    C0598h f2178a;
    /* renamed from: b */
    private final int f2179b;
    /* renamed from: c */
    private final int f2180c;
    /* renamed from: d */
    private final int f2181d;
    /* renamed from: e */
    private final int f2182e;
    /* renamed from: f */
    private CharSequence f2183f;
    /* renamed from: g */
    private CharSequence f2184g;
    /* renamed from: h */
    private Intent f2185h;
    /* renamed from: i */
    private char f2186i;
    /* renamed from: j */
    private int f2187j = 4096;
    /* renamed from: k */
    private char f2188k;
    /* renamed from: l */
    private int f2189l = 4096;
    /* renamed from: m */
    private Drawable f2190m;
    /* renamed from: n */
    private int f2191n = 0;
    /* renamed from: o */
    private C0762u f2192o;
    /* renamed from: p */
    private Runnable f2193p;
    /* renamed from: q */
    private OnMenuItemClickListener f2194q;
    /* renamed from: r */
    private CharSequence f2195r;
    /* renamed from: s */
    private CharSequence f2196s;
    /* renamed from: t */
    private ColorStateList f2197t = null;
    /* renamed from: u */
    private Mode f2198u = null;
    /* renamed from: v */
    private boolean f2199v = false;
    /* renamed from: w */
    private boolean f2200w = false;
    /* renamed from: x */
    private boolean f2201x = false;
    /* renamed from: y */
    private int f2202y = 16;
    /* renamed from: z */
    private int f2203z = 0;

    /* renamed from: android.support.v7.view.menu.j$1 */
    class C06001 implements C0211b {
        /* renamed from: a */
        final /* synthetic */ C0601j f2168a;

        C06001(C0601j c0601j) {
            this.f2168a = c0601j;
        }

        /* renamed from: a */
        public void mo230a(boolean z) {
            this.f2168a.f2178a.m2656a(this.f2168a);
        }
    }

    C0601j(C0598h c0598h, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f2178a = c0598h;
        this.f2179b = i2;
        this.f2180c = i;
        this.f2181d = i3;
        this.f2182e = i4;
        this.f2183f = charSequence;
        this.f2203z = i5;
    }

    /* renamed from: a */
    private Drawable m2698a(Drawable drawable) {
        if (drawable != null && this.f2201x && (this.f2199v || this.f2200w)) {
            drawable = C0155a.m572f(drawable).mutate();
            if (this.f2199v) {
                C0155a.m562a(drawable, this.f2197t);
            }
            if (this.f2200w) {
                C0155a.m565a(drawable, this.f2198u);
            }
            this.f2201x = false;
        }
        return drawable;
    }

    /* renamed from: a */
    public C0168b m2699a(int i) {
        Context e = this.f2178a.m2678e();
        m2701a(LayoutInflater.from(e).inflate(i, new LinearLayout(e), false));
        return this;
    }

    /* renamed from: a */
    public C0168b mo197a(C0212c c0212c) {
        if (this.f2174B != null) {
            this.f2174B.m796f();
        }
        this.f2173A = null;
        this.f2174B = c0212c;
        this.f2178a.m2669b(true);
        if (this.f2174B != null) {
            this.f2174B.mo510a(new C06001(this));
        }
        return this;
    }

    /* renamed from: a */
    public C0168b m2701a(View view) {
        this.f2173A = view;
        this.f2174B = null;
        if (view != null && view.getId() == -1 && this.f2179b > 0) {
            view.setId(this.f2179b);
        }
        this.f2178a.m2667b(this);
        return this;
    }

    /* renamed from: a */
    public C0168b mo198a(CharSequence charSequence) {
        this.f2195r = charSequence;
        this.f2178a.m2669b(false);
        return this;
    }

    /* renamed from: a */
    public C0212c mo199a() {
        return this.f2174B;
    }

    /* renamed from: a */
    CharSequence m2704a(C0331a c0331a) {
        return (c0331a == null || !c0331a.mo195a()) ? getTitle() : getTitleCondensed();
    }

    /* renamed from: a */
    public void m2705a(C0762u c0762u) {
        this.f2192o = c0762u;
        c0762u.setHeaderTitle(getTitle());
    }

    /* renamed from: a */
    void m2706a(ContextMenuInfo contextMenuInfo) {
        this.f2177E = contextMenuInfo;
    }

    /* renamed from: a */
    public void m2707a(boolean z) {
        this.f2202y = (z ? 4 : 0) | (this.f2202y & -5);
    }

    /* renamed from: b */
    public C0168b m2708b(int i) {
        setShowAsAction(i);
        return this;
    }

    /* renamed from: b */
    public C0168b mo200b(CharSequence charSequence) {
        this.f2196s = charSequence;
        this.f2178a.m2669b(false);
        return this;
    }

    /* renamed from: b */
    void m2710b(boolean z) {
        int i = this.f2202y;
        this.f2202y = (z ? 2 : 0) | (this.f2202y & -3);
        if (i != this.f2202y) {
            this.f2178a.m2669b(false);
        }
    }

    /* renamed from: b */
    public boolean m2711b() {
        if ((this.f2194q != null && this.f2194q.onMenuItemClick(this)) || this.f2178a.mo515a(this.f2178a, (MenuItem) this)) {
            return true;
        }
        if (this.f2193p != null) {
            this.f2193p.run();
            return true;
        }
        if (this.f2185h != null) {
            try {
                this.f2178a.m2678e().startActivity(this.f2185h);
                return true;
            } catch (Throwable e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        return this.f2174B != null && this.f2174B.mo233d();
    }

    /* renamed from: c */
    public int m2712c() {
        return this.f2182e;
    }

    /* renamed from: c */
    boolean m2713c(boolean z) {
        int i = this.f2202y;
        this.f2202y = (z ? 0 : 8) | (this.f2202y & -9);
        return i != this.f2202y;
    }

    public boolean collapseActionView() {
        if ((this.f2203z & 8) == 0) {
            return false;
        }
        if (this.f2173A == null) {
            return true;
        }
        if (this.f2175C != null) {
            if (!this.f2175C.onMenuItemActionCollapse(this)) {
                return false;
            }
        }
        return this.f2178a.mo519d(this);
    }

    /* renamed from: d */
    char m2714d() {
        return this.f2178a.mo516b() ? this.f2188k : this.f2186i;
    }

    /* renamed from: d */
    public void m2715d(boolean z) {
        this.f2202y = z ? this.f2202y | 32 : this.f2202y & -33;
    }

    /* renamed from: e */
    String m2716e() {
        char d = m2714d();
        if (d == '\u0000') {
            return "";
        }
        String str;
        StringBuilder stringBuilder = new StringBuilder(f2169F);
        if (d == '\b') {
            str = f2171H;
        } else if (d == '\n') {
            str = f2170G;
        } else if (d != ' ') {
            stringBuilder.append(d);
            return stringBuilder.toString();
        } else {
            str = f2172I;
        }
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    /* renamed from: e */
    public void m2717e(boolean z) {
        this.f2176D = z;
        this.f2178a.m2669b(false);
    }

    public boolean expandActionView() {
        if (!m2726n()) {
            return false;
        }
        if (this.f2175C != null) {
            if (!this.f2175C.onMenuItemActionExpand(this)) {
                return false;
            }
        }
        return this.f2178a.mo518c(this);
    }

    /* renamed from: f */
    boolean m2718f() {
        return this.f2178a.mo517c() && m2714d() != '\u0000';
    }

    /* renamed from: g */
    public boolean m2719g() {
        return (this.f2202y & 4) != 0;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        if (this.f2173A != null) {
            return this.f2173A;
        }
        if (this.f2174B == null) {
            return null;
        }
        this.f2173A = this.f2174B.mo509a((MenuItem) this);
        return this.f2173A;
    }

    public int getAlphabeticModifiers() {
        return this.f2189l;
    }

    public char getAlphabeticShortcut() {
        return this.f2188k;
    }

    public CharSequence getContentDescription() {
        return this.f2195r;
    }

    public int getGroupId() {
        return this.f2180c;
    }

    public Drawable getIcon() {
        Drawable drawable;
        if (this.f2190m != null) {
            drawable = this.f2190m;
        } else if (this.f2191n == 0) {
            return null;
        } else {
            drawable = C0303b.m1131b(this.f2178a.m2678e(), this.f2191n);
            this.f2191n = 0;
            this.f2190m = drawable;
        }
        return m2698a(drawable);
    }

    public ColorStateList getIconTintList() {
        return this.f2197t;
    }

    public Mode getIconTintMode() {
        return this.f2198u;
    }

    public Intent getIntent() {
        return this.f2185h;
    }

    @CapturedViewProperty
    public int getItemId() {
        return this.f2179b;
    }

    public ContextMenuInfo getMenuInfo() {
        return this.f2177E;
    }

    public int getNumericModifiers() {
        return this.f2187j;
    }

    public char getNumericShortcut() {
        return this.f2186i;
    }

    public int getOrder() {
        return this.f2181d;
    }

    public SubMenu getSubMenu() {
        return this.f2192o;
    }

    @CapturedViewProperty
    public CharSequence getTitle() {
        return this.f2183f;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2184g != null ? this.f2184g : this.f2183f;
        return (VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public CharSequence getTooltipText() {
        return this.f2196s;
    }

    /* renamed from: h */
    public void m2720h() {
        this.f2178a.m2667b(this);
    }

    public boolean hasSubMenu() {
        return this.f2192o != null;
    }

    /* renamed from: i */
    public boolean m2721i() {
        return this.f2178a.m2691q();
    }

    public boolean isActionViewExpanded() {
        return this.f2176D;
    }

    public boolean isCheckable() {
        return (this.f2202y & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f2202y & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f2202y & 16) != 0;
    }

    public boolean isVisible() {
        boolean z = false;
        if (this.f2174B == null || !this.f2174B.mo511b()) {
            if ((this.f2202y & 8) == 0) {
                z = true;
            }
            return z;
        }
        if ((this.f2202y & 8) == 0 && this.f2174B.mo512c()) {
            z = true;
        }
        return z;
    }

    /* renamed from: j */
    public boolean m2722j() {
        return (this.f2202y & 32) == 32;
    }

    /* renamed from: k */
    public boolean m2723k() {
        return (this.f2203z & 1) == 1;
    }

    /* renamed from: l */
    public boolean m2724l() {
        return (this.f2203z & 2) == 2;
    }

    /* renamed from: m */
    public boolean m2725m() {
        return (this.f2203z & 4) == 4;
    }

    /* renamed from: n */
    public boolean m2726n() {
        if ((this.f2203z & 8) == 0) {
            return false;
        }
        if (this.f2173A == null && this.f2174B != null) {
            this.f2173A = this.f2174B.mo509a((MenuItem) this);
        }
        return this.f2173A != null;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public /* synthetic */ MenuItem setActionView(int i) {
        return m2699a(i);
    }

    public /* synthetic */ MenuItem setActionView(View view) {
        return m2701a(view);
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f2188k == c) {
            return this;
        }
        this.f2188k = Character.toLowerCase(c);
        this.f2178a.m2669b(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f2188k == c && this.f2189l == i) {
            return this;
        }
        this.f2188k = Character.toLowerCase(c);
        this.f2189l = KeyEvent.normalizeMetaState(i);
        this.f2178a.m2669b(false);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f2202y;
        this.f2202y = z | (this.f2202y & -2);
        if (i != this.f2202y) {
            this.f2178a.m2669b(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f2202y & 4) != 0) {
            this.f2178a.m2659a((MenuItem) this);
        } else {
            m2710b(z);
        }
        return this;
    }

    public /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        return mo198a(charSequence);
    }

    public MenuItem setEnabled(boolean z) {
        this.f2202y = z ? this.f2202y | 16 : this.f2202y & -17;
        this.f2178a.m2669b(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f2190m = null;
        this.f2191n = i;
        this.f2201x = true;
        this.f2178a.m2669b(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f2191n = 0;
        this.f2190m = drawable;
        this.f2201x = true;
        this.f2178a.m2669b(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2197t = colorStateList;
        this.f2199v = true;
        this.f2201x = true;
        this.f2178a.m2669b(false);
        return this;
    }

    public MenuItem setIconTintMode(Mode mode) {
        this.f2198u = mode;
        this.f2200w = true;
        this.f2201x = true;
        this.f2178a.m2669b(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f2185h = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f2186i == c) {
            return this;
        }
        this.f2186i = c;
        this.f2178a.m2669b(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f2186i == c && this.f2187j == i) {
            return this;
        }
        this.f2186i = c;
        this.f2187j = KeyEvent.normalizeMetaState(i);
        this.f2178a.m2669b(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        this.f2175C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f2194q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f2186i = c;
        this.f2188k = Character.toLowerCase(c2);
        this.f2178a.m2669b(false);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f2186i = c;
        this.f2187j = KeyEvent.normalizeMetaState(i);
        this.f2188k = Character.toLowerCase(c2);
        this.f2189l = KeyEvent.normalizeMetaState(i2);
        this.f2178a.m2669b(false);
        return this;
    }

    public void setShowAsAction(int i) {
        switch (i & 3) {
            case 0:
            case 1:
            case 2:
                this.f2203z = i;
                this.f2178a.m2667b(this);
                return;
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    public /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        return m2708b(i);
    }

    public MenuItem setTitle(int i) {
        return setTitle(this.f2178a.m2678e().getString(i));
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f2183f = charSequence;
        this.f2178a.m2669b(false);
        if (this.f2192o != null) {
            this.f2192o.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2184g = charSequence;
        if (charSequence == null) {
            charSequence = this.f2183f;
        }
        this.f2178a.m2669b(false);
        return this;
    }

    public /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        return mo200b(charSequence);
    }

    public MenuItem setVisible(boolean z) {
        if (m2713c(z)) {
            this.f2178a.m2656a(this);
        }
        return this;
    }

    public String toString() {
        return this.f2183f != null ? this.f2183f.toString() : null;
    }
}
