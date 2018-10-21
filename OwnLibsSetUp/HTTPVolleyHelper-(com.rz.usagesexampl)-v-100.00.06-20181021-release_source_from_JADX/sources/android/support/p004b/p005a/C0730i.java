package android.support.p004b.p005a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;
import android.os.Build.VERSION;
import android.support.v4.p008a.p009a.C0094b;
import android.support.v4.p008a.p009a.C0095c;
import android.support.v4.p010b.C0162b;
import android.support.v4.p010b.C0162b.C0161b;
import android.support.v4.p010b.p011a.C0155a;
import android.support.v4.p016f.C0549a;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.b.a.i */
public class C0730i extends C0510h {
    /* renamed from: a */
    static final Mode f2603a = Mode.SRC_IN;
    /* renamed from: c */
    private C0047f f2604c;
    /* renamed from: d */
    private PorterDuffColorFilter f2605d;
    /* renamed from: e */
    private ColorFilter f2606e;
    /* renamed from: f */
    private boolean f2607f;
    /* renamed from: g */
    private boolean f2608g;
    /* renamed from: h */
    private ConstantState f2609h;
    /* renamed from: i */
    private final float[] f2610i;
    /* renamed from: j */
    private final Matrix f2611j;
    /* renamed from: k */
    private final Rect f2612k;

    /* renamed from: android.support.b.a.i$c */
    private static class C0044c {
        /* renamed from: a */
        final ArrayList<Object> f65a = new ArrayList();
        /* renamed from: b */
        float f66b = 0.0f;
        /* renamed from: c */
        int f67c;
        /* renamed from: d */
        private final Matrix f68d = new Matrix();
        /* renamed from: e */
        private float f69e = 0.0f;
        /* renamed from: f */
        private float f70f = 0.0f;
        /* renamed from: g */
        private float f71g = 1.0f;
        /* renamed from: h */
        private float f72h = 1.0f;
        /* renamed from: i */
        private float f73i = 0.0f;
        /* renamed from: j */
        private float f74j = 0.0f;
        /* renamed from: k */
        private final Matrix f75k = new Matrix();
        /* renamed from: l */
        private int[] f76l;
        /* renamed from: m */
        private String f77m = null;

        public C0044c(C0044c c0044c, C0549a<String, Object> c0549a) {
            this.f66b = c0044c.f66b;
            this.f69e = c0044c.f69e;
            this.f70f = c0044c.f70f;
            this.f71g = c0044c.f71g;
            this.f72h = c0044c.f72h;
            this.f73i = c0044c.f73i;
            this.f74j = c0044c.f74j;
            this.f76l = c0044c.f76l;
            this.f77m = c0044c.f77m;
            this.f67c = c0044c.f67c;
            if (this.f77m != null) {
                c0549a.put(this.f77m, this);
            }
            this.f75k.set(c0044c.f75k);
            ArrayList arrayList = c0044c.f65a;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof C0044c) {
                    this.f65a.add(new C0044c((C0044c) obj, c0549a));
                } else {
                    C0045d c0512b;
                    if (obj instanceof C0512b) {
                        c0512b = new C0512b((C0512b) obj);
                    } else if (obj instanceof C0511a) {
                        c0512b = new C0511a((C0511a) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f65a.add(c0512b);
                    if (c0512b.f79n != null) {
                        c0549a.put(c0512b.f79n, c0512b);
                    }
                }
            }
        }

        /* renamed from: a */
        private void m94a() {
            this.f75k.reset();
            this.f75k.postTranslate(-this.f69e, -this.f70f);
            this.f75k.postScale(this.f71g, this.f72h);
            this.f75k.postRotate(this.f66b, 0.0f, 0.0f);
            this.f75k.postTranslate(this.f73i + this.f69e, this.f74j + this.f70f);
        }

        /* renamed from: a */
        private void m95a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f76l = null;
            this.f66b = C0095c.m376a(typedArray, xmlPullParser, "rotation", 5, this.f66b);
            this.f69e = typedArray.getFloat(1, this.f69e);
            this.f70f = typedArray.getFloat(2, this.f70f);
            this.f71g = C0095c.m376a(typedArray, xmlPullParser, "scaleX", 3, this.f71g);
            this.f72h = C0095c.m376a(typedArray, xmlPullParser, "scaleY", 4, this.f72h);
            this.f73i = C0095c.m376a(typedArray, xmlPullParser, "translateX", 6, this.f73i);
            this.f74j = C0095c.m376a(typedArray, xmlPullParser, "translateY", 7, this.f74j);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f77m = string;
            }
            m94a();
        }

        /* renamed from: a */
        public void m97a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C0095c.m378a(resources, theme, attributeSet, C0033a.f43b);
            m95a(a, xmlPullParser);
            a.recycle();
        }

        public String getGroupName() {
            return this.f77m;
        }

        public Matrix getLocalMatrix() {
            return this.f75k;
        }

        public float getPivotX() {
            return this.f69e;
        }

        public float getPivotY() {
            return this.f70f;
        }

        public float getRotation() {
            return this.f66b;
        }

        public float getScaleX() {
            return this.f71g;
        }

        public float getScaleY() {
            return this.f72h;
        }

        public float getTranslateX() {
            return this.f73i;
        }

        public float getTranslateY() {
            return this.f74j;
        }

        public void setPivotX(float f) {
            if (f != this.f69e) {
                this.f69e = f;
                m94a();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f70f) {
                this.f70f = f;
                m94a();
            }
        }

        public void setRotation(float f) {
            if (f != this.f66b) {
                this.f66b = f;
                m94a();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f71g) {
                this.f71g = f;
                m94a();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f72h) {
                this.f72h = f;
                m94a();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f73i) {
                this.f73i = f;
                m94a();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f74j) {
                this.f74j = f;
                m94a();
            }
        }
    }

    /* renamed from: android.support.b.a.i$d */
    private static class C0045d {
        /* renamed from: m */
        protected C0161b[] f78m = null;
        /* renamed from: n */
        String f79n;
        /* renamed from: o */
        int f80o;

        public C0045d(C0045d c0045d) {
            this.f79n = c0045d.f79n;
            this.f80o = c0045d.f80o;
            this.f78m = C0162b.m592a(c0045d.f78m);
        }

        /* renamed from: a */
        public void m98a(Path path) {
            path.reset();
            if (this.f78m != null) {
                C0161b.m584a(this.f78m, path);
            }
        }

        /* renamed from: a */
        public boolean mo11a() {
            return false;
        }

        public C0161b[] getPathData() {
            return this.f78m;
        }

        public String getPathName() {
            return this.f79n;
        }

        public void setPathData(C0161b[] c0161bArr) {
            if (C0162b.m590a(this.f78m, c0161bArr)) {
                C0162b.m593b(this.f78m, c0161bArr);
            } else {
                this.f78m = C0162b.m592a(c0161bArr);
            }
        }
    }

    /* renamed from: android.support.b.a.i$e */
    private static class C0046e {
        /* renamed from: k */
        private static final Matrix f81k = new Matrix();
        /* renamed from: a */
        final C0044c f82a;
        /* renamed from: b */
        float f83b;
        /* renamed from: c */
        float f84c;
        /* renamed from: d */
        float f85d;
        /* renamed from: e */
        float f86e;
        /* renamed from: f */
        int f87f;
        /* renamed from: g */
        String f88g;
        /* renamed from: h */
        final C0549a<String, Object> f89h;
        /* renamed from: i */
        private final Path f90i;
        /* renamed from: j */
        private final Path f91j;
        /* renamed from: l */
        private final Matrix f92l;
        /* renamed from: m */
        private Paint f93m;
        /* renamed from: n */
        private Paint f94n;
        /* renamed from: o */
        private PathMeasure f95o;
        /* renamed from: p */
        private int f96p;

        public C0046e() {
            this.f92l = new Matrix();
            this.f83b = 0.0f;
            this.f84c = 0.0f;
            this.f85d = 0.0f;
            this.f86e = 0.0f;
            this.f87f = 255;
            this.f88g = null;
            this.f89h = new C0549a();
            this.f82a = new C0044c();
            this.f90i = new Path();
            this.f91j = new Path();
        }

        public C0046e(C0046e c0046e) {
            this.f92l = new Matrix();
            this.f83b = 0.0f;
            this.f84c = 0.0f;
            this.f85d = 0.0f;
            this.f86e = 0.0f;
            this.f87f = 255;
            this.f88g = null;
            this.f89h = new C0549a();
            this.f82a = new C0044c(c0046e.f82a, this.f89h);
            this.f90i = new Path(c0046e.f90i);
            this.f91j = new Path(c0046e.f91j);
            this.f83b = c0046e.f83b;
            this.f84c = c0046e.f84c;
            this.f85d = c0046e.f85d;
            this.f86e = c0046e.f86e;
            this.f96p = c0046e.f96p;
            this.f87f = c0046e.f87f;
            this.f88g = c0046e.f88g;
            if (c0046e.f88g != null) {
                this.f89h.put(c0046e.f88g, this);
            }
        }

        /* renamed from: a */
        private static float m100a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: a */
        private float m101a(Matrix matrix) {
            float[] fArr = new float[]{0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot((double) fArr[0], (double) fArr[1]);
            float hypot2 = (float) Math.hypot((double) fArr[2], (double) fArr[3]);
            float a = C0046e.m100a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            return max > 0.0f ? Math.abs(a) / max : 0.0f;
        }

        /* renamed from: a */
        private void m104a(C0044c c0044c, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            c0044c.f68d.set(matrix);
            c0044c.f68d.preConcat(c0044c.f75k);
            canvas.save();
            for (int i3 = 0; i3 < c0044c.f65a.size(); i3++) {
                Object obj = c0044c.f65a.get(i3);
                if (obj instanceof C0044c) {
                    m104a((C0044c) obj, c0044c.f68d, canvas, i, i2, colorFilter);
                } else if (obj instanceof C0045d) {
                    m105a(c0044c, (C0045d) obj, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: a */
        private void m105a(C0044c c0044c, C0045d c0045d, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = ((float) i) / this.f85d;
            float f2 = ((float) i2) / this.f86e;
            float min = Math.min(f, f2);
            Matrix a = c0044c.f68d;
            this.f92l.set(a);
            this.f92l.postScale(f, f2);
            float a2 = m101a(a);
            if (a2 != 0.0f) {
                c0045d.m98a(this.f90i);
                Path path = this.f90i;
                this.f91j.reset();
                if (c0045d.mo11a()) {
                    this.f91j.addPath(path, this.f92l);
                    canvas.clipPath(this.f91j);
                } else {
                    Paint paint;
                    C0512b c0512b = (C0512b) c0045d;
                    if (!(c0512b.f1789g == 0.0f && c0512b.f1790h == 1.0f)) {
                        float f3 = (c0512b.f1789g + c0512b.f1791i) % 1.0f;
                        float f4 = (c0512b.f1790h + c0512b.f1791i) % 1.0f;
                        if (this.f95o == null) {
                            this.f95o = new PathMeasure();
                        }
                        this.f95o.setPath(this.f90i, false);
                        float length = this.f95o.getLength();
                        f3 *= length;
                        f4 *= length;
                        path.reset();
                        if (f3 > f4) {
                            this.f95o.getSegment(f3, length, path, true);
                            this.f95o.getSegment(0.0f, f4, path, true);
                        } else {
                            this.f95o.getSegment(f3, f4, path, true);
                        }
                        path.rLineTo(0.0f, 0.0f);
                    }
                    this.f91j.addPath(path, this.f92l);
                    if (c0512b.f1785c != 0) {
                        if (this.f94n == null) {
                            this.f94n = new Paint();
                            this.f94n.setStyle(Style.FILL);
                            this.f94n.setAntiAlias(true);
                        }
                        paint = this.f94n;
                        paint.setColor(C0730i.m3336a(c0512b.f1785c, c0512b.f1788f));
                        paint.setColorFilter(colorFilter);
                        this.f91j.setFillType(c0512b.f1787e == 0 ? FillType.WINDING : FillType.EVEN_ODD);
                        canvas.drawPath(this.f91j, paint);
                    }
                    if (c0512b.f1783a != 0) {
                        if (this.f93m == null) {
                            this.f93m = new Paint();
                            this.f93m.setStyle(Style.STROKE);
                            this.f93m.setAntiAlias(true);
                        }
                        paint = this.f93m;
                        if (c0512b.f1793k != null) {
                            paint.setStrokeJoin(c0512b.f1793k);
                        }
                        if (c0512b.f1792j != null) {
                            paint.setStrokeCap(c0512b.f1792j);
                        }
                        paint.setStrokeMiter(c0512b.f1794l);
                        paint.setColor(C0730i.m3336a(c0512b.f1783a, c0512b.f1786d));
                        paint.setColorFilter(colorFilter);
                        paint.setStrokeWidth(c0512b.f1784b * (min * a2));
                        canvas.drawPath(this.f91j, paint);
                    }
                }
            }
        }

        /* renamed from: a */
        public void m108a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m104a(this.f82a, f81k, canvas, i, i2, colorFilter);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f87f;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f87f = i;
        }
    }

    /* renamed from: android.support.b.a.i$f */
    private static class C0047f extends ConstantState {
        /* renamed from: a */
        int f97a;
        /* renamed from: b */
        C0046e f98b;
        /* renamed from: c */
        ColorStateList f99c;
        /* renamed from: d */
        Mode f100d;
        /* renamed from: e */
        boolean f101e;
        /* renamed from: f */
        Bitmap f102f;
        /* renamed from: g */
        ColorStateList f103g;
        /* renamed from: h */
        Mode f104h;
        /* renamed from: i */
        int f105i;
        /* renamed from: j */
        boolean f106j;
        /* renamed from: k */
        boolean f107k;
        /* renamed from: l */
        Paint f108l;

        public C0047f() {
            this.f99c = null;
            this.f100d = C0730i.f2603a;
            this.f98b = new C0046e();
        }

        public C0047f(C0047f c0047f) {
            this.f99c = null;
            this.f100d = C0730i.f2603a;
            if (c0047f != null) {
                this.f97a = c0047f.f97a;
                this.f98b = new C0046e(c0047f.f98b);
                if (c0047f.f98b.f94n != null) {
                    this.f98b.f94n = new Paint(c0047f.f98b.f94n);
                }
                if (c0047f.f98b.f93m != null) {
                    this.f98b.f93m = new Paint(c0047f.f98b.f93m);
                }
                this.f99c = c0047f.f99c;
                this.f100d = c0047f.f100d;
                this.f101e = c0047f.f101e;
            }
        }

        /* renamed from: a */
        public Paint m109a(ColorFilter colorFilter) {
            if (!m112a() && colorFilter == null) {
                return null;
            }
            if (this.f108l == null) {
                this.f108l = new Paint();
                this.f108l.setFilterBitmap(true);
            }
            this.f108l.setAlpha(this.f98b.getRootAlpha());
            this.f108l.setColorFilter(colorFilter);
            return this.f108l;
        }

        /* renamed from: a */
        public void m110a(int i, int i2) {
            this.f102f.eraseColor(0);
            this.f98b.m108a(new Canvas(this.f102f), i, i2, null);
        }

        /* renamed from: a */
        public void m111a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f102f, null, rect, m109a(colorFilter));
        }

        /* renamed from: a */
        public boolean m112a() {
            return this.f98b.getRootAlpha() < 255;
        }

        /* renamed from: b */
        public void m113b(int i, int i2) {
            if (this.f102f == null || !m116c(i, i2)) {
                this.f102f = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
                this.f107k = true;
            }
        }

        /* renamed from: b */
        public boolean m114b() {
            return !this.f107k && this.f103g == this.f99c && this.f104h == this.f100d && this.f106j == this.f101e && this.f105i == this.f98b.getRootAlpha();
        }

        /* renamed from: c */
        public void m115c() {
            this.f103g = this.f99c;
            this.f104h = this.f100d;
            this.f105i = this.f98b.getRootAlpha();
            this.f106j = this.f101e;
            this.f107k = false;
        }

        /* renamed from: c */
        public boolean m116c(int i, int i2) {
            return i == this.f102f.getWidth() && i2 == this.f102f.getHeight();
        }

        public int getChangingConfigurations() {
            return this.f97a;
        }

        public Drawable newDrawable() {
            return new C0730i(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0730i(this);
        }
    }

    /* renamed from: android.support.b.a.i$g */
    private static class C0048g extends ConstantState {
        /* renamed from: a */
        private final ConstantState f109a;

        public C0048g(ConstantState constantState) {
            this.f109a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f109a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f109a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            Drawable c0730i = new C0730i();
            c0730i.b = (VectorDrawable) this.f109a.newDrawable();
            return c0730i;
        }

        public Drawable newDrawable(Resources resources) {
            Drawable c0730i = new C0730i();
            c0730i.b = (VectorDrawable) this.f109a.newDrawable(resources);
            return c0730i;
        }

        public Drawable newDrawable(Resources resources, Theme theme) {
            Drawable c0730i = new C0730i();
            c0730i.b = (VectorDrawable) this.f109a.newDrawable(resources, theme);
            return c0730i;
        }
    }

    /* renamed from: android.support.b.a.i$a */
    private static class C0511a extends C0045d {
        public C0511a(C0511a c0511a) {
            super(c0511a);
        }

        /* renamed from: a */
        private void m1995a(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.n = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.m = C0162b.m594b(string2);
            }
        }

        /* renamed from: a */
        public void m1996a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            if (C0095c.m381a(xmlPullParser, "pathData")) {
                TypedArray a = C0095c.m378a(resources, theme, attributeSet, C0033a.f45d);
                m1995a(a);
                a.recycle();
            }
        }

        /* renamed from: a */
        public boolean mo11a() {
            return true;
        }
    }

    /* renamed from: android.support.b.a.i$b */
    private static class C0512b extends C0045d {
        /* renamed from: a */
        int f1783a = 0;
        /* renamed from: b */
        float f1784b = 0.0f;
        /* renamed from: c */
        int f1785c = 0;
        /* renamed from: d */
        float f1786d = 1.0f;
        /* renamed from: e */
        int f1787e = 0;
        /* renamed from: f */
        float f1788f = 1.0f;
        /* renamed from: g */
        float f1789g = 0.0f;
        /* renamed from: h */
        float f1790h = 1.0f;
        /* renamed from: i */
        float f1791i = 0.0f;
        /* renamed from: j */
        Cap f1792j = Cap.BUTT;
        /* renamed from: k */
        Join f1793k = Join.MITER;
        /* renamed from: l */
        float f1794l = 4.0f;
        /* renamed from: p */
        private int[] f1795p;

        public C0512b(C0512b c0512b) {
            super(c0512b);
            this.f1795p = c0512b.f1795p;
            this.f1783a = c0512b.f1783a;
            this.f1784b = c0512b.f1784b;
            this.f1786d = c0512b.f1786d;
            this.f1785c = c0512b.f1785c;
            this.f1787e = c0512b.f1787e;
            this.f1788f = c0512b.f1788f;
            this.f1789g = c0512b.f1789g;
            this.f1790h = c0512b.f1790h;
            this.f1791i = c0512b.f1791i;
            this.f1792j = c0512b.f1792j;
            this.f1793k = c0512b.f1793k;
            this.f1794l = c0512b.f1794l;
        }

        /* renamed from: a */
        private Cap m1998a(int i, Cap cap) {
            switch (i) {
                case 0:
                    return Cap.BUTT;
                case 1:
                    return Cap.ROUND;
                case 2:
                    return Cap.SQUARE;
                default:
                    return cap;
            }
        }

        /* renamed from: a */
        private Join m1999a(int i, Join join) {
            switch (i) {
                case 0:
                    return Join.MITER;
                case 1:
                    return Join.ROUND;
                case 2:
                    return Join.BEVEL;
                default:
                    return join;
            }
        }

        /* renamed from: a */
        private void m2000a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f1795p = null;
            if (C0095c.m381a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.n = string;
                }
                string = typedArray.getString(2);
                if (string != null) {
                    this.m = C0162b.m594b(string);
                }
                this.f1785c = C0095c.m382b(typedArray, xmlPullParser, "fillColor", 1, this.f1785c);
                this.f1788f = C0095c.m376a(typedArray, xmlPullParser, "fillAlpha", 12, this.f1788f);
                this.f1792j = m1998a(C0095c.m377a(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f1792j);
                this.f1793k = m1999a(C0095c.m377a(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f1793k);
                this.f1794l = C0095c.m376a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f1794l);
                this.f1783a = C0095c.m382b(typedArray, xmlPullParser, "strokeColor", 3, this.f1783a);
                this.f1786d = C0095c.m376a(typedArray, xmlPullParser, "strokeAlpha", 11, this.f1786d);
                this.f1784b = C0095c.m376a(typedArray, xmlPullParser, "strokeWidth", 4, this.f1784b);
                this.f1790h = C0095c.m376a(typedArray, xmlPullParser, "trimPathEnd", 6, this.f1790h);
                this.f1791i = C0095c.m376a(typedArray, xmlPullParser, "trimPathOffset", 7, this.f1791i);
                this.f1789g = C0095c.m376a(typedArray, xmlPullParser, "trimPathStart", 5, this.f1789g);
                this.f1787e = C0095c.m377a(typedArray, xmlPullParser, "fillType", 13, this.f1787e);
            }
        }

        /* renamed from: a */
        public void m2001a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C0095c.m378a(resources, theme, attributeSet, C0033a.f44c);
            m2000a(a, xmlPullParser);
            a.recycle();
        }

        float getFillAlpha() {
            return this.f1788f;
        }

        int getFillColor() {
            return this.f1785c;
        }

        float getStrokeAlpha() {
            return this.f1786d;
        }

        int getStrokeColor() {
            return this.f1783a;
        }

        float getStrokeWidth() {
            return this.f1784b;
        }

        float getTrimPathEnd() {
            return this.f1790h;
        }

        float getTrimPathOffset() {
            return this.f1791i;
        }

        float getTrimPathStart() {
            return this.f1789g;
        }

        void setFillAlpha(float f) {
            this.f1788f = f;
        }

        void setFillColor(int i) {
            this.f1785c = i;
        }

        void setStrokeAlpha(float f) {
            this.f1786d = f;
        }

        void setStrokeColor(int i) {
            this.f1783a = i;
        }

        void setStrokeWidth(float f) {
            this.f1784b = f;
        }

        void setTrimPathEnd(float f) {
            this.f1790h = f;
        }

        void setTrimPathOffset(float f) {
            this.f1791i = f;
        }

        void setTrimPathStart(float f) {
            this.f1789g = f;
        }
    }

    C0730i() {
        this.f2608g = true;
        this.f2610i = new float[9];
        this.f2611j = new Matrix();
        this.f2612k = new Rect();
        this.f2604c = new C0047f();
    }

    C0730i(C0047f c0047f) {
        this.f2608g = true;
        this.f2610i = new float[9];
        this.f2611j = new Matrix();
        this.f2612k = new Rect();
        this.f2604c = c0047f;
        this.f2605d = m3343a(this.f2605d, c0047f.f99c, c0047f.f100d);
    }

    /* renamed from: a */
    static int m3336a(int i, float f) {
        return (i & 16777215) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    /* renamed from: a */
    private static Mode m3337a(int i, Mode mode) {
        if (i == 3) {
            return Mode.SRC_OVER;
        }
        if (i == 5) {
            return Mode.SRC_IN;
        }
        if (i == 9) {
            return Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                return Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: a */
    public static C0730i m3338a(Resources resources, int i, Theme theme) {
        if (VERSION.SDK_INT >= 24) {
            C0730i c0730i = new C0730i();
            c0730i.b = C0094b.m375a(resources, i, theme);
            c0730i.f2609h = new C0048g(c0730i.b.getConstantState());
            return c0730i;
        }
        try {
            int next;
            XmlPullParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    if (next == 2) {
                        return C0730i.m3339a(resources, xml, asAttributeSet, theme);
                    }
                    throw new XmlPullParserException("No start tag found");
                }
            }
            if (next == 2) {
                return C0730i.m3339a(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (Throwable e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        }
    }

    /* renamed from: a */
    public static C0730i m3339a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        C0730i c0730i = new C0730i();
        c0730i.inflate(resources, xmlPullParser, attributeSet, theme);
        return c0730i;
    }

    /* renamed from: a */
    private void m3340a(TypedArray typedArray, XmlPullParser xmlPullParser) {
        C0047f c0047f = this.f2604c;
        C0046e c0046e = c0047f.f98b;
        c0047f.f100d = C0730i.m3337a(C0095c.m377a(typedArray, xmlPullParser, "tintMode", 6, -1), Mode.SRC_IN);
        ColorStateList colorStateList = typedArray.getColorStateList(1);
        if (colorStateList != null) {
            c0047f.f99c = colorStateList;
        }
        c0047f.f101e = C0095c.m380a(typedArray, xmlPullParser, "autoMirrored", 5, c0047f.f101e);
        c0046e.f85d = C0095c.m376a(typedArray, xmlPullParser, "viewportWidth", 7, c0046e.f85d);
        c0046e.f86e = C0095c.m376a(typedArray, xmlPullParser, "viewportHeight", 8, c0046e.f86e);
        StringBuilder stringBuilder;
        if (c0046e.f85d <= 0.0f) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(typedArray.getPositionDescription());
            stringBuilder.append("<vector> tag requires viewportWidth > 0");
            throw new XmlPullParserException(stringBuilder.toString());
        } else if (c0046e.f86e > 0.0f) {
            c0046e.f83b = typedArray.getDimension(3, c0046e.f83b);
            c0046e.f84c = typedArray.getDimension(2, c0046e.f84c);
            if (c0046e.f83b <= 0.0f) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(typedArray.getPositionDescription());
                stringBuilder.append("<vector> tag requires width > 0");
                throw new XmlPullParserException(stringBuilder.toString());
            } else if (c0046e.f84c > 0.0f) {
                c0046e.setAlpha(C0095c.m376a(typedArray, xmlPullParser, "alpha", 4, c0046e.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    c0046e.f88g = string;
                    c0046e.f89h.put(string, c0046e);
                }
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(typedArray.getPositionDescription());
                stringBuilder.append("<vector> tag requires height > 0");
                throw new XmlPullParserException(stringBuilder.toString());
            }
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(typedArray.getPositionDescription());
            stringBuilder.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    private boolean m3341a() {
        return VERSION.SDK_INT >= 17 && isAutoMirrored() && C0155a.m573g(this) == 1;
    }

    /* renamed from: b */
    private void m3342b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        C0047f c0047f = this.f2604c;
        C0046e c0046e = c0047f.f98b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c0046e.f82a);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        Object obj = 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                int i;
                String name = xmlPullParser.getName();
                C0044c c0044c = (C0044c) arrayDeque.peek();
                if ("path".equals(name)) {
                    C0512b c0512b = new C0512b();
                    c0512b.m2001a(resources, attributeSet, theme, xmlPullParser);
                    c0044c.f65a.add(c0512b);
                    if (c0512b.getPathName() != null) {
                        c0046e.f89h.put(c0512b.getPathName(), c0512b);
                    }
                    obj = null;
                    i = c0047f.f97a;
                    eventType = c0512b.o;
                } else if ("clip-path".equals(name)) {
                    C0511a c0511a = new C0511a();
                    c0511a.m1996a(resources, attributeSet, theme, xmlPullParser);
                    c0044c.f65a.add(c0511a);
                    if (c0511a.getPathName() != null) {
                        c0046e.f89h.put(c0511a.getPathName(), c0511a);
                    }
                    i = c0047f.f97a;
                    eventType = c0511a.o;
                } else if ("group".equals(name)) {
                    C0044c c0044c2 = new C0044c();
                    c0044c2.m97a(resources, attributeSet, theme, xmlPullParser);
                    c0044c.f65a.add(c0044c2);
                    arrayDeque.push(c0044c2);
                    if (c0044c2.getGroupName() != null) {
                        c0046e.f89h.put(c0044c2.getGroupName(), c0044c2);
                    }
                    i = c0047f.f97a;
                    eventType = c0044c2.f67c;
                }
                c0047f.f97a = eventType | i;
            } else if (eventType == 3) {
                if ("group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
        }
        if (obj != null) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* renamed from: a */
    PorterDuffColorFilter m3343a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, Mode mode) {
        if (colorStateList != null) {
            if (mode != null) {
                return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            }
        }
        return null;
    }

    /* renamed from: a */
    Object m3344a(String str) {
        return this.f2604c.f98b.f89h.get(str);
    }

    /* renamed from: a */
    void m3345a(boolean z) {
        this.f2608g = z;
    }

    public /* bridge */ /* synthetic */ void applyTheme(Theme theme) {
        super.applyTheme(theme);
    }

    public boolean canApplyTheme() {
        if (this.b != null) {
            C0155a.m570d(this.b);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        if (this.b != null) {
            this.b.draw(canvas);
            return;
        }
        copyBounds(this.f2612k);
        if (this.f2612k.width() > 0) {
            if (this.f2612k.height() > 0) {
                ColorFilter colorFilter = this.f2606e == null ? this.f2605d : this.f2606e;
                canvas.getMatrix(this.f2611j);
                this.f2611j.getValues(this.f2610i);
                float abs = Math.abs(this.f2610i[0]);
                float abs2 = Math.abs(this.f2610i[4]);
                float abs3 = Math.abs(this.f2610i[1]);
                float abs4 = Math.abs(this.f2610i[3]);
                if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                    abs = 1.0f;
                    abs2 = 1.0f;
                }
                int height = (int) (((float) this.f2612k.height()) * abs2);
                int min = Math.min(2048, (int) (((float) this.f2612k.width()) * abs));
                height = Math.min(2048, height);
                if (min > 0) {
                    if (height > 0) {
                        int save = canvas.save();
                        canvas.translate((float) this.f2612k.left, (float) this.f2612k.top);
                        if (m3341a()) {
                            canvas.translate((float) this.f2612k.width(), 0.0f);
                            canvas.scale(-1.0f, 1.0f);
                        }
                        this.f2612k.offsetTo(0, 0);
                        this.f2604c.m113b(min, height);
                        if (!this.f2608g) {
                            this.f2604c.m110a(min, height);
                        } else if (!this.f2604c.m114b()) {
                            this.f2604c.m110a(min, height);
                            this.f2604c.m115c();
                        }
                        this.f2604c.m111a(canvas, colorFilter, this.f2612k);
                        canvas.restoreToCount(save);
                    }
                }
            }
        }
    }

    public int getAlpha() {
        return this.b != null ? C0155a.m569c(this.b) : this.f2604c.f98b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        return this.b != null ? this.b.getChangingConfigurations() : super.getChangingConfigurations() | this.f2604c.getChangingConfigurations();
    }

    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public ConstantState getConstantState() {
        if (this.b != null && VERSION.SDK_INT >= 24) {
            return new C0048g(this.b.getConstantState());
        }
        this.f2604c.f97a = getChangingConfigurations();
        return this.f2604c;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.b != null ? this.b.getIntrinsicHeight() : (int) this.f2604c.f98b.f84c;
    }

    public int getIntrinsicWidth() {
        return this.b != null ? this.b.getIntrinsicWidth() : (int) this.f2604c.f98b.f83b;
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        return this.b != null ? this.b.getOpacity() : -3;
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        if (this.b != null) {
            this.b.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        if (this.b != null) {
            C0155a.m564a(this.b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0047f c0047f = this.f2604c;
        c0047f.f98b = new C0046e();
        TypedArray a = C0095c.m378a(resources, theme, attributeSet, C0033a.f42a);
        m3340a(a, xmlPullParser);
        a.recycle();
        c0047f.f97a = getChangingConfigurations();
        c0047f.f107k = true;
        m3342b(resources, xmlPullParser, attributeSet, theme);
        this.f2605d = m3343a(this.f2605d, c0047f.f99c, c0047f.f100d);
    }

    public void invalidateSelf() {
        if (this.b != null) {
            this.b.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        return this.b != null ? C0155a.m567b(this.b) : this.f2604c.f101e;
    }

    public boolean isStateful() {
        if (this.b != null) {
            return this.b.isStateful();
        }
        boolean z;
        if (!super.isStateful()) {
            if (this.f2604c == null || this.f2604c.f99c == null || !this.f2604c.f99c.isStateful()) {
                z = false;
                return z;
            }
        }
        z = true;
        return z;
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (this.b != null) {
            this.b.mutate();
            return this;
        }
        if (!this.f2607f && super.mutate() == this) {
            this.f2604c = new C0047f(this.f2604c);
            this.f2607f = true;
        }
        return this;
    }

    protected void onBoundsChange(Rect rect) {
        if (this.b != null) {
            this.b.setBounds(rect);
        }
    }

    protected boolean onStateChange(int[] iArr) {
        if (this.b != null) {
            return this.b.setState(iArr);
        }
        C0047f c0047f = this.f2604c;
        if (c0047f.f99c == null || c0047f.f100d == null) {
            return false;
        }
        this.f2605d = m3343a(this.f2605d, c0047f.f99c, c0047f.f100d);
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        if (this.b != null) {
            this.b.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (this.b != null) {
            this.b.setAlpha(i);
            return;
        }
        if (this.f2604c.f98b.getRootAlpha() != i) {
            this.f2604c.f98b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        if (this.b != null) {
            C0155a.m566a(this.b, z);
        } else {
            this.f2604c.f101e = z;
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, Mode mode) {
        super.setColorFilter(i, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.b != null) {
            this.b.setColorFilter(colorFilter);
            return;
        }
        this.f2606e = colorFilter;
        invalidateSelf();
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i) {
        if (this.b != null) {
            C0155a.m560a(this.b, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.b != null) {
            C0155a.m562a(this.b, colorStateList);
            return;
        }
        C0047f c0047f = this.f2604c;
        if (c0047f.f99c != colorStateList) {
            c0047f.f99c = colorStateList;
            this.f2605d = m3343a(this.f2605d, colorStateList, c0047f.f100d);
            invalidateSelf();
        }
    }

    public void setTintMode(Mode mode) {
        if (this.b != null) {
            C0155a.m565a(this.b, mode);
            return;
        }
        C0047f c0047f = this.f2604c;
        if (c0047f.f100d != mode) {
            c0047f.f100d = mode;
            this.f2605d = m3343a(this.f2605d, c0047f.f99c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        return this.b != null ? this.b.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        if (this.b != null) {
            this.b.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
