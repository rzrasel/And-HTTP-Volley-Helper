package android.support.v4.p010b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.v4.p008a.p009a.C0090a.C0089c;
import android.support.v4.p008a.p009a.C0090a.C0522b;
import android.support.v4.p010b.C0164c.C0163a;
import android.support.v4.p015e.C0176b.C0174b;

/* renamed from: android.support.v4.b.g */
class C0544g implements C0163a {

    /* renamed from: android.support.v4.b.g$a */
    private interface C0165a<T> {
        /* renamed from: a */
        boolean mo72a(T t);

        /* renamed from: b */
        int mo73b(T t);
    }

    /* renamed from: android.support.v4.b.g$1 */
    class C05421 implements C0165a<C0174b> {
        /* renamed from: a */
        final /* synthetic */ C0544g f1960a;

        C05421(C0544g c0544g) {
            this.f1960a = c0544g;
        }

        /* renamed from: a */
        public int m2364a(C0174b c0174b) {
            return c0174b.m630c();
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo72a(Object obj) {
            return m2367b((C0174b) obj);
        }

        /* renamed from: b */
        public /* synthetic */ int mo73b(Object obj) {
            return m2364a((C0174b) obj);
        }

        /* renamed from: b */
        public boolean m2367b(C0174b c0174b) {
            return c0174b.m631d();
        }
    }

    /* renamed from: android.support.v4.b.g$2 */
    class C05432 implements C0165a<C0089c> {
        /* renamed from: a */
        final /* synthetic */ C0544g f1961a;

        C05432(C0544g c0544g) {
            this.f1961a = c0544g;
        }

        /* renamed from: a */
        public int m2368a(C0089c c0089c) {
            return c0089c.m358b();
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo72a(Object obj) {
            return m2371b((C0089c) obj);
        }

        /* renamed from: b */
        public /* synthetic */ int mo73b(Object obj) {
            return m2368a((C0089c) obj);
        }

        /* renamed from: b */
        public boolean m2371b(C0089c c0089c) {
            return c0089c.m359c();
        }
    }

    C0544g() {
    }

    /* renamed from: a */
    private C0089c m2372a(C0522b c0522b, int i) {
        return (C0089c) C0544g.m2373a(c0522b.m2070a(), i, new C05432(this));
    }

    /* renamed from: a */
    private static <T> T m2373a(T[] tArr, int i, C0165a<T> c0165a) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(c0165a.mo73b(t2) - i2) * 2) + (c0165a.mo72a(t2) == z ? 0 : 1);
            if (t == null || r6 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* renamed from: a */
    public android.graphics.Typeface mo74a(android.content.Context r1, android.content.res.Resources r2, int r3, java.lang.String r4, int r5) {
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
        r0 = this;
        r1 = android.support.v4.p010b.C0166h.m606a(r1);
        r4 = 0;
        if (r1 != 0) goto L_0x0008;
    L_0x0007:
        return r4;
    L_0x0008:
        r2 = android.support.v4.p010b.C0166h.m611a(r1, r2, r3);	 Catch:{ RuntimeException -> 0x0023, all -> 0x001e }
        if (r2 != 0) goto L_0x0012;
    L_0x000e:
        r1.delete();
        return r4;
    L_0x0012:
        r2 = r1.getPath();	 Catch:{ RuntimeException -> 0x0023, all -> 0x001e }
        r2 = android.graphics.Typeface.createFromFile(r2);	 Catch:{ RuntimeException -> 0x0023, all -> 0x001e }
        r1.delete();
        return r2;
    L_0x001e:
        r2 = move-exception;
        r1.delete();
        throw r2;
    L_0x0023:
        r1.delete();
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.b.g.a(android.content.Context, android.content.res.Resources, int, java.lang.String, int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public android.graphics.Typeface mo75a(android.content.Context r3, android.os.CancellationSignal r4, android.support.v4.p015e.C0176b.C0174b[] r5, int r6) {
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
        r2 = this;
        r4 = r5.length;
        r0 = 0;
        r1 = 1;
        if (r4 >= r1) goto L_0x0006;
    L_0x0005:
        return r0;
    L_0x0006:
        r4 = r2.m2378a(r5, r6);
        r5 = r3.getContentResolver();	 Catch:{ IOException -> 0x0026, all -> 0x0021 }
        r4 = r4.m628a();	 Catch:{ IOException -> 0x0026, all -> 0x0021 }
        r4 = r5.openInputStream(r4);	 Catch:{ IOException -> 0x0026, all -> 0x0021 }
        r3 = r2.m2377a(r3, r4);	 Catch:{ IOException -> 0x0027, all -> 0x001e }
        android.support.v4.p010b.C0166h.m610a(r4);
        return r3;
    L_0x001e:
        r3 = move-exception;
        r0 = r4;
        goto L_0x0022;
    L_0x0021:
        r3 = move-exception;
    L_0x0022:
        android.support.v4.p010b.C0166h.m610a(r0);
        throw r3;
    L_0x0026:
        r4 = r0;
    L_0x0027:
        android.support.v4.p010b.C0166h.m610a(r4);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.b.g.a(android.content.Context, android.os.CancellationSignal, android.support.v4.e.b$b[], int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public Typeface mo76a(Context context, C0522b c0522b, Resources resources, int i) {
        C0089c a = m2372a(c0522b, i);
        return a == null ? null : C0164c.m599a(context, resources, a.m360d(), a.m357a(), i);
    }

    /* renamed from: a */
    protected android.graphics.Typeface m2377a(android.content.Context r2, java.io.InputStream r3) {
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
        r1 = this;
        r2 = android.support.v4.p010b.C0166h.m606a(r2);
        r0 = 0;
        if (r2 != 0) goto L_0x0008;
    L_0x0007:
        return r0;
    L_0x0008:
        r3 = android.support.v4.p010b.C0166h.m612a(r2, r3);	 Catch:{ RuntimeException -> 0x0023, all -> 0x001e }
        if (r3 != 0) goto L_0x0012;
    L_0x000e:
        r2.delete();
        return r0;
    L_0x0012:
        r3 = r2.getPath();	 Catch:{ RuntimeException -> 0x0023, all -> 0x001e }
        r3 = android.graphics.Typeface.createFromFile(r3);	 Catch:{ RuntimeException -> 0x0023, all -> 0x001e }
        r2.delete();
        return r3;
    L_0x001e:
        r3 = move-exception;
        r2.delete();
        throw r3;
    L_0x0023:
        r2.delete();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.b.g.a(android.content.Context, java.io.InputStream):android.graphics.Typeface");
    }

    /* renamed from: a */
    protected C0174b m2378a(C0174b[] c0174bArr, int i) {
        return (C0174b) C0544g.m2373a(c0174bArr, i, new C05421(this));
    }
}
