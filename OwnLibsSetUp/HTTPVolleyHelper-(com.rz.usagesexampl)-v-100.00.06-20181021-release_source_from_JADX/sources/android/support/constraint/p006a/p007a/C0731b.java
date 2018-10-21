package android.support.constraint.p006a.p007a;

import java.util.ArrayList;

/* renamed from: android.support.constraint.a.a.b */
public class C0731b extends C0514j {
    private int ak = 0;
    private ArrayList<C0515m> al = new ArrayList(4);
    private boolean am = true;

    /* renamed from: a */
    public void mo15a(int i) {
        this.ak = i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void mo16a(android.support.constraint.p006a.C0072e r11) {
        /*
        r10 = this;
        r0 = r10.A;
        r1 = r10.s;
        r2 = 0;
        r0[r2] = r1;
        r0 = r10.A;
        r1 = r10.t;
        r3 = 2;
        r0[r3] = r1;
        r0 = r10.A;
        r1 = r10.u;
        r4 = 1;
        r0[r4] = r1;
        r0 = r10.A;
        r1 = r10.v;
        r5 = 3;
        r0[r5] = r1;
        r0 = 0;
    L_0x001d:
        r1 = r10.A;
        r1 = r1.length;
        if (r0 >= r1) goto L_0x0033;
    L_0x0022:
        r1 = r10.A;
        r1 = r1[r0];
        r6 = r10.A;
        r6 = r6[r0];
        r6 = r11.m304a(r6);
        r1.f223f = r6;
        r0 = r0 + 1;
        goto L_0x001d;
    L_0x0033:
        r0 = r10.ak;
        if (r0 < 0) goto L_0x014c;
    L_0x0037:
        r0 = r10.ak;
        r1 = 4;
        if (r0 >= r1) goto L_0x014c;
    L_0x003c:
        r0 = r10.A;
        r1 = r10.ak;
        r0 = r0[r1];
        r1 = 0;
    L_0x0043:
        r6 = r10.aj;
        if (r1 >= r6) goto L_0x007c;
    L_0x0047:
        r6 = r10.ai;
        r6 = r6[r1];
        r7 = r10.am;
        if (r7 != 0) goto L_0x0056;
    L_0x004f:
        r7 = r6.mo17a();
        if (r7 != 0) goto L_0x0056;
    L_0x0055:
        goto L_0x0079;
    L_0x0056:
        r7 = r10.ak;
        if (r7 == 0) goto L_0x005e;
    L_0x005a:
        r7 = r10.ak;
        if (r7 != r4) goto L_0x0068;
    L_0x005e:
        r7 = r6.m172F();
        r8 = android.support.constraint.p006a.p007a.C0061f.C0060a.MATCH_CONSTRAINT;
        if (r7 != r8) goto L_0x0068;
    L_0x0066:
        r1 = 1;
        goto L_0x007d;
    L_0x0068:
        r7 = r10.ak;
        if (r7 == r3) goto L_0x0070;
    L_0x006c:
        r7 = r10.ak;
        if (r7 != r5) goto L_0x0079;
    L_0x0070:
        r6 = r6.m173G();
        r7 = android.support.constraint.p006a.p007a.C0061f.C0060a.MATCH_CONSTRAINT;
        if (r6 != r7) goto L_0x0079;
    L_0x0078:
        goto L_0x0066;
    L_0x0079:
        r1 = r1 + 1;
        goto L_0x0043;
    L_0x007c:
        r1 = 0;
    L_0x007d:
        r6 = r10.ak;
        if (r6 == 0) goto L_0x0093;
    L_0x0081:
        r6 = r10.ak;
        if (r6 != r4) goto L_0x0086;
    L_0x0085:
        goto L_0x0093;
    L_0x0086:
        r6 = r10.m224k();
        r6 = r6.m173G();
        r7 = android.support.constraint.p006a.p007a.C0061f.C0060a.WRAP_CONTENT;
        if (r6 != r7) goto L_0x00a0;
    L_0x0092:
        goto L_0x009f;
    L_0x0093:
        r6 = r10.m224k();
        r6 = r6.m172F();
        r7 = android.support.constraint.p006a.p007a.C0061f.C0060a.WRAP_CONTENT;
        if (r6 != r7) goto L_0x00a0;
    L_0x009f:
        r1 = 0;
    L_0x00a0:
        r6 = 0;
    L_0x00a1:
        r7 = r10.aj;
        if (r6 >= r7) goto L_0x00dd;
    L_0x00a5:
        r7 = r10.ai;
        r7 = r7[r6];
        r8 = r10.am;
        if (r8 != 0) goto L_0x00b4;
    L_0x00ad:
        r8 = r7.mo17a();
        if (r8 != 0) goto L_0x00b4;
    L_0x00b3:
        goto L_0x00da;
    L_0x00b4:
        r8 = r7.f236A;
        r9 = r10.ak;
        r8 = r8[r9];
        r8 = r11.m304a(r8);
        r7 = r7.f236A;
        r9 = r10.ak;
        r7 = r7[r9];
        r7.f223f = r8;
        r7 = r10.ak;
        if (r7 == 0) goto L_0x00d5;
    L_0x00ca:
        r7 = r10.ak;
        if (r7 != r3) goto L_0x00cf;
    L_0x00ce:
        goto L_0x00d5;
    L_0x00cf:
        r7 = r0.f223f;
        r11.m313a(r7, r8, r1);
        goto L_0x00da;
    L_0x00d5:
        r7 = r0.f223f;
        r11.m317b(r7, r8, r1);
    L_0x00da:
        r6 = r6 + 1;
        goto L_0x00a1;
    L_0x00dd:
        r0 = r10.ak;
        r6 = 5;
        r7 = 6;
        if (r0 != 0) goto L_0x00fe;
    L_0x00e3:
        r0 = r10.u;
        r0 = r0.f223f;
        r3 = r10.s;
        r3 = r3.f223f;
        r11.m319c(r0, r3, r2, r7);
        if (r1 != 0) goto L_0x014c;
    L_0x00f0:
        r0 = r10.s;
        r0 = r0.f223f;
        r1 = r10.D;
        r1 = r1.f281u;
    L_0x00f8:
        r1 = r1.f223f;
        r11.m319c(r0, r1, r2, r6);
        goto L_0x014c;
    L_0x00fe:
        r0 = r10.ak;
        if (r0 != r4) goto L_0x0118;
    L_0x0102:
        r0 = r10.s;
        r0 = r0.f223f;
        r3 = r10.u;
        r3 = r3.f223f;
        r11.m319c(r0, r3, r2, r7);
        if (r1 != 0) goto L_0x014c;
    L_0x010f:
        r0 = r10.s;
        r0 = r0.f223f;
        r1 = r10.D;
        r1 = r1.f279s;
        goto L_0x00f8;
    L_0x0118:
        r0 = r10.ak;
        if (r0 != r3) goto L_0x0132;
    L_0x011c:
        r0 = r10.v;
        r0 = r0.f223f;
        r3 = r10.t;
        r3 = r3.f223f;
        r11.m319c(r0, r3, r2, r7);
        if (r1 != 0) goto L_0x014c;
    L_0x0129:
        r0 = r10.t;
        r0 = r0.f223f;
        r1 = r10.D;
        r1 = r1.f282v;
        goto L_0x00f8;
    L_0x0132:
        r0 = r10.ak;
        if (r0 != r5) goto L_0x014c;
    L_0x0136:
        r0 = r10.t;
        r0 = r0.f223f;
        r3 = r10.v;
        r3 = r3.f223f;
        r11.m319c(r0, r3, r2, r7);
        if (r1 != 0) goto L_0x014c;
    L_0x0143:
        r0 = r10.t;
        r0 = r0.f223f;
        r1 = r10.D;
        r1 = r1.f280t;
        goto L_0x00f8;
    L_0x014c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.a.a.b.a(android.support.constraint.a.e):void");
    }

    /* renamed from: a */
    public void m3348a(boolean z) {
        this.am = z;
    }

    /* renamed from: a */
    public boolean mo17a() {
        return true;
    }

    /* renamed from: b */
    public void mo442b() {
        super.mo442b();
        this.al.clear();
    }

    /* renamed from: b */
    public void mo18b(int i) {
        if (this.D != null && ((C0732g) this.D).m3374u(2)) {
            C0058e c0058e;
            C0058e c0058e2;
            int i2;
            C0061f c0061f;
            C0058e c0058e3;
            C0515m c0515m;
            switch (this.ak) {
                case 0:
                    c0058e = this.s;
                    break;
                case 1:
                    c0058e = this.u;
                    break;
                case 2:
                    c0058e = this.t;
                    break;
                case 3:
                    c0058e = this.v;
                    break;
                default:
                    return;
            }
            C0066o a = c0058e.m150a();
            a.m2023b(5);
            if (this.ak != 0) {
                if (this.ak != 1) {
                    this.s.m150a().m2018a(null, 0.0f);
                    c0058e2 = this.u;
                    c0058e2.m150a().m2018a(null, 0.0f);
                    this.al.clear();
                    for (i2 = 0; i2 < this.aj; i2++) {
                        c0061f = this.ai[i2];
                        if (!this.am || c0061f.mo17a()) {
                            switch (this.ak) {
                                case 0:
                                    c0058e3 = c0061f.f279s;
                                    break;
                                case 1:
                                    c0058e3 = c0061f.f281u;
                                    break;
                                case 2:
                                    c0058e3 = c0061f.f280t;
                                    break;
                                case 3:
                                    c0058e3 = c0061f.f282v;
                                    break;
                                default:
                                    c0515m = null;
                                    break;
                            }
                            c0515m = c0058e3.m150a();
                            if (c0515m != null) {
                                this.al.add(c0515m);
                                c0515m.m263a(a);
                            }
                        }
                    }
                }
            }
            this.t.m150a().m2018a(null, 0.0f);
            c0058e2 = this.v;
            c0058e2.m150a().m2018a(null, 0.0f);
            this.al.clear();
            for (i2 = 0; i2 < this.aj; i2++) {
                c0061f = this.ai[i2];
                if (this.am) {
                }
                switch (this.ak) {
                    case 0:
                        c0058e3 = c0061f.f279s;
                        break;
                    case 1:
                        c0058e3 = c0061f.f281u;
                        break;
                    case 2:
                        c0058e3 = c0061f.f280t;
                        break;
                    case 3:
                        c0058e3 = c0061f.f282v;
                        break;
                    default:
                        c0515m = null;
                        break;
                }
                c0515m = c0058e3.m150a();
                if (c0515m != null) {
                    this.al.add(c0515m);
                    c0515m.m263a(a);
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: c */
    public void mo443c() {
        /*
        r8 = this;
        r0 = r8.ak;
        r1 = 2139095039; // 0x7f7fffff float:3.4028235E38 double:1.056853372E-314;
        r2 = 0;
        switch(r0) {
            case 0: goto L_0x0018;
            case 1: goto L_0x0010;
            case 2: goto L_0x000d;
            case 3: goto L_0x000a;
            default: goto L_0x0009;
        };
    L_0x0009:
        return;
    L_0x000a:
        r0 = r8.v;
        goto L_0x0012;
    L_0x000d:
        r0 = r8.t;
        goto L_0x001a;
    L_0x0010:
        r0 = r8.u;
    L_0x0012:
        r0 = r0.m150a();
        r1 = 0;
        goto L_0x001e;
    L_0x0018:
        r0 = r8.s;
    L_0x001a:
        r0 = r0.m150a();
    L_0x001e:
        r2 = r8.al;
        r2 = r2.size();
        r3 = 0;
        r4 = 0;
    L_0x0026:
        if (r4 >= r2) goto L_0x0054;
    L_0x0028:
        r5 = r8.al;
        r5 = r5.get(r4);
        r5 = (android.support.constraint.p006a.p007a.C0515m) r5;
        r6 = r5.i;
        r7 = 1;
        if (r6 == r7) goto L_0x0036;
    L_0x0035:
        return;
    L_0x0036:
        r6 = r8.ak;
        if (r6 == 0) goto L_0x0047;
    L_0x003a:
        r6 = r8.ak;
        r7 = 2;
        if (r6 != r7) goto L_0x0040;
    L_0x003f:
        goto L_0x0047;
    L_0x0040:
        r6 = r5.f1801f;
        r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1));
        if (r6 <= 0) goto L_0x0051;
    L_0x0046:
        goto L_0x004d;
    L_0x0047:
        r6 = r5.f1801f;
        r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1));
        if (r6 >= 0) goto L_0x0051;
    L_0x004d:
        r1 = r5.f1801f;
        r3 = r5.f1800e;
    L_0x0051:
        r4 = r4 + 1;
        goto L_0x0026;
    L_0x0054:
        r2 = android.support.constraint.p006a.C0072e.m294a();
        if (r2 == 0) goto L_0x0065;
    L_0x005a:
        r2 = android.support.constraint.p006a.C0072e.m294a();
        r4 = r2.f373z;
        r6 = 1;
        r4 = r4 + r6;
        r2.f373z = r4;
    L_0x0065:
        r0.f1800e = r3;
        r0.f1801f = r1;
        r0.m266f();
        r0 = r8.ak;
        switch(r0) {
            case 0: goto L_0x007b;
            case 1: goto L_0x0078;
            case 2: goto L_0x0075;
            case 3: goto L_0x0072;
            default: goto L_0x0071;
        };
    L_0x0071:
        return;
    L_0x0072:
        r0 = r8.t;
        goto L_0x007d;
    L_0x0075:
        r0 = r8.v;
        goto L_0x007d;
    L_0x0078:
        r0 = r8.s;
        goto L_0x007d;
    L_0x007b:
        r0 = r8.u;
    L_0x007d:
        r0 = r0.m150a();
        r0.m2018a(r3, r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.a.a.b.c():void");
    }
}
