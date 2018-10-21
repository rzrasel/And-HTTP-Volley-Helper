package android.support.v4.p016f;

import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: android.support.v4.f.g */
public class C0188g<K, V> {
    /* renamed from: a */
    private final LinkedHashMap<K, V> f710a;
    /* renamed from: b */
    private int f711b;
    /* renamed from: c */
    private int f712c;
    /* renamed from: d */
    private int f713d;
    /* renamed from: e */
    private int f714e;
    /* renamed from: f */
    private int f715f;
    /* renamed from: g */
    private int f716g;
    /* renamed from: h */
    private int f717h;

    public C0188g(int i) {
        if (i > 0) {
            this.f712c = i;
            this.f710a = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: c */
    private int m683c(K k, V v) {
        int b = m688b(k, v);
        if (b >= 0) {
            return b;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Negative size: ");
        stringBuilder.append(k);
        stringBuilder.append("=");
        stringBuilder.append(v);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final V m684a(K r5) {
        /*
        r4 = this;
        if (r5 == 0) goto L_0x0054;
    L_0x0002:
        monitor-enter(r4);
        r0 = r4.f710a;	 Catch:{ all -> 0x0051 }
        r0 = r0.get(r5);	 Catch:{ all -> 0x0051 }
        if (r0 == 0) goto L_0x0013;
    L_0x000b:
        r5 = r4.f716g;	 Catch:{ all -> 0x0051 }
        r5 = r5 + 1;
        r4.f716g = r5;	 Catch:{ all -> 0x0051 }
        monitor-exit(r4);	 Catch:{ all -> 0x0051 }
        return r0;
    L_0x0013:
        r0 = r4.f717h;	 Catch:{ all -> 0x0051 }
        r0 = r0 + 1;
        r4.f717h = r0;	 Catch:{ all -> 0x0051 }
        monitor-exit(r4);	 Catch:{ all -> 0x0051 }
        r0 = r4.m689b(r5);
        if (r0 != 0) goto L_0x0022;
    L_0x0020:
        r5 = 0;
        return r5;
    L_0x0022:
        monitor-enter(r4);
        r1 = r4.f714e;	 Catch:{ all -> 0x004e }
        r1 = r1 + 1;
        r4.f714e = r1;	 Catch:{ all -> 0x004e }
        r1 = r4.f710a;	 Catch:{ all -> 0x004e }
        r1 = r1.put(r5, r0);	 Catch:{ all -> 0x004e }
        if (r1 == 0) goto L_0x0037;
    L_0x0031:
        r2 = r4.f710a;	 Catch:{ all -> 0x004e }
        r2.put(r5, r1);	 Catch:{ all -> 0x004e }
        goto L_0x0040;
    L_0x0037:
        r2 = r4.f711b;	 Catch:{ all -> 0x004e }
        r3 = r4.m683c(r5, r0);	 Catch:{ all -> 0x004e }
        r2 = r2 + r3;
        r4.f711b = r2;	 Catch:{ all -> 0x004e }
    L_0x0040:
        monitor-exit(r4);	 Catch:{ all -> 0x004e }
        if (r1 == 0) goto L_0x0048;
    L_0x0043:
        r2 = 0;
        r4.m687a(r2, r5, r0, r1);
        return r1;
    L_0x0048:
        r5 = r4.f712c;
        r4.m686a(r5);
        return r0;
    L_0x004e:
        r5 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x004e }
        throw r5;
    L_0x0051:
        r5 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0051 }
        throw r5;
    L_0x0054:
        r5 = new java.lang.NullPointerException;
        r0 = "key == null";
        r5.<init>(r0);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.f.g.a(java.lang.Object):V");
    }

    /* renamed from: a */
    public final V m685a(K k, V v) {
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        V put;
        synchronized (this) {
            this.f713d++;
            this.f711b += m683c(k, v);
            put = this.f710a.put(k, v);
            if (put != null) {
                this.f711b -= m683c(k, put);
            }
        }
        if (put != null) {
            m687a(false, k, put, v);
        }
        m686a(this.f712c);
        return put;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void m686a(int r5) {
        /*
        r4 = this;
    L_0x0000:
        monitor-enter(r4);
        r0 = r4.f711b;	 Catch:{ all -> 0x0071 }
        if (r0 < 0) goto L_0x0052;
    L_0x0005:
        r0 = r4.f710a;	 Catch:{ all -> 0x0071 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0071 }
        if (r0 == 0) goto L_0x0011;
    L_0x000d:
        r0 = r4.f711b;	 Catch:{ all -> 0x0071 }
        if (r0 != 0) goto L_0x0052;
    L_0x0011:
        r0 = r4.f711b;	 Catch:{ all -> 0x0071 }
        if (r0 <= r5) goto L_0x0050;
    L_0x0015:
        r0 = r4.f710a;	 Catch:{ all -> 0x0071 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0071 }
        if (r0 == 0) goto L_0x001e;
    L_0x001d:
        goto L_0x0050;
    L_0x001e:
        r0 = r4.f710a;	 Catch:{ all -> 0x0071 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x0071 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0071 }
        r0 = r0.next();	 Catch:{ all -> 0x0071 }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x0071 }
        r1 = r0.getKey();	 Catch:{ all -> 0x0071 }
        r0 = r0.getValue();	 Catch:{ all -> 0x0071 }
        r2 = r4.f710a;	 Catch:{ all -> 0x0071 }
        r2.remove(r1);	 Catch:{ all -> 0x0071 }
        r2 = r4.f711b;	 Catch:{ all -> 0x0071 }
        r3 = r4.m683c(r1, r0);	 Catch:{ all -> 0x0071 }
        r2 = r2 - r3;
        r4.f711b = r2;	 Catch:{ all -> 0x0071 }
        r2 = r4.f715f;	 Catch:{ all -> 0x0071 }
        r3 = 1;
        r2 = r2 + r3;
        r4.f715f = r2;	 Catch:{ all -> 0x0071 }
        monitor-exit(r4);	 Catch:{ all -> 0x0071 }
        r2 = 0;
        r4.m687a(r3, r1, r0, r2);
        goto L_0x0000;
    L_0x0050:
        monitor-exit(r4);	 Catch:{ all -> 0x0071 }
        return;
    L_0x0052:
        r5 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0071 }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0071 }
        r0.<init>();	 Catch:{ all -> 0x0071 }
        r1 = r4.getClass();	 Catch:{ all -> 0x0071 }
        r1 = r1.getName();	 Catch:{ all -> 0x0071 }
        r0.append(r1);	 Catch:{ all -> 0x0071 }
        r1 = ".sizeOf() is reporting inconsistent results!";
        r0.append(r1);	 Catch:{ all -> 0x0071 }
        r0 = r0.toString();	 Catch:{ all -> 0x0071 }
        r5.<init>(r0);	 Catch:{ all -> 0x0071 }
        throw r5;	 Catch:{ all -> 0x0071 }
    L_0x0071:
        r5 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0071 }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.f.g.a(int):void");
    }

    /* renamed from: a */
    protected void m687a(boolean z, K k, V v, V v2) {
    }

    /* renamed from: b */
    protected int m688b(K k, V v) {
        return 1;
    }

    /* renamed from: b */
    protected V m689b(K k) {
        return null;
    }

    public final synchronized String toString() {
        int i;
        i = this.f716g + this.f717h;
        i = i != 0 ? (this.f716g * 100) / i : 0;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f712c), Integer.valueOf(this.f716g), Integer.valueOf(this.f717h), Integer.valueOf(i)});
    }
}
