package com.p028b.p029a.p031b.p032a;

import com.p028b.p029a.C0482f;
import com.p028b.p029a.C0492v;
import com.p028b.p029a.C0493w;
import com.p028b.p029a.C0719t;
import com.p028b.p029a.p035c.C0475a;
import com.p028b.p029a.p036d.C0477a;
import com.p028b.p029a.p036d.C0478b;
import com.p028b.p029a.p036d.C0479c;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/* renamed from: com.b.a.b.a.k */
public final class C0671k extends C0492v<Time> {
    /* renamed from: a */
    public static final C0493w f2493a = new C06701();
    /* renamed from: b */
    private final DateFormat f2494b = new SimpleDateFormat("hh:mm:ss a");

    /* renamed from: com.b.a.b.a.k$1 */
    static class C06701 implements C0493w {
        C06701() {
        }

        /* renamed from: a */
        public <T> C0492v<T> mo362a(C0482f c0482f, C0475a<T> c0475a) {
            return c0475a.m1822a() == Time.class ? new C0671k() : null;
        }
    }

    /* renamed from: a */
    public synchronized Time m3083a(C0477a c0477a) {
        if (c0477a.mo369f() == C0478b.NULL) {
            c0477a.mo373j();
            return null;
        }
        try {
            return new Time(this.f2494b.parse(c0477a.mo371h()).getTime());
        } catch (Throwable e) {
            throw new C0719t(e);
        }
    }

    /* renamed from: a */
    public synchronized void m3085a(C0479c c0479c, Time time) {
        c0479c.mo388b(time == null ? null : this.f2494b.format(time));
    }

    /* renamed from: b */
    public /* synthetic */ Object mo361b(C0477a c0477a) {
        return m3083a(c0477a);
    }
}
