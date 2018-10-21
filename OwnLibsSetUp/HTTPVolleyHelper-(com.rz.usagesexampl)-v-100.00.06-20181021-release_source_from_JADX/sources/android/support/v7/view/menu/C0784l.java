package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.p012c.p013a.C0168b;
import android.support.v4.p017g.C0212c.C0211b;
import android.support.v7.view.menu.C0758k.C0602a;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v7.view.menu.l */
class C0784l extends C0758k {

    /* renamed from: android.support.v7.view.menu.l$a */
    class C0759a extends C0602a implements VisibilityListener {
        /* renamed from: c */
        C0211b f2731c;
        /* renamed from: d */
        final /* synthetic */ C0784l f2732d;

        public C0759a(C0784l c0784l, Context context, ActionProvider actionProvider) {
            this.f2732d = c0784l;
            super(c0784l, context, actionProvider);
        }

        /* renamed from: a */
        public View mo509a(MenuItem menuItem) {
            return this.a.onCreateActionView(menuItem);
        }

        /* renamed from: a */
        public void mo510a(C0211b c0211b) {
            this.f2731c = c0211b;
            this.a.setVisibilityListener(c0211b != null ? this : null);
        }

        /* renamed from: b */
        public boolean mo511b() {
            return this.a.overridesItemVisibility();
        }

        /* renamed from: c */
        public boolean mo512c() {
            return this.a.isVisible();
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            if (this.f2731c != null) {
                this.f2731c.mo230a(z);
            }
        }
    }

    C0784l(Context context, C0168b c0168b) {
        super(context, c0168b);
    }

    /* renamed from: a */
    C0602a mo548a(ActionProvider actionProvider) {
        return new C0759a(this, this.a, actionProvider);
    }
}
