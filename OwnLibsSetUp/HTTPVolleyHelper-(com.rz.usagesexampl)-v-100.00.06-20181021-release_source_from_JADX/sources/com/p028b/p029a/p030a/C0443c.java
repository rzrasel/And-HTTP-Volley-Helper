package com.p028b.p029a.p030a;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.b.a.a.c */
public @interface C0443c {
    /* renamed from: a */
    String m1740a();

    /* renamed from: b */
    String[] m1741b() default {};
}
