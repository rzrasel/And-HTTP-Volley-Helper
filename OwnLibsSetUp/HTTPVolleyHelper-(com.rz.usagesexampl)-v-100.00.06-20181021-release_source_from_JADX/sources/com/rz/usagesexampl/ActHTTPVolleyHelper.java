package com.rz.usagesexampl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.C0791c;
import com.p025a.p026a.C0437u;
import com.rz.usagesexampl.p037a.C0496b;
import com.rz.usagesexampl.p037a.C0496b.C0495a;
import com.rz.usagesexampl.p037a.C0500d.C0499b;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

public class ActHTTPVolleyHelper extends C0791c {
    /* renamed from: m */
    private Activity f2839m;
    /* renamed from: n */
    private Context f2840n;

    /* renamed from: com.rz.usagesexampl.ActHTTPVolleyHelper$1 */
    class C07231 implements C0495a {
        /* renamed from: a */
        final /* synthetic */ ActHTTPVolleyHelper f2586a;

        C07231(ActHTTPVolleyHelper actHTTPVolleyHelper) {
            this.f2586a = actHTTPVolleyHelper;
        }

        /* renamed from: a */
        public void mo409a(C0437u c0437u) {
        }

        /* renamed from: a */
        public void mo410a(C0437u c0437u, String str, String str2) {
        }

        /* renamed from: a */
        public void mo411a(String str) {
        }

        /* renamed from: a */
        public void mo412a(ArrayList<?> arrayList) {
            PrintStream printStream = System.out;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("DEBUG_LOG_PRINT (ActDashboard): size ");
            stringBuilder.append(arrayList.size());
            printStream.println(stringBuilder.toString());
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.act_httpvolley_helper);
        this.f2839m = this;
        this.f2840n = this;
        C0496b c0496b = new C0496b(this.f2840n);
        HashMap hashMap = new HashMap();
        hashMap.put("Authorization", "Token ApiAuthToken");
        c0496b.m1931a("url").m1930a(C0501a.class).m1932a(hashMap).m1929a(new C07231(this)).m1933a(C0499b.GET);
    }
}
