package com.p028b.p029a.p031b.p032a;

import com.p028b.p029a.C0482f;
import com.p028b.p029a.C0492v;
import com.p028b.p029a.C0493w;
import com.p028b.p029a.p031b.C0460e;
import com.p028b.p029a.p031b.C0470j;
import com.p028b.p029a.p035c.C0475a;
import com.p028b.p029a.p036d.C0477a;
import com.p028b.p029a.p036d.C0478b;
import com.p028b.p029a.p036d.C0479c;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: com.b.a.b.a.c */
public final class C0657c extends C0492v<Date> {
    /* renamed from: a */
    public static final C0493w f2455a = new C06561();
    /* renamed from: b */
    private final List<DateFormat> f2456b = new ArrayList();

    /* renamed from: com.b.a.b.a.c$1 */
    static class C06561 implements C0493w {
        C06561() {
        }

        /* renamed from: a */
        public <T> C0492v<T> mo362a(C0482f c0482f, C0475a<T> c0475a) {
            return c0475a.m1822a() == Date.class ? new C0657c() : null;
        }
    }

    public C0657c() {
        this.f2456b.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f2456b.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C0460e.m1787b()) {
            this.f2456b.add(C0470j.m1807a(2, 2));
        }
    }

    /* renamed from: a */
    private synchronized java.util.Date m3014a(java.lang.String r3) {
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
        r2 = this;
        monitor-enter(r2);
        r0 = r2.f2456b;	 Catch:{ all -> 0x002c }
        r0 = r0.iterator();	 Catch:{ all -> 0x002c }
    L_0x0007:
        r1 = r0.hasNext();	 Catch:{ all -> 0x002c }
        if (r1 == 0) goto L_0x0019;	 Catch:{ all -> 0x002c }
    L_0x000d:
        r1 = r0.next();	 Catch:{ all -> 0x002c }
        r1 = (java.text.DateFormat) r1;	 Catch:{ all -> 0x002c }
        r1 = r1.parse(r3);	 Catch:{ ParseException -> 0x0007 }
        monitor-exit(r2);
        return r1;
    L_0x0019:
        r0 = new java.text.ParsePosition;	 Catch:{ ParseException -> 0x0025 }
        r1 = 0;	 Catch:{ ParseException -> 0x0025 }
        r0.<init>(r1);	 Catch:{ ParseException -> 0x0025 }
        r0 = com.p028b.p029a.p031b.p032a.p033a.C0446a.m1746a(r3, r0);	 Catch:{ ParseException -> 0x0025 }
        monitor-exit(r2);
        return r0;
    L_0x0025:
        r0 = move-exception;
        r1 = new com.b.a.t;	 Catch:{ all -> 0x002c }
        r1.<init>(r3, r0);	 Catch:{ all -> 0x002c }
        throw r1;	 Catch:{ all -> 0x002c }
    L_0x002c:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.b.a.b.a.c.a(java.lang.String):java.util.Date");
    }

    /* renamed from: a */
    public Date m3015a(C0477a c0477a) {
        if (c0477a.mo369f() != C0478b.NULL) {
            return m3014a(c0477a.mo371h());
        }
        c0477a.mo373j();
        return null;
    }

    /* renamed from: a */
    public synchronized void m3017a(C0479c c0479c, Date date) {
        if (date == null) {
            c0479c.mo393f();
        } else {
            c0479c.mo388b(((DateFormat) this.f2456b.get(0)).format(date));
        }
    }

    /* renamed from: b */
    public /* synthetic */ Object mo361b(C0477a c0477a) {
        return m3015a(c0477a);
    }
}
