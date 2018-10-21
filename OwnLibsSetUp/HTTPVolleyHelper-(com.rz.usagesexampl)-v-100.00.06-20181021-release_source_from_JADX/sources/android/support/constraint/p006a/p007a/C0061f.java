package android.support.constraint.p006a.p007a;

import android.support.constraint.p006a.C0070c;
import android.support.constraint.p006a.C0072e;
import android.support.constraint.p006a.C0077h;
import android.support.constraint.p006a.p007a.C0058e.C0056b;
import android.support.constraint.p006a.p007a.C0058e.C0057c;
import java.util.ArrayList;

/* renamed from: android.support.constraint.a.a.f */
public class C0061f {
    /* renamed from: R */
    public static float f235R = 0.5f;
    /* renamed from: A */
    protected C0058e[] f236A = new C0058e[]{this.f279s, this.f281u, this.f280t, this.f282v, this.f283w, this.f286z};
    /* renamed from: B */
    protected ArrayList<C0058e> f237B = new ArrayList();
    /* renamed from: C */
    protected C0060a[] f238C = new C0060a[]{C0060a.FIXED, C0060a.FIXED};
    /* renamed from: D */
    C0061f f239D = null;
    /* renamed from: E */
    int f240E = 0;
    /* renamed from: F */
    int f241F = 0;
    /* renamed from: G */
    protected float f242G = 0.0f;
    /* renamed from: H */
    protected int f243H = -1;
    /* renamed from: I */
    protected int f244I = 0;
    /* renamed from: J */
    protected int f245J = 0;
    /* renamed from: K */
    int f246K = 0;
    /* renamed from: L */
    int f247L = 0;
    /* renamed from: M */
    protected int f248M = 0;
    /* renamed from: N */
    protected int f249N = 0;
    /* renamed from: O */
    int f250O = 0;
    /* renamed from: P */
    protected int f251P;
    /* renamed from: Q */
    protected int f252Q;
    /* renamed from: S */
    float f253S = f235R;
    /* renamed from: T */
    float f254T = f235R;
    /* renamed from: U */
    boolean f255U;
    /* renamed from: V */
    boolean f256V;
    /* renamed from: W */
    boolean f257W = false;
    /* renamed from: X */
    boolean f258X = false;
    /* renamed from: Y */
    boolean f259Y = false;
    /* renamed from: Z */
    int f260Z = 0;
    /* renamed from: a */
    public int f261a = -1;
    int aa = 0;
    boolean ab;
    boolean ac;
    float[] ad = new float[]{-1.0f, -1.0f};
    protected C0061f[] ae = new C0061f[]{null, null};
    protected C0061f[] af = new C0061f[]{null, null};
    C0061f ag = null;
    C0061f ah = null;
    private int[] ai = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
    private float aj = 0.0f;
    private int ak = 0;
    private int al = 0;
    private int am = 0;
    private int an = 0;
    private int ao;
    private int ap;
    private Object aq;
    private int ar = 0;
    private int as = 0;
    private String at = null;
    private String au = null;
    /* renamed from: b */
    public int f262b = -1;
    /* renamed from: c */
    C0516n f263c;
    /* renamed from: d */
    C0516n f264d;
    /* renamed from: e */
    int f265e = 0;
    /* renamed from: f */
    int f266f = 0;
    /* renamed from: g */
    int[] f267g = new int[2];
    /* renamed from: h */
    int f268h = 0;
    /* renamed from: i */
    int f269i = 0;
    /* renamed from: j */
    float f270j = 1.0f;
    /* renamed from: k */
    int f271k = 0;
    /* renamed from: l */
    int f272l = 0;
    /* renamed from: m */
    float f273m = 1.0f;
    /* renamed from: n */
    boolean f274n;
    /* renamed from: o */
    boolean f275o;
    /* renamed from: p */
    int f276p = -1;
    /* renamed from: q */
    float f277q = 1.0f;
    /* renamed from: r */
    C0062h f278r = null;
    /* renamed from: s */
    C0058e f279s = new C0058e(this, C0057c.LEFT);
    /* renamed from: t */
    C0058e f280t = new C0058e(this, C0057c.TOP);
    /* renamed from: u */
    C0058e f281u = new C0058e(this, C0057c.RIGHT);
    /* renamed from: v */
    C0058e f282v = new C0058e(this, C0057c.BOTTOM);
    /* renamed from: w */
    C0058e f283w = new C0058e(this, C0057c.BASELINE);
    /* renamed from: x */
    C0058e f284x = new C0058e(this, C0057c.CENTER_X);
    /* renamed from: y */
    C0058e f285y = new C0058e(this, C0057c.CENTER_Y);
    /* renamed from: z */
    C0058e f286z = new C0058e(this, C0057c.CENTER);

    /* renamed from: android.support.constraint.a.a.f$a */
    public enum C0060a {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public C0061f() {
        mo13J();
    }

    /* renamed from: J */
    private void mo13J() {
        this.f237B.add(this.f279s);
        this.f237B.add(this.f280t);
        this.f237B.add(this.f281u);
        this.f237B.add(this.f282v);
        this.f237B.add(this.f284x);
        this.f237B.add(this.f285y);
        this.f237B.add(this.f286z);
        this.f237B.add(this.f283w);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m165a(android.support.constraint.p006a.C0072e r31, boolean r32, android.support.constraint.p006a.C0077h r33, android.support.constraint.p006a.C0077h r34, android.support.constraint.p006a.p007a.C0061f.C0060a r35, boolean r36, android.support.constraint.p006a.p007a.C0058e r37, android.support.constraint.p006a.p007a.C0058e r38, int r39, int r40, int r41, int r42, float r43, boolean r44, boolean r45, int r46, int r47, int r48, float r49, boolean r50) {
        /*
        r30 = this;
        r0 = r30;
        r10 = r31;
        r11 = r33;
        r12 = r34;
        r13 = r37;
        r14 = r38;
        r1 = r41;
        r2 = r42;
        r9 = r10.m304a(r13);
        r8 = r10.m304a(r14);
        r6 = r37.m160g();
        r7 = r10.m304a(r6);
        r6 = r38.m160g();
        r6 = r10.m304a(r6);
        r14 = r10.f330c;
        r15 = 1;
        if (r14 == 0) goto L_0x0066;
    L_0x002e:
        r14 = r37.m150a();
        r14 = r14.i;
        r13 = 1;
        if (r14 != r13) goto L_0x0066;
    L_0x0037:
        r14 = r38.m150a();
        r14 = r14.i;
        if (r14 != r13) goto L_0x0066;
    L_0x003f:
        r1 = android.support.constraint.p006a.C0072e.m294a();
        if (r1 == 0) goto L_0x004e;
    L_0x0045:
        r1 = android.support.constraint.p006a.C0072e.m294a();
        r2 = r1.f366s;
        r2 = r2 + r15;
        r1.f366s = r2;
    L_0x004e:
        r1 = r37.m150a();
        r1.m2021a(r10);
        r1 = r38.m150a();
        r1.m2021a(r10);
        if (r45 != 0) goto L_0x0065;
    L_0x005e:
        if (r32 == 0) goto L_0x0065;
    L_0x0060:
        r1 = 0;
        r2 = 6;
        r10.m311a(r12, r8, r1, r2);
    L_0x0065:
        return;
    L_0x0066:
        r13 = android.support.constraint.p006a.C0072e.m294a();
        if (r13 == 0) goto L_0x0075;
    L_0x006c:
        r13 = android.support.constraint.p006a.C0072e.m294a();
        r11 = r13.f345B;
        r11 = r11 + r15;
        r13.f345B = r11;
    L_0x0075:
        r11 = r37.m163j();
        r12 = r38.m163j();
        r13 = r0.f286z;
        r13 = r13.m163j();
        if (r11 == 0) goto L_0x0087;
    L_0x0085:
        r14 = 1;
        goto L_0x0088;
    L_0x0087:
        r14 = 0;
    L_0x0088:
        if (r12 == 0) goto L_0x008c;
    L_0x008a:
        r14 = r14 + 1;
    L_0x008c:
        if (r13 == 0) goto L_0x0090;
    L_0x008e:
        r14 = r14 + 1;
    L_0x0090:
        r21 = r6;
        if (r44 == 0) goto L_0x0096;
    L_0x0094:
        r6 = 3;
        goto L_0x0098;
    L_0x0096:
        r6 = r46;
    L_0x0098:
        r15 = android.support.constraint.p006a.p007a.C0061f.C00591.f229b;
        r16 = r35.ordinal();
        r15 = r15[r16];
        r3 = 4;
        switch(r15) {
            case 1: goto L_0x00a4;
            case 2: goto L_0x00a4;
            case 3: goto L_0x00a4;
            case 4: goto L_0x00a6;
            default: goto L_0x00a4;
        };
    L_0x00a4:
        r15 = 0;
        goto L_0x00aa;
    L_0x00a6:
        if (r6 != r3) goto L_0x00a9;
    L_0x00a8:
        goto L_0x00a4;
    L_0x00a9:
        r15 = 1;
    L_0x00aa:
        r3 = r0.as;
        r22 = r14;
        r14 = 8;
        if (r3 != r14) goto L_0x00b5;
    L_0x00b2:
        r3 = 0;
        r15 = 0;
        goto L_0x00b7;
    L_0x00b5:
        r3 = r40;
    L_0x00b7:
        if (r50 == 0) goto L_0x00d4;
    L_0x00b9:
        if (r11 != 0) goto L_0x00c5;
    L_0x00bb:
        if (r12 != 0) goto L_0x00c5;
    L_0x00bd:
        if (r13 != 0) goto L_0x00c5;
    L_0x00bf:
        r14 = r39;
        r10.m309a(r9, r14);
        goto L_0x00d4;
    L_0x00c5:
        if (r11 == 0) goto L_0x00d4;
    L_0x00c7:
        if (r12 != 0) goto L_0x00d4;
    L_0x00c9:
        r14 = r37.m158e();
        r23 = r13;
        r13 = 6;
        r10.m319c(r9, r7, r14, r13);
        goto L_0x00d7;
    L_0x00d4:
        r23 = r13;
        r13 = 6;
    L_0x00d7:
        if (r15 != 0) goto L_0x0100;
    L_0x00d9:
        if (r36 == 0) goto L_0x00f1;
    L_0x00db:
        r13 = 3;
        r14 = 0;
        r10.m319c(r8, r9, r14, r13);
        if (r1 <= 0) goto L_0x00e7;
    L_0x00e2:
        r13 = 6;
        r10.m311a(r8, r9, r1, r13);
        goto L_0x00e8;
    L_0x00e7:
        r13 = 6;
    L_0x00e8:
        r3 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r2 >= r3) goto L_0x00f4;
    L_0x00ed:
        r10.m316b(r8, r9, r2, r13);
        goto L_0x00f4;
    L_0x00f1:
        r10.m319c(r8, r9, r3, r13);
    L_0x00f4:
        r27 = r47;
        r14 = r48;
        r24 = r7;
    L_0x00fa:
        r2 = r22;
    L_0x00fc:
        r16 = 4;
        goto L_0x01c5;
    L_0x0100:
        r2 = -2;
        r14 = r47;
        if (r14 != r2) goto L_0x0109;
    L_0x0105:
        r14 = r48;
        r13 = r3;
        goto L_0x010c;
    L_0x0109:
        r13 = r14;
        r14 = r48;
    L_0x010c:
        if (r14 != r2) goto L_0x010f;
    L_0x010e:
        r14 = r3;
    L_0x010f:
        if (r13 <= 0) goto L_0x011a;
    L_0x0111:
        r2 = 6;
        r10.m311a(r8, r9, r13, r2);
        r3 = java.lang.Math.max(r3, r13);
        goto L_0x011b;
    L_0x011a:
        r2 = 6;
    L_0x011b:
        if (r14 <= 0) goto L_0x0124;
    L_0x011d:
        r10.m316b(r8, r9, r14, r2);
        r3 = java.lang.Math.min(r3, r14);
    L_0x0124:
        r2 = 1;
        if (r6 != r2) goto L_0x0135;
    L_0x0127:
        if (r32 == 0) goto L_0x012f;
    L_0x0129:
        r2 = 6;
    L_0x012a:
        r10.m319c(r8, r9, r3, r2);
        goto L_0x019b;
    L_0x012f:
        if (r45 == 0) goto L_0x0133;
    L_0x0131:
        r2 = 4;
        goto L_0x012a;
    L_0x0133:
        r2 = 1;
        goto L_0x012a;
    L_0x0135:
        r2 = 2;
        if (r6 != r2) goto L_0x019b;
    L_0x0138:
        r2 = r37.m157d();
        r24 = r7;
        r7 = android.support.constraint.p006a.p007a.C0058e.C0057c.TOP;
        if (r2 == r7) goto L_0x016a;
    L_0x0142:
        r2 = r37.m157d();
        r7 = android.support.constraint.p006a.p007a.C0058e.C0057c.BOTTOM;
        if (r2 != r7) goto L_0x014b;
    L_0x014a:
        goto L_0x016a;
    L_0x014b:
        r2 = r0.f239D;
        r7 = android.support.constraint.p006a.p007a.C0058e.C0057c.LEFT;
        r2 = r2.mo14a(r7);
        r2 = r10.m304a(r2);
        r7 = r0.f239D;
        r25 = r2;
        r2 = android.support.constraint.p006a.p007a.C0058e.C0057c.RIGHT;
        r2 = r7.mo14a(r2);
        r2 = r10.m304a(r2);
        r18 = r2;
        r19 = r25;
        goto L_0x0188;
    L_0x016a:
        r2 = r0.f239D;
        r7 = android.support.constraint.p006a.p007a.C0058e.C0057c.TOP;
        r2 = r2.mo14a(r7);
        r2 = r10.m304a(r2);
        r7 = r0.f239D;
        r26 = r2;
        r2 = android.support.constraint.p006a.p007a.C0058e.C0057c.BOTTOM;
        r2 = r7.mo14a(r2);
        r2 = r10.m304a(r2);
        r18 = r2;
        r19 = r26;
    L_0x0188:
        r15 = r31.m318c();
        r16 = r8;
        r17 = r9;
        r20 = r49;
        r2 = r15.m2047a(r16, r17, r18, r19, r20);
        r10.m306a(r2);
        r15 = 0;
        goto L_0x019d;
    L_0x019b:
        r24 = r7;
    L_0x019d:
        if (r15 == 0) goto L_0x01c1;
    L_0x019f:
        r2 = r22;
        r7 = 2;
        if (r2 == r7) goto L_0x01bd;
    L_0x01a4:
        r16 = 4;
        if (r44 != 0) goto L_0x01ba;
    L_0x01a8:
        r3 = java.lang.Math.max(r13, r3);
        if (r14 <= 0) goto L_0x01b2;
    L_0x01ae:
        r3 = java.lang.Math.min(r14, r3);
    L_0x01b2:
        r27 = r13;
        r13 = 6;
        r10.m319c(r8, r9, r3, r13);
        r15 = 0;
        goto L_0x01c5;
    L_0x01ba:
        r27 = r13;
        goto L_0x01c5;
    L_0x01bd:
        r27 = r13;
        goto L_0x00fc;
    L_0x01c1:
        r27 = r13;
        goto L_0x00fa;
    L_0x01c5:
        if (r50 == 0) goto L_0x0309;
    L_0x01c7:
        if (r45 == 0) goto L_0x01d4;
    L_0x01c9:
        r0 = r8;
        r5 = r9;
        r1 = 0;
        r3 = 6;
        r4 = r34;
        r6 = 2;
        r11 = r33;
        goto L_0x0312;
    L_0x01d4:
        r13 = 5;
        if (r11 != 0) goto L_0x01eb;
    L_0x01d7:
        if (r12 != 0) goto L_0x01eb;
    L_0x01d9:
        if (r23 != 0) goto L_0x01eb;
    L_0x01db:
        if (r32 == 0) goto L_0x01e4;
    L_0x01dd:
        r2 = 0;
        r5 = r34;
    L_0x01e0:
        r10.m311a(r5, r8, r2, r13);
        goto L_0x01e6;
    L_0x01e4:
        r5 = r34;
    L_0x01e6:
        r0 = r8;
    L_0x01e7:
        r1 = 0;
        r3 = 6;
        goto L_0x0301;
    L_0x01eb:
        r2 = 0;
        r5 = r34;
        if (r11 == 0) goto L_0x01f5;
    L_0x01f0:
        if (r12 != 0) goto L_0x01f5;
    L_0x01f2:
        if (r32 == 0) goto L_0x01e6;
    L_0x01f4:
        goto L_0x01e0;
    L_0x01f5:
        if (r11 != 0) goto L_0x020c;
    L_0x01f7:
        if (r12 == 0) goto L_0x020c;
    L_0x01f9:
        r1 = r38.m158e();
        r1 = -r1;
        r4 = r21;
        r3 = 6;
        r10.m319c(r8, r4, r1, r3);
        if (r32 == 0) goto L_0x01e6;
    L_0x0206:
        r3 = r33;
        r10.m311a(r9, r3, r2, r13);
        goto L_0x01e6;
    L_0x020c:
        r4 = r21;
        r3 = r33;
        if (r11 == 0) goto L_0x01e6;
    L_0x0212:
        if (r12 == 0) goto L_0x01e6;
    L_0x0214:
        if (r15 == 0) goto L_0x0275;
    L_0x0216:
        if (r32 == 0) goto L_0x021e;
    L_0x0218:
        if (r1 != 0) goto L_0x021e;
    L_0x021a:
        r1 = 6;
        r10.m311a(r8, r9, r2, r1);
    L_0x021e:
        if (r6 != 0) goto L_0x0248;
    L_0x0220:
        if (r14 > 0) goto L_0x0228;
    L_0x0222:
        if (r27 <= 0) goto L_0x0225;
    L_0x0224:
        goto L_0x0228;
    L_0x0225:
        r1 = 6;
        r2 = 0;
        goto L_0x022a;
    L_0x0228:
        r1 = 4;
        r2 = 1;
    L_0x022a:
        r6 = r37.m158e();
        r11 = r24;
        r10.m319c(r9, r11, r6, r1);
        r6 = r38.m158e();
        r6 = -r6;
        r10.m319c(r8, r4, r6, r1);
        if (r14 > 0) goto L_0x0242;
    L_0x023d:
        if (r27 <= 0) goto L_0x0240;
    L_0x023f:
        goto L_0x0242;
    L_0x0240:
        r1 = 0;
        goto L_0x0243;
    L_0x0242:
        r1 = 1;
    L_0x0243:
        r16 = r2;
        r12 = 1;
        r14 = 5;
        goto L_0x027c;
    L_0x0248:
        r11 = r24;
        r12 = 1;
        if (r6 != r12) goto L_0x0252;
    L_0x024d:
        r1 = 1;
        r14 = 6;
    L_0x024f:
        r16 = 1;
        goto L_0x027c;
    L_0x0252:
        r1 = 3;
        if (r6 != r1) goto L_0x0273;
    L_0x0255:
        if (r44 != 0) goto L_0x0260;
    L_0x0257:
        r1 = r0.f276p;
        r2 = -1;
        if (r1 == r2) goto L_0x0260;
    L_0x025c:
        if (r14 > 0) goto L_0x0260;
    L_0x025e:
        r1 = 6;
        goto L_0x0261;
    L_0x0260:
        r1 = 4;
    L_0x0261:
        r2 = r37.m158e();
        r10.m319c(r9, r11, r2, r1);
        r2 = r38.m158e();
        r2 = -r2;
        r10.m319c(r8, r4, r2, r1);
        r1 = 1;
        r14 = 5;
        goto L_0x024f;
    L_0x0273:
        r1 = 0;
        goto L_0x0279;
    L_0x0275:
        r11 = r24;
        r12 = 1;
        r1 = 1;
    L_0x0279:
        r14 = 5;
        r16 = 0;
    L_0x027c:
        if (r1 == 0) goto L_0x02c5;
    L_0x027e:
        r6 = r37.m158e();
        r17 = r38.m158e();
        r1 = r31;
        r2 = r9;
        r7 = r3;
        r3 = r11;
        r18 = r4;
        r4 = r6;
        r6 = r5;
        r5 = r43;
        r12 = r6;
        r28 = r18;
        r6 = r28;
        r13 = r11;
        r11 = r7;
        r7 = r8;
        r0 = r8;
        r8 = r17;
        r12 = r9;
        r9 = r14;
        r1.m310a(r2, r3, r4, r5, r6, r7, r8, r9);
        r1 = r37;
        r2 = 1;
        r3 = r1.f220c;
        r3 = r3.f218a;
        r3 = r3 instanceof android.support.constraint.p006a.p007a.C0731b;
        r4 = r38;
        r5 = r4.f220c;
        r5 = r5.f218a;
        r5 = r5 instanceof android.support.constraint.p006a.p007a.C0731b;
        if (r3 == 0) goto L_0x02bb;
    L_0x02b4:
        if (r5 != 0) goto L_0x02bb;
    L_0x02b6:
        r2 = r32;
        r3 = 1;
        r5 = 6;
        goto L_0x02d3;
    L_0x02bb:
        if (r3 != 0) goto L_0x02cf;
    L_0x02bd:
        if (r5 == 0) goto L_0x02cf;
    L_0x02bf:
        r3 = r32;
        r5 = 5;
        r29 = 6;
        goto L_0x02d5;
    L_0x02c5:
        r28 = r4;
        r0 = r8;
        r12 = r9;
        r13 = r11;
        r1 = r37;
        r4 = r38;
        r11 = r3;
    L_0x02cf:
        r2 = r32;
        r3 = r2;
        r5 = 5;
    L_0x02d3:
        r29 = 5;
    L_0x02d5:
        if (r16 == 0) goto L_0x02da;
    L_0x02d7:
        r5 = 6;
        r6 = 6;
        goto L_0x02dd;
    L_0x02da:
        r6 = r5;
        r5 = r29;
    L_0x02dd:
        if (r15 != 0) goto L_0x02e1;
    L_0x02df:
        if (r2 != 0) goto L_0x02e3;
    L_0x02e1:
        if (r16 == 0) goto L_0x02ea;
    L_0x02e3:
        r1 = r37.m158e();
        r10.m311a(r12, r13, r1, r5);
    L_0x02ea:
        if (r15 != 0) goto L_0x02ee;
    L_0x02ec:
        if (r3 != 0) goto L_0x02f0;
    L_0x02ee:
        if (r16 == 0) goto L_0x02fa;
    L_0x02f0:
        r1 = r38.m158e();
        r1 = -r1;
        r2 = r28;
        r10.m316b(r0, r2, r1, r6);
    L_0x02fa:
        if (r32 == 0) goto L_0x01e7;
    L_0x02fc:
        r1 = 0;
        r3 = 6;
        r10.m311a(r12, r11, r1, r3);
    L_0x0301:
        if (r32 == 0) goto L_0x0308;
    L_0x0303:
        r4 = r34;
        r10.m311a(r4, r0, r1, r3);
    L_0x0308:
        return;
    L_0x0309:
        r0 = r8;
        r5 = r9;
        r1 = 0;
        r3 = 6;
        r4 = r34;
        r11 = r33;
        r6 = 2;
    L_0x0312:
        if (r2 >= r6) goto L_0x031c;
    L_0x0314:
        if (r32 == 0) goto L_0x031c;
    L_0x0316:
        r10.m311a(r5, r11, r1, r3);
        r10.m311a(r4, r0, r1, r3);
    L_0x031c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.a.a.f.a(android.support.constraint.a.e, boolean, android.support.constraint.a.h, android.support.constraint.a.h, android.support.constraint.a.a.f$a, boolean, android.support.constraint.a.a.e, android.support.constraint.a.a.e, int, int, int, int, float, boolean, boolean, int, int, int, float, boolean):void");
    }

    /* renamed from: a */
    private boolean mo15a(int i) {
        i *= 2;
        if (!(this.f236A[i].f220c == null || this.f236A[i].f220c.f220c == this.f236A[i])) {
            i++;
            if (this.f236A[i].f220c != null && this.f236A[i].f220c.f220c == this.f236A[i]) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: A */
    public int m167A() {
        return this.f250O;
    }

    /* renamed from: B */
    public Object m168B() {
        return this.aq;
    }

    /* renamed from: C */
    public ArrayList<C0058e> mo12C() {
        return this.f237B;
    }

    /* renamed from: D */
    public void mo22D() {
        int i = this.f244I;
        int i2 = this.f245J;
        int i3 = this.f244I + this.f240E;
        int i4 = this.f245J + this.f241F;
        this.ak = i;
        this.al = i2;
        this.am = i3 - i;
        this.an = i4 - i2;
    }

    /* renamed from: E */
    public void m171E() {
        C0061f k = m224k();
        if (k == null || !(k instanceof C0732g) || !((C0732g) m224k()).m3365S()) {
            int size = this.f237B.size();
            for (int i = 0; i < size; i++) {
                ((C0058e) this.f237B.get(i)).m162i();
            }
        }
    }

    /* renamed from: F */
    public C0060a m172F() {
        return this.f238C[0];
    }

    /* renamed from: G */
    public C0060a m173G() {
        return this.f238C[1];
    }

    /* renamed from: H */
    public boolean m174H() {
        return (this.f279s.f220c != null && this.f279s.f220c.f220c == this.f279s) || (this.f281u.f220c != null && this.f281u.f220c.f220c == this.f281u);
    }

    /* renamed from: I */
    public boolean m175I() {
        return (this.f280t.f220c != null && this.f280t.f220c.f220c == this.f280t) || (this.f282v.f220c != null && this.f282v.f220c.f220c == this.f282v);
    }

    /* renamed from: a */
    public C0058e mo14a(C0057c c0057c) {
        switch (c0057c) {
            case LEFT:
                return this.f279s;
            case TOP:
                return this.f280t;
            case RIGHT:
                return this.f281u;
            case BOTTOM:
                return this.f282v;
            case BASELINE:
                return this.f283w;
            case CENTER:
                return this.f286z;
            case CENTER_X:
                return this.f284x;
            case CENTER_Y:
                return this.f285y;
            case NONE:
                return null;
            default:
                throw new AssertionError(c0057c.name());
        }
    }

    /* renamed from: a */
    public void m177a(float f) {
        this.f253S = f;
    }

    /* renamed from: a */
    public void m178a(int i, int i2) {
        this.f244I = i;
        this.f245J = i2;
    }

    /* renamed from: a */
    public void m179a(int i, int i2, int i3) {
        if (i3 == 0) {
            m204c(i, i2);
        } else if (i3 == 1) {
            m209d(i, i2);
        }
        this.f258X = true;
    }

    /* renamed from: a */
    public void m180a(int i, int i2, int i3, float f) {
        this.f265e = i;
        this.f268h = i2;
        this.f269i = i3;
        this.f270j = f;
        if (f < 1.0f && this.f265e == 0) {
            this.f265e = 2;
        }
    }

    /* renamed from: a */
    public void m181a(int i, int i2, int i3, int i4) {
        i3 -= i;
        i4 -= i2;
        this.f244I = i;
        this.f245J = i2;
        if (this.as == 8) {
            this.f240E = 0;
            this.f241F = 0;
            return;
        }
        if (this.f238C[0] == C0060a.FIXED && i3 < this.f240E) {
            i3 = this.f240E;
        }
        if (this.f238C[1] == C0060a.FIXED && i4 < this.f241F) {
            i4 = this.f241F;
        }
        this.f240E = i3;
        this.f241F = i4;
        if (this.f241F < this.f252Q) {
            this.f241F = this.f252Q;
        }
        if (this.f240E < this.f251P) {
            this.f240E = this.f251P;
        }
        this.f258X = true;
    }

    /* renamed from: a */
    public void m182a(C0057c c0057c, C0061f c0061f, C0057c c0057c2, int i, int i2) {
        mo14a(c0057c).m153a(c0061f.mo14a(c0057c2), i, i2, C0056b.STRONG, 0, true);
    }

    /* renamed from: a */
    public void m183a(C0060a c0060a) {
        this.f238C[0] = c0060a;
        if (c0060a == C0060a.WRAP_CONTENT) {
            m223j(this.ao);
        }
    }

    /* renamed from: a */
    public void m184a(C0061f c0061f) {
        this.f239D = c0061f;
    }

    /* renamed from: a */
    public void m185a(C0061f c0061f, float f, int i) {
        m182a(C0057c.CENTER, c0061f, C0057c.CENTER, i, 0);
        this.aj = f;
    }

    /* renamed from: a */
    public void mo23a(C0070c c0070c) {
        this.f279s.m151a(c0070c);
        this.f280t.m151a(c0070c);
        this.f281u.m151a(c0070c);
        this.f282v.m151a(c0070c);
        this.f283w.m151a(c0070c);
        this.f286z.m151a(c0070c);
        this.f284x.m151a(c0070c);
        this.f285y.m151a(c0070c);
    }

    /* renamed from: a */
    public void mo16a(C0072e c0072e) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C0077h c0077h;
        int i;
        int i2;
        int i3;
        int i4;
        Object obj;
        boolean z6;
        boolean z7;
        boolean j;
        boolean z8;
        C0077h c0077h2;
        C0077h c0077h3;
        boolean z9;
        C0077h c0077h4;
        C0072e c0072e2;
        C0077h c0077h5;
        boolean z10;
        boolean z11;
        C0077h c0077h6;
        int i5;
        float f;
        C0061f c0061f;
        C0072e c0072e3;
        C0077h c0077h7;
        C0072e c0072e4 = c0072e;
        C0077h a = c0072e4.m304a(this.f279s);
        C0077h a2 = c0072e4.m304a(this.f281u);
        C0077h a3 = c0072e4.m304a(this.f280t);
        C0077h a4 = c0072e4.m304a(this.f282v);
        C0077h a5 = c0072e4.m304a(this.f283w);
        if (this.f239D != null) {
            boolean z12;
            z = r15.f239D != null && r15.f239D.f238C[0] == C0060a.WRAP_CONTENT;
            boolean z13 = r15.f239D != null && r15.f239D.f238C[1] == C0060a.WRAP_CONTENT;
            if (mo15a(0)) {
                ((C0732g) r15.f239D).m3367a(r15, 0);
                z12 = true;
            } else {
                z12 = m174H();
            }
            if (mo15a(1)) {
                ((C0732g) r15.f239D).m3367a(r15, 1);
                z2 = true;
            } else {
                z2 = m175I();
            }
            if (z && r15.as != 8 && r15.f279s.f220c == null && r15.f281u.f220c == null) {
                c0072e4.m311a(c0072e4.m304a(r15.f239D.f281u), a2, 0, 1);
            }
            if (z13 && r15.as != 8 && r15.f280t.f220c == null && r15.f282v.f220c == null && r15.f283w == null) {
                c0072e4.m311a(c0072e4.m304a(r15.f239D.f282v), a4, 0, 1);
            }
            z3 = z13;
            z4 = z12;
            z5 = z2;
        } else {
            z = false;
            z3 = false;
            z4 = false;
            z5 = false;
        }
        int i6 = r15.f240E;
        if (i6 < r15.f251P) {
            i6 = r15.f251P;
        }
        int i7 = r15.f241F;
        if (i7 < r15.f252Q) {
            i7 = r15.f252Q;
        }
        z2 = r15.f238C[0] != C0060a.MATCH_CONSTRAINT;
        boolean z14 = r15.f238C[1] != C0060a.MATCH_CONSTRAINT;
        r15.f276p = r15.f243H;
        r15.f277q = r15.f242G;
        int i8 = r15.f265e;
        int i9 = r15.f266f;
        if (r15.f242G <= 0.0f || r15.as == 8) {
            c0077h = a5;
            i = i9;
            i2 = i6;
            i3 = i7;
            i4 = i8;
        } else {
            c0077h = a5;
            if (r15.f238C[0] == C0060a.MATCH_CONSTRAINT && i8 == 0) {
                i8 = 3;
            }
            if (r15.f238C[1] == C0060a.MATCH_CONSTRAINT && i9 == 0) {
                i9 = 3;
            }
            if (r15.f238C[0] == C0060a.MATCH_CONSTRAINT && r15.f238C[1] == C0060a.MATCH_CONSTRAINT && i8 == 3 && i9 == 3) {
                m190a(z, z3, z2, z14);
            } else if (r15.f238C[0] == C0060a.MATCH_CONSTRAINT && i8 == 3) {
                r15.f276p = 0;
                r1 = (int) (r15.f277q * ((float) r15.f241F));
                if (r15.f238C[1] != C0060a.MATCH_CONSTRAINT) {
                    i2 = r1;
                    i = i9;
                    i3 = i7;
                    i4 = 4;
                } else {
                    i2 = r1;
                    i = i9;
                    i3 = i7;
                    i4 = i8;
                    obj = 1;
                    r15.f267g[0] = i4;
                    r15.f267g[1] = i;
                    if (obj == null) {
                        if (r15.f276p == 0) {
                            if (r15.f276p == -1) {
                            }
                        }
                        z6 = true;
                        if (r15.f238C[0] != C0060a.WRAP_CONTENT) {
                        }
                        j = r15.f286z.m163j() ^ 1;
                        if (r15.f261a == 2) {
                            if (r15.f239D == null) {
                            }
                            if (r15.f239D == null) {
                            }
                            z8 = z3;
                            c0077h2 = c0077h;
                            c0077h = a4;
                            c0077h3 = a3;
                            z9 = z7;
                            c0077h4 = a2;
                            m165a(c0072e, z, r15.f239D == null ? c0072e4.m304a(r15.f239D.f279s) : null, r15.f239D == null ? c0072e4.m304a(r15.f239D.f281u) : null, r15.f238C[0], z9, r15.f279s, r15.f281u, r15.f244I, i2, r15.f251P, r15.ai[0], r15.f253S, z6, z4, i4, r15.f268h, r15.f269i, r15.f270j, j);
                        } else {
                            c0077h3 = a3;
                            c0077h4 = a2;
                            z8 = z3;
                            c0077h2 = c0077h;
                            c0077h = a4;
                        }
                        if (this.f262b != 2) {
                            if (r15.f238C[1] != C0060a.WRAP_CONTENT) {
                            }
                            if (obj == null) {
                            }
                            if (r15.f250O <= 0) {
                                a4 = c0077h3;
                                c0072e2 = c0072e;
                            } else if (r15.f283w.m150a().i != 1) {
                                c0072e2 = c0072e;
                                r15.f283w.m150a().m2021a(c0072e2);
                                a4 = c0077h3;
                            } else {
                                c0072e2 = c0072e;
                                c0077h5 = c0077h2;
                                a4 = c0077h3;
                                c0072e2.m319c(c0077h5, a4, m167A(), 6);
                                if (r15.f283w.f220c != null) {
                                    c0072e2.m319c(c0077h5, c0072e2.m304a(r15.f283w.f220c), 0, 6);
                                    z10 = false;
                                    if (r15.f239D == null) {
                                    }
                                    if (r15.f239D == null) {
                                    }
                                    z11 = z8;
                                    c0077h6 = a4;
                                    m165a(c0072e, z11, r15.f239D == null ? c0072e2.m304a(r15.f239D.f280t) : null, r15.f239D == null ? c0072e2.m304a(r15.f239D.f282v) : null, r15.f238C[1], z9, r15.f280t, r15.f282v, r15.f245J, i3, r15.f252Q, r15.ai[1], r15.f254T, z4, z5, i, r15.f271k, r15.f272l, r15.f273m, z10);
                                    if (obj == null) {
                                        i5 = 6;
                                        if (this.f276p != 1) {
                                            f = c0061f.f277q;
                                            i5 = 6;
                                            c0072e3 = c0072e;
                                            c0077h7 = c0077h;
                                            c0077h5 = c0077h6;
                                            a5 = c0077h4;
                                            a4 = a;
                                        } else {
                                            f = c0061f.f277q;
                                            c0072e3 = c0072e;
                                            c0077h7 = c0077h4;
                                            c0077h5 = a;
                                            a5 = c0077h;
                                            a4 = c0077h6;
                                        }
                                        c0072e3.m312a(c0077h7, c0077h5, a5, a4, f, i5);
                                    } else {
                                        c0061f = this;
                                    }
                                    if (c0061f.f286z.m163j()) {
                                        c0072e.m305a(c0061f, c0061f.f286z.m160g().m156c(), (float) Math.toRadians((double) (c0061f.aj + 90.0f)), c0061f.f286z.m158e());
                                    }
                                }
                            }
                            z10 = j;
                            if (r15.f239D == null) {
                            }
                            if (r15.f239D == null) {
                            }
                            z11 = z8;
                            c0077h6 = a4;
                            m165a(c0072e, z11, r15.f239D == null ? c0072e2.m304a(r15.f239D.f280t) : null, r15.f239D == null ? c0072e2.m304a(r15.f239D.f282v) : null, r15.f238C[1], z9, r15.f280t, r15.f282v, r15.f245J, i3, r15.f252Q, r15.ai[1], r15.f254T, z4, z5, i, r15.f271k, r15.f272l, r15.f273m, z10);
                            if (obj == null) {
                                c0061f = this;
                            } else {
                                i5 = 6;
                                if (this.f276p != 1) {
                                    f = c0061f.f277q;
                                    c0072e3 = c0072e;
                                    c0077h7 = c0077h4;
                                    c0077h5 = a;
                                    a5 = c0077h;
                                    a4 = c0077h6;
                                } else {
                                    f = c0061f.f277q;
                                    i5 = 6;
                                    c0072e3 = c0072e;
                                    c0077h7 = c0077h;
                                    c0077h5 = c0077h6;
                                    a5 = c0077h4;
                                    a4 = a;
                                }
                                c0072e3.m312a(c0077h7, c0077h5, a5, a4, f, i5);
                            }
                            if (c0061f.f286z.m163j()) {
                                c0072e.m305a(c0061f, c0061f.f286z.m160g().m156c(), (float) Math.toRadians((double) (c0061f.aj + 90.0f)), c0061f.f286z.m158e());
                            }
                        }
                    }
                    z6 = false;
                    if (r15.f238C[0] != C0060a.WRAP_CONTENT) {
                    }
                    j = r15.f286z.m163j() ^ 1;
                    if (r15.f261a == 2) {
                        c0077h3 = a3;
                        c0077h4 = a2;
                        z8 = z3;
                        c0077h2 = c0077h;
                        c0077h = a4;
                    } else {
                        if (r15.f239D == null) {
                        }
                        if (r15.f239D == null) {
                        }
                        z8 = z3;
                        c0077h2 = c0077h;
                        c0077h = a4;
                        c0077h3 = a3;
                        z9 = z7;
                        c0077h4 = a2;
                        m165a(c0072e, z, r15.f239D == null ? c0072e4.m304a(r15.f239D.f279s) : null, r15.f239D == null ? c0072e4.m304a(r15.f239D.f281u) : null, r15.f238C[0], z9, r15.f279s, r15.f281u, r15.f244I, i2, r15.f251P, r15.ai[0], r15.f253S, z6, z4, i4, r15.f268h, r15.f269i, r15.f270j, j);
                    }
                    if (this.f262b != 2) {
                        if (r15.f238C[1] != C0060a.WRAP_CONTENT) {
                        }
                        if (obj == null) {
                        }
                        if (r15.f250O <= 0) {
                            a4 = c0077h3;
                            c0072e2 = c0072e;
                        } else if (r15.f283w.m150a().i != 1) {
                            c0072e2 = c0072e;
                            c0077h5 = c0077h2;
                            a4 = c0077h3;
                            c0072e2.m319c(c0077h5, a4, m167A(), 6);
                            if (r15.f283w.f220c != null) {
                                c0072e2.m319c(c0077h5, c0072e2.m304a(r15.f283w.f220c), 0, 6);
                                z10 = false;
                                if (r15.f239D == null) {
                                }
                                if (r15.f239D == null) {
                                }
                                z11 = z8;
                                c0077h6 = a4;
                                m165a(c0072e, z11, r15.f239D == null ? c0072e2.m304a(r15.f239D.f280t) : null, r15.f239D == null ? c0072e2.m304a(r15.f239D.f282v) : null, r15.f238C[1], z9, r15.f280t, r15.f282v, r15.f245J, i3, r15.f252Q, r15.ai[1], r15.f254T, z4, z5, i, r15.f271k, r15.f272l, r15.f273m, z10);
                                if (obj == null) {
                                    i5 = 6;
                                    if (this.f276p != 1) {
                                        f = c0061f.f277q;
                                        i5 = 6;
                                        c0072e3 = c0072e;
                                        c0077h7 = c0077h;
                                        c0077h5 = c0077h6;
                                        a5 = c0077h4;
                                        a4 = a;
                                    } else {
                                        f = c0061f.f277q;
                                        c0072e3 = c0072e;
                                        c0077h7 = c0077h4;
                                        c0077h5 = a;
                                        a5 = c0077h;
                                        a4 = c0077h6;
                                    }
                                    c0072e3.m312a(c0077h7, c0077h5, a5, a4, f, i5);
                                } else {
                                    c0061f = this;
                                }
                                if (c0061f.f286z.m163j()) {
                                    c0072e.m305a(c0061f, c0061f.f286z.m160g().m156c(), (float) Math.toRadians((double) (c0061f.aj + 90.0f)), c0061f.f286z.m158e());
                                }
                            }
                        } else {
                            c0072e2 = c0072e;
                            r15.f283w.m150a().m2021a(c0072e2);
                            a4 = c0077h3;
                        }
                        z10 = j;
                        if (r15.f239D == null) {
                        }
                        if (r15.f239D == null) {
                        }
                        z11 = z8;
                        c0077h6 = a4;
                        m165a(c0072e, z11, r15.f239D == null ? c0072e2.m304a(r15.f239D.f280t) : null, r15.f239D == null ? c0072e2.m304a(r15.f239D.f282v) : null, r15.f238C[1], z9, r15.f280t, r15.f282v, r15.f245J, i3, r15.f252Q, r15.ai[1], r15.f254T, z4, z5, i, r15.f271k, r15.f272l, r15.f273m, z10);
                        if (obj == null) {
                            c0061f = this;
                        } else {
                            i5 = 6;
                            if (this.f276p != 1) {
                                f = c0061f.f277q;
                                c0072e3 = c0072e;
                                c0077h7 = c0077h4;
                                c0077h5 = a;
                                a5 = c0077h;
                                a4 = c0077h6;
                            } else {
                                f = c0061f.f277q;
                                i5 = 6;
                                c0072e3 = c0072e;
                                c0077h7 = c0077h;
                                c0077h5 = c0077h6;
                                a5 = c0077h4;
                                a4 = a;
                            }
                            c0072e3.m312a(c0077h7, c0077h5, a5, a4, f, i5);
                        }
                        if (c0061f.f286z.m163j()) {
                            c0072e.m305a(c0061f, c0061f.f286z.m160g().m156c(), (float) Math.toRadians((double) (c0061f.aj + 90.0f)), c0061f.f286z.m158e());
                        }
                    }
                }
            } else if (r15.f238C[1] == C0060a.MATCH_CONSTRAINT && i9 == 3) {
                r15.f276p = 1;
                if (r15.f243H == -1) {
                    r15.f277q = 1.0f / r15.f277q;
                }
                r1 = (int) (r15.f277q * ((float) r15.f240E));
                if (r15.f238C[0] != C0060a.MATCH_CONSTRAINT) {
                    i3 = r1;
                    i2 = i6;
                    i4 = i8;
                    i = 4;
                } else {
                    i3 = r1;
                    i = i9;
                    i2 = i6;
                    i4 = i8;
                    obj = 1;
                    r15.f267g[0] = i4;
                    r15.f267g[1] = i;
                    if (obj == null) {
                        if (r15.f276p == 0) {
                            if (r15.f276p == -1) {
                            }
                        }
                        z6 = true;
                        z7 = r15.f238C[0] != C0060a.WRAP_CONTENT && (r15 instanceof C0732g);
                        j = r15.f286z.m163j() ^ 1;
                        if (r15.f261a == 2) {
                            z8 = z3;
                            c0077h2 = c0077h;
                            c0077h = a4;
                            c0077h3 = a3;
                            z9 = z7;
                            c0077h4 = a2;
                            m165a(c0072e, z, r15.f239D == null ? c0072e4.m304a(r15.f239D.f279s) : null, r15.f239D == null ? c0072e4.m304a(r15.f239D.f281u) : null, r15.f238C[0], z9, r15.f279s, r15.f281u, r15.f244I, i2, r15.f251P, r15.ai[0], r15.f253S, z6, z4, i4, r15.f268h, r15.f269i, r15.f270j, j);
                        } else {
                            c0077h3 = a3;
                            c0077h4 = a2;
                            z8 = z3;
                            c0077h2 = c0077h;
                            c0077h = a4;
                        }
                        if (this.f262b != 2) {
                            z9 = r15.f238C[1] != C0060a.WRAP_CONTENT && (r15 instanceof C0732g);
                            z4 = obj == null && (r15.f276p == 1 || r15.f276p == -1);
                            if (r15.f250O <= 0) {
                                a4 = c0077h3;
                                c0072e2 = c0072e;
                            } else if (r15.f283w.m150a().i != 1) {
                                c0072e2 = c0072e;
                                r15.f283w.m150a().m2021a(c0072e2);
                                a4 = c0077h3;
                            } else {
                                c0072e2 = c0072e;
                                c0077h5 = c0077h2;
                                a4 = c0077h3;
                                c0072e2.m319c(c0077h5, a4, m167A(), 6);
                                if (r15.f283w.f220c != null) {
                                    c0072e2.m319c(c0077h5, c0072e2.m304a(r15.f283w.f220c), 0, 6);
                                    z10 = false;
                                    z11 = z8;
                                    c0077h6 = a4;
                                    m165a(c0072e, z11, r15.f239D == null ? c0072e2.m304a(r15.f239D.f280t) : null, r15.f239D == null ? c0072e2.m304a(r15.f239D.f282v) : null, r15.f238C[1], z9, r15.f280t, r15.f282v, r15.f245J, i3, r15.f252Q, r15.ai[1], r15.f254T, z4, z5, i, r15.f271k, r15.f272l, r15.f273m, z10);
                                    if (obj == null) {
                                        i5 = 6;
                                        if (this.f276p != 1) {
                                            f = c0061f.f277q;
                                            i5 = 6;
                                            c0072e3 = c0072e;
                                            c0077h7 = c0077h;
                                            c0077h5 = c0077h6;
                                            a5 = c0077h4;
                                            a4 = a;
                                        } else {
                                            f = c0061f.f277q;
                                            c0072e3 = c0072e;
                                            c0077h7 = c0077h4;
                                            c0077h5 = a;
                                            a5 = c0077h;
                                            a4 = c0077h6;
                                        }
                                        c0072e3.m312a(c0077h7, c0077h5, a5, a4, f, i5);
                                    } else {
                                        c0061f = this;
                                    }
                                    if (c0061f.f286z.m163j()) {
                                        c0072e.m305a(c0061f, c0061f.f286z.m160g().m156c(), (float) Math.toRadians((double) (c0061f.aj + 90.0f)), c0061f.f286z.m158e());
                                    }
                                }
                            }
                            z10 = j;
                            if (r15.f239D == null) {
                            }
                            if (r15.f239D == null) {
                            }
                            z11 = z8;
                            c0077h6 = a4;
                            m165a(c0072e, z11, r15.f239D == null ? c0072e2.m304a(r15.f239D.f280t) : null, r15.f239D == null ? c0072e2.m304a(r15.f239D.f282v) : null, r15.f238C[1], z9, r15.f280t, r15.f282v, r15.f245J, i3, r15.f252Q, r15.ai[1], r15.f254T, z4, z5, i, r15.f271k, r15.f272l, r15.f273m, z10);
                            if (obj == null) {
                                c0061f = this;
                            } else {
                                i5 = 6;
                                if (this.f276p != 1) {
                                    f = c0061f.f277q;
                                    c0072e3 = c0072e;
                                    c0077h7 = c0077h4;
                                    c0077h5 = a;
                                    a5 = c0077h;
                                    a4 = c0077h6;
                                } else {
                                    f = c0061f.f277q;
                                    i5 = 6;
                                    c0072e3 = c0072e;
                                    c0077h7 = c0077h;
                                    c0077h5 = c0077h6;
                                    a5 = c0077h4;
                                    a4 = a;
                                }
                                c0072e3.m312a(c0077h7, c0077h5, a5, a4, f, i5);
                            }
                            if (c0061f.f286z.m163j()) {
                                c0072e.m305a(c0061f, c0061f.f286z.m160g().m156c(), (float) Math.toRadians((double) (c0061f.aj + 90.0f)), c0061f.f286z.m158e());
                            }
                        }
                    }
                    z6 = false;
                    if (r15.f238C[0] != C0060a.WRAP_CONTENT) {
                    }
                    j = r15.f286z.m163j() ^ 1;
                    if (r15.f261a == 2) {
                        c0077h3 = a3;
                        c0077h4 = a2;
                        z8 = z3;
                        c0077h2 = c0077h;
                        c0077h = a4;
                    } else {
                        if (r15.f239D == null) {
                        }
                        if (r15.f239D == null) {
                        }
                        z8 = z3;
                        c0077h2 = c0077h;
                        c0077h = a4;
                        c0077h3 = a3;
                        z9 = z7;
                        c0077h4 = a2;
                        m165a(c0072e, z, r15.f239D == null ? c0072e4.m304a(r15.f239D.f279s) : null, r15.f239D == null ? c0072e4.m304a(r15.f239D.f281u) : null, r15.f238C[0], z9, r15.f279s, r15.f281u, r15.f244I, i2, r15.f251P, r15.ai[0], r15.f253S, z6, z4, i4, r15.f268h, r15.f269i, r15.f270j, j);
                    }
                    if (this.f262b != 2) {
                        if (r15.f238C[1] != C0060a.WRAP_CONTENT) {
                        }
                        if (obj == null) {
                        }
                        if (r15.f250O <= 0) {
                            a4 = c0077h3;
                            c0072e2 = c0072e;
                        } else if (r15.f283w.m150a().i != 1) {
                            c0072e2 = c0072e;
                            c0077h5 = c0077h2;
                            a4 = c0077h3;
                            c0072e2.m319c(c0077h5, a4, m167A(), 6);
                            if (r15.f283w.f220c != null) {
                                c0072e2.m319c(c0077h5, c0072e2.m304a(r15.f283w.f220c), 0, 6);
                                z10 = false;
                                if (r15.f239D == null) {
                                }
                                if (r15.f239D == null) {
                                }
                                z11 = z8;
                                c0077h6 = a4;
                                m165a(c0072e, z11, r15.f239D == null ? c0072e2.m304a(r15.f239D.f280t) : null, r15.f239D == null ? c0072e2.m304a(r15.f239D.f282v) : null, r15.f238C[1], z9, r15.f280t, r15.f282v, r15.f245J, i3, r15.f252Q, r15.ai[1], r15.f254T, z4, z5, i, r15.f271k, r15.f272l, r15.f273m, z10);
                                if (obj == null) {
                                    i5 = 6;
                                    if (this.f276p != 1) {
                                        f = c0061f.f277q;
                                        i5 = 6;
                                        c0072e3 = c0072e;
                                        c0077h7 = c0077h;
                                        c0077h5 = c0077h6;
                                        a5 = c0077h4;
                                        a4 = a;
                                    } else {
                                        f = c0061f.f277q;
                                        c0072e3 = c0072e;
                                        c0077h7 = c0077h4;
                                        c0077h5 = a;
                                        a5 = c0077h;
                                        a4 = c0077h6;
                                    }
                                    c0072e3.m312a(c0077h7, c0077h5, a5, a4, f, i5);
                                } else {
                                    c0061f = this;
                                }
                                if (c0061f.f286z.m163j()) {
                                    c0072e.m305a(c0061f, c0061f.f286z.m160g().m156c(), (float) Math.toRadians((double) (c0061f.aj + 90.0f)), c0061f.f286z.m158e());
                                }
                            }
                        } else {
                            c0072e2 = c0072e;
                            r15.f283w.m150a().m2021a(c0072e2);
                            a4 = c0077h3;
                        }
                        z10 = j;
                        if (r15.f239D == null) {
                        }
                        if (r15.f239D == null) {
                        }
                        z11 = z8;
                        c0077h6 = a4;
                        m165a(c0072e, z11, r15.f239D == null ? c0072e2.m304a(r15.f239D.f280t) : null, r15.f239D == null ? c0072e2.m304a(r15.f239D.f282v) : null, r15.f238C[1], z9, r15.f280t, r15.f282v, r15.f245J, i3, r15.f252Q, r15.ai[1], r15.f254T, z4, z5, i, r15.f271k, r15.f272l, r15.f273m, z10);
                        if (obj == null) {
                            c0061f = this;
                        } else {
                            i5 = 6;
                            if (this.f276p != 1) {
                                f = c0061f.f277q;
                                c0072e3 = c0072e;
                                c0077h7 = c0077h4;
                                c0077h5 = a;
                                a5 = c0077h;
                                a4 = c0077h6;
                            } else {
                                f = c0061f.f277q;
                                i5 = 6;
                                c0072e3 = c0072e;
                                c0077h7 = c0077h;
                                c0077h5 = c0077h6;
                                a5 = c0077h4;
                                a4 = a;
                            }
                            c0072e3.m312a(c0077h7, c0077h5, a5, a4, f, i5);
                        }
                        if (c0061f.f286z.m163j()) {
                            c0072e.m305a(c0061f, c0061f.f286z.m160g().m156c(), (float) Math.toRadians((double) (c0061f.aj + 90.0f)), c0061f.f286z.m158e());
                        }
                    }
                }
            }
            i = i9;
            i2 = i6;
            i3 = i7;
            i4 = i8;
            obj = 1;
            r15.f267g[0] = i4;
            r15.f267g[1] = i;
            if (obj == null) {
                if (r15.f276p == 0) {
                    if (r15.f276p == -1) {
                    }
                }
                z6 = true;
                if (r15.f238C[0] != C0060a.WRAP_CONTENT) {
                }
                j = r15.f286z.m163j() ^ 1;
                if (r15.f261a == 2) {
                    if (r15.f239D == null) {
                    }
                    if (r15.f239D == null) {
                    }
                    z8 = z3;
                    c0077h2 = c0077h;
                    c0077h = a4;
                    c0077h3 = a3;
                    z9 = z7;
                    c0077h4 = a2;
                    m165a(c0072e, z, r15.f239D == null ? c0072e4.m304a(r15.f239D.f279s) : null, r15.f239D == null ? c0072e4.m304a(r15.f239D.f281u) : null, r15.f238C[0], z9, r15.f279s, r15.f281u, r15.f244I, i2, r15.f251P, r15.ai[0], r15.f253S, z6, z4, i4, r15.f268h, r15.f269i, r15.f270j, j);
                } else {
                    c0077h3 = a3;
                    c0077h4 = a2;
                    z8 = z3;
                    c0077h2 = c0077h;
                    c0077h = a4;
                }
                if (this.f262b != 2) {
                    if (r15.f238C[1] != C0060a.WRAP_CONTENT) {
                    }
                    if (obj == null) {
                    }
                    if (r15.f250O <= 0) {
                        a4 = c0077h3;
                        c0072e2 = c0072e;
                    } else if (r15.f283w.m150a().i != 1) {
                        c0072e2 = c0072e;
                        r15.f283w.m150a().m2021a(c0072e2);
                        a4 = c0077h3;
                    } else {
                        c0072e2 = c0072e;
                        c0077h5 = c0077h2;
                        a4 = c0077h3;
                        c0072e2.m319c(c0077h5, a4, m167A(), 6);
                        if (r15.f283w.f220c != null) {
                            c0072e2.m319c(c0077h5, c0072e2.m304a(r15.f283w.f220c), 0, 6);
                            z10 = false;
                            if (r15.f239D == null) {
                            }
                            if (r15.f239D == null) {
                            }
                            z11 = z8;
                            c0077h6 = a4;
                            m165a(c0072e, z11, r15.f239D == null ? c0072e2.m304a(r15.f239D.f280t) : null, r15.f239D == null ? c0072e2.m304a(r15.f239D.f282v) : null, r15.f238C[1], z9, r15.f280t, r15.f282v, r15.f245J, i3, r15.f252Q, r15.ai[1], r15.f254T, z4, z5, i, r15.f271k, r15.f272l, r15.f273m, z10);
                            if (obj == null) {
                                i5 = 6;
                                if (this.f276p != 1) {
                                    f = c0061f.f277q;
                                    i5 = 6;
                                    c0072e3 = c0072e;
                                    c0077h7 = c0077h;
                                    c0077h5 = c0077h6;
                                    a5 = c0077h4;
                                    a4 = a;
                                } else {
                                    f = c0061f.f277q;
                                    c0072e3 = c0072e;
                                    c0077h7 = c0077h4;
                                    c0077h5 = a;
                                    a5 = c0077h;
                                    a4 = c0077h6;
                                }
                                c0072e3.m312a(c0077h7, c0077h5, a5, a4, f, i5);
                            } else {
                                c0061f = this;
                            }
                            if (c0061f.f286z.m163j()) {
                                c0072e.m305a(c0061f, c0061f.f286z.m160g().m156c(), (float) Math.toRadians((double) (c0061f.aj + 90.0f)), c0061f.f286z.m158e());
                            }
                        }
                    }
                    z10 = j;
                    if (r15.f239D == null) {
                    }
                    if (r15.f239D == null) {
                    }
                    z11 = z8;
                    c0077h6 = a4;
                    m165a(c0072e, z11, r15.f239D == null ? c0072e2.m304a(r15.f239D.f280t) : null, r15.f239D == null ? c0072e2.m304a(r15.f239D.f282v) : null, r15.f238C[1], z9, r15.f280t, r15.f282v, r15.f245J, i3, r15.f252Q, r15.ai[1], r15.f254T, z4, z5, i, r15.f271k, r15.f272l, r15.f273m, z10);
                    if (obj == null) {
                        c0061f = this;
                    } else {
                        i5 = 6;
                        if (this.f276p != 1) {
                            f = c0061f.f277q;
                            c0072e3 = c0072e;
                            c0077h7 = c0077h4;
                            c0077h5 = a;
                            a5 = c0077h;
                            a4 = c0077h6;
                        } else {
                            f = c0061f.f277q;
                            i5 = 6;
                            c0072e3 = c0072e;
                            c0077h7 = c0077h;
                            c0077h5 = c0077h6;
                            a5 = c0077h4;
                            a4 = a;
                        }
                        c0072e3.m312a(c0077h7, c0077h5, a5, a4, f, i5);
                    }
                    if (c0061f.f286z.m163j()) {
                        c0072e.m305a(c0061f, c0061f.f286z.m160g().m156c(), (float) Math.toRadians((double) (c0061f.aj + 90.0f)), c0061f.f286z.m158e());
                    }
                }
            }
            z6 = false;
            if (r15.f238C[0] != C0060a.WRAP_CONTENT) {
            }
            j = r15.f286z.m163j() ^ 1;
            if (r15.f261a == 2) {
                c0077h3 = a3;
                c0077h4 = a2;
                z8 = z3;
                c0077h2 = c0077h;
                c0077h = a4;
            } else {
                if (r15.f239D == null) {
                }
                if (r15.f239D == null) {
                }
                z8 = z3;
                c0077h2 = c0077h;
                c0077h = a4;
                c0077h3 = a3;
                z9 = z7;
                c0077h4 = a2;
                m165a(c0072e, z, r15.f239D == null ? c0072e4.m304a(r15.f239D.f279s) : null, r15.f239D == null ? c0072e4.m304a(r15.f239D.f281u) : null, r15.f238C[0], z9, r15.f279s, r15.f281u, r15.f244I, i2, r15.f251P, r15.ai[0], r15.f253S, z6, z4, i4, r15.f268h, r15.f269i, r15.f270j, j);
            }
            if (this.f262b != 2) {
                if (r15.f238C[1] != C0060a.WRAP_CONTENT) {
                }
                if (obj == null) {
                }
                if (r15.f250O <= 0) {
                    a4 = c0077h3;
                    c0072e2 = c0072e;
                } else if (r15.f283w.m150a().i != 1) {
                    c0072e2 = c0072e;
                    c0077h5 = c0077h2;
                    a4 = c0077h3;
                    c0072e2.m319c(c0077h5, a4, m167A(), 6);
                    if (r15.f283w.f220c != null) {
                        c0072e2.m319c(c0077h5, c0072e2.m304a(r15.f283w.f220c), 0, 6);
                        z10 = false;
                        if (r15.f239D == null) {
                        }
                        if (r15.f239D == null) {
                        }
                        z11 = z8;
                        c0077h6 = a4;
                        m165a(c0072e, z11, r15.f239D == null ? c0072e2.m304a(r15.f239D.f280t) : null, r15.f239D == null ? c0072e2.m304a(r15.f239D.f282v) : null, r15.f238C[1], z9, r15.f280t, r15.f282v, r15.f245J, i3, r15.f252Q, r15.ai[1], r15.f254T, z4, z5, i, r15.f271k, r15.f272l, r15.f273m, z10);
                        if (obj == null) {
                            i5 = 6;
                            if (this.f276p != 1) {
                                f = c0061f.f277q;
                                i5 = 6;
                                c0072e3 = c0072e;
                                c0077h7 = c0077h;
                                c0077h5 = c0077h6;
                                a5 = c0077h4;
                                a4 = a;
                            } else {
                                f = c0061f.f277q;
                                c0072e3 = c0072e;
                                c0077h7 = c0077h4;
                                c0077h5 = a;
                                a5 = c0077h;
                                a4 = c0077h6;
                            }
                            c0072e3.m312a(c0077h7, c0077h5, a5, a4, f, i5);
                        } else {
                            c0061f = this;
                        }
                        if (c0061f.f286z.m163j()) {
                            c0072e.m305a(c0061f, c0061f.f286z.m160g().m156c(), (float) Math.toRadians((double) (c0061f.aj + 90.0f)), c0061f.f286z.m158e());
                        }
                    }
                } else {
                    c0072e2 = c0072e;
                    r15.f283w.m150a().m2021a(c0072e2);
                    a4 = c0077h3;
                }
                z10 = j;
                if (r15.f239D == null) {
                }
                if (r15.f239D == null) {
                }
                z11 = z8;
                c0077h6 = a4;
                m165a(c0072e, z11, r15.f239D == null ? c0072e2.m304a(r15.f239D.f280t) : null, r15.f239D == null ? c0072e2.m304a(r15.f239D.f282v) : null, r15.f238C[1], z9, r15.f280t, r15.f282v, r15.f245J, i3, r15.f252Q, r15.ai[1], r15.f254T, z4, z5, i, r15.f271k, r15.f272l, r15.f273m, z10);
                if (obj == null) {
                    c0061f = this;
                } else {
                    i5 = 6;
                    if (this.f276p != 1) {
                        f = c0061f.f277q;
                        c0072e3 = c0072e;
                        c0077h7 = c0077h4;
                        c0077h5 = a;
                        a5 = c0077h;
                        a4 = c0077h6;
                    } else {
                        f = c0061f.f277q;
                        i5 = 6;
                        c0072e3 = c0072e;
                        c0077h7 = c0077h;
                        c0077h5 = c0077h6;
                        a5 = c0077h4;
                        a4 = a;
                    }
                    c0072e3.m312a(c0077h7, c0077h5, a5, a4, f, i5);
                }
                if (c0061f.f286z.m163j()) {
                    c0072e.m305a(c0061f, c0061f.f286z.m160g().m156c(), (float) Math.toRadians((double) (c0061f.aj + 90.0f)), c0061f.f286z.m158e());
                }
            }
        }
        obj = null;
        r15.f267g[0] = i4;
        r15.f267g[1] = i;
        if (obj == null) {
            if (r15.f276p == 0) {
                if (r15.f276p == -1) {
                }
            }
            z6 = true;
            if (r15.f238C[0] != C0060a.WRAP_CONTENT) {
            }
            j = r15.f286z.m163j() ^ 1;
            if (r15.f261a == 2) {
                if (r15.f239D == null) {
                }
                if (r15.f239D == null) {
                }
                z8 = z3;
                c0077h2 = c0077h;
                c0077h = a4;
                c0077h3 = a3;
                z9 = z7;
                c0077h4 = a2;
                m165a(c0072e, z, r15.f239D == null ? c0072e4.m304a(r15.f239D.f279s) : null, r15.f239D == null ? c0072e4.m304a(r15.f239D.f281u) : null, r15.f238C[0], z9, r15.f279s, r15.f281u, r15.f244I, i2, r15.f251P, r15.ai[0], r15.f253S, z6, z4, i4, r15.f268h, r15.f269i, r15.f270j, j);
            } else {
                c0077h3 = a3;
                c0077h4 = a2;
                z8 = z3;
                c0077h2 = c0077h;
                c0077h = a4;
            }
            if (this.f262b != 2) {
                if (r15.f238C[1] != C0060a.WRAP_CONTENT) {
                }
                if (obj == null) {
                }
                if (r15.f250O <= 0) {
                    a4 = c0077h3;
                    c0072e2 = c0072e;
                } else if (r15.f283w.m150a().i != 1) {
                    c0072e2 = c0072e;
                    r15.f283w.m150a().m2021a(c0072e2);
                    a4 = c0077h3;
                } else {
                    c0072e2 = c0072e;
                    c0077h5 = c0077h2;
                    a4 = c0077h3;
                    c0072e2.m319c(c0077h5, a4, m167A(), 6);
                    if (r15.f283w.f220c != null) {
                        c0072e2.m319c(c0077h5, c0072e2.m304a(r15.f283w.f220c), 0, 6);
                        z10 = false;
                        if (r15.f239D == null) {
                        }
                        if (r15.f239D == null) {
                        }
                        z11 = z8;
                        c0077h6 = a4;
                        m165a(c0072e, z11, r15.f239D == null ? c0072e2.m304a(r15.f239D.f280t) : null, r15.f239D == null ? c0072e2.m304a(r15.f239D.f282v) : null, r15.f238C[1], z9, r15.f280t, r15.f282v, r15.f245J, i3, r15.f252Q, r15.ai[1], r15.f254T, z4, z5, i, r15.f271k, r15.f272l, r15.f273m, z10);
                        if (obj == null) {
                            i5 = 6;
                            if (this.f276p != 1) {
                                f = c0061f.f277q;
                                i5 = 6;
                                c0072e3 = c0072e;
                                c0077h7 = c0077h;
                                c0077h5 = c0077h6;
                                a5 = c0077h4;
                                a4 = a;
                            } else {
                                f = c0061f.f277q;
                                c0072e3 = c0072e;
                                c0077h7 = c0077h4;
                                c0077h5 = a;
                                a5 = c0077h;
                                a4 = c0077h6;
                            }
                            c0072e3.m312a(c0077h7, c0077h5, a5, a4, f, i5);
                        } else {
                            c0061f = this;
                        }
                        if (c0061f.f286z.m163j()) {
                            c0072e.m305a(c0061f, c0061f.f286z.m160g().m156c(), (float) Math.toRadians((double) (c0061f.aj + 90.0f)), c0061f.f286z.m158e());
                        }
                    }
                }
                z10 = j;
                if (r15.f239D == null) {
                }
                if (r15.f239D == null) {
                }
                z11 = z8;
                c0077h6 = a4;
                m165a(c0072e, z11, r15.f239D == null ? c0072e2.m304a(r15.f239D.f280t) : null, r15.f239D == null ? c0072e2.m304a(r15.f239D.f282v) : null, r15.f238C[1], z9, r15.f280t, r15.f282v, r15.f245J, i3, r15.f252Q, r15.ai[1], r15.f254T, z4, z5, i, r15.f271k, r15.f272l, r15.f273m, z10);
                if (obj == null) {
                    c0061f = this;
                } else {
                    i5 = 6;
                    if (this.f276p != 1) {
                        f = c0061f.f277q;
                        c0072e3 = c0072e;
                        c0077h7 = c0077h4;
                        c0077h5 = a;
                        a5 = c0077h;
                        a4 = c0077h6;
                    } else {
                        f = c0061f.f277q;
                        i5 = 6;
                        c0072e3 = c0072e;
                        c0077h7 = c0077h;
                        c0077h5 = c0077h6;
                        a5 = c0077h4;
                        a4 = a;
                    }
                    c0072e3.m312a(c0077h7, c0077h5, a5, a4, f, i5);
                }
                if (c0061f.f286z.m163j()) {
                    c0072e.m305a(c0061f, c0061f.f286z.m160g().m156c(), (float) Math.toRadians((double) (c0061f.aj + 90.0f)), c0061f.f286z.m158e());
                }
            }
        }
        z6 = false;
        if (r15.f238C[0] != C0060a.WRAP_CONTENT) {
        }
        j = r15.f286z.m163j() ^ 1;
        if (r15.f261a == 2) {
            c0077h3 = a3;
            c0077h4 = a2;
            z8 = z3;
            c0077h2 = c0077h;
            c0077h = a4;
        } else {
            if (r15.f239D == null) {
            }
            if (r15.f239D == null) {
            }
            z8 = z3;
            c0077h2 = c0077h;
            c0077h = a4;
            c0077h3 = a3;
            z9 = z7;
            c0077h4 = a2;
            m165a(c0072e, z, r15.f239D == null ? c0072e4.m304a(r15.f239D.f279s) : null, r15.f239D == null ? c0072e4.m304a(r15.f239D.f281u) : null, r15.f238C[0], z9, r15.f279s, r15.f281u, r15.f244I, i2, r15.f251P, r15.ai[0], r15.f253S, z6, z4, i4, r15.f268h, r15.f269i, r15.f270j, j);
        }
        if (this.f262b != 2) {
            if (r15.f238C[1] != C0060a.WRAP_CONTENT) {
            }
            if (obj == null) {
            }
            if (r15.f250O <= 0) {
                a4 = c0077h3;
                c0072e2 = c0072e;
            } else if (r15.f283w.m150a().i != 1) {
                c0072e2 = c0072e;
                c0077h5 = c0077h2;
                a4 = c0077h3;
                c0072e2.m319c(c0077h5, a4, m167A(), 6);
                if (r15.f283w.f220c != null) {
                    c0072e2.m319c(c0077h5, c0072e2.m304a(r15.f283w.f220c), 0, 6);
                    z10 = false;
                    if (r15.f239D == null) {
                    }
                    if (r15.f239D == null) {
                    }
                    z11 = z8;
                    c0077h6 = a4;
                    m165a(c0072e, z11, r15.f239D == null ? c0072e2.m304a(r15.f239D.f280t) : null, r15.f239D == null ? c0072e2.m304a(r15.f239D.f282v) : null, r15.f238C[1], z9, r15.f280t, r15.f282v, r15.f245J, i3, r15.f252Q, r15.ai[1], r15.f254T, z4, z5, i, r15.f271k, r15.f272l, r15.f273m, z10);
                    if (obj == null) {
                        i5 = 6;
                        if (this.f276p != 1) {
                            f = c0061f.f277q;
                            i5 = 6;
                            c0072e3 = c0072e;
                            c0077h7 = c0077h;
                            c0077h5 = c0077h6;
                            a5 = c0077h4;
                            a4 = a;
                        } else {
                            f = c0061f.f277q;
                            c0072e3 = c0072e;
                            c0077h7 = c0077h4;
                            c0077h5 = a;
                            a5 = c0077h;
                            a4 = c0077h6;
                        }
                        c0072e3.m312a(c0077h7, c0077h5, a5, a4, f, i5);
                    } else {
                        c0061f = this;
                    }
                    if (c0061f.f286z.m163j()) {
                        c0072e.m305a(c0061f, c0061f.f286z.m160g().m156c(), (float) Math.toRadians((double) (c0061f.aj + 90.0f)), c0061f.f286z.m158e());
                    }
                }
            } else {
                c0072e2 = c0072e;
                r15.f283w.m150a().m2021a(c0072e2);
                a4 = c0077h3;
            }
            z10 = j;
            if (r15.f239D == null) {
            }
            if (r15.f239D == null) {
            }
            z11 = z8;
            c0077h6 = a4;
            m165a(c0072e, z11, r15.f239D == null ? c0072e2.m304a(r15.f239D.f280t) : null, r15.f239D == null ? c0072e2.m304a(r15.f239D.f282v) : null, r15.f238C[1], z9, r15.f280t, r15.f282v, r15.f245J, i3, r15.f252Q, r15.ai[1], r15.f254T, z4, z5, i, r15.f271k, r15.f272l, r15.f273m, z10);
            if (obj == null) {
                c0061f = this;
            } else {
                i5 = 6;
                if (this.f276p != 1) {
                    f = c0061f.f277q;
                    c0072e3 = c0072e;
                    c0077h7 = c0077h4;
                    c0077h5 = a;
                    a5 = c0077h;
                    a4 = c0077h6;
                } else {
                    f = c0061f.f277q;
                    i5 = 6;
                    c0072e3 = c0072e;
                    c0077h7 = c0077h;
                    c0077h5 = c0077h6;
                    a5 = c0077h4;
                    a4 = a;
                }
                c0072e3.m312a(c0077h7, c0077h5, a5, a4, f, i5);
            }
            if (c0061f.f286z.m163j()) {
                c0072e.m305a(c0061f, c0061f.f286z.m160g().m156c(), (float) Math.toRadians((double) (c0061f.aj + 90.0f)), c0061f.f286z.m158e());
            }
        }
    }

    /* renamed from: a */
    public void m188a(Object obj) {
        this.aq = obj;
    }

    /* renamed from: a */
    public void m189a(String str) {
        this.at = str;
    }

    /* renamed from: a */
    public void m190a(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.f276p == -1) {
            if (z3 && !z4) {
                this.f276p = 0;
            } else if (!z3 && z4) {
                this.f276p = 1;
                if (this.f243H == -1) {
                    this.f277q = 1.0f / this.f277q;
                }
            }
        }
        if (this.f276p == 0 && (!this.f280t.m163j() || !this.f282v.m163j())) {
            this.f276p = 1;
        } else if (this.f276p == 1 && !(this.f279s.m163j() && this.f281u.m163j())) {
            this.f276p = 0;
        }
        if (this.f276p == -1 && !(this.f280t.m163j() && this.f282v.m163j() && this.f279s.m163j() && this.f281u.m163j())) {
            if (this.f280t.m163j() && this.f282v.m163j()) {
                this.f276p = 0;
            } else if (this.f279s.m163j() && this.f281u.m163j()) {
                this.f277q = 1.0f / this.f277q;
                this.f276p = 1;
            }
        }
        if (this.f276p == -1) {
            if (z && !z2) {
                this.f276p = 0;
            } else if (!z && z2) {
                this.f277q = 1.0f / this.f277q;
                this.f276p = 1;
            }
        }
        if (this.f276p == -1) {
            if (this.f268h > 0 && this.f271k == 0) {
                this.f276p = 0;
            } else if (this.f268h == 0 && this.f271k > 0) {
                this.f277q = 1.0f / this.f277q;
                this.f276p = 1;
            }
        }
        if (this.f276p == -1 && z && z2) {
            this.f277q = 1.0f / this.f277q;
            this.f276p = 1;
        }
    }

    /* renamed from: a */
    public boolean mo17a() {
        return this.as != 8;
    }

    /* renamed from: b */
    public void mo442b() {
        for (int i = 0; i < 6; i++) {
            this.f236A[i].m150a().mo21b();
        }
    }

    /* renamed from: b */
    public void m193b(float f) {
        this.f254T = f;
    }

    /* renamed from: b */
    public void mo18b(int i) {
        C0064k.m257a(i, this);
    }

    /* renamed from: b */
    public void mo24b(int i, int i2) {
        this.f248M = i;
        this.f249N = i2;
    }

    /* renamed from: b */
    public void m196b(int i, int i2, int i3, float f) {
        this.f266f = i;
        this.f271k = i2;
        this.f272l = i3;
        this.f273m = f;
        if (f < 1.0f && this.f266f == 0) {
            this.f266f = 2;
        }
    }

    /* renamed from: b */
    public void m197b(C0060a c0060a) {
        this.f238C[1] = c0060a;
        if (c0060a == C0060a.WRAP_CONTENT) {
            m225k(this.ap);
        }
    }

    /* renamed from: b */
    public void m198b(C0072e c0072e) {
        c0072e.m304a(this.f279s);
        c0072e.m304a(this.f280t);
        c0072e.m304a(this.f281u);
        c0072e.m304a(this.f282v);
        if (this.f250O > 0) {
            c0072e.m304a(this.f283w);
        }
    }

    /* renamed from: b */
    public void m199b(java.lang.String r9) {
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
        r8 = this;
        r0 = 0;
        if (r9 == 0) goto L_0x008e;
    L_0x0003:
        r1 = r9.length();
        if (r1 != 0) goto L_0x000b;
    L_0x0009:
        goto L_0x008e;
    L_0x000b:
        r1 = -1;
        r2 = r9.length();
        r3 = 44;
        r3 = r9.indexOf(r3);
        r4 = 0;
        r5 = 1;
        if (r3 <= 0) goto L_0x0037;
    L_0x001a:
        r6 = r2 + -1;
        if (r3 >= r6) goto L_0x0037;
    L_0x001e:
        r6 = r9.substring(r4, r3);
        r7 = "W";
        r7 = r6.equalsIgnoreCase(r7);
        if (r7 == 0) goto L_0x002c;
    L_0x002a:
        r1 = 0;
        goto L_0x0035;
    L_0x002c:
        r4 = "H";
        r4 = r6.equalsIgnoreCase(r4);
        if (r4 == 0) goto L_0x0035;
    L_0x0034:
        r1 = 1;
    L_0x0035:
        r4 = r3 + 1;
    L_0x0037:
        r3 = 58;
        r3 = r9.indexOf(r3);
        if (r3 < 0) goto L_0x0075;
    L_0x003f:
        r2 = r2 - r5;
        if (r3 >= r2) goto L_0x0075;
    L_0x0042:
        r2 = r9.substring(r4, r3);
        r3 = r3 + r5;
        r9 = r9.substring(r3);
        r3 = r2.length();
        if (r3 <= 0) goto L_0x0084;
    L_0x0051:
        r3 = r9.length();
        if (r3 <= 0) goto L_0x0084;
    L_0x0057:
        r2 = java.lang.Float.parseFloat(r2);	 Catch:{ NumberFormatException -> 0x0084 }
        r9 = java.lang.Float.parseFloat(r9);	 Catch:{ NumberFormatException -> 0x0084 }
        r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));	 Catch:{ NumberFormatException -> 0x0084 }
        if (r3 <= 0) goto L_0x0084;	 Catch:{ NumberFormatException -> 0x0084 }
    L_0x0063:
        r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));	 Catch:{ NumberFormatException -> 0x0084 }
        if (r3 <= 0) goto L_0x0084;	 Catch:{ NumberFormatException -> 0x0084 }
    L_0x0067:
        if (r1 != r5) goto L_0x006f;	 Catch:{ NumberFormatException -> 0x0084 }
    L_0x0069:
        r9 = r9 / r2;	 Catch:{ NumberFormatException -> 0x0084 }
        r9 = java.lang.Math.abs(r9);	 Catch:{ NumberFormatException -> 0x0084 }
        goto L_0x0085;	 Catch:{ NumberFormatException -> 0x0084 }
    L_0x006f:
        r2 = r2 / r9;	 Catch:{ NumberFormatException -> 0x0084 }
        r9 = java.lang.Math.abs(r2);	 Catch:{ NumberFormatException -> 0x0084 }
        goto L_0x0085;
    L_0x0075:
        r9 = r9.substring(r4);
        r2 = r9.length();
        if (r2 <= 0) goto L_0x0084;
    L_0x007f:
        r9 = java.lang.Float.parseFloat(r9);	 Catch:{ NumberFormatException -> 0x0084 }
        goto L_0x0085;
    L_0x0084:
        r9 = 0;
    L_0x0085:
        r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x008d;
    L_0x0089:
        r8.f242G = r9;
        r8.f243H = r1;
    L_0x008d:
        return;
    L_0x008e:
        r8.f242G = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.a.a.f.b(java.lang.String):void");
    }

    /* renamed from: b */
    public void m200b(boolean z) {
        this.f274n = z;
    }

    /* renamed from: c */
    public void mo443c() {
    }

    /* renamed from: c */
    public void m202c(float f) {
        this.ad[0] = f;
    }

    /* renamed from: c */
    public void m203c(int i) {
        this.ai[0] = i;
    }

    /* renamed from: c */
    public void m204c(int i, int i2) {
        this.f244I = i;
        this.f240E = i2 - i;
        if (this.f240E < this.f251P) {
            this.f240E = this.f251P;
        }
    }

    /* renamed from: c */
    public void mo19c(C0072e c0072e) {
        int b = c0072e.m314b(this.f279s);
        int b2 = c0072e.m314b(this.f280t);
        int b3 = c0072e.m314b(this.f281u);
        int b4 = c0072e.m314b(this.f282v);
        int i = b4 - b2;
        if (b3 - b < 0 || i < 0 || b == Integer.MIN_VALUE || b == Integer.MAX_VALUE || b2 == Integer.MIN_VALUE || b2 == Integer.MAX_VALUE || b3 == Integer.MIN_VALUE || b3 == Integer.MAX_VALUE || b4 == Integer.MIN_VALUE || b4 == Integer.MAX_VALUE) {
            b4 = 0;
            b = 0;
            b2 = 0;
            b3 = 0;
        }
        m181a(b, b2, b3, b4);
    }

    /* renamed from: c */
    public void m206c(boolean z) {
        this.f275o = z;
    }

    /* renamed from: d */
    public void m207d(float f) {
        this.ad[1] = f;
    }

    /* renamed from: d */
    public void m208d(int i) {
        this.ai[1] = i;
    }

    /* renamed from: d */
    public void m209d(int i, int i2) {
        this.f245J = i;
        this.f241F = i2 - i;
        if (this.f241F < this.f252Q) {
            this.f241F = this.f252Q;
        }
    }

    /* renamed from: d */
    public boolean m210d() {
        return this.f265e == 0 && this.f242G == 0.0f && this.f268h == 0 && this.f269i == 0 && this.f238C[0] == C0060a.MATCH_CONSTRAINT;
    }

    /* renamed from: e */
    public void m211e(int i) {
        this.as = i;
    }

    /* renamed from: e */
    void m212e(int i, int i2) {
        if (i2 == 0) {
            this.f246K = i;
        } else if (i2 == 1) {
            this.f247L = i;
        }
    }

    /* renamed from: e */
    public boolean m213e() {
        return this.f266f == 0 && this.f242G == 0.0f && this.f271k == 0 && this.f272l == 0 && this.f238C[1] == C0060a.MATCH_CONSTRAINT;
    }

    /* renamed from: f */
    public int m214f(int i) {
        return i == 0 ? m234p() : i == 1 ? m238r() : 0;
    }

    /* renamed from: f */
    public void mo25f() {
        this.f279s.m162i();
        this.f280t.m162i();
        this.f281u.m162i();
        this.f282v.m162i();
        this.f283w.m162i();
        this.f284x.m162i();
        this.f285y.m162i();
        this.f286z.m162i();
        this.f239D = null;
        this.aj = 0.0f;
        this.f240E = 0;
        this.f241F = 0;
        this.f242G = 0.0f;
        this.f243H = -1;
        this.f244I = 0;
        this.f245J = 0;
        this.ak = 0;
        this.al = 0;
        this.am = 0;
        this.an = 0;
        this.f248M = 0;
        this.f249N = 0;
        this.f250O = 0;
        this.f251P = 0;
        this.f252Q = 0;
        this.ao = 0;
        this.ap = 0;
        this.f253S = f235R;
        this.f254T = f235R;
        this.f238C[0] = C0060a.FIXED;
        this.f238C[1] = C0060a.FIXED;
        this.aq = null;
        this.ar = 0;
        this.as = 0;
        this.au = null;
        this.f255U = false;
        this.f256V = false;
        this.f260Z = 0;
        this.aa = 0;
        this.ab = false;
        this.ac = false;
        this.ad[0] = -1.0f;
        this.ad[1] = -1.0f;
        this.f261a = -1;
        this.f262b = -1;
        this.ai[0] = Integer.MAX_VALUE;
        this.ai[1] = Integer.MAX_VALUE;
        this.f265e = 0;
        this.f266f = 0;
        this.f270j = 1.0f;
        this.f273m = 1.0f;
        this.f269i = Integer.MAX_VALUE;
        this.f272l = Integer.MAX_VALUE;
        this.f268h = 0;
        this.f271k = 0;
        this.f276p = -1;
        this.f277q = 1.0f;
        if (this.f263c != null) {
            this.f263c.mo21b();
        }
        if (this.f264d != null) {
            this.f264d.mo21b();
        }
        this.f278r = null;
        this.f257W = false;
        this.f258X = false;
        this.f259Y = false;
    }

    /* renamed from: g */
    public float m216g(int i) {
        return i == 0 ? this.f253S : i == 1 ? this.f254T : -1.0f;
    }

    /* renamed from: g */
    public void m217g() {
        for (int i = 0; i < 6; i++) {
            this.f236A[i].m150a().m2026c();
        }
    }

    /* renamed from: h */
    public void m218h(int i) {
        this.f244I = i;
    }

    /* renamed from: h */
    public boolean m219h() {
        return this.f279s.m150a().i == 1 && this.f281u.m150a().i == 1 && this.f280t.m150a().i == 1 && this.f282v.m150a().i == 1;
    }

    /* renamed from: i */
    public C0516n m220i() {
        if (this.f263c == null) {
            this.f263c = new C0516n();
        }
        return this.f263c;
    }

    /* renamed from: i */
    public void m221i(int i) {
        this.f245J = i;
    }

    /* renamed from: j */
    public C0516n m222j() {
        if (this.f264d == null) {
            this.f264d = new C0516n();
        }
        return this.f264d;
    }

    /* renamed from: j */
    public void m223j(int i) {
        this.f240E = i;
        if (this.f240E < this.f251P) {
            this.f240E = this.f251P;
        }
    }

    /* renamed from: k */
    public C0061f m224k() {
        return this.f239D;
    }

    /* renamed from: k */
    public void m225k(int i) {
        this.f241F = i;
        if (this.f241F < this.f252Q) {
            this.f241F = this.f252Q;
        }
    }

    /* renamed from: l */
    public int m226l() {
        return this.as;
    }

    /* renamed from: l */
    public void m227l(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f251P = i;
    }

    /* renamed from: m */
    public String m228m() {
        return this.at;
    }

    /* renamed from: m */
    public void m229m(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f252Q = i;
    }

    /* renamed from: n */
    public int m230n() {
        return this.f244I;
    }

    /* renamed from: n */
    public void m231n(int i) {
        this.ao = i;
    }

    /* renamed from: o */
    public int m232o() {
        return this.f245J;
    }

    /* renamed from: o */
    public void m233o(int i) {
        this.ap = i;
    }

    /* renamed from: p */
    public int m234p() {
        return this.as == 8 ? 0 : this.f240E;
    }

    /* renamed from: p */
    int m235p(int i) {
        return i == 0 ? this.f246K : i == 1 ? this.f247L : 0;
    }

    /* renamed from: q */
    public int m236q() {
        return this.ao;
    }

    /* renamed from: q */
    public void m237q(int i) {
        this.f250O = i;
    }

    /* renamed from: r */
    public int m238r() {
        return this.as == 8 ? 0 : this.f241F;
    }

    /* renamed from: r */
    public void m239r(int i) {
        this.f260Z = i;
    }

    /* renamed from: s */
    public int m240s() {
        return this.ap;
    }

    /* renamed from: s */
    public void m241s(int i) {
        this.aa = i;
    }

    /* renamed from: t */
    public int m242t() {
        return this.ak + this.f248M;
    }

    /* renamed from: t */
    public C0060a m243t(int i) {
        return i == 0 ? m172F() : i == 1 ? m173G() : null;
    }

    public String toString() {
        String stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder();
        if (this.au != null) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("type: ");
            stringBuilder3.append(this.au);
            stringBuilder3.append(" ");
            stringBuilder = stringBuilder3.toString();
        } else {
            stringBuilder = "";
        }
        stringBuilder2.append(stringBuilder);
        if (this.at != null) {
            stringBuilder3 = new StringBuilder();
            stringBuilder3.append("id: ");
            stringBuilder3.append(this.at);
            stringBuilder3.append(" ");
            stringBuilder = stringBuilder3.toString();
        } else {
            stringBuilder = "";
        }
        stringBuilder2.append(stringBuilder);
        stringBuilder2.append("(");
        stringBuilder2.append(this.f244I);
        stringBuilder2.append(", ");
        stringBuilder2.append(this.f245J);
        stringBuilder2.append(") - (");
        stringBuilder2.append(this.f240E);
        stringBuilder2.append(" x ");
        stringBuilder2.append(this.f241F);
        stringBuilder2.append(") wrap: (");
        stringBuilder2.append(this.ao);
        stringBuilder2.append(" x ");
        stringBuilder2.append(this.ap);
        stringBuilder2.append(")");
        return stringBuilder2.toString();
    }

    /* renamed from: u */
    public int m244u() {
        return this.al + this.f249N;
    }

    /* renamed from: v */
    protected int m245v() {
        return this.f244I + this.f248M;
    }

    /* renamed from: w */
    protected int m246w() {
        return this.f245J + this.f249N;
    }

    /* renamed from: x */
    public int m247x() {
        return m230n() + this.f240E;
    }

    /* renamed from: y */
    public int m248y() {
        return m232o() + this.f241F;
    }

    /* renamed from: z */
    public boolean m249z() {
        return this.f250O > 0;
    }
}
