package com.p028b.p029a.p030a;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.b.a.a.a */
public @interface C0441a {
    /* renamed from: a */
    boolean m1736a() default true;

    /* renamed from: b */
    boolean m1737b() default true;
}
