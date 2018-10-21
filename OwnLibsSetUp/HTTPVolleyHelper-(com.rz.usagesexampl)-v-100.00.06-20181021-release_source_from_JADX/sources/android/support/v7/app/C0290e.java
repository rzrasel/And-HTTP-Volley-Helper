package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;

/* renamed from: android.support.v7.app.e */
public abstract class C0290e {
    /* renamed from: a */
    private static int f966a = -1;
    /* renamed from: b */
    private static boolean f967b = false;

    C0290e() {
    }

    /* renamed from: a */
    public static C0290e m1076a(Activity activity, C0289d c0289d) {
        return C0290e.m1078a(activity, activity.getWindow(), c0289d);
    }

    /* renamed from: a */
    public static C0290e m1077a(Dialog dialog, C0289d c0289d) {
        return C0290e.m1078a(dialog.getContext(), dialog.getWindow(), c0289d);
    }

    /* renamed from: a */
    private static C0290e m1078a(Context context, Window window, C0289d c0289d) {
        return VERSION.SDK_INT >= 24 ? new C0792g(context, window, c0289d) : VERSION.SDK_INT >= 23 ? new C0789i(context, window, c0289d) : new C0782h(context, window, c0289d);
    }

    /* renamed from: j */
    public static int m1079j() {
        return f966a;
    }

    /* renamed from: k */
    public static boolean m1080k() {
        return f967b;
    }

    /* renamed from: a */
    public abstract C0287a mo128a();

    /* renamed from: a */
    public abstract <T extends View> T mo480a(int i);

    /* renamed from: a */
    public abstract void mo482a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo483a(Bundle bundle);

    /* renamed from: a */
    public abstract void mo484a(View view);

    /* renamed from: a */
    public abstract void mo485a(View view, LayoutParams layoutParams);

    /* renamed from: a */
    public abstract void mo129a(CharSequence charSequence);

    /* renamed from: b */
    public abstract MenuInflater mo130b();

    /* renamed from: b */
    public abstract void mo488b(int i);

    /* renamed from: b */
    public abstract void mo489b(Bundle bundle);

    /* renamed from: b */
    public abstract void mo490b(View view, LayoutParams layoutParams);

    /* renamed from: c */
    public abstract void mo131c();

    /* renamed from: c */
    public abstract void mo132c(Bundle bundle);

    /* renamed from: c */
    public abstract boolean mo493c(int i);

    /* renamed from: d */
    public abstract void mo133d();

    /* renamed from: e */
    public abstract void mo494e();

    /* renamed from: f */
    public abstract void mo495f();

    /* renamed from: g */
    public abstract void mo134g();

    /* renamed from: h */
    public abstract void mo496h();

    /* renamed from: i */
    public abstract boolean mo135i();
}
