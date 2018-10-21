package android.support.v4.widget;

import android.os.Build.VERSION;
import android.widget.EdgeEffect;

/* renamed from: android.support.v4.widget.f */
public final class C0252f {
    /* renamed from: a */
    private static final C0251b f837a = (VERSION.SDK_INT >= 21 ? new C0569a() : new C0251b());

    /* renamed from: android.support.v4.widget.f$b */
    static class C0251b {
        C0251b() {
        }

        /* renamed from: a */
        public void mo111a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f);
        }
    }

    /* renamed from: android.support.v4.widget.f$a */
    static class C0569a extends C0251b {
        C0569a() {
        }

        /* renamed from: a */
        public void mo111a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    /* renamed from: a */
    public static void m976a(EdgeEffect edgeEffect, float f, float f2) {
        f837a.mo111a(edgeEffect, f, f2);
    }
}
