package android.support.v7.p021b.p022a;

import java.lang.reflect.Array;

/* renamed from: android.support.v7.b.a.c */
final class C0304c {
    /* renamed from: a */
    static final /* synthetic */ boolean f1023a = (C0304c.class.desiredAssertionStatus() ^ 1);

    private C0304c() {
    }

    /* renamed from: a */
    public static int m1135a(int i) {
        return i <= 4 ? 8 : i * 2;
    }

    /* renamed from: a */
    public static int[] m1136a(int[] iArr, int i, int i2) {
        if (!f1023a) {
            if (i > iArr.length) {
                throw new AssertionError();
            }
        }
        if (i + 1 > iArr.length) {
            Object obj = new int[C0304c.m1135a(i)];
            System.arraycopy(iArr, 0, obj, 0, i);
            iArr = obj;
        }
        iArr[i] = i2;
        return iArr;
    }

    /* renamed from: a */
    public static <T> T[] m1137a(T[] tArr, int i, T t) {
        if (!f1023a) {
            if (i > tArr.length) {
                throw new AssertionError();
            }
        }
        if (i + 1 > tArr.length) {
            T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), C0304c.m1135a(i));
            System.arraycopy(tArr, 0, tArr2, 0, i);
            tArr = tArr2;
        }
        tArr[i] = t;
        return tArr;
    }
}
