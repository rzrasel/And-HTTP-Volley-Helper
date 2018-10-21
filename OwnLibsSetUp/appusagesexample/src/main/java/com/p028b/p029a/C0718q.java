package com.p028b.p029a;

import com.p028b.p029a.p031b.C0453a;
import com.p028b.p029a.p031b.C0462g;
import java.math.BigInteger;

/* renamed from: com.b.a.q */
public final class C0718q extends C0487l {
    /* renamed from: a */
    private static final Class<?>[] f2583a = new Class[]{Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};
    /* renamed from: b */
    private Object f2584b;

    public C0718q(Boolean bool) {
        m3299a((Object) bool);
    }

    public C0718q(Number number) {
        m3299a((Object) number);
    }

    public C0718q(String str) {
        m3299a((Object) str);
    }

    /* renamed from: a */
    private static boolean m3296a(C0718q c0718q) {
        if (!(c0718q.f2584b instanceof Number)) {
            return false;
        }
        Number number = (Number) c0718q.f2584b;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    /* renamed from: b */
    private static boolean m3297b(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class cls = obj.getClass();
        for (Class isAssignableFrom : f2583a) {
            if (isAssignableFrom.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public Number mo402a() {
        return this.f2584b instanceof String ? new C0462g((String) this.f2584b) : (Number) this.f2584b;
    }

    /* renamed from: a */
    void m3299a(Object obj) {
        if (obj instanceof Character) {
            obj = String.valueOf(((Character) obj).charValue());
        } else {
            boolean z;
            if (!(obj instanceof Number)) {
                if (!C0718q.m3297b(obj)) {
                    z = false;
                    C0453a.m1756a(z);
                }
            }
            z = true;
            C0453a.m1756a(z);
        }
        this.f2584b = obj;
    }

    /* renamed from: b */
    public String mo403b() {
        return m3307p() ? mo402a().toString() : m3306o() ? mo408n().toString() : (String) this.f2584b;
    }

    /* renamed from: c */
    public double mo404c() {
        return m3307p() ? mo402a().doubleValue() : Double.parseDouble(mo403b());
    }

    /* renamed from: d */
    public long mo405d() {
        return m3307p() ? mo402a().longValue() : Long.parseLong(mo403b());
    }

    /* renamed from: e */
    public int mo406e() {
        return m3307p() ? mo402a().intValue() : Integer.parseInt(mo403b());
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C0718q c0718q = (C0718q) obj;
                if (this.f2584b == null) {
                    if (c0718q.f2584b != null) {
                        z = false;
                    }
                    return z;
                } else if (C0718q.m3296a(this) && C0718q.m3296a(c0718q)) {
                    if (mo402a().longValue() != c0718q.mo402a().longValue()) {
                        z = false;
                    }
                    return z;
                } else if (!(this.f2584b instanceof Number) || !(c0718q.f2584b instanceof Number)) {
                    return this.f2584b.equals(c0718q.f2584b);
                } else {
                    double doubleValue = mo402a().doubleValue();
                    double doubleValue2 = c0718q.mo402a().doubleValue();
                    if (doubleValue != doubleValue2) {
                        if (!Double.isNaN(doubleValue) || !Double.isNaN(doubleValue2)) {
                            z = false;
                        }
                    }
                    return z;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo407f() {
        return m3306o() ? mo408n().booleanValue() : Boolean.parseBoolean(mo403b());
    }

    public int hashCode() {
        if (this.f2584b == null) {
            return 31;
        }
        long longValue;
        if (C0718q.m3296a(this)) {
            longValue = mo402a().longValue();
            return (int) ((longValue >>> 32) ^ longValue);
        } else if (!(this.f2584b instanceof Number)) {
            return this.f2584b.hashCode();
        } else {
            longValue = Double.doubleToLongBits(mo402a().doubleValue());
            return (int) ((longValue >>> 32) ^ longValue);
        }
    }

    /* renamed from: n */
    Boolean mo408n() {
        return (Boolean) this.f2584b;
    }

    /* renamed from: o */
    public boolean m3306o() {
        return this.f2584b instanceof Boolean;
    }

    /* renamed from: p */
    public boolean m3307p() {
        return this.f2584b instanceof Number;
    }

    /* renamed from: q */
    public boolean m3308q() {
        return this.f2584b instanceof String;
    }
}
