plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

kotlin {
    jvmToolchain(17)
}

tasks.withType<JavaCompile>().configureEach {
    sourceCompatibility = "17"
    targetCompatibility = "17"
}

dependencies {
    // OkHttp
    api(platform(libs.okhttp.bom))
    api(libs.okhttp)
    api(libs.okhttp.logging.interceptor)

    // Retrofit
    api(libs.retrofit)
    api(libs.retrofit.converter.gson)

    api(libs.gson)

    implementation(libs.paging.common)
    implementation(libs.javax.inject)
    api(libs.coroutines.core)
}
