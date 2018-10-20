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