package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v4.app.j */
public class C0114j {
    /* renamed from: a */
    private final C0531k<?> f522a;

    private C0114j(C0531k<?> c0531k) {
        this.f522a = c0531k;
    }

    /* renamed from: a */
    public static C0114j m428a(C0531k<?> c0531k) {
        return new C0114j(c0531k);
    }

    /* renamed from: a */
    public C0530g m429a(String str) {
        return this.f522a.f1906d.m2288b(str);
    }

    /* renamed from: a */
    public C0117l m430a() {
        return this.f522a.m2222i();
    }

    /* renamed from: a */
    public View m431a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f522a.f1906d.onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: a */
    public void m432a(Configuration configuration) {
        this.f522a.f1906d.m2268a(configuration);
    }

    /* renamed from: a */
    public void m433a(Parcelable parcelable, C0129n c0129n) {
        this.f522a.f1906d.m2270a(parcelable, c0129n);
    }

    /* renamed from: a */
    public void m434a(C0530g c0530g) {
        this.f522a.f1906d.m2278a(this.f522a, this.f522a, c0530g);
    }

    /* renamed from: a */
    public void m435a(boolean z) {
        this.f522a.f1906d.m2280a(z);
    }

    /* renamed from: a */
    public boolean m436a(Menu menu) {
        return this.f522a.f1906d.m2283a(menu);
    }

    /* renamed from: a */
    public boolean m437a(Menu menu, MenuInflater menuInflater) {
        return this.f522a.f1906d.m2284a(menu, menuInflater);
    }

    /* renamed from: a */
    public boolean m438a(MenuItem menuItem) {
        return this.f522a.f1906d.m2285a(menuItem);
    }

    /* renamed from: b */
    public void m439b() {
        this.f522a.f1906d.m2322k();
    }

    /* renamed from: b */
    public void m440b(Menu menu) {
        this.f522a.f1906d.m2294b(menu);
    }

    /* renamed from: b */
    public void m441b(boolean z) {
        this.f522a.f1906d.m2295b(z);
    }

    /* renamed from: b */
    public boolean m442b(MenuItem menuItem) {
        return this.f522a.f1906d.m2296b(menuItem);
    }

    /* renamed from: c */
    public Parcelable m443c() {
        return this.f522a.f1906d.m2320j();
    }

    /* renamed from: d */
    public C0129n m444d() {
        return this.f522a.f1906d.m2315h();
    }

    /* renamed from: e */
    public void m445e() {
        this.f522a.f1906d.m2324l();
    }

    /* renamed from: f */
    public void m446f() {
        this.f522a.f1906d.m2326m();
    }

    /* renamed from: g */
    public void m447g() {
        this.f522a.f1906d.m2329n();
    }

    /* renamed from: h */
    public void m448h() {
        this.f522a.f1906d.m2330o();
    }

    /* renamed from: i */
    public void m449i() {
        this.f522a.f1906d.m2332p();
    }

    /* renamed from: j */
    public void m450j() {
        this.f522a.f1906d.m2333q();
    }

    /* renamed from: k */
    public void m451k() {
        this.f522a.f1906d.m2334r();
    }

    /* renamed from: l */
    public void m452l() {
        this.f522a.f1906d.m2336t();
    }

    /* renamed from: m */
    public void m453m() {
        this.f522a.f1906d.m2337u();
    }

    /* renamed from: n */
    public boolean m454n() {
        return this.f522a.f1906d.m2308e();
    }
}
