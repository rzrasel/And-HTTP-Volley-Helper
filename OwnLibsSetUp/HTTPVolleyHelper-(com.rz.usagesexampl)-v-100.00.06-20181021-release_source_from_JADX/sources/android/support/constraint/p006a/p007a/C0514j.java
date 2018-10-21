package android.support.constraint.p006a.p007a;

import java.util.Arrays;

/* renamed from: android.support.constraint.a.a.j */
public class C0514j extends C0061f {
    protected C0061f[] ai = new C0061f[4];
    protected int aj = 0;

    /* renamed from: J */
    public void mo13J() {
        this.aj = 0;
    }

    /* renamed from: b */
    public void m2014b(C0061f c0061f) {
        if (this.aj + 1 > this.ai.length) {
            this.ai = (C0061f[]) Arrays.copyOf(this.ai, this.ai.length * 2);
        }
        this.ai[this.aj] = c0061f;
        this.aj++;
    }
}
