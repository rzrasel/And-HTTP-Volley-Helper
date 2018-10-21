package android.support.v4.p010b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.support.v4.p008a.p009a.C0090a.C0089c;
import android.support.v4.p008a.p009a.C0090a.C0522b;
import android.support.v4.p015e.C0176b.C0174b;
import android.support.v4.p016f.C0197k;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: android.support.v4.b.e */
class C0739e extends C0544g {
    /* renamed from: a */
    private static final Class f2621a;
    /* renamed from: b */
    private static final Constructor f2622b;
    /* renamed from: c */
    private static final Method f2623c;
    /* renamed from: d */
    private static final Method f2624d;

    static {
        Class cls;
        Method method;
        Method method2;
        Constructor constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (Throwable e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method2 = cls;
            method = method2;
        }
        f2622b = constructor;
        f2621a = cls;
        f2623c = method;
        f2624d = method2;
    }

    C0739e() {
    }

    /* renamed from: a */
    private static Typeface m3397a(Object obj) {
        try {
            Array.set(Array.newInstance(f2621a, 1), 0, obj);
            return (Typeface) f2624d.invoke(null, new Object[]{r0});
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static boolean m3398a() {
        if (f2623c == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f2623c != null;
    }

    /* renamed from: a */
    private static boolean m3399a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f2623c.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static Object m3400b() {
        try {
            return f2622b.newInstance(new Object[0]);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public Typeface mo75a(Context context, CancellationSignal cancellationSignal, C0174b[] c0174bArr, int i) {
        Object b = C0739e.m3400b();
        C0197k c0197k = new C0197k();
        for (C0174b c0174b : c0174bArr) {
            Uri a = c0174b.m628a();
            ByteBuffer byteBuffer = (ByteBuffer) c0197k.get(a);
            if (byteBuffer == null) {
                byteBuffer = C0166h.m608a(context, cancellationSignal, a);
                c0197k.put(a, byteBuffer);
            }
            if (!C0739e.m3399a(b, byteBuffer, c0174b.m629b(), c0174b.m630c(), c0174b.m631d())) {
                return null;
            }
        }
        return Typeface.create(C0739e.m3397a(b), i);
    }

    /* renamed from: a */
    public Typeface mo76a(Context context, C0522b c0522b, Resources resources, int i) {
        Object b = C0739e.m3400b();
        for (C0089c c0089c : c0522b.m2070a()) {
            ByteBuffer a = C0166h.m607a(context, resources, c0089c.m360d());
            if (a == null || !C0739e.m3399a(b, a, 0, c0089c.m358b(), c0089c.m359c())) {
                return null;
            }
        }
        return C0739e.m3397a(b);
    }
}
