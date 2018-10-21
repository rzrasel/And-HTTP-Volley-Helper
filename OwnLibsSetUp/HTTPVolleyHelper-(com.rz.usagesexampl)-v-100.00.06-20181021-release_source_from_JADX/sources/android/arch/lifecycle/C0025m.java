package android.arch.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.arch.lifecycle.C0015c.C0013a;
import android.os.Bundle;

/* renamed from: android.arch.lifecycle.m */
public class C0025m extends Fragment {
    /* renamed from: a */
    private C0024a f40a;

    /* renamed from: android.arch.lifecycle.m$a */
    interface C0024a {
        /* renamed from: a */
        void m53a();

        /* renamed from: b */
        void m54b();

        /* renamed from: c */
        void m55c();
    }

    /* renamed from: a */
    public static void m56a(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new C0025m(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: a */
    private void m57a(C0013a c0013a) {
        Activity activity = getActivity();
        if (activity instanceof C0508g) {
            ((C0508g) activity).m1994b().m1990a(c0013a);
            return;
        }
        if (activity instanceof C0017e) {
            C0015c a = ((C0017e) activity).mo42a();
            if (a instanceof C0507f) {
                ((C0507f) a).m1990a(c0013a);
            }
        }
    }

    /* renamed from: a */
    private void m58a(C0024a c0024a) {
        if (c0024a != null) {
            c0024a.m53a();
        }
    }

    /* renamed from: b */
    private void m59b(C0024a c0024a) {
        if (c0024a != null) {
            c0024a.m54b();
        }
    }

    /* renamed from: c */
    private void m60c(C0024a c0024a) {
        if (c0024a != null) {
            c0024a.m55c();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m58a(this.f40a);
        m57a(C0013a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        m57a(C0013a.ON_DESTROY);
        this.f40a = null;
    }

    public void onPause() {
        super.onPause();
        m57a(C0013a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        m60c(this.f40a);
        m57a(C0013a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        m59b(this.f40a);
        m57a(C0013a.ON_START);
    }

    public void onStop() {
        super.onStop();
        m57a(C0013a.ON_STOP);
    }
}
