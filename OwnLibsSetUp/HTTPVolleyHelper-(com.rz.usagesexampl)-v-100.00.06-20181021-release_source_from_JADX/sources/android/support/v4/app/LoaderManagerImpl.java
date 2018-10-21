package android.support.v4.app;

import android.arch.lifecycle.C0017e;
import android.arch.lifecycle.C0022k;
import android.arch.lifecycle.C0026n;
import android.arch.lifecycle.C0028o.C0027a;
import android.arch.lifecycle.C0509j;
import android.os.Bundle;
import android.support.v4.app.C0150u.C0149a;
import android.support.v4.p008a.C0098b;
import android.support.v4.p008a.C0098b.C0097a;
import android.support.v4.p016f.C0185d;
import android.support.v4.p016f.C0198l;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

class LoaderManagerImpl extends C0150u {
    /* renamed from: a */
    static boolean f1829a = false;
    /* renamed from: b */
    private final C0017e f1830b;
    /* renamed from: c */
    private final LoaderViewModel f1831c;

    static class LoaderViewModel extends C0026n {
        /* renamed from: a */
        private static final C0027a f1824a = new C05241();
        /* renamed from: b */
        private C0198l<C0734a> f1825b = new C0198l();

        /* renamed from: android.support.v4.app.LoaderManagerImpl$LoaderViewModel$1 */
        static class C05241 implements C0027a {
            C05241() {
            }
        }

        LoaderViewModel() {
        }

        /* renamed from: a */
        protected void mo35a() {
            super.mo35a();
            int b = this.f1825b.m728b();
            for (int i = 0; i < b; i++) {
                ((C0734a) this.f1825b.m735e(i)).m3376a(true);
            }
            this.f1825b.m731c();
        }

        /* renamed from: a */
        public void m2075a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f1825b.m728b() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append("    ");
                String stringBuilder2 = stringBuilder.toString();
                for (int i = 0; i < this.f1825b.m728b(); i++) {
                    C0734a c0734a = (C0734a) this.f1825b.m735e(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f1825b.m734d(i));
                    printWriter.print(": ");
                    printWriter.println(c0734a.toString());
                    c0734a.m3378a(stringBuilder2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* renamed from: b */
        void m2076b() {
            int b = this.f1825b.m728b();
            for (int i = 0; i < b; i++) {
                ((C0734a) this.f1825b.m735e(i)).m3382f();
            }
        }
    }

    /* renamed from: android.support.v4.app.LoaderManagerImpl$b */
    static class C0525b<D> implements C0022k<D> {
        /* renamed from: a */
        private final C0098b<D> f1826a;
        /* renamed from: b */
        private final C0149a<D> f1827b;
        /* renamed from: c */
        private boolean f1828c;

        /* renamed from: a */
        public void mo36a(D d) {
            if (LoaderManagerImpl.f1829a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("  onLoadFinished in ");
                stringBuilder.append(this.f1826a);
                stringBuilder.append(": ");
                stringBuilder.append(this.f1826a.m388a((Object) d));
                Log.v("LoaderManager", stringBuilder.toString());
            }
            this.f1827b.m545a(this.f1826a, d);
            this.f1828c = true;
        }

        /* renamed from: a */
        public void m2078a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f1828c);
        }

        /* renamed from: a */
        boolean m2079a() {
            return this.f1828c;
        }

        /* renamed from: b */
        void m2080b() {
            if (this.f1828c) {
                if (LoaderManagerImpl.f1829a) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("  Resetting: ");
                    stringBuilder.append(this.f1826a);
                    Log.v("LoaderManager", stringBuilder.toString());
                }
                this.f1827b.m544a(this.f1826a);
            }
        }

        public String toString() {
            return this.f1827b.toString();
        }
    }

    /* renamed from: android.support.v4.app.LoaderManagerImpl$a */
    public static class C0734a<D> extends C0509j<D> implements C0097a<D> {
        /* renamed from: a */
        private final int f2613a;
        /* renamed from: b */
        private final Bundle f2614b;
        /* renamed from: c */
        private final C0098b<D> f2615c;
        /* renamed from: d */
        private C0017e f2616d;
        /* renamed from: e */
        private C0525b<D> f2617e;
        /* renamed from: f */
        private C0098b<D> f2618f;

        /* renamed from: a */
        C0098b<D> m3376a(boolean z) {
            if (LoaderManagerImpl.f1829a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("  Destroying: ");
                stringBuilder.append(this);
                Log.v("LoaderManager", stringBuilder.toString());
            }
            this.f2615c.m393c();
            this.f2615c.m397g();
            C0022k c0022k = this.f2617e;
            if (c0022k != null) {
                mo445a(c0022k);
                if (z) {
                    c0022k.m2080b();
                }
            }
            this.f2615c.m390a((C0097a) this);
            if ((c0022k == null || c0022k.m2079a()) && !z) {
                return this.f2615c;
            }
            this.f2615c.m399i();
            return this.f2618f;
        }

        /* renamed from: a */
        public void mo445a(C0022k<D> c0022k) {
            super.mo445a((C0022k) c0022k);
            this.f2616d = null;
            this.f2617e = null;
        }

        /* renamed from: a */
        public void m3378a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f2613a);
            printWriter.print(" mArgs=");
            printWriter.println(this.f2614b);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f2615c);
            C0098b c0098b = this.f2615c;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("  ");
            c0098b.m391a(stringBuilder.toString(), fileDescriptor, printWriter, strArr);
            if (this.f2617e != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f2617e);
                C0525b c0525b = this.f2617e;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(str);
                stringBuilder2.append("  ");
                c0525b.m2078a(stringBuilder2.toString(), printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(m3381e().m388a(m23a()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(m28d());
        }

        /* renamed from: b */
        protected void mo446b() {
            if (LoaderManagerImpl.f1829a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("  Starting: ");
                stringBuilder.append(this);
                Log.v("LoaderManager", stringBuilder.toString());
            }
            this.f2615c.m389a();
        }

        /* renamed from: c */
        protected void mo447c() {
            if (LoaderManagerImpl.f1829a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("  Stopping: ");
                stringBuilder.append(this);
                Log.v("LoaderManager", stringBuilder.toString());
            }
            this.f2615c.m395e();
        }

        /* renamed from: e */
        C0098b<D> m3381e() {
            return this.f2615c;
        }

        /* renamed from: f */
        void m3382f() {
            C0017e c0017e = this.f2616d;
            C0022k c0022k = this.f2617e;
            if (c0017e != null && c0022k != null) {
                super.mo445a(c0022k);
                m24a(c0017e, c0022k);
            }
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append("LoaderInfo{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" #");
            stringBuilder.append(this.f2613a);
            stringBuilder.append(" : ");
            C0185d.m671a(this.f2615c, stringBuilder);
            stringBuilder.append("}}");
            return stringBuilder.toString();
        }
    }

    /* renamed from: a */
    void m2081a() {
        this.f1831c.m2076b();
    }

    /* renamed from: a */
    public void mo37a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f1831c.m2075a(str, fileDescriptor, printWriter, strArr);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("LoaderManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        C0185d.m671a(this.f1830b, stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }
}
