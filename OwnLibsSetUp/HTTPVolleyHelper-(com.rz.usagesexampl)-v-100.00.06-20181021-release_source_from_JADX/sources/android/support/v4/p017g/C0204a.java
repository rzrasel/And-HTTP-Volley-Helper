package android.support.v4.p017g;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.g.a */
public abstract class C0204a implements Parcelable {
    public static final Creator<C0204a> CREATOR = new C01992();
    /* renamed from: a */
    public static final C0204a f752a = new C05511();
    /* renamed from: b */
    private final Parcelable f753b;

    /* renamed from: android.support.v4.g.a$2 */
    static class C01992 implements ClassLoaderCreator<C0204a> {
        C01992() {
        }

        /* renamed from: a */
        public C0204a m736a(Parcel parcel) {
            return m737a(parcel, null);
        }

        /* renamed from: a */
        public C0204a m737a(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return C0204a.f752a;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: a */
        public C0204a[] m738a(int i) {
            return new C0204a[i];
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m736a(parcel);
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return m737a(parcel, classLoader);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m738a(i);
        }
    }

    /* renamed from: android.support.v4.g.a$1 */
    static class C05511 extends C0204a {
        C05511() {
            super();
        }
    }

    private C0204a() {
        this.f753b = null;
    }

    protected C0204a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        if (readParcelable == null) {
            readParcelable = f752a;
        }
        this.f753b = readParcelable;
    }

    protected C0204a(Parcelable parcelable) {
        if (parcelable != null) {
            if (parcelable == f752a) {
                parcelable = null;
            }
            this.f753b = parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    /* renamed from: a */
    public final Parcelable m770a() {
        return this.f753b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f753b, i);
    }
}
