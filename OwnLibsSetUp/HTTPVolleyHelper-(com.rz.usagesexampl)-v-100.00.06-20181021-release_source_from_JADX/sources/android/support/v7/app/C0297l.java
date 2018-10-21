package android.support.v7.app;

import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: android.support.v7.app.l */
class C0297l {
    /* renamed from: a */
    private static Field f996a;
    /* renamed from: b */
    private static boolean f997b;
    /* renamed from: c */
    private static Class f998c;
    /* renamed from: d */
    private static boolean f999d;
    /* renamed from: e */
    private static Field f1000e;
    /* renamed from: f */
    private static boolean f1001f;
    /* renamed from: g */
    private static Field f1002g;
    /* renamed from: h */
    private static boolean f1003h;

    /* renamed from: a */
    static boolean m1110a(Resources resources) {
        return VERSION.SDK_INT >= 24 ? C0297l.m1114d(resources) : VERSION.SDK_INT >= 23 ? C0297l.m1113c(resources) : VERSION.SDK_INT >= 21 ? C0297l.m1112b(resources) : false;
    }

    /* renamed from: a */
    private static boolean m1111a(Object obj) {
        if (!f999d) {
            try {
                f998c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (Throwable e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f999d = true;
        }
        if (f998c == null) {
            return false;
        }
        if (!f1001f) {
            try {
                f1000e = f998c.getDeclaredField("mUnthemedEntries");
                f1000e.setAccessible(true);
            } catch (Throwable e2) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
            }
            f1001f = true;
        }
        if (f1000e == null) {
            return false;
        }
        LongSparseArray longSparseArray;
        try {
            longSparseArray = (LongSparseArray) f1000e.get(obj);
        } catch (Throwable e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
            longSparseArray = null;
        }
        if (longSparseArray == null) {
            return false;
        }
        longSparseArray.clear();
        return true;
    }

    /* renamed from: b */
    private static boolean m1112b(Resources resources) {
        if (!f997b) {
            try {
                f996a = Resources.class.getDeclaredField("mDrawableCache");
                f996a.setAccessible(true);
            } catch (Throwable e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f997b = true;
        }
        if (f996a != null) {
            Map map;
            try {
                map = (Map) f996a.get(resources);
            } catch (Throwable e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
                map = null;
            }
            if (map != null) {
                map.clear();
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m1113c(Resources resources) {
        Object obj;
        boolean z;
        if (!f997b) {
            try {
                f996a = Resources.class.getDeclaredField("mDrawableCache");
                f996a.setAccessible(true);
            } catch (Throwable e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f997b = true;
        }
        if (f996a != null) {
            try {
                obj = f996a.get(resources);
            } catch (Throwable e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
            z = false;
            if (obj == null) {
                return false;
            }
            if (obj != null && C0297l.m1111a(obj)) {
                z = true;
            }
            return z;
        }
        obj = null;
        z = false;
        if (obj == null) {
            return false;
        }
        z = true;
        return z;
    }

    /* renamed from: d */
    private static boolean m1114d(Resources resources) {
        boolean z = true;
        if (!f1003h) {
            try {
                f1002g = Resources.class.getDeclaredField("mResourcesImpl");
                f1002g.setAccessible(true);
            } catch (Throwable e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f1003h = true;
        }
        if (f1002g == null) {
            return false;
        }
        Object obj;
        try {
            obj = f1002g.get(resources);
        } catch (Throwable e2) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
            obj = null;
        }
        if (obj == null) {
            return false;
        }
        if (!f997b) {
            try {
                f996a = obj.getClass().getDeclaredField("mDrawableCache");
                f996a.setAccessible(true);
            } catch (Throwable e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
            }
            f997b = true;
        }
        if (f996a != null) {
            try {
                obj = f996a.get(obj);
            } catch (Throwable e22) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e22);
            }
            if (obj != null || !C0297l.m1111a(obj)) {
                z = false;
            }
            return z;
        }
        obj = null;
        if (obj != null) {
        }
        z = false;
        return z;
    }
}
