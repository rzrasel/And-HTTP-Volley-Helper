package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v4.p017g.C0227p;
import android.support.v7.app.C0287a.C0285b;
import android.support.v7.p020a.C0270a.C0269j;
import android.support.v7.view.menu.C0330o.C0329a;
import android.support.v7.view.menu.C0598h;
import android.support.v7.view.menu.C0598h.C0325a;
import android.support.v7.widget.ae;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window.Callback;
import java.util.ArrayList;

/* renamed from: android.support.v7.app.m */
class C0586m extends C0287a {
    /* renamed from: a */
    ae f2017a;
    /* renamed from: b */
    Callback f2018b;
    /* renamed from: c */
    private boolean f2019c;
    /* renamed from: d */
    private boolean f2020d;
    /* renamed from: e */
    private ArrayList<C0285b> f2021e;
    /* renamed from: f */
    private final Runnable f2022f;

    /* renamed from: android.support.v7.app.m$a */
    private final class C0584a implements C0329a {
        /* renamed from: a */
        final /* synthetic */ C0586m f2014a;
        /* renamed from: b */
        private boolean f2015b;

        C0584a(C0586m c0586m) {
            this.f2014a = c0586m;
        }

        /* renamed from: a */
        public void mo140a(C0598h c0598h, boolean z) {
            if (!this.f2015b) {
                this.f2015b = true;
                this.f2014a.f2017a.mo326n();
                if (this.f2014a.f2018b != null) {
                    this.f2014a.f2018b.onPanelClosed(C0269j.AppCompatTheme_tooltipFrameBackground, c0598h);
                }
                this.f2015b = false;
            }
        }

        /* renamed from: a */
        public boolean mo141a(C0598h c0598h) {
            if (this.f2014a.f2018b == null) {
                return false;
            }
            this.f2014a.f2018b.onMenuOpened(C0269j.AppCompatTheme_tooltipFrameBackground, c0598h);
            return true;
        }
    }

    /* renamed from: android.support.v7.app.m$b */
    private final class C0585b implements C0325a {
        /* renamed from: a */
        final /* synthetic */ C0586m f2016a;

        C0585b(C0586m c0586m) {
            this.f2016a = c0586m;
        }

        /* renamed from: a */
        public void mo149a(C0598h c0598h) {
            if (this.f2016a.f2018b == null) {
                return;
            }
            if (this.f2016a.f2017a.mo321i()) {
                this.f2016a.f2018b.onPanelClosed(C0269j.AppCompatTheme_tooltipFrameBackground, c0598h);
            } else if (this.f2016a.f2018b.onPreparePanel(0, null, c0598h)) {
                this.f2016a.f2018b.onMenuOpened(C0269j.AppCompatTheme_tooltipFrameBackground, c0598h);
            }
        }

        /* renamed from: a */
        public boolean mo150a(C0598h c0598h, MenuItem menuItem) {
            return false;
        }
    }

    /* renamed from: h */
    private Menu m2495h() {
        if (!this.f2019c) {
            this.f2017a.mo304a(new C0584a(this), new C0585b(this));
            this.f2019c = true;
        }
        return this.f2017a.mo329q();
    }

    /* renamed from: a */
    public int mo151a() {
        return this.f2017a.mo327o();
    }

    /* renamed from: a */
    public void mo152a(float f) {
        C0227p.m866a(this.f2017a.mo301a(), f);
    }

    /* renamed from: a */
    public void mo153a(Configuration configuration) {
        super.mo153a(configuration);
    }

    /* renamed from: a */
    public void mo154a(CharSequence charSequence) {
        this.f2017a.mo308a(charSequence);
    }

    /* renamed from: a */
    public void mo155a(boolean z) {
    }

    /* renamed from: a */
    public boolean mo156a(int i, KeyEvent keyEvent) {
        Menu h = m2495h();
        if (h == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        h.setQwertyMode(z);
        return h.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: a */
    public boolean mo157a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo160c();
        }
        return true;
    }

    /* renamed from: b */
    public Context mo158b() {
        return this.f2017a.mo310b();
    }

    /* renamed from: c */
    public void mo159c(boolean z) {
    }

    /* renamed from: c */
    public boolean mo160c() {
        return this.f2017a.mo323k();
    }

    /* renamed from: d */
    public void mo161d(boolean z) {
    }

    /* renamed from: d */
    public boolean mo162d() {
        return this.f2017a.mo324l();
    }

    /* renamed from: e */
    public void mo163e(boolean z) {
        if (z != this.f2020d) {
            this.f2020d = z;
            int size = this.f2021e.size();
            for (int i = 0; i < size; i++) {
                ((C0285b) this.f2021e.get(i)).m1042a(z);
            }
        }
    }

    /* renamed from: e */
    public boolean mo164e() {
        this.f2017a.mo301a().removeCallbacks(this.f2022f);
        C0227p.m873a(this.f2017a.mo301a(), this.f2022f);
        return true;
    }

    /* renamed from: f */
    public boolean mo165f() {
        if (!this.f2017a.mo314c()) {
            return false;
        }
        this.f2017a.mo315d();
        return true;
    }

    /* renamed from: g */
    void mo166g() {
        this.f2017a.mo301a().removeCallbacks(this.f2022f);
    }
}
