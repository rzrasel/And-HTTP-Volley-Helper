package com.rz.usagesexampl.p037a;

import android.content.Context;
import com.p025a.p026a.C0437u;
import com.p028b.p029a.C0482f;
import com.p028b.p029a.C0483g;
import com.rz.usagesexampl.p037a.C0500d.C0498a;
import com.rz.usagesexampl.p037a.C0500d.C0499b;
import java.io.PrintStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.rz.usagesexampl.a.b */
public class C0496b<T> {
    /* renamed from: a */
    private Context f1739a;
    /* renamed from: b */
    private C0500d f1740b = null;
    /* renamed from: c */
    private String f1741c;
    /* renamed from: d */
    private C0495a f1742d;
    /* renamed from: e */
    private HashMap<String, String> f1743e = null;
    /* renamed from: f */
    private HashMap<String, String> f1744f = null;
    /* renamed from: g */
    private HashMap<String, String> f1745g = null;
    /* renamed from: h */
    private Class f1746h;
    /* renamed from: i */
    private String f1747i = null;
    /* renamed from: j */
    private String f1748j = "CacheHTTPVolleyParser";

    /* renamed from: com.rz.usagesexampl.a.b$a */
    public interface C0495a {
        /* renamed from: a */
        void mo409a(C0437u c0437u);

        /* renamed from: a */
        void mo410a(C0437u c0437u, String str, String str2);

        /* renamed from: a */
        void mo411a(String str);

        /* renamed from: a */
        void mo412a(ArrayList<?> arrayList);
    }

    /* renamed from: com.rz.usagesexampl.a.b$1 */
    class C07241 implements C0498a {
        /* renamed from: a */
        final /* synthetic */ C0496b f2587a;

        C07241(C0496b c0496b) {
            this.f2587a = c0496b;
        }

        /* renamed from: a */
        public void mo413a(C0437u c0437u) {
            PrintStream printStream = System.out;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("DEBUG_LOG_PRINT (HTTPVolleyParser): Error ");
            stringBuilder.append(c0437u.toString());
            printStream.println(stringBuilder.toString());
            if (this.f2587a.f1742d != null) {
                this.f2587a.f1742d.mo409a(c0437u);
            }
        }

        /* renamed from: a */
        public void mo414a(C0437u c0437u, String str, String str2) {
            PrintStream printStream = System.out;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("DEBUG_LOG_PRINT (HTTPVolleyParser): Error ");
            stringBuilder.append(str);
            printStream.println(stringBuilder.toString());
            if (this.f2587a.f1742d != null) {
                this.f2587a.f1742d.mo410a(c0437u, str, str2);
            }
        }

        /* renamed from: a */
        public void mo415a(String str) {
            PrintStream printStream = System.out;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("DEBUG_LOG_PRINT (HTTPVolleyParser): Response ");
            stringBuilder.append(str);
            printStream.println(stringBuilder.toString());
            C0482f c0482f = new C0482f();
            if (this.f2587a.f1746h != null) {
                Type b = C0497c.m1935b(this.f2587a.f1746h);
                C0497c.m1934a(this.f2587a.f1746h);
                ArrayList arrayList = (ArrayList) new C0483g().m1899a().m1897a(str.toString(), b);
                if (this.f2587a.f1742d != null) {
                    this.f2587a.f1742d.mo412a(arrayList);
                }
            }
            if (this.f2587a.f1742d != null) {
                this.f2587a.f1742d.mo411a(str);
            }
        }
    }

    public C0496b(Context context) {
        System.out.println("(HTTPVolleyParser): constructor ");
        this.f1739a = context;
        this.f1740b = new C0500d(this.f1739a);
    }

    /* renamed from: a */
    public C0496b m1929a(C0495a c0495a) {
        System.out.println("(HTTPVolleyParser): setEventListener ");
        this.f1742d = c0495a;
        return this;
    }

    /* renamed from: a */
    public C0496b m1930a(Class<?> cls) {
        this.f1746h = cls;
        return this;
    }

    /* renamed from: a */
    public C0496b m1931a(String str) {
        this.f1741c = str;
        this.f1748j = this.f1741c;
        return this;
    }

    /* renamed from: a */
    public C0496b m1932a(HashMap<String, String> hashMap) {
        this.f1744f = hashMap;
        return this;
    }

    /* renamed from: a */
    public void m1933a(C0499b c0499b) {
        this.f1740b.m1949a(this.f1741c).m1950a(this.f1744f).m1952b(this.f1743e).m1948a(new C07241(this)).m1951a(c0499b);
    }
}
