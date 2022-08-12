plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")

    // https://mvnrepository.com/artifact/org.processing/core
    implementation("org.processing:core:3.3.7")

//    implementation("com.illposed.osc:javaosc-core:0.8")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}