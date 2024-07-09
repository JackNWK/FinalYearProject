plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.finalyearproject"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.finalyearproject"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation("androidx.camera:camera-core:1.3.3")
    implementation("androidx.camera:camera-camera2:1.3.3")
    implementation("androidx.camera:camera-lifecycle:1.3.3")
    implementation("androidx.camera:camera-video:1.3.3")
    implementation("androidx.camera:camera-view:1.3.3")
    implementation("androidx.camera:camera-extensions:1.3.3")

    //implementation("com.google.ar.sceneform.ux:sceneform-ux:1.16.0")

    // If you want to use the base sdk
    implementation ("com.google.mlkit:pose-detection:18.0.0-beta4")
    // If you want to use the accurate sdk
    implementation ("com.google.mlkit:pose-detection-accurate:18.0.0-beta4")
    // If you want to use the base sdk
    //implementation 'com.google.mlkit:pose-detection:18.0.0-beta4'
    // If you want to use the accurate sdk
    //implementation 'com.google.mlkit:pose-detection-accurate:18.0.0-beta4'

    // Filament dependencies
    //implementation("com.google.android.filament:filament-android:1.9.9")
    //implementation("com.google.android.filament:gltfio-android:1.9.9")
    //implementation("com.google.android.filament:filament-utils-android:1.9.9")

}