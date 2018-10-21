package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.app.C0528c.C0104a;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.d */
final class C0106d implements Parcelable {
    public static final Creator<C0106d> CREATOR = new C01051();
    /* renamed from: a */
    final int[] f486a;
    /* renamed from: b */
    final int f487b;
    /* renamed from: c */
    final int f488c;
    /* renamed from: d */
    final String f489d;
    /* renamed from: e */
    final int f490e;
    /* renamed from: f */
    final int f491f;
    /* renamed from: g */
    final CharSequence f492g;
    /* renamed from: h */
    final int f493h;
    /* renamed from: i */
    final CharSequence f494i;
    /* renamed from: j */
    final ArrayList<String> f495j;
    /* renamed from: k */
    final ArrayList<String> f496k;
    /* renamed from: l */
    final boolean f497l;

    /* renamed from: android.support.v4.app.d$1 */
    static class C01051 implements Creator<C0106d> {
        C01051() {
        }

        /* renamed from: a */
        public C0106d m412a(Parcel parcel) {
            return new C0106d(parcel);
        }

        /* renamed from: a */
        public C0106d[] m413a(int i) {
            return new C0106d[i];
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m412a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m413a(i);
        }
    }

    public C0106d(Parcel parcel) {
        this.f486a = parcel.createIntArray();
        this.f487b = parcel.readInt();
        this.f488c = parcel.readInt();
        this.f489d = parcel.readString();
        this.f490e = parcel.readInt();
        this.f491f = parcel.readInt();
        this.f492g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f493h = parcel.readInt();
        this.f494i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f495j = parcel.createStringArrayList();
        this.f496k = parcel.createStringArrayList();
        this.f497l = parcel.readInt() != 0;
    }

    public C0106d(C0528c c0528c) {
        int size = c0528c.f1834b.size();
        this.f486a = new int[(size * 6)];
        if (c0528c.f1841i) {
            int i = 0;
            int i2 = 0;
            while (i < size) {
                C0104a c0104a = (C0104a) c0528c.f1834b.get(i);
                int i3 = i2 + 1;
                this.f486a[i2] = c0104a.f480a;
                int i4 = i3 + 1;
                this.f486a[i3] = c0104a.f481b != null ? c0104a.f481b.f1882f : -1;
                i3 = i4 + 1;
                this.f486a[i4] = c0104a.f482c;
                i4 = i3 + 1;
                this.f486a[i3] = c0104a.f483d;
                i3 = i4 + 1;
                this.f486a[i4] = c0104a.f484e;
                i4 = i3 + 1;
                this.f486a[i3] = c0104a.f485f;
                i++;
                i2 = i4;
            }
            this.f487b = c0528c.f1839g;
            this.f488c = c0528c.f1840h;
            this.f489d = c0528c.f1843k;
            this.f490e = c0528c.f1845m;
            this.f491f = c0528c.f1846n;
            this.f492g = c0528c.f1847o;
            this.f493h = c0528c.f1848p;
            this.f494i = c0528c.f1849q;
            this.f495j = c0528c.f1850r;
            this.f496k = c0528c.f1851s;
            this.f497l = c0528c.f1852t;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: a */
    public C0528c m414a(C0535m c0535m) {
        C0528c c0528c = new C0528c(c0535m);
        int i = 0;
        int i2 = 0;
        while (i < this.f486a.length) {
            C0104a c0104a = new C0104a();
            int i3 = i + 1;
            c0104a.f480a = this.f486a[i];
            if (C0535m.f1919a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Instantiate ");
                stringBuilder.append(c0528c);
                stringBuilder.append(" op #");
                stringBuilder.append(i2);
                stringBuilder.append(" base fragment #");
                stringBuilder.append(this.f486a[i3]);
                Log.v("FragmentManager", stringBuilder.toString());
            }
            int i4 = i3 + 1;
            i = this.f486a[i3];
            c0104a.f481b = i >= 0 ? (C0530g) c0535m.f1931f.get(i) : null;
            i3 = i4 + 1;
            c0104a.f482c = this.f486a[i4];
            i4 = i3 + 1;
            c0104a.f483d = this.f486a[i3];
            i3 = i4 + 1;
            c0104a.f484e = this.f486a[i4];
            i4 = i3 + 1;
            c0104a.f485f = this.f486a[i3];
            c0528c.f1835c = c0104a.f482c;
            c0528c.f1836d = c0104a.f483d;
            c0528c.f1837e = c0104a.f484e;
            c0528c.f1838f = c0104a.f485f;
            c0528c.m2089a(c0104a);
            i2++;
            i = i4;
        }
        c0528c.f1839g = this.f487b;
        c0528c.f1840h = this.f488c;
        c0528c.f1843k = this.f489d;
        c0528c.f1845m = this.f490e;
        c0528c.f1841i = true;
        c0528c.f1846n = this.f491f;
        c0528c.f1847o = this.f492g;
        c0528c.f1848p = this.f493h;
        c0528c.f1849q = this.f494i;
        c0528c.f1850r = this.f495j;
        c0528c.f1851s = this.f496k;
        c0528c.f1852t = this.f497l;
        c0528c.m2088a(1);
        return c0528c;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f486a);
        parcel.writeInt(this.f487b);
        parcel.writeInt(this.f488c);
        parcel.writeString(this.f489d);
        parcel.writeInt(this.f490e);
        parcel.writeInt(this.f491f);
        TextUtils.writeToParcel(this.f492g, parcel, 0);
        parcel.writeInt(this.f493h);
        TextUtils.writeToParcel(this.f494i, parcel, 0);
        parcel.writeStringList(this.f495j);
        parcel.writeStringList(this.f496k);
        parcel.writeInt(this.f497l);
    }
}
