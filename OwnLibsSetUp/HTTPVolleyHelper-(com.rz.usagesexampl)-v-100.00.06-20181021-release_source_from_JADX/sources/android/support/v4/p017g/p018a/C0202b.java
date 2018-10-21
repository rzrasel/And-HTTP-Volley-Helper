package android.support.v4.p017g.p018a;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.g.a.b */
public class C0202b {
    /* renamed from: a */
    private final Object f750a;

    /* renamed from: android.support.v4.g.a.b$a */
    static class C0201a extends AccessibilityNodeProvider {
        /* renamed from: a */
        final C0202b f749a;

        C0201a(C0202b c0202b) {
            this.f749a = c0202b;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C0200a a = this.f749a.m763a(i);
            return a == null ? null : a.m741a();
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List a = this.f749a.m765a(str, i);
            if (a == null) {
                return null;
            }
            List<AccessibilityNodeInfo> arrayList = new ArrayList();
            int size = a.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((C0200a) a.get(i2)).m741a());
            }
            return arrayList;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f749a.m766a(i, i2, bundle);
        }
    }

    /* renamed from: android.support.v4.g.a.b$b */
    static class C0552b extends C0201a {
        C0552b(C0202b c0202b) {
            super(c0202b);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            C0200a b = this.a.m767b(i);
            return b == null ? null : b.m741a();
        }
    }

    public C0202b() {
        Object c0552b = VERSION.SDK_INT >= 19 ? new C0552b(this) : VERSION.SDK_INT >= 16 ? new C0201a(this) : null;
        this.f750a = c0552b;
    }

    public C0202b(Object obj) {
        this.f750a = obj;
    }

    /* renamed from: a */
    public C0200a m763a(int i) {
        return null;
    }

    /* renamed from: a */
    public Object m764a() {
        return this.f750a;
    }

    /* renamed from: a */
    public List<C0200a> m765a(String str, int i) {
        return null;
    }

    /* renamed from: a */
    public boolean m766a(int i, int i2, Bundle bundle) {
        return false;
    }

    /* renamed from: b */
    public C0200a m767b(int i) {
        return null;
    }
}
