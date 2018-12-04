# And-HTTP-Volley-Helper
And HTTP Volley Helper


### GIT Command
```git_command
git init
git remote add origin https://github.com/rzrasel/And-HTTP-Volley-Helper.git
git remote -v
git fetch && git checkout master
git add .
git commit -m "Add Readme & Git Commit File"
git pull
git push --all
```

Download
--------

Maven Repositories
```maven
allprojects {
    repositories {
        maven { url 'https://dl.bintray.com/rzrasel/android-http-volley-helper/' }
    }
}
```

Download the latest JAR or grab via Maven:
```xml
<dependency>
    <groupId>com.adept.archery</groupId>
    <artifactId>and-http-volley</artifactId>
    <version>100.00.01</version>
    <type>pom</type>
</dependency>
```
or Gradle:
```groovy
implementation 'com.adept.archery:and-http-volley:100.00.01'
```

Usage
-----

In your Activity

Adapter Helper

| Command | Description |
| ------- | ----------- |
| Field Type | Enum - image view, text view |
| Field Data Type | Enum - is string, string url, raw image id, bitmap, drawable |
| Field ID | String - field id of the text view, image view |
| Model Method | Method name - name of the data model like: getName() function is written as getName |
| Have Call Back | - return: view + field value |
| command | description |


https://stackoverflow.com/questions/21674091/how-to-add-stacktrace-or-debug-option-when-building-android-studio-project
Rz Rasel:And-HTTP-Volley-Helper developer$ gradlew install
bash: gradlew: command not found
Rz Rasel:And-HTTP-Volley-Helper developer$
./gradlew assembleDebug --scan

>>How to Add Stacktrace or debug Option when Building Android Studio Project
./gradlew assembleMyBuild --stacktrace

```
HTTPVolleyRequest httpVolleyRequestTemp = HTTPVolleyRequest.getInstance(context);
HTTPVolleyRequest httpVolleyParser = new HTTPVolleyRequest(context);
HashMap<String, String> headerParams = new HashMap<>();
headerParams.put("Authorization", "Token " + "ApiAuthToken");
httpVolleyParser.setURL("url")
        .withModel(ModelHTTPVolley.class)
        .withHeaderParameters(headerParams)
        .withURLParameters(headerParams)
        .withHeaderParameters("test", "tst")
        .withURLParameters("TEST", "EAT")
        .setEventListener(new HTTPVolleyRequest.EventListenerHandler() {
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
        .onStringRequest(HTTPVolleyRequest.HTTPMethod.GET);
httpVolleyParser.setURL("url")
        .onJSONArrayRequest(new JSONArray());
httpVolleyParser.setURL("url")
        .onJSONObjectRequest(new JSONObject());
httpVolleyParser.setURL("url")
        .onJSONObjectForceRequest("");
```