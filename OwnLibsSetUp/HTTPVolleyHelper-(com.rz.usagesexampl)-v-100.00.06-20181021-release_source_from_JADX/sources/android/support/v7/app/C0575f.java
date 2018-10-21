package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.view.C0308b;
import android.support.v7.view.C0308b.C0307a;
import android.support.v7.view.C0314g;
import android.support.v7.view.C0316i;
import android.support.v7.view.menu.C0598h;
import android.support.v7.widget.aw;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;
import android.view.Window.Callback;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: android.support.v7.app.f */
abstract class C0575f extends C0290e {
    /* renamed from: m */
    private static boolean f1987m = true;
    /* renamed from: n */
    private static final boolean f1988n = (VERSION.SDK_INT < 21);
    /* renamed from: o */
    private static final int[] f1989o = new int[]{16842836};
    /* renamed from: a */
    final Context f1990a;
    /* renamed from: b */
    final Window f1991b;
    /* renamed from: c */
    final Callback f1992c = this.f1991b.getCallback();
    /* renamed from: d */
    final Callback f1993d;
    /* renamed from: e */
    final C0289d f1994e;
    /* renamed from: f */
    C0287a f1995f;
    /* renamed from: g */
    MenuInflater f1996g;
    /* renamed from: h */
    boolean f1997h;
    /* renamed from: i */
    boolean f1998i;
    /* renamed from: j */
    boolean f1999j;
    /* renamed from: k */
    boolean f2000k;
    /* renamed from: l */
    boolean f2001l;
    /* renamed from: p */
    private CharSequence f2002p;
    /* renamed from: q */
    private boolean f2003q;
    /* renamed from: r */
    private boolean f2004r;

    /* renamed from: android.support.v7.app.f$a */
    class C0574a extends C0316i {
        /* renamed from: a */
        final /* synthetic */ C0575f f1986a;

        C0574a(C0575f c0575f, Callback callback) {
            this.f1986a = c0575f;
            super(callback);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (!this.f1986a.mo487a(keyEvent)) {
                if (!super.dispatchKeyEvent(keyEvent)) {
                    return false;
                }
            }
            return true;
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (!super.dispatchKeyShortcutEvent(keyEvent)) {
                if (!this.f1986a.mo486a(keyEvent.getKeyCode(), keyEvent)) {
                    return false;
                }
            }
            return true;
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            return (i != 0 || (menu instanceof C0598h)) ? super.onCreatePanelMenu(i, menu) : false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            this.f1986a.mo492b(i, menu);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            this.f1986a.mo481a(i, menu);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0598h c0598h = menu instanceof C0598h ? (C0598h) menu : null;
            if (i == 0 && c0598h == null) {
                return false;
            }
            if (c0598h != null) {
                c0598h.m2672c(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (c0598h != null) {
                c0598h.m2672c(false);
            }
            return onPreparePanel;
        }
    }

    static {
        if (f1988n && !f1987m) {
            final UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
                /* renamed from: a */
                private boolean m1101a(Throwable th) {
                    if (!(th instanceof NotFoundException)) {
                        return false;
                    }
                    String message = th.getMessage();
                    return message != null ? message.contains("drawable") || message.contains("Drawable") : false;
                }

                public void uncaughtException(Thread thread, Throwable th) {
                    if (m1101a(th)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(th.getMessage());
                        stringBuilder.append(". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                        Throwable notFoundException = new NotFoundException(stringBuilder.toString());
                        notFoundException.initCause(th.getCause());
                        notFoundException.setStackTrace(th.getStackTrace());
                        defaultUncaughtExceptionHandler.uncaughtException(thread, notFoundException);
                        return;
                    }
                    defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                }
            });
        }
    }

    C0575f(Context context, Window window, C0289d c0289d) {
        this.f1990a = context;
        this.f1991b = window;
        this.f1994e = c0289d;
        if (this.f1992c instanceof C0574a) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        this.f1993d = mo544a(this.f1992c);
        this.f1991b.setCallback(this.f1993d);
        aw a = aw.m1477a(context, null, f1989o);
        Drawable b = a.m1486b(0);
        if (b != null) {
            this.f1991b.setBackgroundDrawable(b);
        }
        a.m1483a();
    }

    /* renamed from: a */
    public C0287a mo128a() {
        mo497l();
        return this.f1995f;
    }

    /* renamed from: a */
    abstract C0308b mo479a(C0307a c0307a);

    /* renamed from: a */
    Callback mo544a(Callback callback) {
        return new C0574a(this, callback);
    }

    /* renamed from: a */
    abstract void mo481a(int i, Menu menu);

    /* renamed from: a */
    public final void mo129a(CharSequence charSequence) {
        this.f2002p = charSequence;
        mo491b(charSequence);
    }

    /* renamed from: a */
    abstract boolean mo486a(int i, KeyEvent keyEvent);

    /* renamed from: a */
    abstract boolean mo487a(KeyEvent keyEvent);

    /* renamed from: b */
    public MenuInflater mo130b() {
        if (this.f1996g == null) {
            mo497l();
            this.f1996g = new C0314g(this.f1995f != null ? this.f1995f.mo158b() : this.f1990a);
        }
        return this.f1996g;
    }

    /* renamed from: b */
    abstract void mo491b(CharSequence charSequence);

    /* renamed from: b */
    abstract boolean mo492b(int i, Menu menu);

    /* renamed from: c */
    public void mo131c() {
        this.f2003q = true;
    }

    /* renamed from: c */
    public void mo132c(Bundle bundle) {
    }

    /* renamed from: d */
    public void mo133d() {
        this.f2003q = false;
    }

    /* renamed from: g */
    public void mo134g() {
        this.f2004r = true;
    }

    /* renamed from: i */
    public boolean mo135i() {
        return false;
    }

    /* renamed from: l */
    abstract void mo497l();

    /* renamed from: m */
    final C0287a m2466m() {
        return this.f1995f;
    }

    /* renamed from: n */
    final Context m2467n() {
        C0287a a = mo128a();
        Context b = a != null ? a.mo158b() : null;
        return b == null ? this.f1990a : b;
    }

    /* renamed from: o */
    public boolean mo546o() {
        return false;
    }

    /* renamed from: p */
    final boolean m2469p() {
        return this.f2004r;
    }

    /* renamed from: q */
    final Callback m2470q() {
        return this.f1991b.getCallback();
    }

    /* renamed from: r */
    final CharSequence m2471r() {
        return this.f1992c instanceof Activity ? ((Activity) this.f1992c).getTitle() : this.f2002p;
    }
}
