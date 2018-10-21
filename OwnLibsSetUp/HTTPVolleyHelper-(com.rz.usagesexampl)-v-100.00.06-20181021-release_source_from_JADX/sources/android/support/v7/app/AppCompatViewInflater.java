package android.support.v7.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.p016f.C0549a;
import android.support.v4.p017g.C0227p;
import android.support.v7.p020a.C0270a.C0269j;
import android.support.v7.view.C0310d;
import android.support.v7.widget.C0391j;
import android.support.v7.widget.C0399v;
import android.support.v7.widget.C0400w;
import android.support.v7.widget.C0624f;
import android.support.v7.widget.C0625h;
import android.support.v7.widget.C0626i;
import android.support.v7.widget.C0630m;
import android.support.v7.widget.C0631o;
import android.support.v7.widget.C0632q;
import android.support.v7.widget.C0633r;
import android.support.v7.widget.C0634u;
import android.support.v7.widget.C0637y;
import android.support.v7.widget.ab;
import android.support.v7.widget.at;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;

public class AppCompatViewInflater {
    /* renamed from: a */
    private static final Class<?>[] f958a = new Class[]{Context.class, AttributeSet.class};
    /* renamed from: b */
    private static final int[] f959b = new int[]{16843375};
    /* renamed from: c */
    private static final String[] f960c = new String[]{"android.widget.", "android.view.", "android.webkit."};
    /* renamed from: d */
    private static final Map<String, Constructor<? extends View>> f961d = new C0549a();
    /* renamed from: e */
    private final Object[] f962e = new Object[2];

    /* renamed from: android.support.v7.app.AppCompatViewInflater$a */
    private static class C0283a implements OnClickListener {
        /* renamed from: a */
        private final View f954a;
        /* renamed from: b */
        private final String f955b;
        /* renamed from: c */
        private Method f956c;
        /* renamed from: d */
        private Context f957d;

        public C0283a(View view, String str) {
            this.f954a = view;
            this.f955b = str;
        }

        /* renamed from: a */
        private void m1021a(android.content.Context r5, java.lang.String r6) {
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
            r4 = this;
        L_0x0000:
            if (r5 == 0) goto L_0x002e;
        L_0x0002:
            r6 = r5.isRestricted();	 Catch:{ NoSuchMethodException -> 0x0021 }
            if (r6 != 0) goto L_0x0021;	 Catch:{ NoSuchMethodException -> 0x0021 }
        L_0x0008:
            r6 = r5.getClass();	 Catch:{ NoSuchMethodException -> 0x0021 }
            r0 = r4.f955b;	 Catch:{ NoSuchMethodException -> 0x0021 }
            r1 = 1;	 Catch:{ NoSuchMethodException -> 0x0021 }
            r1 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x0021 }
            r2 = 0;	 Catch:{ NoSuchMethodException -> 0x0021 }
            r3 = android.view.View.class;	 Catch:{ NoSuchMethodException -> 0x0021 }
            r1[r2] = r3;	 Catch:{ NoSuchMethodException -> 0x0021 }
            r6 = r6.getMethod(r0, r1);	 Catch:{ NoSuchMethodException -> 0x0021 }
            if (r6 == 0) goto L_0x0021;	 Catch:{ NoSuchMethodException -> 0x0021 }
        L_0x001c:
            r4.f956c = r6;	 Catch:{ NoSuchMethodException -> 0x0021 }
            r4.f957d = r5;	 Catch:{ NoSuchMethodException -> 0x0021 }
            return;
        L_0x0021:
            r6 = r5 instanceof android.content.ContextWrapper;
            if (r6 == 0) goto L_0x002c;
        L_0x0025:
            r5 = (android.content.ContextWrapper) r5;
            r5 = r5.getBaseContext();
            goto L_0x0000;
        L_0x002c:
            r5 = 0;
            goto L_0x0000;
        L_0x002e:
            r5 = r4.f954a;
            r5 = r5.getId();
            r6 = -1;
            if (r5 != r6) goto L_0x003a;
        L_0x0037:
            r5 = "";
            goto L_0x005e;
        L_0x003a:
            r6 = new java.lang.StringBuilder;
            r6.<init>();
            r0 = " with id '";
            r6.append(r0);
            r0 = r4.f954a;
            r0 = r0.getContext();
            r0 = r0.getResources();
            r5 = r0.getResourceEntryName(r5);
            r6.append(r5);
            r5 = "'";
            r6.append(r5);
            r5 = r6.toString();
        L_0x005e:
            r6 = new java.lang.IllegalStateException;
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r1 = "Could not find method ";
            r0.append(r1);
            r1 = r4.f955b;
            r0.append(r1);
            r1 = "(View) in a parent or ancestor Context for android:onClick ";
            r0.append(r1);
            r1 = "attribute defined on view ";
            r0.append(r1);
            r1 = r4.f954a;
            r1 = r1.getClass();
            r0.append(r1);
            r0.append(r5);
            r5 = r0.toString();
            r6.<init>(r5);
            throw r6;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatViewInflater.a.a(android.content.Context, java.lang.String):void");
        }

        public void onClick(View view) {
            if (this.f956c == null) {
                m1021a(this.f954a.getContext(), this.f955b);
            }
            try {
                this.f956c.invoke(this.f957d, new Object[]{view});
            } catch (Throwable e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (Throwable e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* renamed from: a */
    private static Context m1022a(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0269j.View, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(C0269j.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0) {
            resourceId = obtainStyledAttributes.getResourceId(C0269j.View_theme, 0);
            if (resourceId != 0) {
                Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
            }
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof C0310d) && ((C0310d) context).m1173a() == resourceId) ? context : new C0310d(context, resourceId) : context;
    }

    /* renamed from: a */
    private android.view.View m1023a(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
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
        r1 = this;
        r0 = f961d;
        r0 = r0.get(r3);
        r0 = (java.lang.reflect.Constructor) r0;
        if (r0 != 0) goto L_0x0036;
    L_0x000a:
        r2 = r2.getClassLoader();	 Catch:{ Exception -> 0x0043 }
        if (r4 == 0) goto L_0x0020;	 Catch:{ Exception -> 0x0043 }
    L_0x0010:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0043 }
        r0.<init>();	 Catch:{ Exception -> 0x0043 }
        r0.append(r4);	 Catch:{ Exception -> 0x0043 }
        r0.append(r3);	 Catch:{ Exception -> 0x0043 }
        r4 = r0.toString();	 Catch:{ Exception -> 0x0043 }
        goto L_0x0021;	 Catch:{ Exception -> 0x0043 }
    L_0x0020:
        r4 = r3;	 Catch:{ Exception -> 0x0043 }
    L_0x0021:
        r2 = r2.loadClass(r4);	 Catch:{ Exception -> 0x0043 }
        r4 = android.view.View.class;	 Catch:{ Exception -> 0x0043 }
        r2 = r2.asSubclass(r4);	 Catch:{ Exception -> 0x0043 }
        r4 = f958a;	 Catch:{ Exception -> 0x0043 }
        r0 = r2.getConstructor(r4);	 Catch:{ Exception -> 0x0043 }
        r2 = f961d;	 Catch:{ Exception -> 0x0043 }
        r2.put(r3, r0);	 Catch:{ Exception -> 0x0043 }
    L_0x0036:
        r2 = 1;	 Catch:{ Exception -> 0x0043 }
        r0.setAccessible(r2);	 Catch:{ Exception -> 0x0043 }
        r2 = r1.f962e;	 Catch:{ Exception -> 0x0043 }
        r2 = r0.newInstance(r2);	 Catch:{ Exception -> 0x0043 }
        r2 = (android.view.View) r2;	 Catch:{ Exception -> 0x0043 }
        return r2;
    L_0x0043:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatViewInflater.a(android.content.Context, java.lang.String, java.lang.String):android.view.View");
    }

    /* renamed from: a */
    private void m1024a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (VERSION.SDK_INT < 15 || C0227p.m888n(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f959b);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new C0283a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private void m1025a(View view, String str) {
        if (view == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(getClass().getName());
            stringBuilder.append(" asked to inflate view for <");
            stringBuilder.append(str);
            stringBuilder.append(">, but returned null");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: b */
    private android.view.View m1026b(android.content.Context r5, java.lang.String r6, android.util.AttributeSet r7) {
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
        r4 = this;
        r0 = "view";
        r0 = r6.equals(r0);
        r1 = 0;
        if (r0 == 0) goto L_0x000f;
    L_0x0009:
        r6 = "class";
        r6 = r7.getAttributeValue(r1, r6);
    L_0x000f:
        r0 = 1;
        r2 = 0;
        r3 = r4.f962e;	 Catch:{ Exception -> 0x005e, all -> 0x0054 }
        r3[r2] = r5;	 Catch:{ Exception -> 0x005e, all -> 0x0054 }
        r3 = r4.f962e;	 Catch:{ Exception -> 0x005e, all -> 0x0054 }
        r3[r0] = r7;	 Catch:{ Exception -> 0x005e, all -> 0x0054 }
        r7 = -1;	 Catch:{ Exception -> 0x005e, all -> 0x0054 }
        r3 = 46;	 Catch:{ Exception -> 0x005e, all -> 0x0054 }
        r3 = r6.indexOf(r3);	 Catch:{ Exception -> 0x005e, all -> 0x0054 }
        if (r7 != r3) goto L_0x0047;	 Catch:{ Exception -> 0x005e, all -> 0x0054 }
    L_0x0022:
        r7 = 0;	 Catch:{ Exception -> 0x005e, all -> 0x0054 }
    L_0x0023:
        r3 = f960c;	 Catch:{ Exception -> 0x005e, all -> 0x0054 }
        r3 = r3.length;	 Catch:{ Exception -> 0x005e, all -> 0x0054 }
        if (r7 >= r3) goto L_0x003e;	 Catch:{ Exception -> 0x005e, all -> 0x0054 }
    L_0x0028:
        r3 = f960c;	 Catch:{ Exception -> 0x005e, all -> 0x0054 }
        r3 = r3[r7];	 Catch:{ Exception -> 0x005e, all -> 0x0054 }
        r3 = r4.m1023a(r5, r6, r3);	 Catch:{ Exception -> 0x005e, all -> 0x0054 }
        if (r3 == 0) goto L_0x003b;
    L_0x0032:
        r5 = r4.f962e;
        r5[r2] = r1;
        r5 = r4.f962e;
        r5[r0] = r1;
        return r3;
    L_0x003b:
        r7 = r7 + 1;
        goto L_0x0023;
    L_0x003e:
        r5 = r4.f962e;
        r5[r2] = r1;
        r5 = r4.f962e;
        r5[r0] = r1;
        return r1;
    L_0x0047:
        r5 = r4.m1023a(r5, r6, r1);	 Catch:{ Exception -> 0x005e, all -> 0x0054 }
        r6 = r4.f962e;
        r6[r2] = r1;
        r6 = r4.f962e;
        r6[r0] = r1;
        return r5;
    L_0x0054:
        r5 = move-exception;
        r6 = r4.f962e;
        r6[r2] = r1;
        r6 = r4.f962e;
        r6[r0] = r1;
        throw r5;
    L_0x005e:
        r5 = r4.f962e;
        r5[r2] = r1;
        r5 = r4.f962e;
        r5[r0] = r1;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatViewInflater.b(android.content.Context, java.lang.String, android.util.AttributeSet):android.view.View");
    }

    /* renamed from: a */
    protected ab m1027a(Context context, AttributeSet attributeSet) {
        return new ab(context, attributeSet);
    }

    /* renamed from: a */
    protected View m1028a(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* renamed from: a */
    final View m1029a(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View a;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = m1022a(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = at.m1473a(context2);
        }
        Object obj = -1;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    obj = 11;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    obj = 8;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    obj = 10;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    obj = null;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    obj = 5;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    obj = 12;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    obj = 4;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    obj = 7;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    obj = 1;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    obj = 9;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    obj = 6;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    obj = 3;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    obj = 2;
                    break;
                }
                break;
            default:
                break;
        }
        switch (obj) {
            case null:
                a = m1027a(context2, attributeSet);
                break;
            case 1:
                a = m1030b(context2, attributeSet);
                break;
            case 2:
                a = m1031c(context2, attributeSet);
                break;
            case 3:
                a = m1032d(context2, attributeSet);
                break;
            case 4:
                a = m1033e(context2, attributeSet);
                break;
            case 5:
                a = m1034f(context2, attributeSet);
                break;
            case 6:
                a = m1035g(context2, attributeSet);
                break;
            case 7:
                a = m1036h(context2, attributeSet);
                break;
            case 8:
                a = m1037i(context2, attributeSet);
                break;
            case 9:
                a = m1038j(context2, attributeSet);
                break;
            case 10:
                a = m1039k(context2, attributeSet);
                break;
            case 11:
                a = m1040l(context2, attributeSet);
                break;
            case 12:
                a = m1041m(context2, attributeSet);
                break;
            default:
                a = m1028a(context2, str, attributeSet);
                break;
        }
        m1025a(a, str);
        if (a == null && context != context2) {
            a = m1026b(context2, str, attributeSet);
        }
        if (a != null) {
            m1024a(a, attributeSet);
        }
        return a;
    }

    /* renamed from: b */
    protected C0632q m1030b(Context context, AttributeSet attributeSet) {
        return new C0632q(context, attributeSet);
    }

    /* renamed from: c */
    protected C0625h m1031c(Context context, AttributeSet attributeSet) {
        return new C0625h(context, attributeSet);
    }

    /* renamed from: d */
    protected C0630m m1032d(Context context, AttributeSet attributeSet) {
        return new C0630m(context, attributeSet);
    }

    /* renamed from: e */
    protected C0637y m1033e(Context context, AttributeSet attributeSet) {
        return new C0637y(context, attributeSet);
    }

    /* renamed from: f */
    protected C0631o m1034f(Context context, AttributeSet attributeSet) {
        return new C0631o(context, attributeSet);
    }

    /* renamed from: g */
    protected C0626i m1035g(Context context, AttributeSet attributeSet) {
        return new C0626i(context, attributeSet);
    }

    /* renamed from: h */
    protected C0634u m1036h(Context context, AttributeSet attributeSet) {
        return new C0634u(context, attributeSet);
    }

    /* renamed from: i */
    protected C0391j m1037i(Context context, AttributeSet attributeSet) {
        return new C0391j(context, attributeSet);
    }

    /* renamed from: j */
    protected C0624f m1038j(Context context, AttributeSet attributeSet) {
        return new C0624f(context, attributeSet);
    }

    /* renamed from: k */
    protected C0633r m1039k(Context context, AttributeSet attributeSet) {
        return new C0633r(context, attributeSet);
    }

    /* renamed from: l */
    protected C0399v m1040l(Context context, AttributeSet attributeSet) {
        return new C0399v(context, attributeSet);
    }

    /* renamed from: m */
    protected C0400w m1041m(Context context, AttributeSet attributeSet) {
        return new C0400w(context, attributeSet);
    }
}
