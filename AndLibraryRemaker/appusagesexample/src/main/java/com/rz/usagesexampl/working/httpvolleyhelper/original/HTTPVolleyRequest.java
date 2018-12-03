package com.rz.usagesexampl.working.httpvolleyhelper.original;

import android.content.Context;

import com.android.volley.VolleyError;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class HTTPVolleyRequest {
    private static HTTPVolleyRequest instance = null;
    private CoreHTTPVolleyRequest coreHTTPVolleyRequest = null;
    private String methodName = "methodName-var";

    public synchronized static HTTPVolleyRequest getInstance(Context argContext) {
        if (instance == null) {
            instance = new HTTPVolleyRequest(argContext);
        }
        return instance;
    }

    public HTTPVolleyRequest(Context argContext) {
        coreHTTPVolleyRequest = new CoreHTTPVolleyRequest(argContext);
    }

    public HTTPVolleyRequest setEventListener(EventListenerHandler argEventListener) {
        coreHTTPVolleyRequest.setEventListener(argEventListener);
        return this;
    }

    public HTTPVolleyRequest setURL(String argHTTPRequestURL) {
        coreHTTPVolleyRequest.setURL(argHTTPRequestURL);
        return this;
    }

    public HTTPVolleyRequest withHeaderParameters(HashMap<String, String> argURLRequestHeaders) {
        coreHTTPVolleyRequest.withHeaderParameters(argURLRequestHeaders);
        //isUseHeaderParameterKeyValue = false;
        return this;
    }

    public HTTPVolleyRequest withURLParameters(HashMap<String, String> argURLRequestParameters) {
        coreHTTPVolleyRequest.withURLParameters(argURLRequestParameters);
        //isUseRequestParameterKeyValue = false;
        return this;
    }

    public HTTPVolleyRequest withHeaderParameters(String argParameterKey, String argParameterValue) {
        coreHTTPVolleyRequest.withHeaderParameters(argParameterKey, argParameterValue);
        //isUseHeaderParameterKeyValue = true;
        return this;
    }

    public HTTPVolleyRequest withURLParameters(String argParameterKey, String argParameterValue) {
        coreHTTPVolleyRequest.withHeaderParameters(argParameterKey, argParameterValue);
        //isUseRequestParameterKeyValue = true;
        return this;
    }

    public HTTPVolleyRequest withModel(Class<?> argResponseModelClass) {
        coreHTTPVolleyRequest.withModel(argResponseModelClass);
        return this;
    }

    public void onStringRequest(HTTPVolleyRequest.HTTPMethod argRequestMethod) {
        coreHTTPVolleyRequest.onStringRequest(argRequestMethod);
    }

    public void onJSONObjectRequest(JSONObject argJSONObject) {
        coreHTTPVolleyRequest.onJSONObjectRequest(argJSONObject);
    }

    public void onJSONArrayRequest(JSONArray argJSONArray) {
        coreHTTPVolleyRequest.onJSONArrayRequest(argJSONArray);
    }

    public void onJSONObjectForceRequest(String argJSONString) {
        coreHTTPVolleyRequest.onJSONObjectForceRequest(argJSONString);
    }

    public interface EventListenerHandler {
        public void onSuccess(String argResponseData);

        public void onSuccess(ArrayList<?> argModelDataList);
        //public void onSuccess(ArrayList<Object> argModelDataList);
        //public void onSuccess(ArrayList<ModelUsual> argModelDataList);

        public void onError(VolleyError argError);

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
