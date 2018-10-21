package android.support.v4.p017g.p018a;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: android.support.v4.g.a.c */
public class C0203c {
    /* renamed from: a */
    private final AccessibilityRecord f751a;

    /* renamed from: a */
    public static void m768a(AccessibilityRecord accessibilityRecord, int i) {
        if (VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollX(i);
        }
    }

    /* renamed from: b */
    public static void m769b(AccessibilityRecord accessibilityRecord, int i) {
        if (VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0203c c0203c = (C0203c) obj;
        if (this.f751a == null) {
            if (c0203c.f751a != null) {
                return false;
            }
        } else if (!this.f751a.equals(c0203c.f751a)) {
            return false;
        }
        return true;
    }

    @Deprecated
    public int hashCode() {
        return this.f751a == null ? 0 : this.f751a.hashCode();
    }
}
