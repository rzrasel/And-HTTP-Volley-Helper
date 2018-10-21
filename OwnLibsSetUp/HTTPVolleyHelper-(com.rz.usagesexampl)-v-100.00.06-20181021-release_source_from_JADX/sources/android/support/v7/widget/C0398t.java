package android.support.v7.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.support.v4.p010b.p011a.C0157c;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* renamed from: android.support.v7.widget.t */
class C0398t {
    /* renamed from: a */
    private static final int[] f1435a = new int[]{16843067, 16843068};
    /* renamed from: b */
    private final ProgressBar f1436b;
    /* renamed from: c */
    private Bitmap f1437c;

    C0398t(ProgressBar progressBar) {
        this.f1436b = progressBar;
    }

    /* renamed from: a */
    private Drawable mo340a(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        Drawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable a = m1599a(animationDrawable.getFrame(i), true);
            a.setLevel(10000);
            animationDrawable2.addFrame(a, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* renamed from: a */
    private Drawable m1599a(Drawable drawable, boolean z) {
        Drawable a;
        if (drawable instanceof C0157c) {
            C0157c c0157c = (C0157c) drawable;
            a = c0157c.mo67a();
            if (a != null) {
                c0157c.mo68a(m1599a(a, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                boolean z2;
                int id = layerDrawable.getId(i);
                Drawable drawable2 = layerDrawable.getDrawable(i);
                if (id != 16908301) {
                    if (id != 16908303) {
                        z2 = false;
                        drawableArr[i] = m1599a(drawable2, z2);
                    }
                }
                z2 = true;
                drawableArr[i] = m1599a(drawable2, z2);
            }
            a = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                a.setId(i2, layerDrawable.getId(i2));
            }
            return a;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f1437c == null) {
                this.f1437c = bitmap;
            }
            Drawable shapeDrawable = new ShapeDrawable(mo342b());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, TileMode.REPEAT, TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            drawable = z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    /* renamed from: b */
    private Shape mo342b() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* renamed from: a */
    Bitmap m1601a() {
        return this.f1437c;
    }

    /* renamed from: a */
    void mo341a(AttributeSet attributeSet, int i) {
        aw a = aw.m1478a(this.f1436b.getContext(), attributeSet, f1435a, i, 0);
        Drawable b = a.m1486b(0);
        if (b != null) {
            this.f1436b.setIndeterminateDrawable(mo340a(b));
        }
        b = a.m1486b(1);
        if (b != null) {
            this.f1436b.setProgressDrawable(m1599a(b, false));
        }
        a.m1483a();
    }
}
