package com.p028b.p029a;

import com.p028b.p029a.p031b.C0468h;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.b.a.o */
public final class C0717o extends C0487l {
    /* renamed from: a */
    private final C0468h<String, C0487l> f2582a = new C0468h();

    /* renamed from: a */
    public void m3294a(String str, C0487l c0487l) {
        Object obj;
        if (c0487l == null) {
            obj = C0716n.f2581a;
        }
        this.f2582a.put(str, obj);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C0717o) || !((C0717o) obj).f2582a.equals(this.f2582a)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f2582a.hashCode();
    }

    /* renamed from: o */
    public Set<Entry<String, C0487l>> m3295o() {
        return this.f2582a.entrySet();
    }
}
