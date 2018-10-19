package com.rz.usagesexampl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.android.volley.VolleyError;
import com.google.gson.annotations.SerializedName;
import com.rz.httpvolleyhelper.HTTPVolleyParser;
import com.rz.httpvolleyhelper.HTTPVolleyRequest;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ActSplash extends AppCompatActivity {
    private Activity activity;
    private Context context;

    public static List<Field> getAllFields(Class argClass) {
        List<Field> fieldList = new ArrayList<>();
        Field fields[] = argClass.getDeclaredFields(); // returns all members including private members but not inherited members.
        //Field[] fields = HTTPVolleyParser.class.getFields(); // returns inherited members but not private members.
        for (int i = 0; i < fields.length; i++) {
            //System.out.println("Variable Name is : " + fields[i].getName());
            fieldList.add(fields[i]);
        }
        return fieldList;
    }

    public static List<String> getAllFieldName(Class argClass) {
        List<String> fieldList = new ArrayList<>();
        Field fields[] = argClass.getDeclaredFields(); // returns all members including private members but not inherited members.
        //Field[] fields = HTTPVolleyParser.class.getFields(); // returns inherited members but not private members.
        for (Field item : fields) {
            //System.out.println("Variable Name is : " + fields[i].getName());
            fieldList.add(item.getName());
        }
        return fieldList;
    }

    public static List<SerializedName> getAllSerializedName(Class argClass) {
        List<Field> fieldList = getAllFields(argClass);
        List<SerializedName> serializedNameList = new ArrayList<>();

        for (Field field : fieldList) {
            //System.out.println("Variable Name is : " + field.getName());
            SerializedName annotation = field.getAnnotation(SerializedName.class);
            if (annotation != null) {
                //System.out.println("SerializedName: getName " + fieldList.get(i).getName());
                //System.out.println("SerializedName: annotation " + annotation.value());
                serializedNameList.add(annotation);
            } else {
                //System.out.println("Annotation is null");
            }
        }
        return serializedNameList;
    }

    public static List<String> getAllAnnotation(Class argClass) {
        List<Field> fieldList = getAllFields(argClass);
        List<String> serializedNameList = new ArrayList<>();

        for (Field field : fieldList) {
            //System.out.println("Variable Name is : " + field.getName());
            SerializedName annotation = field.getAnnotation(SerializedName.class);
            if (annotation != null) {
                //System.out.println("SerializedName: getName " + fieldList.get(i).getName());
                //System.out.println("SerializedName: annotation " + annotation.value());
                serializedNameList.add(annotation.value());
            } else {
                //System.out.println("Annotation is null");
            }
        }
        return serializedNameList;
    }

    public static List<Method> getAllMethods(Class argClass) {
        List<Method> methodList = new ArrayList<>();
        Method[] methods = argClass.getMethods();
        for (Method method : methods) {
            methodList.add(method);
        }
        return methodList;
        /*for (Method method : methods) {
            String name = method.getName();
            System.out.println("Method Name is : " + name);
            if (name.startsWith("get")) {
                System.out.println(name.substring(3));
            } else if (name.startsWith("is")) {
                System.out.println(name.substring(2));
            }
        }*/
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_splash);
        activity = this;
        context = this;
        onHTTPVolleyParser();
        //startActivity(new Intent(context, ActHTTPVolleyHelper.class));
        List<String> serializedNameList = getAllAnnotation(ModelHTTPVolley.class);
        for (String item : serializedNameList) {
            System.out.println("SerializedName: annotation " + item);
        }
        /*List<Method> methodList = getAllMethods(ModelHTTPVolley.class);
        for (Method method : methodList) {
            String name = method.getName();
            System.out.println("Method Name is : " + name);
        }*/
        List<Field> fieldList = getAllFields(ModelHTTPVolley.class);
        //List<String> serializedNameList = new ArrayList<>();

        for (Field field : fieldList) {
            //System.out.println("FieldName Variable Name is : " + field.getName());
            FieldName annotation = field.getAnnotation(FieldName.class);
            if (annotation != null) {
                //System.out.println("SerializedName: getName " + fieldList.get(i).getName());
                System.out.println("FieldName: annotation---- " + annotation.value());
                //serializedNameList.add(annotation.value());
            } else {
                //System.out.println("Annotation is null");
            }
        }
    }

    public void onHTTPVolleyParser() {
        HTTPVolleyParser httpVolleyParser = new HTTPVolleyParser(context);
        HashMap<String, String> headerParams = null;
        headerParams.put("Authorization", "Token " + "ApiAuthToken");
        httpVolleyParser.withRUL("url")
                .withModel(ModelHTTPVolley.class)
                .withHeaderParameters(headerParams)
                .setEventListener(new HTTPVolleyParser.EventListenerHandler() {
                    @Override
                    public void onSuccess(String argResponseData) {
                        //
                    }

                    @Override
                    public void onSuccess(ArrayList<?> argModelDataList) {
                        ArrayList<ModelHTTPVolley> modelDataList = (ArrayList<ModelHTTPVolley>) argModelDataList;
                        System.out.println("DEBUG_LOG_PRINT (ActDashboard): size " + modelDataList.size());
                    }

                    @Override
                    public void onError(VolleyError argError) {
                        //
                    }

                    @Override
                    public void onError(VolleyError argVolleyError, String argStatusCode, String argErrorMessage) {
                        //
                    }
                })
                .onExecute(HTTPVolleyRequest.HTTPMethod.GET);
    }
}
