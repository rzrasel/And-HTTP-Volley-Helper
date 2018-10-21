package android.support.v4.p015e;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.support.v4.p008a.p009a.C0090a;
import android.support.v4.p010b.C0166h;
import android.support.v4.p015e.C0182c.C0181a;
import android.support.v4.p016f.C0188g;
import android.support.v4.p016f.C0196j;
import android.support.v4.p016f.C0197k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v4.e.b */
public class C0176b {
    /* renamed from: a */
    private static final C0188g<String, Typeface> f664a = new C0188g(16);
    /* renamed from: b */
    private static final C0182c f665b = new C0182c("fonts", 10, 10000);
    /* renamed from: c */
    private static final Object f666c = new Object();
    /* renamed from: d */
    private static final C0197k<String, ArrayList<C0181a<C0175c>>> f667d = new C0197k();
    /* renamed from: e */
    private static final Comparator<byte[]> f668e = new C01724();

    /* renamed from: android.support.v4.e.b$4 */
    static class C01724 implements Comparator<byte[]> {
        C01724() {
        }

        /* renamed from: a */
        public int m625a(byte[] bArr, byte[] bArr2) {
            int length;
            int length2;
            if (bArr.length != bArr2.length) {
                length = bArr.length;
                length2 = bArr2.length;
            } else {
                int i = 0;
                while (i < bArr.length) {
                    if (bArr[i] != bArr2[i]) {
                        length = bArr[i];
                        length2 = bArr2[i];
                    } else {
                        i++;
                    }
                }
                return 0;
            }
            return length - length2;
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m625a((byte[]) obj, (byte[]) obj2);
        }
    }

    /* renamed from: android.support.v4.e.b$a */
    public static class C0173a {
        /* renamed from: a */
        private final int f655a;
        /* renamed from: b */
        private final C0174b[] f656b;

        public C0173a(int i, C0174b[] c0174bArr) {
            this.f655a = i;
            this.f656b = c0174bArr;
        }

        /* renamed from: a */
        public int m626a() {
            return this.f655a;
        }

        /* renamed from: b */
        public C0174b[] m627b() {
            return this.f656b;
        }
    }

    /* renamed from: android.support.v4.e.b$b */
    public static class C0174b {
        /* renamed from: a */
        private final Uri f657a;
        /* renamed from: b */
        private final int f658b;
        /* renamed from: c */
        private final int f659c;
        /* renamed from: d */
        private final boolean f660d;
        /* renamed from: e */
        private final int f661e;

        public C0174b(Uri uri, int i, int i2, boolean z, int i3) {
            this.f657a = (Uri) C0196j.m711a(uri);
            this.f658b = i;
            this.f659c = i2;
            this.f660d = z;
            this.f661e = i3;
        }

        /* renamed from: a */
        public Uri m628a() {
            return this.f657a;
        }

        /* renamed from: b */
        public int m629b() {
            return this.f658b;
        }

        /* renamed from: c */
        public int m630c() {
            return this.f659c;
        }

        /* renamed from: d */
        public boolean m631d() {
            return this.f660d;
        }

        /* renamed from: e */
        public int m632e() {
            return this.f661e;
        }
    }

    /* renamed from: android.support.v4.e.b$c */
    private static final class C0175c {
        /* renamed from: a */
        final Typeface f662a;
        /* renamed from: b */
        final int f663b;

        C0175c(Typeface typeface, int i) {
            this.f662a = typeface;
            this.f663b = i;
        }
    }

    /* renamed from: a */
    public static ProviderInfo m633a(PackageManager packageManager, C0170a c0170a, Resources resources) {
        String a = c0170a.m618a();
        int i = 0;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(a, 0);
        if (resolveContentProvider == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No package found for authority: ");
            stringBuilder.append(a);
            throw new NameNotFoundException(stringBuilder.toString());
        } else if (resolveContentProvider.packageName.equals(c0170a.m619b())) {
            List a2 = C0176b.m639a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a2, f668e);
            List a3 = C0176b.m638a(c0170a, resources);
            while (i < a3.size()) {
                List arrayList = new ArrayList((Collection) a3.get(i));
                Collections.sort(arrayList, f668e);
                if (C0176b.m641a(a2, arrayList)) {
                    return resolveContentProvider;
                }
                i++;
            }
            return null;
        } else {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Found content provider ");
            stringBuilder2.append(a);
            stringBuilder2.append(", but package was not ");
            stringBuilder2.append(c0170a.m619b());
            throw new NameNotFoundException(stringBuilder2.toString());
        }
    }

    /* renamed from: a */
    public static android.graphics.Typeface m634a(final android.content.Context r2, final android.support.v4.p015e.C0170a r3, final android.support.v4.p008a.p009a.C0094b.C0093a r4, final android.os.Handler r5, boolean r6, int r7, final int r8) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/1763344271.run(Unknown Source)
*/
        /*
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = r3.m623f();
        r0.append(r1);
        r1 = "-";
        r0.append(r1);
        r0.append(r8);
        r0 = r0.toString();
        r1 = f664a;
        r1 = r1.m684a(r0);
        r1 = (android.graphics.Typeface) r1;
        if (r1 == 0) goto L_0x0028;
    L_0x0022:
        if (r4 == 0) goto L_0x0027;
    L_0x0024:
        r4.mo344a(r1);
    L_0x0027:
        return r1;
    L_0x0028:
        if (r6 == 0) goto L_0x0045;
    L_0x002a:
        r1 = -1;
        if (r7 != r1) goto L_0x0045;
    L_0x002d:
        r2 = android.support.v4.p015e.C0176b.m643b(r2, r3, r8);
        if (r4 == 0) goto L_0x0042;
    L_0x0033:
        r3 = r2.f663b;
        if (r3 != 0) goto L_0x003d;
    L_0x0037:
        r3 = r2.f662a;
        r4.m371a(r3, r5);
        goto L_0x0042;
    L_0x003d:
        r3 = r2.f663b;
        r4.m369a(r3, r5);
    L_0x0042:
        r2 = r2.f662a;
        return r2;
    L_0x0045:
        r1 = new android.support.v4.e.b$1;
        r1.<init>(r2, r3, r8, r0);
        r2 = 0;
        if (r6 == 0) goto L_0x0059;
    L_0x004d:
        r3 = f665b;	 Catch:{ InterruptedException -> 0x0058 }
        r3 = r3.m652a(r1, r7);	 Catch:{ InterruptedException -> 0x0058 }
        r3 = (android.support.v4.p015e.C0176b.C0175c) r3;	 Catch:{ InterruptedException -> 0x0058 }
        r3 = r3.f662a;	 Catch:{ InterruptedException -> 0x0058 }
        return r3;
    L_0x0058:
        return r2;
    L_0x0059:
        if (r4 != 0) goto L_0x005d;
    L_0x005b:
        r3 = r2;
        goto L_0x0062;
    L_0x005d:
        r3 = new android.support.v4.e.b$2;
        r3.<init>(r4, r5);
    L_0x0062:
        r4 = f666c;
        monitor-enter(r4);
        r5 = f667d;	 Catch:{ all -> 0x0097 }
        r5 = r5.containsKey(r0);	 Catch:{ all -> 0x0097 }
        if (r5 == 0) goto L_0x007c;	 Catch:{ all -> 0x0097 }
    L_0x006d:
        if (r3 == 0) goto L_0x007a;	 Catch:{ all -> 0x0097 }
    L_0x006f:
        r5 = f667d;	 Catch:{ all -> 0x0097 }
        r5 = r5.get(r0);	 Catch:{ all -> 0x0097 }
        r5 = (java.util.ArrayList) r5;	 Catch:{ all -> 0x0097 }
        r5.add(r3);	 Catch:{ all -> 0x0097 }
    L_0x007a:
        monitor-exit(r4);	 Catch:{ all -> 0x0097 }
        return r2;	 Catch:{ all -> 0x0097 }
    L_0x007c:
        if (r3 == 0) goto L_0x008b;	 Catch:{ all -> 0x0097 }
    L_0x007e:
        r5 = new java.util.ArrayList;	 Catch:{ all -> 0x0097 }
        r5.<init>();	 Catch:{ all -> 0x0097 }
        r5.add(r3);	 Catch:{ all -> 0x0097 }
        r3 = f667d;	 Catch:{ all -> 0x0097 }
        r3.put(r0, r5);	 Catch:{ all -> 0x0097 }
    L_0x008b:
        monitor-exit(r4);	 Catch:{ all -> 0x0097 }
        r3 = f665b;
        r4 = new android.support.v4.e.b$3;
        r4.<init>(r0);
        r3.m653a(r1, r4);
        return r2;
    L_0x0097:
        r2 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0097 }
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.e.b.a(android.content.Context, android.support.v4.e.a, android.support.v4.a.a.b$a, android.os.Handler, boolean, int, int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public static C0173a m635a(Context context, CancellationSignal cancellationSignal, C0170a c0170a) {
        ProviderInfo a = C0176b.m633a(context.getPackageManager(), c0170a, context.getResources());
        return a == null ? new C0173a(1, null) : new C0173a(0, C0176b.m642a(context, c0170a, a.authority, cancellationSignal));
    }

    /* renamed from: a */
    private static List<List<byte[]>> m638a(C0170a c0170a, Resources resources) {
        return c0170a.m621d() != null ? c0170a.m621d() : C0090a.m362a(resources, c0170a.m622e());
    }

    /* renamed from: a */
    private static List<byte[]> m639a(Signature[] signatureArr) {
        List<byte[]> arrayList = new ArrayList();
        for (Signature toByteArray : signatureArr) {
            arrayList.add(toByteArray.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map<Uri, ByteBuffer> m640a(Context context, C0174b[] c0174bArr, CancellationSignal cancellationSignal) {
        Map hashMap = new HashMap();
        for (C0174b c0174b : c0174bArr) {
            if (c0174b.m632e() == 0) {
                Uri a = c0174b.m628a();
                if (!hashMap.containsKey(a)) {
                    hashMap.put(a, C0166h.m608a(context, cancellationSignal, a));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    private static boolean m641a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    static C0174b[] m642a(Context context, C0170a c0170a, String str, CancellationSignal cancellationSignal) {
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        Uri build = new Builder().scheme("content").authority(str2).build();
        Uri build2 = new Builder().scheme("content").authority(str2).appendPath("file").build();
        Cursor cursor = null;
        try {
            cursor = VERSION.SDK_INT > 16 ? context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{c0170a.m620c()}, null, cancellationSignal) : context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{c0170a.m620c()}, null);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    int i2 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                    Uri withAppendedId = columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    int i3 = columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400;
                    boolean z = columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1;
                    arrayList2.add(new C0174b(withAppendedId, i2, i3, z, i));
                }
                arrayList = arrayList2;
            }
            if (cursor != null) {
                cursor.close();
            }
            return (C0174b[]) arrayList.toArray(new C0174b[0]);
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* renamed from: b */
    private static android.support.v4.p015e.C0176b.C0175c m643b(android.content.Context r3, android.support.v4.p015e.C0170a r4, int r5) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/1763344271.run(Unknown Source)
*/
        /*
        r0 = 0;
        r4 = android.support.v4.p015e.C0176b.m635a(r3, r0, r4);	 Catch:{ NameNotFoundException -> 0x002b }
        r1 = r4.m626a();
        r2 = -3;
        if (r1 != 0) goto L_0x001d;
    L_0x000c:
        r4 = r4.m627b();
        r3 = android.support.v4.p010b.C0164c.m600a(r3, r0, r4, r5);
        r4 = new android.support.v4.e.b$c;
        if (r3 == 0) goto L_0x0019;
    L_0x0018:
        r2 = 0;
    L_0x0019:
        r4.<init>(r3, r2);
        return r4;
    L_0x001d:
        r3 = r4.m626a();
        r4 = 1;
        if (r3 != r4) goto L_0x0025;
    L_0x0024:
        r2 = -2;
    L_0x0025:
        r3 = new android.support.v4.e.b$c;
        r3.<init>(r0, r2);
        return r3;
    L_0x002b:
        r3 = new android.support.v4.e.b$c;
        r4 = -1;
        r3.<init>(r0, r4);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.e.b.b(android.content.Context, android.support.v4.e.a, int):android.support.v4.e.b$c");
    }
}
