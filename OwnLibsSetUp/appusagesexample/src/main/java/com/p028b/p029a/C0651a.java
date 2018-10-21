package com.p028b.p029a;

import com.p028b.p029a.p031b.C0460e;
import com.p028b.p029a.p031b.C0470j;
import com.p028b.p029a.p036d.C0477a;
import com.p028b.p029a.p036d.C0478b;
import com.p028b.p029a.p036d.C0479c;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: com.b.a.a */
final class C0651a extends C0492v<Date> {
    /* renamed from: a */
    private final Class<? extends Date> f2447a;
    /* renamed from: b */
    private final List<DateFormat> f2448b = new ArrayList();

    public C0651a(Class<? extends Date> cls, int i, int i2) {
        this.f2447a = C0651a.m2999a((Class) cls);
        this.f2448b.add(DateFormat.getDateTimeInstance(i, i2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f2448b.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (C0460e.m1787b()) {
            this.f2448b.add(C0470j.m1807a(i, i2));
        }
    }

    C0651a(Class<? extends Date> cls, String str) {
        this.f2447a = C0651a.m2999a((Class) cls);
        this.f2448b.add(new SimpleDateFormat(str, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f2448b.add(new SimpleDateFormat(str));
        }
    }

    /* renamed from: a */
    private static Class<? extends Date> m2999a(Class<? extends Date> cls) {
        if (!(cls == Date.class || cls == java.sql.Date.class)) {
            if (cls != Timestamp.class) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Date type must be one of ");
                stringBuilder.append(Date.class);
                stringBuilder.append(", ");
                stringBuilder.append(Timestamp.class);
                stringBuilder.append(", or ");
                stringBuilder.append(java.sql.Date.class);
                stringBuilder.append(" but was ");
                stringBuilder.append(cls);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return cls;
    }

    /* renamed from: a */
    private java.util.Date m3000a(java.lang.String r4) {
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
        r3 = this;
        r0 = r3.f2448b;
        monitor-enter(r0);
        r1 = r3.f2448b;	 Catch:{ all -> 0x002e }
        r1 = r1.iterator();	 Catch:{ all -> 0x002e }
    L_0x0009:
        r2 = r1.hasNext();	 Catch:{ all -> 0x002e }
        if (r2 == 0) goto L_0x001b;	 Catch:{ all -> 0x002e }
    L_0x000f:
        r2 = r1.next();	 Catch:{ all -> 0x002e }
        r2 = (java.text.DateFormat) r2;	 Catch:{ all -> 0x002e }
        r2 = r2.parse(r4);	 Catch:{ ParseException -> 0x0009 }
        monitor-exit(r0);	 Catch:{ all -> 0x002e }
        return r2;
    L_0x001b:
        r1 = new java.text.ParsePosition;	 Catch:{ ParseException -> 0x0027 }
        r2 = 0;	 Catch:{ ParseException -> 0x0027 }
        r1.<init>(r2);	 Catch:{ ParseException -> 0x0027 }
        r1 = com.p028b.p029a.p031b.p032a.p033a.C0446a.m1746a(r4, r1);	 Catch:{ ParseException -> 0x0027 }
        monitor-exit(r0);	 Catch:{ all -> 0x002e }
        return r1;	 Catch:{ all -> 0x002e }
    L_0x0027:
        r1 = move-exception;	 Catch:{ all -> 0x002e }
        r2 = new com.b.a.t;	 Catch:{ all -> 0x002e }
        r2.<init>(r4, r1);	 Catch:{ all -> 0x002e }
        throw r2;	 Catch:{ all -> 0x002e }
    L_0x002e:
        r4 = move-exception;	 Catch:{ all -> 0x002e }
        monitor-exit(r0);	 Catch:{ all -> 0x002e }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.b.a.a.a(java.lang.String):java.util.Date");
    }

    /* renamed from: a */
    public Date m3001a(C0477a c0477a) {
        if (c0477a.mo369f() == C0478b.NULL) {
            c0477a.mo373j();
            return null;
        }
        Date a = m3000a(c0477a.mo371h());
        if (this.f2447a == Date.class) {
            return a;
        }
        if (this.f2447a == Timestamp.class) {
            return new Timestamp(a.getTime());
        }
        if (this.f2447a == java.sql.Date.class) {
            return new java.sql.Date(a.getTime());
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public void m3003a(C0479c c0479c, Date date) {
        if (date == null) {
            c0479c.mo393f();
            return;
        }
        synchronized (this.f2448b) {
            c0479c.mo388b(((DateFormat) this.f2448b.get(0)).format(date));
        }
    }

    /* renamed from: b */
    public /* synthetic */ Object mo361b(C0477a c0477a) {
        return m3001a(c0477a);
    }

    public String toString() {
        StringBuilder stringBuilder;
        String toPattern;
        DateFormat dateFormat = (DateFormat) this.f2448b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("DefaultDateTypeAdapter(");
            toPattern = ((SimpleDateFormat) dateFormat).toPattern();
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("DefaultDateTypeAdapter(");
            toPattern = dateFormat.getClass().getSimpleName();
        }
        stringBuilder.append(toPattern);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}
