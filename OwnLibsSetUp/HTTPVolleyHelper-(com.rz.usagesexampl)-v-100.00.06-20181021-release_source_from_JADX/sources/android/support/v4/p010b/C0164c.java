package android.support.v4.p010b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.support.v4.p008a.p009a.C0090a.C0522b;
import android.support.v4.p015e.C0176b.C0174b;
import android.support.v4.p016f.C0188g;

/* renamed from: android.support.v4.b.c */
public class C0164c {
    /* renamed from: a */
    private static final C0163a f643a;
    /* renamed from: b */
    private static final C0188g<String, Typeface> f644b = new C0188g(16);

    /* renamed from: android.support.v4.b.c$a */
    interface C0163a {
        /* renamed from: a */
        Typeface mo74a(Context context, Resources resources, int i, String str, int i2);

        /* renamed from: a */
        Typeface mo75a(Context context, CancellationSignal cancellationSignal, C0174b[] c0174bArr, int i);

        /* renamed from: a */
        Typeface mo76a(Context context, C0522b c0522b, Resources resources, int i);
    }

    static {
        C0163a c0779f = VERSION.SDK_INT >= 26 ? new C0779f() : (VERSION.SDK_INT < 24 || !C0739e.m3398a()) ? VERSION.SDK_INT >= 21 ? new C0738d() : new C0544g() : new C0739e();
        f643a = c0779f;
    }

    /* renamed from: a */
    public static Typeface m599a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a = f643a.mo74a(context, resources, i, str, i2);
        if (a != null) {
            f644b.m685a(C0164c.m603b(resources, i, i2), a);
        }
        return a;
    }

    /* renamed from: a */
    public static Typeface m600a(Context context, CancellationSignal cancellationSignal, C0174b[] c0174bArr, int i) {
        return f643a.mo75a(context, cancellationSignal, c0174bArr, i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static android.graphics.Typeface m601a(android.content.Context r7, android.support.v4.p008a.p009a.C0090a.C0088a r8, android.content.res.Resources r9, int r10, int r11, android.support.v4.p008a.p009a.C0094b.C0093a r12, android.os.Handler r13, boolean r14) {
        /*
        r4 = r8 instanceof android.support.v4.p008a.p009a.C0090a.C0523d;
        if (r4 == 0) goto L_0x002d;
    L_0x0004:
        r0 = r8;
        r0 = (android.support.v4.p008a.p009a.C0090a.C0523d) r0;
        r4 = 0;
        r5 = 1;
        if (r14 == 0) goto L_0x0013;
    L_0x000b:
        r6 = r0.m2072b();
        if (r6 != 0) goto L_0x0016;
    L_0x0011:
        r4 = 1;
        goto L_0x0016;
    L_0x0013:
        if (r12 != 0) goto L_0x0016;
    L_0x0015:
        goto L_0x0011;
    L_0x0016:
        if (r14 == 0) goto L_0x001e;
    L_0x0018:
        r1 = r0.m2073c();
        r5 = r1;
        goto L_0x0020;
    L_0x001e:
        r1 = -1;
        r5 = -1;
    L_0x0020:
        r1 = r0.m2071a();
        r0 = r7;
        r2 = r12;
        r3 = r13;
        r6 = r11;
        r0 = android.support.v4.p015e.C0176b.m634a(r0, r1, r2, r3, r4, r5, r6);
        goto L_0x0042;
    L_0x002d:
        r1 = f643a;
        r0 = r8;
        r0 = (android.support.v4.p008a.p009a.C0090a.C0522b) r0;
        r0 = r1.mo76a(r7, r0, r9, r11);
        if (r12 == 0) goto L_0x0042;
    L_0x0038:
        if (r0 == 0) goto L_0x003e;
    L_0x003a:
        r12.m371a(r0, r13);
        goto L_0x0042;
    L_0x003e:
        r1 = -3;
        r12.m369a(r1, r13);
    L_0x0042:
        if (r0 == 0) goto L_0x004d;
    L_0x0044:
        r1 = f644b;
        r2 = android.support.v4.p010b.C0164c.m603b(r9, r10, r11);
        r1.m685a(r2, r0);
    L_0x004d:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.b.c.a(android.content.Context, android.support.v4.a.a.a$a, android.content.res.Resources, int, int, android.support.v4.a.a.b$a, android.os.Handler, boolean):android.graphics.Typeface");
    }

    /* renamed from: a */
    public static Typeface m602a(Resources resources, int i, int i2) {
        return (Typeface) f644b.m684a(C0164c.m603b(resources, i, i2));
    }

    /* renamed from: b */
    private static String m603b(Resources resources, int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(resources.getResourcePackageName(i));
        stringBuilder.append("-");
        stringBuilder.append(i);
        stringBuilder.append("-");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }
}
