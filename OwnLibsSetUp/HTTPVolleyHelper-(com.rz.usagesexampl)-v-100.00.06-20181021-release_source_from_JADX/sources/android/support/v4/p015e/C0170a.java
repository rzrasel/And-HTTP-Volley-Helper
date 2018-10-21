package android.support.v4.p015e;

import android.support.v4.p016f.C0196j;
import android.util.Base64;
import java.util.List;

/* renamed from: android.support.v4.e.a */
public final class C0170a {
    /* renamed from: a */
    private final String f645a;
    /* renamed from: b */
    private final String f646b;
    /* renamed from: c */
    private final String f647c;
    /* renamed from: d */
    private final List<List<byte[]>> f648d;
    /* renamed from: e */
    private final int f649e = 0;
    /* renamed from: f */
    private final String f650f;

    public C0170a(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f645a = (String) C0196j.m711a(str);
        this.f646b = (String) C0196j.m711a(str2);
        this.f647c = (String) C0196j.m711a(str3);
        this.f648d = (List) C0196j.m711a(list);
        StringBuilder stringBuilder = new StringBuilder(this.f645a);
        stringBuilder.append("-");
        stringBuilder.append(this.f646b);
        stringBuilder.append("-");
        stringBuilder.append(this.f647c);
        this.f650f = stringBuilder.toString();
    }

    /* renamed from: a */
    public String m618a() {
        return this.f645a;
    }

    /* renamed from: b */
    public String m619b() {
        return this.f646b;
    }

    /* renamed from: c */
    public String m620c() {
        return this.f647c;
    }

    /* renamed from: d */
    public List<List<byte[]>> m621d() {
        return this.f648d;
    }

    /* renamed from: e */
    public int m622e() {
        return this.f649e;
    }

    /* renamed from: f */
    public String m623f() {
        return this.f650f;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("FontRequest {mProviderAuthority: ");
        stringBuilder2.append(this.f645a);
        stringBuilder2.append(", mProviderPackage: ");
        stringBuilder2.append(this.f646b);
        stringBuilder2.append(", mQuery: ");
        stringBuilder2.append(this.f647c);
        stringBuilder2.append(", mCertificates:");
        stringBuilder.append(stringBuilder2.toString());
        for (int i = 0; i < this.f648d.size(); i++) {
            stringBuilder.append(" [");
            List list = (List) this.f648d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                stringBuilder.append(" \"");
                stringBuilder.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                stringBuilder.append("\"");
            }
            stringBuilder.append(" ]");
        }
        stringBuilder.append("}");
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("mCertificatesArray: ");
        stringBuilder2.append(this.f649e);
        stringBuilder.append(stringBuilder2.toString());
        return stringBuilder.toString();
    }
}
