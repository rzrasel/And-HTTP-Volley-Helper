package android.support.constraint;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.support.constraint.ConstraintLayout.C0050a;
import android.view.View;

/* renamed from: android.support.constraint.f */
public class C0084f extends View {
    /* renamed from: a */
    private int f457a;
    /* renamed from: b */
    private View f458b;
    /* renamed from: c */
    private int f459c;

    /* renamed from: a */
    public void m355a(ConstraintLayout constraintLayout) {
        if (this.f457a == -1 && !isInEditMode()) {
            setVisibility(this.f459c);
        }
        this.f458b = constraintLayout.findViewById(this.f457a);
        if (this.f458b != null) {
            ((C0050a) this.f458b.getLayoutParams()).aa = true;
            this.f458b.setVisibility(0);
            setVisibility(0);
        }
    }

    /* renamed from: b */
    public void m356b(ConstraintLayout constraintLayout) {
        if (this.f458b != null) {
            C0050a c0050a = (C0050a) getLayoutParams();
            C0050a c0050a2 = (C0050a) this.f458b.getLayoutParams();
            c0050a2.al.m211e(0);
            c0050a.al.m223j(c0050a2.al.m234p());
            c0050a.al.m225k(c0050a2.al.m238r());
            c0050a2.al.m211e(8);
        }
    }

    public View getContent() {
        return this.f458b;
    }

    public int getEmptyVisibility() {
        return this.f459c;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Align.LEFT);
            String str = "?";
            paint.getTextBounds(str, 0, str.length(), rect);
            canvas.drawText(str, ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i) {
        if (this.f457a != i) {
            if (this.f458b != null) {
                this.f458b.setVisibility(0);
                ((C0050a) this.f458b.getLayoutParams()).aa = false;
                this.f458b = null;
            }
            this.f457a = i;
            if (i != -1) {
                View findViewById = ((View) getParent()).findViewById(i);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.f459c = i;
    }
}
