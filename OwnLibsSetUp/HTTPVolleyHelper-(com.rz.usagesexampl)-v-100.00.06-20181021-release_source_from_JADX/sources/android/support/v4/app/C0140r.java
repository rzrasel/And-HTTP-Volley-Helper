package android.support.v4.app;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.app.C0528c.C0104a;
import android.support.v4.p016f.C0549a;
import android.support.v4.p017g.C0227p;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v4.app.r */
class C0140r {
    /* renamed from: a */
    private static final int[] f597a = new int[]{0, 3, 0, 1, 5, 4, 7, 6, 9, 8};
    /* renamed from: b */
    private static final C0148t f598b = (VERSION.SDK_INT >= 21 ? new C0536s() : null);
    /* renamed from: c */
    private static final C0148t f599c = C0140r.m484a();

    /* renamed from: android.support.v4.app.r$a */
    static class C0139a {
        /* renamed from: a */
        public C0530g f591a;
        /* renamed from: b */
        public boolean f592b;
        /* renamed from: c */
        public C0528c f593c;
        /* renamed from: d */
        public C0530g f594d;
        /* renamed from: e */
        public boolean f595e;
        /* renamed from: f */
        public C0528c f596f;

        C0139a() {
        }
    }

    /* renamed from: a */
    private static C0139a m483a(C0139a c0139a, SparseArray<C0139a> sparseArray, int i) {
        if (c0139a != null) {
            return c0139a;
        }
        c0139a = new C0139a();
        sparseArray.put(i, c0139a);
        return c0139a;
    }

    /* renamed from: a */
    private static android.support.v4.app.C0148t m484a() {
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
        r0 = "android.support.transition.FragmentTransitionSupport";	 Catch:{ Exception -> 0x0016 }
        r0 = java.lang.Class.forName(r0);	 Catch:{ Exception -> 0x0016 }
        r1 = 0;	 Catch:{ Exception -> 0x0016 }
        r2 = new java.lang.Class[r1];	 Catch:{ Exception -> 0x0016 }
        r0 = r0.getDeclaredConstructor(r2);	 Catch:{ Exception -> 0x0016 }
        r1 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x0016 }
        r0 = r0.newInstance(r1);	 Catch:{ Exception -> 0x0016 }
        r0 = (android.support.v4.app.C0148t) r0;	 Catch:{ Exception -> 0x0016 }
        return r0;
    L_0x0016:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.r.a():android.support.v4.app.t");
    }

    /* renamed from: a */
    private static C0148t m485a(C0530g c0530g, C0530g c0530g2) {
        Object z;
        List arrayList = new ArrayList();
        if (c0530g != null) {
            Object w = c0530g.m2206w();
            if (w != null) {
                arrayList.add(w);
            }
            w = c0530g.m2205v();
            if (w != null) {
                arrayList.add(w);
            }
            z = c0530g.m2209z();
            if (z != null) {
                arrayList.add(z);
            }
        }
        if (c0530g2 != null) {
            z = c0530g2.m2204u();
            if (z != null) {
                arrayList.add(z);
            }
            z = c0530g2.m2207x();
            if (z != null) {
                arrayList.add(z);
            }
            z = c0530g2.m2208y();
            if (z != null) {
                arrayList.add(z);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (f598b != null && C0140r.m506a(f598b, arrayList)) {
            return f598b;
        }
        if (f599c != null && C0140r.m506a(f599c, arrayList)) {
            return f599c;
        }
        if (f598b == null && f599c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: a */
    private static C0549a<String, String> m486a(int i, ArrayList<C0528c> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        C0549a<String, String> c0549a = new C0549a();
        for (i3--; i3 >= i2; i3--) {
            C0528c c0528c = (C0528c) arrayList.get(i3);
            if (c0528c.m2098b(i)) {
                boolean booleanValue = ((Boolean) arrayList2.get(i3)).booleanValue();
                if (c0528c.f1850r != null) {
                    ArrayList arrayList3;
                    ArrayList arrayList4;
                    int size = c0528c.f1850r.size();
                    if (booleanValue) {
                        arrayList3 = c0528c.f1850r;
                        arrayList4 = c0528c.f1851s;
                    } else {
                        ArrayList arrayList5 = c0528c.f1850r;
                        arrayList3 = c0528c.f1851s;
                        arrayList4 = arrayList5;
                    }
                    for (int i4 = 0; i4 < size; i4++) {
                        String str = (String) arrayList4.get(i4);
                        String str2 = (String) arrayList3.get(i4);
                        String str3 = (String) c0549a.remove(str2);
                        if (str3 != null) {
                            c0549a.put(str, str3);
                        } else {
                            c0549a.put(str, str2);
                        }
                    }
                }
            }
        }
        return c0549a;
    }

    /* renamed from: a */
    private static Object m489a(C0148t c0148t, C0530g c0530g, C0530g c0530g2, boolean z) {
        if (c0530g != null) {
            if (c0530g2 != null) {
                return c0148t.mo64c(c0148t.mo59b(z ? c0530g2.m2209z() : c0530g.m2208y()));
            }
        }
        return null;
    }

    /* renamed from: a */
    private static Object m490a(C0148t c0148t, C0530g c0530g, boolean z) {
        if (c0530g == null) {
            return null;
        }
        return c0148t.mo59b(z ? c0530g.m2207x() : c0530g.m2204u());
    }

    /* renamed from: a */
    private static Object m491a(C0148t c0148t, ViewGroup viewGroup, View view, C0549a<String, String> c0549a, C0139a c0139a, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        C0148t c0148t2 = c0148t;
        View view2 = view;
        C0549a c0549a2 = c0549a;
        C0139a c0139a2 = c0139a;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        Object obj3 = obj;
        C0530g c0530g = c0139a2.f591a;
        C0530g c0530g2 = c0139a2.f594d;
        if (c0530g != null) {
            c0530g.m2191k().setVisibility(0);
        }
        if (c0530g != null) {
            if (c0530g2 != null) {
                Object obj4;
                boolean z = c0139a2.f592b;
                Object a = c0549a.isEmpty() ? null : C0140r.m489a(c0148t2, c0530g, c0530g2, z);
                C0549a b = C0140r.m507b(c0148t2, c0549a2, a, c0139a2);
                C0549a c = C0140r.m516c(c0148t2, c0549a2, a, c0139a2);
                if (c0549a.isEmpty()) {
                    if (b != null) {
                        b.clear();
                    }
                    if (c != null) {
                        c.clear();
                    }
                    obj4 = null;
                } else {
                    C0140r.m505a(arrayList3, b, c0549a.keySet());
                    C0140r.m505a(arrayList4, c, c0549a.values());
                    obj4 = a;
                }
                if (obj3 == null && obj2 == null && obj4 == null) {
                    return null;
                }
                Rect rect;
                View view3;
                C0140r.m513b(c0530g, c0530g2, z, b, true);
                if (obj4 != null) {
                    arrayList4.add(view2);
                    c0148t2.mo54a(obj4, view2, arrayList3);
                    C0140r.m502a(c0148t, obj4, obj2, b, c0139a2.f595e, c0139a2.f596f);
                    Rect rect2 = new Rect();
                    View b2 = C0140r.m508b(c, c0139a2, obj3, z);
                    if (b2 != null) {
                        c0148t2.mo52a(obj3, rect2);
                    }
                    rect = rect2;
                    view3 = b2;
                } else {
                    view3 = null;
                    rect = view3;
                }
                final C0530g c0530g3 = c0530g;
                final C0530g c0530g4 = c0530g2;
                final boolean z2 = z;
                final C0549a c0549a3 = c;
                c0148t2 = c0148t;
                C0152w.m553a(viewGroup, new Runnable() {
                    public void run() {
                        C0140r.m513b(c0530g3, c0530g4, z2, c0549a3, false);
                        if (view3 != null) {
                            c0148t2.m523a(view3, rect);
                        }
                    }
                });
                return obj4;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static Object m492a(C0148t c0148t, Object obj, Object obj2, Object obj3, C0530g c0530g, boolean z) {
        boolean B = (obj == null || obj2 == null || c0530g == null) ? true : z ? c0530g.m2110B() : c0530g.m2109A();
        return B ? c0148t.mo50a(obj2, obj, obj3) : c0148t.mo60b(obj2, obj, obj3);
    }

    /* renamed from: a */
    private static String m493a(C0549a<String, String> c0549a, String str) {
        int size = c0549a.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(c0549a.m722c(i))) {
                return (String) c0549a.m721b(i);
            }
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static void m495a(android.support.v4.app.C0528c r15, android.support.v4.app.C0528c.C0104a r16, android.util.SparseArray<android.support.v4.app.C0140r.C0139a> r17, boolean r18, boolean r19) {
        /*
        r0 = r15;
        r1 = r16;
        r2 = r17;
        r3 = r18;
        r10 = r1.f481b;
        if (r10 != 0) goto L_0x000c;
    L_0x000b:
        return;
    L_0x000c:
        r11 = r10.f1902z;
        if (r11 != 0) goto L_0x0011;
    L_0x0010:
        return;
    L_0x0011:
        if (r3 == 0) goto L_0x001a;
    L_0x0013:
        r4 = f597a;
        r1 = r1.f480a;
        r1 = r4[r1];
        goto L_0x001c;
    L_0x001a:
        r1 = r1.f480a;
    L_0x001c:
        r4 = 0;
        r5 = 1;
        if (r1 == r5) goto L_0x007c;
    L_0x0020:
        switch(r1) {
            case 3: goto L_0x0052;
            case 4: goto L_0x003a;
            case 5: goto L_0x0028;
            case 6: goto L_0x0052;
            case 7: goto L_0x007c;
            default: goto L_0x0023;
        };
    L_0x0023:
        r1 = 0;
    L_0x0024:
        r12 = 0;
        r13 = 0;
        goto L_0x008f;
    L_0x0028:
        if (r19 == 0) goto L_0x0037;
    L_0x002a:
        r1 = r10.f1873Q;
        if (r1 == 0) goto L_0x008b;
    L_0x002e:
        r1 = r10.f1858B;
        if (r1 != 0) goto L_0x008b;
    L_0x0032:
        r1 = r10.f1888l;
        if (r1 == 0) goto L_0x008b;
    L_0x0036:
        goto L_0x0089;
    L_0x0037:
        r1 = r10.f1858B;
        goto L_0x008c;
    L_0x003a:
        if (r19 == 0) goto L_0x0049;
    L_0x003c:
        r1 = r10.f1873Q;
        if (r1 == 0) goto L_0x006d;
    L_0x0040:
        r1 = r10.f1888l;
        if (r1 == 0) goto L_0x006d;
    L_0x0044:
        r1 = r10.f1858B;
        if (r1 == 0) goto L_0x006d;
    L_0x0048:
        goto L_0x006b;
    L_0x0049:
        r1 = r10.f1888l;
        if (r1 == 0) goto L_0x006d;
    L_0x004d:
        r1 = r10.f1858B;
        if (r1 != 0) goto L_0x006d;
    L_0x0051:
        goto L_0x0048;
    L_0x0052:
        if (r19 == 0) goto L_0x006f;
    L_0x0054:
        r1 = r10.f1888l;
        if (r1 != 0) goto L_0x006d;
    L_0x0058:
        r1 = r10.f1866J;
        if (r1 == 0) goto L_0x006d;
    L_0x005c:
        r1 = r10.f1866J;
        r1 = r1.getVisibility();
        if (r1 != 0) goto L_0x006d;
    L_0x0064:
        r1 = r10.f1874R;
        r6 = 0;
        r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1));
        if (r1 < 0) goto L_0x006d;
    L_0x006b:
        r1 = 1;
        goto L_0x0078;
    L_0x006d:
        r1 = 0;
        goto L_0x0078;
    L_0x006f:
        r1 = r10.f1888l;
        if (r1 == 0) goto L_0x006d;
    L_0x0073:
        r1 = r10.f1858B;
        if (r1 != 0) goto L_0x006d;
    L_0x0077:
        goto L_0x006b;
    L_0x0078:
        r13 = r1;
        r1 = 0;
        r12 = 1;
        goto L_0x008f;
    L_0x007c:
        if (r19 == 0) goto L_0x0081;
    L_0x007e:
        r1 = r10.f1872P;
        goto L_0x008c;
    L_0x0081:
        r1 = r10.f1888l;
        if (r1 != 0) goto L_0x008b;
    L_0x0085:
        r1 = r10.f1858B;
        if (r1 != 0) goto L_0x008b;
    L_0x0089:
        r1 = 1;
        goto L_0x008c;
    L_0x008b:
        r1 = 0;
    L_0x008c:
        r4 = r1;
        r1 = 1;
        goto L_0x0024;
    L_0x008f:
        r6 = r2.get(r11);
        r6 = (android.support.v4.app.C0140r.C0139a) r6;
        if (r4 == 0) goto L_0x00a1;
    L_0x0097:
        r6 = android.support.v4.app.C0140r.m483a(r6, r2, r11);
        r6.f591a = r10;
        r6.f592b = r3;
        r6.f593c = r0;
    L_0x00a1:
        r14 = r6;
        r9 = 0;
        if (r19 != 0) goto L_0x00c9;
    L_0x00a5:
        if (r1 == 0) goto L_0x00c9;
    L_0x00a7:
        if (r14 == 0) goto L_0x00af;
    L_0x00a9:
        r1 = r14.f594d;
        if (r1 != r10) goto L_0x00af;
    L_0x00ad:
        r14.f594d = r9;
    L_0x00af:
        r4 = r0.f1833a;
        r1 = r10.f1878b;
        if (r1 >= r5) goto L_0x00c9;
    L_0x00b5:
        r1 = r4.f1937l;
        if (r1 < r5) goto L_0x00c9;
    L_0x00b9:
        r1 = r0.f1852t;
        if (r1 != 0) goto L_0x00c9;
    L_0x00bd:
        r4.m2310f(r10);
        r6 = 1;
        r7 = 0;
        r8 = 0;
        r1 = 0;
        r5 = r10;
        r9 = r1;
        r4.m2273a(r5, r6, r7, r8, r9);
    L_0x00c9:
        if (r13 == 0) goto L_0x00db;
    L_0x00cb:
        if (r14 == 0) goto L_0x00d1;
    L_0x00cd:
        r1 = r14.f594d;
        if (r1 != 0) goto L_0x00db;
    L_0x00d1:
        r14 = android.support.v4.app.C0140r.m483a(r14, r2, r11);
        r14.f594d = r10;
        r14.f595e = r3;
        r14.f596f = r0;
    L_0x00db:
        if (r19 != 0) goto L_0x00e8;
    L_0x00dd:
        if (r12 == 0) goto L_0x00e8;
    L_0x00df:
        if (r14 == 0) goto L_0x00e8;
    L_0x00e1:
        r0 = r14.f591a;
        if (r0 != r10) goto L_0x00e8;
    L_0x00e5:
        r0 = 0;
        r14.f591a = r0;
    L_0x00e8:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.r.a(android.support.v4.app.c, android.support.v4.app.c$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: a */
    public static void m496a(C0528c c0528c, SparseArray<C0139a> sparseArray, boolean z) {
        int size = c0528c.f1834b.size();
        for (int i = 0; i < size; i++) {
            C0140r.m495a(c0528c, (C0104a) c0528c.f1834b.get(i), (SparseArray) sparseArray, false, z);
        }
    }

    /* renamed from: a */
    private static void m498a(C0535m c0535m, int i, C0139a c0139a, View view, C0549a<String, String> c0549a) {
        C0535m c0535m2 = c0535m;
        C0139a c0139a2 = c0139a;
        View view2 = view;
        View view3 = c0535m2.f1939n.mo41a() ? (ViewGroup) c0535m2.f1939n.mo40a(i) : null;
        if (view3 != null) {
            C0530g c0530g = c0139a2.f591a;
            C0530g c0530g2 = c0139a2.f594d;
            C0148t a = C0140r.m485a(c0530g2, c0530g);
            if (a != null) {
                boolean z = c0139a2.f592b;
                boolean z2 = c0139a2.f595e;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Object a2 = C0140r.m490a(a, c0530g, z);
                Object b = C0140r.m509b(a, c0530g2, z2);
                Object obj = a2;
                View view4 = view3;
                ArrayList arrayList3 = arrayList2;
                Object a3 = C0140r.m491a(a, (ViewGroup) view3, view, (C0549a) c0549a, c0139a, arrayList2, arrayList, a2, b);
                Object obj2 = obj;
                if (obj2 == null && a3 == null) {
                    a2 = b;
                    if (a2 == null) {
                        return;
                    }
                }
                a2 = b;
                ArrayList b2 = C0140r.m511b(a, a2, c0530g2, arrayList3, view2);
                ArrayList b3 = C0140r.m511b(a, obj2, c0530g, arrayList, view2);
                C0140r.m515b(b3, 4);
                C0530g c0530g3 = c0530g;
                ArrayList arrayList4 = b2;
                Object a4 = C0140r.m492a(a, obj2, a2, a3, c0530g3, z);
                if (a4 != null) {
                    C0140r.m501a(a, a2, c0530g2, arrayList4);
                    ArrayList a5 = a.m522a(arrayList);
                    a.mo55a(a4, obj2, b3, a2, arrayList4, a3, arrayList);
                    View view5 = view4;
                    a.mo51a((ViewGroup) view5, a4);
                    a.m524a(view5, arrayList3, arrayList, a5, c0549a);
                    C0140r.m515b(b3, 0);
                    a.mo57a(a3, arrayList3, arrayList);
                }
            }
        }
    }

    /* renamed from: a */
    static void m499a(C0535m c0535m, ArrayList<C0528c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (c0535m.f1937l >= 1) {
            SparseArray sparseArray = new SparseArray();
            for (int i3 = i; i3 < i2; i3++) {
                C0528c c0528c = (C0528c) arrayList.get(i3);
                if (((Boolean) arrayList2.get(i3)).booleanValue()) {
                    C0140r.m512b(c0528c, sparseArray, z);
                } else {
                    C0140r.m496a(c0528c, sparseArray, z);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(c0535m.f1938m.m2220g());
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    int keyAt = sparseArray.keyAt(i4);
                    C0549a a = C0140r.m486a(keyAt, (ArrayList) arrayList, (ArrayList) arrayList2, i, i2);
                    C0139a c0139a = (C0139a) sparseArray.valueAt(i4);
                    if (z) {
                        C0140r.m498a(c0535m, keyAt, c0139a, view, a);
                    } else {
                        C0140r.m514b(c0535m, keyAt, c0139a, view, a);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m500a(C0148t c0148t, ViewGroup viewGroup, C0530g c0530g, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        final Object obj3 = obj;
        final C0148t c0148t2 = c0148t;
        final View view2 = view;
        final C0530g c0530g2 = c0530g;
        final ArrayList<View> arrayList4 = arrayList;
        final ArrayList<View> arrayList5 = arrayList2;
        final ArrayList<View> arrayList6 = arrayList3;
        final Object obj4 = obj2;
        Runnable c01362 = new Runnable() {
            public void run() {
                if (obj3 != null) {
                    c0148t2.mo65c(obj3, view2);
                    arrayList5.addAll(C0140r.m511b(c0148t2, obj3, c0530g2, arrayList4, view2));
                }
                if (arrayList6 != null) {
                    if (obj4 != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(view2);
                        c0148t2.mo63b(obj4, arrayList6, arrayList);
                    }
                    arrayList6.clear();
                    arrayList6.add(view2);
                }
            }
        };
        ViewGroup viewGroup2 = viewGroup;
        C0152w.m553a(viewGroup, c01362);
    }

    /* renamed from: a */
    private static void m501a(C0148t c0148t, Object obj, C0530g c0530g, final ArrayList<View> arrayList) {
        if (c0530g != null && obj != null && c0530g.f1888l && c0530g.f1858B && c0530g.f1873Q) {
            c0530g.m2182f(true);
            c0148t.mo62b(obj, c0530g.m2191k(), (ArrayList) arrayList);
            C0152w.m553a(c0530g.f1865I, new Runnable() {
                public void run() {
                    C0140r.m515b(arrayList, 4);
                }
            });
        }
    }

    /* renamed from: a */
    private static void m502a(C0148t c0148t, Object obj, Object obj2, C0549a<String, View> c0549a, boolean z, C0528c c0528c) {
        if (c0528c.f1850r != null && !c0528c.f1850r.isEmpty()) {
            View view = (View) c0549a.get((String) (z ? c0528c.f1851s : c0528c.f1850r).get(0));
            c0148t.mo53a(obj, view);
            if (obj2 != null) {
                c0148t.mo53a(obj2, view);
            }
        }
    }

    /* renamed from: a */
    private static void m503a(C0549a<String, String> c0549a, C0549a<String, View> c0549a2) {
        for (int size = c0549a.size() - 1; size >= 0; size--) {
            if (!c0549a2.containsKey((String) c0549a.m722c(size))) {
                c0549a.m723d(size);
            }
        }
    }

    /* renamed from: a */
    private static void m505a(ArrayList<View> arrayList, C0549a<String, View> c0549a, Collection<String> collection) {
        for (int size = c0549a.size() - 1; size >= 0; size--) {
            View view = (View) c0549a.m722c(size);
            if (collection.contains(C0227p.m879e(view))) {
                arrayList.add(view);
            }
        }
    }

    /* renamed from: a */
    private static boolean m506a(C0148t c0148t, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!c0148t.mo58a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static C0549a<String, View> m507b(C0148t c0148t, C0549a<String, String> c0549a, Object obj, C0139a c0139a) {
        if (!c0549a.isEmpty()) {
            if (obj != null) {
                C0153x R;
                ArrayList arrayList;
                C0530g c0530g = c0139a.f594d;
                Map c0549a2 = new C0549a();
                c0148t.m535a(c0549a2, c0530g.m2191k());
                C0528c c0528c = c0139a.f596f;
                if (c0139a.f595e) {
                    R = c0530g.m2126R();
                    arrayList = c0528c.f1851s;
                } else {
                    R = c0530g.m2127S();
                    arrayList = c0528c.f1850r;
                }
                c0549a2.m2393a(arrayList);
                if (R != null) {
                    R.m556a(arrayList, c0549a2);
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        String str = (String) arrayList.get(size);
                        View view = (View) c0549a2.get(str);
                        if (view == null) {
                            c0549a.remove(str);
                        } else if (!str.equals(C0227p.m879e(view))) {
                            c0549a.put(C0227p.m879e(view), (String) c0549a.remove(str));
                        }
                    }
                } else {
                    c0549a.m2393a(c0549a2.keySet());
                }
                return c0549a2;
            }
        }
        c0549a.clear();
        return null;
    }

    /* renamed from: b */
    private static View m508b(C0549a<String, View> c0549a, C0139a c0139a, Object obj, boolean z) {
        C0528c c0528c = c0139a.f593c;
        if (obj == null || c0549a == null || c0528c.f1850r == null || c0528c.f1850r.isEmpty()) {
            return null;
        }
        return (View) c0549a.get((String) (z ? c0528c.f1850r : c0528c.f1851s).get(0));
    }

    /* renamed from: b */
    private static Object m509b(C0148t c0148t, C0530g c0530g, boolean z) {
        if (c0530g == null) {
            return null;
        }
        return c0148t.mo59b(z ? c0530g.m2205v() : c0530g.m2206w());
    }

    /* renamed from: b */
    private static Object m510b(C0148t c0148t, ViewGroup viewGroup, View view, C0549a<String, String> c0549a, C0139a c0139a, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        C0148t c0148t2 = c0148t;
        C0139a c0139a2 = c0139a;
        ArrayList arrayList3 = arrayList;
        Object obj3 = obj;
        C0530g c0530g = c0139a2.f591a;
        C0530g c0530g2 = c0139a2.f594d;
        if (c0530g != null) {
            if (c0530g2 != null) {
                C0549a c0549a2;
                Object obj4;
                Object obj5;
                boolean z = c0139a2.f592b;
                if (c0549a.isEmpty()) {
                    c0549a2 = c0549a;
                    obj4 = null;
                } else {
                    obj4 = C0140r.m489a(c0148t2, c0530g, c0530g2, z);
                    c0549a2 = c0549a;
                }
                C0549a b = C0140r.m507b(c0148t2, c0549a2, obj4, c0139a2);
                if (c0549a.isEmpty()) {
                    obj5 = null;
                } else {
                    arrayList3.addAll(b.values());
                    obj5 = obj4;
                }
                if (obj3 == null && obj2 == null && obj5 == null) {
                    return null;
                }
                Rect rect;
                C0140r.m513b(c0530g, c0530g2, z, b, true);
                if (obj5 != null) {
                    rect = new Rect();
                    c0148t2.mo54a(obj5, view, arrayList3);
                    C0140r.m502a(c0148t, obj5, obj2, b, c0139a2.f595e, c0139a2.f596f);
                    if (obj3 != null) {
                        c0148t2.mo52a(obj3, rect);
                    }
                } else {
                    rect = null;
                }
                final C0148t c0148t3 = c0148t;
                final C0549a<String, String> c0549a3 = c0549a;
                final Object obj6 = obj5;
                final C0139a c0139a3 = c0139a;
                C01384 c01384 = r0;
                final ArrayList<View> arrayList4 = arrayList2;
                final View view2 = view;
                final C0530g c0530g3 = c0530g;
                c0530g = c0530g2;
                final boolean z2 = z;
                final ArrayList<View> arrayList5 = arrayList;
                obj3 = obj;
                final Rect rect2 = rect;
                C01384 c013842 = new Runnable() {
                    public void run() {
                        C0549a a = C0140r.m516c(c0148t3, c0549a3, obj6, c0139a3);
                        if (a != null) {
                            arrayList4.addAll(a.values());
                            arrayList4.add(view2);
                        }
                        C0140r.m513b(c0530g3, c0530g, z2, a, false);
                        if (obj6 != null) {
                            c0148t3.mo57a(obj6, arrayList5, arrayList4);
                            View a2 = C0140r.m508b(a, c0139a3, obj3, z2);
                            if (a2 != null) {
                                c0148t3.m523a(a2, rect2);
                            }
                        }
                    }
                };
                C0152w.m553a(viewGroup, c01384);
                return obj5;
            }
        }
        return null;
    }

    /* renamed from: b */
    private static ArrayList<View> m511b(C0148t c0148t, Object obj, C0530g c0530g, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        View k = c0530g.m2191k();
        if (k != null) {
            c0148t.m534a(arrayList2, k);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        c0148t.mo56a(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: b */
    public static void m512b(C0528c c0528c, SparseArray<C0139a> sparseArray, boolean z) {
        if (c0528c.f1833a.f1939n.mo41a()) {
            for (int size = c0528c.f1834b.size() - 1; size >= 0; size--) {
                C0140r.m495a(c0528c, (C0104a) c0528c.f1834b.get(size), (SparseArray) sparseArray, true, z);
            }
        }
    }

    /* renamed from: b */
    private static void m513b(C0530g c0530g, C0530g c0530g2, boolean z, C0549a<String, View> c0549a, boolean z2) {
        C0153x R = z ? c0530g2.m2126R() : c0530g.m2126R();
        if (R != null) {
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            int i = 0;
            int size = c0549a == null ? 0 : c0549a.size();
            while (i < size) {
                arrayList2.add(c0549a.m721b(i));
                arrayList.add(c0549a.m722c(i));
                i++;
            }
            if (z2) {
                R.m555a(arrayList2, arrayList, null);
            } else {
                R.m557b(arrayList2, arrayList, null);
            }
        }
    }

    /* renamed from: b */
    private static void m514b(C0535m c0535m, int i, C0139a c0139a, View view, C0549a<String, String> c0549a) {
        C0535m c0535m2 = c0535m;
        C0139a c0139a2 = c0139a;
        View view2 = view;
        Map map = c0549a;
        ViewGroup viewGroup = c0535m2.f1939n.mo41a() ? (ViewGroup) c0535m2.f1939n.mo40a(i) : null;
        if (viewGroup != null) {
            C0530g c0530g = c0139a2.f591a;
            C0530g c0530g2 = c0139a2.f594d;
            C0148t a = C0140r.m485a(c0530g2, c0530g);
            if (a != null) {
                Object obj;
                Object obj2;
                Object a2;
                C0148t c0148t;
                ArrayList arrayList;
                boolean z = c0139a2.f592b;
                boolean z2 = c0139a2.f595e;
                Object a3 = C0140r.m490a(a, c0530g, z);
                Object b = C0140r.m509b(a, c0530g2, z2);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = arrayList2;
                Object obj3 = b;
                Object obj4 = a3;
                C0148t c0148t2 = a;
                b = C0140r.m510b(a, viewGroup, view, c0549a, c0139a, arrayList2, arrayList3, a3, obj3);
                Object obj5 = obj4;
                if (obj5 == null && b == null) {
                    obj = obj3;
                    if (obj == null) {
                        return;
                    }
                }
                obj = obj3;
                ArrayList b2 = C0140r.m511b(c0148t2, obj, c0530g2, arrayList4, view2);
                if (b2 != null) {
                    if (!b2.isEmpty()) {
                        obj2 = obj;
                        c0148t2.mo61b(obj5, view2);
                        a2 = C0140r.m492a(c0148t2, obj5, obj2, b, c0530g, c0139a2.f592b);
                        if (a2 != null) {
                            arrayList4 = new ArrayList();
                            c0148t = c0148t2;
                            c0148t.mo55a(a2, obj5, arrayList4, obj2, b2, b, arrayList3);
                            C0140r.m500a(c0148t, viewGroup, c0530g, view, arrayList3, obj5, arrayList4, obj2, b2);
                            arrayList = arrayList3;
                            c0148t2.m525a((View) viewGroup, arrayList, map);
                            c0148t2.mo51a(viewGroup, a2);
                            c0148t2.m527a(viewGroup, arrayList, map);
                        }
                    }
                }
                obj2 = null;
                c0148t2.mo61b(obj5, view2);
                a2 = C0140r.m492a(c0148t2, obj5, obj2, b, c0530g, c0139a2.f592b);
                if (a2 != null) {
                    arrayList4 = new ArrayList();
                    c0148t = c0148t2;
                    c0148t.mo55a(a2, obj5, arrayList4, obj2, b2, b, arrayList3);
                    C0140r.m500a(c0148t, viewGroup, c0530g, view, arrayList3, obj5, arrayList4, obj2, b2);
                    arrayList = arrayList3;
                    c0148t2.m525a((View) viewGroup, arrayList, map);
                    c0148t2.mo51a(viewGroup, a2);
                    c0148t2.m527a(viewGroup, arrayList, map);
                }
            }
        }
    }

    /* renamed from: b */
    private static void m515b(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((View) arrayList.get(size)).setVisibility(i);
            }
        }
    }

    /* renamed from: c */
    private static C0549a<String, View> m516c(C0148t c0148t, C0549a<String, String> c0549a, Object obj, C0139a c0139a) {
        C0530g c0530g = c0139a.f591a;
        View k = c0530g.m2191k();
        if (!(c0549a.isEmpty() || obj == null)) {
            if (k != null) {
                C0153x S;
                ArrayList arrayList;
                C0549a c0549a2 = new C0549a();
                c0148t.m535a((Map) c0549a2, k);
                C0528c c0528c = c0139a.f593c;
                if (c0139a.f592b) {
                    S = c0530g.m2127S();
                    arrayList = c0528c.f1850r;
                } else {
                    S = c0530g.m2126R();
                    arrayList = c0528c.f1851s;
                }
                if (arrayList != null) {
                    c0549a2.m2393a(arrayList);
                    c0549a2.m2393a(c0549a.values());
                }
                if (S != null) {
                    S.m556a(arrayList, c0549a2);
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        String str = (String) arrayList.get(size);
                        k = (View) c0549a2.get(str);
                        if (k == null) {
                            str = C0140r.m493a((C0549a) c0549a, str);
                            if (str != null) {
                                c0549a.remove(str);
                            }
                        } else if (!str.equals(C0227p.m879e(k))) {
                            str = C0140r.m493a((C0549a) c0549a, str);
                            if (str != null) {
                                c0549a.put(str, C0227p.m879e(k));
                            }
                        }
                    }
                } else {
                    C0140r.m503a((C0549a) c0549a, c0549a2);
                }
                return c0549a2;
            }
        }
        c0549a.clear();
        return null;
    }
}
