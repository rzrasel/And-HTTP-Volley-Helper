package com.rz.usagesexampl.working.httpvolleyhelper.original;

import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

class HTTPVolleyParserHelper<T> {
    private static String methodName = "methodName-var";
    protected static <T> ArrayList<T> getModel() {
        methodName = "<T> ArrayList<T> getModel()";
        ArrayList<T> arrayList = new ArrayList<T>();
        return arrayList;
    }

    protected static <T> ArrayList<T> getModel(Class<T> argClass) {
        methodName = "<T> ArrayList<T> getModel(Class<T> argClass)";
        ArrayList<T> arrayList = new ArrayList<T>();
        return arrayList;
    }

    protected static <T> void setModel(Class<T> argClass) {
        methodName = "void setModel(Class<T> argClass)";
        ArrayList<T> arrayList = new ArrayList<T>();
    }

    protected static <T> Type getTypeToken() {
        methodName = "<T> Type getTypeToken()";
        return new TypeToken<ArrayList<T>>() {
        }.getType();
    }

    protected static <T> Type getTypeToken(Class<T> argTypeToken) {
        methodName = "<T> Type getTypeToken(Class<T> argTypeToken)";
        /*Type typeToken = new TypeToken<ArrayList<ModelUsual>>() {
        }.getType();*/
        /*return new TypeToken<ArrayList<T>>() {
        }.getType();*/
        return TypeToken.getParameterized(ArrayList.class, argTypeToken).getType();
    }
}