package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.p012c.p013a.C0167a;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: android.support.v7.view.menu.r */
class C0760r extends C0595c<C0167a> implements Menu {
    C0760r(Context context, C0167a c0167a) {
        super(context, c0167a);
    }

    public MenuItem add(int i) {
        return m2621a(((C0167a) this.b).add(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return m2621a(((C0167a) this.b).add(i, i2, i3, i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m2621a(((C0167a) this.b).add(i, i2, i3, charSequence));
    }

    public MenuItem add(CharSequence charSequence) {
        return m2621a(((C0167a) this.b).add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        C0760r c0760r = this;
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = ((C0167a) c0760r.b).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = m2621a(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(int i) {
        return m2622a(((C0167a) this.b).addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m2622a(((C0167a) this.b).addSubMenu(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m2622a(((C0167a) this.b).addSubMenu(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return m2622a(((C0167a) this.b).addSubMenu(charSequence));
    }

    public void clear() {
        m2623a();
        ((C0167a) this.b).clear();
    }

    public void close() {
        ((C0167a) this.b).close();
    }

    public MenuItem findItem(int i) {
        return m2621a(((C0167a) this.b).findItem(i));
    }

    public MenuItem getItem(int i) {
        return m2621a(((C0167a) this.b).getItem(i));
    }

    public boolean hasVisibleItems() {
        return ((C0167a) this.b).hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((C0167a) this.b).isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return ((C0167a) this.b).performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((C0167a) this.b).performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        m2624a(i);
        ((C0167a) this.b).removeGroup(i);
    }

    public void removeItem(int i) {
        m2625b(i);
        ((C0167a) this.b).removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((C0167a) this.b).setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        ((C0167a) this.b).setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        ((C0167a) this.b).setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        ((C0167a) this.b).setQwertyMode(z);
    }

    public int size() {
        return ((C0167a) this.b).size();
    }
}
