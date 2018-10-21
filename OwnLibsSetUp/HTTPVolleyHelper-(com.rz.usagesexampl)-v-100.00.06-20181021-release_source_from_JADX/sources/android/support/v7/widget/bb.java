package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.app.C0290e;
import java.lang.ref.WeakReference;

public class bb extends Resources {
    /* renamed from: a */
    private final WeakReference<Context> f1373a;

    public bb(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1373a = new WeakReference(context);
    }

    /* renamed from: a */
    public static boolean m1511a() {
        return C0290e.m1080k() && VERSION.SDK_INT <= 20;
    }

    /* renamed from: a */
    final Drawable m1512a(int i) {
        return super.getDrawable(i);
    }

    public Drawable getDrawable(int i) {
        Context context = (Context) this.f1373a.get();
        return context != null ? C0394l.m1561a().m1582a(context, this, i) : super.getDrawable(i);
    }
}
