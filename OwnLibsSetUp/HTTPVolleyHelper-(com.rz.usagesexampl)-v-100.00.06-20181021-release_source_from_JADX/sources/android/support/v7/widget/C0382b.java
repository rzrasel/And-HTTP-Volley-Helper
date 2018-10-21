package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v7.widget.b */
class C0382b extends Drawable {
    /* renamed from: a */
    final ActionBarContainer f1365a;

    public C0382b(ActionBarContainer actionBarContainer) {
        this.f1365a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        if (!this.f1365a.f1119d) {
            if (this.f1365a.f1116a != null) {
                this.f1365a.f1116a.draw(canvas);
            }
            if (this.f1365a.f1117b != null && this.f1365a.f1120e) {
                drawable = this.f1365a.f1117b;
            } else {
                return;
            }
        } else if (this.f1365a.f1118c != null) {
            drawable = this.f1365a.f1118c;
        } else {
            return;
        }
        drawable.draw(canvas);
    }

    public int getOpacity() {
        return 0;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
