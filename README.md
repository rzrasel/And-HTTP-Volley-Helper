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
        maven { url 'https://dl.bintray.com/rzrasel/android-power-pack/' }
    }
}
```

Download the latest JAR or grab via Maven:
```xml
<dependency>
    <groupId>com.adept.archery</groupId>
    <artifactId>and-http-volley-helper</artifactId>
    <version>100.00.01</version>
    <type>pom</type>
</dependency>
```
or Gradle:
```groovy
implementation 'com.adept.archery:and-http-volley-helper:100.00.01'
```

Usage
-----

In your Activity