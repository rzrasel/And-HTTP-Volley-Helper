package com.rz.usagesexampl.working.httpvolleyhelper.original;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

import com.android.volley.Cache;
import com.android.volley.Network;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class CoreHTTPVolleyHelper {
    private Context context;
    private static CoreHTTPVolleyHelper instance = null;
    private RequestQueue volleyRequest;
    private HTTPVolleyHelper.EventListenerHandler eventListener;
    private HashMap<String, String> urlRequestHeaders = null;
    private HashMap<String, String> urlRequestParameters = null;
    /*private TreeMap<String, String> urlRequestHeadersTree = null;
    private TreeMap<String, String> urlRequestParametersTree = null;*/
    private String httpRequestURL = null;
    private Class responseModelClass;
    /*private boolean isUseHeaderParameterKeyValue = false;
    private boolean isUseRequestParameterKeyValue = false;*/
    private String methodName = "methodName-var";

    protected synchronized static CoreHTTPVolleyHelper getInstance(Context argContext) {
        String staticMethodName = "CoreHTTPVolleyRequest getInstance(Context argContext)";
        if (instance == null) {
            instance = new CoreHTTPVolleyHelper(argContext);
        }
        return instance;
    }

    protected CoreHTTPVolleyHelper(Context argContext) {
        methodName = "CoreHTTPVolleyRequest(Context argContext)";
        context = argContext;
        urlRequestHeaders = new HashMap<>();
        urlRequestParameters = new HashMap<>();
        /*urlRequestHeadersTree = new TreeMap<>();
        urlRequestParametersTree = new TreeMap<>();*/
        urlRequestHeaders.clear();
        urlRequestParameters.clear();
        /*urlRequestHeadersTree.clear();
        urlRequestParametersTree.clear();*/
        httpRequestURL = null;
        //volleyRequest = Volley.newRequestQueue(context);
        volleyRequest = getRequestQueue();
    }

    private RequestQueue getRequestQueue() {
        methodName = "RequestQueue getRequestQueue()";
        if (volleyRequest == null) {
            Cache cache = new DiskBasedCache(context.getCacheDir(), 10 * 1024 * 1024);
            Network network = new BasicNetwork(new HurlStack());
            volleyRequest = new RequestQueue(cache, network);
            // Don't forget to start the volley request queue
            //volleyRequest.start();
        }
        return volleyRequest;
    }

    protected CoreHTTPVolleyHelper setEventListener(HTTPVolleyHelper.EventListenerHandler argEventListener) {
        methodName = "CoreHTTPVolleyRequest setEventListener(HTTPVolleyRequest.EventListenerHandler argEventListener)";
        eventListener = argEventListener;
        return this;
    }

    protected CoreHTTPVolleyHelper setURL(String argHTTPRequestURL) {
        methodName = "CoreHTTPVolleyRequest setURL(String argHTTPRequestURL)";
        httpRequestURL = argHTTPRequestURL;
        return this;
    }

    protected CoreHTTPVolleyHelper withHeaderParameters(HashMap<String, String> argURLRequestHeaders) {
        methodName = "CoreHTTPVolleyRequest withHeaderParameters(HashMap<String, String> argURLRequestHeaders)";
        urlRequestHeaders = argURLRequestHeaders;
        //isUseHeaderParameterKeyValue = false;
        return this;
    }

    protected CoreHTTPVolleyHelper withHeaderParameters(String argParameterKey, String argParameterValue) {
        methodName = "CoreHTTPVolleyRequest withHeaderParameters(String argParameterKey, String argParameterValue)";
        urlRequestHeaders.put(argParameterKey, argParameterValue);
        //isUseHeaderParameterKeyValue = true;
        return this;
    }

    protected CoreHTTPVolleyHelper withPostParameters(HashMap<String, String> argURLRequestParameters) {
        methodName = "CoreHTTPVolleyRequest withPostParameters(HashMap<String, String> argURLRequestParameters)";
        urlRequestParameters = argURLRequestParameters;
        //isUseRequestParameterKeyValue = false;
        return this;
    }

    protected CoreHTTPVolleyHelper withPostParameters(String argParameterKey, String argParameterValue) {
        methodName = "CoreHTTPVolleyRequest withPostParameters(String argParameterKey, String argParameterValue)";
        urlRequestParameters.put(argParameterKey, argParameterValue);
        //isUseRequestParameterKeyValue = true;
        return this;
    }

    protected CoreHTTPVolleyHelper withModel(Class<?> argResponseModelClass) {
        methodName = "CoreHTTPVolleyRequest withModel(Class<?> argResponseModelClass)";
        responseModelClass = argResponseModelClass;
        return this;
    }

    /**
     * Does some thing in old style.
     *
     * @-deprecated use { @link #new()} instead.
     */
    /*@-Deprecated
    public void onExecute(HTTPMethod argRequestMethod) {
        //Request.Method.POST
        if (urlParameters != null) {
            //LogWriter.Log("(HTTPVolleyRequest) - onExecute param size " + urlParameters.size());
        } else {
            //LogWriter.Log("(HTTPVolleyRequest) - onExecute param size null");
        }
        StringRequest stringPostRequest = new StringRequest(argRequestMethod.getValue(), requestURL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String argResponse) {
                        VolleyLog.wtf(argResponse, "utf-8");
                        try {
                            byte[] byteArray = argResponse.toString().getBytes("ISO-8859-1");
                            argResponse = new String(byteArray, "UTF-8");
                        } catch (UnsupportedEncodingException e) {
                        }
                        //LogWriter.Log("(HTTPVolleyRequest) - onExecute Response " + argResponse);
                        if (eventListener != null) {
                            eventListener.onResponse(argResponse);
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError argVolleyError) {
                        onVolleyErrorHandler(argVolleyError);
                    }
                }
        ) {
            /--*@Override
            protected Response parseNetworkResponse(NetworkResponse argNetworkResponse) {
                return Response.success(argNetworkResponse.statusCode, HttpHeaderParser.parseCacheHeaders(argNetworkResponse));
            }*--/
            @Override
            protected Response<String> parseNetworkResponse(NetworkResponse argNetworkResponse) {
                /--*int statusCode = argNetworkResponse.statusCode;
                System.out.println("DEBUG_LOG_PRINT (HTTPVolleyRequest): NetworkResponseCode " + statusCode);
                return super.parseNetworkResponse(argNetworkResponse);*--/
                try {
                    String responseData = new String(argNetworkResponse.data, HttpHeaderParser.parseCharset(argNetworkResponse.headers));
                    //LogWriter.Log("(HTTPVolleyRequest) - parseNetworkResponse responseData " + responseData);
                    return Response.success(responseData, HttpHeaderParser.parseCacheHeaders(argNetworkResponse));
                } catch (UnsupportedEncodingException e) {
                    //LogWriter.Log("(HTTPVolleyRequest) - parseNetworkResponse UnsupportedEncodingException " + e);
                    return Response.error(new ParseError(e));
                } catch (JsonSyntaxException e) {
                    //LogWriter.Log("(HTTPVolleyRequest) - parseNetworkResponse JsonSyntaxException " + e);
                    return Response.error(new ParseError(e));
                }

            }

            @Override
            public Map<String, String> getHeaders() {
                if (headerParams == null) {
                    headerParams = new HashMap<String, String>();
                    return headerParams;
                }
                //headerParams.put("Content-Type", "application/json; indent=4");
                //headers.put("Content-Type", "application/json; charset=utf-8");
                headerParams.put("Content-Type", "application/x-www-form-urlencoded");
                //headerParams.put("Content-Type", "application/json");
                Map<String, String> treeURLParameters = new TreeMap<String, String>(headerParams);
                return treeURLParameters;
            }

            @Override
            protected Map<String, String> getParams() {
                if (urlParameters == null) {
                    urlParameters = new HashMap<>();
                }
                /--*urlParameters.put(AppConstant.Server.FIELD_PARAMS.AUTH_KEY, "");
                urlParameters.put(AppConstant.Server.FIELD_PARAMS.PACKAGE_NAME, context.getPackageName());
                urlParameters.put(AppConstant.Server.FIELD_PARAMS.APP_VERSION, getAppVersion(context));*--/
                Map<String, String> treeURLParameters = new TreeMap<String, String>(urlParameters);
                return treeURLParameters;
            }
        };
        volleyRequest.add(stringPostRequest);
        volleyRequest.start();
    }*/
    protected void onStringRequest(HTTPVolleyHelper.HTTPMethod argRequestMethod) {
        methodName = "void onStringRequest(HTTPVolleyRequest.HTTPMethod argRequestMethod)";
        //Request.Method.POST
        if (httpRequestURL == null) {
            onLogWrite("REQUEST_URL: NULL");
            return;
        }
        onLogWrite("REQUEST_URL: " + httpRequestURL);
        StringRequest stringPostRequest = new StringRequest(argRequestMethod.getValue(), httpRequestURL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String argResponse) {
                        //VolleyLog.wtf(argResponse, "utf-8");
                        /*try {
                            byte[] byteArray = argResponse.toString().getBytes("ISO-8859-1");
                            argResponse = new String(byteArray, "UTF-8");
                            onLogWrite("RESPONSE_DATA: " + argResponse);
                            if (responseModelClass != null) {
                                Type typeToken = HTTPVolleyParserHelper.getTypeToken(responseModelClass);
                                ArrayList<?> modelDataArrayList = HTTPVolleyParserHelper.getModel(responseModelClass);
                                modelDataArrayList = new GsonBuilder().create().fromJson(argResponse.toString(), typeToken);
                                if (eventListener != null) {
                                    eventListener.onSuccess(modelDataArrayList);
                                }
                            } else if (eventListener != null) {
                                eventListener.onSuccess(argResponse);
                            }
                        } catch (UnsupportedEncodingException ex) {
                            //throw ex;
                            onLogWrite("ERROR: " + ex.getMessage());
                        }*/
                        onVolleyResponseHandler(argResponse);
                        //LogWriter.Log("(HTTPVolleyRequest) - onExecute Response " + argResponse);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError argVolleyError) {
                        onVolleyErrorHandler(argVolleyError);
                    }
                }
        ) {
            /*@Override
            protected Response parseNetworkResponse(NetworkResponse argNetworkResponse) {
                return Response.success(argNetworkResponse.statusCode, HttpHeaderParser.parseCacheHeaders(argNetworkResponse));
            }*/
            @Override
            protected Response<String> parseNetworkResponse(NetworkResponse argNetworkResponse) {
                /*int statusCode = argNetworkResponse.statusCode;
                System.out.println("DEBUG_LOG_PRINT (HTTPVolleyRequest): NetworkResponseCode " + statusCode);
                return super.parseNetworkResponse(argNetworkResponse);*/
                try {
                    String responseData = new String(argNetworkResponse.data, HttpHeaderParser.parseCharset(argNetworkResponse.headers));
                    //LogWriter.Log("(HTTPVolleyRequest) - parseNetworkResponse responseData " + responseData);
                    return Response.success(responseData, HttpHeaderParser.parseCacheHeaders(argNetworkResponse));
                } catch (UnsupportedEncodingException ex) {
                    //LogWriter.Log("(HTTPVolleyRequest) - parseNetworkResponse UnsupportedEncodingException " + e);
                    return Response.error(new ParseError(ex));
                } catch (JsonSyntaxException ex) {
                    //LogWriter.Log("(HTTPVolleyRequest) - parseNetworkResponse JsonSyntaxException " + e);
                    return Response.error(new ParseError(ex));
                }

            }

            @Override
            public Map<String, String> getHeaders() {
                if (urlRequestHeaders == null) {
                    urlRequestHeaders = new HashMap<String, String>();
                    return urlRequestHeaders;
                }
                //headerParams.put("Content-Type", "application/json; indent=4");
                //headers.put("Content-Type", "application/json; charset=utf-8");
                urlRequestHeaders.put("Content-Type", "application/x-www-form-urlencoded");
                //headerParams.put("Content-Type", "application/json");
                Map<String, String> treeURLParameters = new TreeMap<String, String>(urlRequestHeaders);
                onLogWrite("REQUEST_HEADERS: " + treeURLParameters.toString());
                return treeURLParameters;
            }

            @Override
            protected Map<String, String> getParams() {
                if (urlRequestParameters == null) {
                    urlRequestParameters = new HashMap<>();
                    return urlRequestParameters;
                }
                /*urlParameters.put(AppConstant.Server.FIELD_PARAMS.AUTH_KEY, "");
                urlParameters.put(AppConstant.Server.FIELD_PARAMS.PACKAGE_NAME, context.getPackageName());
                urlParameters.put(AppConstant.Server.FIELD_PARAMS.APP_VERSION, getAppVersion(context));*/
                Map<String, String> treeURLParameters = new TreeMap<String, String>(urlRequestParameters);
                onLogWrite("REQUEST_PARAMETERS: " + treeURLParameters.toString());
                return treeURLParameters;
            }
        };
        //RequestQueue
        volleyRequest.add(stringPostRequest);
        volleyRequest.start();
    }

    protected void onJSONObjectRequest(JSONObject argJSONObject) {
        methodName = "void onJSONObjectRequest(JSONObject argJSONObject)";
        /*Map<String, String> map = new HashMap<String, String>();
        map.put("param1", "example");
        JSONObject jsonObject = new JSONObject(map);
        System.out.println("DEBUG_LOG_PRINT (HTTPVolleyRequest): Response " + jsonObject.toString());*/
        if (httpRequestURL == null) {
            onLogWrite("REQUEST_URL: NULL");
            return;
        }
        onLogWrite("REQUEST_URL: " + httpRequestURL);
        onLogWrite("DEBUG_LOG_PRINT (HTTPVolleyRequest): " + argJSONObject.toString());
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, httpRequestURL, argJSONObject,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject jsonObject) {
                        //System.out.println("DEBUG_LOG_PRINT (HTTPVolleyRequest): Response " + jsonObject.toString());
                        /*onLogWrite("RESPONSE_DATA: " + jsonObject.toString());
                        if (eventListener != null) {
                            eventListener.onSuccess(jsonObject.toString());
                        }*/
                        onVolleyResponseHandler(jsonObject.toString());
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError argVolleyError) {
                        onVolleyErrorHandler(argVolleyError);
                    }
                }) {
            @Override
            public Map<String, String> getHeaders() {
                if (urlRequestHeaders == null) {
                    urlRequestHeaders = new HashMap<String, String>();
                    return urlRequestHeaders;
                }
                urlRequestHeaders.put("Content-Type", "application/json");
                //headerParams.put("Content-Type", "application/x-www-form-urlencoded");
                Map<String, String> treeURLParameters = new TreeMap<String, String>(urlRequestHeaders);
                onLogWrite("REQUEST_HEADERS: " + treeURLParameters.toString());
                return treeURLParameters;
            }

            @Override
            protected Map<String, String> getParams() {
                if (urlRequestParameters == null) {
                    urlRequestParameters = new HashMap<>();
                    return urlRequestParameters;
                }
                Map<String, String> treeURLParameters = new TreeMap<String, String>(urlRequestParameters);
                onLogWrite("REQUEST_PARAMETERS: " + treeURLParameters.toString());
                return treeURLParameters;
            }
        };
        volleyRequest.add(jsonObjectRequest);
        volleyRequest.start();
    }

    protected void onJSONArrayRequest(JSONArray argJSONArray) {
        methodName = "void onJSONArrayRequest(JSONArray argJSONArray)";
        if (httpRequestURL == null) {
            onLogWrite("REQUEST_URL: NULL");
            return;
        }
        onLogWrite("REQUEST_URL: " + httpRequestURL);
        onLogWrite("DEBUG_LOG_PRINT (HTTPVolleyRequest): " + argJSONArray.toString());
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.POST, httpRequestURL, argJSONArray,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray jsonArray) {
                        //System.out.println("DEBUG_LOG_PRINT (HTTPVolleyRequest): onResponse " + jsonArray.toString());
                        /*onLogWrite("RESPONSE_DATA: " + jsonArray.toString());
                        if (eventListener != null) {
                            eventListener.onSuccess(jsonArray.toString());
                        }*/
                        onVolleyResponseHandler(jsonArray.toString());
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError argVolleyError) {
                        onVolleyErrorHandler(argVolleyError);
                    }
                }
        ) {
            @Override
            public Map<String, String> getHeaders() {
                if (urlRequestHeaders == null) {
                    urlRequestHeaders = new HashMap<String, String>();
                    return urlRequestHeaders;
                }
                urlRequestHeaders.put("Content-Type", "application/json");
                //headerParams.put("Content-Type", "application/x-www-form-urlencoded");
                Map<String, String> treeURLParameters = new TreeMap<String, String>(urlRequestHeaders);
                onLogWrite("REQUEST_HEADERS: " + treeURLParameters.toString());
                return treeURLParameters;
            }

            @Override
            protected Map<String, String> getParams() {
                if (urlRequestParameters == null) {
                    urlRequestParameters = new HashMap<>();
                    return urlRequestParameters;
                }
                Map<String, String> treeURLParameters = new TreeMap<String, String>(urlRequestParameters);
                onLogWrite("REQUEST_PARAMETERS: " + treeURLParameters.toString());
                return treeURLParameters;
            }
        };
        volleyRequest.add(jsonArrayRequest);
        volleyRequest.start();
    }

    protected void onJSONObjectFormedRequest(String argJSONString) {
        methodName = "void onJSONObjectFormedRequest(String argJSONString)";
        /*Map<String, String> map = new HashMap<String, String>();
        map.put("param1", "example");
        JSONObject jsonObject = new JSONObject(map);
        System.out.println("DEBUG_LOG_PRINT (HTTPVolleyRequest): Response " + jsonObject.toString());*/
        if (httpRequestURL == null) {
            onLogWrite("REQUEST_URL: NULL");
            return;
        }
        onLogWrite("REQUEST_URL: " + httpRequestURL);
        onLogWrite("DEBUG_LOG_PRINT (HTTPVolleyRequest): " + argJSONString);
        String jsonString = argJSONString;
        String regex = "\"\\[";
        jsonString = jsonString.replaceAll(regex, "[");
        regex = "\\]\"";
        jsonString = jsonString.replaceAll(regex, "]");
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(jsonString);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (jsonObject == null) {
            System.out.println("JSON is null from onJSONObjectForceRequest");
        }
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, httpRequestURL, jsonObject,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject jsonObject) {
                        /*System.out.println("DEBUG_LOG_PRINT (HTTPVolleyRequest): Response " + jsonObject.toString());
                        if (eventListener != null) {
                            eventListener.onResponse(jsonObject.toString());
                        }*/
                        onVolleyResponseHandler(jsonObject.toString());
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError argVolleyError) {
                        onVolleyErrorHandler(argVolleyError);
                    }
                }) {
            @Override
            public Map<String, String> getHeaders() {
                if (urlRequestHeaders == null) {
                    urlRequestHeaders = new HashMap<String, String>();
                    return urlRequestHeaders;
                }
                urlRequestHeaders.put("Content-Type", "application/json");
                //headerParams.put("Content-Type", "application/x-www-form-urlencoded");
                Map<String, String> treeURLParameters = new TreeMap<String, String>(urlRequestHeaders);
                onLogWrite("REQUEST_HEADERS: " + treeURLParameters.toString());
                return treeURLParameters;
            }

            @Override
            protected Map<String, String> getParams() {
                if (urlRequestParameters == null) {
                    urlRequestParameters = new HashMap<>();
                    return urlRequestParameters;
                }
                Map<String, String> treeURLParameters = new TreeMap<String, String>(urlRequestParameters);
                onLogWrite("REQUEST_PARAMETERS: " + treeURLParameters.toString());
                return treeURLParameters;
            }
        };
        volleyRequest.add(jsonObjectRequest);
        volleyRequest.start();
    }

    private void onVolleyResponseHandler(String argResponse) {
        methodName = "void onVolleyResponseHandler(String argResponse)";
        try {
            byte[] byteArray = argResponse.toString().getBytes("ISO-8859-1");
            argResponse = new String(byteArray, "UTF-8");
            onLogWrite("RESPONSE_DATA: " + argResponse);
            if (responseModelClass != null) {
                Type typeToken = HTTPVolleyParserHelper.getTypeToken(responseModelClass);
                ArrayList<?> modelDataArrayList = HTTPVolleyParserHelper.getModel(responseModelClass);
                modelDataArrayList = new GsonBuilder().create().fromJson(argResponse.toString(), typeToken);
                if (eventListener != null) {
                    eventListener.onSuccess(modelDataArrayList);
                }
            } else if (eventListener != null) {
                eventListener.onSuccess(argResponse);
            }
        } catch (UnsupportedEncodingException ex) {
            //throw ex;
            onLogWrite("ERROR: " + ex.getMessage());
            if (eventListener != null) {
                eventListener.onError(new VolleyError(ex.getMessage()));
            }
        }
    }

    private void onVolleyErrorHandler(VolleyError argVolleyError) {
        methodName = "void onVolleyErrorHandler(VolleyError argVolleyError)";
        //LogWriter.Log("(HTTPVolleyRequest) - onErrorResponse VolleyError " + argVolleyError.toString());
        //System.out.println("DEBUG_LOG_PRINT Error Response code: " + argVolleyError.networkResponse.statusCode);
        String errorMessage = "";
        String responseCode = "";
        if (argVolleyError.networkResponse != null) {
            responseCode = argVolleyError.networkResponse.statusCode + "";
            //LogWriter.Log("(HTTPVolleyRequest) - onErrorResponse Error responseCode " + responseCode);
            try {
                errorMessage = new String(argVolleyError.networkResponse.data, "UTF-8");
                //LogWriter.Log("(HTTPVolleyRequest) - onErrorResponse Error errorMessage " + errorMessage);
                onLogWrite("ERROR: STATUS_CODE: " + responseCode + " MESSAGE: " + errorMessage);
            } catch (UnsupportedEncodingException ex) {
                //LogWriter.Log("(HTTPVolleyRequest) - error UnsupportedEncodingException " + e.toString());
                onLogWrite("ERROR: " + ex.getMessage());
                if (eventListener != null) {
                    eventListener.onError(new VolleyError(ex.getMessage()));
                }
            }
        }
        if (eventListener != null) {
            eventListener.onError(argVolleyError);
            eventListener.onError(argVolleyError, responseCode, errorMessage);
        }
    }

    protected void cancelAllRequests(String argTag) {
        methodName = "void cancelAllRequests(String tag)";
        getRequestQueue().cancelAll(argTag);
    }

    /*public interface EventListenerHandler {
        public void onResponse(String argResponse);

        public void onError(VolleyError argVolleyError);

        public void onError(VolleyError argVolleyError, String argStatusCode, String argErrorMessage);
    }*/
    protected interface EventListenerHandler_NotUse {
        String methodName = "interface EventListenerHandler_NotUse";

        public void onSuccess(String argResponseData);

        public void onSuccess(ArrayList<?> argModelDataList);
        //public void onSuccess(ArrayList<Object> argModelDataList);
        //public void onSuccess(ArrayList<ModelUsual> argModelDataList);

        public void onError(VolleyError argError);

        public void onError(VolleyError argVolleyError, String argStatusCode, String argErrorMessage);
    }

    private String getAppVersion(Context context) {
        methodName = "String getAppVersion(Context context)";
        PackageManager manager = context.getPackageManager();
        try {
            //PackageInfo pInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.GET_META_DATA);
            PackageInfo packageInfo = manager.getPackageInfo(context.getPackageName(), PackageManager.GET_META_DATA);
            //return packageInfo.versionCode;
            //packageInfo.packageName;
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            return "";
        }
    }

    private void onLogWrite(String argMessage) {
        methodName = "void onLogWrite(String argMessage)";
        System.out.println("LOG_WRITER_CORE_HTTPVolleyRequest: " + argMessage);
    }

    private enum HTTPMethod_NotUse {
        GET(0),
        POST(1);
        private final int value;

        HTTPMethod_NotUse(int argValue) {
            this.value = argValue;
        }

        public int getValue() {
            return this.value;
        }
    }
}
//https://www.itsalif.info/content/android-volley-tutorial-http-get-post-put
//https://arnab.ch/blog/2013/08/asynchronous-http-requests-in-android-using-volley/