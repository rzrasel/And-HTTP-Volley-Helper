package com.p028b.p029a;

import java.lang.reflect.Field;
import java.util.Locale;

/* renamed from: com.b.a.d */
public enum C0707d implements C0481e {
    IDENTITY {
        /* renamed from: a */
        public String mo535a(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE {
        /* renamed from: a */
        public String mo535a(Field field) {
            return C0707d.m3262a(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES {
        /* renamed from: a */
        public String mo535a(Field field) {
            return C0707d.m3262a(C0707d.m3263a(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES {
        /* renamed from: a */
        public String mo535a(Field field) {
            return C0707d.m3263a(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES {
        /* renamed from: a */
        public String mo535a(Field field) {
            return C0707d.m3263a(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS {
        /* renamed from: a */
        public String mo535a(Field field) {
            return C0707d.m3263a(field.getName(), ".").toLowerCase(Locale.ENGLISH);
        }
    };

    /* renamed from: a */
    private static String m3261a(char c, String str, int i) {
        if (i >= str.length()) {
            return String.valueOf(c);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c);
        stringBuilder.append(str.substring(i));
        return stringBuilder.toString();
    }

    /* renamed from: a */
    static String m3262a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        char charAt = str.charAt(0);
        int length = str.length();
        while (i < length - 1) {
            if (Character.isLetter(charAt)) {
                break;
            }
            stringBuilder.append(charAt);
            i++;
            charAt = str.charAt(i);
        }
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        stringBuilder.append(C0707d.m3261a(Character.toUpperCase(charAt), str, i + 1));
        return stringBuilder.toString();
    }

    /* renamed from: a */
    static String m3263a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && stringBuilder.length() != 0) {
                stringBuilder.append(str2);
            }
            stringBuilder.append(charAt);
        }
        return stringBuilder.toString();
    }
}
