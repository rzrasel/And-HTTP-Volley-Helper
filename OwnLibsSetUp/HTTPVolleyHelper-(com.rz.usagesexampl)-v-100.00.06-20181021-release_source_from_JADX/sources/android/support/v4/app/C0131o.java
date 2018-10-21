package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.app.o */
final class C0131o implements Parcelable {
    public static final Creator<C0131o> CREATOR = new C01301();
    /* renamed from: a */
    C0133p[] f546a;
    /* renamed from: b */
    int[] f547b;
    /* renamed from: c */
    C0106d[] f548c;
    /* renamed from: d */
    int f549d = -1;
    /* renamed from: e */
    int f550e;

    /* renamed from: android.support.v4.app.o$1 */
    static class C01301 implements Creator<C0131o> {
        C01301() {
        }

        /* renamed from: a */
        public C0131o m478a(Parcel parcel) {
            return new C0131o(parcel);
        }

        /* renamed from: a */
        public C0131o[] m479a(int i) {
            return new C0131o[i];
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m478a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m479a(i);
        }
    }

    public C0131o(Parcel parcel) {
        this.f546a = (C0133p[]) parcel.createTypedArray(C0133p.CREATOR);
        this.f547b = parcel.createIntArray();
        this.f548c = (C0106d[]) parcel.createTypedArray(C0106d.CREATOR);
        this.f549d = parcel.readInt();
        this.f550e = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f546a, i);
        parcel.writeIntArray(this.f547b);
        parcel.writeTypedArray(this.f548c, i);
        parcel.writeInt(this.f549d);
        parcel.writeInt(this.f550e);
    }
}
