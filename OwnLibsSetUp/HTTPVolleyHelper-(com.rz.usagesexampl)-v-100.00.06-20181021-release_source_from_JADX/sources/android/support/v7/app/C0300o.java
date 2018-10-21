package android.support.v7.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.p008a.C0099c;
import android.util.Log;
import java.util.Calendar;

/* renamed from: android.support.v7.app.o */
class C0300o {
    /* renamed from: a */
    private static C0300o f1014a;
    /* renamed from: b */
    private final Context f1015b;
    /* renamed from: c */
    private final LocationManager f1016c;
    /* renamed from: d */
    private final C0299a f1017d = new C0299a();

    /* renamed from: android.support.v7.app.o$a */
    private static class C0299a {
        /* renamed from: a */
        boolean f1008a;
        /* renamed from: b */
        long f1009b;
        /* renamed from: c */
        long f1010c;
        /* renamed from: d */
        long f1011d;
        /* renamed from: e */
        long f1012e;
        /* renamed from: f */
        long f1013f;

        C0299a() {
        }
    }

    C0300o(Context context, LocationManager locationManager) {
        this.f1015b = context;
        this.f1016c = locationManager;
    }

    /* renamed from: a */
    private Location m1117a(String str) {
        try {
            if (this.f1016c.isProviderEnabled(str)) {
                return this.f1016c.getLastKnownLocation(str);
            }
        } catch (Throwable e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
        }
        return null;
    }

    /* renamed from: a */
    static C0300o m1118a(Context context) {
        if (f1014a == null) {
            context = context.getApplicationContext();
            f1014a = new C0300o(context, (LocationManager) context.getSystemService("location"));
        }
        return f1014a;
    }

    /* renamed from: a */
    private void m1119a(Location location) {
        long j;
        C0299a c0299a = this.f1017d;
        long currentTimeMillis = System.currentTimeMillis();
        C0298n a = C0298n.m1115a();
        C0298n c0298n = a;
        c0298n.m1116a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = a.f1005a;
        c0298n.m1116a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = a.f1007c == 1;
        long j3 = a.f1006b;
        long j4 = j2;
        j2 = a.f1005a;
        long j5 = j3;
        boolean z2 = z;
        a.m1116a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j6 = a.f1006b;
        if (j5 != -1) {
            if (j2 != -1) {
                j = currentTimeMillis > j2 ? 0 + j6 : currentTimeMillis > j5 ? 0 + j2 : 0 + j5;
                j += 60000;
                c0299a.f1008a = z2;
                c0299a.f1009b = j4;
                c0299a.f1010c = j5;
                c0299a.f1011d = j2;
                c0299a.f1012e = j6;
                c0299a.f1013f = j;
            }
        }
        j = 43200000 + currentTimeMillis;
        c0299a.f1008a = z2;
        c0299a.f1009b = j4;
        c0299a.f1010c = j5;
        c0299a.f1011d = j2;
        c0299a.f1012e = j6;
        c0299a.f1013f = j;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    private Location m1120b() {
        Location location = null;
        Location a = C0099c.m401a(this.f1015b, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m1117a("network") : null;
        if (C0099c.m401a(this.f1015b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = m1117a("gps");
        }
        if (location == null || a == null) {
            if (location != null) {
                a = location;
            }
            return a;
        }
        if (location.getTime() > a.getTime()) {
            a = location;
        }
        return a;
    }

    /* renamed from: c */
    private boolean m1121c() {
        return this.f1017d.f1013f > System.currentTimeMillis();
    }

    /* renamed from: a */
    boolean m1122a() {
        C0299a c0299a = this.f1017d;
        if (m1121c()) {
            return c0299a.f1008a;
        }
        Location b = m1120b();
        if (b != null) {
            m1119a(b);
            return c0299a.f1008a;
        }
        boolean z;
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        if (i >= 6) {
            if (i < 22) {
                z = false;
                return z;
            }
        }
        z = true;
        return z;
    }
}
