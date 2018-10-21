package android.support.v4.app;

import android.app.Activity;
import android.arch.lifecycle.C0015c;
import android.arch.lifecycle.C0015c.C0014b;
import android.arch.lifecycle.C0017e;
import android.arch.lifecycle.C0025m;
import android.arch.lifecycle.C0507f;
import android.os.Bundle;
import android.support.v4.p016f.C0197k;

/* renamed from: android.support.v4.app.z */
public class C0537z extends Activity implements C0017e {
    /* renamed from: a */
    private C0197k<Class<? extends Object>, Object> f1951a = new C0197k();
    /* renamed from: b */
    private C0507f f1952b = new C0507f(this);

    /* renamed from: a */
    public C0015c mo42a() {
        return this.f1952b;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0025m.m56a((Activity) this);
    }

    protected void onSaveInstanceState(Bundle bundle) {
        this.f1952b.m1991a(C0014b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
