package android.support.v7.widget;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v7.widget.c */
class C0618c extends C0382b {
    public C0618c(ActionBarContainer actionBarContainer) {
        super(actionBarContainer);
    }

    public void getOutline(Outline outline) {
        Drawable drawable;
        if (this.a.f1119d) {
            if (this.a.f1118c != null) {
                drawable = this.a.f1118c;
            } else {
                return;
            }
        } else if (this.a.f1116a != null) {
            drawable = this.a.f1116a;
        } else {
            return;
        }
        drawable.getOutline(outline);
    }
}
