package com.p028b.p029a.p030a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.b.a.a.b */
public @interface C0442b {
    /* renamed from: a */
    Class<?> m1738a();

    /* renamed from: b */
    boolean m1739b() default true;
}
