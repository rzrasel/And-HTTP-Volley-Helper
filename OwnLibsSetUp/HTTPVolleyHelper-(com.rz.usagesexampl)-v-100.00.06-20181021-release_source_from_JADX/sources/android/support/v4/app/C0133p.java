package android.support.v4.app;

import android.arch.lifecycle.C0029p;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;

/* renamed from: android.support.v4.app.p */
final class C0133p implements Parcelable {
    public static final Creator<C0133p> CREATOR = new C01321();
    /* renamed from: a */
    final String f551a;
    /* renamed from: b */
    final int f552b;
    /* renamed from: c */
    final boolean f553c;
    /* renamed from: d */
    final int f554d;
    /* renamed from: e */
    final int f555e;
    /* renamed from: f */
    final String f556f;
    /* renamed from: g */
    final boolean f557g;
    /* renamed from: h */
    final boolean f558h;
    /* renamed from: i */
    final Bundle f559i;
    /* renamed from: j */
    final boolean f560j;
    /* renamed from: k */
    Bundle f561k;
    /* renamed from: l */
    C0530g f562l;

    /* renamed from: android.support.v4.app.p$1 */
    static class C01321 implements Creator<C0133p> {
        C01321() {
        }

        /* renamed from: a */
        public C0133p m480a(Parcel parcel) {
            return new C0133p(parcel);
        }

        /* renamed from: a */
        public C0133p[] m481a(int i) {
            return new C0133p[i];
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m480a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m481a(i);
        }
    }

    C0133p(Parcel parcel) {
        this.f551a = parcel.readString();
        this.f552b = parcel.readInt();
        boolean z = false;
        this.f553c = parcel.readInt() != 0;
        this.f554d = parcel.readInt();
        this.f555e = parcel.readInt();
        this.f556f = parcel.readString();
        this.f557g = parcel.readInt() != 0;
        this.f558h = parcel.readInt() != 0;
        this.f559i = parcel.readBundle();
        if (parcel.readInt() != 0) {
            z = true;
        }
        this.f560j = z;
        this.f561k = parcel.readBundle();
    }

    C0133p(C0530g c0530g) {
        this.f551a = c0530g.getClass().getName();
        this.f552b = c0530g.f1882f;
        this.f553c = c0530g.f1890n;
        this.f554d = c0530g.f1901y;
        this.f555e = c0530g.f1902z;
        this.f556f = c0530g.f1857A;
        this.f557g = c0530g.f1860D;
        this.f558h = c0530g.f1859C;
        this.f559i = c0530g.f1884h;
        this.f560j = c0530g.f1858B;
    }

    /* renamed from: a */
    public C0530g m482a(C0531k c0531k, C0113i c0113i, C0530g c0530g, C0129n c0129n, C0029p c0029p) {
        if (this.f562l == null) {
            Context g = c0531k.m2220g();
            if (this.f559i != null) {
                this.f559i.setClassLoader(g.getClassLoader());
            }
            this.f562l = c0113i != null ? c0113i.mo39a(g, this.f551a, this.f559i) : C0530g.m2106a(g, this.f551a, this.f559i);
            if (this.f561k != null) {
                this.f561k.setClassLoader(g.getClassLoader());
                this.f562l.f1879c = this.f561k;
            }
            this.f562l.m2140a(this.f552b, c0530g);
            this.f562l.f1890n = this.f553c;
            this.f562l.f1892p = true;
            this.f562l.f1901y = this.f554d;
            this.f562l.f1902z = this.f555e;
            this.f562l.f1857A = this.f556f;
            this.f562l.f1860D = this.f557g;
            this.f562l.f1859C = this.f558h;
            this.f562l.f1858B = this.f560j;
            this.f562l.f1895s = c0531k.f1906d;
            if (C0535m.f1919a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Instantiated fragment ");
                stringBuilder.append(this.f562l);
                Log.v("FragmentManager", stringBuilder.toString());
            }
        }
        this.f562l.f1898v = c0129n;
        this.f562l.f1899w = c0029p;
        return this.f562l;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f551a);
        parcel.writeInt(this.f552b);
        parcel.writeInt(this.f553c);
        parcel.writeInt(this.f554d);
        parcel.writeInt(this.f555e);
        parcel.writeString(this.f556f);
        parcel.writeInt(this.f557g);
        parcel.writeInt(this.f558h);
        parcel.writeBundle(this.f559i);
        parcel.writeInt(this.f560j);
        parcel.writeBundle(this.f561k);
    }
}
