package android.support.v7.p021b.p022a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.v4.p010b.C0159a;
import android.support.v7.p020a.C0270a.C0260a;
import android.support.v7.p020a.C0270a.C0269j;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v7.b.a.a */
final class C0301a {
    /* renamed from: a */
    private static int m1123a(int i, float f) {
        return C0159a.m579b(i, Math.round(((float) Color.alpha(i)) * f));
    }

    /* renamed from: a */
    public static ColorStateList m1124a(Resources resources, XmlPullParser xmlPullParser, Theme theme) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2 || next == 1) {
                if (next == 2) {
                    return C0301a.m1125a(resources, xmlPullParser, asAttributeSet, theme);
                }
                throw new XmlPullParserException("No start tag found");
            }
        }
        if (next == 2) {
            return C0301a.m1125a(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: a */
    private static ColorStateList m1125a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return C0301a.m1127b(resources, xmlPullParser, attributeSet, theme);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(xmlPullParser.getPositionDescription());
        stringBuilder.append(": invalid color state list tag ");
        stringBuilder.append(name);
        throw new XmlPullParserException(stringBuilder.toString());
    }

    /* renamed from: a */
    private static TypedArray m1126a(Resources resources, Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: b */
    private static ColorStateList m1127b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        AttributeSet attributeSet2 = attributeSet;
        int i = 1;
        int depth = xmlPullParser.getDepth() + 1;
        Object obj = new int[20][];
        Object obj2 = new int[obj.length];
        int i2 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i) {
                break;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                break;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    int i3;
                    int[] iArr;
                    int i4;
                    int i5;
                    int attributeNameResource;
                    Object trimStateSet;
                    TypedArray a = C0301a.m1126a(resources, theme, attributeSet2, C0269j.ColorStateListItem);
                    int color = a.getColor(C0269j.ColorStateListItem_android_color, -65281);
                    float f = 1.0f;
                    if (a.hasValue(C0269j.ColorStateListItem_android_alpha)) {
                        i3 = C0269j.ColorStateListItem_android_alpha;
                    } else {
                        if (a.hasValue(C0269j.ColorStateListItem_alpha)) {
                            i3 = C0269j.ColorStateListItem_alpha;
                        }
                        a.recycle();
                        next = attributeSet.getAttributeCount();
                        iArr = new int[next];
                        i4 = 0;
                        for (i5 = 0; i5 < next; i5++) {
                            attributeNameResource = attributeSet2.getAttributeNameResource(i5);
                            if (!(attributeNameResource == 16843173 || attributeNameResource == 16843551 || attributeNameResource == C0260a.alpha)) {
                                i = i4 + 1;
                                if (attributeSet2.getAttributeBooleanValue(i5, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr[i4] = attributeNameResource;
                                i4 = i;
                            }
                        }
                        trimStateSet = StateSet.trimStateSet(iArr, i4);
                        next = C0301a.m1123a(color, f);
                        if (i2 != 0) {
                            color = trimStateSet.length;
                        }
                        obj2 = C0304c.m1136a((int[]) obj2, i2, next);
                        obj = (int[][]) C0304c.m1137a((Object[]) obj, i2, trimStateSet);
                        i2++;
                        i = 1;
                    }
                    f = a.getFloat(i3, 1.0f);
                    a.recycle();
                    next = attributeSet.getAttributeCount();
                    iArr = new int[next];
                    i4 = 0;
                    for (i5 = 0; i5 < next; i5++) {
                        attributeNameResource = attributeSet2.getAttributeNameResource(i5);
                        i = i4 + 1;
                        if (attributeSet2.getAttributeBooleanValue(i5, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i4] = attributeNameResource;
                        i4 = i;
                    }
                    trimStateSet = StateSet.trimStateSet(iArr, i4);
                    next = C0301a.m1123a(color, f);
                    if (i2 != 0) {
                        color = trimStateSet.length;
                    }
                    obj2 = C0304c.m1136a((int[]) obj2, i2, next);
                    obj = (int[][]) C0304c.m1137a((Object[]) obj, i2, trimStateSet);
                    i2++;
                    i = 1;
                }
            }
            Resources resources2 = resources;
            Theme theme2 = theme;
            i = 1;
        }
        Object obj3 = new int[i2];
        Object obj4 = new int[i2][];
        System.arraycopy(obj2, 0, obj3, 0, i2);
        System.arraycopy(obj, 0, obj4, 0, i2);
        return new ColorStateList(obj4, obj3);
    }
}
