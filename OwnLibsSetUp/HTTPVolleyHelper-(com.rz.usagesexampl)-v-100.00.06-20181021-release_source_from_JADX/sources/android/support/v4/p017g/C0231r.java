package android.support.v4.p017g;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: android.support.v4.g.r */
public final class C0231r {
    /* renamed from: a */
    static final C0230c f787a;

    /* renamed from: android.support.v4.g.r$c */
    static class C0230c {
        C0230c() {
        }

        /* renamed from: a */
        public void mo464a(ViewParent viewParent, View view) {
            if (viewParent instanceof C0221k) {
                ((C0221k) viewParent).onStopNestedScroll(view);
            }
        }

        /* renamed from: a */
        public void mo465a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            if (viewParent instanceof C0221k) {
                ((C0221k) viewParent).onNestedScroll(view, i, i2, i3, i4);
            }
        }

        /* renamed from: a */
        public void mo466a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            if (viewParent instanceof C0221k) {
                ((C0221k) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }

        /* renamed from: a */
        public boolean mo467a(ViewParent viewParent, View view, float f, float f2) {
            return viewParent instanceof C0221k ? ((C0221k) viewParent).onNestedPreFling(view, f, f2) : false;
        }

        /* renamed from: a */
        public boolean mo468a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            return viewParent instanceof C0221k ? ((C0221k) viewParent).onNestedFling(view, f, f2, z) : false;
        }

        /* renamed from: a */
        public boolean mo469a(ViewParent viewParent, View view, View view2, int i) {
            return viewParent instanceof C0221k ? ((C0221k) viewParent).onStartNestedScroll(view, view2, i) : false;
        }

        /* renamed from: b */
        public void mo470b(ViewParent viewParent, View view, View view2, int i) {
            if (viewParent instanceof C0221k) {
                ((C0221k) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }
    }

    /* renamed from: android.support.v4.g.r$a */
    static class C0563a extends C0230c {
        C0563a() {
        }
    }

    /* renamed from: android.support.v4.g.r$b */
    static class C0743b extends C0563a {
        C0743b() {
        }

        /* renamed from: a */
        public void mo464a(ViewParent viewParent, View view) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ViewParent ");
                stringBuilder.append(viewParent);
                stringBuilder.append(" does not implement interface ");
                stringBuilder.append("method onStopNestedScroll");
                Log.e("ViewParentCompat", stringBuilder.toString(), e);
            }
        }

        /* renamed from: a */
        public void mo465a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ViewParent ");
                stringBuilder.append(viewParent);
                stringBuilder.append(" does not implement interface ");
                stringBuilder.append("method onNestedScroll");
                Log.e("ViewParentCompat", stringBuilder.toString(), e);
            }
        }

        /* renamed from: a */
        public void mo466a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ViewParent ");
                stringBuilder.append(viewParent);
                stringBuilder.append(" does not implement interface ");
                stringBuilder.append("method onNestedPreScroll");
                Log.e("ViewParentCompat", stringBuilder.toString(), e);
            }
        }

        /* renamed from: a */
        public boolean mo467a(ViewParent viewParent, View view, float f, float f2) {
            try {
                return viewParent.onNestedPreFling(view, f, f2);
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ViewParent ");
                stringBuilder.append(viewParent);
                stringBuilder.append(" does not implement interface ");
                stringBuilder.append("method onNestedPreFling");
                Log.e("ViewParentCompat", stringBuilder.toString(), e);
                return false;
            }
        }

        /* renamed from: a */
        public boolean mo468a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            try {
                return viewParent.onNestedFling(view, f, f2, z);
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ViewParent ");
                stringBuilder.append(viewParent);
                stringBuilder.append(" does not implement interface ");
                stringBuilder.append("method onNestedFling");
                Log.e("ViewParentCompat", stringBuilder.toString(), e);
                return false;
            }
        }

        /* renamed from: a */
        public boolean mo469a(ViewParent viewParent, View view, View view2, int i) {
            try {
                return viewParent.onStartNestedScroll(view, view2, i);
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ViewParent ");
                stringBuilder.append(viewParent);
                stringBuilder.append(" does not implement interface ");
                stringBuilder.append("method onStartNestedScroll");
                Log.e("ViewParentCompat", stringBuilder.toString(), e);
                return false;
            }
        }

        /* renamed from: b */
        public void mo470b(ViewParent viewParent, View view, View view2, int i) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ViewParent ");
                stringBuilder.append(viewParent);
                stringBuilder.append(" does not implement interface ");
                stringBuilder.append("method onNestedScrollAccepted");
                Log.e("ViewParentCompat", stringBuilder.toString(), e);
            }
        }
    }

    static {
        C0230c c0743b = VERSION.SDK_INT >= 21 ? new C0743b() : VERSION.SDK_INT >= 19 ? new C0563a() : new C0230c();
        f787a = c0743b;
    }

    /* renamed from: a */
    public static void m898a(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof C0560l) {
            ((C0560l) viewParent).m2413a(view, i);
        } else if (i == 0) {
            f787a.mo464a(viewParent, view);
        }
    }

    /* renamed from: a */
    public static void m899a(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5) {
        if (viewParent instanceof C0560l) {
            ((C0560l) viewParent).m2414a(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            f787a.mo465a(viewParent, view, i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public static void m900a(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof C0560l) {
            ((C0560l) viewParent).m2415a(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            f787a.mo466a(viewParent, view, i, i2, iArr);
        }
    }

    /* renamed from: a */
    public static boolean m901a(ViewParent viewParent, View view, float f, float f2) {
        return f787a.mo467a(viewParent, view, f, f2);
    }

    /* renamed from: a */
    public static boolean m902a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return f787a.mo468a(viewParent, view, f, f2, z);
    }

    /* renamed from: a */
    public static boolean m903a(ViewParent viewParent, View view, View view2, int i, int i2) {
        return viewParent instanceof C0560l ? ((C0560l) viewParent).m2416a(view, view2, i, i2) : i2 == 0 ? f787a.mo469a(viewParent, view, view2, i) : false;
    }

    /* renamed from: b */
    public static void m904b(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof C0560l) {
            ((C0560l) viewParent).m2417b(view, view2, i, i2);
        } else if (i2 == 0) {
            f787a.mo470b(viewParent, view, view2, i);
        }
    }
}
