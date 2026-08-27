buildscript {
    ext.kotlin_version = "2.0.0"
    ext.agp_version = "8.5.0"
    ext.compose_version = "1.6.10"
    ext.activity_version = "1.9.0"
    ext.lifecycle_version = "2.8.0"
    ext.room_version = "2.6.1"
    ext.media3_version = "1.4.1"
    ext.coil_version = "2.6.0"
    ext.hilt_version = "2.48"
    ext.work_version = "2.9.0"
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:$agp_version")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
        classpath("com.google.dagger:hilt-android-gradle-plugin:$hilt_version")
    }
}
allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}