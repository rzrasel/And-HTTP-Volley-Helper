package com.rz.usagesexampl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.android.volley.VolleyError;
import com.rz.usagesexampl.working.httpvolleyhelper.HTTPVolleyParser;
import com.rz.usagesexampl.working.httpvolleyhelper.original.HTTPVolleyRequest;

import java.util.ArrayList;
import java.util.HashMap;

public class ActHTTPVolleyHelper extends AppCompatActivity {
    private Activity activity;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_httpvolley_helper);
        activity = this;
        context = this;
        HTTPVolleyParser httpVolleyParser = new HTTPVolleyParser(context);
        HashMap<String, String> headerParams = new HashMap<>();
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