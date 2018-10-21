package com.p028b.p029a.p036d;

import android.support.v7.p020a.C0270a.C0269j;
import com.p028b.p029a.p031b.C0461f;
import com.p028b.p029a.p031b.p032a.C0659e;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;

/* renamed from: com.b.a.d.a */
public class C0477a implements Closeable {
    /* renamed from: b */
    private static final char[] f1660b = ")]}'\n".toCharArray();
    /* renamed from: a */
    int f1661a = 0;
    /* renamed from: c */
    private final Reader f1662c;
    /* renamed from: d */
    private boolean f1663d = false;
    /* renamed from: e */
    private final char[] f1664e = new char[1024];
    /* renamed from: f */
    private int f1665f = 0;
    /* renamed from: g */
    private int f1666g = 0;
    /* renamed from: h */
    private int f1667h = 0;
    /* renamed from: i */
    private int f1668i = 0;
    /* renamed from: j */
    private long f1669j;
    /* renamed from: k */
    private int f1670k;
    /* renamed from: l */
    private String f1671l;
    /* renamed from: m */
    private int[] f1672m = new int[32];
    /* renamed from: n */
    private int f1673n = 0;
    /* renamed from: o */
    private String[] f1674o;
    /* renamed from: p */
    private int[] f1675p;

    /* renamed from: com.b.a.d.a$1 */
    static class C07061 extends C0461f {
        C07061() {
        }

        /* renamed from: a */
        public void mo401a(C0477a c0477a) {
            if (c0477a instanceof C0659e) {
                ((C0659e) c0477a).mo378o();
                return;
            }
            int i = c0477a.f1661a;
            if (i == 0) {
                i = c0477a.m1857r();
            }
            if (i == 13) {
                i = 9;
            } else if (i == 12) {
                i = 8;
            } else if (i == 14) {
                i = 10;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Expected a name but was ");
                stringBuilder.append(c0477a.mo369f());
                stringBuilder.append(c0477a.m1858s());
                throw new IllegalStateException(stringBuilder.toString());
            }
            c0477a.f1661a = i;
        }
    }

    static {
        C0461f.f1629a = new C07061();
    }

    public C0477a(Reader reader) {
        int[] iArr = this.f1672m;
        int i = this.f1673n;
        this.f1673n = i + 1;
        iArr[i] = 6;
        this.f1674o = new String[32];
        this.f1675p = new int[32];
        if (reader != null) {
            this.f1662c = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    /* renamed from: a */
    private void m1824a(int i) {
        if (this.f1673n == this.f1672m.length) {
            Object obj = new int[(this.f1673n * 2)];
            Object obj2 = new int[(this.f1673n * 2)];
            Object obj3 = new String[(this.f1673n * 2)];
            System.arraycopy(this.f1672m, 0, obj, 0, this.f1673n);
            System.arraycopy(this.f1675p, 0, obj2, 0, this.f1673n);
            System.arraycopy(this.f1674o, 0, obj3, 0, this.f1673n);
            this.f1672m = obj;
            this.f1675p = obj2;
            this.f1674o = obj3;
        }
        int[] iArr = this.f1672m;
        int i2 = this.f1673n;
        this.f1673n = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: a */
    private boolean m1825a(char c) {
        switch (c) {
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case ' ':
            case ',':
            case ':':
            case C0269j.AppCompatTheme_selectableItemBackgroundBorderless /*91*/:
            case C0269j.AppCompatTheme_spinnerStyle /*93*/:
            case '{':
            case '}':
                break;
            case '#':
            case '/':
            case ';':
            case '=':
            case C0269j.AppCompatTheme_spinnerDropDownItemStyle /*92*/:
                m1836w();
                break;
            default:
                return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m1826a(String str) {
        int length = str.length();
        while (true) {
            int i = 0;
            if (this.f1665f + length > this.f1666g) {
                if (!m1830b(length)) {
                    return false;
                }
            }
            if (this.f1664e[this.f1665f] == '\n') {
                this.f1667h++;
                this.f1668i = this.f1665f + 1;
            } else {
                while (i < length) {
                    if (this.f1664e[this.f1665f + i] == str.charAt(i)) {
                        i++;
                    }
                }
                return true;
            }
            this.f1665f++;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private int m1827b(boolean r8) {
        /*
        r7 = this;
        r0 = r7.f1664e;
    L_0x0002:
        r1 = r7.f1665f;
    L_0x0004:
        r2 = r7.f1666g;
    L_0x0006:
        r3 = 1;
        if (r1 != r2) goto L_0x0034;
    L_0x0009:
        r7.f1665f = r1;
        r1 = r7.m1830b(r3);
        if (r1 != 0) goto L_0x0030;
    L_0x0011:
        if (r8 != 0) goto L_0x0015;
    L_0x0013:
        r8 = -1;
        return r8;
    L_0x0015:
        r8 = new java.io.EOFException;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "End of input";
        r0.append(r1);
        r1 = r7.m1858s();
        r0.append(r1);
        r0 = r0.toString();
        r8.<init>(r0);
        throw r8;
    L_0x0030:
        r1 = r7.f1665f;
        r2 = r7.f1666g;
    L_0x0034:
        r4 = r1 + 1;
        r1 = r0[r1];
        r5 = 10;
        if (r1 != r5) goto L_0x0044;
    L_0x003c:
        r1 = r7.f1667h;
        r1 = r1 + r3;
        r7.f1667h = r1;
        r7.f1668i = r4;
        goto L_0x00a8;
    L_0x0044:
        r5 = 32;
        if (r1 == r5) goto L_0x00a8;
    L_0x0048:
        r5 = 13;
        if (r1 == r5) goto L_0x00a8;
    L_0x004c:
        r5 = 9;
        if (r1 != r5) goto L_0x0051;
    L_0x0050:
        goto L_0x00a8;
    L_0x0051:
        r5 = 47;
        if (r1 != r5) goto L_0x009b;
    L_0x0055:
        r7.f1665f = r4;
        r6 = 2;
        if (r4 != r2) goto L_0x006b;
    L_0x005a:
        r2 = r7.f1665f;
        r2 = r2 - r3;
        r7.f1665f = r2;
        r2 = r7.m1830b(r6);
        r4 = r7.f1665f;
        r4 = r4 + r3;
        r7.f1665f = r4;
        if (r2 != 0) goto L_0x006b;
    L_0x006a:
        return r1;
    L_0x006b:
        r7.m1836w();
        r2 = r7.f1665f;
        r2 = r0[r2];
        r4 = 42;
        if (r2 == r4) goto L_0x0082;
    L_0x0076:
        if (r2 == r5) goto L_0x0079;
    L_0x0078:
        return r1;
    L_0x0079:
        r1 = r7.f1665f;
        r1 = r1 + r3;
        r7.f1665f = r1;
    L_0x007e:
        r7.m1837x();
        goto L_0x0002;
    L_0x0082:
        r1 = r7.f1665f;
        r1 = r1 + r3;
        r7.f1665f = r1;
        r1 = "*/";
        r1 = r7.m1826a(r1);
        if (r1 == 0) goto L_0x0094;
    L_0x008f:
        r1 = r7.f1665f;
        r1 = r1 + r6;
        goto L_0x0004;
    L_0x0094:
        r8 = "Unterminated comment";
        r8 = r7.m1828b(r8);
        throw r8;
    L_0x009b:
        r2 = 35;
        if (r1 != r2) goto L_0x00a5;
    L_0x009f:
        r7.f1665f = r4;
        r7.m1836w();
        goto L_0x007e;
    L_0x00a5:
        r7.f1665f = r4;
        return r1;
    L_0x00a8:
        r1 = r4;
        goto L_0x0006;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.b.a.d.a.b(boolean):int");
    }

    /* renamed from: b */
    private IOException m1828b(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(m1858s());
        throw new C0480d(stringBuilder.toString());
    }

    /* renamed from: b */
    private String m1829b(char c) {
        int i;
        int i2;
        char[] cArr = this.f1664e;
        StringBuilder stringBuilder = null;
        loop0:
        while (true) {
            int i3 = this.f1665f;
            int i4 = this.f1666g;
            i = i3;
            while (i3 < i4) {
                i2 = i3 + 1;
                char c2 = cArr[i3];
                if (c2 == c) {
                    break loop0;
                } else if (c2 == '\\') {
                    this.f1665f = i2;
                    i2 = (i2 - i) - 1;
                    if (stringBuilder == null) {
                        stringBuilder = new StringBuilder(Math.max((i2 + 1) * 2, 16));
                    }
                    stringBuilder.append(cArr, i, i2);
                    stringBuilder.append(m1838y());
                } else {
                    if (c2 == '\n') {
                        this.f1667h++;
                        this.f1668i = i2;
                    }
                    i3 = i2;
                }
            }
            if (stringBuilder == null) {
                stringBuilder = new StringBuilder(Math.max((i3 - i) * 2, 16));
            }
            stringBuilder.append(cArr, i, i3 - i);
            this.f1665f = i3;
            if (!m1830b(1)) {
                throw m1828b("Unterminated string");
            }
        }
        this.f1665f = i2;
        i2 = (i2 - i) - 1;
        if (stringBuilder == null) {
            return new String(cArr, i, i2);
        }
        stringBuilder.append(cArr, i, i2);
        return stringBuilder.toString();
    }

    /* renamed from: b */
    private boolean m1830b(int i) {
        Object obj = this.f1664e;
        this.f1668i -= this.f1665f;
        if (this.f1666g != this.f1665f) {
            this.f1666g -= this.f1665f;
            System.arraycopy(obj, this.f1665f, obj, 0, this.f1666g);
        } else {
            this.f1666g = 0;
        }
        this.f1665f = 0;
        do {
            int read = this.f1662c.read(obj, this.f1666g, obj.length - this.f1666g);
            if (read == -1) {
                return false;
            }
            this.f1666g += read;
            if (this.f1667h == 0 && this.f1668i == 0 && this.f1666g > 0 && obj[0] == '﻿') {
                this.f1665f++;
                this.f1668i++;
                i++;
            }
        } while (this.f1666g < i);
        return true;
    }

    /* renamed from: c */
    private void m1831c(char c) {
        char[] cArr = this.f1664e;
        while (true) {
            int i = this.f1665f;
            int i2 = this.f1666g;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.f1665f = i3;
                    return;
                } else if (c2 == '\\') {
                    this.f1665f = i3;
                    m1838y();
                    break;
                } else {
                    if (c2 == '\n') {
                        this.f1667h++;
                        this.f1668i = i3;
                    }
                    i = i3;
                }
            }
            this.f1665f = i;
            if (!m1830b(1)) {
                throw m1828b("Unterminated string");
            }
        }
    }

    /* renamed from: o */
    private int mo378o() {
        String str;
        String str2;
        int i;
        int length;
        int i2;
        char c;
        char c2 = this.f1664e[this.f1665f];
        if (c2 != 't') {
            if (c2 != 'T') {
                if (c2 != 'f') {
                    if (c2 != 'F') {
                        if (c2 != 'n') {
                            if (c2 != 'N') {
                                return 0;
                            }
                        }
                        str = "null";
                        str2 = "NULL";
                        i = 7;
                        length = str.length();
                        i2 = 1;
                        while (i2 < length) {
                            if (this.f1665f + i2 < this.f1666g && !m1830b(i2 + 1)) {
                                return 0;
                            }
                            c = this.f1664e[this.f1665f + i2];
                            if (c != str.charAt(i2) && c != r2.charAt(i2)) {
                                return 0;
                            }
                            i2++;
                        }
                        if ((this.f1665f + length >= this.f1666g || m1830b(length + 1)) && m1825a(this.f1664e[this.f1665f + length])) {
                            return 0;
                        }
                        this.f1665f += length;
                        this.f1661a = i;
                        return i;
                    }
                }
                str = "false";
                str2 = "FALSE";
                i = 6;
                length = str.length();
                i2 = 1;
                while (i2 < length) {
                    if (this.f1665f + i2 < this.f1666g) {
                    }
                    c = this.f1664e[this.f1665f + i2];
                    if (c != str.charAt(i2)) {
                    }
                    i2++;
                }
                if (this.f1665f + length >= this.f1666g) {
                }
                return 0;
            }
        }
        str = "true";
        str2 = "TRUE";
        i = 5;
        length = str.length();
        i2 = 1;
        while (i2 < length) {
            if (this.f1665f + i2 < this.f1666g) {
            }
            c = this.f1664e[this.f1665f + i2];
            if (c != str.charAt(i2)) {
            }
            i2++;
        }
        if (this.f1665f + length >= this.f1666g) {
        }
        return 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: t */
    private int m1833t() {
        /*
        r18 = this;
        r0 = r18;
        r1 = r0.f1664e;
        r2 = r0.f1665f;
        r3 = r0.f1666g;
        r6 = 1;
        r7 = 0;
        r8 = r3;
        r3 = 0;
        r9 = 0;
        r10 = 1;
        r11 = 0;
        r13 = 0;
    L_0x0011:
        r14 = r2 + r3;
        r15 = 2;
        if (r14 != r8) goto L_0x0028;
    L_0x0016:
        r2 = r1.length;
        if (r3 != r2) goto L_0x001a;
    L_0x0019:
        return r7;
    L_0x001a:
        r2 = r3 + 1;
        r2 = r0.m1830b(r2);
        if (r2 != 0) goto L_0x0024;
    L_0x0022:
        goto L_0x0097;
    L_0x0024:
        r2 = r0.f1665f;
        r8 = r0.f1666g;
    L_0x0028:
        r14 = r2 + r3;
        r14 = r1[r14];
        r7 = 43;
        r4 = 3;
        r5 = 5;
        if (r14 == r7) goto L_0x00ee;
    L_0x0032:
        r7 = 69;
        if (r14 == r7) goto L_0x00e2;
    L_0x0036:
        r7 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        if (r14 == r7) goto L_0x00e2;
    L_0x003a:
        switch(r14) {
            case 45: goto L_0x00d5;
            case 46: goto L_0x00cd;
            default: goto L_0x003d;
        };
    L_0x003d:
        r7 = 48;
        if (r14 < r7) goto L_0x0091;
    L_0x0041:
        r7 = 57;
        if (r14 <= r7) goto L_0x0046;
    L_0x0045:
        goto L_0x0091;
    L_0x0046:
        if (r9 == r6) goto L_0x0086;
    L_0x0048:
        if (r9 != 0) goto L_0x004b;
    L_0x004a:
        goto L_0x0086;
    L_0x004b:
        if (r9 != r15) goto L_0x0076;
    L_0x004d:
        r16 = 0;
        r4 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1));
        if (r4 != 0) goto L_0x0055;
    L_0x0053:
        r4 = 0;
        return r4;
    L_0x0055:
        r4 = 10;
        r4 = r4 * r11;
        r14 = r14 + -48;
        r14 = (long) r14;
        r4 = r4 - r14;
        r14 = -922337203685477580; // 0xf333333333333334 float:4.1723254E-8 double:-8.390303882365713E246;
        r7 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1));
        if (r7 > 0) goto L_0x0071;
    L_0x0066:
        r7 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1));
        if (r7 != 0) goto L_0x006f;
    L_0x006a:
        r7 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1));
        if (r7 >= 0) goto L_0x006f;
    L_0x006e:
        goto L_0x0071;
    L_0x006f:
        r7 = 0;
        goto L_0x0072;
    L_0x0071:
        r7 = 1;
    L_0x0072:
        r7 = r7 & r10;
        r11 = r4;
        r10 = r7;
        goto L_0x0081;
    L_0x0076:
        if (r9 != r4) goto L_0x007b;
    L_0x0078:
        r7 = 0;
        r9 = 4;
        goto L_0x008d;
    L_0x007b:
        if (r9 == r5) goto L_0x0083;
    L_0x007d:
        r4 = 6;
        if (r9 != r4) goto L_0x0081;
    L_0x0080:
        goto L_0x0083;
    L_0x0081:
        r7 = 0;
        goto L_0x008d;
    L_0x0083:
        r7 = 0;
        r9 = 7;
        goto L_0x008d;
    L_0x0086:
        r14 = r14 + -48;
        r4 = -r14;
        r4 = (long) r4;
        r11 = r4;
        r7 = 0;
        r9 = 2;
    L_0x008d:
        r16 = 0;
        goto L_0x00f5;
    L_0x0091:
        r1 = r0.m1825a(r14);
        if (r1 != 0) goto L_0x00cb;
    L_0x0097:
        if (r9 != r15) goto L_0x00bb;
    L_0x0099:
        if (r10 == 0) goto L_0x00bb;
    L_0x009b:
        r1 = -9223372036854775808;
        r4 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1));
        if (r4 != 0) goto L_0x00a3;
    L_0x00a1:
        if (r13 == 0) goto L_0x00bb;
    L_0x00a3:
        r16 = 0;
        r1 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1));
        if (r1 != 0) goto L_0x00ab;
    L_0x00a9:
        if (r13 != 0) goto L_0x00bb;
    L_0x00ab:
        if (r13 == 0) goto L_0x00ae;
    L_0x00ad:
        goto L_0x00af;
    L_0x00ae:
        r11 = -r11;
    L_0x00af:
        r0.f1669j = r11;
        r1 = r0.f1665f;
        r1 = r1 + r3;
        r0.f1665f = r1;
        r1 = 15;
    L_0x00b8:
        r0.f1661a = r1;
        return r1;
    L_0x00bb:
        if (r9 == r15) goto L_0x00c6;
    L_0x00bd:
        r1 = 4;
        if (r9 == r1) goto L_0x00c6;
    L_0x00c0:
        r1 = 7;
        if (r9 != r1) goto L_0x00c4;
    L_0x00c3:
        goto L_0x00c6;
    L_0x00c4:
        r7 = 0;
        return r7;
    L_0x00c6:
        r0.f1670k = r3;
        r1 = 16;
        goto L_0x00b8;
    L_0x00cb:
        r7 = 0;
        return r7;
    L_0x00cd:
        r7 = 0;
        r16 = 0;
        if (r9 != r15) goto L_0x00d4;
    L_0x00d2:
        r9 = 3;
        goto L_0x00f5;
    L_0x00d4:
        return r7;
    L_0x00d5:
        r4 = 6;
        r7 = 0;
        r16 = 0;
        if (r9 != 0) goto L_0x00de;
    L_0x00db:
        r9 = 1;
        r13 = 1;
        goto L_0x00f5;
    L_0x00de:
        if (r9 != r5) goto L_0x00e1;
    L_0x00e0:
        goto L_0x00f4;
    L_0x00e1:
        return r7;
    L_0x00e2:
        r7 = 0;
        r16 = 0;
        if (r9 == r15) goto L_0x00ec;
    L_0x00e7:
        r4 = 4;
        if (r9 != r4) goto L_0x00eb;
    L_0x00ea:
        goto L_0x00ec;
    L_0x00eb:
        return r7;
    L_0x00ec:
        r9 = 5;
        goto L_0x00f5;
    L_0x00ee:
        r4 = 6;
        r7 = 0;
        r16 = 0;
        if (r9 != r5) goto L_0x00f9;
    L_0x00f4:
        r9 = 6;
    L_0x00f5:
        r3 = r3 + 1;
        goto L_0x0011;
    L_0x00f9:
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.b.a.d.a.t():int");
    }

    /* renamed from: u */
    private String m1834u() {
        String str;
        int i = 0;
        StringBuilder stringBuilder = null;
        do {
            int i2 = 0;
            while (true) {
                if (this.f1665f + i2 < this.f1666g) {
                    switch (this.f1664e[this.f1665f + i2]) {
                        case '\t':
                        case '\n':
                        case '\f':
                        case '\r':
                        case ' ':
                        case ',':
                        case ':':
                        case C0269j.AppCompatTheme_selectableItemBackgroundBorderless /*91*/:
                        case C0269j.AppCompatTheme_spinnerStyle /*93*/:
                        case '{':
                        case '}':
                            break;
                        case '#':
                        case '/':
                        case ';':
                        case '=':
                        case C0269j.AppCompatTheme_spinnerDropDownItemStyle /*92*/:
                            m1836w();
                            break;
                        default:
                            i2++;
                            break;
                    }
                } else if (i2 >= this.f1664e.length) {
                    if (stringBuilder == null) {
                        stringBuilder = new StringBuilder(Math.max(i2, 16));
                    }
                    stringBuilder.append(this.f1664e, this.f1665f, i2);
                    this.f1665f += i2;
                } else if (m1830b(i2 + 1)) {
                }
                i = i2;
                if (stringBuilder != null) {
                    str = new String(this.f1664e, this.f1665f, i);
                } else {
                    stringBuilder.append(this.f1664e, this.f1665f, i);
                    str = stringBuilder.toString();
                }
                this.f1665f += i;
                return str;
            }
        } while (m1830b(1));
        if (stringBuilder != null) {
            stringBuilder.append(this.f1664e, this.f1665f, i);
            str = stringBuilder.toString();
        } else {
            str = new String(this.f1664e, this.f1665f, i);
        }
        this.f1665f += i;
        return str;
    }

    /* renamed from: v */
    private void m1835v() {
        do {
            int i = 0;
            while (this.f1665f + i < this.f1666g) {
                switch (this.f1664e[this.f1665f + i]) {
                    case '\t':
                    case '\n':
                    case '\f':
                    case '\r':
                    case ' ':
                    case ',':
                    case ':':
                    case C0269j.AppCompatTheme_selectableItemBackgroundBorderless /*91*/:
                    case C0269j.AppCompatTheme_spinnerStyle /*93*/:
                    case '{':
                    case '}':
                        break;
                    case '#':
                    case '/':
                    case ';':
                    case '=':
                    case C0269j.AppCompatTheme_spinnerDropDownItemStyle /*92*/:
                        m1836w();
                        break;
                    default:
                        i++;
                }
                this.f1665f += i;
                return;
            }
            this.f1665f += i;
        } while (m1830b(1));
    }

    /* renamed from: w */
    private void m1836w() {
        if (!this.f1663d) {
            throw m1828b("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: x */
    private void m1837x() {
        char c;
        do {
            if (this.f1665f < this.f1666g || m1830b(1)) {
                char[] cArr = this.f1664e;
                int i = this.f1665f;
                this.f1665f = i + 1;
                c = cArr[i];
                if (c == '\n') {
                    this.f1667h++;
                    this.f1668i = this.f1665f;
                    return;
                }
            } else {
                return;
            }
        } while (c != '\r');
    }

    /* renamed from: y */
    private char m1838y() {
        if (this.f1665f == this.f1666g) {
            if (!m1830b(1)) {
                throw m1828b("Unterminated escape sequence");
            }
        }
        char[] cArr = this.f1664e;
        int i = this.f1665f;
        this.f1665f = i + 1;
        char c = cArr[i];
        if (c == '\n') {
            this.f1667h++;
            this.f1668i = this.f1665f;
        } else if (!(c == '\"' || c == '\'' || c == '/' || c == '\\')) {
            if (c == 'b') {
                return '\b';
            }
            if (c == 'f') {
                return '\f';
            }
            if (c == 'n') {
                return '\n';
            }
            if (c == 'r') {
                return '\r';
            }
            switch (c) {
                case C0269j.AppCompatTheme_windowFixedWidthMinor /*116*/:
                    return '\t';
                case C0269j.AppCompatTheme_windowMinWidthMajor /*117*/:
                    if (this.f1665f + 4 > this.f1666g) {
                        if (!m1830b(4)) {
                            throw m1828b("Unterminated escape sequence");
                        }
                    }
                    c = '\u0000';
                    int i2 = this.f1665f;
                    int i3 = i2 + 4;
                    while (i2 < i3) {
                        int i4;
                        char c2 = this.f1664e[i2];
                        c = (char) (c << 4);
                        if (c2 < '0' || c2 > '9') {
                            if (c2 >= 'a' && c2 <= 'f') {
                                i4 = c2 - 97;
                            } else if (c2 < 'A' || c2 > 'F') {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("\\u");
                                stringBuilder.append(new String(this.f1664e, this.f1665f, 4));
                                throw new NumberFormatException(stringBuilder.toString());
                            } else {
                                i4 = c2 - 65;
                            }
                            i4 += 10;
                        } else {
                            i4 = c2 - 48;
                        }
                        c = (char) (c + i4);
                        i2++;
                    }
                    this.f1665f += 4;
                    return c;
                default:
                    throw m1828b("Invalid escape sequence");
            }
        }
        return c;
    }

    /* renamed from: z */
    private void m1839z() {
        m1827b(true);
        this.f1665f--;
        if (this.f1665f + f1660b.length <= this.f1666g || m1830b(f1660b.length)) {
            int i = 0;
            while (i < f1660b.length) {
                if (this.f1664e[this.f1665f + i] == f1660b[i]) {
                    i++;
                } else {
                    return;
                }
            }
            this.f1665f += f1660b.length;
        }
    }

    /* renamed from: a */
    public void mo363a() {
        int i = this.f1661a;
        if (i == 0) {
            i = m1857r();
        }
        if (i == 3) {
            m1824a(1);
            this.f1675p[this.f1673n - 1] = 0;
            this.f1661a = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected BEGIN_ARRAY but was ");
        stringBuilder.append(mo369f());
        stringBuilder.append(m1858s());
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: a */
    public final void m1841a(boolean z) {
        this.f1663d = z;
    }

    /* renamed from: b */
    public void mo364b() {
        int i = this.f1661a;
        if (i == 0) {
            i = m1857r();
        }
        if (i == 4) {
            this.f1673n--;
            int[] iArr = this.f1675p;
            int i2 = this.f1673n - 1;
            iArr[i2] = iArr[i2] + 1;
            this.f1661a = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected END_ARRAY but was ");
        stringBuilder.append(mo369f());
        stringBuilder.append(m1858s());
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: c */
    public void mo365c() {
        int i = this.f1661a;
        if (i == 0) {
            i = m1857r();
        }
        if (i == 1) {
            m1824a(3);
            this.f1661a = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected BEGIN_OBJECT but was ");
        stringBuilder.append(mo369f());
        stringBuilder.append(m1858s());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void close() {
        this.f1661a = 0;
        this.f1672m[0] = 8;
        this.f1673n = 1;
        this.f1662c.close();
    }

    /* renamed from: d */
    public void mo367d() {
        int i = this.f1661a;
        if (i == 0) {
            i = m1857r();
        }
        if (i == 2) {
            this.f1673n--;
            this.f1674o[this.f1673n] = null;
            int[] iArr = this.f1675p;
            int i2 = this.f1673n - 1;
            iArr[i2] = iArr[i2] + 1;
            this.f1661a = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected END_OBJECT but was ");
        stringBuilder.append(mo369f());
        stringBuilder.append(m1858s());
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: e */
    public boolean mo368e() {
        int i = this.f1661a;
        if (i == 0) {
            i = m1857r();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    /* renamed from: f */
    public C0478b mo369f() {
        int i = this.f1661a;
        if (i == 0) {
            i = m1857r();
        }
        switch (i) {
            case 1:
                return C0478b.BEGIN_OBJECT;
            case 2:
                return C0478b.END_OBJECT;
            case 3:
                return C0478b.BEGIN_ARRAY;
            case 4:
                return C0478b.END_ARRAY;
            case 5:
            case 6:
                return C0478b.BOOLEAN;
            case 7:
                return C0478b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return C0478b.STRING;
            case 12:
            case 13:
            case 14:
                return C0478b.NAME;
            case 15:
            case 16:
                return C0478b.NUMBER;
            case 17:
                return C0478b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: g */
    public String mo370g() {
        String u;
        int i = this.f1661a;
        if (i == 0) {
            i = m1857r();
        }
        if (i == 14) {
            u = m1834u();
        } else {
            char c;
            if (i == 12) {
                c = '\'';
            } else if (i == 13) {
                c = '\"';
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Expected a name but was ");
                stringBuilder.append(mo369f());
                stringBuilder.append(m1858s());
                throw new IllegalStateException(stringBuilder.toString());
            }
            u = m1829b(c);
        }
        this.f1661a = 0;
        this.f1674o[this.f1673n - 1] = u;
        return u;
    }

    /* renamed from: h */
    public String mo371h() {
        String u;
        int i = this.f1661a;
        if (i == 0) {
            i = m1857r();
        }
        if (i == 10) {
            u = m1834u();
        } else {
            char c;
            if (i == 8) {
                c = '\'';
            } else if (i == 9) {
                c = '\"';
            } else if (i == 11) {
                u = this.f1671l;
                this.f1671l = null;
            } else if (i == 15) {
                u = Long.toString(this.f1669j);
            } else if (i == 16) {
                u = new String(this.f1664e, this.f1665f, this.f1670k);
                this.f1665f += this.f1670k;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Expected a string but was ");
                stringBuilder.append(mo369f());
                stringBuilder.append(m1858s());
                throw new IllegalStateException(stringBuilder.toString());
            }
            u = m1829b(c);
        }
        this.f1661a = 0;
        int[] iArr = this.f1675p;
        int i2 = this.f1673n - 1;
        iArr[i2] = iArr[i2] + 1;
        return u;
    }

    /* renamed from: i */
    public boolean mo372i() {
        int i = this.f1661a;
        if (i == 0) {
            i = m1857r();
        }
        int[] iArr;
        int i2;
        if (i == 5) {
            this.f1661a = 0;
            iArr = this.f1675p;
            i2 = this.f1673n - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f1661a = 0;
            iArr = this.f1675p;
            i2 = this.f1673n - 1;
            iArr[i2] = iArr[i2] + 1;
            return false;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected a boolean but was ");
            stringBuilder.append(mo369f());
            stringBuilder.append(m1858s());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: j */
    public void mo373j() {
        int i = this.f1661a;
        if (i == 0) {
            i = m1857r();
        }
        if (i == 7) {
            this.f1661a = 0;
            int[] iArr = this.f1675p;
            int i2 = this.f1673n - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected null but was ");
        stringBuilder.append(mo369f());
        stringBuilder.append(m1858s());
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: k */
    public double mo374k() {
        int i = this.f1661a;
        if (i == 0) {
            i = m1857r();
        }
        if (i == 15) {
            this.f1661a = 0;
            int[] iArr = this.f1675p;
            int i2 = this.f1673n - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f1669j;
        }
        if (i == 16) {
            this.f1671l = new String(this.f1664e, this.f1665f, this.f1670k);
            this.f1665f += this.f1670k;
        } else {
            String u;
            if (i != 8) {
                if (i != 9) {
                    if (i == 10) {
                        u = m1834u();
                        this.f1671l = u;
                    } else if (i != 11) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Expected a double but was ");
                        stringBuilder.append(mo369f());
                        stringBuilder.append(m1858s());
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                }
            }
            u = m1829b(i == 8 ? '\'' : '\"');
            this.f1671l = u;
        }
        this.f1661a = 11;
        double parseDouble = Double.parseDouble(this.f1671l);
        if (!this.f1663d) {
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("JSON forbids NaN and infinities: ");
                stringBuilder2.append(parseDouble);
                stringBuilder2.append(m1858s());
                throw new C0480d(stringBuilder2.toString());
            }
        }
        this.f1671l = null;
        this.f1661a = 0;
        int[] iArr2 = this.f1675p;
        int i3 = this.f1673n - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    /* renamed from: l */
    public long mo375l() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/1763344271.run(Unknown Source)
*/
        /*
        r8 = this;
        r0 = r8.f1661a;
        if (r0 != 0) goto L_0x0008;
    L_0x0004:
        r0 = r8.m1857r();
    L_0x0008:
        r1 = 15;
        r2 = 0;
        if (r0 != r1) goto L_0x001e;
    L_0x000d:
        r8.f1661a = r2;
        r0 = r8.f1675p;
        r1 = r8.f1673n;
        r1 = r1 + -1;
        r2 = r0[r1];
        r2 = r2 + 1;
        r0[r1] = r2;
        r0 = r8.f1669j;
        return r0;
    L_0x001e:
        r1 = 16;
        if (r0 != r1) goto L_0x0037;
    L_0x0022:
        r0 = new java.lang.String;
        r1 = r8.f1664e;
        r3 = r8.f1665f;
        r4 = r8.f1670k;
        r0.<init>(r1, r3, r4);
        r8.f1671l = r0;
        r0 = r8.f1665f;
        r1 = r8.f1670k;
        r0 = r0 + r1;
        r8.f1665f = r0;
        goto L_0x0090;
    L_0x0037:
        r1 = 10;
        r3 = 8;
        if (r0 == r3) goto L_0x0066;
    L_0x003d:
        r4 = 9;
        if (r0 == r4) goto L_0x0066;
    L_0x0041:
        if (r0 != r1) goto L_0x0044;
    L_0x0043:
        goto L_0x0066;
    L_0x0044:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Expected a long but was ";
        r1.append(r2);
        r2 = r8.mo369f();
        r1.append(r2);
        r2 = r8.m1858s();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0066:
        if (r0 != r1) goto L_0x006f;
    L_0x0068:
        r0 = r8.m1834u();
    L_0x006c:
        r8.f1671l = r0;
        goto L_0x007b;
    L_0x006f:
        if (r0 != r3) goto L_0x0074;
    L_0x0071:
        r0 = 39;
        goto L_0x0076;
    L_0x0074:
        r0 = 34;
    L_0x0076:
        r0 = r8.m1829b(r0);
        goto L_0x006c;
    L_0x007b:
        r0 = r8.f1671l;	 Catch:{ NumberFormatException -> 0x0090 }
        r0 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x0090 }
        r8.f1661a = r2;	 Catch:{ NumberFormatException -> 0x0090 }
        r3 = r8.f1675p;	 Catch:{ NumberFormatException -> 0x0090 }
        r4 = r8.f1673n;	 Catch:{ NumberFormatException -> 0x0090 }
        r4 = r4 + -1;	 Catch:{ NumberFormatException -> 0x0090 }
        r5 = r3[r4];	 Catch:{ NumberFormatException -> 0x0090 }
        r5 = r5 + 1;	 Catch:{ NumberFormatException -> 0x0090 }
        r3[r4] = r5;	 Catch:{ NumberFormatException -> 0x0090 }
        return r0;
    L_0x0090:
        r0 = 11;
        r8.f1661a = r0;
        r0 = r8.f1671l;
        r0 = java.lang.Double.parseDouble(r0);
        r3 = (long) r0;
        r5 = (double) r3;
        r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r7 != 0) goto L_0x00b2;
    L_0x00a0:
        r0 = 0;
        r8.f1671l = r0;
        r8.f1661a = r2;
        r0 = r8.f1675p;
        r1 = r8.f1673n;
        r1 = r1 + -1;
        r2 = r0[r1];
        r2 = r2 + 1;
        r0[r1] = r2;
        return r3;
    L_0x00b2:
        r0 = new java.lang.NumberFormatException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Expected a long but was ";
        r1.append(r2);
        r2 = r8.f1671l;
        r1.append(r2);
        r2 = r8.m1858s();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.b.a.d.a.l():long");
    }

    /* renamed from: m */
    public int mo376m() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/1763344271.run(Unknown Source)
*/
        /*
        r7 = this;
        r0 = r7.f1661a;
        if (r0 != 0) goto L_0x0008;
    L_0x0004:
        r0 = r7.m1857r();
    L_0x0008:
        r1 = 15;
        r2 = 0;
        if (r0 != r1) goto L_0x0046;
    L_0x000d:
        r0 = r7.f1669j;
        r0 = (int) r0;
        r3 = r7.f1669j;
        r5 = (long) r0;
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 != 0) goto L_0x0026;
    L_0x0017:
        r7.f1661a = r2;
        r1 = r7.f1675p;
        r2 = r7.f1673n;
        r2 = r2 + -1;
        r3 = r1[r2];
        r3 = r3 + 1;
        r1[r2] = r3;
        return r0;
    L_0x0026:
        r0 = new java.lang.NumberFormatException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Expected an int but was ";
        r1.append(r2);
        r2 = r7.f1669j;
        r1.append(r2);
        r2 = r7.m1858s();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0046:
        r1 = 16;
        if (r0 != r1) goto L_0x005f;
    L_0x004a:
        r0 = new java.lang.String;
        r1 = r7.f1664e;
        r3 = r7.f1665f;
        r4 = r7.f1670k;
        r0.<init>(r1, r3, r4);
        r7.f1671l = r0;
        r0 = r7.f1665f;
        r1 = r7.f1670k;
        r0 = r0 + r1;
        r7.f1665f = r0;
        goto L_0x00b8;
    L_0x005f:
        r1 = 10;
        r3 = 8;
        if (r0 == r3) goto L_0x008e;
    L_0x0065:
        r4 = 9;
        if (r0 == r4) goto L_0x008e;
    L_0x0069:
        if (r0 != r1) goto L_0x006c;
    L_0x006b:
        goto L_0x008e;
    L_0x006c:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Expected an int but was ";
        r1.append(r2);
        r2 = r7.mo369f();
        r1.append(r2);
        r2 = r7.m1858s();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x008e:
        if (r0 != r1) goto L_0x0097;
    L_0x0090:
        r0 = r7.m1834u();
    L_0x0094:
        r7.f1671l = r0;
        goto L_0x00a3;
    L_0x0097:
        if (r0 != r3) goto L_0x009c;
    L_0x0099:
        r0 = 39;
        goto L_0x009e;
    L_0x009c:
        r0 = 34;
    L_0x009e:
        r0 = r7.m1829b(r0);
        goto L_0x0094;
    L_0x00a3:
        r0 = r7.f1671l;	 Catch:{ NumberFormatException -> 0x00b8 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x00b8 }
        r7.f1661a = r2;	 Catch:{ NumberFormatException -> 0x00b8 }
        r1 = r7.f1675p;	 Catch:{ NumberFormatException -> 0x00b8 }
        r3 = r7.f1673n;	 Catch:{ NumberFormatException -> 0x00b8 }
        r3 = r3 + -1;	 Catch:{ NumberFormatException -> 0x00b8 }
        r4 = r1[r3];	 Catch:{ NumberFormatException -> 0x00b8 }
        r4 = r4 + 1;	 Catch:{ NumberFormatException -> 0x00b8 }
        r1[r3] = r4;	 Catch:{ NumberFormatException -> 0x00b8 }
        return r0;
    L_0x00b8:
        r0 = 11;
        r7.f1661a = r0;
        r0 = r7.f1671l;
        r0 = java.lang.Double.parseDouble(r0);
        r3 = (int) r0;
        r4 = (double) r3;
        r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r6 != 0) goto L_0x00da;
    L_0x00c8:
        r0 = 0;
        r7.f1671l = r0;
        r7.f1661a = r2;
        r0 = r7.f1675p;
        r1 = r7.f1673n;
        r1 = r1 + -1;
        r2 = r0[r1];
        r2 = r2 + 1;
        r0[r1] = r2;
        return r3;
    L_0x00da:
        r0 = new java.lang.NumberFormatException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Expected an int but was ";
        r1.append(r2);
        r2 = r7.f1671l;
        r1.append(r2);
        r2 = r7.m1858s();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.b.a.d.a.m():int");
    }

    /* renamed from: n */
    public void mo377n() {
        int i = 0;
        do {
            int i2 = this.f1661a;
            if (i2 == 0) {
                i2 = m1857r();
            }
            if (i2 == 3) {
                m1824a(1);
            } else if (i2 == 1) {
                m1824a(3);
            } else {
                if (i2 != 4) {
                    if (i2 != 2) {
                        if (i2 != 14) {
                            if (i2 != 10) {
                                char c;
                                if (i2 != 8) {
                                    if (i2 != 12) {
                                        if (i2 != 9) {
                                            if (i2 != 13) {
                                                if (i2 == 16) {
                                                    this.f1665f += this.f1670k;
                                                }
                                                this.f1661a = 0;
                                            }
                                        }
                                        c = '\"';
                                        m1831c(c);
                                        this.f1661a = 0;
                                    }
                                }
                                c = '\'';
                                m1831c(c);
                                this.f1661a = 0;
                            }
                        }
                        m1835v();
                        this.f1661a = 0;
                    }
                }
                this.f1673n--;
                i--;
                this.f1661a = 0;
            }
            i++;
            this.f1661a = 0;
        } while (i != 0);
        int[] iArr = this.f1675p;
        i = this.f1673n - 1;
        iArr[i] = iArr[i] + 1;
        this.f1674o[this.f1673n - 1] = "null";
    }

    /* renamed from: p */
    public String mo379p() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('$');
        int i = this.f1673n;
        for (int i2 = 0; i2 < i; i2++) {
            switch (this.f1672m[i2]) {
                case 1:
                case 2:
                    stringBuilder.append('[');
                    stringBuilder.append(this.f1675p[i2]);
                    stringBuilder.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    stringBuilder.append('.');
                    if (this.f1674o[i2] == null) {
                        break;
                    }
                    stringBuilder.append(this.f1674o[i2]);
                    break;
                default:
                    break;
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: q */
    public final boolean m1856q() {
        return this.f1663d;
    }

    /* renamed from: r */
    int m1857r() {
        int i = this.f1672m[this.f1673n - 1];
        int b;
        if (i == 1) {
            this.f1672m[this.f1673n - 1] = 2;
            b = m1827b(true);
            if (b != 34) {
                i = 9;
            } else if (b == 39) {
                if (!(b == 44 || b == 59)) {
                    if (b != 91) {
                        this.f1661a = 3;
                        return 3;
                    } else if (b == 93) {
                        if (b == 123) {
                            this.f1665f--;
                            i = mo378o();
                            if (i != 0) {
                                return i;
                            }
                            i = m1833t();
                            if (i != 0) {
                                return i;
                            }
                            if (m1825a(this.f1664e[this.f1665f])) {
                                throw m1828b("Expected value");
                            }
                            m1836w();
                            i = 10;
                        } else {
                            this.f1661a = 1;
                            return 1;
                        }
                    } else if (i == 1) {
                        this.f1661a = 4;
                        return 4;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        throw m1828b("Unexpected value");
                    }
                }
                m1836w();
                this.f1665f--;
                this.f1661a = 7;
                return 7;
            } else {
                m1836w();
                this.f1661a = 8;
                return 8;
            }
        }
        if (i == 2) {
            b = m1827b(true);
            if (b != 44) {
                if (b == 59) {
                    m1836w();
                } else if (b == 93) {
                    this.f1661a = 4;
                    return 4;
                } else {
                    throw m1828b("Unterminated array");
                }
            }
        }
        int b2;
        if (i != 3) {
            if (i != 5) {
                if (i == 4) {
                    this.f1672m[this.f1673n - 1] = 5;
                    b = m1827b(true);
                    if (b != 58) {
                        if (b == 61) {
                            m1836w();
                            if ((this.f1665f < this.f1666g || m1830b(1)) && this.f1664e[this.f1665f] == '>') {
                                b = this.f1665f + 1;
                            }
                        } else {
                            throw m1828b("Expected ':'");
                        }
                    }
                } else if (i == 6) {
                    if (this.f1663d) {
                        m1839z();
                    }
                    this.f1672m[this.f1673n - 1] = 7;
                } else if (i == 7) {
                    if (m1827b(false) == -1) {
                        i = 17;
                    } else {
                        m1836w();
                        b = this.f1665f - 1;
                    }
                } else if (i == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                this.f1665f = b;
            }
        }
        this.f1672m[this.f1673n - 1] = 4;
        if (i == 5) {
            b2 = m1827b(true);
            if (b2 != 44) {
                if (b2 == 59) {
                    m1836w();
                } else if (b2 == 125) {
                    this.f1661a = 2;
                    return 2;
                } else {
                    throw m1828b("Unterminated object");
                }
            }
        }
        b2 = m1827b(true);
        if (b2 == 34) {
            i = 13;
        } else if (b2 == 39) {
            m1836w();
            i = 12;
        } else if (b2 != 125) {
            m1836w();
            this.f1665f--;
            if (m1825a((char) b2)) {
                i = 14;
            } else {
                throw m1828b("Expected name");
            }
        } else if (i != 5) {
            this.f1661a = 2;
            return 2;
        } else {
            throw m1828b("Expected name");
        }
        b = m1827b(true);
        if (b != 34) {
            i = 9;
        } else if (b == 39) {
            m1836w();
            this.f1661a = 8;
            return 8;
        } else if (b != 91) {
            this.f1661a = 3;
            return 3;
        } else if (b == 93) {
            if (i == 1) {
                this.f1661a = 4;
                return 4;
            }
            if (i != 1) {
                if (i == 2) {
                    throw m1828b("Unexpected value");
                }
            }
            m1836w();
            this.f1665f--;
            this.f1661a = 7;
            return 7;
        } else if (b == 123) {
            this.f1661a = 1;
            return 1;
        } else {
            this.f1665f--;
            i = mo378o();
            if (i != 0) {
                return i;
            }
            i = m1833t();
            if (i != 0) {
                return i;
            }
            if (m1825a(this.f1664e[this.f1665f])) {
                throw m1828b("Expected value");
            }
            m1836w();
            i = 10;
        }
        this.f1661a = i;
        return i;
    }

    /* renamed from: s */
    String m1858s() {
        int i = this.f1667h + 1;
        int i2 = (this.f1665f - this.f1668i) + 1;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" at line ");
        stringBuilder.append(i);
        stringBuilder.append(" column ");
        stringBuilder.append(i2);
        stringBuilder.append(" path ");
        stringBuilder.append(mo379p());
        return stringBuilder.toString();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(m1858s());
        return stringBuilder.toString();
    }
}
