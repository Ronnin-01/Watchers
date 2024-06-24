plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.google.gms.google.services) apply false
}


buildscript {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
    dependencies {
        classpath ("com.google.gms:google-services:4.4.2")
    }
}


//allprojects {
//    repositories {
//        google()
//        mavenCentral()
//        maven { url = uri("https://jitpack.io") }
//    }
//}
