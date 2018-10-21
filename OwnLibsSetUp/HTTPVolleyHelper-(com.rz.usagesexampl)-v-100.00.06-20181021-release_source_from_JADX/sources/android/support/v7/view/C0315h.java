package android.support.v7.view;

import android.support.v4.p017g.C0234s;
import android.support.v4.p017g.C0235t;
import android.support.v4.p017g.C0565u;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.v7.view.h */
public class C0315h {
    /* renamed from: a */
    final ArrayList<C0234s> f1076a = new ArrayList();
    /* renamed from: b */
    C0235t f1077b;
    /* renamed from: c */
    private long f1078c = -1;
    /* renamed from: d */
    private Interpolator f1079d;
    /* renamed from: e */
    private boolean f1080e;
    /* renamed from: f */
    private final C0565u f1081f = new C07561(this);

    /* renamed from: android.support.v7.view.h$1 */
    class C07561 extends C0565u {
        /* renamed from: a */
        final /* synthetic */ C0315h f2690a;
        /* renamed from: b */
        private boolean f2691b = false;
        /* renamed from: c */
        private int f2692c = 0;

        C07561(C0315h c0315h) {
            this.f2690a = c0315h;
        }

        /* renamed from: a */
        void m3531a() {
            this.f2692c = 0;
            this.f2691b = false;
            this.f2690a.m1193b();
        }

        /* renamed from: a */
        public void mo99a(View view) {
            if (!this.f2691b) {
                this.f2691b = true;
                if (this.f2690a.f1077b != null) {
                    this.f2690a.f1077b.mo99a(null);
                }
            }
        }

        /* renamed from: b */
        public void mo100b(View view) {
            int i = this.f2692c + 1;
            this.f2692c = i;
            if (i == this.f2690a.f1076a.size()) {
                if (this.f2690a.f1077b != null) {
                    this.f2690a.f1077b.mo100b(null);
                }
                m3531a();
            }
        }
    }

    /* renamed from: a */
    public C0315h m1187a(long j) {
        if (!this.f1080e) {
            this.f1078c = j;
        }
        return this;
    }

    /* renamed from: a */
    public C0315h m1188a(C0234s c0234s) {
        if (!this.f1080e) {
            this.f1076a.add(c0234s);
        }
        return this;
    }

    /* renamed from: a */
    public C0315h m1189a(C0234s c0234s, C0234s c0234s2) {
        this.f1076a.add(c0234s);
        c0234s2.m913b(c0234s.m906a());
        this.f1076a.add(c0234s2);
        return this;
    }

    /* renamed from: a */
    public C0315h m1190a(C0235t c0235t) {
        if (!this.f1080e) {
            this.f1077b = c0235t;
        }
        return this;
    }

    /* renamed from: a */
    public C0315h m1191a(Interpolator interpolator) {
        if (!this.f1080e) {
            this.f1079d = interpolator;
        }
        return this;
    }

    /* renamed from: a */
    public void m1192a() {
        if (!this.f1080e) {
            Iterator it = this.f1076a.iterator();
            while (it.hasNext()) {
                C0234s c0234s = (C0234s) it.next();
                if (this.f1078c >= 0) {
                    c0234s.m908a(this.f1078c);
                }
                if (this.f1079d != null) {
                    c0234s.m911a(this.f1079d);
                }
                if (this.f1077b != null) {
                    c0234s.m909a(this.f1081f);
                }
                c0234s.m915c();
            }
            this.f1080e = true;
        }
    }

    /* renamed from: b */
    void m1193b() {
        this.f1080e = false;
    }

    /* renamed from: c */
    public void m1194c() {
        if (this.f1080e) {
            Iterator it = this.f1076a.iterator();
            while (it.hasNext()) {
                ((C0234s) it.next()).m914b();
            }
            this.f1080e = false;
        }
    }
}
