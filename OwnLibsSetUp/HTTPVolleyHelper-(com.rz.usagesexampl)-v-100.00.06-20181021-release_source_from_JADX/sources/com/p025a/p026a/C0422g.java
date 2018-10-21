package com.p025a.p026a;

import android.text.TextUtils;

/* renamed from: com.a.a.g */
public final class C0422g {
    /* renamed from: a */
    private final String f1499a;
    /* renamed from: b */
    private final String f1500b;

    public C0422g(String str, String str2) {
        this.f1499a = str;
        this.f1500b = str2;
    }

    /* renamed from: a */
    public final String m1659a() {
        return this.f1499a;
    }

    /* renamed from: b */
    public final String m1660b() {
        return this.f1500b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C0422g c0422g = (C0422g) obj;
                if (!TextUtils.equals(this.f1499a, c0422g.f1499a) || !TextUtils.equals(this.f1500b, c0422g.f1500b)) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f1499a.hashCode() * 31) + this.f1500b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Header[name=");
        stringBuilder.append(this.f1499a);
        stringBuilder.append(",value=");
        stringBuilder.append(this.f1500b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
