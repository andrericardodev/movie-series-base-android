plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

dependencies {
    // OkHttp
    api(platform(libs.okhttp.bom))
    api(libs.okhttp)
    api(libs.okhttp.logging.interceptor)

    // Retrofit
    api(libs.retrofit)
    api(libs.retrofit.converter.gson)

    // Gson
    api(libs.gson)
}
