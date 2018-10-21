package android.support.v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class at extends ContextWrapper {
    /* renamed from: a */
    private static final Object f1340a = new Object();
    /* renamed from: b */
    private static ArrayList<WeakReference<at>> f1341b;
    /* renamed from: c */
    private final Resources f1342c;
    /* renamed from: d */
    private final Theme f1343d;

    private at(Context context) {
        super(context);
        if (bb.m1511a()) {
            this.f1342c = new bb(this, context.getResources());
            this.f1343d = this.f1342c.newTheme();
            this.f1343d.setTo(context.getTheme());
            return;
        }
        this.f1342c = new av(this, context.getResources());
        this.f1343d = null;
    }

    /* renamed from: a */
    public static Context m1473a(Context context) {
        if (!m1474b(context)) {
            return context;
        }
        synchronized (f1340a) {
            if (f1341b == null) {
                f1341b = new ArrayList();
            } else {
                int size;
                WeakReference weakReference;
                for (size = f1341b.size() - 1; size >= 0; size--) {
                    weakReference = (WeakReference) f1341b.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1341b.remove(size);
                    }
                }
                size = f1341b.size() - 1;
                while (size >= 0) {
                    weakReference = (WeakReference) f1341b.get(size);
                    Context context2 = weakReference != null ? (at) weakReference.get() : null;
                    if (context2 == null || context2.getBaseContext() != context) {
                        size--;
                    } else {
                        return context2;
                    }
                }
            }
            Context atVar = new at(context);
            f1341b.add(new WeakReference(atVar));
            return atVar;
        }
    }

    /* renamed from: b */
    private static boolean m1474b(Context context) {
        return ((context instanceof at) || (context.getResources() instanceof av)) ? false : context.getResources() instanceof bb ? false : VERSION.SDK_INT < 21 || bb.m1511a();
    }

    public AssetManager getAssets() {
        return this.f1342c.getAssets();
    }

    public Resources getResources() {
        return this.f1342c;
    }

    public Theme getTheme() {
        return this.f1343d == null ? super.getTheme() : this.f1343d;
    }

    public void setTheme(int i) {
        if (this.f1343d == null) {
            super.setTheme(i);
        } else {
            this.f1343d.applyStyle(i, true);
        }
    }
}
