package android.support.v7.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff.Mode;
import android.support.v4.p012c.p013a.C0167a;
import android.support.v4.p017g.C0212c;
import android.support.v4.p017g.C0218g;
import android.support.v7.p020a.C0270a.C0269j;
import android.support.v7.view.menu.C0601j;
import android.support.v7.view.menu.C0758k;
import android.support.v7.widget.af;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v7.view.g */
public class C0314g extends MenuInflater {
    /* renamed from: a */
    static final Class<?>[] f1070a = new Class[]{Context.class};
    /* renamed from: b */
    static final Class<?>[] f1071b = f1070a;
    /* renamed from: c */
    final Object[] f1072c;
    /* renamed from: d */
    final Object[] f1073d = this.f1072c;
    /* renamed from: e */
    Context f1074e;
    /* renamed from: f */
    private Object f1075f;

    /* renamed from: android.support.v7.view.g$a */
    private static class C0312a implements OnMenuItemClickListener {
        /* renamed from: a */
        private static final Class<?>[] f1035a = new Class[]{MenuItem.class};
        /* renamed from: b */
        private Object f1036b;
        /* renamed from: c */
        private Method f1037c;

        public C0312a(Object obj, String str) {
            this.f1036b = obj;
            Class cls = obj.getClass();
            try {
                this.f1037c = cls.getMethod(str, f1035a);
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Couldn't resolve menu item onClick handler ");
                stringBuilder.append(str);
                stringBuilder.append(" in class ");
                stringBuilder.append(cls.getName());
                InflateException inflateException = new InflateException(stringBuilder.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f1037c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f1037c.invoke(this.f1036b, new Object[]{menuItem})).booleanValue();
                }
                this.f1037c.invoke(this.f1036b, new Object[]{menuItem});
                return true;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: android.support.v7.view.g$b */
    private class C0313b {
        /* renamed from: A */
        private String f1038A;
        /* renamed from: B */
        private String f1039B;
        /* renamed from: C */
        private CharSequence f1040C;
        /* renamed from: D */
        private CharSequence f1041D;
        /* renamed from: E */
        private ColorStateList f1042E = null;
        /* renamed from: F */
        private Mode f1043F = null;
        /* renamed from: a */
        C0212c f1044a;
        /* renamed from: b */
        final /* synthetic */ C0314g f1045b;
        /* renamed from: c */
        private Menu f1046c;
        /* renamed from: d */
        private int f1047d;
        /* renamed from: e */
        private int f1048e;
        /* renamed from: f */
        private int f1049f;
        /* renamed from: g */
        private int f1050g;
        /* renamed from: h */
        private boolean f1051h;
        /* renamed from: i */
        private boolean f1052i;
        /* renamed from: j */
        private boolean f1053j;
        /* renamed from: k */
        private int f1054k;
        /* renamed from: l */
        private int f1055l;
        /* renamed from: m */
        private CharSequence f1056m;
        /* renamed from: n */
        private CharSequence f1057n;
        /* renamed from: o */
        private int f1058o;
        /* renamed from: p */
        private char f1059p;
        /* renamed from: q */
        private int f1060q;
        /* renamed from: r */
        private char f1061r;
        /* renamed from: s */
        private int f1062s;
        /* renamed from: t */
        private int f1063t;
        /* renamed from: u */
        private boolean f1064u;
        /* renamed from: v */
        private boolean f1065v;
        /* renamed from: w */
        private boolean f1066w;
        /* renamed from: x */
        private int f1067x;
        /* renamed from: y */
        private int f1068y;
        /* renamed from: z */
        private String f1069z;

        public C0313b(C0314g c0314g, Menu menu) {
            this.f1045b = c0314g;
            this.f1046c = menu;
            m1178a();
        }

        /* renamed from: a */
        private char m1175a(String str) {
            return str == null ? '\u0000' : str.charAt(0);
        }

        /* renamed from: a */
        private <T> T m1176a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor constructor = this.f1045b.f1074e.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Cannot instantiate class: ");
                stringBuilder.append(str);
                Log.w("SupportMenuInflater", stringBuilder.toString(), e);
                return null;
            }
        }

        /* renamed from: a */
        private void m1177a(MenuItem menuItem) {
            Object obj = null;
            menuItem.setChecked(this.f1064u).setVisible(this.f1065v).setEnabled(this.f1066w).setCheckable(this.f1063t >= 1).setTitleCondensed(this.f1057n).setIcon(this.f1058o);
            if (this.f1067x >= 0) {
                menuItem.setShowAsAction(this.f1067x);
            }
            if (this.f1039B != null) {
                if (this.f1045b.f1074e.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new C0312a(this.f1045b.m1186a(), this.f1039B));
            }
            boolean z = menuItem instanceof C0601j;
            if (z) {
                C0601j c0601j = (C0601j) menuItem;
            }
            if (this.f1063t >= 2) {
                if (z) {
                    ((C0601j) menuItem).m2707a(true);
                } else if (menuItem instanceof C0758k) {
                    ((C0758k) menuItem).m3570a(true);
                }
            }
            if (this.f1069z != null) {
                menuItem.setActionView((View) m1176a(this.f1069z, C0314g.f1070a, this.f1045b.f1072c));
                obj = 1;
            }
            if (this.f1068y > 0) {
                if (obj == null) {
                    menuItem.setActionView(this.f1068y);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            if (this.f1044a != null) {
                C0218g.m809a(menuItem, this.f1044a);
            }
            C0218g.m813a(menuItem, this.f1040C);
            C0218g.m815b(menuItem, this.f1041D);
            C0218g.m814b(menuItem, this.f1059p, this.f1060q);
            C0218g.m810a(menuItem, this.f1061r, this.f1062s);
            if (this.f1043F != null) {
                C0218g.m812a(menuItem, this.f1043F);
            }
            if (this.f1042E != null) {
                C0218g.m811a(menuItem, this.f1042E);
            }
        }

        /* renamed from: a */
        public void m1178a() {
            this.f1047d = 0;
            this.f1048e = 0;
            this.f1049f = 0;
            this.f1050g = 0;
            this.f1051h = true;
            this.f1052i = true;
        }

        /* renamed from: a */
        public void m1179a(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = this.f1045b.f1074e.obtainStyledAttributes(attributeSet, C0269j.MenuGroup);
            this.f1047d = obtainStyledAttributes.getResourceId(C0269j.MenuGroup_android_id, 0);
            this.f1048e = obtainStyledAttributes.getInt(C0269j.MenuGroup_android_menuCategory, 0);
            this.f1049f = obtainStyledAttributes.getInt(C0269j.MenuGroup_android_orderInCategory, 0);
            this.f1050g = obtainStyledAttributes.getInt(C0269j.MenuGroup_android_checkableBehavior, 0);
            this.f1051h = obtainStyledAttributes.getBoolean(C0269j.MenuGroup_android_visible, true);
            this.f1052i = obtainStyledAttributes.getBoolean(C0269j.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: b */
        public void m1180b() {
            this.f1053j = true;
            m1177a(this.f1046c.add(this.f1047d, this.f1054k, this.f1055l, this.f1056m));
        }

        /* renamed from: b */
        public void m1181b(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = this.f1045b.f1074e.obtainStyledAttributes(attributeSet, C0269j.MenuItem);
            this.f1054k = obtainStyledAttributes.getResourceId(C0269j.MenuItem_android_id, 0);
            this.f1055l = (obtainStyledAttributes.getInt(C0269j.MenuItem_android_menuCategory, this.f1048e) & -65536) | (obtainStyledAttributes.getInt(C0269j.MenuItem_android_orderInCategory, this.f1049f) & 65535);
            this.f1056m = obtainStyledAttributes.getText(C0269j.MenuItem_android_title);
            this.f1057n = obtainStyledAttributes.getText(C0269j.MenuItem_android_titleCondensed);
            this.f1058o = obtainStyledAttributes.getResourceId(C0269j.MenuItem_android_icon, 0);
            this.f1059p = m1175a(obtainStyledAttributes.getString(C0269j.MenuItem_android_alphabeticShortcut));
            this.f1060q = obtainStyledAttributes.getInt(C0269j.MenuItem_alphabeticModifiers, 4096);
            this.f1061r = m1175a(obtainStyledAttributes.getString(C0269j.MenuItem_android_numericShortcut));
            this.f1062s = obtainStyledAttributes.getInt(C0269j.MenuItem_numericModifiers, 4096);
            this.f1063t = obtainStyledAttributes.hasValue(C0269j.MenuItem_android_checkable) ? obtainStyledAttributes.getBoolean(C0269j.MenuItem_android_checkable, false) : this.f1050g;
            this.f1064u = obtainStyledAttributes.getBoolean(C0269j.MenuItem_android_checked, false);
            this.f1065v = obtainStyledAttributes.getBoolean(C0269j.MenuItem_android_visible, this.f1051h);
            this.f1066w = obtainStyledAttributes.getBoolean(C0269j.MenuItem_android_enabled, this.f1052i);
            this.f1067x = obtainStyledAttributes.getInt(C0269j.MenuItem_showAsAction, -1);
            this.f1039B = obtainStyledAttributes.getString(C0269j.MenuItem_android_onClick);
            this.f1068y = obtainStyledAttributes.getResourceId(C0269j.MenuItem_actionLayout, 0);
            this.f1069z = obtainStyledAttributes.getString(C0269j.MenuItem_actionViewClass);
            this.f1038A = obtainStyledAttributes.getString(C0269j.MenuItem_actionProviderClass);
            Object obj = this.f1038A != null ? 1 : null;
            if (obj != null && this.f1068y == 0 && this.f1069z == null) {
                this.f1044a = (C0212c) m1176a(this.f1038A, C0314g.f1071b, this.f1045b.f1073d);
            } else {
                if (obj != null) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f1044a = null;
            }
            this.f1040C = obtainStyledAttributes.getText(C0269j.MenuItem_contentDescription);
            this.f1041D = obtainStyledAttributes.getText(C0269j.MenuItem_tooltipText);
            if (obtainStyledAttributes.hasValue(C0269j.MenuItem_iconTintMode)) {
                this.f1043F = af.m1398a(obtainStyledAttributes.getInt(C0269j.MenuItem_iconTintMode, -1), this.f1043F);
            } else {
                this.f1043F = null;
            }
            if (obtainStyledAttributes.hasValue(C0269j.MenuItem_iconTint)) {
                this.f1042E = obtainStyledAttributes.getColorStateList(C0269j.MenuItem_iconTint);
            } else {
                this.f1042E = null;
            }
            obtainStyledAttributes.recycle();
            this.f1053j = false;
        }

        /* renamed from: c */
        public SubMenu m1182c() {
            this.f1053j = true;
            SubMenu addSubMenu = this.f1046c.addSubMenu(this.f1047d, this.f1054k, this.f1055l, this.f1056m);
            m1177a(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: d */
        public boolean m1183d() {
            return this.f1053j;
        }
    }

    public C0314g(Context context) {
        super(context);
        this.f1074e = context;
        this.f1072c = new Object[]{context};
    }

    /* renamed from: a */
    private Object m1184a(Object obj) {
        if (obj instanceof Activity) {
            return obj;
        }
        if (obj instanceof ContextWrapper) {
            obj = m1184a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    /* renamed from: a */
    private void m1185a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        C0313b c0313b = new C0313b(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (eventType != 2) {
            eventType = xmlPullParser.next();
            if (eventType == 1) {
                break;
            }
        }
        String name = xmlPullParser.getName();
        if (name.equals("menu")) {
            eventType = xmlPullParser.next();
            int i = eventType;
            Object obj = null;
            Object obj2 = null;
            Object obj3 = null;
            while (obj2 == null) {
                String name2;
                switch (i) {
                    case 1:
                        throw new RuntimeException("Unexpected end of document");
                    case 2:
                        if (obj3 == null) {
                            name2 = xmlPullParser.getName();
                            if (!name2.equals("group")) {
                                if (!name2.equals("item")) {
                                    if (!name2.equals("menu")) {
                                        obj = name2;
                                        obj3 = 1;
                                        break;
                                    }
                                    m1185a(xmlPullParser, attributeSet, c0313b.m1182c());
                                    break;
                                }
                                c0313b.m1181b(attributeSet);
                                break;
                            }
                            c0313b.m1179a(attributeSet);
                            break;
                        }
                        break;
                    case 3:
                        name2 = xmlPullParser.getName();
                        if (obj3 == null || !name2.equals(r6)) {
                            if (!name2.equals("group")) {
                                if (!name2.equals("item")) {
                                    if (!name2.equals("menu")) {
                                        break;
                                    }
                                    obj2 = 1;
                                    break;
                                } else if (!c0313b.m1183d()) {
                                    if (c0313b.f1044a != null && c0313b.f1044a.mo234e()) {
                                        c0313b.m1182c();
                                        break;
                                    } else {
                                        c0313b.m1180b();
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            c0313b.m1178a();
                            break;
                        }
                        obj = null;
                        obj3 = null;
                        break;
                    default:
                        break;
                }
                i = xmlPullParser.next();
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expecting menu, got ");
        stringBuilder.append(name);
        throw new RuntimeException(stringBuilder.toString());
    }

    /* renamed from: a */
    Object m1186a() {
        if (this.f1075f == null) {
            this.f1075f = m1184a(this.f1074e);
        }
        return this.f1075f;
    }

    public void inflate(int i, Menu menu) {
        Throwable e;
        if (menu instanceof C0167a) {
            XmlResourceParser xmlResourceParser = null;
            try {
                XmlResourceParser layout = this.f1074e.getResources().getLayout(i);
                try {
                    m1185a(layout, Xml.asAttributeSet(layout), menu);
                    if (layout != null) {
                        layout.close();
                    }
                    return;
                } catch (XmlPullParserException e2) {
                    e = e2;
                    xmlResourceParser = layout;
                    throw new InflateException("Error inflating menu XML", e);
                } catch (IOException e3) {
                    e = e3;
                    xmlResourceParser = layout;
                    throw new InflateException("Error inflating menu XML", e);
                } catch (Throwable th) {
                    e = th;
                    xmlResourceParser = layout;
                    if (xmlResourceParser != null) {
                        xmlResourceParser.close();
                    }
                    throw e;
                }
            } catch (XmlPullParserException e4) {
                e = e4;
                throw new InflateException("Error inflating menu XML", e);
            } catch (IOException e5) {
                e = e5;
                throw new InflateException("Error inflating menu XML", e);
            } catch (Throwable th2) {
                e = th2;
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
                throw e;
            }
        }
        super.inflate(i, menu);
    }
}
