plugins {
  id("com.android.application")
  kotlin("android")
  kotlin("android.extensions")
  //id("digital.wup.android-maven-publish") version "3.6.3"
}


android {
  compileSdkVersion(29)
  buildToolsVersion("29.0.2")

  defaultConfig {
    minSdkVersion(16)
    targetSdkVersion(29)
    versionCode = 1
    versionName = "1.0"
    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }

  buildTypes {
    getByName("release") {
      isMinifyEnabled = false
      proguardFiles(
          getDefaultProguardFile("proguard-android-optimize.txt"),
          "proguard-rules.pro"
      )
    }

  }

}

dependencies {

  implementation("com.github.danbrough.androidutils:slf4j:1.0.13")
  //implementation(project(":vtm-android"))
  implementation("com.github.danbrough.vtm:vtm-android:0.12.0-dan01")
  implementation("com.github.danbrough.vtm:vtm-http:0.12.0-dan01")
  implementation("com.github.danbrough.vtm:vtm-themes:0.12.0-dan01")

  //implementation(project(":vtm-http"))
  //implementation(project(":vtm-themes"))

  implementation("androidx.appcompat:appcompat:1.1.0")
  implementation("com.google.android.material:material:1.0.0")
  implementation("androidx.constraintlayout:constraintlayout:1.1.3")
  implementation("androidx.navigation:navigation-fragment:2.1.0")
  implementation("androidx.navigation:navigation-ui:2.1.0")
  testImplementation("junit:junit:4.12")
  androidTestImplementation("androidx.test.ext:junit:1.1.1")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.2.0")
}
