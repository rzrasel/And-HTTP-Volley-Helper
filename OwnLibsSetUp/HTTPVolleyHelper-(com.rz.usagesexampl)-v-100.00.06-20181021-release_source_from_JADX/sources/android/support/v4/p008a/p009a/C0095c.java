package android.support.v4.p008a.p009a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v4.a.a.c */
public class C0095c {
    /* renamed from: a */
    public static float m376a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !C0095c.m381a(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* renamed from: a */
    public static int m377a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !C0095c.m381a(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* renamed from: a */
    public static TypedArray m378a(Resources resources, Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: a */
    public static String m379a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        return !C0095c.m381a(xmlPullParser, str) ? null : typedArray.getString(i);
    }

    /* renamed from: a */
    public static boolean m380a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !C0095c.m381a(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    /* renamed from: a */
    public static boolean m381a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: b */
    public static int m382b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !C0095c.m381a(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    /* renamed from: b */
    public static TypedValue m383b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        return !C0095c.m381a(xmlPullParser, str) ? null : typedArray.peekValue(i);
    }

    /* renamed from: c */
    public static int m384c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !C0095c.m381a(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }
}
