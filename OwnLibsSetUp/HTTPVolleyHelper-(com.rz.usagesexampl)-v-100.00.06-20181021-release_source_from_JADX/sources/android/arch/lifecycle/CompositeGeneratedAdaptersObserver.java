package android.arch.lifecycle;

import android.arch.lifecycle.C0015c.C0013a;

public class CompositeGeneratedAdaptersObserver implements GenericLifecycleObserver {
    /* renamed from: a */
    private final C0012b[] f2590a;

    CompositeGeneratedAdaptersObserver(C0012b[] c0012bArr) {
        this.f2590a = c0012bArr;
    }

    /* renamed from: a */
    public void mo420a(C0017e c0017e, C0013a c0013a) {
        C0021i c0021i = new C0021i();
        int i = 0;
        for (C0012b a : this.f2590a) {
            a.m37a(c0017e, c0013a, false, c0021i);
        }
        C0012b[] c0012bArr = this.f2590a;
        int length = c0012bArr.length;
        while (i < length) {
            c0012bArr[i].m37a(c0017e, c0013a, true, c0021i);
            i++;
        }
    }
}
