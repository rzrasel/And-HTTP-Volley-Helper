package com.p028b.p029a.p031b;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

/* renamed from: com.b.a.b.b */
public final class C0458b {
    /* renamed from: a */
    static final Type[] f1625a = new Type[0];

    /* renamed from: com.b.a.b.b$a */
    private static final class C0454a implements Serializable, GenericArrayType {
        /* renamed from: a */
        private final Type f1618a;

        public C0454a(Type type) {
            this.f1618a = C0458b.m1775d(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C0458b.m1770a((Type) this, (GenericArrayType) obj);
        }

        public Type getGenericComponentType() {
            return this.f1618a;
        }

        public int hashCode() {
            return this.f1618a.hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(C0458b.m1777f(this.f1618a));
            stringBuilder.append("[]");
            return stringBuilder.toString();
        }
    }

    /* renamed from: com.b.a.b.b$b */
    private static final class C0455b implements Serializable, ParameterizedType {
        /* renamed from: a */
        private final Type f1619a;
        /* renamed from: b */
        private final Type f1620b;
        /* renamed from: c */
        private final Type[] f1621c;

        public C0455b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Object obj;
                Class cls = (Class) type2;
                boolean z = true;
                if (!Modifier.isStatic(cls.getModifiers())) {
                    if (cls.getEnclosingClass() != null) {
                        obj = null;
                        if (type == null) {
                            if (obj != null) {
                                z = false;
                            }
                        }
                        C0453a.m1756a(z);
                    }
                }
                obj = 1;
                if (type == null) {
                    if (obj != null) {
                        z = false;
                    }
                }
                C0453a.m1756a(z);
            }
            this.f1619a = type == null ? null : C0458b.m1775d(type);
            this.f1620b = C0458b.m1775d(type2);
            this.f1621c = (Type[]) typeArr.clone();
            int length = this.f1621c.length;
            for (int i = 0; i < length; i++) {
                C0453a.m1755a(this.f1621c[i]);
                C0458b.m1779h(this.f1621c[i]);
                this.f1621c[i] = C0458b.m1775d(this.f1621c[i]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C0458b.m1770a((Type) this, (ParameterizedType) obj);
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f1621c.clone();
        }

        public Type getOwnerType() {
            return this.f1619a;
        }

        public Type getRawType() {
            return this.f1620b;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f1621c) ^ this.f1620b.hashCode()) ^ C0458b.m1759a(this.f1619a);
        }

        public String toString() {
            int length = this.f1621c.length;
            if (length == 0) {
                return C0458b.m1777f(this.f1620b);
            }
            StringBuilder stringBuilder = new StringBuilder((length + 1) * 30);
            stringBuilder.append(C0458b.m1777f(this.f1620b));
            stringBuilder.append("<");
            stringBuilder.append(C0458b.m1777f(this.f1621c[0]));
            for (int i = 1; i < length; i++) {
                stringBuilder.append(", ");
                stringBuilder.append(C0458b.m1777f(this.f1621c[i]));
            }
            stringBuilder.append(">");
            return stringBuilder.toString();
        }
    }

    /* renamed from: com.b.a.b.b$c */
    private static final class C0456c implements Serializable, WildcardType {
        /* renamed from: a */
        private final Type f1622a;
        /* renamed from: b */
        private final Type f1623b;

        public C0456c(Type[] typeArr, Type[] typeArr2) {
            Type type;
            boolean z = true;
            C0453a.m1756a(typeArr2.length <= 1);
            C0453a.m1756a(typeArr.length == 1);
            if (typeArr2.length == 1) {
                C0453a.m1755a(typeArr2[0]);
                C0458b.m1779h(typeArr2[0]);
                if (typeArr[0] != Object.class) {
                    z = false;
                }
                C0453a.m1756a(z);
                this.f1623b = C0458b.m1775d(typeArr2[0]);
                type = Object.class;
            } else {
                C0453a.m1755a(typeArr[0]);
                C0458b.m1779h(typeArr[0]);
                this.f1623b = null;
                type = C0458b.m1775d(typeArr[0]);
            }
            this.f1622a = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C0458b.m1770a((Type) this, (WildcardType) obj);
        }

        public Type[] getLowerBounds() {
            if (this.f1623b == null) {
                return C0458b.f1625a;
            }
            return new Type[]{this.f1623b};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f1622a};
        }

        public int hashCode() {
            return (this.f1623b != null ? this.f1623b.hashCode() + 31 : 1) ^ (this.f1622a.hashCode() + 31);
        }

        public String toString() {
            StringBuilder stringBuilder;
            Type type;
            if (this.f1623b != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("? super ");
                type = this.f1623b;
            } else if (this.f1622a == Object.class) {
                return "?";
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("? extends ");
                type = this.f1622a;
            }
            stringBuilder.append(C0458b.m1777f(type));
            return stringBuilder.toString();
        }
    }

    /* renamed from: a */
    static int m1759a(Object obj) {
        return obj != null ? obj.hashCode() : 0;
    }

    /* renamed from: a */
    private static int m1760a(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    private static Class<?> m1761a(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        return genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
    }

    /* renamed from: a */
    public static GenericArrayType m1762a(Type type) {
        return new C0454a(type);
    }

    /* renamed from: a */
    public static ParameterizedType m1763a(Type type, Type type2, Type... typeArr) {
        return new C0455b(type, type2, typeArr);
    }

    /* renamed from: a */
    public static Type m1764a(Type type, Class<?> cls) {
        type = C0458b.m1771b(type, cls, Collection.class);
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        return type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Object.class;
    }

    /* renamed from: a */
    static Type m1765a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                if (interfaces[i] == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(interfaces[i])) {
                    return C0458b.m1765a(cls.getGenericInterfaces()[i], interfaces[i], (Class) cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            Class cls3;
            while (cls3 != Object.class) {
                Class superclass = cls3.getSuperclass();
                if (superclass == cls2) {
                    return cls3.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return C0458b.m1765a(cls3.getGenericSuperclass(), superclass, (Class) cls2);
                }
                cls3 = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: a */
    public static Type m1766a(Type type, Class<?> cls, Type type2) {
        return C0458b.m1767a(type, cls, type2, new HashSet());
    }

    /* renamed from: a */
    private static Type m1767a(Type type, Class<?> cls, Type type2, Collection<TypeVariable> collection) {
        while (type2 instanceof TypeVariable) {
            Type type3 = (TypeVariable) type2;
            if (collection.contains(type3)) {
                return type2;
            }
            collection.add(type3);
            type2 = C0458b.m1768a(type, (Class) cls, (TypeVariable) type3);
            if (type2 == type3) {
                return type2;
            }
        }
        if (type2 instanceof Class) {
            type3 = (Class) type2;
            if (type3.isArray()) {
                type2 = type3.getComponentType();
                type = C0458b.m1767a(type, cls, type2, collection);
                if (type2 != type) {
                    type3 = C0458b.m1762a(type);
                }
                return type3;
            }
        }
        if (type2 instanceof GenericArrayType) {
            type2 = (GenericArrayType) type2;
            type3 = type2.getGenericComponentType();
            type = C0458b.m1767a(type, cls, type3, collection);
            if (type3 != type) {
                type2 = C0458b.m1762a(type);
            }
            return type2;
        }
        int i = 0;
        if (type2 instanceof ParameterizedType) {
            type2 = (ParameterizedType) type2;
            type3 = type2.getOwnerType();
            Type a = C0458b.m1767a(type, cls, type3, collection);
            Object obj = a != type3 ? 1 : null;
            Type[] actualTypeArguments = type2.getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i < length) {
                Type a2 = C0458b.m1767a(type, cls, actualTypeArguments[i], collection);
                if (a2 != actualTypeArguments[i]) {
                    if (obj == null) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        obj = 1;
                    }
                    actualTypeArguments[i] = a2;
                }
                i++;
            }
            if (obj != null) {
                type2 = C0458b.m1763a(a, type2.getRawType(), actualTypeArguments);
            }
            return type2;
        }
        if (type2 instanceof WildcardType) {
            type2 = (WildcardType) type2;
            Type[] lowerBounds = type2.getLowerBounds();
            Type[] upperBounds = type2.getUpperBounds();
            if (lowerBounds.length == 1) {
                type = C0458b.m1767a(type, cls, lowerBounds[0], collection);
                if (type != lowerBounds[0]) {
                    return C0458b.m1774c(type);
                }
            } else if (upperBounds.length == 1) {
                type = C0458b.m1767a(type, cls, upperBounds[0], collection);
                if (type != upperBounds[0]) {
                    return C0458b.m1772b(type);
                }
            }
        }
        return type2;
    }

    /* renamed from: a */
    static Type m1768a(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class a = C0458b.m1761a((TypeVariable) typeVariable);
        if (a == null) {
            return typeVariable;
        }
        type = C0458b.m1765a(type, (Class) cls, a);
        if (!(type instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) type).getActualTypeArguments()[C0458b.m1760a(a.getTypeParameters(), (Object) typeVariable)];
    }

    /* renamed from: a */
    static boolean m1769a(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m1770a(Type type, Type type2) {
        boolean z = true;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (!C0458b.m1769a(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                z = false;
            }
            return z;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return C0458b.m1770a(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                z = false;
            }
            return z;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: b */
    static Type m1771b(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C0453a.m1756a(cls2.isAssignableFrom(cls));
        return C0458b.m1766a(type, (Class) cls, C0458b.m1765a(type, (Class) cls, (Class) cls2));
    }

    /* renamed from: b */
    public static WildcardType m1772b(Type type) {
        Type[] upperBounds;
        if (type instanceof WildcardType) {
            upperBounds = ((WildcardType) type).getUpperBounds();
        } else {
            upperBounds = new Type[]{type};
        }
        return new C0456c(upperBounds, f1625a);
    }

    /* renamed from: b */
    public static Type[] m1773b(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        type = C0458b.m1771b(type, cls, Map.class);
        if (type instanceof ParameterizedType) {
            return ((ParameterizedType) type).getActualTypeArguments();
        }
        return new Type[]{Object.class, Object.class};
    }

    /* renamed from: c */
    public static WildcardType m1774c(Type type) {
        Type[] lowerBounds;
        if (type instanceof WildcardType) {
            lowerBounds = ((WildcardType) type).getLowerBounds();
        } else {
            lowerBounds = new Type[]{type};
        }
        return new C0456c(new Type[]{Object.class}, lowerBounds);
    }

    /* renamed from: d */
    public static Type m1775d(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                cls = new C0454a(C0458b.m1775d(cls.getComponentType()));
            }
            return cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C0455b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new C0454a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new C0456c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    /* renamed from: e */
    public static Class<?> m1776e(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            type = ((ParameterizedType) type).getRawType();
            C0453a.m1756a(type instanceof Class);
            return (Class) type;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(C0458b.m1776e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return C0458b.m1776e(((WildcardType) type).getUpperBounds()[0]);
            }
            String name = type == null ? "null" : type.getClass().getName();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected a Class, ParameterizedType, or GenericArrayType, but <");
            stringBuilder.append(type);
            stringBuilder.append("> is of type ");
            stringBuilder.append(name);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: f */
    public static String m1777f(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* renamed from: g */
    public static Type m1778g(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    /* renamed from: h */
    static void m1779h(Type type) {
        boolean z;
        if (type instanceof Class) {
            if (((Class) type).isPrimitive()) {
                z = false;
                C0453a.m1756a(z);
            }
        }
        z = true;
        C0453a.m1756a(z);
    }
}
