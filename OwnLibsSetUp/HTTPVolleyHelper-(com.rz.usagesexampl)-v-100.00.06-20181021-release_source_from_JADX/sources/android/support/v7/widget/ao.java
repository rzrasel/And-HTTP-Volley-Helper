package android.support.v7.widget;

class ao {
    /* renamed from: a */
    private int f1297a = 0;
    /* renamed from: b */
    private int f1298b = 0;
    /* renamed from: c */
    private int f1299c = Integer.MIN_VALUE;
    /* renamed from: d */
    private int f1300d = Integer.MIN_VALUE;
    /* renamed from: e */
    private int f1301e = 0;
    /* renamed from: f */
    private int f1302f = 0;
    /* renamed from: g */
    private boolean f1303g = false;
    /* renamed from: h */
    private boolean f1304h = false;

    ao() {
    }

    /* renamed from: a */
    public int m1450a() {
        return this.f1297a;
    }

    /* renamed from: a */
    public void m1451a(int i, int i2) {
        this.f1299c = i;
        this.f1300d = i2;
        this.f1304h = true;
        if (this.f1303g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1297a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1298b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1297a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1298b = i2;
        }
    }

    /* renamed from: a */
    public void m1452a(boolean z) {
        if (z != this.f1303g) {
            int i;
            this.f1303g = z;
            if (!this.f1304h) {
                this.f1297a = this.f1301e;
            } else if (z) {
                this.f1297a = this.f1300d != Integer.MIN_VALUE ? this.f1300d : this.f1301e;
                if (this.f1299c != Integer.MIN_VALUE) {
                    i = this.f1299c;
                    this.f1298b = i;
                }
            } else {
                this.f1297a = this.f1299c != Integer.MIN_VALUE ? this.f1299c : this.f1301e;
                if (this.f1300d != Integer.MIN_VALUE) {
                    i = this.f1300d;
                    this.f1298b = i;
                }
            }
            i = this.f1302f;
            this.f1298b = i;
        }
    }

    /* renamed from: b */
    public int m1453b() {
        return this.f1298b;
    }

    /* renamed from: b */
    public void m1454b(int i, int i2) {
        this.f1304h = false;
        if (i != Integer.MIN_VALUE) {
            this.f1301e = i;
            this.f1297a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1302f = i2;
            this.f1298b = i2;
        }
    }

    /* renamed from: c */
    public int m1455c() {
        return this.f1303g ? this.f1298b : this.f1297a;
    }

    /* renamed from: d */
    public int m1456d() {
        return this.f1303g ? this.f1297a : this.f1298b;
    }
}
