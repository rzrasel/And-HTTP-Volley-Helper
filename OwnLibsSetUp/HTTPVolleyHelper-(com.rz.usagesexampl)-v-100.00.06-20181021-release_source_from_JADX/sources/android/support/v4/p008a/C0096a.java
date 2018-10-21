package android.support.v4.p008a;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.TypedValue;

/* renamed from: android.support.v4.a.a */
public class C0096a {
    /* renamed from: a */
    private static final Object f468a = new Object();
    /* renamed from: b */
    private static TypedValue f469b;

    /* renamed from: a */
    public static Drawable m385a(Context context, int i) {
        if (VERSION.SDK_INT >= 21) {
            return context.getDrawable(i);
        }
        if (VERSION.SDK_INT < 16) {
            synchronized (f468a) {
                if (f469b == null) {
                    f469b = new TypedValue();
                }
                context.getResources().getValue(i, f469b, true);
                i = f469b.resourceId;
            }
        }
        return context.getResources().getDrawable(i);
    }

    /* renamed from: a */
    public static boolean m386a(Context context, Intent[] intentArr, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            context.startActivities(intentArr, bundle);
        } else {
            context.startActivities(intentArr);
        }
        return true;
    }

    /* renamed from: b */
    public static ColorStateList m387b(Context context, int i) {
        return VERSION.SDK_INT >= 23 ? context.getColorStateList(i) : context.getResources().getColorStateList(i);
    }
}
