package com.rz.usagesexampl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.C0791c;
import com.p028b.p029a.p030a.C0443c;
import com.rz.usagesexampl.p037a.C0494a;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class ActSplash extends C0791c {
    /* renamed from: m */
    private Activity f2841m;
    /* renamed from: n */
    private Context f2842n;

    /* renamed from: a */
    public static List<Field> m3773a(Class cls) {
        List<Field> arrayList = new ArrayList();
        Field[] declaredFields = cls.getDeclaredFields();
        for (Object add : declaredFields) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static List<String> m3774b(Class cls) {
        List<Field> a = m3773a(cls);
        List<String> arrayList = new ArrayList();
        for (Field annotation : a) {
            C0443c c0443c = (C0443c) annotation.getAnnotation(C0443c.class);
            if (c0443c != null) {
                arrayList.add(c0443c.m1740a());
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private void m3775c(Class cls) {
        try {
            Object newInstance = cls.newInstance();
            System.out.println(newInstance.getClass());
            newInstance.getClass().getMethod("sayHi", new Class[0]).invoke(newInstance, new Object[0]);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
        }
        try {
            newInstance = cls.newInstance();
            System.out.println(cls.getField("testVar").get(newInstance));
        } catch (NoSuchFieldException e5) {
            e5.printStackTrace();
        } catch (IllegalAccessException e6) {
            e6.printStackTrace();
        } catch (InstantiationException e7) {
            e7.printStackTrace();
        }
    }

    /* renamed from: k */
    private void m3776k() {
        m3775c(C0501a.class);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.act_splash);
        this.f2841m = this;
        this.f2842n = this;
        m3776k();
        for (String str : m3774b(C0501a.class)) {
            PrintStream printStream = System.out;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SerializedName: annotation ");
            stringBuilder.append(str);
            printStream.println(stringBuilder.toString());
        }
        for (Field annotation : m3773a(C0501a.class)) {
            C0494a c0494a = (C0494a) annotation.getAnnotation(C0494a.class);
            if (c0494a != null) {
                printStream = System.out;
                stringBuilder = new StringBuilder();
                stringBuilder.append("FieldName: annotation---- ");
                stringBuilder.append(c0494a.m1922a());
                printStream.println(stringBuilder.toString());
            }
        }
    }
}
