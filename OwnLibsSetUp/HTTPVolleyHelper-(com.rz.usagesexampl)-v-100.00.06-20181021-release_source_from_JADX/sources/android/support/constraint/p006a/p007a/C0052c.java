package android.support.constraint.p006a.p007a;

import android.support.constraint.p006a.C0072e;

/* renamed from: android.support.constraint.a.a.c */
class C0052c {
    /* renamed from: a */
    static void m145a(C0732g c0732g, C0072e c0072e, int i) {
        int i2;
        C0053d[] c0053dArr;
        int i3;
        int i4 = 0;
        if (i == 0) {
            i2 = c0732g.an;
            c0053dArr = c0732g.aq;
            i3 = i2;
            i2 = 0;
        } else {
            i2 = 2;
            int i5 = c0732g.ao;
            i3 = i5;
            c0053dArr = c0732g.ap;
        }
        while (i4 < i3) {
            C0053d c0053d = c0053dArr[i4];
            c0053d.m149a();
            if (!c0732g.m3374u(4) || !C0064k.m261a(c0732g, c0072e, i, i2, c0053d)) {
                C0052c.m146a(c0732g, c0072e, i, i2, c0053d);
            }
            i4++;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    static void m146a(android.support.constraint.p006a.p007a.C0732g r48, android.support.constraint.p006a.C0072e r49, int r50, int r51, android.support.constraint.p006a.p007a.C0053d r52) {
        /*
        r0 = r48;
        r9 = r49;
        r1 = r52;
        r11 = r1.f183a;
        r12 = r1.f185c;
        r13 = r1.f184b;
        r14 = r1.f186d;
        r2 = r1.f187e;
        r3 = r1.f193k;
        r4 = r1.f188f;
        r4 = r1.f189g;
        r4 = r0.C;
        r4 = r4[r50];
        r5 = android.support.constraint.p006a.p007a.C0061f.C0060a.WRAP_CONTENT;
        r7 = 1;
        if (r4 != r5) goto L_0x0021;
    L_0x001f:
        r4 = 1;
        goto L_0x0022;
    L_0x0021:
        r4 = 0;
    L_0x0022:
        r5 = 2;
        if (r50 != 0) goto L_0x0042;
    L_0x0025:
        r8 = r2.f260Z;
        if (r8 != 0) goto L_0x002b;
    L_0x0029:
        r8 = 1;
        goto L_0x002c;
    L_0x002b:
        r8 = 0;
    L_0x002c:
        r6 = r2.f260Z;
        if (r6 != r7) goto L_0x0032;
    L_0x0030:
        r6 = 1;
        goto L_0x0033;
    L_0x0032:
        r6 = 0;
    L_0x0033:
        r7 = r2.f260Z;
        if (r7 != r5) goto L_0x0039;
    L_0x0037:
        r5 = 1;
        goto L_0x003a;
    L_0x0039:
        r5 = 0;
    L_0x003a:
        r7 = r5;
        r18 = r6;
        r17 = r8;
        r6 = r11;
        r5 = 0;
        goto L_0x0056;
    L_0x0042:
        r6 = r2.aa;
        if (r6 != 0) goto L_0x0048;
    L_0x0046:
        r8 = 1;
        goto L_0x0049;
    L_0x0048:
        r8 = 0;
    L_0x0049:
        r6 = r2.aa;
        r7 = 1;
        if (r6 != r7) goto L_0x0050;
    L_0x004e:
        r6 = 1;
        goto L_0x0051;
    L_0x0050:
        r6 = 0;
    L_0x0051:
        r7 = r2.aa;
        if (r7 != r5) goto L_0x0039;
    L_0x0055:
        goto L_0x0037;
    L_0x0056:
        r22 = 0;
        if (r5 != 0) goto L_0x0135;
    L_0x005a:
        r8 = r6.f236A;
        r8 = r8[r51];
        if (r4 != 0) goto L_0x0066;
    L_0x0060:
        if (r7 == 0) goto L_0x0063;
    L_0x0062:
        goto L_0x0066;
    L_0x0063:
        r24 = 4;
        goto L_0x0068;
    L_0x0066:
        r24 = 1;
    L_0x0068:
        r25 = r8.m158e();
        r26 = r3;
        r3 = r8.f220c;
        if (r3 == 0) goto L_0x007c;
    L_0x0072:
        if (r6 == r11) goto L_0x007c;
    L_0x0074:
        r3 = r8.f220c;
        r3 = r3.m158e();
        r25 = r25 + r3;
    L_0x007c:
        r3 = r25;
        if (r7 == 0) goto L_0x008a;
    L_0x0080:
        if (r6 == r11) goto L_0x008a;
    L_0x0082:
        if (r6 == r13) goto L_0x008a;
    L_0x0084:
        r28 = r2;
        r27 = r5;
        r5 = 6;
        goto L_0x009a;
    L_0x008a:
        if (r17 == 0) goto L_0x0094;
    L_0x008c:
        if (r4 == 0) goto L_0x0094;
    L_0x008e:
        r28 = r2;
        r27 = r5;
        r5 = 4;
        goto L_0x009a;
    L_0x0094:
        r28 = r2;
        r27 = r5;
        r5 = r24;
    L_0x009a:
        r2 = r8.f220c;
        if (r2 == 0) goto L_0x00c7;
    L_0x009e:
        if (r6 != r13) goto L_0x00af;
    L_0x00a0:
        r2 = r8.f223f;
        r29 = r11;
        r11 = r8.f220c;
        r11 = r11.f223f;
        r30 = r7;
        r7 = 5;
        r9.m311a(r2, r11, r3, r7);
        goto L_0x00bd;
    L_0x00af:
        r30 = r7;
        r29 = r11;
        r2 = r8.f223f;
        r7 = r8.f220c;
        r7 = r7.f223f;
        r11 = 6;
        r9.m311a(r2, r7, r3, r11);
    L_0x00bd:
        r2 = r8.f223f;
        r7 = r8.f220c;
        r7 = r7.f223f;
        r9.m319c(r2, r7, r3, r5);
        goto L_0x00cb;
    L_0x00c7:
        r30 = r7;
        r29 = r11;
    L_0x00cb:
        if (r4 == 0) goto L_0x0102;
    L_0x00cd:
        r2 = r6.m226l();
        r3 = 8;
        if (r2 == r3) goto L_0x00f1;
    L_0x00d5:
        r2 = r6.f238C;
        r2 = r2[r50];
        r3 = android.support.constraint.p006a.p007a.C0061f.C0060a.MATCH_CONSTRAINT;
        if (r2 != r3) goto L_0x00f1;
    L_0x00dd:
        r2 = r6.f236A;
        r3 = r51 + 1;
        r2 = r2[r3];
        r2 = r2.f223f;
        r3 = r6.f236A;
        r3 = r3[r51];
        r3 = r3.f223f;
        r5 = 0;
        r7 = 5;
        r9.m311a(r2, r3, r5, r7);
        goto L_0x00f2;
    L_0x00f1:
        r5 = 0;
    L_0x00f2:
        r2 = r6.f236A;
        r2 = r2[r51];
        r2 = r2.f223f;
        r3 = r0.A;
        r3 = r3[r51];
        r3 = r3.f223f;
        r7 = 6;
        r9.m311a(r2, r3, r5, r7);
    L_0x0102:
        r2 = r6.f236A;
        r3 = r51 + 1;
        r2 = r2[r3];
        r2 = r2.f220c;
        if (r2 == 0) goto L_0x0123;
    L_0x010c:
        r2 = r2.f218a;
        r3 = r2.f236A;
        r3 = r3[r51];
        r3 = r3.f220c;
        if (r3 == 0) goto L_0x0123;
    L_0x0116:
        r3 = r2.f236A;
        r3 = r3[r51];
        r3 = r3.f220c;
        r3 = r3.f218a;
        if (r3 == r6) goto L_0x0121;
    L_0x0120:
        goto L_0x0123;
    L_0x0121:
        r22 = r2;
    L_0x0123:
        if (r22 == 0) goto L_0x012a;
    L_0x0125:
        r6 = r22;
        r5 = r27;
        goto L_0x012b;
    L_0x012a:
        r5 = 1;
    L_0x012b:
        r3 = r26;
        r2 = r28;
        r11 = r29;
        r7 = r30;
        goto L_0x0056;
    L_0x0135:
        r28 = r2;
        r26 = r3;
        r30 = r7;
        r29 = r11;
        if (r14 == 0) goto L_0x0161;
    L_0x013f:
        r2 = r12.f236A;
        r3 = r51 + 1;
        r2 = r2[r3];
        r2 = r2.f220c;
        if (r2 == 0) goto L_0x0161;
    L_0x0149:
        r2 = r14.f236A;
        r2 = r2[r3];
        r5 = r2.f223f;
        r6 = r12.f236A;
        r3 = r6[r3];
        r3 = r3.f220c;
        r3 = r3.f223f;
        r2 = r2.m158e();
        r2 = -r2;
        r8 = 5;
        r9.m316b(r5, r3, r2, r8);
        goto L_0x0162;
    L_0x0161:
        r8 = 5;
    L_0x0162:
        if (r4 == 0) goto L_0x017e;
    L_0x0164:
        r0 = r0.A;
        r2 = r51 + 1;
        r0 = r0[r2];
        r0 = r0.f223f;
        r3 = r12.f236A;
        r3 = r3[r2];
        r3 = r3.f223f;
        r4 = r12.f236A;
        r2 = r4[r2];
        r2 = r2.m158e();
        r4 = 6;
        r9.m311a(r0, r3, r2, r4);
    L_0x017e:
        r0 = r1.f190h;
        if (r0 == 0) goto L_0x022e;
    L_0x0182:
        r2 = r0.size();
        r7 = 1;
        if (r2 <= r7) goto L_0x022e;
    L_0x0189:
        r3 = r1.f194l;
        if (r3 == 0) goto L_0x0196;
    L_0x018d:
        r3 = r1.f196n;
        if (r3 != 0) goto L_0x0196;
    L_0x0191:
        r3 = r1.f192j;
        r3 = (float) r3;
        r26 = r3;
    L_0x0196:
        r3 = 0;
        r5 = r22;
        r4 = 0;
        r32 = 0;
    L_0x019c:
        if (r4 >= r2) goto L_0x022e;
    L_0x019e:
        r6 = r0.get(r4);
        r6 = (android.support.constraint.p006a.p007a.C0061f) r6;
        r11 = r6.ad;
        r11 = r11[r50];
        r16 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1));
        if (r16 >= 0) goto L_0x01cc;
    L_0x01ac:
        r11 = r1.f196n;
        if (r11 == 0) goto L_0x01c6;
    L_0x01b0:
        r11 = r6.f236A;
        r16 = r51 + 1;
        r11 = r11[r16];
        r11 = r11.f223f;
        r6 = r6.f236A;
        r6 = r6[r51];
        r6 = r6.f223f;
        r7 = 0;
        r8 = 4;
        r9.m319c(r11, r6, r7, r8);
        r8 = 6;
        r11 = 0;
        goto L_0x01e4;
    L_0x01c6:
        r8 = 4;
        r7 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r11 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        goto L_0x01cd;
    L_0x01cc:
        r8 = 4;
    L_0x01cd:
        r7 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1));
        if (r7 != 0) goto L_0x01e7;
    L_0x01d1:
        r7 = r6.f236A;
        r11 = r51 + 1;
        r7 = r7[r11];
        r7 = r7.f223f;
        r6 = r6.f236A;
        r6 = r6[r51];
        r6 = r6.f223f;
        r8 = 6;
        r11 = 0;
        r9.m319c(r7, r6, r11, r8);
    L_0x01e4:
        r40 = r0;
        goto L_0x0225;
    L_0x01e7:
        r7 = 0;
        r8 = 6;
        if (r5 == 0) goto L_0x0220;
    L_0x01eb:
        r3 = r5.f236A;
        r3 = r3[r51];
        r3 = r3.f223f;
        r5 = r5.f236A;
        r15 = r51 + 1;
        r5 = r5[r15];
        r5 = r5.f223f;
        r7 = r6.f236A;
        r7 = r7[r51];
        r7 = r7.f223f;
        r8 = r6.f236A;
        r8 = r8[r15];
        r8 = r8.f223f;
        r40 = r0;
        r0 = r49.m318c();
        r31 = r0;
        r33 = r26;
        r34 = r11;
        r35 = r3;
        r36 = r5;
        r37 = r7;
        r38 = r8;
        r31.m2040a(r32, r33, r34, r35, r36, r37, r38);
        r9.m306a(r0);
        goto L_0x0222;
    L_0x0220:
        r40 = r0;
    L_0x0222:
        r5 = r6;
        r32 = r11;
    L_0x0225:
        r4 = r4 + 1;
        r0 = r40;
        r3 = 0;
        r7 = 1;
        r8 = 5;
        goto L_0x019c;
    L_0x022e:
        if (r13 == 0) goto L_0x029b;
    L_0x0230:
        if (r13 == r14) goto L_0x0234;
    L_0x0232:
        if (r30 == 0) goto L_0x029b;
    L_0x0234:
        r11 = r29;
        r0 = r11.f236A;
        r0 = r0[r51];
        r1 = r12.f236A;
        r2 = r51 + 1;
        r1 = r1[r2];
        r3 = r11.f236A;
        r3 = r3[r51];
        r3 = r3.f220c;
        if (r3 == 0) goto L_0x0251;
    L_0x0248:
        r3 = r11.f236A;
        r3 = r3[r51];
        r3 = r3.f220c;
        r3 = r3.f223f;
        goto L_0x0253;
    L_0x0251:
        r3 = r22;
    L_0x0253:
        r4 = r12.f236A;
        r4 = r4[r2];
        r4 = r4.f220c;
        if (r4 == 0) goto L_0x0265;
    L_0x025b:
        r4 = r12.f236A;
        r4 = r4[r2];
        r4 = r4.f220c;
        r4 = r4.f223f;
        r5 = r4;
        goto L_0x0267;
    L_0x0265:
        r5 = r22;
    L_0x0267:
        if (r13 != r14) goto L_0x0271;
    L_0x0269:
        r0 = r13.f236A;
        r0 = r0[r51];
        r1 = r13.f236A;
        r1 = r1[r2];
    L_0x0271:
        if (r3 == 0) goto L_0x0506;
    L_0x0273:
        if (r5 == 0) goto L_0x0506;
    L_0x0275:
        if (r50 != 0) goto L_0x027d;
    L_0x0277:
        r2 = r28;
        r2 = r2.f253S;
    L_0x027b:
        r4 = r2;
        goto L_0x0282;
    L_0x027d:
        r2 = r28;
        r2 = r2.f254T;
        goto L_0x027b;
    L_0x0282:
        r6 = r0.m158e();
        r7 = r1.m158e();
        r2 = r0.f223f;
        r8 = r1.f223f;
        r10 = 5;
        r0 = r49;
        r1 = r2;
        r2 = r3;
        r3 = r6;
        r6 = r8;
        r8 = r10;
        r0.m310a(r1, r2, r3, r4, r5, r6, r7, r8);
        goto L_0x0506;
    L_0x029b:
        r11 = r29;
        if (r17 == 0) goto L_0x03bd;
    L_0x029f:
        if (r13 == 0) goto L_0x03bd;
    L_0x02a1:
        r0 = r1.f192j;
        if (r0 <= 0) goto L_0x02ae;
    L_0x02a5:
        r0 = r1.f191i;
        r1 = r1.f192j;
        if (r0 != r1) goto L_0x02ae;
    L_0x02ab:
        r39 = 1;
        goto L_0x02b0;
    L_0x02ae:
        r39 = 0;
    L_0x02b0:
        r7 = r13;
        r8 = r7;
    L_0x02b2:
        if (r8 == 0) goto L_0x0504;
    L_0x02b4:
        r0 = r8.af;
        r0 = r0[r50];
        r6 = r0;
    L_0x02b9:
        if (r6 == 0) goto L_0x02c8;
    L_0x02bb:
        r0 = r6.m226l();
        r5 = 8;
        if (r0 != r5) goto L_0x02ca;
    L_0x02c3:
        r0 = r6.af;
        r6 = r0[r50];
        goto L_0x02b9;
    L_0x02c8:
        r5 = 8;
    L_0x02ca:
        if (r6 != 0) goto L_0x02dd;
    L_0x02cc:
        if (r8 != r14) goto L_0x02cf;
    L_0x02ce:
        goto L_0x02dd;
    L_0x02cf:
        r19 = r6;
        r20 = r7;
        r16 = r8;
    L_0x02d5:
        r9 = 8;
        r21 = 6;
        r23 = 4;
        goto L_0x03ac;
    L_0x02dd:
        r0 = r8.f236A;
        r0 = r0[r51];
        r1 = r0.f223f;
        r2 = r0.f220c;
        if (r2 == 0) goto L_0x02ec;
    L_0x02e7:
        r2 = r0.f220c;
        r2 = r2.f223f;
        goto L_0x02ee;
    L_0x02ec:
        r2 = r22;
    L_0x02ee:
        if (r7 == r8) goto L_0x02f9;
    L_0x02f0:
        r2 = r7.f236A;
        r3 = r51 + 1;
        r2 = r2[r3];
    L_0x02f6:
        r2 = r2.f223f;
        goto L_0x030e;
    L_0x02f9:
        if (r8 != r13) goto L_0x030e;
    L_0x02fb:
        if (r7 != r8) goto L_0x030e;
    L_0x02fd:
        r2 = r11.f236A;
        r2 = r2[r51];
        r2 = r2.f220c;
        if (r2 == 0) goto L_0x030c;
    L_0x0305:
        r2 = r11.f236A;
        r2 = r2[r51];
        r2 = r2.f220c;
        goto L_0x02f6;
    L_0x030c:
        r2 = r22;
    L_0x030e:
        r0 = r0.m158e();
        r3 = r8.f236A;
        r4 = r51 + 1;
        r3 = r3[r4];
        r3 = r3.m158e();
        if (r6 == 0) goto L_0x0334;
    L_0x031e:
        r5 = r6.f236A;
        r5 = r5[r51];
        r41 = r6;
        r6 = r5.f223f;
        r42 = r5;
        r5 = r8.f236A;
        r5 = r5[r4];
        r5 = r5.f223f;
    L_0x032e:
        r47 = r6;
        r6 = r5;
        r5 = r47;
        goto L_0x0350;
    L_0x0334:
        r41 = r6;
        r5 = r12.f236A;
        r5 = r5[r4];
        r5 = r5.f220c;
        if (r5 == 0) goto L_0x0343;
    L_0x033e:
        r6 = r5.f223f;
        r43 = r5;
        goto L_0x0347;
    L_0x0343:
        r43 = r5;
        r6 = r22;
    L_0x0347:
        r5 = r8.f236A;
        r5 = r5[r4];
        r5 = r5.f223f;
        r42 = r43;
        goto L_0x032e;
    L_0x0350:
        if (r42 == 0) goto L_0x0357;
    L_0x0352:
        r15 = r42.m158e();
        r3 = r3 + r15;
    L_0x0357:
        if (r7 == 0) goto L_0x0365;
    L_0x0359:
        r44 = r3;
        r3 = r7.f236A;
        r3 = r3[r4];
        r3 = r3.m158e();
        r0 = r0 + r3;
        goto L_0x0367;
    L_0x0365:
        r44 = r3;
    L_0x0367:
        if (r1 == 0) goto L_0x03a4;
    L_0x0369:
        if (r2 == 0) goto L_0x03a4;
    L_0x036b:
        if (r5 == 0) goto L_0x03a4;
    L_0x036d:
        if (r6 == 0) goto L_0x03a4;
    L_0x036f:
        if (r8 != r13) goto L_0x0379;
    L_0x0371:
        r0 = r13.f236A;
        r0 = r0[r51];
        r0 = r0.m158e();
    L_0x0379:
        r3 = r0;
        if (r8 != r14) goto L_0x0386;
    L_0x037c:
        r0 = r14.f236A;
        r0 = r0[r4];
        r0 = r0.m158e();
        r44 = r0;
    L_0x0386:
        if (r39 == 0) goto L_0x038a;
    L_0x0388:
        r15 = 6;
        goto L_0x038b;
    L_0x038a:
        r15 = 4;
    L_0x038b:
        r4 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r0 = r49;
        r16 = 8;
        r19 = r41;
        r20 = r7;
        r7 = r44;
        r16 = r8;
        r9 = 8;
        r21 = 6;
        r23 = 4;
        r8 = r15;
        r0.m310a(r1, r2, r3, r4, r5, r6, r7, r8);
        goto L_0x03ac;
    L_0x03a4:
        r20 = r7;
        r16 = r8;
        r19 = r41;
        goto L_0x02d5;
    L_0x03ac:
        r0 = r16.m226l();
        if (r0 == r9) goto L_0x03b5;
    L_0x03b2:
        r7 = r16;
        goto L_0x03b7;
    L_0x03b5:
        r7 = r20;
    L_0x03b7:
        r8 = r19;
        r9 = r49;
        goto L_0x02b2;
    L_0x03bd:
        r9 = 8;
        r21 = 6;
        r23 = 4;
        if (r18 == 0) goto L_0x0504;
    L_0x03c5:
        if (r13 == 0) goto L_0x0504;
    L_0x03c7:
        r0 = r1.f192j;
        if (r0 <= 0) goto L_0x03d4;
    L_0x03cb:
        r0 = r1.f191i;
        r1 = r1.f192j;
        if (r0 != r1) goto L_0x03d4;
    L_0x03d1:
        r39 = 1;
        goto L_0x03d6;
    L_0x03d4:
        r39 = 0;
    L_0x03d6:
        r7 = r13;
        r8 = r7;
    L_0x03d8:
        if (r8 == 0) goto L_0x049e;
    L_0x03da:
        r0 = r8.af;
        r0 = r0[r50];
    L_0x03de:
        if (r0 == 0) goto L_0x03eb;
    L_0x03e0:
        r1 = r0.m226l();
        if (r1 != r9) goto L_0x03eb;
    L_0x03e6:
        r0 = r0.af;
        r0 = r0[r50];
        goto L_0x03de;
    L_0x03eb:
        if (r8 == r13) goto L_0x0489;
    L_0x03ed:
        if (r8 == r14) goto L_0x0489;
    L_0x03ef:
        if (r0 == 0) goto L_0x0489;
    L_0x03f1:
        if (r0 != r14) goto L_0x03f6;
    L_0x03f3:
        r6 = r22;
        goto L_0x03f7;
    L_0x03f6:
        r6 = r0;
    L_0x03f7:
        r0 = r8.f236A;
        r0 = r0[r51];
        r1 = r0.f223f;
        r2 = r0.f220c;
        if (r2 == 0) goto L_0x0405;
    L_0x0401:
        r2 = r0.f220c;
        r2 = r2.f223f;
    L_0x0405:
        r2 = r7.f236A;
        r3 = r51 + 1;
        r2 = r2[r3];
        r2 = r2.f223f;
        r0 = r0.m158e();
        r4 = r8.f236A;
        r4 = r4[r3];
        r4 = r4.m158e();
        if (r6 == 0) goto L_0x0434;
    L_0x041b:
        r5 = r6.f236A;
        r5 = r5[r51];
        r9 = r5.f223f;
        r45 = r6;
        r6 = r5.f220c;
        if (r6 == 0) goto L_0x042c;
    L_0x0427:
        r6 = r5.f220c;
        r6 = r6.f223f;
        goto L_0x042e;
    L_0x042c:
        r6 = r22;
    L_0x042e:
        r47 = r9;
        r9 = r6;
        r6 = r47;
        goto L_0x0449;
    L_0x0434:
        r45 = r6;
        r5 = r8.f236A;
        r5 = r5[r3];
        r5 = r5.f220c;
        if (r5 == 0) goto L_0x0441;
    L_0x043e:
        r6 = r5.f223f;
        goto L_0x0443;
    L_0x0441:
        r6 = r22;
    L_0x0443:
        r9 = r8.f236A;
        r9 = r9[r3];
        r9 = r9.f223f;
    L_0x0449:
        if (r5 == 0) goto L_0x0450;
    L_0x044b:
        r5 = r5.m158e();
        r4 = r4 + r5;
    L_0x0450:
        r15 = r4;
        if (r7 == 0) goto L_0x045c;
    L_0x0453:
        r4 = r7.f236A;
        r3 = r4[r3];
        r3 = r3.m158e();
        r0 = r0 + r3;
    L_0x045c:
        r3 = r0;
        if (r39 == 0) goto L_0x0462;
    L_0x045f:
        r16 = 6;
        goto L_0x0464;
    L_0x0462:
        r16 = 4;
    L_0x0464:
        if (r1 == 0) goto L_0x0480;
    L_0x0466:
        if (r2 == 0) goto L_0x0480;
    L_0x0468:
        if (r6 == 0) goto L_0x0480;
    L_0x046a:
        if (r9 == 0) goto L_0x0480;
    L_0x046c:
        r4 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r0 = r49;
        r5 = r6;
        r19 = r45;
        r6 = r9;
        r9 = r7;
        r7 = r15;
        r15 = r8;
        r46 = r9;
        r9 = 5;
        r8 = r16;
        r0.m310a(r1, r2, r3, r4, r5, r6, r7, r8);
        goto L_0x0486;
    L_0x0480:
        r46 = r7;
        r15 = r8;
        r19 = r45;
        r9 = 5;
    L_0x0486:
        r8 = r19;
        goto L_0x048e;
    L_0x0489:
        r46 = r7;
        r15 = r8;
        r9 = 5;
        r8 = r0;
    L_0x048e:
        r0 = r15.m226l();
        r1 = 8;
        if (r0 == r1) goto L_0x0498;
    L_0x0496:
        r7 = r15;
        goto L_0x049a;
    L_0x0498:
        r7 = r46;
    L_0x049a:
        r9 = 8;
        goto L_0x03d8;
    L_0x049e:
        r9 = 5;
        r0 = r13.f236A;
        r0 = r0[r51];
        r1 = r11.f236A;
        r1 = r1[r51];
        r1 = r1.f220c;
        r2 = r14.f236A;
        r3 = r51 + 1;
        r10 = r2[r3];
        r2 = r12.f236A;
        r2 = r2[r3];
        r11 = r2.f220c;
        if (r1 == 0) goto L_0x04f0;
    L_0x04b7:
        if (r13 == r14) goto L_0x04c8;
    L_0x04b9:
        r2 = r0.f223f;
        r1 = r1.f223f;
        r0 = r0.m158e();
        r8 = r49;
        r8.m319c(r2, r1, r0, r9);
    L_0x04c6:
        r9 = r8;
        goto L_0x04f2;
    L_0x04c8:
        r8 = r49;
        if (r11 == 0) goto L_0x04c6;
    L_0x04cc:
        r2 = r0.f223f;
        r3 = r1.f223f;
        r4 = r0.m158e();
        r5 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r6 = r10.f223f;
        r7 = r11.f223f;
        r15 = r10.m158e();
        r16 = 5;
        r0 = r49;
        r1 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r6;
        r6 = r7;
        r7 = r15;
        r9 = r8;
        r8 = r16;
        r0.m310a(r1, r2, r3, r4, r5, r6, r7, r8);
        goto L_0x04f2;
    L_0x04f0:
        r9 = r49;
    L_0x04f2:
        if (r11 == 0) goto L_0x0506;
    L_0x04f4:
        if (r13 == r14) goto L_0x0506;
    L_0x04f6:
        r0 = r10.f223f;
        r1 = r11.f223f;
        r2 = r10.m158e();
        r2 = -r2;
        r3 = 5;
        r9.m319c(r0, r1, r2, r3);
        goto L_0x0506;
    L_0x0504:
        r9 = r49;
    L_0x0506:
        if (r17 != 0) goto L_0x050a;
    L_0x0508:
        if (r18 == 0) goto L_0x056d;
    L_0x050a:
        if (r13 == 0) goto L_0x056d;
    L_0x050c:
        r0 = r13.f236A;
        r0 = r0[r51];
        r1 = r14.f236A;
        r2 = r51 + 1;
        r1 = r1[r2];
        r3 = r0.f220c;
        if (r3 == 0) goto L_0x051f;
    L_0x051a:
        r3 = r0.f220c;
        r3 = r3.f223f;
        goto L_0x0521;
    L_0x051f:
        r3 = r22;
    L_0x0521:
        r4 = r1.f220c;
        if (r4 == 0) goto L_0x052a;
    L_0x0525:
        r4 = r1.f220c;
        r4 = r4.f223f;
        goto L_0x052c;
    L_0x052a:
        r4 = r22;
    L_0x052c:
        if (r12 == r14) goto L_0x053d;
    L_0x052e:
        r4 = r12.f236A;
        r4 = r4[r2];
        r5 = r4.f220c;
        if (r5 == 0) goto L_0x053b;
    L_0x0536:
        r4 = r4.f220c;
        r4 = r4.f223f;
        goto L_0x053d;
    L_0x053b:
        r4 = r22;
    L_0x053d:
        r5 = r4;
        if (r13 != r14) goto L_0x0548;
    L_0x0540:
        r0 = r13.f236A;
        r0 = r0[r51];
        r1 = r13.f236A;
        r1 = r1[r2];
    L_0x0548:
        if (r3 == 0) goto L_0x056d;
    L_0x054a:
        if (r5 == 0) goto L_0x056d;
    L_0x054c:
        r4 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r6 = r0.m158e();
        if (r14 != 0) goto L_0x0555;
    L_0x0554:
        goto L_0x0556;
    L_0x0555:
        r12 = r14;
    L_0x0556:
        r7 = r12.f236A;
        r2 = r7[r2];
        r7 = r2.m158e();
        r2 = r0.f223f;
        r8 = r1.f223f;
        r10 = 5;
        r0 = r49;
        r1 = r2;
        r2 = r3;
        r3 = r6;
        r6 = r8;
        r8 = r10;
        r0.m310a(r1, r2, r3, r4, r5, r6, r7, r8);
    L_0x056d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.a.a.c.a(android.support.constraint.a.a.g, android.support.constraint.a.e, int, int, android.support.constraint.a.a.d):void");
    }
}
