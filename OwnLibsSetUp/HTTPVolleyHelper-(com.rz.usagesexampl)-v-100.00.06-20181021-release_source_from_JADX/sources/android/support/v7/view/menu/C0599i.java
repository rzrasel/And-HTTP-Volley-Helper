package android.support.v7.view.menu;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.os.IBinder;
import android.support.v7.app.C0748b;
import android.support.v7.app.C0748b.C0288a;
import android.support.v7.p020a.C0270a.C0266g;
import android.support.v7.view.menu.C0330o.C0329a;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;

/* renamed from: android.support.v7.view.menu.i */
class C0599i implements OnClickListener, OnDismissListener, OnKeyListener, C0329a {
    /* renamed from: a */
    C0597f f2164a;
    /* renamed from: b */
    private C0598h f2165b;
    /* renamed from: c */
    private C0748b f2166c;
    /* renamed from: d */
    private C0329a f2167d;

    public C0599i(C0598h c0598h) {
        this.f2165b = c0598h;
    }

    /* renamed from: a */
    public void m2693a() {
        if (this.f2166c != null) {
            this.f2166c.dismiss();
        }
    }

    /* renamed from: a */
    public void m2694a(IBinder iBinder) {
        C0598h c0598h = this.f2165b;
        C0288a c0288a = new C0288a(c0598h.m2678e());
        this.f2164a = new C0597f(c0288a.m1066a(), C0266g.abc_list_menu_item_layout);
        this.f2164a.mo222a((C0329a) this);
        this.f2165b.m2657a(this.f2164a);
        c0288a.m1070a(this.f2164a.m2629a(), this);
        View o = c0598h.m2689o();
        if (o != null) {
            c0288a.m1069a(o);
        } else {
            c0288a.m1068a(c0598h.m2688n()).m1071a(c0598h.m2687m());
        }
        c0288a.m1067a((OnKeyListener) this);
        this.f2166c = c0288a.m1072b();
        this.f2166c.setOnDismissListener(this);
        LayoutParams attributes = this.f2166c.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f2166c.show();
    }

    /* renamed from: a */
    public void mo140a(C0598h c0598h, boolean z) {
        if (z || c0598h == this.f2165b) {
            m2693a();
        }
        if (this.f2167d != null) {
            this.f2167d.mo140a(c0598h, z);
        }
    }

    /* renamed from: a */
    public boolean mo141a(C0598h c0598h) {
        return this.f2167d != null ? this.f2167d.mo141a(c0598h) : false;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f2165b.m2663a((C0601j) this.f2164a.m2629a().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f2164a.mo221a(this.f2165b, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window = this.f2166c.getWindow();
                if (window != null) {
                    View decorView = window.getDecorView();
                    if (decorView != null) {
                        DispatcherState keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null) {
                            keyDispatcherState.startTracking(keyEvent, this);
                            return true;
                        }
                    }
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                Window window2 = this.f2166c.getWindow();
                if (window2 != null) {
                    View decorView2 = window2.getDecorView();
                    if (decorView2 != null) {
                        DispatcherState keyDispatcherState2 = decorView2.getKeyDispatcherState();
                        if (keyDispatcherState2 != null && keyDispatcherState2.isTracking(keyEvent)) {
                            this.f2165b.m2661a(true);
                            dialogInterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return this.f2165b.performShortcut(i, keyEvent, 0);
    }
}
