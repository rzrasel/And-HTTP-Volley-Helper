package android.support.v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v7.widget.e */
class C0389e extends DataSetObservable {
    /* renamed from: a */
    static final String f1383a = "e";
    /* renamed from: e */
    private static final Object f1384e = new Object();
    /* renamed from: f */
    private static final Map<String, C0389e> f1385f = new HashMap();
    /* renamed from: b */
    final Context f1386b;
    /* renamed from: c */
    final String f1387c;
    /* renamed from: d */
    boolean f1388d;
    /* renamed from: g */
    private final Object f1389g;
    /* renamed from: h */
    private final List<C0384a> f1390h;
    /* renamed from: i */
    private final List<C0386c> f1391i;
    /* renamed from: j */
    private Intent f1392j;
    /* renamed from: k */
    private C0385b f1393k;
    /* renamed from: l */
    private int f1394l;
    /* renamed from: m */
    private boolean f1395m;
    /* renamed from: n */
    private boolean f1396n;
    /* renamed from: o */
    private boolean f1397o;
    /* renamed from: p */
    private C0387d f1398p;

    /* renamed from: android.support.v7.widget.e$a */
    public static final class C0384a implements Comparable<C0384a> {
        /* renamed from: a */
        public final ResolveInfo f1377a;
        /* renamed from: b */
        public float f1378b;

        public C0384a(ResolveInfo resolveInfo) {
            this.f1377a = resolveInfo;
        }

        /* renamed from: a */
        public int m1517a(C0384a c0384a) {
            return Float.floatToIntBits(c0384a.f1378b) - Float.floatToIntBits(this.f1378b);
        }

        public /* synthetic */ int compareTo(Object obj) {
            return m1517a((C0384a) obj);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return Float.floatToIntBits(this.f1378b) == Float.floatToIntBits(((C0384a) obj).f1378b);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f1378b) + 31;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append("resolveInfo:");
            stringBuilder.append(this.f1377a.toString());
            stringBuilder.append("; weight:");
            stringBuilder.append(new BigDecimal((double) this.f1378b));
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    /* renamed from: android.support.v7.widget.e$b */
    public interface C0385b {
        /* renamed from: a */
        void m1518a(Intent intent, List<C0384a> list, List<C0386c> list2);
    }

    /* renamed from: android.support.v7.widget.e$c */
    public static final class C0386c {
        /* renamed from: a */
        public final ComponentName f1379a;
        /* renamed from: b */
        public final long f1380b;
        /* renamed from: c */
        public final float f1381c;

        public C0386c(ComponentName componentName, long j, float f) {
            this.f1379a = componentName;
            this.f1380b = j;
            this.f1381c = f;
        }

        public C0386c(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0386c c0386c = (C0386c) obj;
            if (this.f1379a == null) {
                if (c0386c.f1379a != null) {
                    return false;
                }
            } else if (!this.f1379a.equals(c0386c.f1379a)) {
                return false;
            }
            return this.f1380b == c0386c.f1380b && Float.floatToIntBits(this.f1381c) == Float.floatToIntBits(c0386c.f1381c);
        }

        public int hashCode() {
            return (((((this.f1379a == null ? 0 : this.f1379a.hashCode()) + 31) * 31) + ((int) (this.f1380b ^ (this.f1380b >>> 32)))) * 31) + Float.floatToIntBits(this.f1381c);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append("; activity:");
            stringBuilder.append(this.f1379a);
            stringBuilder.append("; time:");
            stringBuilder.append(this.f1380b);
            stringBuilder.append("; weight:");
            stringBuilder.append(new BigDecimal((double) this.f1381c));
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    /* renamed from: android.support.v7.widget.e$d */
    public interface C0387d {
        /* renamed from: a */
        boolean m1519a(C0389e c0389e, Intent intent);
    }

    /* renamed from: android.support.v7.widget.e$e */
    private final class C0388e extends AsyncTask<Object, Void, Void> {
        /* renamed from: a */
        final /* synthetic */ C0389e f1382a;

        C0388e(C0389e c0389e) {
            this.f1382a = c0389e;
        }

        /* renamed from: a */
        public java.lang.Void m1520a(java.lang.Object... r12) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/1763344271.run(Unknown Source)
*/
            /*
            r11 = this;
            r0 = 0;
            r1 = r12[r0];
            r1 = (java.util.List) r1;
            r2 = 1;
            r12 = r12[r2];
            r12 = (java.lang.String) r12;
            r3 = 0;
            r4 = r11.f1382a;	 Catch:{ FileNotFoundException -> 0x00e8 }
            r4 = r4.f1386b;	 Catch:{ FileNotFoundException -> 0x00e8 }
            r4 = r4.openFileOutput(r12, r0);	 Catch:{ FileNotFoundException -> 0x00e8 }
            r12 = android.util.Xml.newSerializer();
            r12.setOutput(r4, r3);	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r5 = "UTF-8";	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r6 = java.lang.Boolean.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r12.startDocument(r5, r6);	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r5 = "historical-records";	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r12.startTag(r3, r5);	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r5 = r1.size();	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r6 = 0;	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
        L_0x002d:
            if (r6 >= r5) goto L_0x0063;	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
        L_0x002f:
            r7 = r1.remove(r0);	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r7 = (android.support.v7.widget.C0389e.C0386c) r7;	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r8 = "historical-record";	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r12.startTag(r3, r8);	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r8 = "activity";	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r9 = r7.f1379a;	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r9 = r9.flattenToString();	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r12.attribute(r3, r8, r9);	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r8 = "time";	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r9 = r7.f1380b;	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r9 = java.lang.String.valueOf(r9);	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r12.attribute(r3, r8, r9);	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r8 = "weight";	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r7 = r7.f1381c;	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r7 = java.lang.String.valueOf(r7);	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r12.attribute(r3, r8, r7);	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r7 = "historical-record";	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r12.endTag(r3, r7);	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r6 = r6 + 1;	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            goto L_0x002d;	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
        L_0x0063:
            r0 = "historical-records";	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r12.endTag(r3, r0);	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r12.endDocument();	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r12 = r11.f1382a;
            r12.f1388d = r2;
            if (r4 == 0) goto L_0x00dd;
        L_0x0071:
            r4.close();	 Catch:{ IOException -> 0x00dd }
            goto L_0x00dd;
        L_0x0075:
            r12 = move-exception;
            goto L_0x00de;
        L_0x0077:
            r12 = move-exception;
            r0 = android.support.v7.widget.C0389e.f1383a;	 Catch:{ all -> 0x0075 }
            r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0075 }
            r1.<init>();	 Catch:{ all -> 0x0075 }
            r5 = "Error writing historical record file: ";	 Catch:{ all -> 0x0075 }
            r1.append(r5);	 Catch:{ all -> 0x0075 }
            r5 = r11.f1382a;	 Catch:{ all -> 0x0075 }
            r5 = r5.f1387c;	 Catch:{ all -> 0x0075 }
            r1.append(r5);	 Catch:{ all -> 0x0075 }
            r1 = r1.toString();	 Catch:{ all -> 0x0075 }
            android.util.Log.e(r0, r1, r12);	 Catch:{ all -> 0x0075 }
            r12 = r11.f1382a;
            r12.f1388d = r2;
            if (r4 == 0) goto L_0x00dd;
        L_0x0098:
            goto L_0x0071;
        L_0x0099:
            r12 = move-exception;
            r0 = android.support.v7.widget.C0389e.f1383a;	 Catch:{ all -> 0x0075 }
            r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0075 }
            r1.<init>();	 Catch:{ all -> 0x0075 }
            r5 = "Error writing historical record file: ";	 Catch:{ all -> 0x0075 }
            r1.append(r5);	 Catch:{ all -> 0x0075 }
            r5 = r11.f1382a;	 Catch:{ all -> 0x0075 }
            r5 = r5.f1387c;	 Catch:{ all -> 0x0075 }
            r1.append(r5);	 Catch:{ all -> 0x0075 }
            r1 = r1.toString();	 Catch:{ all -> 0x0075 }
            android.util.Log.e(r0, r1, r12);	 Catch:{ all -> 0x0075 }
            r12 = r11.f1382a;
            r12.f1388d = r2;
            if (r4 == 0) goto L_0x00dd;
        L_0x00ba:
            goto L_0x0071;
        L_0x00bb:
            r12 = move-exception;
            r0 = android.support.v7.widget.C0389e.f1383a;	 Catch:{ all -> 0x0075 }
            r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0075 }
            r1.<init>();	 Catch:{ all -> 0x0075 }
            r5 = "Error writing historical record file: ";	 Catch:{ all -> 0x0075 }
            r1.append(r5);	 Catch:{ all -> 0x0075 }
            r5 = r11.f1382a;	 Catch:{ all -> 0x0075 }
            r5 = r5.f1387c;	 Catch:{ all -> 0x0075 }
            r1.append(r5);	 Catch:{ all -> 0x0075 }
            r1 = r1.toString();	 Catch:{ all -> 0x0075 }
            android.util.Log.e(r0, r1, r12);	 Catch:{ all -> 0x0075 }
            r12 = r11.f1382a;
            r12.f1388d = r2;
            if (r4 == 0) goto L_0x00dd;
        L_0x00dc:
            goto L_0x0071;
        L_0x00dd:
            return r3;
        L_0x00de:
            r0 = r11.f1382a;
            r0.f1388d = r2;
            if (r4 == 0) goto L_0x00e7;
        L_0x00e4:
            r4.close();	 Catch:{ IOException -> 0x00e7 }
        L_0x00e7:
            throw r12;
        L_0x00e8:
            r0 = move-exception;
            r1 = android.support.v7.widget.C0389e.f1383a;
            r2 = new java.lang.StringBuilder;
            r2.<init>();
            r4 = "Error writing historical record file: ";
            r2.append(r4);
            r2.append(r12);
            r12 = r2.toString();
            android.util.Log.e(r1, r12, r0);
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.e.e.a(java.lang.Object[]):java.lang.Void");
        }

        public /* synthetic */ Object doInBackground(Object[] objArr) {
            return m1520a(objArr);
        }
    }

    /* renamed from: a */
    private boolean m1521a(C0386c c0386c) {
        boolean add = this.f1391i.add(c0386c);
        if (add) {
            this.f1396n = true;
            m1527h();
            m1522c();
            m1524e();
            notifyChanged();
        }
        return add;
    }

    /* renamed from: c */
    private void m1522c() {
        if (!this.f1395m) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        } else if (this.f1396n) {
            this.f1396n = false;
            if (!TextUtils.isEmpty(this.f1387c)) {
                new C0388e(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[]{new ArrayList(this.f1391i), this.f1387c});
            }
        }
    }

    /* renamed from: d */
    private void m1523d() {
        int f = m1525f() | m1526g();
        m1527h();
        if (f != 0) {
            m1524e();
            notifyChanged();
        }
    }

    /* renamed from: e */
    private boolean m1524e() {
        if (this.f1393k == null || this.f1392j == null || this.f1390h.isEmpty() || this.f1391i.isEmpty()) {
            return false;
        }
        this.f1393k.m1518a(this.f1392j, this.f1390h, Collections.unmodifiableList(this.f1391i));
        return true;
    }

    /* renamed from: f */
    private boolean m1525f() {
        int i = 0;
        if (!this.f1397o || this.f1392j == null) {
            return false;
        }
        this.f1397o = false;
        this.f1390h.clear();
        List queryIntentActivities = this.f1386b.getPackageManager().queryIntentActivities(this.f1392j, 0);
        int size = queryIntentActivities.size();
        while (i < size) {
            this.f1390h.add(new C0384a((ResolveInfo) queryIntentActivities.get(i)));
            i++;
        }
        return true;
    }

    /* renamed from: g */
    private boolean m1526g() {
        if (!this.f1388d || !this.f1396n || TextUtils.isEmpty(this.f1387c)) {
            return false;
        }
        this.f1388d = false;
        this.f1395m = true;
        m1528i();
        return true;
    }

    /* renamed from: h */
    private void m1527h() {
        int size = this.f1391i.size() - this.f1394l;
        if (size > 0) {
            this.f1396n = true;
            for (int i = 0; i < size; i++) {
                C0386c c0386c = (C0386c) this.f1391i.remove(0);
            }
        }
    }

    /* renamed from: i */
    private void m1528i() {
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
        r9 = this;
        r0 = r9.f1386b;	 Catch:{ FileNotFoundException -> 0x00c4 }
        r1 = r9.f1387c;	 Catch:{ FileNotFoundException -> 0x00c4 }
        r0 = r0.openFileInput(r1);	 Catch:{ FileNotFoundException -> 0x00c4 }
        r1 = android.util.Xml.newPullParser();	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r2 = "UTF-8";	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r1.setInput(r0, r2);	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r2 = 0;	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
    L_0x0012:
        r3 = 1;	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        if (r2 == r3) goto L_0x001d;	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
    L_0x0015:
        r4 = 2;	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        if (r2 == r4) goto L_0x001d;	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
    L_0x0018:
        r2 = r1.next();	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        goto L_0x0012;	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
    L_0x001d:
        r2 = "historical-records";	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r4 = r1.getName();	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r2 = r2.equals(r4);	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        if (r2 == 0) goto L_0x007a;	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
    L_0x0029:
        r2 = r9.f1391i;	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r2.clear();	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
    L_0x002e:
        r4 = r1.next();	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        if (r4 != r3) goto L_0x003b;
    L_0x0034:
        if (r0 == 0) goto L_0x00bd;
    L_0x0036:
        r0.close();	 Catch:{ IOException -> 0x00bd }
        goto L_0x00bd;
    L_0x003b:
        r5 = 3;
        if (r4 == r5) goto L_0x002e;
    L_0x003e:
        r5 = 4;
        if (r4 != r5) goto L_0x0042;
    L_0x0041:
        goto L_0x002e;
    L_0x0042:
        r4 = r1.getName();	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r5 = "historical-record";	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r4 = r5.equals(r4);	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        if (r4 == 0) goto L_0x0072;	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
    L_0x004e:
        r4 = "activity";	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r5 = 0;	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r4 = r1.getAttributeValue(r5, r4);	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r6 = "time";	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r6 = r1.getAttributeValue(r5, r6);	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r6 = java.lang.Long.parseLong(r6);	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r8 = "weight";	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r5 = r1.getAttributeValue(r5, r8);	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r5 = java.lang.Float.parseFloat(r5);	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r8 = new android.support.v7.widget.e$c;	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r8.<init>(r4, r6, r5);	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r2.add(r8);	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        goto L_0x002e;	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
    L_0x0072:
        r1 = new org.xmlpull.v1.XmlPullParserException;	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r2 = "Share records file not well-formed.";	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r1.<init>(r2);	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        throw r1;	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
    L_0x007a:
        r1 = new org.xmlpull.v1.XmlPullParserException;	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r2 = "Share records file does not start with historical-records tag.";	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r1.<init>(r2);	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        throw r1;	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
    L_0x0082:
        r1 = move-exception;
        goto L_0x00be;
    L_0x0084:
        r1 = move-exception;
        r2 = f1383a;	 Catch:{ all -> 0x0082 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0082 }
        r3.<init>();	 Catch:{ all -> 0x0082 }
        r4 = "Error reading historical recrod file: ";	 Catch:{ all -> 0x0082 }
        r3.append(r4);	 Catch:{ all -> 0x0082 }
        r4 = r9.f1387c;	 Catch:{ all -> 0x0082 }
        r3.append(r4);	 Catch:{ all -> 0x0082 }
        r3 = r3.toString();	 Catch:{ all -> 0x0082 }
        android.util.Log.e(r2, r3, r1);	 Catch:{ all -> 0x0082 }
        if (r0 == 0) goto L_0x00bd;	 Catch:{ all -> 0x0082 }
    L_0x009f:
        goto L_0x0036;	 Catch:{ all -> 0x0082 }
    L_0x00a0:
        r1 = move-exception;	 Catch:{ all -> 0x0082 }
        r2 = f1383a;	 Catch:{ all -> 0x0082 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0082 }
        r3.<init>();	 Catch:{ all -> 0x0082 }
        r4 = "Error reading historical recrod file: ";	 Catch:{ all -> 0x0082 }
        r3.append(r4);	 Catch:{ all -> 0x0082 }
        r4 = r9.f1387c;	 Catch:{ all -> 0x0082 }
        r3.append(r4);	 Catch:{ all -> 0x0082 }
        r3 = r3.toString();	 Catch:{ all -> 0x0082 }
        android.util.Log.e(r2, r3, r1);	 Catch:{ all -> 0x0082 }
        if (r0 == 0) goto L_0x00bd;
    L_0x00bb:
        goto L_0x0036;
    L_0x00bd:
        return;
    L_0x00be:
        if (r0 == 0) goto L_0x00c3;
    L_0x00c0:
        r0.close();	 Catch:{ IOException -> 0x00c3 }
    L_0x00c3:
        throw r1;
    L_0x00c4:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.e.i():void");
    }

    /* renamed from: a */
    public int m1529a() {
        int size;
        synchronized (this.f1389g) {
            m1523d();
            size = this.f1390h.size();
        }
        return size;
    }

    /* renamed from: a */
    public int m1530a(ResolveInfo resolveInfo) {
        synchronized (this.f1389g) {
            m1523d();
            List list = this.f1390h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((C0384a) list.get(i)).f1377a == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: a */
    public ResolveInfo m1531a(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.f1389g) {
            m1523d();
            resolveInfo = ((C0384a) this.f1390h.get(i)).f1377a;
        }
        return resolveInfo;
    }

    /* renamed from: b */
    public Intent m1532b(int i) {
        synchronized (this.f1389g) {
            if (this.f1392j == null) {
                return null;
            }
            m1523d();
            C0384a c0384a = (C0384a) this.f1390h.get(i);
            ComponentName componentName = new ComponentName(c0384a.f1377a.activityInfo.packageName, c0384a.f1377a.activityInfo.name);
            Intent intent = new Intent(this.f1392j);
            intent.setComponent(componentName);
            if (this.f1398p != null) {
                if (this.f1398p.m1519a(this, new Intent(intent))) {
                    return null;
                }
            }
            m1521a(new C0386c(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    /* renamed from: b */
    public ResolveInfo m1533b() {
        synchronized (this.f1389g) {
            m1523d();
            if (this.f1390h.isEmpty()) {
                return null;
            }
            ResolveInfo resolveInfo = ((C0384a) this.f1390h.get(0)).f1377a;
            return resolveInfo;
        }
    }

    /* renamed from: c */
    public void m1534c(int i) {
        synchronized (this.f1389g) {
            m1523d();
            C0384a c0384a = (C0384a) this.f1390h.get(i);
            C0384a c0384a2 = (C0384a) this.f1390h.get(0);
            m1521a(new C0386c(new ComponentName(c0384a.f1377a.activityInfo.packageName, c0384a.f1377a.activityInfo.name), System.currentTimeMillis(), c0384a2 != null ? (c0384a2.f1378b - c0384a.f1378b) + 5.0f : 1.0f));
        }
    }
}
