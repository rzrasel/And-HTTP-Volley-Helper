package android.support.constraint.p006a;

/* renamed from: android.support.constraint.a.g */
final class C0075g {

    /* renamed from: android.support.constraint.a.g$a */
    interface C0074a<T> {
        /* renamed from: a */
        T mo31a();

        /* renamed from: a */
        void mo32a(T[] tArr, int i);

        /* renamed from: a */
        boolean mo33a(T t);
    }

    /* renamed from: android.support.constraint.a.g$b */
    static class C0519b<T> implements C0074a<T> {
        /* renamed from: a */
        private final Object[] f1815a;
        /* renamed from: b */
        private int f1816b;

        C0519b(int i) {
            if (i > 0) {
                this.f1815a = new Object[i];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        /* renamed from: a */
        public T mo31a() {
            if (this.f1816b <= 0) {
                return null;
            }
            int i = this.f1816b - 1;
            T t = this.f1815a[i];
            this.f1815a[i] = null;
            this.f1816b--;
            return t;
        }

        /* renamed from: a */
        public void mo32a(T[] tArr, int i) {
            if (i > tArr.length) {
                i = tArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                T t = tArr[i2];
                if (this.f1816b < this.f1815a.length) {
                    this.f1815a[this.f1816b] = t;
                    this.f1816b++;
                }
            }
        }

        /* renamed from: a */
        public boolean mo33a(T t) {
            if (this.f1816b >= this.f1815a.length) {
                return false;
            }
            this.f1815a[this.f1816b] = t;
            this.f1816b++;
            return true;
        }
    }
}
