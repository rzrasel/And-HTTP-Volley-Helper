package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.p017g.C0224o;
import android.support.v4.widget.C0244b;
import android.support.v7.p020a.C0270a.C0260a;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.h */
public class C0625h extends Button implements C0224o, C0244b {
    /* renamed from: b */
    private final C0390g f2396b;
    /* renamed from: c */
    private final C0405z f2397c;

    public C0625h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0260a.buttonStyle);
    }

    public C0625h(Context context, AttributeSet attributeSet, int i) {
        super(at.m1473a(context), attributeSet, i);
        this.f2396b = new C0390g(this);
        this.f2396b.m1542a(attributeSet, i);
        this.f2397c = C0405z.m1604a((TextView) this);
        this.f2397c.mo276a(attributeSet, i);
        this.f2397c.mo275a();
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f2396b != null) {
            this.f2396b.m1545c();
        }
        if (this.f2397c != null) {
            this.f2397c.mo275a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        return a ? super.getAutoSizeMaxTextSize() : this.f2397c != null ? this.f2397c.m1624g() : -1;
    }

    public int getAutoSizeMinTextSize() {
        return a ? super.getAutoSizeMinTextSize() : this.f2397c != null ? this.f2397c.m1623f() : -1;
    }

    public int getAutoSizeStepGranularity() {
        return a ? super.getAutoSizeStepGranularity() : this.f2397c != null ? this.f2397c.m1622e() : -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        return a ? super.getAutoSizeTextAvailableSizes() : this.f2397c != null ? this.f2397c.m1625h() : new int[0];
    }

    public int getAutoSizeTextType() {
        int i = 0;
        if (!a) {
            return this.f2397c != null ? this.f2397c.m1621d() : 0;
        } else {
            if (super.getAutoSizeTextType() == 1) {
                i = 1;
            }
            return i;
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.f2396b != null ? this.f2396b.m1537a() : null;
    }

    public Mode getSupportBackgroundTintMode() {
        return this.f2396b != null ? this.f2396b.m1543b() : null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f2397c != null) {
            this.f2397c.m1617a(z, i, i2, i3, i4);
        }
    }

    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f2397c != null && !a && this.f2397c.m1620c()) {
            this.f2397c.m1619b();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        } else if (this.f2397c != null) {
            this.f2397c.m1612a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        } else if (this.f2397c != null) {
            this.f2397c.m1618a(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (a) {
            super.setAutoSizeTextTypeWithDefaults(i);
        } else if (this.f2397c != null) {
            this.f2397c.m1610a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f2396b != null) {
            this.f2396b.m1541a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f2396b != null) {
            this.f2396b.m1538a(i);
        }
    }

    public void setSupportAllCaps(boolean z) {
        if (this.f2397c != null) {
            this.f2397c.m1616a(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f2396b != null) {
            this.f2396b.m1539a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f2396b != null) {
            this.f2396b.m1540a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f2397c != null) {
            this.f2397c.m1613a(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (a) {
            super.setTextSize(i, f);
        } else if (this.f2397c != null) {
            this.f2397c.m1611a(i, f);
        }
    }
}
