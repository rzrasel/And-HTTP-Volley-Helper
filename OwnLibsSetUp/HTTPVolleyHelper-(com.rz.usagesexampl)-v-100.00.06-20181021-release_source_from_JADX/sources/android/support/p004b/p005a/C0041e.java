package android.support.p004b.p005a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build.VERSION;
import android.support.v4.p008a.p009a.C0095c;
import android.support.v4.p010b.C0162b;
import android.support.v4.p010b.C0162b.C0161b;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.b.a.e */
public class C0041e {

    /* renamed from: android.support.b.a.e$a */
    private static class C0040a implements TypeEvaluator<C0161b[]> {
        /* renamed from: a */
        private C0161b[] f61a;

        private C0040a() {
        }

        /* renamed from: a */
        public C0161b[] m68a(float f, C0161b[] c0161bArr, C0161b[] c0161bArr2) {
            if (C0162b.m590a(c0161bArr, c0161bArr2)) {
                if (this.f61a == null || !C0162b.m590a(this.f61a, c0161bArr)) {
                    this.f61a = C0162b.m592a(c0161bArr);
                }
                for (int i = 0; i < c0161bArr.length; i++) {
                    this.f61a[i].m585a(c0161bArr[i], c0161bArr2[i], f);
                }
                return this.f61a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }

        public /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
            return m68a(f, (C0161b[]) obj, (C0161b[]) obj2);
        }
    }

    /* renamed from: a */
    private static int m69a(Resources resources, Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray a = C0095c.m378a(resources, theme, attributeSet, C0033a.f51j);
        int i = 0;
        TypedValue b = C0095c.m383b(a, xmlPullParser, "value", 0);
        if ((b != null ? 1 : null) != null && C0041e.m86a(b.type)) {
            i = 3;
        }
        a.recycle();
        return i;
    }

    /* renamed from: a */
    private static int m70a(TypedArray typedArray, int i, int i2) {
        TypedValue peekValue = typedArray.peekValue(i);
        Object obj = 1;
        Object obj2 = peekValue != null ? 1 : null;
        i = obj2 != null ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i2);
        if (peekValue2 == null) {
            obj = null;
        }
        return ((obj2 == null || !C0041e.m86a(i)) && (obj == null || !C0041e.m86a(obj != null ? peekValue2.type : 0))) ? 0 : 3;
    }

    /* renamed from: a */
    public static Animator m71a(Context context, int i) {
        return VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, i) : C0041e.m72a(context, context.getResources(), context.getTheme(), i);
    }

    /* renamed from: a */
    public static Animator m72a(Context context, Resources resources, Theme theme, int i) {
        return C0041e.m73a(context, resources, theme, i, 1.0f);
    }

    /* renamed from: a */
    public static Animator m73a(Context context, Resources resources, Theme theme, int i, float f) {
        Throwable e;
        StringBuilder stringBuilder;
        NotFoundException notFoundException;
        XmlResourceParser xmlResourceParser = null;
        try {
            XmlPullParser animation = resources.getAnimation(i);
            try {
                Animator a = C0041e.m74a(context, resources, theme, animation, f);
                if (animation != null) {
                    animation.close();
                }
                return a;
            } catch (XmlPullParserException e2) {
                e = e2;
                XmlPullParser xmlPullParser = animation;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Can't load animation resource ID #0x");
                stringBuilder.append(Integer.toHexString(i));
                notFoundException = new NotFoundException(stringBuilder.toString());
                notFoundException.initCause(e);
                throw notFoundException;
            } catch (IOException e3) {
                e = e3;
                xmlResourceParser = animation;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Can't load animation resource ID #0x");
                stringBuilder.append(Integer.toHexString(i));
                notFoundException = new NotFoundException(stringBuilder.toString());
                notFoundException.initCause(e);
                throw notFoundException;
            } catch (Throwable th) {
                e = th;
                xmlResourceParser = animation;
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
                throw e;
            }
        } catch (XmlPullParserException e4) {
            e = e4;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Can't load animation resource ID #0x");
            stringBuilder.append(Integer.toHexString(i));
            notFoundException = new NotFoundException(stringBuilder.toString());
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (IOException e5) {
            e = e5;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Can't load animation resource ID #0x");
            stringBuilder.append(Integer.toHexString(i));
            notFoundException = new NotFoundException(stringBuilder.toString());
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (Throwable th2) {
            e = th2;
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw e;
        }
    }

    /* renamed from: a */
    private static Animator m74a(Context context, Resources resources, Theme theme, XmlPullParser xmlPullParser, float f) {
        return C0041e.m75a(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f);
    }

    /* renamed from: a */
    private static Animator m75a(Context context, Resources resources, Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i, float f) {
        Resources resources2 = resources;
        Theme theme2 = theme;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AnimatorSet animatorSet2 = animatorSet;
        int depth = xmlPullParser.getDepth();
        Animator animator = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            int i2 = 0;
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    Context context2;
                    String name = xmlPullParser.getName();
                    if (name.equals("objectAnimator")) {
                        animator = C0041e.m78a(context, resources, theme, attributeSet, f, xmlPullParser);
                    } else if (name.equals("animator")) {
                        animator = C0041e.m81a(context, resources, theme, attributeSet, null, f, xmlPullParser);
                    } else {
                        if (name.equals("set")) {
                            Animator animatorSet3 = new AnimatorSet();
                            TypedArray a = C0095c.m378a(resources2, theme2, attributeSet, C0033a.f49h);
                            Context context3 = context;
                            Resources resources3 = resources;
                            Theme theme3 = theme;
                            XmlPullParser xmlPullParser3 = xmlPullParser;
                            AttributeSet attributeSet2 = attributeSet;
                            TypedArray typedArray = a;
                            C0041e.m75a(context3, resources3, theme3, xmlPullParser3, attributeSet2, (AnimatorSet) animatorSet3, C0095c.m377a(a, xmlPullParser2, "ordering", 0, 0), f);
                            typedArray.recycle();
                            context2 = context;
                            animator = animatorSet3;
                        } else if (name.equals("propertyValuesHolder")) {
                            PropertyValuesHolder[] a2 = C0041e.m87a(context, resources2, theme2, xmlPullParser2, Xml.asAttributeSet(xmlPullParser));
                            if (!(a2 == null || animator == null || !(animator instanceof ValueAnimator))) {
                                ((ValueAnimator) animator).setValues(a2);
                            }
                            i2 = 1;
                        } else {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Unknown animator name: ");
                            stringBuilder.append(xmlPullParser.getName());
                            throw new RuntimeException(stringBuilder.toString());
                        }
                        if (animatorSet2 != null && r14 == 0) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(animator);
                        }
                    }
                    context2 = context;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(animator);
                }
            }
        }
        if (!(animatorSet2 == null || arrayList == null)) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int i3 = i2 + 1;
                animatorArr[i2] = (Animator) it.next();
                i2 = i3;
            }
            if (i == 0) {
                animatorSet2.playTogether(animatorArr);
            } else {
                animatorSet2.playSequentially(animatorArr);
            }
        }
        return animator;
    }

    /* renamed from: a */
    private static Keyframe m76a(Keyframe keyframe, float f) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f) : Keyframe.ofObject(f);
    }

    /* renamed from: a */
    private static Keyframe m77a(Context context, Resources resources, Theme theme, AttributeSet attributeSet, int i, XmlPullParser xmlPullParser) {
        Keyframe ofFloat;
        TypedArray a = C0095c.m378a(resources, theme, attributeSet, C0033a.f51j);
        float a2 = C0095c.m376a(a, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue b = C0095c.m383b(a, xmlPullParser, "value", 0);
        Object obj = b != null ? 1 : null;
        if (i == 4) {
            i = (obj == null || !C0041e.m86a(b.type)) ? 0 : 3;
        }
        if (obj != null) {
            if (i != 3) {
                switch (i) {
                    case 0:
                        ofFloat = Keyframe.ofFloat(a2, C0095c.m376a(a, xmlPullParser, "value", 0, 0.0f));
                        break;
                    case 1:
                        break;
                    default:
                        ofFloat = null;
                        break;
                }
            }
            ofFloat = Keyframe.ofInt(a2, C0095c.m377a(a, xmlPullParser, "value", 0, 0));
        } else {
            ofFloat = i == 0 ? Keyframe.ofFloat(a2) : Keyframe.ofInt(a2);
        }
        int c = C0095c.m384c(a, xmlPullParser, "interpolator", 1, 0);
        if (c > 0) {
            ofFloat.setInterpolator(C0038d.m66a(context, c));
        }
        a.recycle();
        return ofFloat;
    }

    /* renamed from: a */
    private static ObjectAnimator m78a(Context context, Resources resources, Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) {
        ValueAnimator objectAnimator = new ObjectAnimator();
        C0041e.m81a(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    /* renamed from: a */
    private static PropertyValuesHolder m79a(Context context, Resources resources, Theme theme, XmlPullParser xmlPullParser, String str, int i) {
        Keyframe keyframe;
        Keyframe keyframe2;
        float fraction;
        int i2;
        PropertyValuesHolder propertyValuesHolder = null;
        int i3 = i;
        ArrayList arrayList = null;
        while (true) {
            int size;
            int i4;
            float fraction2;
            Keyframe[] keyframeArr;
            int i5;
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                if (arrayList != null) {
                    size = arrayList.size();
                    if (size > 0) {
                        i4 = 0;
                        keyframe = (Keyframe) arrayList.get(0);
                        keyframe2 = (Keyframe) arrayList.get(size - 1);
                        fraction = keyframe2.getFraction();
                        if (fraction < 1.0f) {
                            if (fraction >= 0.0f) {
                                keyframe2.setFraction(1.0f);
                            } else {
                                arrayList.add(arrayList.size(), C0041e.m76a(keyframe2, 1.0f));
                                size++;
                            }
                        }
                        fraction2 = keyframe.getFraction();
                        if (fraction2 != 0.0f) {
                            if (fraction2 >= 0.0f) {
                                keyframe.setFraction(0.0f);
                            } else {
                                arrayList.add(0, C0041e.m76a(keyframe, 0.0f));
                                size++;
                            }
                        }
                        keyframeArr = new Keyframe[size];
                        arrayList.toArray(keyframeArr);
                        while (i4 < size) {
                            keyframe2 = keyframeArr[i4];
                            if (keyframe2.getFraction() >= 0.0f) {
                                if (i4 != 0) {
                                    keyframe2.setFraction(0.0f);
                                } else {
                                    i = size - 1;
                                    if (i4 != i) {
                                        keyframe2.setFraction(1.0f);
                                    } else {
                                        i2 = i4;
                                        for (i5 = i4 + 1; i5 < i; i5++) {
                                            if (keyframeArr[i5].getFraction() >= 0.0f) {
                                                break;
                                            }
                                            i2 = i5;
                                        }
                                        C0041e.m85a(keyframeArr, keyframeArr[i2 + 1].getFraction() - keyframeArr[i4 - 1].getFraction(), i4, i2);
                                    }
                                }
                            }
                            i4++;
                        }
                        propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
                        if (i3 == 3) {
                            propertyValuesHolder.setEvaluator(C0042f.m88a());
                        }
                    }
                }
            } else if (xmlPullParser.getName().equals("keyframe")) {
                if (i3 == 4) {
                    i3 = C0041e.m69a(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe a = C0041e.m77a(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i3, xmlPullParser);
                if (a != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(a);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null) {
            size = arrayList.size();
            if (size > 0) {
                i4 = 0;
                keyframe = (Keyframe) arrayList.get(0);
                keyframe2 = (Keyframe) arrayList.get(size - 1);
                fraction = keyframe2.getFraction();
                if (fraction < 1.0f) {
                    if (fraction >= 0.0f) {
                        arrayList.add(arrayList.size(), C0041e.m76a(keyframe2, 1.0f));
                        size++;
                    } else {
                        keyframe2.setFraction(1.0f);
                    }
                }
                fraction2 = keyframe.getFraction();
                if (fraction2 != 0.0f) {
                    if (fraction2 >= 0.0f) {
                        arrayList.add(0, C0041e.m76a(keyframe, 0.0f));
                        size++;
                    } else {
                        keyframe.setFraction(0.0f);
                    }
                }
                keyframeArr = new Keyframe[size];
                arrayList.toArray(keyframeArr);
                while (i4 < size) {
                    keyframe2 = keyframeArr[i4];
                    if (keyframe2.getFraction() >= 0.0f) {
                        if (i4 != 0) {
                            i = size - 1;
                            if (i4 != i) {
                                i2 = i4;
                                for (i5 = i4 + 1; i5 < i; i5++) {
                                    if (keyframeArr[i5].getFraction() >= 0.0f) {
                                        break;
                                    }
                                    i2 = i5;
                                }
                                C0041e.m85a(keyframeArr, keyframeArr[i2 + 1].getFraction() - keyframeArr[i4 - 1].getFraction(), i4, i2);
                            } else {
                                keyframe2.setFraction(1.0f);
                            }
                        } else {
                            keyframe2.setFraction(0.0f);
                        }
                    }
                    i4++;
                }
                propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
                if (i3 == 3) {
                    propertyValuesHolder.setEvaluator(C0042f.m88a());
                }
            }
        }
        return propertyValuesHolder;
    }

    /* renamed from: a */
    private static PropertyValuesHolder m80a(TypedArray typedArray, int i, int i2, int i3, String str) {
        TypedValue peekValue = typedArray.peekValue(i2);
        Object obj = peekValue != null ? 1 : null;
        int i4 = obj != null ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        Object obj2 = peekValue2 != null ? 1 : null;
        int i5 = obj2 != null ? peekValue2.type : 0;
        if (i == 4) {
            i = ((obj == null || !C0041e.m86a(i4)) && (obj2 == null || !C0041e.m86a(i5))) ? 0 : 3;
        }
        Object obj3 = i == 0 ? 1 : null;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            C0161b[] b = C0162b.m594b(string);
            C0161b[] b2 = C0162b.m594b(string2);
            if (b == null && b2 == null) {
                return null;
            }
            if (b != null) {
                Object[] objArr;
                TypeEvaluator c0040a = new C0040a();
                if (b2 == null) {
                    objArr = new Object[]{b};
                } else if (C0162b.m590a(b, b2)) {
                    objArr = new Object[]{b, b2};
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(" Can't morph from ");
                    stringBuilder.append(string);
                    stringBuilder.append(" to ");
                    stringBuilder.append(string2);
                    throw new InflateException(stringBuilder.toString());
                }
                return PropertyValuesHolder.ofObject(str, c0040a, objArr);
            } else if (b2 == null) {
                return null;
            } else {
                return PropertyValuesHolder.ofObject(str, new C0040a(), new Object[]{b2});
            }
        }
        TypeEvaluator a = i == 3 ? C0042f.m88a() : null;
        if (obj3 != null) {
            PropertyValuesHolder ofFloat;
            float dimension;
            if (obj != null) {
                float dimension2 = i4 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                if (obj2 != null) {
                    dimension = i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f);
                    ofFloat = PropertyValuesHolder.ofFloat(str, new float[]{dimension2, dimension});
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, new float[]{dimension2});
                }
            } else {
                dimension = i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f);
                ofFloat = PropertyValuesHolder.ofFloat(str, new float[]{dimension});
            }
            propertyValuesHolder = ofFloat;
        } else if (obj != null) {
            i2 = i4 == 5 ? (int) typedArray.getDimension(i2, 0.0f) : C0041e.m86a(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
            if (obj2 != null) {
                r11 = i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : C0041e.m86a(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, new int[]{i2, r11});
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, new int[]{i2});
            }
        } else if (obj2 != null) {
            r11 = i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : C0041e.m86a(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, new int[]{r11});
        }
        if (propertyValuesHolder == null || a == null) {
            return propertyValuesHolder;
        }
        propertyValuesHolder.setEvaluator(a);
        return propertyValuesHolder;
    }

    /* renamed from: a */
    private static ValueAnimator m81a(Context context, Resources resources, Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        TypedArray a = C0095c.m378a(resources, theme, attributeSet, C0033a.f48g);
        TypedArray a2 = C0095c.m378a(resources, theme, attributeSet, C0033a.f52k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        C0041e.m83a(valueAnimator, a, a2, f, xmlPullParser);
        int c = C0095c.m384c(a, xmlPullParser, "interpolator", 0, 0);
        if (c > 0) {
            valueAnimator.setInterpolator(C0038d.m66a(context, c));
        }
        a.recycle();
        if (a2 != null) {
            a2.recycle();
        }
        return valueAnimator;
    }

    /* renamed from: a */
    private static void m82a(ValueAnimator valueAnimator, TypedArray typedArray, int i, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String a = C0095c.m379a(typedArray, xmlPullParser, "pathData", 1);
        if (a != null) {
            String a2 = C0095c.m379a(typedArray, xmlPullParser, "propertyXName", 2);
            String a3 = C0095c.m379a(typedArray, xmlPullParser, "propertyYName", 3);
            if (i != 2) {
            }
            if (a2 == null) {
                if (a3 == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(typedArray.getPositionDescription());
                    stringBuilder.append(" propertyXName or propertyYName is needed for PathData");
                    throw new InflateException(stringBuilder.toString());
                }
            }
            C0041e.m84a(C0162b.m587a(a), objectAnimator, f * 0.5f, a2, a3);
            return;
        }
        objectAnimator.setPropertyName(C0095c.m379a(typedArray, xmlPullParser, "propertyName", 0));
    }

    /* renamed from: a */
    private static void m83a(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long a = (long) C0095c.m377a(typedArray, xmlPullParser, "duration", 1, 300);
        long a2 = (long) C0095c.m377a(typedArray, xmlPullParser, "startOffset", 2, 0);
        int a3 = C0095c.m377a(typedArray, xmlPullParser, "valueType", 7, 4);
        if (C0095c.m381a(xmlPullParser, "valueFrom") && C0095c.m381a(xmlPullParser, "valueTo")) {
            if (a3 == 4) {
                a3 = C0041e.m70a(typedArray, 5, 6);
            }
            if (C0041e.m80a(typedArray, a3, 5, 6, "") != null) {
                valueAnimator.setValues(new PropertyValuesHolder[]{C0041e.m80a(typedArray, a3, 5, 6, "")});
            }
        }
        valueAnimator.setDuration(a);
        valueAnimator.setStartDelay(a2);
        valueAnimator.setRepeatCount(C0095c.m377a(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(C0095c.m377a(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            C0041e.m82a(valueAnimator, typedArray2, a3, f, xmlPullParser);
        }
    }

    /* renamed from: a */
    private static void m84a(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        Path path2 = path;
        ObjectAnimator objectAnimator2 = objectAnimator;
        String str3 = str;
        String str4 = str2;
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path2, false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(0.0f));
        float f2 = 0.0f;
        do {
            f2 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f2));
        } while (pathMeasure.nextContour());
        pathMeasure = new PathMeasure(path2, false);
        int min = Math.min(100, ((int) (f2 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        f2 /= (float) (min - 1);
        int i2 = 0;
        float f3 = 0.0f;
        int i3 = 0;
        while (true) {
            float[] fArr4 = null;
            if (i2 >= min) {
                break;
            }
            pathMeasure.getPosTan(f3, fArr3, null);
            fArr[i2] = fArr3[i];
            fArr2[i2] = fArr3[1];
            f3 += f2;
            int i4 = i3 + 1;
            if (i4 < arrayList.size() && f3 > ((Float) arrayList.get(i4)).floatValue()) {
                f3 -= ((Float) arrayList.get(i4)).floatValue();
                pathMeasure.nextContour();
                i3 = i4;
            }
            i2++;
            i = 0;
        }
        PropertyValuesHolder ofFloat = str3 != null ? PropertyValuesHolder.ofFloat(str3, fArr) : null;
        if (str4 != null) {
            fArr4 = PropertyValuesHolder.ofFloat(str4, fArr2);
        }
        if (ofFloat == null) {
            objectAnimator2.setValues(new PropertyValuesHolder[]{fArr4});
        } else {
            objectAnimator2.setValues(fArr4 == null ? new PropertyValuesHolder[]{ofFloat} : new PropertyValuesHolder[]{ofFloat, fArr4});
        }
    }

    /* renamed from: a */
    private static void m85a(Keyframe[] keyframeArr, float f, int i, int i2) {
        f /= (float) ((i2 - i) + 2);
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f);
            i++;
        }
    }

    /* renamed from: a */
    private static boolean m86a(int i) {
        return i >= 28 && i <= 31;
    }

    /* renamed from: a */
    private static PropertyValuesHolder[] m87a(Context context, Resources resources, Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            int i = 0;
            if (eventType != 3 && eventType != 1) {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                        TypedArray a = C0095c.m378a(resources, theme, attributeSet, C0033a.f50i);
                        String a2 = C0095c.m379a(a, xmlPullParser2, "propertyName", 3);
                        int a3 = C0095c.m377a(a, xmlPullParser2, "valueType", 2, 4);
                        int i2 = a3;
                        Object a4 = C0041e.m79a(context, resources, theme, xmlPullParser, a2, a3);
                        if (a4 == null) {
                            a4 = C0041e.m80a(a, i2, 0, 1, a2);
                        }
                        if (a4 != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(a4);
                        }
                        a.recycle();
                    } else {
                        Resources resources2 = resources;
                        Theme theme2 = theme;
                        AttributeSet attributeSet2 = attributeSet;
                    }
                }
                xmlPullParser.next();
            } else if (arrayList != null) {
                eventType = arrayList.size();
                propertyValuesHolderArr = new PropertyValuesHolder[eventType];
                while (i < eventType) {
                    propertyValuesHolderArr[i] = (PropertyValuesHolder) arrayList.get(i);
                    i++;
                }
            }
        }
        if (arrayList != null) {
            eventType = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[eventType];
            while (i < eventType) {
                propertyValuesHolderArr[i] = (PropertyValuesHolder) arrayList.get(i);
                i++;
            }
        }
        return propertyValuesHolderArr;
    }
}
