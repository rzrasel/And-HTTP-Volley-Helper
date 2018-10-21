package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p010b.p011a.C0155a;
import android.support.v4.p017g.C0234s;
import android.support.v4.widget.C0571h;
import android.support.v7.p020a.C0270a.C0260a;
import android.support.v7.p023c.p024a.C0305a;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

class ag extends ListView {
    /* renamed from: a */
    private final Rect f1247a = new Rect();
    /* renamed from: b */
    private int f1248b = 0;
    /* renamed from: c */
    private int f1249c = 0;
    /* renamed from: d */
    private int f1250d = 0;
    /* renamed from: e */
    private int f1251e = 0;
    /* renamed from: f */
    private int f1252f;
    /* renamed from: g */
    private Field f1253g;
    /* renamed from: h */
    private C0616a f1254h;
    /* renamed from: i */
    private boolean f1255i;
    /* renamed from: j */
    private boolean f1256j;
    /* renamed from: k */
    private boolean f1257k;
    /* renamed from: l */
    private C0234s f1258l;
    /* renamed from: m */
    private C0571h f1259m;
    /* renamed from: n */
    private C0362b f1260n;

    /* renamed from: android.support.v7.widget.ag$b */
    private class C0362b implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ag f1246a;

        private C0362b(ag agVar) {
            this.f1246a = agVar;
        }

        /* renamed from: a */
        public void m1402a() {
            this.f1246a.f1260n = null;
            this.f1246a.removeCallbacks(this);
        }

        /* renamed from: b */
        public void m1403b() {
            this.f1246a.post(this);
        }

        public void run() {
            this.f1246a.f1260n = null;
            this.f1246a.drawableStateChanged();
        }
    }

    /* renamed from: android.support.v7.widget.ag$a */
    private static class C0616a extends C0305a {
        /* renamed from: a */
        private boolean f2328a = true;

        C0616a(Drawable drawable) {
            super(drawable);
        }

        /* renamed from: a */
        void m2850a(boolean z) {
            this.f2328a = z;
        }

        public void draw(Canvas canvas) {
            if (this.f2328a) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.f2328a) {
                super.setHotspot(f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f2328a) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public boolean setState(int[] iArr) {
            return this.f2328a ? super.setState(iArr) : false;
        }

        public boolean setVisible(boolean z, boolean z2) {
            return this.f2328a ? super.setVisible(z, z2) : false;
        }
    }

    ag(Context context, boolean z) {
        super(context, null, C0260a.dropDownListViewStyle);
        this.f1256j = z;
        setCacheColorHint(0);
        try {
            this.f1253g = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1253g.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m1405a() {
        Drawable selector = getSelector();
        if (selector != null && m1413c() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    /* renamed from: a */
    private void m1406a(int i, View view) {
        Drawable selector = getSelector();
        boolean z = true;
        Object obj = (selector == null || i == -1) ? null : 1;
        if (obj != null) {
            selector.setVisible(false, false);
        }
        m1412b(i, view);
        if (obj != null) {
            Rect rect = this.f1247a;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            C0155a.m559a(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: a */
    private void m1407a(int i, View view, float f, float f2) {
        m1406a(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            C0155a.m559a(selector, f, f2);
        }
    }

    /* renamed from: a */
    private void m1408a(Canvas canvas) {
        if (!this.f1247a.isEmpty()) {
            Drawable selector = getSelector();
            if (selector != null) {
                selector.setBounds(this.f1247a);
                selector.draw(canvas);
            }
        }
    }

    /* renamed from: a */
    private void m1409a(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: a */
    private void m1410a(View view, int i, float f, float f2) {
        this.f1257k = true;
        if (VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        if (this.f1252f != -1) {
            View childAt = getChildAt(this.f1252f - getFirstVisiblePosition());
            if (!(childAt == null || childAt == view || !childAt.isPressed())) {
                childAt.setPressed(false);
            }
        }
        this.f1252f = i;
        float left = f - ((float) view.getLeft());
        float top = f2 - ((float) view.getTop());
        if (VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m1407a(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: b */
    private void m1411b() {
        this.f1257k = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1252f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        if (this.f1258l != null) {
            this.f1258l.m914b();
            this.f1258l = null;
        }
    }

    /* renamed from: b */
    private void m1412b(int i, View view) {
        Rect rect = this.f1247a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1248b;
        rect.top -= this.f1249c;
        rect.right += this.f1250d;
        rect.bottom += this.f1251e;
        try {
            boolean z = this.f1253g.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f1253g.set(this, Boolean.valueOf(z ^ 1));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    private boolean m1413c() {
        return this.f1257k;
    }

    private void setSelectorEnabled(boolean z) {
        if (this.f1254h != null) {
            this.f1254h.m2850a(z);
        }
    }

    /* renamed from: a */
    public int mo290a(int i, int i2, int i3, int i4, int i5) {
        i2 = getListPaddingTop();
        i3 = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return i2 + i3;
        }
        i2 += i3;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i6 = i2;
        View view = null;
        i2 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i2 < count) {
            int itemViewType = adapter.getItemViewType(i2);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i2, view, this);
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            view.measure(i, layoutParams.height > 0 ? MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824) : MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i2 > 0) {
                i6 += dividerHeight;
            }
            i6 += view.getMeasuredHeight();
            if (i6 >= i4) {
                if (i5 >= 0 && i2 > i5 && i8 > 0 && i6 != i4) {
                    i4 = i8;
                }
                return i4;
            }
            if (i5 >= 0 && i2 >= i5) {
                i8 = i6;
            }
            i2++;
        }
        return i6;
    }

    /* renamed from: a */
    public boolean mo291a(MotionEvent motionEvent, int i) {
        boolean z;
        Object obj;
        int actionMasked = motionEvent.getActionMasked();
        switch (actionMasked) {
            case 1:
                z = false;
                break;
            case 2:
                z = true;
                break;
            case 3:
                obj = null;
                z = false;
                break;
            default:
                obj = null;
                z = true;
                break;
        }
        i = motionEvent.findPointerIndex(i);
        if (i < 0) {
            obj = null;
            z = false;
            if (!(z && r9 == null)) {
                m1411b();
            }
            if (!z) {
                if (this.f1259m == null) {
                    this.f1259m = new C0571h(this);
                }
                this.f1259m.m952a(true);
                this.f1259m.onTouch(this, motionEvent);
            } else if (this.f1259m != null) {
                this.f1259m.m952a(false);
            }
            return z;
        }
        int x = (int) motionEvent.getX(i);
        i = (int) motionEvent.getY(i);
        int pointToPosition = pointToPosition(x, i);
        if (pointToPosition == -1) {
            obj = 1;
            m1411b();
            if (!z) {
                if (this.f1259m == null) {
                    this.f1259m = new C0571h(this);
                }
                this.f1259m.m952a(true);
                this.f1259m.onTouch(this, motionEvent);
            } else if (this.f1259m != null) {
                this.f1259m.m952a(false);
            }
            return z;
        }
        View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
        m1410a(childAt, pointToPosition, (float) x, (float) i);
        if (actionMasked == 1) {
            m1409a(childAt, pointToPosition);
        }
        obj = null;
        z = true;
        m1411b();
        if (!z) {
            if (this.f1259m == null) {
                this.f1259m = new C0571h(this);
            }
            this.f1259m.m952a(true);
            this.f1259m.onTouch(this, motionEvent);
        } else if (this.f1259m != null) {
            this.f1259m.m952a(false);
        }
        return z;
    }

    protected void dispatchDraw(Canvas canvas) {
        m1408a(canvas);
        super.dispatchDraw(canvas);
    }

    protected void drawableStateChanged() {
        if (this.f1260n == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            m1405a();
        }
    }

    public boolean hasFocus() {
        if (!this.f1256j) {
            if (!super.hasFocus()) {
                return false;
            }
        }
        return true;
    }

    public boolean hasWindowFocus() {
        if (!this.f1256j) {
            if (!super.hasWindowFocus()) {
                return false;
            }
        }
        return true;
    }

    public boolean isFocused() {
        if (!this.f1256j) {
            if (!super.isFocused()) {
                return false;
            }
        }
        return true;
    }

    public boolean isInTouchMode() {
        return (this.f1256j && this.f1255i) || super.isInTouchMode();
    }

    protected void onDetachedFromWindow() {
        this.f1260n = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1260n == null) {
            this.f1260n = new C0362b();
            this.f1260n.m1403b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9) {
            if (actionMasked != 7) {
                setSelection(-1);
                return onHoverEvent;
            }
        }
        int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
            View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
            }
            m1405a();
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1252f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (this.f1260n != null) {
            this.f1260n.m1402a();
        }
        return super.onTouchEvent(motionEvent);
    }

    void setListSelectionHidden(boolean z) {
        this.f1255i = z;
    }

    public void setSelector(Drawable drawable) {
        this.f1254h = drawable != null ? new C0616a(drawable) : null;
        super.setSelector(this.f1254h);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1248b = rect.left;
        this.f1249c = rect.top;
        this.f1250d = rect.right;
        this.f1251e = rect.bottom;
    }
}
