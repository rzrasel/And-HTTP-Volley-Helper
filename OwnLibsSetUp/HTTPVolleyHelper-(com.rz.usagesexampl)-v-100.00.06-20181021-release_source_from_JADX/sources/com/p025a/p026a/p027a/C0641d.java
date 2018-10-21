package com.p025a.p026a.p027a;

import android.os.SystemClock;
import android.text.TextUtils;
import com.p025a.p026a.C0417b;
import com.p025a.p026a.C0417b.C0416a;
import com.p025a.p026a.C0422g;
import com.p025a.p026a.C0440v;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.a.a.a.d */
public class C0641d implements C0417b {
    /* renamed from: a */
    private final Map<String, C0408a> f2433a = new LinkedHashMap(16, 0.75f, true);
    /* renamed from: b */
    private long f2434b = 0;
    /* renamed from: c */
    private final File f2435c;
    /* renamed from: d */
    private final int f2436d;

    /* renamed from: com.a.a.a.d$a */
    static class C0408a {
        /* renamed from: a */
        long f1461a;
        /* renamed from: b */
        final String f1462b;
        /* renamed from: c */
        final String f1463c;
        /* renamed from: d */
        final long f1464d;
        /* renamed from: e */
        final long f1465e;
        /* renamed from: f */
        final long f1466f;
        /* renamed from: g */
        final long f1467g;
        /* renamed from: h */
        final List<C0422g> f1468h;

        C0408a(String str, C0416a c0416a) {
            this(str, c0416a.f1478b, c0416a.f1479c, c0416a.f1480d, c0416a.f1481e, c0416a.f1482f, C0408a.m1631a(c0416a));
            this.f1461a = (long) c0416a.f1477a.length;
        }

        private C0408a(String str, String str2, long j, long j2, long j3, long j4, List<C0422g> list) {
            this.f1462b = str;
            if ("".equals(str2)) {
                str2 = null;
            }
            this.f1463c = str2;
            this.f1464d = j;
            this.f1465e = j2;
            this.f1466f = j3;
            this.f1467g = j4;
            this.f1468h = list;
        }

        /* renamed from: a */
        static C0408a m1630a(C0409b c0409b) {
            if (C0641d.m2964a((InputStream) c0409b) == 538247942) {
                return new C0408a(C0641d.m2965a(c0409b), C0641d.m2965a(c0409b), C0641d.m2973b((InputStream) c0409b), C0641d.m2973b((InputStream) c0409b), C0641d.m2973b((InputStream) c0409b), C0641d.m2973b((InputStream) c0409b), C0641d.m2974b(c0409b));
            }
            throw new IOException();
        }

        /* renamed from: a */
        private static List<C0422g> m1631a(C0416a c0416a) {
            return c0416a.f1484h != null ? c0416a.f1484h : C0410e.m1642b(c0416a.f1483g);
        }

        /* renamed from: a */
        C0416a m1632a(byte[] bArr) {
            C0416a c0416a = new C0416a();
            c0416a.f1477a = bArr;
            c0416a.f1478b = this.f1463c;
            c0416a.f1479c = this.f1464d;
            c0416a.f1480d = this.f1465e;
            c0416a.f1481e = this.f1466f;
            c0416a.f1482f = this.f1467g;
            c0416a.f1483g = C0410e.m1641a(this.f1468h);
            c0416a.f1484h = Collections.unmodifiableList(this.f1468h);
            return c0416a;
        }

        /* renamed from: a */
        boolean m1633a(OutputStream outputStream) {
            try {
                C0641d.m2967a(outputStream, 538247942);
                C0641d.m2969a(outputStream, this.f1462b);
                C0641d.m2969a(outputStream, this.f1463c == null ? "" : this.f1463c);
                C0641d.m2968a(outputStream, this.f1464d);
                C0641d.m2968a(outputStream, this.f1465e);
                C0641d.m2968a(outputStream, this.f1466f);
                C0641d.m2968a(outputStream, this.f1467g);
                C0641d.m2971a(this.f1468h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e) {
                C0440v.m1732b("%s", e.toString());
                return false;
            }
        }
    }

    /* renamed from: com.a.a.a.d$b */
    static class C0409b extends FilterInputStream {
        /* renamed from: a */
        private final long f1469a;
        /* renamed from: b */
        private long f1470b;

        C0409b(InputStream inputStream, long j) {
            super(inputStream);
            this.f1469a = j;
        }

        /* renamed from: a */
        long m1634a() {
            return this.f1469a - this.f1470b;
        }

        public int read() {
            int read = super.read();
            if (read != -1) {
                this.f1470b++;
            }
            return read;
        }

        public int read(byte[] bArr, int i, int i2) {
            int read = super.read(bArr, i, i2);
            if (read != -1) {
                this.f1470b += (long) read;
            }
            return read;
        }
    }

    public C0641d(File file, int i) {
        this.f2435c = file;
        this.f2436d = i;
    }

    /* renamed from: a */
    static int m2964a(InputStream inputStream) {
        return (C0641d.m2975c(inputStream) << 24) | ((((C0641d.m2975c(inputStream) << 0) | 0) | (C0641d.m2975c(inputStream) << 8)) | (C0641d.m2975c(inputStream) << 16));
    }

    /* renamed from: a */
    static String m2965a(C0409b c0409b) {
        return new String(C0641d.m2972a(c0409b, C0641d.m2973b((InputStream) c0409b)), "UTF-8");
    }

    /* renamed from: a */
    private void m2966a(int i) {
        long j = (long) i;
        if (this.f2434b + j >= ((long) this.f2436d)) {
            if (C0440v.f1558b) {
                C0440v.m1730a("Pruning old cache entries.", new Object[0]);
            }
            long j2 = r0.f2434b;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Iterator it = r0.f2433a.entrySet().iterator();
            int i2 = 0;
            while (it.hasNext()) {
                long j3;
                C0408a c0408a = (C0408a) ((Entry) it.next()).getValue();
                if (m2984c(c0408a.f1462b).delete()) {
                    j3 = j;
                    r0.f2434b -= c0408a.f1461a;
                } else {
                    j3 = j;
                    C0440v.m1732b("Could not delete cache entry for key=%s, filename=%s", c0408a.f1462b, m2976d(c0408a.f1462b));
                }
                it.remove();
                i2++;
                if (((float) (r0.f2434b + j3)) < ((float) r0.f2436d) * 0.9f) {
                    break;
                }
                j = j3;
            }
            if (C0440v.f1558b) {
                C0440v.m1730a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(r0.f2434b - j2), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            }
        }
    }

    /* renamed from: a */
    static void m2967a(OutputStream outputStream, int i) {
        outputStream.write((i >> 0) & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    /* renamed from: a */
    static void m2968a(OutputStream outputStream, long j) {
        outputStream.write((byte) ((int) (j >>> null)));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    /* renamed from: a */
    static void m2969a(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        C0641d.m2968a(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    /* renamed from: a */
    private void m2970a(String str, C0408a c0408a) {
        if (this.f2433a.containsKey(str)) {
            this.f2434b += c0408a.f1461a - ((C0408a) this.f2433a.get(str)).f1461a;
        } else {
            this.f2434b += c0408a.f1461a;
        }
        this.f2433a.put(str, c0408a);
    }

    /* renamed from: a */
    static void m2971a(List<C0422g> list, OutputStream outputStream) {
        if (list != null) {
            C0641d.m2967a(outputStream, list.size());
            for (C0422g c0422g : list) {
                C0641d.m2969a(outputStream, c0422g.m1659a());
                C0641d.m2969a(outputStream, c0422g.m1660b());
            }
            return;
        }
        C0641d.m2967a(outputStream, 0);
    }

    /* renamed from: a */
    static byte[] m2972a(C0409b c0409b, long j) {
        long a = c0409b.m1634a();
        if (j >= 0 && j <= a) {
            int i = (int) j;
            if (((long) i) == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(c0409b).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("streamToBytes length=");
        stringBuilder.append(j);
        stringBuilder.append(", maxLength=");
        stringBuilder.append(a);
        throw new IOException(stringBuilder.toString());
    }

    /* renamed from: b */
    static long m2973b(InputStream inputStream) {
        return (((((((((((long) C0641d.m2975c(inputStream)) & 255) << null) | 0) | ((((long) C0641d.m2975c(inputStream)) & 255) << 8)) | ((((long) C0641d.m2975c(inputStream)) & 255) << 16)) | ((((long) C0641d.m2975c(inputStream)) & 255) << 24)) | ((((long) C0641d.m2975c(inputStream)) & 255) << 32)) | ((((long) C0641d.m2975c(inputStream)) & 255) << 40)) | ((((long) C0641d.m2975c(inputStream)) & 255) << 48)) | ((255 & ((long) C0641d.m2975c(inputStream))) << 56);
    }

    /* renamed from: b */
    static List<C0422g> m2974b(C0409b c0409b) {
        int a = C0641d.m2964a((InputStream) c0409b);
        if (a >= 0) {
            List<C0422g> emptyList = a == 0 ? Collections.emptyList() : new ArrayList();
            for (int i = 0; i < a; i++) {
                emptyList.add(new C0422g(C0641d.m2965a(c0409b).intern(), C0641d.m2965a(c0409b).intern()));
            }
            return emptyList;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("readHeaderList size=");
        stringBuilder.append(a);
        throw new IOException(stringBuilder.toString());
    }

    /* renamed from: c */
    private static int m2975c(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    /* renamed from: d */
    private String m2976d(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(str.substring(0, length).hashCode());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(valueOf);
        stringBuilder.append(String.valueOf(str.substring(length).hashCode()));
        return stringBuilder.toString();
    }

    /* renamed from: e */
    private void m2977e(String str) {
        C0408a c0408a = (C0408a) this.f2433a.remove(str);
        if (c0408a != null) {
            this.f2434b -= c0408a.f1461a;
        }
    }

    /* renamed from: a */
    public synchronized C0416a mo346a(String str) {
        C0408a c0408a = (C0408a) this.f2433a.get(str);
        if (c0408a == null) {
            return null;
        }
        File c = m2984c(str);
        C0409b c0409b;
        try {
            c0409b = new C0409b(new BufferedInputStream(m2979a(c)), c.length());
            if (TextUtils.equals(str, C0408a.m1630a(c0409b).f1462b)) {
                C0416a a = c0408a.m1632a(C0641d.m2972a(c0409b, c0409b.m1634a()));
                c0409b.close();
                return a;
            }
            C0440v.m1732b("%s: key=%s, found=%s", c.getAbsolutePath(), str, C0408a.m1630a(c0409b).f1462b);
            m2977e(str);
            c0409b.close();
            return null;
        } catch (IOException e) {
            C0440v.m1732b("%s: %s", c.getAbsolutePath(), e.toString());
            m2983b(str);
            return null;
        } catch (Throwable th) {
            c0409b.close();
        }
    }

    /* renamed from: a */
    InputStream m2979a(File file) {
        return new FileInputStream(file);
    }

    /* renamed from: a */
    public synchronized void mo347a() {
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
        monitor-enter(r9);
        r0 = r9.f2435c;	 Catch:{ all -> 0x0061 }
        r0 = r0.exists();	 Catch:{ all -> 0x0061 }
        r1 = 0;	 Catch:{ all -> 0x0061 }
        if (r0 != 0) goto L_0x0024;	 Catch:{ all -> 0x0061 }
    L_0x000a:
        r0 = r9.f2435c;	 Catch:{ all -> 0x0061 }
        r0 = r0.mkdirs();	 Catch:{ all -> 0x0061 }
        if (r0 != 0) goto L_0x0022;	 Catch:{ all -> 0x0061 }
    L_0x0012:
        r0 = "Unable to create cache dir %s";	 Catch:{ all -> 0x0061 }
        r2 = 1;	 Catch:{ all -> 0x0061 }
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x0061 }
        r3 = r9.f2435c;	 Catch:{ all -> 0x0061 }
        r3 = r3.getAbsolutePath();	 Catch:{ all -> 0x0061 }
        r2[r1] = r3;	 Catch:{ all -> 0x0061 }
        com.p025a.p026a.C0440v.m1733c(r0, r2);	 Catch:{ all -> 0x0061 }
    L_0x0022:
        monitor-exit(r9);
        return;
    L_0x0024:
        r0 = r9.f2435c;	 Catch:{ all -> 0x0061 }
        r0 = r0.listFiles();	 Catch:{ all -> 0x0061 }
        if (r0 != 0) goto L_0x002e;
    L_0x002c:
        monitor-exit(r9);
        return;
    L_0x002e:
        r2 = r0.length;	 Catch:{ all -> 0x0061 }
    L_0x002f:
        if (r1 >= r2) goto L_0x005f;	 Catch:{ all -> 0x0061 }
    L_0x0031:
        r3 = r0[r1];	 Catch:{ all -> 0x0061 }
        r4 = r3.length();	 Catch:{ IOException -> 0x0059 }
        r6 = new com.a.a.a.d$b;	 Catch:{ IOException -> 0x0059 }
        r7 = new java.io.BufferedInputStream;	 Catch:{ IOException -> 0x0059 }
        r8 = r9.m2979a(r3);	 Catch:{ IOException -> 0x0059 }
        r7.<init>(r8);	 Catch:{ IOException -> 0x0059 }
        r6.<init>(r7, r4);	 Catch:{ IOException -> 0x0059 }
        r7 = com.p025a.p026a.p027a.C0641d.C0408a.m1630a(r6);	 Catch:{ all -> 0x0054 }
        r7.f1461a = r4;	 Catch:{ all -> 0x0054 }
        r4 = r7.f1462b;	 Catch:{ all -> 0x0054 }
        r9.m2970a(r4, r7);	 Catch:{ all -> 0x0054 }
        r6.close();	 Catch:{ IOException -> 0x0059 }
        goto L_0x005c;	 Catch:{ IOException -> 0x0059 }
    L_0x0054:
        r4 = move-exception;	 Catch:{ IOException -> 0x0059 }
        r6.close();	 Catch:{ IOException -> 0x0059 }
        throw r4;	 Catch:{ IOException -> 0x0059 }
    L_0x0059:
        r3.delete();	 Catch:{ all -> 0x0061 }
    L_0x005c:
        r1 = r1 + 1;
        goto L_0x002f;
    L_0x005f:
        monitor-exit(r9);
        return;
    L_0x0061:
        r0 = move-exception;
        monitor-exit(r9);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.a.a.d.a():void");
    }

    /* renamed from: a */
    public synchronized void mo348a(java.lang.String r7, com.p025a.p026a.C0417b.C0416a r8) {
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
        r6 = this;
        monitor-enter(r6);
        r0 = r8.f1477a;	 Catch:{ all -> 0x0059 }
        r0 = r0.length;	 Catch:{ all -> 0x0059 }
        r6.m2966a(r0);	 Catch:{ all -> 0x0059 }
        r0 = r6.m2984c(r7);	 Catch:{ all -> 0x0059 }
        r1 = 0;
        r2 = 1;
        r3 = new java.io.BufferedOutputStream;	 Catch:{ IOException -> 0x0044 }
        r4 = r6.m2982b(r0);	 Catch:{ IOException -> 0x0044 }
        r3.<init>(r4);	 Catch:{ IOException -> 0x0044 }
        r4 = new com.a.a.a.d$a;	 Catch:{ IOException -> 0x0044 }
        r4.<init>(r7, r8);	 Catch:{ IOException -> 0x0044 }
        r5 = r4.m1633a(r3);	 Catch:{ IOException -> 0x0044 }
        if (r5 == 0) goto L_0x002e;	 Catch:{ IOException -> 0x0044 }
    L_0x0021:
        r8 = r8.f1477a;	 Catch:{ IOException -> 0x0044 }
        r3.write(r8);	 Catch:{ IOException -> 0x0044 }
        r3.close();	 Catch:{ IOException -> 0x0044 }
        r6.m2970a(r7, r4);	 Catch:{ IOException -> 0x0044 }
        monitor-exit(r6);
        return;
    L_0x002e:
        r3.close();	 Catch:{ IOException -> 0x0044 }
        r7 = "Failed to write header for %s";	 Catch:{ IOException -> 0x0044 }
        r8 = new java.lang.Object[r2];	 Catch:{ IOException -> 0x0044 }
        r3 = r0.getAbsolutePath();	 Catch:{ IOException -> 0x0044 }
        r8[r1] = r3;	 Catch:{ IOException -> 0x0044 }
        com.p025a.p026a.C0440v.m1732b(r7, r8);	 Catch:{ IOException -> 0x0044 }
        r7 = new java.io.IOException;	 Catch:{ IOException -> 0x0044 }
        r7.<init>();	 Catch:{ IOException -> 0x0044 }
        throw r7;	 Catch:{ IOException -> 0x0044 }
    L_0x0044:
        r7 = r0.delete();	 Catch:{ all -> 0x0059 }
        if (r7 != 0) goto L_0x0057;	 Catch:{ all -> 0x0059 }
    L_0x004a:
        r7 = "Could not clean up file %s";	 Catch:{ all -> 0x0059 }
        r8 = new java.lang.Object[r2];	 Catch:{ all -> 0x0059 }
        r0 = r0.getAbsolutePath();	 Catch:{ all -> 0x0059 }
        r8[r1] = r0;	 Catch:{ all -> 0x0059 }
        com.p025a.p026a.C0440v.m1732b(r7, r8);	 Catch:{ all -> 0x0059 }
    L_0x0057:
        monitor-exit(r6);
        return;
    L_0x0059:
        r7 = move-exception;
        monitor-exit(r6);
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.a.a.d.a(java.lang.String, com.a.a.b$a):void");
    }

    /* renamed from: b */
    OutputStream m2982b(File file) {
        return new FileOutputStream(file);
    }

    /* renamed from: b */
    public synchronized void m2983b(String str) {
        boolean delete = m2984c(str).delete();
        m2977e(str);
        if (!delete) {
            C0440v.m1732b("Could not delete cache entry for key=%s, filename=%s", str, m2976d(str));
        }
    }

    /* renamed from: c */
    public File m2984c(String str) {
        return new File(this.f2435c, m2976d(str));
    }
}
