package android.support.v4.p008a.p009a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.p003a.C0032a.C0031b;
import android.support.v4.p015e.C0170a;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v4.a.a.a */
public class C0090a {

    /* renamed from: android.support.v4.a.a.a$a */
    public interface C0088a {
    }

    /* renamed from: android.support.v4.a.a.a$c */
    public static final class C0089c {
        /* renamed from: a */
        private final String f460a;
        /* renamed from: b */
        private int f461b;
        /* renamed from: c */
        private boolean f462c;
        /* renamed from: d */
        private int f463d;

        public C0089c(String str, int i, boolean z, int i2) {
            this.f460a = str;
            this.f461b = i;
            this.f462c = z;
            this.f463d = i2;
        }

        /* renamed from: a */
        public String m357a() {
            return this.f460a;
        }

        /* renamed from: b */
        public int m358b() {
            return this.f461b;
        }

        /* renamed from: c */
        public boolean m359c() {
            return this.f462c;
        }

        /* renamed from: d */
        public int m360d() {
            return this.f463d;
        }
    }

    /* renamed from: android.support.v4.a.a.a$b */
    public static final class C0522b implements C0088a {
        /* renamed from: a */
        private final C0089c[] f1820a;

        public C0522b(C0089c[] c0089cArr) {
            this.f1820a = c0089cArr;
        }

        /* renamed from: a */
        public C0089c[] m2070a() {
            return this.f1820a;
        }
    }

    /* renamed from: android.support.v4.a.a.a$d */
    public static final class C0523d implements C0088a {
        /* renamed from: a */
        private final C0170a f1821a;
        /* renamed from: b */
        private final int f1822b;
        /* renamed from: c */
        private final int f1823c;

        public C0523d(C0170a c0170a, int i, int i2) {
            this.f1821a = c0170a;
            this.f1823c = i;
            this.f1822b = i2;
        }

        /* renamed from: a */
        public C0170a m2071a() {
            return this.f1821a;
        }

        /* renamed from: b */
        public int m2072b() {
            return this.f1823c;
        }

        /* renamed from: c */
        public int m2073c() {
            return this.f1822b;
        }
    }

    /* renamed from: a */
    public static C0088a m361a(XmlPullParser xmlPullParser, Resources resources) {
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2 || next == 1) {
                if (next == 2) {
                    return C0090a.m365b(xmlPullParser, resources);
                }
                throw new XmlPullParserException("No start tag found");
            }
        }
        if (next == 2) {
            return C0090a.m365b(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: a */
    public static List<List<byte[]>> m362a(Resources resources, int i) {
        List<List<byte[]>> list = null;
        if (i != 0) {
            TypedArray obtainTypedArray = resources.obtainTypedArray(i);
            if (obtainTypedArray.length() > 0) {
                list = new ArrayList();
                if ((obtainTypedArray.getResourceId(0, 0) != 0 ? 1 : null) != null) {
                    for (i = 0; i < obtainTypedArray.length(); i++) {
                        list.add(C0090a.m363a(resources.getStringArray(obtainTypedArray.getResourceId(i, 0))));
                    }
                } else {
                    list.add(C0090a.m363a(resources.getStringArray(i)));
                }
            }
            obtainTypedArray.recycle();
        }
        return list != null ? list : Collections.emptyList();
    }

    /* renamed from: a */
    private static List<byte[]> m363a(String[] strArr) {
        List<byte[]> arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m364a(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            switch (xmlPullParser.next()) {
                case 2:
                    i++;
                    break;
                case 3:
                    i--;
                    break;
                default:
                    break;
            }
        }
    }

    /* renamed from: b */
    private static C0088a m365b(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return C0090a.m366c(xmlPullParser, resources);
        }
        C0090a.m364a(xmlPullParser);
        return null;
    }

    /* renamed from: c */
    private static C0088a m366c(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0031b.FontFamily);
        String string = obtainAttributes.getString(C0031b.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(C0031b.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(C0031b.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(C0031b.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(C0031b.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(C0031b.FontFamily_fontProviderFetchTimeout, 500);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            List arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(C0090a.m367d(xmlPullParser, resources));
                    } else {
                        C0090a.m364a(xmlPullParser);
                    }
                }
            }
            return arrayList.isEmpty() ? null : new C0522b((C0089c[]) arrayList.toArray(new C0089c[arrayList.size()]));
        } else {
            while (xmlPullParser.next() != 3) {
                C0090a.m364a(xmlPullParser);
            }
            return new C0523d(new C0170a(string, string2, string3, C0090a.m362a(resources, resourceId)), integer, integer2);
        }
    }

    /* renamed from: d */
    private static C0089c m367d(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0031b.FontFamilyFont);
        int i = obtainAttributes.getInt(obtainAttributes.hasValue(C0031b.FontFamilyFont_fontWeight) ? C0031b.FontFamilyFont_fontWeight : C0031b.FontFamilyFont_android_fontWeight, 400);
        boolean z = true;
        if (1 != obtainAttributes.getInt(obtainAttributes.hasValue(C0031b.FontFamilyFont_fontStyle) ? C0031b.FontFamilyFont_fontStyle : C0031b.FontFamilyFont_android_fontStyle, 0)) {
            z = false;
        }
        int i2 = obtainAttributes.hasValue(C0031b.FontFamilyFont_font) ? C0031b.FontFamilyFont_font : C0031b.FontFamilyFont_android_font;
        int resourceId = obtainAttributes.getResourceId(i2, 0);
        String string = obtainAttributes.getString(i2);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            C0090a.m364a(xmlPullParser);
        }
        return new C0089c(string, i, z, resourceId);
    }
}
