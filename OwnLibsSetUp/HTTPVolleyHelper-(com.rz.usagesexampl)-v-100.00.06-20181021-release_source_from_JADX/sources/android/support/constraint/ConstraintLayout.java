package android.support.constraint;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.support.constraint.C0087g.C0086b;
import android.support.constraint.p006a.C0073f;
import android.support.constraint.p006a.p007a.C0051a;
import android.support.constraint.p006a.p007a.C0058e.C0057c;
import android.support.constraint.p006a.p007a.C0061f;
import android.support.constraint.p006a.p007a.C0061f.C0060a;
import android.support.constraint.p006a.p007a.C0513i;
import android.support.constraint.p006a.p007a.C0515m;
import android.support.constraint.p006a.p007a.C0732g;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintLayout extends ViewGroup {
    /* renamed from: a */
    SparseArray<View> f163a = new SparseArray();
    /* renamed from: b */
    C0732g f164b = new C0732g();
    /* renamed from: c */
    int f165c = -1;
    /* renamed from: d */
    int f166d = -1;
    /* renamed from: e */
    int f167e = 0;
    /* renamed from: f */
    int f168f = 0;
    /* renamed from: g */
    private ArrayList<C0078b> f169g = new ArrayList(4);
    /* renamed from: h */
    private final ArrayList<C0061f> f170h = new ArrayList(100);
    /* renamed from: i */
    private int f171i = 0;
    /* renamed from: j */
    private int f172j = 0;
    /* renamed from: k */
    private int f173k = Integer.MAX_VALUE;
    /* renamed from: l */
    private int f174l = Integer.MAX_VALUE;
    /* renamed from: m */
    private boolean f175m = true;
    /* renamed from: n */
    private int f176n = 7;
    /* renamed from: o */
    private C0081c f177o = null;
    /* renamed from: p */
    private int f178p = -1;
    /* renamed from: q */
    private HashMap<String, Integer> f179q = new HashMap();
    /* renamed from: r */
    private int f180r = -1;
    /* renamed from: s */
    private int f181s = -1;
    /* renamed from: t */
    private C0073f f182t;

    /* renamed from: android.support.constraint.ConstraintLayout$a */
    public static class C0050a extends MarginLayoutParams {
        /* renamed from: A */
        public float f111A = 0.5f;
        /* renamed from: B */
        public String f112B = null;
        /* renamed from: C */
        float f113C = 0.0f;
        /* renamed from: D */
        int f114D = 1;
        /* renamed from: E */
        public float f115E = -1.0f;
        /* renamed from: F */
        public float f116F = -1.0f;
        /* renamed from: G */
        public int f117G = 0;
        /* renamed from: H */
        public int f118H = 0;
        /* renamed from: I */
        public int f119I = 0;
        /* renamed from: J */
        public int f120J = 0;
        /* renamed from: K */
        public int f121K = 0;
        /* renamed from: L */
        public int f122L = 0;
        /* renamed from: M */
        public int f123M = 0;
        /* renamed from: N */
        public int f124N = 0;
        /* renamed from: O */
        public float f125O = 1.0f;
        /* renamed from: P */
        public float f126P = 1.0f;
        /* renamed from: Q */
        public int f127Q = -1;
        /* renamed from: R */
        public int f128R = -1;
        /* renamed from: S */
        public int f129S = -1;
        /* renamed from: T */
        public boolean f130T = false;
        /* renamed from: U */
        public boolean f131U = false;
        /* renamed from: V */
        boolean f132V = true;
        /* renamed from: W */
        boolean f133W = true;
        /* renamed from: X */
        boolean f134X = false;
        /* renamed from: Y */
        boolean f135Y = false;
        /* renamed from: Z */
        boolean f136Z = false;
        /* renamed from: a */
        public int f137a = -1;
        boolean aa = false;
        int ab = -1;
        int ac = -1;
        int ad = -1;
        int ae = -1;
        int af = -1;
        int ag = -1;
        float ah = 0.5f;
        int ai;
        int aj;
        float ak;
        C0061f al = new C0061f();
        public boolean am = false;
        /* renamed from: b */
        public int f138b = -1;
        /* renamed from: c */
        public float f139c = -1.0f;
        /* renamed from: d */
        public int f140d = -1;
        /* renamed from: e */
        public int f141e = -1;
        /* renamed from: f */
        public int f142f = -1;
        /* renamed from: g */
        public int f143g = -1;
        /* renamed from: h */
        public int f144h = -1;
        /* renamed from: i */
        public int f145i = -1;
        /* renamed from: j */
        public int f146j = -1;
        /* renamed from: k */
        public int f147k = -1;
        /* renamed from: l */
        public int f148l = -1;
        /* renamed from: m */
        public int f149m = -1;
        /* renamed from: n */
        public int f150n = 0;
        /* renamed from: o */
        public float f151o = 0.0f;
        /* renamed from: p */
        public int f152p = -1;
        /* renamed from: q */
        public int f153q = -1;
        /* renamed from: r */
        public int f154r = -1;
        /* renamed from: s */
        public int f155s = -1;
        /* renamed from: t */
        public int f156t = -1;
        /* renamed from: u */
        public int f157u = -1;
        /* renamed from: v */
        public int f158v = -1;
        /* renamed from: w */
        public int f159w = -1;
        /* renamed from: x */
        public int f160x = -1;
        /* renamed from: y */
        public int f161y = -1;
        /* renamed from: z */
        public float f162z = 0.5f;

        /* renamed from: android.support.constraint.ConstraintLayout$a$a */
        private static class C0049a {
            /* renamed from: a */
            public static final SparseIntArray f110a = new SparseIntArray();

            static {
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintCircle, 2);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                f110a.append(C0086b.ConstraintLayout_Layout_android_orientation, 1);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                f110a.append(C0086b.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
            }
        }

        public C0050a(int i, int i2) {
            super(i, i2);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0050a(android.content.Context r10, android.util.AttributeSet r11) {
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
            r9 = this;
            r9.<init>(r10, r11);
            r0 = -1;
            r9.f137a = r0;
            r9.f138b = r0;
            r1 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
            r9.f139c = r1;
            r9.f140d = r0;
            r9.f141e = r0;
            r9.f142f = r0;
            r9.f143g = r0;
            r9.f144h = r0;
            r9.f145i = r0;
            r9.f146j = r0;
            r9.f147k = r0;
            r9.f148l = r0;
            r9.f149m = r0;
            r2 = 0;
            r9.f150n = r2;
            r3 = 0;
            r9.f151o = r3;
            r9.f152p = r0;
            r9.f153q = r0;
            r9.f154r = r0;
            r9.f155s = r0;
            r9.f156t = r0;
            r9.f157u = r0;
            r9.f158v = r0;
            r9.f159w = r0;
            r9.f160x = r0;
            r9.f161y = r0;
            r4 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
            r9.f162z = r4;
            r9.f111A = r4;
            r5 = 0;
            r9.f112B = r5;
            r9.f113C = r3;
            r5 = 1;
            r9.f114D = r5;
            r9.f115E = r1;
            r9.f116F = r1;
            r9.f117G = r2;
            r9.f118H = r2;
            r9.f119I = r2;
            r9.f120J = r2;
            r9.f121K = r2;
            r9.f122L = r2;
            r9.f123M = r2;
            r9.f124N = r2;
            r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
            r9.f125O = r1;
            r9.f126P = r1;
            r9.f127Q = r0;
            r9.f128R = r0;
            r9.f129S = r0;
            r9.f130T = r2;
            r9.f131U = r2;
            r9.f132V = r5;
            r9.f133W = r5;
            r9.f134X = r2;
            r9.f135Y = r2;
            r9.f136Z = r2;
            r9.aa = r2;
            r9.ab = r0;
            r9.ac = r0;
            r9.ad = r0;
            r9.ae = r0;
            r9.af = r0;
            r9.ag = r0;
            r9.ah = r4;
            r1 = new android.support.constraint.a.a.f;
            r1.<init>();
            r9.al = r1;
            r9.am = r2;
            r1 = android.support.constraint.C0087g.C0086b.ConstraintLayout_Layout;
            r10 = r10.obtainStyledAttributes(r11, r1);
            r11 = r10.getIndexCount();
            r1 = 0;
        L_0x009a:
            if (r1 >= r11) goto L_0x03df;
        L_0x009c:
            r4 = r10.getIndex(r1);
            r6 = android.support.constraint.ConstraintLayout.C0050a.C0049a.f110a;
            r6 = r6.get(r4);
            r7 = -2;
            switch(r6) {
                case 0: goto L_0x03db;
                case 1: goto L_0x03d3;
                case 2: goto L_0x03c0;
                case 3: goto L_0x03b7;
                case 4: goto L_0x039e;
                case 5: goto L_0x0395;
                case 6: goto L_0x038c;
                case 7: goto L_0x0383;
                case 8: goto L_0x0370;
                case 9: goto L_0x035d;
                case 10: goto L_0x0349;
                case 11: goto L_0x0335;
                case 12: goto L_0x0321;
                case 13: goto L_0x030d;
                case 14: goto L_0x02f9;
                case 15: goto L_0x02e5;
                case 16: goto L_0x02d1;
                case 17: goto L_0x02bd;
                case 18: goto L_0x02a9;
                case 19: goto L_0x0295;
                case 20: goto L_0x0281;
                case 21: goto L_0x0277;
                case 22: goto L_0x026d;
                case 23: goto L_0x0263;
                case 24: goto L_0x0259;
                case 25: goto L_0x024f;
                case 26: goto L_0x0245;
                case 27: goto L_0x023b;
                case 28: goto L_0x0231;
                case 29: goto L_0x0227;
                case 30: goto L_0x021d;
                case 31: goto L_0x020a;
                case 32: goto L_0x01fb;
                case 33: goto L_0x01e4;
                case 34: goto L_0x01cd;
                case 35: goto L_0x01bf;
                case 36: goto L_0x01a8;
                case 37: goto L_0x0191;
                case 38: goto L_0x0183;
                case 39: goto L_0x03db;
                case 40: goto L_0x03db;
                case 41: goto L_0x03db;
                case 42: goto L_0x03db;
                case 43: goto L_0x00aa;
                case 44: goto L_0x00e4;
                case 45: goto L_0x00da;
                case 46: goto L_0x00d0;
                case 47: goto L_0x00c8;
                case 48: goto L_0x00c0;
                case 49: goto L_0x00b6;
                case 50: goto L_0x00ac;
                default: goto L_0x00aa;
            };
        L_0x00aa:
            goto L_0x03db;
        L_0x00ac:
            r6 = r9.f128R;
            r4 = r10.getDimensionPixelOffset(r4, r6);
            r9.f128R = r4;
            goto L_0x03db;
        L_0x00b6:
            r6 = r9.f127Q;
            r4 = r10.getDimensionPixelOffset(r4, r6);
            r9.f127Q = r4;
            goto L_0x03db;
        L_0x00c0:
            r4 = r10.getInt(r4, r2);
            r9.f118H = r4;
            goto L_0x03db;
        L_0x00c8:
            r4 = r10.getInt(r4, r2);
            r9.f117G = r4;
            goto L_0x03db;
        L_0x00d0:
            r6 = r9.f116F;
            r4 = r10.getFloat(r4, r6);
            r9.f116F = r4;
            goto L_0x03db;
        L_0x00da:
            r6 = r9.f115E;
            r4 = r10.getFloat(r4, r6);
            r9.f115E = r4;
            goto L_0x03db;
        L_0x00e4:
            r4 = r10.getString(r4);
            r9.f112B = r4;
            r4 = 2143289344; // 0x7fc00000 float:NaN double:1.058925634E-314;
            r9.f113C = r4;
            r9.f114D = r0;
            r4 = r9.f112B;
            if (r4 == 0) goto L_0x03db;
        L_0x00f4:
            r4 = r9.f112B;
            r4 = r4.length();
            r6 = r9.f112B;
            r7 = 44;
            r6 = r6.indexOf(r7);
            if (r6 <= 0) goto L_0x0126;
        L_0x0104:
            r7 = r4 + -1;
            if (r6 >= r7) goto L_0x0126;
        L_0x0108:
            r7 = r9.f112B;
            r7 = r7.substring(r2, r6);
            r8 = "W";
            r8 = r7.equalsIgnoreCase(r8);
            if (r8 == 0) goto L_0x0119;
        L_0x0116:
            r9.f114D = r2;
            goto L_0x0123;
        L_0x0119:
            r8 = "H";
            r7 = r7.equalsIgnoreCase(r8);
            if (r7 == 0) goto L_0x0123;
        L_0x0121:
            r9.f114D = r5;
        L_0x0123:
            r6 = r6 + 1;
            goto L_0x0127;
        L_0x0126:
            r6 = 0;
        L_0x0127:
            r7 = r9.f112B;
            r8 = 58;
            r7 = r7.indexOf(r8);
            if (r7 < 0) goto L_0x0172;
        L_0x0131:
            r4 = r4 + -1;
            if (r7 >= r4) goto L_0x0172;
        L_0x0135:
            r4 = r9.f112B;
            r4 = r4.substring(r6, r7);
            r6 = r9.f112B;
            r7 = r7 + 1;
            r6 = r6.substring(r7);
            r7 = r4.length();
            if (r7 <= 0) goto L_0x03db;
        L_0x0149:
            r7 = r6.length();
            if (r7 <= 0) goto L_0x03db;
        L_0x014f:
            r4 = java.lang.Float.parseFloat(r4);	 Catch:{ NumberFormatException -> 0x03db }
            r6 = java.lang.Float.parseFloat(r6);	 Catch:{ NumberFormatException -> 0x03db }
            r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1));	 Catch:{ NumberFormatException -> 0x03db }
            if (r7 <= 0) goto L_0x03db;	 Catch:{ NumberFormatException -> 0x03db }
        L_0x015b:
            r7 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1));	 Catch:{ NumberFormatException -> 0x03db }
            if (r7 <= 0) goto L_0x03db;	 Catch:{ NumberFormatException -> 0x03db }
        L_0x015f:
            r7 = r9.f114D;	 Catch:{ NumberFormatException -> 0x03db }
            if (r7 != r5) goto L_0x016c;	 Catch:{ NumberFormatException -> 0x03db }
        L_0x0163:
            r6 = r6 / r4;	 Catch:{ NumberFormatException -> 0x03db }
            r4 = java.lang.Math.abs(r6);	 Catch:{ NumberFormatException -> 0x03db }
        L_0x0168:
            r9.f113C = r4;	 Catch:{ NumberFormatException -> 0x03db }
            goto L_0x03db;	 Catch:{ NumberFormatException -> 0x03db }
        L_0x016c:
            r4 = r4 / r6;	 Catch:{ NumberFormatException -> 0x03db }
            r4 = java.lang.Math.abs(r4);	 Catch:{ NumberFormatException -> 0x03db }
            goto L_0x0168;
        L_0x0172:
            r4 = r9.f112B;
            r4 = r4.substring(r6);
            r6 = r4.length();
            if (r6 <= 0) goto L_0x03db;
        L_0x017e:
            r4 = java.lang.Float.parseFloat(r4);	 Catch:{ NumberFormatException -> 0x03db }
            goto L_0x0168;
        L_0x0183:
            r6 = r9.f126P;
            r4 = r10.getFloat(r4, r6);
            r4 = java.lang.Math.max(r3, r4);
            r9.f126P = r4;
            goto L_0x03db;
        L_0x0191:
            r6 = r9.f124N;	 Catch:{ Exception -> 0x019b }
            r6 = r10.getDimensionPixelSize(r4, r6);	 Catch:{ Exception -> 0x019b }
            r9.f124N = r6;	 Catch:{ Exception -> 0x019b }
            goto L_0x03db;
            r6 = r9.f124N;
            r4 = r10.getInt(r4, r6);
            if (r4 != r7) goto L_0x03db;
        L_0x01a4:
            r9.f124N = r7;
            goto L_0x03db;
        L_0x01a8:
            r6 = r9.f122L;	 Catch:{ Exception -> 0x01b2 }
            r6 = r10.getDimensionPixelSize(r4, r6);	 Catch:{ Exception -> 0x01b2 }
            r9.f122L = r6;	 Catch:{ Exception -> 0x01b2 }
            goto L_0x03db;
            r6 = r9.f122L;
            r4 = r10.getInt(r4, r6);
            if (r4 != r7) goto L_0x03db;
        L_0x01bb:
            r9.f122L = r7;
            goto L_0x03db;
        L_0x01bf:
            r6 = r9.f125O;
            r4 = r10.getFloat(r4, r6);
            r4 = java.lang.Math.max(r3, r4);
            r9.f125O = r4;
            goto L_0x03db;
        L_0x01cd:
            r6 = r9.f123M;	 Catch:{ Exception -> 0x01d7 }
            r6 = r10.getDimensionPixelSize(r4, r6);	 Catch:{ Exception -> 0x01d7 }
            r9.f123M = r6;	 Catch:{ Exception -> 0x01d7 }
            goto L_0x03db;
            r6 = r9.f123M;
            r4 = r10.getInt(r4, r6);
            if (r4 != r7) goto L_0x03db;
        L_0x01e0:
            r9.f123M = r7;
            goto L_0x03db;
        L_0x01e4:
            r6 = r9.f121K;	 Catch:{ Exception -> 0x01ee }
            r6 = r10.getDimensionPixelSize(r4, r6);	 Catch:{ Exception -> 0x01ee }
            r9.f121K = r6;	 Catch:{ Exception -> 0x01ee }
            goto L_0x03db;
            r6 = r9.f121K;
            r4 = r10.getInt(r4, r6);
            if (r4 != r7) goto L_0x03db;
        L_0x01f7:
            r9.f121K = r7;
            goto L_0x03db;
        L_0x01fb:
            r4 = r10.getInt(r4, r2);
            r9.f120J = r4;
            r4 = r9.f120J;
            if (r4 != r5) goto L_0x03db;
        L_0x0205:
            r4 = "ConstraintLayout";
            r6 = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
            goto L_0x0218;
        L_0x020a:
            r4 = r10.getInt(r4, r2);
            r9.f119I = r4;
            r4 = r9.f119I;
            if (r4 != r5) goto L_0x03db;
        L_0x0214:
            r4 = "ConstraintLayout";
            r6 = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
        L_0x0218:
            android.util.Log.e(r4, r6);
            goto L_0x03db;
        L_0x021d:
            r6 = r9.f111A;
            r4 = r10.getFloat(r4, r6);
            r9.f111A = r4;
            goto L_0x03db;
        L_0x0227:
            r6 = r9.f162z;
            r4 = r10.getFloat(r4, r6);
            r9.f162z = r4;
            goto L_0x03db;
        L_0x0231:
            r6 = r9.f131U;
            r4 = r10.getBoolean(r4, r6);
            r9.f131U = r4;
            goto L_0x03db;
        L_0x023b:
            r6 = r9.f130T;
            r4 = r10.getBoolean(r4, r6);
            r9.f130T = r4;
            goto L_0x03db;
        L_0x0245:
            r6 = r9.f161y;
            r4 = r10.getDimensionPixelSize(r4, r6);
            r9.f161y = r4;
            goto L_0x03db;
        L_0x024f:
            r6 = r9.f160x;
            r4 = r10.getDimensionPixelSize(r4, r6);
            r9.f160x = r4;
            goto L_0x03db;
        L_0x0259:
            r6 = r9.f159w;
            r4 = r10.getDimensionPixelSize(r4, r6);
            r9.f159w = r4;
            goto L_0x03db;
        L_0x0263:
            r6 = r9.f158v;
            r4 = r10.getDimensionPixelSize(r4, r6);
            r9.f158v = r4;
            goto L_0x03db;
        L_0x026d:
            r6 = r9.f157u;
            r4 = r10.getDimensionPixelSize(r4, r6);
            r9.f157u = r4;
            goto L_0x03db;
        L_0x0277:
            r6 = r9.f156t;
            r4 = r10.getDimensionPixelSize(r4, r6);
            r9.f156t = r4;
            goto L_0x03db;
        L_0x0281:
            r6 = r9.f155s;
            r6 = r10.getResourceId(r4, r6);
            r9.f155s = r6;
            r6 = r9.f155s;
            if (r6 != r0) goto L_0x03db;
        L_0x028d:
            r4 = r10.getInt(r4, r0);
            r9.f155s = r4;
            goto L_0x03db;
        L_0x0295:
            r6 = r9.f154r;
            r6 = r10.getResourceId(r4, r6);
            r9.f154r = r6;
            r6 = r9.f154r;
            if (r6 != r0) goto L_0x03db;
        L_0x02a1:
            r4 = r10.getInt(r4, r0);
            r9.f154r = r4;
            goto L_0x03db;
        L_0x02a9:
            r6 = r9.f153q;
            r6 = r10.getResourceId(r4, r6);
            r9.f153q = r6;
            r6 = r9.f153q;
            if (r6 != r0) goto L_0x03db;
        L_0x02b5:
            r4 = r10.getInt(r4, r0);
            r9.f153q = r4;
            goto L_0x03db;
        L_0x02bd:
            r6 = r9.f152p;
            r6 = r10.getResourceId(r4, r6);
            r9.f152p = r6;
            r6 = r9.f152p;
            if (r6 != r0) goto L_0x03db;
        L_0x02c9:
            r4 = r10.getInt(r4, r0);
            r9.f152p = r4;
            goto L_0x03db;
        L_0x02d1:
            r6 = r9.f148l;
            r6 = r10.getResourceId(r4, r6);
            r9.f148l = r6;
            r6 = r9.f148l;
            if (r6 != r0) goto L_0x03db;
        L_0x02dd:
            r4 = r10.getInt(r4, r0);
            r9.f148l = r4;
            goto L_0x03db;
        L_0x02e5:
            r6 = r9.f147k;
            r6 = r10.getResourceId(r4, r6);
            r9.f147k = r6;
            r6 = r9.f147k;
            if (r6 != r0) goto L_0x03db;
        L_0x02f1:
            r4 = r10.getInt(r4, r0);
            r9.f147k = r4;
            goto L_0x03db;
        L_0x02f9:
            r6 = r9.f146j;
            r6 = r10.getResourceId(r4, r6);
            r9.f146j = r6;
            r6 = r9.f146j;
            if (r6 != r0) goto L_0x03db;
        L_0x0305:
            r4 = r10.getInt(r4, r0);
            r9.f146j = r4;
            goto L_0x03db;
        L_0x030d:
            r6 = r9.f145i;
            r6 = r10.getResourceId(r4, r6);
            r9.f145i = r6;
            r6 = r9.f145i;
            if (r6 != r0) goto L_0x03db;
        L_0x0319:
            r4 = r10.getInt(r4, r0);
            r9.f145i = r4;
            goto L_0x03db;
        L_0x0321:
            r6 = r9.f144h;
            r6 = r10.getResourceId(r4, r6);
            r9.f144h = r6;
            r6 = r9.f144h;
            if (r6 != r0) goto L_0x03db;
        L_0x032d:
            r4 = r10.getInt(r4, r0);
            r9.f144h = r4;
            goto L_0x03db;
        L_0x0335:
            r6 = r9.f143g;
            r6 = r10.getResourceId(r4, r6);
            r9.f143g = r6;
            r6 = r9.f143g;
            if (r6 != r0) goto L_0x03db;
        L_0x0341:
            r4 = r10.getInt(r4, r0);
            r9.f143g = r4;
            goto L_0x03db;
        L_0x0349:
            r6 = r9.f142f;
            r6 = r10.getResourceId(r4, r6);
            r9.f142f = r6;
            r6 = r9.f142f;
            if (r6 != r0) goto L_0x03db;
        L_0x0355:
            r4 = r10.getInt(r4, r0);
            r9.f142f = r4;
            goto L_0x03db;
        L_0x035d:
            r6 = r9.f141e;
            r6 = r10.getResourceId(r4, r6);
            r9.f141e = r6;
            r6 = r9.f141e;
            if (r6 != r0) goto L_0x03db;
        L_0x0369:
            r4 = r10.getInt(r4, r0);
            r9.f141e = r4;
            goto L_0x03db;
        L_0x0370:
            r6 = r9.f140d;
            r6 = r10.getResourceId(r4, r6);
            r9.f140d = r6;
            r6 = r9.f140d;
            if (r6 != r0) goto L_0x03db;
        L_0x037c:
            r4 = r10.getInt(r4, r0);
            r9.f140d = r4;
            goto L_0x03db;
        L_0x0383:
            r6 = r9.f139c;
            r4 = r10.getFloat(r4, r6);
            r9.f139c = r4;
            goto L_0x03db;
        L_0x038c:
            r6 = r9.f138b;
            r4 = r10.getDimensionPixelOffset(r4, r6);
            r9.f138b = r4;
            goto L_0x03db;
        L_0x0395:
            r6 = r9.f137a;
            r4 = r10.getDimensionPixelOffset(r4, r6);
            r9.f137a = r4;
            goto L_0x03db;
        L_0x039e:
            r6 = r9.f151o;
            r4 = r10.getFloat(r4, r6);
            r6 = 1135869952; // 0x43b40000 float:360.0 double:5.611943214E-315;
            r4 = r4 % r6;
            r9.f151o = r4;
            r4 = r9.f151o;
            r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1));
            if (r4 >= 0) goto L_0x03db;
        L_0x03af:
            r4 = r9.f151o;
            r4 = r6 - r4;
            r4 = r4 % r6;
            r9.f151o = r4;
            goto L_0x03db;
        L_0x03b7:
            r6 = r9.f150n;
            r4 = r10.getDimensionPixelSize(r4, r6);
            r9.f150n = r4;
            goto L_0x03db;
        L_0x03c0:
            r6 = r9.f149m;
            r6 = r10.getResourceId(r4, r6);
            r9.f149m = r6;
            r6 = r9.f149m;
            if (r6 != r0) goto L_0x03db;
        L_0x03cc:
            r4 = r10.getInt(r4, r0);
            r9.f149m = r4;
            goto L_0x03db;
        L_0x03d3:
            r6 = r9.f129S;
            r4 = r10.getInt(r4, r6);
            r9.f129S = r4;
        L_0x03db:
            r1 = r1 + 1;
            goto L_0x009a;
        L_0x03df:
            r10.recycle();
            r9.m117a();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.a.<init>(android.content.Context, android.util.AttributeSet):void");
        }

        public C0050a(LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public void m117a() {
            this.f135Y = false;
            this.f132V = true;
            this.f133W = true;
            if (this.width == -2 && this.f130T) {
                this.f132V = false;
                this.f119I = 1;
            }
            if (this.height == -2 && this.f131U) {
                this.f133W = false;
                this.f120J = 1;
            }
            if (this.width == 0 || this.width == -1) {
                this.f132V = false;
                if (this.width == 0 && this.f119I == 1) {
                    this.width = -2;
                    this.f130T = true;
                }
            }
            if (this.height == 0 || this.height == -1) {
                this.f133W = false;
                if (this.height == 0 && this.f120J == 1) {
                    this.height = -2;
                    this.f131U = true;
                }
            }
            if (this.f139c != -1.0f || this.f137a != -1 || this.f138b != -1) {
                this.f135Y = true;
                this.f132V = true;
                this.f133W = true;
                if (!(this.al instanceof C0513i)) {
                    this.al = new C0513i();
                }
                ((C0513i) this.al).mo15a(this.f129S);
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        @android.annotation.TargetApi(17)
        public void resolveLayoutDirection(int r6) {
            /*
            r5 = this;
            r0 = r5.leftMargin;
            r1 = r5.rightMargin;
            super.resolveLayoutDirection(r6);
            r6 = -1;
            r5.ad = r6;
            r5.ae = r6;
            r5.ab = r6;
            r5.ac = r6;
            r5.af = r6;
            r5.ag = r6;
            r2 = r5.f156t;
            r5.af = r2;
            r2 = r5.f158v;
            r5.ag = r2;
            r2 = r5.f162z;
            r5.ah = r2;
            r2 = r5.f137a;
            r5.ai = r2;
            r2 = r5.f138b;
            r5.aj = r2;
            r2 = r5.f139c;
            r5.ak = r2;
            r2 = r5.getLayoutDirection();
            r3 = 0;
            r4 = 1;
            if (r4 != r2) goto L_0x0036;
        L_0x0034:
            r2 = 1;
            goto L_0x0037;
        L_0x0036:
            r2 = 0;
        L_0x0037:
            if (r2 == 0) goto L_0x00aa;
        L_0x0039:
            r2 = r5.f152p;
            if (r2 == r6) goto L_0x0043;
        L_0x003d:
            r2 = r5.f152p;
            r5.ad = r2;
        L_0x0041:
            r3 = 1;
            goto L_0x004c;
        L_0x0043:
            r2 = r5.f153q;
            if (r2 == r6) goto L_0x004c;
        L_0x0047:
            r2 = r5.f153q;
            r5.ae = r2;
            goto L_0x0041;
        L_0x004c:
            r2 = r5.f154r;
            if (r2 == r6) goto L_0x0055;
        L_0x0050:
            r2 = r5.f154r;
            r5.ac = r2;
            r3 = 1;
        L_0x0055:
            r2 = r5.f155s;
            if (r2 == r6) goto L_0x005e;
        L_0x0059:
            r2 = r5.f155s;
            r5.ab = r2;
            r3 = 1;
        L_0x005e:
            r2 = r5.f160x;
            if (r2 == r6) goto L_0x0066;
        L_0x0062:
            r2 = r5.f160x;
            r5.ag = r2;
        L_0x0066:
            r2 = r5.f161y;
            if (r2 == r6) goto L_0x006e;
        L_0x006a:
            r2 = r5.f161y;
            r5.af = r2;
        L_0x006e:
            r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
            if (r3 == 0) goto L_0x0078;
        L_0x0072:
            r3 = r5.f162z;
            r3 = r2 - r3;
            r5.ah = r3;
        L_0x0078:
            r3 = r5.f135Y;
            if (r3 == 0) goto L_0x00da;
        L_0x007c:
            r3 = r5.f129S;
            if (r3 != r4) goto L_0x00da;
        L_0x0080:
            r3 = r5.f139c;
            r4 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
            r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
            if (r3 == 0) goto L_0x0092;
        L_0x0088:
            r3 = r5.f139c;
            r2 = r2 - r3;
            r5.ak = r2;
            r5.ai = r6;
            r5.aj = r6;
            goto L_0x00da;
        L_0x0092:
            r2 = r5.f137a;
            if (r2 == r6) goto L_0x009f;
        L_0x0096:
            r2 = r5.f137a;
            r5.aj = r2;
            r5.ai = r6;
        L_0x009c:
            r5.ak = r4;
            goto L_0x00da;
        L_0x009f:
            r2 = r5.f138b;
            if (r2 == r6) goto L_0x00da;
        L_0x00a3:
            r2 = r5.f138b;
            r5.ai = r2;
            r5.aj = r6;
            goto L_0x009c;
        L_0x00aa:
            r2 = r5.f152p;
            if (r2 == r6) goto L_0x00b2;
        L_0x00ae:
            r2 = r5.f152p;
            r5.ac = r2;
        L_0x00b2:
            r2 = r5.f153q;
            if (r2 == r6) goto L_0x00ba;
        L_0x00b6:
            r2 = r5.f153q;
            r5.ab = r2;
        L_0x00ba:
            r2 = r5.f154r;
            if (r2 == r6) goto L_0x00c2;
        L_0x00be:
            r2 = r5.f154r;
            r5.ad = r2;
        L_0x00c2:
            r2 = r5.f155s;
            if (r2 == r6) goto L_0x00ca;
        L_0x00c6:
            r2 = r5.f155s;
            r5.ae = r2;
        L_0x00ca:
            r2 = r5.f160x;
            if (r2 == r6) goto L_0x00d2;
        L_0x00ce:
            r2 = r5.f160x;
            r5.af = r2;
        L_0x00d2:
            r2 = r5.f161y;
            if (r2 == r6) goto L_0x00da;
        L_0x00d6:
            r2 = r5.f161y;
            r5.ag = r2;
        L_0x00da:
            r2 = r5.f154r;
            if (r2 != r6) goto L_0x012a;
        L_0x00de:
            r2 = r5.f155s;
            if (r2 != r6) goto L_0x012a;
        L_0x00e2:
            r2 = r5.f153q;
            if (r2 != r6) goto L_0x012a;
        L_0x00e6:
            r2 = r5.f152p;
            if (r2 != r6) goto L_0x012a;
        L_0x00ea:
            r2 = r5.f142f;
            if (r2 == r6) goto L_0x00fb;
        L_0x00ee:
            r2 = r5.f142f;
            r5.ad = r2;
            r2 = r5.rightMargin;
            if (r2 > 0) goto L_0x010a;
        L_0x00f6:
            if (r1 <= 0) goto L_0x010a;
        L_0x00f8:
            r5.rightMargin = r1;
            goto L_0x010a;
        L_0x00fb:
            r2 = r5.f143g;
            if (r2 == r6) goto L_0x010a;
        L_0x00ff:
            r2 = r5.f143g;
            r5.ae = r2;
            r2 = r5.rightMargin;
            if (r2 > 0) goto L_0x010a;
        L_0x0107:
            if (r1 <= 0) goto L_0x010a;
        L_0x0109:
            goto L_0x00f8;
        L_0x010a:
            r1 = r5.f140d;
            if (r1 == r6) goto L_0x011b;
        L_0x010e:
            r6 = r5.f140d;
            r5.ab = r6;
            r6 = r5.leftMargin;
            if (r6 > 0) goto L_0x012a;
        L_0x0116:
            if (r0 <= 0) goto L_0x012a;
        L_0x0118:
            r5.leftMargin = r0;
            goto L_0x012a;
        L_0x011b:
            r1 = r5.f141e;
            if (r1 == r6) goto L_0x012a;
        L_0x011f:
            r6 = r5.f141e;
            r5.ac = r6;
            r6 = r5.leftMargin;
            if (r6 > 0) goto L_0x012a;
        L_0x0127:
            if (r0 <= 0) goto L_0x012a;
        L_0x0129:
            goto L_0x0118;
        L_0x012a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.a.resolveLayoutDirection(int):void");
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        m122b(null);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m122b(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m122b(attributeSet);
    }

    /* renamed from: a */
    private void m118a(int i, int i2) {
        ConstraintLayout constraintLayout = this;
        int i3 = i;
        int i4 = i2;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0050a c0050a = (C0050a) childAt.getLayoutParams();
                C0061f c0061f = c0050a.al;
                if (!c0050a.f135Y) {
                    if (!c0050a.f136Z) {
                        Object obj;
                        int childMeasureSpec;
                        Object obj2;
                        int childMeasureSpec2;
                        Object obj3;
                        C0073f c0073f;
                        c0061f.m211e(childAt.getVisibility());
                        int i6 = c0050a.width;
                        int i7 = c0050a.height;
                        if (!(c0050a.f132V || c0050a.f133W || ((!c0050a.f132V && c0050a.f119I == 1) || c0050a.width == -1))) {
                            if (!c0050a.f133W) {
                                if (c0050a.f120J != 1) {
                                    if (c0050a.height == -1) {
                                    }
                                }
                            }
                            obj = null;
                            if (obj == null) {
                                if (i6 == 0) {
                                    childMeasureSpec = getChildMeasureSpec(i3, paddingLeft, -2);
                                    obj2 = 1;
                                } else if (i6 != -1) {
                                    childMeasureSpec = getChildMeasureSpec(i3, paddingLeft, -1);
                                    obj2 = null;
                                } else {
                                    obj2 = i6 != -2 ? 1 : null;
                                    childMeasureSpec = getChildMeasureSpec(i3, paddingLeft, i6);
                                }
                                if (i7 == 0) {
                                    childMeasureSpec2 = getChildMeasureSpec(i4, paddingTop, -2);
                                    obj3 = 1;
                                } else if (i7 != -1) {
                                    childMeasureSpec2 = getChildMeasureSpec(i4, paddingTop, -1);
                                    obj3 = null;
                                } else {
                                    obj3 = i7 != -2 ? 1 : null;
                                    childMeasureSpec2 = getChildMeasureSpec(i4, paddingTop, i7);
                                }
                                childAt.measure(childMeasureSpec, childMeasureSpec2);
                                if (constraintLayout.f182t != null) {
                                    c0073f = constraintLayout.f182t;
                                    c0073f.f348a++;
                                }
                                c0061f.m200b(i6 != -2);
                                c0061f.m206c(i7 != -2);
                                i6 = childAt.getMeasuredWidth();
                                i7 = childAt.getMeasuredHeight();
                            } else {
                                obj2 = null;
                                obj3 = null;
                            }
                            c0061f.m223j(i6);
                            c0061f.m225k(i7);
                            if (obj2 != null) {
                                c0061f.m231n(i6);
                            }
                            if (obj3 != null) {
                                c0061f.m233o(i7);
                            }
                            if (c0050a.f134X) {
                                childMeasureSpec = childAt.getBaseline();
                                if (childMeasureSpec != -1) {
                                    c0061f.m237q(childMeasureSpec);
                                }
                            }
                        }
                        obj = 1;
                        if (obj == null) {
                            obj2 = null;
                            obj3 = null;
                        } else {
                            if (i6 == 0) {
                                childMeasureSpec = getChildMeasureSpec(i3, paddingLeft, -2);
                                obj2 = 1;
                            } else if (i6 != -1) {
                                if (i6 != -2) {
                                }
                                childMeasureSpec = getChildMeasureSpec(i3, paddingLeft, i6);
                            } else {
                                childMeasureSpec = getChildMeasureSpec(i3, paddingLeft, -1);
                                obj2 = null;
                            }
                            if (i7 == 0) {
                                childMeasureSpec2 = getChildMeasureSpec(i4, paddingTop, -2);
                                obj3 = 1;
                            } else if (i7 != -1) {
                                if (i7 != -2) {
                                }
                                childMeasureSpec2 = getChildMeasureSpec(i4, paddingTop, i7);
                            } else {
                                childMeasureSpec2 = getChildMeasureSpec(i4, paddingTop, -1);
                                obj3 = null;
                            }
                            childAt.measure(childMeasureSpec, childMeasureSpec2);
                            if (constraintLayout.f182t != null) {
                                c0073f = constraintLayout.f182t;
                                c0073f.f348a++;
                            }
                            if (i6 != -2) {
                            }
                            c0061f.m200b(i6 != -2);
                            if (i7 != -2) {
                            }
                            c0061f.m206c(i7 != -2);
                            i6 = childAt.getMeasuredWidth();
                            i7 = childAt.getMeasuredHeight();
                        }
                        c0061f.m223j(i6);
                        c0061f.m225k(i7);
                        if (obj2 != null) {
                            c0061f.m231n(i6);
                        }
                        if (obj3 != null) {
                            c0061f.m233o(i7);
                        }
                        if (c0050a.f134X) {
                            childMeasureSpec = childAt.getBaseline();
                            if (childMeasureSpec != -1) {
                                c0061f.m237q(childMeasureSpec);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private final C0061f m119b(int i) {
        if (i == 0) {
            return this.f164b;
        }
        View view = (View) this.f163a.get(i);
        if (view == null) {
            view = findViewById(i);
            if (!(view == null || view == this || view.getParent() != this)) {
                onViewAdded(view);
            }
        }
        if (view == this) {
            return this.f164b;
        }
        return view == null ? null : ((C0050a) view.getLayoutParams()).al;
    }

    /* renamed from: b */
    private void m120b() {
        int childCount = getChildCount();
        Object obj = null;
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).isLayoutRequested()) {
                obj = 1;
                break;
            }
        }
        if (obj != null) {
            this.f170h.clear();
            m123c();
        }
    }

    /* renamed from: b */
    private void m121b(int i, int i2) {
        int i3;
        ConstraintLayout constraintLayout = this;
        int i4 = i;
        int i5 = i2;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            long j = 1;
            int i7 = 8;
            if (i6 >= childCount) {
                break;
            }
            int i8;
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0050a c0050a = (C0050a) childAt.getLayoutParams();
                C0061f c0061f = c0050a.al;
                if (!c0050a.f135Y) {
                    if (!c0050a.f136Z) {
                        c0061f.m211e(childAt.getVisibility());
                        int i9 = c0050a.width;
                        i8 = c0050a.height;
                        if (i9 != 0) {
                            if (i8 != 0) {
                                Object obj = i9 == -2 ? 1 : null;
                                int childMeasureSpec = getChildMeasureSpec(i4, paddingLeft, i9);
                                Object obj2 = i8 == -2 ? 1 : null;
                                childAt.measure(childMeasureSpec, getChildMeasureSpec(i5, paddingTop, i8));
                                if (constraintLayout.f182t != null) {
                                    C0073f c0073f = constraintLayout.f182t;
                                    i3 = paddingTop;
                                    c0073f.f348a++;
                                } else {
                                    i3 = paddingTop;
                                }
                                c0061f.m200b(i9 == -2);
                                c0061f.m206c(i8 == -2);
                                i5 = childAt.getMeasuredWidth();
                                paddingTop = childAt.getMeasuredHeight();
                                c0061f.m223j(i5);
                                c0061f.m225k(paddingTop);
                                if (obj != null) {
                                    c0061f.m231n(i5);
                                }
                                if (obj2 != null) {
                                    c0061f.m233o(paddingTop);
                                }
                                if (c0050a.f134X) {
                                    i9 = childAt.getBaseline();
                                    if (i9 != -1) {
                                        c0061f.m237q(i9);
                                    }
                                }
                                if (c0050a.f132V && c0050a.f133W) {
                                    c0061f.m220i().m2028a(i5);
                                    c0061f.m222j().m2028a(paddingTop);
                                }
                                i6++;
                                paddingTop = i3;
                                i5 = i2;
                            }
                        }
                        i3 = paddingTop;
                        c0061f.m220i().m265e();
                        c0061f.m222j().m265e();
                        i6++;
                        paddingTop = i3;
                        i5 = i2;
                    }
                }
            }
            i3 = paddingTop;
            i6++;
            paddingTop = i3;
            i5 = i2;
        }
        i3 = paddingTop;
        constraintLayout.f164b.m3362P();
        i5 = 0;
        while (i5 < childCount) {
            int i10;
            int i11;
            int i12;
            int i13;
            long j2;
            View childAt2 = getChildAt(i5);
            if (childAt2.getVisibility() != i7) {
                C0050a c0050a2 = (C0050a) childAt2.getLayoutParams();
                C0061f c0061f2 = c0050a2.al;
                if (!c0050a2.f135Y) {
                    if (!c0050a2.f136Z) {
                        c0061f2.m211e(childAt2.getVisibility());
                        childMeasureSpec = c0050a2.width;
                        int i14 = c0050a2.height;
                        if (childMeasureSpec == 0 || i14 == 0) {
                            C0515m a = c0061f2.mo14a(C0057c.LEFT).m150a();
                            C0515m a2 = c0061f2.mo14a(C0057c.RIGHT).m150a();
                            Object obj3 = (c0061f2.mo14a(C0057c.LEFT).m160g() == null || c0061f2.mo14a(C0057c.RIGHT).m160g() == null) ? null : 1;
                            C0515m a3 = c0061f2.mo14a(C0057c.TOP).m150a();
                            C0515m a4 = c0061f2.mo14a(C0057c.BOTTOM).m150a();
                            Object obj4 = (c0061f2.mo14a(C0057c.TOP).m160g() == null || c0061f2.mo14a(C0057c.BOTTOM).m160g() == null) ? null : 1;
                            if (childMeasureSpec != 0 || i14 != 0 || obj3 == null || obj4 == null) {
                                Object obj5;
                                int childMeasureSpec2;
                                Object obj6;
                                C0073f c0073f2;
                                i10 = childCount;
                                i11 = i5;
                                Object obj7 = constraintLayout.f164b.m172F() != C0060a.WRAP_CONTENT ? 1 : null;
                                C0050a c0050a3 = c0050a2;
                                Object obj8 = constraintLayout.f164b.m173G() != C0060a.WRAP_CONTENT ? 1 : null;
                                if (obj7 == null) {
                                    c0061f2.m220i().m265e();
                                }
                                if (obj8 == null) {
                                    c0061f2.m222j().m265e();
                                }
                                if (childMeasureSpec == 0) {
                                    if (obj7 != null && c0061f2.m210d() && obj3 != null && a.m267g() && a2.m267g()) {
                                        childMeasureSpec = (int) (a2.m2027d() - a.m2027d());
                                        c0061f2.m220i().m2028a(childMeasureSpec);
                                        i8 = getChildMeasureSpec(i4, paddingLeft, childMeasureSpec);
                                    } else {
                                        i8 = getChildMeasureSpec(i4, paddingLeft, -2);
                                        obj7 = null;
                                        obj5 = 1;
                                        if (i14 != 0) {
                                            i12 = i3;
                                            i13 = i2;
                                            if (i14 == -1) {
                                                childMeasureSpec2 = getChildMeasureSpec(i13, i12, -1);
                                            } else {
                                                obj6 = i14 == -2 ? 1 : null;
                                                childMeasureSpec2 = getChildMeasureSpec(i13, i12, i14);
                                                childAt2.measure(i8, childMeasureSpec2);
                                                if (constraintLayout.f182t != null) {
                                                    j2 = 1;
                                                } else {
                                                    c0073f2 = constraintLayout.f182t;
                                                    j2 = 1;
                                                    c0073f2.f348a++;
                                                }
                                                if (childMeasureSpec == -2) {
                                                }
                                                c0061f2.m200b(childMeasureSpec == -2);
                                                if (i14 == -2) {
                                                }
                                                c0061f2.m206c(i14 == -2);
                                                childMeasureSpec = childAt2.getMeasuredWidth();
                                                i14 = childAt2.getMeasuredHeight();
                                                c0061f2.m223j(childMeasureSpec);
                                                c0061f2.m225k(i14);
                                                if (obj5 != null) {
                                                    c0061f2.m231n(childMeasureSpec);
                                                }
                                                if (obj6 != null) {
                                                    c0061f2.m233o(i14);
                                                }
                                                if (obj7 != null) {
                                                    c0061f2.m220i().m2030c();
                                                } else {
                                                    c0061f2.m220i().m2028a(childMeasureSpec);
                                                }
                                                if (obj8 != null) {
                                                    c0061f2.m222j().m2030c();
                                                } else {
                                                    c0061f2.m222j().m2028a(i14);
                                                }
                                                if (c0050a3.f134X) {
                                                    i5 = childAt2.getBaseline();
                                                    if (i5 != -1) {
                                                        c0061f2.m237q(i5);
                                                    }
                                                }
                                                i5 = i11 + 1;
                                                i3 = i12;
                                                j = j2;
                                                childCount = i10;
                                                i7 = 8;
                                            }
                                        } else if (obj8 == null && c0061f2.m213e() && obj4 != null && a3.m267g() && a4.m267g()) {
                                            i14 = (int) (a4.m2027d() - a3.m2027d());
                                            c0061f2.m222j().m2028a(i14);
                                            i12 = i3;
                                            childMeasureSpec2 = getChildMeasureSpec(i2, i12, i14);
                                        } else {
                                            i12 = i3;
                                            childMeasureSpec2 = getChildMeasureSpec(i2, i12, -2);
                                            obj8 = null;
                                            obj6 = 1;
                                            childAt2.measure(i8, childMeasureSpec2);
                                            if (constraintLayout.f182t != null) {
                                                c0073f2 = constraintLayout.f182t;
                                                j2 = 1;
                                                c0073f2.f348a++;
                                            } else {
                                                j2 = 1;
                                            }
                                            c0061f2.m200b(childMeasureSpec == -2);
                                            c0061f2.m206c(i14 == -2);
                                            childMeasureSpec = childAt2.getMeasuredWidth();
                                            i14 = childAt2.getMeasuredHeight();
                                            c0061f2.m223j(childMeasureSpec);
                                            c0061f2.m225k(i14);
                                            if (obj5 != null) {
                                                c0061f2.m231n(childMeasureSpec);
                                            }
                                            if (obj6 != null) {
                                                c0061f2.m233o(i14);
                                            }
                                            if (obj7 != null) {
                                                c0061f2.m220i().m2028a(childMeasureSpec);
                                            } else {
                                                c0061f2.m220i().m2030c();
                                            }
                                            if (obj8 != null) {
                                                c0061f2.m222j().m2028a(i14);
                                            } else {
                                                c0061f2.m222j().m2030c();
                                            }
                                            if (c0050a3.f134X) {
                                                i5 = childAt2.getBaseline();
                                                if (i5 != -1) {
                                                    c0061f2.m237q(i5);
                                                }
                                            }
                                            i5 = i11 + 1;
                                            i3 = i12;
                                            j = j2;
                                            childCount = i10;
                                            i7 = 8;
                                        }
                                        obj6 = null;
                                        childAt2.measure(i8, childMeasureSpec2);
                                        if (constraintLayout.f182t != null) {
                                            c0073f2 = constraintLayout.f182t;
                                            j2 = 1;
                                            c0073f2.f348a++;
                                        } else {
                                            j2 = 1;
                                        }
                                        if (childMeasureSpec == -2) {
                                        }
                                        c0061f2.m200b(childMeasureSpec == -2);
                                        if (i14 == -2) {
                                        }
                                        c0061f2.m206c(i14 == -2);
                                        childMeasureSpec = childAt2.getMeasuredWidth();
                                        i14 = childAt2.getMeasuredHeight();
                                        c0061f2.m223j(childMeasureSpec);
                                        c0061f2.m225k(i14);
                                        if (obj5 != null) {
                                            c0061f2.m231n(childMeasureSpec);
                                        }
                                        if (obj6 != null) {
                                            c0061f2.m233o(i14);
                                        }
                                        if (obj7 != null) {
                                            c0061f2.m220i().m2028a(childMeasureSpec);
                                        } else {
                                            c0061f2.m220i().m2030c();
                                        }
                                        if (obj8 != null) {
                                            c0061f2.m222j().m2028a(i14);
                                        } else {
                                            c0061f2.m222j().m2030c();
                                        }
                                        if (c0050a3.f134X) {
                                            i5 = childAt2.getBaseline();
                                            if (i5 != -1) {
                                                c0061f2.m237q(i5);
                                            }
                                        }
                                        i5 = i11 + 1;
                                        i3 = i12;
                                        j = j2;
                                        childCount = i10;
                                        i7 = 8;
                                    }
                                } else if (childMeasureSpec == -1) {
                                    i8 = getChildMeasureSpec(i4, paddingLeft, -1);
                                } else {
                                    obj5 = childMeasureSpec == -2 ? 1 : null;
                                    i8 = getChildMeasureSpec(i4, paddingLeft, childMeasureSpec);
                                    if (i14 != 0) {
                                        i12 = i3;
                                        i13 = i2;
                                        if (i14 == -1) {
                                            if (i14 == -2) {
                                            }
                                            childMeasureSpec2 = getChildMeasureSpec(i13, i12, i14);
                                            childAt2.measure(i8, childMeasureSpec2);
                                            if (constraintLayout.f182t != null) {
                                                j2 = 1;
                                            } else {
                                                c0073f2 = constraintLayout.f182t;
                                                j2 = 1;
                                                c0073f2.f348a++;
                                            }
                                            if (childMeasureSpec == -2) {
                                            }
                                            c0061f2.m200b(childMeasureSpec == -2);
                                            if (i14 == -2) {
                                            }
                                            c0061f2.m206c(i14 == -2);
                                            childMeasureSpec = childAt2.getMeasuredWidth();
                                            i14 = childAt2.getMeasuredHeight();
                                            c0061f2.m223j(childMeasureSpec);
                                            c0061f2.m225k(i14);
                                            if (obj5 != null) {
                                                c0061f2.m231n(childMeasureSpec);
                                            }
                                            if (obj6 != null) {
                                                c0061f2.m233o(i14);
                                            }
                                            if (obj7 != null) {
                                                c0061f2.m220i().m2030c();
                                            } else {
                                                c0061f2.m220i().m2028a(childMeasureSpec);
                                            }
                                            if (obj8 != null) {
                                                c0061f2.m222j().m2030c();
                                            } else {
                                                c0061f2.m222j().m2028a(i14);
                                            }
                                            if (c0050a3.f134X) {
                                                i5 = childAt2.getBaseline();
                                                if (i5 != -1) {
                                                    c0061f2.m237q(i5);
                                                }
                                            }
                                            i5 = i11 + 1;
                                            i3 = i12;
                                            j = j2;
                                            childCount = i10;
                                            i7 = 8;
                                        } else {
                                            childMeasureSpec2 = getChildMeasureSpec(i13, i12, -1);
                                        }
                                    } else {
                                        if (obj8 == null) {
                                        }
                                        i12 = i3;
                                        childMeasureSpec2 = getChildMeasureSpec(i2, i12, -2);
                                        obj8 = null;
                                        obj6 = 1;
                                        childAt2.measure(i8, childMeasureSpec2);
                                        if (constraintLayout.f182t != null) {
                                            c0073f2 = constraintLayout.f182t;
                                            j2 = 1;
                                            c0073f2.f348a++;
                                        } else {
                                            j2 = 1;
                                        }
                                        if (childMeasureSpec == -2) {
                                        }
                                        c0061f2.m200b(childMeasureSpec == -2);
                                        if (i14 == -2) {
                                        }
                                        c0061f2.m206c(i14 == -2);
                                        childMeasureSpec = childAt2.getMeasuredWidth();
                                        i14 = childAt2.getMeasuredHeight();
                                        c0061f2.m223j(childMeasureSpec);
                                        c0061f2.m225k(i14);
                                        if (obj5 != null) {
                                            c0061f2.m231n(childMeasureSpec);
                                        }
                                        if (obj6 != null) {
                                            c0061f2.m233o(i14);
                                        }
                                        if (obj7 != null) {
                                            c0061f2.m220i().m2028a(childMeasureSpec);
                                        } else {
                                            c0061f2.m220i().m2030c();
                                        }
                                        if (obj8 != null) {
                                            c0061f2.m222j().m2028a(i14);
                                        } else {
                                            c0061f2.m222j().m2030c();
                                        }
                                        if (c0050a3.f134X) {
                                            i5 = childAt2.getBaseline();
                                            if (i5 != -1) {
                                                c0061f2.m237q(i5);
                                            }
                                        }
                                        i5 = i11 + 1;
                                        i3 = i12;
                                        j = j2;
                                        childCount = i10;
                                        i7 = 8;
                                    }
                                    obj6 = null;
                                    childAt2.measure(i8, childMeasureSpec2);
                                    if (constraintLayout.f182t != null) {
                                        j2 = 1;
                                    } else {
                                        c0073f2 = constraintLayout.f182t;
                                        j2 = 1;
                                        c0073f2.f348a++;
                                    }
                                    if (childMeasureSpec == -2) {
                                    }
                                    c0061f2.m200b(childMeasureSpec == -2);
                                    if (i14 == -2) {
                                    }
                                    c0061f2.m206c(i14 == -2);
                                    childMeasureSpec = childAt2.getMeasuredWidth();
                                    i14 = childAt2.getMeasuredHeight();
                                    c0061f2.m223j(childMeasureSpec);
                                    c0061f2.m225k(i14);
                                    if (obj5 != null) {
                                        c0061f2.m231n(childMeasureSpec);
                                    }
                                    if (obj6 != null) {
                                        c0061f2.m233o(i14);
                                    }
                                    if (obj7 != null) {
                                        c0061f2.m220i().m2030c();
                                    } else {
                                        c0061f2.m220i().m2028a(childMeasureSpec);
                                    }
                                    if (obj8 != null) {
                                        c0061f2.m222j().m2030c();
                                    } else {
                                        c0061f2.m222j().m2028a(i14);
                                    }
                                    if (c0050a3.f134X) {
                                        i5 = childAt2.getBaseline();
                                        if (i5 != -1) {
                                            c0061f2.m237q(i5);
                                        }
                                    }
                                    i5 = i11 + 1;
                                    i3 = i12;
                                    j = j2;
                                    childCount = i10;
                                    i7 = 8;
                                }
                                obj5 = null;
                                if (i14 != 0) {
                                    if (obj8 == null) {
                                    }
                                    i12 = i3;
                                    childMeasureSpec2 = getChildMeasureSpec(i2, i12, -2);
                                    obj8 = null;
                                    obj6 = 1;
                                    childAt2.measure(i8, childMeasureSpec2);
                                    if (constraintLayout.f182t != null) {
                                        c0073f2 = constraintLayout.f182t;
                                        j2 = 1;
                                        c0073f2.f348a++;
                                    } else {
                                        j2 = 1;
                                    }
                                    if (childMeasureSpec == -2) {
                                    }
                                    c0061f2.m200b(childMeasureSpec == -2);
                                    if (i14 == -2) {
                                    }
                                    c0061f2.m206c(i14 == -2);
                                    childMeasureSpec = childAt2.getMeasuredWidth();
                                    i14 = childAt2.getMeasuredHeight();
                                    c0061f2.m223j(childMeasureSpec);
                                    c0061f2.m225k(i14);
                                    if (obj5 != null) {
                                        c0061f2.m231n(childMeasureSpec);
                                    }
                                    if (obj6 != null) {
                                        c0061f2.m233o(i14);
                                    }
                                    if (obj7 != null) {
                                        c0061f2.m220i().m2028a(childMeasureSpec);
                                    } else {
                                        c0061f2.m220i().m2030c();
                                    }
                                    if (obj8 != null) {
                                        c0061f2.m222j().m2028a(i14);
                                    } else {
                                        c0061f2.m222j().m2030c();
                                    }
                                    if (c0050a3.f134X) {
                                        i5 = childAt2.getBaseline();
                                        if (i5 != -1) {
                                            c0061f2.m237q(i5);
                                        }
                                    }
                                    i5 = i11 + 1;
                                    i3 = i12;
                                    j = j2;
                                    childCount = i10;
                                    i7 = 8;
                                } else {
                                    i12 = i3;
                                    i13 = i2;
                                    if (i14 == -1) {
                                        childMeasureSpec2 = getChildMeasureSpec(i13, i12, -1);
                                    } else {
                                        if (i14 == -2) {
                                        }
                                        childMeasureSpec2 = getChildMeasureSpec(i13, i12, i14);
                                        childAt2.measure(i8, childMeasureSpec2);
                                        if (constraintLayout.f182t != null) {
                                            j2 = 1;
                                        } else {
                                            c0073f2 = constraintLayout.f182t;
                                            j2 = 1;
                                            c0073f2.f348a++;
                                        }
                                        if (childMeasureSpec == -2) {
                                        }
                                        c0061f2.m200b(childMeasureSpec == -2);
                                        if (i14 == -2) {
                                        }
                                        c0061f2.m206c(i14 == -2);
                                        childMeasureSpec = childAt2.getMeasuredWidth();
                                        i14 = childAt2.getMeasuredHeight();
                                        c0061f2.m223j(childMeasureSpec);
                                        c0061f2.m225k(i14);
                                        if (obj5 != null) {
                                            c0061f2.m231n(childMeasureSpec);
                                        }
                                        if (obj6 != null) {
                                            c0061f2.m233o(i14);
                                        }
                                        if (obj7 != null) {
                                            c0061f2.m220i().m2030c();
                                        } else {
                                            c0061f2.m220i().m2028a(childMeasureSpec);
                                        }
                                        if (obj8 != null) {
                                            c0061f2.m222j().m2030c();
                                        } else {
                                            c0061f2.m222j().m2028a(i14);
                                        }
                                        if (c0050a3.f134X) {
                                            i5 = childAt2.getBaseline();
                                            if (i5 != -1) {
                                                c0061f2.m237q(i5);
                                            }
                                        }
                                        i5 = i11 + 1;
                                        i3 = i12;
                                        j = j2;
                                        childCount = i10;
                                        i7 = 8;
                                    }
                                }
                                obj6 = null;
                                childAt2.measure(i8, childMeasureSpec2);
                                if (constraintLayout.f182t != null) {
                                    c0073f2 = constraintLayout.f182t;
                                    j2 = 1;
                                    c0073f2.f348a++;
                                } else {
                                    j2 = 1;
                                }
                                if (childMeasureSpec == -2) {
                                }
                                c0061f2.m200b(childMeasureSpec == -2);
                                if (i14 == -2) {
                                }
                                c0061f2.m206c(i14 == -2);
                                childMeasureSpec = childAt2.getMeasuredWidth();
                                i14 = childAt2.getMeasuredHeight();
                                c0061f2.m223j(childMeasureSpec);
                                c0061f2.m225k(i14);
                                if (obj5 != null) {
                                    c0061f2.m231n(childMeasureSpec);
                                }
                                if (obj6 != null) {
                                    c0061f2.m233o(i14);
                                }
                                if (obj7 != null) {
                                    c0061f2.m220i().m2028a(childMeasureSpec);
                                } else {
                                    c0061f2.m220i().m2030c();
                                }
                                if (obj8 != null) {
                                    c0061f2.m222j().m2028a(i14);
                                } else {
                                    c0061f2.m222j().m2030c();
                                }
                                if (c0050a3.f134X) {
                                    i5 = childAt2.getBaseline();
                                    if (i5 != -1) {
                                        c0061f2.m237q(i5);
                                    }
                                }
                                i5 = i11 + 1;
                                i3 = i12;
                                j = j2;
                                childCount = i10;
                                i7 = 8;
                            } else {
                                i11 = i5;
                                i10 = childCount;
                                i12 = i3;
                                i13 = i2;
                                j2 = 1;
                                i5 = i11 + 1;
                                i3 = i12;
                                j = j2;
                                childCount = i10;
                                i7 = 8;
                            }
                        }
                    }
                }
            }
            i11 = i5;
            i10 = childCount;
            j2 = j;
            i12 = i3;
            i13 = i2;
            i5 = i11 + 1;
            i3 = i12;
            j = j2;
            childCount = i10;
            i7 = 8;
        }
    }

    /* renamed from: b */
    private void m122b(android.util.AttributeSet r8) {
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
        r7 = this;
        r0 = r7.f164b;
        r0.m188a(r7);
        r0 = r7.f163a;
        r1 = r7.getId();
        r0.put(r1, r7);
        r0 = 0;
        r7.f177o = r0;
        if (r8 == 0) goto L_0x008d;
    L_0x0013:
        r1 = r7.getContext();
        r2 = android.support.constraint.C0087g.C0086b.ConstraintLayout_Layout;
        r8 = r1.obtainStyledAttributes(r8, r2);
        r1 = r8.getIndexCount();
        r2 = 0;
        r3 = 0;
    L_0x0023:
        if (r3 >= r1) goto L_0x008a;
    L_0x0025:
        r4 = r8.getIndex(r3);
        r5 = android.support.constraint.C0087g.C0086b.ConstraintLayout_Layout_android_minWidth;
        if (r4 != r5) goto L_0x0036;
    L_0x002d:
        r5 = r7.f171i;
        r4 = r8.getDimensionPixelOffset(r4, r5);
        r7.f171i = r4;
        goto L_0x0087;
    L_0x0036:
        r5 = android.support.constraint.C0087g.C0086b.ConstraintLayout_Layout_android_minHeight;
        if (r4 != r5) goto L_0x0043;
    L_0x003a:
        r5 = r7.f172j;
        r4 = r8.getDimensionPixelOffset(r4, r5);
        r7.f172j = r4;
        goto L_0x0087;
    L_0x0043:
        r5 = android.support.constraint.C0087g.C0086b.ConstraintLayout_Layout_android_maxWidth;
        if (r4 != r5) goto L_0x0050;
    L_0x0047:
        r5 = r7.f173k;
        r4 = r8.getDimensionPixelOffset(r4, r5);
        r7.f173k = r4;
        goto L_0x0087;
    L_0x0050:
        r5 = android.support.constraint.C0087g.C0086b.ConstraintLayout_Layout_android_maxHeight;
        if (r4 != r5) goto L_0x005d;
    L_0x0054:
        r5 = r7.f174l;
        r4 = r8.getDimensionPixelOffset(r4, r5);
        r7.f174l = r4;
        goto L_0x0087;
    L_0x005d:
        r5 = android.support.constraint.C0087g.C0086b.ConstraintLayout_Layout_layout_optimizationLevel;
        if (r4 != r5) goto L_0x006a;
    L_0x0061:
        r5 = r7.f176n;
        r4 = r8.getInt(r4, r5);
        r7.f176n = r4;
        goto L_0x0087;
    L_0x006a:
        r5 = android.support.constraint.C0087g.C0086b.ConstraintLayout_Layout_constraintSet;
        if (r4 != r5) goto L_0x0087;
    L_0x006e:
        r4 = r8.getResourceId(r4, r2);
        r5 = new android.support.constraint.c;	 Catch:{ NotFoundException -> 0x0083 }
        r5.<init>();	 Catch:{ NotFoundException -> 0x0083 }
        r7.f177o = r5;	 Catch:{ NotFoundException -> 0x0083 }
        r5 = r7.f177o;	 Catch:{ NotFoundException -> 0x0083 }
        r6 = r7.getContext();	 Catch:{ NotFoundException -> 0x0083 }
        r5.m350a(r6, r4);	 Catch:{ NotFoundException -> 0x0083 }
        goto L_0x0085;
    L_0x0083:
        r7.f177o = r0;
    L_0x0085:
        r7.f178p = r4;
    L_0x0087:
        r3 = r3 + 1;
        goto L_0x0023;
    L_0x008a:
        r8.recycle();
    L_0x008d:
        r8 = r7.f164b;
        r0 = r7.f176n;
        r8.mo15a(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.b(android.util.AttributeSet):void");
    }

    /* renamed from: c */
    private void m123c() {
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
        r26 = this;
        r0 = r26;
        r1 = r26.isInEditMode();
        r2 = r26.getChildCount();
        r3 = 0;
        r4 = -1;
        if (r1 == 0) goto L_0x0048;
    L_0x000e:
        r5 = 0;
    L_0x000f:
        if (r5 >= r2) goto L_0x0048;
    L_0x0011:
        r6 = r0.getChildAt(r5);
        r7 = r26.getResources();	 Catch:{ NotFoundException -> 0x0045 }
        r8 = r6.getId();	 Catch:{ NotFoundException -> 0x0045 }
        r7 = r7.getResourceName(r8);	 Catch:{ NotFoundException -> 0x0045 }
        r8 = r6.getId();	 Catch:{ NotFoundException -> 0x0045 }
        r8 = java.lang.Integer.valueOf(r8);	 Catch:{ NotFoundException -> 0x0045 }
        r0.m131a(r3, r7, r8);	 Catch:{ NotFoundException -> 0x0045 }
        r8 = 47;	 Catch:{ NotFoundException -> 0x0045 }
        r8 = r7.indexOf(r8);	 Catch:{ NotFoundException -> 0x0045 }
        if (r8 == r4) goto L_0x003a;	 Catch:{ NotFoundException -> 0x0045 }
    L_0x0034:
        r8 = r8 + 1;	 Catch:{ NotFoundException -> 0x0045 }
        r7 = r7.substring(r8);	 Catch:{ NotFoundException -> 0x0045 }
    L_0x003a:
        r6 = r6.getId();	 Catch:{ NotFoundException -> 0x0045 }
        r6 = r0.m119b(r6);	 Catch:{ NotFoundException -> 0x0045 }
        r6.m189a(r7);	 Catch:{ NotFoundException -> 0x0045 }
    L_0x0045:
        r5 = r5 + 1;
        goto L_0x000f;
    L_0x0048:
        r5 = 0;
    L_0x0049:
        if (r5 >= r2) goto L_0x005c;
    L_0x004b:
        r6 = r0.getChildAt(r5);
        r6 = r0.m128a(r6);
        if (r6 != 0) goto L_0x0056;
    L_0x0055:
        goto L_0x0059;
    L_0x0056:
        r6.mo25f();
    L_0x0059:
        r5 = r5 + 1;
        goto L_0x0049;
    L_0x005c:
        r5 = r0.f178p;
        if (r5 == r4) goto L_0x007e;
    L_0x0060:
        r5 = 0;
    L_0x0061:
        if (r5 >= r2) goto L_0x007e;
    L_0x0063:
        r6 = r0.getChildAt(r5);
        r7 = r6.getId();
        r8 = r0.f178p;
        if (r7 != r8) goto L_0x007b;
    L_0x006f:
        r7 = r6 instanceof android.support.constraint.C0082d;
        if (r7 == 0) goto L_0x007b;
    L_0x0073:
        r6 = (android.support.constraint.C0082d) r6;
        r6 = r6.getConstraintSet();
        r0.f177o = r6;
    L_0x007b:
        r5 = r5 + 1;
        goto L_0x0061;
    L_0x007e:
        r5 = r0.f177o;
        if (r5 == 0) goto L_0x0087;
    L_0x0082:
        r5 = r0.f177o;
        r5.m351a(r0);
    L_0x0087:
        r5 = r0.f164b;
        r5.m2034U();
        r5 = r0.f169g;
        r5 = r5.size();
        if (r5 <= 0) goto L_0x00a5;
    L_0x0094:
        r6 = 0;
    L_0x0095:
        if (r6 >= r5) goto L_0x00a5;
    L_0x0097:
        r7 = r0.f169g;
        r7 = r7.get(r6);
        r7 = (android.support.constraint.C0078b) r7;
        r7.m335a(r0);
        r6 = r6 + 1;
        goto L_0x0095;
    L_0x00a5:
        r5 = 0;
    L_0x00a6:
        if (r5 >= r2) goto L_0x00b8;
    L_0x00a8:
        r6 = r0.getChildAt(r5);
        r7 = r6 instanceof android.support.constraint.C0084f;
        if (r7 == 0) goto L_0x00b5;
    L_0x00b0:
        r6 = (android.support.constraint.C0084f) r6;
        r6.m355a(r0);
    L_0x00b5:
        r5 = r5 + 1;
        goto L_0x00a6;
    L_0x00b8:
        r5 = 0;
    L_0x00b9:
        if (r5 >= r2) goto L_0x03de;
    L_0x00bb:
        r6 = r0.getChildAt(r5);
        r13 = r0.m128a(r6);
        if (r13 != 0) goto L_0x00c7;
    L_0x00c5:
        goto L_0x03da;
    L_0x00c7:
        r7 = r6.getLayoutParams();
        r14 = r7;
        r14 = (android.support.constraint.ConstraintLayout.C0050a) r14;
        r14.m117a();
        r7 = r14.am;
        if (r7 == 0) goto L_0x00d8;
    L_0x00d5:
        r14.am = r3;
        goto L_0x010a;
    L_0x00d8:
        if (r1 == 0) goto L_0x010a;
    L_0x00da:
        r7 = r26.getResources();	 Catch:{ NotFoundException -> 0x0109 }
        r8 = r6.getId();	 Catch:{ NotFoundException -> 0x0109 }
        r7 = r7.getResourceName(r8);	 Catch:{ NotFoundException -> 0x0109 }
        r8 = r6.getId();	 Catch:{ NotFoundException -> 0x0109 }
        r8 = java.lang.Integer.valueOf(r8);	 Catch:{ NotFoundException -> 0x0109 }
        r0.m131a(r3, r7, r8);	 Catch:{ NotFoundException -> 0x0109 }
        r8 = "id/";	 Catch:{ NotFoundException -> 0x0109 }
        r8 = r7.indexOf(r8);	 Catch:{ NotFoundException -> 0x0109 }
        r8 = r8 + 3;	 Catch:{ NotFoundException -> 0x0109 }
        r7 = r7.substring(r8);	 Catch:{ NotFoundException -> 0x0109 }
        r8 = r6.getId();	 Catch:{ NotFoundException -> 0x0109 }
        r8 = r0.m119b(r8);	 Catch:{ NotFoundException -> 0x0109 }
        r8.m189a(r7);	 Catch:{ NotFoundException -> 0x0109 }
        goto L_0x010a;
    L_0x010a:
        r7 = r6.getVisibility();
        r13.m211e(r7);
        r7 = r14.aa;
        if (r7 == 0) goto L_0x011a;
    L_0x0115:
        r7 = 8;
        r13.m211e(r7);
    L_0x011a:
        r13.m188a(r6);
        r6 = r0.f164b;
        r6.m2037b(r13);
        r6 = r14.f133W;
        if (r6 == 0) goto L_0x012a;
    L_0x0126:
        r6 = r14.f132V;
        if (r6 != 0) goto L_0x012f;
    L_0x012a:
        r6 = r0.f170h;
        r6.add(r13);
    L_0x012f:
        r6 = r14.f135Y;
        r7 = 17;
        if (r6 == 0) goto L_0x0160;
    L_0x0135:
        r13 = (android.support.constraint.p006a.p007a.C0513i) r13;
        r6 = r14.ai;
        r8 = r14.aj;
        r9 = r14.ak;
        r10 = android.os.Build.VERSION.SDK_INT;
        if (r10 >= r7) goto L_0x0147;
    L_0x0141:
        r6 = r14.f137a;
        r8 = r14.f138b;
        r9 = r14.f139c;
    L_0x0147:
        r7 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1));
        if (r7 == 0) goto L_0x0152;
    L_0x014d:
        r13.m2010e(r9);
        goto L_0x03da;
    L_0x0152:
        if (r6 == r4) goto L_0x0159;
    L_0x0154:
        r13.m2011u(r6);
        goto L_0x03da;
    L_0x0159:
        if (r8 == r4) goto L_0x03da;
    L_0x015b:
        r13.m2012v(r8);
        goto L_0x03da;
    L_0x0160:
        r6 = r14.f140d;
        if (r6 != r4) goto L_0x01a8;
    L_0x0164:
        r6 = r14.f141e;
        if (r6 != r4) goto L_0x01a8;
    L_0x0168:
        r6 = r14.f142f;
        if (r6 != r4) goto L_0x01a8;
    L_0x016c:
        r6 = r14.f143g;
        if (r6 != r4) goto L_0x01a8;
    L_0x0170:
        r6 = r14.f153q;
        if (r6 != r4) goto L_0x01a8;
    L_0x0174:
        r6 = r14.f152p;
        if (r6 != r4) goto L_0x01a8;
    L_0x0178:
        r6 = r14.f154r;
        if (r6 != r4) goto L_0x01a8;
    L_0x017c:
        r6 = r14.f155s;
        if (r6 != r4) goto L_0x01a8;
    L_0x0180:
        r6 = r14.f144h;
        if (r6 != r4) goto L_0x01a8;
    L_0x0184:
        r6 = r14.f145i;
        if (r6 != r4) goto L_0x01a8;
    L_0x0188:
        r6 = r14.f146j;
        if (r6 != r4) goto L_0x01a8;
    L_0x018c:
        r6 = r14.f147k;
        if (r6 != r4) goto L_0x01a8;
    L_0x0190:
        r6 = r14.f148l;
        if (r6 != r4) goto L_0x01a8;
    L_0x0194:
        r6 = r14.f127Q;
        if (r6 != r4) goto L_0x01a8;
    L_0x0198:
        r6 = r14.f128R;
        if (r6 != r4) goto L_0x01a8;
    L_0x019c:
        r6 = r14.f149m;
        if (r6 != r4) goto L_0x01a8;
    L_0x01a0:
        r6 = r14.width;
        if (r6 == r4) goto L_0x01a8;
    L_0x01a4:
        r6 = r14.height;
        if (r6 != r4) goto L_0x03da;
    L_0x01a8:
        r6 = r14.ab;
        r8 = r14.ac;
        r9 = r14.ad;
        r10 = r14.ae;
        r11 = r14.af;
        r12 = r14.ag;
        r15 = r14.ah;
        r3 = android.os.Build.VERSION.SDK_INT;
        if (r3 >= r7) goto L_0x01f3;
    L_0x01ba:
        r3 = r14.f140d;
        r6 = r14.f141e;
        r9 = r14.f142f;
        r10 = r14.f143g;
        r7 = r14.f156t;
        r8 = r14.f158v;
        r15 = r14.f162z;
        if (r3 != r4) goto L_0x01d9;
    L_0x01ca:
        if (r6 != r4) goto L_0x01d9;
    L_0x01cc:
        r11 = r14.f153q;
        if (r11 == r4) goto L_0x01d3;
    L_0x01d0:
        r3 = r14.f153q;
        goto L_0x01d9;
    L_0x01d3:
        r11 = r14.f152p;
        if (r11 == r4) goto L_0x01d9;
    L_0x01d7:
        r6 = r14.f152p;
    L_0x01d9:
        r25 = r6;
        r6 = r3;
        r3 = r25;
        if (r9 != r4) goto L_0x01ef;
    L_0x01e0:
        if (r10 != r4) goto L_0x01ef;
    L_0x01e2:
        r11 = r14.f154r;
        if (r11 == r4) goto L_0x01e9;
    L_0x01e6:
        r9 = r14.f154r;
        goto L_0x01ef;
    L_0x01e9:
        r11 = r14.f155s;
        if (r11 == r4) goto L_0x01ef;
    L_0x01ed:
        r10 = r14.f155s;
    L_0x01ef:
        r12 = r7;
        r16 = r8;
        goto L_0x01f7;
    L_0x01f3:
        r3 = r8;
        r16 = r12;
        r12 = r11;
    L_0x01f7:
        r11 = r10;
        r10 = r15;
        r15 = r9;
        r7 = r14.f149m;
        if (r7 == r4) goto L_0x020f;
    L_0x01fe:
        r3 = r14.f149m;
        r3 = r0.m119b(r3);
        if (r3 == 0) goto L_0x032b;
    L_0x0206:
        r6 = r14.f151o;
        r7 = r14.f150n;
        r13.m185a(r3, r6, r7);
        goto L_0x032b;
    L_0x020f:
        if (r6 == r4) goto L_0x022c;
    L_0x0211:
        r9 = r0.m119b(r6);
        if (r9 == 0) goto L_0x0227;
    L_0x0217:
        r8 = android.support.constraint.p006a.p007a.C0058e.C0057c.LEFT;
        r3 = android.support.constraint.p006a.p007a.C0058e.C0057c.LEFT;
        r6 = r14.leftMargin;
        r7 = r13;
        r17 = r10;
        r10 = r3;
        r3 = r11;
        r11 = r6;
        r7.m182a(r8, r9, r10, r11, r12);
        goto L_0x022a;
    L_0x0227:
        r17 = r10;
        r3 = r11;
    L_0x022a:
        r6 = r3;
        goto L_0x0241;
    L_0x022c:
        r17 = r10;
        r6 = r11;
        if (r3 == r4) goto L_0x0241;
    L_0x0231:
        r9 = r0.m119b(r3);
        if (r9 == 0) goto L_0x0241;
    L_0x0237:
        r8 = android.support.constraint.p006a.p007a.C0058e.C0057c.LEFT;
        r10 = android.support.constraint.p006a.p007a.C0058e.C0057c.RIGHT;
        r11 = r14.leftMargin;
        r7 = r13;
        r7.m182a(r8, r9, r10, r11, r12);
    L_0x0241:
        if (r15 == r4) goto L_0x024e;
    L_0x0243:
        r9 = r0.m119b(r15);
        if (r9 == 0) goto L_0x0262;
    L_0x0249:
        r8 = android.support.constraint.p006a.p007a.C0058e.C0057c.RIGHT;
        r10 = android.support.constraint.p006a.p007a.C0058e.C0057c.LEFT;
        goto L_0x025a;
    L_0x024e:
        if (r6 == r4) goto L_0x0262;
    L_0x0250:
        r9 = r0.m119b(r6);
        if (r9 == 0) goto L_0x0262;
    L_0x0256:
        r8 = android.support.constraint.p006a.p007a.C0058e.C0057c.RIGHT;
        r10 = android.support.constraint.p006a.p007a.C0058e.C0057c.RIGHT;
    L_0x025a:
        r11 = r14.rightMargin;
        r7 = r13;
        r12 = r16;
        r7.m182a(r8, r9, r10, r11, r12);
    L_0x0262:
        r3 = r14.f144h;
        if (r3 == r4) goto L_0x0273;
    L_0x0266:
        r3 = r14.f144h;
        r9 = r0.m119b(r3);
        if (r9 == 0) goto L_0x028b;
    L_0x026e:
        r8 = android.support.constraint.p006a.p007a.C0058e.C0057c.TOP;
        r10 = android.support.constraint.p006a.p007a.C0058e.C0057c.TOP;
        goto L_0x0283;
    L_0x0273:
        r3 = r14.f145i;
        if (r3 == r4) goto L_0x028b;
    L_0x0277:
        r3 = r14.f145i;
        r9 = r0.m119b(r3);
        if (r9 == 0) goto L_0x028b;
    L_0x027f:
        r8 = android.support.constraint.p006a.p007a.C0058e.C0057c.TOP;
        r10 = android.support.constraint.p006a.p007a.C0058e.C0057c.BOTTOM;
    L_0x0283:
        r11 = r14.topMargin;
        r12 = r14.f157u;
        r7 = r13;
        r7.m182a(r8, r9, r10, r11, r12);
    L_0x028b:
        r3 = r14.f146j;
        if (r3 == r4) goto L_0x029c;
    L_0x028f:
        r3 = r14.f146j;
        r9 = r0.m119b(r3);
        if (r9 == 0) goto L_0x02b4;
    L_0x0297:
        r8 = android.support.constraint.p006a.p007a.C0058e.C0057c.BOTTOM;
        r10 = android.support.constraint.p006a.p007a.C0058e.C0057c.TOP;
        goto L_0x02ac;
    L_0x029c:
        r3 = r14.f147k;
        if (r3 == r4) goto L_0x02b4;
    L_0x02a0:
        r3 = r14.f147k;
        r9 = r0.m119b(r3);
        if (r9 == 0) goto L_0x02b4;
    L_0x02a8:
        r8 = android.support.constraint.p006a.p007a.C0058e.C0057c.BOTTOM;
        r10 = android.support.constraint.p006a.p007a.C0058e.C0057c.BOTTOM;
    L_0x02ac:
        r11 = r14.bottomMargin;
        r12 = r14.f159w;
        r7 = r13;
        r7.m182a(r8, r9, r10, r11, r12);
    L_0x02b4:
        r3 = r14.f148l;
        if (r3 == r4) goto L_0x030a;
    L_0x02b8:
        r3 = r0.f163a;
        r6 = r14.f148l;
        r3 = r3.get(r6);
        r3 = (android.view.View) r3;
        r6 = r14.f148l;
        r6 = r0.m119b(r6);
        if (r6 == 0) goto L_0x030a;
    L_0x02ca:
        if (r3 == 0) goto L_0x030a;
    L_0x02cc:
        r7 = r3.getLayoutParams();
        r7 = r7 instanceof android.support.constraint.ConstraintLayout.C0050a;
        if (r7 == 0) goto L_0x030a;
    L_0x02d4:
        r3 = r3.getLayoutParams();
        r3 = (android.support.constraint.ConstraintLayout.C0050a) r3;
        r7 = 1;
        r14.f134X = r7;
        r3.f134X = r7;
        r3 = android.support.constraint.p006a.p007a.C0058e.C0057c.BASELINE;
        r18 = r13.mo14a(r3);
        r3 = android.support.constraint.p006a.p007a.C0058e.C0057c.BASELINE;
        r19 = r6.mo14a(r3);
        r20 = 0;
        r21 = -1;
        r22 = android.support.constraint.p006a.p007a.C0058e.C0056b.STRONG;
        r23 = 0;
        r24 = 1;
        r18.m153a(r19, r20, r21, r22, r23, r24);
        r3 = android.support.constraint.p006a.p007a.C0058e.C0057c.TOP;
        r3 = r13.mo14a(r3);
        r3.m162i();
        r3 = android.support.constraint.p006a.p007a.C0058e.C0057c.BOTTOM;
        r3 = r13.mo14a(r3);
        r3.m162i();
    L_0x030a:
        r3 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r6 = 0;
        r15 = r17;
        r7 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1));
        if (r7 < 0) goto L_0x031a;
    L_0x0313:
        r7 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1));
        if (r7 == 0) goto L_0x031a;
    L_0x0317:
        r13.m177a(r15);
    L_0x031a:
        r7 = r14.f111A;
        r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1));
        if (r6 < 0) goto L_0x032b;
    L_0x0320:
        r6 = r14.f111A;
        r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1));
        if (r3 == 0) goto L_0x032b;
    L_0x0326:
        r3 = r14.f111A;
        r13.m193b(r3);
    L_0x032b:
        if (r1 == 0) goto L_0x033c;
    L_0x032d:
        r3 = r14.f127Q;
        if (r3 != r4) goto L_0x0335;
    L_0x0331:
        r3 = r14.f128R;
        if (r3 == r4) goto L_0x033c;
    L_0x0335:
        r3 = r14.f127Q;
        r6 = r14.f128R;
        r13.m178a(r3, r6);
    L_0x033c:
        r3 = r14.f132V;
        if (r3 != 0) goto L_0x0365;
    L_0x0340:
        r3 = r14.width;
        if (r3 != r4) goto L_0x035e;
    L_0x0344:
        r3 = android.support.constraint.p006a.p007a.C0061f.C0060a.MATCH_PARENT;
        r13.m183a(r3);
        r3 = android.support.constraint.p006a.p007a.C0058e.C0057c.LEFT;
        r3 = r13.mo14a(r3);
        r6 = r14.leftMargin;
        r3.f221d = r6;
        r3 = android.support.constraint.p006a.p007a.C0058e.C0057c.RIGHT;
        r3 = r13.mo14a(r3);
        r6 = r14.rightMargin;
        r3.f221d = r6;
        goto L_0x036f;
    L_0x035e:
        r3 = android.support.constraint.p006a.p007a.C0061f.C0060a.MATCH_CONSTRAINT;
        r13.m183a(r3);
        r3 = 0;
        goto L_0x036c;
    L_0x0365:
        r3 = android.support.constraint.p006a.p007a.C0061f.C0060a.FIXED;
        r13.m183a(r3);
        r3 = r14.width;
    L_0x036c:
        r13.m223j(r3);
    L_0x036f:
        r3 = r14.f133W;
        if (r3 != 0) goto L_0x039c;
    L_0x0373:
        r3 = r14.height;
        if (r3 != r4) goto L_0x0392;
    L_0x0377:
        r3 = android.support.constraint.p006a.p007a.C0061f.C0060a.MATCH_PARENT;
        r13.m197b(r3);
        r3 = android.support.constraint.p006a.p007a.C0058e.C0057c.TOP;
        r3 = r13.mo14a(r3);
        r6 = r14.topMargin;
        r3.f221d = r6;
        r3 = android.support.constraint.p006a.p007a.C0058e.C0057c.BOTTOM;
        r3 = r13.mo14a(r3);
        r6 = r14.bottomMargin;
        r3.f221d = r6;
        r3 = 0;
        goto L_0x03a7;
    L_0x0392:
        r3 = android.support.constraint.p006a.p007a.C0061f.C0060a.MATCH_CONSTRAINT;
        r13.m197b(r3);
        r3 = 0;
        r13.m225k(r3);
        goto L_0x03a7;
    L_0x039c:
        r3 = 0;
        r6 = android.support.constraint.p006a.p007a.C0061f.C0060a.FIXED;
        r13.m197b(r6);
        r6 = r14.height;
        r13.m225k(r6);
    L_0x03a7:
        r6 = r14.f112B;
        if (r6 == 0) goto L_0x03b0;
    L_0x03ab:
        r6 = r14.f112B;
        r13.m199b(r6);
    L_0x03b0:
        r6 = r14.f115E;
        r13.m202c(r6);
        r6 = r14.f116F;
        r13.m207d(r6);
        r6 = r14.f117G;
        r13.m239r(r6);
        r6 = r14.f118H;
        r13.m241s(r6);
        r6 = r14.f119I;
        r7 = r14.f121K;
        r8 = r14.f123M;
        r9 = r14.f125O;
        r13.m180a(r6, r7, r8, r9);
        r6 = r14.f120J;
        r7 = r14.f122L;
        r8 = r14.f124N;
        r9 = r14.f126P;
        r13.m196b(r6, r7, r8, r9);
    L_0x03da:
        r5 = r5 + 1;
        goto L_0x00b9;
    L_0x03de:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.c():void");
    }

    /* renamed from: c */
    private void m124c(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        i = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        i2 = MeasureSpec.getSize(i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        C0060a c0060a = C0060a.FIXED;
        C0060a c0060a2 = C0060a.FIXED;
        getLayoutParams();
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                c0060a = C0060a.WRAP_CONTENT;
            } else if (mode == 1073741824) {
                i = Math.min(this.f173k, i) - paddingLeft;
            }
            i = 0;
        } else {
            c0060a = C0060a.WRAP_CONTENT;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                c0060a2 = C0060a.WRAP_CONTENT;
            } else if (mode2 == 1073741824) {
                i2 = Math.min(this.f174l, i2) - paddingTop;
            }
            i2 = 0;
        } else {
            c0060a2 = C0060a.WRAP_CONTENT;
        }
        this.f164b.m227l(0);
        this.f164b.m229m(0);
        this.f164b.m183a(c0060a);
        this.f164b.m223j(i);
        this.f164b.m197b(c0060a2);
        this.f164b.m225k(i2);
        this.f164b.m227l((this.f171i - getPaddingLeft()) - getPaddingRight());
        this.f164b.m229m((this.f172j - getPaddingTop()) - getPaddingBottom());
    }

    /* renamed from: d */
    private void m125d() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof C0084f) {
                ((C0084f) childAt).m356b(this);
            }
        }
        childCount = this.f169g.size();
        if (childCount > 0) {
            for (int i2 = 0; i2 < childCount; i2++) {
                ((C0078b) this.f169g.get(i2)).m338c(this);
            }
        }
    }

    /* renamed from: a */
    protected C0050a m126a() {
        return new C0050a(-2, -2);
    }

    /* renamed from: a */
    public C0050a m127a(AttributeSet attributeSet) {
        return new C0050a(getContext(), attributeSet);
    }

    /* renamed from: a */
    public final C0061f m128a(View view) {
        if (view == this) {
            return this.f164b;
        }
        return view == null ? null : ((C0050a) view.getLayoutParams()).al;
    }

    /* renamed from: a */
    public View m129a(int i) {
        return (View) this.f163a.get(i);
    }

    /* renamed from: a */
    public Object m130a(int i, Object obj) {
        if (i == 0 && (obj instanceof String)) {
            String str = (String) obj;
            if (this.f179q != null && this.f179q.containsKey(str)) {
                return this.f179q.get(str);
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m131a(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f179q == null) {
                this.f179q = new HashMap();
            }
            obj = (String) obj;
            i = obj.indexOf("/");
            if (i != -1) {
                obj = obj.substring(i + 1);
            }
            this.f179q.put(obj, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* renamed from: a */
    protected void m132a(String str) {
        this.f164b.mo444N();
        if (this.f182t != null) {
            C0073f c0073f = this.f182t;
            c0073f.f350c++;
        }
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0050a;
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    Object tag = childAt.getTag();
                    if (tag != null && (tag instanceof String)) {
                        String[] split = ((String) tag).split(",");
                        if (split.length == 4) {
                            int parseInt = Integer.parseInt(split[0]);
                            int parseInt2 = Integer.parseInt(split[1]);
                            parseInt = (int) ((((float) parseInt) / 1080.0f) * width);
                            parseInt2 = (int) ((((float) parseInt2) / 1920.0f) * height);
                            int parseInt3 = (int) ((((float) Integer.parseInt(split[2])) / 1080.0f) * width);
                            int parseInt4 = (int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height);
                            Paint paint = new Paint();
                            paint.setColor(-65536);
                            float f = (float) parseInt;
                            float f2 = (float) (parseInt + parseInt3);
                            Canvas canvas2 = canvas;
                            float f3 = (float) parseInt2;
                            float f4 = f;
                            float f5 = f;
                            f = f3;
                            Paint paint2 = paint;
                            float f6 = f2;
                            Paint paint3 = paint2;
                            canvas2.drawLine(f4, f, f6, f3, paint3);
                            float f7 = (float) (parseInt2 + parseInt4);
                            f4 = f2;
                            float f8 = f7;
                            canvas2.drawLine(f4, f, f6, f8, paint3);
                            f = f7;
                            f6 = f5;
                            canvas2.drawLine(f4, f, f6, f8, paint3);
                            f4 = f5;
                            canvas2.drawLine(f4, f, f6, f3, paint3);
                            paint = paint2;
                            paint.setColor(-16711936);
                            Paint paint4 = paint;
                            f6 = f2;
                            paint3 = paint4;
                            canvas2.drawLine(f4, f3, f6, f7, paint3);
                            canvas2.drawLine(f4, f7, f6, f3, paint3);
                        }
                    }
                }
            }
        }
        ConstraintLayout constraintLayout = this;
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return m126a();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return m127a(attributeSet);
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new C0050a(layoutParams);
    }

    public int getMaxHeight() {
        return this.f174l;
    }

    public int getMaxWidth() {
        return this.f173k;
    }

    public int getMinHeight() {
        return this.f172j;
    }

    public int getMinWidth() {
        return this.f171i;
    }

    public int getOptimizationLevel() {
        return this.f164b.mo13J();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        i2 = 0;
        for (i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0050a c0050a = (C0050a) childAt.getLayoutParams();
            C0061f c0061f = c0050a.al;
            if (childAt.getVisibility() != 8 || c0050a.f135Y || c0050a.f136Z || isInEditMode) {
                if (!c0050a.aa) {
                    int t = c0061f.m242t();
                    int u = c0061f.m244u();
                    int p = c0061f.m234p() + t;
                    int r = c0061f.m238r() + u;
                    childAt.layout(t, u, p, r);
                    if (childAt instanceof C0084f) {
                        childAt = ((C0084f) childAt).getContent();
                        if (childAt != null) {
                            childAt.setVisibility(0);
                            childAt.layout(t, u, p, r);
                        }
                    }
                }
            }
        }
        childCount = this.f169g.size();
        if (childCount > 0) {
            while (i2 < childCount) {
                ((C0078b) this.f169g.get(i2)).m337b(this);
                i2++;
            }
        }
    }

    protected void onMeasure(int i, int i2) {
        int r;
        Object obj;
        Object obj2;
        int i3;
        C0061f c0061f;
        int i4;
        View view;
        int i5;
        Object obj3;
        int i6;
        C0050a c0050a;
        Object obj4;
        C0061f c0061f2;
        View view2;
        int i7 = i;
        int i8 = i2;
        System.currentTimeMillis();
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.f164b.m218h(paddingLeft);
        this.f164b.m221i(paddingTop);
        this.f164b.m203c(this.f173k);
        this.f164b.m208d(this.f174l);
        if (VERSION.SDK_INT >= 17) {
            r0.f164b.m3369a(getLayoutDirection() == 1);
        }
        m124c(i, i2);
        int p = r0.f164b.m234p();
        int r2 = r0.f164b.m238r();
        Object obj5;
        if (r0.f175m) {
            r0.f175m = false;
            m120b();
            obj5 = 1;
        } else {
            obj5 = null;
        }
        Object obj6 = (r0.f176n & 8) == 8 ? 1 : null;
        if (obj6 != null) {
            r0.f164b.m3361O();
            r0.f164b.m3373f(p, r2);
            m121b(i, i2);
        } else {
            m118a(i, i2);
        }
        m125d();
        if (getChildCount() > 0 && r13 != null) {
            C0051a.m139a(r0.f164b);
        }
        if (r0.f164b.as) {
            if (r0.f164b.at && mode == Integer.MIN_VALUE) {
                if (r0.f164b.av < size) {
                    r0.f164b.m223j(r0.f164b.av);
                }
                r0.f164b.m183a(C0060a.FIXED);
            }
            if (r0.f164b.au && mode2 == Integer.MIN_VALUE) {
                if (r0.f164b.aw < size2) {
                    r0.f164b.m225k(r0.f164b.aw);
                }
                r0.f164b.m197b(C0060a.FIXED);
            }
        }
        if ((r0.f176n & 32) == 32) {
            int p2 = r0.f164b.m234p();
            r = r0.f164b.m238r();
            if (r0.f180r != p2 && mode == 1073741824) {
                C0051a.m141a(r0.f164b.ar, 0, p2);
            }
            if (r0.f181s != r && mode2 == 1073741824) {
                C0051a.m141a(r0.f164b.ar, 1, r);
            }
            if (r0.f164b.at && r0.f164b.av > size) {
                C0051a.m141a(r0.f164b.ar, 0, size);
            }
            if (r0.f164b.au && r0.f164b.aw > size2) {
                C0051a.m141a(r0.f164b.ar, 1, size2);
                if (getChildCount() > 0) {
                    m132a("First pass");
                }
                mode = r0.f170h.size();
                paddingTop += getPaddingBottom();
                paddingLeft += getPaddingRight();
                if (mode <= 0) {
                    Object obj7 = r0.f164b.m172F() != C0060a.WRAP_CONTENT ? 1 : null;
                    obj = r0.f164b.m173G() != C0060a.WRAP_CONTENT ? 1 : null;
                    r = Math.max(r0.f164b.m234p(), r0.f171i);
                    mode2 = Math.max(r0.f164b.m238r(), r0.f172j);
                    size = 0;
                    obj2 = null;
                    i3 = 0;
                    while (size < mode) {
                        c0061f = (C0061f) r0.f170h.get(size);
                        i4 = mode;
                        view = (View) c0061f.m168B();
                        if (view != null) {
                            i5 = p;
                            obj3 = obj2;
                            i6 = r2;
                        } else {
                            i6 = r2;
                            c0050a = (C0050a) view.getLayoutParams();
                            i5 = p;
                            if (!c0050a.f136Z) {
                                if (c0050a.f135Y) {
                                    obj3 = obj2;
                                    if (view.getVisibility() != 8) {
                                        if (obj6 != null || !c0061f.m220i().m267g() || !c0061f.m222j().m267g()) {
                                            p = (c0050a.width == -2 || !c0050a.f132V) ? MeasureSpec.makeMeasureSpec(c0061f.m234p(), 1073741824) : getChildMeasureSpec(i7, paddingLeft, c0050a.width);
                                            i7 = (c0050a.height == -2 || !c0050a.f133W) ? MeasureSpec.makeMeasureSpec(c0061f.m238r(), 1073741824) : getChildMeasureSpec(i8, paddingTop, c0050a.height);
                                            view.measure(p, i7);
                                            if (r0.f182t != null) {
                                                C0073f c0073f = r0.f182t;
                                                c0073f.f349b++;
                                            }
                                            i7 = view.getMeasuredWidth();
                                            p = view.getMeasuredHeight();
                                            if (i7 != c0061f.m234p()) {
                                                c0061f.m223j(i7);
                                                if (obj6 != null) {
                                                    c0061f.m220i().m2028a(i7);
                                                }
                                                if (obj7 != null && c0061f.m247x() > r) {
                                                    r = Math.max(r, c0061f.m247x() + c0061f.mo14a(C0057c.RIGHT).m158e());
                                                }
                                                obj3 = 1;
                                            }
                                            if (p != c0061f.m238r()) {
                                                c0061f.m225k(p);
                                                if (obj6 != null) {
                                                    c0061f.m222j().m2028a(p);
                                                }
                                                if (obj != null && c0061f.m248y() > mode2) {
                                                    mode2 = Math.max(mode2, c0061f.m248y() + c0061f.mo14a(C0057c.BOTTOM).m158e());
                                                }
                                                obj3 = 1;
                                            }
                                            if (c0050a.f134X) {
                                                i7 = view.getBaseline();
                                                if (!(i7 == -1 || i7 == c0061f.m167A())) {
                                                    c0061f.m237q(i7);
                                                    obj3 = 1;
                                                }
                                            }
                                            if (VERSION.SDK_INT < 11) {
                                                i3 = combineMeasuredStates(i3, view.getMeasuredState());
                                            } else {
                                                mode = i3;
                                            }
                                            obj2 = obj3;
                                            size++;
                                            mode = i4;
                                            r2 = i6;
                                            p = i5;
                                            i7 = i;
                                        }
                                    }
                                }
                            }
                            obj3 = obj2;
                        }
                        i3 = i3;
                        obj2 = obj3;
                        size++;
                        mode = i4;
                        r2 = i6;
                        p = i5;
                        i7 = i;
                    }
                    i4 = mode;
                    i5 = p;
                    i6 = r2;
                    mode = i3;
                    if (obj2 != null) {
                        r0.f164b.m223j(i5);
                        r0.f164b.m225k(i6);
                        if (obj6 != null) {
                            r0.f164b.m3362P();
                        }
                        m132a("2nd pass");
                        if (r0.f164b.m234p() >= r) {
                            r0.f164b.m223j(r);
                            obj = 1;
                        } else {
                            obj = null;
                        }
                        if (r0.f164b.m238r() >= mode2) {
                            r0.f164b.m225k(mode2);
                            obj4 = 1;
                        } else {
                            obj4 = obj;
                        }
                        if (obj4 != null) {
                            m132a("3rd pass");
                        }
                    }
                    i7 = i4;
                    for (size = 0; size < i7; size++) {
                        c0061f2 = (C0061f) r0.f170h.get(size);
                        view2 = (View) c0061f2.m168B();
                        if (view2 != null && (view2.getMeasuredWidth() != c0061f2.m234p() || view2.getMeasuredHeight() != c0061f2.m238r())) {
                            if (c0061f2.m226l() != 8) {
                                view2.measure(MeasureSpec.makeMeasureSpec(c0061f2.m234p(), 1073741824), MeasureSpec.makeMeasureSpec(c0061f2.m238r(), 1073741824));
                                if (r0.f182t != null) {
                                    C0073f c0073f2 = r0.f182t;
                                    c0073f2.f349b++;
                                }
                            }
                        }
                    }
                } else {
                    mode = 0;
                }
                i7 = r0.f164b.m234p() + paddingLeft;
                size = r0.f164b.m238r() + paddingTop;
                if (VERSION.SDK_INT < 11) {
                    i8 = resolveSizeAndState(size, i8, mode << 16) & 16777215;
                    i7 = Math.min(r0.f173k, resolveSizeAndState(i7, i, mode) & 16777215);
                    i8 = Math.min(r0.f174l, i8);
                    if (r0.f164b.m3357K()) {
                        i7 |= 16777216;
                    }
                    if (r0.f164b.m3358L()) {
                        i8 |= 16777216;
                    }
                    setMeasuredDimension(i7, i8);
                    r0.f180r = i7;
                    r0.f181s = i8;
                }
                setMeasuredDimension(i7, size);
                r0.f180r = i7;
                r0.f181s = size;
                return;
            }
        }
        if (getChildCount() > 0) {
            m132a("First pass");
        }
        mode = r0.f170h.size();
        paddingTop += getPaddingBottom();
        paddingLeft += getPaddingRight();
        if (mode <= 0) {
            mode = 0;
        } else {
            if (r0.f164b.m172F() != C0060a.WRAP_CONTENT) {
            }
            if (r0.f164b.m173G() != C0060a.WRAP_CONTENT) {
            }
            r = Math.max(r0.f164b.m234p(), r0.f171i);
            mode2 = Math.max(r0.f164b.m238r(), r0.f172j);
            size = 0;
            obj2 = null;
            i3 = 0;
            while (size < mode) {
                c0061f = (C0061f) r0.f170h.get(size);
                i4 = mode;
                view = (View) c0061f.m168B();
                if (view != null) {
                    i6 = r2;
                    c0050a = (C0050a) view.getLayoutParams();
                    i5 = p;
                    if (c0050a.f136Z) {
                        if (c0050a.f135Y) {
                            obj3 = obj2;
                            if (view.getVisibility() != 8) {
                                if (obj6 != null) {
                                }
                                if (c0050a.width == -2) {
                                }
                                if (c0050a.height == -2) {
                                }
                                view.measure(p, i7);
                                if (r0.f182t != null) {
                                    C0073f c0073f3 = r0.f182t;
                                    c0073f3.f349b++;
                                }
                                i7 = view.getMeasuredWidth();
                                p = view.getMeasuredHeight();
                                if (i7 != c0061f.m234p()) {
                                    c0061f.m223j(i7);
                                    if (obj6 != null) {
                                        c0061f.m220i().m2028a(i7);
                                    }
                                    r = Math.max(r, c0061f.m247x() + c0061f.mo14a(C0057c.RIGHT).m158e());
                                    obj3 = 1;
                                }
                                if (p != c0061f.m238r()) {
                                    c0061f.m225k(p);
                                    if (obj6 != null) {
                                        c0061f.m222j().m2028a(p);
                                    }
                                    mode2 = Math.max(mode2, c0061f.m248y() + c0061f.mo14a(C0057c.BOTTOM).m158e());
                                    obj3 = 1;
                                }
                                if (c0050a.f134X) {
                                    i7 = view.getBaseline();
                                    c0061f.m237q(i7);
                                    obj3 = 1;
                                }
                                if (VERSION.SDK_INT < 11) {
                                    mode = i3;
                                } else {
                                    i3 = combineMeasuredStates(i3, view.getMeasuredState());
                                }
                                obj2 = obj3;
                                size++;
                                mode = i4;
                                r2 = i6;
                                p = i5;
                                i7 = i;
                            }
                        }
                    }
                    obj3 = obj2;
                } else {
                    i5 = p;
                    obj3 = obj2;
                    i6 = r2;
                }
                i3 = i3;
                obj2 = obj3;
                size++;
                mode = i4;
                r2 = i6;
                p = i5;
                i7 = i;
            }
            i4 = mode;
            i5 = p;
            i6 = r2;
            mode = i3;
            if (obj2 != null) {
                r0.f164b.m223j(i5);
                r0.f164b.m225k(i6);
                if (obj6 != null) {
                    r0.f164b.m3362P();
                }
                m132a("2nd pass");
                if (r0.f164b.m234p() >= r) {
                    obj = null;
                } else {
                    r0.f164b.m223j(r);
                    obj = 1;
                }
                if (r0.f164b.m238r() >= mode2) {
                    obj4 = obj;
                } else {
                    r0.f164b.m225k(mode2);
                    obj4 = 1;
                }
                if (obj4 != null) {
                    m132a("3rd pass");
                }
            }
            i7 = i4;
            for (size = 0; size < i7; size++) {
                c0061f2 = (C0061f) r0.f170h.get(size);
                view2 = (View) c0061f2.m168B();
                if (view2 != null) {
                    if (c0061f2.m226l() != 8) {
                        view2.measure(MeasureSpec.makeMeasureSpec(c0061f2.m234p(), 1073741824), MeasureSpec.makeMeasureSpec(c0061f2.m238r(), 1073741824));
                        if (r0.f182t != null) {
                            C0073f c0073f22 = r0.f182t;
                            c0073f22.f349b++;
                        }
                    }
                }
            }
        }
        i7 = r0.f164b.m234p() + paddingLeft;
        size = r0.f164b.m238r() + paddingTop;
        if (VERSION.SDK_INT < 11) {
            setMeasuredDimension(i7, size);
            r0.f180r = i7;
            r0.f181s = size;
            return;
        }
        i8 = resolveSizeAndState(size, i8, mode << 16) & 16777215;
        i7 = Math.min(r0.f173k, resolveSizeAndState(i7, i, mode) & 16777215);
        i8 = Math.min(r0.f174l, i8);
        if (r0.f164b.m3357K()) {
            i7 |= 16777216;
        }
        if (r0.f164b.m3358L()) {
            i8 |= 16777216;
        }
        setMeasuredDimension(i7, i8);
        r0.f180r = i7;
        r0.f181s = i8;
    }

    public void onViewAdded(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        C0061f a = m128a(view);
        if ((view instanceof C0083e) && !(a instanceof C0513i)) {
            C0050a c0050a = (C0050a) view.getLayoutParams();
            c0050a.al = new C0513i();
            c0050a.f135Y = true;
            ((C0513i) c0050a.al).mo15a(c0050a.f129S);
        }
        if (view instanceof C0078b) {
            C0078b c0078b = (C0078b) view;
            c0078b.m334a();
            ((C0050a) view.getLayoutParams()).f136Z = true;
            if (!this.f169g.contains(c0078b)) {
                this.f169g.add(c0078b);
            }
        }
        this.f163a.put(view.getId(), view);
        this.f175m = true;
    }

    public void onViewRemoved(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f163a.remove(view.getId());
        C0061f a = m128a(view);
        this.f164b.m2038c(a);
        this.f169g.remove(view);
        this.f170h.remove(a);
        this.f175m = true;
    }

    public void removeView(View view) {
        super.removeView(view);
        if (VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void requestLayout() {
        super.requestLayout();
        this.f175m = true;
        this.f180r = -1;
        this.f181s = -1;
        this.f165c = -1;
        this.f166d = -1;
        this.f167e = 0;
        this.f168f = 0;
    }

    public void setConstraintSet(C0081c c0081c) {
        this.f177o = c0081c;
    }

    public void setId(int i) {
        this.f163a.remove(getId());
        super.setId(i);
        this.f163a.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.f174l) {
            this.f174l = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.f173k) {
            this.f173k = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f172j) {
            this.f172j = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.f171i) {
            this.f171i = i;
            requestLayout();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f164b.mo15a(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
