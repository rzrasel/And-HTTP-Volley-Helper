package android.support.v4.p017g.p018a;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: android.support.v4.g.a.a */
public class C0200a {
    /* renamed from: a */
    public int f747a = -1;
    /* renamed from: b */
    private final AccessibilityNodeInfo f748b;

    private C0200a(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f748b = accessibilityNodeInfo;
    }

    /* renamed from: a */
    public static C0200a m739a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C0200a(accessibilityNodeInfo);
    }

    /* renamed from: b */
    private static String m740b(int i) {
        switch (i) {
            case 1:
                return "ACTION_FOCUS";
            case 2:
                return "ACTION_CLEAR_FOCUS";
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    /* renamed from: a */
    public AccessibilityNodeInfo m741a() {
        return this.f748b;
    }

    /* renamed from: a */
    public void m742a(int i) {
        this.f748b.addAction(i);
    }

    /* renamed from: a */
    public void m743a(Rect rect) {
        this.f748b.getBoundsInParent(rect);
    }

    /* renamed from: a */
    public void m744a(CharSequence charSequence) {
        this.f748b.setClassName(charSequence);
    }

    /* renamed from: a */
    public void m745a(boolean z) {
        this.f748b.setScrollable(z);
    }

    /* renamed from: b */
    public int m746b() {
        return this.f748b.getActions();
    }

    /* renamed from: b */
    public void m747b(Rect rect) {
        this.f748b.getBoundsInScreen(rect);
    }

    /* renamed from: c */
    public boolean m748c() {
        return this.f748b.isCheckable();
    }

    /* renamed from: d */
    public boolean m749d() {
        return this.f748b.isChecked();
    }

    /* renamed from: e */
    public boolean m750e() {
        return this.f748b.isFocusable();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0200a c0200a = (C0200a) obj;
        if (this.f748b == null) {
            if (c0200a.f748b != null) {
                return false;
            }
        } else if (!this.f748b.equals(c0200a.f748b)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean m751f() {
        return this.f748b.isFocused();
    }

    /* renamed from: g */
    public boolean m752g() {
        return this.f748b.isSelected();
    }

    /* renamed from: h */
    public boolean m753h() {
        return this.f748b.isClickable();
    }

    public int hashCode() {
        return this.f748b == null ? 0 : this.f748b.hashCode();
    }

    /* renamed from: i */
    public boolean m754i() {
        return this.f748b.isLongClickable();
    }

    /* renamed from: j */
    public boolean m755j() {
        return this.f748b.isEnabled();
    }

    /* renamed from: k */
    public boolean m756k() {
        return this.f748b.isPassword();
    }

    /* renamed from: l */
    public boolean m757l() {
        return this.f748b.isScrollable();
    }

    /* renamed from: m */
    public CharSequence m758m() {
        return this.f748b.getPackageName();
    }

    /* renamed from: n */
    public CharSequence m759n() {
        return this.f748b.getClassName();
    }

    /* renamed from: o */
    public CharSequence m760o() {
        return this.f748b.getText();
    }

    /* renamed from: p */
    public CharSequence m761p() {
        return this.f748b.getContentDescription();
    }

    /* renamed from: q */
    public String m762q() {
        return VERSION.SDK_INT >= 18 ? this.f748b.getViewIdResourceName() : null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        Rect rect = new Rect();
        m743a(rect);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("; boundsInParent: ");
        stringBuilder2.append(rect);
        stringBuilder.append(stringBuilder2.toString());
        m747b(rect);
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("; boundsInScreen: ");
        stringBuilder2.append(rect);
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder.append("; packageName: ");
        stringBuilder.append(m758m());
        stringBuilder.append("; className: ");
        stringBuilder.append(m759n());
        stringBuilder.append("; text: ");
        stringBuilder.append(m760o());
        stringBuilder.append("; contentDescription: ");
        stringBuilder.append(m761p());
        stringBuilder.append("; viewId: ");
        stringBuilder.append(m762q());
        stringBuilder.append("; checkable: ");
        stringBuilder.append(m748c());
        stringBuilder.append("; checked: ");
        stringBuilder.append(m749d());
        stringBuilder.append("; focusable: ");
        stringBuilder.append(m750e());
        stringBuilder.append("; focused: ");
        stringBuilder.append(m751f());
        stringBuilder.append("; selected: ");
        stringBuilder.append(m752g());
        stringBuilder.append("; clickable: ");
        stringBuilder.append(m753h());
        stringBuilder.append("; longClickable: ");
        stringBuilder.append(m754i());
        stringBuilder.append("; enabled: ");
        stringBuilder.append(m755j());
        stringBuilder.append("; password: ");
        stringBuilder.append(m756k());
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("; scrollable: ");
        stringBuilder3.append(m757l());
        stringBuilder.append(stringBuilder3.toString());
        stringBuilder.append("; [");
        int b = m746b();
        while (b != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(b);
            b &= numberOfTrailingZeros ^ -1;
            stringBuilder.append(C0200a.m740b(numberOfTrailingZeros));
            if (b != 0) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
