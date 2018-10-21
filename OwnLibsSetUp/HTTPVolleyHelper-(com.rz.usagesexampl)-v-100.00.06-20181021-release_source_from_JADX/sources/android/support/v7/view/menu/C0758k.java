package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.p012c.p013a.C0168b;
import android.support.v4.p017g.C0212c;
import android.support.v7.view.C0309c;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.view.menu.k */
public class C0758k extends C0595c<C0168b> implements MenuItem {
    /* renamed from: c */
    private Method f2730c;

    /* renamed from: android.support.v7.view.menu.k$a */
    class C0602a extends C0212c {
        /* renamed from: a */
        final ActionProvider f2204a;
        /* renamed from: b */
        final /* synthetic */ C0758k f2205b;

        public C0602a(C0758k c0758k, Context context, ActionProvider actionProvider) {
            this.f2205b = c0758k;
            super(context);
            this.f2204a = actionProvider;
        }

        /* renamed from: a */
        public View mo231a() {
            return this.f2204a.onCreateActionView();
        }

        /* renamed from: a */
        public void mo232a(SubMenu subMenu) {
            this.f2204a.onPrepareSubMenu(this.f2205b.m2622a(subMenu));
        }

        /* renamed from: d */
        public boolean mo233d() {
            return this.f2204a.onPerformDefaultAction();
        }

        /* renamed from: e */
        public boolean mo234e() {
            return this.f2204a.hasSubMenu();
        }
    }

    /* renamed from: android.support.v7.view.menu.k$b */
    static class C0603b extends FrameLayout implements C0309c {
        /* renamed from: a */
        final CollapsibleActionView f2206a;

        C0603b(View view) {
            super(view.getContext());
            this.f2206a = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        public void mo235a() {
            this.f2206a.onActionViewExpanded();
        }

        /* renamed from: b */
        public void mo236b() {
            this.f2206a.onActionViewCollapsed();
        }

        /* renamed from: c */
        View m2733c() {
            return (View) this.f2206a;
        }
    }

    /* renamed from: android.support.v7.view.menu.k$c */
    private class C0604c extends C0318d<OnActionExpandListener> implements OnActionExpandListener {
        /* renamed from: a */
        final /* synthetic */ C0758k f2207a;

        C0604c(C0758k c0758k, OnActionExpandListener onActionExpandListener) {
            this.f2207a = c0758k;
            super(onActionExpandListener);
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return ((OnActionExpandListener) this.b).onMenuItemActionCollapse(this.f2207a.m2621a(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return ((OnActionExpandListener) this.b).onMenuItemActionExpand(this.f2207a.m2621a(menuItem));
        }
    }

    /* renamed from: android.support.v7.view.menu.k$d */
    private class C0605d extends C0318d<OnMenuItemClickListener> implements OnMenuItemClickListener {
        /* renamed from: a */
        final /* synthetic */ C0758k f2208a;

        C0605d(C0758k c0758k, OnMenuItemClickListener onMenuItemClickListener) {
            this.f2208a = c0758k;
            super(onMenuItemClickListener);
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return ((OnMenuItemClickListener) this.b).onMenuItemClick(this.f2208a.m2621a(menuItem));
        }
    }

    C0758k(Context context, C0168b c0168b) {
        super(context, c0168b);
    }

    /* renamed from: a */
    C0602a mo548a(ActionProvider actionProvider) {
        return new C0602a(this, this.a, actionProvider);
    }

    /* renamed from: a */
    public void m3570a(boolean z) {
        try {
            if (this.f2730c == null) {
                this.f2730c = ((C0168b) this.b).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f2730c.invoke(this.b, new Object[]{Boolean.valueOf(z)});
        } catch (Throwable e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    public boolean collapseActionView() {
        return ((C0168b) this.b).collapseActionView();
    }

    public boolean expandActionView() {
        return ((C0168b) this.b).expandActionView();
    }

    public ActionProvider getActionProvider() {
        C0212c a = ((C0168b) this.b).mo199a();
        return a instanceof C0602a ? ((C0602a) a).f2204a : null;
    }

    public View getActionView() {
        View actionView = ((C0168b) this.b).getActionView();
        return actionView instanceof C0603b ? ((C0603b) actionView).m2733c() : actionView;
    }

    public int getAlphabeticModifiers() {
        return ((C0168b) this.b).getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return ((C0168b) this.b).getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return ((C0168b) this.b).getContentDescription();
    }

    public int getGroupId() {
        return ((C0168b) this.b).getGroupId();
    }

    public Drawable getIcon() {
        return ((C0168b) this.b).getIcon();
    }

    public ColorStateList getIconTintList() {
        return ((C0168b) this.b).getIconTintList();
    }

    public Mode getIconTintMode() {
        return ((C0168b) this.b).getIconTintMode();
    }

    public Intent getIntent() {
        return ((C0168b) this.b).getIntent();
    }

    public int getItemId() {
        return ((C0168b) this.b).getItemId();
    }

    public ContextMenuInfo getMenuInfo() {
        return ((C0168b) this.b).getMenuInfo();
    }

    public int getNumericModifiers() {
        return ((C0168b) this.b).getNumericModifiers();
    }

    public char getNumericShortcut() {
        return ((C0168b) this.b).getNumericShortcut();
    }

    public int getOrder() {
        return ((C0168b) this.b).getOrder();
    }

    public SubMenu getSubMenu() {
        return m2622a(((C0168b) this.b).getSubMenu());
    }

    public CharSequence getTitle() {
        return ((C0168b) this.b).getTitle();
    }

    public CharSequence getTitleCondensed() {
        return ((C0168b) this.b).getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return ((C0168b) this.b).getTooltipText();
    }

    public boolean hasSubMenu() {
        return ((C0168b) this.b).hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return ((C0168b) this.b).isActionViewExpanded();
    }

    public boolean isCheckable() {
        return ((C0168b) this.b).isCheckable();
    }

    public boolean isChecked() {
        return ((C0168b) this.b).isChecked();
    }

    public boolean isEnabled() {
        return ((C0168b) this.b).isEnabled();
    }

    public boolean isVisible() {
        return ((C0168b) this.b).isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((C0168b) this.b).mo197a(actionProvider != null ? mo548a(actionProvider) : null);
        return this;
    }

    public MenuItem setActionView(int i) {
        ((C0168b) this.b).setActionView(i);
        View actionView = ((C0168b) this.b).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((C0168b) this.b).setActionView(new C0603b(actionView));
        }
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0603b(view);
        }
        ((C0168b) this.b).setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        ((C0168b) this.b).setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        ((C0168b) this.b).setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        ((C0168b) this.b).setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        ((C0168b) this.b).setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        ((C0168b) this.b).mo198a(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        ((C0168b) this.b).setEnabled(z);
        return this;
    }

    public MenuItem setIcon(int i) {
        ((C0168b) this.b).setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        ((C0168b) this.b).setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((C0168b) this.b).setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(Mode mode) {
        ((C0168b) this.b).setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        ((C0168b) this.b).setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        ((C0168b) this.b).setNumericShortcut(c);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        ((C0168b) this.b).setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        ((C0168b) this.b).setOnActionExpandListener(onActionExpandListener != null ? new C0604c(this, onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        ((C0168b) this.b).setOnMenuItemClickListener(onMenuItemClickListener != null ? new C0605d(this, onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        ((C0168b) this.b).setShortcut(c, c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        ((C0168b) this.b).setShortcut(c, c2, i, i2);
        return this;
    }

    public void setShowAsAction(int i) {
        ((C0168b) this.b).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        ((C0168b) this.b).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        ((C0168b) this.b).setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        ((C0168b) this.b).setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((C0168b) this.b).setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        ((C0168b) this.b).mo200b(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return ((C0168b) this.b).setVisible(z);
    }
}
