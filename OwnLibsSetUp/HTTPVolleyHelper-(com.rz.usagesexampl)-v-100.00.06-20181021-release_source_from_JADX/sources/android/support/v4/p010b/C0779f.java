package android.support.v4.p010b;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.support.v4.p008a.p009a.C0090a.C0089c;
import android.support.v4.p008a.p009a.C0090a.C0522b;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* renamed from: android.support.v4.b.f */
public class C0779f extends C0738d {
    /* renamed from: a */
    private static final Class f2796a;
    /* renamed from: b */
    private static final Constructor f2797b;
    /* renamed from: c */
    private static final Method f2798c;
    /* renamed from: d */
    private static final Method f2799d;
    /* renamed from: e */
    private static final Method f2800e;
    /* renamed from: f */
    private static final Method f2801f;
    /* renamed from: g */
    private static final Method f2802g;

    static {
        Class cls;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method declaredMethod;
        Constructor constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class});
            method2 = cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE});
            method3 = cls.getMethod("freeze", new Class[0]);
            method4 = cls.getMethod("abortCreation", new Class[0]);
            declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), Integer.TYPE, Integer.TYPE});
            declaredMethod.setAccessible(true);
            constructor = constructor2;
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to collect necessary methods for class ");
            stringBuilder.append(e.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", stringBuilder.toString(), e);
            cls = null;
            declaredMethod = cls;
            method = declaredMethod;
            method2 = method;
            method3 = method2;
            method4 = method3;
        }
        f2797b = constructor;
        f2796a = cls;
        f2798c = method;
        f2799d = method2;
        f2800e = method3;
        f2801f = method4;
        f2802g = declaredMethod;
    }

    /* renamed from: a */
    private static Typeface m3679a(Object obj) {
        try {
            Array.set(Array.newInstance(f2796a, 1), 0, obj);
            return (Typeface) f2802g.invoke(null, new Object[]{r0, Integer.valueOf(-1), Integer.valueOf(-1)});
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static boolean m3680a() {
        if (f2798c == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return f2798c != null;
    }

    /* renamed from: a */
    private static boolean m3681a(Context context, Object obj, String str, int i, int i2, int i3) {
        try {
            return ((Boolean) f2798c.invoke(obj, new Object[]{context.getAssets(), str, Integer.valueOf(0), Boolean.valueOf(false), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), null})).booleanValue();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static boolean m3682a(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) f2799d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static Object m3683b() {
        try {
            return f2797b.newInstance(new Object[0]);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static boolean m3684b(Object obj) {
        try {
            return ((Boolean) f2800e.invoke(obj, new Object[0])).booleanValue();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    private static void m3685c(Object obj) {
        try {
            f2801f.invoke(obj, new Object[0]);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public Typeface mo74a(Context context, Resources resources, int i, String str, int i2) {
        if (!C0779f.m3680a()) {
            return super.mo74a(context, resources, i, str, i2);
        }
        Object b = C0779f.m3683b();
        if (C0779f.m3681a(context, b, str, 0, -1, -1)) {
            return !C0779f.m3684b(b) ? null : C0779f.m3679a(b);
        } else {
            C0779f.m3685c(b);
            return null;
        }
    }

    /* renamed from: a */
    public android.graphics.Typeface mo75a(android.content.Context r10, android.os.CancellationSignal r11, android.support.v4.p015e.C0176b.C0174b[] r12, int r13) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/1763344271.run(Unknown Source)
*/
        /*
        r9 = this;
        r0 = r12.length;
        r1 = 1;
        r2 = 0;
        if (r0 >= r1) goto L_0x0006;
    L_0x0005:
        return r2;
    L_0x0006:
        r0 = android.support.v4.p010b.C0779f.m3680a();
        if (r0 != 0) goto L_0x0064;
    L_0x000c:
        r12 = r9.m2378a(r12, r13);
        r10 = r10.getContentResolver();
        r13 = r12.m628a();	 Catch:{ IOException -> 0x0063 }
        r0 = "r";	 Catch:{ IOException -> 0x0063 }
        r10 = r10.openFileDescriptor(r13, r0, r11);	 Catch:{ IOException -> 0x0063 }
        if (r10 != 0) goto L_0x0026;	 Catch:{ IOException -> 0x0063 }
    L_0x0020:
        if (r10 == 0) goto L_0x0025;	 Catch:{ IOException -> 0x0063 }
    L_0x0022:
        r10.close();	 Catch:{ IOException -> 0x0063 }
    L_0x0025:
        return r2;
    L_0x0026:
        r11 = new android.graphics.Typeface$Builder;	 Catch:{ Throwable -> 0x004c, all -> 0x0049 }
        r13 = r10.getFileDescriptor();	 Catch:{ Throwable -> 0x004c, all -> 0x0049 }
        r11.<init>(r13);	 Catch:{ Throwable -> 0x004c, all -> 0x0049 }
        r13 = r12.m630c();	 Catch:{ Throwable -> 0x004c, all -> 0x0049 }
        r11 = r11.setWeight(r13);	 Catch:{ Throwable -> 0x004c, all -> 0x0049 }
        r12 = r12.m631d();	 Catch:{ Throwable -> 0x004c, all -> 0x0049 }
        r11 = r11.setItalic(r12);	 Catch:{ Throwable -> 0x004c, all -> 0x0049 }
        r11 = r11.build();	 Catch:{ Throwable -> 0x004c, all -> 0x0049 }
        if (r10 == 0) goto L_0x0048;
    L_0x0045:
        r10.close();	 Catch:{ IOException -> 0x0063 }
    L_0x0048:
        return r11;
    L_0x0049:
        r11 = move-exception;
        r12 = r2;
        goto L_0x0052;
    L_0x004c:
        r11 = move-exception;
        throw r11;	 Catch:{ all -> 0x004e }
    L_0x004e:
        r12 = move-exception;
        r8 = r12;
        r12 = r11;
        r11 = r8;
    L_0x0052:
        if (r10 == 0) goto L_0x0062;
    L_0x0054:
        if (r12 == 0) goto L_0x005f;
    L_0x0056:
        r10.close();	 Catch:{ Throwable -> 0x005a }
        goto L_0x0062;
    L_0x005a:
        r10 = move-exception;
        r12.addSuppressed(r10);	 Catch:{ IOException -> 0x0063 }
        goto L_0x0062;	 Catch:{ IOException -> 0x0063 }
    L_0x005f:
        r10.close();	 Catch:{ IOException -> 0x0063 }
    L_0x0062:
        throw r11;	 Catch:{ IOException -> 0x0063 }
    L_0x0063:
        return r2;
    L_0x0064:
        r10 = android.support.v4.p015e.C0176b.m640a(r10, r12, r11);
        r11 = android.support.v4.p010b.C0779f.m3683b();
        r0 = r12.length;
        r3 = 0;
        r4 = 0;
    L_0x006f:
        if (r3 >= r0) goto L_0x009a;
    L_0x0071:
        r5 = r12[r3];
        r6 = r5.m628a();
        r6 = r10.get(r6);
        r6 = (java.nio.ByteBuffer) r6;
        if (r6 != 0) goto L_0x0080;
    L_0x007f:
        goto L_0x0097;
    L_0x0080:
        r4 = r5.m629b();
        r7 = r5.m630c();
        r5 = r5.m631d();
        r4 = android.support.v4.p010b.C0779f.m3682a(r11, r6, r4, r7, r5);
        if (r4 != 0) goto L_0x0096;
    L_0x0092:
        android.support.v4.p010b.C0779f.m3685c(r11);
        return r2;
    L_0x0096:
        r4 = 1;
    L_0x0097:
        r3 = r3 + 1;
        goto L_0x006f;
    L_0x009a:
        if (r4 != 0) goto L_0x00a0;
    L_0x009c:
        android.support.v4.p010b.C0779f.m3685c(r11);
        return r2;
    L_0x00a0:
        r10 = android.support.v4.p010b.C0779f.m3684b(r11);
        if (r10 != 0) goto L_0x00a7;
    L_0x00a6:
        return r2;
    L_0x00a7:
        r10 = android.support.v4.p010b.C0779f.m3679a(r11);
        r10 = android.graphics.Typeface.create(r10, r13);
        return r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.b.f.a(android.content.Context, android.os.CancellationSignal, android.support.v4.e.b$b[], int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public Typeface mo76a(Context context, C0522b c0522b, Resources resources, int i) {
        if (!C0779f.m3680a()) {
            return super.mo76a(context, c0522b, resources, i);
        }
        Object b = C0779f.m3683b();
        C0089c[] a = c0522b.m2070a();
        i = a.length;
        int i2 = 0;
        while (i2 < i) {
            C0089c c0089c = a[i2];
            if (C0779f.m3681a(context, b, c0089c.m357a(), 0, c0089c.m358b(), c0089c.m359c())) {
                i2++;
            } else {
                C0779f.m3685c(b);
                return null;
            }
        }
        return !C0779f.m3684b(b) ? null : C0779f.m3679a(b);
    }
}
