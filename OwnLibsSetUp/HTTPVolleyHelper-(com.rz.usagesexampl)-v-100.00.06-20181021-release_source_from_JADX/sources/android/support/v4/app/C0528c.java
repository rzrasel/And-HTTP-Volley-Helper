package android.support.v4.app;

import android.support.v4.app.C0530g.C0110c;
import android.support.v4.app.C0535m.C0128g;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.c */
final class C0528c extends C0134q implements C0128g {
    /* renamed from: a */
    final C0535m f1833a;
    /* renamed from: b */
    ArrayList<C0104a> f1834b = new ArrayList();
    /* renamed from: c */
    int f1835c;
    /* renamed from: d */
    int f1836d;
    /* renamed from: e */
    int f1837e;
    /* renamed from: f */
    int f1838f;
    /* renamed from: g */
    int f1839g;
    /* renamed from: h */
    int f1840h;
    /* renamed from: i */
    boolean f1841i;
    /* renamed from: j */
    boolean f1842j = true;
    /* renamed from: k */
    String f1843k;
    /* renamed from: l */
    boolean f1844l;
    /* renamed from: m */
    int f1845m = -1;
    /* renamed from: n */
    int f1846n;
    /* renamed from: o */
    CharSequence f1847o;
    /* renamed from: p */
    int f1848p;
    /* renamed from: q */
    CharSequence f1849q;
    /* renamed from: r */
    ArrayList<String> f1850r;
    /* renamed from: s */
    ArrayList<String> f1851s;
    /* renamed from: t */
    boolean f1852t = false;
    /* renamed from: u */
    ArrayList<Runnable> f1853u;

    /* renamed from: android.support.v4.app.c$a */
    static final class C0104a {
        /* renamed from: a */
        int f480a;
        /* renamed from: b */
        C0530g f481b;
        /* renamed from: c */
        int f482c;
        /* renamed from: d */
        int f483d;
        /* renamed from: e */
        int f484e;
        /* renamed from: f */
        int f485f;

        C0104a() {
        }

        C0104a(int i, C0530g c0530g) {
            this.f480a = i;
            this.f481b = c0530g;
        }
    }

    public C0528c(C0535m c0535m) {
        this.f1833a = c0535m;
    }

    /* renamed from: b */
    private static boolean m2085b(C0104a c0104a) {
        C0530g c0530g = c0104a.f481b;
        return (c0530g == null || !c0530g.f1888l || c0530g.f1866J == null || c0530g.f1859C || c0530g.f1858B || !c0530g.m2131W()) ? false : true;
    }

    /* renamed from: a */
    C0530g m2086a(ArrayList<C0530g> arrayList, C0530g c0530g) {
        C0530g c0530g2 = c0530g;
        int i = 0;
        while (i < this.f1834b.size()) {
            C0104a c0104a = (C0104a) this.f1834b.get(i);
            switch (c0104a.f480a) {
                case 1:
                case 7:
                    arrayList.add(c0104a.f481b);
                    break;
                case 2:
                    C0530g c0530g3 = c0104a.f481b;
                    int i2 = c0530g3.f1902z;
                    C0530g c0530g4 = c0530g2;
                    int i3 = i;
                    Object obj = null;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        C0530g c0530g5 = (C0530g) arrayList.get(size);
                        if (c0530g5.f1902z == i2) {
                            if (c0530g5 == c0530g3) {
                                obj = 1;
                            } else {
                                if (c0530g5 == c0530g4) {
                                    this.f1834b.add(i3, new C0104a(9, c0530g5));
                                    i3++;
                                    c0530g4 = null;
                                }
                                C0104a c0104a2 = new C0104a(3, c0530g5);
                                c0104a2.f482c = c0104a.f482c;
                                c0104a2.f484e = c0104a.f484e;
                                c0104a2.f483d = c0104a.f483d;
                                c0104a2.f485f = c0104a.f485f;
                                this.f1834b.add(i3, c0104a2);
                                arrayList.remove(c0530g5);
                                i3++;
                            }
                        }
                    }
                    if (obj != null) {
                        this.f1834b.remove(i3);
                        i3--;
                    } else {
                        c0104a.f480a = 1;
                        arrayList.add(c0530g3);
                    }
                    i = i3;
                    c0530g2 = c0530g4;
                    break;
                case 3:
                case 6:
                    arrayList.remove(c0104a.f481b);
                    if (c0104a.f481b != c0530g2) {
                        break;
                    }
                    this.f1834b.add(i, new C0104a(9, c0104a.f481b));
                    i++;
                    c0530g2 = null;
                    break;
                case 8:
                    this.f1834b.add(i, new C0104a(9, c0530g2));
                    i++;
                    c0530g2 = c0104a.f481b;
                    break;
                default:
                    break;
            }
            i++;
        }
        return c0530g2;
    }

    /* renamed from: a */
    public void m2087a() {
        if (this.f1853u != null) {
            int size = this.f1853u.size();
            for (int i = 0; i < size; i++) {
                ((Runnable) this.f1853u.get(i)).run();
            }
            this.f1853u = null;
        }
    }

    /* renamed from: a */
    void m2088a(int i) {
        if (this.f1841i) {
            if (C0535m.f1919a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Bump nesting in ");
                stringBuilder.append(this);
                stringBuilder.append(" by ");
                stringBuilder.append(i);
                Log.v("FragmentManager", stringBuilder.toString());
            }
            int size = this.f1834b.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0104a c0104a = (C0104a) this.f1834b.get(i2);
                if (c0104a.f481b != null) {
                    C0530g c0530g = c0104a.f481b;
                    c0530g.f1894r += i;
                    if (C0535m.f1919a) {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Bump nesting of ");
                        stringBuilder2.append(c0104a.f481b);
                        stringBuilder2.append(" to ");
                        stringBuilder2.append(c0104a.f481b.f1894r);
                        Log.v("FragmentManager", stringBuilder2.toString());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    void m2089a(C0104a c0104a) {
        this.f1834b.add(c0104a);
        c0104a.f482c = this.f1835c;
        c0104a.f483d = this.f1836d;
        c0104a.f484e = this.f1837e;
        c0104a.f485f = this.f1838f;
    }

    /* renamed from: a */
    void m2090a(C0110c c0110c) {
        for (int i = 0; i < this.f1834b.size(); i++) {
            C0104a c0104a = (C0104a) this.f1834b.get(i);
            if (C0528c.m2085b(c0104a)) {
                c0104a.f481b.m2149a(c0110c);
            }
        }
    }

    /* renamed from: a */
    public void m2091a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        m2092a(str, printWriter, true);
    }

    /* renamed from: a */
    public void m2092a(String str, PrintWriter printWriter, boolean z) {
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1843k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1845m);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1844l);
            if (this.f1839g != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1839g));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f1840h));
            }
            if (!(this.f1835c == 0 && this.f1836d == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1835c));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1836d));
            }
            if (!(this.f1837e == 0 && this.f1838f == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1837e));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1838f));
            }
            if (!(this.f1846n == 0 && this.f1847o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1846n));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1847o);
            }
            if (!(this.f1848p == 0 && this.f1849q == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1848p));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1849q);
            }
        }
        if (!this.f1834b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("    ");
            stringBuilder.toString();
            int size = this.f1834b.size();
            for (int i = 0; i < size; i++) {
                String str2;
                C0104a c0104a = (C0104a) this.f1834b.get(i);
                switch (c0104a.f480a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    default:
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("cmd=");
                        stringBuilder2.append(c0104a.f480a);
                        str2 = stringBuilder2.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(c0104a.f481b);
                if (z) {
                    if (!(c0104a.f482c == 0 && c0104a.f483d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(c0104a.f482c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(c0104a.f483d));
                    }
                    if (c0104a.f484e != 0 || c0104a.f485f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(c0104a.f484e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(c0104a.f485f));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    void m2093a(boolean z) {
        for (int size = this.f1834b.size() - 1; size >= 0; size--) {
            C0104a c0104a = (C0104a) this.f1834b.get(size);
            C0530g c0530g = c0104a.f481b;
            if (c0530g != null) {
                c0530g.m2138a(C0535m.m2257d(this.f1839g), this.f1840h);
            }
            int i = c0104a.f480a;
            if (i != 1) {
                switch (i) {
                    case 3:
                        c0530g.m2137a(c0104a.f484e);
                        this.f1833a.m2277a(c0530g, false);
                        break;
                    case 4:
                        c0530g.m2137a(c0104a.f484e);
                        this.f1833a.m2321j(c0530g);
                        break;
                    case 5:
                        c0530g.m2137a(c0104a.f485f);
                        this.f1833a.m2319i(c0530g);
                        break;
                    case 6:
                        c0530g.m2137a(c0104a.f484e);
                        this.f1833a.m2325l(c0530g);
                        break;
                    case 7:
                        c0530g.m2137a(c0104a.f485f);
                        this.f1833a.m2323k(c0530g);
                        break;
                    case 8:
                        this.f1833a.m2331o(null);
                        break;
                    case 9:
                        this.f1833a.m2331o(c0530g);
                        break;
                    default:
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unknown cmd: ");
                        stringBuilder.append(c0104a.f480a);
                        throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            c0530g.m2137a(c0104a.f485f);
            this.f1833a.m2316h(c0530g);
            if (!(this.f1852t || c0104a.f480a == 3 || c0530g == null)) {
                this.f1833a.m2306e(c0530g);
            }
        }
        if (!this.f1852t && z) {
            this.f1833a.m2267a(this.f1833a.f1937l, true);
        }
    }

    /* renamed from: a */
    boolean m2094a(ArrayList<C0528c> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f1834b.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            C0104a c0104a = (C0104a) this.f1834b.get(i4);
            int i5 = c0104a.f481b != null ? c0104a.f481b.f1902z : 0;
            if (!(i5 == 0 || i5 == r3)) {
                for (i3 = i; i3 < i2; i3++) {
                    C0528c c0528c = (C0528c) arrayList.get(i3);
                    int size2 = c0528c.f1834b.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        C0104a c0104a2 = (C0104a) c0528c.f1834b.get(i6);
                        if ((c0104a2.f481b != null ? c0104a2.f481b.f1902z : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo38a(ArrayList<C0528c> arrayList, ArrayList<Boolean> arrayList2) {
        if (C0535m.f1919a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Run: ");
            stringBuilder.append(this);
            Log.v("FragmentManager", stringBuilder.toString());
        }
        arrayList.add(this);
        arrayList2.add(Boolean.valueOf(false));
        if (this.f1841i) {
            this.f1833a.m2271a(this);
        }
        return true;
    }

    /* renamed from: b */
    C0530g m2096b(ArrayList<C0530g> arrayList, C0530g c0530g) {
        for (int i = 0; i < this.f1834b.size(); i++) {
            C0104a c0104a = (C0104a) this.f1834b.get(i);
            int i2 = c0104a.f480a;
            if (i2 != 1) {
                if (i2 != 3) {
                    switch (i2) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            c0530g = null;
                            break;
                        case 9:
                            c0530g = c0104a.f481b;
                            break;
                        default:
                            break;
                    }
                }
                arrayList.add(c0104a.f481b);
            }
            arrayList.remove(c0104a.f481b);
        }
        return c0530g;
    }

    /* renamed from: b */
    void m2097b() {
        int size = this.f1834b.size();
        for (int i = 0; i < size; i++) {
            C0104a c0104a = (C0104a) this.f1834b.get(i);
            C0530g c0530g = c0104a.f481b;
            if (c0530g != null) {
                c0530g.m2138a(this.f1839g, this.f1840h);
            }
            int i2 = c0104a.f480a;
            if (i2 != 1) {
                switch (i2) {
                    case 3:
                        c0530g.m2137a(c0104a.f483d);
                        this.f1833a.m2316h(c0530g);
                        break;
                    case 4:
                        c0530g.m2137a(c0104a.f483d);
                        this.f1833a.m2319i(c0530g);
                        break;
                    case 5:
                        c0530g.m2137a(c0104a.f482c);
                        this.f1833a.m2321j(c0530g);
                        break;
                    case 6:
                        c0530g.m2137a(c0104a.f483d);
                        this.f1833a.m2323k(c0530g);
                        break;
                    case 7:
                        c0530g.m2137a(c0104a.f482c);
                        this.f1833a.m2325l(c0530g);
                        break;
                    case 8:
                        this.f1833a.m2331o(c0530g);
                        break;
                    case 9:
                        this.f1833a.m2331o(null);
                        break;
                    default:
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unknown cmd: ");
                        stringBuilder.append(c0104a.f480a);
                        throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            c0530g.m2137a(c0104a.f482c);
            this.f1833a.m2277a(c0530g, false);
            if (!(this.f1852t || c0104a.f480a == 1 || c0530g == null)) {
                this.f1833a.m2306e(c0530g);
            }
        }
        if (!this.f1852t) {
            this.f1833a.m2267a(this.f1833a.f1937l, true);
        }
    }

    /* renamed from: b */
    boolean m2098b(int i) {
        int size = this.f1834b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0104a c0104a = (C0104a) this.f1834b.get(i2);
            int i3 = c0104a.f481b != null ? c0104a.f481b.f1902z : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    boolean m2099c() {
        for (int i = 0; i < this.f1834b.size(); i++) {
            if (C0528c.m2085b((C0104a) this.f1834b.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public String m2100d() {
        return this.f1843k;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("BackStackEntry{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1845m >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.f1845m);
        }
        if (this.f1843k != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.f1843k);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
