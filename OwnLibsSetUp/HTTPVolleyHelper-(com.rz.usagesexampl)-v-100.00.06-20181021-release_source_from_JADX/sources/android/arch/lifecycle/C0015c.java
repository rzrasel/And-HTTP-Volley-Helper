package android.arch.lifecycle;

/* renamed from: android.arch.lifecycle.c */
public abstract class C0015c {

    /* renamed from: android.arch.lifecycle.c$a */
    public enum C0013a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    /* renamed from: android.arch.lifecycle.c$b */
    public enum C0014b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: a */
        public boolean m38a(C0014b c0014b) {
            return compareTo(c0014b) >= 0;
        }
    }

    /* renamed from: a */
    public abstract C0014b mo8a();

    /* renamed from: a */
    public abstract void mo9a(C0016d c0016d);

    /* renamed from: b */
    public abstract void mo10b(C0016d c0016d);
}
