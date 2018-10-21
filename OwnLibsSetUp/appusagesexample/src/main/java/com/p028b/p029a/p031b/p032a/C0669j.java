package com.p028b.p029a.p031b.p032a;

import com.p028b.p029a.C0482f;
import com.p028b.p029a.C0492v;
import com.p028b.p029a.C0493w;
import com.p028b.p029a.C0719t;
import com.p028b.p029a.p035c.C0475a;
import com.p028b.p029a.p036d.C0477a;
import com.p028b.p029a.p036d.C0478b;
import com.p028b.p029a.p036d.C0479c;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/* renamed from: com.b.a.b.a.j */
public final class C0669j extends C0492v<Date> {
    /* renamed from: a */
    public static final C0493w f2491a = new C06681();
    /* renamed from: b */
    private final DateFormat f2492b = new SimpleDateFormat("MMM d, yyyy");

    /* renamed from: com.b.a.b.a.j$1 */
    static class C06681 implements C0493w {
        C06681() {
        }

        /* renamed from: a */
        public <T> C0492v<T> mo362a(C0482f c0482f, C0475a<T> c0475a) {
            return c0475a.m1822a() == Date.class ? new C0669j() : null;
        }
    }

    /* renamed from: a */
    public synchronized Date m3078a(C0477a c0477a) {
        if (c0477a.mo369f() == C0478b.NULL) {
            c0477a.mo373j();
            return null;
        }
        try {
            return new Date(this.f2492b.parse(c0477a.mo371h()).getTime());
        } catch (Throwable e) {
            throw new C0719t(e);
        }
    }

    /* renamed from: a */
    public synchronized void m3080a(C0479c c0479c, Date date) {
        c0479c.mo388b(date == null ? null : this.f2492b.format(date));
    }

    /* renamed from: b */
    public /* synthetic */ Object mo361b(C0477a c0477a) {
        return m3078a(c0477a);
    }
}
