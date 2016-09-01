# android-native-library-integration-demo
Demo project for native integration using android library

## Instruction

1. Include the AAR file to the Application project
  * In project level build.gradle file
  ```gradle
  allprojects {
      repositories {
          ...
          maven {
            url "http://nds-artifactory-oss.ap-northeast-1.elasticbeanstalk.com/artifactory/test-artifactory"
            credentials {
                username = "user"
                password = ""
            }
        }
          ...
      }
  }
  ```
  * In app level build.gradle file
  ```gradle
  dependencies {
      ...
      compile('com.nds:native_library:1.0.0')
      ...
  }
  ```
2. Call the Activity

  ```java
  Intent intent = new Intent(this, com.nds.nativelibrary.MainActivity.class);
  startActivity(intent);
  ```
