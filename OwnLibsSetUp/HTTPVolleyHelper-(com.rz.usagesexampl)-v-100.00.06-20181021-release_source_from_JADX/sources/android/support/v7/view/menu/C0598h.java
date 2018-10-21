package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.p008a.C0096a;
import android.support.v4.p012c.p013a.C0167a;
import android.support.v7.p020a.C0270a.C0261b;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: android.support.v7.view.menu.h */
public class C0598h implements C0167a {
    /* renamed from: d */
    private static final int[] f2138d = new int[]{1, 4, 5, 3, 2, 0};
    /* renamed from: a */
    CharSequence f2139a;
    /* renamed from: b */
    Drawable f2140b;
    /* renamed from: c */
    View f2141c;
    /* renamed from: e */
    private final Context f2142e;
    /* renamed from: f */
    private final Resources f2143f;
    /* renamed from: g */
    private boolean f2144g;
    /* renamed from: h */
    private boolean f2145h;
    /* renamed from: i */
    private C0325a f2146i;
    /* renamed from: j */
    private ArrayList<C0601j> f2147j;
    /* renamed from: k */
    private ArrayList<C0601j> f2148k;
    /* renamed from: l */
    private boolean f2149l;
    /* renamed from: m */
    private ArrayList<C0601j> f2150m;
    /* renamed from: n */
    private ArrayList<C0601j> f2151n;
    /* renamed from: o */
    private boolean f2152o;
    /* renamed from: p */
    private int f2153p = 0;
    /* renamed from: q */
    private ContextMenuInfo f2154q;
    /* renamed from: r */
    private boolean f2155r = false;
    /* renamed from: s */
    private boolean f2156s = false;
    /* renamed from: t */
    private boolean f2157t = false;
    /* renamed from: u */
    private boolean f2158u = false;
    /* renamed from: v */
    private boolean f2159v = false;
    /* renamed from: w */
    private ArrayList<C0601j> f2160w = new ArrayList();
    /* renamed from: x */
    private CopyOnWriteArrayList<WeakReference<C0330o>> f2161x = new CopyOnWriteArrayList();
    /* renamed from: y */
    private C0601j f2162y;
    /* renamed from: z */
    private boolean f2163z;

    /* renamed from: android.support.v7.view.menu.h$a */
    public interface C0325a {
        /* renamed from: a */
        void mo149a(C0598h c0598h);

        /* renamed from: a */
        boolean mo150a(C0598h c0598h, MenuItem menuItem);
    }

    /* renamed from: android.support.v7.view.menu.h$b */
    public interface C0326b {
        /* renamed from: a */
        boolean mo193a(C0601j c0601j);
    }

    public C0598h(Context context) {
        this.f2142e = context;
        this.f2143f = context.getResources();
        this.f2147j = new ArrayList();
        this.f2148k = new ArrayList();
        this.f2149l = true;
        this.f2150m = new ArrayList();
        this.f2151n = new ArrayList();
        this.f2152o = true;
        m2644e(true);
    }

    /* renamed from: a */
    private static int m2638a(ArrayList<C0601j> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C0601j) arrayList.get(size)).m2712c() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* renamed from: a */
    private C0601j m2639a(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C0601j(this, i, i2, i3, i4, charSequence, i5);
    }

    /* renamed from: a */
    private void m2640a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources d = m2675d();
        if (view != null) {
            this.f2141c = view;
            this.f2139a = null;
            this.f2140b = null;
        } else {
            if (i > 0) {
                this.f2139a = d.getText(i);
            } else if (charSequence != null) {
                this.f2139a = charSequence;
            }
            if (i2 > 0) {
                this.f2140b = C0096a.m385a(m2678e(), i2);
            } else if (drawable != null) {
                this.f2140b = drawable;
            }
            this.f2141c = null;
        }
        m2669b(false);
    }

    /* renamed from: a */
    private void m2641a(int i, boolean z) {
        if (i < 0) {
            return;
        }
        if (i < this.f2147j.size()) {
            this.f2147j.remove(i);
            if (z) {
                m2669b(true);
            }
        }
    }

    /* renamed from: a */
    private boolean m2642a(C0762u c0762u, C0330o c0330o) {
        boolean z = false;
        if (this.f2161x.isEmpty()) {
            return false;
        }
        if (c0330o != null) {
            z = c0330o.mo224a(c0762u);
        }
        Iterator it = this.f2161x.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0330o c0330o2 = (C0330o) weakReference.get();
            if (c0330o2 == null) {
                this.f2161x.remove(weakReference);
            } else if (!z) {
                z = c0330o2.mo224a(c0762u);
            }
        }
        return z;
    }

    /* renamed from: d */
    private void m2643d(boolean z) {
        if (!this.f2161x.isEmpty()) {
            m2681g();
            Iterator it = this.f2161x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0330o c0330o = (C0330o) weakReference.get();
                if (c0330o == null) {
                    this.f2161x.remove(weakReference);
                } else {
                    c0330o.mo225b(z);
                }
            }
            m2682h();
        }
    }

    /* renamed from: e */
    private void m2644e(boolean z) {
        boolean z2 = true;
        if (!z || this.f2143f.getConfiguration().keyboard == 1 || !this.f2143f.getBoolean(C0261b.abc_config_showMenuShortcutsWhenKeyboardPresent)) {
            z2 = false;
        }
        this.f2145h = z2;
    }

    /* renamed from: f */
    private static int m2645f(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 < 0 || i2 >= f2138d.length) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        return (i & 65535) | (f2138d[i2] << 16);
    }

    /* renamed from: a */
    public int m2646a(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (((C0601j) this.f2147j.get(i2)).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: a */
    public C0598h m2647a(int i) {
        this.f2153p = i;
        return this;
    }

    /* renamed from: a */
    protected C0598h m2648a(Drawable drawable) {
        m2640a(0, null, 0, drawable, null);
        return this;
    }

    /* renamed from: a */
    protected C0598h m2649a(View view) {
        m2640a(0, null, 0, null, view);
        return this;
    }

    /* renamed from: a */
    protected C0598h m2650a(CharSequence charSequence) {
        m2640a(0, charSequence, 0, null, null);
        return this;
    }

    /* renamed from: a */
    C0601j m2651a(int i, KeyEvent keyEvent) {
        List list = this.f2160w;
        list.clear();
        m2660a(list, i, keyEvent);
        if (list.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyData keyData = new KeyData();
        keyEvent.getKeyData(keyData);
        int size = list.size();
        if (size == 1) {
            return (C0601j) list.get(0);
        }
        boolean b = mo516b();
        for (int i2 = 0; i2 < size; i2++) {
            C0601j c0601j = (C0601j) list.get(i2);
            char alphabeticShortcut = b ? c0601j.getAlphabeticShortcut() : c0601j.getNumericShortcut();
            if ((alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) || (b && alphabeticShortcut == '\b' && i == 67))) {
                return c0601j;
            }
        }
        return null;
    }

    /* renamed from: a */
    protected MenuItem m2652a(int i, int i2, int i3, CharSequence charSequence) {
        int f = C0598h.m2645f(i3);
        MenuItem a = m2639a(i, i2, i3, f, charSequence, this.f2153p);
        if (this.f2154q != null) {
            a.m2706a(this.f2154q);
        }
        this.f2147j.add(C0598h.m2638a(this.f2147j, f), a);
        m2669b(true);
        return a;
    }

    /* renamed from: a */
    protected String mo513a() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: a */
    public void m2654a(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C0762u) item.getSubMenu()).m2654a(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo513a(), sparseArray);
        }
    }

    /* renamed from: a */
    public void mo514a(C0325a c0325a) {
        this.f2146i = c0325a;
    }

    /* renamed from: a */
    void m2656a(C0601j c0601j) {
        this.f2149l = true;
        m2669b(true);
    }

    /* renamed from: a */
    public void m2657a(C0330o c0330o) {
        m2658a(c0330o, this.f2142e);
    }

    /* renamed from: a */
    public void m2658a(C0330o c0330o, Context context) {
        this.f2161x.add(new WeakReference(c0330o));
        c0330o.mo220a(context, this);
        this.f2152o = true;
    }

    /* renamed from: a */
    void m2659a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f2147j.size();
        m2681g();
        for (int i = 0; i < size; i++) {
            MenuItem menuItem2 = (C0601j) this.f2147j.get(i);
            if (menuItem2.getGroupId() == groupId) {
                if (menuItem2.m2719g()) {
                    if (menuItem2.isCheckable()) {
                        menuItem2.m2710b(menuItem2 == menuItem);
                    }
                }
            }
        }
        m2682h();
    }

    /* renamed from: a */
    void m2660a(List<C0601j> list, int i, KeyEvent keyEvent) {
        boolean b = mo516b();
        int modifiers = keyEvent.getModifiers();
        KeyData keyData = new KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f2147j.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0601j c0601j = (C0601j) this.f2147j.get(i2);
                if (c0601j.hasSubMenu()) {
                    ((C0598h) c0601j.getSubMenu()).m2660a((List) list, i, keyEvent);
                }
                char alphabeticShortcut = b ? c0601j.getAlphabeticShortcut() : c0601j.getNumericShortcut();
                if (!(((modifiers & 69647) == ((b ? c0601j.getAlphabeticModifiers() : c0601j.getNumericModifiers()) & 69647) ? 1 : null) == null || alphabeticShortcut == '\u0000' || ((alphabeticShortcut != keyData.meta[0] && alphabeticShortcut != keyData.meta[2] && (!b || alphabeticShortcut != '\b' || i != 67)) || !c0601j.isEnabled()))) {
                    list.add(c0601j);
                }
            }
        }
    }

    /* renamed from: a */
    public final void m2661a(boolean z) {
        if (!this.f2159v) {
            this.f2159v = true;
            Iterator it = this.f2161x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0330o c0330o = (C0330o) weakReference.get();
                if (c0330o == null) {
                    this.f2161x.remove(weakReference);
                } else {
                    c0330o.mo221a(this, z);
                }
            }
            this.f2159v = false;
        }
    }

    /* renamed from: a */
    boolean mo515a(C0598h c0598h, MenuItem menuItem) {
        return this.f2146i != null && this.f2146i.mo150a(c0598h, menuItem);
    }

    /* renamed from: a */
    public boolean m2663a(MenuItem menuItem, int i) {
        return m2664a(menuItem, null, i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public boolean m2664a(android.view.MenuItem r7, android.support.v7.view.menu.C0330o r8, int r9) {
        /*
        r6 = this;
        r7 = (android.support.v7.view.menu.C0601j) r7;
        r0 = 0;
        if (r7 == 0) goto L_0x006c;
    L_0x0005:
        r1 = r7.isEnabled();
        if (r1 != 0) goto L_0x000c;
    L_0x000b:
        goto L_0x006c;
    L_0x000c:
        r1 = r7.m2711b();
        r2 = r7.mo199a();
        r3 = 1;
        if (r2 == 0) goto L_0x001f;
    L_0x0017:
        r4 = r2.mo234e();
        if (r4 == 0) goto L_0x001f;
    L_0x001d:
        r4 = 1;
        goto L_0x0020;
    L_0x001f:
        r4 = 0;
    L_0x0020:
        r5 = r7.m2726n();
        if (r5 == 0) goto L_0x0031;
    L_0x0026:
        r7 = r7.expandActionView();
        r1 = r1 | r7;
        if (r1 == 0) goto L_0x006b;
    L_0x002d:
        r6.m2661a(r3);
        goto L_0x006b;
    L_0x0031:
        r5 = r7.hasSubMenu();
        if (r5 != 0) goto L_0x003f;
    L_0x0037:
        if (r4 == 0) goto L_0x003a;
    L_0x0039:
        goto L_0x003f;
    L_0x003a:
        r7 = r9 & 1;
        if (r7 != 0) goto L_0x006b;
    L_0x003e:
        goto L_0x002d;
    L_0x003f:
        r9 = r9 & 4;
        if (r9 != 0) goto L_0x0046;
    L_0x0043:
        r6.m2661a(r0);
    L_0x0046:
        r9 = r7.hasSubMenu();
        if (r9 != 0) goto L_0x0058;
    L_0x004c:
        r9 = new android.support.v7.view.menu.u;
        r0 = r6.m2678e();
        r9.<init>(r0, r6, r7);
        r7.m2705a(r9);
    L_0x0058:
        r7 = r7.getSubMenu();
        r7 = (android.support.v7.view.menu.C0762u) r7;
        if (r4 == 0) goto L_0x0063;
    L_0x0060:
        r2.mo232a(r7);
    L_0x0063:
        r7 = r6.m2642a(r7, r8);
        r1 = r1 | r7;
        if (r1 != 0) goto L_0x006b;
    L_0x006a:
        goto L_0x002d;
    L_0x006b:
        return r1;
    L_0x006c:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.menu.h.a(android.view.MenuItem, android.support.v7.view.menu.o, int):boolean");
    }

    public MenuItem add(int i) {
        return m2652a(0, 0, 0, this.f2143f.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return m2652a(i, i2, i3, this.f2143f.getString(i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m2652a(i, i2, i3, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return m2652a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.f2142e.getPackageManager();
        int i5 = 0;
        List queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        while (i5 < size) {
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
            i5++;
        }
        return size;
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f2143f.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f2143f.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0601j c0601j = (C0601j) m2652a(i, i2, i3, charSequence);
        C0762u c0762u = new C0762u(this.f2142e, this, c0601j);
        c0601j.m2705a(c0762u);
        return c0762u;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public int m2665b(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C0601j) this.f2147j.get(i2)).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public void m2666b(Bundle bundle) {
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo513a());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0762u) item.getSubMenu()).m2666b(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0) {
                MenuItem findItem = findItem(i2);
                if (findItem != null) {
                    findItem.expandActionView();
                }
            }
        }
    }

    /* renamed from: b */
    void m2667b(C0601j c0601j) {
        this.f2152o = true;
        m2669b(true);
    }

    /* renamed from: b */
    public void m2668b(C0330o c0330o) {
        Iterator it = this.f2161x.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0330o c0330o2 = (C0330o) weakReference.get();
            if (c0330o2 == null || c0330o2 == c0330o) {
                this.f2161x.remove(weakReference);
            }
        }
    }

    /* renamed from: b */
    public void m2669b(boolean z) {
        if (this.f2155r) {
            this.f2156s = true;
            if (z) {
                this.f2157t = true;
                return;
            }
            return;
        }
        if (z) {
            this.f2149l = true;
            this.f2152o = true;
        }
        m2643d(z);
    }

    /* renamed from: b */
    boolean mo516b() {
        return this.f2144g;
    }

    /* renamed from: c */
    public int m2671c(int i) {
        return m2646a(i, 0);
    }

    /* renamed from: c */
    public void m2672c(boolean z) {
        this.f2163z = z;
    }

    /* renamed from: c */
    public boolean mo517c() {
        return this.f2145h;
    }

    /* renamed from: c */
    public boolean mo518c(C0601j c0601j) {
        boolean z = false;
        if (this.f2161x.isEmpty()) {
            return false;
        }
        m2681g();
        Iterator it = this.f2161x.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0330o c0330o = (C0330o) weakReference.get();
            if (c0330o == null) {
                this.f2161x.remove(weakReference);
            } else {
                z = c0330o.mo223a(this, c0601j);
                if (z) {
                    break;
                }
            }
        }
        m2682h();
        if (z) {
            this.f2162y = c0601j;
        }
        return z;
    }

    public void clear() {
        if (this.f2162y != null) {
            mo519d(this.f2162y);
        }
        this.f2147j.clear();
        m2669b(true);
    }

    public void clearHeader() {
        this.f2140b = null;
        this.f2139a = null;
        this.f2141c = null;
        m2669b(false);
    }

    public void close() {
        m2661a(true);
    }

    /* renamed from: d */
    Resources m2675d() {
        return this.f2143f;
    }

    /* renamed from: d */
    protected C0598h m2676d(int i) {
        m2640a(i, null, 0, null, null);
        return this;
    }

    /* renamed from: d */
    public boolean mo519d(C0601j c0601j) {
        boolean z = false;
        if (!this.f2161x.isEmpty()) {
            if (this.f2162y == c0601j) {
                m2681g();
                Iterator it = this.f2161x.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    C0330o c0330o = (C0330o) weakReference.get();
                    if (c0330o == null) {
                        this.f2161x.remove(weakReference);
                    } else {
                        z = c0330o.mo227b(this, c0601j);
                        if (z) {
                            break;
                        }
                    }
                }
                m2682h();
                if (z) {
                    this.f2162y = null;
                }
            }
        }
        return z;
    }

    /* renamed from: e */
    public Context m2678e() {
        return this.f2142e;
    }

    /* renamed from: e */
    protected C0598h m2679e(int i) {
        m2640a(0, null, i, null, null);
        return this;
    }

    /* renamed from: f */
    public void m2680f() {
        if (this.f2146i != null) {
            this.f2146i.mo149a(this);
        }
    }

    public MenuItem findItem(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0601j c0601j = (C0601j) this.f2147j.get(i2);
            if (c0601j.getItemId() == i) {
                return c0601j;
            }
            if (c0601j.hasSubMenu()) {
                MenuItem findItem = c0601j.getSubMenu().findItem(i);
                if (findItem != null) {
                    return findItem;
                }
            }
        }
        return null;
    }

    /* renamed from: g */
    public void m2681g() {
        if (!this.f2155r) {
            this.f2155r = true;
            this.f2156s = false;
            this.f2157t = false;
        }
    }

    public MenuItem getItem(int i) {
        return (MenuItem) this.f2147j.get(i);
    }

    /* renamed from: h */
    public void m2682h() {
        this.f2155r = false;
        if (this.f2156s) {
            this.f2156s = false;
            m2669b(this.f2157t);
        }
    }

    public boolean hasVisibleItems() {
        if (this.f2163z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((C0601j) this.f2147j.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public ArrayList<C0601j> m2683i() {
        if (!this.f2149l) {
            return this.f2148k;
        }
        this.f2148k.clear();
        int size = this.f2147j.size();
        for (int i = 0; i < size; i++) {
            C0601j c0601j = (C0601j) this.f2147j.get(i);
            if (c0601j.isVisible()) {
                this.f2148k.add(c0601j);
            }
        }
        this.f2149l = false;
        this.f2152o = true;
        return this.f2148k;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m2651a(i, keyEvent) != null;
    }

    /* renamed from: j */
    public void m2684j() {
        ArrayList i = m2683i();
        if (this.f2152o) {
            Iterator it = this.f2161x.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0330o c0330o = (C0330o) weakReference.get();
                if (c0330o == null) {
                    this.f2161x.remove(weakReference);
                } else {
                    i2 |= c0330o.mo226b();
                }
            }
            if (i2 != 0) {
                this.f2150m.clear();
                this.f2151n.clear();
                int size = i.size();
                for (i2 = 0; i2 < size; i2++) {
                    C0601j c0601j = (C0601j) i.get(i2);
                    (c0601j.m2722j() ? this.f2150m : this.f2151n).add(c0601j);
                }
            } else {
                this.f2150m.clear();
                this.f2151n.clear();
                this.f2151n.addAll(m2683i());
            }
            this.f2152o = false;
        }
    }

    /* renamed from: k */
    public ArrayList<C0601j> m2685k() {
        m2684j();
        return this.f2150m;
    }

    /* renamed from: l */
    public ArrayList<C0601j> m2686l() {
        m2684j();
        return this.f2151n;
    }

    /* renamed from: m */
    public CharSequence m2687m() {
        return this.f2139a;
    }

    /* renamed from: n */
    public Drawable m2688n() {
        return this.f2140b;
    }

    /* renamed from: o */
    public View m2689o() {
        return this.f2141c;
    }

    /* renamed from: p */
    public C0598h mo520p() {
        return this;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return m2663a(findItem(i), i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        MenuItem a = m2651a(i, keyEvent);
        boolean a2 = a != null ? m2663a(a, i2) : false;
        if ((i2 & 2) != 0) {
            m2661a(true);
        }
        return a2;
    }

    /* renamed from: q */
    boolean m2691q() {
        return this.f2158u;
    }

    /* renamed from: r */
    public C0601j m2692r() {
        return this.f2162y;
    }

    public void removeGroup(int i) {
        int c = m2671c(i);
        if (c >= 0) {
            int size = this.f2147j.size() - c;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || ((C0601j) this.f2147j.get(c)).getGroupId() != i) {
                    m2669b(true);
                } else {
                    m2641a(c, false);
                    i2 = i3;
                }
            }
            m2669b(true);
        }
    }

    public void removeItem(int i) {
        m2641a(m2665b(i), true);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f2147j.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0601j c0601j = (C0601j) this.f2147j.get(i2);
            if (c0601j.getGroupId() == i) {
                c0601j.m2707a(z2);
                c0601j.setCheckable(z);
            }
        }
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f2147j.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0601j c0601j = (C0601j) this.f2147j.get(i2);
            if (c0601j.getGroupId() == i) {
                c0601j.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f2147j.size();
        Object obj = null;
        for (int i2 = 0; i2 < size; i2++) {
            C0601j c0601j = (C0601j) this.f2147j.get(i2);
            if (c0601j.getGroupId() == i && c0601j.m2713c(z)) {
                obj = 1;
            }
        }
        if (obj != null) {
            m2669b(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f2144g = z;
        m2669b(false);
    }

    public int size() {
        return this.f2147j.size();
    }
}
