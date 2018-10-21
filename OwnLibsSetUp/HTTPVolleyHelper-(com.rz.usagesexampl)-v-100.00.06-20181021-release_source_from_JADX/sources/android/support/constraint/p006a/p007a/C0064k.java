package android.support.constraint.p006a.p007a;

import android.support.constraint.p006a.C0072e;
import android.support.constraint.p006a.p007a.C0061f.C0060a;

/* renamed from: android.support.constraint.a.a.k */
public class C0064k {
    /* renamed from: a */
    static boolean[] f299a = new boolean[3];

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    static void m257a(int r17, android.support.constraint.p006a.p007a.C0061f r18) {
        /*
        r0 = r18;
        r18.m217g();
        r1 = r0.f279s;
        r1 = r1.m150a();
        r2 = r0.f280t;
        r2 = r2.m150a();
        r3 = r0.f281u;
        r3 = r3.m150a();
        r4 = r0.f282v;
        r4 = r4.m150a();
        r5 = 8;
        r6 = r17 & 8;
        r7 = 0;
        r8 = 1;
        if (r6 != r5) goto L_0x0027;
    L_0x0025:
        r6 = 1;
        goto L_0x0028;
    L_0x0027:
        r6 = 0;
    L_0x0028:
        r9 = r0.f238C;
        r9 = r9[r7];
        r10 = android.support.constraint.p006a.p007a.C0061f.C0060a.MATCH_CONSTRAINT;
        if (r9 != r10) goto L_0x0038;
    L_0x0030:
        r9 = android.support.constraint.p006a.p007a.C0064k.m260a(r0, r7);
        if (r9 == 0) goto L_0x0038;
    L_0x0036:
        r9 = 1;
        goto L_0x0039;
    L_0x0038:
        r9 = 0;
    L_0x0039:
        r10 = r1.f1802g;
        r11 = 3;
        r12 = 4;
        r13 = 0;
        r14 = -1;
        r15 = 2;
        if (r10 == r12) goto L_0x0181;
    L_0x0042:
        r10 = r3.f1802g;
        if (r10 == r12) goto L_0x0181;
    L_0x0046:
        r10 = r0.f238C;
        r10 = r10[r7];
        r7 = android.support.constraint.p006a.p007a.C0061f.C0060a.FIXED;
        if (r10 == r7) goto L_0x00d7;
    L_0x004e:
        if (r9 == 0) goto L_0x0058;
    L_0x0050:
        r7 = r18.m226l();
        if (r7 != r5) goto L_0x0058;
    L_0x0056:
        goto L_0x00d7;
    L_0x0058:
        if (r9 == 0) goto L_0x0181;
    L_0x005a:
        r7 = r18.m234p();
        r1.m2023b(r8);
        r3.m2023b(r8);
        r9 = r0.f279s;
        r9 = r9.f220c;
        if (r9 != 0) goto L_0x0074;
    L_0x006a:
        r9 = r0.f281u;
        r9 = r9.f220c;
        if (r9 != 0) goto L_0x0074;
    L_0x0070:
        if (r6 == 0) goto L_0x00f8;
    L_0x0072:
        goto L_0x00eb;
    L_0x0074:
        r9 = r0.f279s;
        r9 = r9.f220c;
        if (r9 == 0) goto L_0x0083;
    L_0x007a:
        r9 = r0.f281u;
        r9 = r9.f220c;
        if (r9 != 0) goto L_0x0083;
    L_0x0080:
        if (r6 == 0) goto L_0x00f8;
    L_0x0082:
        goto L_0x00eb;
    L_0x0083:
        r9 = r0.f279s;
        r9 = r9.f220c;
        if (r9 != 0) goto L_0x0093;
    L_0x0089:
        r9 = r0.f281u;
        r9 = r9.f220c;
        if (r9 == 0) goto L_0x0093;
    L_0x008f:
        if (r6 == 0) goto L_0x013a;
    L_0x0091:
        goto L_0x012e;
    L_0x0093:
        r9 = r0.f279s;
        r9 = r9.f220c;
        if (r9 == 0) goto L_0x0181;
    L_0x0099:
        r9 = r0.f281u;
        r9 = r9.f220c;
        if (r9 == 0) goto L_0x0181;
    L_0x009f:
        if (r6 == 0) goto L_0x00af;
    L_0x00a1:
        r9 = r18.m220i();
        r9.m263a(r1);
        r9 = r18.m220i();
        r9.m263a(r3);
    L_0x00af:
        r9 = r0.f242G;
        r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1));
        if (r9 != 0) goto L_0x00c3;
    L_0x00b5:
        r1.m2023b(r11);
        r3.m2023b(r11);
        r1.m2024b(r3, r13);
        r3.m2024b(r1, r13);
        goto L_0x0181;
    L_0x00c3:
        r1.m2023b(r15);
        r3.m2023b(r15);
        r9 = -r7;
        r9 = (float) r9;
        r1.m2024b(r3, r9);
        r9 = (float) r7;
        r3.m2024b(r1, r9);
        r0.m223j(r7);
        goto L_0x0181;
    L_0x00d7:
        r7 = r0.f279s;
        r7 = r7.f220c;
        if (r7 != 0) goto L_0x00fd;
    L_0x00dd:
        r7 = r0.f281u;
        r7 = r7.f220c;
        if (r7 != 0) goto L_0x00fd;
    L_0x00e3:
        r1.m2023b(r8);
        r3.m2023b(r8);
        if (r6 == 0) goto L_0x00f4;
    L_0x00eb:
        r7 = r18.m220i();
        r3.m2020a(r1, r8, r7);
        goto L_0x0181;
    L_0x00f4:
        r7 = r18.m234p();
    L_0x00f8:
        r3.m2019a(r1, r7);
        goto L_0x0181;
    L_0x00fd:
        r7 = r0.f279s;
        r7 = r7.f220c;
        if (r7 == 0) goto L_0x0112;
    L_0x0103:
        r7 = r0.f281u;
        r7 = r7.f220c;
        if (r7 != 0) goto L_0x0112;
    L_0x0109:
        r1.m2023b(r8);
        r3.m2023b(r8);
        if (r6 == 0) goto L_0x00f4;
    L_0x0111:
        goto L_0x00eb;
    L_0x0112:
        r7 = r0.f279s;
        r7 = r7.f220c;
        if (r7 != 0) goto L_0x013f;
    L_0x0118:
        r7 = r0.f281u;
        r7 = r7.f220c;
        if (r7 == 0) goto L_0x013f;
    L_0x011e:
        r1.m2023b(r8);
        r3.m2023b(r8);
        r7 = r18.m234p();
        r7 = -r7;
        r1.m2019a(r3, r7);
        if (r6 == 0) goto L_0x0136;
    L_0x012e:
        r7 = r18.m220i();
        r1.m2020a(r3, r14, r7);
        goto L_0x0181;
    L_0x0136:
        r7 = r18.m234p();
    L_0x013a:
        r7 = -r7;
        r1.m2019a(r3, r7);
        goto L_0x0181;
    L_0x013f:
        r7 = r0.f279s;
        r7 = r7.f220c;
        if (r7 == 0) goto L_0x0181;
    L_0x0145:
        r7 = r0.f281u;
        r7 = r7.f220c;
        if (r7 == 0) goto L_0x0181;
    L_0x014b:
        r1.m2023b(r15);
        r3.m2023b(r15);
        if (r6 == 0) goto L_0x0170;
    L_0x0153:
        r7 = r18.m220i();
        r7.m263a(r1);
        r7 = r18.m220i();
        r7.m263a(r3);
        r7 = r18.m220i();
        r1.m2025b(r3, r14, r7);
        r7 = r18.m220i();
        r3.m2025b(r1, r8, r7);
        goto L_0x0181;
    L_0x0170:
        r7 = r18.m234p();
        r7 = -r7;
        r7 = (float) r7;
        r1.m2024b(r3, r7);
        r7 = r18.m234p();
        r7 = (float) r7;
        r3.m2024b(r1, r7);
    L_0x0181:
        r1 = r0.f238C;
        r1 = r1[r8];
        r3 = android.support.constraint.p006a.p007a.C0061f.C0060a.MATCH_CONSTRAINT;
        if (r1 != r3) goto L_0x0192;
    L_0x0189:
        r1 = android.support.constraint.p006a.p007a.C0064k.m260a(r0, r8);
        if (r1 == 0) goto L_0x0192;
    L_0x018f:
        r16 = 1;
        goto L_0x0194;
    L_0x0192:
        r16 = 0;
    L_0x0194:
        r1 = r2.f1802g;
        if (r1 == r12) goto L_0x032d;
    L_0x0198:
        r1 = r4.f1802g;
        if (r1 == r12) goto L_0x032d;
    L_0x019c:
        r1 = r0.f238C;
        r1 = r1[r8];
        r3 = android.support.constraint.p006a.p007a.C0061f.C0060a.FIXED;
        if (r1 == r3) goto L_0x0249;
    L_0x01a4:
        if (r16 == 0) goto L_0x01ae;
    L_0x01a6:
        r1 = r18.m226l();
        if (r1 != r5) goto L_0x01ae;
    L_0x01ac:
        goto L_0x0249;
    L_0x01ae:
        if (r16 == 0) goto L_0x032d;
    L_0x01b0:
        r1 = r18.m238r();
        r2.m2023b(r8);
        r4.m2023b(r8);
        r3 = r0.f280t;
        r3 = r3.f220c;
        if (r3 != 0) goto L_0x01d6;
    L_0x01c0:
        r3 = r0.f282v;
        r3 = r3.f220c;
        if (r3 != 0) goto L_0x01d6;
    L_0x01c6:
        if (r6 == 0) goto L_0x01d1;
    L_0x01c8:
        r0 = r18.m222j();
        r4.m2020a(r2, r8, r0);
        goto L_0x032d;
    L_0x01d1:
        r4.m2019a(r2, r1);
        goto L_0x032d;
    L_0x01d6:
        r3 = r0.f280t;
        r3 = r3.f220c;
        if (r3 == 0) goto L_0x01e5;
    L_0x01dc:
        r3 = r0.f282v;
        r3 = r3.f220c;
        if (r3 != 0) goto L_0x01e5;
    L_0x01e2:
        if (r6 == 0) goto L_0x01d1;
    L_0x01e4:
        goto L_0x01c8;
    L_0x01e5:
        r3 = r0.f280t;
        r3 = r3.f220c;
        if (r3 != 0) goto L_0x0202;
    L_0x01eb:
        r3 = r0.f282v;
        r3 = r3.f220c;
        if (r3 == 0) goto L_0x0202;
    L_0x01f1:
        if (r6 == 0) goto L_0x01fc;
    L_0x01f3:
        r0 = r18.m222j();
        r2.m2020a(r4, r14, r0);
        goto L_0x032d;
    L_0x01fc:
        r0 = -r1;
        r2.m2019a(r4, r0);
        goto L_0x032d;
    L_0x0202:
        r3 = r0.f280t;
        r3 = r3.f220c;
        if (r3 == 0) goto L_0x032d;
    L_0x0208:
        r3 = r0.f282v;
        r3 = r3.f220c;
        if (r3 == 0) goto L_0x032d;
    L_0x020e:
        if (r6 == 0) goto L_0x021e;
    L_0x0210:
        r3 = r18.m222j();
        r3.m263a(r2);
        r3 = r18.m220i();
        r3.m263a(r4);
    L_0x021e:
        r3 = r0.f242G;
        r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1));
        if (r3 != 0) goto L_0x0232;
    L_0x0224:
        r2.m2023b(r11);
        r4.m2023b(r11);
        r2.m2024b(r4, r13);
        r4.m2024b(r2, r13);
        goto L_0x032d;
    L_0x0232:
        r2.m2023b(r15);
        r4.m2023b(r15);
        r3 = -r1;
        r3 = (float) r3;
        r2.m2024b(r4, r3);
        r3 = (float) r1;
        r4.m2024b(r2, r3);
        r0.m225k(r1);
        r1 = r0.f250O;
        if (r1 <= 0) goto L_0x032d;
    L_0x0248:
        goto L_0x02b0;
    L_0x0249:
        r1 = r0.f280t;
        r1 = r1.f220c;
        if (r1 != 0) goto L_0x0289;
    L_0x024f:
        r1 = r0.f282v;
        r1 = r1.f220c;
        if (r1 != 0) goto L_0x0289;
    L_0x0255:
        r2.m2023b(r8);
        r4.m2023b(r8);
        if (r6 == 0) goto L_0x0265;
    L_0x025d:
        r1 = r18.m222j();
        r4.m2020a(r2, r8, r1);
        goto L_0x026c;
    L_0x0265:
        r1 = r18.m238r();
        r4.m2019a(r2, r1);
    L_0x026c:
        r1 = r0.f283w;
        r1 = r1.f220c;
        if (r1 == 0) goto L_0x032d;
    L_0x0272:
        r1 = r0.f283w;
        r1 = r1.m150a();
        r1.m2023b(r8);
        r1 = r0.f283w;
        r1 = r1.m150a();
        r0 = r0.f250O;
        r0 = -r0;
        r2.m2017a(r8, r1, r0);
        goto L_0x032d;
    L_0x0289:
        r1 = r0.f280t;
        r1 = r1.f220c;
        if (r1 == 0) goto L_0x02bd;
    L_0x028f:
        r1 = r0.f282v;
        r1 = r1.f220c;
        if (r1 != 0) goto L_0x02bd;
    L_0x0295:
        r2.m2023b(r8);
        r4.m2023b(r8);
        if (r6 == 0) goto L_0x02a5;
    L_0x029d:
        r1 = r18.m222j();
        r4.m2020a(r2, r8, r1);
        goto L_0x02ac;
    L_0x02a5:
        r1 = r18.m238r();
        r4.m2019a(r2, r1);
    L_0x02ac:
        r1 = r0.f250O;
        if (r1 <= 0) goto L_0x032d;
    L_0x02b0:
        r1 = r0.f283w;
        r1 = r1.m150a();
        r0 = r0.f250O;
        r1.m2017a(r8, r2, r0);
        goto L_0x032d;
    L_0x02bd:
        r1 = r0.f280t;
        r1 = r1.f220c;
        if (r1 != 0) goto L_0x02e6;
    L_0x02c3:
        r1 = r0.f282v;
        r1 = r1.f220c;
        if (r1 == 0) goto L_0x02e6;
    L_0x02c9:
        r2.m2023b(r8);
        r4.m2023b(r8);
        if (r6 == 0) goto L_0x02d9;
    L_0x02d1:
        r1 = r18.m222j();
        r2.m2020a(r4, r14, r1);
        goto L_0x02e1;
    L_0x02d9:
        r1 = r18.m238r();
        r1 = -r1;
        r2.m2019a(r4, r1);
    L_0x02e1:
        r1 = r0.f250O;
        if (r1 <= 0) goto L_0x032d;
    L_0x02e5:
        goto L_0x02b0;
    L_0x02e6:
        r1 = r0.f280t;
        r1 = r1.f220c;
        if (r1 == 0) goto L_0x032d;
    L_0x02ec:
        r1 = r0.f282v;
        r1 = r1.f220c;
        if (r1 == 0) goto L_0x032d;
    L_0x02f2:
        r2.m2023b(r15);
        r4.m2023b(r15);
        if (r6 == 0) goto L_0x0317;
    L_0x02fa:
        r1 = r18.m222j();
        r2.m2025b(r4, r14, r1);
        r1 = r18.m222j();
        r4.m2025b(r2, r8, r1);
        r1 = r18.m222j();
        r1.m263a(r2);
        r1 = r18.m220i();
        r1.m263a(r4);
        goto L_0x0328;
    L_0x0317:
        r1 = r18.m238r();
        r1 = -r1;
        r1 = (float) r1;
        r2.m2024b(r4, r1);
        r1 = r18.m238r();
        r1 = (float) r1;
        r4.m2024b(r2, r1);
    L_0x0328:
        r1 = r0.f250O;
        if (r1 <= 0) goto L_0x032d;
    L_0x032c:
        goto L_0x02b0;
    L_0x032d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.a.a.k.a(int, android.support.constraint.a.a.f):void");
    }

    /* renamed from: a */
    static void m258a(C0061f c0061f, int i, int i2) {
        int i3 = i * 2;
        int i4 = i3 + 1;
        c0061f.f236A[i3].m150a().f1800e = c0061f.m224k().f279s.m150a();
        c0061f.f236A[i3].m150a().f1801f = (float) i2;
        c0061f.f236A[i3].m150a().i = 1;
        c0061f.f236A[i4].m150a().f1800e = c0061f.f236A[i3].m150a();
        c0061f.f236A[i4].m150a().f1801f = (float) c0061f.m214f(i);
        c0061f.f236A[i4].m150a().i = 1;
    }

    /* renamed from: a */
    static void m259a(C0732g c0732g, C0072e c0072e, C0061f c0061f) {
        if (c0732g.C[0] != C0060a.WRAP_CONTENT && c0061f.f238C[0] == C0060a.MATCH_PARENT) {
            int i = c0061f.f279s.f221d;
            int p = c0732g.m234p() - c0061f.f281u.f221d;
            c0061f.f279s.f223f = c0072e.m304a(c0061f.f279s);
            c0061f.f281u.f223f = c0072e.m304a(c0061f.f281u);
            c0072e.m309a(c0061f.f279s.f223f, i);
            c0072e.m309a(c0061f.f281u.f223f, p);
            c0061f.f261a = 2;
            c0061f.m204c(i, p);
        }
        if (c0732g.C[1] != C0060a.WRAP_CONTENT && c0061f.f238C[1] == C0060a.MATCH_PARENT) {
            i = c0061f.f280t.f221d;
            int r = c0732g.m238r() - c0061f.f282v.f221d;
            c0061f.f280t.f223f = c0072e.m304a(c0061f.f280t);
            c0061f.f282v.f223f = c0072e.m304a(c0061f.f282v);
            c0072e.m309a(c0061f.f280t.f223f, i);
            c0072e.m309a(c0061f.f282v.f223f, r);
            if (c0061f.f250O > 0 || c0061f.m226l() == 8) {
                c0061f.f283w.f223f = c0072e.m304a(c0061f.f283w);
                c0072e.m309a(c0061f.f283w.f223f, c0061f.f250O + i);
            }
            c0061f.f262b = 2;
            c0061f.m209d(i, r);
        }
    }

    /* renamed from: a */
    private static boolean m260a(C0061f c0061f, int i) {
        if (c0061f.f238C[i] != C0060a.MATCH_CONSTRAINT) {
            return false;
        }
        int i2 = 1;
        if (c0061f.f242G != 0.0f) {
            C0060a[] c0060aArr = c0061f.f238C;
            if (i != 0) {
                i2 = 0;
            }
            return c0060aArr[i2] == C0060a.MATCH_CONSTRAINT ? false : false;
        } else {
            if (i == 0) {
                return c0061f.f265e == 0 && c0061f.f268h == 0 && c0061f.f269i == 0;
            } else {
                if (c0061f.f266f == 0 && c0061f.f271k == 0) {
                    if (c0061f.f272l != 0) {
                    }
                }
                return false;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    static boolean m261a(android.support.constraint.p006a.p007a.C0732g r22, android.support.constraint.p006a.C0072e r23, int r24, int r25, android.support.constraint.p006a.p007a.C0053d r26) {
        /*
        r0 = r23;
        r1 = r24;
        r2 = r26;
        r3 = r2.f183a;
        r4 = r2.f185c;
        r5 = r2.f184b;
        r6 = r2.f186d;
        r7 = r2.f187e;
        r8 = r2.f193k;
        r9 = r2.f188f;
        r2 = r2.f189g;
        r9 = r22;
        r2 = r9.C;
        r2 = r2[r1];
        r9 = android.support.constraint.p006a.p007a.C0061f.C0060a.WRAP_CONTENT;
        r2 = 2;
        r10 = 1;
        if (r1 != 0) goto L_0x0038;
    L_0x0022:
        r11 = r7.f260Z;
        if (r11 != 0) goto L_0x0028;
    L_0x0026:
        r11 = 1;
        goto L_0x0029;
    L_0x0028:
        r11 = 0;
    L_0x0029:
        r12 = r7.f260Z;
        if (r12 != r10) goto L_0x002f;
    L_0x002d:
        r12 = 1;
        goto L_0x0030;
    L_0x002f:
        r12 = 0;
    L_0x0030:
        r7 = r7.f260Z;
        if (r7 != r2) goto L_0x0036;
    L_0x0034:
        r2 = 1;
        goto L_0x004b;
    L_0x0036:
        r2 = 0;
        goto L_0x004b;
    L_0x0038:
        r11 = r7.aa;
        if (r11 != 0) goto L_0x003e;
    L_0x003c:
        r11 = 1;
        goto L_0x003f;
    L_0x003e:
        r11 = 0;
    L_0x003f:
        r12 = r7.aa;
        if (r12 != r10) goto L_0x0045;
    L_0x0043:
        r12 = 1;
        goto L_0x0046;
    L_0x0045:
        r12 = 0;
    L_0x0046:
        r7 = r7.aa;
        if (r7 != r2) goto L_0x0036;
    L_0x004a:
        goto L_0x0034;
    L_0x004b:
        r14 = r3;
        r7 = 0;
        r10 = 0;
        r13 = 0;
        r15 = 0;
        r17 = 0;
    L_0x0052:
        r9 = 8;
        if (r13 != 0) goto L_0x010d;
    L_0x0056:
        r18 = r13;
        r13 = r14.m226l();
        if (r13 == r9) goto L_0x00a0;
    L_0x005e:
        r10 = r10 + 1;
        if (r1 != 0) goto L_0x0069;
    L_0x0062:
        r13 = r14.m234p();
    L_0x0066:
        r13 = (float) r13;
        r15 = r15 + r13;
        goto L_0x006e;
    L_0x0069:
        r13 = r14.m238r();
        goto L_0x0066;
    L_0x006e:
        if (r14 == r5) goto L_0x007a;
    L_0x0070:
        r13 = r14.f236A;
        r13 = r13[r25];
        r13 = r13.m158e();
        r13 = (float) r13;
        r15 = r15 + r13;
    L_0x007a:
        if (r14 == r6) goto L_0x0088;
    L_0x007c:
        r13 = r14.f236A;
        r19 = r25 + 1;
        r13 = r13[r19];
        r13 = r13.m158e();
        r13 = (float) r13;
        r15 = r15 + r13;
    L_0x0088:
        r13 = r14.f236A;
        r13 = r13[r25];
        r13 = r13.m158e();
        r13 = (float) r13;
        r17 = r17 + r13;
        r13 = r14.f236A;
        r19 = r25 + 1;
        r13 = r13[r19];
        r13 = r13.m158e();
        r13 = (float) r13;
        r17 = r17 + r13;
    L_0x00a0:
        r13 = r14.f236A;
        r13 = r13[r25];
        r13 = r14.m226l();
        if (r13 == r9) goto L_0x00de;
    L_0x00aa:
        r9 = r14.f238C;
        r9 = r9[r1];
        r13 = android.support.constraint.p006a.p007a.C0061f.C0060a.MATCH_CONSTRAINT;
        if (r9 != r13) goto L_0x00de;
    L_0x00b2:
        r7 = r7 + 1;
        if (r1 != 0) goto L_0x00c6;
    L_0x00b6:
        r9 = r14.f265e;
        if (r9 == 0) goto L_0x00bc;
    L_0x00ba:
        r9 = 0;
        return r9;
    L_0x00bc:
        r9 = 0;
        r13 = r14.f268h;
        if (r13 != 0) goto L_0x00c5;
    L_0x00c1:
        r13 = r14.f269i;
        if (r13 == 0) goto L_0x00d5;
    L_0x00c5:
        return r9;
    L_0x00c6:
        r9 = 0;
        r13 = r14.f266f;
        if (r13 == 0) goto L_0x00cc;
    L_0x00cb:
        return r9;
    L_0x00cc:
        r13 = r14.f271k;
        if (r13 != 0) goto L_0x00dd;
    L_0x00d0:
        r13 = r14.f272l;
        if (r13 == 0) goto L_0x00d5;
    L_0x00d4:
        goto L_0x00dd;
    L_0x00d5:
        r13 = r14.f242G;
        r16 = 0;
        r13 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1));
        if (r13 == 0) goto L_0x00de;
    L_0x00dd:
        return r9;
    L_0x00de:
        r9 = r14.f236A;
        r13 = r25 + 1;
        r9 = r9[r13];
        r9 = r9.f220c;
        if (r9 == 0) goto L_0x0100;
    L_0x00e8:
        r9 = r9.f218a;
        r13 = r9.f236A;
        r13 = r13[r25];
        r13 = r13.f220c;
        if (r13 == 0) goto L_0x0100;
    L_0x00f2:
        r13 = r9.f236A;
        r13 = r13[r25];
        r13 = r13.f220c;
        r13 = r13.f218a;
        if (r13 == r14) goto L_0x00fd;
    L_0x00fc:
        goto L_0x0100;
    L_0x00fd:
        r20 = r9;
        goto L_0x0102;
    L_0x0100:
        r20 = 0;
    L_0x0102:
        if (r20 == 0) goto L_0x010a;
    L_0x0104:
        r13 = r18;
        r14 = r20;
        goto L_0x0052;
    L_0x010a:
        r13 = 1;
        goto L_0x0052;
    L_0x010d:
        r13 = r3.f236A;
        r13 = r13[r25];
        r13 = r13.m150a();
        r9 = r4.f236A;
        r18 = r25 + 1;
        r9 = r9[r18];
        r9 = r9.m150a();
        r21 = r3;
        r3 = r13.f1798c;
        if (r3 == 0) goto L_0x039a;
    L_0x0125:
        r3 = r9.f1798c;
        if (r3 != 0) goto L_0x012b;
    L_0x0129:
        goto L_0x039a;
    L_0x012b:
        r3 = r13.f1798c;
        r3 = r3.i;
        r0 = 1;
        if (r3 != r0) goto L_0x0398;
    L_0x0132:
        r3 = r9.f1798c;
        r3 = r3.i;
        if (r3 == r0) goto L_0x013a;
    L_0x0138:
        goto L_0x0398;
    L_0x013a:
        if (r7 <= 0) goto L_0x0140;
    L_0x013c:
        if (r7 == r10) goto L_0x0140;
    L_0x013e:
        r0 = 0;
        return r0;
    L_0x0140:
        if (r2 != 0) goto L_0x0149;
    L_0x0142:
        if (r11 != 0) goto L_0x0149;
    L_0x0144:
        if (r12 == 0) goto L_0x0147;
    L_0x0146:
        goto L_0x0149;
    L_0x0147:
        r0 = 0;
        goto L_0x0162;
    L_0x0149:
        if (r5 == 0) goto L_0x0155;
    L_0x014b:
        r0 = r5.f236A;
        r0 = r0[r25];
        r0 = r0.m158e();
        r0 = (float) r0;
        goto L_0x0156;
    L_0x0155:
        r0 = 0;
    L_0x0156:
        if (r6 == 0) goto L_0x0162;
    L_0x0158:
        r3 = r6.f236A;
        r3 = r3[r18];
        r3 = r3.m158e();
        r3 = (float) r3;
        r0 = r0 + r3;
    L_0x0162:
        r3 = r13.f1798c;
        r3 = r3.f1801f;
        r6 = r9.f1798c;
        r6 = r6.f1801f;
        r9 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1));
        if (r9 >= 0) goto L_0x0171;
    L_0x016e:
        r6 = r6 - r3;
    L_0x016f:
        r6 = r6 - r15;
        goto L_0x0174;
    L_0x0171:
        r6 = r3 - r6;
        goto L_0x016f;
    L_0x0174:
        r19 = 1;
        if (r7 <= 0) goto L_0x022d;
    L_0x0178:
        if (r7 != r10) goto L_0x022d;
    L_0x017a:
        r0 = r14.m224k();
        if (r0 == 0) goto L_0x018e;
    L_0x0180:
        r0 = r14.m224k();
        r0 = r0.f238C;
        r0 = r0[r1];
        r2 = android.support.constraint.p006a.p007a.C0061f.C0060a.WRAP_CONTENT;
        if (r0 != r2) goto L_0x018e;
    L_0x018c:
        r0 = 0;
        return r0;
    L_0x018e:
        r6 = r6 + r15;
        r6 = r6 - r17;
        r0 = r21;
    L_0x0193:
        if (r0 == 0) goto L_0x022b;
    L_0x0195:
        r2 = android.support.constraint.p006a.C0072e.f326g;
        if (r2 == 0) goto L_0x01b1;
    L_0x0199:
        r2 = android.support.constraint.p006a.C0072e.f326g;
        r9 = r2.f345B;
        r9 = r9 - r19;
        r2.f345B = r9;
        r2 = android.support.constraint.p006a.C0072e.f326g;
        r9 = r2.f366s;
        r9 = r9 + r19;
        r2.f366s = r9;
        r2 = android.support.constraint.p006a.C0072e.f326g;
        r9 = r2.f372y;
        r9 = r9 + r19;
        r2.f372y = r9;
    L_0x01b1:
        r2 = r0.af;
        r2 = r2[r1];
        if (r2 != 0) goto L_0x01bd;
    L_0x01b7:
        if (r0 != r4) goto L_0x01ba;
    L_0x01b9:
        goto L_0x01bd;
    L_0x01ba:
        r9 = r23;
        goto L_0x0228;
    L_0x01bd:
        r5 = (float) r7;
        r5 = r6 / r5;
        r9 = 0;
        r10 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1));
        if (r10 <= 0) goto L_0x01d8;
    L_0x01c5:
        r5 = r0.ad;
        r5 = r5[r1];
        r9 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1));
        if (r5 != 0) goto L_0x01d1;
    L_0x01cf:
        r5 = 0;
        goto L_0x01d8;
    L_0x01d1:
        r5 = r0.ad;
        r5 = r5[r1];
        r5 = r5 * r6;
        r5 = r5 / r8;
    L_0x01d8:
        r9 = r0.m226l();
        r10 = 8;
        if (r9 != r10) goto L_0x01e1;
    L_0x01e0:
        r5 = 0;
    L_0x01e1:
        r9 = r0.f236A;
        r9 = r9[r25];
        r9 = r9.m158e();
        r9 = (float) r9;
        r3 = r3 + r9;
        r9 = r0.f236A;
        r9 = r9[r25];
        r9 = r9.m150a();
        r10 = r13.f1800e;
        r9.m2018a(r10, r3);
        r9 = r0.f236A;
        r9 = r9[r18];
        r9 = r9.m150a();
        r10 = r13.f1800e;
        r3 = r3 + r5;
        r9.m2018a(r10, r3);
        r5 = r0.f236A;
        r5 = r5[r25];
        r5 = r5.m150a();
        r9 = r23;
        r5.m2021a(r9);
        r5 = r0.f236A;
        r5 = r5[r18];
        r5 = r5.m150a();
        r5.m2021a(r9);
        r0 = r0.f236A;
        r0 = r0[r18];
        r0 = r0.m158e();
        r0 = (float) r0;
        r3 = r3 + r0;
    L_0x0228:
        r0 = r2;
        goto L_0x0193;
    L_0x022b:
        r0 = 1;
        return r0;
    L_0x022d:
        r9 = r23;
        r7 = 0;
        r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1));
        if (r7 >= 0) goto L_0x0237;
    L_0x0234:
        r2 = 1;
        r11 = 0;
        r12 = 0;
    L_0x0237:
        if (r2 == 0) goto L_0x02c0;
    L_0x0239:
        r6 = r6 - r0;
        r2 = r21;
        r0 = r2.m216g(r1);
        r6 = r6 * r0;
        r3 = r3 + r6;
    L_0x0243:
        if (r2 == 0) goto L_0x02bd;
    L_0x0245:
        r0 = android.support.constraint.p006a.C0072e.f326g;
        if (r0 == 0) goto L_0x0261;
    L_0x0249:
        r0 = android.support.constraint.p006a.C0072e.f326g;
        r5 = r0.f345B;
        r5 = r5 - r19;
        r0.f345B = r5;
        r0 = android.support.constraint.p006a.C0072e.f326g;
        r5 = r0.f366s;
        r5 = r5 + r19;
        r0.f366s = r5;
        r0 = android.support.constraint.p006a.C0072e.f326g;
        r5 = r0.f372y;
        r5 = r5 + r19;
        r0.f372y = r5;
    L_0x0261:
        r0 = r2.af;
        r0 = r0[r1];
        if (r0 != 0) goto L_0x0269;
    L_0x0267:
        if (r2 != r4) goto L_0x02bb;
    L_0x0269:
        if (r1 != 0) goto L_0x0271;
    L_0x026b:
        r5 = r2.m234p();
    L_0x026f:
        r5 = (float) r5;
        goto L_0x0276;
    L_0x0271:
        r5 = r2.m238r();
        goto L_0x026f;
    L_0x0276:
        r6 = r2.f236A;
        r6 = r6[r25];
        r6 = r6.m158e();
        r6 = (float) r6;
        r3 = r3 + r6;
        r6 = r2.f236A;
        r6 = r6[r25];
        r6 = r6.m150a();
        r7 = r13.f1800e;
        r6.m2018a(r7, r3);
        r6 = r2.f236A;
        r6 = r6[r18];
        r6 = r6.m150a();
        r7 = r13.f1800e;
        r3 = r3 + r5;
        r6.m2018a(r7, r3);
        r5 = r2.f236A;
        r5 = r5[r25];
        r5 = r5.m150a();
        r5.m2021a(r9);
        r5 = r2.f236A;
        r5 = r5[r18];
        r5 = r5.m150a();
        r5.m2021a(r9);
        r2 = r2.f236A;
        r2 = r2[r18];
        r2 = r2.m158e();
        r2 = (float) r2;
        r3 = r3 + r2;
    L_0x02bb:
        r2 = r0;
        goto L_0x0243;
    L_0x02bd:
        r0 = 1;
        goto L_0x0397;
    L_0x02c0:
        r2 = r21;
        if (r11 != 0) goto L_0x02c6;
    L_0x02c4:
        if (r12 == 0) goto L_0x02bd;
    L_0x02c6:
        if (r11 == 0) goto L_0x02ca;
    L_0x02c8:
        r6 = r6 - r0;
        goto L_0x02cd;
    L_0x02ca:
        if (r12 == 0) goto L_0x02cd;
    L_0x02cc:
        goto L_0x02c8;
    L_0x02cd:
        r0 = r10 + 1;
        r0 = (float) r0;
        r0 = r6 / r0;
        if (r12 == 0) goto L_0x02e0;
    L_0x02d4:
        r7 = 1;
        if (r10 <= r7) goto L_0x02dd;
    L_0x02d7:
        r0 = r10 + -1;
        r0 = (float) r0;
    L_0x02da:
        r0 = r6 / r0;
        goto L_0x02e0;
    L_0x02dd:
        r0 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        goto L_0x02da;
    L_0x02e0:
        r6 = r2.m226l();
        r7 = 8;
        if (r6 == r7) goto L_0x02eb;
    L_0x02e8:
        r6 = r3 + r0;
        goto L_0x02ec;
    L_0x02eb:
        r6 = r3;
    L_0x02ec:
        if (r12 == 0) goto L_0x02fb;
    L_0x02ee:
        r7 = 1;
        if (r10 <= r7) goto L_0x02fb;
    L_0x02f1:
        r6 = r5.f236A;
        r6 = r6[r25];
        r6 = r6.m158e();
        r6 = (float) r6;
        r6 = r6 + r3;
    L_0x02fb:
        if (r11 == 0) goto L_0x0309;
    L_0x02fd:
        if (r5 == 0) goto L_0x0309;
    L_0x02ff:
        r3 = r5.f236A;
        r3 = r3[r25];
        r3 = r3.m158e();
        r3 = (float) r3;
        r6 = r6 + r3;
    L_0x0309:
        if (r2 == 0) goto L_0x02bd;
    L_0x030b:
        r3 = android.support.constraint.p006a.C0072e.f326g;
        if (r3 == 0) goto L_0x0327;
    L_0x030f:
        r3 = android.support.constraint.p006a.C0072e.f326g;
        r7 = r3.f345B;
        r7 = r7 - r19;
        r3.f345B = r7;
        r3 = android.support.constraint.p006a.C0072e.f326g;
        r7 = r3.f366s;
        r7 = r7 + r19;
        r3.f366s = r7;
        r3 = android.support.constraint.p006a.C0072e.f326g;
        r7 = r3.f372y;
        r7 = r7 + r19;
        r3.f372y = r7;
    L_0x0327:
        r3 = r2.af;
        r3 = r3[r1];
        if (r3 != 0) goto L_0x0333;
    L_0x032d:
        if (r2 != r4) goto L_0x0330;
    L_0x032f:
        goto L_0x0333;
    L_0x0330:
        r7 = 8;
        goto L_0x0394;
    L_0x0333:
        if (r1 != 0) goto L_0x033b;
    L_0x0335:
        r7 = r2.m234p();
    L_0x0339:
        r7 = (float) r7;
        goto L_0x0340;
    L_0x033b:
        r7 = r2.m238r();
        goto L_0x0339;
    L_0x0340:
        if (r2 == r5) goto L_0x034c;
    L_0x0342:
        r8 = r2.f236A;
        r8 = r8[r25];
        r8 = r8.m158e();
        r8 = (float) r8;
        r6 = r6 + r8;
    L_0x034c:
        r8 = r2.f236A;
        r8 = r8[r25];
        r8 = r8.m150a();
        r10 = r13.f1800e;
        r8.m2018a(r10, r6);
        r8 = r2.f236A;
        r8 = r8[r18];
        r8 = r8.m150a();
        r10 = r13.f1800e;
        r11 = r6 + r7;
        r8.m2018a(r10, r11);
        r8 = r2.f236A;
        r8 = r8[r25];
        r8 = r8.m150a();
        r8.m2021a(r9);
        r8 = r2.f236A;
        r8 = r8[r18];
        r8 = r8.m150a();
        r8.m2021a(r9);
        r2 = r2.f236A;
        r2 = r2[r18];
        r2 = r2.m158e();
        r2 = (float) r2;
        r7 = r7 + r2;
        r6 = r6 + r7;
        if (r3 == 0) goto L_0x0330;
    L_0x038b:
        r2 = r3.m226l();
        r7 = 8;
        if (r2 == r7) goto L_0x0394;
    L_0x0393:
        r6 = r6 + r0;
    L_0x0394:
        r2 = r3;
        goto L_0x0309;
    L_0x0397:
        return r0;
    L_0x0398:
        r0 = 0;
        return r0;
    L_0x039a:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.a.a.k.a(android.support.constraint.a.a.g, android.support.constraint.a.e, int, int, android.support.constraint.a.a.d):boolean");
    }
}
