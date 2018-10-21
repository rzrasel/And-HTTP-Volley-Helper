package com.p028b.p029a.p031b;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.b.a.b.j */
public class C0470j {
    /* renamed from: a */
    private static String m1806a(int i) {
        switch (i) {
            case 0:
                return "EEEE, MMMM d, yyyy";
            case 1:
                return "MMMM d, yyyy";
            case 2:
                return "MMM d, yyyy";
            case 3:
                return "M/d/yy";
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown DateFormat style: ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public static DateFormat m1807a(int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C0470j.m1806a(i));
        stringBuilder.append(" ");
        stringBuilder.append(C0470j.m1808b(i2));
        return new SimpleDateFormat(stringBuilder.toString(), Locale.US);
    }

    /* renamed from: b */
    private static String m1808b(int i) {
        switch (i) {
            case 0:
            case 1:
                return "h:mm:ss a z";
            case 2:
                return "h:mm:ss a";
            case 3:
                return "h:mm a";
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown DateFormat style: ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
