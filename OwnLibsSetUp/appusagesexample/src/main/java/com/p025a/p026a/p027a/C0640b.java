package com.p025a.p026a.p027a;

import com.p025a.p026a.C0417b.C0416a;
import com.p025a.p026a.C0422g;
import com.p025a.p026a.C0423h;
import com.p025a.p026a.C0429n;
import com.p025a.p026a.C0436r;
import com.p025a.p026a.C0437u;
import com.p025a.p026a.C0440v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: com.a.a.a.b */
public class C0640b implements C0423h {
    /* renamed from: a */
    protected static final boolean f2429a = C0440v.f1558b;
    @Deprecated
    /* renamed from: b */
    protected final C0412g f2430b;
    /* renamed from: c */
    protected final C0407c f2431c;
    /* renamed from: d */
    private final C0639a f2432d;

    public C0640b(C0639a c0639a) {
        this(c0639a, new C0407c(4096));
    }

    public C0640b(C0639a c0639a, C0407c c0407c) {
        this.f2432d = c0639a;
        this.f2430b = c0639a;
        this.f2431c = c0407c;
    }

    /* renamed from: a */
    private static List<C0422g> m2958a(List<C0422g> list, C0416a c0416a) {
        Set treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            for (C0422g a : list) {
                treeSet.add(a.m1659a());
            }
        }
        List<C0422g> arrayList = new ArrayList(list);
        if (c0416a.f1484h != null) {
            if (!c0416a.f1484h.isEmpty()) {
                for (C0422g c0422g : c0416a.f1484h) {
                    if (!treeSet.contains(c0422g.m1659a())) {
                        arrayList.add(c0422g);
                    }
                }
            }
        } else if (!c0416a.f1483g.isEmpty()) {
            for (Entry entry : c0416a.f1483g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new C0422g((String) entry.getKey(), (String) entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private Map<String, String> m2959a(C0416a c0416a) {
        if (c0416a == null) {
            return Collections.emptyMap();
        }
        Map<String, String> hashMap = new HashMap();
        if (c0416a.f1478b != null) {
            hashMap.put("If-None-Match", c0416a.f1478b);
        }
        if (c0416a.f1480d > 0) {
            hashMap.put("If-Modified-Since", C0410e.m1637a(c0416a.f1480d));
        }
        return hashMap;
    }

    /* renamed from: a */
    private void m2960a(long j, C0429n<?> c0429n, byte[] bArr, int i) {
        if (f2429a || j > 3000) {
            String str = "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]";
            Object[] objArr = new Object[5];
            objArr[0] = c0429n;
            objArr[1] = Long.valueOf(j);
            objArr[2] = bArr != null ? Integer.valueOf(bArr.length) : "null";
            objArr[3] = Integer.valueOf(i);
            objArr[4] = Integer.valueOf(c0429n.m1705s().mo356b());
            C0440v.m1732b(str, objArr);
        }
    }

    /* renamed from: a */
    private static void m2961a(String str, C0429n<?> c0429n, C0437u c0437u) {
        C0436r s = c0429n.m1705s();
        int r = c0429n.m1704r();
        try {
            s.mo355a(c0437u);
            c0429n.m1685a(String.format("%s-retry [timeout=%s]", new Object[]{str, Integer.valueOf(r)}));
        } catch (C0437u c0437u2) {
            c0429n.m1685a(String.format("%s-timeout-giveup [timeout=%s]", new Object[]{str, Integer.valueOf(r)}));
            throw c0437u2;
        }
    }

    /* renamed from: a */
    private byte[] m2962a(java.io.InputStream r6, int r7) {
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
        r5 = this;
        r0 = new com.a.a.a.i;
        r1 = r5.f2431c;
        r0.<init>(r1, r7);
        r7 = 0;
        r1 = 0;
        if (r6 == 0) goto L_0x003d;
    L_0x000b:
        r2 = r5.f2431c;	 Catch:{ all -> 0x0043 }
        r3 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;	 Catch:{ all -> 0x0043 }
        r2 = r2.m1629a(r3);	 Catch:{ all -> 0x0043 }
    L_0x0013:
        r1 = r6.read(r2);	 Catch:{ all -> 0x0038 }
        r3 = -1;	 Catch:{ all -> 0x0038 }
        if (r1 == r3) goto L_0x001e;	 Catch:{ all -> 0x0038 }
    L_0x001a:
        r0.write(r2, r7, r1);	 Catch:{ all -> 0x0038 }
        goto L_0x0013;	 Catch:{ all -> 0x0038 }
    L_0x001e:
        r1 = r0.toByteArray();	 Catch:{ all -> 0x0038 }
        if (r6 == 0) goto L_0x002f;
    L_0x0024:
        r6.close();	 Catch:{ IOException -> 0x0028 }
        goto L_0x002f;
    L_0x0028:
        r6 = "Error occurred when closing InputStream";
        r7 = new java.lang.Object[r7];
        com.p025a.p026a.C0440v.m1730a(r6, r7);
    L_0x002f:
        r6 = r5.f2431c;
        r6.m1628a(r2);
        r0.close();
        return r1;
    L_0x0038:
        r1 = move-exception;
        r4 = r2;
        r2 = r1;
        r1 = r4;
        goto L_0x0044;
    L_0x003d:
        r2 = new com.a.a.s;	 Catch:{ all -> 0x0043 }
        r2.<init>();	 Catch:{ all -> 0x0043 }
        throw r2;	 Catch:{ all -> 0x0043 }
    L_0x0043:
        r2 = move-exception;
    L_0x0044:
        if (r6 == 0) goto L_0x0051;
    L_0x0046:
        r6.close();	 Catch:{ IOException -> 0x004a }
        goto L_0x0051;
    L_0x004a:
        r6 = new java.lang.Object[r7];
        r7 = "Error occurred when closing InputStream";
        com.p025a.p026a.C0440v.m1730a(r7, r6);
    L_0x0051:
        r6 = r5.f2431c;
        r6.m1628a(r1);
        r0.close();
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.a.a.b.a(java.io.InputStream, int):byte[]");
    }

    /* renamed from: a */
    public com.p025a.p026a.C0425k mo345a(com.p025a.p026a.C0429n<?> r29) {
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
        r28 = this;
        r7 = r28;
        r8 = r29;
        r9 = android.os.SystemClock.elapsedRealtime();
    L_0x0008:
        r1 = java.util.Collections.emptyList();
        r11 = 0;
        r2 = 0;
        r0 = r29.m1691e();	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x00be }
        r0 = r7.m2959a(r0);	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x00be }
        r3 = r7.f2432d;	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x00be }
        r12 = r3.mo534a(r8, r0);	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x00be }
        r14 = r12.m1643a();	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x00b9 }
        r13 = r12.m1644b();	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x00b9 }
        r0 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        if (r14 != r0) goto L_0x0065;
    L_0x0028:
        r0 = r29.m1691e();	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x005f }
        if (r0 != 0) goto L_0x0044;	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x005f }
    L_0x002e:
        r0 = new com.a.a.k;	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x005f }
        r16 = 304; // 0x130 float:4.26E-43 double:1.5E-321;	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x005f }
        r17 = 0;	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x005f }
        r18 = 1;	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x005f }
        r3 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x005f }
        r1 = 0;	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x005f }
        r19 = r3 - r9;	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x005f }
        r15 = r0;	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x005f }
        r21 = r13;	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x005f }
        r15.<init>(r16, r17, r18, r19, r21);	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x005f }
        return r0;	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x005f }
    L_0x0044:
        r27 = com.p025a.p026a.p027a.C0640b.m2958a(r13, r0);	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x005f }
        r1 = new com.a.a.k;	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x005f }
        r22 = 304; // 0x130 float:4.26E-43 double:1.5E-321;	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x005f }
        r0 = r0.f1477a;	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x005f }
        r24 = 1;	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x005f }
        r3 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x005f }
        r5 = 0;	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x005f }
        r25 = r3 - r9;	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x005f }
        r21 = r1;	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x005f }
        r23 = r0;	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x005f }
        r21.<init>(r22, r23, r24, r25, r27);	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x005f }
        return r1;
    L_0x005f:
        r0 = move-exception;
        r15 = r2;
        r19 = r13;
        goto L_0x00c3;
    L_0x0065:
        r0 = r12.m1646d();	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x00b6 }
        if (r0 == 0) goto L_0x0074;
    L_0x006b:
        r1 = r12.m1645c();	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x005f }
        r0 = r7.m2962a(r0, r1);	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x005f }
        goto L_0x0076;
    L_0x0074:
        r0 = new byte[r11];	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x00b6 }
    L_0x0076:
        r20 = r0;
        r0 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x00af }
        r2 = 0;	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x00af }
        r2 = r0 - r9;	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x00af }
        r1 = r28;	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x00af }
        r4 = r29;	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x00af }
        r5 = r20;	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x00af }
        r6 = r14;	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x00af }
        r1.m2960a(r2, r4, r5, r6);	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x00af }
        r0 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x00af }
        if (r14 < r0) goto L_0x00a6;	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x00af }
    L_0x008d:
        r0 = 299; // 0x12b float:4.19E-43 double:1.477E-321;	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x00af }
        if (r14 > r0) goto L_0x00a6;	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x00af }
    L_0x0091:
        r0 = new com.a.a.k;	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x00af }
        r16 = 0;	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x00af }
        r1 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x00af }
        r3 = 0;
        r17 = r1 - r9;
        r1 = r13;
        r13 = r0;
        r15 = r20;
        r19 = r1;
        r13.<init>(r14, r15, r16, r17, r19);	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x00ad }
        return r0;	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x00ad }
    L_0x00a6:
        r1 = r13;	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x00ad }
        r0 = new java.io.IOException;	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x00ad }
        r0.<init>();	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x00ad }
        throw r0;	 Catch:{ SocketTimeoutException -> 0x015f, MalformedURLException -> 0x0143, IOException -> 0x00ad }
    L_0x00ad:
        r0 = move-exception;
        goto L_0x00b1;
    L_0x00af:
        r0 = move-exception;
        r1 = r13;
    L_0x00b1:
        r19 = r1;
        r15 = r20;
        goto L_0x00c3;
    L_0x00b6:
        r0 = move-exception;
        r1 = r13;
        goto L_0x00ba;
    L_0x00b9:
        r0 = move-exception;
    L_0x00ba:
        r19 = r1;
        r15 = r2;
        goto L_0x00c3;
    L_0x00be:
        r0 = move-exception;
        r19 = r1;
        r12 = r2;
        r15 = r12;
    L_0x00c3:
        if (r12 == 0) goto L_0x013d;
    L_0x00c5:
        r0 = r12.m1643a();
        r1 = "Unexpected response code %d for %s";
        r2 = 2;
        r2 = new java.lang.Object[r2];
        r3 = java.lang.Integer.valueOf(r0);
        r2[r11] = r3;
        r3 = 1;
        r4 = r29.m1689c();
        r2[r3] = r4;
        com.p025a.p026a.C0440v.m1733c(r1, r2);
        if (r15 == 0) goto L_0x0135;
    L_0x00e0:
        r1 = new com.a.a.k;
        r16 = 0;
        r2 = android.os.SystemClock.elapsedRealtime();
        r17 = r2 - r9;
        r13 = r1;
        r14 = r0;
        r13.<init>(r14, r15, r16, r17, r19);
        r2 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        if (r0 == r2) goto L_0x0129;
    L_0x00f3:
        r2 = 403; // 0x193 float:5.65E-43 double:1.99E-321;
        if (r0 != r2) goto L_0x00f8;
    L_0x00f7:
        goto L_0x0129;
    L_0x00f8:
        r2 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        if (r0 < r2) goto L_0x0107;
    L_0x00fc:
        r2 = 499; // 0x1f3 float:6.99E-43 double:2.465E-321;
        if (r0 <= r2) goto L_0x0101;
    L_0x0100:
        goto L_0x0107;
    L_0x0101:
        r0 = new com.a.a.d;
        r0.<init>(r1);
        throw r0;
    L_0x0107:
        r2 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        if (r0 < r2) goto L_0x0123;
    L_0x010b:
        r2 = 599; // 0x257 float:8.4E-43 double:2.96E-321;
        if (r0 > r2) goto L_0x0123;
    L_0x010f:
        r0 = r29.m1702p();
        if (r0 == 0) goto L_0x011d;
    L_0x0115:
        r0 = "server";
        r2 = new com.a.a.s;
        r2.<init>(r1);
        goto L_0x0130;
    L_0x011d:
        r0 = new com.a.a.s;
        r0.<init>(r1);
        throw r0;
    L_0x0123:
        r0 = new com.a.a.s;
        r0.<init>(r1);
        throw r0;
    L_0x0129:
        r0 = "auth";
        r2 = new com.a.a.a;
        r2.<init>(r1);
    L_0x0130:
        com.p025a.p026a.p027a.C0640b.m2961a(r0, r8, r2);
        goto L_0x0008;
    L_0x0135:
        r0 = "network";
        r1 = new com.a.a.j;
        r1.<init>();
        goto L_0x0166;
    L_0x013d:
        r1 = new com.a.a.l;
        r1.<init>(r0);
        throw r1;
    L_0x0143:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Bad URL ";
        r2.append(r3);
        r3 = r29.m1689c();
        r2.append(r3);
        r2 = r2.toString();
        r1.<init>(r2, r0);
        throw r1;
    L_0x015f:
        r0 = "socket";
        r1 = new com.a.a.t;
        r1.<init>();
    L_0x0166:
        com.p025a.p026a.p027a.C0640b.m2961a(r0, r8, r1);
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.a.a.b.a(com.a.a.n):com.a.a.k");
    }
}
