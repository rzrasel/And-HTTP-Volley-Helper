package com.p028b.p029a.p031b;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.b.a.b.k */
public final class C0471k {
    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f1654a;
    /* renamed from: b */
    private static final Map<Class<?>, Class<?>> f1655b;

    static {
        Map hashMap = new HashMap(16);
        Map hashMap2 = new HashMap(16);
        C0471k.m1809a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        C0471k.m1809a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        C0471k.m1809a(hashMap, hashMap2, Character.TYPE, Character.class);
        C0471k.m1809a(hashMap, hashMap2, Double.TYPE, Double.class);
        C0471k.m1809a(hashMap, hashMap2, Float.TYPE, Float.class);
        C0471k.m1809a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        C0471k.m1809a(hashMap, hashMap2, Long.TYPE, Long.class);
        C0471k.m1809a(hashMap, hashMap2, Short.TYPE, Short.class);
        C0471k.m1809a(hashMap, hashMap2, Void.TYPE, Void.class);
        f1654a = Collections.unmodifiableMap(hashMap);
        f1655b = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    private static void m1809a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    /* renamed from: a */
    public static boolean m1810a(Type type) {
        return f1654a.containsKey(type);
    }
}
