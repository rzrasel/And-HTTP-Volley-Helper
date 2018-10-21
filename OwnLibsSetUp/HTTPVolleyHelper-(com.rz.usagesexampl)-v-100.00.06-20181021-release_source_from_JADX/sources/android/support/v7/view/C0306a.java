package android.support.v7.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v7.p020a.C0270a.C0260a;
import android.support.v7.p020a.C0270a.C0261b;
import android.support.v7.p020a.C0270a.C0263d;
import android.support.v7.p020a.C0270a.C0269j;
import android.view.ViewConfiguration;

/* renamed from: android.support.v7.view.a */
public class C0306a {
    /* renamed from: a */
    private Context f1025a;

    private C0306a(Context context) {
        this.f1025a = context;
    }

    /* renamed from: a */
    public static C0306a m1140a(Context context) {
        return new C0306a(context);
    }

    /* renamed from: a */
    public int m1141a() {
        Configuration configuration = this.f1025a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i <= 600 && (i <= 960 || i2 <= 720)) {
            if (i <= 720 || i2 <= 960) {
                if (i < 500 && (i <= 640 || i2 <= 480)) {
                    if (i <= 480 || i2 <= 640) {
                        return i >= 360 ? 3 : 2;
                    }
                }
                return 4;
            }
        }
        return 5;
    }

    /* renamed from: b */
    public boolean m1142b() {
        return VERSION.SDK_INT >= 19 ? true : ViewConfiguration.get(this.f1025a).hasPermanentMenuKey() ^ true;
    }

    /* renamed from: c */
    public int m1143c() {
        return this.f1025a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public boolean m1144d() {
        return this.f1025a.getResources().getBoolean(C0261b.abc_action_bar_embed_tabs);
    }

    /* renamed from: e */
    public int m1145e() {
        TypedArray obtainStyledAttributes = this.f1025a.obtainStyledAttributes(null, C0269j.ActionBar, C0260a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C0269j.ActionBar_height, 0);
        Resources resources = this.f1025a.getResources();
        if (!m1144d()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C0263d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: f */
    public boolean m1146f() {
        return this.f1025a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: g */
    public int m1147g() {
        return this.f1025a.getResources().getDimensionPixelSize(C0263d.abc_action_bar_stacked_tab_max_width);
    }
}
