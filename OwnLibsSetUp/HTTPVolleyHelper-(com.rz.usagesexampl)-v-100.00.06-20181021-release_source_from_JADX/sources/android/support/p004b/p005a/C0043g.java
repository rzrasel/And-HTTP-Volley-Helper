package android.support.p004b.p005a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.v4.p008a.p009a.C0095c;
import android.support.v4.p010b.C0162b;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.b.a.g */
public class C0043g implements Interpolator {
    /* renamed from: a */
    private float[] f63a;
    /* renamed from: b */
    private float[] f64b;

    public C0043g(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public C0043g(Resources resources, Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray a = C0095c.m378a(resources, theme, attributeSet, C0033a.f53l);
        m91a(a, xmlPullParser);
        a.recycle();
    }

    /* renamed from: a */
    private void m89a(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        m92a(path);
    }

    /* renamed from: a */
    private void m90a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        m92a(path);
    }

    /* renamed from: a */
    private void m91a(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (C0095c.m381a(xmlPullParser, "pathData")) {
            String a = C0095c.m379a(typedArray, xmlPullParser, "pathData", 4);
            Path a2 = C0162b.m587a(a);
            if (a2 != null) {
                m92a(a2);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("The path is null, which is created from ");
            stringBuilder.append(a);
            throw new InflateException(stringBuilder.toString());
        } else if (!C0095c.m381a(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (C0095c.m381a(xmlPullParser, "controlY1")) {
            float a3 = C0095c.m376a(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
            float a4 = C0095c.m376a(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
            boolean a5 = C0095c.m381a(xmlPullParser, "controlX2");
            if (a5 != C0095c.m381a(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (a5) {
                m90a(a3, a4, C0095c.m376a(typedArray, xmlPullParser, "controlX2", 2, 0.0f), C0095c.m376a(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
            } else {
                m89a(a3, a4);
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
    }

    /* renamed from: a */
    private void m92a(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            int i2;
            this.f63a = new float[min];
            this.f64b = new float[min];
            float[] fArr = new float[2];
            for (i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((((float) i2) * length) / ((float) (min - 1)), fArr, null);
                this.f63a[i2] = fArr[0];
                this.f64b[i2] = fArr[1];
            }
            if (((double) Math.abs(this.f63a[0])) <= 1.0E-5d && ((double) Math.abs(this.f64b[0])) <= 1.0E-5d) {
                int i3 = min - 1;
                if (((double) Math.abs(this.f63a[i3] - 1.0f)) <= 1.0E-5d && ((double) Math.abs(this.f64b[i3] - 1.0f)) <= 1.0E-5d) {
                    int i4 = 0;
                    float f = 0.0f;
                    while (i < min) {
                        i2 = i4 + 1;
                        length = this.f63a[i4];
                        if (length >= f) {
                            this.f63a[i] = length;
                            i++;
                            f = length;
                            i4 = i2;
                        } else {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("The Path cannot loop back on itself, x :");
                            stringBuilder.append(length);
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("The Path must start at (0,0) and end at (1,1) start: ");
            stringBuilder2.append(this.f63a[0]);
            stringBuilder2.append(",");
            stringBuilder2.append(this.f64b[0]);
            stringBuilder2.append(" end:");
            min--;
            stringBuilder2.append(this.f63a[min]);
            stringBuilder2.append(",");
            stringBuilder2.append(this.f64b[min]);
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("The Path has a invalid length ");
        stringBuilder.append(length);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f63a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f63a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float f2 = this.f63a[length] - this.f63a[i];
        if (f2 == 0.0f) {
            return this.f64b[i];
        }
        f = (f - this.f63a[i]) / f2;
        float f3 = this.f64b[i];
        return f3 + (f * (this.f64b[length] - f3));
    }
}
