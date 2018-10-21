package com.p025a.p026a.p027a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.a.a.a.c */
public class C0407c {
    /* renamed from: a */
    protected static final Comparator<byte[]> f1456a = new C04061();
    /* renamed from: b */
    private final List<byte[]> f1457b = new ArrayList();
    /* renamed from: c */
    private final List<byte[]> f1458c = new ArrayList(64);
    /* renamed from: d */
    private int f1459d = 0;
    /* renamed from: e */
    private final int f1460e;

    /* renamed from: com.a.a.a.c$1 */
    class C04061 implements Comparator<byte[]> {
        C04061() {
        }

        /* renamed from: a */
        public int m1626a(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m1626a((byte[]) obj, (byte[]) obj2);
        }
    }

    public C0407c(int i) {
        this.f1460e = i;
    }

    /* renamed from: a */
    private synchronized void m1627a() {
        while (this.f1459d > this.f1460e) {
            byte[] bArr = (byte[]) this.f1457b.remove(0);
            this.f1458c.remove(bArr);
            this.f1459d -= bArr.length;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public synchronized void m1628a(byte[] r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        if (r3 == 0) goto L_0x002e;
    L_0x0003:
        r0 = r3.length;	 Catch:{ all -> 0x002b }
        r1 = r2.f1460e;	 Catch:{ all -> 0x002b }
        if (r0 <= r1) goto L_0x0009;
    L_0x0008:
        goto L_0x002e;
    L_0x0009:
        r0 = r2.f1457b;	 Catch:{ all -> 0x002b }
        r0.add(r3);	 Catch:{ all -> 0x002b }
        r0 = r2.f1458c;	 Catch:{ all -> 0x002b }
        r1 = f1456a;	 Catch:{ all -> 0x002b }
        r0 = java.util.Collections.binarySearch(r0, r3, r1);	 Catch:{ all -> 0x002b }
        if (r0 >= 0) goto L_0x001b;
    L_0x0018:
        r0 = -r0;
        r0 = r0 + -1;
    L_0x001b:
        r1 = r2.f1458c;	 Catch:{ all -> 0x002b }
        r1.add(r0, r3);	 Catch:{ all -> 0x002b }
        r0 = r2.f1459d;	 Catch:{ all -> 0x002b }
        r3 = r3.length;	 Catch:{ all -> 0x002b }
        r0 = r0 + r3;
        r2.f1459d = r0;	 Catch:{ all -> 0x002b }
        r2.m1627a();	 Catch:{ all -> 0x002b }
        monitor-exit(r2);
        return;
    L_0x002b:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
    L_0x002e:
        monitor-exit(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.a.a.c.a(byte[]):void");
    }

    /* renamed from: a */
    public synchronized byte[] m1629a(int i) {
        for (int i2 = 0; i2 < this.f1458c.size(); i2++) {
            byte[] bArr = (byte[]) this.f1458c.get(i2);
            if (bArr.length >= i) {
                this.f1459d -= bArr.length;
                this.f1458c.remove(i2);
                this.f1457b.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }
}
