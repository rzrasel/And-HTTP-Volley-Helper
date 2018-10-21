package android.support.v4.p008a;

import android.support.v4.p016f.C0185d;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.a.b */
public class C0098b<D> {
    /* renamed from: a */
    int f470a;
    /* renamed from: b */
    C0097a<D> f471b;
    /* renamed from: c */
    boolean f472c;
    /* renamed from: d */
    boolean f473d;
    /* renamed from: e */
    boolean f474e;
    /* renamed from: f */
    boolean f475f;
    /* renamed from: g */
    boolean f476g;

    /* renamed from: android.support.v4.a.b$a */
    public interface C0097a<D> {
    }

    /* renamed from: a */
    public String m388a(D d) {
        StringBuilder stringBuilder = new StringBuilder(64);
        C0185d.m671a(d, stringBuilder);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final void m389a() {
        this.f472c = true;
        this.f474e = false;
        this.f473d = false;
        m392b();
    }

    /* renamed from: a */
    public void m390a(C0097a<D> c0097a) {
        if (this.f471b == null) {
            throw new IllegalStateException("No listener register");
        } else if (this.f471b == c0097a) {
            this.f471b = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    /* renamed from: a */
    public void m391a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f470a);
        printWriter.print(" mListener=");
        printWriter.println(this.f471b);
        if (this.f472c || this.f475f || this.f476g) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f472c);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f475f);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f476g);
        }
        if (this.f473d || this.f474e) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f473d);
            printWriter.print(" mReset=");
            printWriter.println(this.f474e);
        }
    }

    /* renamed from: b */
    protected void m392b() {
    }

    /* renamed from: c */
    public boolean m393c() {
        return m394d();
    }

    /* renamed from: d */
    protected boolean m394d() {
        return false;
    }

    /* renamed from: e */
    public void m395e() {
        this.f472c = false;
        m396f();
    }

    /* renamed from: f */
    protected void m396f() {
    }

    /* renamed from: g */
    public void m397g() {
        this.f473d = true;
        m398h();
    }

    /* renamed from: h */
    protected void m398h() {
    }

    /* renamed from: i */
    public void m399i() {
        m400j();
        this.f474e = true;
        this.f472c = false;
        this.f473d = false;
        this.f475f = false;
        this.f476g = false;
    }

    /* renamed from: j */
    protected void m400j() {
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        C0185d.m671a(this, stringBuilder);
        stringBuilder.append(" id=");
        stringBuilder.append(this.f470a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
