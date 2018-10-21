package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.constraint.C0082d.C0521a;
import android.support.constraint.C0087g.C0086b;
import android.support.constraint.ConstraintLayout.C0050a;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.constraint.c */
public class C0081c {
    /* renamed from: a */
    private static final int[] f453a = new int[]{0, 4, 8};
    /* renamed from: c */
    private static SparseIntArray f454c = new SparseIntArray();
    /* renamed from: b */
    private HashMap<Integer, C0080a> f455b = new HashMap();

    /* renamed from: android.support.constraint.c$a */
    private static class C0080a {
        /* renamed from: A */
        public int f401A;
        /* renamed from: B */
        public int f402B;
        /* renamed from: C */
        public int f403C;
        /* renamed from: D */
        public int f404D;
        /* renamed from: E */
        public int f405E;
        /* renamed from: F */
        public int f406F;
        /* renamed from: G */
        public int f407G;
        /* renamed from: H */
        public int f408H;
        /* renamed from: I */
        public int f409I;
        /* renamed from: J */
        public int f410J;
        /* renamed from: K */
        public int f411K;
        /* renamed from: L */
        public int f412L;
        /* renamed from: M */
        public int f413M;
        /* renamed from: N */
        public int f414N;
        /* renamed from: O */
        public int f415O;
        /* renamed from: P */
        public int f416P;
        /* renamed from: Q */
        public float f417Q;
        /* renamed from: R */
        public float f418R;
        /* renamed from: S */
        public int f419S;
        /* renamed from: T */
        public int f420T;
        /* renamed from: U */
        public float f421U;
        /* renamed from: V */
        public boolean f422V;
        /* renamed from: W */
        public float f423W;
        /* renamed from: X */
        public float f424X;
        /* renamed from: Y */
        public float f425Y;
        /* renamed from: Z */
        public float f426Z;
        /* renamed from: a */
        boolean f427a;
        public float aa;
        public float ab;
        public float ac;
        public float ad;
        public float ae;
        public float af;
        public float ag;
        public boolean ah;
        public boolean ai;
        public int aj;
        public int ak;
        public int al;
        public int am;
        public int an;
        public int ao;
        public float ap;
        public float aq;
        public boolean ar;
        public int as;
        public int at;
        public int[] au;
        public String av;
        /* renamed from: b */
        public int f428b;
        /* renamed from: c */
        public int f429c;
        /* renamed from: d */
        int f430d;
        /* renamed from: e */
        public int f431e;
        /* renamed from: f */
        public int f432f;
        /* renamed from: g */
        public float f433g;
        /* renamed from: h */
        public int f434h;
        /* renamed from: i */
        public int f435i;
        /* renamed from: j */
        public int f436j;
        /* renamed from: k */
        public int f437k;
        /* renamed from: l */
        public int f438l;
        /* renamed from: m */
        public int f439m;
        /* renamed from: n */
        public int f440n;
        /* renamed from: o */
        public int f441o;
        /* renamed from: p */
        public int f442p;
        /* renamed from: q */
        public int f443q;
        /* renamed from: r */
        public int f444r;
        /* renamed from: s */
        public int f445s;
        /* renamed from: t */
        public int f446t;
        /* renamed from: u */
        public float f447u;
        /* renamed from: v */
        public float f448v;
        /* renamed from: w */
        public String f449w;
        /* renamed from: x */
        public int f450x;
        /* renamed from: y */
        public int f451y;
        /* renamed from: z */
        public float f452z;

        private C0080a() {
            this.f427a = false;
            this.f431e = -1;
            this.f432f = -1;
            this.f433g = -1.0f;
            this.f434h = -1;
            this.f435i = -1;
            this.f436j = -1;
            this.f437k = -1;
            this.f438l = -1;
            this.f439m = -1;
            this.f440n = -1;
            this.f441o = -1;
            this.f442p = -1;
            this.f443q = -1;
            this.f444r = -1;
            this.f445s = -1;
            this.f446t = -1;
            this.f447u = 0.5f;
            this.f448v = 0.5f;
            this.f449w = null;
            this.f450x = -1;
            this.f451y = 0;
            this.f452z = 0.0f;
            this.f401A = -1;
            this.f402B = -1;
            this.f403C = -1;
            this.f404D = -1;
            this.f405E = -1;
            this.f406F = -1;
            this.f407G = -1;
            this.f408H = -1;
            this.f409I = -1;
            this.f410J = 0;
            this.f411K = -1;
            this.f412L = -1;
            this.f413M = -1;
            this.f414N = -1;
            this.f415O = -1;
            this.f416P = -1;
            this.f417Q = 0.0f;
            this.f418R = 0.0f;
            this.f419S = 0;
            this.f420T = 0;
            this.f421U = 1.0f;
            this.f422V = false;
            this.f423W = 0.0f;
            this.f424X = 0.0f;
            this.f425Y = 0.0f;
            this.f426Z = 0.0f;
            this.aa = 1.0f;
            this.ab = 1.0f;
            this.ac = Float.NaN;
            this.ad = Float.NaN;
            this.ae = 0.0f;
            this.af = 0.0f;
            this.ag = 0.0f;
            this.ah = false;
            this.ai = false;
            this.aj = 0;
            this.ak = 0;
            this.al = -1;
            this.am = -1;
            this.an = -1;
            this.ao = -1;
            this.ap = 1.0f;
            this.aq = 1.0f;
            this.ar = false;
            this.as = -1;
            this.at = -1;
        }

        /* renamed from: a */
        private void m339a(int i, C0050a c0050a) {
            this.f430d = i;
            this.f434h = c0050a.f140d;
            this.f435i = c0050a.f141e;
            this.f436j = c0050a.f142f;
            this.f437k = c0050a.f143g;
            this.f438l = c0050a.f144h;
            this.f439m = c0050a.f145i;
            this.f440n = c0050a.f146j;
            this.f441o = c0050a.f147k;
            this.f442p = c0050a.f148l;
            this.f443q = c0050a.f152p;
            this.f444r = c0050a.f153q;
            this.f445s = c0050a.f154r;
            this.f446t = c0050a.f155s;
            this.f447u = c0050a.f162z;
            this.f448v = c0050a.f111A;
            this.f449w = c0050a.f112B;
            this.f450x = c0050a.f149m;
            this.f451y = c0050a.f150n;
            this.f452z = c0050a.f151o;
            this.f401A = c0050a.f127Q;
            this.f402B = c0050a.f128R;
            this.f403C = c0050a.f129S;
            this.f433g = c0050a.f139c;
            this.f431e = c0050a.f137a;
            this.f432f = c0050a.f138b;
            this.f428b = c0050a.width;
            this.f429c = c0050a.height;
            this.f404D = c0050a.leftMargin;
            this.f405E = c0050a.rightMargin;
            this.f406F = c0050a.topMargin;
            this.f407G = c0050a.bottomMargin;
            this.f417Q = c0050a.f116F;
            this.f418R = c0050a.f115E;
            this.f420T = c0050a.f118H;
            this.f419S = c0050a.f117G;
            this.ah = c0050a.f130T;
            this.ai = c0050a.f131U;
            this.aj = c0050a.f119I;
            this.ak = c0050a.f120J;
            this.ah = c0050a.f130T;
            this.al = c0050a.f123M;
            this.am = c0050a.f124N;
            this.an = c0050a.f121K;
            this.ao = c0050a.f122L;
            this.ap = c0050a.f125O;
            this.aq = c0050a.f126P;
            if (VERSION.SDK_INT >= 17) {
                this.f408H = c0050a.getMarginEnd();
                this.f409I = c0050a.getMarginStart();
            }
        }

        /* renamed from: a */
        private void m340a(int i, C0521a c0521a) {
            m339a(i, (C0050a) c0521a);
            this.f421U = c0521a.an;
            this.f424X = c0521a.aq;
            this.f425Y = c0521a.ar;
            this.f426Z = c0521a.as;
            this.aa = c0521a.at;
            this.ab = c0521a.au;
            this.ac = c0521a.av;
            this.ad = c0521a.aw;
            this.ae = c0521a.ax;
            this.af = c0521a.ay;
            this.ag = c0521a.az;
            this.f423W = c0521a.ap;
            this.f422V = c0521a.ao;
        }

        /* renamed from: a */
        private void m341a(C0078b c0078b, int i, C0521a c0521a) {
            m340a(i, c0521a);
            if (c0078b instanceof C0520a) {
                this.at = 1;
                C0520a c0520a = (C0520a) c0078b;
                this.as = c0520a.getType();
                this.au = c0520a.getReferencedIds();
            }
        }

        /* renamed from: a */
        public C0080a m344a() {
            C0080a c0080a = new C0080a();
            c0080a.f427a = this.f427a;
            c0080a.f428b = this.f428b;
            c0080a.f429c = this.f429c;
            c0080a.f431e = this.f431e;
            c0080a.f432f = this.f432f;
            c0080a.f433g = this.f433g;
            c0080a.f434h = this.f434h;
            c0080a.f435i = this.f435i;
            c0080a.f436j = this.f436j;
            c0080a.f437k = this.f437k;
            c0080a.f438l = this.f438l;
            c0080a.f439m = this.f439m;
            c0080a.f440n = this.f440n;
            c0080a.f441o = this.f441o;
            c0080a.f442p = this.f442p;
            c0080a.f443q = this.f443q;
            c0080a.f444r = this.f444r;
            c0080a.f445s = this.f445s;
            c0080a.f446t = this.f446t;
            c0080a.f447u = this.f447u;
            c0080a.f448v = this.f448v;
            c0080a.f449w = this.f449w;
            c0080a.f401A = this.f401A;
            c0080a.f402B = this.f402B;
            c0080a.f447u = this.f447u;
            c0080a.f447u = this.f447u;
            c0080a.f447u = this.f447u;
            c0080a.f447u = this.f447u;
            c0080a.f447u = this.f447u;
            c0080a.f403C = this.f403C;
            c0080a.f404D = this.f404D;
            c0080a.f405E = this.f405E;
            c0080a.f406F = this.f406F;
            c0080a.f407G = this.f407G;
            c0080a.f408H = this.f408H;
            c0080a.f409I = this.f409I;
            c0080a.f410J = this.f410J;
            c0080a.f411K = this.f411K;
            c0080a.f412L = this.f412L;
            c0080a.f413M = this.f413M;
            c0080a.f414N = this.f414N;
            c0080a.f415O = this.f415O;
            c0080a.f416P = this.f416P;
            c0080a.f417Q = this.f417Q;
            c0080a.f418R = this.f418R;
            c0080a.f419S = this.f419S;
            c0080a.f420T = this.f420T;
            c0080a.f421U = this.f421U;
            c0080a.f422V = this.f422V;
            c0080a.f423W = this.f423W;
            c0080a.f424X = this.f424X;
            c0080a.f425Y = this.f425Y;
            c0080a.f426Z = this.f426Z;
            c0080a.aa = this.aa;
            c0080a.ab = this.ab;
            c0080a.ac = this.ac;
            c0080a.ad = this.ad;
            c0080a.ae = this.ae;
            c0080a.af = this.af;
            c0080a.ag = this.ag;
            c0080a.ah = this.ah;
            c0080a.ai = this.ai;
            c0080a.aj = this.aj;
            c0080a.ak = this.ak;
            c0080a.al = this.al;
            c0080a.am = this.am;
            c0080a.an = this.an;
            c0080a.ao = this.ao;
            c0080a.ap = this.ap;
            c0080a.aq = this.aq;
            c0080a.as = this.as;
            c0080a.at = this.at;
            if (this.au != null) {
                c0080a.au = Arrays.copyOf(this.au, this.au.length);
            }
            c0080a.f450x = this.f450x;
            c0080a.f451y = this.f451y;
            c0080a.f452z = this.f452z;
            c0080a.ar = this.ar;
            return c0080a;
        }

        /* renamed from: a */
        public void m345a(C0050a c0050a) {
            c0050a.f140d = this.f434h;
            c0050a.f141e = this.f435i;
            c0050a.f142f = this.f436j;
            c0050a.f143g = this.f437k;
            c0050a.f144h = this.f438l;
            c0050a.f145i = this.f439m;
            c0050a.f146j = this.f440n;
            c0050a.f147k = this.f441o;
            c0050a.f148l = this.f442p;
            c0050a.f152p = this.f443q;
            c0050a.f153q = this.f444r;
            c0050a.f154r = this.f445s;
            c0050a.f155s = this.f446t;
            c0050a.leftMargin = this.f404D;
            c0050a.rightMargin = this.f405E;
            c0050a.topMargin = this.f406F;
            c0050a.bottomMargin = this.f407G;
            c0050a.f160x = this.f416P;
            c0050a.f161y = this.f415O;
            c0050a.f162z = this.f447u;
            c0050a.f111A = this.f448v;
            c0050a.f149m = this.f450x;
            c0050a.f150n = this.f451y;
            c0050a.f151o = this.f452z;
            c0050a.f112B = this.f449w;
            c0050a.f127Q = this.f401A;
            c0050a.f128R = this.f402B;
            c0050a.f116F = this.f417Q;
            c0050a.f115E = this.f418R;
            c0050a.f118H = this.f420T;
            c0050a.f117G = this.f419S;
            c0050a.f130T = this.ah;
            c0050a.f131U = this.ai;
            c0050a.f119I = this.aj;
            c0050a.f120J = this.ak;
            c0050a.f123M = this.al;
            c0050a.f124N = this.am;
            c0050a.f121K = this.an;
            c0050a.f122L = this.ao;
            c0050a.f125O = this.ap;
            c0050a.f126P = this.aq;
            c0050a.f129S = this.f403C;
            c0050a.f139c = this.f433g;
            c0050a.f137a = this.f431e;
            c0050a.f138b = this.f432f;
            c0050a.width = this.f428b;
            c0050a.height = this.f429c;
            if (VERSION.SDK_INT >= 17) {
                c0050a.setMarginStart(this.f409I);
                c0050a.setMarginEnd(this.f408H);
            }
            c0050a.m117a();
        }

        public /* synthetic */ Object clone() {
            return m344a();
        }
    }

    static {
        f454c.append(C0086b.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
        f454c.append(C0086b.ConstraintSet_layout_constraintLeft_toRightOf, 26);
        f454c.append(C0086b.ConstraintSet_layout_constraintRight_toLeftOf, 29);
        f454c.append(C0086b.ConstraintSet_layout_constraintRight_toRightOf, 30);
        f454c.append(C0086b.ConstraintSet_layout_constraintTop_toTopOf, 36);
        f454c.append(C0086b.ConstraintSet_layout_constraintTop_toBottomOf, 35);
        f454c.append(C0086b.ConstraintSet_layout_constraintBottom_toTopOf, 4);
        f454c.append(C0086b.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
        f454c.append(C0086b.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
        f454c.append(C0086b.ConstraintSet_layout_editor_absoluteX, 6);
        f454c.append(C0086b.ConstraintSet_layout_editor_absoluteY, 7);
        f454c.append(C0086b.ConstraintSet_layout_constraintGuide_begin, 17);
        f454c.append(C0086b.ConstraintSet_layout_constraintGuide_end, 18);
        f454c.append(C0086b.ConstraintSet_layout_constraintGuide_percent, 19);
        f454c.append(C0086b.ConstraintSet_android_orientation, 27);
        f454c.append(C0086b.ConstraintSet_layout_constraintStart_toEndOf, 32);
        f454c.append(C0086b.ConstraintSet_layout_constraintStart_toStartOf, 33);
        f454c.append(C0086b.ConstraintSet_layout_constraintEnd_toStartOf, 10);
        f454c.append(C0086b.ConstraintSet_layout_constraintEnd_toEndOf, 9);
        f454c.append(C0086b.ConstraintSet_layout_goneMarginLeft, 13);
        f454c.append(C0086b.ConstraintSet_layout_goneMarginTop, 16);
        f454c.append(C0086b.ConstraintSet_layout_goneMarginRight, 14);
        f454c.append(C0086b.ConstraintSet_layout_goneMarginBottom, 11);
        f454c.append(C0086b.ConstraintSet_layout_goneMarginStart, 15);
        f454c.append(C0086b.ConstraintSet_layout_goneMarginEnd, 12);
        f454c.append(C0086b.ConstraintSet_layout_constraintVertical_weight, 40);
        f454c.append(C0086b.ConstraintSet_layout_constraintHorizontal_weight, 39);
        f454c.append(C0086b.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
        f454c.append(C0086b.ConstraintSet_layout_constraintVertical_chainStyle, 42);
        f454c.append(C0086b.ConstraintSet_layout_constraintHorizontal_bias, 20);
        f454c.append(C0086b.ConstraintSet_layout_constraintVertical_bias, 37);
        f454c.append(C0086b.ConstraintSet_layout_constraintDimensionRatio, 5);
        f454c.append(C0086b.ConstraintSet_layout_constraintLeft_creator, 75);
        f454c.append(C0086b.ConstraintSet_layout_constraintTop_creator, 75);
        f454c.append(C0086b.ConstraintSet_layout_constraintRight_creator, 75);
        f454c.append(C0086b.ConstraintSet_layout_constraintBottom_creator, 75);
        f454c.append(C0086b.ConstraintSet_layout_constraintBaseline_creator, 75);
        f454c.append(C0086b.ConstraintSet_android_layout_marginLeft, 24);
        f454c.append(C0086b.ConstraintSet_android_layout_marginRight, 28);
        f454c.append(C0086b.ConstraintSet_android_layout_marginStart, 31);
        f454c.append(C0086b.ConstraintSet_android_layout_marginEnd, 8);
        f454c.append(C0086b.ConstraintSet_android_layout_marginTop, 34);
        f454c.append(C0086b.ConstraintSet_android_layout_marginBottom, 2);
        f454c.append(C0086b.ConstraintSet_android_layout_width, 23);
        f454c.append(C0086b.ConstraintSet_android_layout_height, 21);
        f454c.append(C0086b.ConstraintSet_android_visibility, 22);
        f454c.append(C0086b.ConstraintSet_android_alpha, 43);
        f454c.append(C0086b.ConstraintSet_android_elevation, 44);
        f454c.append(C0086b.ConstraintSet_android_rotationX, 45);
        f454c.append(C0086b.ConstraintSet_android_rotationY, 46);
        f454c.append(C0086b.ConstraintSet_android_rotation, 60);
        f454c.append(C0086b.ConstraintSet_android_scaleX, 47);
        f454c.append(C0086b.ConstraintSet_android_scaleY, 48);
        f454c.append(C0086b.ConstraintSet_android_transformPivotX, 49);
        f454c.append(C0086b.ConstraintSet_android_transformPivotY, 50);
        f454c.append(C0086b.ConstraintSet_android_translationX, 51);
        f454c.append(C0086b.ConstraintSet_android_translationY, 52);
        f454c.append(C0086b.ConstraintSet_android_translationZ, 53);
        f454c.append(C0086b.ConstraintSet_layout_constraintWidth_default, 54);
        f454c.append(C0086b.ConstraintSet_layout_constraintHeight_default, 55);
        f454c.append(C0086b.ConstraintSet_layout_constraintWidth_max, 56);
        f454c.append(C0086b.ConstraintSet_layout_constraintHeight_max, 57);
        f454c.append(C0086b.ConstraintSet_layout_constraintWidth_min, 58);
        f454c.append(C0086b.ConstraintSet_layout_constraintHeight_min, 59);
        f454c.append(C0086b.ConstraintSet_layout_constraintCircle, 61);
        f454c.append(C0086b.ConstraintSet_layout_constraintCircleRadius, 62);
        f454c.append(C0086b.ConstraintSet_layout_constraintCircleAngle, 63);
        f454c.append(C0086b.ConstraintSet_android_id, 38);
        f454c.append(C0086b.ConstraintSet_layout_constraintWidth_percent, 69);
        f454c.append(C0086b.ConstraintSet_layout_constraintHeight_percent, 70);
        f454c.append(C0086b.ConstraintSet_chainUseRtl, 71);
        f454c.append(C0086b.ConstraintSet_barrierDirection, 72);
        f454c.append(C0086b.ConstraintSet_constraint_referenced_ids, 73);
        f454c.append(C0086b.ConstraintSet_barrierAllowsGoneWidgets, 74);
    }

    /* renamed from: a */
    private static int m346a(TypedArray typedArray, int i, int i2) {
        i2 = typedArray.getResourceId(i, i2);
        return i2 == -1 ? typedArray.getInt(i, -1) : i2;
    }

    /* renamed from: a */
    private C0080a m347a(Context context, AttributeSet attributeSet) {
        C0080a c0080a = new C0080a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0086b.ConstraintSet);
        m348a(c0080a, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return c0080a;
    }

    /* renamed from: a */
    private void m348a(C0080a c0080a, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            int i2 = f454c.get(index);
            switch (i2) {
                case 1:
                    c0080a.f442p = C0081c.m346a(typedArray, index, c0080a.f442p);
                    break;
                case 2:
                    c0080a.f407G = typedArray.getDimensionPixelSize(index, c0080a.f407G);
                    break;
                case 3:
                    c0080a.f441o = C0081c.m346a(typedArray, index, c0080a.f441o);
                    break;
                case 4:
                    c0080a.f440n = C0081c.m346a(typedArray, index, c0080a.f440n);
                    break;
                case 5:
                    c0080a.f449w = typedArray.getString(index);
                    break;
                case 6:
                    c0080a.f401A = typedArray.getDimensionPixelOffset(index, c0080a.f401A);
                    break;
                case 7:
                    c0080a.f402B = typedArray.getDimensionPixelOffset(index, c0080a.f402B);
                    break;
                case 8:
                    c0080a.f408H = typedArray.getDimensionPixelSize(index, c0080a.f408H);
                    break;
                case 9:
                    c0080a.f446t = C0081c.m346a(typedArray, index, c0080a.f446t);
                    break;
                case 10:
                    c0080a.f445s = C0081c.m346a(typedArray, index, c0080a.f445s);
                    break;
                case 11:
                    c0080a.f414N = typedArray.getDimensionPixelSize(index, c0080a.f414N);
                    break;
                case 12:
                    c0080a.f415O = typedArray.getDimensionPixelSize(index, c0080a.f415O);
                    break;
                case 13:
                    c0080a.f411K = typedArray.getDimensionPixelSize(index, c0080a.f411K);
                    break;
                case 14:
                    c0080a.f413M = typedArray.getDimensionPixelSize(index, c0080a.f413M);
                    break;
                case 15:
                    c0080a.f416P = typedArray.getDimensionPixelSize(index, c0080a.f416P);
                    break;
                case 16:
                    c0080a.f412L = typedArray.getDimensionPixelSize(index, c0080a.f412L);
                    break;
                case 17:
                    c0080a.f431e = typedArray.getDimensionPixelOffset(index, c0080a.f431e);
                    break;
                case 18:
                    c0080a.f432f = typedArray.getDimensionPixelOffset(index, c0080a.f432f);
                    break;
                case 19:
                    c0080a.f433g = typedArray.getFloat(index, c0080a.f433g);
                    break;
                case 20:
                    c0080a.f447u = typedArray.getFloat(index, c0080a.f447u);
                    break;
                case 21:
                    c0080a.f429c = typedArray.getLayoutDimension(index, c0080a.f429c);
                    break;
                case 22:
                    c0080a.f410J = typedArray.getInt(index, c0080a.f410J);
                    c0080a.f410J = f453a[c0080a.f410J];
                    break;
                case 23:
                    c0080a.f428b = typedArray.getLayoutDimension(index, c0080a.f428b);
                    break;
                case 24:
                    c0080a.f404D = typedArray.getDimensionPixelSize(index, c0080a.f404D);
                    break;
                case 25:
                    c0080a.f434h = C0081c.m346a(typedArray, index, c0080a.f434h);
                    break;
                case 26:
                    c0080a.f435i = C0081c.m346a(typedArray, index, c0080a.f435i);
                    break;
                case 27:
                    c0080a.f403C = typedArray.getInt(index, c0080a.f403C);
                    break;
                case 28:
                    c0080a.f405E = typedArray.getDimensionPixelSize(index, c0080a.f405E);
                    break;
                case 29:
                    c0080a.f436j = C0081c.m346a(typedArray, index, c0080a.f436j);
                    break;
                case 30:
                    c0080a.f437k = C0081c.m346a(typedArray, index, c0080a.f437k);
                    break;
                case 31:
                    c0080a.f409I = typedArray.getDimensionPixelSize(index, c0080a.f409I);
                    break;
                case 32:
                    c0080a.f443q = C0081c.m346a(typedArray, index, c0080a.f443q);
                    break;
                case 33:
                    c0080a.f444r = C0081c.m346a(typedArray, index, c0080a.f444r);
                    break;
                case 34:
                    c0080a.f406F = typedArray.getDimensionPixelSize(index, c0080a.f406F);
                    break;
                case 35:
                    c0080a.f439m = C0081c.m346a(typedArray, index, c0080a.f439m);
                    break;
                case 36:
                    c0080a.f438l = C0081c.m346a(typedArray, index, c0080a.f438l);
                    break;
                case 37:
                    c0080a.f448v = typedArray.getFloat(index, c0080a.f448v);
                    break;
                case 38:
                    c0080a.f430d = typedArray.getResourceId(index, c0080a.f430d);
                    break;
                case 39:
                    c0080a.f418R = typedArray.getFloat(index, c0080a.f418R);
                    break;
                case 40:
                    c0080a.f417Q = typedArray.getFloat(index, c0080a.f417Q);
                    break;
                case 41:
                    c0080a.f419S = typedArray.getInt(index, c0080a.f419S);
                    break;
                case 42:
                    c0080a.f420T = typedArray.getInt(index, c0080a.f420T);
                    break;
                case 43:
                    c0080a.f421U = typedArray.getFloat(index, c0080a.f421U);
                    break;
                case 44:
                    c0080a.f422V = true;
                    c0080a.f423W = typedArray.getDimension(index, c0080a.f423W);
                    break;
                case 45:
                    c0080a.f425Y = typedArray.getFloat(index, c0080a.f425Y);
                    break;
                case 46:
                    c0080a.f426Z = typedArray.getFloat(index, c0080a.f426Z);
                    break;
                case 47:
                    c0080a.aa = typedArray.getFloat(index, c0080a.aa);
                    break;
                case 48:
                    c0080a.ab = typedArray.getFloat(index, c0080a.ab);
                    break;
                case 49:
                    c0080a.ac = typedArray.getFloat(index, c0080a.ac);
                    break;
                case 50:
                    c0080a.ad = typedArray.getFloat(index, c0080a.ad);
                    break;
                case 51:
                    c0080a.ae = typedArray.getDimension(index, c0080a.ae);
                    break;
                case 52:
                    c0080a.af = typedArray.getDimension(index, c0080a.af);
                    break;
                case 53:
                    c0080a.ag = typedArray.getDimension(index, c0080a.ag);
                    break;
                default:
                    switch (i2) {
                        case 60:
                            c0080a.f424X = typedArray.getFloat(index, c0080a.f424X);
                            break;
                        case 61:
                            c0080a.f450x = C0081c.m346a(typedArray, index, c0080a.f450x);
                            break;
                        case 62:
                            c0080a.f451y = typedArray.getDimensionPixelSize(index, c0080a.f451y);
                            break;
                        case 63:
                            c0080a.f452z = typedArray.getFloat(index, c0080a.f452z);
                            break;
                        default:
                            String str;
                            StringBuilder stringBuilder;
                            String str2;
                            switch (i2) {
                                case 69:
                                    c0080a.ap = typedArray.getFloat(index, 1.0f);
                                    continue;
                                case 70:
                                    c0080a.aq = typedArray.getFloat(index, 1.0f);
                                    continue;
                                case 71:
                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    continue;
                                case 72:
                                    c0080a.as = typedArray.getInt(index, c0080a.as);
                                    continue;
                                case 73:
                                    c0080a.av = typedArray.getString(index);
                                    continue;
                                case 74:
                                    c0080a.ar = typedArray.getBoolean(index, c0080a.ar);
                                    continue;
                                case 75:
                                    str = "ConstraintSet";
                                    stringBuilder = new StringBuilder();
                                    str2 = "unused attribute 0x";
                                    break;
                                default:
                                    str = "ConstraintSet";
                                    stringBuilder = new StringBuilder();
                                    str2 = "Unknown attribute 0x";
                                    break;
                            }
                            stringBuilder.append(str2);
                            stringBuilder.append(Integer.toHexString(index));
                            stringBuilder.append("   ");
                            stringBuilder.append(f454c.get(index));
                            Log.w(str, stringBuilder.toString());
                            break;
                    }
            }
        }
    }

    /* renamed from: a */
    private int[] m349a(android.view.View r10, java.lang.String r11) {
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
        r0 = ",";
        r11 = r11.split(r0);
        r0 = r10.getContext();
        r1 = r11.length;
        r1 = new int[r1];
        r2 = 0;
        r3 = 0;
        r4 = 0;
    L_0x0010:
        r5 = r11.length;
        if (r3 >= r5) goto L_0x0064;
    L_0x0013:
        r5 = r11[r3];
        r5 = r5.trim();
        r6 = android.support.constraint.C0087g.C0085a.class;	 Catch:{ Exception -> 0x0025 }
        r6 = r6.getField(r5);	 Catch:{ Exception -> 0x0025 }
        r7 = 0;	 Catch:{ Exception -> 0x0025 }
        r6 = r6.getInt(r7);	 Catch:{ Exception -> 0x0025 }
        goto L_0x0026;
    L_0x0025:
        r6 = 0;
    L_0x0026:
        if (r6 != 0) goto L_0x0036;
    L_0x0028:
        r6 = r0.getResources();
        r7 = "id";
        r8 = r0.getPackageName();
        r6 = r6.getIdentifier(r5, r7, r8);
    L_0x0036:
        if (r6 != 0) goto L_0x005c;
    L_0x0038:
        r7 = r10.isInEditMode();
        if (r7 == 0) goto L_0x005c;
    L_0x003e:
        r7 = r10.getParent();
        r7 = r7 instanceof android.support.constraint.ConstraintLayout;
        if (r7 == 0) goto L_0x005c;
    L_0x0046:
        r7 = r10.getParent();
        r7 = (android.support.constraint.ConstraintLayout) r7;
        r5 = r7.m130a(r2, r5);
        if (r5 == 0) goto L_0x005c;
    L_0x0052:
        r7 = r5 instanceof java.lang.Integer;
        if (r7 == 0) goto L_0x005c;
    L_0x0056:
        r5 = (java.lang.Integer) r5;
        r6 = r5.intValue();
    L_0x005c:
        r5 = r4 + 1;
        r1[r4] = r6;
        r3 = r3 + 1;
        r4 = r5;
        goto L_0x0010;
    L_0x0064:
        r10 = r11.length;
        if (r4 == r10) goto L_0x006b;
    L_0x0067:
        r1 = java.util.Arrays.copyOf(r1, r4);
    L_0x006b:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.c.a(android.view.View, java.lang.String):int[]");
    }

    /* renamed from: a */
    public void m350a(Context context, int i) {
        XmlPullParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    switch (eventType) {
                        case 2:
                            String name = xml.getName();
                            C0080a a = m347a(context, Xml.asAttributeSet(xml));
                            if (name.equalsIgnoreCase("Guideline")) {
                                a.f427a = true;
                            }
                            this.f455b.put(Integer.valueOf(a.f430d), a);
                            break;
                        case 3:
                            break;
                        default:
                            break;
                    }
                }
                xml.getName();
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    void m351a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f455b.keySet());
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (id != -1) {
                if (this.f455b.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C0080a c0080a = (C0080a) this.f455b.get(Integer.valueOf(id));
                    if (childAt instanceof C0520a) {
                        c0080a.at = 1;
                    }
                    if (c0080a.at != -1) {
                        if (c0080a.at == 1) {
                            View view = (C0520a) childAt;
                            view.setId(id);
                            view.setType(c0080a.as);
                            view.setAllowsGoneWidget(c0080a.ar);
                            if (c0080a.au == null) {
                                if (c0080a.av != null) {
                                    c0080a.au = m349a(view, c0080a.av);
                                }
                            }
                            view.setReferencedIds(c0080a.au);
                        }
                    }
                    C0050a c0050a = (C0050a) childAt.getLayoutParams();
                    c0080a.m345a(c0050a);
                    childAt.setLayoutParams(c0050a);
                    childAt.setVisibility(c0080a.f410J);
                    if (VERSION.SDK_INT >= 17) {
                        childAt.setAlpha(c0080a.f421U);
                        childAt.setRotation(c0080a.f424X);
                        childAt.setRotationX(c0080a.f425Y);
                        childAt.setRotationY(c0080a.f426Z);
                        childAt.setScaleX(c0080a.aa);
                        childAt.setScaleY(c0080a.ab);
                        if (!Float.isNaN(c0080a.ac)) {
                            childAt.setPivotX(c0080a.ac);
                        }
                        if (!Float.isNaN(c0080a.ad)) {
                            childAt.setPivotY(c0080a.ad);
                        }
                        childAt.setTranslationX(c0080a.ae);
                        childAt.setTranslationY(c0080a.af);
                        if (VERSION.SDK_INT >= 21) {
                            childAt.setTranslationZ(c0080a.ag);
                            if (c0080a.f422V) {
                                childAt.setElevation(c0080a.f423W);
                            }
                        }
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0080a c0080a2 = (C0080a) this.f455b.get(num);
            if (c0080a2.at != -1) {
                if (c0080a2.at == 1) {
                    LayoutParams a;
                    childAt = new C0520a(constraintLayout.getContext());
                    childAt.setId(num.intValue());
                    if (c0080a2.au == null) {
                        if (c0080a2.av != null) {
                            c0080a2.au = m349a(childAt, c0080a2.av);
                        }
                        childAt.setType(c0080a2.as);
                        a = constraintLayout.m126a();
                        childAt.m334a();
                        c0080a2.m345a(a);
                        constraintLayout.addView(childAt, a);
                    }
                    childAt.setReferencedIds(c0080a2.au);
                    childAt.setType(c0080a2.as);
                    a = constraintLayout.m126a();
                    childAt.m334a();
                    c0080a2.m345a(a);
                    constraintLayout.addView(childAt, a);
                }
            }
            if (c0080a2.f427a) {
                childAt = new C0083e(constraintLayout.getContext());
                childAt.setId(num.intValue());
                LayoutParams a2 = constraintLayout.m126a();
                c0080a2.m345a(a2);
                constraintLayout.addView(childAt, a2);
            }
        }
    }

    /* renamed from: a */
    public void m352a(C0082d c0082d) {
        int childCount = c0082d.getChildCount();
        this.f455b.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = c0082d.getChildAt(i);
            C0521a c0521a = (C0521a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!this.f455b.containsKey(Integer.valueOf(id))) {
                    this.f455b.put(Integer.valueOf(id), new C0080a());
                }
                C0080a c0080a = (C0080a) this.f455b.get(Integer.valueOf(id));
                if (childAt instanceof C0078b) {
                    c0080a.m341a((C0078b) childAt, id, c0521a);
                }
                c0080a.m340a(id, c0521a);
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }
}
