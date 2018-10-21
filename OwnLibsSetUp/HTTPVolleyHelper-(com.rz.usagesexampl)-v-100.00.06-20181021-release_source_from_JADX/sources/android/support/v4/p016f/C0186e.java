package android.support.v4.p016f;

import android.util.Log;
import java.io.Writer;

/* renamed from: android.support.v4.f.e */
public class C0186e extends Writer {
    /* renamed from: a */
    private final String f703a;
    /* renamed from: b */
    private StringBuilder f704b = new StringBuilder(128);

    public C0186e(String str) {
        this.f703a = str;
    }

    /* renamed from: a */
    private void m672a() {
        if (this.f704b.length() > 0) {
            Log.d(this.f703a, this.f704b.toString());
            this.f704b.delete(0, this.f704b.length());
        }
    }

    public void close() {
        m672a();
    }

    public void flush() {
        m672a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m672a();
            } else {
                this.f704b.append(c);
            }
        }
    }
}
