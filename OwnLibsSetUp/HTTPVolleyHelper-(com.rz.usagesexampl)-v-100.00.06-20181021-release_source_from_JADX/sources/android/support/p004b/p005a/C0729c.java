package android.support.p004b.p005a;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.support.v4.p008a.p009a.C0095c;
import android.support.v4.p010b.p011a.C0155a;
import android.support.v4.p016f.C0549a;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.b.a.c */
public class C0729c extends C0510h implements C0034b {
    /* renamed from: a */
    final Callback f2597a;
    /* renamed from: c */
    private C0036a f2598c;
    /* renamed from: d */
    private Context f2599d;
    /* renamed from: e */
    private ArgbEvaluator f2600e;
    /* renamed from: f */
    private AnimatorListener f2601f;
    /* renamed from: g */
    private ArrayList<Object> f2602g;

    /* renamed from: android.support.b.a.c$1 */
    class C00351 implements Callback {
        /* renamed from: a */
        final /* synthetic */ C0729c f54a;

        C00351(C0729c c0729c) {
            this.f54a = c0729c;
        }

        public void invalidateDrawable(Drawable drawable) {
            this.f54a.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            this.f54a.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            this.f54a.unscheduleSelf(runnable);
        }
    }

    /* renamed from: android.support.b.a.c$a */
    private static class C0036a extends ConstantState {
        /* renamed from: a */
        int f55a;
        /* renamed from: b */
        C0730i f56b;
        /* renamed from: c */
        AnimatorSet f57c;
        /* renamed from: d */
        C0549a<Animator, String> f58d;
        /* renamed from: e */
        private ArrayList<Animator> f59e;

        public C0036a(Context context, C0036a c0036a, Callback callback, Resources resources) {
            if (c0036a != null) {
                this.f55a = c0036a.f55a;
                int i = 0;
                if (c0036a.f56b != null) {
                    ConstantState constantState = c0036a.f56b.getConstantState();
                    this.f56b = (C0730i) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    this.f56b = (C0730i) this.f56b.mutate();
                    this.f56b.setCallback(callback);
                    this.f56b.setBounds(c0036a.f56b.getBounds());
                    this.f56b.m3345a(false);
                }
                if (c0036a.f59e != null) {
                    int size = c0036a.f59e.size();
                    this.f59e = new ArrayList(size);
                    this.f58d = new C0549a(size);
                    while (i < size) {
                        Animator animator = (Animator) c0036a.f59e.get(i);
                        Animator clone = animator.clone();
                        String str = (String) c0036a.f58d.get(animator);
                        clone.setTarget(this.f56b.m3344a(str));
                        this.f59e.add(clone);
                        this.f58d.put(clone, str);
                        i++;
                    }
                    m65a();
                }
            }
        }

        /* renamed from: a */
        public void m65a() {
            if (this.f57c == null) {
                this.f57c = new AnimatorSet();
            }
            this.f57c.playTogether(this.f59e);
        }

        public int getChangingConfigurations() {
            return this.f55a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: android.support.b.a.c$b */
    private static class C0037b extends ConstantState {
        /* renamed from: a */
        private final ConstantState f60a;

        public C0037b(ConstantState constantState) {
            this.f60a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f60a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f60a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            Drawable c0729c = new C0729c();
            c0729c.b = this.f60a.newDrawable();
            c0729c.b.setCallback(c0729c.f2597a);
            return c0729c;
        }

        public Drawable newDrawable(Resources resources) {
            Drawable c0729c = new C0729c();
            c0729c.b = this.f60a.newDrawable(resources);
            c0729c.b.setCallback(c0729c.f2597a);
            return c0729c;
        }

        public Drawable newDrawable(Resources resources, Theme theme) {
            Drawable c0729c = new C0729c();
            c0729c.b = this.f60a.newDrawable(resources, theme);
            c0729c.b.setCallback(c0729c.f2597a);
            return c0729c;
        }
    }

    C0729c() {
        this(null, null, null);
    }

    private C0729c(Context context) {
        this(context, null, null);
    }

    private C0729c(Context context, C0036a c0036a, Resources resources) {
        this.f2600e = null;
        this.f2601f = null;
        this.f2602g = null;
        this.f2597a = new C00351(this);
        this.f2599d = context;
        if (c0036a != null) {
            this.f2598c = c0036a;
        } else {
            this.f2598c = new C0036a(context, c0036a, this.f2597a, resources);
        }
    }

    /* renamed from: a */
    public static C0729c m3333a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        C0729c c0729c = new C0729c(context);
        c0729c.inflate(resources, xmlPullParser, attributeSet, theme);
        return c0729c;
    }

    /* renamed from: a */
    private void m3334a(Animator animator) {
        if (animator instanceof AnimatorSet) {
            List childAnimations = ((AnimatorSet) animator).getChildAnimations();
            if (childAnimations != null) {
                for (int i = 0; i < childAnimations.size(); i++) {
                    m3334a((Animator) childAnimations.get(i));
                }
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f2600e == null) {
                    this.f2600e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f2600e);
            }
        }
    }

    /* renamed from: a */
    private void m3335a(String str, Animator animator) {
        animator.setTarget(this.f2598c.f56b.m3344a(str));
        if (VERSION.SDK_INT < 21) {
            m3334a(animator);
        }
        if (this.f2598c.f59e == null) {
            this.f2598c.f59e = new ArrayList();
            this.f2598c.f58d = new C0549a();
        }
        this.f2598c.f59e.add(animator);
        this.f2598c.f58d.put(animator, str);
    }

    public void applyTheme(Theme theme) {
        if (this.b != null) {
            C0155a.m563a(this.b, theme);
        }
    }

    public boolean canApplyTheme() {
        return this.b != null ? C0155a.m570d(this.b) : false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        if (this.b != null) {
            this.b.draw(canvas);
            return;
        }
        this.f2598c.f56b.draw(canvas);
        if (this.f2598c.f57c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        return this.b != null ? C0155a.m569c(this.b) : this.f2598c.f56b.getAlpha();
    }

    public int getChangingConfigurations() {
        return this.b != null ? this.b.getChangingConfigurations() : super.getChangingConfigurations() | this.f2598c.f55a;
    }

    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public ConstantState getConstantState() {
        return (this.b == null || VERSION.SDK_INT < 24) ? null : new C0037b(this.b.getConstantState());
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.b != null ? this.b.getIntrinsicHeight() : this.f2598c.f56b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.b != null ? this.b.getIntrinsicWidth() : this.f2598c.f56b.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        return this.b != null ? this.b.getOpacity() : this.f2598c.f56b.getOpacity();
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        if (this.b != null) {
            C0155a.m564a(this.b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                TypedArray a;
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    a = C0095c.m378a(resources, theme, attributeSet, C0033a.f46e);
                    int resourceId = a.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0730i a2 = C0730i.m3338a(resources, resourceId, theme);
                        a2.m3345a(false);
                        a2.setCallback(this.f2597a);
                        if (this.f2598c.f56b != null) {
                            this.f2598c.f56b.setCallback(null);
                        }
                        this.f2598c.f56b = a2;
                    }
                } else if ("target".equals(name)) {
                    a = resources.obtainAttributes(attributeSet, C0033a.f47f);
                    String string = a.getString(0);
                    int resourceId2 = a.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        if (this.f2599d != null) {
                            m3335a(string, C0041e.m71a(this.f2599d, resourceId2));
                        } else {
                            a.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                } else {
                    continue;
                }
                a.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f2598c.m65a();
    }

    public boolean isAutoMirrored() {
        return this.b != null ? C0155a.m567b(this.b) : this.f2598c.f56b.isAutoMirrored();
    }

    public boolean isRunning() {
        return this.b != null ? ((AnimatedVectorDrawable) this.b).isRunning() : this.f2598c.f57c.isRunning();
    }

    public boolean isStateful() {
        return this.b != null ? this.b.isStateful() : this.f2598c.f56b.isStateful();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (this.b != null) {
            this.b.mutate();
        }
        return this;
    }

    protected void onBoundsChange(Rect rect) {
        if (this.b != null) {
            this.b.setBounds(rect);
        } else {
            this.f2598c.f56b.setBounds(rect);
        }
    }

    protected boolean onLevelChange(int i) {
        return this.b != null ? this.b.setLevel(i) : this.f2598c.f56b.setLevel(i);
    }

    protected boolean onStateChange(int[] iArr) {
        return this.b != null ? this.b.setState(iArr) : this.f2598c.f56b.setState(iArr);
    }

    public void setAlpha(int i) {
        if (this.b != null) {
            this.b.setAlpha(i);
        } else {
            this.f2598c.f56b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        if (this.b != null) {
            C0155a.m566a(this.b, z);
        } else {
            this.f2598c.f56b.setAutoMirrored(z);
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, Mode mode) {
        super.setColorFilter(i, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.b != null) {
            this.b.setColorFilter(colorFilter);
        } else {
            this.f2598c.f56b.setColorFilter(colorFilter);
        }
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i) {
        if (this.b != null) {
            C0155a.m560a(this.b, i);
        } else {
            this.f2598c.f56b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.b != null) {
            C0155a.m562a(this.b, colorStateList);
        } else {
            this.f2598c.f56b.setTintList(colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        if (this.b != null) {
            C0155a.m565a(this.b, mode);
        } else {
            this.f2598c.f56b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (this.b != null) {
            return this.b.setVisible(z, z2);
        }
        this.f2598c.f56b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        if (this.b != null) {
            ((AnimatedVectorDrawable) this.b).start();
        } else if (!this.f2598c.f57c.isStarted()) {
            this.f2598c.f57c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        if (this.b != null) {
            ((AnimatedVectorDrawable) this.b).stop();
        } else {
            this.f2598c.f57c.end();
        }
    }
}
