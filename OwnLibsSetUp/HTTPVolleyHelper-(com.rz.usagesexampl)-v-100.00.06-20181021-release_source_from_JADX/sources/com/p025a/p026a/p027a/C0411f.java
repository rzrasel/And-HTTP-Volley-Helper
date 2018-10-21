package com.p025a.p026a.p027a;

import com.p025a.p026a.C0422g;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* renamed from: com.a.a.a.f */
public final class C0411f {
    /* renamed from: a */
    private final int f1471a;
    /* renamed from: b */
    private final List<C0422g> f1472b;
    /* renamed from: c */
    private final int f1473c;
    /* renamed from: d */
    private final InputStream f1474d;

    public C0411f(int i, List<C0422g> list) {
        this(i, list, -1, null);
    }

    public C0411f(int i, List<C0422g> list, int i2, InputStream inputStream) {
        this.f1471a = i;
        this.f1472b = list;
        this.f1473c = i2;
        this.f1474d = inputStream;
    }

    /* renamed from: a */
    public final int m1643a() {
        return this.f1471a;
    }

    /* renamed from: b */
    public final List<C0422g> m1644b() {
        return Collections.unmodifiableList(this.f1472b);
    }

    /* renamed from: c */
    public final int m1645c() {
        return this.f1473c;
    }

    /* renamed from: d */
    public final InputStream m1646d() {
        return this.f1474d;
    }
}
