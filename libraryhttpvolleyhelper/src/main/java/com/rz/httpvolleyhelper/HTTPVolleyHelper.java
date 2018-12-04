package com.rz.httpvolleyhelper;

import android.content.Context;

import com.android.volley.VolleyError;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class HTTPVolleyHelper {
    private static HTTPVolleyHelper instance;
    private C0497a f1755b;

    public synchronized static HTTPVolleyHelper getInstance(Context argContext) {
        if (instance == null) {
            instance = new HTTPVolleyHelper(argContext);
        }
        return instance;
    }

    public HTTPVolleyHelper(Context context) {
        this.f1755b = null;
        this.f1755b = new C0497a(context);
    }

    public HTTPVolleyHelper setEventListener(EventListenerHandler argEventListener) {
        this.f1755b.m1937a(argEventListener);
        return this;
    }

    public HTTPVolleyHelper setURL(String argHTTPRequestURL) {
        this.f1755b.m1939a(argHTTPRequestURL);
        return this;
    }

    public HTTPVolleyHelper withHeaderParameters(String argParameterKey, String argParameterValue) {
        this.f1755b.m1940a(argParameterKey, argParameterValue);
        return this;
    }

    public HTTPVolleyHelper withHeaderParameters(HashMap<String, String> argURLRequestHeaders) {
        this.f1755b.m1941a((HashMap) argURLRequestHeaders);
        return this;
    }

    public HTTPVolleyHelper withURLParameters(String argParameterKey, String argParameterValue) {
        this.f1755b.m1944a(argParameterKey, argParameterValue);
        return this;
    }

    public HTTPVolleyHelper withURLParameters(HashMap<String, String> argURLRequestParameters) {
        this.f1755b.m1945b((HashMap) argURLRequestParameters);
        return this;
    }

    public HTTPVolleyHelper withModel(Class<?> argResponseModelClass) {
        this.f1755b.m1938a((Class) argResponseModelClass);
        return this;
    }

    public void onStringRequest(HTTPMethod argRequestMethod) {
        this.f1755b.m1942a(argRequestMethod);
    }

    public void onJSONObjectRequest(JSONObject argJSONObject) {
        this.f1755b.m1944a(argJSONObject);
    }

    public void onJSONArrayRequest(JSONArray argJSONArray) {
        this.f1755b.m1943a(argJSONArray);
    }

    public void onJSONObjectForceRequest(String argJSONString) {
        this.f1755b.m1946b(argJSONString);
    }

    public interface EventListenerHandler {
        public void onSuccess(String argResponseData);

        public void onSuccess(ArrayList<?> argModelDataList);

        public void onError(VolleyError argVolleyError);

        public void onError(VolleyError argVolleyError, String argStatusCode, String argErrorMessage);
    }

    public enum HTTPMethod {
        GET(0),
        POST(1);
        private final int value;

        HTTPMethod(int argValue) {
            this.value = argValue;
        }

        public int getValue() {
            return this.value;
        }
    }
}
