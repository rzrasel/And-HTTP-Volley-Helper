package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.support.v4.p008a.C0096a;

/* renamed from: android.support.v4.app.a */
public class C0526a extends C0096a {
    /* renamed from: a */
    private static C0100a f1832a;

    /* renamed from: android.support.v4.app.a$a */
    public interface C0100a {
        /* renamed from: a */
        boolean m403a(Activity activity, int i, int i2, Intent intent);
    }

    /* renamed from: a */
    public static C0100a m2083a() {
        return f1832a;
    }

    /* renamed from: a */
    public static void m2084a(Activity activity) {
        if (VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }
}
