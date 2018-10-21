package android.support.v7.app;

import android.content.Context;
import android.support.v7.app.C0753j.C0296d;
import android.support.v7.app.C0789i.C0783a;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import android.view.Window.Callback;
import java.util.List;

/* renamed from: android.support.v7.app.g */
class C0792g extends C0789i {

    /* renamed from: android.support.v7.app.g$a */
    class C0788a extends C0783a {
        /* renamed from: b */
        final /* synthetic */ C0792g f2834b;

        C0788a(C0792g c0792g, Callback callback) {
            this.f2834b = c0792g;
            super(c0792g, callback);
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0296d a = this.f2834b.m3488a(0, true);
            if (!(a == null || a.f986j == null)) {
                menu = a.f986j;
            }
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    C0792g(Context context, Window window, C0289d c0289d) {
        super(context, window, c0289d);
    }

    /* renamed from: a */
    Callback mo544a(Callback callback) {
        return new C0788a(this, callback);
    }
}
