import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val kotlinDlVersion: String by project

plugins {
    application
    kotlin("jvm") version "1.7.10"
}

group = "com.rescribet"
version = "1.0-SNAPSHOT"

application {
    mainClass.set("fashion.MainKt")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlin-deeplearning-api:$kotlinDlVersion")
    implementation("org.slf4j:slf4j-log4j12:1.7.36")
    implementation("org.tensorflow:tensorflow-core-platform:0.4.1")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
