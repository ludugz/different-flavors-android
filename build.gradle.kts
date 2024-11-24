// Project-level build.gradle.kts

buildscript {
    val hiltVersion by extra("2.48") // Ensure the latest version of Hilt is being used

    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(libs.gradle)
        classpath(libs.kotlin.gradle.plugin)
        classpath("com.google.dagger:hilt-android-gradle-plugin:$hiltVersion")
    }
}
