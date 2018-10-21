package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.p008a.C0096a;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class aa implements Iterable<Intent> {
    /* renamed from: a */
    private static final C0102c f477a = (VERSION.SDK_INT >= 16 ? new C0527b() : new C0102c());
    /* renamed from: b */
    private final ArrayList<Intent> f478b = new ArrayList();
    /* renamed from: c */
    private final Context f479c;

    /* renamed from: android.support.v4.app.aa$a */
    public interface C0101a {
        Intent a_();
    }

    /* renamed from: android.support.v4.app.aa$c */
    static class C0102c {
        C0102c() {
        }
    }

    /* renamed from: android.support.v4.app.aa$b */
    static class C0527b extends C0102c {
        C0527b() {
        }
    }

    private aa(Context context) {
        this.f479c = context;
    }

    /* renamed from: a */
    public static aa m404a(Context context) {
        return new aa(context);
    }

    /* renamed from: a */
    public aa m405a(Activity activity) {
        Intent a_ = activity instanceof C0101a ? ((C0101a) activity).a_() : null;
        if (a_ == null) {
            a_ = C0151v.m547a(activity);
        }
        if (a_ != null) {
            ComponentName component = a_.getComponent();
            if (component == null) {
                component = a_.resolveActivity(this.f479c.getPackageManager());
            }
            m406a(component);
            m407a(a_);
        }
        return this;
    }

    /* renamed from: a */
    public aa m406a(ComponentName componentName) {
        int size = this.f478b.size();
        try {
            Context context = this.f479c;
            while (true) {
                Intent a = C0151v.m548a(context, componentName);
                if (a == null) {
                    return this;
                }
                this.f478b.add(size, a);
                context = this.f479c;
                componentName = a.getComponent();
            }
        } catch (Throwable e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public aa m407a(Intent intent) {
        this.f478b.add(intent);
        return this;
    }

    /* renamed from: a */
    public void m408a() {
        m409a(null);
    }

    /* renamed from: a */
    public void m409a(Bundle bundle) {
        if (this.f478b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f478b.toArray(new Intent[this.f478b.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (!C0096a.m386a(this.f479c, intentArr, bundle)) {
            Intent intent = new Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(268435456);
            this.f479c.startActivity(intent);
        }
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f478b.iterator();
    }
}
