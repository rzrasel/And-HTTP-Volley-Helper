package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.p020a.C0270a.C0260a;
import android.support.v7.view.C0308b;
import android.support.v7.view.C0308b.C0307a;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

/* renamed from: android.support.v7.app.k */
public class C0583k extends Dialog implements C0289d {
    /* renamed from: a */
    private C0290e f2013a;

    public C0583k(Context context, int i) {
        super(context, C0583k.m2485a(context, i));
        m2486a().mo483a(null);
        m2486a().mo135i();
    }

    /* renamed from: a */
    private static int m2485a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0260a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public C0290e m2486a() {
        if (this.f2013a == null) {
            this.f2013a = C0290e.m1077a((Dialog) this, (C0289d) this);
        }
        return this.f2013a;
    }

    /* renamed from: a */
    public C0308b mo146a(C0307a c0307a) {
        return null;
    }

    /* renamed from: a */
    public void mo147a(C0308b c0308b) {
    }

    /* renamed from: a */
    public boolean m2489a(int i) {
        return m2486a().mo493c(i);
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        m2486a().mo490b(view, layoutParams);
    }

    /* renamed from: b */
    public void mo148b(C0308b c0308b) {
    }

    public <T extends View> T findViewById(int i) {
        return m2486a().mo480a(i);
    }

    public void invalidateOptionsMenu() {
        m2486a().mo495f();
    }

    protected void onCreate(Bundle bundle) {
        m2486a().mo496h();
        super.onCreate(bundle);
        m2486a().mo483a(bundle);
    }

    protected void onStop() {
        super.onStop();
        m2486a().mo133d();
    }

    public void setContentView(int i) {
        m2486a().mo488b(i);
    }

    public void setContentView(View view) {
        m2486a().mo484a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        m2486a().mo485a(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        m2486a().mo129a(getContext().getString(i));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m2486a().mo129a(charSequence);
    }
}
