package android.support.v7.app;

import android.app.UiModeManager;
import android.content.Context;
import android.support.v7.app.C0782h.C0749a;
import android.view.ActionMode;
import android.view.Window;
import android.view.Window.Callback;

/* renamed from: android.support.v7.app.i */
class C0789i extends C0782h {
    /* renamed from: t */
    private final UiModeManager f2835t;

    /* renamed from: android.support.v7.app.i$a */
    class C0783a extends C0749a {
        /* renamed from: d */
        final /* synthetic */ C0789i f2807d;

        C0783a(C0789i c0789i, Callback callback) {
            this.f2807d = c0789i;
            super(c0789i, callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (this.f2807d.mo546o()) {
                if (i == 0) {
                    return m3466a(callback);
                }
            }
            return super.onWindowStartingActionMode(callback, i);
        }
    }

    C0789i(Context context, Window window, C0289d c0289d) {
        super(context, window, c0289d);
        this.f2835t = (UiModeManager) context.getSystemService("uimode");
    }

    /* renamed from: a */
    Callback mo544a(Callback callback) {
        return new C0783a(this, callback);
    }

    /* renamed from: d */
    int mo545d(int i) {
        return (i == 0 && this.f2835t.getNightMode() == 0) ? -1 : super.mo545d(i);
    }
}
