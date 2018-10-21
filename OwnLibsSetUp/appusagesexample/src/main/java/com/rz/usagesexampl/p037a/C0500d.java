package com.rz.usagesexampl.p037a;

import android.content.Context;
import com.p025a.p026a.C0425k;
import com.p025a.p026a.C0431o;
import com.p025a.p026a.C0434p;
import com.p025a.p026a.C0434p.C0432a;
import com.p025a.p026a.C0434p.C0433b;
import com.p025a.p026a.C0437u;
import com.p025a.p026a.C0648m;
import com.p025a.p026a.p027a.C0410e;
import com.p025a.p026a.p027a.C0640b;
import com.p025a.p026a.p027a.C0641d;
import com.p025a.p026a.p027a.C0642j;
import com.p025a.p026a.p027a.C0767h;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.rz.usagesexampl.a.d */
public class C0500d {
    /* renamed from: b */
    private static C0500d f1753b;
    /* renamed from: a */
    private Context f1754a;
    /* renamed from: c */
    private C0431o f1755c;
    /* renamed from: d */
    private C0498a f1756d;
    /* renamed from: e */
    private HashMap<String, String> f1757e = null;
    /* renamed from: f */
    private HashMap<String, String> f1758f = null;
    /* renamed from: g */
    private String f1759g = null;

    /* renamed from: com.rz.usagesexampl.a.d$a */
    public interface C0498a {
        /* renamed from: a */
        void mo413a(C0437u c0437u);

        /* renamed from: a */
        void mo414a(C0437u c0437u, String str, String str2);

        /* renamed from: a */
        void mo415a(String str);
    }

    /* renamed from: com.rz.usagesexampl.a.d$b */
    public enum C0499b {
        GET(0),
        POST(1);
        
        /* renamed from: c */
        private final int f1752c;

        private C0499b(int i) {
            this.f1752c = i;
        }

        /* renamed from: a */
        public int m1939a() {
            return this.f1752c;
        }
    }

    /* renamed from: com.rz.usagesexampl.a.d$1 */
    class C07251 implements C0433b<String> {
        /* renamed from: a */
        final /* synthetic */ C0500d f2588a;

        C07251(C0500d c0500d) {
            this.f2588a = c0500d;
        }

        /* renamed from: a */
        public void m3319a(java.lang.String r4) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/1763344271.run(Unknown Source)
*/
            /*
            r3 = this;
            r0 = 1;
            r0 = new java.lang.Object[r0];
            r1 = "utf-8";
            r2 = 0;
            r0[r2] = r1;
            com.p025a.p026a.C0440v.m1734d(r4, r0);
            r0 = r4.toString();	 Catch:{ UnsupportedEncodingException -> 0x001d }
            r1 = "ISO-8859-1";	 Catch:{ UnsupportedEncodingException -> 0x001d }
            r0 = r0.getBytes(r1);	 Catch:{ UnsupportedEncodingException -> 0x001d }
            r1 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x001d }
            r2 = "UTF-8";	 Catch:{ UnsupportedEncodingException -> 0x001d }
            r1.<init>(r0, r2);	 Catch:{ UnsupportedEncodingException -> 0x001d }
            r4 = r1;
        L_0x001d:
            r0 = r3.f2588a;
            r0 = r0.f1756d;
            if (r0 == 0) goto L_0x002e;
        L_0x0025:
            r0 = r3.f2588a;
            r0 = r0.f1756d;
            r0.mo415a(r4);
        L_0x002e:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.rz.usagesexampl.a.d.1.a(java.lang.String):void");
        }
    }

    /* renamed from: com.rz.usagesexampl.a.d$2 */
    class C07262 implements C0432a {
        /* renamed from: a */
        final /* synthetic */ C0500d f2589a;

        C07262(C0500d c0500d) {
            this.f2589a = c0500d;
        }

        /* renamed from: a */
        public void mo417a(C0437u c0437u) {
            this.f2589a.m1942a(c0437u);
        }
    }

    public C0500d(Context context) {
        this.f1754a = context;
        this.f1755c = m1947a();
    }

    /* renamed from: a */
    private void m1942a(com.p025a.p026a.C0437u r6) {
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
        r0 = "";
        r1 = "";
        r2 = r6.f1549a;
        if (r2 == 0) goto L_0x002b;
    L_0x0008:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = r6.f1549a;
        r2 = r2.f1506a;
        r1.append(r2);
        r2 = "";
        r1.append(r2);
        r1 = r1.toString();
        r2 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x002a }
        r3 = r6.f1549a;	 Catch:{ UnsupportedEncodingException -> 0x002a }
        r3 = r3.f1507b;	 Catch:{ UnsupportedEncodingException -> 0x002a }
        r4 = "UTF-8";	 Catch:{ UnsupportedEncodingException -> 0x002a }
        r2.<init>(r3, r4);	 Catch:{ UnsupportedEncodingException -> 0x002a }
        r0 = r2;
        goto L_0x002b;
    L_0x002b:
        r2 = r5.f1756d;
        if (r2 == 0) goto L_0x0039;
    L_0x002f:
        r2 = r5.f1756d;
        r2.mo413a(r6);
        r2 = r5.f1756d;
        r2.mo414a(r6, r1, r0);
    L_0x0039:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rz.usagesexampl.a.d.a(com.a.a.u):void");
    }

    /* renamed from: a */
    public C0431o m1947a() {
        if (this.f1755c == null) {
            this.f1755c = new C0431o(new C0641d(this.f1754a.getCacheDir(), 10485760), new C0640b(new C0767h()));
            this.f1755c.m1711a();
        }
        return this.f1755c;
    }

    /* renamed from: a */
    public C0500d m1948a(C0498a c0498a) {
        this.f1756d = c0498a;
        return this;
    }

    /* renamed from: a */
    public C0500d m1949a(String str) {
        this.f1759g = str;
        return this;
    }

    /* renamed from: a */
    public C0500d m1950a(HashMap<String, String> hashMap) {
        this.f1757e = hashMap;
        return this;
    }

    /* renamed from: a */
    public void m1951a(C0499b c0499b) {
        HashMap hashMap = this.f1758f;
        this.f1755c.m1710a(new C0642j(this, c0499b.m1939a(), this.f1759g, new C07251(this), new C07262(this)) {
            /* renamed from: a */
            final /* synthetic */ C0500d f2793a;

            /* renamed from: a */
            protected C0434p<String> mo349a(C0425k c0425k) {
                C0437u c0648m;
                try {
                    return C0434p.m1718a(new String(c0425k.f1507b, C0410e.m1638a(c0425k.f1508c)), C0410e.m1636a(c0425k));
                } catch (Throwable e) {
                    c0648m = new C0648m(e);
                    return C0434p.m1717a(c0648m);
                } catch (Throwable e2) {
                    c0648m = new C0648m(e2);
                    return C0434p.m1717a(c0648m);
                }
            }

            /* renamed from: g */
            public Map<String, String> mo536g() {
                if (this.f2793a.f1757e == null) {
                    this.f2793a.f1757e = new HashMap();
                    return this.f2793a.f1757e;
                }
                this.f2793a.f1757e.put("Content-Type", "application/x-www-form-urlencoded");
                return new TreeMap(this.f2793a.f1757e);
            }

            /* renamed from: k */
            protected Map<String, String> mo537k() {
                if (this.f2793a.f1758f == null) {
                    this.f2793a.f1758f = new HashMap();
                }
                return new TreeMap(this.f2793a.f1758f);
            }
        });
        this.f1755c.m1711a();
    }

    /* renamed from: b */
    public C0500d m1952b(HashMap<String, String> hashMap) {
        this.f1758f = hashMap;
        return this;
    }
}
