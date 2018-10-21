package com.p025a.p026a.p027a;

import com.p025a.p026a.C0422g;
import com.p025a.p026a.C0440v;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TimeZone;
import java.util.TreeMap;

/* renamed from: com.a.a.a.e */
public class C0410e {
    /* renamed from: a */
    public static long m1635a(String str) {
        try {
            return C0410e.m1640a().parse(str).getTime();
        } catch (Throwable e) {
            C0440v.m1731a(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0;
        }
    }

    /* renamed from: a */
    public static com.p025a.p026a.C0417b.C0416a m1636a(com.p025a.p026a.C0425k r21) {
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
        r0 = r21;
        r1 = java.lang.System.currentTimeMillis();
        r3 = r0.f1508c;
        r4 = "Date";
        r4 = r3.get(r4);
        r4 = (java.lang.String) r4;
        if (r4 == 0) goto L_0x0017;
    L_0x0012:
        r7 = com.p025a.p026a.p027a.C0410e.m1635a(r4);
        goto L_0x0019;
    L_0x0017:
        r7 = 0;
    L_0x0019:
        r4 = "Cache-Control";
        r4 = r3.get(r4);
        r4 = (java.lang.String) r4;
        r10 = 0;
        if (r4 == 0) goto L_0x008b;
    L_0x0024:
        r11 = ",";
        r4 = r4.split(r11, r10);
        r11 = 0;
        r13 = 0;
        r14 = 0;
    L_0x002f:
        r9 = r4.length;
        if (r10 >= r9) goto L_0x0087;
    L_0x0032:
        r9 = r4[r10];
        r9 = r9.trim();
        r5 = "no-cache";
        r5 = r9.equals(r5);
        if (r5 != 0) goto L_0x0085;
    L_0x0040:
        r5 = "no-store";
        r5 = r9.equals(r5);
        if (r5 == 0) goto L_0x0049;
    L_0x0048:
        goto L_0x0085;
    L_0x0049:
        r5 = "max-age=";
        r5 = r9.startsWith(r5);
        if (r5 == 0) goto L_0x005d;
    L_0x0051:
        r5 = 8;
        r5 = r9.substring(r5);	 Catch:{ Exception -> 0x0082 }
        r5 = java.lang.Long.parseLong(r5);	 Catch:{ Exception -> 0x0082 }
        r11 = r5;
        goto L_0x0082;
    L_0x005d:
        r5 = "stale-while-revalidate=";
        r5 = r9.startsWith(r5);
        if (r5 == 0) goto L_0x0071;
    L_0x0065:
        r5 = 23;
        r5 = r9.substring(r5);	 Catch:{ Exception -> 0x0082 }
        r5 = java.lang.Long.parseLong(r5);	 Catch:{ Exception -> 0x0082 }
        r14 = r5;
        goto L_0x0082;
    L_0x0071:
        r5 = "must-revalidate";
        r5 = r9.equals(r5);
        if (r5 != 0) goto L_0x0081;
    L_0x0079:
        r5 = "proxy-revalidate";
        r5 = r9.equals(r5);
        if (r5 == 0) goto L_0x0082;
    L_0x0081:
        r13 = 1;
    L_0x0082:
        r10 = r10 + 1;
        goto L_0x002f;
    L_0x0085:
        r0 = 0;
        return r0;
    L_0x0087:
        r10 = r13;
        r16 = 1;
        goto L_0x0091;
    L_0x008b:
        r11 = 0;
        r14 = 0;
        r16 = 0;
    L_0x0091:
        r4 = "Expires";
        r4 = r3.get(r4);
        r4 = (java.lang.String) r4;
        if (r4 == 0) goto L_0x00a0;
    L_0x009b:
        r5 = com.p025a.p026a.p027a.C0410e.m1635a(r4);
        goto L_0x00a2;
    L_0x00a0:
        r5 = 0;
    L_0x00a2:
        r4 = "Last-Modified";
        r4 = r3.get(r4);
        r4 = (java.lang.String) r4;
        if (r4 == 0) goto L_0x00b3;
    L_0x00ac:
        r17 = com.p025a.p026a.p027a.C0410e.m1635a(r4);
        r19 = r17;
        goto L_0x00b5;
    L_0x00b3:
        r19 = 0;
    L_0x00b5:
        r4 = "ETag";
        r4 = r3.get(r4);
        r4 = (java.lang.String) r4;
        if (r16 == 0) goto L_0x00cd;
    L_0x00bf:
        r5 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r11 = r11 * r5;
        r1 = r1 + r11;
        if (r10 == 0) goto L_0x00c7;
    L_0x00c6:
        goto L_0x00dc;
    L_0x00c7:
        r14 = r14 * r5;
        r5 = 0;
        r14 = r14 + r1;
        r5 = r14;
        goto L_0x00dd;
    L_0x00cd:
        r9 = 0;
        r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));
        if (r11 <= 0) goto L_0x00db;
    L_0x00d3:
        r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r11 < 0) goto L_0x00db;
    L_0x00d7:
        r5 = r5 - r7;
        r5 = r5 + r1;
        r1 = r5;
        goto L_0x00dd;
    L_0x00db:
        r1 = r9;
    L_0x00dc:
        r5 = r1;
    L_0x00dd:
        r9 = new com.a.a.b$a;
        r9.<init>();
        r10 = r0.f1507b;
        r9.f1477a = r10;
        r9.f1478b = r4;
        r9.f1482f = r1;
        r9.f1481e = r5;
        r9.f1479c = r7;
        r1 = r19;
        r9.f1480d = r1;
        r9.f1483g = r3;
        r0 = r0.f1509d;
        r9.f1484h = r0;
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.a.a.e.a(com.a.a.k):com.a.a.b$a");
    }

    /* renamed from: a */
    static String m1637a(long j) {
        return C0410e.m1640a().format(new Date(j));
    }

    /* renamed from: a */
    public static String m1638a(Map<String, String> map) {
        return C0410e.m1639a(map, "ISO-8859-1");
    }

    /* renamed from: a */
    public static String m1639a(Map<String, String> map, String str) {
        String str2 = (String) map.get("Content-Type");
        if (str2 != null) {
            String[] split = str2.split(";", 0);
            for (int i = 1; i < split.length; i++) {
                String[] split2 = split[i].trim().split("=", 0);
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
        }
        return str;
    }

    /* renamed from: a */
    private static SimpleDateFormat m1640a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    /* renamed from: a */
    static Map<String, String> m1641a(List<C0422g> list) {
        Map<String, String> treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (C0422g c0422g : list) {
            treeMap.put(c0422g.m1659a(), c0422g.m1660b());
        }
        return treeMap;
    }

    /* renamed from: b */
    static List<C0422g> m1642b(Map<String, String> map) {
        List<C0422g> arrayList = new ArrayList(map.size());
        for (Entry entry : map.entrySet()) {
            arrayList.add(new C0422g((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }
}
