package com.rz.usagesexampl.working.httpvolleyhelper.original;

import android.content.Context;

import com.android.volley.VolleyError;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class HTTPVolleyHelper {
    private static HTTPVolleyHelper instance = null;
    private CoreHTTPVolleyHelper coreHTTPVolleyRequest = null;
    private String methodName = "methodName-var";

    public synchronized static HTTPVolleyHelper getInstance(Context argContext) {
        String staticMethodName = "HTTPVolleyRequest getInstance(Context argContext)";
        if (instance == null) {
            instance = new HTTPVolleyHelper(argContext);
        }
        return instance;
    }

    public HTTPVolleyHelper(Context argContext) {
        methodName = "HTTPVolleyRequest(Context argContext)";
        coreHTTPVolleyRequest = new CoreHTTPVolleyHelper(argContext);
    }

    public HTTPVolleyHelper setEventListener(EventListenerHandler argEventListener) {
        methodName = "HTTPVolleyRequest setEventListener(EventListenerHandler argEventListener)";
        coreHTTPVolleyRequest.setEventListener(argEventListener);
        return this;
    }

    public HTTPVolleyHelper setURL(String argHTTPRequestURL) {
        methodName = "HTTPVolleyRequest setURL(String argHTTPRequestURL)";
        coreHTTPVolleyRequest.setURL(argHTTPRequestURL);
        return this;
    }

    public HTTPVolleyHelper withHeaderParameters(HashMap<String, String> argURLRequestHeaders) {
        methodName = "HTTPVolleyRequest withHeaderParameters(HashMap<String, String> argURLRequestHeaders)";
        coreHTTPVolleyRequest.withHeaderParameters(argURLRequestHeaders);
        //isUseHeaderParameterKeyValue = false;
        return this;
    }

    public HTTPVolleyHelper withURLParameters(HashMap<String, String> argURLRequestParameters) {
        methodName = "HTTPVolleyRequest withURLParameters(HashMap<String, String> argURLRequestParameters)";
        coreHTTPVolleyRequest.withURLParameters(argURLRequestParameters);
        //isUseRequestParameterKeyValue = false;
        return this;
    }

    public HTTPVolleyHelper withHeaderParameters(String argParameterKey, String argParameterValue) {
        methodName = "HTTPVolleyRequest withHeaderParameters(String argParameterKey, String argParameterValue)";
        coreHTTPVolleyRequest.withHeaderParameters(argParameterKey, argParameterValue);
        //isUseHeaderParameterKeyValue = true;
        return this;
    }

    public HTTPVolleyHelper withURLParameters(String argParameterKey, String argParameterValue) {
        methodName = "HTTPVolleyRequest withURLParameters(String argParameterKey, String argParameterValue)";
        coreHTTPVolleyRequest.withHeaderParameters(argParameterKey, argParameterValue);
        //isUseRequestParameterKeyValue = true;
        return this;
    }

    public HTTPVolleyHelper withModel(Class<?> argResponseModelClass) {
        methodName = "HTTPVolleyRequest withModel(Class<?> argResponseModelClass)";
        coreHTTPVolleyRequest.withModel(argResponseModelClass);
        return this;
    }

    public void onStringRequest(HTTPMethod argRequestMethod) {
        methodName = "void onStringRequest(HTTPVolleyRequest.HTTPMethod argRequestMethod)";
        coreHTTPVolleyRequest.onStringRequest(argRequestMethod);
    }

    public void onJSONObjectRequest(JSONObject argJSONObject) {
        methodName = "void onJSONObjectRequest(JSONObject argJSONObject)";
        coreHTTPVolleyRequest.onJSONObjectRequest(argJSONObject);
    }

    public void onJSONArrayRequest(JSONArray argJSONArray) {
        methodName = "void onJSONArrayRequest(JSONArray argJSONArray)";
        coreHTTPVolleyRequest.onJSONArrayRequest(argJSONArray);
    }

    public void onJSONObjectForceRequest(String argJSONString) {
        methodName = "void onJSONObjectForceRequest(String argJSONString)";
        coreHTTPVolleyRequest.onJSONObjectForceRequest(argJSONString);
    }

    public interface EventListenerHandler {
        String interfaceMethodName = "interface EventListenerHandler";

        public void onSuccess(String argResponseData);

        public void onSuccess(ArrayList<?> argModelDataList);
        //public void onSuccess(ArrayList<Object> argModelDataList);
        //public void onSuccess(ArrayList<ModelUsual> argModelDataList);

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
