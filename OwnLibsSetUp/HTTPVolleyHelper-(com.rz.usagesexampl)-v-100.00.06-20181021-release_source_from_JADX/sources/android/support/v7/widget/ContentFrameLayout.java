package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.p017g.C0227p;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

public class ContentFrameLayout extends FrameLayout {
    /* renamed from: a */
    private TypedValue f1158a;
    /* renamed from: b */
    private TypedValue f1159b;
    /* renamed from: c */
    private TypedValue f1160c;
    /* renamed from: d */
    private TypedValue f1161d;
    /* renamed from: e */
    private TypedValue f1162e;
    /* renamed from: f */
    private TypedValue f1163f;
    /* renamed from: g */
    private final Rect f1164g;
    /* renamed from: h */
    private C0347a f1165h;

    /* renamed from: android.support.v7.widget.ContentFrameLayout$a */
    public interface C0347a {
        /* renamed from: a */
        void mo138a();

        /* renamed from: b */
        void mo139b();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1164g = new Rect();
    }

    /* renamed from: a */
    public void m1269a(int i, int i2, int i3, int i4) {
        this.f1164g.set(i, i2, i3, i4);
        if (C0227p.m886l(this)) {
            requestLayout();
        }
    }

    /* renamed from: a */
    public void m1270a(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1162e == null) {
            this.f1162e = new TypedValue();
        }
        return this.f1162e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1163f == null) {
            this.f1163f = new TypedValue();
        }
        return this.f1163f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1160c == null) {
            this.f1160c = new TypedValue();
        }
        return this.f1160c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1161d == null) {
            this.f1161d = new TypedValue();
        }
        return this.f1161d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1158a == null) {
            this.f1158a = new TypedValue();
        }
        return this.f1158a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1159b == null) {
            this.f1159b = new TypedValue();
        }
        return this.f1159b;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1165h != null) {
            this.f1165h.mo138a();
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f1165h != null) {
            this.f1165h.mo139b();
        }
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        Object obj;
        TypedValue typedValue;
        float dimension;
        TypedValue typedValue2;
        float dimension2;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        Object obj2 = 1;
        Object obj3 = displayMetrics.widthPixels < displayMetrics.heightPixels ? 1 : null;
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue3 = obj3 != null ? this.f1161d : this.f1160c;
            if (!(typedValue3 == null || typedValue3.type == 0)) {
                float dimension3;
                if (typedValue3.type == 5) {
                    dimension3 = typedValue3.getDimension(displayMetrics);
                } else if (typedValue3.type == 6) {
                    dimension3 = typedValue3.getFraction((float) displayMetrics.widthPixels, (float) displayMetrics.widthPixels);
                } else {
                    i3 = 0;
                    if (i3 > 0) {
                        i3 = MeasureSpec.makeMeasureSpec(Math.min(i3 - (this.f1164g.left + this.f1164g.right), MeasureSpec.getSize(i)), 1073741824);
                        obj = 1;
                        if (mode2 == Integer.MIN_VALUE) {
                            typedValue = obj3 != null ? this.f1162e : this.f1163f;
                            if (!(typedValue == null || typedValue.type == 0)) {
                                if (typedValue.type != 5) {
                                    dimension = typedValue.getDimension(displayMetrics);
                                } else if (typedValue.type == 6) {
                                    dimension = typedValue.getFraction((float) displayMetrics.heightPixels, (float) displayMetrics.heightPixels);
                                } else {
                                    mode2 = 0;
                                    if (mode2 > 0) {
                                        i2 = MeasureSpec.makeMeasureSpec(Math.min(mode2 - (this.f1164g.top + this.f1164g.bottom), MeasureSpec.getSize(i2)), 1073741824);
                                    }
                                }
                                mode2 = (int) dimension;
                                if (mode2 > 0) {
                                    i2 = MeasureSpec.makeMeasureSpec(Math.min(mode2 - (this.f1164g.top + this.f1164g.bottom), MeasureSpec.getSize(i2)), 1073741824);
                                }
                            }
                        }
                        super.onMeasure(i3, i2);
                        mode2 = getMeasuredWidth();
                        i3 = MeasureSpec.makeMeasureSpec(mode2, 1073741824);
                        if (obj == null && mode == Integer.MIN_VALUE) {
                            typedValue2 = obj3 != null ? this.f1159b : this.f1158a;
                            if (!(typedValue2 == null || typedValue2.type == 0)) {
                                if (typedValue2.type != 5) {
                                    dimension2 = typedValue2.getDimension(displayMetrics);
                                } else if (typedValue2.type == 6) {
                                    dimension2 = typedValue2.getFraction((float) displayMetrics.widthPixels, (float) displayMetrics.widthPixels);
                                } else {
                                    i = 0;
                                    if (i > 0) {
                                        i -= this.f1164g.left + this.f1164g.right;
                                    }
                                    if (mode2 < i) {
                                        i3 = MeasureSpec.makeMeasureSpec(i, 1073741824);
                                        if (obj2 == null) {
                                            super.onMeasure(i3, i2);
                                        }
                                    }
                                }
                                i = (int) dimension2;
                                if (i > 0) {
                                    i -= this.f1164g.left + this.f1164g.right;
                                }
                                if (mode2 < i) {
                                    i3 = MeasureSpec.makeMeasureSpec(i, 1073741824);
                                    if (obj2 == null) {
                                        super.onMeasure(i3, i2);
                                    }
                                }
                            }
                        }
                        obj2 = null;
                        if (obj2 == null) {
                            super.onMeasure(i3, i2);
                        }
                    }
                }
                i3 = (int) dimension3;
                if (i3 > 0) {
                    i3 = MeasureSpec.makeMeasureSpec(Math.min(i3 - (this.f1164g.left + this.f1164g.right), MeasureSpec.getSize(i)), 1073741824);
                    obj = 1;
                    if (mode2 == Integer.MIN_VALUE) {
                        if (obj3 != null) {
                        }
                        if (typedValue.type != 5) {
                            dimension = typedValue.getDimension(displayMetrics);
                        } else if (typedValue.type == 6) {
                            mode2 = 0;
                            if (mode2 > 0) {
                                i2 = MeasureSpec.makeMeasureSpec(Math.min(mode2 - (this.f1164g.top + this.f1164g.bottom), MeasureSpec.getSize(i2)), 1073741824);
                            }
                        } else {
                            dimension = typedValue.getFraction((float) displayMetrics.heightPixels, (float) displayMetrics.heightPixels);
                        }
                        mode2 = (int) dimension;
                        if (mode2 > 0) {
                            i2 = MeasureSpec.makeMeasureSpec(Math.min(mode2 - (this.f1164g.top + this.f1164g.bottom), MeasureSpec.getSize(i2)), 1073741824);
                        }
                    }
                    super.onMeasure(i3, i2);
                    mode2 = getMeasuredWidth();
                    i3 = MeasureSpec.makeMeasureSpec(mode2, 1073741824);
                    if (obj3 != null) {
                    }
                    if (typedValue2.type != 5) {
                        dimension2 = typedValue2.getDimension(displayMetrics);
                    } else if (typedValue2.type == 6) {
                        i = 0;
                        if (i > 0) {
                            i -= this.f1164g.left + this.f1164g.right;
                        }
                        if (mode2 < i) {
                            i3 = MeasureSpec.makeMeasureSpec(i, 1073741824);
                            if (obj2 == null) {
                                super.onMeasure(i3, i2);
                            }
                        }
                        obj2 = null;
                        if (obj2 == null) {
                            super.onMeasure(i3, i2);
                        }
                    } else {
                        dimension2 = typedValue2.getFraction((float) displayMetrics.widthPixels, (float) displayMetrics.widthPixels);
                    }
                    i = (int) dimension2;
                    if (i > 0) {
                        i -= this.f1164g.left + this.f1164g.right;
                    }
                    if (mode2 < i) {
                        i3 = MeasureSpec.makeMeasureSpec(i, 1073741824);
                        if (obj2 == null) {
                            super.onMeasure(i3, i2);
                        }
                    }
                    obj2 = null;
                    if (obj2 == null) {
                        super.onMeasure(i3, i2);
                    }
                }
            }
        }
        i3 = i;
        obj = null;
        if (mode2 == Integer.MIN_VALUE) {
            if (obj3 != null) {
            }
            if (typedValue.type != 5) {
                dimension = typedValue.getDimension(displayMetrics);
            } else if (typedValue.type == 6) {
                dimension = typedValue.getFraction((float) displayMetrics.heightPixels, (float) displayMetrics.heightPixels);
            } else {
                mode2 = 0;
                if (mode2 > 0) {
                    i2 = MeasureSpec.makeMeasureSpec(Math.min(mode2 - (this.f1164g.top + this.f1164g.bottom), MeasureSpec.getSize(i2)), 1073741824);
                }
            }
            mode2 = (int) dimension;
            if (mode2 > 0) {
                i2 = MeasureSpec.makeMeasureSpec(Math.min(mode2 - (this.f1164g.top + this.f1164g.bottom), MeasureSpec.getSize(i2)), 1073741824);
            }
        }
        super.onMeasure(i3, i2);
        mode2 = getMeasuredWidth();
        i3 = MeasureSpec.makeMeasureSpec(mode2, 1073741824);
        if (obj3 != null) {
        }
        if (typedValue2.type != 5) {
            dimension2 = typedValue2.getDimension(displayMetrics);
        } else if (typedValue2.type == 6) {
            dimension2 = typedValue2.getFraction((float) displayMetrics.widthPixels, (float) displayMetrics.widthPixels);
        } else {
            i = 0;
            if (i > 0) {
                i -= this.f1164g.left + this.f1164g.right;
            }
            if (mode2 < i) {
                i3 = MeasureSpec.makeMeasureSpec(i, 1073741824);
                if (obj2 == null) {
                    super.onMeasure(i3, i2);
                }
            }
            obj2 = null;
            if (obj2 == null) {
                super.onMeasure(i3, i2);
            }
        }
        i = (int) dimension2;
        if (i > 0) {
            i -= this.f1164g.left + this.f1164g.right;
        }
        if (mode2 < i) {
            i3 = MeasureSpec.makeMeasureSpec(i, 1073741824);
            if (obj2 == null) {
                super.onMeasure(i3, i2);
            }
        }
        obj2 = null;
        if (obj2 == null) {
            super.onMeasure(i3, i2);
        }
    }

    public void setAttachListener(C0347a c0347a) {
        this.f1165h = c0347a;
    }
}
