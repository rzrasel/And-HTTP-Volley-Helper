package com.rz.usagesexampl;

import com.google.gson.annotations.SerializedName;
import com.rz.httpvolleyhelper.FieldName;

public class ModelHTTPVolley {
    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    @SerializedName("bn_name")
    private String bnName;
    @FieldName("my_name")
    private String myName;
    public String testVar = "Hi I am test var";

    public int getId() {
        return id;
    }

    public void sayHi() {
        System.out.println("Hi I want to say hello");
    }
}
