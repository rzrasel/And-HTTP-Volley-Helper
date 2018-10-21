package android.support.v4.p016f;

/* renamed from: android.support.v4.f.i */
public class C0195i<F, S> {
    /* renamed from: a */
    public final F f733a;
    /* renamed from: b */
    public final S f734b;

    /* renamed from: a */
    private static boolean m710a(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C0195i)) {
            return false;
        }
        C0195i c0195i = (C0195i) obj;
        if (C0195i.m710a(c0195i.f733a, this.f733a) && C0195i.m710a(c0195i.f734b, this.f734b)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = this.f733a == null ? 0 : this.f733a.hashCode();
        if (this.f734b != null) {
            i = this.f734b.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Pair{");
        stringBuilder.append(String.valueOf(this.f733a));
        stringBuilder.append(" ");
        stringBuilder.append(String.valueOf(this.f734b));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
