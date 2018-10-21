package android.support.v7.widget;

import android.os.Build.VERSION;
import android.view.View;

public class ay {
    /* renamed from: a */
    public static void m1497a(View view, CharSequence charSequence) {
        if (VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            az.m1501a(view, charSequence);
        }
    }
}
