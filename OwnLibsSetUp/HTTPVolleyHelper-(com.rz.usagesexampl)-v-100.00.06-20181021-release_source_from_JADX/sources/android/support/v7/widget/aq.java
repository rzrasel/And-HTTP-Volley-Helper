package android.support.v7.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.v4.widget.C0747k;
import android.support.v7.p020a.C0270a.C0260a;
import android.support.v7.p020a.C0270a.C0265f;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.WeakHashMap;

class aq extends C0747k implements OnClickListener {
    /* renamed from: j */
    private final SearchManager f2808j = ((SearchManager) this.d.getSystemService("search"));
    /* renamed from: k */
    private final SearchView f2809k;
    /* renamed from: l */
    private final SearchableInfo f2810l;
    /* renamed from: m */
    private final Context f2811m;
    /* renamed from: n */
    private final WeakHashMap<String, ConstantState> f2812n;
    /* renamed from: o */
    private final int f2813o;
    /* renamed from: p */
    private boolean f2814p = false;
    /* renamed from: q */
    private int f2815q = 1;
    /* renamed from: r */
    private ColorStateList f2816r;
    /* renamed from: s */
    private int f2817s = -1;
    /* renamed from: t */
    private int f2818t = -1;
    /* renamed from: u */
    private int f2819u = -1;
    /* renamed from: v */
    private int f2820v = -1;
    /* renamed from: w */
    private int f2821w = -1;
    /* renamed from: x */
    private int f2822x = -1;

    /* renamed from: android.support.v7.widget.aq$a */
    private static final class C0378a {
        /* renamed from: a */
        public final TextView f1325a;
        /* renamed from: b */
        public final TextView f1326b;
        /* renamed from: c */
        public final ImageView f1327c;
        /* renamed from: d */
        public final ImageView f1328d;
        /* renamed from: e */
        public final ImageView f1329e;

        public C0378a(View view) {
            this.f1325a = (TextView) view.findViewById(16908308);
            this.f1326b = (TextView) view.findViewById(16908309);
            this.f1327c = (ImageView) view.findViewById(16908295);
            this.f1328d = (ImageView) view.findViewById(16908296);
            this.f1329e = (ImageView) view.findViewById(C0265f.edit_query);
        }
    }

    public aq(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f2809k = searchView;
        this.f2810l = searchableInfo;
        this.f2813o = searchView.getSuggestionCommitIconResId();
        this.f2811m = context;
        this.f2812n = weakHashMap;
    }

    /* renamed from: a */
    private Drawable m3709a(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Object obj = null;
        if (this.f2812n.containsKey(flattenToShortString)) {
            Drawable newDrawable;
            ConstantState constantState = (ConstantState) this.f2812n.get(flattenToShortString);
            if (constantState != null) {
                newDrawable = constantState.newDrawable(this.f2811m.getResources());
            }
            return newDrawable;
        }
        Drawable b = m3716b(componentName);
        if (b != null) {
            obj = b.getConstantState();
        }
        this.f2812n.put(flattenToShortString, obj);
        return b;
    }

    /* renamed from: a */
    private android.graphics.drawable.Drawable m3710a(java.lang.String r5) {
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
        r4 = this;
        r0 = 0;
        if (r5 == 0) goto L_0x0070;
    L_0x0003:
        r1 = r5.isEmpty();
        if (r1 != 0) goto L_0x0070;
    L_0x0009:
        r1 = "0";
        r1 = r1.equals(r5);
        if (r1 == 0) goto L_0x0012;
    L_0x0011:
        goto L_0x0070;
    L_0x0012:
        r1 = java.lang.Integer.parseInt(r5);	 Catch:{ NumberFormatException -> 0x005d, NotFoundException -> 0x0046 }
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x005d, NotFoundException -> 0x0046 }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x005d, NotFoundException -> 0x0046 }
        r3 = "android.resource://";	 Catch:{ NumberFormatException -> 0x005d, NotFoundException -> 0x0046 }
        r2.append(r3);	 Catch:{ NumberFormatException -> 0x005d, NotFoundException -> 0x0046 }
        r3 = r4.f2811m;	 Catch:{ NumberFormatException -> 0x005d, NotFoundException -> 0x0046 }
        r3 = r3.getPackageName();	 Catch:{ NumberFormatException -> 0x005d, NotFoundException -> 0x0046 }
        r2.append(r3);	 Catch:{ NumberFormatException -> 0x005d, NotFoundException -> 0x0046 }
        r3 = "/";	 Catch:{ NumberFormatException -> 0x005d, NotFoundException -> 0x0046 }
        r2.append(r3);	 Catch:{ NumberFormatException -> 0x005d, NotFoundException -> 0x0046 }
        r2.append(r1);	 Catch:{ NumberFormatException -> 0x005d, NotFoundException -> 0x0046 }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x005d, NotFoundException -> 0x0046 }
        r3 = r4.m3718b(r2);	 Catch:{ NumberFormatException -> 0x005d, NotFoundException -> 0x0046 }
        if (r3 == 0) goto L_0x003c;	 Catch:{ NumberFormatException -> 0x005d, NotFoundException -> 0x0046 }
    L_0x003b:
        return r3;	 Catch:{ NumberFormatException -> 0x005d, NotFoundException -> 0x0046 }
    L_0x003c:
        r3 = r4.f2811m;	 Catch:{ NumberFormatException -> 0x005d, NotFoundException -> 0x0046 }
        r1 = android.support.v4.p008a.C0096a.m385a(r3, r1);	 Catch:{ NumberFormatException -> 0x005d, NotFoundException -> 0x0046 }
        r4.m3715a(r2, r1);	 Catch:{ NumberFormatException -> 0x005d, NotFoundException -> 0x0046 }
        return r1;
    L_0x0046:
        r1 = "SuggestionsAdapter";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Icon resource not found: ";
        r2.append(r3);
        r2.append(r5);
        r5 = r2.toString();
        android.util.Log.w(r1, r5);
        return r0;
        r0 = r4.m3718b(r5);
        if (r0 == 0) goto L_0x0065;
    L_0x0064:
        return r0;
    L_0x0065:
        r0 = android.net.Uri.parse(r5);
        r0 = r4.m3717b(r0);
        r4.m3715a(r5, r0);
    L_0x0070:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.aq.a(java.lang.String):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    private static String m3711a(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Throwable e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m3712a(Cursor cursor, String str) {
        return m3711a(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: a */
    private void m3713a(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: a */
    private void m3714a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    /* renamed from: a */
    private void m3715a(String str, Drawable drawable) {
        if (drawable != null) {
            this.f2812n.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: b */
    private Drawable m3716b(ComponentName componentName) {
        PackageManager packageManager = this.d.getPackageManager();
        String str;
        String stringBuilder;
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            str = "SuggestionsAdapter";
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Invalid icon resource ");
            stringBuilder2.append(iconResource);
            stringBuilder2.append(" for ");
            stringBuilder2.append(componentName.flattenToShortString());
            stringBuilder = stringBuilder2.toString();
            Log.w(str, stringBuilder);
            return null;
        } catch (NameNotFoundException e) {
            str = "SuggestionsAdapter";
            stringBuilder = e.toString();
        }
    }

    /* renamed from: b */
    private android.graphics.drawable.Drawable m3717b(android.net.Uri r7) {
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
        r6 = this;
        r0 = 0;
        r1 = r7.getScheme();	 Catch:{ FileNotFoundException -> 0x0089 }
        r2 = "android.resource";	 Catch:{ FileNotFoundException -> 0x0089 }
        r1 = r2.equals(r1);	 Catch:{ FileNotFoundException -> 0x0089 }
        if (r1 == 0) goto L_0x0029;
    L_0x000d:
        r1 = r6.m3726a(r7);	 Catch:{ NotFoundException -> 0x0012 }
        return r1;
    L_0x0012:
        r1 = new java.io.FileNotFoundException;	 Catch:{ FileNotFoundException -> 0x0089 }
        r2 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x0089 }
        r2.<init>();	 Catch:{ FileNotFoundException -> 0x0089 }
        r3 = "Resource does not exist: ";	 Catch:{ FileNotFoundException -> 0x0089 }
        r2.append(r3);	 Catch:{ FileNotFoundException -> 0x0089 }
        r2.append(r7);	 Catch:{ FileNotFoundException -> 0x0089 }
        r2 = r2.toString();	 Catch:{ FileNotFoundException -> 0x0089 }
        r1.<init>(r2);	 Catch:{ FileNotFoundException -> 0x0089 }
        throw r1;	 Catch:{ FileNotFoundException -> 0x0089 }
    L_0x0029:
        r1 = r6.f2811m;	 Catch:{ FileNotFoundException -> 0x0089 }
        r1 = r1.getContentResolver();	 Catch:{ FileNotFoundException -> 0x0089 }
        r1 = r1.openInputStream(r7);	 Catch:{ FileNotFoundException -> 0x0089 }
        if (r1 == 0) goto L_0x0072;
    L_0x0035:
        r2 = android.graphics.drawable.Drawable.createFromStream(r1, r0);	 Catch:{ all -> 0x0055 }
        r1.close();	 Catch:{ IOException -> 0x003d }
        goto L_0x0054;
    L_0x003d:
        r1 = move-exception;
        r3 = "SuggestionsAdapter";	 Catch:{ FileNotFoundException -> 0x0089 }
        r4 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x0089 }
        r4.<init>();	 Catch:{ FileNotFoundException -> 0x0089 }
        r5 = "Error closing icon stream for ";	 Catch:{ FileNotFoundException -> 0x0089 }
        r4.append(r5);	 Catch:{ FileNotFoundException -> 0x0089 }
        r4.append(r7);	 Catch:{ FileNotFoundException -> 0x0089 }
        r4 = r4.toString();	 Catch:{ FileNotFoundException -> 0x0089 }
        android.util.Log.e(r3, r4, r1);	 Catch:{ FileNotFoundException -> 0x0089 }
    L_0x0054:
        return r2;
    L_0x0055:
        r2 = move-exception;
        r1.close();	 Catch:{ IOException -> 0x005a }
        goto L_0x0071;
    L_0x005a:
        r1 = move-exception;
        r3 = "SuggestionsAdapter";	 Catch:{ FileNotFoundException -> 0x0089 }
        r4 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x0089 }
        r4.<init>();	 Catch:{ FileNotFoundException -> 0x0089 }
        r5 = "Error closing icon stream for ";	 Catch:{ FileNotFoundException -> 0x0089 }
        r4.append(r5);	 Catch:{ FileNotFoundException -> 0x0089 }
        r4.append(r7);	 Catch:{ FileNotFoundException -> 0x0089 }
        r4 = r4.toString();	 Catch:{ FileNotFoundException -> 0x0089 }
        android.util.Log.e(r3, r4, r1);	 Catch:{ FileNotFoundException -> 0x0089 }
    L_0x0071:
        throw r2;	 Catch:{ FileNotFoundException -> 0x0089 }
    L_0x0072:
        r1 = new java.io.FileNotFoundException;	 Catch:{ FileNotFoundException -> 0x0089 }
        r2 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x0089 }
        r2.<init>();	 Catch:{ FileNotFoundException -> 0x0089 }
        r3 = "Failed to open ";	 Catch:{ FileNotFoundException -> 0x0089 }
        r2.append(r3);	 Catch:{ FileNotFoundException -> 0x0089 }
        r2.append(r7);	 Catch:{ FileNotFoundException -> 0x0089 }
        r2 = r2.toString();	 Catch:{ FileNotFoundException -> 0x0089 }
        r1.<init>(r2);	 Catch:{ FileNotFoundException -> 0x0089 }
        throw r1;	 Catch:{ FileNotFoundException -> 0x0089 }
    L_0x0089:
        r1 = move-exception;
        r2 = "SuggestionsAdapter";
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Icon not found: ";
        r3.append(r4);
        r3.append(r7);
        r7 = ", ";
        r3.append(r7);
        r7 = r1.getMessage();
        r3.append(r7);
        r7 = r3.toString();
        android.util.Log.w(r2, r7);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.aq.b(android.net.Uri):android.graphics.drawable.Drawable");
    }

    /* renamed from: b */
    private Drawable m3718b(String str) {
        ConstantState constantState = (ConstantState) this.f2812n.get(str);
        return constantState == null ? null : constantState.newDrawable();
    }

    /* renamed from: b */
    private CharSequence m3719b(CharSequence charSequence) {
        if (this.f2816r == null) {
            TypedValue typedValue = new TypedValue();
            this.d.getTheme().resolveAttribute(C0260a.textColorSearchUrl, typedValue, true);
            this.f2816r = this.d.getResources().getColorStateList(typedValue.resourceId);
        }
        CharSequence spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f2816r, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: d */
    private void m3720d(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null && !extras.getBoolean("in_progress")) {
        }
    }

    /* renamed from: e */
    private Drawable m3721e(Cursor cursor) {
        if (this.f2820v == -1) {
            return null;
        }
        Drawable a = m3710a(cursor.getString(this.f2820v));
        return a != null ? a : m3723g(cursor);
    }

    /* renamed from: f */
    private Drawable m3722f(Cursor cursor) {
        return this.f2821w == -1 ? null : m3710a(cursor.getString(this.f2821w));
    }

    /* renamed from: g */
    private Drawable m3723g(Cursor cursor) {
        Drawable a = m3709a(this.f2810l.getSearchActivity());
        return a != null ? a : this.d.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: a */
    Cursor m3724a(SearchableInfo searchableInfo, String str, int i) {
        String[] strArr = null;
        if (searchableInfo == null) {
            return null;
        }
        String suggestAuthority = searchableInfo.getSuggestAuthority();
        if (suggestAuthority == null) {
            return null;
        }
        Builder fragment = new Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.d.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    /* renamed from: a */
    public Cursor mo108a(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f2809k.getVisibility() == 0) {
            if (this.f2809k.getWindowVisibility() == 0) {
                try {
                    Cursor a = m3724a(this.f2810l, charSequence2, 50);
                    if (a != null) {
                        a.getCount();
                        return a;
                    }
                } catch (Throwable e) {
                    Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    android.graphics.drawable.Drawable m3726a(android.net.Uri r8) {
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
        r7 = this;
        r0 = r8.getAuthority();
        r1 = android.text.TextUtils.isEmpty(r0);
        if (r1 != 0) goto L_0x00ba;
    L_0x000a:
        r1 = r7.d;	 Catch:{ NameNotFoundException -> 0x00a3 }
        r1 = r1.getPackageManager();	 Catch:{ NameNotFoundException -> 0x00a3 }
        r1 = r1.getResourcesForApplication(r0);	 Catch:{ NameNotFoundException -> 0x00a3 }
        r2 = r8.getPathSegments();
        if (r2 == 0) goto L_0x008c;
    L_0x001a:
        r3 = r2.size();
        r4 = 0;
        r5 = 1;
        if (r3 != r5) goto L_0x0044;
    L_0x0022:
        r0 = r2.get(r4);	 Catch:{ NumberFormatException -> 0x002d }
        r0 = (java.lang.String) r0;	 Catch:{ NumberFormatException -> 0x002d }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x002d }
        goto L_0x0057;
    L_0x002d:
        r0 = new java.io.FileNotFoundException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Single path segment is not a resource ID: ";
        r1.append(r2);
        r1.append(r8);
        r8 = r1.toString();
        r0.<init>(r8);
        throw r0;
    L_0x0044:
        r6 = 2;
        if (r3 != r6) goto L_0x0075;
    L_0x0047:
        r3 = r2.get(r5);
        r3 = (java.lang.String) r3;
        r2 = r2.get(r4);
        r2 = (java.lang.String) r2;
        r0 = r1.getIdentifier(r3, r2, r0);
    L_0x0057:
        if (r0 == 0) goto L_0x005e;
    L_0x0059:
        r8 = r1.getDrawable(r0);
        return r8;
    L_0x005e:
        r0 = new java.io.FileNotFoundException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "No resource found for: ";
        r1.append(r2);
        r1.append(r8);
        r8 = r1.toString();
        r0.<init>(r8);
        throw r0;
    L_0x0075:
        r0 = new java.io.FileNotFoundException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "More than two path segments: ";
        r1.append(r2);
        r1.append(r8);
        r8 = r1.toString();
        r0.<init>(r8);
        throw r0;
    L_0x008c:
        r0 = new java.io.FileNotFoundException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "No path: ";
        r1.append(r2);
        r1.append(r8);
        r8 = r1.toString();
        r0.<init>(r8);
        throw r0;
    L_0x00a3:
        r0 = new java.io.FileNotFoundException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "No package found for authority: ";
        r1.append(r2);
        r1.append(r8);
        r8 = r1.toString();
        r0.<init>(r8);
        throw r0;
    L_0x00ba:
        r0 = new java.io.FileNotFoundException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "No authority: ";
        r1.append(r2);
        r1.append(r8);
        r8 = r1.toString();
        r0.<init>(r8);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.aq.a(android.net.Uri):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    public View mo474a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View a = super.mo474a(context, cursor, viewGroup);
        a.setTag(new C0378a(a));
        ((ImageView) a.findViewById(C0265f.edit_query)).setImageResource(this.f2813o);
        return a;
    }

    /* renamed from: a */
    public void m3728a(int i) {
        this.f2815q = i;
    }

    /* renamed from: a */
    public void mo109a(Cursor cursor) {
        if (this.f2814p) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
            }
            return;
        }
        try {
            super.mo109a(cursor);
            if (cursor != null) {
                this.f2817s = cursor.getColumnIndex("suggest_text_1");
                this.f2818t = cursor.getColumnIndex("suggest_text_2");
                this.f2819u = cursor.getColumnIndex("suggest_text_2_url");
                this.f2820v = cursor.getColumnIndex("suggest_icon_1");
                this.f2821w = cursor.getColumnIndex("suggest_icon_2");
                this.f2822x = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Throwable e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    /* renamed from: a */
    public void mo549a(View view, Context context, Cursor cursor) {
        C0378a c0378a = (C0378a) view.getTag();
        int i = this.f2822x != -1 ? cursor.getInt(this.f2822x) : 0;
        if (c0378a.f1325a != null) {
            m3714a(c0378a.f1325a, m3711a(cursor, this.f2817s));
        }
        if (c0378a.f1326b != null) {
            CharSequence a = m3711a(cursor, this.f2819u);
            a = a != null ? m3719b(a) : m3711a(cursor, this.f2818t);
            if (TextUtils.isEmpty(a)) {
                if (c0378a.f1325a != null) {
                    c0378a.f1325a.setSingleLine(false);
                    c0378a.f1325a.setMaxLines(2);
                }
            } else if (c0378a.f1325a != null) {
                c0378a.f1325a.setSingleLine(true);
                c0378a.f1325a.setMaxLines(1);
            }
            m3714a(c0378a.f1326b, a);
        }
        if (c0378a.f1327c != null) {
            m3713a(c0378a.f1327c, m3721e(cursor), 4);
        }
        if (c0378a.f1328d != null) {
            m3713a(c0378a.f1328d, m3722f(cursor), 8);
        }
        if (this.f2815q != 2) {
            if (this.f2815q != 1 || (i & 1) == 0) {
                c0378a.f1329e.setVisibility(8);
                return;
            }
        }
        c0378a.f1329e.setVisibility(0);
        c0378a.f1329e.setTag(c0378a.f1325a.getText());
        c0378a.f1329e.setOnClickListener(this);
    }

    /* renamed from: c */
    public CharSequence mo110c(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        CharSequence a = m3712a(cursor, "suggest_intent_query");
        if (a != null) {
            return a;
        }
        if (this.f2810l.shouldRewriteQueryFromData()) {
            a = m3712a(cursor, "suggest_intent_data");
            if (a != null) {
                return a;
            }
        }
        if (this.f2810l.shouldRewriteQueryFromText()) {
            CharSequence a2 = m3712a(cursor, "suggest_text_1");
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (Throwable e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            view = mo475b(this.d, this.c, viewGroup);
            if (view != null) {
                ((C0378a) view.getTag()).f1325a.setText(e.toString());
            }
            return view;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (Throwable e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            view = mo474a(this.d, this.c, viewGroup);
            if (view != null) {
                ((C0378a) view.getTag()).f1325a.setText(e.toString());
            }
            return view;
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m3720d(mo107a());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m3720d(mo107a());
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f2809k.m2825a((CharSequence) tag);
        }
    }
}
