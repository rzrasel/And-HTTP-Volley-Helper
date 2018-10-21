package android.support.v4.p017g;

import android.os.Build.VERSION;
import android.support.p003a.C0032a.C0030a;
import android.view.ViewGroup;

/* renamed from: android.support.v4.g.q */
public final class C0229q {
    /* renamed from: a */
    static final C0228c f786a;

    /* renamed from: android.support.v4.g.q$c */
    static class C0228c {
        C0228c() {
        }

        /* renamed from: a */
        public boolean mo463a(ViewGroup viewGroup) {
            Boolean bool = (Boolean) viewGroup.getTag(C0030a.tag_transition_group);
            if ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null) {
                if (C0227p.m879e(viewGroup) == null) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: android.support.v4.g.q$a */
    static class C0562a extends C0228c {
        C0562a() {
        }
    }

    /* renamed from: android.support.v4.g.q$b */
    static class C0742b extends C0562a {
        C0742b() {
        }

        /* renamed from: a */
        public boolean mo463a(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }
    }

    static {
        C0228c c0742b = VERSION.SDK_INT >= 21 ? new C0742b() : VERSION.SDK_INT >= 18 ? new C0562a() : new C0228c();
        f786a = c0742b;
    }

    /* renamed from: a */
    public static boolean m890a(ViewGroup viewGroup) {
        return f786a.mo463a(viewGroup);
    }
}
