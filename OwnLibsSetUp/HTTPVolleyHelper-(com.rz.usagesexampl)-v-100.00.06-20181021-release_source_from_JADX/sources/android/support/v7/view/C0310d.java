package android.support.v7.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.support.v7.p020a.C0270a.C0268i;
import android.view.LayoutInflater;

/* renamed from: android.support.v7.view.d */
public class C0310d extends ContextWrapper {
    /* renamed from: a */
    private int f1028a;
    /* renamed from: b */
    private Theme f1029b;
    /* renamed from: c */
    private LayoutInflater f1030c;
    /* renamed from: d */
    private Configuration f1031d;
    /* renamed from: e */
    private Resources f1032e;

    public C0310d() {
        super(null);
    }

    public C0310d(Context context, int i) {
        super(context);
        this.f1028a = i;
    }

    public C0310d(Context context, Theme theme) {
        super(context);
        this.f1029b = theme;
    }

    /* renamed from: b */
    private Resources m1171b() {
        if (this.f1032e == null) {
            Resources resources;
            if (this.f1031d == null) {
                resources = super.getResources();
            } else if (VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(this.f1031d).getResources();
            }
            this.f1032e = resources;
        }
        return this.f1032e;
    }

    /* renamed from: c */
    private void m1172c() {
        boolean z = this.f1029b == null;
        if (z) {
            this.f1029b = getResources().newTheme();
            Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f1029b.setTo(theme);
            }
        }
        m1174a(this.f1029b, this.f1028a, z);
    }

    /* renamed from: a */
    public int m1173a() {
        return this.f1028a;
    }

    /* renamed from: a */
    protected void m1174a(Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return m1171b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f1030c == null) {
            this.f1030c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f1030c;
    }

    public Theme getTheme() {
        if (this.f1029b != null) {
            return this.f1029b;
        }
        if (this.f1028a == 0) {
            this.f1028a = C0268i.Theme_AppCompat_Light;
        }
        m1172c();
        return this.f1029b;
    }

    public void setTheme(int i) {
        if (this.f1028a != i) {
            this.f1028a = i;
            m1172c();
        }
    }
}
