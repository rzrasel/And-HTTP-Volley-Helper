package android.support.v7.app;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.C0575f.C0574a;
import android.support.v7.view.C0308b;
import android.support.v7.view.C0308b.C0307a;
import android.support.v7.view.C0311f.C0591a;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import android.view.Window;
import android.view.Window.Callback;

/* renamed from: android.support.v7.app.h */
class C0782h extends C0753j {
    /* renamed from: t */
    private int f2803t = -100;
    /* renamed from: u */
    private boolean f2804u;
    /* renamed from: v */
    private boolean f2805v = true;
    /* renamed from: w */
    private C0293b f2806w;

    /* renamed from: android.support.v7.app.h$b */
    final class C0293b {
        /* renamed from: a */
        final /* synthetic */ C0782h f970a;
        /* renamed from: b */
        private C0300o f971b;
        /* renamed from: c */
        private boolean f972c;
        /* renamed from: d */
        private BroadcastReceiver f973d;
        /* renamed from: e */
        private IntentFilter f974e;

        /* renamed from: android.support.v7.app.h$b$1 */
        class C02921 extends BroadcastReceiver {
            /* renamed from: a */
            final /* synthetic */ C0293b f969a;

            C02921(C0293b c0293b) {
                this.f969a = c0293b;
            }

            public void onReceive(Context context, Intent intent) {
                this.f969a.m1103b();
            }
        }

        C0293b(C0782h c0782h, C0300o c0300o) {
            this.f970a = c0782h;
            this.f971b = c0300o;
            this.f972c = c0300o.m1122a();
        }

        /* renamed from: a */
        final int m1102a() {
            this.f972c = this.f971b.m1122a();
            return this.f972c ? 2 : 1;
        }

        /* renamed from: b */
        final void m1103b() {
            boolean a = this.f971b.m1122a();
            if (a != this.f972c) {
                this.f972c = a;
                this.f970a.mo135i();
            }
        }

        /* renamed from: c */
        final void m1104c() {
            m1105d();
            if (this.f973d == null) {
                this.f973d = new C02921(this);
            }
            if (this.f974e == null) {
                this.f974e = new IntentFilter();
                this.f974e.addAction("android.intent.action.TIME_SET");
                this.f974e.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.f974e.addAction("android.intent.action.TIME_TICK");
            }
            this.f970a.a.registerReceiver(this.f973d, this.f974e);
        }

        /* renamed from: d */
        final void m1105d() {
            if (this.f973d != null) {
                this.f970a.a.unregisterReceiver(this.f973d);
                this.f973d = null;
            }
        }
    }

    /* renamed from: android.support.v7.app.h$a */
    class C0749a extends C0574a {
        /* renamed from: c */
        final /* synthetic */ C0782h f2658c;

        C0749a(C0782h c0782h, Callback callback) {
            this.f2658c = c0782h;
            super(c0782h, callback);
        }

        /* renamed from: a */
        final ActionMode m3466a(ActionMode.Callback callback) {
            Object c0591a = new C0591a(this.f2658c.a, callback);
            C0308b b = this.f2658c.m3505b((C0307a) c0591a);
            return b != null ? c0591a.m2584b(b) : null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return this.f2658c.mo546o() ? m3466a(callback) : super.onWindowStartingActionMode(callback);
        }
    }

    C0782h(Context context, Window window, C0289d c0289d) {
        super(context, window, c0289d);
    }

    /* renamed from: h */
    private boolean m3693h(int i) {
        Resources resources = this.a.getResources();
        Configuration configuration = resources.getConfiguration();
        int i2 = configuration.uiMode & 48;
        i = i == 2 ? 32 : 16;
        if (i2 == i) {
            return false;
        }
        if (m3696y()) {
            ((Activity) this.a).recreate();
        } else {
            Configuration configuration2 = new Configuration(configuration);
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            configuration2.uiMode = i | (configuration2.uiMode & -49);
            resources.updateConfiguration(configuration2, displayMetrics);
            if (VERSION.SDK_INT < 26) {
                C0297l.m1110a(resources);
            }
        }
        return true;
    }

    /* renamed from: w */
    private int m3694w() {
        return this.f2803t != -100 ? this.f2803t : C0290e.m1079j();
    }

    /* renamed from: x */
    private void m3695x() {
        if (this.f2806w == null) {
            this.f2806w = new C0293b(this, C0300o.m1118a(this.a));
        }
    }

    /* renamed from: y */
    private boolean m3696y() {
        boolean z = false;
        if (!this.f2804u || !(this.a instanceof Activity)) {
            return false;
        }
        try {
            if ((this.a.getPackageManager().getActivityInfo(new ComponentName(this.a, this.a.getClass()), 0).configChanges & 512) == 0) {
                z = true;
            }
            return z;
        } catch (Throwable e) {
            Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
            return true;
        }
    }

    /* renamed from: a */
    View mo543a(View view, String str, Context context, AttributeSet attributeSet) {
        return null;
    }

    /* renamed from: a */
    Callback mo544a(Callback callback) {
        return new C0749a(this, callback);
    }

    /* renamed from: a */
    public void mo483a(Bundle bundle) {
        super.mo483a(bundle);
        if (bundle != null && this.f2803t == -100) {
            this.f2803t = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    /* renamed from: c */
    public void mo131c() {
        super.mo131c();
        mo135i();
    }

    /* renamed from: c */
    public void mo132c(Bundle bundle) {
        super.mo132c(bundle);
        if (this.f2803t != -100) {
            bundle.putInt("appcompat:local_night_mode", this.f2803t);
        }
    }

    /* renamed from: d */
    int mo545d(int i) {
        if (i == -100) {
            return -1;
        }
        if (i != 0) {
            return i;
        }
        m3695x();
        return this.f2806w.m1102a();
    }

    /* renamed from: d */
    public void mo133d() {
        super.mo133d();
        if (this.f2806w != null) {
            this.f2806w.m1105d();
        }
    }

    /* renamed from: g */
    public void mo134g() {
        super.mo134g();
        if (this.f2806w != null) {
            this.f2806w.m1105d();
        }
    }

    /* renamed from: i */
    public boolean mo135i() {
        int w = m3694w();
        int d = mo545d(w);
        boolean h = d != -1 ? m3693h(d) : false;
        if (w == 0) {
            m3695x();
            this.f2806w.m1104c();
        }
        this.f2804u = true;
        return h;
    }

    /* renamed from: o */
    public boolean mo546o() {
        return this.f2805v;
    }
}
