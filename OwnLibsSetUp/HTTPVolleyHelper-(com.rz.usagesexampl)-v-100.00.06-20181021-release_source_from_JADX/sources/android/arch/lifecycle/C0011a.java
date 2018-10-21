package android.arch.lifecycle;

import android.arch.lifecycle.C0015c.C0013a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: android.arch.lifecycle.a */
class C0011a {
    /* renamed from: a */
    static C0011a f24a = new C0011a();
    /* renamed from: b */
    private final Map<Class, C0009a> f25b = new HashMap();
    /* renamed from: c */
    private final Map<Class, Boolean> f26c = new HashMap();

    /* renamed from: android.arch.lifecycle.a$a */
    static class C0009a {
        /* renamed from: a */
        final Map<C0013a, List<C0010b>> f20a = new HashMap();
        /* renamed from: b */
        final Map<C0010b, C0013a> f21b;

        C0009a(Map<C0010b, C0013a> map) {
            this.f21b = map;
            for (Entry entry : map.entrySet()) {
                C0013a c0013a = (C0013a) entry.getValue();
                List list = (List) this.f20a.get(c0013a);
                if (list == null) {
                    list = new ArrayList();
                    this.f20a.put(c0013a, list);
                }
                list.add(entry.getKey());
            }
        }

        /* renamed from: a */
        private static void m29a(List<C0010b> list, C0017e c0017e, C0013a c0013a, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C0010b) list.get(size)).m31a(c0017e, c0013a, obj);
                }
            }
        }

        /* renamed from: a */
        void m30a(C0017e c0017e, C0013a c0013a, Object obj) {
            C0009a.m29a((List) this.f20a.get(c0013a), c0017e, c0013a, obj);
            C0009a.m29a((List) this.f20a.get(C0013a.ON_ANY), c0017e, c0013a, obj);
        }
    }

    /* renamed from: android.arch.lifecycle.a$b */
    static class C0010b {
        /* renamed from: a */
        final int f22a;
        /* renamed from: b */
        final Method f23b;

        C0010b(int i, Method method) {
            this.f22a = i;
            this.f23b = method;
            this.f23b.setAccessible(true);
        }

        /* renamed from: a */
        void m31a(C0017e c0017e, C0013a c0013a, Object obj) {
            try {
                switch (this.f22a) {
                    case 0:
                        this.f23b.invoke(obj, new Object[0]);
                        return;
                    case 1:
                        this.f23b.invoke(obj, new Object[]{c0017e});
                        return;
                    case 2:
                        this.f23b.invoke(obj, new Object[]{c0017e, c0013a});
                        return;
                    default:
                        return;
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to call observer method", e.getCause());
            } catch (Throwable e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    C0010b c0010b = (C0010b) obj;
                    if (this.f22a != c0010b.f22a || !this.f23b.getName().equals(c0010b.f23b.getName())) {
                        z = false;
                    }
                    return z;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f22a * 31) + this.f23b.getName().hashCode();
        }
    }

    C0011a() {
    }

    /* renamed from: a */
    private C0009a m32a(Class cls, Method[] methodArr) {
        Class superclass = cls.getSuperclass();
        Map hashMap = new HashMap();
        if (superclass != null) {
            C0009a b = m36b(superclass);
            if (b != null) {
                hashMap.putAll(b.f21b);
            }
        }
        for (Class b2 : cls.getInterfaces()) {
            for (Entry entry : m36b(b2).f21b.entrySet()) {
                m33a(hashMap, (C0010b) entry.getKey(), (C0013a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m34c(cls);
        }
        boolean z = false;
        for (Method method : r13) {
            C0023l c0023l = (C0023l) method.getAnnotation(C0023l.class);
            if (c0023l != null) {
                int i;
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(C0017e.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C0013a a = c0023l.m52a();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C0013a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (a == C0013a.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m33a(hashMap, new C0010b(i, method), a, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0009a c0009a = new C0009a(hashMap);
        this.f25b.put(cls, c0009a);
        this.f26c.put(cls, Boolean.valueOf(z));
        return c0009a;
    }

    /* renamed from: a */
    private void m33a(Map<C0010b, C0013a> map, C0010b c0010b, C0013a c0013a, Class cls) {
        C0013a c0013a2 = (C0013a) map.get(c0010b);
        if (c0013a2 != null) {
            if (c0013a != c0013a2) {
                Method method = c0010b.f23b;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Method ");
                stringBuilder.append(method.getName());
                stringBuilder.append(" in ");
                stringBuilder.append(cls.getName());
                stringBuilder.append(" already declared with different @OnLifecycleEvent value: previous");
                stringBuilder.append(" value ");
                stringBuilder.append(c0013a2);
                stringBuilder.append(", new value ");
                stringBuilder.append(c0013a);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        if (c0013a2 == null) {
            map.put(c0010b, c0013a);
        }
    }

    /* renamed from: c */
    private Method[] m34c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (Throwable e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* renamed from: a */
    boolean m35a(Class cls) {
        if (this.f26c.containsKey(cls)) {
            return ((Boolean) this.f26c.get(cls)).booleanValue();
        }
        Method[] c = m34c(cls);
        for (Method annotation : c) {
            if (((C0023l) annotation.getAnnotation(C0023l.class)) != null) {
                m32a(cls, c);
                return true;
            }
        }
        this.f26c.put(cls, Boolean.valueOf(false));
        return false;
    }

    /* renamed from: b */
    C0009a m36b(Class cls) {
        C0009a c0009a = (C0009a) this.f25b.get(cls);
        return c0009a != null ? c0009a : m32a(cls, null);
    }
}
