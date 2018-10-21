package android.support.v4.p010b;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: android.support.v4.b.b */
public class C0162b {

    /* renamed from: android.support.v4.b.b$a */
    private static class C0160a {
        /* renamed from: a */
        int f639a;
        /* renamed from: b */
        boolean f640b;

        C0160a() {
        }
    }

    /* renamed from: android.support.v4.b.b$b */
    public static class C0161b {
        /* renamed from: a */
        public char f641a;
        /* renamed from: b */
        public float[] f642b;

        C0161b(char c, float[] fArr) {
            this.f641a = c;
            this.f642b = fArr;
        }

        C0161b(C0161b c0161b) {
            this.f641a = c0161b.f641a;
            this.f642b = C0162b.m591a(c0161b.f642b, 0, c0161b.f642b.length);
        }

        /* renamed from: a */
        private static void m581a(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            double d10 = d3;
            int ceil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d7);
            double sin = Math.sin(d7);
            double cos2 = Math.cos(d8);
            double sin2 = Math.sin(d8);
            double d11 = -d10;
            double d12 = d11 * cos;
            double d13 = d4 * sin;
            double d14 = (d12 * sin2) - (d13 * cos2);
            d11 *= sin;
            double d15 = d4 * cos;
            sin2 = (sin2 * d11) + (cos2 * d15);
            cos2 = (double) ceil;
            Double.isNaN(cos2);
            double d16 = d9 / cos2;
            int i = 0;
            double d17 = d6;
            double d18 = sin2;
            double d19 = d14;
            d14 = d5;
            double d20 = d8;
            while (i < ceil) {
                double d21 = d20 + d16;
                double sin3 = Math.sin(d21);
                double cos3 = Math.cos(d21);
                double d22 = d16;
                d16 = (d + ((d10 * cos) * cos3)) - (d13 * sin3);
                d10 = (d2 + ((d10 * sin) * cos3)) + (d15 * sin3);
                double d23 = (d12 * sin3) - (d13 * cos3);
                sin3 = (sin3 * d11) + (cos3 * d15);
                d20 = d21 - d20;
                cos3 = Math.tan(d20 / 2.0d);
                d20 = (Math.sin(d20) * (Math.sqrt(((cos3 * 3.0d) * cos3) + 4.0d) - 1.0d)) / 3.0d;
                double d24 = d15;
                d15 = d14 + (d19 * d20);
                double d25 = d11;
                d11 = d17 + (d18 * d20);
                int i2 = ceil;
                double d26 = cos;
                double d27 = d16 - (d20 * d23);
                d20 = d10 - (d20 * sin3);
                double d28 = sin;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d15, (float) d11, (float) d27, (float) d20, (float) d16, (float) d10);
                i++;
                d17 = d10;
                d14 = d16;
                d20 = d21;
                d18 = sin3;
                d19 = d23;
                d16 = d22;
                d15 = d24;
                d11 = d25;
                ceil = i2;
                cos = d26;
                sin = d28;
                d10 = d3;
            }
        }

        /* renamed from: a */
        private static void m582a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            float f8 = f;
            float f9 = f3;
            float f10 = f5;
            float f11 = f6;
            boolean z3 = z2;
            double toRadians = Math.toRadians((double) f7);
            double cos = Math.cos(toRadians);
            double sin = Math.sin(toRadians);
            double d = (double) f8;
            Double.isNaN(d);
            double d2 = d * cos;
            double d3 = d;
            d = (double) f2;
            Double.isNaN(d);
            d2 += d * sin;
            double d4 = (double) f10;
            Double.isNaN(d4);
            d2 /= d4;
            double d5 = (double) (-f8);
            Double.isNaN(d5);
            d5 *= sin;
            Double.isNaN(d);
            d5 += d * cos;
            double d6 = d;
            d = (double) f11;
            Double.isNaN(d);
            d5 /= d;
            double d7 = (double) f9;
            Double.isNaN(d7);
            d7 *= cos;
            double d8 = d5;
            d5 = (double) f4;
            Double.isNaN(d5);
            d7 += d5 * sin;
            Double.isNaN(d4);
            d7 /= d4;
            double d9 = d4;
            d4 = (double) (-f9);
            Double.isNaN(d4);
            d4 *= sin;
            Double.isNaN(d5);
            d4 += d5 * cos;
            Double.isNaN(d);
            d4 /= d;
            d5 = d2 - d7;
            double d10 = d8 - d4;
            double d11 = (d2 + d7) / 2.0d;
            double d12 = (d8 + d4) / 2.0d;
            double d13 = sin;
            sin = (d5 * d5) + (d10 * d10);
            if (sin == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d14 = (1.0d / sin) - 0.25d;
            if (d14 < 0.0d) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Points are too far apart ");
                stringBuilder.append(sin);
                Log.w("PathParser", stringBuilder.toString());
                f8 = (float) (Math.sqrt(sin) / 1.99999d);
                C0161b.m582a(path, f, f2, f3, f4, f10 * f8, f6 * f8, f7, z, z2);
                return;
            }
            sin = Math.sqrt(d14);
            d5 *= sin;
            sin *= d10;
            boolean z4 = z2;
            if (z == z4) {
                d11 -= sin;
                d12 += d5;
            } else {
                d11 += sin;
                d12 -= d5;
            }
            d8 = Math.atan2(d8 - d12, d2 - d11);
            double atan2 = Math.atan2(d4 - d12, d7 - d11) - d8;
            if (z4 != (atan2 >= 0.0d)) {
                atan2 = atan2 > 0.0d ? atan2 - 6.283185307179586d : atan2 + 6.283185307179586d;
            }
            double d15 = atan2;
            Double.isNaN(d9);
            d11 *= d9;
            Double.isNaN(d);
            d12 *= d;
            C0161b.m581a(path, (d11 * cos) - (d12 * d13), (d11 * d13) + (d12 * cos), d9, d, d3, d6, toRadians, d8, d15);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        private static void m583a(android.graphics.Path r27, float[] r28, char r29, char r30, float[] r31) {
            /*
            r10 = r27;
            r13 = r31;
            r14 = 0;
            r0 = r28[r14];
            r15 = 1;
            r1 = r28[r15];
            r16 = 2;
            r2 = r28[r16];
            r17 = 3;
            r3 = r28[r17];
            r18 = 4;
            r4 = r28[r18];
            r19 = 5;
            r5 = r28[r19];
            switch(r30) {
                case 65: goto L_0x0035;
                case 67: goto L_0x0031;
                case 72: goto L_0x002e;
                case 76: goto L_0x001d;
                case 77: goto L_0x001d;
                case 81: goto L_0x002b;
                case 83: goto L_0x002b;
                case 84: goto L_0x001d;
                case 86: goto L_0x002e;
                case 90: goto L_0x0020;
                case 97: goto L_0x0035;
                case 99: goto L_0x0031;
                case 104: goto L_0x002e;
                case 108: goto L_0x001d;
                case 109: goto L_0x001d;
                case 113: goto L_0x002b;
                case 115: goto L_0x002b;
                case 116: goto L_0x001d;
                case 118: goto L_0x002e;
                case 122: goto L_0x0020;
                default: goto L_0x001d;
            };
        L_0x001d:
            r20 = 2;
            goto L_0x0038;
        L_0x0020:
            r27.close();
            r10.moveTo(r4, r5);
            r0 = r4;
            r2 = r0;
            r1 = r5;
            r3 = r1;
            goto L_0x001d;
        L_0x002b:
            r20 = 4;
            goto L_0x0038;
        L_0x002e:
            r20 = 1;
            goto L_0x0038;
        L_0x0031:
            r6 = 6;
            r20 = 6;
            goto L_0x0038;
        L_0x0035:
            r6 = 7;
            r20 = 7;
        L_0x0038:
            r8 = r0;
            r7 = r1;
            r21 = r4;
            r22 = r5;
            r9 = 0;
            r0 = r29;
        L_0x0041:
            r1 = r13.length;
            if (r9 >= r1) goto L_0x02ee;
        L_0x0044:
            r1 = 81;
            r5 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
            r6 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
            r15 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
            r14 = 99;
            r23 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
            r4 = 0;
            switch(r30) {
                case 65: goto L_0x02a2;
                case 67: goto L_0x0277;
                case 72: goto L_0x0269;
                case 76: goto L_0x0256;
                case 77: goto L_0x0234;
                case 81: goto L_0x0213;
                case 83: goto L_0x01d9;
                case 84: goto L_0x01b0;
                case 86: goto L_0x01a2;
                case 97: goto L_0x0151;
                case 99: goto L_0x0124;
                case 104: goto L_0x0118;
                case 108: goto L_0x0105;
                case 109: goto L_0x00e3;
                case 113: goto L_0x00c4;
                case 115: goto L_0x008c;
                case 116: goto L_0x0065;
                case 118: goto L_0x005a;
                default: goto L_0x0054;
            };
        L_0x0054:
            r12 = r7;
            r11 = r8;
        L_0x0056:
            r25 = r9;
            goto L_0x02e6;
        L_0x005a:
            r0 = r9 + 0;
            r1 = r13[r0];
            r10.rLineTo(r4, r1);
            r0 = r13[r0];
            goto L_0x0115;
        L_0x0065:
            if (r0 == r15) goto L_0x0072;
        L_0x0067:
            if (r0 == r5) goto L_0x0072;
        L_0x0069:
            if (r0 == r1) goto L_0x0072;
        L_0x006b:
            r1 = 84;
            if (r0 != r1) goto L_0x0070;
        L_0x006f:
            goto L_0x0072;
        L_0x0070:
            r0 = 0;
            goto L_0x0076;
        L_0x0072:
            r4 = r8 - r2;
            r0 = r7 - r3;
        L_0x0076:
            r1 = r9 + 0;
            r2 = r13[r1];
            r3 = r9 + 1;
            r5 = r13[r3];
            r10.rQuadTo(r4, r0, r2, r5);
            r4 = r4 + r8;
            r0 = r0 + r7;
            r1 = r13[r1];
            r8 = r8 + r1;
            r1 = r13[r3];
            r7 = r7 + r1;
            r3 = r0;
            r2 = r4;
            goto L_0x0056;
        L_0x008c:
            if (r0 == r14) goto L_0x009c;
        L_0x008e:
            if (r0 == r6) goto L_0x009c;
        L_0x0090:
            r1 = 67;
            if (r0 == r1) goto L_0x009c;
        L_0x0094:
            r1 = 83;
            if (r0 != r1) goto L_0x0099;
        L_0x0098:
            goto L_0x009c;
        L_0x0099:
            r1 = 0;
            r2 = 0;
            goto L_0x00a2;
        L_0x009c:
            r0 = r8 - r2;
            r1 = r7 - r3;
            r2 = r1;
            r1 = r0;
        L_0x00a2:
            r14 = r9 + 0;
            r3 = r13[r14];
            r15 = r9 + 1;
            r4 = r13[r15];
            r23 = r9 + 2;
            r5 = r13[r23];
            r24 = r9 + 3;
            r6 = r13[r24];
            r0 = r27;
            r0.rCubicTo(r1, r2, r3, r4, r5, r6);
            r0 = r13[r14];
            r0 = r0 + r8;
            r1 = r13[r15];
            r1 = r1 + r7;
            r2 = r13[r23];
            r8 = r8 + r2;
            r2 = r13[r24];
            goto L_0x014c;
        L_0x00c4:
            r0 = r9 + 0;
            r1 = r13[r0];
            r2 = r9 + 1;
            r3 = r13[r2];
            r4 = r9 + 2;
            r5 = r13[r4];
            r6 = r9 + 3;
            r14 = r13[r6];
            r10.rQuadTo(r1, r3, r5, r14);
            r0 = r13[r0];
            r0 = r0 + r8;
            r1 = r13[r2];
            r1 = r1 + r7;
            r2 = r13[r4];
            r8 = r8 + r2;
            r2 = r13[r6];
            goto L_0x014c;
        L_0x00e3:
            r0 = r9 + 0;
            r1 = r13[r0];
            r8 = r8 + r1;
            r1 = r9 + 1;
            r4 = r13[r1];
            r7 = r7 + r4;
            if (r9 <= 0) goto L_0x00f8;
        L_0x00ef:
            r0 = r13[r0];
            r1 = r13[r1];
            r10.rLineTo(r0, r1);
            goto L_0x0056;
        L_0x00f8:
            r0 = r13[r0];
            r1 = r13[r1];
            r10.rMoveTo(r0, r1);
            r22 = r7;
            r21 = r8;
            goto L_0x0056;
        L_0x0105:
            r0 = r9 + 0;
            r1 = r13[r0];
            r4 = r9 + 1;
            r5 = r13[r4];
            r10.rLineTo(r1, r5);
            r0 = r13[r0];
            r8 = r8 + r0;
            r0 = r13[r4];
        L_0x0115:
            r7 = r7 + r0;
            goto L_0x0056;
        L_0x0118:
            r0 = r9 + 0;
            r1 = r13[r0];
            r10.rLineTo(r1, r4);
            r0 = r13[r0];
            r8 = r8 + r0;
            goto L_0x0056;
        L_0x0124:
            r0 = r9 + 0;
            r1 = r13[r0];
            r0 = r9 + 1;
            r2 = r13[r0];
            r14 = r9 + 2;
            r3 = r13[r14];
            r15 = r9 + 3;
            r4 = r13[r15];
            r23 = r9 + 4;
            r5 = r13[r23];
            r24 = r9 + 5;
            r6 = r13[r24];
            r0 = r27;
            r0.rCubicTo(r1, r2, r3, r4, r5, r6);
            r0 = r13[r14];
            r0 = r0 + r8;
            r1 = r13[r15];
            r1 = r1 + r7;
            r2 = r13[r23];
            r8 = r8 + r2;
            r2 = r13[r24];
        L_0x014c:
            r7 = r7 + r2;
            r2 = r0;
            r3 = r1;
            goto L_0x0056;
        L_0x0151:
            r14 = r9 + 5;
            r0 = r13[r14];
            r3 = r0 + r8;
            r15 = r9 + 6;
            r0 = r13[r15];
            r5 = r0 + r7;
            r0 = r9 + 0;
            r6 = r13[r0];
            r0 = r9 + 1;
            r23 = r13[r0];
            r0 = r9 + 2;
            r24 = r13[r0];
            r0 = r9 + 3;
            r0 = r13[r0];
            r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
            if (r0 == 0) goto L_0x0174;
        L_0x0171:
            r25 = 1;
            goto L_0x0176;
        L_0x0174:
            r25 = 0;
        L_0x0176:
            r0 = r9 + 4;
            r0 = r13[r0];
            r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
            if (r0 == 0) goto L_0x0181;
        L_0x017e:
            r26 = 1;
            goto L_0x0183;
        L_0x0181:
            r26 = 0;
        L_0x0183:
            r0 = r27;
            r1 = r8;
            r2 = r7;
            r4 = r5;
            r5 = r6;
            r6 = r23;
            r12 = r7;
            r7 = r24;
            r11 = r8;
            r8 = r25;
            r25 = r9;
            r9 = r26;
            android.support.v4.p010b.C0162b.C0161b.m582a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9);
            r0 = r13[r14];
            r8 = r11 + r0;
            r0 = r13[r15];
            r7 = r12 + r0;
            goto L_0x02e4;
        L_0x01a2:
            r11 = r8;
            r25 = r9;
            r9 = r25 + 0;
            r0 = r13[r9];
            r10.lineTo(r11, r0);
            r7 = r13[r9];
            goto L_0x02e6;
        L_0x01b0:
            r12 = r7;
            r11 = r8;
            r25 = r9;
            if (r0 == r15) goto L_0x01be;
        L_0x01b6:
            if (r0 == r5) goto L_0x01be;
        L_0x01b8:
            if (r0 == r1) goto L_0x01be;
        L_0x01ba:
            r1 = 84;
            if (r0 != r1) goto L_0x01c6;
        L_0x01be:
            r8 = r11 * r23;
            r8 = r8 - r2;
            r7 = r12 * r23;
            r7 = r7 - r3;
            r12 = r7;
            r11 = r8;
        L_0x01c6:
            r9 = r25 + 0;
            r0 = r13[r9];
            r1 = r25 + 1;
            r2 = r13[r1];
            r10.quadTo(r11, r12, r0, r2);
            r8 = r13[r9];
            r7 = r13[r1];
            r2 = r11;
            r3 = r12;
            goto L_0x02e6;
        L_0x01d9:
            r12 = r7;
            r11 = r8;
            r25 = r9;
            if (r0 == r14) goto L_0x01ed;
        L_0x01df:
            if (r0 == r6) goto L_0x01ed;
        L_0x01e1:
            r1 = 67;
            if (r0 == r1) goto L_0x01ed;
        L_0x01e5:
            r1 = 83;
            if (r0 != r1) goto L_0x01ea;
        L_0x01e9:
            goto L_0x01ed;
        L_0x01ea:
            r1 = r11;
            r2 = r12;
            goto L_0x01f5;
        L_0x01ed:
            r8 = r11 * r23;
            r8 = r8 - r2;
            r7 = r12 * r23;
            r7 = r7 - r3;
            r2 = r7;
            r1 = r8;
        L_0x01f5:
            r9 = r25 + 0;
            r3 = r13[r9];
            r7 = r25 + 1;
            r4 = r13[r7];
            r8 = r25 + 2;
            r5 = r13[r8];
            r11 = r25 + 3;
            r6 = r13[r11];
            r0 = r27;
            r0.cubicTo(r1, r2, r3, r4, r5, r6);
            r0 = r13[r9];
            r1 = r13[r7];
            r8 = r13[r8];
            r7 = r13[r11];
            goto L_0x0230;
        L_0x0213:
            r25 = r9;
            r9 = r25 + 0;
            r0 = r13[r9];
            r1 = r25 + 1;
            r2 = r13[r1];
            r3 = r25 + 2;
            r4 = r13[r3];
            r5 = r25 + 3;
            r6 = r13[r5];
            r10.quadTo(r0, r2, r4, r6);
            r0 = r13[r9];
            r1 = r13[r1];
            r8 = r13[r3];
            r7 = r13[r5];
        L_0x0230:
            r2 = r0;
            r3 = r1;
            goto L_0x02e6;
        L_0x0234:
            r25 = r9;
            r9 = r25 + 0;
            r8 = r13[r9];
            r0 = r25 + 1;
            r7 = r13[r0];
            if (r25 <= 0) goto L_0x0249;
        L_0x0240:
            r1 = r13[r9];
            r0 = r13[r0];
            r10.lineTo(r1, r0);
            goto L_0x02e6;
        L_0x0249:
            r1 = r13[r9];
            r0 = r13[r0];
            r10.moveTo(r1, r0);
            r22 = r7;
            r21 = r8;
            goto L_0x02e6;
        L_0x0256:
            r25 = r9;
            r9 = r25 + 0;
            r0 = r13[r9];
            r1 = r25 + 1;
            r4 = r13[r1];
            r10.lineTo(r0, r4);
            r8 = r13[r9];
            r7 = r13[r1];
            goto L_0x02e6;
        L_0x0269:
            r12 = r7;
            r25 = r9;
            r9 = r25 + 0;
            r0 = r13[r9];
            r10.lineTo(r0, r12);
            r8 = r13[r9];
            goto L_0x02e6;
        L_0x0277:
            r25 = r9;
            r9 = r25 + 0;
            r1 = r13[r9];
            r9 = r25 + 1;
            r2 = r13[r9];
            r9 = r25 + 2;
            r3 = r13[r9];
            r7 = r25 + 3;
            r4 = r13[r7];
            r8 = r25 + 4;
            r5 = r13[r8];
            r11 = r25 + 5;
            r6 = r13[r11];
            r0 = r27;
            r0.cubicTo(r1, r2, r3, r4, r5, r6);
            r8 = r13[r8];
            r0 = r13[r11];
            r1 = r13[r9];
            r2 = r13[r7];
            r7 = r0;
            r3 = r2;
            r2 = r1;
            goto L_0x02e6;
        L_0x02a2:
            r12 = r7;
            r11 = r8;
            r25 = r9;
            r14 = r25 + 5;
            r3 = r13[r14];
            r15 = r25 + 6;
            r5 = r13[r15];
            r9 = r25 + 0;
            r6 = r13[r9];
            r9 = r25 + 1;
            r7 = r13[r9];
            r9 = r25 + 2;
            r8 = r13[r9];
            r9 = r25 + 3;
            r0 = r13[r9];
            r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
            if (r0 == 0) goto L_0x02c4;
        L_0x02c2:
            r9 = 1;
            goto L_0x02c5;
        L_0x02c4:
            r9 = 0;
        L_0x02c5:
            r0 = r25 + 4;
            r0 = r13[r0];
            r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
            if (r0 == 0) goto L_0x02d0;
        L_0x02cd:
            r23 = 1;
            goto L_0x02d2;
        L_0x02d0:
            r23 = 0;
        L_0x02d2:
            r0 = r27;
            r1 = r11;
            r2 = r12;
            r4 = r5;
            r5 = r6;
            r6 = r7;
            r7 = r8;
            r8 = r9;
            r9 = r23;
            android.support.v4.p010b.C0162b.C0161b.m582a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9);
            r8 = r13[r14];
            r7 = r13[r15];
        L_0x02e4:
            r3 = r7;
            r2 = r8;
        L_0x02e6:
            r9 = r25 + r20;
            r0 = r30;
            r14 = 0;
            r15 = 1;
            goto L_0x0041;
        L_0x02ee:
            r12 = r7;
            r1 = 0;
            r28[r1] = r8;
            r1 = 1;
            r28[r1] = r12;
            r28[r16] = r2;
            r28[r17] = r3;
            r28[r18] = r21;
            r28[r19] = r22;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.b.b.b.a(android.graphics.Path, float[], char, char, float[]):void");
        }

        /* renamed from: a */
        public static void m584a(C0161b[] c0161bArr, Path path) {
            float[] fArr = new float[6];
            char c = 'm';
            for (int i = 0; i < c0161bArr.length; i++) {
                C0161b.m583a(path, fArr, c, c0161bArr[i].f641a, c0161bArr[i].f642b);
                c = c0161bArr[i].f641a;
            }
        }

        /* renamed from: a */
        public void m585a(C0161b c0161b, C0161b c0161b2, float f) {
            for (int i = 0; i < c0161b.f642b.length; i++) {
                this.f642b[i] = (c0161b.f642b[i] * (1.0f - f)) + (c0161b2.f642b[i] * f);
            }
        }
    }

    /* renamed from: a */
    private static int m586a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 65) * (charAt - 90) <= 0 || (charAt - 97) * (charAt - 122) <= 0) && charAt != 'e' && charAt != 'E') {
                return i;
            }
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public static Path m587a(String str) {
        Path path = new Path();
        C0161b[] b = C0162b.m594b(str);
        if (b == null) {
            return null;
        }
        try {
            C0161b.m584a(b, path);
            return path;
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error in parsing ");
            stringBuilder.append(str);
            throw new RuntimeException(stringBuilder.toString(), e);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static void m588a(java.lang.String r8, int r9, android.support.v4.p010b.C0162b.C0160a r10) {
        /*
        r0 = 0;
        r10.f640b = r0;
        r1 = r9;
        r2 = 0;
        r3 = 0;
        r4 = 0;
    L_0x0007:
        r5 = r8.length();
        if (r1 >= r5) goto L_0x003b;
    L_0x000d:
        r5 = r8.charAt(r1);
        r6 = 32;
        r7 = 1;
        if (r5 == r6) goto L_0x0033;
    L_0x0016:
        r6 = 69;
        if (r5 == r6) goto L_0x0031;
    L_0x001a:
        r6 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        if (r5 == r6) goto L_0x0031;
    L_0x001e:
        switch(r5) {
            case 44: goto L_0x0033;
            case 45: goto L_0x002a;
            case 46: goto L_0x0022;
            default: goto L_0x0021;
        };
    L_0x0021:
        goto L_0x002f;
    L_0x0022:
        if (r3 != 0) goto L_0x0027;
    L_0x0024:
        r2 = 0;
        r3 = 1;
        goto L_0x0035;
    L_0x0027:
        r10.f640b = r7;
        goto L_0x0033;
    L_0x002a:
        if (r1 == r9) goto L_0x002f;
    L_0x002c:
        if (r2 != 0) goto L_0x002f;
    L_0x002e:
        goto L_0x0027;
    L_0x002f:
        r2 = 0;
        goto L_0x0035;
    L_0x0031:
        r2 = 1;
        goto L_0x0035;
    L_0x0033:
        r2 = 0;
        r4 = 1;
    L_0x0035:
        if (r4 == 0) goto L_0x0038;
    L_0x0037:
        goto L_0x003b;
    L_0x0038:
        r1 = r1 + 1;
        goto L_0x0007;
    L_0x003b:
        r10.f639a = r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.b.b.a(java.lang.String, int, android.support.v4.b.b$a):void");
    }

    /* renamed from: a */
    private static void m589a(ArrayList<C0161b> arrayList, char c, float[] fArr) {
        arrayList.add(new C0161b(c, fArr));
    }

    /* renamed from: a */
    public static boolean m590a(C0161b[] c0161bArr, C0161b[] c0161bArr2) {
        if (c0161bArr != null) {
            if (c0161bArr2 != null) {
                if (c0161bArr.length != c0161bArr2.length) {
                    return false;
                }
                int i = 0;
                while (i < c0161bArr.length) {
                    if (c0161bArr[i].f641a == c0161bArr2[i].f641a) {
                        if (c0161bArr[i].f642b.length == c0161bArr2[i].f642b.length) {
                            i++;
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static float[] m591a(float[] fArr, int i, int i2) {
        if (i <= i2) {
            int length = fArr.length;
            if (i < 0 || i > length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            i2 -= i;
            length = Math.min(i2, length - i);
            Object obj = new float[i2];
            System.arraycopy(fArr, i, obj, 0, length);
            return obj;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public static C0161b[] m592a(C0161b[] c0161bArr) {
        if (c0161bArr == null) {
            return null;
        }
        C0161b[] c0161bArr2 = new C0161b[c0161bArr.length];
        for (int i = 0; i < c0161bArr.length; i++) {
            c0161bArr2[i] = new C0161b(c0161bArr[i]);
        }
        return c0161bArr2;
    }

    /* renamed from: b */
    public static void m593b(C0161b[] c0161bArr, C0161b[] c0161bArr2) {
        for (int i = 0; i < c0161bArr2.length; i++) {
            c0161bArr[i].f641a = c0161bArr2[i].f641a;
            for (int i2 = 0; i2 < c0161bArr2[i].f642b.length; i2++) {
                c0161bArr[i].f642b[i2] = c0161bArr2[i].f642b[i2];
            }
        }
    }

    /* renamed from: b */
    public static C0161b[] m594b(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            i = C0162b.m586a(str, i);
            String trim = str.substring(i2, i).trim();
            if (trim.length() > 0) {
                C0162b.m589a(arrayList, trim.charAt(0), C0162b.m595c(trim));
            }
            i2 = i;
            i++;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            C0162b.m589a(arrayList, str.charAt(i2), new float[0]);
        }
        return (C0161b[]) arrayList.toArray(new C0161b[arrayList.size()]);
    }

    /* renamed from: c */
    private static float[] m595c(String str) {
        if (str.charAt(0) != 'z') {
            if (str.charAt(0) != 'Z') {
                try {
                    float[] fArr = new float[str.length()];
                    C0160a c0160a = new C0160a();
                    int length = str.length();
                    int i = 1;
                    int i2 = 0;
                    while (i < length) {
                        C0162b.m588a(str, i, c0160a);
                        int i3 = c0160a.f639a;
                        if (i < i3) {
                            int i4 = i2 + 1;
                            fArr[i2] = Float.parseFloat(str.substring(i, i3));
                            i2 = i4;
                        }
                        i = c0160a.f640b ? i3 : i3 + 1;
                    }
                    return C0162b.m591a(fArr, 0, i2);
                } catch (Throwable e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("error in parsing \"");
                    stringBuilder.append(str);
                    stringBuilder.append("\"");
                    throw new RuntimeException(stringBuilder.toString(), e);
                }
            }
        }
        return new float[0];
    }
}
