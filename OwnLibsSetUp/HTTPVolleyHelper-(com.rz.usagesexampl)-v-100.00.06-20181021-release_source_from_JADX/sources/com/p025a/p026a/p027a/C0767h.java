package com.p025a.p026a.p027a;

import com.p025a.p026a.C0422g;
import com.p025a.p026a.C0429n;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.a.a.a.h */
public class C0767h extends C0639a {
    /* renamed from: a */
    private final C0414b f2791a;
    /* renamed from: b */
    private final SSLSocketFactory f2792b;

    /* renamed from: com.a.a.a.h$a */
    static class C0413a extends FilterInputStream {
        /* renamed from: a */
        private final HttpURLConnection f1475a;

        C0413a(HttpURLConnection httpURLConnection) {
            super(C0767h.m3663b(httpURLConnection));
            this.f1475a = httpURLConnection;
        }

        public void close() {
            super.close();
            this.f1475a.disconnect();
        }
    }

    /* renamed from: com.a.a.a.h$b */
    public interface C0414b {
        /* renamed from: a */
        String m1647a(String str);
    }

    public C0767h() {
        this(null);
    }

    public C0767h(C0414b c0414b) {
        this(c0414b, null);
    }

    public C0767h(C0414b c0414b, SSLSocketFactory sSLSocketFactory) {
        this.f2791a = c0414b;
        this.f2792b = sSLSocketFactory;
    }

    /* renamed from: a */
    private HttpURLConnection m3658a(URL url, C0429n<?> c0429n) {
        HttpURLConnection a = m3666a(url);
        int r = c0429n.m1704r();
        a.setConnectTimeout(r);
        a.setReadTimeout(r);
        a.setUseCaches(false);
        a.setDoInput(true);
        if ("https".equals(url.getProtocol()) && this.f2792b != null) {
            ((HttpsURLConnection) a).setSSLSocketFactory(this.f2792b);
        }
        return a;
    }

    /* renamed from: a */
    static List<C0422g> m3659a(Map<String, List<String>> map) {
        List<C0422g> arrayList = new ArrayList(map.size());
        for (Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String c0422g : (List) entry.getValue()) {
                    arrayList.add(new C0422g((String) entry.getKey(), c0422g));
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    static void m3660a(java.net.HttpURLConnection r2, com.p025a.p026a.C0429n<?> r3) {
        /*
        r0 = r3.m1674a();
        switch(r0) {
            case -1: goto L_0x0030;
            case 0: goto L_0x002a;
            case 1: goto L_0x0021;
            case 2: goto L_0x001e;
            case 3: goto L_0x001b;
            case 4: goto L_0x0018;
            case 5: goto L_0x0015;
            case 6: goto L_0x0012;
            case 7: goto L_0x000f;
            default: goto L_0x0007;
        };
    L_0x0007:
        r2 = new java.lang.IllegalStateException;
        r3 = "Unknown method type.";
        r2.<init>(r3);
        throw r2;
    L_0x000f:
        r0 = "PATCH";
        goto L_0x0023;
    L_0x0012:
        r3 = "TRACE";
        goto L_0x002c;
    L_0x0015:
        r3 = "OPTIONS";
        goto L_0x002c;
    L_0x0018:
        r3 = "HEAD";
        goto L_0x002c;
    L_0x001b:
        r3 = "DELETE";
        goto L_0x002c;
    L_0x001e:
        r0 = "PUT";
        goto L_0x0023;
    L_0x0021:
        r0 = "POST";
    L_0x0023:
        r2.setRequestMethod(r0);
        com.p025a.p026a.p027a.C0767h.m3664b(r2, r3);
        goto L_0x003e;
    L_0x002a:
        r3 = "GET";
    L_0x002c:
        r2.setRequestMethod(r3);
        goto L_0x003e;
    L_0x0030:
        r0 = r3.m1696j();
        if (r0 == 0) goto L_0x003e;
    L_0x0036:
        r1 = "POST";
        r2.setRequestMethod(r1);
        com.p025a.p026a.p027a.C0767h.m3661a(r2, r3, r0);
    L_0x003e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.a.a.h.a(java.net.HttpURLConnection, com.a.a.n):void");
    }

    /* renamed from: a */
    private static void m3661a(HttpURLConnection httpURLConnection, C0429n<?> c0429n, byte[] bArr) {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", c0429n.m1699m());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    /* renamed from: a */
    private static boolean m3662a(int i, int i2) {
        return (i == 4 || ((100 <= i2 && i2 < 200) || i2 == 204 || i2 == 304)) ? false : true;
    }

    /* renamed from: b */
    private static java.io.InputStream m3663b(java.net.HttpURLConnection r1) {
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
        r0 = r1.getInputStream();	 Catch:{ IOException -> 0x0005 }
        goto L_0x0009;
    L_0x0005:
        r0 = r1.getErrorStream();
    L_0x0009:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.a.a.h.b(java.net.HttpURLConnection):java.io.InputStream");
    }

    /* renamed from: b */
    private static void m3664b(HttpURLConnection httpURLConnection, C0429n<?> c0429n) {
        byte[] n = c0429n.m1700n();
        if (n != null) {
            C0767h.m3661a(httpURLConnection, c0429n, n);
        }
    }

    /* renamed from: a */
    public C0411f mo534a(C0429n<?> c0429n, Map<String, String> map) {
        String a;
        String c = c0429n.m1689c();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(c0429n.mo536g());
        if (this.f2791a != null) {
            a = this.f2791a.m1647a(c);
            if (a == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("URL blocked by rewriter: ");
                stringBuilder.append(c);
                throw new IOException(stringBuilder.toString());
            }
        } else {
            a = c;
        }
        HttpURLConnection a2 = m3658a(new URL(a), (C0429n) c0429n);
        Object obj = null;
        try {
            for (String str : hashMap.keySet()) {
                a2.setRequestProperty(str, (String) hashMap.get(str));
            }
            C0767h.m3660a(a2, (C0429n) c0429n);
            int responseCode = a2.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            } else if (C0767h.m3662a(c0429n.m1674a(), responseCode)) {
                obj = 1;
                return new C0411f(responseCode, C0767h.m3659a(a2.getHeaderFields()), a2.getContentLength(), new C0413a(a2));
            } else {
                C0411f c0411f = new C0411f(responseCode, C0767h.m3659a(a2.getHeaderFields()));
                a2.disconnect();
                return c0411f;
            }
        } catch (Throwable th) {
            if (obj == null) {
                a2.disconnect();
            }
        }
    }

    /* renamed from: a */
    protected HttpURLConnection m3666a(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }
}
