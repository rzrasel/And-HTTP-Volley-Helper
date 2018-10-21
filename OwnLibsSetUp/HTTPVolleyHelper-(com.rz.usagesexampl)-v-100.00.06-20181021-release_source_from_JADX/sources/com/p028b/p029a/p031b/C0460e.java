package com.p028b.p029a.p031b;

/* renamed from: com.b.a.b.e */
public final class C0460e {
    /* renamed from: a */
    private static final int f1628a = C0460e.m1788c();

    /* renamed from: a */
    public static int m1784a() {
        return f1628a;
    }

    /* renamed from: a */
    static int m1785a(String str) {
        int b = C0460e.m1786b(str);
        if (b == -1) {
            b = C0460e.m1789c(str);
        }
        return b == -1 ? 6 : b;
    }

    /* renamed from: b */
    private static int m1786b(java.lang.String r3) {
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
        r0 = "[._]";	 Catch:{ NumberFormatException -> 0x001b }
        r3 = r3.split(r0);	 Catch:{ NumberFormatException -> 0x001b }
        r0 = 0;	 Catch:{ NumberFormatException -> 0x001b }
        r0 = r3[r0];	 Catch:{ NumberFormatException -> 0x001b }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x001b }
        r1 = 1;	 Catch:{ NumberFormatException -> 0x001b }
        if (r0 != r1) goto L_0x001a;	 Catch:{ NumberFormatException -> 0x001b }
    L_0x0010:
        r2 = r3.length;	 Catch:{ NumberFormatException -> 0x001b }
        if (r2 <= r1) goto L_0x001a;	 Catch:{ NumberFormatException -> 0x001b }
    L_0x0013:
        r3 = r3[r1];	 Catch:{ NumberFormatException -> 0x001b }
        r3 = java.lang.Integer.parseInt(r3);	 Catch:{ NumberFormatException -> 0x001b }
        return r3;
    L_0x001a:
        return r0;
    L_0x001b:
        r3 = -1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.b.a.b.e.b(java.lang.String):int");
    }

    /* renamed from: b */
    public static boolean m1787b() {
        return f1628a >= 9;
    }

    /* renamed from: c */
    private static int m1788c() {
        return C0460e.m1785a(System.getProperty("java.version"));
    }

    /* renamed from: c */
    private static int m1789c(java.lang.String r4) {
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
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0025 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0025 }
        r1 = 0;	 Catch:{ NumberFormatException -> 0x0025 }
    L_0x0006:
        r2 = r4.length();	 Catch:{ NumberFormatException -> 0x0025 }
        if (r1 >= r2) goto L_0x001c;	 Catch:{ NumberFormatException -> 0x0025 }
    L_0x000c:
        r2 = r4.charAt(r1);	 Catch:{ NumberFormatException -> 0x0025 }
        r3 = java.lang.Character.isDigit(r2);	 Catch:{ NumberFormatException -> 0x0025 }
        if (r3 == 0) goto L_0x001c;	 Catch:{ NumberFormatException -> 0x0025 }
    L_0x0016:
        r0.append(r2);	 Catch:{ NumberFormatException -> 0x0025 }
        r1 = r1 + 1;	 Catch:{ NumberFormatException -> 0x0025 }
        goto L_0x0006;	 Catch:{ NumberFormatException -> 0x0025 }
    L_0x001c:
        r4 = r0.toString();	 Catch:{ NumberFormatException -> 0x0025 }
        r4 = java.lang.Integer.parseInt(r4);	 Catch:{ NumberFormatException -> 0x0025 }
        return r4;
    L_0x0025:
        r4 = -1;
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.b.a.b.e.c(java.lang.String):int");
    }
}
