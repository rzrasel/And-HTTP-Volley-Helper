package android.support.v4.app;

import android.arch.lifecycle.C0015c;
import android.arch.lifecycle.C0015c.C0014b;
import android.arch.lifecycle.C0029p;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.v4.app.C0526a.C0100a;
import android.support.v4.p016f.C0198l;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.h */
public class C0786h extends C0777f {
    /* renamed from: c */
    final Handler f2823c = new C01111(this);
    /* renamed from: d */
    final C0114j f2824d = C0114j.m428a(new C0736a(this));
    /* renamed from: e */
    C0150u f2825e;
    /* renamed from: f */
    boolean f2826f;
    /* renamed from: g */
    boolean f2827g;
    /* renamed from: h */
    boolean f2828h = true;
    /* renamed from: i */
    boolean f2829i = true;
    /* renamed from: j */
    boolean f2830j;
    /* renamed from: k */
    int f2831k;
    /* renamed from: l */
    C0198l<String> f2832l;
    /* renamed from: m */
    private C0029p f2833m;

    /* renamed from: android.support.v4.app.h$1 */
    class C01111 extends Handler {
        /* renamed from: a */
        final /* synthetic */ C0786h f518a;

        C01111(C0786h c0786h) {
            this.f518a = c0786h;
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    if (this.f518a.f2828h) {
                        this.f518a.m3737a(false);
                        return;
                    }
                    return;
                case 2:
                    this.f518a.m3739b();
                    this.f518a.f2824d.m454n();
                    return;
                default:
                    super.handleMessage(message);
                    return;
            }
        }
    }

    /* renamed from: android.support.v4.app.h$b */
    static final class C0112b {
        /* renamed from: a */
        Object f519a;
        /* renamed from: b */
        C0029p f520b;
        /* renamed from: c */
        C0129n f521c;

        C0112b() {
        }
    }

    /* renamed from: android.support.v4.app.h$a */
    class C0736a extends C0531k<C0786h> {
        /* renamed from: a */
        final /* synthetic */ C0786h f2620a;

        public C0736a(C0786h c0786h) {
            this.f2620a = c0786h;
            super(c0786h);
        }

        /* renamed from: a */
        public View mo40a(int i) {
            return this.f2620a.findViewById(i);
        }

        /* renamed from: a */
        public void mo448a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            this.f2620a.dump(str, fileDescriptor, printWriter, strArr);
        }

        /* renamed from: a */
        public boolean mo41a() {
            Window window = this.f2620a.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        /* renamed from: a */
        public boolean mo449a(C0530g c0530g) {
            return this.f2620a.isFinishing() ^ 1;
        }

        /* renamed from: b */
        public LayoutInflater mo450b() {
            return this.f2620a.getLayoutInflater().cloneInContext(this.f2620a);
        }

        /* renamed from: b */
        public void mo451b(C0530g c0530g) {
            this.f2620a.m3736a(c0530g);
        }

        /* renamed from: c */
        public void mo452c() {
            this.f2620a.mo565d();
        }

        /* renamed from: d */
        public boolean mo453d() {
            return this.f2620a.getWindow() != null;
        }

        /* renamed from: e */
        public int mo454e() {
            Window window = this.f2620a.getWindow();
            return window == null ? 0 : window.getAttributes().windowAnimations;
        }
    }

    /* renamed from: a */
    private static boolean m3732a(C0117l c0117l, C0014b c0014b) {
        boolean z = false;
        for (C0530g c0530g : c0117l.mo48b()) {
            if (c0530g != null) {
                if (c0530g.mo42a().mo8a().m38a(C0014b.STARTED)) {
                    c0530g.f1877U.m1991a(c0014b);
                    z = true;
                }
                C0117l j = c0530g.m2189j();
                if (j != null) {
                    z |= C0786h.m3732a(j, c0014b);
                }
            }
        }
        return z;
    }

    /* renamed from: g */
    private void mo566g() {
        do {
        } while (C0786h.m3732a(m3743f(), C0014b.CREATED));
    }

    /* renamed from: a */
    public C0015c mo42a() {
        return super.mo42a();
    }

    /* renamed from: a */
    final View mo553a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f2824d.m431a(view, str, context, attributeSet);
    }

    /* renamed from: a */
    public void m3736a(C0530g c0530g) {
    }

    /* renamed from: a */
    void m3737a(boolean z) {
        if (!this.f2829i) {
            this.f2829i = true;
            this.f2830j = z;
            this.f2823c.removeMessages(1);
            m3742e();
        }
    }

    /* renamed from: a */
    protected boolean m3738a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    /* renamed from: b */
    protected void m3739b() {
        this.f2824d.m448h();
    }

    /* renamed from: c */
    public Object m3740c() {
        return null;
    }

    @Deprecated
    /* renamed from: d */
    public void mo565d() {
        invalidateOptionsMenu();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("  ");
        String stringBuilder2 = stringBuilder.toString();
        printWriter.print(stringBuilder2);
        printWriter.print("mCreated=");
        printWriter.print(this.f2826f);
        printWriter.print("mResumed=");
        printWriter.print(this.f2827g);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2828h);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.f2829i);
        if (this.f2825e != null) {
            this.f2825e.mo37a(stringBuilder2, fileDescriptor, printWriter, strArr);
        }
        this.f2824d.m430a().mo46a(str, fileDescriptor, printWriter, strArr);
    }

    /* renamed from: e */
    void m3742e() {
        this.f2824d.m451k();
    }

    /* renamed from: f */
    public C0117l m3743f() {
        return this.f2824d.m430a();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        this.f2824d.m439b();
        int i3 = i >> 16;
        if (i3 != 0) {
            i3--;
            String str = (String) this.f2832l.m726a(i3);
            this.f2832l.m732c(i3);
            if (str == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            C0530g a = this.f2824d.m429a(str);
            if (a == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Activity result no fragment exists for who: ");
                stringBuilder.append(str);
                Log.w("FragmentActivity", stringBuilder.toString());
            } else {
                a.m2139a(i & 65535, i2, intent);
            }
            return;
        }
        C0100a a2 = C0526a.m2083a();
        if (a2 == null || !a2.m403a(this, i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        C0117l a = this.f2824d.m430a();
        boolean c = a.mo49c();
        if (!c || VERSION.SDK_INT > 25) {
            if (c || !a.mo47a()) {
                super.onBackPressed();
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2824d.m439b();
        this.f2824d.m432a(configuration);
    }

    protected void onCreate(Bundle bundle) {
        C0129n c0129n = null;
        this.f2824d.m434a(null);
        super.onCreate(bundle);
        C0112b c0112b = (C0112b) getLastNonConfigurationInstance();
        if (c0112b != null) {
            this.f2833m = c0112b.f520b;
        }
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            C0114j c0114j = this.f2824d;
            if (c0112b != null) {
                c0129n = c0112b.f521c;
            }
            c0114j.m433a(parcelable, c0129n);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f2831k = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (!(intArray == null || stringArray == null)) {
                    if (intArray.length == stringArray.length) {
                        this.f2832l = new C0198l(intArray.length);
                        for (int i = 0; i < intArray.length; i++) {
                            this.f2832l.m730b(intArray[i], stringArray[i]);
                        }
                    }
                }
                Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
            }
        }
        if (this.f2832l == null) {
            this.f2832l = new C0198l();
            this.f2831k = 0;
        }
        this.f2824d.m445e();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return i == 0 ? super.onCreatePanelMenu(i, menu) | this.f2824d.m437a(menu, getMenuInflater()) : super.onCreatePanelMenu(i, menu);
    }

    public /* bridge */ /* synthetic */ View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(view, str, context, attributeSet);
    }

    public /* bridge */ /* synthetic */ View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(str, context, attributeSet);
    }

    protected void onDestroy() {
        super.onDestroy();
        m3737a(false);
        if (!(this.f2833m == null || this.f2830j)) {
            this.f2833m.m62a();
        }
        this.f2824d.m452l();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f2824d.m453m();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return super.onMenuItemSelected(i, menuItem) ? true : i != 0 ? i != 6 ? false : this.f2824d.m442b(menuItem) : this.f2824d.m438a(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.f2824d.m435a(z);
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f2824d.m439b();
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f2824d.m440b(menu);
        }
        super.onPanelClosed(i, menu);
    }

    protected void onPause() {
        super.onPause();
        this.f2827g = false;
        if (this.f2823c.hasMessages(2)) {
            this.f2823c.removeMessages(2);
            m3739b();
        }
        this.f2824d.m449i();
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.f2824d.m441b(z);
    }

    protected void onPostResume() {
        super.onPostResume();
        this.f2823c.removeMessages(2);
        m3739b();
        this.f2824d.m454n();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return (i != 0 || menu == null) ? super.onPreparePanel(i, view, menu) : m3738a(view, menu) | this.f2824d.m436a(menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f2824d.m439b();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            i2--;
            String str = (String) this.f2832l.m726a(i2);
            this.f2832l.m732c(i2);
            if (str == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            C0530g a = this.f2824d.m429a(str);
            if (a == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Activity result no fragment exists for who: ");
                stringBuilder.append(str);
                Log.w("FragmentActivity", stringBuilder.toString());
            } else {
                a.m2141a(i & 65535, strArr, iArr);
            }
        }
    }

    protected void onResume() {
        super.onResume();
        this.f2823c.sendEmptyMessage(2);
        this.f2827g = true;
        this.f2824d.m454n();
    }

    public final Object onRetainNonConfigurationInstance() {
        if (this.f2828h) {
            m3737a(true);
        }
        Object c = m3740c();
        C0129n d = this.f2824d.m444d();
        if (d == null && this.f2833m == null && c == null) {
            return null;
        }
        C0112b c0112b = new C0112b();
        c0112b.f519a = c;
        c0112b.f520b = this.f2833m;
        c0112b.f521c = d;
        return c0112b;
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo566g();
        Parcelable c = this.f2824d.m443c();
        if (c != null) {
            bundle.putParcelable("android:support:fragments", c);
        }
        if (this.f2832l.m728b() > 0) {
            bundle.putInt("android:support:next_request_index", this.f2831k);
            int[] iArr = new int[this.f2832l.m728b()];
            String[] strArr = new String[this.f2832l.m728b()];
            for (int i = 0; i < this.f2832l.m728b(); i++) {
                iArr[i] = this.f2832l.m734d(i);
                strArr[i] = (String) this.f2832l.m735e(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    protected void onStart() {
        super.onStart();
        this.f2828h = false;
        this.f2829i = false;
        this.f2823c.removeMessages(1);
        if (!this.f2826f) {
            this.f2826f = true;
            this.f2824d.m446f();
        }
        this.f2824d.m439b();
        this.f2824d.m454n();
        this.f2824d.m447g();
    }

    public void onStateNotSaved() {
        this.f2824d.m439b();
    }

    protected void onStop() {
        super.onStop();
        this.f2828h = true;
        mo566g();
        this.f2823c.sendEmptyMessage(1);
        this.f2824d.m450j();
    }

    public void startActivityForResult(Intent intent, int i) {
        if (!(this.b || i == -1)) {
            C0735e.m3383a(i);
        }
        super.startActivityForResult(intent, i);
    }

    public /* bridge */ /* synthetic */ void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
