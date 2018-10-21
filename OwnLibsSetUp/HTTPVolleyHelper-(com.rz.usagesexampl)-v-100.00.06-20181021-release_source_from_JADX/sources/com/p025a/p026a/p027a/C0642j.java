package com.p025a.p026a.p027a;

import com.p025a.p026a.C0429n;
import com.p025a.p026a.C0434p.C0432a;
import com.p025a.p026a.C0434p.C0433b;

/* renamed from: com.a.a.a.j */
public class C0642j extends C0429n<String> {
    /* renamed from: a */
    private final Object f2437a = new Object();
    /* renamed from: b */
    private C0433b<String> f2438b;

    public C0642j(int i, String str, C0433b<String> c0433b, C0432a c0432a) {
        super(i, str, c0432a);
        this.f2438b = c0433b;
    }

    /* renamed from: a */
    protected com.p025a.p026a.C0434p<java.lang.String> mo349a(com.p025a.p026a.C0425k r4) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/1763344271.run(Unknown Source)
*/
        /*
        r3 = this;
        r0 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x000e }
        r1 = r4.f1507b;	 Catch:{ UnsupportedEncodingException -> 0x000e }
        r2 = r4.f1508c;	 Catch:{ UnsupportedEncodingException -> 0x000e }
        r2 = com.p025a.p026a.p027a.C0410e.m1638a(r2);	 Catch:{ UnsupportedEncodingException -> 0x000e }
        r0.<init>(r1, r2);	 Catch:{ UnsupportedEncodingException -> 0x000e }
        goto L_0x0015;
    L_0x000e:
        r0 = new java.lang.String;
        r1 = r4.f1507b;
        r0.<init>(r1);
    L_0x0015:
        r4 = com.p025a.p026a.p027a.C0410e.m1636a(r4);
        r4 = com.p025a.p026a.C0434p.m1718a(r0, r4);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.a.a.j.a(com.a.a.k):com.a.a.p<java.lang.String>");
    }

    /* renamed from: a */
    protected /* synthetic */ void mo350a(Object obj) {
        mo351c((String) obj);
    }

    /* renamed from: c */
    protected void mo351c(String str) {
        synchronized (this.f2437a) {
            C0433b c0433b = this.f2438b;
        }
        if (c0433b != null) {
            c0433b.mo416a(str);
        }
    }
}
