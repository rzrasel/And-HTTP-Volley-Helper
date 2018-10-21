package com.p028b.p029a.p031b.p032a;

import com.p028b.p029a.C0482f;
import com.p028b.p029a.C0486k;
import com.p028b.p029a.C0490s;
import com.p028b.p029a.C0492v;
import com.p028b.p029a.C0493w;
import com.p028b.p029a.p030a.C0442b;
import com.p028b.p029a.p031b.C0459c;
import com.p028b.p029a.p035c.C0475a;

/* renamed from: com.b.a.b.a.d */
public final class C0658d implements C0493w {
    /* renamed from: a */
    private final C0459c f2457a;

    public C0658d(C0459c c0459c) {
        this.f2457a = c0459c;
    }

    /* renamed from: a */
    C0492v<?> m3019a(C0459c c0459c, C0482f c0482f, C0475a<?> c0475a, C0442b c0442b) {
        C0492v<?> c0492v;
        Object a = c0459c.m1783a(C0475a.m1821b(c0442b.m1738a())).mo399a();
        if (a instanceof C0492v) {
            c0492v = (C0492v) a;
        } else if (a instanceof C0493w) {
            c0492v = ((C0493w) a).mo362a(c0482f, c0475a);
        } else {
            boolean z = a instanceof C0490s;
            if (!z) {
                if (!(a instanceof C0486k)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid attempt to bind an instance of ");
                    stringBuilder.append(a.getClass().getName());
                    stringBuilder.append(" as a @JsonAdapter for ");
                    stringBuilder.append(c0475a.toString());
                    stringBuilder.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            C0486k c0486k = null;
            C0490s c0490s = z ? (C0490s) a : null;
            if (a instanceof C0486k) {
                c0486k = (C0486k) a;
            }
            C0492v<?> c0673l = new C0673l(c0490s, c0486k, c0482f, c0475a, null);
        }
        return (c0492v == null || !c0442b.m1739b()) ? c0492v : c0492v.m1918a();
    }

    /* renamed from: a */
    public <T> C0492v<T> mo362a(C0482f c0482f, C0475a<T> c0475a) {
        C0442b c0442b = (C0442b) c0475a.m1822a().getAnnotation(C0442b.class);
        return c0442b == null ? null : m3019a(this.f2457a, c0482f, c0475a, c0442b);
    }
}
