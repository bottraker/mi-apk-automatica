// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.2" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
}

// ¡ESTO ES LO QUE FALTABA!
allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
