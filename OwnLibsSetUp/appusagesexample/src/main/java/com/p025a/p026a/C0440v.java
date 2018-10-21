package com.p025a.p026a;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.a.a.v */
public class C0440v {
    /* renamed from: a */
    public static String f1557a = "Volley";
    /* renamed from: b */
    public static boolean f1558b = Log.isLoggable(f1557a, 2);
    /* renamed from: c */
    private static final String f1559c = C0440v.class.getName();

    /* renamed from: com.a.a.v$a */
    static class C0439a {
        /* renamed from: a */
        public static final boolean f1554a = C0440v.f1558b;
        /* renamed from: b */
        private final List<C0438a> f1555b = new ArrayList();
        /* renamed from: c */
        private boolean f1556c = false;

        /* renamed from: com.a.a.v$a$a */
        private static class C0438a {
            /* renamed from: a */
            public final String f1551a;
            /* renamed from: b */
            public final long f1552b;
            /* renamed from: c */
            public final long f1553c;

            public C0438a(String str, long j, long j2) {
                this.f1551a = str;
                this.f1552b = j;
                this.f1553c = j2;
            }
        }

        C0439a() {
        }

        /* renamed from: a */
        private long m1727a() {
            if (this.f1555b.size() == 0) {
                return 0;
            }
            return ((C0438a) this.f1555b.get(this.f1555b.size() - 1)).f1553c - ((C0438a) this.f1555b.get(0)).f1553c;
        }

        /* renamed from: a */
        public synchronized void m1728a(String str) {
            this.f1556c = true;
            if (m1727a() > 0) {
                long j = ((C0438a) this.f1555b.get(0)).f1553c;
                C0440v.m1732b("(%-4d ms) %s", Long.valueOf(r1), str);
                for (C0438a c0438a : this.f1555b) {
                    C0440v.m1732b("(+%-4d) [%2d] %s", Long.valueOf(c0438a.f1553c - j), Long.valueOf(c0438a.f1552b), c0438a.f1551a);
                    j = c0438a.f1553c;
                }
            }
        }

        /* renamed from: a */
        public synchronized void m1729a(String str, long j) {
            if (this.f1556c) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.f1555b.add(new C0438a(str, j, SystemClock.elapsedRealtime()));
        }

        protected void finalize() {
            if (!this.f1556c) {
                m1728a("Request on the loose");
                C0440v.m1733c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public static void m1730a(String str, Object... objArr) {
        if (f1558b) {
            Log.v(f1557a, C0440v.m1735e(str, objArr));
        }
    }

    /* renamed from: a */
    public static void m1731a(Throwable th, String str, Object... objArr) {
        Log.e(f1557a, C0440v.m1735e(str, objArr), th);
    }

    /* renamed from: b */
    public static void m1732b(String str, Object... objArr) {
        Log.d(f1557a, C0440v.m1735e(str, objArr));
    }

    /* renamed from: c */
    public static void m1733c(String str, Object... objArr) {
        Log.e(f1557a, C0440v.m1735e(str, objArr));
    }

    /* renamed from: d */
    public static void m1734d(String str, Object... objArr) {
        Log.wtf(f1557a, C0440v.m1735e(str, objArr));
    }

    /* renamed from: e */
    private static String m1735e(String str, Object... objArr) {
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        String str2 = "<unknown>";
        for (int i = 2; i < stackTrace.length; i++) {
            if (!stackTrace[i].getClassName().equals(f1559c)) {
                str2 = stackTrace[i].getClassName();
                str2 = str2.substring(str2.lastIndexOf(46) + 1);
                str2 = str2.substring(str2.lastIndexOf(36) + 1);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append(".");
                stringBuilder.append(stackTrace[i].getMethodName());
                str2 = stringBuilder.toString();
                break;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), str2, str});
    }
}
