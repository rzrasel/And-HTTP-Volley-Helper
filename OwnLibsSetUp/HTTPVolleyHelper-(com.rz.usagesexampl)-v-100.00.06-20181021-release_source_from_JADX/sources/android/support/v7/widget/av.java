package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

class av extends an {
    /* renamed from: a */
    private final WeakReference<Context> f2369a;

    public av(Context context, Resources resources) {
        super(resources);
        this.f2369a = new WeakReference(context);
    }

    public Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.f2369a.get();
        if (!(drawable == null || context == null)) {
            C0394l.m1561a();
            C0394l.m1567a(context, i, drawable);
        }
        return drawable;
    }
}
