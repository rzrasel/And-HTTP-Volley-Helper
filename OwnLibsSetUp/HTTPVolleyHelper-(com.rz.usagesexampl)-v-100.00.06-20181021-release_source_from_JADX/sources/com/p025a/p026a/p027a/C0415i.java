package com.p025a.p026a.p027a;

import java.io.ByteArrayOutputStream;

/* renamed from: com.a.a.a.i */
public class C0415i extends ByteArrayOutputStream {
    /* renamed from: a */
    private final C0407c f1476a;

    public C0415i(C0407c c0407c, int i) {
        this.f1476a = c0407c;
        this.buf = this.f1476a.m1629a(Math.max(i, 256));
    }

    /* renamed from: a */
    private void m1648a(int i) {
        if (this.count + i > this.buf.length) {
            Object a = this.f1476a.m1629a((this.count + i) * 2);
            System.arraycopy(this.buf, 0, a, 0, this.count);
            this.f1476a.m1628a(this.buf);
            this.buf = a;
        }
    }

    public void close() {
        this.f1476a.m1628a(this.buf);
        this.buf = null;
        super.close();
    }

    public void finalize() {
        this.f1476a.m1628a(this.buf);
    }

    public synchronized void write(int i) {
        m1648a(1);
        super.write(i);
    }

    public synchronized void write(byte[] bArr, int i, int i2) {
        m1648a(i2);
        super.write(bArr, i, i2);
    }
}
