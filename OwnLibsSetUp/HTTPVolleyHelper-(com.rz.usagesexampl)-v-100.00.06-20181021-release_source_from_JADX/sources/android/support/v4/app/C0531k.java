package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.k */
public abstract class C0531k<E> extends C0113i {
    /* renamed from: a */
    private final Activity f1903a;
    /* renamed from: b */
    final Context f1904b;
    /* renamed from: c */
    final int f1905c;
    /* renamed from: d */
    final C0535m f1906d;
    /* renamed from: e */
    private final Handler f1907e;

    C0531k(Activity activity, Context context, Handler handler, int i) {
        this.f1906d = new C0535m();
        this.f1903a = activity;
        this.f1904b = context;
        this.f1907e = handler;
        this.f1905c = i;
    }

    C0531k(C0786h c0786h) {
        this(c0786h, c0786h, c0786h.f2823c, 0);
    }

    /* renamed from: a */
    public View mo40a(int i) {
        return null;
    }

    /* renamed from: a */
    public void mo448a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: a */
    public boolean mo41a() {
        return true;
    }

    /* renamed from: a */
    public boolean mo449a(C0530g c0530g) {
        return true;
    }

    /* renamed from: b */
    public LayoutInflater mo450b() {
        return LayoutInflater.from(this.f1904b);
    }

    /* renamed from: b */
    void mo451b(C0530g c0530g) {
    }

    /* renamed from: c */
    public void mo452c() {
    }

    /* renamed from: d */
    public boolean mo453d() {
        return true;
    }

    /* renamed from: e */
    public int mo454e() {
        return this.f1905c;
    }

    /* renamed from: f */
    Activity m2219f() {
        return this.f1903a;
    }

    /* renamed from: g */
    Context m2220g() {
        return this.f1904b;
    }

    /* renamed from: h */
    Handler m2221h() {
        return this.f1907e;
    }

    /* renamed from: i */
    C0535m m2222i() {
        return this.f1906d;
    }
}
