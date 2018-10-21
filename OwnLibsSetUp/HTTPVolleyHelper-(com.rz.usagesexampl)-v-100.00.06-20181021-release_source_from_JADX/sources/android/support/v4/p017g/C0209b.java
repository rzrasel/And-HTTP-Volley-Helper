package android.support.v4.p017g;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.p017g.p018a.C0200a;
import android.support.v4.p017g.p018a.C0202b;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: android.support.v4.g.b */
public class C0209b {
    /* renamed from: b */
    private static final C0207b f760b = (VERSION.SDK_INT >= 16 ? new C0553a() : new C0207b());
    /* renamed from: c */
    private static final AccessibilityDelegate f761c = new AccessibilityDelegate();
    /* renamed from: a */
    final AccessibilityDelegate f762a = f760b.mo88a(this);

    /* renamed from: android.support.v4.g.b$b */
    static class C0207b {
        C0207b() {
        }

        /* renamed from: a */
        public C0202b mo87a(AccessibilityDelegate accessibilityDelegate, View view) {
            return null;
        }

        /* renamed from: a */
        public AccessibilityDelegate mo88a(final C0209b c0209b) {
            return new AccessibilityDelegate(this) {
                /* renamed from: b */
                final /* synthetic */ C0207b f757b;

                public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    return c0209b.m781b(view, accessibilityEvent);
                }

                public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    c0209b.mo104d(view, accessibilityEvent);
                }

                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    c0209b.mo102a(view, C0200a.m739a(accessibilityNodeInfo));
                }

                public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    c0209b.m782c(view, accessibilityEvent);
                }

                public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                    return c0209b.m780a(viewGroup, view, accessibilityEvent);
                }

                public void sendAccessibilityEvent(View view, int i) {
                    c0209b.m776a(view, i);
                }

                public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                    c0209b.m778a(view, accessibilityEvent);
                }
            };
        }

        /* renamed from: a */
        public boolean mo89a(AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return false;
        }
    }

    /* renamed from: android.support.v4.g.b$a */
    static class C0553a extends C0207b {
        C0553a() {
        }

        /* renamed from: a */
        public C0202b mo87a(AccessibilityDelegate accessibilityDelegate, View view) {
            AccessibilityNodeProvider accessibilityNodeProvider = accessibilityDelegate.getAccessibilityNodeProvider(view);
            return accessibilityNodeProvider != null ? new C0202b(accessibilityNodeProvider) : null;
        }

        /* renamed from: a */
        public AccessibilityDelegate mo88a(final C0209b c0209b) {
            return new AccessibilityDelegate(this) {
                /* renamed from: b */
                final /* synthetic */ C0553a f755b;

                public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    return c0209b.m781b(view, accessibilityEvent);
                }

                public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
                    C0202b a = c0209b.m774a(view);
                    return a != null ? (AccessibilityNodeProvider) a.m764a() : null;
                }

                public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    c0209b.mo104d(view, accessibilityEvent);
                }

                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    c0209b.mo102a(view, C0200a.m739a(accessibilityNodeInfo));
                }

                public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    c0209b.m782c(view, accessibilityEvent);
                }

                public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                    return c0209b.m780a(viewGroup, view, accessibilityEvent);
                }

                public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                    return c0209b.mo103a(view, i, bundle);
                }

                public void sendAccessibilityEvent(View view, int i) {
                    c0209b.m776a(view, i);
                }

                public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                    c0209b.m778a(view, accessibilityEvent);
                }
            };
        }

        /* renamed from: a */
        public boolean mo89a(AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
        }
    }

    /* renamed from: a */
    public C0202b m774a(View view) {
        return f760b.mo87a(f761c, view);
    }

    /* renamed from: a */
    AccessibilityDelegate m775a() {
        return this.f762a;
    }

    /* renamed from: a */
    public void m776a(View view, int i) {
        f761c.sendAccessibilityEvent(view, i);
    }

    /* renamed from: a */
    public void mo102a(View view, C0200a c0200a) {
        f761c.onInitializeAccessibilityNodeInfo(view, c0200a.m741a());
    }

    /* renamed from: a */
    public void m778a(View view, AccessibilityEvent accessibilityEvent) {
        f761c.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    /* renamed from: a */
    public boolean mo103a(View view, int i, Bundle bundle) {
        return f760b.mo89a(f761c, view, i, bundle);
    }

    /* renamed from: a */
    public boolean m780a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f761c.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: b */
    public boolean m781b(View view, AccessibilityEvent accessibilityEvent) {
        return f761c.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: c */
    public void m782c(View view, AccessibilityEvent accessibilityEvent) {
        f761c.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo104d(View view, AccessibilityEvent accessibilityEvent) {
        f761c.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }
}
