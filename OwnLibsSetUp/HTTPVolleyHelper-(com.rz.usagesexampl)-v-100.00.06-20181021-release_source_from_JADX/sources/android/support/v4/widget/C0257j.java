package android.support.v4.widget;

import android.os.Build.VERSION;
import android.support.v4.p017g.C0213d;
import android.support.v4.p017g.C0227p;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.widget.j */
public final class C0257j {
    /* renamed from: a */
    static final C0256d f841a;

    /* renamed from: android.support.v4.widget.j$d */
    static class C0256d {
        /* renamed from: a */
        private static Method f839a;
        /* renamed from: b */
        private static boolean f840b;

        C0256d() {
        }

        /* renamed from: a */
        public void mo542a(android.widget.PopupWindow r7, int r8) {
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
            r6 = this;
            r0 = f840b;
            r1 = 0;
            r2 = 1;
            if (r0 != 0) goto L_0x001d;
        L_0x0006:
            r0 = android.widget.PopupWindow.class;	 Catch:{ Exception -> 0x001b }
            r3 = "setWindowLayoutType";	 Catch:{ Exception -> 0x001b }
            r4 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x001b }
            r5 = java.lang.Integer.TYPE;	 Catch:{ Exception -> 0x001b }
            r4[r1] = r5;	 Catch:{ Exception -> 0x001b }
            r0 = r0.getDeclaredMethod(r3, r4);	 Catch:{ Exception -> 0x001b }
            f839a = r0;	 Catch:{ Exception -> 0x001b }
            r0 = f839a;	 Catch:{ Exception -> 0x001b }
            r0.setAccessible(r2);	 Catch:{ Exception -> 0x001b }
        L_0x001b:
            f840b = r2;
        L_0x001d:
            r0 = f839a;
            if (r0 == 0) goto L_0x002e;
        L_0x0021:
            r0 = f839a;	 Catch:{ Exception -> 0x002e }
            r2 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x002e }
            r8 = java.lang.Integer.valueOf(r8);	 Catch:{ Exception -> 0x002e }
            r2[r1] = r8;	 Catch:{ Exception -> 0x002e }
            r0.invoke(r7, r2);	 Catch:{ Exception -> 0x002e }
        L_0x002e:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.j.d.a(android.widget.PopupWindow, int):void");
        }

        /* renamed from: a */
        public void mo119a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            if ((C0213d.m797a(i3, C0227p.m876b(view)) & 7) == 5) {
                i -= popupWindow.getWidth() - view.getWidth();
            }
            popupWindow.showAsDropDown(view, i, i2);
        }

        /* renamed from: a */
        public void mo473a(PopupWindow popupWindow, boolean z) {
        }
    }

    /* renamed from: android.support.v4.widget.j$a */
    static class C0572a extends C0256d {
        C0572a() {
        }

        /* renamed from: a */
        public void mo119a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2, i3);
        }
    }

    /* renamed from: android.support.v4.widget.j$b */
    static class C0746b extends C0572a {
        /* renamed from: a */
        private static Field f2653a;

        static {
            try {
                f2653a = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f2653a.setAccessible(true);
            } catch (Throwable e) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
            }
        }

        C0746b() {
        }

        /* renamed from: a */
        public void mo473a(PopupWindow popupWindow, boolean z) {
            if (f2653a != null) {
                try {
                    f2653a.set(popupWindow, Boolean.valueOf(z));
                } catch (Throwable e) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e);
                }
            }
        }
    }

    /* renamed from: android.support.v4.widget.j$c */
    static class C0781c extends C0746b {
        C0781c() {
        }

        /* renamed from: a */
        public void mo542a(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }

        /* renamed from: a */
        public void mo473a(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }
    }

    static {
        C0256d c0781c = VERSION.SDK_INT >= 23 ? new C0781c() : VERSION.SDK_INT >= 21 ? new C0746b() : VERSION.SDK_INT >= 19 ? new C0572a() : new C0256d();
        f841a = c0781c;
    }

    /* renamed from: a */
    public static void m989a(PopupWindow popupWindow, int i) {
        f841a.mo542a(popupWindow, i);
    }

    /* renamed from: a */
    public static void m990a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        f841a.mo119a(popupWindow, view, i, i2, i3);
    }

    /* renamed from: a */
    public static void m991a(PopupWindow popupWindow, boolean z) {
        f841a.mo473a(popupWindow, z);
    }
}
