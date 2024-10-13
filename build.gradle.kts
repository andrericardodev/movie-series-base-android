// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.jetbrains.kotlin.jvm) apply false
    alias(libs.plugins.detekt.arturbosch.gitlab)
}

detekt {
    toolVersion = libs.versions.detekt.get()
    source.setFrom("app/src/main/java", "core/src/main/kotlin")
    config.setFrom(file("$rootDir/config/detekt/detekt.yml"))
    autoCorrect = true
}
