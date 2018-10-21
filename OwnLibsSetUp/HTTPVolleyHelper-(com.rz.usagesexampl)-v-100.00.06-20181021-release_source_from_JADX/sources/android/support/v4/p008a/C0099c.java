package android.support.v4.p008a;

import android.content.Context;
import android.os.Process;
import android.support.v4.app.C0103b;

/* renamed from: android.support.v4.a.c */
public final class C0099c {
    /* renamed from: a */
    public static int m401a(Context context, String str) {
        return C0099c.m402a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    /* renamed from: a */
    public static int m402a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        str = C0103b.m411a(str);
        if (str == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid != null) {
                if (packagesForUid.length > 0) {
                    str2 = packagesForUid[0];
                }
            }
            return -1;
        }
        return C0103b.m410a(context, str, str2) != 0 ? -2 : 0;
    }
}
