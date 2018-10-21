package android.support.v4.p017g;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import java.lang.reflect.Field;

/* renamed from: android.support.v4.g.e */
public final class C0215e {
    /* renamed from: a */
    static final C0214b f766a = (VERSION.SDK_INT >= 21 ? new C0557a() : new C0214b());
    /* renamed from: b */
    private static Field f767b;
    /* renamed from: c */
    private static boolean f768c;

    /* renamed from: android.support.v4.g.e$b */
    static class C0214b {
        C0214b() {
        }

        /* renamed from: a */
        public void mo91a(LayoutInflater layoutInflater, Factory2 factory2) {
            layoutInflater.setFactory2(factory2);
            Factory factory = layoutInflater.getFactory();
            if (factory instanceof Factory2) {
                C0215e.m799a(layoutInflater, (Factory2) factory);
            } else {
                C0215e.m799a(layoutInflater, factory2);
            }
        }
    }

    /* renamed from: android.support.v4.g.e$a */
    static class C0557a extends C0214b {
        C0557a() {
        }

        /* renamed from: a */
        public void mo91a(LayoutInflater layoutInflater, Factory2 factory2) {
            layoutInflater.setFactory2(factory2);
        }
    }

    /* renamed from: a */
    static void m799a(LayoutInflater layoutInflater, Factory2 factory2) {
        if (!f768c) {
            try {
                f767b = LayoutInflater.class.getDeclaredField("mFactory2");
                f767b.setAccessible(true);
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("forceSetFactory2 Could not find field 'mFactory2' on class ");
                stringBuilder.append(LayoutInflater.class.getName());
                stringBuilder.append("; inflation may have unexpected results.");
                Log.e("LayoutInflaterCompatHC", stringBuilder.toString(), e);
            }
            f768c = true;
        }
        if (f767b != null) {
            try {
                f767b.set(layoutInflater, factory2);
            } catch (Throwable e2) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("forceSetFactory2 could not set the Factory2 on LayoutInflater ");
                stringBuilder2.append(layoutInflater);
                stringBuilder2.append("; inflation may have unexpected results.");
                Log.e("LayoutInflaterCompatHC", stringBuilder2.toString(), e2);
            }
        }
    }

    /* renamed from: b */
    public static void m800b(LayoutInflater layoutInflater, Factory2 factory2) {
        f766a.mo91a(layoutInflater, factory2);
    }
}
