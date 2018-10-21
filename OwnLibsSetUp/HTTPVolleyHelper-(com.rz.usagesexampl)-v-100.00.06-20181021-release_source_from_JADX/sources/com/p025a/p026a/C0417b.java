package com.p025a.p026a;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.a.a.b */
public interface C0417b {

    /* renamed from: com.a.a.b$a */
    public static class C0416a {
        /* renamed from: a */
        public byte[] f1477a;
        /* renamed from: b */
        public String f1478b;
        /* renamed from: c */
        public long f1479c;
        /* renamed from: d */
        public long f1480d;
        /* renamed from: e */
        public long f1481e;
        /* renamed from: f */
        public long f1482f;
        /* renamed from: g */
        public Map<String, String> f1483g = Collections.emptyMap();
        /* renamed from: h */
        public List<C0422g> f1484h;

        /* renamed from: a */
        public boolean m1649a() {
            return this.f1481e < System.currentTimeMillis();
        }

        /* renamed from: b */
        public boolean m1650b() {
            return this.f1482f < System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    C0416a mo346a(String str);

    /* renamed from: a */
    void mo347a();

    /* renamed from: a */
    void mo348a(String str, C0416a c0416a);
}
