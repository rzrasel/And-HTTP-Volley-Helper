package android.support.v4.app;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

/* renamed from: android.support.v4.app.f */
abstract class C0777f extends C0735e {
    /* renamed from: b */
    boolean f2794b;

    C0777f() {
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!(this.f2794b || i == -1)) {
            C0735e.m3383a(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!(this.a || i == -1)) {
            C0735e.m3383a(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
