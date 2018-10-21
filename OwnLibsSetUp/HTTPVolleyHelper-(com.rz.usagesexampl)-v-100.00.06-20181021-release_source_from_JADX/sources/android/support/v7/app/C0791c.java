package android.support.v7.app;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.C0151v;
import android.support.v4.app.C0786h;
import android.support.v4.app.aa;
import android.support.v4.app.aa.C0101a;
import android.support.v7.view.C0308b;
import android.support.v7.view.C0308b.C0307a;
import android.support.v7.widget.bb;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;

/* renamed from: android.support.v7.app.c */
public class C0791c extends C0786h implements C0101a, C0289d {
    /* renamed from: m */
    private C0290e f2836m;
    /* renamed from: n */
    private int f2837n = 0;
    /* renamed from: o */
    private Resources f2838o;

    /* renamed from: a */
    private boolean m3748a(int i, KeyEvent keyEvent) {
        if (!(VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()))) {
            Window window = getWindow();
            if (!(window == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public C0308b mo146a(C0307a c0307a) {
        return null;
    }

    /* renamed from: a */
    public void m3750a(aa aaVar) {
        aaVar.m405a((Activity) this);
    }

    /* renamed from: a */
    public void mo147a(C0308b c0308b) {
    }

    /* renamed from: a */
    public boolean m3752a(Intent intent) {
        return C0151v.m549a((Activity) this, intent);
    }

    public Intent a_() {
        return C0151v.m547a(this);
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        m3760j().mo490b(view, layoutParams);
    }

    /* renamed from: b */
    public void m3753b(Intent intent) {
        C0151v.m552b((Activity) this, intent);
    }

    /* renamed from: b */
    public void m3754b(aa aaVar) {
    }

    /* renamed from: b */
    public void mo148b(C0308b c0308b) {
    }

    public void closeOptionsMenu() {
        C0287a g = mo566g();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (g == null || !g.mo162d()) {
            super.closeOptionsMenu();
        }
    }

    /* renamed from: d */
    public void mo565d() {
        m3760j().mo495f();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C0287a g = mo566g();
        return (keyCode == 82 && g != null && g.mo157a(keyEvent)) ? true : super.dispatchKeyEvent(keyEvent);
    }

    public <T extends View> T findViewById(int i) {
        return m3760j().mo480a(i);
    }

    /* renamed from: g */
    public C0287a mo566g() {
        return m3760j().mo128a();
    }

    public MenuInflater getMenuInflater() {
        return m3760j().mo130b();
    }

    public Resources getResources() {
        if (this.f2838o == null && bb.m1511a()) {
            this.f2838o = new bb(this, super.getResources());
        }
        return this.f2838o == null ? super.getResources() : this.f2838o;
    }

    /* renamed from: h */
    public boolean m3758h() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/1763344271.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = r2.a_();
        if (r0 == 0) goto L_0x0026;
    L_0x0006:
        r1 = r2.m3752a(r0);
        if (r1 == 0) goto L_0x0021;
    L_0x000c:
        r0 = android.support.v4.app.aa.m404a(r2);
        r2.m3750a(r0);
        r2.m3754b(r0);
        r0.m408a();
        android.support.v4.app.C0526a.m2084a(r2);	 Catch:{ IllegalStateException -> 0x001d }
        goto L_0x0024;
    L_0x001d:
        r2.finish();
        goto L_0x0024;
    L_0x0021:
        r2.m3753b(r0);
    L_0x0024:
        r0 = 1;
        return r0;
    L_0x0026:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.c.h():boolean");
    }

    @Deprecated
    /* renamed from: i */
    public void m3759i() {
    }

    public void invalidateOptionsMenu() {
        m3760j().mo495f();
    }

    /* renamed from: j */
    public C0290e m3760j() {
        if (this.f2836m == null) {
            this.f2836m = C0290e.m1076a((Activity) this, (C0289d) this);
        }
        return this.f2836m;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m3760j().mo482a(configuration);
        if (this.f2838o != null) {
            this.f2838o.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    public void onContentChanged() {
        m3759i();
    }

    protected void onCreate(Bundle bundle) {
        C0290e j = m3760j();
        j.mo496h();
        j.mo483a(bundle);
        if (j.mo135i() && this.f2837n != 0) {
            if (VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.f2837n, false);
            } else {
                setTheme(this.f2837n);
            }
        }
        super.onCreate(bundle);
    }

    protected void onDestroy() {
        super.onDestroy();
        m3760j().mo134g();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return m3748a(i, keyEvent) ? true : super.onKeyDown(i, keyEvent);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C0287a g = mo566g();
        return (menuItem.getItemId() != 16908332 || g == null || (g.mo151a() & 4) == 0) ? false : m3758h();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m3760j().mo489b(bundle);
    }

    protected void onPostResume() {
        super.onPostResume();
        m3760j().mo494e();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m3760j().mo132c(bundle);
    }

    protected void onStart() {
        super.onStart();
        m3760j().mo131c();
    }

    protected void onStop() {
        super.onStop();
        m3760j().mo133d();
    }

    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m3760j().mo129a(charSequence);
    }

    public void openOptionsMenu() {
        C0287a g = mo566g();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (g == null || !g.mo160c()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        m3760j().mo488b(i);
    }

    public void setContentView(View view) {
        m3760j().mo484a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        m3760j().mo485a(view, layoutParams);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        this.f2837n = i;
    }
}
