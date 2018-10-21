package android.support.v4.p017g;

import android.os.Build.VERSION;
import android.view.Gravity;

/* renamed from: android.support.v4.g.d */
public final class C0213d {
    /* renamed from: a */
    public static int m797a(int i, int i2) {
        return VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i, i2) : i & -8388609;
    }
}
