package android.support.v7.p021b.p022a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p008a.C0096a;
import android.support.v7.widget.C0394l;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* renamed from: android.support.v7.b.a.b */
public final class C0303b {
    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f1020a = new ThreadLocal();
    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<C0302a>> f1021b = new WeakHashMap(0);
    /* renamed from: c */
    private static final Object f1022c = new Object();

    /* renamed from: android.support.v7.b.a.b$a */
    private static class C0302a {
        /* renamed from: a */
        final ColorStateList f1018a;
        /* renamed from: b */
        final Configuration f1019b;

        C0302a(ColorStateList colorStateList, Configuration configuration) {
            this.f1018a = colorStateList;
            this.f1019b = configuration;
        }
    }

    /* renamed from: a */
    public static ColorStateList m1128a(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList d = C0303b.m1133d(context, i);
        if (d != null) {
            return d;
        }
        d = C0303b.m1132c(context, i);
        if (d == null) {
            return C0096a.m387b(context, i);
        }
        C0303b.m1130a(context, i, d);
        return d;
    }

    /* renamed from: a */
    private static TypedValue m1129a() {
        TypedValue typedValue = (TypedValue) f1020a.get();
        if (typedValue != null) {
            return typedValue;
        }
        typedValue = new TypedValue();
        f1020a.set(typedValue);
        return typedValue;
    }

    /* renamed from: a */
    private static void m1130a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f1022c) {
            SparseArray sparseArray = (SparseArray) f1021b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                f1021b.put(context, sparseArray);
            }
            sparseArray.append(i, new C0302a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* renamed from: b */
    public static Drawable m1131b(Context context, int i) {
        return C0394l.m1561a().m1580a(context, i);
    }

    /* renamed from: c */
    private static ColorStateList m1132c(Context context, int i) {
        if (C0303b.m1134e(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C0301a.m1124a(resources, resources.getXml(i), context.getTheme());
        } catch (Throwable e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: d */
    private static android.content.res.ColorStateList m1133d(android.content.Context r4, int r5) {
        /*
        r0 = f1022c;
        monitor-enter(r0);
        r1 = f1021b;	 Catch:{ all -> 0x0035 }
        r1 = r1.get(r4);	 Catch:{ all -> 0x0035 }
        r1 = (android.util.SparseArray) r1;	 Catch:{ all -> 0x0035 }
        if (r1 == 0) goto L_0x0032;
    L_0x000d:
        r2 = r1.size();	 Catch:{ all -> 0x0035 }
        if (r2 <= 0) goto L_0x0032;
    L_0x0013:
        r2 = r1.get(r5);	 Catch:{ all -> 0x0035 }
        r2 = (android.support.v7.p021b.p022a.C0303b.C0302a) r2;	 Catch:{ all -> 0x0035 }
        if (r2 == 0) goto L_0x0032;
    L_0x001b:
        r3 = r2.f1019b;	 Catch:{ all -> 0x0035 }
        r4 = r4.getResources();	 Catch:{ all -> 0x0035 }
        r4 = r4.getConfiguration();	 Catch:{ all -> 0x0035 }
        r4 = r3.equals(r4);	 Catch:{ all -> 0x0035 }
        if (r4 == 0) goto L_0x002f;
    L_0x002b:
        r4 = r2.f1018a;	 Catch:{ all -> 0x0035 }
        monitor-exit(r0);	 Catch:{ all -> 0x0035 }
        return r4;
    L_0x002f:
        r1.remove(r5);	 Catch:{ all -> 0x0035 }
    L_0x0032:
        monitor-exit(r0);	 Catch:{ all -> 0x0035 }
        r4 = 0;
        return r4;
    L_0x0035:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0035 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.b.a.b.d(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* renamed from: e */
    private static boolean m1134e(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue a = C0303b.m1129a();
        resources.getValue(i, a, true);
        return a.type >= 28 && a.type <= 31;
    }
}
