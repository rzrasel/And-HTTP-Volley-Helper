package android.support.v4.p017g;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v4.g.c */
public abstract class C0212c {
    /* renamed from: a */
    private final Context f763a;
    /* renamed from: b */
    private C0210a f764b;
    /* renamed from: c */
    private C0211b f765c;

    /* renamed from: android.support.v4.g.c$a */
    public interface C0210a {
        /* renamed from: a */
        void mo528a(boolean z);
    }

    /* renamed from: android.support.v4.g.c$b */
    public interface C0211b {
        /* renamed from: a */
        void mo230a(boolean z);
    }

    public C0212c(Context context) {
        this.f763a = context;
    }

    /* renamed from: a */
    public abstract View mo231a();

    /* renamed from: a */
    public View mo509a(MenuItem menuItem) {
        return mo231a();
    }

    /* renamed from: a */
    public void m788a(C0210a c0210a) {
        this.f764b = c0210a;
    }

    /* renamed from: a */
    public void mo510a(C0211b c0211b) {
        if (!(this.f765c == null || c0211b == null)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            stringBuilder.append(getClass().getSimpleName());
            stringBuilder.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", stringBuilder.toString());
        }
        this.f765c = c0211b;
    }

    /* renamed from: a */
    public void mo232a(SubMenu subMenu) {
    }

    /* renamed from: a */
    public void m791a(boolean z) {
        if (this.f764b != null) {
            this.f764b.mo528a(z);
        }
    }

    /* renamed from: b */
    public boolean mo511b() {
        return false;
    }

    /* renamed from: c */
    public boolean mo512c() {
        return true;
    }

    /* renamed from: d */
    public boolean mo233d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo234e() {
        return false;
    }

    /* renamed from: f */
    public void m796f() {
        this.f765c = null;
        this.f764b = null;
    }
}
