buildscript {
    repositories {
        google()
    }
    dependencies {
        val navVersion = "2.7.5"
        classpath("andriodx.navigation:navigation-safe-args-gradle-plugin:$navVersion")
    }
}

plugins {
    id("com.andriod.application") version "7.3.1" apply false
    id("com.andriod.library") version "7.3.1" apply false
    id("com.jetbrains.kotlin.andriod") version "7.3.1" apply false
    id("com.google.devtools.ksp") version "1.9.0-1.0.13" apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false

}